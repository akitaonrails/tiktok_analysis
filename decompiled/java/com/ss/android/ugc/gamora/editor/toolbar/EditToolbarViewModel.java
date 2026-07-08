package com.ss.android.ugc.gamora.editor.toolbar;

import X.C01GW;
import X.C0CHQ;
import X.C0ME4;
import X.C1166900gTI;
import X.C11A0;
import X.C1453050nup;
import X.C1459620o5Q;
import X.C1460070o69;
import X.C1460160o6I;
import X.C1460180o6K;
import X.C1464760oDi;
import X.C1644450stX;
import X.C1662100tM0;
import X.C1E13;
import X.C2217381BqS;
import X.C375830EoP;
import X.C452501pT;
import X.C529150Kp7;
import X.C560530Lyd;
import X.EnumC1651790t5N;
import X.InterfaceC1294060jmO;
import X.InterfaceC1460000o62;
import android.animation.LayoutTransition;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.gamora.editor.toolbar.EditToolbarState;
import iyl.i3;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS140S0101000_35;
import kotlin.jvm.internal.AwS20S0002000_35;
import kotlin.jvm.internal.AwS46S0001000_35;
import kotlin.jvm.internal.AwS614S0100000_35;
import kotlin.jvm.internal.AwS628S0100000_14;
import kotlin.jvm.internal.AwS642S0100000_28;
import kotlin.jvm.internal.AwS645S0100000_31;
import kotlin.jvm.internal.AwS85S1000000_35;

