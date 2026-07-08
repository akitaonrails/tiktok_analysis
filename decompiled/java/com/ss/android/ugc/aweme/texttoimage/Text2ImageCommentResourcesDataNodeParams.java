package com.ss.android.ugc.aweme.texttoimage;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Text2ImageCommentResourcesDataNodeParams {

    @C09CT("font")
    public String font;

    @C09CT("fontSize")
    public Float fontSize;

    @C09CT("key")
    public String key;

    @C09CT("style")
    public Text2ImageCommentResourcesStyleParams style;

    @C09CT("text")
    public String text;

    @C09CT("value")
    public List<Text2ImageCommentResourcesResIdParams> value;

    /* JADX WARN: Multi-variable type inference failed */
    public Text2ImageCommentResourcesDataNodeParams() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Text2ImageCommentResourcesDataNodeParams)) {
            return false;
        }
        Text2ImageCommentResourcesDataNodeParams text2ImageCommentResourcesDataNodeParams = (Text2ImageCommentResourcesDataNodeParams) obj;
        return Intrinsics.LJFF(this.key, text2ImageCommentResourcesDataNodeParams.key) && Intrinsics.LJFF(this.value, text2ImageCommentResourcesDataNodeParams.value) && Intrinsics.LJFF(this.style, text2ImageCommentResourcesDataNodeParams.style) && Intrinsics.LJFF(this.text, text2ImageCommentResourcesDataNodeParams.text) && Intrinsics.LJFF(this.font, text2ImageCommentResourcesDataNodeParams.font) && Intrinsics.LJFF(this.fontSize, text2ImageCommentResourcesDataNodeParams.fontSize);
    }

    public final int hashCode() {
        String str = this.key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Text2ImageCommentResourcesResIdParams> list = this.value;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Text2ImageCommentResourcesStyleParams text2ImageCommentResourcesStyleParams = this.style;
        int iHashCode3 = (iHashCode2 + (text2ImageCommentResourcesStyleParams == null ? 0 : text2ImageCommentResourcesStyleParams.hashCode())) * 31;
        String str2 = this.text;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.font;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f = this.fontSize;
        return iHashCode5 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Text2ImageCommentResourcesDataNodeParams(key=");
        sbLIZ.append(this.key);
        sbLIZ.append(", value=");
        sbLIZ.append(this.value);
        sbLIZ.append(", style=");
        sbLIZ.append(this.style);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", font=");
        sbLIZ.append(this.font);
        sbLIZ.append(", fontSize=");
        sbLIZ.append(this.fontSize);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Text2ImageCommentResourcesDataNodeParams(String str, List<Text2ImageCommentResourcesResIdParams> list, Text2ImageCommentResourcesStyleParams text2ImageCommentResourcesStyleParams, String str2, String str3, Float f) {
        this.key = str;
        this.value = list;
        this.style = text2ImageCommentResourcesStyleParams;
        this.text = str2;
        this.font = str3;
        this.fontSize = f;
    }

    public /* synthetic */ Text2ImageCommentResourcesDataNodeParams(String str, List list, Text2ImageCommentResourcesStyleParams text2ImageCommentResourcesStyleParams, String str2, String str3, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : text2ImageCommentResourcesStyleParams, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) == 0 ? f : null);
    }
}
