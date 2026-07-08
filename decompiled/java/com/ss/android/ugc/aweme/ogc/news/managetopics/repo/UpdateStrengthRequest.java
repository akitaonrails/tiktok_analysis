package com.ss.android.ugc.aweme.ogc.news.managetopics.repo;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class UpdateStrengthRequest {

    @C09CT("feed_strength_updates")
    public final List<TopicUpdatePreference> preferences;

    public UpdateStrengthRequest() {
        this(null);
    }

    public UpdateStrengthRequest(List<TopicUpdatePreference> list) {
        this.preferences = list;
    }
}
