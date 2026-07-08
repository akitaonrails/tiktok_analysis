package com.ss.android.ugc.now.interaction.api;

import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class PostActiveState extends Interaction {
    public final boolean active;
    public final String awemeId;

    public PostActiveState() {
        this(false, null);
    }

    public final PostActiveState copy(boolean z, String str) {
        return new PostActiveState(z, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostActiveState)) {
            return false;
        }
        PostActiveState postActiveState = (PostActiveState) obj;
        return this.active == postActiveState.active && Intrinsics.LJFF(this.awemeId, postActiveState.awemeId);
    }

    public int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.active) * 31;
        String str = this.awemeId;
        return iZ2 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PostActiveState(active=");
        sbLIZ.append(this.active);
        sbLIZ.append(", awemeId=");
        sbLIZ.append(this.awemeId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getActive() {
        return this.active;
    }

    @Override // com.ss.android.ugc.now.interaction.api.Interaction
    public String getAwemeId() {
        return this.awemeId;
    }

    public PostActiveState(boolean z, String str) {
        super(null);
        this.active = z;
        this.awemeId = str;
    }
}
