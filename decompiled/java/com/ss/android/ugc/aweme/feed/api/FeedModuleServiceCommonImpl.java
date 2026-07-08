package com.ss.android.ugc.aweme.feed.api;

import X.C1492500owS;
import X.C1492540owW;
import X.C1584440rKk;
import X.C19EG;
import X.InterfaceC1209460hZw;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.feed.Feed0VVManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes24.dex */
public abstract class FeedModuleServiceCommonImpl implements IFeedModuleService {
    public abstract /* synthetic */ void attachActivityToGlobalAcViewModel(C19EG c19eg);

    @Override // com.ss.android.ugc.aweme.feed.api.IFeedModuleService
    public abstract /* synthetic */ boolean autoRefreshInNUJ();

    public abstract /* synthetic */ C1584440rKk createData(Context context);

    @Override // com.ss.android.ugc.aweme.feed.api.IFeedModuleService
    public boolean fullscreenShowLive() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.api.IFeedModuleService
    public abstract /* synthetic */ void getInsertAwemeInfoAsync(String str, String str2, boolean z);

    @Override // com.ss.android.ugc.aweme.feed.api.IFeedModuleService
    public abstract /* synthetic */ void initLegoInflate();

    public abstract /* synthetic */ void initPosterSRProcessorOnHotStart();

    @Override // com.ss.android.ugc.aweme.feed.api.IFeedModuleService
    public abstract /* synthetic */ void mobNuFeedRequest(String str, boolean z, List<? extends Aweme> list);

    public abstract /* synthetic */ void posterSRProcessorOnDestroy();

    @Override // com.ss.android.ugc.aweme.feed.api.IFeedModuleService
    public abstract /* synthetic */ void refreshComment(Fragment fragment);

    public void requestInterestSelect() {
    }

    @Override // com.ss.android.ugc.aweme.feed.api.IFeedModuleService
    public abstract /* synthetic */ int useInsertAwemeOperatorPosition();

    @Override // com.ss.android.ugc.aweme.feed.api.IFeedModuleService
    public InterfaceC1209460hZw newTopNoticeFeedManager(Activity activity) {
        if (C1492500owS.LIZ()) {
            return new C1492540owW(activity);
        }
        return null;
    }

    public void commitFeedRequest(int i, WeakHandler weakHandler, Callable callable, int i2, boolean z) {
        Feed0VVManager.LIZIZ(i, -1, weakHandler, callable, i2, z, null);
    }
}
