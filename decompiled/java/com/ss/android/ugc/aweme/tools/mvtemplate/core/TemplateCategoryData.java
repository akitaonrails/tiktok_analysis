package com.ss.android.ugc.aweme.tools.mvtemplate.core;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class TemplateCategoryData {

    @C09CT("extra")
    public final String extra;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("is_default")
    public boolean isDefault;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String key;

    @C09CT("name")
    public final String name;

    public TemplateCategoryData() {
        this("", null, null, false, null);
    }

    public final int hashCode() {
        return this.key.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("(key = ");
        sbLIZ.append(this.key);
        sbLIZ.append(", name = ");
        sbLIZ.append(this.name);
        sbLIZ.append(", iconUrl = ");
        sbLIZ.append(this.iconUrl);
        sbLIZ.append(", isDefault = ");
        sbLIZ.append(this.isDefault);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        TemplateCategoryData templateCategoryData;
        if (obj instanceof TemplateCategoryData) {
            templateCategoryData = (TemplateCategoryData) obj;
        } else {
            templateCategoryData = null;
        }
        if (templateCategoryData == null || !Intrinsics.LJFF(this.key, templateCategoryData.key) || !Intrinsics.LJFF(this.name, templateCategoryData.name) || !Intrinsics.LJFF(this.iconUrl, templateCategoryData.iconUrl) || this.isDefault != templateCategoryData.isDefault) {
            return false;
        }
        return true;
    }

    public TemplateCategoryData(String str, String str2, String str3, boolean z, String str4) {
        this.key = str;
        this.name = str2;
        this.iconUrl = str3;
        this.isDefault = z;
        this.extra = str4;
    }
}
