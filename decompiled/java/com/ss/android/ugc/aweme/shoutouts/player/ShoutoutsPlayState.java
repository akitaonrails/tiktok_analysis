package com.ss.android.ugc.aweme.shoutouts.player;

import X.C004I;
import X.C11CK;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes30.dex */
public final class ShoutoutsPlayState implements C004I {
    public final int progress;
    public final C11CK status;

    public ShoutoutsPlayState() {
        this(0, C11CK.PREPARED);
    }

    public final ShoutoutsPlayState copy(int i, C11CK c11ck) {
        return new ShoutoutsPlayState(i, c11ck);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoutoutsPlayState)) {
            return false;
        }
        ShoutoutsPlayState shoutoutsPlayState = (ShoutoutsPlayState) obj;
        return this.progress == shoutoutsPlayState.progress && this.status == shoutoutsPlayState.status;
    }

    public int hashCode() {
        return (this.progress * 31) + this.status.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShoutoutsPlayState(progress=");
        sbLIZ.append(this.progress);
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getProgress() {
        return this.progress;
    }

    public final C11CK getStatus() {
        return this.status;
    }

    public ShoutoutsPlayState(int i, C11CK c11ck) {
        this.progress = i;
        this.status = c11ck;
    }
}
