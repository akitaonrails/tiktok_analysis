package com.ss.android.ugc.profile.business.ur.editprofile.pronouns.ui;

import X.C098200Yq;
import X.C1215930hkN;
import X.C1232280iAk;
import X.C1323040kX8;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C14KQ;
import X.C1685300txQ;
import X.C1749280vcc;
import X.C189200o6;
import X.C196972124s;
import X.C19EG;
import X.C19GS;
import X.C1EDI;
import X.C723850SaN;
import X.C786410Ut5;
import X.C985403tE;
import X.InterfaceC1215940hkO;
import X.InterfaceC1233210iCF;
import X.InterfaceC447510Hgj;
import X.ViewTreeObserverOnGlobalLayoutListenerC1266000j38;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditInputFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileEditPronounsFragment extends ProfileEditInputFragment implements InterfaceC1233210iCF, ViewTreeObserver.OnGlobalLayoutListener {
    public static final C1215930hkN LLJILJILJ = new Object() { // from class: X.0hkN
    };
    public static final int LLJILLL = 8;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9PTdiLCs6PDU+HELIOSJik6JCBiOT08Jio5Jzx9PSxiGT08LiwgLAo3ITEcOyA9JzAiOgkhKSIhLCEn";
    public TuxNavBar LLILZLL;
    public LinearLayout LLIZ;
    public C1749280vcc LLIZLLLIL;
    public C196972124s LLJ;
    public String LLJI = "";
    public String LLJIJIL = "";
    public InterfaceC1215940hkO LLJILJIL;

    private final void clearFromXmlViewCache() {
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
    }

    @Override // X.InterfaceC1233210iCF, X.InterfaceC724720Sbm, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    @Override // com.ss.android.ugc.profile.business.ur.ui.ProfileEditInputFragment
    public void gS() {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return oS(this, layoutInflater, viewGroup, bundle);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0iAk] */
    @Override // X.InterfaceC724720Sbm
    /* JADX INFO: renamed from: qS, reason: merged with bridge method [inline-methods] */
    public C1232280iAk lt() {
        return new InterfaceC447510Hgj() { // from class: X.0iAk
        };
    }

    public final C196972124s uS() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sdh) : null;
            this.LLJ = (C196972124s) viewFindViewById;
        }
        return (C196972124s) viewFindViewById;
    }

    public final TuxNavBar wS() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sdn) : null;
            this.LLILZLL = (TuxNavBar) viewFindViewById;
        }
        return (TuxNavBar) viewFindViewById;
    }

    public final LinearLayout yS() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sdo) : null;
            this.LLIZ = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final C1749280vcc zS() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sdp) : null;
            this.LLIZLLLIL = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    private final void LJJIL() {
        Context context = getContext();
        if (context != null) {
            ((InputMethodManager) C786410Ut5.H2(context, "input_method")).hideSoftInputFromWindow(uS().getWindowToken(), 2);
        }
    }

    @Override // X.InterfaceC1233210iCF
    public void f9() {
        C786410Ut5.LLLZLZ(zS(), 8);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    public final void sS() {
        LJJIL();
        rS();
    }

    @Override // X.InterfaceC1233210iCF
    public void yh() {
        C1749280vcc c1749280vccZS = zS();
        C786410Ut5.LLLZLZ(c1749280vccZS, 0);
        c1749280vccZS.LJ();
    }

    private final void rS() {
        onBackPressed();
    }

    private final void kS(View view) {
        C786410Ut5.x3(view.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1266000j38(this, view, 3));
    }

    public final void ES(InterfaceC1215940hkO interfaceC1215940hkO) {
        this.LLJILJIL = interfaceC1215940hkO;
    }

    public final void FS(C196972124s c196972124s) {
        this.LLJ = c196972124s;
    }

    public final void GS(TuxNavBar tuxNavBar) {
        this.LLILZLL = tuxNavBar;
    }

    public final void HS(LinearLayout linearLayout) {
        this.LLIZ = linearLayout;
    }

    public final void JS(C1749280vcc c1749280vcc) {
        this.LLIZLLLIL = c1749280vcc;
    }

    @Override // X.InterfaceC1233210iCF
    public void db(String str) {
        sS();
        InterfaceC1215940hkO interfaceC1215940hkO = this.LLJILJIL;
        if (interfaceC1215940hkO != null) {
            interfaceC1215940hkO.LIZ(str);
        }
    }

    @Override // X.InterfaceC1233210iCF
    public void gu(boolean z) {
        if (z) {
            Context context = getContext();
            if (context != null) {
                C1397580mTM c1397580mTM = new C1397580mTM(context);
                c1397580mTM.LJFF(2131845562);
                c1397580mTM.LIZ(2131845561);
                C985403tE.LIZ(c1397580mTM, new AwS598S0100000_19(this, 360));
                new C1397510mTF(c1397580mTM).LIZLLL();
                return;
            }
            return;
        }
        sS();
    }

    public final int mS(View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return (C14KQ.LJ(getActivity()) - C14KQ.LIZLLL(getActivity())) - rect.bottom;
    }

    @Override // com.ss.android.ugc.profile.business.ur.ui.ProfileEditInputFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LLJI = String.valueOf(arguments.getString("content_name"));
            this.LLJIJIL = String.valueOf(arguments.getString("content_value"));
        }
    }

    public static final ProfileEditPronounsFragment BS(String str, String str2) {
        LLJILJILJ.getClass();
        ProfileEditPronounsFragment profileEditPronounsFragment = new ProfileEditPronounsFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("content_name", str, bundle);
        C786410Ut5.LJJJI("content_value", str2, bundle);
        profileEditPronounsFragment.setArguments(bundle);
        return profileEditPronounsFragment;
    }

    @Override // com.ss.android.ugc.profile.business.ur.ui.ProfileDetailEditFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS598S0100000_19(this, 361), 3);
        kS(view);
    }

    public View nS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        int i;
        C19EG activity = getActivity();
        Dialog dialog = getDialog();
        if (dialog != null) {
            window = dialog.getWindow();
        } else {
            window = null;
        }
        C1323040kX8.LIZIZ(activity, window, true);
        if (C1EDI.LJ()) {
            i = R.layout.edl;
        } else {
            i = R.layout.edk;
        }
        return C786410Ut5.Td(layoutInflater, i, viewGroup, false);
    }

    public static View oS(ProfileEditPronounsFragment profileEditPronounsFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewNS = profileEditPronounsFragment.nS(layoutInflater, viewGroup, bundle);
        C19GS c19gs = null;
        if (!(viewNS instanceof View)) {
            viewNS = null;
        }
        if (viewNS != null) {
            try {
                ViewTreeLifecycleOwner.set(viewNS, profileEditPronounsFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewNS, profileEditPronounsFragment);
                viewNS.setTag(R.id.view_tree_saved_state_registry_owner, profileEditPronounsFragment);
                C19EG activity = profileEditPronounsFragment.getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewNS;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewNS;
    }
}
