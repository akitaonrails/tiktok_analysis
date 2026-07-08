package com.ss.android.ugc.aweme.ui.feed.subphoto.std;

import X.C2188811AlT;
import X.C719950SLx;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class PhotoHolderAssem extends ReusedUIAssem<PhotoHolderAssem> implements InterfaceC712990Rxx<C719950SLx> {
    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C719950SLx c719950SLx) {
        String aid;
        Aweme aweme;
        C719950SLx c719950SLx2 = c719950SLx;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBind position: ");
        sbLIZ.append(c719950SLx2.LL);
        sbLIZ.append(" aid: ");
        VideoItemParams videoItemParams = c719950SLx2.LLILLL;
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C719950SLx c719950SLx) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C719950SLx c719950SLx) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
