package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class CreateTaskBody {

    @C09CT("algo_raw")
    public final AlgoRaw algoRaw;

    @C09CT("business_scene")
    public final String businessScene;

    @C09CT("extra")
    public final String extra;

    @C09CT("image_infos")
    public final List<ImageInfo> imageInfos;

    @C09CT("inputs")
    public final List<InputInfo> inputs;

    @C09CT("prompt_text")
    public final String promptText;

    @C09CT("style_conf")
    public final StyleConfig styleConfig;

    @C09CT("task_type")
    public final String taskType;

    @C09CT("video_infos")
    public final List<Object> videoInfos;

    public CreateTaskBody() {
        this(null, null, null, null, null, null, new AlgoRaw("", "", ""), null, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreateTaskBody(businessScene=");
        sbLIZ.append(this.businessScene);
        sbLIZ.append(", taskType=");
        sbLIZ.append(this.taskType);
        sbLIZ.append(", imageInfos=");
        sbLIZ.append(this.imageInfos);
        sbLIZ.append(", videoInfos=");
        sbLIZ.append(this.videoInfos);
        sbLIZ.append(", inputs=");
        sbLIZ.append(this.inputs);
        sbLIZ.append(", promptText=");
        sbLIZ.append(this.promptText);
        sbLIZ.append(", algoRaw=");
        sbLIZ.append(this.algoRaw);
        sbLIZ.append(", styleConfig=");
        sbLIZ.append(this.styleConfig);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CreateTaskBody(String str, String str2, List<ImageInfo> list, List<Object> list2, List<InputInfo> list3, String str3, AlgoRaw algoRaw, StyleConfig styleConfig, String str4) {
        this.businessScene = str;
        this.taskType = str2;
        this.imageInfos = list;
        this.videoInfos = list2;
        this.inputs = list3;
        this.promptText = str3;
        this.algoRaw = algoRaw;
        this.styleConfig = styleConfig;
        this.extra = str4;
    }
}
