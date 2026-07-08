package com.ss.android.ugc.aweme.cktemplate.resource.impl;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class MusicListRespone {

    @C09CT("data")
    public final List<SongItem> data;

    @C09CT("message")
    public final String message;

    @C09CT("status_code")
    public final int statusCode;

    public MusicListRespone() {
        this(null, null, 0, 7, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicListRespone)) {
            return false;
        }
        MusicListRespone musicListRespone = (MusicListRespone) obj;
        return Intrinsics.LJFF(this.data, musicListRespone.data) && Intrinsics.LJFF(this.message, musicListRespone.message) && this.statusCode == musicListRespone.statusCode;
    }

    public int hashCode() {
        return (((this.data.hashCode() * 31) + this.message.hashCode()) * 31) + this.statusCode;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicListRespone(data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", message=");
        sbLIZ.append(this.message);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MusicListRespone(List<SongItem> list, String str, int i) {
        this.data = list;
        this.message = str;
        this.statusCode = i;
    }

    public MusicListRespone(List list, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C13BV.INSTANCE : list, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0 : i);
    }
}
