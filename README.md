# 🛒 Web Shop – Full Stack Application

This is a full-stack Web Shop application that enables adding, updating, deleting, and searching for products, including support for uploading and displaying product images.

## 📁 Project Structure

```
webshop/
├── backend/
│   └── SpringEcom/          # Spring Boot application (REST API)
├── frontend/
│   └── ecom-frontend-5-main/ # React application (UI)
```

## ⚙️ Technologies Used

* **Backend**: Java, Spring Boot, Spring Data JPA, PostgreSQL
* **Frontend**: React, Vite
* **Others**: Lombok, MultipartFile for image upload

## ⚡ Running the Project

### Backend

1. Open `backend/SpringEcom` in your IDE (e.g., IntelliJ IDEA).
2. Check the `application.properties` file and configure your PostgreSQL database connection.
3. Run the application via `SpringEcomApplication.java`.

### Frontend

1. Open a terminal in `frontend/ecom-frontend-5-main`.

2. Install dependencies:

   ```bash
   npm install
   ```

3. Start the development server:

   ```bash
   npm run dev
   ```

## 📦 Features

* ✅ Add product with image
* ✅ Update product
* ✅ Delete product
* ✅ List all products
* ✅ Get product by ID
* ✅ Search products by keyword (name, description, brand, category)
* ✅ Display product image via `GET /product/{productId}/image`

## 🔧 Configuration Notes

* The following line was added in `application.properties` to resolve an issue with large objects (images) in PostgreSQL:

  ```
  spring.datasource.hikari.auto-commit=false
  ```

## 📌 Notes

* The frontend is based on a pre-made template; the backend was fully developed from scratch.
* REST principles were followed when implementing the API endpoints.
