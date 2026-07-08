package com.ss.android.ugc.aweme.ftc.components.sticker.core;

import X.C01GW;
import X.C13LP;
import X.C1460790o7J;
import X.C194561119z;
import X.C196925122x;
import X.C2274441E0s;
import X.C2274451E0t;
import X.C2274461E0u;
import X.C452501pT;
import X.InterfaceC1455150nyD;
import X.InterfaceC1457400o1q;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS47S0010000_35;
import kotlin.jvm.internal.AwS614S0100000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class FTCEditStickerViewModel extends LifecycleAwareViewModel<FTCEditStickerState> implements InterfaceC1455150nyD {
    public static final int LLJILJIL = 8;
    public C1460790o7J LLILZLL;
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(193));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(192));
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(190));
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(189));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(191));

    @Override // X.InterfaceC1455010nxz
    public void hide() {
    }

    @Override // X.InterfaceC1455010nxz
    public void vi1() {
    }

    @Override // X.InterfaceC1455010nxz
    public boolean C1() {
        C1460790o7J c1460790o7J = this.LLILZLL;
        if (c1460790o7J != null) {
            return c1460790o7J.C1();
        }
        return false;
    }

    public final MutableLiveData<Boolean> CQ0() {
        return (MutableLiveData) this.LLIZLLLIL.getValue();
    }

    public final MutableLiveData<Boolean> Mk0() {
        return (MutableLiveData) this.LLJI.getValue();
    }

    @Override // X.InterfaceC1455010nxz
    public MutableLiveData<Boolean> fz0() {
        return (MutableLiveData) this.LLJIJIL.getValue();
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* JADX INFO: renamed from: jR2, reason: merged with bridge method [inline-methods] */
    public FTCEditStickerState zQ2() {
        return new FTCEditStickerState(new C194561119z(), null, null, null, null, null, null);
    }

    public final MutableLiveData<Boolean> rb() {
        return (MutableLiveData) this.LLJ.getValue();
    }

    @Override // X.InterfaceC1455010nxz
    public void show() {
        setStateImmediate(AFwS283S0000000_35.get$arr$(43));
    }

    @Override // X.InterfaceC1455010nxz
    public String tB2() {
        InterfaceC1457400o1q interfaceC1457400o1q;
        List<C196925122x> listLLLLLLZZ;
        String strLJJLIIIJ;
        C1460790o7J c1460790o7J = this.LLILZLL;
        return (c1460790o7J == null || (interfaceC1457400o1q = c1460790o7J.LLJJLIIIJLLLLLLLZ) == null || (listLLLLLLZZ = interfaceC1457400o1q.LLLLLLZZ()) == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(listLLLLLLZZ, null, null, null, 0, null, null, 63)) == null) ? "" : strLJJLIIIJ;
    }

    @Override // X.InterfaceC1455010nxz
    public void u1() {
        setStateImmediate(AFwS283S0000000_35.get$arr$(42));
    }

    public final MutableLiveData<Boolean> zP1() {
        return (MutableLiveData) this.LLIZ.getValue();
    }

    @Override // X.InterfaceC1455010nxz
    public void a92(boolean z) {
        setStateImmediate(new AwS47S0010000_35(z, 2));
    }

    @Override // X.InterfaceC1455150nyD
    public void hD1(C1460790o7J c1460790o7J) {
        this.LLILZLL = c1460790o7J;
    }

    @Override // X.InterfaceC1455010nxz
    public void l0(Pair<Integer, Integer> pair) {
        setStateImmediate(new AwS614S0100000_35(pair, (Pair<Integer, Integer>) 97));
    }

    @Override // X.InterfaceC1455010nxz
    public void Qi0(float f, long j) {
        setState(new C2274451E0t(f, j));
    }

    @Override // X.InterfaceC1455010nxz
    public void v1(int i, boolean z) {
        setStateImmediate(new C2274461E0u(i, z));
    }

    @Override // X.InterfaceC1455010nxz
    public void jJ(float f, float f2, float f3) {
        setState(new C2274441E0s(f, f2, f3));
    }
}
