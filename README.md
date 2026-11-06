# 專案名稱：門票訂購系統 (Tickets Application)
本專案為基於 Java Spring Boot 開發的後端購票 API 系統

### 1. 角色權限與其業務
- 主辦方 (Organizer)：支援建立活動 (包含活動名稱、開始與結束時間、場地敘述、售票開始時間、票卷種類、儲存為草稿或公開)
- 參與者 (Attendee)：支援活動查詢、模擬使用信用卡購買票卷、票券查詢、顯示QrCode入場。
- 工作人員 (Staff)：支援掃描QrCode、手動輸入票卷代碼入場。

### 2. 使用技術與工具
- Backend: Java 21, Spring Boot 4.1.1, Spring Data JPA, Spring Security
- Database: PostgreSQL, Adminer
- Authentication: Keycloak
- Frontend: Vite
- Environment & Deployment: Docker

### 3. 如何在本地端執行
- 複製專案庫
   ```bash
   git clone https://github.com/quanfu0319/tickets.git
   ```
- 啟動後端：使用 IntelliJ IDEA 開啟專案根目錄，再執行以下指令啟動 Docker 容器
  ```bash
  docker-compose up -d
  ```
- 啟動前端：使用 VS Code 開啟 `frontend` 資料夾，再執行以下指令運行開發者模式
  ```bash
   npm run dev
  ```
- 瀏覽器測試
  - 開啟瀏覽器造訪：`http://localhost:5173/`
  - 可使用以下預設測試帳號登入（預設密碼皆為 `password`）：`organizer` `attendee` `staff`
