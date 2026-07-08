package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class ConvertStyleItem implements Serializable {

    @C09CT("image_style")
    public final String imageStyle;

    @C09CT("name_starling")
    public final String nameStarling;

    @C09CT("pic_url")
    public final String picUrl;

    @C09CT("style_prompt_content")
    public final String stylePromptContent;

    @C09CT("translated_name")
    public final String translatedName;

    public ConvertStyleItem() {
        this("", null, null, "", null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConvertStyleItem)) {
            return false;
        }
        ConvertStyleItem convertStyleItem = (ConvertStyleItem) obj;
        return Intrinsics.LJFF(this.imageStyle, convertStyleItem.imageStyle) && Intrinsics.LJFF(this.nameStarling, convertStyleItem.nameStarling) && Intrinsics.LJFF(this.translatedName, convertStyleItem.translatedName) && Intrinsics.LJFF(this.picUrl, convertStyleItem.picUrl) && Intrinsics.LJFF(this.stylePromptContent, convertStyleItem.stylePromptContent);
    }

    public int hashCode() {
        int iHashCode = this.imageStyle.hashCode() * 31;
        String str = this.nameStarling;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.translatedName;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.picUrl.hashCode()) * 31;
        String str3 = this.stylePromptContent;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public ConvertStyleItem(String str, String str2, String str3, String str4, String str5) {
        this.imageStyle = str;
        this.nameStarling = str2;
        this.translatedName = str3;
        this.picUrl = str4;
        this.stylePromptContent = str5;
    }
}
