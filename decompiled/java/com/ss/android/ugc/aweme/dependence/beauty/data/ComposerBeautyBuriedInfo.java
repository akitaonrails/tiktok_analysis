package com.ss.android.ugc.aweme.dependence.beauty.data;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1409950mnJ;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ComposerBeautyBuriedInfo implements InterfaceC1409950mnJ {

    @C09CT("beautify_info")
    public final List<BeautifyInfo> beautifyInfo;

    @C09CT("beautify_used")
    public final int beautifyUsed;

    @C09CT("beautify_on")
    public final int beautyStatus;

    @C09CT("is_composer")
    public final int isComposer;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public ComposerBeautyBuriedInfo() {
        int i = 0;
        this(i, i, i, null, 15, 0 == true ? 1 : 0);
    }

    public final ComposerBeautyBuriedInfo copy(int i, int i2, int i3, List<BeautifyInfo> list) {
        return new ComposerBeautyBuriedInfo(i, i2, i3, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposerBeautyBuriedInfo)) {
            return false;
        }
        ComposerBeautyBuriedInfo composerBeautyBuriedInfo = (ComposerBeautyBuriedInfo) obj;
        return this.beautifyUsed == composerBeautyBuriedInfo.beautifyUsed && this.isComposer == composerBeautyBuriedInfo.isComposer && this.beautyStatus == composerBeautyBuriedInfo.beautyStatus && Intrinsics.LJFF(this.beautifyInfo, composerBeautyBuriedInfo.beautifyInfo);
    }

    public int hashCode() {
        return (((((this.beautifyUsed * 31) + this.isComposer) * 31) + this.beautyStatus) * 31) + this.beautifyInfo.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ComposerBeautyBuriedInfo(beautifyUsed=");
        sbLIZ.append(this.beautifyUsed);
        sbLIZ.append(", isComposer=");
        sbLIZ.append(this.isComposer);
        sbLIZ.append(", beautyStatus=");
        sbLIZ.append(this.beautyStatus);
        sbLIZ.append(", beautifyInfo=");
        sbLIZ.append(this.beautifyInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<BeautifyInfo> getBeautifyInfo() {
        return this.beautifyInfo;
    }

    public final int getBeautifyUsed() {
        return this.beautifyUsed;
    }

    @Override // X.InterfaceC1409950mnJ
    public int getBeautyStatus() {
        return this.beautyStatus;
    }

    public int isComposer() {
        return this.isComposer;
    }

    public ComposerBeautyBuriedInfo(int i, int i2, int i3, List<BeautifyInfo> list) {
        this.beautifyUsed = i;
        this.isComposer = i2;
        this.beautyStatus = i3;
        this.beautifyInfo = list;
    }

    public /* synthetic */ ComposerBeautyBuriedInfo(int i, int i2, int i3, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? new ArrayList() : list);
    }
}
