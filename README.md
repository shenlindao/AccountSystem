# Итоговая контрольная работа
Необходимо организовать систему учета для питомника в котором живут
домашние и вьючные животные.
## Задание

1. Используя команду cat в терминале операционной системы Linux, создать
два файла Домашние животные (заполнив файл собаками, кошками,
хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и
ослы), а затем объединить их. Просмотреть содержимое созданного файла.
Переименовать файл, дав ему новое имя (Друзья человека).

![Screenshot_1](https://github.com/shenlindao/control_work_part_3/assets/84900687/e42862a8-3796-41f3-8c3e-63bdc59da71b)


2. Создать директорию, переместить файл туда.

![Screenshot_2](https://github.com/shenlindao/control_work_part_3/assets/84900687/007179a9-c95b-4aab-8aad-ef93ed3aff67)


3. Подключить дополнительный репозиторий MySQL. Установить любой пакет
из этого репозитория.
4. Установить и удалить deb-пакет с помощью dpkg.

![Screenshot_3](https://github.com/shenlindao/control_work_part_3/assets/84900687/f8f301fe-ded2-4ac4-8ff6-adab2592ccdf)
![Screenshot_4](https://github.com/shenlindao/control_work_part_3/assets/84900687/62736e9b-19ee-4ad9-9d4f-b895928a3a7e)
![Screenshot_5](https://github.com/shenlindao/control_work_part_3/assets/84900687/c0f37544-0047-4fd1-97bb-5d0015a633e1)
![Screenshot_6](https://github.com/shenlindao/control_work_part_3/assets/84900687/e1e084de-b962-473a-ae1a-873fe9654af3)
![Screenshot_7](https://github.com/shenlindao/control_work_part_3/assets/84900687/cc885523-e9bf-4596-ba46-dec09f2688b0)
![Screenshot_8](https://github.com/shenlindao/control_work_part_3/assets/84900687/58c113d2-4e15-4ad9-ae51-45c5204dad87)
![Screenshot_9](https://github.com/shenlindao/control_work_part_3/assets/84900687/0b7d7321-14d9-43ae-885a-a68d188ecc9f)


5. Выложить историю команд в терминале ubuntu

![history_root](https://github.com/shenlindao/control_work_part_3/assets/84900687/9e91f43f-89d6-41e9-9857-7a7e7187a7aa)

![history_user](https://github.com/shenlindao/control_work_part_3/assets/84900687/c10c18b3-25fc-4995-b4b9-6de96de39a4d)

6. Нарисовать диаграмму, в которой есть класс родительский класс, домашние
животные и вьючные животные, в составы которых в случае домашних
животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные
войдут: Лошади, верблюды и ослы).

![diagram](https://github.com/shenlindao/control_work_part_3/assets/84900687/b3f42097-ef99-4393-afb2-db197c7349b7)

7. В подключенном MySQL репозитории создать базу данных “Друзья
человека”

![создание базы данных](https://github.com/shenlindao/control_work_part_3/assets/84900687/bb3a56de-3b50-4cea-adc1-8b8f010cf051)

8. Создать таблицы с иерархией из диаграммы в БД

![Создать таблицы с иерархией из диаграммы в БД](https://github.com/shenlindao/control_work_part_3/blob/main/sql/create_tables_pets_and_beasts.sql)

9. Заполнить низкоуровневые таблицы именами(животных), командами
которые они выполняют и датами рождения

![Заполнить низкоуровневые таблицы именами(животных), командами
которые они выполняют и датами рождения](https://github.com/shenlindao/control_work_part_3/blob/main/sql/insert_into_tables_pets_and_beasts.sql)

10. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой
питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу.

![Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой
питомник на зимовку](https://github.com/shenlindao/control_work_part_3/blob/main/sql/truncate_camel_create_horseanddonkey.sql)

![Объединить таблицы лошади, и ослы в одну таблицу.](https://github.com/shenlindao/control_work_part_3/blob/main/sql/delete_from_camel_combine_hourse_dunkey.sql)

11. Создать новую таблицу “молодые животные” в которую попадут все животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью до месяца подсчитать возраст животных в новой таблице

![Создать новую таблицу “молодые животные”](https://github.com/shenlindao/control_work_part_3/blob/main/sql/create_table_yong_animals.sql)

12. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на
прошлую принадлежность к старым таблицам.

![Объединить все таблицы в одну, при этом сохраняя поля, указывающие на
прошлую принадлежность к старым таблицам.](https://github.com/shenlindao/control_work_part_3/blob/main/sql/create_table_animals.sql)
