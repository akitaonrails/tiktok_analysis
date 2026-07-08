package com.ss.android.ugc.aweme.creationeoycard;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class CreationEoyCardData implements Serializable {

    @C09CT("action_button_hint")
    public final String actionButtonHint;

    @C09CT("back_ground_image_url")
    public final String backGroundImageUrl;

    @C09CT("cover_image_url")
    public final String coverImageUrl;

    @C09CT("icon_color_list")
    public final List<String> iconColorList;

    @C09CT("privacy_hint")
    public final String privacyHint;

    @C09CT("privacy_hint_color_list")
    public final List<String> privacyHintColorList;

    @C09CT("schema_format")
    public final String schema;

    @C09CT("title")
    public final String title;

    @C09CT("title_color_list")
    public final List<String> titleColorList;

    public CreationEoyCardData() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public CreationEoyCardData(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, List<String> list2, List<String> list3) {
        this.title = str;
        this.privacyHint = str2;
        this.schema = str3;
        this.actionButtonHint = str4;
        this.backGroundImageUrl = str5;
        this.coverImageUrl = str6;
        this.titleColorList = list;
        this.iconColorList = list2;
        this.privacyHintColorList = list3;
    }
}
