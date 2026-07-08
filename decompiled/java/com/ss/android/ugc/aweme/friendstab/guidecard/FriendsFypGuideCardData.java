package com.ss.android.ugc.aweme.friendstab.guidecard;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsFypGuideCardData implements Serializable {

    @C09CT("awemes")
    public final List<CardItem> cardItems;

    @C09CT("music_url")
    public final String musicUrl;

    @C09CT("static_resource")
    public final StaticResource staticResource;

    public FriendsFypGuideCardData() {
        this(null, null, null);
    }

    public FriendsFypGuideCardData(String str, List<CardItem> list, StaticResource staticResource) {
        this.musicUrl = str;
        this.cardItems = list;
        this.staticResource = staticResource;
    }
}
