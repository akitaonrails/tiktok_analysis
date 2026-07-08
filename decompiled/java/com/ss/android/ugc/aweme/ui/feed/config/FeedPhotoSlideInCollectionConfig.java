package com.ss.android.ugc.aweme.ui.feed.config;

import X.C03H5;
import X.C723830SaL;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.FeedPhotoSlideComponent;
import com.ss.android.ugc.aweme.ui.feed.protocol.FeedPhotoSlideInCollectionConfigurationProtocol;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedPhotoSlideInCollectionConfig extends FeedPhotoSlideBaseConfig implements FeedPhotoSlideInCollectionConfigurationProtocol {
    @Override // com.ss.android.ugc.aweme.ui.feed.protocol.PhotoSlideConfigurationProtocol
    public final void hk1(FeedPhotoSlideComponent feedPhotoSlideComponent, ReusedUIAssem reusedUIAssem) {
        C723830SaL.LIZ(reusedUIAssem, null, new AwS377S0200000_11(feedPhotoSlideComponent, reusedUIAssem, 156));
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.config.FeedPhotoSlideBaseConfig
    /* JADX INFO: renamed from: LIZ */
    public final void gw1(View view, FeedPhotoSlideComponent feedPhotoSlideComponent, ReusedUIAssem reusedUIAssem) {
        super.gw1(view, feedPhotoSlideComponent, reusedUIAssem);
        if (feedPhotoSlideComponent.ke()) {
            C723830SaL.LIZ(reusedUIAssem, null, new AwS590S0100000_11(reusedUIAssem, (ReusedUIAssem<? extends C03H5>) 569));
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.config.FeedPhotoSlideBaseConfig, com.ss.android.ugc.aweme.ui.feed.protocol.PhotoSlideConfigurationProtocol
    public final /* bridge */ /* synthetic */ void gw1(View view, FeedPhotoSlideComponent feedPhotoSlideComponent, ReusedUIAssem reusedUIAssem) {
        gw1(view, feedPhotoSlideComponent, reusedUIAssem);
    }
}
