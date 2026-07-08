package com.ss.android.ugc.aweme.exp;

import X.C0C64;

/* JADX INFO: loaded from: classes3.dex */
public final class IMGroupChatViewHistoryMessagesExp {
    public static final int DEFAULT = 0;
    public static final IMGroupChatViewHistoryMessagesExp INSTANCE = new IMGroupChatViewHistoryMessagesExp();
    public static final int V1 = 1;

    public final boolean enable() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "im_enable_group_history_visibility", true) == V1;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }

    public final int getV1() {
        return V1;
    }
}
