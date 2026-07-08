package com.ss.android.ugc.aweme.explore.topic.protocol;

import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.explore.topic.ExploreTopicGeneralFeedFragment;
import com.ss.android.ugc.aweme.explore.topic.IExploreTopicTabProtocol;

/* JADX INFO: loaded from: classes28.dex */
public final class ExploreTopicGeneralFeedProtocol implements IExploreTopicTabProtocol {
    public final String LL;
    public final long LLILLJJLI;
    public boolean LLILLL = false;
    public final Class<? extends Fragment> LLILZ = ExploreTopicGeneralFeedFragment.class;

    @Override // com.ss.android.ugc.aweme.explore.topic.IExploreTopicTabProtocol
    public final void Ih1() {
        this.LLILLL = false;
    }

    @Override // com.ss.android.ugc.aweme.explore.topic.IExploreTopicTabProtocol
    public final Class<? extends Fragment> LLJIJIL() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.aweme.explore.topic.IExploreTopicTabProtocol
    public final long getTabId() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.explore.topic.IExploreTopicTabProtocol
    public final boolean zt2() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.explore.topic.IExploreTopicTabProtocol
    public final Bundle V9(Context context) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("com.ss.android.ugc.aweme.intent.extra.TOPIC_PANEL_TYPE", this.LL, bundle);
        bundle.putLong("com.ss.android.ugc.aweme.intent.extra.TOPIC_PANEL_ID", this.LLILLJJLI);
        return bundle;
    }

    @Override // com.ss.android.ugc.aweme.explore.topic.IExploreTopicTabProtocol
    public final String mc(Context context) {
        return this.LL;
    }

    public ExploreTopicGeneralFeedProtocol(long j, String str) {
        this.LL = str;
        this.LLILLJJLI = j;
    }
}
