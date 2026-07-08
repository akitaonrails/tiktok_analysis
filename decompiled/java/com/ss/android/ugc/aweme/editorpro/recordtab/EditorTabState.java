package com.ss.android.ugc.aweme.editorpro.recordtab;

import X.C004I;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes.dex */
public final class EditorTabState implements C004I {
    public final boolean refresh;

    public final EditorTabState copy(boolean z) {
        return new EditorTabState(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EditorTabState) && this.refresh == ((EditorTabState) obj).refresh;
    }

    public int hashCode() {
        return C786410Ut5.Z2(this.refresh);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditorTabState(refresh=");
        sbLIZ.append(this.refresh);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getRefresh() {
        return this.refresh;
    }

    public EditorTabState(boolean z) {
        this.refresh = z;
    }
}
