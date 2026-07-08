package com.ss.android.ugc.aweme.discover.spi;

import com.ss.android.ugc.aweme.discover.model.Challenge;

/* JADX INFO: loaded from: classes3.dex */
public final class MusicallyTrendingTopicViewHolderService implements ITrendingTopicViewHolderService {
    @Override // com.ss.android.ugc.aweme.discover.spi.ITrendingTopicViewHolderService
    public final boolean LIZ(Challenge challenge) {
        return challenge.isPgcshow();
    }
}
