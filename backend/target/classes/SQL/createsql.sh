#!/bin/bash

DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
Host="localhost"
User="root"
Password="praveen"

SQL_FILE="$DIR/create.sql"

mysql -h "$HOST" -u "$USER" -p"$PASSWORD" < "$SQL_FILE"