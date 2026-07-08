package com.ss.android.ugc.aweme.aigc.graph.net;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

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

    public CreateTaskBody() {
        this(null, null, null, null, null, new AlgoRaw("", "", ""), null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateTaskBody)) {
            return false;
        }
        CreateTaskBody createTaskBody = (CreateTaskBody) obj;
        return Intrinsics.LJFF(this.businessScene, createTaskBody.businessScene) && Intrinsics.LJFF(this.taskType, createTaskBody.taskType) && Intrinsics.LJFF(this.imageInfos, createTaskBody.imageInfos) && Intrinsics.LJFF(this.inputs, createTaskBody.inputs) && Intrinsics.LJFF(this.promptText, createTaskBody.promptText) && Intrinsics.LJFF(this.algoRaw, createTaskBody.algoRaw) && Intrinsics.LJFF(this.styleConfig, createTaskBody.styleConfig) && Intrinsics.LJFF(this.extra, createTaskBody.extra);
    }

    public final int hashCode() {
        String str = this.businessScene;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.taskType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<ImageInfo> list = this.imageInfos;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<InputInfo> list2 = this.inputs;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str3 = this.promptText;
        int iHashCode5 = (((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.algoRaw.hashCode()) * 31;
        StyleConfig styleConfig = this.styleConfig;
        int iHashCode6 = (iHashCode5 + (styleConfig == null ? 0 : styleConfig.hashCode())) * 31;
        String str4 = this.extra;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreateTaskBody(businessScene=");
        sbLIZ.append(this.businessScene);
        sbLIZ.append(", taskType=");
        sbLIZ.append(this.taskType);
        sbLIZ.append(", imageInfos=");
        sbLIZ.append(this.imageInfos);
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

    public CreateTaskBody(String str, String str2, List<ImageInfo> list, List<InputInfo> list2, String str3, AlgoRaw algoRaw, StyleConfig styleConfig, String str4) {
        this.businessScene = str;
        this.taskType = str2;
        this.imageInfos = list;
        this.inputs = list2;
        this.promptText = str3;
        this.algoRaw = algoRaw;
        this.styleConfig = styleConfig;
        this.extra = str4;
    }
}
