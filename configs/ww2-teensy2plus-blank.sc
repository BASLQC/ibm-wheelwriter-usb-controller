#
## Personal Wheelwriter 2 Matrix (US English)
## Modified for WW2 by Antonizoon
##
## Blank matrix used for debugging with `hid_listen`: https://www.pjrc.com/teensy/hid_listen.html
## Based on Sethstorm's WW5 matrix from Geekhack.
## http://geekhack.org/index.php?topic=55676.msg1372033#msg1372033
#
#
# Note: This configuration uses the following pinout with a Teensy++, as pictured:
#       here: http://i.imgur.com/Q8TZ3TR.jpg
# Strobe pins, 13 pin strip (1 = leftmost pin as pictured above)
# had to set up differently from sethstorm, because I plug it next to the jack
# 1 : D0
# 2 : D1
# 3 : D2
# 4 : D3
# 5 : D4
# 6 : D5
# 7 : E6
# 8 : D7
# 9 : E0
# 10: E1
# 11: C0
# 12: C1
# 13: C2
# 14: C3
# 14: C4
# 
# Sense pins, 8 pin strip (1 = left most pin)
# We don't need to attach the 7-non reporting pins (from the right) to the Teensy
# 1: F0
# 2: F1
# 3: F2
# 4: F3
# 5: F4
# 6: F5
# 7: F6
# 8: F7

matrix
   scanrate 1
   debounce 5
   blocking 0

   sense             PF0          PF1          PF2          PF3          PF4          PF5          PF6           PF7         

   strobe   PD0      UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED    UNASSIGNED
   strobe   PD1      UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED    UNASSIGNED
   strobe   PD2      UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED    UNASSIGNED
   strobe   PD3      UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED    UNASSIGNED
   
   strobe   PD4      UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED    UNASSIGNED
   strobe   PD5      UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED    UNASSIGNED
   strobe   PD6      UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED    UNASSIGNED
   strobe   PD7      UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED    UNASSIGNED
   
   strobe   PE0      UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED    UNASSIGNED
   strobe   PE1      UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED    UNASSIGNED
   strobe   PC0      UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED    UNASSIGNED
   strobe   PC1      UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED    UNASSIGNED
   
   strobe   PC2      UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED    UNASSIGNED
   strobe   PC3      UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED    UNASSIGNED
   strobe   PC4      UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED    UNASSIGNED
   
end

macroblock

endblock