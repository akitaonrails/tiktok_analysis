package com.ss.android.ugc.aweme.feed.suggestfollowing;

import X.C01GW;
import X.C0PEM;
import X.C1ECA;
import X.C2188811AlT;
import X.C23250099c;
import X.C2445509i9;
import X.C2445909iD;
import X.C2446009iE;
import X.C2446309iH;
import X.C2446709iL;
import X.C291001Au;
import X.C452501pT;
import X.EnumC452301pR;
import X.InterfaceC0148002o;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import kotlin.jvm.internal.AwS547S0100000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class ProfileFollowingSuggestViewModel extends AbsFollowingSuggestViewModel<C2446009iE> {
    public Boolean LLILLJJLI;
    public boolean LLILLL;
    public AwS547S0100000_3 LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS547S0100000_3(this, 25));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2446009iE(new C291001Au(new C2446709iL(false)));
    }

    public final C2446309iH xQ2() {
        return (C2446309iH) this.LLILZIL.getValue();
    }

    public final void wQ2(Aweme aweme, String str) {
        C1ECA.LIZ.getClass();
        if (!C1ECA.LIZJ()) {
            return;
        }
        vQ2().LIZ(C2445509i9.LIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("try show button, from ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        xQ2().LLIZ.removeMessages(101);
        AwemeExtKt.getAuthorUid(aweme);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C2445909iD(this, aweme, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object yQ2(com.ss.android.ugc.aweme.feed.model.Aweme r7, java.lang.String r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C2446409iI
            if (r0 == 0) goto L50
            r5 = r9
            X.09iI r5 = (X.C2446409iI) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r3 = 1
            if (r0 == 0) goto L38
            if (r0 != r3) goto L56
            java.lang.Object r8 = r5.LL
            java.lang.String r8 = (java.lang.String) r8
            X.C155000ia.LIZIZ(r1)
        L26:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "not show button, "
            r1.append(r0)
            r1.append(r8)
            X.C2188811AlT.LIZIZ(r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L38:
            X.C155000ia.LIZIZ(r1)
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.09iG r1 = new X.09iG
            r0 = 0
            r1.<init>(r6, r7, r0)
            r5.LL = r8
            r5.LLILZ = r3
            java.lang.Object r0 = X.C23250099c.LJI(r5, r2, r1)
            if (r0 != r4) goto L26
            return r4
        L50:
            X.09iI r5 = new X.09iI
            r5.<init>(r6, r9)
            goto L12
        L56:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.suggestfollowing.ProfileFollowingSuggestViewModel.yQ2(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, X.05Vn):java.lang.Object");
    }
}
