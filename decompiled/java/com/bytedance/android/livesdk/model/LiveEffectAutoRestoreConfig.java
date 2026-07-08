package com.bytedance.android.livesdk.model;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveEffectAutoRestoreConfig {

    @C09CT("category_key")
    public final String categoryKey;

    @C09CT("click_uri")
    public final String clickUri;

    @C09CT("content_uri")
    public final String contentUri;

    @C09CT("effect_panel")
    public final String effectPanel;

    @C09CT("image_path")
    public final String imagePath;

    @C09CT("effect_md5")
    public final String md5;

    @C09CT("resource_id")
    public final String resourceId;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveEffectAutoRestoreConfig(resourceId=");
        sbLIZ.append(this.resourceId);
        sbLIZ.append(", categoryKey=");
        sbLIZ.append(this.categoryKey);
        sbLIZ.append(", imagePath=");
        sbLIZ.append(this.imagePath);
        sbLIZ.append(", effectPanel=");
        sbLIZ.append(this.effectPanel);
        sbLIZ.append(", contentUri=");
        sbLIZ.append(this.contentUri);
        sbLIZ.append(", clickUri=");
        sbLIZ.append(this.clickUri);
        sbLIZ.append(", md5=");
        sbLIZ.append(this.md5);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LiveEffectAutoRestoreConfig() {
        this("", "", "", "", "", "", "");
    }

    public LiveEffectAutoRestoreConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.resourceId = str;
        this.categoryKey = str2;
        this.imagePath = str3;
        this.effectPanel = str4;
        this.contentUri = str5;
        this.clickUri = str6;
        this.md5 = str7;
    }
}
