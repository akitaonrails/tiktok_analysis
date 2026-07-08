package com.ss.android.ugc.aweme.ecommerce.showcase.mix.event;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class StoreMixCloseLynxEvent extends BaseStoreOverlayEvent {

    @C09CT("type")
    public final String type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StoreMixCloseLynxEvent) && Intrinsics.LJFF(this.type, ((StoreMixCloseLynxEvent) obj).type);
    }

    public final int hashCode() {
        String str = this.type;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoreMixCloseLynxEvent(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StoreMixCloseLynxEvent(String str) {
        this.type = str;
    }
}
