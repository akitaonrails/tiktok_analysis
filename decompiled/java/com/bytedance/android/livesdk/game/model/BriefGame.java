package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class BriefGame {

    @C09CT("android_package")
    public String androidPackage;

    @C09CT("icon")
    public String icon;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public Long id;

    @C09CT("id_str")
    public String idStr;

    @C09CT("ios_bundle_id")
    public String iosBundleId;

    @C09CT("labels")
    public List<String> labels;

    @C09CT("name")
    public String name;

    @C09CT("open_gll")
    public int openGll;

    @C09CT("header_image_url")
    public String headerImageUrl = "";

    @C09CT("game_tag_name")
    public String gameTagName = "";

    @C09CT("game_tag_id")
    public String gameTagId = "";

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.idStr != null) {
            sb.append(", id_str=");
            sb.append(this.idStr);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.icon != null) {
            sb.append(", icon=");
            sb.append(this.icon);
        }
        List<String> list = this.labels;
        if (list != null && !list.isEmpty()) {
            sb.append(", labels=");
            sb.append(this.labels);
        }
        if (this.androidPackage != null) {
            sb.append(", android_package=");
            sb.append(this.androidPackage);
        }
        if (this.iosBundleId != null) {
            sb.append(", ios_bundle_id=");
            sb.append(this.iosBundleId);
        }
        sb.replace(0, 2, "BriefGame{");
        sb.append('}');
        return sb.toString();
    }
}
