# Java Algorithm Lab | Java アルゴリズム・ラボ

This repository tracks my journey in mastering data structures and algorithms using Java. It is designed with a professional backend engineering mindset, utilizing the **Factory Pattern** to ensure the code is extensible and clean.

このリポジトリは、Java を使用したデータ構造とアルゴリズムの習得プロセスを記録したものです。プロフェッショナルなバックエンド開発の考え方に基づき、**工場パターン（Factory Pattern）**を採用して、拡張性と保守性の高いコード構成にしています。

---

## 🛠 Architecture | アーキテクチャ

Following the **Open-Closed Principle**, the project decouples algorithm logic from execution:
**「開放閉鎖の原則」**に従い、アルゴリズムのロジックと実行部分を分離しています：

- **`Solver` Interface**: Standardizes the execution method.
  **`Solver` インターフェース**：すべてのアルゴリズムの実行メソッドを標準化。
- **`SolverFactory`**: Manages object creation based on input strings.
  **`SolverFactory`**：入力文字列に基づいてオブジェクトの生成を管理。
- **Modular Classes**: Each algorithm lives in its own dedicated class.
  **モジュール化されたクラス**：各アルゴリズムは独立したクラスにカプセル化。

---

## 🚀 Implemented Algorithms | 実装済みアルゴリズム

| Algorithm / アルゴリズム | Key Concept / 核心概念 | SRE/Backend Use Case / 実務での応用 |
| :--- | :--- | :--- |
| **Two Sum** | HashMap ($O(n)$) | High-speed data lookup in large datasets. |
| **Valid Parentheses** | Stack (LIFO) | Validation of YAML/JSON configuration files. |
| **Merge Intervals** | Sorting & Greedy | Managing maintenance windows or log time-ranges. |
| **Binary Search** | Divide & Conquer | Fast log retrieval in sorted audit trails. |

### 日本語解説

| アルゴリズム | 主要コンセプト | SRE/バックエンドでの活用シーン |
| :--- | :--- | :--- |
| **Two Sum (両数之和)** | HashMap ($O(n)$) | 大規模データセットにおける高速なデータ検索。 |
| **Valid Parentheses (有効な括弧)** | Stack (LIFO) | YAML や JSON などの設定ファイルの整合性チェック。 |
| **Merge Intervals (区間の結合)** | 差分管理とソート | メンテナンス時間枠の重複排除やログの時間範囲統合。 |
| **Binary Search (二分探索)** | 分割統治法 | ソート済みの監査ログからの特定イベントの高速検索。 |

---

## 💻 Tech Stack | 技術スタック

- **Language**: Java 21 (Latest LTS)
- **Build Tool**: Maven
- **Environment**: GitHub Codespaces

---

## 📖 How to Run | 実行方法

1. Open in **GitHub Codespaces**.
   **GitHub Codespaces** でプロジェクトを開きます。
2. Navigate to `src/main/java/com/mycompany/app/App.java`.
   `App.java` ファイルに移動します。
3. Update the parameter in `SolverFactory.getSolver("TYPE")` (e.g., `"BINARY"`, `"MERGE"`, `"PARENTHESES"`).
   `SolverFactory.getSolver("TYPE")` の引数を変更します（例：`"BINARY"` など）。
4. Execute via the "Run" button or terminal:
   「Run」ボタンをクリックするか、ターミナルで以下を実行します：
   ```bash
   mvn clean compile
   mvn exec:java -Dexec.mainClass="com.mycompany.app.App"