PORT = /dev/ttyACM0

burn:
	python reset.py $(PORT)
	sleep 2
	avrdude -patmega32u4 -cavr109 -P$(PORT) -b57600 -D -Uflash:w:Soarer_Controller_v1.20_beta4_atmega32u4.hex