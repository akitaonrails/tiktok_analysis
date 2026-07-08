package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class MusicTabClaimInfo implements Serializable {

    @C09CT("desc")
    public String desc;

    @C09CT("desc_key")
    public String descKey;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("title")
    public String title;

    @C09CT("title_key")
    public String titleKey;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicTabClaimInfo(status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", titleKey=");
        sbLIZ.append(this.titleKey);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", descKey=");
        sbLIZ.append(this.descKey);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.desc);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MusicTabClaimInfo() {
        this(0, "", "", "", "");
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setDescKey(String str) {
        this.descKey = str;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTitleKey(String str) {
        this.titleKey = str;
    }

    public MusicTabClaimInfo(int i, String str, String str2, String str3, String str4) {
        this.status = i;
        this.titleKey = str;
        this.title = str2;
        this.descKey = str3;
        this.desc = str4;
    }
}
