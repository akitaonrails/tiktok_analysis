package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class EntranceIcon {

    @C09CT("icon_local")
    public final EntranceLocalIcon localIcon;

    public EntranceIcon() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EntranceIcon) && Intrinsics.LJFF(this.localIcon, ((EntranceIcon) obj).localIcon);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EntranceIcon(localIcon=");
        sbLIZ.append(this.localIcon);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EntranceIcon(EntranceLocalIcon entranceLocalIcon) {
        this.localIcon = entranceLocalIcon;
    }
}
