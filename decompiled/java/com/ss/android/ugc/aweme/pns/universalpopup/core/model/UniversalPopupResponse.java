package com.ss.android.ugc.aweme.pns.universalpopup.core.model;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class UniversalPopupResponse implements Serializable {
    public final String mscConfig;

    @C09CT("policy_notices")
    public final List<UniversalPopup> popups;

    public UniversalPopupResponse() {
        this(null, null, 3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalPopupResponse)) {
            return false;
        }
        UniversalPopupResponse universalPopupResponse = (UniversalPopupResponse) obj;
        return Intrinsics.LJFF(this.popups, universalPopupResponse.popups) && Intrinsics.LJFF(this.mscConfig, universalPopupResponse.mscConfig);
    }

    public UniversalPopupResponse(List<UniversalPopup> list, String str) {
        this.popups = list;
        this.mscConfig = str;
    }

    public UniversalPopupResponse(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? null : str);
    }
}
