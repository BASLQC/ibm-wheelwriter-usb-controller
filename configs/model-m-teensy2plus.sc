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
# Strobe pins, 16 pin strip (1 = leftmost pin as pictured above)
# D6 cannot be used since it is used to control the onboard LED, so E6 is used here instead
# 1 : D0
# 2 : D1
# 3 : D2
# 4 : D3
# 5 : D4
# 6 : D5
# 7 : E6
# 8 : D7
# 9 : E0
# 10: E1
# 11: C0
# 12: C1
# 13: C2
# 14: C3
# 14: C4
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

   sense            PF0			PF1			PF2			PF3			PF4			PF5			PF6			PF7         

   strobe   PD0   	UNASSIGNED	UNASSIGNED	LCTRL		UNASSIGNED	UNASSIGNED	UNASSIGNED	RCTRL		UNASSIGNED
   strobe   PD1   	UNASSIGNED	RSHIFT		UNASSIGNED	UNASSIGNED	UNASSIGNED	UNASSIGNED	LSHIFT  	UNASSIGNED
   strobe   PD2   	ESC 		TAB			BACK_QUOTE	1			Q			A			Z			UNASSIGNED
   strobe   PD3   	UNASSIGNED	CAPS_LOCK	F1			2			W			S			X			UNASSIGNED
   
   strobe   PD4   	F4			F3			F2			3			E			D			C			UNASSIGNED
   strobe   PD5   	G			T			5			4			R			F			V			B
   strobe   PE6   	F5			BACKSPACE	F9			F10			UNASSIGNED	BACKSLASH	ENTER		SPACE
   strobe   PD7   	H			Y			6			7			U			J			M			N
   
   strobe   PE0   	F6			RIGHT_BRACE	EQUAL		8			I			K			COMMA		UNASSIGNED
   strobe   PE1   	UNASSIGNED	F7			F8			9			O			L			PERIOD		UNASSIGNED
   strobe   PC0   	QUOTE		LEFT_BRACE	MINUS		0			P			SEMICOLON	UNASSIGNED	SLASH
   strobe   PC1   	UNASSIGNED	PAD_4		DELETE		F11			PAD_7		PAD_1		NUM_LOCK	DOWN
   
   strobe   PC2   	PAD_0		PAD_5		INSERT		F12			PAD_8		PAD_2		PAD_SLASH	RIGHT
   strobe   PC3   	PAD_PERIOD	PAD_6		PAGE_UP		PAGE_DOWN	PAD_9		PAD_3		PAD_ASTERIX	PAD_MINUS
   strobe   PC4   	UP			UNASSIGNED	HOME		END 		PAD_PLUS	PAD_ENTER	FN2			LEFT
   strobe   PC5   	UNASSIGNED	UNASSIGNED	UNASSIGNED	PRINTSCREEN	SCROLL_LOCK	UNASSIGNED	UNASSIGNED	UNASSIGNED
   
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