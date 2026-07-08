package com.ss.android.ugc.aweme.search.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchFeedbackSuggestWordMeta implements Serializable {

    @C09CT("enter_group_id")
    public final String aid;

    @C09CT("group_id")
    public final String groupId;

    @C09CT("impr_id")
    public final String imprId;

    @C09CT("words_content")
    public final String keyword;

    @C09CT("visual_pause_time_pos")
    public final String visualPauseTimePos;

    @C09CT("visual_search_pos")
    public final String visualSearchPos;

    @C09CT("visual_tag_uid")
    public final String visualTagUid;

    @C09CT("words_source")
    public final String wordsSource;

    public SearchFeedbackSuggestWordMeta(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.keyword = str;
        this.wordsSource = str2;
        this.imprId = str3;
        this.aid = str4;
        this.groupId = str5;
        this.visualSearchPos = str6;
        this.visualPauseTimePos = str7;
        this.visualTagUid = str8;
    }
}
