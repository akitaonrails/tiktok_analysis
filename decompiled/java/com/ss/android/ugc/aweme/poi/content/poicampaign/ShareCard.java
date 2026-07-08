package com.ss.android.ugc.aweme.poi.content.poicampaign;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes19.dex */
public final class ShareCard {

    @C09CT("content_pb")
    public final String contentPb;

    @C09CT("long_url")
    public final String longUrl;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("short_url")
    public final String shortUrl;

    @C09CT("type")
    public final String type;

    public ShareCard(String str, String str2, String str3, String str4, String str5) {
        this.shortUrl = str;
        this.longUrl = str2;
        this.scene = str3;
        this.type = str4;
        this.contentPb = str5;
    }
}
