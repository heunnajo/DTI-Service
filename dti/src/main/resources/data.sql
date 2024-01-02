insert into taxinvoices (conversationId, corpName) values (1,'Alice');
insert into taxinvoices (conversationId, corpName) values (2,'Bob');
insert into taxinvoices (conversationId, corpName) values (3,'Cinderella');

--delete from taxinvoices;
select * from taxinvoices;
update taxinvoices set conversationId = '3' where corpName = 'Cinderella';

commit;