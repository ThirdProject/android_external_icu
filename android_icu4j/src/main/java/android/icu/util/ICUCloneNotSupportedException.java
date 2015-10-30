/* GENERATED SOURCE. DO NOT MODIFY. */
/*
 *******************************************************************************
 * Copyright (C) 2014-2015, International Business Machines Corporation and
 * others. All Rights Reserved.
 *******************************************************************************
 */
package android.icu.util;

/**
 * Unchecked version of {@link CloneNotSupportedException}.
 * Some ICU APIs do not throw the standard exception but instead wrap it
 * into this unchecked version.
 *
 * @hide Only a subset of ICU is exposed in Android
 * @hide All android.icu classes are currently hidden
 */
public class ICUCloneNotSupportedException extends ICUException {
    private static final long serialVersionUID = -4824446458488194964L;

    /**
     * Default constructor.
     */
    public ICUCloneNotSupportedException() {
    }

    /**
     * Constructor.
     *
     * @param message exception message string
     */
    public ICUCloneNotSupportedException(String message) {
        super(message);
    }

    /**
     * Constructor.
     *
     * @param cause original exception (normally a {@link CloneNotSupportedException})
     */
    public ICUCloneNotSupportedException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructor.
     *
     * @param message exception message string
     * @param cause original exception (normally a {@link CloneNotSupportedException})
     */
    public ICUCloneNotSupportedException(String message, Throwable cause) {
        super(message, cause);
    }
}