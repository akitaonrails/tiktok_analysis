package com.ss.android.ugc.aweme.ad.feed.liveshopping;

import X.C1009600cNa;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes17.dex */
public interface ICommerceLiveShoppingManager {
    public static final C1009600cNa Companion = new Object() { // from class: X.0cNa
    };

    void bind();

    void onPageSelected();

    void requestLiveProductInfoIfNeeded(Aweme aweme, Context context, String str);

    void unBind();

    void unPageSelected();
}
