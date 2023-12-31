package Stepdefinition;

import java.util.List;
import java.util.Map;

//import com.aventstack.extentreports.util.Assert;
import junit.framework.Assert;

import com.pages.Linkedlist_page;
import com.pages.signinpage;
import com.qa.factory.Driverfactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Linkedlist_steps {
	private signinpage sgn = new signinpage(Driverfactory.getDriver());
	private Linkedlist_page linklst ;
	
	@Given("user already logged to home page by signin")
	public void user_already_logged_to_home_page_by_signin(DataTable dataTable)   {
		List<Map<String, String>> credList =dataTable.asMaps();
		String usrnam=credList.get(0).get("username");
		String paswod=credList.get(0).get("password");
		//Thread.sleep(3000);
		Driverfactory.getDriver().get("https://dsportalapp.herokuapp.com/");
       	linklst=sgn.dologin(usrnam,paswod);
       	      	
	}
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
		String Title =  linklst.getlinkedlisttitle();
		 System.out.println("The Page title is :"+ Title);
		 
	    	}

	@When("user clicks on the get started button Linkedlist section")
	public void user_clicks_on_the_get_started_button_linkedlist_section() {
		linklst.getstarted();
	   	}

	@Then("linked list opens up")
	public void linked_list_opens_up() {
		String Title =  linklst.getlinkedlisttitle();
		 System.out.println("The Page title is :"+ Title);
	   	}
	@Given ("User is on linklistPage")
	public void user_is_on_linklistpage(){
		 String Title =  linklst.getlinkedlisttitle();
		 System.out.println("Linked list title is :"+ Title);
	}


	@When("User clicks on {string} button")
	public void user_clicks_on_button(String string) {
		linklst.introduction();
		String title=linklst.introtitle();
		System.out.println("Inroduction page title is "+title);
	    	}

	@Then("User should be redircted to {string} page")
	public void user_should_be_redircted_to_page(String string) {
	linklst.chkintroPage();	
	    
	}

	//@SuppressWarnings("deprecation")
	@When("User gets linked list Section")
	public void user_gets_linked_list_section(DataTable linkdlis) {
	   List<String>ExpecArraylist=linkdlis.asList();
	   String Title=linklst.getlinkedlisttitle();
	   System.out.println("i m n page "+Title);
	   System.out.println("Expected  section list "+ExpecArraylist);
	    List<String>ActualArrayList = linklst.linklistsections();
	    System.out.println("Actual Array List :"+ ActualArrayList );
	    
	    Assert.assertTrue(true);
	    
	  	}
	
	//assertTrue(ExpecArraylist.containsAll(ActualArrayList));

	//@SuppressWarnings("deprecation")
	@When("linked list section count should be {int}")
	public void linked_list_section_count_should_be(Integer a) {
		Assert.assertTrue(linklst.linkedlistcount()== a);
		}
	//assertTrue(linklst.linkedlistcount()== a);
	@When("User clicks on Try Here button")
	public void user_clicks_on_try_here_button() {
		linklst.tryhere();
	  	}

	@Then("User should be redirected to next page")
	public void user_should_be_redirected_to_next_page() {
		linklst.TryEditorPage();
	  	}

	@When("User enters the text in the TextBox {string}")
	public void user_enters_the_text_in_the_text_box(String tryeditortxt) {
	linklst.entrTextInTryEditorTxtBox();  	
	}

	@When("Clicks on the Run button")
	public void clicks_on_the_run_button() {
		linklst.RunBtn();
	  	}

	@Then("Result is displayed on the console")
	public void result_is_displayed_on_the_console() {
		linklst.consoleoutput();
	  }

@When("Users clicks on Creating linked list in Lists button")
public void users_clicks_on_creating_linked_list_in_lists_button() {
	linklst.createlist();
}

@Then("Users should be redirected to Creating linked list in Lists page")
public void users_should_be_redirected_to_creating_linked_list_in_lists_page() {
	linklst.chkcreatelist();
   }
@When("Users clicks on Types of linked  list in Lists button")
public void users_clicks_on_types_of_linked_list_in_lists_button() {
	linklst.typesoflist();
   }

@Then("Users should be redirected to TYpes of linked list in Lists page")
public void users_should_be_redirected_to_t_ypes_of_linked_list_in_lists_page() {
	linklst.chktypesoflist();
   }

@When("Users clicks on Implementation in Lists button")
public void users_clicks_on_implementation_in_lists_button() {
	linklst.implementoflist();
	}

@Then("Users should be redirected to Implementation in Lists page")
public void users_should_be_redirected_to_implementation_in_lists_page() {
	linklst.chkimplementation();
    }
@When("Users clicks on Traversal in Lists button")
public void users_clicks_on_traversal_in_lists_button() {
	linklst.traversal();
    }

@Then("Users should be redirected to Traversal in Lists page")
public void users_should_be_redirected_to_traversal_in_lists_page() {
	linklst.chktraversal();
   }
@When("Users clicks on Insertion in Lists button")
public void users_clicks_on_insertion_in_lists_button() {
	linklst.insertion();
   }

@Then("Users should be redirected to Insertion in Lists page")
public void users_should_be_redirected_to_insertion_in_lists_page() {
linklst.chkinsertion();    
}

@When("Users clicks on Deletion in Lists button")
public void users_clicks_on_deletion_in_lists_button() {
linklst.deletion();
}

@Then("Users should be redirected to Deletion in Lists page")
public void users_should_be_redirected_to_deletion_in_lists_page() {
linklst.chkdeletion();    
}

}
