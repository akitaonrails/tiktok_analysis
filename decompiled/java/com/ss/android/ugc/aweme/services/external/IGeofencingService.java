package com.ss.android.ugc.aweme.services.external;

import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes17.dex */
public interface IGeofencingService {
    void injectGeoFencingSettingItem(Aweme aweme, FrameLayout frameLayout, LifecycleOwner lifecycleOwner);
}
