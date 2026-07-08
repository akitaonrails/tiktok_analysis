package com.ss.android.ugc.aweme.im.protocal;

import X.C01GW;
import X.C0I0B;
import X.C1231704rr;
import X.C1240470iNx;
import X.C1241920iQI;
import X.C1241940iQK;
import X.C2296808zG;
import X.C452501pT;
import X.C894660Z7w;
import X.EnumC1154650g9X;
import X.EnumC1241910iQH;
import X.EnumC1242040iQU;
import X.InterfaceC1242030iQT;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.exp.InboxMixSearchOptimizationExp;
import com.ss.android.ugc.aweme.im.ui.cell.IMNewSearchCommonCell;
import com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerCell;
import com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerChunkProtocol;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class IMAccountsChunkProtocol extends InboxSearchPowerChunkProtocol {
    public final C1231704rr LLILZIL = new C1231704rr("protocol_accounts_chunk", null, 6);
    public final C1240470iNx LLILZLL = new C1240470iNx(true);
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(249));

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerChunkProtocol
    public final List<Class<? extends InboxSearchPowerCell<?>>> LIZ() {
        return Collections.singletonList(IMNewSearchCommonCell.class);
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerChunkProtocol
    public final EnumC1154650g9X LIZJ() {
        return ((InboxMixSearchOptimizationExp.Config) InboxMixSearchOptimizationExp.LIZIZ.getValue()).enableRemoteSearch ? EnumC1154650g9X.NETWORK : this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerChunkProtocol
    public final String LJIIIIZZ() {
        C0I0B.LJFF.LIZJ();
        return C894660Z7w.LIZ().getString(2131835996);
    }

    public final InterfaceC1242030iQT LJIIJ() {
        return (InterfaceC1242030iQT) this.LLIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerChunkProtocol
    public final EnumC1242040iQU LJFF() {
        return EnumC1242040iQU.CONTACT;
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerChunkProtocol
    public final EnumC1241910iQH LJIIIZ() {
        return EnumC1241910iQH.CONTACT;
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerChunkProtocol
    public final Object LJI(String str, InterfaceC1364105Vn<? super C1241920iQI> interfaceC1364105Vn) {
        C01GW c01gw = InboxMixSearchOptimizationExp.LIZIZ;
        if (!((InboxMixSearchOptimizationExp.Config) c01gw.getValue()).enableNewRanking && !((InboxMixSearchOptimizationExp.Config) c01gw.getValue()).enableRemoteSearch) {
            return LJIIJJI(str, interfaceC1364105Vn);
        }
        return C2296808zG.LJ(new C1241940iQK(this, str, System.currentTimeMillis(), null), interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(java.lang.String r6, X.InterfaceC1364105Vn<? super X.C1241920iQI> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1242000iQQ
            if (r0 == 0) goto L56
            r4 = r7
            X.0iQQ r4 = (X.C1242000iQQ) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L56
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r1 = 1
            if (r0 == 0) goto L46
            if (r0 != r1) goto L5c
            java.lang.Object r6 = r4.LL
            java.lang.String r6 = (java.lang.String) r6
            X.C155000ia.LIZIZ(r3)
        L26:
            X.0iOS r3 = (X.C1240780iOS) r3
            if (r3 == 0) goto L2e
            java.util.List<RESULT> r2 = r3.LIZ
            if (r2 != 0) goto L30
        L2e:
            X.13BV r2 = X.C13BV.INSTANCE
        L30:
            X.0iOC r0 = X.EnumC1240620iOC.ALL
            X.C1240250iNb.LIZ(r2, r6, r0)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L43
            X.0iP6 r1 = X.EnumC1241180iP6.NO_RESULT
        L3d:
            X.0iQI r0 = new X.0iQI
            r0.<init>(r6, r1, r2)
            return r0
        L43:
            X.0iP6 r1 = X.EnumC1241180iP6.SUCCESS
            goto L3d
        L46:
            X.C155000ia.LIZIZ(r3)
            X.0iNx r0 = r5.LLILZLL
            r4.LL = r6
            r4.LLILZ = r1
            java.lang.Object r3 = r0.LIZJ(r6, r4)
            if (r3 != r2) goto L26
            return r2
        L56:
            X.0iQQ r4 = new X.0iQQ
            r4.<init>(r5, r7)
            goto L12
        L5c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.protocal.IMAccountsChunkProtocol.LJIIJJI(java.lang.String, X.05Vn):java.lang.Object");
    }
}
