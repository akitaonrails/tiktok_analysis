package com.ss.android.ugc.aweme.commercialize.live.business.links.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class ActiveCard implements Serializable {

    @C09CT("cardType")
    public final int cardType;

    @C09CT("gameUrl")
    public final String gameUrl;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final long id;

    @C09CT("isPinned")
    public final boolean isPinned;

    @C09CT("liveLogExtra")
    public final String liveLogExtra;

    /* JADX INFO: renamed from: pic, reason: collision with root package name */
    @C09CT("pic")
    public final String f336pic;

    @C09CT("subtitle")
    public final String subtitle;

    @C09CT("title")
    public final String title;

    @C09CT("url")
    public final String url;

    public final boolean isPinned() {
        return this.isPinned;
    }

    public ActiveCard(long j, String str, String str2, String str3, String str4, int i, String str5, boolean z, String str6) {
        this.id = j;
        this.title = str;
        this.subtitle = str2;
        this.url = str3;
        this.f336pic = str4;
        this.cardType = i;
        this.gameUrl = str5;
        this.isPinned = z;
        this.liveLogExtra = str6;
    }
}
