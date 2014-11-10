ibm-wheelwriter-usb-controller
==============================

A USB Controller for the buckling spring keyboard on the IBM Wheelwriter typewriter. Based on Soarer's firmware.

[More info can be found here.](https://github.com/antonizoon/antonizoon.github.io/wiki/IBM-Model-M-USB-Controller)

## Installation Instructions

### Set up Teensy Loader

1. First, set up the [Teensy loader.](https://www.pjrc.com/teensy/loader.html) It works on Windows, Mac OS X, and Linux. 
2. Plug in the Teensy with a Mini-USB cable.
3. Start the Teensy Loader.
4. Press the button on the Teensy to enter bootloader mode.

### Install Soarer's Controller

1. In the Teensy Loader, click the **Open HEX File Button**.
2. Select the right HEX file for your Teensy Variant:
  * Teensy 2.0: `ATMega32u4`
  * Teensy 2.0++: `AT90USB1286`
3. Click the **Program** button.
4. Click the **Restart** button.

### Configure Soarer's Controller

