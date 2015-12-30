#
## Personal Wheelwriter 2/Wheelwriter 1000 Matrix (US English)
## Modified for WW2/WW1000 by Antonizoon.
# 
# Inspired from Wheelwriter 5 layout by: Sethstorm from Geekhack.
# http://geekhack.org/index.php?topic=55676.msg1372033#msg1372033
#
## Layout Notes:
# Layout follows a 60% reduction of a standard PS/2 layout, adding function keys.
# Because the keyboard is labeled for use on a typewriter, some remapping is necessary.
#
## Functionality Difference - Swap keycaps with Unicomp or Model M to reduce confusion
# The 6 key has a Cent symbol on top, but it will output the standard ^ (Caret) symbol when shifted.
# The key above the Tab key is a circle and +- sign, but it is the same as the (`/~) Grave Accent key.
#
## Spacebar Row
# Ctrl : [Code] - The awesome Code key is used as a standard Ctrl key.
# Alt : [<X]/Word] - This key is originally used for whiting out words on the typewriter, but is now an Alt key.
#
## Left 5-key vertical block
# Esc : [Mar Rel] - Top key in left 5-key vertical block.
# Volume Up/Volume Down : [LMar]/[RMar] - Second and Third keys in left 5-key vertical block.
# Windows Key : [TSet] - Fourth key in left 5-key vertical block.
#
## Right 5-key vertical block
# PgUp/PgDn : [Paper Up]/[Paper Down] - Top two keys in the right 5-key vertical block, respectively.
# Backslash : [Reloc] - Since the US layout is missing the backslash/pipe key, we put it on this key, just above the cursor keys.
# 
## The last key in the 5-key vertical block on the left, [T Clr] can be used a function modifier (Fn) key:
# [Modifier]-[Number key] : F1 to F10 keys.
# [Modifier]-[Minus/Underscore] : F11
# [Modifier]-[Equal/Plus] : F12
# [Modifier]-[Backspace] : Del (for those wishing to perform Ctrl-Alt-Del, use Ctrl-Alt-Modifier-Backspace)
# [Modifier]-[PgDn] : Left Win/GUI key
# [Modifier]-WASD : Cursor keys (Up/Left/Down/Right)
#

## Teensy 2++ Wiring Diagram
# (example) http://i.imgur.com/Q8TZ3TR.jpg
# Strobe pins, 13 pin strip (1 = leftmost pin as pictured above)
# had to set up differently from sethstorm, because I plug it next to the jack
# 1 : D0
# 2 : D1
# 3 : D2
# 4 : D3
# 5 : D4
# 6 : D5
# 7 : D6
# 8 : D7
# 9 : E0
# 10: E1
# 11: C0
# 12: C1
# 13: C2
# 14: C3
# 15: C4
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
   strobe   PD1      FN2          UNASSIGNED   UNASSIGNED   UNASSIGNED   MEDIA_VOLUME_UP   UNASSIGNED   UNASSIGNED    SPACE
   strobe   PD2      UNASSIGNED   LGUI         ESC          UNASSIGNED   TAB          MEDIA_VOLUME_DOWN   CAPS_LOCK     LALT
   strobe   PD3      UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   RSHIFT        LSHIFT
   
   strobe   PD4      UNASSIGNED   A            BACK_QUOTE   1            Q            UNASSIGNED   Z             8
   strobe   PD5      UNASSIGNED   S            UNASSIGNED   2            W            UNASSIGNED   X             I
   strobe   PE6      UNASSIGNED   D            UNASSIGNED   3            E            UNASSIGNED   C             K
   strobe   PD7      G            F            5            4            R            T            V             B
   
   strobe   PE0      H            J            6            7            U            Y            M             N
   strobe   PE1      UNASSIGNED   K            EQUAL        8            I            RIGHT_BRACE  COMMA         I
   strobe   PC0      UNASSIGNED   L            3            9            O            5            PERIOD        6
   strobe   PC1      QUOTE        SEMICOLON    MINUS        0            P            LEFT_BRACE   UNASSIGNED    SLASH
   
   strobe   PC2      ENTER        UNASSIGNED   BACKSPACE    UNASSIGNED   UNASSIGNED   6            UP            LEFT
   strobe   PC3      DOWN         BACKSLASH    PAGE_UP      UNASSIGNED   PAGE_DOWN    UNASSIGNED   UNASSIGNED    RIGHT
   strobe   PC4      UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED    LCTRL
   
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