package com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol;

import X.C911010ZoZ;

/* JADX INFO: loaded from: classes15.dex */
public final class QuickLiveReactionVideoSendAssem extends QuickLiveReactionVideoAssem<C911010ZoZ, QuickLiveReactionVideoSendAssem> {
    public boolean LLLIZZ;

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.QuickLiveReactionVideoAssem, com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        zp().LJIILL();
        this.LLLIZZ = false;
        super.cp();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.QuickLiveReactionVideoAssem, X.InterfaceC712990Rxx
    public final void unBind() {
        super.unBind();
        zp().LJIILL();
        this.LLLIZZ = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.QuickLiveReactionVideoAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Fp, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sr(X.C911010ZoZ r6, java.util.List<? extends java.lang.Object> r7) {
        /*
            r5 = this;
            super.sr(r6, r7)
            boolean r0 = r5.LLLIZZ
            r3 = 1
            if (r0 != 0) goto L11
            X.0ZZr r0 = r5.zp()
            r0.LJIILJJIL()
            r5.LLLIZZ = r3
        L11:
            if (r7 == 0) goto L5c
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L5c
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r7.iterator()
        L22:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C461530I7z
            if (r0 == 0) goto L22
            r4.add(r1)
            goto L22
        L34:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L77
            java.util.Iterator r2 = r4.iterator()
        L3e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r0 = r2.next()
            X.0I7z r0 = (X.C461530I7z) r0
            java.lang.Object r1 = r0.LIZIZ
            boolean r0 = r1 instanceof X.C911140Zom
            if (r0 == 0) goto L3e
            X.0Zom r1 = (X.C911140Zom) r1
            if (r1 == 0) goto L3e
            boolean r0 = r1.LIZJ
            if (r0 != 0) goto L5c
            boolean r0 = r1.LIZ
            if (r0 == 0) goto L3e
        L5c:
            int r0 = r6.LLILZIL
            if (r0 != 0) goto L7c
            X.0ZZr r2 = r5.zp()
            X.0ZqH r0 = X.C912070ZqH.LIZIZ
            com.ss.android.ugc.aweme.service.IIMMediaCreativeService r0 = r0.LJIILIIL()
            com.ss.android.ugc.aweme.creation.publish.IMediaPublishManager r1 = r0.LJIIIZ()
            java.lang.String r0 = r6.LLILZLL
            int r0 = r1.LJIIJ(r0)
            r2.onProgress(r0)
        L77:
            X.0Zox r0 = r5.LLLIIIIL
            r0.LJIIIIZZ = r3
            return
        L7c:
            if (r0 != r3) goto L77
            X.0ZZr r1 = r5.zp()
            r0 = 99
            r1.onProgress(r0)
            goto L77
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.QuickLiveReactionVideoSendAssem.sr(X.0ZoZ, java.util.List):void");
    }
}
