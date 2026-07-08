package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes28.dex */
public final class CreativeTemplate {

    @C09CT("assets")
    public final List<CreativeTemplateAsset> assets;

    @C09CT("button_text")
    public final String buttonText;

    @C09CT("default_std_size")
    public final Integer defaultStdSize;

    @C09CT("name_text")
    public final String nameText;

    @C09CT("picture_url")
    public final String pictureUrl;

    @C09CT("process_type")
    public final int processType;

    @C09CT("skill_info")
    public final String skillInfo;

    @C09CT("sub_title")
    public final String subTitle;

    @C09CT("tags")
    public final List<CreativeTemplateTag> tags;

    @C09CT("template_id")
    public final String templateId;

    @C09CT("template_prompt")
    public final String templatePrompt;

    @C09CT("generate_type")
    public final Integer templateType;

    @C09CT("tip")
    public final String tip;

    @C09CT("videos")
    public List<BaseVideo> videos;

    public CreativeTemplate() {
        this(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, 16383, null);
    }

    public CreativeTemplate(String str, Integer num, String str2, String str3, String str4, String str5, List<CreativeTemplateAsset> list, List<CreativeTemplateTag> list2, Integer num2, List<BaseVideo> list3, int i, String str6, String str7, String str8) {
        this.templateId = str;
        this.templateType = num;
        this.pictureUrl = str2;
        this.templatePrompt = str3;
        this.nameText = str4;
        this.subTitle = str5;
        this.assets = list;
        this.tags = list2;
        this.defaultStdSize = num2;
        this.videos = list3;
        this.processType = i;
        this.tip = str6;
        this.skillInfo = str7;
        this.buttonText = str8;
    }

    public CreativeTemplate(String str, Integer num, String str2, String str3, String str4, String str5, List list, List list2, Integer num2, List list3, int i, String str6, String str7, String str8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? C13BV.INSTANCE : list, (i2 & 128) != 0 ? C13BV.INSTANCE : list2, (i2 & 256) == 0 ? num2 : null, (i2 & 512) != 0 ? C13BV.INSTANCE : list3, (i2 & 1024) != 0 ? 0 : i, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? "" : str6, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? "" : str7, (i2 & 8192) == 0 ? str8 : "");
    }
}
