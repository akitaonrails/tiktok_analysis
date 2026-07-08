package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C1622006Ws;
import X.C2188811AlT;
import X.C786410Ut5;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class AvatarState {
    public final C1622006Ws<Drawable> avatarBottomDrawable;
    public final boolean avatarVisibility;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvatarState)) {
            return false;
        }
        AvatarState avatarState = (AvatarState) obj;
        return this.avatarVisibility == avatarState.avatarVisibility && Intrinsics.LJFF(this.avatarBottomDrawable, avatarState.avatarBottomDrawable);
    }

    public int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.avatarVisibility) * 31;
        C1622006Ws<Drawable> c1622006Ws = this.avatarBottomDrawable;
        if (c1622006Ws != null) {
            c1622006Ws.getClass();
        }
        return iZ2;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AvatarState(avatarVisibility=");
        sbLIZ.append(this.avatarVisibility);
        sbLIZ.append(", avatarBottomDrawable=");
        sbLIZ.append(this.avatarBottomDrawable);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AvatarState(boolean z, C1622006Ws<Drawable> c1622006Ws) {
        this.avatarVisibility = z;
        this.avatarBottomDrawable = c1622006Ws;
    }
}
