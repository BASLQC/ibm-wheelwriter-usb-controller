# 
## IBM Model M Matrix (US English) - Teensy 2 Edition
## Custom Matrix by Amersel and Antonizoon
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

## Teensy 2 Wiring Diagram - http://i.imgur.com/7a0YWON.jpg
# It would probably be simpler to use the Teensy 2++. but the Teensy 2 and LC are cheaper and smaller.
# This wiring is a bit complex, and requires you to use the auxilary pins, so check out the image linked above.
# Strobe pins, 16 pin strip (1 = leftmost pin as pictured above)
# D6 cannot be used since it is used to control the onboard LED
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
# 14: E6
# 15: D4
# 16: D5
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

matrix
   scanrate 1	
   debounce 5
   blocking 0

   sense            PF0			PF1			PF4			PF5			PF6			PF7			PB6			PB5         

   strobe   PB0   	UNASSIGNED	UNASSIGNED	LCTRL		UNASSIGNED	UNASSIGNED	UNASSIGNED	RCTRL		UNASSIGNED
   strobe   PB1   	UNASSIGNED	RSHIFT		UNASSIGNED	UNASSIGNED	UNASSIGNED	UNASSIGNED	LSHIFT  	UNASSIGNED
   strobe   PB2   	ESC 		TAB			BACK_QUOTE	1			Q			A			Z			UNASSIGNED
   strobe   PB3   	UNASSIGNED	CAPS_LOCK	F1			2			W			S			X			UNASSIGNED
   
   strobe   PB7   	F4			F3			F2			3			E			D			C			UNASSIGNED
   strobe   PD0   	G			T			5			4			R			F			V			B
   strobe   PD1   	F5			BACKSPACE	F9			F10			UNASSIGNED	BACKSLASH	ENTER		SPACE
   strobe   PD2   	H			Y			6			7			U			J			M			N
   
   strobe   PD3   	F6			RIGHT_BRACE	EQUAL		8			I			K			COMMA		UNASSIGNED
   strobe   PC6   	UNASSIGNED	F7			F8			9			O			L			PERIOD		UNASSIGNED
   strobe   PC7   	QUOTE		LEFT_BRACE	MINUS		0			P			SEMICOLON	UNASSIGNED	SLASH
   strobe   PB4   	UNASSIGNED	PAD_4		DELETE		F11			PAD_7		PAD_1		NUM_LOCK	DOWN
   
   strobe   PD7   	PAD_0		PAD_5		INSERT		F12			PAD_8		PAD_2		PAD_SLASH	RIGHT
   strobe   PE6   	PAD_PERIOD	PAD_6		PAGE_UP		PAGE_DOWN	PAD_9		PAD_3		PAD_ASTERIX	PAD_MINUS
   strobe   PD4   	UP			UNASSIGNED	HOME		END 		PAD_PLUS	PAD_ENTER	FN2			LEFT
   strobe   PD5   	LALT		UNASSIGNED	UNASSIGNED	PRINTSCREEN	SCROLL_LOCK	UNASSIGNED	UNASSIGNED	RALT
   
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