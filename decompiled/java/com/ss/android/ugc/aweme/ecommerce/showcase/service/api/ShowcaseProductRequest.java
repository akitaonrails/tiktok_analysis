package com.ss.android.ugc.aweme.ecommerce.showcase.service.api;

import X.C09CT;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class ShowcaseProductRequest {

    @C09CT("count")
    public final int count;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("exposed_product_id_list")
    public final String[] exposedProductIdList;

    @C09CT("kol_id")
    public final String kolId;

    @C09CT("next_scroll_param")
    public final String nextScrollParam;

    @C09CT("page_source_info")
    public final String pageSourceInfo;

    @C09CT("ec_common_api_preload")
    public final int prefetchReq;

    @C09CT("protocol_version")
    public final Integer protocolVersion;

    @C09CT("recommend_context")
    public final String recommendContext;

    @C09CT("search_card_live_product_id_list")
    public final List<String> searchCardLiveProductIds;

    @C09CT("search_card_no_live_product_id_list")
    public final List<String> searchCardNoLiveProductIds;

    @C09CT("session_id")
    public final String sessionId;

    @C09CT("video_id")
    public final String videoId;

    @C09CT("video_product_id")
    public final List<String> videoProductIds;

    public ShowcaseProductRequest(String str, String str2, String str3, String str4, int i, String[] strArr, List<String> list, List<String> list2, String str5, String str6, int i2, Integer num, List<String> list3, String str7) {
        this.kolId = str;
        this.sessionId = str2;
        this.enterFrom = str3;
        this.nextScrollParam = str4;
        this.count = i;
        this.exposedProductIdList = strArr;
        this.searchCardLiveProductIds = list;
        this.searchCardNoLiveProductIds = list2;
        this.recommendContext = str5;
        this.pageSourceInfo = str6;
        this.prefetchReq = i2;
        this.protocolVersion = num;
        this.videoProductIds = list3;
        this.videoId = str7;
    }

    public ShowcaseProductRequest(String str, String str2, String str3, String str4, int i, String[] strArr, List list, List list2, String str5, String str6, int i2, Integer num, List list3, String str7, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i3 & 8) != 0 ? CardStruct.IStatusCode.DEFAULT : str4, (i3 & 16) != 0 ? 10 : i, (i3 & 32) != 0 ? new String[0] : strArr, (i3 & 64) != 0 ? C13BV.INSTANCE : list, (i3 & 128) != 0 ? C13BV.INSTANCE : list2, (i3 & 256) != 0 ? null : str5, (i3 & 512) != 0 ? null : str6, (i3 & 1024) != 0 ? 0 : i2, (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : num, (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : list3, (i3 & 8192) == 0 ? str7 : null);
    }
}
