package com.ss.android.ugc.aweme.ui.feed.config;

import X.C03H5;
import X.C0RHE;
import X.C0SKM;
import X.C0SKP;
import X.C723830SaL;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.FeedPhotoSlideComponent;
import com.ss.android.ugc.aweme.ui.feed.protocol.FeedPhotoSlideConfigurationProtocol;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public abstract class FeedPhotoSlideBaseConfig implements FeedPhotoSlideConfigurationProtocol {
    @Override // com.ss.android.ugc.aweme.ui.feed.protocol.PhotoSlideConfigurationProtocol
    public final void d81(View view, ReusedUIAssem reusedUIAssem) {
        C723830SaL.LIZ(reusedUIAssem, null, new AwS377S0200000_11(view, (View) reusedUIAssem, (ReusedUIAssem<? extends C03H5>) 157));
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.protocol.PhotoSlideConfigurationProtocol
    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public void gw1(View view, FeedPhotoSlideComponent feedPhotoSlideComponent, ReusedUIAssem reusedUIAssem) {
        if (C0SKP.LIZIZ() || C0SKM.LJFF() || C0SKM.LIZJ()) {
            C723830SaL.LIZ(reusedUIAssem, null, new AwS590S0100000_11(reusedUIAssem, (ReusedUIAssem<? extends C03H5>) 563));
        }
        C723830SaL.LIZ(reusedUIAssem, null, new AwS590S0100000_11(reusedUIAssem, (ReusedUIAssem<? extends C03H5>) 564));
        if (C0RHE.LJ() || C0RHE.LIZLLL()) {
            C723830SaL.LIZ(reusedUIAssem, null, new AwS590S0100000_11(reusedUIAssem, (ReusedUIAssem<? extends C03H5>) 565));
        }
    }
}
