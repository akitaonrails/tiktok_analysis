package com.ss.android.ugc.tools.chat.room.model;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.io.Serializable;

/* JADX INFO: loaded from: classes33.dex */
public final class CreationChatRoomEnterParams implements Serializable {
    public static final int $stable = 0;

    @C09CT("creation_id")
    public final String creationId;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("enter_method")
    public final String enterMethod;

    @C09CT("entrance_type")
    public final String entranceType;

    @C09CT("image_count")
    public final Integer imageCount;

    @C09CT("image_url1")
    public final String imageUrl1;

    @C09CT("image_url2")
    public final String imageUrl2;

    @C09CT("page_session_id")
    public final String pageSessionId;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("session_id")
    public final String sessionId;

    @C09CT("shoot_way")
    public final String shootWay;

    @C09CT("source_id")
    public final String sourceId;

    @C09CT("text")
    public final String text;

    @C09CT("vp_creation_id")
    public final String vpCreationId;

    public CreationChatRoomEnterParams() {
        this(null, null, null, null, null, null, null, null, null, "unknow", null, null, null, null);
    }

    public CreationChatRoomEnterParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, String str10, String str11, String str12, String str13) {
        this.sessionId = str;
        this.creationId = str2;
        this.vpCreationId = str3;
        this.pageSessionId = str4;
        this.entranceType = str5;
        this.enterFrom = str6;
        this.enterMethod = str7;
        this.shootWay = str8;
        this.imageCount = num;
        this.scene = str9;
        this.sourceId = str10;
        this.text = str11;
        this.imageUrl1 = str12;
        this.imageUrl2 = str13;
    }
}
