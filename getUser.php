<?php

include_once './db_functions.php';

$db = new DB_Functions();

$list=$db->getAllUsers();
echo $list;
?>