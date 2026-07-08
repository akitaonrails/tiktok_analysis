package com.ss.android.ugc.aweme.im.chatroom.api.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PreviewJoinButtonState implements Serializable {

    @C09CT("enable")
    public final boolean enabled;

    @C09CT("text")
    public final String text;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewJoinButtonState)) {
            return false;
        }
        PreviewJoinButtonState previewJoinButtonState = (PreviewJoinButtonState) obj;
        return Intrinsics.LJFF(this.text, previewJoinButtonState.text) && this.enabled == previewJoinButtonState.enabled;
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + C786410Ut5.Z2(this.enabled);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreviewJoinButtonState(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", enabled=");
        sbLIZ.append(this.enabled);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PreviewJoinButtonState() {
        this("", true);
    }

    public PreviewJoinButtonState(String str, boolean z) {
        this.text = str;
        this.enabled = z;
    }
}
