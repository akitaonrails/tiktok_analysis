package com.ss.android.ugc.aweme.internalshare.impl.external;

import X.C01GW;
import X.C1210860hcC;
import X.C1226350i1B;
import X.C1250340ids;
import X.C1264130j07;
import X.C1366480lfC;
import X.C1369580lkC;
import X.C1371590lnR;
import X.C1388190mED;
import X.C1559260qg8;
import X.C19252910Tv;
import X.C19EG;
import X.C418440Gaw;
import X.C452501pT;
import X.C487280J9a;
import X.C723590SZx;
import X.C724240Sb0;
import X.C814420VxA;
import X.InterfaceC1362720lZ8;
import X.InterfaceC1366490lfD;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ThirdPartyAssem extends UIContentAssem {
    public C1369580lkC LLJ;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, C1226350i1B.class, null), checkSupervisorPrepared());
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(258));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1567));

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Go(true);
    }

    public final void Go(boolean z) {
        C19EG c19egLIZIZ;
        if (C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() != 1) {
            return;
        }
        if (z) {
            C487280J9a.LIZJ((C1250340ids) this.LLJIJIL.getValue());
            return;
        }
        Context context = getContext();
        if (context == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null) {
            return;
        }
        C487280J9a.LIZ(c19egLIZIZ.hashCode(), (C1250340ids) this.LLJIJIL.getValue());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String string;
        BaseSharePackage baseSharePackage;
        Bundle bundle;
        super.onViewCreated(view);
        this.LLJ = (C1369580lkC) view.findViewById(R.id.uyu);
        IIMChatDetailAnalytics iIMChatDetailAnalytics = (IIMChatDetailAnalytics) PluggableExtentionKt.pluggableSpi$default(IIMChatDetailAnalytics.class, false, false, false, 14, null);
        if (iIMChatDetailAnalytics != null) {
            C1371590lnR c1371590lnR = ((C1226350i1B) this.LLIZLLLIL.getValue()).LLILLL;
            if (c1371590lnR == null || (baseSharePackage = c1371590lnR.LJIJJ) == null || (bundle = baseSharePackage.extras) == null || (string = bundle.getString("enter_from")) == null) {
                string = "share";
            }
            iIMChatDetailAnalytics.LIZIZ(string);
            iIMChatDetailAnalytics.LJIIIIZZ();
        }
        C1371590lnR c1371590lnR2 = ((C1226350i1B) this.LLIZLLLIL.getValue()).LLILLL;
        if (c1371590lnR2 != null) {
            c1371590lnR2.LJJIJL = 50;
            C1210860hcC c1210860hcC = new C1210860hcC();
            c1210860hcC.LIZ = new Pair<>(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))));
            c1210860hcC.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(82));
            c1210860hcC.LIZJ = 0;
            c1371590lnR2.LJJLIIIJJI = c1210860hcC;
            View viewLJJIJL = LJJIJL();
            C1264130j07 c1264130j07 = c1371590lnR2.LJJL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1371590lnR.LJJZZI;
            c1264130j07.getClass();
            c1264130j07.LIZ = new WeakReference<>(viewLJJIJL);
            c1371590lnR2.LJJIFFI = new InterfaceC1366490lfD() { // from class: X.0lMn
                @Override // X.InterfaceC1366490lfD
                public final void LIZIZ(Context context, BaseSharePackage baseSharePackage2, InterfaceC1370310llN interfaceC1370310llN) {
                }

                @Override // X.InterfaceC1366490lfD
                public final void LIZJ(View view2, C1371590lnR c1371590lnR3, C1370190llB c1370190llB) {
                }

                @Override // X.InterfaceC1366490lfD
                public final void LIZLLL(Context context, BaseSharePackage baseSharePackage2) {
                }

                @Override // X.InterfaceC1366490lfD
                public final void LJ(Context context, BaseSharePackage baseSharePackage2) {
                }

                @Override // X.InterfaceC1366490lfD
                public final void LJFF(Context context, BaseSharePackage baseSharePackage2, List list) {
                }

                @Override // X.InterfaceC1366490lfD
                public final void LJI(Context context, BaseSharePackage baseSharePackage2) {
                }

                /* JADX WARN: Removed duplicated region for block: B:28:0x0061 A[PHI: r8
                  0x0061: PHI (r8v3 java.lang.String) = (r8v0 java.lang.String), (r8v4 java.lang.String) binds: [B:27:0x005f, B:25:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:32:0x006d A[PHI: r8
                  0x006d: PHI (r8v1 java.lang.String) = (r8v0 java.lang.String), (r8v3 java.lang.String), (r8v3 java.lang.String) binds: [B:27:0x005f, B:29:0x0063, B:31:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // X.InterfaceC1361850lXj
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(X.InterfaceC1369790lkX r13, boolean r14, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r15, android.content.Context r16) {
                    /*
                        Method dump skipped, instruction units count: 408
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1355070lMn.LIZ(X.0lkX, boolean, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage, android.content.Context):void");
                }

                @Override // X.InterfaceC1361850lXj
                public final Object LJII(Context context, BaseSharePackage baseSharePackage2, InterfaceC1369790lkX interfaceC1369790lkX, InterfaceC1364105Vn interfaceC1364105Vn) {
                    Unit unit = Unit.LIZ;
                    C099R.LJFF();
                    return unit;
                }
            };
            C1369580lkC c1369580lkC = this.LLJ;
            if (c1369580lkC != null) {
                c1369580lkC.LLJJIII = c1371590lnR2;
                c1369580lkC.LLJJIJIIJIL = true;
                c1369580lkC.LIZ();
                C19EG c19egLIZ = C724240Sb0.LIZ(this);
                if (c19egLIZ != null) {
                    C1366480lfC.LIZIZ(c1371590lnR2, c1369580lkC, "second_panel", c19egLIZ, new InterfaceC1362720lZ8() { // from class: X.0idt
                        @Override // X.InterfaceC1362720lZ8
                        public final void Ds(Function0<Unit> function0) {
                        }

                        @Override // X.InterfaceC1362720lZ8
                        public final void F8(AbstractC343940De4 abstractC343940De4) {
                        }

                        @Override // X.InterfaceC1362720lZ8
                        public final void s1(int i) {
                        }
                    });
                }
            }
        }
        Go(false);
    }
}
