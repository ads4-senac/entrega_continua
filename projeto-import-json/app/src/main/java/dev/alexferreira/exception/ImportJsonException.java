package dev.alexferreira.exception;

public class ImportJsonException extends Exception {

	public ImportJsonException() {
	}

	public ImportJsonException(String message) {
		super(message);
	}

	public ImportJsonException(String message, Throwable cause) {
		super(message, cause);
	}

	public ImportJsonException(Throwable cause) {
		super(cause);
	}

	public ImportJsonException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
