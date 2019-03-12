#!/bin/bash

CLASSPATH=cfg/initiator
CLASSPATH=$CLASSPATH:lib/*

java -cp "$CLASSPATH" com.jramoyo.qfixmessenger.QFixMessenger "cfg/initiator/messenger.cfg" "cfg/initiator/qfix-client-local-mkt.cfg"