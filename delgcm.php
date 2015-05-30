<?php
"DELETE FROM `gcm_users` WHERE `name` IN('".implode("','",$array)."')";