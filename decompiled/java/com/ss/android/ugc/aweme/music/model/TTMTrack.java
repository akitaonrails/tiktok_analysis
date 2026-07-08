package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class TTMTrack implements Serializable {

    @C09CT("artist_name")
    public String artistName;

    @C09CT("cover_medium")
    public UrlModel coverMedium;

    @C09CT("duration")
    public Long duration;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("name")
    public String name;

    public TTMTrack() {
        this("", "", null, -1L, "");
    }

    public TTMTrack(String str, String str2, UrlModel urlModel, Long l, String str3) {
        this.id = str;
        this.name = str2;
        this.coverMedium = urlModel;
        this.duration = l;
        this.artistName = str3;
    }
}
