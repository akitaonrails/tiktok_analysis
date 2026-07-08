package com.ss.android.ugc.aweme.im.protocal;

import X.C0I0B;
import X.C1231704rr;
import X.C1240310iNh;
import X.C894660Z7w;
import X.EnumC1241910iQH;
import X.EnumC1242040iQU;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.ui.cell.IMNewSearchCommonCell;
import com.ss.android.ugc.aweme.inbox.search.InboxSearchTabProtocol;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class IMMessageProtocol extends InboxSearchTabProtocol {
    public final C1231704rr LLILZIL = new C1231704rr("protocol_accounts", null, 6);
    public final C1240310iNh LLILZLL = new C1240310iNh(false);

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchTabProtocol
    public final List<Class<? extends PowerCell<?>>> LIZ() {
        return Collections.singletonList(IMNewSearchCommonCell.class);
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchTabProtocol
    public final String LJIIIIZZ() {
        C0I0B.LJFF.LIZJ();
        return C894660Z7w.LIZ().getString(2131836002);
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchTabProtocol
    public final EnumC1242040iQU LJFF() {
        return EnumC1242040iQU.MESSAGE;
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchTabProtocol
    public final EnumC1241910iQH LJIIIZ() {
        return EnumC1241910iQH.MESSAGE;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchTabProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(int r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, X.InterfaceC1364105Vn r17) {
        /*
            r12 = this;
            r3 = r17
            r6 = r14
            r7 = r15
            boolean r0 = r3 instanceof X.C1242020iQS
            if (r0 == 0) goto L6e
            r5 = r3
            X.0iQS r5 = (X.C1242020iQS) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6e
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L16:
            java.lang.Object r4 = r5.LLILLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZIL
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L57
            if (r0 != r1) goto L74
            java.lang.Object r7 = r5.LLILLJJLI
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r5.LL
            java.lang.String r6 = (java.lang.String) r6
            X.C155000ia.LIZIZ(r4)
        L2f:
            X.0iOS r4 = (X.C1240780iOS) r4
            if (r4 == 0) goto L54
            java.util.List<RESULT> r0 = r4.LIZ
            if (r0 == 0) goto L54
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L54
            X.0iP6 r9 = X.EnumC1241180iP6.SUCCESS
        L3f:
            X.04rr r0 = r12.LLILZIL
            r0.getClass()
            X.0iQC r5 = new X.0iQC
            r8 = 0
            r10 = 0
            if (r4 == 0) goto L4e
            java.util.List<RESULT> r11 = r4.LIZ
            if (r11 != 0) goto L50
        L4e:
            X.13BV r11 = X.C13BV.INSTANCE
        L50:
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        L54:
            X.0iP6 r9 = X.EnumC1241180iP6.NO_RESULT
            goto L3f
        L57:
            X.C155000ia.LIZIZ(r4)
            X.04rr r0 = r12.LLILZIL
            r0.getClass()
            X.0iNh r0 = r12.LLILZLL
            r5.LL = r6
            r5.LLILLJJLI = r7
            r5.LLILZIL = r1
            java.lang.Object r4 = r0.LIZJ(r6, r7, r2, r5)
            if (r4 != r3) goto L2f
            return r3
        L6e:
            X.0iQS r5 = new X.0iQS
            r5.<init>(r12, r3)
            goto L16
        L74:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.protocal.IMMessageProtocol.LJI(int, java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
