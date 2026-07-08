package com.ss.android.ugc.profile.business.ur.following.ui.viewmodel;

import X.EnumC1265000j1W;
import X.InterfaceC0148002o;
import X.InterfaceC1264910j1N;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS33S0001000_19;
import kotlin.jvm.internal.AwS33S0010000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS70S1000000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class RelationTabViewModel extends AssemViewModel<FollowRelationState> implements InterfaceC1264910j1N {
    public String LL = "";
    public final Set<String> LLILLJJLI = new LinkedHashSet();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new FollowRelationState(0, 0, 0, false, null, false, false, false, null, 511, null);
    }

    @Override // X.InterfaceC1264910j1N
    public final void p40() {
        LJJJZ(new AwS70S1000000_19(24));
    }

    @Override // X.InterfaceC1264910j1N
    public final void qb2() {
        LJJJZ(new AwS33S0010000_19(18));
    }

    @Override // X.InterfaceC1264910j1N
    public final String iT1() {
        return this.LL;
    }

    @Override // X.InterfaceC1264910j1N
    public final Set<String> zZ() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1264910j1N
    public final void GK2(int i) {
        LJJJZ(new AwS33S0001000_19(i, 10));
    }

    public final void LJJJZ(Function1<? super FollowRelationState, FollowRelationState> function1) {
        setState(function1);
    }

    @Override // X.InterfaceC1264910j1N
    public final void Ln0(boolean z) {
        LJJJZ(new AwS33S0010000_19(z, 17));
    }

    @Override // X.InterfaceC1264910j1N
    public final void Zo1(boolean z) {
        LJJJZ(new AwS33S0010000_19(z, 19));
    }

    @Override // X.InterfaceC1264910j1N
    public final void bH1(EnumC1265000j1W enumC1265000j1W) {
        LJJJZ(new AwS598S0100000_19(enumC1265000j1W, 625));
    }

    @Override // X.InterfaceC1264910j1N
    public final void cn1(String str) {
        this.LL = str;
    }
}
