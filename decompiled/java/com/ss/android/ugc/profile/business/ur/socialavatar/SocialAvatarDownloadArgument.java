package com.ss.android.ugc.profile.business.ur.socialavatar;

import X.C09CT;
import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarDownloadArgument implements Serializable {
    public static final int $stable = 8;

    @C09CT("background_style_index")
    public final Integer backgroundStyleIndex;

    @C09CT("display_background_resource")
    public final File displayBackgroundResource;

    @C09CT("download_card_resource")
    public final File downloadCardResource;

    @C09CT("download_mask_resource")
    public final File downloadMaskResource;

    @C09CT("download_static_background_resource")
    public final File downloadStaticBackgroundResource;

    @C09CT("dynamic_avatar_resource")
    public final File dynamicAvatarResource;

    @C09CT("expression_name")
    public final String expressionName;

    @C09CT("static_avatar_resource")
    public final File staticAvatarResource;

    public SocialAvatarDownloadArgument() {
        this(null, null, null, null, null, null, null, null);
    }

    public SocialAvatarDownloadArgument(File file, File file2, File file3, File file4, File file5, File file6, String str, Integer num) {
        this.displayBackgroundResource = file;
        this.downloadCardResource = file2;
        this.downloadStaticBackgroundResource = file3;
        this.downloadMaskResource = file4;
        this.staticAvatarResource = file5;
        this.dynamicAvatarResource = file6;
        this.expressionName = str;
        this.backgroundStyleIndex = num;
    }
}
