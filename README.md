# 專案名稱：線上票券訂購系統 (Ticket Booking System)

本專案為基於 Java Spring Boot 開發的後端購票 API 系統，支援會員註冊、票券查詢、下單與庫存扣減等業務邏輯。

## 🛠 使用技術與工具 (Tech Stack)
- **Backend**: Java 17, Spring Boot 3, Spring Data JPA
- **Database**: MySQL
- **Environment & Deployment**: Docker (Docker Compose 打包應用與資料庫)
- **API Test**: Postman / Swagger

## ⚙️ 系統功能與架構 (Features & Architecture)
- **RESTful API 設計**：規範化前端與後端的資料交換格式 (JSON)。
- **MVC 架構設計**：分層處理 Controller（請求控制）、Service（商業邏輯）、Repository（資料存取）。
- **訂單與庫存管理**：實作簡單的票券下單與資料庫更新邏輯。

## 🚀 如何在本地端執行 (How to Run)
1. Clone 本專案：`git clone https://github.com/your-username/your-repo-name.git`
2. 進入專案目錄並啟動 Docker：`docker-compose up -d`
3. 後端服務預設運行於 `http://localhost:8080`
