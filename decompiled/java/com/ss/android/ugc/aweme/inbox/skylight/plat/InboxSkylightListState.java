package com.ss.android.ugc.aweme.inbox.skylight.plat;

import X.AbstractC1623806Xk;
import X.C1598510rhR;
import X.C2188811AlT;
import X.C291001Au;
import X.C443120HZe;
import X.C626160OhC;
import X.C627260Oiy;
import X.C627660Ojc;
import X.InterfaceC1891350zJl;
import X.InterfaceC636340Oxc;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class InboxSkylightListState implements InterfaceC636340Oxc<InboxSkylightListState, InterfaceC1891350zJl> {
    public static final int $stable = 8;
    public final C291001Au<Boolean> isListEmpty;
    public final C291001Au<InterfaceC1891350zJl> itemDeleteEvent;
    public final C291001Au<Pair<Integer, Boolean>> lifecycleFreeScrollPosition;
    public final C627660Ojc<InterfaceC1891350zJl> listState;
    public final C291001Au<Unit> onResumeNotRefreshingEvent;
    public final C291001Au<C1598510rhR> rerankState;
    public final C291001Au<C443120HZe<Integer, Boolean, Boolean>> selectedCellPosition;

    public InboxSkylightListState() {
        C627660Ojc c627660Ojc = new C627660Ojc(null, null, null, null, 15);
        Boolean bool = Boolean.FALSE;
        this(c627660Ojc, new C291001Au(new C443120HZe(0, bool, bool)), null, null, null, new C291001Au(Boolean.FALSE), null);
    }

    public final InboxSkylightListState copy(C627660Ojc<InterfaceC1891350zJl> c627660Ojc, C291001Au<C443120HZe<Integer, Boolean, Boolean>> c291001Au, C291001Au<Pair<Integer, Boolean>> c291001Au2, C291001Au<? extends InterfaceC1891350zJl> c291001Au3, C291001Au<Unit> c291001Au4, C291001Au<Boolean> c291001Au5, C291001Au<C1598510rhR> c291001Au6) {
        return new InboxSkylightListState(c627660Ojc, c291001Au, c291001Au2, c291001Au3, c291001Au4, c291001Au5, c291001Au6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InboxSkylightListState)) {
            return false;
        }
        InboxSkylightListState inboxSkylightListState = (InboxSkylightListState) obj;
        return Intrinsics.LJFF(this.listState, inboxSkylightListState.listState) && Intrinsics.LJFF(this.selectedCellPosition, inboxSkylightListState.selectedCellPosition) && Intrinsics.LJFF(this.lifecycleFreeScrollPosition, inboxSkylightListState.lifecycleFreeScrollPosition) && Intrinsics.LJFF(this.itemDeleteEvent, inboxSkylightListState.itemDeleteEvent) && Intrinsics.LJFF(this.onResumeNotRefreshingEvent, inboxSkylightListState.onResumeNotRefreshingEvent) && Intrinsics.LJFF(this.isListEmpty, inboxSkylightListState.isListEmpty) && Intrinsics.LJFF(this.rerankState, inboxSkylightListState.rerankState);
    }

    public int hashCode() {
        int iHashCode = ((this.listState.hashCode() * 31) + this.selectedCellPosition.hashCode()) * 31;
        C291001Au<Pair<Integer, Boolean>> c291001Au = this.lifecycleFreeScrollPosition;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<InterfaceC1891350zJl> c291001Au2 = this.itemDeleteEvent;
        int iHashCode3 = (iHashCode2 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<Unit> c291001Au3 = this.onResumeNotRefreshingEvent;
        int iHashCode4 = (((iHashCode3 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31) + this.isListEmpty.hashCode()) * 31;
        C291001Au<C1598510rhR> c291001Au4 = this.rerankState;
        return iHashCode4 + (c291001Au4 != null ? c291001Au4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxSkylightListState(listState=");
        sbLIZ.append(this.listState);
        sbLIZ.append(", selectedCellPosition=");
        sbLIZ.append(this.selectedCellPosition);
        sbLIZ.append(", lifecycleFreeScrollPosition=");
        sbLIZ.append(this.lifecycleFreeScrollPosition);
        sbLIZ.append(", itemDeleteEvent=");
        sbLIZ.append(this.itemDeleteEvent);
        sbLIZ.append(", onResumeNotRefreshingEvent=");
        sbLIZ.append(this.onResumeNotRefreshingEvent);
        sbLIZ.append(", isListEmpty=");
        sbLIZ.append(this.isListEmpty);
        sbLIZ.append(", rerankState=");
        sbLIZ.append(this.rerankState);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC636270OxV
    public List<InterfaceC1891350zJl> getListItemState() {
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

    public final C291001Au<InterfaceC1891350zJl> getItemDeleteEvent() {
        return this.itemDeleteEvent;
    }

    public final C291001Au<Pair<Integer, Boolean>> getLifecycleFreeScrollPosition() {
        return this.lifecycleFreeScrollPosition;
    }

    @Override // X.InterfaceC627270Oiz
    public C627660Ojc<InterfaceC1891350zJl> getListState() {
        return this.listState;
    }

    public final C291001Au<Unit> getOnResumeNotRefreshingEvent() {
        return this.onResumeNotRefreshingEvent;
    }

    public final C291001Au<C1598510rhR> getRerankState() {
        return this.rerankState;
    }

    public final C291001Au<C443120HZe<Integer, Boolean, Boolean>> getSelectedCellPosition() {
        return this.selectedCellPosition;
    }

    public final C291001Au<Boolean> isListEmpty() {
        return this.isListEmpty;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InboxSkylightListState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc, C291001Au<C443120HZe<Integer, Boolean, Boolean>> c291001Au, C291001Au<Pair<Integer, Boolean>> c291001Au2, C291001Au<? extends InterfaceC1891350zJl> c291001Au3, C291001Au<Unit> c291001Au4, C291001Au<Boolean> c291001Au5, C291001Au<C1598510rhR> c291001Au6) {
        this.listState = c627660Ojc;
        this.selectedCellPosition = c291001Au;
        this.lifecycleFreeScrollPosition = c291001Au2;
        this.itemDeleteEvent = c291001Au3;
        this.onResumeNotRefreshingEvent = c291001Au4;
        this.isListEmpty = c291001Au5;
        this.rerankState = c291001Au6;
    }
}
