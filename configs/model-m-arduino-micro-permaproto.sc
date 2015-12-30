# 
## IBM Model M Matrix (US English) - Teensy 2++ Edition, perma-proto
## Custom Matrix by Amersel, modified for perma-proto installation
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
# Notice that this uses a less inituitive pinout for the perma proto, since some pins on the Teensy 2++ need to be bypassed. It's a necessary evil if you want LED pins.
# Strobe pins, 16 pin strip (1 = leftmost pin as pictured above)
# D6 cannot be used since it is used to control the onboard LED, so E6 is used here instead
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
# 16: C7
# 
# Sense pins, 8 pin strip (1 = left most pin)
# 1: B1
# 2: B3
# 3: F0
# 4: F1
# 5: F4
# 6: F5
# 7: F6
# 8: F7
#
# LED pins x4

#led num -PD7
#led caps -PE0
#led scroll -PE1

matrix
   scanrate 1	
   debounce 5
   blocking 0

   sense            PB1         PB3         PF0         PF1         PF4         PF5         PF6         PF7 

   strobe   PD1   	UNASSIGNED	UNASSIGNED	LCTRL		UNASSIGNED	UNASSIGNED	UNASSIGNED	RCTRL		UNASSIGNED
   strobe   PD0   	UNASSIGNED	LSHIFT		UNASSIGNED	UNASSIGNED	UNASSIGNED	UNASSIGNED	RSHIFT  	UNASSIGNED
   strobe   PD4   	ESC 		TAB			BACK_QUOTE	1			Q			A			Z			UNASSIGNED
   strobe   PC6   	UNASSIGNED	CAPS_LOCK	F1			2			W			S			X			UNASSIGNED
   
   strobe   PD7   	F4			F3			F2			3			E			D			C			UNASSIGNED
   strobe   PE6   	G			T			5			4			R			F			V			B
   strobe   PB4   	F5			BACKSPACE	F9			F10			UNASSIGNED	BACKSLASH	ENTER		SPACE
   strobe   PB5   	H			Y			6			7			U			J			M			N
   
   strobe   PB6   	F6			RIGHT_BRACE	EQUAL		8			I			K			COMMA		UNASSIGNED
   strobe   PB7   	UNASSIGNED	F7			F8			9			O			L			PERIOD		UNASSIGNED
   strobe   PD6   	QUOTE		LEFT_BRACE	MINUS		0			P			SEMICOLON	UNASSIGNED	SLASH
   strobe   PB2   	UNASSIGNED	PAD_4		DELETE		F11			PAD_7		PAD_1		NUM_LOCK	DOWN
   
   strobe   PB0   	PAD_0		PAD_5		INSERT		F12			PAD_8		PAD_2		PAD_SLASH	RIGHT
   strobe   PD3   	PAD_PERIOD	PAD_6		PAGE_UP		PAGE_DOWN	PAD_9		PAD_3		PAD_ASTERIX	PAD_MINUS
   strobe   PD2   	UP			UNASSIGNED	HOME		END 		PAD_PLUS	PAD_ENTER	FN2			LEFT
   strobe   PC7   	LALT		UNASSIGNED	UNASSIGNED	PRINTSCREEN	SCROLL_LOCK	UNASSIGNED	UNASSIGNED	RALT
   
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