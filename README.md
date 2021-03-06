# 概要

- 図書館の貸出ルールの実装例
- 貸出ルールの変更や修正が楽で安全かを体験する
 
参考資料:[変更を楽で安全にする設計スタイル:ワークショップ編](https://speakerdeck.com/masuda220/bian-geng-wole-nian-quan-nisurutamefalseshe-ji-wakusiyotupubian)

## 動作方法

- アプリケーションの実行 gradleタスク:bootRun
- localhost:8080でトップページを表示する

JIGドキュメントの生成
- 必要な設定
  - Graphvizをインストール https://www.graphviz.org/
  - dot コマンドが実行できること確認
- gradleタスク: jig documentWithErdを実行


## 設計スタイル

- 三層＋ドメインモデル
- イミュータブルドメインモデル
- イミュータブルデータモデル

### 三層+ドメインモデル

三層（プレゼンテーション層、アプリケーション層、データソース層）から独立させて、ドメインモデルを作る。

ドメインモデルから開発する

### イミュータブルドメインモデル

ドメインモデルのクラス群はイミュータブルに設計する

### イミュータブルデータモデル

テーブル設計の中心は、事実を記録するイミュータブルなテーブルのみにする。

現在の状態、残高、未処理（処理残, to-do ）などはdelete/insertで管理する

## 演習問題

図書館の貸出ルール

貸出時に、貸出ルールに基づき貸出可否を判断する

- (実装済)会員種別ごとの貸出限度数
- (未実装)同じ本は貸し出せない
- (未実装)最大貸出日数を超えている場合は貸し出せない
