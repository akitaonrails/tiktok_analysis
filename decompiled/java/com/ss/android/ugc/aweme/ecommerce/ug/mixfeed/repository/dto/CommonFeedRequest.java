package com.ss.android.ugc.aweme.ecommerce.ug.mixfeed.repository.dto;

import X.C09CT;
import X.C13BV;
import com.bytedance.scene.Scene;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class CommonFeedRequest {

    @C09CT("context_product_ids")
    public final List<Long> contextProductIds;

    @C09CT("cursor")
    public final Integer cursor;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("enter_from_merge")
    public final String enterFromMerge;

    @C09CT("exposure_item_list")
    public final List<Feed> exposureItemList;

    @C09CT("extra_params")
    public final String extraParams;

    @C09CT("page_name")
    public final String pageName;

    @C09CT("related_gid")
    public final Long relatedGid;

    @C09CT("related_gid_info")
    public final RelatedGidInfo relatedGidInfo;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("session_id")
    public final String sessionId;

    @C09CT("size")
    public final Integer size;

    @C09CT("sub_scene")
    public final String subScene;

    @C09CT("traffic_source")
    public final Integer trafficSource;

    @C09CT("traffic_source_list")
    public final List<Integer> trafficSourceList;

    public CommonFeedRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    public CommonFeedRequest(String str, String str2, Integer num, Integer num2, String str3, List<Feed> list, List<Long> list2, Integer num3, List<Integer> list3, String str4, String str5, Long l, RelatedGidInfo relatedGidInfo, String str6, String str7) {
        this.scene = str;
        this.subScene = str2;
        this.size = num;
        this.cursor = num2;
        this.sessionId = str3;
        this.exposureItemList = list;
        this.contextProductIds = list2;
        this.trafficSource = num3;
        this.trafficSourceList = list3;
        this.enterFrom = str4;
        this.enterFromMerge = str5;
        this.relatedGid = l;
        this.relatedGidInfo = relatedGidInfo;
        this.pageName = str6;
        this.extraParams = str7;
    }

    public CommonFeedRequest(String str, String str2, Integer num, Integer num2, String str3, List list, List list2, Integer num3, List list3, String str4, String str5, Long l, RelatedGidInfo relatedGidInfo, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? C13BV.INSTANCE : list, (i & 64) != 0 ? null : list2, (i & 128) != 0 ? null : num3, (i & 256) != 0 ? null : list3, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? null : str5, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : l, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : relatedGidInfo, (i & 8192) != 0 ? null : str6, (i & 16384) == 0 ? str7 : null);
    }
}
