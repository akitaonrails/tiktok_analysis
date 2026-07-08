package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.model.UrlModel;

/* JADX INFO: loaded from: classes.dex */
public class UserPreferVideo {

    @C09CT("cover")
    public UrlModel cover;

    @C09CT("dynamic_cover")
    public UrlModel dynamicCover;

    @C09CT("gid")
    public String gid;

    @C09CT("play_addr")
    public UrlModel video;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserPreferVideo{gid='");
        sbLIZ.append(this.gid);
        sbLIZ.append('\'');
        sbLIZ.append(", video=");
        sbLIZ.append(this.video);
        sbLIZ.append(", cover=");
        sbLIZ.append(this.cover);
        sbLIZ.append(", dynamicCover=");
        sbLIZ.append(this.dynamicCover);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public UrlModel getCover() {
        return this.cover;
    }

    public UrlModel getDynamicCover() {
        return this.dynamicCover;
    }

    public String getGid() {
        return this.gid;
    }

    public UrlModel getVideo() {
        return this.video;
    }
}
