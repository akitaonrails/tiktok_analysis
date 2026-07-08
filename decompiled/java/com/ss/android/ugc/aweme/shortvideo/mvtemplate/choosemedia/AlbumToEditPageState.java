package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import X.C004I;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes9.dex */
public final class AlbumToEditPageState implements C004I {
    public static final int $stable = 0;
    public final boolean toEditPage;

    public AlbumToEditPageState() {
        this(false);
    }

    public final AlbumToEditPageState copy(boolean z) {
        return new AlbumToEditPageState(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AlbumToEditPageState) && this.toEditPage == ((AlbumToEditPageState) obj).toEditPage;
    }

    public int hashCode() {
        return C786410Ut5.Z2(this.toEditPage);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AlbumToEditPageState(toEditPage=");
        sbLIZ.append(this.toEditPage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getToEditPage() {
        return this.toEditPage;
    }

    public AlbumToEditPageState(boolean z) {
        this.toEditPage = z;
    }
}
