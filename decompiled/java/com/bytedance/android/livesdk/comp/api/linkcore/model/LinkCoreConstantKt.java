package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.EnumC969200bKQ;

/* JADX INFO: loaded from: classes16.dex */
public final class LinkCoreConstantKt {
    public static final boolean isClose(EnumC969200bKQ enumC969200bKQ) {
        if (enumC969200bKQ == EnumC969200bKQ.Close) {
            return true;
        }
        return false;
    }

    public static final boolean isConnecting(EnumC969200bKQ enumC969200bKQ) {
        if (enumC969200bKQ == EnumC969200bKQ.Connecting) {
            return true;
        }
        return false;
    }

    public static final boolean isIdle(EnumC969200bKQ enumC969200bKQ) {
        if (enumC969200bKQ == EnumC969200bKQ.Idle) {
            return true;
        }
        return false;
    }

    public static final boolean isLinked(EnumC969200bKQ enumC969200bKQ) {
        if (enumC969200bKQ == EnumC969200bKQ.Linked) {
            return true;
        }
        return false;
    }

    public static final boolean isWait(EnumC969200bKQ enumC969200bKQ) {
        if (enumC969200bKQ == EnumC969200bKQ.Wait) {
            return true;
        }
        return false;
    }
}
