package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.PrivilegeLogExtra;

/* JADX INFO: loaded from: classes.dex */
public class BorderInfo {

    @C09CT("border_privilege_log_extra")
    public PrivilegeLogExtra borderLogExtra;

    @C09CT("icon")
    public ImageModel icon;

    @C09CT("is_taller_avatar_background")
    public boolean isTallerAvatarBackground;

    @C09CT("level")
    public long level;

    @C09CT("profile_decoration_ribbon")
    public ImageModel profileDecorationRibbon;

    @C09CT("profile_privilege_log_extra")
    public PrivilegeLogExtra ribbonLogExtra;

    @C09CT("source")
    public String source;

    @C09CT("description")
    public String description = "";

    @C09CT("name")
    public String name = "";

    @C09CT("avatar_background_border_color")
    public String avatarBackgroundBorderColor = "";

    @C09CT("name_starling_key")
    public String nameStarlingKey = "";

    @C09CT("desc_starling_key")
    public String descStarlingKey = "";

    @C09CT("avatar_background_color")
    public String avatarBackgroundColor = "";

    public final int hashCode() {
        ImageModel imageModel = this.icon;
        int iHashCode = imageModel != null ? imageModel.hashCode() : 0;
        long j = this.level;
        return (iHashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BorderInfo borderInfo = (BorderInfo) obj;
        if (this.level != borderInfo.level) {
            return false;
        }
        ImageModel imageModel = this.icon;
        ImageModel imageModel2 = borderInfo.icon;
        if (imageModel != null) {
            return imageModel.equals(imageModel2);
        }
        if (imageModel2 == null) {
            return true;
        }
        return false;
    }
}
