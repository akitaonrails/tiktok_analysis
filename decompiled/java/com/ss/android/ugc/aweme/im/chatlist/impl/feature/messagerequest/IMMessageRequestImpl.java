package com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest;

import com.ss.android.ugc.aweme.im.chatlist.api.IMMessageRequestAPI;

/* JADX INFO: loaded from: classes15.dex */
public final class IMMessageRequestImpl implements IMMessageRequestAPI {
    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    @Override // com.ss.android.ugc.aweme.im.chatlist.api.IMMessageRequestAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.content.Context r24, com.ss.android.ugc.aweme.im.chatlist.api.MessageRequestPageNavParams r25) {
        /*
            r23 = this;
            r3 = r24
            X.19EG r0 = X.C1388190mED.LIZIZ(r3)
            r6 = 0
            if (r0 == 0) goto L7c
            X.198i r14 = com.ss.android.ugc.aweme.SAFExtensionKt.LJIILLIIL(r0)
            if (r14 == 0) goto L7d
            boolean r1 = X.AnonymousClass1999.LIZ(r14)
            r0 = 1
            if (r1 != r0) goto L7d
        L16:
            java.lang.String r4 = "message_request_nav_params"
            r5 = r25
            if (r0 == 0) goto L7f
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            X.C786410Ut5.LJJIJL(r1, r4, r5)
            boolean r0 = X.C300860Bqm.LIZ()
            if (r0 == 0) goto L52
            if (r14 == 0) goto L51
            X.0ZsL r15 = X.C913350ZsL.LL
            X.199B r5 = new X.199B
            r9 = 0
            r13 = 127(0x7f, float:1.78E-43)
            r7 = r6
            r8 = r6
            r10 = r9
            r11 = r6
            r12 = r6
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r18 = -1
            com.ss.android.ugc.aweme.SAFContextThemeConfig r0 = new com.ss.android.ugc.aweme.SAFContextThemeConfig
            r0.<init>(r9, r9)
            java.lang.Class<com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.MessageRequestFragmentV2> r16 = com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.MessageRequestFragmentV2.class
            r17 = r6
            r20 = r5
            r21 = r6
            r22 = r0
            r19 = r1
            X.AnonymousClass1999.LIZLLL(r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L51:
            return
        L52:
            if (r14 == 0) goto L51
            X.0ZsM r12 = X.C913360ZsM.LL
            X.199B r3 = new X.199B
            X.199E r4 = X.C199E.SINGLE_TASK
            r2 = 0
            r11 = 126(0x7e, float:1.77E-43)
            r5 = r6
            r6 = r6
            r7 = r2
            r8 = r2
            r9 = r6
            r10 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r15 = -1
            com.ss.android.ugc.aweme.SAFContextThemeConfig r0 = new com.ss.android.ugc.aweme.SAFContextThemeConfig
            r0.<init>(r2, r2)
            java.lang.Class<com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.MessageRequestRootFragment> r13 = com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.MessageRequestRootFragment.class
            r11 = r14
            r14 = r6
            r16 = r1
            r17 = r3
            r18 = r6
            r19 = r0
            X.AnonymousClass1999.LIZLLL(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        L7c:
            r14 = r6
        L7d:
            r0 = 0
            goto L16
        L7f:
            java.lang.String r0 = com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.MessageRequestActivity._pnsPageId
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.Class<com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.MessageRequestActivity> r0 = com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.MessageRequestActivity.class
            r2.setClass(r3, r0)
            r2.putExtra(r4, r5)
            boolean r0 = X.C300860Bqm.LIZ()
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            if (r0 == 0) goto Lc0
            boolean r0 = r3 instanceof X.C19EG
            if (r0 == 0) goto Lba
            boolean r0 = r3 instanceof com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.MessageRequestActivity
            if (r0 != 0) goto La1
            r2.addFlags(r1)
        La1:
            com.bytedance.router.monitor.RouterPageMonitor r0 = com.bytedance.router.monitor.RouterPageMonitor.INSTANCE
            com.bytedance.router.monitor.page.IRouterPageEventDispatcher r1 = r0.getDispatcher()
            java.lang.String r0 = "Context_startActivity_1"
            r1.dispatchActivityOpReached(r3, r2, r0)
            X.C1701330uNH.LIZ(r2, r3)
            X.0WZX r1 = new X.0WZX
            java.lang.String r0 = "dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLZzG3SZiFshutcVkhk88jqXNqNPy49AhAyPDy2JAacY24b/YcyIxs3P4pORn15zWjRNrOpPWNACz+xAdwMC4"
            r1.<init>(r0, r6)
            X.C2204961BRm.LJJJJJL(r3, r2, r1)
            return
        Lba:
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r2.addFlags(r0)
            goto La1
        Lc0:
            r2.addFlags(r1)
            goto La1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.IMMessageRequestImpl.LIZ(android.content.Context, com.ss.android.ugc.aweme.im.chatlist.api.MessageRequestPageNavParams):void");
    }
}
