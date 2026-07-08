package com.ss.android.ugc.aweme.im.message.content;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageConfig implements Serializable {

    @C09CT("preview_hint")
    public final PreviewHint previewHint;

    public MessageConfig() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MessageConfig) && Intrinsics.LJFF(this.previewHint, ((MessageConfig) obj).previewHint);
    }

    public int hashCode() {
        PreviewHint previewHint = this.previewHint;
        if (previewHint == null) {
            return 0;
        }
        return previewHint.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageConfig(previewHint=");
        sbLIZ.append(this.previewHint);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MessageConfig(PreviewHint previewHint) {
        this.previewHint = previewHint;
    }
}
