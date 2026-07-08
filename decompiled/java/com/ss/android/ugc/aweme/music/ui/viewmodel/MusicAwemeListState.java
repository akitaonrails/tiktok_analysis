package com.ss.android.ugc.aweme.music.ui.viewmodel;

import X.C1761680vwc;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.jedi.arch.NestedState;
import com.bytedance.jedi.arch.ext.list.ICommonListState;
import com.bytedance.jedi.arch.ext.list.ListState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class MusicAwemeListState implements ICommonListState<Object> {
    public boolean isNeedControl;
    public final String musicId;
    public int outBound;
    public final ListState<Object, C1761680vwc> substate;

    public MusicAwemeListState() {
        this("", -1, false, new ListState(new C1761680vwc(2), null, null, null, null, 30, null));
    }

    public final MusicAwemeListState copy(String str, int i, boolean z, ListState<Object, C1761680vwc> listState) {
        return new MusicAwemeListState(str, i, z, listState);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicAwemeListState)) {
            return false;
        }
        MusicAwemeListState musicAwemeListState = (MusicAwemeListState) obj;
        return Intrinsics.LJFF(this.musicId, musicAwemeListState.musicId) && this.outBound == musicAwemeListState.outBound && this.isNeedControl == musicAwemeListState.isNeedControl && Intrinsics.LJFF(this.substate, musicAwemeListState.substate);
    }

    public int hashCode() {
        return (((((this.musicId.hashCode() * 31) + this.outBound) * 31) + C786410Ut5.Z2(this.isNeedControl)) * 31) + this.substate.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicAwemeListState(musicId=");
        sbLIZ.append(this.musicId);
        sbLIZ.append(", outBound=");
        sbLIZ.append(this.outBound);
        sbLIZ.append(", isNeedControl=");
        sbLIZ.append(this.isNeedControl);
        sbLIZ.append(", substate=");
        sbLIZ.append(this.substate);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final int getOutBound() {
        return this.outBound;
    }

    public final boolean isNeedControl() {
        return this.isNeedControl;
    }

    @Override // com.bytedance.jedi.arch.NestedState
    public ListState<Object, C1761680vwc> getSubstate() {
        return this.substate;
    }

    @Override // com.bytedance.jedi.arch.NestedState
    public NestedState<ListState<Object, C1761680vwc>> newSubstate(ListState<Object, C1761680vwc> listState) {
        return copy(this.musicId, this.outBound, this.isNeedControl, listState);
    }

    public final void setNeedControl(boolean z) {
        this.isNeedControl = z;
    }

    public final void setOutBound(int i) {
        this.outBound = i;
    }

    public MusicAwemeListState(String str, int i, boolean z, ListState<Object, C1761680vwc> listState) {
        this.musicId = str;
        this.outBound = i;
        this.isNeedControl = z;
        this.substate = listState;
    }
}
