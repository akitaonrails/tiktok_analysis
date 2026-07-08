package com.ss.android.ugc.aweme.feed.model.search;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class VisualSearchInfoStruct implements Serializable {

    @C09CT("api_control_info")
    public String apiControlInfo;

    @C09CT("author_visual_search_enable")
    public Integer authorVisualSearchEnable;

    @C09CT("disable_ecom_content_type")
    public Integer disableEcomContentType;

    @C09CT("ecom_nocart_entrance_enable_type")
    public Integer ecomNoCartEntranceEnableType;

    @C09CT("fallback_vtag_enable")
    public Boolean fallbackVtagEnable;

    @C09CT("fallback_vtag_enable_type")
    public Integer fallbackVtagEnableType;

    @C09CT("fallback_vtag_info")
    public VisualSearchFallbackInfo fallbackVtagInfo;

    @C09CT("long_press_entrance_enable")
    public Boolean longPressEntranceEnable;

    @C09CT("vtag_enable")
    public Boolean remoteVtagEnable;

    @C09CT("screenshot_entrance_enable")
    public Integer screenshotEntranceStatus;

    @C09CT("visual_search_intent_level")
    public Integer visualSearchIntentLevel;

    @C09CT("vtag_enable_type")
    public Integer vtagEnableType;

    @C09CT("vtag_info")
    public List<VTagStruct> vtags;

    public VisualSearchInfoStruct() {
        this(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, null, 0, 0, 0, null, null, null, null, 0, 0);
    }

    public final VisualSearchInfoStruct copy(Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, VisualSearchFallbackInfo visualSearchFallbackInfo, List<VTagStruct> list, Integer num6, Integer num7) {
        return new VisualSearchInfoStruct(bool, bool2, bool3, num, num2, num3, num4, num5, str, visualSearchFallbackInfo, list, num6, num7);
    }

    public VisualSearchInfoStruct(Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, VisualSearchFallbackInfo visualSearchFallbackInfo, List<VTagStruct> list, Integer num6, Integer num7) {
        this.remoteVtagEnable = bool;
        this.longPressEntranceEnable = bool2;
        this.fallbackVtagEnable = bool3;
        this.visualSearchIntentLevel = num;
        this.screenshotEntranceStatus = num2;
        this.vtagEnableType = num3;
        this.fallbackVtagEnableType = num4;
        this.disableEcomContentType = num5;
        this.apiControlInfo = str;
        this.fallbackVtagInfo = visualSearchFallbackInfo;
        this.vtags = list;
        this.ecomNoCartEntranceEnableType = num6;
        this.authorVisualSearchEnable = num7;
    }
}
