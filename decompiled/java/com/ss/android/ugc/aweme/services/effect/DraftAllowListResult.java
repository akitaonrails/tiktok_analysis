package com.ss.android.ugc.aweme.services.effect;

import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftAllowListResult {
    public final List<String> effectList;
    public final List<String> effectModelList;
    public final List<String> fontList;
    public final List<String> musicList;
    public final List<String> mvList;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftAllowListResult)) {
            return false;
        }
        DraftAllowListResult draftAllowListResult = (DraftAllowListResult) obj;
        return Intrinsics.LJFF(this.effectList, draftAllowListResult.effectList) && Intrinsics.LJFF(this.musicList, draftAllowListResult.musicList) && Intrinsics.LJFF(this.effectModelList, draftAllowListResult.effectModelList) && Intrinsics.LJFF(this.fontList, draftAllowListResult.fontList) && Intrinsics.LJFF(this.mvList, draftAllowListResult.mvList);
    }

    public int hashCode() {
        return (((((((this.effectList.hashCode() * 31) + this.musicList.hashCode()) * 31) + this.effectModelList.hashCode()) * 31) + this.fontList.hashCode()) * 31) + this.mvList.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftAllowListResult(effectList=");
        sbLIZ.append(this.effectList);
        sbLIZ.append(", musicList=");
        sbLIZ.append(this.musicList);
        sbLIZ.append(", effectModelList=");
        sbLIZ.append(this.effectModelList);
        sbLIZ.append(", fontList=");
        sbLIZ.append(this.fontList);
        sbLIZ.append(", mvList=");
        sbLIZ.append(this.mvList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DraftAllowListResult(List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
        this.effectList = list;
        this.musicList = list2;
        this.effectModelList = list3;
        this.fontList = list4;
        this.mvList = list5;
    }
}
