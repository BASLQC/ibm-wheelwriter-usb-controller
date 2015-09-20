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
# 7 : D6
# 8 : D7
# 9 : E0
# 10: E1
# 11: C0
# 12: C1
# 13: C2
# 14: C3
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