package com.ss.android.ugc.aweme.live.livehostimpl.livereply.share;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class LiveReplayShareData implements Serializable {
    public static final int $stable = 0;

    @C09CT("anchor_id")
    public final String anchorId;

    @C09CT("content_desc")
    public final String contentDesc;

    @C09CT("content_pb")
    public final String contentPb;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("enter_from_page")
    public final String enterFromPage;

    @C09CT("event_page")
    public final String eventPage;

    @C09CT("image_url")
    public final String imageURL;

    @C09CT("room_id")
    public final String roomId;

    @C09CT("share_content")
    public final String shareContent;

    @C09CT("share_scene")
    public final String shareScene;

    @C09CT("sub_tab")
    public final String subTab;

    public LiveReplayShareData() {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }

    public LiveReplayShareData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.contentPb = str;
        this.imageURL = str2;
        this.contentDesc = str3;
        this.anchorId = str4;
        this.roomId = str5;
        this.enterFromPage = str6;
        this.enterFrom = str7;
        this.eventPage = str8;
        this.shareContent = str9;
        this.subTab = str10;
        this.shareScene = str11;
    }
}
