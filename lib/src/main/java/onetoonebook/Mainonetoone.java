package onetoonebook;

import onetoonebook.dao.BookDAO;
import onetoonebook.entity.Book;
import onetoonebook.entity.Author;

public class Mainonetoone {

	public static void main(String[] args) {
		
		//create instructor object
		Book instr = new Book();
		//set the values to the instructor object
		instr.setTitle("One Piece");
		instr.setDescription("Oda");
		
		
		
		//create instructor details object
		Author instrDet = new Author();
		//set values for instructor details object
		instrDet.setName("Rohith");
		instrDet.setEmail("rohith@.com");
		//set instructor details to above instructor object
		instr.setAuthorid(instrDet);
		
		//save the instructor (which automatically saves the instructor details as cascade
		//option is enabled)
		//create an object for instructor dao
		BookDAO instrDao = new BookDAO();
		instrDao.insertBook(instr);
		
		//to display all instructor
		instrDao.getBooks();

	}

}