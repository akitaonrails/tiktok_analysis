package com.bytedance.android.livesdkapi.host;

import X.C006A;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import webcast.data.BottomContainerComponent;
import webcast.data.SecondaryBannerComponent;
import webcast.data.TopRightBannerContainerComponent;

/* JADX INFO: loaded from: classes.dex */
public interface IHostEcommerce extends C006A {
    void I7(TopRightBannerContainerComponent topRightBannerContainerComponent, boolean z);

    View Yk(Context context, SecondaryBannerComponent secondaryBannerComponent, LifecycleOwner lifecycleOwner);

    void in(BottomContainerComponent bottomContainerComponent, boolean z);

    boolean lf();

    View oa(Context context, TopRightBannerContainerComponent topRightBannerContainerComponent);

    boolean vo(SecondaryBannerComponent secondaryBannerComponent);
}
