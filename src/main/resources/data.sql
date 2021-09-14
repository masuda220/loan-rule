-- 蔵書
INSERT INTO 蔵書.品目
  (品目番号, タイトル, 著者)
VALUES
  ('masuda-2017','現場で役立つシステム設計の原則','増田 亨'),
  ('evans-2011','ドメイン駆動設計','エリックエヴァンス'),
  ('fowler-2017','リファクタリング','マーチンファウラー'),
  ('kanzaki-2019','RDRA 2.0 ハンドブック','神崎 善治')
;

INSERT INTO 蔵書.蔵書
(蔵書番号, 品目番号)
VALUES
(1, 'masuda-2017'),
(2, 'evans-2011'),
(3, 'evans-2011'),
(4, 'fowler-2017'),
(5, 'fowler-2017'),
(6, 'kanzaki-2019')
;

-- 会員
INSERT INTO 会員.会員
  (会員番号, 氏名, 会員種別)
VALUES
  (220, '成田 明','小中学生'),
  (403, '今井 春香', '一般')
;

-- 貸出
INSERT INTO 貸出.貸出
(蔵書番号, 会員番号, 貸出日)
VALUES
(2, 403, CURRENT_DATE - 10),
(6, 403, CURRENT_DATE - 20),
(1, 220, CURRENT_DATE - 7)
;
