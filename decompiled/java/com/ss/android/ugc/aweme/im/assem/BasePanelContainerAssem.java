package com.ss.android.ugc.aweme.im.assem;

import X.AbstractC1387200mCc;
import X.AbstractC2173821A5s;
import X.C019F;
import X.C01GW;
import X.C0H25;
import X.C0IE2;
import X.C0TVI;
import X.C13LE;
import X.C14K9;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1629106Zl;
import X.C1637806bA;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C23250099c;
import X.C447810HhD;
import X.C452501pT;
import X.C457870HxR;
import X.C457880HxS;
import X.C457900HxU;
import X.C494501wF;
import X.C520040KaQ;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.EnumC457890HxT;
import X.EnumC457910HxV;
import X.InterfaceC2217461Bqa;
import android.os.Build;
import android.view.View;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.ability.RequestKeyboardAbility;
import com.ss.android.ugc.aweme.im.ability.SuppressPanelAutoSwitchAbility;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BasePanelContainerAssem extends UIContentAssem implements RequestKeyboardAbility, SuppressPanelAutoSwitchAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final boolean LLIZLLLIL = true;
    public EnumC457890HxT LLJ = EnumC457890HxT.NONE;
    public final AssemVMLazy LLJI;
    public boolean LLJIJIL;
    public final boolean LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BasePanelContainerAssem.class, "panelStateVM", "getPanelStateVM()Lcom/ss/android/ugc/aweme/im/viewmodel/PanelStateViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BasePanelContainerAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PanelStateViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 107), AFwS236S0000000_6.get$arr$(76), null, true);
        this.LLJILJIL = true;
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 106));
        this.LLJILLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 105));
        this.LLJJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 104));
    }

    public boolean Ho() {
        return false;
    }

    public boolean No() {
        return false;
    }

    public void Vo() {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final PanelStateViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return (PanelStateViewModel) assemVMLazy.getValue();
    }

    public final boolean Oo() {
        return Ho() || Build.VERSION.SDK_INT < 30;
    }

    public final boolean So() {
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || !C494501wF.LIZ(fragmentLJI) || (Jo().LLIZ.getValue() instanceof C1629106Zl)) {
            return false;
        }
        PanelStateViewModel panelStateViewModelJo = Jo();
        panelStateViewModelJo.jt(C1629106Zl.LL, panelStateViewModelJo.Ke().getValue().intValue());
        return true;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), SuppressPanelAutoSwitchAbility.class, null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, SuppressPanelAutoSwitchAbility.class, null, null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        Zo(true, EnumC457910HxV.LIFECYCLE);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        Zo(false, EnumC457910HxV.LIFECYCLE);
    }

    public boolean Go() {
        return this.LLIZLLLIL;
    }

    public boolean Lo() {
        return this.LLJILJIL;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        C19EG c19egLIZ;
        OnBackPressedDispatcher onBackPressedDispatcher;
        super.onViewCreated(view);
        if (Oo()) {
            this.LLJIJIL = true;
            ((C0H25) this.LLJILLL.getValue()).LJJIIJ((C457880HxS) this.LLJJ.getValue());
            ((C0H25) this.LLJILLL.getValue()).onResume();
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C457870HxR(this, view, null), 3);
        AbstractC2173821A5s abstractC2173821A5s = (AbstractC2173821A5s) this.LLJILJILJ.getValue();
        if (abstractC2173821A5s != null && (c19egLIZ = C724240Sb0.LIZ(this)) != null && (onBackPressedDispatcher = c19egLIZ.getOnBackPressedDispatcher()) != null) {
            getActualLifecycleOwner();
            onBackPressedDispatcher.LIZ(this, abstractC2173821A5s);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.ability.SuppressPanelAutoSwitchAbility
    public final void rq0(boolean z) {
        Zo(z, EnumC457910HxV.CUSTOM);
    }

    public final void Zo(boolean z, EnumC457910HxV enumC457910HxV) {
        EnumC457890HxT enumC457890HxT;
        View rootView;
        View rootView2;
        EnumC457890HxT enumC457890HxT2 = this.LLJ;
        if (z) {
            if (enumC457910HxV == EnumC457910HxV.LIFECYCLE) {
                enumC457890HxT = EnumC457890HxT.CUSTOM_DETACH;
                if (enumC457890HxT2 != enumC457890HxT) {
                    enumC457890HxT = EnumC457890HxT.LIFECYCLE_DETACH;
                }
            } else if (enumC457910HxV == EnumC457910HxV.CUSTOM) {
                enumC457890HxT = EnumC457890HxT.CUSTOM_DETACH;
            } else {
                enumC457890HxT = EnumC457890HxT.ATTACH;
            }
        } else if (enumC457910HxV != EnumC457910HxV.LIFECYCLE || enumC457890HxT2 != (enumC457890HxT = EnumC457890HxT.CUSTOM_DETACH)) {
            enumC457890HxT = EnumC457890HxT.ATTACH;
        }
        if (enumC457890HxT.isAttach() == this.LLJ.isAttach()) {
            this.LLJ = enumC457890HxT;
            return;
        }
        this.LLJ = enumC457890HxT;
        int i = C457900HxU.LIZ[enumC457890HxT.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i == 4) {
                    return;
                } else {
                    throw new C1954807lC();
                }
            }
            if (this.LLJ == EnumC457890HxT.LIFECYCLE_DETACH && !Go()) {
                return;
            }
            if (Oo()) {
                ((C0H25) this.LLJILLL.getValue()).onPause();
                return;
            }
            View viewLJJIJL = LJJIJL();
            AbstractC1387200mCc abstractC1387200mCcLIZ = C520040KaQ.LIZ(viewLJJIJL);
            if (abstractC1387200mCcLIZ == null || (rootView2 = abstractC1387200mCcLIZ.LJI()) == null) {
                rootView2 = viewLJJIJL.getRootView();
            }
            C14K9.LJIJJ(rootView2, new C0TVI() { // from class: X.0HxW
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                    return c20246014Ju;
                }
            });
            return;
        }
        if (Oo()) {
            if (this.LLJIJIL) {
                ((C0H25) this.LLJILLL.getValue()).onResume();
            }
        } else {
            View viewLJJIJL2 = LJJIJL();
            AbstractC1387200mCc abstractC1387200mCcLIZ2 = C520040KaQ.LIZ(viewLJJIJL2);
            if (abstractC1387200mCcLIZ2 == null || (rootView = abstractC1387200mCcLIZ2.LJI()) == null) {
                rootView = viewLJJIJL2.getRootView();
            }
            C14K9.LJIJJ(rootView, new C0IE2(this, 0));
        }
        if (!(Jo().LLIZ.getValue() instanceof C447810HhD)) {
            return;
        }
        Fr();
    }

    public static void ap(View view, int i, int i2, int i3) {
        C786410Ut5.LJLLLLLL(0, view);
        if (i2 >= i3) {
            if (i2 != view.getHeight()) {
                view.getLayoutParams().height = i2;
                view.requestLayout();
            }
            view.animate().translationY(i2 - i3).setDuration(0L).start();
            return;
        }
        view.animate().translationY(i - i3).setDuration(0L).start();
    }
}
