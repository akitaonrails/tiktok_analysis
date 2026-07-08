package com.ss.android.ugc.aweme.setting.viewmodel;

import X.C004I;
import X.C1761680vwc;
import X.C2188811AlT;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.ss.android.ugc.aweme.setting.model.AuthorizedStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class AuthInfoState implements C004I {
    public static final int $stable = 8;
    public final ListState<AuthorizedStruct, C1761680vwc> listState;

    public AuthInfoState() {
        this(new ListState(new C1761680vwc(3), null, null, null, null, 30, null));
    }

    public final AuthInfoState copy(ListState<AuthorizedStruct, C1761680vwc> listState) {
        return new AuthInfoState(listState);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthInfoState) && Intrinsics.LJFF(this.listState, ((AuthInfoState) obj).listState);
    }

    public int hashCode() {
        return this.listState.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AuthInfoState(listState=");
        sbLIZ.append(this.listState);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final ListState<AuthorizedStruct, C1761680vwc> getListState() {
        return this.listState;
    }

    public AuthInfoState(ListState<AuthorizedStruct, C1761680vwc> listState) {
        this.listState = listState;
    }
}
