package com.ss.android.ugc.aweme.im.quickchat.mob;

import X.C0PEM;
import X.C0S2R;
import X.C0S2U;
import X.C0ZH1;
import X.C2172621A1c;
import X.C2172631A1d;
import X.C2296808zG;
import X.C23250099c;
import X.EnumC2172611A1b;
import X.EnumC714710S1t;
import X.EnumC913010Zrn;
import X.InterfaceC1493105sv;

/* JADX INFO: loaded from: classes34.dex */
public final class UnifyQuickReplyAnalytics implements IUnifyQuickReplyAnalytics {
    public static final UnifyQuickReplyAnalytics LIZIZ = new UnifyQuickReplyAnalytics();

    public static final class Service implements IUnifyQuickReplyAnalytics {
        public final /* synthetic */ UnifyQuickReplyAnalytics LIZIZ = UnifyQuickReplyAnalytics.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.quickchat.mob.IUnifyQuickReplyAnalytics
        public final void LIZ(EnumC2172611A1b enumC2172611A1b, C0S2U c0s2u, EnumC913010Zrn enumC913010Zrn, String str, C0ZH1 c0zh1, C0S2R c0s2r, String str2, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LIZ(enumC2172611A1b, c0s2u, enumC913010Zrn, str, c0zh1, c0s2r, str2, interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.quickchat.mob.IUnifyQuickReplyAnalytics
        public final void LIZIZ(EnumC2172611A1b enumC2172611A1b, C0S2U c0s2u, EnumC913010Zrn enumC913010Zrn, String str, C0ZH1 c0zh1, C0S2R c0s2r, EnumC714710S1t enumC714710S1t, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LIZIZ(enumC2172611A1b, c0s2u, enumC913010Zrn, str, c0zh1, c0s2r, enumC714710S1t, interfaceC1493105sv);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.quickchat.mob.IUnifyQuickReplyAnalytics
    public final void LIZ(EnumC2172611A1b enumC2172611A1b, C0S2U c0s2u, EnumC913010Zrn enumC913010Zrn, String str, C0ZH1 c0zh1, C0S2R c0s2r, String str2, InterfaceC1493105sv interfaceC1493105sv) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C2172631A1d(interfaceC1493105sv, enumC2172611A1b, c0s2u, enumC913010Zrn, str, c0zh1, c0s2r, str2, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.quickchat.mob.IUnifyQuickReplyAnalytics
    public final void LIZIZ(EnumC2172611A1b enumC2172611A1b, C0S2U c0s2u, EnumC913010Zrn enumC913010Zrn, String str, C0ZH1 c0zh1, C0S2R c0s2r, EnumC714710S1t enumC714710S1t, InterfaceC1493105sv interfaceC1493105sv) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C2172621A1c(interfaceC1493105sv, enumC2172611A1b, c0s2u, enumC913010Zrn, str, c0zh1, c0s2r, enumC714710S1t, null), 3);
    }
}
