#
# Wheelwriter 5 Matrix (ISO Enter)
# A sane, yet minimalist layout.
# Source: Sethstorm from Geekhack.
# http://geekhack.org/index.php?topic=55676.msg1372033#msg1372033
#
# Layout Notes:
# Layout mostly follows AT(Ctrl between Tab/Left Shift, Caps Lock below Right Shift) aside from ISO Enter/F11/F12.
#
# Top two keys in the 5-key vertical block are PgUp/PgDn respectively.
# Bottom two keys in the 5-key vertical block are F11/F12 respectively.
#
# The middle key in the 5-key vertical block on the right can be used as follows:
# [Modifier]-WASD : Cursor keys (Up/Left/Down/Right)
# [Modifier]-[Number key] : Equivalent numpad key
# [Modifier]-[Backspace] : Del (for those wishing to perform Ctrl-Alt-Del, use Ctrl-Alt-Modifier-Backspace)
# [Modifier]-[PgDn] : Left Win/GUI key
# [Modifier]-[`] : Escape key
#

# Note: This configuration uses the following pinout with a Teensy 3.0, as pictured:
#       here: http://i.imgur.com/Q8TZ3TR.jpg
# Strobe pins, 13 pin strip (1 = leftmost pin as pictured above)
# 1 : D0
# 2 : D1
# 3 : D2
# 4 : D3
# 5 : D4
# 6 : C0
# 7 : C1
# 8 : C2
# 9 : C3
# 10: C4
# 11: C5
# 12: C6
# 13: C7
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

   strobe   PD0      UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED    LALT
   strobe   PD1      F10          F7           F1           F3           F4           F5           F11           SPACE
   strobe   PD2      F9           F8           F2           UNASSIGNED   TAB          F6           LCTRL         CAPS_LOCK
   strobe   PD3      UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED    LSHIFT
   
   strobe   PD4      UNASSIGNED   A            BACK_QUOTE   1            Q            UNASSIGNED   Z             8
   strobe   PC0      UNASSIGNED   S            UNASSIGNED   2            W            UNASSIGNED   X             I
   strobe   PC1      UNASSIGNED   D            UNASSIGNED   3            E            UNASSIGNED   C             K
   strobe   PC2      G            F            5            4            R            T            V             B
   
   strobe   PC3      H            J            6            7            U            Y            M             N
   strobe   PC4      UNASSIGNED   K            EQUAL_SIGN   8            I            RIGHT_BRACE  COMMA         I
   strobe   PC5      UNASSIGNED   L            3            9            O            5            PERIOD        6
   strobe   PC6      QUOTE        SEMICOLON    MINUS        0            P            LEFT_BRACE   BACKSLASH     SLASH
   
   strobe   PC7      UNASSIGNED   FN2          BACKSPACE    PAGE_UP      PAGE_DOWN    6            ENTER         F12

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