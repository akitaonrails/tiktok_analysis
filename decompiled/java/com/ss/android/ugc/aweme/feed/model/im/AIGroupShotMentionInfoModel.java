package com.ss.android.ugc.aweme.feed.model.im;

import kotlin.Pair;

/* JADX INFO: loaded from: classes15.dex */
public final class AIGroupShotMentionInfoModel {
    public final Pair<Double, Double> coordinate;
    public final String nickname;
    public final int stickerHeight;
    public final long userId;

    public final Pair<Double, Double> getCoordinate() {
        return this.coordinate;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final int getStickerHeight() {
        return this.stickerHeight;
    }

    public final long getUserId() {
        return this.userId;
    }

    public AIGroupShotMentionInfoModel(long j, String str, Pair<Double, Double> pair, int i) {
        this.userId = j;
        this.nickname = str;
        this.coordinate = pair;
        this.stickerHeight = i;
    }
}
