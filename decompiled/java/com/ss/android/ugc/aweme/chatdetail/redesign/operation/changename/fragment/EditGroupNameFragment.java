package com.ss.android.ugc.aweme.chatdetail.redesign.operation.changename.fragment;

import X.C019F;
import X.C01D1;
import X.C098200Yq;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20277814Wa;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C910000Zmw;
import X.C910010Zmx;
import X.C987103tV;
import X.InterfaceC21503819Do;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import X.InterfaceC836760Ws6;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.changename.viewmodel.EditGroupNameViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS21S2200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@InterfaceC836760Ws6
public final class EditGroupNameFragment extends BaseFragment implements InterfaceC21503819Do {
    public static final C910000Zmw LLIZLLLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYkKDs3LTEtICN9OiAoLDw6LytiJj82HELIOSOiQ4ICA9ZiYkKCE0LSstJCp9LjctLiI2JjFiDCs6PAI+JjojBiQhLAkhKSIhLCEn";
    public final AssemVMLazy LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EditGroupNameFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/chatdetail/redesign/operation/changename/viewmodel/EditGroupNameViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLIZLLLIL = new C910000Zmw();
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void onActivityFinish() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void qO(Intent intent) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void tv() {
        C20277814Wa.LIZIZ(this);
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    public EditGroupNameFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EditGroupNameViewModel.class);
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(c19719912DlLIZ, 114);
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(32);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS558S0100000_14, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 115), aFwS248S0000000_14, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS558S0100000_14, new AwS558S0100000_14((Fragment) this, 116), aFwS248S0000000_14, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS558S0100000_14, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 117), aFwS248S0000000_14, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZ = assemVMLazy;
    }

    @Override // X.InterfaceC21503819Do
    public final void Q9(Activity activity) {
        Window window;
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(20);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS248S0000000_14.get$arr$(31));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        String string3;
        String string4;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("key_conversation_id")) != null) {
            Bundle arguments2 = getArguments();
            String str = "";
            if (arguments2 == null || (string2 = arguments2.getString("key_ui_type")) == null) {
                string2 = "";
            }
            Bundle arguments3 = getArguments();
            if (arguments3 == null || (string3 = arguments3.getString("enter_from")) == null) {
                string3 = "group_setting";
            }
            Bundle arguments4 = getArguments();
            if (arguments4 != null && (string4 = arguments4.getString("enter_method")) != null) {
                str = string4;
            }
            AssemVMLazy assemVMLazy = this.LLIZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
            C910010Zmx c910010ZmxVQ2 = ((EditGroupNameViewModel) assemVMLazy.getValue()).vQ2();
            c910010ZmxVQ2.LIZ = string3;
            c910010ZmxVQ2.LIZIZ = str;
            C723850SaN.LIZ(this, false, null, new AwS21S2200000_14(this, string2, string, view, 0), 3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ci1, viewGroup, false);
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
