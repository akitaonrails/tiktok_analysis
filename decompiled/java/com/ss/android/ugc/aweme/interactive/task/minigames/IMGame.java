package com.ss.android.ugc.aweme.interactive.task.minigames;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class IMGame implements Serializable {
    public static final int $stable = 8;

    @C09CT("categories")
    public final List<String> categories;

    @C09CT("description")
    public final String description;

    @C09CT("extras")
    public final Map<String, String> extras;

    @C09CT("game_preview")
    public final IMGameImageURL gamePreview;

    @C09CT("game_url")
    public final String gameUrl;

    @C09CT("icon")
    public final IMGameImageURL icon;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("is_new_release")
    public final Boolean isNewRelease;

    @C09CT("name")
    public final String name;

    @C09CT("played_friend_uids")
    public final List<Long> playedFriendsUids;

    @C09CT("player_count")
    public final Integer playerCount;

    @C09CT("type")
    public final Integer type;

    public IMGame() {
        this(null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public String toString() {
        return "IMGame(type=" + this.type + ", id=" + this.id + ", name=" + this.name + ", description=" + this.description + ", categories=" + this.categories + ", icon=" + this.icon + ", gamePreview=" + this.gamePreview + ", playerCount=" + this.playerCount + ", playedFriendsUids=" + this.playedFriendsUids + ", gameUrl=" + this.gameUrl + ", isNewRelease=" + this.isNewRelease + ", extras=" + this.extras + ')';
    }

    public final Boolean isNewRelease() {
        return this.isNewRelease;
    }

    public IMGame(Integer num, String str, String str2, String str3, List<String> list, IMGameImageURL iMGameImageURL, IMGameImageURL iMGameImageURL2, Integer num2, List<Long> list2, String str4, Boolean bool, Map<String, String> map) {
        this.type = num;
        this.id = str;
        this.name = str2;
        this.description = str3;
        this.categories = list;
        this.icon = iMGameImageURL;
        this.gamePreview = iMGameImageURL2;
        this.playerCount = num2;
        this.playedFriendsUids = list2;
        this.gameUrl = str4;
        this.isNewRelease = bool;
        this.extras = map;
    }
}
