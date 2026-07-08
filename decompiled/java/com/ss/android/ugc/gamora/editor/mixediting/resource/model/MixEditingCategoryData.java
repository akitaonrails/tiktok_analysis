package com.ss.android.ugc.gamora.editor.mixediting.resource.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class MixEditingCategoryData {

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("is_default")
    public final boolean isDefault;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String key;

    @C09CT("name")
    public final String name;

    public MixEditingCategoryData() {
        this("", null, null, false);
    }

    public final int hashCode() {
        return this.key.hashCode();
    }

    public final String toString() {
        return String.valueOf(this.name);
    }

    public final boolean equals(Object obj) {
        MixEditingCategoryData mixEditingCategoryData;
        if (obj instanceof MixEditingCategoryData) {
            mixEditingCategoryData = (MixEditingCategoryData) obj;
        } else {
            mixEditingCategoryData = null;
        }
        if (mixEditingCategoryData == null || !Intrinsics.LJFF(this.key, mixEditingCategoryData.key) || !Intrinsics.LJFF(this.name, mixEditingCategoryData.name) || !Intrinsics.LJFF(this.iconUrl, mixEditingCategoryData.iconUrl) || this.isDefault != mixEditingCategoryData.isDefault) {
            return false;
        }
        return true;
    }

    public MixEditingCategoryData(String str, String str2, String str3, boolean z) {
        this.key = str;
        this.name = str2;
        this.iconUrl = str3;
        this.isDefault = z;
    }
}
