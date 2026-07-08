package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LyricStruct {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("lyric_status")
    public int lyricStatus;

    @C09CT("lyric_type")
    public int lyricType;

    @C09CT("vid")
    public String vid = "";

    @C09CT("klyric_urls")
    public List<String> klyricUrls = new ArrayList();
}
