package com.chess.pieces;

public class Piece {

	public enum Color {
		WHITE("white"), BLACK("black"), NOCOLOR("nocolor");

		private String color;

		private Color(String color) {
			this.color = color;
		}

		public String getColor() {
			return this.color;
		}

	}

	public enum Type {
		PAWN('p'), ROOK('r'), KNIGHT('n'), BISHOP('b'), QUEEN('q'), KING('k'), BLANK('*');

		private char representation;

		private Type(char representation) {
			this.representation = representation;
		}

		@Deprecated
		public char getRepresentation() {
			return this.representation;
		}

		public char getWhiteRepresentation() {
			return this.representation;
		}

		public char getBlackRepresentation() {
			return Character.toUpperCase(this.representation);
		}

		public char getBlankRepresentation() {
			return '*';
		}

	}

	private Type type;
	private Color color;

	private Piece(Color color, Type type) {
		this.color = color;
		this.type = type;
	}

	private static Piece createWhite(Type type) {
		return new Piece(Color.WHITE, type);
	}

	private static Piece createBlack(Type type) {
		return new Piece(Color.BLACK, type);
	}

	public String getColor() {
		return this.color.getColor();
	}

	public char getRepresentation() {
		if (this.color.equals(Color.BLACK)) {
			return this.type.getBlackRepresentation();
		}

		if (this.color.equals(Color.NOCOLOR)) {
			return this.type.getBlankRepresentation();
		}
		return this.type.getWhiteRepresentation();
	}

	public Type getType() {
		return this.type;
	}

	public static Piece createBlankPiece() {
		return new Piece(Color.NOCOLOR, Type.BLANK);
	}

	public static Piece createWhitePawn() {

		return createWhite(Type.PAWN);
	}

	public static Piece createBlackPawn() {
		return createBlack(Type.PAWN);
	}

	public static Piece createWhiteRook() {
		return createWhite(Type.ROOK);
	}

	public static Piece createWhiteKnight() {
		return createWhite(Type.KNIGHT);
	}

	public static Piece createWhiteBishop() {
		return createWhite(Type.BISHOP);
	}

	public static Piece createWhiteQueen() {
		return createWhite(Type.QUEEN);
	}

	public static Piece createWhiteKing() {
		return createWhite(Type.KING);
	}

	public static Piece createBlackRook() {
		return createBlack(Type.ROOK);
	}

	public static Piece createBlackKnight() {
		return createBlack(Type.KNIGHT);
	}

	public static Piece createBlackBishop() {
		return createBlack(Type.BISHOP);
	}

	public static Piece createBlackQueen() {
		return createBlack(Type.QUEEN);
	}

	public static Piece createBlackKing() {
		return createBlack(Type.KING);
	}

	public boolean isBlack() {
		if (this.color.equals(Color.BLACK)) {
			return true;
		}
		return false;
	}

	public boolean isWhite() {
		if (this.color.equals(Color.WHITE)) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Piece other = (Piece) obj;
		if (color != other.color)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

}
