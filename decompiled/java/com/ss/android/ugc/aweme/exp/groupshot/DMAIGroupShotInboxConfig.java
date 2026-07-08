package com.ss.android.ugc.aweme.exp.groupshot;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
public final class DMAIGroupShotInboxConfig {

    @C09CT("banner_image_url")
    public final String bannerImageFileName;

    @C09CT("popup_hide_text")
    public final int popupHideText;

    @C09CT("popup_image_url")
    public final String popupImageFileName;

    @C09CT("popup_version")
    public final int popupVersion;

    @C09CT("template_resource_ids")
    public final List<String> templateResourceIds;

    @C09CT("version")
    public final int version;

    public DMAIGroupShotInboxConfig() {
        this(null, null, 0, null, 0, 0, 63, null);
    }

    public DMAIGroupShotInboxConfig(String str, String str2, int i, List<String> list, int i2, int i3) {
        this.bannerImageFileName = str;
        this.popupImageFileName = str2;
        this.popupHideText = i;
        this.templateResourceIds = list;
        this.version = i2;
        this.popupVersion = i3;
    }

    public DMAIGroupShotInboxConfig(String str, String str2, int i, List list, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) == 0 ? str2 : "", (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? C13BV.INSTANCE : list, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? 0 : i3);
    }
}
