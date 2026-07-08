package com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.dynamicmodel;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AICreateModelConfig {

    @C09CT("ai_create_image_model_list")
    public final List<AICreateImageModel> imageModelList;

    @C09CT("ai_create_video_model_list")
    public final List<AICreateVideoModel> videoModelList;

    public AICreateModelConfig() {
        this(null, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AICreateModelConfig)) {
            return false;
        }
        AICreateModelConfig aICreateModelConfig = (AICreateModelConfig) obj;
        return Intrinsics.LJFF(this.imageModelList, aICreateModelConfig.imageModelList) && Intrinsics.LJFF(this.videoModelList, aICreateModelConfig.videoModelList);
    }

    public final int hashCode() {
        return (this.imageModelList.hashCode() * 31) + this.videoModelList.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AICreateModelConfig(imageModelList=");
        sbLIZ.append(this.imageModelList);
        sbLIZ.append(", videoModelList=");
        sbLIZ.append(this.videoModelList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AICreateModelConfig(List<AICreateImageModel> list, List<AICreateVideoModel> list2) {
        this.imageModelList = list;
        this.videoModelList = list2;
    }

    public AICreateModelConfig(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}
