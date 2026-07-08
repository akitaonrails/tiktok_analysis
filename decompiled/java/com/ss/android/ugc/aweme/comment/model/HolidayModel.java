package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class HolidayModel implements Serializable {

    @C09CT("background_url")
    public final String backgroundUrl;

    @C09CT("case_sensitive")
    public final Boolean caseSensitive;

    @C09CT("end_timestamp")
    public final Long endTimeStamp;

    @C09CT("hashtag_list")
    public final List<String> hashTagList;

    @C09CT("holiday")
    public final String holiday;

    @C09CT("keywords_list")
    public final List<Keyword> keywords;

    @C09CT("priority")
    public final Long priority;

    @C09CT("space_sensitive")
    public final Boolean spaceSensitive;

    @C09CT("start_timestamp")
    public final Long startTimeStamp;

    @C09CT("text_color_dark")
    public final String textColorDark;

    @C09CT("text_color_light")
    public final String textColorLight;

    @C09CT("uid_list")
    public final List<String> uidList;

    public HolidayModel() {
        this(null, null, null, "https://sf16-sg.tiktokcdn.com/obj/eden-sg/uhojlbebo/Frame%202087325152.png", null, null, null, null, null, null, null, null);
    }

    public HolidayModel(String str, Long l, Long l2, String str2, Boolean bool, Boolean bool2, List<String> list, List<String> list2, List<Keyword> list3, Long l3, String str3, String str4) {
        this.holiday = str;
        this.startTimeStamp = l;
        this.endTimeStamp = l2;
        this.backgroundUrl = str2;
        this.spaceSensitive = bool;
        this.caseSensitive = bool2;
        this.hashTagList = list;
        this.uidList = list2;
        this.keywords = list3;
        this.priority = l3;
        this.textColorDark = str3;
        this.textColorLight = str4;
    }
}
