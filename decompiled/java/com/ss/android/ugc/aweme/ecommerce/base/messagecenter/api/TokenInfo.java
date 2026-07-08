package com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api;

import X.C09CT;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
public final class TokenInfo {

    @C09CT("api_url")
    public final String apiUrl;

    @C09CT("app_id")
    public final int appId;

    @C09CT("app_key")
    public final String appKey;

    @C09CT("biz_service_id")
    public final int bizServiceId;

    @C09CT("env")
    public final String env;

    @C09CT("fp_id")
    public final int fpId;

    @C09CT("frontier_service_id")
    public final int frontierServiceId;

    @C09CT("frontier_urls")
    public final List<Object> frontierUrls;

    @C09CT("idc_region")
    public final String idcRegion;

    @C09CT("im_buyer_id")
    public final String imBuyerId;

    @C09CT("token")
    public final String token;

    @C09CT("ws_url")
    public final String wsUrl;

    public TokenInfo() {
        this(null, null, null, null, 0, null, null, 0, 0, null, 0, null, 4095, null);
    }

    public TokenInfo(String str, String str2, String str3, String str4, int i, String str5, List<Object> list, int i2, int i3, String str6, int i4, String str7) {
        this.token = str;
        this.env = str2;
        this.idcRegion = str3;
        this.wsUrl = str4;
        this.bizServiceId = i;
        this.apiUrl = str5;
        this.frontierUrls = list;
        this.appId = i2;
        this.fpId = i3;
        this.appKey = str6;
        this.frontierServiceId = i4;
        this.imBuyerId = str7;
    }

    public TokenInfo(String str, String str2, String str3, String str4, int i, String str5, List list, int i2, int i3, String str6, int i4, String str7, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? "" : str2, (i5 & 4) != 0 ? "" : str3, (i5 & 8) != 0 ? "" : str4, (i5 & 16) != 0 ? 0 : i, (i5 & 32) != 0 ? "" : str5, (i5 & 64) != 0 ? C13BV.INSTANCE : list, (i5 & 128) != 0 ? 0 : i2, (i5 & 256) != 0 ? 0 : i3, (i5 & 512) != 0 ? "" : str6, (i5 & 1024) == 0 ? i4 : 0, (i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? str7 : "");
    }
}
