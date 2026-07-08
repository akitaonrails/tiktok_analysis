package com.ss.android.ugc.aweme.tools.draft.entity;

import X.C09CT;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftShowInfo {

    @C09CT("cover_path")
    public final String coverPath;

    @C09CT("has_music_name_updated")
    public final boolean hasMusicNameUpdated;

    @C09CT("is_first_ai_self_auto_cast")
    public boolean isFirstAISelfAutoCast;

    @C09CT("mention_user_avatars")
    public List<String> mentionUserAvatars;

    @C09CT("music_id")
    public final String musicId;

    @C09CT("music_name")
    public final String musicName;

    @C09CT("save_time")
    public long saveTime;

    @C09CT("textExtra_strusts")
    public final List<AVTextExtraStruct> textExtraStrusts;

    @C09CT("time")
    public final long time;

    @C09CT("title")
    public final String title;

    public DraftShowInfo() {
        this("", null, "", "", "", 0L, 0L, false, null, false);
    }

    public DraftShowInfo(String str, List<AVTextExtraStruct> list, String str2, String str3, String str4, long j, long j2, boolean z, List<String> list2, boolean z2) {
        this.title = str;
        this.textExtraStrusts = list;
        this.coverPath = str2;
        this.musicName = str3;
        this.musicId = str4;
        this.time = j;
        this.saveTime = j2;
        this.hasMusicNameUpdated = z;
        this.mentionUserAvatars = list2;
        this.isFirstAISelfAutoCast = z2;
    }
}
