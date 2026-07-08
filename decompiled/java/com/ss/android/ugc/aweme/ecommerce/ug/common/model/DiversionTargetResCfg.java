package com.ss.android.ugc.aweme.ecommerce.ug.common.model;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class DiversionTargetResCfg {

    @C09CT("background_color")
    public final String backgroundColor;

    @C09CT("cart_item_id")
    public final String cartItemId;

    @C09CT("diversion_params")
    public final String diversionParams;

    @C09CT("diversion_params_extra_info")
    public final String diversionParamsExtraInfo;

    @C09CT("duration")
    public final Long duration;

    @C09CT("fetch_type")
    public final String fetchType;

    @C09CT("handle_on_ui_status")
    public final String handleOnUiStatus;

    @C09CT("handle_on_ui_sub_stage")
    public final String handleOnUiSubStage;

    @C09CT("image")
    public final DiversionImage image;

    @C09CT("need_call_update")
    public final Boolean needCallUpdate;

    @C09CT("request_params")
    public final String requestParams;

    @C09CT("schema")
    public final String schema;

    @C09CT("schema_params")
    public final String schemaParams;

    @C09CT("show_arrow")
    public final boolean showArrow;

    @C09CT("show_avatar")
    public final boolean showAvatar;

    @C09CT("show_text")
    public final boolean showText;

    @C09CT("text")
    public final String text;

    @C09CT("text_color")
    public final String textColor;

    public final String toString() {
        return "DiversionTargetResCfg(text=" + this.text + ", image=" + this.image + ", duration=" + this.duration + ", schema=" + this.schema + ", showArrow=" + this.showArrow + ", showText=" + this.showText + ", showAvatar=" + this.showAvatar + ", backgroundColor=" + this.backgroundColor + ", textColor=" + this.textColor + ", diversionParams=" + this.diversionParams + ", diversionParamsExtraInfo=" + this.diversionParamsExtraInfo + ", handleOnUiStatus=" + this.handleOnUiStatus + ", handleOnUiSubStage=" + this.handleOnUiSubStage + ", cartItemId=" + this.cartItemId + ", needCallUpdate=" + this.needCallUpdate + ", schemaParams=" + this.schemaParams + ", fetchType=" + this.fetchType + ", requestParams=" + this.requestParams + ')';
    }

    public DiversionTargetResCfg(String str, DiversionImage diversionImage, Long l, String str2, boolean z, boolean z2, boolean z3, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, String str10, String str11, String str12) {
        this.text = str;
        this.image = diversionImage;
        this.duration = l;
        this.schema = str2;
        this.showArrow = z;
        this.showText = z2;
        this.showAvatar = z3;
        this.backgroundColor = str3;
        this.textColor = str4;
        this.diversionParams = str5;
        this.diversionParamsExtraInfo = str6;
        this.handleOnUiStatus = str7;
        this.handleOnUiSubStage = str8;
        this.cartItemId = str9;
        this.needCallUpdate = bool;
        this.schemaParams = str10;
        this.fetchType = str11;
        this.requestParams = str12;
    }
}
