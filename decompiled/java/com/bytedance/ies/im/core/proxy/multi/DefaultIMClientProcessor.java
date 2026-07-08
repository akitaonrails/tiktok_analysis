package com.bytedance.ies.im.core.proxy.multi;

import X.C01GW;
import X.C0YH4;
import X.C0YJ6;
import X.C0YM2;
import X.C452501pT;
import X.C871050YFb;
import X.C882400YjW;
import com.bytedance.ies.im.core.api.client.IMClientProcessor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class DefaultIMClientProcessor implements IMClientProcessor {
    public static final DefaultIMClientProcessor LIZ = new DefaultIMClientProcessor();
    public static final C0YM2 LIZIZ = C0YM2.TIKTOK_SOCIAL_IM;
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(33));

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Service implements IMClientProcessor {
        public Service() {
            DefaultIMClientProcessor defaultIMClientProcessor = DefaultIMClientProcessor.LIZ;
        }
    }

    static {
        C0YJ6.LIZ();
    }

    public static C0YH4 LIZ() {
        return (C0YH4) LIZJ.getValue();
    }

    public final void LIZJ() {
        LIZ().logout();
        C882400YjW c882400YjW = C882400YjW.LIZ;
        C0YM2 c0ym2 = LIZIZ;
        c882400YjW.getClass();
        C882400YjW.LIZIZ(c0ym2).LIZ();
    }

    public final void LIZIZ(Function0<Unit> function0) {
        C0YH4 c0yh4LIZ = LIZ();
        C0YM2 c0ym2 = LIZIZ;
        c0yh4LIZ.LJI(C871050YFb.LIZ(c0ym2));
        LIZ().LIZIZ.LJIIJJI().LLLFF();
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZIZ(c0ym2).LJIJI();
        function0.invoke();
    }
}
