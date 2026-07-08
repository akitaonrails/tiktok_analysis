package com.ss.android.ugc.aweme.inbox.search.protocol;

import X.C1242140iQe;
import X.C1697810uHb;
import X.C296890BkN;
import X.C844470XAv;
import X.EnumC1241910iQH;
import X.EnumC1242040iQU;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.inbox.experiment.InboxSearchNoticeOrder;
import com.ss.android.ugc.aweme.inbox.search.InboxSearchTabProtocol;
import com.ss.android.ugc.aweme.inbox.search.view.cell.InboxSearchNoticeFooterCell;
import com.ss.android.ugc.aweme.inbox.search.view.cell.TemplateCellForSearch;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class InboxSearchMentionsTabProtocol extends InboxSearchTabProtocol {
    public final String LLILZIL;
    public final long LLILZLL;
    public final boolean LLIZ;
    public final EnumC1241910iQH LLIZLLLIL;
    public final List<Class<? extends PowerCell<?>>> LLJ;

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchTabProtocol
    public final boolean LIZLLL() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchTabProtocol
    public final boolean LJIIJ() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchTabProtocol
    public final void LJIIJJI() {
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchTabProtocol
    public final void LJIIL() {
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchTabProtocol
    public final int LJII() {
        InboxSearchNoticeOrder inboxSearchNoticeOrder = (InboxSearchNoticeOrder) C1242140iQe.LIZIZ.getValue();
        if (inboxSearchNoticeOrder == null) {
            inboxSearchNoticeOrder = C1242140iQe.LIZ;
        }
        return inboxSearchNoticeOrder.getMentionsPriority();
    }

    public InboxSearchMentionsTabProtocol() {
        C844470XAv.LIZ.getClass();
        this.LLILZIL = C844470XAv.LIZ().getString(2131836001);
        this.LLILZLL = C296890BkN.LIZ();
        this.LLIZ = true;
        this.LLIZLLLIL = EnumC1241910iQH.MENTIONS;
        this.LLJ = C1697810uHb.LJIIJJI(TemplateCellForSearch.class, InboxSearchNoticeFooterCell.class);
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchTabProtocol
    public final List<Class<? extends PowerCell<?>>> LIZ() {
        return this.LLJ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchTabProtocol
    public final long LIZJ() {
        return this.LLILZLL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchTabProtocol
    public final boolean LJ() {
        return this.LLIZ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchTabProtocol
    public final EnumC1242040iQU LJFF() {
        return EnumC1242040iQU.NOTICE;
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchTabProtocol
    public final String LJIIIIZZ() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchTabProtocol
    public final EnumC1241910iQH LJIIIZ() {
        return this.LLIZLLLIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    @Override // com.ss.android.ugc.aweme.inbox.search.InboxSearchTabProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(int r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, X.InterfaceC1364105Vn r20) {
        /*
            r15 = this;
            r3 = r20
            boolean r0 = r3 instanceof X.C1242120iQc
            if (r0 == 0) goto L8b
            r14 = r3
            X.0iQc r14 = (X.C1242120iQc) r14
            int r2 = r14.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8b
            int r2 = r2 - r1
            r14.LLILLL = r2
        L14:
            java.lang.Object r4 = r14.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r14.LLILLL
            r5 = 1
            if (r0 == 0) goto L6f
            if (r0 != r5) goto L91
            X.C155000ia.LIZIZ(r4)
        L24:
            X.0iQd r4 = (X.C1242130iQd) r4
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.List<X.0iO9> r0 = r4.LJFF
            r11.addAll(r0)
            boolean r0 = r4.LIZJ
            if (r0 != 0) goto L5f
            X.01BO r6 = new X.01BO
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r1 = X.C844470XAv.LIZ()
            r0 = 2131835995(0x7f113c5b, float:1.9305144E38)
            java.lang.String r3 = r1.getString(r0)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r0 = 30
            java.lang.Integer r1 = X.C2286608xc.LJ(r0)
            r0 = 0
            r2[r0] = r1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r5)
            java.lang.String r0 = X.C786410Ut5.j4(r3, r0)
            r6.<init>(r0)
            r11.add(r6)
        L5f:
            X.0iQC r5 = new X.0iQC
            java.lang.String r6 = r4.LIZ
            java.lang.String r7 = r4.LIZIZ
            boolean r8 = r4.LIZJ
            X.0iP6 r9 = r4.LIZLLL
            java.lang.String r10 = r4.LJ
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        L6f:
            X.C155000ia.LIZIZ(r4)
            java.lang.String r12 = "mention"
            r14.LLILLL = r5
            X.0iQj r6 = X.C1242190iQj.LIZ
            r10 = 20
            r11 = 326(0x146, float:4.57E-43)
            r9 = r19
            r8 = r18
            r7 = r17
            r13 = r16
            java.lang.Object r4 = r6.LIZ(r7, r8, r9, r10, r11, r12, r13, r14)
            if (r4 != r1) goto L24
            return r1
        L8b:
            X.0iQc r14 = new X.0iQc
            r14.<init>(r15, r3)
            goto L14
        L91:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.search.protocol.InboxSearchMentionsTabProtocol.LJI(int, java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
