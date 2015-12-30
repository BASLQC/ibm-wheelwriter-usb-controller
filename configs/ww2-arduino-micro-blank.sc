#
## Personal Wheelwriter 2 Matrix (US English)
## Modified for WW2 by Antonizoon
##
## Blank matrix used for debugging with `hid_listen`: https://www.pjrc.com/teensy/hid_listen.html
## Based on Sethstorm's WW5 matrix from Geekhack.
## http://geekhack.org/index.php?topic=55676.msg1372033#msg1372033
#
#
# Note: See this Pinout to notice where http://forum.arduino.cc/index.php?topic=148734.0
# Strobe pins, 13 pin strip (1 = leftmost pin as pictured above)
# had to set up differently from sethstorm, because I plug it next to the jack
# 1 : D1
# 2 : D0
# 3 : D4
# 4 : C6

# 5 : D7
# 6 : E6
# 7 : B4
# 8 : B5

# 9 : B6
# 10: B7
# 11: D6
# 12: B2

# 13: B0
# 14: D3
# 15: D2
# 
# Sense pins, 8 pin strip (1 = left most pin)
# We don't need to attach the 7-non reporting pins (from the right)
# 1: B1
# 2: B3
# 3: F0
# 4: F1
# 5: F4
# 6: F5
# 7: F6
# 8: F7

matrix
   scanrate 1
   debounce 5
   blocking 0

   sense             PB1          PB3          PF0          PF1          PF4          PF5          PF6           PF7         

   strobe   PD1      UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED    UNASSIGNED
   strobe   PD0      FN2          UNASSIGNED   UNASSIGNED   UNASSIGNED   MEDIA_VOLUME_UP   UNASSIGNED   UNASSIGNED    SPACE
   strobe   PD4      UNASSIGNED   LGUI         ESC          UNASSIGNED   TAB          MEDIA_VOLUME_DOWN   CAPS_LOCK     LALT
   strobe   PC6      UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   RSHIFT        LSHIFT
   
   strobe   PD7      UNASSIGNED   A            BACK_QUOTE   1            Q            UNASSIGNED   Z             8
   strobe   PE6      UNASSIGNED   S            UNASSIGNED   2            W            UNASSIGNED   X             I
   strobe   PB4      UNASSIGNED   D            UNASSIGNED   3            E            UNASSIGNED   C             K
   strobe   PB5      G            F            5            4            R            T            V             B
   
   strobe   PB6      H            J            6            7            U            Y            M             N
   strobe   PB7      UNASSIGNED   K            EQUAL        8            I            RIGHT_BRACE  COMMA         I
   strobe   PD6      UNASSIGNED   L            3            9            O            5            PERIOD        6
   strobe   PB2      QUOTE        SEMICOLON    MINUS        0            P            LEFT_BRACE   UNASSIGNED    SLASH
   
   strobe   PB0      ENTER        UNASSIGNED   BACKSPACE    UNASSIGNED   UNASSIGNED   6            UP            LEFT
   strobe   PD3      DOWN         BACKSLASH    PAGE_UP      UNASSIGNED   PAGE_DOWN    UNASSIGNED   UNASSIGNED    RIGHT
   strobe   PD2      UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED    LCTRL
   
end

macroblock

endblock

# [T Clr] at the bottom of the left 5-key vertical block is used as Function key
layerblock
   FN2 2
endblock

# Function Modifier Layer
remapblock
   layer 2
   W UP
   A LEFT
   S DOWN
   D RIGHT
   
   BACKSPACE DELETE
   PAGE_UP HOME
   PAGE_DOWN END
   P PRINTSCREEN
   I INSERT
   S SCROLL_LOCK
   
   1 F1
   2 F2
   3 F3
   4 F4
   5 F5
   6 F6
   7 F7
   8 F8
   9 F9
   0 F10
   MINUS F11
   EQUAL F12
endblock