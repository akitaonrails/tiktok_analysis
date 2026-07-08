package com.ss.android.ugc.aweme.feed.api;

import X.InterfaceC1209460hZw;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public interface IFeedModuleService {
    boolean autoRefreshInNUJ();

    boolean fullscreenShowLive();

    void getInsertAwemeInfoAsync(String str, String str2, boolean z);

    void initLegoInflate();

    void mobNuFeedRequest(String str, boolean z, List<? extends Aweme> list);

    InterfaceC1209460hZw newTopNoticeFeedManager(Activity activity);

    void refreshComment(Fragment fragment);

    int useInsertAwemeOperatorPosition();
}
