package com.ss.android.ugc.aweme.explore.lynx;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ExploreLynxBackgroundMusic {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("play_urls")
    public final List<String> playUrls;

    @C09CT("title")
    public final String title;

    public ExploreLynxBackgroundMusic() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreLynxBackgroundMusic)) {
            return false;
        }
        ExploreLynxBackgroundMusic exploreLynxBackgroundMusic = (ExploreLynxBackgroundMusic) obj;
        return Intrinsics.LJFF(this.id, exploreLynxBackgroundMusic.id) && Intrinsics.LJFF(this.title, exploreLynxBackgroundMusic.title) && Intrinsics.LJFF(this.playUrls, exploreLynxBackgroundMusic.playUrls);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.playUrls;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExploreLynxBackgroundMusic(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", playUrls=");
        sbLIZ.append(this.playUrls);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ExploreLynxBackgroundMusic(String str, String str2, List<String> list) {
        this.id = str;
        this.title = str2;
        this.playUrls = list;
    }
}
