# Main Library System Requirements
---

- **The system shall allow** registering a new reader  
  - **includes:** check uniqueness of phone number or reader ID  

- **The system shall store and display** detailed information about books  
  - **includes:** show book quantity remaining  
  - **includes:** show book availability  

- **The system shall allow** adding new books to the catalog  
  - **includes:** check uniqueness of book entry  
  - **includes:** add authors and genres  

- **The system shall allow** updating or deleting book information  
  - **includes:** check if book exists  
  - **extends:** notify about deletion errors  

- **The system shall allow** readers to borrow books  
  - **includes:** check book availability  
  - **includes:** check book quantity restrictions  
  - **includes:** update checkout history  
  - **extends:** notify about overdue books  

- **The system shall allow** readers to return borrowed books  
  - **includes:** update checkout history  
  - **extends:** calculate overdue fines  
  - **extends:** notify about damaged books  

- **The system shall display** the checkout history for books and readers  
  - **includes:** filter by client  
  - **includes:** filter by time period  

- **The system shall provide** filtering of books by author or genre  

- **The system shall automatically update** checkout history whenever a book is borrowed or returned
