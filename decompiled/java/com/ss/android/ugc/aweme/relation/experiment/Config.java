package com.ss.android.ugc.aweme.relation.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class Config {

    @C09CT("recommend_friends_in_inbox_page")
    public final int recommendFriendsInInboxPage;

    @C09CT("recommend_friends_in_others_profile_page")
    public final int recommendFriendsInOthersProfilePage;

    @C09CT("recommend_friends_in_others_suggested_list")
    public final int recommendFriendsInOthersSuggestedList;

    @C09CT("recommend_friends_in_self_following_list")
    public final int recommendFriendsInSelfFollowingList;

    @C09CT("recommend_friends_in_self_suggested_list")
    public final int recommendFriendsInSelfSuggestedList;

    public Config() {
        this(1, 1, 1, 1, 1);
    }

    public Config(int i, int i2, int i3, int i4, int i5) {
        this.recommendFriendsInInboxPage = i;
        this.recommendFriendsInSelfFollowingList = i2;
        this.recommendFriendsInSelfSuggestedList = i3;
        this.recommendFriendsInOthersProfilePage = i4;
        this.recommendFriendsInOthersSuggestedList = i5;
    }
}
