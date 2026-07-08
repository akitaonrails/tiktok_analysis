package com.ss.android.ugc.aweme.inbox.search.protocol;

import X.C1242140iQe;
import X.C296890BkN;
import X.C844470XAv;
import X.EnumC1154650g9X;
import X.EnumC1241910iQH;
import X.EnumC1242040iQU;
import com.ss.android.ugc.aweme.inbox.experiment.InboxSearchNoticeOrder;
import com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerCell;
import com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerChunkProtocol;
import com.ss.android.ugc.aweme.inbox.search.view.cell.TemplateCellForSearch;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class InboxSearchMentionsChunkProtocol extends InboxSearchPowerChunkProtocol {
    public final String LLILZIL;
    public final long LLILZLL;
    public final EnumC1241910iQH LLIZ;
    public final EnumC1154650g9X LLIZLLLIL;
    public final List<Class<? extends InboxSearchPowerCell<?>>> LLJ;

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerChunkProtocol
    public final boolean LJ() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerChunkProtocol
    public final int LJII() {
        InboxSearchNoticeOrder inboxSearchNoticeOrder = (InboxSearchNoticeOrder) C1242140iQe.LIZIZ.getValue();
        if (inboxSearchNoticeOrder == null) {
            inboxSearchNoticeOrder = C1242140iQe.LIZ;
        }
        return inboxSearchNoticeOrder.getMentionsPriority();
    }

    public InboxSearchMentionsChunkProtocol() {
        C844470XAv.LIZ.getClass();
        String string = C844470XAv.LIZ().getString(2131836001);
        this.LLILZIL = string == null ? "" : string;
        this.LLILZLL = C296890BkN.LIZ();
        this.LLIZ = EnumC1241910iQH.MENTIONS;
        this.LLIZLLLIL = EnumC1154650g9X.NETWORK;
        this.LLJ = Collections.singletonList(TemplateCellForSearch.class);
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerChunkProtocol
    public final List<Class<? extends InboxSearchPowerCell<?>>> LIZ() {
        return this.LLJ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerChunkProtocol
    public final EnumC1154650g9X LIZJ() {
        return this.LLIZLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerChunkProtocol
    public final long LIZLLL() {
        return this.LLILZLL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerChunkProtocol
    public final EnumC1242040iQU LJFF() {
        return EnumC1242040iQU.NOTICE;
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerChunkProtocol
    public final String LJIIIIZZ() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerChunkProtocol
    public final EnumC1241910iQH LJIIIZ() {
        return this.LLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchPowerChunkProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(java.lang.String r13, X.InterfaceC1364105Vn<? super X.C1241920iQI> r14) {
        /*
            r12 = this;
            r4 = r13
            boolean r0 = r14 instanceof X.C1242100iQa
            if (r0 == 0) goto L5b
            r11 = r14
            X.0iQa r11 = (X.C1242100iQa) r11
            int r2 = r11.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5b
            int r2 = r2 - r1
            r11.LLILZ = r2
        L13:
            java.lang.Object r3 = r11.LLILLJJLI
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r11.LLILZ
            r2 = 1
            if (r0 == 0) goto L42
            if (r0 != r2) goto L75
            java.lang.Object r4 = r11.LL
            java.lang.String r4 = (java.lang.String) r4
            X.C155000ia.LIZIZ(r3)
        L27:
            X.0iQd r3 = (X.C1242130iQd) r3
            X.0iP6 r0 = r3.LIZLLL
            int[] r1 = X.C1241260iPE.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            if (r1 == r2) goto L6b
            r0 = 2
            if (r1 == r0) goto L61
            X.0iQI r2 = new X.0iQI
            X.0iP6 r1 = X.EnumC1241180iP6.ERROR
            java.util.List<X.0iO9> r0 = r3.LJFF
            r2.<init>(r4, r1, r0)
            return r2
        L42:
            X.C155000ia.LIZIZ(r3)
            r5 = 0
            java.lang.String r9 = "all"
            r11.LL = r4
            r11.LLILZ = r2
            X.0iQj r3 = X.C1242190iQj.LIZ
            r7 = 20
            r10 = 0
            r8 = 326(0x146, float:4.57E-43)
            r6 = r5
            java.lang.Object r3 = r3.LIZ(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r3 != r1) goto L27
            return r1
        L5b:
            X.0iQa r11 = new X.0iQa
            r11.<init>(r12, r14)
            goto L13
        L61:
            X.0iQI r2 = new X.0iQI
            X.0iP6 r1 = X.EnumC1241180iP6.NO_RESULT
            java.util.List<X.0iO9> r0 = r3.LJFF
            r2.<init>(r4, r1, r0)
            return r2
        L6b:
            X.0iQI r2 = new X.0iQI
            X.0iP6 r1 = X.EnumC1241180iP6.SUCCESS
            java.util.List<X.0iO9> r0 = r3.LJFF
            r2.<init>(r4, r1, r0)
            return r2
        L75:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.search.protocol.InboxSearchMentionsChunkProtocol.LJI(java.lang.String, X.05Vn):java.lang.Object");
    }
}
