#
## Wheelwriter 3 Matrix (ISO Enter)
## A standard 60% layout based on the FILCO Minima.
## Based on Sethstorm's WW5 layout, from Geekhack.
## http://geekhack.org/index.php?topic=55676.msg1372033#msg1372033
#
## Layout Notes:
# Layout mostly follows AT(Ctrl between Tab/Left Shift, Caps Lock below Right Shift) aside from ISO Enter/F11/F12.
#
# Top two keys in the 5-key vertical block on right are PgUp/PgDn respectively.
# Bottom two keys in the 5-key vertical block are F11/F12 respectively.
#
# The middle key (Micro Up) in the 5-key vertical block on the right can be used as follows:
# [Modifier]-WASD : Cursor keys (Up/Left/Down/Right)
# [Modifier]-[Number key] : Equivalent numpad key
# [Modifier]-[Backspace] : Del (for those wishing to perform Ctrl-Alt-Del, use Ctrl-Alt-Modifier-Backspace)
# [Modifier]-[PgDn] : Left Win/GUI key
# [Modifier]-[`] : Escape key
#

# Note: This configuration uses the following pinout with a Teensy++, as pictured:
#       here: http://i.imgur.com/lbAZruq.jpg
# Strobe pins, 13 pin strip (1 = leftmost pin as pictured above)
# 1 : D2
# 2 : D3
# 3 : D4
# 4 : D5
# 5 : E0
# 6 : E1
# 7 : C0
# 8 : C1
# 9 : C2
# 10: C3
# 11: C4
# 12: C5
# 13: C6
# 
# Sense pins, 8 pin strip (1 = left most pin)
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

   strobe   PD2      UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED    LALT
   strobe   PD3      F10          F7           F1           F3           F4           F5           F11           SPACE
   strobe   PD4      F9           F8           F2           UNASSIGNED   TAB          F6           LCTRL         CAPS_LOCK
   strobe   PD5      UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED    LSHIFT
   
   strobe   PE0      UNASSIGNED   A            BACK_QUOTE   1            Q            UNASSIGNED   Z             8
   strobe   PE1      UNASSIGNED   S            UNASSIGNED   2            W            UNASSIGNED   X             I
   strobe   PC0      UNASSIGNED   D            UNASSIGNED   3            E            UNASSIGNED   C             K
   strobe   PC1      G            F            5            4            R            T            V             B
   
   strobe   PC2      H            J            6            7            U            Y            M             N
   strobe   PC3      UNASSIGNED   K            EQUAL_SIGN   8            I            RIGHT_BRACE  COMMA         I
   strobe   PC4      UNASSIGNED   L            3            9            O            5            PERIOD        6
   strobe   PC5      QUOTE        SEMICOLON    MINUS        0            P            LEFT_BRACE   BACKSLASH     SLASH
   
   strobe   PC6      UNASSIGNED   FN2          BACKSPACE    PAGE_UP      PAGE_DOWN    6            ENTER         F12

end

macroblock

endblock

layerblock
   FN2 2
endblock

remapblock
   layer 2
   W UP
   A LEFT
   S DOWN
   D RIGHT
   BACKSPACE DELETE
   BACK_QUOTE ESC
   PAGE_DOWN LGUI
   1   PAD_1
   2   PAD_2
   3   PAD_3
   4   PAD_4
   5   PAD_5
   6   PAD_6
   7   PAD_7
   8   PAD_8
   9   PAD_9
   0   PAD_0
endblock