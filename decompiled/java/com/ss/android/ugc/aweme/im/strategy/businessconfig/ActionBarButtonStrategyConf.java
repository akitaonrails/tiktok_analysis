package com.ss.android.ugc.aweme.im.strategy.businessconfig;

import X.C09CT;
import X.C909100ZlU;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public final class ActionBarButtonStrategyConf {
    public static final C909100ZlU Companion = new Object() { // from class: X.0ZlU
    };
    public static final String TYPE = "type";

    @C09CT("action_schema")
    public final String actionSchema;

    @C09CT("animate_type")
    public final String animateType;

    @C09CT("animate_url")
    public final String animateUrl;

    @C09CT("button_id")
    public final String buttonId;

    @C09CT("click_action_schema")
    public final String clickActionSchema;

    @C09CT("display_name")
    public final String displayName;

    @C09CT("display_name_lang")
    public final DisplayNameLang displayNameLang;

    @C09CT("flip_icon_on_rtl")
    public final boolean flipIconOnRTL;

    @C09CT("height")
    public final Integer height;

    @C09CT("icon")
    public final String icon;

    @C09CT("icon_dark")
    public final String iconDark;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("light_interaction_name")
    public final String lightInteractionName;

    @C09CT("resource_id")
    public final String resourceId;

    @C09CT("resource_name")
    public final String resourceName;

    @C09CT("scp_biz_extra")
    public final Map<String, String> scpBizExtra;

    @C09CT("sequence")
    public final Float sequence;

    @C09CT("sort_logic")
    public final String sortLogic;

    @C09CT("static_type")
    public final String staticType;

    @C09CT("static_url")
    public final String staticUrl;

    @C09CT("title")
    public final String title;

    @C09CT("type")
    public final Integer type;

    @C09CT("width")
    public final Integer width;

    public ActionBarButtonStrategyConf() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null);
    }

    public final ActionBarButtonStrategyConf copy(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num2, Integer num3, String str8, String str9, String str10, String str11, DisplayNameLang displayNameLang, String str12, String str13, boolean z, Float f, String str14, String str15, String str16, Map<String, String> map) {
        return new ActionBarButtonStrategyConf(num, str, str2, str3, str4, str5, str6, str7, num2, num3, str8, str9, str10, str11, displayNameLang, str12, str13, z, f, str14, str15, str16, map);
    }

    public ActionBarButtonStrategyConf(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num2, Integer num3, String str8, String str9, String str10, String str11, DisplayNameLang displayNameLang, String str12, String str13, boolean z, Float f, String str14, String str15, String str16, Map<String, String> map) {
        this.type = num;
        this.actionSchema = str;
        this.title = str2;
        this.icon = str3;
        this.iconDark = str4;
        this.id = str5;
        this.resourceId = str6;
        this.displayName = str7;
        this.width = num2;
        this.height = num3;
        this.staticUrl = str8;
        this.animateUrl = str9;
        this.staticType = str10;
        this.animateType = str11;
        this.displayNameLang = displayNameLang;
        this.resourceName = str12;
        this.lightInteractionName = str13;
        this.flipIconOnRTL = z;
        this.sequence = f;
        this.buttonId = str14;
        this.sortLogic = str15;
        this.clickActionSchema = str16;
        this.scpBizExtra = map;
    }
}
