package com.ss.android.ugc.aweme.tako.router.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class EnterAwemeData implements Serializable {
    public static final int $stable = 8;

    @C09CT("video_cover_uri")
    public final String videoCoverUri;

    @C09CT("video_cover_url_list")
    public final List<String> videoCoverUrlList;

    public EnterAwemeData() {
        this(null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EnterAwemeData(videoCoverUri=");
        sbLIZ.append(this.videoCoverUri);
        sbLIZ.append(", videoCoverUrlList=");
        sbLIZ.append(this.videoCoverUrlList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EnterAwemeData(String str, List<String> list) {
        this.videoCoverUri = str;
        this.videoCoverUrlList = list;
    }
}
