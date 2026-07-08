package com.ss.android.ugc.aweme.im.chatroom.api.typingindicator;

import X.C1519105x7;
import X.InterfaceC1493105sv;

/* JADX INFO: loaded from: classes3.dex */
public interface ITypingStatusAnalytics {
    public static final C1519105x7 LIZ = C1519105x7.LIZ;

    int getTypingVisibleStatus(String str);

    void reportOnTypingIndicatorShown(int i, String str, String str2, int i2, InterfaceC1493105sv interfaceC1493105sv);
}
