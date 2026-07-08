package com.ss.android.ugc.aweme.ui.feed.config;

import X.C03H5;
import X.C0B1P;
import X.C0RJN;
import X.C1389300mG0;
import X.C1578630rBN;
import X.C723830SaL;
import X.C724240Sb0;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.FeedPhotoSlideComponent;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedPhotoSlideConfig extends FeedPhotoSlideBaseConfig {
    @Override // com.ss.android.ugc.aweme.ui.feed.protocol.PhotoSlideConfigurationProtocol
    public final void hk1(FeedPhotoSlideComponent feedPhotoSlideComponent, ReusedUIAssem reusedUIAssem) {
        C723830SaL.LIZ(reusedUIAssem, null, new AwS590S0100000_11(reusedUIAssem, (ReusedUIAssem<? extends C03H5>) 568));
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.config.FeedPhotoSlideBaseConfig
    /* JADX INFO: renamed from: LIZ */
    public final void gw1(View view, FeedPhotoSlideComponent feedPhotoSlideComponent, ReusedUIAssem reusedUIAssem) {
        Fragment fragmentLJI;
        C0RJN c0rjnLIZIZ;
        super.gw1(view, feedPhotoSlideComponent, reusedUIAssem);
        C723830SaL.LIZ(reusedUIAssem, null, new AwS590S0100000_11(reusedUIAssem, (ReusedUIAssem<? extends C03H5>) 566));
        if (((Number) C0B1P.LIZ.getValue()).intValue() > 0 && (fragmentLJI = C724240Sb0.LJI(reusedUIAssem)) != null && (c0rjnLIZIZ = C1578630rBN.LIZIZ(fragmentLJI)) != null && C1389300mG0.LJIL(c0rjnLIZIZ)) {
            C723830SaL.LIZ(reusedUIAssem, null, new AwS590S0100000_11(reusedUIAssem, (ReusedUIAssem<? extends C03H5>) 567));
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.config.FeedPhotoSlideBaseConfig, com.ss.android.ugc.aweme.ui.feed.protocol.PhotoSlideConfigurationProtocol
    public final /* bridge */ /* synthetic */ void gw1(View view, FeedPhotoSlideComponent feedPhotoSlideComponent, ReusedUIAssem reusedUIAssem) {
        gw1(view, feedPhotoSlideComponent, reusedUIAssem);
    }
}
