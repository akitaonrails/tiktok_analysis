package com.ss.android.ugc.aweme.shortvideo.model;

import X.C09CT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes30.dex */
public final class AnchorPublishStruct {
    public static final Companion Companion = new Companion();

    @C09CT("add_container_mode")
    public int addContainerMode;

    @C09CT("added_icon")
    public final UrlModel addedIcon;

    @C09CT("operation_anchor_source")
    public final String anchorSource;

    @C09CT("anchor_tips")
    public String anchorTips;

    @C09CT("product_link_id")
    public String baProductLinkId;

    @C09CT("product_link_state")
    public int baProductLinkState;

    @C09CT("click_action")
    public int clickAction;

    @C09CT("consume_url")
    public final String consumeUrl;

    @C09CT("content")
    public final String content;

    @C09CT("desc")
    public final String desc;

    @C09CT("direct_add")
    public final boolean directAdd;

    @C09CT("display")
    public final boolean display;
    public transient boolean enable;
    public transient ExtensionMisc extensionMisc;

    @C09CT("general_type")
    public int generalType;

    @C09CT("leads_state")
    public int getLeadsAnchorState;

    @C09CT("leads_pageid")
    public String getLeadsPageId;
    public transient boolean hadNew;

    @C09CT("hashtag")
    public final String hashtag;

    @C09CT("icon")
    public final UrlModel icon;

    @C09CT("is_beta")
    public final boolean isBeta;
    public transient Boolean isEcIncrementalCreator;

    @C09CT("is_new")
    public boolean isNew;

    @C09CT("is_recommend")
    public boolean isRecommend;

    @C09CT("keyword")
    public final String keyword;

    @C09CT("log_extra")
    public final String logExtra;
    public transient Function0<Unit> onClickAction;
    public transient Function0<Unit> onReplaceSoundClickAction;

    @C09CT("schema_url")
    public final String scheme;

    @C09CT("scope")
    public final int scope;

    @C09CT("subtitle")
    public final String subtitle;

    @C09CT("subtype")
    public final String subtype;

    @C09CT("text_after_direct_add")
    public final String textAfterDirectAdd;

    @C09CT("title")
    public final String title;

    @C09CT("type")
    public final int type;

    @C09CT("web_url")
    public final String webUrl;

    public static final boolean isAnchorSourceFromNova(String str) {
        return Companion.isAnchorSourceFromNova(str);
    }

    public final boolean getEcIncrementalCreator() {
        boolean zOptBoolean;
        Boolean boolValueOf;
        if (this.isEcIncrementalCreator == null) {
            if (this.content != null) {
                try {
                    zOptBoolean = new JSONObject(this.content).optBoolean("is_incr_anchor_permission", false);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    zOptBoolean = false;
                }
                boolValueOf = Boolean.valueOf(zOptBoolean);
            } else {
                boolValueOf = Boolean.FALSE;
            }
            this.isEcIncrementalCreator = boolValueOf;
        }
        Boolean bool = this.isEcIncrementalCreator;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean isBeta() {
        return this.isBeta;
    }

    public final boolean isNew() {
        return this.isNew;
    }

    public final boolean isRecommend() {
        return this.isRecommend;
    }

    public static final class Companion {
        public final boolean isAnchorSourceFromNova(String str) {
            if (str != null) {
                return u.LJIJI(str, "nova", true);
            }
            return false;
        }
    }

    public final void setAddContainerMode(int i) {
        this.addContainerMode = i;
    }

    public final void setAnchorTips(String str) {
        this.anchorTips = str;
    }

    public final void setBaProductLinkId(String str) {
        this.baProductLinkId = str;
    }

    public final void setBaProductLinkState(int i) {
        this.baProductLinkState = i;
    }

    public final void setClickAction(int i) {
        this.clickAction = i;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setExtensionMisc(ExtensionMisc extensionMisc) {
        this.extensionMisc = extensionMisc;
    }

    public final void setGeneralType(int i) {
        this.generalType = i;
    }

    public final void setGetLeadsAnchorState(int i) {
        this.getLeadsAnchorState = i;
    }

    public final void setGetLeadsPageId(String str) {
        this.getLeadsPageId = str;
    }

    public final void setHadNew(boolean z) {
        this.hadNew = z;
    }

    public final void setNew(boolean z) {
        this.isNew = z;
    }

    public final void setOnClickAction(Function0<Unit> function0) {
        this.onClickAction = function0;
    }

    public final void setOnReplaceSoundClickAction(Function0<Unit> function0) {
        this.onReplaceSoundClickAction = function0;
    }

    public final void setRecommend(boolean z) {
        this.isRecommend = z;
    }

    public AnchorPublishStruct(int i, UrlModel urlModel, String str, String str2, String str3, UrlModel urlModel2, String str4, String str5, boolean z, boolean z2, String str6, String str7, int i2, Function0<Unit> function0, Function0<Unit> function02, ExtensionMisc extensionMisc, boolean z3, String str8, String str9, boolean z4, String str10, String str11, boolean z5, int i3, String str12, boolean z6, boolean z7, String str13, int i4, String str14, int i5, int i6, int i7, String str15, String str16) {
        this.type = i;
        this.icon = urlModel;
        this.title = str;
        this.anchorSource = str2;
        this.webUrl = str3;
        this.addedIcon = urlModel2;
        this.desc = str4;
        this.content = str5;
        this.isRecommend = z;
        this.isBeta = z2;
        this.hashtag = str6;
        this.anchorTips = str7;
        this.scope = i2;
        this.onClickAction = function0;
        this.onReplaceSoundClickAction = function02;
        this.extensionMisc = extensionMisc;
        this.enable = z3;
        this.scheme = str8;
        this.logExtra = str9;
        this.isNew = z4;
        this.subtitle = str10;
        this.subtype = str11;
        this.hadNew = z5;
        this.getLeadsAnchorState = i3;
        this.getLeadsPageId = str12;
        this.display = z6;
        this.directAdd = z7;
        this.textAfterDirectAdd = str13;
        this.baProductLinkState = i4;
        this.baProductLinkId = str14;
        this.generalType = i5;
        this.clickAction = i6;
        this.addContainerMode = i7;
        this.keyword = str15;
        this.consumeUrl = str16;
    }
}
