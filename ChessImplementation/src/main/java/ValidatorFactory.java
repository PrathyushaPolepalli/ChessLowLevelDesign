import java.util.HashMap;

public class ValidatorFactory {
	static ValidatorFactory v = null;
	static public HashMap<Character, PieceValidator> ValidatorMap = new HashMap<Character, PieceValidator>();

	private ValidatorFactory() {
		ValidatorMap.put('P', new PawnValidator());
		ValidatorMap.put('N', new KnightValidator());
		ValidatorMap.put('R', new RookValidator());
		ValidatorMap.put('B', new BishopValidator());
		ValidatorMap.put('Q', new QueenValidator());
		ValidatorMap.put('K', new KingValidator());
	}

	static public ValidatorFactory getInstance() {
		if (v == null)
			v = new ValidatorFactory();
		return v;
	}

	static public PieceValidator getValidator(Character c) {
		return ValidatorMap.get(c);
	}

}
