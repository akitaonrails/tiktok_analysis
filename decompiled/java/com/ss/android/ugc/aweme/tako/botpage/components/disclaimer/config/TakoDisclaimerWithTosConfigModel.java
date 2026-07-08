package com.ss.android.ugc.aweme.tako.botpage.components.disclaimer.config;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoDisclaimerWithTosConfigModel {

    @C09CT("confirm_button_active_entrance")
    public final String confirmButtonActiveEntrance;

    @C09CT("confirm_button_passive_entrance")
    public final String confirmButtonPassiveEntrance;

    @C09CT("content_learn_more")
    public final String contentLearnMore;

    @C09CT("content_bullet_parts")
    public final List<String> contentParagraphs;

    @C09CT("content_tos_and_policy")
    public final String contentTosAndPolicy;

    @C09CT("new_title")
    public final String newTitle;

    @C09CT("placeholders")
    public final Map<String, PlaceholderInfoModel> placeholders;

    @C09CT("refuse_button")
    public final String refuseButton;

    @C09CT("title")
    public final String title;

    @C09CT("title_placeholder")
    public final String titlePlaceholder;

    public TakoDisclaimerWithTosConfigModel() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public TakoDisclaimerWithTosConfigModel(String str, String str2, String str3, String str4, String str5, List<String> list, String str6, String str7, String str8, Map<String, PlaceholderInfoModel> map) {
        this.title = str;
        this.newTitle = str2;
        this.titlePlaceholder = str3;
        this.contentLearnMore = str4;
        this.contentTosAndPolicy = str5;
        this.contentParagraphs = list;
        this.confirmButtonActiveEntrance = str6;
        this.confirmButtonPassiveEntrance = str7;
        this.refuseButton = str8;
        this.placeholders = map;
    }

    public TakoDisclaimerWithTosConfigModel(String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, String str8, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? C13BV.INSTANCE : list, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) == 0 ? str8 : "", (i & 512) != 0 ? C2097608Jq.LJ() : map);
    }
}
