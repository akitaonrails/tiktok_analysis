package com.ss.android.ugc.aweme.music.model;

import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class ReuseMusicStruct implements Serializable {
    public final String authorName;
    public final String id;
    public final Boolean isPgc;
    public final String musicName;

    public ReuseMusicStruct() {
        this(null, null, null, null);
    }

    public final String getId() {
        String str = this.id;
        return str == null ? "" : str;
    }

    public final String getTitle() {
        String str;
        String str2;
        String str3 = this.musicName;
        boolean z = !(str3 == null || str3.length() == 0);
        String str4 = this.authorName;
        boolean z2 = !(str4 == null || str4.length() == 0);
        if (z && z2 && isPgc()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.musicName);
            sbLIZ.append(" - ");
            sbLIZ.append(this.authorName);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (!z) {
            return (!z2 || (str = this.authorName) == null) ? "" : str;
        }
        if ((!z2 || !isPgc()) && (str2 = this.musicName) != null) {
            return str2;
        }
        return "";
    }

    public final boolean isPgc() {
        return Intrinsics.LJFF(this.isPgc, Boolean.TRUE);
    }

    public final boolean isValid() {
        return getId().length() > 0 && getTitle().length() > 0;
    }

    public ReuseMusicStruct(String str, String str2, String str3, Boolean bool) {
        this.id = str;
        this.musicName = str2;
        this.authorName = str3;
        this.isPgc = bool;
    }
}
