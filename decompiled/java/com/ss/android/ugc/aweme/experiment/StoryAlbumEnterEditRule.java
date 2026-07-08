package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class StoryAlbumEnterEditRule {
    public static final int $stable = 0;

    @C09CT("enter_method")
    public final String enterMethod;

    @C09CT("shoot_enter_from")
    public final String shootEnterFrom;

    @C09CT("shoot_way")
    public final String shootWay;

    public StoryAlbumEnterEditRule() {
        this(null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryAlbumEnterEditRule)) {
            return false;
        }
        StoryAlbumEnterEditRule storyAlbumEnterEditRule = (StoryAlbumEnterEditRule) obj;
        return Intrinsics.LJFF(this.shootWay, storyAlbumEnterEditRule.shootWay) && Intrinsics.LJFF(this.enterMethod, storyAlbumEnterEditRule.enterMethod) && Intrinsics.LJFF(this.shootEnterFrom, storyAlbumEnterEditRule.shootEnterFrom);
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
        sbLIZ.append("StoryAlbumEnterEditRule(shootWay=");
        sbLIZ.append(this.shootWay);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.enterMethod);
        sbLIZ.append(", shootEnterFrom=");
        sbLIZ.append(this.shootEnterFrom);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StoryAlbumEnterEditRule(String str, String str2, String str3) {
        this.shootWay = str;
        this.enterMethod = str2;
        this.shootEnterFrom = str3;
    }
}
