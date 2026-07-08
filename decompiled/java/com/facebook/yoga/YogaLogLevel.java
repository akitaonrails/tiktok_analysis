package com.facebook.yoga;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes14.dex */
public enum YogaLogLevel {
    ERROR(0),
    WARN(1),
    INFO(2),
    DEBUG(3),
    VERBOSE(4),
    FATAL(5);

    public final int mIntValue;

    public int intValue() {
        return this.mIntValue;
    }

    public static YogaLogLevel fromInt(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return FATAL;
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Unknown enum value: ");
                            sbLIZ.append(i);
                            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                        }
                        return VERBOSE;
                    }
                    return DEBUG;
                }
                return INFO;
            }
            return WARN;
        }
        return ERROR;
    }

    YogaLogLevel(int i) {
        this.mIntValue = i;
    }
}
