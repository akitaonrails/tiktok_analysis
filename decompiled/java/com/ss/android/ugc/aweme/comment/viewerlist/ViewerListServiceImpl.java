package com.ss.android.ugc.aweme.comment.viewerlist;

import X.C0TNQ;
import com.ss.android.ugc.aweme.viewerlist.IViewerListService;

/* JADX INFO: loaded from: classes22.dex */
public final class ViewerListServiceImpl implements IViewerListService {
    @Override // com.ss.android.ugc.aweme.viewerlist.IViewerListService
    public final boolean LIZIZ() {
        return C0TNQ.LIZJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051 A[PHI: r14
      0x0051: PHI (r14v1 boolean) = (r14v0 boolean), (r14v3 boolean), (r14v3 boolean) binds: [B:24:0x004e, B:13:0x0026, B:15:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.viewerlist.IViewerListService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r17, long r18, long r20, boolean r22, java.lang.String r23, java.lang.Boolean r24, java.lang.Boolean r25) {
        /*
            r16 = this;
            r10 = 50
            X.0lPx r4 = X.C1357030lPx.LIZIZ
            if (r17 == 0) goto Lc
            java.lang.String r5 = r17.getAid()
            if (r5 != 0) goto Le
        Lc:
            java.lang.String r5 = ""
        Le:
            X.0iCV r0 = X.EnumC1233370iCV.PANEL_LIST
            int r11 = r0.getValue()
            r2 = 0
            r6 = r18
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            r2 = 1
            if (r1 != 0) goto L4d
            if (r24 == 0) goto L4d
            boolean r0 = r24.booleanValue()
            if (r0 == 0) goto L4d
            r14 = 1
        L26:
            if (r25 == 0) goto L51
            boolean r0 = r25.booleanValue()
            if (r0 == 0) goto L51
            r15 = 1
        L2f:
            r13 = r22
            r8 = r20
            r12 = r23
            X.11NZ r0 = r4.LIZ(r5, r6, r8, r10, r11, r12, r13, r14, r15)
            java.lang.Object r1 = r0.LIZLLL()
            com.ss.android.ugc.aweme.comment.viewerlist.model.ViewerListResponse r1 = (com.ss.android.ugc.aweme.comment.viewerlist.model.ViewerListResponse) r1
            if (r17 == 0) goto L4c
            boolean r0 = X.C730150SkX.LIZJ(r17)
            if (r0 != r2) goto L4c
            X.13BV r0 = X.C13BV.INSTANCE
            r1.setInteractionWrapList(r0)
        L4c:
            return r1
        L4d:
            r14 = 0
            if (r1 != 0) goto L51
            goto L26
        L51:
            r15 = 0
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.viewerlist.ViewerListServiceImpl.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme, long, long, boolean, java.lang.String, java.lang.Boolean, java.lang.Boolean):java.lang.Object");
    }
}
