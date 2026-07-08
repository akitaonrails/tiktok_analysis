package com.ss.android.ugc.aweme.explore.topic.protocol;

import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.explore.topic.ExploreTopicMainFeedFragment;
import com.ss.android.ugc.aweme.explore.topic.IExploreTopicTabProtocol;

/* JADX INFO: loaded from: classes28.dex */
public final class ExploreTopicMainFeedProtocol implements IExploreTopicTabProtocol {
    public boolean LLILLJJLI;
    public final String LL = "all";
    public final Class<? extends Fragment> LLILLL = ExploreTopicMainFeedFragment.class;

    @Override // com.ss.android.ugc.aweme.explore.topic.IExploreTopicTabProtocol
    public final void Ih1() {
        this.LLILLJJLI = false;
    }

    @Override // com.ss.android.ugc.aweme.explore.topic.IExploreTopicTabProtocol
    public final long getTabId() {
        return 0L;
    }

    @Override // com.ss.android.ugc.aweme.explore.topic.IExploreTopicTabProtocol
    public final Class<? extends Fragment> LLJIJIL() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.explore.topic.IExploreTopicTabProtocol
    public final boolean zt2() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.explore.topic.IExploreTopicTabProtocol
    public final Bundle V9(Context context) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("com.ss.android.ugc.aweme.intent.extra.TOPIC_PANEL_TYPE", this.LL, bundle);
        bundle.putLong("com.ss.android.ugc.aweme.intent.extra.TOPIC_PANEL_ID", 0L);
        return bundle;
    }

    @Override // com.ss.android.ugc.aweme.explore.topic.IExploreTopicTabProtocol
    public final String mc(Context context) {
        return context.getString(2131829894);
    }
}
