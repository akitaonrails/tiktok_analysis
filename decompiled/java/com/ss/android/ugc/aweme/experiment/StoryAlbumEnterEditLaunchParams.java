package com.ss.android.ugc.aweme.experiment;

import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class StoryAlbumEnterEditLaunchParams {
    public static final int $stable = 0;
    public final String enterMethod;
    public final String shootEnterFrom;
    public final String shootWay;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryAlbumEnterEditLaunchParams)) {
            return false;
        }
        StoryAlbumEnterEditLaunchParams storyAlbumEnterEditLaunchParams = (StoryAlbumEnterEditLaunchParams) obj;
        return Intrinsics.LJFF(this.shootWay, storyAlbumEnterEditLaunchParams.shootWay) && Intrinsics.LJFF(this.enterMethod, storyAlbumEnterEditLaunchParams.enterMethod) && Intrinsics.LJFF(this.shootEnterFrom, storyAlbumEnterEditLaunchParams.shootEnterFrom);
    }

    public int hashCode() {
        String str = this.shootWay;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.enterMethod;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shootEnterFrom;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryAlbumEnterEditLaunchParams(shootWay=");
        sbLIZ.append(this.shootWay);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.enterMethod);
        sbLIZ.append(", shootEnterFrom=");
        sbLIZ.append(this.shootEnterFrom);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StoryAlbumEnterEditLaunchParams(String str, String str2, String str3) {
        this.shootWay = str;
        this.enterMethod = str2;
        this.shootEnterFrom = str3;
    }
}
