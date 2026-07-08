package com.ss.android.ugc.tools.chat.data;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class MaterialStruct {

    @C09CT("addtionInfo")
    public final List<MaterialContent> additionInfo;

    @C09CT("cameo_infos")
    public final CameoMentionInfo cameoInfos;

    @C09CT("isVisible")
    public final Boolean isVisible;

    @C09CT("prompt")
    public final List<MaterialContent> prompt;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaterialStruct)) {
            return false;
        }
        MaterialStruct materialStruct = (MaterialStruct) obj;
        return Intrinsics.LJFF(this.isVisible, materialStruct.isVisible) && Intrinsics.LJFF(this.prompt, materialStruct.prompt) && Intrinsics.LJFF(this.additionInfo, materialStruct.additionInfo) && Intrinsics.LJFF(this.cameoInfos, materialStruct.cameoInfos);
    }

    public final int hashCode() {
        Boolean bool = this.isVisible;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<MaterialContent> list = this.prompt;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<MaterialContent> list2 = this.additionInfo;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        CameoMentionInfo cameoMentionInfo = this.cameoInfos;
        return iHashCode3 + (cameoMentionInfo != null ? cameoMentionInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MaterialStruct(isVisible=");
        sbLIZ.append(this.isVisible);
        sbLIZ.append(", prompt=");
        sbLIZ.append(this.prompt);
        sbLIZ.append(", additionInfo=");
        sbLIZ.append(this.additionInfo);
        sbLIZ.append(", cameoInfos=");
        sbLIZ.append(this.cameoInfos);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MaterialStruct(Boolean bool, List<MaterialContent> list, List<MaterialContent> list2, CameoMentionInfo cameoMentionInfo) {
        this.isVisible = bool;
        this.prompt = list;
        this.additionInfo = list2;
        this.cameoInfos = cameoMentionInfo;
    }
}
