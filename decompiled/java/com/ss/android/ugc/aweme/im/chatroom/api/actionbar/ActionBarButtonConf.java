package com.ss.android.ugc.aweme.im.chatroom.api.actionbar;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class ActionBarButtonConf {

    @C09CT("action_schema")
    public final String actionSchema;

    @C09CT("animate_type")
    public final String animateType;

    @C09CT("animate_url")
    public final String animateUrl;

    @C09CT("biz_extra")
    public final String bizExtra;

    @C09CT("button_id")
    public final String buttonId;

    @C09CT("click_action_schema")
    public final String clickActionSchema;

    @C09CT("display_name")
    public final String displayName;

    @C09CT("display_name_lang")
    public final DisplayNameLang displayNameLang;

    @C09CT("extra_mob_params")
    public HashMap<String, String> extraMobParams;

    @C09CT("flip_icon_on_rtl")
    public final boolean flipIconOnRTL;

    @C09CT("height")
    public final Integer height;

    @C09CT("icon")
    public final String icon;

    @C09CT("icon_dark")
    public final String iconDark;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final Long id;

    @C09CT("is_show")
    public final boolean isShow;

    @C09CT("light_interaction_name")
    public final String lightInteractionName;

    @C09CT("resource_id")
    public final Long resourceId;

    @C09CT("resource_name")
    public final String resourceName;

    @C09CT("scp_biz_extra")
    public final Map<String, String> scpBizExtra;

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

    public ActionBarButtonConf() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, true, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionBarButtonConf)) {
            return false;
        }
        ActionBarButtonConf actionBarButtonConf = (ActionBarButtonConf) obj;
        return Intrinsics.LJFF(this.type, actionBarButtonConf.type) && Intrinsics.LJFF(this.actionSchema, actionBarButtonConf.actionSchema) && Intrinsics.LJFF(this.title, actionBarButtonConf.title) && Intrinsics.LJFF(this.icon, actionBarButtonConf.icon) && Intrinsics.LJFF(this.iconDark, actionBarButtonConf.iconDark) && Intrinsics.LJFF(this.id, actionBarButtonConf.id) && Intrinsics.LJFF(this.resourceId, actionBarButtonConf.resourceId) && Intrinsics.LJFF(this.displayName, actionBarButtonConf.displayName) && Intrinsics.LJFF(this.width, actionBarButtonConf.width) && Intrinsics.LJFF(this.height, actionBarButtonConf.height) && Intrinsics.LJFF(this.staticUrl, actionBarButtonConf.staticUrl) && Intrinsics.LJFF(this.animateUrl, actionBarButtonConf.animateUrl) && Intrinsics.LJFF(this.staticType, actionBarButtonConf.staticType) && Intrinsics.LJFF(this.animateType, actionBarButtonConf.animateType) && Intrinsics.LJFF(this.displayNameLang, actionBarButtonConf.displayNameLang) && Intrinsics.LJFF(this.resourceName, actionBarButtonConf.resourceName) && Intrinsics.LJFF(this.lightInteractionName, actionBarButtonConf.lightInteractionName) && this.flipIconOnRTL == actionBarButtonConf.flipIconOnRTL && Intrinsics.LJFF(this.bizExtra, actionBarButtonConf.bizExtra) && Intrinsics.LJFF(this.extraMobParams, actionBarButtonConf.extraMobParams) && this.isShow == actionBarButtonConf.isShow && Intrinsics.LJFF(this.buttonId, actionBarButtonConf.buttonId) && Intrinsics.LJFF(this.sortLogic, actionBarButtonConf.sortLogic) && Intrinsics.LJFF(this.clickActionSchema, actionBarButtonConf.clickActionSchema) && Intrinsics.LJFF(this.scpBizExtra, actionBarButtonConf.scpBizExtra);
    }

    public final boolean isShow() {
        return this.isShow;
    }

    public final void setExtraMobParams(HashMap<String, String> map) {
        this.extraMobParams = map;
    }

    public ActionBarButtonConf(Integer num, String str, String str2, String str3, String str4, Long l, Long l2, String str5, Integer num2, Integer num3, String str6, String str7, String str8, String str9, DisplayNameLang displayNameLang, String str10, String str11, boolean z, String str12, HashMap<String, String> map, boolean z2, String str13, String str14, String str15, Map<String, String> map2) {
        this.type = num;
        this.actionSchema = str;
        this.title = str2;
        this.icon = str3;
        this.iconDark = str4;
        this.id = l;
        this.resourceId = l2;
        this.displayName = str5;
        this.width = num2;
        this.height = num3;
        this.staticUrl = str6;
        this.animateUrl = str7;
        this.staticType = str8;
        this.animateType = str9;
        this.displayNameLang = displayNameLang;
        this.resourceName = str10;
        this.lightInteractionName = str11;
        this.flipIconOnRTL = z;
        this.bizExtra = str12;
        this.extraMobParams = map;
        this.isShow = z2;
        this.buttonId = str13;
        this.sortLogic = str14;
        this.clickActionSchema = str15;
        this.scpBizExtra = map2;
    }
}
