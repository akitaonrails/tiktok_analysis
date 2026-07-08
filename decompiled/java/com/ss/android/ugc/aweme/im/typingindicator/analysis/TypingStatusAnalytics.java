package com.ss.android.ugc.aweme.im.typingindicator.analysis;

import X.C01GW;
import X.C1494805tC;
import X.C1504005ug;
import X.C23250099c;
import X.C452501pT;
import X.InterfaceC1493105sv;
import X.InterfaceC1502705uT;
import X.InterfaceC497601wk;
import com.ss.android.ugc.aweme.im.chatroom.api.typingindicator.ITypingStatusAnalytics;
import java.util.Map;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class TypingStatusAnalytics implements ITypingStatusAnalytics {
    public static final TypingStatusAnalytics INSTANCE = new TypingStatusAnalytics();
    public static final C01GW scope$delegate = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(558));

    public static final class Service implements ITypingStatusAnalytics {
        public final /* synthetic */ TypingStatusAnalytics LIZIZ = TypingStatusAnalytics.INSTANCE;

        @Override // com.ss.android.ugc.aweme.im.chatroom.api.typingindicator.ITypingStatusAnalytics
        public final int getTypingVisibleStatus(String str) {
            return this.LIZIZ.getTypingVisibleStatus(str);
        }

        @Override // com.ss.android.ugc.aweme.im.chatroom.api.typingindicator.ITypingStatusAnalytics
        public final void reportOnTypingIndicatorShown(int i, String str, String str2, int i2, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.reportOnTypingIndicatorShown(i, str, str2, i2, interfaceC1493105sv);
        }
    }

    private final InterfaceC497601wk getScope() {
        return (InterfaceC497601wk) scope$delegate.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.typingindicator.ITypingStatusAnalytics
    public int getTypingVisibleStatus(String str) {
        C1504005ug.LL.getClass();
        boolean z = false;
        boolean z2 = false;
        for (Map.Entry<String, InterfaceC1502705uT> entry : C1504005ug.LLILLJJLI.entrySet()) {
            String key = entry.getKey();
            if (entry.getValue().LIZJ().getValue().intValue() > 0) {
                if (Intrinsics.LJFF(key, str)) {
                    z = true;
                } else {
                    z2 = true;
                }
            }
        }
        if (z) {
            return 1;
        }
        if (!z2) {
            return 0;
        }
        return 2;
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.typingindicator.ITypingStatusAnalytics
    public void reportOnTypingIndicatorShown(int i, String str, String str2, int i2, InterfaceC1493105sv interfaceC1493105sv) {
        C23250099c.LIZLLL(getScope(), null, null, new C1494805tC(interfaceC1493105sv, i, str, i2, str2, null), 3);
    }
}
