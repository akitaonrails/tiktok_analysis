package com.ss.android.ugc.aweme.commentv2.panel;

import X.C0TNQ;
import X.C1349800lEI;
import X.C786410Ut5;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.viewerlist.ui.VideoViewerListFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes22.dex */
public final class ViewerPanelProviderV2 implements IPanelProviderProtocol {
    @Override // com.ss.android.ugc.aweme.commentv2.panel.IPanelProviderProtocol
    public final int Kj1() {
        return 3;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.panel.IPanelProviderProtocol
    public final String PU0() {
        return "view_list";
    }

    @Override // com.ss.android.ugc.aweme.commentv2.panel.IPanelProviderProtocol
    public final Fragment ER0(C1349800lEI c1349800lEI, Aweme aweme) {
        VideoViewerListFragment.LLJJJJJIL.getClass();
        VideoViewerListFragment videoViewerListFragment = new VideoViewerListFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, FollowStatusChangeMethod.PARAM_UID, c1349800lEI);
        videoViewerListFragment.setArguments(bundle);
        videoViewerListFragment.LLIZ = c1349800lEI;
        videoViewerListFragment.LLIZLLLIL = aweme;
        videoViewerListFragment.LLILZ = C0TNQ.LIZLLL(aweme);
        return videoViewerListFragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (X.C0TNQ.LIZLLL(r8) > 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0071, code lost:
    
        if (X.C0TNQ.LIZLLL(r8) > 0) goto L23;
     */
    @Override // com.ss.android.ugc.aweme.commentv2.panel.IPanelProviderProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean vJ0(X.C1349800lEI r7, com.ss.android.ugc.aweme.feed.model.Aweme r8) {
        /*
            r6 = this;
            r3 = 0
            if (r8 == 0) goto L58
            java.lang.String r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r8)
            boolean r0 = X.C10EU.LJIIZILJ(r0)
            if (r0 == 0) goto L58
            X.0W8I r0 = X.C0W8I.LIZ
            r0.getClass()
            boolean r0 = X.C0W8I.LIZIZ()
            r4 = 1
            if (r0 != 0) goto L76
            boolean r0 = X.C0W8I.LIZJ()
            if (r0 != 0) goto L76
        L1f:
            X.01GW r0 = X.C259370AEl.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == 0) goto L74
            r0 = 1
        L2e:
            r4 = 0
            if (r0 == 0) goto L59
            X.0CNY r0 = X.C0CNY.LIZ
            r0.getClass()
            boolean r0 = X.C0CNY.LIZ()
            if (r0 == 0) goto L59
            boolean r0 = X.C0TNQ.LJI(r8)
            if (r0 == 0) goto L85
            boolean r0 = X.C0TNQ.LJIIIIZZ(r8)
            if (r0 == 0) goto L85
            long r1 = X.C0TNQ.LIZLLL(r8)
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L85
        L51:
            boolean r0 = X.C0TNQ.LJFF()
            if (r0 == 0) goto L58
            r3 = 1
        L58:
            return r3
        L59:
            boolean r0 = X.C0TNQ.LJI(r8)
            if (r0 == 0) goto L85
            boolean r0 = X.C0TNQ.LJIIIIZZ(r8)
            if (r0 == 0) goto L85
            boolean r0 = X.C0TNQ.LJFF()
            if (r0 == 0) goto L85
            long r1 = X.C0TNQ.LIZLLL(r8)
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L85
            goto L51
        L74:
            r0 = 0
            goto L2e
        L76:
            X.0C64 r2 = X.C0C64.LJIILLIIL()
            java.lang.String r1 = "publish_video_view_white_box_mock"
            r0 = 31744(0x7c00, float:4.4483E-41)
            int r0 = r2.LJIJ(r0, r3, r1, r4)
            if (r0 == 0) goto L1f
            goto L51
        L85:
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "A "
            r2.append(r0)
            boolean r0 = X.C0TNQ.LJI(r8)
            r2.append(r0)
            java.lang.String r0 = " B "
            r2.append(r0)
            boolean r0 = X.C0TNQ.LJIIIIZZ(r8)
            r2.append(r0)
            java.lang.String r0 = " C "
            r2.append(r0)
            boolean r0 = X.C0TNQ.LJFF()
            r2.append(r0)
            java.lang.String r0 = " D "
            r2.append(r0)
            long r0 = X.C0TNQ.LIZLLL(r8)
            r2.append(r0)
            X.C2188811AlT.LIZIZ(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.panel.ViewerPanelProviderV2.vJ0(X.0lEI, com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }
}
