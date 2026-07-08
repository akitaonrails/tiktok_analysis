package com.ss.android.ugc.feed.platform.cardinsert;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes.dex */
public interface IFeedLynxFallbackNativeCard {
    View getView();

    void onBind(Aweme aweme);

    void onDestroyView();

    void onPause();

    void onResume();

    void onSelected(int i, Aweme aweme);

    void onUnbind();

    void onUnselected(boolean z);
}
