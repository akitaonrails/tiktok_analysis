package com.ss.android.ugc.aweme.ecommerce.showcase.mix.view;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.mix.base.BaseMixPostEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class SheetStateChangeEvent extends BaseMixPostEvent {

    @C09CT("page_id")
    public final String pageId;

    @C09CT("state")
    public final String state;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SheetStateChangeEvent)) {
            return false;
        }
        SheetStateChangeEvent sheetStateChangeEvent = (SheetStateChangeEvent) obj;
        return Intrinsics.LJFF(this.pageId, sheetStateChangeEvent.pageId) && Intrinsics.LJFF(this.state, sheetStateChangeEvent.state);
    }

    public final int hashCode() {
        String str = this.pageId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.state;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SheetStateChangeEvent(pageId=");
        sbLIZ.append(this.pageId);
        sbLIZ.append(", state=");
        sbLIZ.append(this.state);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SheetStateChangeEvent(String str, String str2) {
        this.pageId = str;
        this.state = str2;
    }
}
