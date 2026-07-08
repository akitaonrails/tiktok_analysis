package com.ss.android.ugc.aweme.aigc.asynctask.workflowbuilder;

import X.C09CT;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCInputItem;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class AIGCArchWorkflowInput {
    public final Map<String, String> LIZ;

    @C09CT("business_extra")
    public final Map<String, String> businessExtra;

    @C09CT("business_scene")
    public final String businessScene;

    @C09CT("creative_info")
    public final CreativeInfo creativeInfo;

    @C09CT("input_items")
    public final List<AIGCInputItem> inputItems;

    @C09CT("job_type")
    public final String jobType;

    @C09CT("output_count")
    public final int outputCount;

    @C09CT("prompt_text")
    public final String promptText;

    @C09CT("req_json")
    public final String reqJson;

    @C09CT("req_key")
    public final String reqKey;

    @C09CT("source")
    public final Source source;

    @C09CT("style_id")
    public final String styleId;

    @C09CT("trace_id")
    public final String traceId;

    public AIGCArchWorkflowInput(String str, CreativeInfo creativeInfo, List<AIGCInputItem> list, Source source, String str2, String str3, String str4, String str5, String str6, int i, String str7, Map<String, String> map, Map<String, String> map2) {
        this.traceId = str;
        this.creativeInfo = creativeInfo;
        this.inputItems = list;
        this.source = source;
        this.businessScene = str2;
        this.jobType = str3;
        this.reqKey = str4;
        this.reqJson = str5;
        this.styleId = str6;
        this.outputCount = i;
        this.promptText = str7;
        this.businessExtra = map;
        this.LIZ = map2;
    }

    public /* synthetic */ AIGCArchWorkflowInput(String str, CreativeInfo creativeInfo, List list, Source source, String str2, String str3, String str4, String str5, String str6, int i, String str7, Map map, Map map2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, creativeInfo, (i2 & 4) != 0 ? null : list, (i2 & 8) != 0 ? Source.EFFECT_AIGC : source, str2, str3, str4, str5, (i2 & 256) != 0 ? null : str6, (i2 & 512) != 0 ? 0 : i, (i2 & 1024) != 0 ? null : str7, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : map, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? map2 : null);
    }
}
