# 📇 Contact Directory Management System (Java)

## 📌 Overview

This is a simple **Contact Directory Management System** implemented in Java using Object-Oriented Programming concepts.
It allows users to store, search, delete, and display contact information efficiently using a fixed-size array.

---

## ⚙️ Features

* ➕ Add a new contact (name + phone number)
* 🔍 Search contact by name (case-insensitive)
* ❌ Delete a contact
* 📋 Display all contacts

---

## 🧠 Concepts Used

* Classes and Objects
* Encapsulation
* Arrays
* Linear Search
* Basic Data Management

---

## 🏗️ Project Structure

```
Contact Directory
│
├── Contact class
│   ├── name
│   ├── phone
│   ├── getName()
│   └── getPhone()
│
├── Directory class
│   ├── Contact[] contacts
│   ├── addContact()
│   ├── searchContact()
│   ├── deleteContact()
│   └── displayContacts()
│
└── Main class
    └── Testing functionality
```

---

## 🚀 How It Works

### 1. Add Contact

Stores a new contact if space is available:

```java
contacts[count++] = new Contact(name, phone);
```

### 2. Search Contact

Performs case-insensitive search:

```java
contacts[i].getName().equalsIgnoreCase(name)
```

### 3. Delete Contact

Removes a contact and shifts elements:

```java
contacts[j] = contacts[j + 1];
```

### 4. Display Contacts

Prints all stored contacts.

---

## ▶️ How to Run

1. Open project in VS Code or any Java IDE
2. Compile:

```bash
javac Main.java
```

3. Run:

```bash
java Main
```

---

## ⚠️ Limitations

* Fixed-size array (not scalable)
* No duplicate handling
* No data persistence (data lost after program ends)
* No input validation

---

## 🔧 Possible Improvements

* Use `ArrayList` for dynamic storage
* Add update/edit functionality
* Implement file/database storage
* Add user input (menu-driven system)

---

## 📄 Example Output

```
Contact added.
Contact List:
1. Rahul - 9876543210
2. Priya - 8765432109

Contact Found:
Name: Rahul
Phone: 9876543210

Contact deleted.
Contact not found.
```

---

## 📌 Author

Nupur

---

## ⭐ Notes

This project is ideal for beginners learning Java OOP and basic data structures.
