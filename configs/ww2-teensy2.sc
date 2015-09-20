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

## Teensy 2 Wiring Diagram
# A bit more awkward to work with than the Teensy 2++, since the auxilary D4 has to be used (D6 cannot be used, it's for LED control)
# Solder a header pin or wire onto D4, or attach an Alligator clip if you're just testing.
# Strobe pins, 14 pin strip (1 = leftmost pin as pictured above)
# 1 : B0
# 2 : B1
# 3 : B2
# 4 : B3
# 5 : B7
# 6 : D0
# 7 : D1
# 8 : D2
# 9 : D3
# 10: C6
# 11: C7
# 12: B4
# 13: D7
# 14: D4
# 
# Sense pins, 8 pin strip (1 = left most pin)
# 1: F0
# 2: F1
# 3: F4
# 4: F5
# 5: F6
# 6: F7
# 7: B6
# 8: B5


# empty matrix for testing with hid
matrix
   scanrate 1
   debounce 5
   blocking 0

   sense             PF0          PF1          PF4          PF5          PF6          PF7          PB6           PB5

   strobe   PB0      UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED    LALT
   strobe   PB1      F10          F7           F1           F3           F4           F5           F11           SPACE
   strobe   PB2      F9           F8           F2           UNASSIGNED   TAB          F6           LCTRL         CAPS_LOCK
   strobe   PB3      UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED    LSHIFT
   
   strobe   PB7      UNASSIGNED   A            BACK_QUOTE   1            Q            UNASSIGNED   Z             8
   strobe   PD0      UNASSIGNED   S            UNASSIGNED   2            W            UNASSIGNED   X             I
   strobe   PD1      UNASSIGNED   D            UNASSIGNED   3            E            UNASSIGNED   C             K
   strobe   PD2      G            F            5            4            R            T            V             B
   
   strobe   PD3      H            J            6            7            U            Y            M             N
   strobe   PC6      UNASSIGNED   K            EQUAL_SIGN   8            I            RIGHT_BRACE  COMMA         I
   strobe   PC7      UNASSIGNED   L            3            9            O            5            PERIOD        6
   strobe   PB4      QUOTE        SEMICOLON    MINUS        0            P            LEFT_BRACE   BACKSLASH     SLASH
   
   strobe   PD7      UNASSIGNED   FN2          BACKSPACE    PAGE_UP      PAGE_DOWN    6            ENTER         F12

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