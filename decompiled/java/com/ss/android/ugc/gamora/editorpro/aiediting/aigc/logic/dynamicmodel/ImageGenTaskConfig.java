package com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.dynamicmodel;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ImageGenTaskConfig {

    @C09CT("image_max_ref_count")
    public final int imageMaxRefCount;

    @C09CT("image_output_count")
    public final int imageOutputCount;

    @C09CT("supported_aspect_ratios")
    public final List<String> supportedAspectRatios;

    @C09CT("task_req_key")
    public final String taskReqKey;

    @C09CT("task_type")
    public final String taskType;

    public ImageGenTaskConfig() {
        this(0, null, 0, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageGenTaskConfig)) {
            return false;
        }
        ImageGenTaskConfig imageGenTaskConfig = (ImageGenTaskConfig) obj;
        return this.imageOutputCount == imageGenTaskConfig.imageOutputCount && Intrinsics.LJFF(this.supportedAspectRatios, imageGenTaskConfig.supportedAspectRatios) && this.imageMaxRefCount == imageGenTaskConfig.imageMaxRefCount && Intrinsics.LJFF(this.taskType, imageGenTaskConfig.taskType) && Intrinsics.LJFF(this.taskReqKey, imageGenTaskConfig.taskReqKey);
    }

    public final int hashCode() {
        return (((((((this.imageOutputCount * 31) + this.supportedAspectRatios.hashCode()) * 31) + this.imageMaxRefCount) * 31) + this.taskType.hashCode()) * 31) + this.taskReqKey.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageGenTaskConfig(imageOutputCount=");
        sbLIZ.append(this.imageOutputCount);
        sbLIZ.append(", supportedAspectRatios=");
        sbLIZ.append(this.supportedAspectRatios);
        sbLIZ.append(", imageMaxRefCount=");
        sbLIZ.append(this.imageMaxRefCount);
        sbLIZ.append(", taskType=");
        sbLIZ.append(this.taskType);
        sbLIZ.append(", taskReqKey=");
        sbLIZ.append(this.taskReqKey);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static ImageGenTaskConfig LIZ(ImageGenTaskConfig imageGenTaskConfig, String str) {
        return new ImageGenTaskConfig(imageGenTaskConfig.imageOutputCount, imageGenTaskConfig.supportedAspectRatios, imageGenTaskConfig.imageMaxRefCount, imageGenTaskConfig.taskType, str);
    }

    public ImageGenTaskConfig(int i, List<String> list, int i2, String str, String str2) {
        this.imageOutputCount = i;
        this.supportedAspectRatios = list;
        this.imageMaxRefCount = i2;
        this.taskType = str;
        this.taskReqKey = str2;
    }

    public ImageGenTaskConfig(int i, List list, int i2, String str, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 1 : i, (i3 & 2) != 0 ? C13BV.INSTANCE : list, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? "" : str, (i3 & 16) == 0 ? str2 : "");
    }
}
