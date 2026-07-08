package com.ss.android.ugc.aweme.im.protocal;

import X.C0I0B;
import X.C1240310iNh;
import X.C894660Z7w;
import X.EnumC1241910iQH;
import X.EnumC1242040iQU;
import com.ss.android.ugc.aweme.im.ui.cell.IMNewSearchCommonCell;
import com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerCell;
import com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerChunkProtocol;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class IMMessageChunkProtocol extends InboxSearchPowerChunkProtocol {
    public final C1240310iNh LLILZIL = new C1240310iNh(true);

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerChunkProtocol
    public final List<Class<? extends InboxSearchPowerCell<?>>> LIZ() {
        return Collections.singletonList(IMNewSearchCommonCell.class);
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerChunkProtocol
    public final String LJIIIIZZ() {
        C0I0B.LJFF.LIZJ();
        return C894660Z7w.LIZ().getString(2131836002);
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerChunkProtocol
    public final EnumC1242040iQU LJFF() {
        return EnumC1242040iQU.MESSAGE;
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerChunkProtocol
    public final EnumC1241910iQH LJIIIZ() {
        return EnumC1241910iQH.MESSAGE;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerChunkProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(java.lang.String r6, X.InterfaceC1364105Vn<? super X.C1241920iQI> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1242010iQR
            if (r0 == 0) goto L52
            r4 = r7
            X.0iQR r4 = (X.C1242010iQR) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L52
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILZ
            r0 = 1
            if (r1 == 0) goto L41
            if (r1 != r0) goto L58
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
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L3e
            X.0iP6 r1 = X.EnumC1241180iP6.NO_RESULT
        L38:
            X.0iQI r0 = new X.0iQI
            r0.<init>(r6, r1, r2)
            return r0
        L3e:
            X.0iP6 r1 = X.EnumC1241180iP6.SUCCESS
            goto L38
        L41:
            X.C155000ia.LIZIZ(r3)
            X.0iNh r1 = r5.LLILZIL
            r4.LL = r6
            r4.LLILZ = r0
            r0 = 0
            java.lang.Object r3 = r1.LIZJ(r6, r0, r0, r4)
            if (r3 != r2) goto L26
            return r2
        L52:
            X.0iQR r4 = new X.0iQR
            r4.<init>(r5, r7)
            goto L12
        L58:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.protocal.IMMessageChunkProtocol.LJI(java.lang.String, X.05Vn):java.lang.Object");
    }
}
