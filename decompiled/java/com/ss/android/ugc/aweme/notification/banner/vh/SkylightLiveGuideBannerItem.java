package com.ss.android.ugc.aweme.notification.banner.vh;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class SkylightLiveGuideBannerItem implements InterfaceC1891350zJl {
    public final Function0<Unit> LL;

    @C09CT("live_notices")
    public final List<InboxLiveNotice> liveNotices;

    public SkylightLiveGuideBannerItem() {
        this(null, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkylightLiveGuideBannerItem)) {
            return false;
        }
        SkylightLiveGuideBannerItem skylightLiveGuideBannerItem = (SkylightLiveGuideBannerItem) obj;
        return Intrinsics.LJFF(this.liveNotices, skylightLiveGuideBannerItem.liveNotices) && Intrinsics.LJFF(this.LL, skylightLiveGuideBannerItem.LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.liveNotices.hashCode() * 31;
        Function0<Unit> function0 = this.LL;
        return iHashCode + (function0 == null ? 0 : function0.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkylightLiveGuideBannerItem(liveNotices=");
        sbLIZ.append(this.liveNotices);
        sbLIZ.append(", dismissListener=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public SkylightLiveGuideBannerItem(List<InboxLiveNotice> list, Function0<Unit> function0) {
        this.liveNotices = list;
        this.LL = function0;
    }

    public SkylightLiveGuideBannerItem(List list, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? null : function0);
    }
}
