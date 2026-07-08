package com.ss.android.ugc.aweme.notification.model;

import X.AbstractC1623806Xk;
import X.C1582320rHK;
import X.C2188811AlT;
import X.C626160OhC;
import X.C627260Oiy;
import X.C627660Ojc;
import X.InterfaceC636340Oxc;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BioMentionListState implements InterfaceC636340Oxc<BioMentionListState, C1582320rHK> {
    public static final int $stable = 8;
    public final C627660Ojc<C1582320rHK> listState;

    public BioMentionListState() {
        this(new C627660Ojc(null, null, null, null, 15));
    }

    public final BioMentionListState copy(C627660Ojc<C1582320rHK> c627660Ojc) {
        return new BioMentionListState(c627660Ojc);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BioMentionListState) && Intrinsics.LJFF(this.listState, ((BioMentionListState) obj).listState);
    }

    public int hashCode() {
        return this.listState.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BioMentionListState(listState=");
        sbLIZ.append(this.listState);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public List<C1582320rHK> getListItemState() {
        return C627260Oiy.LIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public AbstractC1623806Xk<C626160OhC> getLoadLatestState() {
        return C627260Oiy.LIZIZ(this);
    }

    @Override // X.InterfaceC636270OxV
    public AbstractC1623806Xk<C626160OhC> getLoadMoreState() {
        return C627260Oiy.LIZJ(this);
    }

    @Override // X.InterfaceC636270OxV
    public AbstractC1623806Xk<C626160OhC> getRefreshState() {
        return C627260Oiy.LIZLLL(this);
    }

    @Override // X.InterfaceC627270Oiz
    public C627660Ojc<C1582320rHK> getListState() {
        return this.listState;
    }

    public BioMentionListState(C627660Ojc<C1582320rHK> c627660Ojc) {
        this.listState = c627660Ojc;
    }
}
