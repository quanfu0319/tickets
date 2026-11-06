# 專案名稱：門票訂購系統 (Tickets Application)
本專案為基於 Java Spring Boot 開發的後端購票 API 系統

### 1. 角色權限與業務
- 主辦方 (Organizer)：支援建立活動 (包含活動名稱、開始與結束時間、場地敘述、售票開始時間、票卷種類、儲存為草稿或公開)
- 參與者 (Attendee)：支援活動查詢、模擬使用信用卡購買票卷、票券查詢、顯示QrCode入場。
- 工作人員 (Staff)：支援掃描QrCode、手動輸入票卷代碼入場。

### 2. 使用技術與工具
- Backend: Java 21, Spring Boot 4.1.1, Spring Data JPA, Spring Security (OAuth2 / Resource Server)
- Database: PostgreSQL (搭配 Adminer 進行資料庫視覺化管理)
- Authentication: Keycloak (實作 OAuth2.0 & JWT 授權驗證)
- Frontend: React / Vite (localhost:5173 串接後端 RESTful API)
- Environment & Deployment: Docker / Docker Compose (容器化打包 Spring Boot、PostgreSQL、Keycloak 與 Adminer)

## ⚙️ 系統功能與架構 (Features & Architecture)
**分層架構 (Layered Architecture)**：
  - Controllers：作為 REST API 端點，並透過 `GlobalExceptionHandler` 實現全域例外處理與統一回應[cite: 6]。
  - Services (Interface & Impl)：採用介面與實現分離設計，封裝核心商業邏輯與 QRCode 處理[cite: 11]。
  - Repositories：基於 Spring Data JPA，封裝 PostgreSQL 的 CRUD 操作[cite: 5, 10]。
  - Domain (DTOs & Entities)：嚴格劃分 API 傳輸物件 (DTO) 與資料庫實體 (Entity)，透過 Mappers 進行型態轉換以保障資料安全性。
**安全授權與過濾器 (Security & Filters)**：
  - 整合 Keycloak、OAuth2 Resource Server 與 JWT 機制（`JwtAuthenticationConverter`）[cite: 1, 3, 6, 9]。
  - 自訂 `UserProvisioningFilter` 處理使用者自動掛載與權限校驗。
- **環境與容器化 (Docker Compose)**：
  - 透過 `docker-compose.yml` 統一編排管理 Spring Boot、PostgreSQL、Keycloak 認證伺服器與 Adminer 工具[cite: 1, 4, 5]。

### 4. 如何在本地端執行
1. Clone 本專案：`git clone https://github.com/your-username/your-repo-name.git`
2. 使用IntelliJ開啟專案目錄並啟動 Docker：`docker-compose up -d`
3. 使用VS Code開啟目錄tickets\tickets\frontend，並運行指令：`npm run dev`
4. 
