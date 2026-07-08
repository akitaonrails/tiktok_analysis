package com.ss.android.ugc.aweme.tako.otherpage.feed.banner;

import X.C09CT;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseVideo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.CreativeTemplateAsset;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoAITemplates {

    @C09CT("answer_msg")
    public final String answerMsg;

    @C09CT("assets")
    public final List<CreativeTemplateAsset> assets;

    @C09CT("cover_url")
    public final String coverUrl;

    @C09CT("default_std_size")
    public final Integer defaultStdSize;

    @C09CT("img_cnt")
    public final Integer imgCnt;

    @C09CT("tako_prompt")
    public final String takoPrompt;

    @C09CT("creative_task_type")
    public final String taskType;

    @C09CT("picture_url")
    public final String templateCover;

    @C09CT("template_id")
    public final String templateId;

    @C09CT("template_name")
    public final String templateName;

    @C09CT("sub_title")
    public final String templateSubTitle;

    @C09CT("videos")
    public List<BaseVideo> videos;

    public TakoAITemplates() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public final boolean LIZ() {
        return Intrinsics.LJFF(this.taskType, "text_2_image") || Intrinsics.LJFF(this.taskType, "image_2_image") || Intrinsics.LJFF(this.taskType, "text_2_video") || Intrinsics.LJFF(this.taskType, "image_2_video");
    }

    public final boolean LIZIZ() {
        return Intrinsics.LJFF(this.taskType, "ug_generate_text");
    }

    public TakoAITemplates(String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, String str8, List<CreativeTemplateAsset> list, Integer num2, List<BaseVideo> list2) {
        this.taskType = str;
        this.takoPrompt = str2;
        this.answerMsg = str3;
        this.templateId = str4;
        this.imgCnt = num;
        this.templateName = str5;
        this.templateSubTitle = str6;
        this.templateCover = str7;
        this.coverUrl = str8;
        this.assets = list;
        this.defaultStdSize = num2;
        this.videos = list2;
    }

    public TakoAITemplates(String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, String str8, List list, Integer num2, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : list, (i & 1024) == 0 ? num2 : null, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? C13BV.INSTANCE : list2);
    }
}
