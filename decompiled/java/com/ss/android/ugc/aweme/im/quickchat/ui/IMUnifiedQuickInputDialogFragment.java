package com.ss.android.ugc.aweme.im.quickchat.ui;

import X.C019F;
import X.C01D1;
import X.C098200Yq;
import X.C0I06;
import X.C0I08;
import X.C0I09;
import X.C0I0A;
import X.C0I0B;
import X.C0I0E;
import X.C0I0H;
import X.C0PEM;
import X.C0TVI;
import X.C1389600mGU;
import X.C13LE;
import X.C1481605r4;
import X.C14K9;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1622206Wu;
import X.C1629306Zn;
import X.C1629406Zo;
import X.C1640006bW;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C1AF0;
import X.C1BNE;
import X.C1DFH;
import X.C2107308Nj;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C23250099c;
import X.C300640BqQ;
import X.C337180DJs;
import X.C338490DOt;
import X.C447810HhD;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C456970Hvz;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.EnumC1630206Zw;
import X.InterfaceC1294060jmO;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC456150Huf;
import X.InterfaceC457250HwR;
import X.InterfaceC724760Sbq;
import Y.ARunnableS71S0200000_2;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.im.chatroom.api.popupmanager.IMManagePopupAbility;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.InputFieldVM;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS120S1100000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class IMUnifiedQuickInputDialogFragment extends GlobalHookDialogFragment implements C0I06, C0I0H, InterfaceC456150Huf, IMManagePopupAbility {
    public static final C0I09 LLJILJILJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwhZz4mISYnKicyPGHELIOSs5IGEaBRAiICk6LSEdPCYwIwwiOTonDCwtJSA0DjctLiI2JjE=";
    public InterfaceC457250HwR LLILLJJLI;
    public C0I08 LLILLL;
    public C456970Hvz LLILZ;
    public final AssemVMLazy LLILZLL;
    public final AssemVMLazy LLIZ;
    public final C2252321DDq LLIZLLLIL;
    public final C2252321DDq LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public final /* synthetic */ C0I06 LL = IMStickerApi.LIZ.LIZIZ().getImStickerInputPanelService().LJIIIZ();
    public volatile C0I0E LLILZIL = C0I0E.ACTION_UNKNOWN;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0I09] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IMUnifiedQuickInputDialogFragment.class, "panelStateVM", "getPanelStateVM()Lcom/ss/android/ugc/aweme/im/viewmodel/PanelStateViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(IMUnifiedQuickInputDialogFragment.class, "inputFieldVM", "getInputFieldVM()Lcom/ss/android/ugc/aweme/im/chatroom/input/components/inputfield/InputFieldVM;", 0)};
        LLJILJILJ = new Object() { // from class: X.0I09
        };
    }

    @Override // X.C0I06
    public final void Dg(int i) {
        this.LL.Dg(i);
    }

    @Override // X.C0I06
    public final Integer Ga() {
        return this.LL.Ga();
    }

    @Override // X.C0I06
    public final void c8(long j) {
        this.LL.c8(j);
    }

    @Override // X.C0I06
    public final int fJ() {
        return this.LL.fJ();
    }

    @Override // X.C0I06
    public final long hN() {
        return this.LL.hN();
    }

    @Override // X.C0I06
    public final void la(int i) {
        this.LL.la(i);
    }

    @Override // X.C0I06
    public final void z4(int i) {
        this.LL.z4(i);
    }

    public IMUnifiedQuickInputDialogFragment() {
        AssemVMLazy assemVMLazy;
        boolean z;
        boolean z2;
        AssemVMLazy assemVMLazy2;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PanelStateViewModel.class);
        AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(c19719912DlLIZ, 154);
        AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(94);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS550S0100000_6, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) this, 155), aFwS236S0000000_6, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z2 = true;
            z = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS550S0100000_6, new AwS550S0100000_6((Fragment) this, 156), aFwS236S0000000_6, null, null, null);
            z = false;
            z2 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = false;
            z2 = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS550S0100000_6, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) this, 157), aFwS236S0000000_6, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILZLL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(InputFieldVM.class);
        AwS550S0100000_6 awS550S0100000_62 = new AwS550S0100000_6(c19719912DlLIZ2, 158);
        AFwS236S0000000_6 aFwS236S0000000_62 = AFwS236S0000000_6.get$arr$(95);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS550S0100000_62, new C452070Ho5(), new C1622206Wu(this, z2), new C338490DOt(this, z2), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) this, 159), aFwS236S0000000_62, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS550S0100000_62, new AwS550S0100000_6((Fragment) this, 160), aFwS236S0000000_62, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS550S0100000_62, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) this, 153), aFwS236S0000000_62, new C451460Hn6(this, z), new C451620HnM(this, z), new C987103tV(this, z));
        }
        this.LLIZ = assemVMLazy2;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(EnumC1630206Zw.OPEN);
        this.LLIZLLLIL = c2252321DDqLIZ;
        this.LLJ = c2252321DDqLIZ;
    }

    public final PanelStateViewModel MR() {
        AssemVMLazy assemVMLazy = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (PanelStateViewModel) assemVMLazy.getValue();
    }

    @Override // X.C0I0H
    public final void cs() {
        if (this.LLJILJIL) {
            AssemVMLazy assemVMLazy = this.LLIZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
            ((InputFieldVM) assemVMLazy.getValue()).LLJZIJLIL();
        }
        this.LLJILJIL = false;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void dismiss() {
        try {
            this.LLIZLLLIL.setValue(EnumC1630206Zw.DISMISS);
            C0I08 c0i08 = this.LLILLL;
            if (c0i08 != null) {
                C0I0E c0i0e = this.LLILZIL;
                AssemVMLazy assemVMLazy = this.LLIZ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
                c0i08.YO(c0i0e, ((C1640006bW) ((InputFieldVM) assemVMLazy.getValue()).LLILLJJLI.getValue()).LIZIZ);
            }
            super.dismiss();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            super.dismissAllowingStateLoss();
        }
    }

    @Override // X.C0I0H
    public final void Bt() {
        this.LLJILJIL = Intrinsics.LJFF(MR().LLIZ.getValue(), C447810HhD.LL);
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.popupmanager.IMManagePopupAbility
    public final ViewGroup LJIJI() {
        View view = getView();
        if (view != null) {
            return (ViewGroup) view.findViewById(R.id.k_w);
        }
        return null;
    }

    @Override // X.InterfaceC456150Huf
    public final void js() {
        Window window;
        Window window2;
        View viewFindViewById;
        View viewFindViewById2;
        View view = getView();
        if (view != null && (viewFindViewById2 = view.findViewById(R.id.smw)) != null) {
            C337180DJs.LIZIZ(viewFindViewById2);
        }
        View view2 = getView();
        if (view2 != null && (viewFindViewById = view2.findViewById(R.id.ks2)) != null) {
            C786410Ut5.T4(viewFindViewById, 0.0f);
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null) {
            return;
        }
        window.setDimAmount(0.0f);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        cs();
        this.LLJI = false;
        if (this.LLJIJIL) {
            dismiss();
        }
    }

    @Override // X.C0I0H
    public final C2252321DDq me() {
        return this.LLJ;
    }

    @Override // X.C0I0H
    public final void Gk(C0I0E c0i0e) {
        C1481605r4.LIZIZ(new ARunnableS71S0200000_2(this, c0i0e, 4));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    @InterfaceC1294060jmO
    public final void onActivityCreated(Bundle bundle) {
        Window window;
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        if (bundle != null) {
            dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.adj);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        WindowManager.LayoutParams attributes;
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null && (attributes = window.getAttributes()) != null) {
            attributes.windowAnimations = R.style.adk;
        }
        Window window2 = dialogOnCreateDialog.getWindow();
        if (window2 != null) {
            window2.setGravity(80);
        }
        Window window3 = dialogOnCreateDialog.getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(52);
        }
        dialogOnCreateDialog.setCanceledOnTouchOutside(false);
        dialogOnCreateDialog.setCancelable(true);
        dialogOnCreateDialog.requestWindowFeature(1);
        Window window4 = dialogOnCreateDialog.getWindow();
        if (window4 != null && (decorView = window4.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogOnCreateDialog);
        return dialogOnCreateDialog;
    }

    @Override // X.C0I0H
    public final void tC(boolean z) {
        this.LLJI = z;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C0I0B c0i0b = C0I0B.LJFF;
        if (c0i0b.LIZLLL == null) {
            synchronized (c0i0b) {
                if (c0i0b.LIZLLL == null) {
                    c0i0b.LIZLLL = new C0I0A();
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 35) {
            C14K9.LJIJJ(view, new C0TVI() { // from class: X.0DLl
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                    C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                    view2.setPadding(c20244914JjLIZ.LIZ, view2.getPaddingTop(), c20244914JjLIZ.LIZJ, c20244914JjLIZ.LIZLLL);
                    return c20246014Ju;
                }
            });
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ.LLIILII(), null, new C1629306Zn(this, view, null), 2);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1629406Zo(this, view, null), 3);
        C723850SaN.LIZ(this, false, null, new AwS120S1100000_6(this, String.valueOf(hashCode()), 2), 3);
        if (C300640BqQ.LIZ()) {
            C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, IMManagePopupAbility.class, null, getViewLifecycleOwner());
        }
    }

    @Override // com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment, androidx.fragment.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        if (!isAdded() && !isStateSaved()) {
            try {
                super.show(fragmentManager, str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJIZ(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.csh, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
