package com.ss.android.ugc.profile.business.effect;

import X.C1761680vwc;
import X.C2188811AlT;
import com.bytedance.jedi.arch.ext.list.ICommonListState;
import com.bytedance.jedi.arch.ext.list.ListState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class EffectProfileState implements ICommonListState<Object> {
    public static final int $stable = 8;
    public final ListState<Object, C1761680vwc> substate;
    public final String userId;

    public EffectProfileState() {
        this(null, new ListState(new C1761680vwc(3), null, null, null, null, 30, null));
    }

    public final EffectProfileState copy(String str, ListState<Object, C1761680vwc> listState) {
        return new EffectProfileState(str, listState);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectProfileState)) {
            return false;
        }
        EffectProfileState effectProfileState = (EffectProfileState) obj;
        return Intrinsics.LJFF(this.userId, effectProfileState.userId) && Intrinsics.LJFF(this.substate, effectProfileState.substate);
    }

    public int hashCode() {
        String str = this.userId;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.substate.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectProfileState(userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", substate=");
        sbLIZ.append(this.substate);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getUserId() {
        return this.userId;
    }

    @Override // com.bytedance.jedi.arch.NestedState
    public ListState<Object, C1761680vwc> getSubstate() {
        return this.substate;
    }

    @Override // com.bytedance.jedi.arch.NestedState
    public EffectProfileState newSubstate(ListState<Object, C1761680vwc> listState) {
        return copy(this.userId, listState);
    }

    public EffectProfileState(String str, ListState<Object, C1761680vwc> listState) {
        this.userId = str;
        this.substate = listState;
    }
}
