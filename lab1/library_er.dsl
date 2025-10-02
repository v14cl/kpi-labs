Enum Language {
  English
  Ukrainian
  French
}


Table client {
  client_id integer [primary key]
  name varchar [not null]
  surname varchar [not null]
  phone_number varchar [not null, unique]
}

Table checkout {
  checkout_id integer [primary key]
  client_id integer [ref: > client.client_id, not null]
  book_id integer [ref: > book.book_id, not null]
  date_taken date [not null]
  deadline date [not null]
  date_returned date
  
}

Table book {
  book_id integer [primary key]
  title varchar [not null]
  language  Language [not null]
  publisher varchar [not null]
}

Table author {
  author_id integer [primary key]
  name varchar [not null]
  surname varchar
  country varchar [not null]
}

Table genre {
  genre_id integer [primary key]
  name varchar [not null, unique ]
}

Table genre_book {
  book_id integer [ref: > book.book_id] 
  genre_id integer [ref: > genre.genre_id]
  indexes {
    (book_id, genre_id) [pk]
  }
}

Table author_book {
  book_id integer [ref: > book.book_id]
  author_id integer [ref: > author.author_id]
  indexes {
    (book_id, author_id) [pk]
  }
}