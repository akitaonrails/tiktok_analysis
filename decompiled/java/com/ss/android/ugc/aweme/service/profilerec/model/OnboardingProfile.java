package com.ss.android.ugc.aweme.service.profilerec.model;

import X.C09CT;
import com.ss.android.ugc.aweme.plugin.journey.FollowStatus;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class OnboardingProfile {

    @C09CT("avatar_url")
    public final String avatarUrl;

    @C09CT("bio")
    public final String bio;

    @C09CT("blue_v")
    public final Boolean blueV;

    @C09CT("follow_status")
    public final FollowStatus followStatus;

    @C09CT("has_story")
    public final Boolean hasStory;

    @C09CT("name")
    public final String name;

    @C09CT("sec_uid")
    public final String secUd;

    @C09CT("user_id")
    public final String userId;

    @C09CT("profile_videos")
    public final List<VideoCoverStruct> videoCovers;

    public OnboardingProfile(String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, FollowStatus followStatus, List<VideoCoverStruct> list) {
        this.userId = str;
        this.secUd = str2;
        this.avatarUrl = str3;
        this.name = str4;
        this.bio = str5;
        this.blueV = bool;
        this.hasStory = bool2;
        this.followStatus = followStatus;
        this.videoCovers = list;
    }
}
