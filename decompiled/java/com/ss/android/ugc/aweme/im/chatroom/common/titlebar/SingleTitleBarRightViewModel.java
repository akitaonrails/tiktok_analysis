package com.ss.android.ugc.aweme.im.chatroom.common.titlebar;

import X.AbstractC879060Ye8;
import X.C01GW;
import X.C0PEM;
import X.C0Y8T;
import X.C0ZV9;
import X.C0ZVA;
import X.C0ZVD;
import X.C1419705h5;
import X.C1527105yP;
import X.C1559260qg8;
import X.C1576040r7C;
import X.C23250099c;
import X.C452501pT;
import X.C723600SZy;
import X.C879070Ye9;
import X.InterfaceC0148002o;
import X.InterfaceC866850XzX;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.FeatureResult;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.notice.NoticeFeature;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.vibefeed.VibeEntranceFeature;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import java.util.List;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS29S0010000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class SingleTitleBarRightViewModel extends AssemViewModel<C0ZV9> {
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, C1527105yP.class, null), true);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 500));
    public FeatureResult LLILLL;
    public C0ZVA LLILZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0ZV9(null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.0XzX, X.0ZVA] */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        AbstractC879060Ye8 abstractC879060Ye8VQ2;
        String strLJFF;
        AbstractC879060Ye8 abstractC879060Ye8VQ22;
        C0Y8T c0y8tLJ;
        NoticeFeature noticeFeatureLIZ = NoticeFeature.LIZ.LIZ();
        boolean z = false;
        if ((noticeFeatureLIZ != null ? noticeFeatureLIZ.LIZLLL() : false) && (abstractC879060Ye8VQ22 = vQ2()) != null && (c0y8tLJ = abstractC879060Ye8VQ22.LJ()) != null) {
            IMHostApi.LIZ.getClass();
            IMHostApi iMHostApiLIZ = C1419705h5.LIZ();
            if (Intrinsics.LJFF(iMHostApiLIZ != null ? Boolean.valueOf(iMHostApiLIZ.LJIILJJIL(c0y8tLJ)) : null, Boolean.FALSE)) {
                ?? r1 = new InterfaceC866850XzX() { // from class: X.0ZVA
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
                    public final void LJJLL(List<C0YAE> list) {
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
                    public final void LJLJI(int i, C0Y8T c0y8t) {
                        if (i == 10) {
                            return;
                        }
                        this.LL.wQ2(c0y8t);
                    }
                };
                AbstractC879060Ye8 abstractC879060Ye8VQ23 = vQ2();
                if (abstractC879060Ye8VQ23 != 0) {
                    abstractC879060Ye8VQ23.LJIIJJI(r1);
                }
                this.LLILZ = r1;
                wQ2(c0y8tLJ);
            }
        }
        if (C1576040r7C.LIZLLL() && (abstractC879060Ye8VQ2 = vQ2()) != null && (strLJFF = abstractC879060Ye8VQ2.LJFF()) != null) {
            VibeEntranceFeature vibeEntranceFeatureLIZ = VibeEntranceFeature.LIZ.LIZ();
            if (Intrinsics.LJFF(vibeEntranceFeatureLIZ != null ? Boolean.valueOf(vibeEntranceFeatureLIZ.LIZ(strLJFF)) : null, Boolean.TRUE)) {
                z = true;
            }
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C0ZVD(this, z, null), 2);
    }

    public final AbstractC879060Ye8 vQ2() {
        return (AbstractC879060Ye8) this.LLILLJJLI.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        AbstractC879060Ye8 abstractC879060Ye8VQ2;
        super.onCleared();
        C0ZVA c0zva = this.LLILZ;
        if (c0zva != null && (abstractC879060Ye8VQ2 = vQ2()) != null) {
            abstractC879060Ye8VQ2.LJIILLIIL(c0zva);
        }
        this.LLILZ = null;
    }

    public final void wQ2(C0Y8T c0y8t) {
        boolean z = true;
        if (c0y8t != null && !C879070Ye9.LJ(c0y8t, false)) {
            if (!C879070Ye9.LJFF(c0y8t)) {
                z = false;
            }
            setState(new AwS29S0010000_14(z, 4));
            return;
        }
        setState(AFwS248S0000000_14.get$arr$(131));
    }
}
