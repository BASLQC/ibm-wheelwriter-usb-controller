# 
## IBM Model M Matrix (US English) - Teensy 2++ Edition
## Custom Matrix by Amersel
## A basic layout with handy function keys.
# 
## Layout Notes:
# Layout is the same as standard IBM Model M, but uses Pause/Break key as function key.
#
# [Modifier]-P : Use this key combo to emit the original Pause/Break key.
# [Modifier]-[Home] : Windows key.
# [Modifier]-[End] : Context Menu key.

# [Modifier]-0 : Mute.
# [Modifier]-[Equal/Plus] : Volume Up.
# [Modifier]-[Minus/Underscore] : Volume Down.
# 
# [Modifier]-[Left] : Previous Track.
# [Modifier]-[Down] : Play/Pause.
# [Modifier]-[Right] : Next Track.
#

## Teensy 2++ Wiring Diagram
# Just plug them into a 16-pin Trio-mate socket and an 8-pin.
# Strobe pins, 16 pin strip (1 = leftmost pin as pictured above)
# 1 : D0
# 2 : D1
# 3 : D2
# 4 : D3
# 5 : D4
# 6 : D5
# 7 : E0
# 8 : E1
# 9 : C0
# 10: C1
# 11: C2
# 12: C3
# 13: C4
# 14: C5
# 15: C6
# 16: C7
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

# LED Pins - reversed.LEDs
# For some reason, the LED Pin turns on when connected to ground. This is the
# inverse of modern systems, which turn them on when connected to 5V.
# Not to worry though. All you need to do is wire the fat wire to 5V, and the
# chosen LED to GND. Then set Negative LED input, as shown below.
#    Scroll Lock has never been tested, but should work...
led num -PB5          # Pin 1 (leftmost)
                      # Pin 2 needs to plug into 5V / VCC, no resistor necessary
led caps -PB4         # Pin 3
led scroll -PB3       # Pin 4 (rightmost)

matrix
   scanrate 1	
   debounce 5
   blocking 0

   sense             PF0          PF1          PF2          PF3          PF4          PF5          PF6          PF7         

   strobe   PD0      UNASSIGNED   UNASSIGNED   LCTRL        UNASSIGNED   UNASSIGNED   UNASSIGNED   RCTRL        UNASSIGNED
   strobe   PD1      UNASSIGNED   RSHIFT       UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   LSHIFT       UNASSIGNED
   strobe   PD2      ESC          TAB          BACK_QUOTE   1            Q            A            Z            UNASSIGNED
   strobe   PD3      UNASSIGNED   CAPS_LOCK    F1           2            W            S            X            UNASSIGNED
   
   strobe   PD4      F4           F3           F2           3            E            D            C            UNASSIGNED
   strobe   PD5      G            T            5            4            R            F            V            B
   strobe   PE0      F5           BACKSPACE    F9           F10          UNASSIGNED   BACKSLASH    ENTER        SPACE
   strobe   PD1      H            Y            6            7            U            J            M            N
   
   strobe   PC0      F6           RIGHT_BRACE  EQUAL        8            I            K            COMMA        UNASSIGNED
   strobe   PC1      UNASSIGNED   F7           F8           9            O            L            PERIOD       UNASSIGNED
   strobe   PC2      QUOTE        LEFT_BRACE   MINUS        0            P            SEMICOLON    UNASSIGNED   SLASH
   strobe   PC3      UNASSIGNED   PAD_4        DELETE       F11          PAD_7        PAD_1        NUM_LOCK     DOWN
   
   strobe   PC4      PAD_0        PAD_5        INSERT       F12          PAD_8        PAD_2        PAD_SLASH    RIGHT
   strobe   PC5      PAD_PERIOD   PAD_6        PAGE_UP      PAGE_DOWN    PAD_9        PAD_3        PAD_ASTERIX  PAD_MINUS
   strobe   PC6      UP           UNASSIGNED   HOME         END          PAD_PLUS     PAD_ENTER    FN2          LEFT
   strobe   PC7      UNASSIGNED   UNASSIGNED   UNASSIGNED   PRINTSCREEN  SCROLL_LOCK  UNASSIGNED   UNASSIGNED   UNASSIGNED
   
end

macroblock

endblock

# Pause/Break is used as a function key (at PF6, PC4)
# You can regain it's original function with the key combo: [Modifier]-P
layerblock
   FN2 2
endblock

# Function Modifier Layer
remapblock
   layer 2

   P		PAUSE              # Original function
   ESC		SYSTEM_POWER       # Power Button
   
   HOME 	LGUI               # Windows Key
#   END		MENU               # Context Menu Key
   
   0		MEDIA_MUTE         # Volume controls
   MINUS	MEDIA_VOLUME_DOWN
   EQUAL	MEDIA_VOLUME_UP
   
   LEFT		MEDIA_PREV_TRACK   # iTunes / media playback controls
   DOWN		MEDIA_PLAY_PAUSE
   RIGHT	MEDIA_NEXT_TRACK
endblock