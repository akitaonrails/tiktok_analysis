package com.ss.android.ugc.aweme.commerce.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class CommerceActivityStruct implements Serializable {

    @C09CT("act_type")
    public int actType;
    public String authorId;

    @C09CT("click_track_url_list")
    public UrlModel clickTrackUrlList;

    @C09CT("end_time")
    public long endTime;
    public String enterFrom;
    public String groupId;

    @C09CT("image")
    public UrlModel image;

    @C09CT("jump_open_url")
    public String jumpOpenUrl;

    @C09CT("jump_web_url")
    public String jumpWebUrl;

    @C09CT("start_time")
    public long startTime;

    @C09CT("time_range")
    public List<ActivityTimeRange> timeRange;

    @C09CT("title")
    public String title;

    @C09CT("track_url_list")
    public UrlModel trackUrlList;

    public CommerceActivityStruct() {
    }

    public final void setAuthorId(String str) {
        this.authorId = str;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setGroupId(String str) {
        this.groupId = str;
    }

    public CommerceActivityStruct(int i, UrlModel urlModel, String str, String str2, String str3, long j, long j2, List<ActivityTimeRange> list, UrlModel urlModel2, UrlModel urlModel3, String str4, String str5, String str6) {
        this.actType = i;
        this.image = urlModel;
        this.jumpWebUrl = str;
        this.jumpOpenUrl = str2;
        this.title = str3;
        this.startTime = j;
        this.endTime = j2;
        this.timeRange = list;
        this.trackUrlList = urlModel2;
        this.clickTrackUrlList = urlModel3;
        this.groupId = str4;
        this.authorId = str5;
        this.enterFrom = str6;
    }
}
