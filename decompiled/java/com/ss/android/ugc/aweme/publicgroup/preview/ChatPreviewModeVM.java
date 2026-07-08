package com.ss.android.ugc.aweme.publicgroup.preview;

import X.AbstractC879060Ye8;
import X.C01GW;
import X.C068M;
import X.C0ZDX;
import X.C1559260qg8;
import X.C452501pT;
import X.C457780HxI;
import X.C869590Y9l;
import X.C899280ZPq;
import X.C899290ZPr;
import X.C907030Zi9;
import X.C907050ZiB;
import X.EnumC899300ZPs;
import X.InterfaceC0148002o;
import X.InterfaceC1693006k4;
import X.InterfaceC1755906uD;
import X.InterfaceC866850XzX;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class ChatPreviewModeVM extends AssemViewModel<C899290ZPr> implements InterfaceC1693006k4 {
    public boolean LLILLL;
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C457780HxI.class, (Class<Object>) null, (String) 13), true);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1100));
    public final C899280ZPq LLILZ = new InterfaceC866850XzX() { // from class: X.0ZPq
        @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
        public final void LJJJJJL(C0Y8T c0y8t) {
        }

        @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
        public final void LJJLIIIJ(C0Y8T c0y8t) {
        }

        @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
        public final void LJJLJLI(List<C0YAE> list) {
        }

        @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
        public final void LJJZZI(List<C0YAE> list) {
        }

        @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
        public final void LJLI(String str, List<C0YAE> list) {
        }

        @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
        public final void LJLILLLLZI(C0Y8T c0y8t) {
        }

        @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
        public final void LJLL(C1711306n1 c1711306n1) {
        }

        @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
        public final void LJZI(C0Y8T c0y8t) {
        }

        @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
        public final void LLIIII(int i, String str) {
        }

        @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
        public final void LLIILZL(int i, String str, List list) {
        }

        @Override // X.InterfaceC868050Y3n
        public final int LLLIIII() {
            return 0;
        }

        @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
        public final void LJJLL(List<C0YAE> list) {
            String strValueOf = String.valueOf(C461720I8s.LIZJ());
            if (list != null && !list.isEmpty()) {
                Iterator<C0YAE> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(String.valueOf(it2.next().getUid()), strValueOf)) {
                        if (this.LL.getState().LL == EnumC899300ZPs.MEMBER) {
                            return;
                        }
                        this.LL.vQ2();
                        return;
                    }
                }
            }
        }

        @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
        public final void LJLJI(int i, C0Y8T c0y8t) {
            if (c0y8t == null || !c0y8t.isMember() || this.LL.getState().LL == EnumC899300ZPs.MEMBER) {
                return;
            }
            this.LL.vQ2();
        }
    };

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C899290ZPr(EnumC899300ZPs.MEMBER, null);
    }

    @Override // X.InterfaceC1693006k4
    public final EnumC899300ZPs getState() {
        return getState().LL;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((AbstractC879060Ye8) this.LLILLJJLI.getValue()).LJIILLIIL(this.LLILZ);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        ((AbstractC879060Ye8) this.LLILLJJLI.getValue()).LJIIJJI(this.LLILZ);
        setState(new AwS593S0100000_14(((C457780HxI) this.LL.getValue()).LL.isPreviewMode() ? new C899290ZPr(EnumC899300ZPs.LOADING, null) : new C899290ZPr(EnumC899300ZPs.MEMBER, null), 137));
    }

    public final void vQ2() {
        if (getState().LL == EnumC899300ZPs.MEMBER) {
            return;
        }
        setState(AFwS248S0000000_14.get$arr$(310));
        ((C457780HxI) this.LL.getValue()).LL.setChatroomInteractionBlocked(false);
        ((C457780HxI) this.LL.getValue()).LL.setChatroomAnalyticsBlocked(false);
        C907030Zi9.LJFF.getClass();
        C907030Zi9 c907030Zi9LIZ = C907050ZiB.LIZ();
        InterfaceC1755906uD interfaceC1755906uD = c907030Zi9LIZ.LIZJ.get(((C457780HxI) this.LL.getValue()).LL.getConversationId());
        if (interfaceC1755906uD != null) {
            interfaceC1755906uD.LJIIL();
        }
        if (this.LLILLL) {
            return;
        }
        setState(AFwS248S0000000_14.get$arr$(585));
    }

    @Override // X.InterfaceC1693006k4
    public final void Ju2(List<? extends C869590Y9l> list) {
        if (getState().LL != EnumC899300ZPs.LOADING) {
            return;
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C869590Y9l c869590Y9l : list) {
                if (!C0ZDX.LJJIJIL(c869590Y9l) && !C0ZDX.LJJJJL(c869590Y9l) && !C068M.LIZ(c869590Y9l)) {
                    setState(AFwS248S0000000_14.get$arr$(312));
                    return;
                }
            }
        }
        setState(AFwS248S0000000_14.get$arr$(311));
        this.LLILLL = true;
    }
}
