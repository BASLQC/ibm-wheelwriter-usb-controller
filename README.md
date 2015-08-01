ibm-wheelwriter-usb-controller
==============================

A USB Controller for the buckling spring keyboard on the IBM Wheelwriter typewriter. Based on Soarer's firmware.

[More info can be found here.](https://github.com/antonizoon/antonizoon.github.io/wiki/IBM-Model-M-USB-Controller)

## Installation Instructions

### Set up Teensy Loader

1. First, set up the [Teensy loader.](https://www.pjrc.com/teensy/loader.html) It works on Windows, Mac OS X, and Linux. 
2. Plug in the Teensy with a Mini-USB cable.
3. Start the Teensy Loader.
  * Make sure to run as root, with `sudo`.
4. Press the button on the Teensy to enter bootloader mode.

### Install Soarer's Controller

1. In the Teensy Loader, click the **Open HEX File Button**.
2. Select the right HEX file for your Teensy Variant:
  * Teensy 2.0: `ATMega32u4`
  * Teensy 2.0++: `AT90USB1286`
3. Click the **Program** button.
4. Click the **Restart** button.

### Configure Soarer's Controller

1. From the `tools/` folder, extract the binaries and put them in the `config/` folder.
2. Then, go to the `config/` folder. Choose a config to use, and modify them if necessary.
3. Finally, send a config over to the teensy. For example, we will use `ww2-teensy2plus.sc` .
  * Make sure to run all commands as root, with `sudo`.

    sudo ./scas ww2-teensy2plus.sc output.scb
    sudo ./scwr output.scb

## Credits and Sources

* [Deskthority - Soarer's Keyboard Controller](http://deskthority.net/workshop-f7/soarer-s-keyboard-controller-firmware-t6767.html)
* [Deskthority - PhosphorGlow: Model M Matrix + Teensy](http://deskthority.net/workshop-f7/model-m-matrix-teensy-t8149.html)
* [Deskthority - Sethstorm: Wheelwriter 5 to Teensy++](http://deskthority.net/workshop-f7/wheelwriter-5-iso-enter-boltmodded-t7397.html)