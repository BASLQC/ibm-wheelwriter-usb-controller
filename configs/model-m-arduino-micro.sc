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

## Arduino Micro Wiring Diagram - https://trello.com/c/qV4783aP/
# Based on the Digital Pins (e.g. PB6, PD0) here: http://imgur.com/wtLEtYl.jpg
# Just plug them into a 16-pin Trio-mate socket and an 8-pin.
# Strobe pins, 16 pin Keyboard strip (1 = leftmost pin as pictured above)
# 1 : C7
# 2 : D3
# 3 : D2
# 4 : B0
# 5 : B2
# 6 : D6
# 7 : B7
# 8 : B6
# 9 : B5
# 10: B4
# 11: E6
# 12: D7
# 13: C6
# 14: D4
# 15: D0
# 16: D1
# 
# Sense pins, 8 pin Keyboard strip (1 = left most pin)
# 1: F7
# 2: F6
# 3: F5
# 4: F4
# 5: F1
# 6: F0
# 7: B3
# 8: B1

# Note: Arduino Micro doesn't have enough pins for LEDs, so it is disabled.
# LED Pins - reversed.LEDs
# For some reason, the LED Pin turns on when connected to ground. This is the
# inverse of modern systems, which turn them on when connected to 5V.
# Not to worry though. All you need to do is wire the fat wire to 5V, and the
# chosen LED to GND. Then set Negative LED input, as shown below.
#    Scroll Lock has never been tested, but should work...
#led num -PB5          # Pin 1 (leftmost)
#                      # Pin 2 needs to plug into 5V / VCC, no resistor necessary
#led caps -PB4         # Pin 3
#led scroll -PB3       # Pin 4 (rightmost)

matrix
   scanrate 1	
   debounce 5
   blocking 0

   sense             PF7          PF6          PF5          PF4          PF1          PF0          PB3          PB1         

   strobe   PC7      UNASSIGNED   UNASSIGNED   LCTRL        UNASSIGNED   UNASSIGNED   UNASSIGNED   RCTRL        UNASSIGNED
   strobe   PD3      UNASSIGNED   RSHIFT       UNASSIGNED   UNASSIGNED   UNASSIGNED   UNASSIGNED   LSHIFT       UNASSIGNED
   strobe   PD2      ESC          TAB          BACK_QUOTE   1            Q            A            Z            UNASSIGNED
   strobe   PB0      UNASSIGNED   CAPS_LOCK    F1           2            W            S            X            UNASSIGNED

   strobe   PB2      F4           F3           F2           3            E            D            C            UNASSIGNED
   strobe   PD6      G            T            5            4            R            F            V            B
   strobe   PB7      F5           BACKSPACE    F9           F10          UNASSIGNED   BACKSLASH    ENTER        SPACE
   strobe   PB6      H            Y            6            7            U            J            M            N
   
   strobe   PB5      F6           RIGHT_BRACE  EQUAL        8            I            K            COMMA        UNASSIGNED
   strobe   PB4      UNASSIGNED   F7           F8           9            O            L            PERIOD       UNASSIGNED
   strobe   PE6      QUOTE        LEFT_BRACE   MINUS        0            P            SEMICOLON    UNASSIGNED   SLASH
   strobe   PD7      UNASSIGNED   PAD_4        DELETE       F11          PAD_7        PAD_1        NUM_LOCK     DOWN
   
   strobe   PC6      PAD_0        PAD_5        INSERT       F12          PAD_8        PAD_2        PAD_SLASH    RIGHT
   strobe   PD4      PAD_PERIOD   PAD_6        PAGE_UP      PAGE_DOWN    PAD_9        PAD_3        PAD_ASTERIX  PAD_MINUS
   strobe   PD0      UP           UNASSIGNED   HOME         END          PAD_PLUS     PAD_ENTER    FN2          LEFT
   strobe   PD1      UNASSIGNED   UNASSIGNED   UNASSIGNED   PRINTSCREEN  SCROLL_LOCK  UNASSIGNED   UNASSIGNED   UNASSIGNED
   
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