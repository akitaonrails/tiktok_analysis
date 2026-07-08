package com.ss.android.ugc.aweme.feed.model;

import X.C2188811AlT;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class AnchorCustomData implements Serializable {
    public final String ecEntranceFormMall;
    public final String exposureItems;
    public final boolean openOnLaunch;
    public final boolean openPdp;
    public final String pageName;
    public String previousAid;
    public boolean shouldOpen;
    public final String sourceModule;
    public final Map<String, String> trackingData;

    public AnchorCustomData() {
        this(false, false, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchorCustomData)) {
            return false;
        }
        AnchorCustomData anchorCustomData = (AnchorCustomData) obj;
        return this.openOnLaunch == anchorCustomData.openOnLaunch && this.openPdp == anchorCustomData.openPdp && Intrinsics.LJFF(this.trackingData, anchorCustomData.trackingData) && Intrinsics.LJFF(this.ecEntranceFormMall, anchorCustomData.ecEntranceFormMall) && Intrinsics.LJFF(this.sourceModule, anchorCustomData.sourceModule) && Intrinsics.LJFF(this.exposureItems, anchorCustomData.exposureItems) && Intrinsics.LJFF(this.pageName, anchorCustomData.pageName);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnchorCustomData(openOnLaunch=");
        sbLIZ.append(this.openOnLaunch);
        sbLIZ.append(", openPdp=");
        sbLIZ.append(this.openPdp);
        sbLIZ.append(", trackingData=");
        sbLIZ.append(this.trackingData);
        sbLIZ.append(", ecEntranceFormMall=");
        sbLIZ.append(this.ecEntranceFormMall);
        sbLIZ.append(", sourceModule=");
        sbLIZ.append(this.sourceModule);
        sbLIZ.append(", exposureItems=");
        sbLIZ.append(this.exposureItems);
        sbLIZ.append(", pageName=");
        sbLIZ.append(this.pageName);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setPreviousAid(String str) {
        this.previousAid = str;
    }

    public final void setShouldOpen(boolean z) {
        this.shouldOpen = z;
    }

    public AnchorCustomData(boolean z, boolean z2, Map<String, String> map, String str, String str2, String str3, String str4) {
        this.openOnLaunch = z;
        this.openPdp = z2;
        this.trackingData = map;
        this.ecEntranceFormMall = str;
        this.sourceModule = str2;
        this.exposureItems = str3;
        this.pageName = str4;
        this.shouldOpen = z;
    }
}
