package com.ss.android.ugc.aweme.im.protocal;

import X.C01GW;
import X.C0I0B;
import X.C1231704rr;
import X.C1240470iNx;
import X.C1241930iQJ;
import X.C2296808zG;
import X.C452501pT;
import X.C894660Z7w;
import X.EnumC1241910iQH;
import X.EnumC1242040iQU;
import X.InterfaceC1242030iQT;
import X.InterfaceC1364105Vn;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.exp.InboxMixSearchOptimizationExp;
import com.ss.android.ugc.aweme.im.ui.cell.IMNewSearchCommonCell;
import com.ss.android.ugc.aweme.inbox.search.InboxSearchTabProtocol;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class IMAccountsProtocol extends InboxSearchTabProtocol {
    public final C1231704rr LLILZIL = new C1231704rr("protocol_accounts", null, 6);
    public final C1240470iNx LLILZLL = new C1240470iNx(false);
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(250));

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchTabProtocol
    public final List<Class<? extends PowerCell<?>>> LIZ() {
        return Collections.singletonList(IMNewSearchCommonCell.class);
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchTabProtocol
    public final String LJIIIIZZ() {
        C0I0B.LJFF.LIZJ();
        return C894660Z7w.LIZ().getString(2131835996);
    }

    public final InterfaceC1242030iQT LJIILIIL() {
        return (InterfaceC1242030iQT) this.LLIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchTabProtocol
    public final EnumC1242040iQU LJFF() {
        return EnumC1242040iQU.CONTACT;
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchTabProtocol
    public final EnumC1241910iQH LJIIIZ() {
        return EnumC1241910iQH.CONTACT;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(java.lang.String r15, java.lang.String r16, X.InterfaceC1364105Vn<? super X.C1241860iQC> r17) {
        /*
            r14 = this;
            r3 = r17
            r8 = r15
            r9 = r16
            boolean r0 = r3 instanceof X.C1241990iQP
            if (r0 == 0) goto L84
            r5 = r3
            X.0iQP r5 = (X.C1241990iQP) r5
            int r2 = r5.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L84
            int r2 = r2 - r1
            r5.LLILZLL = r2
        L17:
            java.lang.Object r7 = r5.LLILZ
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZLL
            r3 = 1
            if (r0 == 0) goto L6c
            if (r0 != r3) goto L8a
            long r1 = r5.LLILLL
            java.lang.Object r9 = r5.LLILLJJLI
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r5.LL
            java.lang.String r8 = (java.lang.String) r8
            X.C155000ia.LIZIZ(r7)
        L31:
            X.0iOS r7 = (X.C1240780iOS) r7
            X.04rr r6 = r14.LLILZIL
            java.lang.StringBuilder r5 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getResultList time cost "
            r5.append(r0)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r1
            r5.append(r3)
            X.C2188811AlT.LIZIZ(r5)
            r6.getClass()
            if (r7 == 0) goto L52
            java.util.List<RESULT> r13 = r7.LIZ
            if (r13 != 0) goto L54
        L52:
            X.13BV r13 = X.C13BV.INSTANCE
        L54:
            X.0iOC r0 = X.EnumC1240620iOC.ACCOUNT
            X.C1240250iNb.LIZ(r13, r8, r0)
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L69
            X.0iP6 r11 = X.EnumC1241180iP6.NO_RESULT
        L61:
            X.0iQC r7 = new X.0iQC
            r10 = 0
            r12 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return r7
        L69:
            X.0iP6 r11 = X.EnumC1241180iP6.SUCCESS
            goto L61
        L6c:
            X.C155000ia.LIZIZ(r7)
            long r1 = java.lang.System.currentTimeMillis()
            X.0iNx r0 = r14.LLILZLL
            r5.LL = r8
            r5.LLILLJJLI = r9
            r5.LLILLL = r1
            r5.LLILZLL = r3
            java.lang.Object r7 = r0.LIZJ(r8, r5)
            if (r7 != r4) goto L31
            return r4
        L84:
            X.0iQP r5 = new X.0iQP
            r5.<init>(r14, r3)
            goto L17
        L8a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.protocal.IMAccountsProtocol.LJIILJJIL(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchTabProtocol
    public final Object LJI(int i, String str, String str2, String str3, InterfaceC1364105Vn interfaceC1364105Vn) {
        C01GW c01gw = InboxMixSearchOptimizationExp.LIZIZ;
        if (!((InboxMixSearchOptimizationExp.Config) c01gw.getValue()).enableNewRanking && !((InboxMixSearchOptimizationExp.Config) c01gw.getValue()).enableRemoteSearch) {
            return LJIILJJIL(str, str2, interfaceC1364105Vn);
        }
        return C2296808zG.LJ(new C1241930iQJ(this, str, str2, System.currentTimeMillis(), null), interfaceC1364105Vn);
    }
}