/* JADX INFO: loaded from: classes36.dex */
@InterfaceC1294060jmO
public final class EditToolbarViewModel extends LifecycleAwareViewModel<EditToolbarState> implements InterfaceC1460000o62 {
    public static final int LLLI = 8;
    public final MutableLiveData<Integer> LLILZLL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLIZ = new MutableLiveData<>();
    public final MutableLiveData<Unit> LLIZLLLIL = new MutableLiveData<>();
    public final MutableLiveData<C1460160o6I> LLJ = new MutableLiveData<>();
    public final MutableLiveData<C1460070o69> LLJI = new MutableLiveData<>();
    public final MutableLiveData<String> LLJIJIL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLJILJIL = new MutableLiveData<>();
    public final MutableLiveData<Unit> LLJILJILJ = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLJILLL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLJJ = new MutableLiveData<>();
    public final C01GW LLJJI = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(313));
    public final LiveData<Boolean> LLJJIII = lR2();
    public final MutableLiveData<Boolean> LLJJIJI;
    public final LiveData<Boolean> LLJJIJIIJIL;
    public final LiveData<Boolean> LLJJIJIL;
    public final MutableLiveData<Boolean> LLJJJ;
    public final LiveData<Boolean> LLJJJIL;
    public final C560530Lyd<Unit> LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final MutableLiveData<C1460180o6K> LLJLILLLLZIIL;
    public final MutableLiveData<C1460180o6K> LLJLL;
    public final MutableLiveData<C1460180o6K> LLJLLIL;
    public final C01GW LLJLLL;
    public final LiveData<Pair<Boolean, Boolean>> LLJZ;
    public final MutableLiveData<LivePhotoPreviewMode> LLJZIJLIL;
    public final MutableLiveData<Integer> LLL;
    public final C1459620o5Q LLLF;
    public boolean LLLFF;
    public boolean LLLFFI;
    public String LLLFZ;

    @Override // X.InterfaceC1460000o62
    public void rt() {
        this.LLLFZ = null;
    }

    private final Map<Integer, MutableLiveData<Boolean>> nR2() {
        return (Map) this.LLJJL.getValue();
    }

    private final Map<Integer, MutableLiveData<ImageUrlModel>> oR2() {
        return (Map) this.LLJJJJLIIL.getValue();
    }

    private final Map<Integer, MutableLiveData<Boolean>> pR2() {
        return (Map) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    private final Map<Integer, MutableLiveData<Boolean>> qR2() {
        return (Map) this.LLJLIL.getValue();
    }

    private final Map<Integer, MutableLiveData<Boolean>> rR2() {
        return (Map) this.LLJL.getValue();
    }

    private final Map<Integer, MutableLiveData<Boolean>> sR2() {
        return (Map) this.LLJJJJJIL.getValue();
    }

    @Override // X.InterfaceC1455610nyx
    public void DQ() {
        this.LLJJJJ.LJIIJ(Unit.LIZ);
    }

    @Override // X.InterfaceC1460000o62
    public boolean Dq() {
        return this.LLLF.LIZIZ;
    }

    @Override // X.InterfaceC1460000o62
    public void Kv2() {
        Nn2(1801, AFwS266S0000000_25.get$arr$(277));
    }

    @Override // X.InterfaceC564950MDt
    public void TE1() {
        Nn2(1800, AFwS266S0000000_25.get$arr$(275));
    }

    @Override // X.InterfaceC1460000o62
    public void Yq2() {
        this.LLIZLLLIL.setValue(Unit.LIZ);
    }

    @Override // X.InterfaceC1455610nyx
    public void bo() {
        setState(AFwS283S0000000_35.get$arr$(103));
    }

    @Override // X.InterfaceC1455610nyx
    public void j5() {
        this.LLJILJILJ.setValue(Unit.LIZ);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* JADX INFO: renamed from: jR2, reason: merged with bridge method [inline-methods] */
    public EditToolbarState zQ2() {
        return new EditToolbarState(new C11A0(), null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, false, false, null, null, null, null, null, null);
    }

    public final MutableLiveData<Boolean> lR2() {
        return (MutableLiveData) this.LLJJI.getValue();
    }

    public final MutableLiveData<Pair<Boolean, Boolean>> mR2() {
        return (MutableLiveData) this.LLJLLL.getValue();
    }

    @Override // X.InterfaceC1455610nyx
    public void refresh() {
        setStateImmediate(AFwS283S0000000_35.get$arr$(104));
    }

    @Override // X.InterfaceC1460000o62
    public void yY() {
        Nn2(1801, AFwS266S0000000_25.get$arr$(276));
    }

    public EditToolbarViewModel() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.LLJJIJI = mutableLiveData;
        this.LLJJIJIIJIL = mutableLiveData;
        this.LLJJIJIL = new MutableLiveData();
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.LLJJJ = mutableLiveData2;
        this.LLJJJIL = mutableLiveData2;
        this.LLJJJJ = new C560530Lyd<>();
        this.LLJJJJJIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
        this.LLJJJJLIIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(302));
        this.LLJJL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(301));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(303));
        this.LLJL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(299));
        this.LLJLIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(298));
        this.LLJLILLLLZIIL = new MutableLiveData<>();
        this.LLJLL = new MutableLiveData<>();
        this.LLJLLIL = new MutableLiveData<>();
        this.LLJLLL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(314));
        this.LLJZ = mR2();
        this.LLJZIJLIL = new MutableLiveData<>();
        this.LLL = new MutableLiveData<>(0);
        this.LLLF = new C1459620o5Q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1460000o62
    public C1464760oDi AY() {
        return ((EditToolbarState) FQ2()).getAiLiveState();
    }

    @Override // X.InterfaceC1460000o62
    public LiveData<String> EH0() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC1460000o62
    public LiveData<C1460070o69> JG0() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1460000o62
    public C1459620o5Q OO() {
        return this.LLLF;
    }

    @Override // X.InterfaceC1460000o62
    public LiveData<C1460160o6I> Ov() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1460000o62
    public boolean Oz1() {
        return this.LLLFFI;
    }

    @Override // X.InterfaceC1455610nyx
    public LiveData<Boolean> Py1() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1460000o62
    public LiveData<Boolean> QM1() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1455610nyx
    public LiveData<Boolean> RJ() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC1460000o62
    public LiveData<Boolean> Wc1() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC1460000o62
    public LiveData<Boolean> Wr() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC1460000o62
    public MutableLiveData<LivePhotoPreviewMode> X72() {
        return this.LLJZIJLIL;
    }

    @Override // X.InterfaceC1460000o62
    public String Ye() {
        return this.LLLFZ;
    }

    @Override // X.InterfaceC1460000o62
    public LiveData<Boolean> ev0() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC1460000o62
    public boolean fi1() {
        return this.LLLFF;
    }

    @Override // X.InterfaceC1460000o62
    public LiveData<Integer> getCurrentState() {
        return this.LLL;
    }

    @Override // X.InterfaceC1455610nyx
    public LiveData<Unit> jf1() {
        return this.LLIZLLLIL;
    }

    public final C1459620o5Q kR2() {
        return this.LLLF;
    }

    public C560530Lyd<Unit> tR2() {
        return this.LLJJJJ;
    }

    public final boolean uR2() {
        return this.LLLFFI;
    }

    @Override // X.InterfaceC1460000o62
    public LiveData<Unit> ug0() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1460000o62
    public LiveData<Boolean> v82() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC1455610nyx
    public LiveData<Integer> ww() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1455610nyx
    public LiveData<Pair<Boolean, Boolean>> x8() {
        return this.LLJZ;
    }

    @Override // X.InterfaceC1455610nyx
    public /* bridge */ /* synthetic */ LiveEvent xg1() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC1460000o62
    public LiveData<Boolean> yB2() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC1460000o62
    public void A2(int i) {
        setState(new AwS46S0001000_35(i, 8));
    }

    @Override // X.InterfaceC1455610nyx
    public void BJ(boolean z) {
        this.LLJJJ.setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1460000o62
    public void FA1(int i) {
        setState(new AwS46S0001000_35(i, 9));
    }

    @Override // X.InterfaceC1455610nyx
    public void Fe2(boolean z) {
        this.LLJILLL.setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC564950MDt
    public void GB2(boolean z) {
        this.LLJJ.setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1460000o62
    public void Jo2(boolean z) {
        Ux(1300, z);
    }

    @Override // X.InterfaceC1460000o62
    public void Kb0(String str) {
        setState(new AwS85S1000000_35(str, 9));
    }

    @Override // X.InterfaceC1460000o62
    public void Ob(boolean z) {
        this.LLLF.LIZIZ = z;
    }

    @Override // X.InterfaceC564950MDt
    public void Q81(C1464760oDi c1464760oDi) {
        setStateImmediate(new AwS614S0100000_35(c1464760oDi, 117));
    }

    @Override // X.InterfaceC1460000o62
    public LiveData<C1460180o6K> T80(int i) {
        if (i == 17) {
            return this.LLJLILLLLZIIL;
        }
        if (i == 15) {
            return this.LLJLL;
        }
        if (i == 4) {
            return this.LLJLLIL;
        }
        return null;
    }

    @Override // X.InterfaceC1460000o62
    public void TA2(EnumC1651790t5N enumC1651790t5N) {
        setState(new AwS614S0100000_35(enumC1651790t5N, 116));
    }

    @Override // X.InterfaceC1460000o62
    public void Tx(boolean z) {
        Ux(14, z);
    }

    @Override // X.InterfaceC1460000o62
    public void UH2(LivePhotoPreviewMode livePhotoPreviewMode) {
        setState(new AwS614S0100000_35(livePhotoPreviewMode, 118));
    }

    @Override // X.InterfaceC564950MDt
    public void Uf0(Function2<? super Integer, ? super Integer, Unit> function2) {
        Rc0(1800, new AwS628S0100000_14(function2, (Function2<? super Integer, ? super Integer, Unit>) 40));
    }

    @Override // X.InterfaceC1455610nyx
    public void Ws(int i) {
        this.LLILZLL.setValue(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1460000o62
    public void cT0(boolean z) {
        this.LLJILJIL.setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1460000o62
    public LiveData<ImageUrlModel> cs0(int i) {
        return oR2().get(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1460000o62
    public LiveData<Boolean> dD2(int i) {
        return rR2().get(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1460000o62
    public void fl(C1460160o6I c1460160o6I) {
        this.LLJ.setValue(c1460160o6I);
    }

    @Override // X.InterfaceC1455610nyx
    public LiveData<Boolean> hB(int i) {
        return pR2().get(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1460000o62
    public void k50(boolean z) {
        this.LLLFF = z;
    }

    @Override // X.InterfaceC1460000o62
    public void lC0(C1453050nup c1453050nup) {
        setState(new AwS614S0100000_35(c1453050nup, 115));
    }

    @Override // X.InterfaceC1455610nyx
    public LiveData<Boolean> lQ1(int i) {
        return nR2().get(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1460000o62
    public void oz(boolean z) {
        C0CHQ.LIZ().LJJIIZI().LJJJJI(z);
        Ux(26, z);
    }

    @Override // X.InterfaceC1460000o62
    public void p5(boolean z) {
        this.LLJJIJI.setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1460000o62
    public void sF0(boolean z) {
        this.LLLFFI = z;
    }

    @Override // X.InterfaceC1455610nyx
    public void ug2(C0ME4 c0me4) {
        this.LLJIJIL.setValue(c0me4.getDescription());
    }

    @Override // X.InterfaceC1455610nyx
    public LiveData<Boolean> v01(int i) {
        return sR2().get(Integer.valueOf(i));
    }

    public final void vR2(int i) {
        this.LLL.setValue(Integer.valueOf(i));
    }

    public final void wR2(boolean z) {
        this.LLLFFI = z;
    }

    public final void xR2(String str) {
        this.LLLFZ = str;
    }

    @Override // X.InterfaceC1460000o62
    public void EF1(LifecycleOwner lifecycleOwner, Function1<? super LivePhotoPreviewMode, Unit> function1) {
        C1166900gTI.LIZ(this, lifecycleOwner, new C2217381BqS() { // from class: X.1E0y
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditToolbarState) obj).getLivePhotoPreviewMode();
            }
        }, new AwS642S0100000_28(function1, (Function1<? super Function0<Unit>, Unit>) 41));
    }

    @Override // X.InterfaceC1460000o62
    public void EJ2(int i, ImageUrlModel imageUrlModel) {
        MutableLiveData<ImageUrlModel> mutableLiveData = oR2().get(Integer.valueOf(i));
        if (mutableLiveData != null) {
            mutableLiveData.setValue(imageUrlModel);
        }
    }

    @Override // X.InterfaceC1460000o62
    public void GE0(LifecycleOwner lifecycleOwner, Function1<? super C1464760oDi, Unit> function1) {
        C1166900gTI.LIZ(this, lifecycleOwner, new C2217381BqS() { // from class: X.1E0v
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditToolbarState) obj).getAiLiveState();
            }
        }, new AwS642S0100000_28(function1, (Function1<? super Function0<Unit>, Unit>) 44));
    }

    @Override // X.InterfaceC1460000o62
    public void Ga0(int i, C1662100tM0 c1662100tM0) {
        setState(new AwS140S0101000_35(i, c1662100tM0, 4));
    }

    @Override // X.InterfaceC1460000o62
    public void Gz2(int i, Function1<? super View, Unit> function1) {
        setState(new AwS140S0101000_35(i, (int) function1, (Function1<? super View, Unit>) 3));
    }

    @Override // X.InterfaceC1460000o62
    public void HG(LifecycleOwner lifecycleOwner, Function1<? super C375830EoP<EnumC1651790t5N>, Unit> function1) {
        C1166900gTI.LIZ(this, lifecycleOwner, new C2217381BqS() { // from class: X.1E16
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditToolbarState) obj).getHidePromote();
            }
        }, new AwS645S0100000_31(function1, (Function1<? super C375830EoP<EnumC1651790t5N>, Unit>) 81));
    }

    @Override // X.InterfaceC1455610nyx
    public void Jf1(boolean z, boolean z2) {
        mR2().setValue(new Pair<>(Boolean.valueOf(z), Boolean.valueOf(z2)));
        this.LLIZ.setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1460000o62
    public void Jj0(int i, boolean z) {
        MutableLiveData<Boolean> mutableLiveData = qR2().get(Integer.valueOf(i));
        if (mutableLiveData != null) {
            mutableLiveData.postValue(Boolean.valueOf(z));
        }
    }

    @Override // X.InterfaceC1460000o62
    public void KK0(int i, String str) {
        setState(new C1E13(i, str));
    }

    @Override // X.InterfaceC1460000o62
    public void L31(LifecycleOwner lifecycleOwner, Function1<? super C1644450stX<Integer, Function1<View, Unit>>, Unit> function1) {
        C1166900gTI.LIZ(this, lifecycleOwner, new C2217381BqS() { // from class: X.1E17
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditToolbarState) obj).getIconAnimation();
            }
        }, new AwS642S0100000_28(function1, (Function1<? super Function0<Unit>, Unit>) 51));
    }

    @Override // X.InterfaceC1460000o62
    public void NI1(int i, int i2) {
        setState(new AwS20S0002000_35(i, i2, 1));
    }

    @Override // X.InterfaceC1460000o62
    public void Nn2(int i, Function1<? super i3, i3> function1) {
        this.LLJI.setValue(new C1460070o69(i, function1));
    }

    @Override // X.InterfaceC1460000o62
    public void OU(LifecycleOwner lifecycleOwner, Function1<? super String, Unit> function1) {
        C1166900gTI.LIZ(this, lifecycleOwner, new C2217381BqS() { // from class: X.1E1A
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditToolbarState) obj).getChooseMusicText();
            }
        }, new AwS642S0100000_28(function1, (Function1<? super Function0<Unit>, Unit>) 49));
    }

    @Override // X.InterfaceC1460000o62
    public void Rc0(int i, Function2<? super Integer, ? super Integer, Unit> function2) {
        setStateImmediate(new AwS140S0101000_35(i, (int) function2, (Function2<? super Integer, ? super Integer, Unit>) 2));
    }

    @Override // X.InterfaceC1460000o62
    public void TL2(LifecycleOwner lifecycleOwner, Function1<? super C1644450stX<Integer, LayoutTransition>, Unit> function1) {
        C1166900gTI.LIZ(this, lifecycleOwner, new C2217381BqS() { // from class: X.1E0z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditToolbarState) obj).getMakeItemVisibleOnCollapsed();
            }
        }, new AwS642S0100000_28(function1, (Function1<? super Function0<Unit>, Unit>) 42));
    }

    @Override // X.InterfaceC1455610nyx
    public void Uh1(int i, boolean z) {
        MutableLiveData<Boolean> mutableLiveData = pR2().get(Integer.valueOf(i));
        if (mutableLiveData != null) {
            mutableLiveData.setValue(Boolean.valueOf(z));
        }
    }

    @Override // X.InterfaceC1460000o62
    public void Ux(int i, boolean z) {
        MutableLiveData<Boolean> mutableLiveData = rR2().get(Integer.valueOf(i));
        if (mutableLiveData != null) {
            mutableLiveData.setValue(Boolean.valueOf(z));
        }
    }

    @Override // X.InterfaceC1460000o62
    public void WM1(LifecycleOwner lifecycleOwner, Function1<? super C1644450stX<Integer, C1662100tM0>, Unit> function1) {
        C1166900gTI.LIZ(this, lifecycleOwner, new C2217381BqS() { // from class: X.1E10
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditToolbarState) obj).getShowPromote();
            }
        }, new AwS642S0100000_28(function1, (Function1<? super Function0<Unit>, Unit>) 45));
    }

    @Override // X.InterfaceC1460000o62
    public void YB2(LifecycleOwner lifecycleOwner, Function1<? super C529150Kp7, Unit> function1) {
        C1166900gTI.LIZ(this, lifecycleOwner, new C2217381BqS() { // from class: X.1E15
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditToolbarState) obj).getHideMoreEvent();
            }
        }, new AwS642S0100000_28(function1, (Function1<? super Function0<Unit>, Unit>) 50));
    }

    @Override // X.InterfaceC1460000o62
    public void YF2(LifecycleOwner lifecycleOwner, Function1<? super C1644450stX<Integer, Function2<Integer, Integer, Unit>>, Unit> function1) {
        C1166900gTI.LIZ(this, lifecycleOwner, new C2217381BqS() { // from class: X.1E11
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditToolbarState) obj).getActionWithItemPositionEvent();
            }
        }, new AwS642S0100000_28(function1, (Function1<? super Function0<Unit>, Unit>) 46));
    }

    @Override // X.InterfaceC1460000o62
    public void ci1(LifecycleOwner lifecycleOwner, Function1<? super C529150Kp7, Unit> function1) {
        C1166900gTI.LIZ(this, lifecycleOwner, new C2217381BqS() { // from class: X.1E0w
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditToolbarState) obj).getRefresh();
            }
        }, new AwS642S0100000_28(function1, (Function1<? super Function0<Unit>, Unit>) 43));
    }

    @Override // X.InterfaceC1460000o62
    public void gK0(LifecycleOwner lifecycleOwner, Function1<? super C1644450stX<Integer, Integer>, Unit> function1) {
        C1166900gTI.LIZ(this, lifecycleOwner, new C2217381BqS() { // from class: X.1E0x
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditToolbarState) obj).getIconRes();
            }
        }, new AwS642S0100000_28(function1, (Function1<? super Function0<Unit>, Unit>) 40));
    }

    @Override // X.InterfaceC1460000o62
    public void gr1(LifecycleOwner lifecycleOwner, Function1<? super C1644450stX<Integer, String>, Unit> function1) {
        C1166900gTI.LIZ(this, lifecycleOwner, new C2217381BqS() { // from class: X.1E19
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditToolbarState) obj).getIconLottieAnimation();
            }
        }, new AwS642S0100000_28(function1, (Function1<? super Function0<Unit>, Unit>) 53));
    }

    @Override // X.InterfaceC1460000o62
    public void mT0(int i, int i2) {
        setState(new AwS20S0002000_35(i, i2, 2));
    }

    @Override // X.InterfaceC1460000o62
    public void rm(int i, boolean z) {
        MutableLiveData<Boolean> mutableLiveData = sR2().get(Integer.valueOf(i));
        if (mutableLiveData != null) {
            mutableLiveData.setValue(Boolean.valueOf(z));
        }
    }

    @Override // X.InterfaceC1460000o62
    public void tA(LifecycleOwner lifecycleOwner, Function1<? super C1453050nup, Unit> function1) {
        C1166900gTI.LIZ(this, lifecycleOwner, new C2217381BqS() { // from class: X.1E12
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditToolbarState) obj).getAutoEnhanceStatus();
            }
        }, new AwS642S0100000_28(function1, (Function1<? super Function0<Unit>, Unit>) 47));
    }

    @Override // X.InterfaceC1460000o62
    public void tL2(LifecycleOwner lifecycleOwner, Function1<? super Integer, Unit> function1) {
        C1166900gTI.LIZ(this, lifecycleOwner, new C2217381BqS() { // from class: X.1E14
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditToolbarState) obj).getChooseMusicIconRes();
            }
        }, new AwS642S0100000_28(function1, (Function1<? super Function0<Unit>, Unit>) 48));
    }

    @Override // X.InterfaceC1455610nyx
    public void ut0(int i, boolean z) {
        MutableLiveData<Boolean> mutableLiveData = nR2().get(Integer.valueOf(i));
        if (mutableLiveData != null) {
            mutableLiveData.setValue(Boolean.valueOf(z));
        }
    }

    @Override // X.InterfaceC1460000o62
    public void wv(int i, boolean z) {
        MutableLiveData<Boolean> mutableLiveData = qR2().get(Integer.valueOf(i));
        if (mutableLiveData != null) {
            mutableLiveData.setValue(Boolean.valueOf(z));
        }
    }

    @Override // X.InterfaceC1460000o62
    public void xD2(int i, LayoutTransition layoutTransition) {
        setState(new AwS140S0101000_35(i, layoutTransition, 1));
    }

    @Override // X.InterfaceC1460000o62
    public void zD2(LifecycleOwner lifecycleOwner, Function1<? super C1644450stX<Integer, Integer>, Unit> function1) {
        C1166900gTI.LIZ(this, lifecycleOwner, new C2217381BqS() { // from class: X.1E18
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((EditToolbarState) obj).getIconColor();
            }
        }, new AwS642S0100000_28(function1, (Function1<? super Function0<Unit>, Unit>) 52));
    }

    @Override // X.InterfaceC1455610nyx
    public void Fp2(int i, boolean z, Function0<Unit> function0) {
        if (i == 17) {
            this.LLJLILLLLZIIL.setValue(new C1460180o6K(function0, z));
        } else if (i == 15) {
            this.LLJLL.setValue(new C1460180o6K(function0, z));
        } else {
            if (i != 4) {
                return;
            }
            this.LLJLLIL.setValue(new C1460180o6K(function0, z));
        }
    }
}
