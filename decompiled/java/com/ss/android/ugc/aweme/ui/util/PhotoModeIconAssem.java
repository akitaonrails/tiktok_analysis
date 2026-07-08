package com.ss.android.ugc.aweme.ui.util;

import X.C607770Nsd;
import X.C786410Ut5;
import com.ss.android.ugc.aweme.detail.prefab.videos.CollisionAwareReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes25.dex */
public final class PhotoModeIconAssem extends CollisionAwareReusedUISlotAssem<PhotoModeIconAssem> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.e_8;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C607770Nsd c607770Nsd) {
        if (AwemeExtKt.isPhotoMode(c607770Nsd.getAweme())) {
            C786410Ut5.LJLLLLLL(0, getContentView());
        } else {
            C786410Ut5.LJLLLLLL(8, getContentView());
        }
    }
}
