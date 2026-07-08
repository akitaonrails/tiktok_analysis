package ttpobfuscated;

import X.C08FF;

/* JADX INFO: loaded from: classes24.dex */
public enum i0 {
    UnsupportedHashLength,
    MalformedResource,
    MalformedExtension,
    InvalidServerDate,
    ChallengeDataCannotBeNull,
    UnknownError;

    public static i0 valueOf(String str) {
        return (i0) C08FF.LIZ(i0.class, str);
    }
}
