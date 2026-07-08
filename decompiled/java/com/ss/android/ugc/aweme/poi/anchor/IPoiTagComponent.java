package com.ss.android.ugc.aweme.poi.anchor;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes12.dex */
public interface IPoiTagComponent {
    int contentLayoutId();

    void onBind(Aweme aweme, String str);

    void onTagShow();

    void onViewCreated(View view);
}
