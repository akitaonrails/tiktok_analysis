package com.ss.android.ugc.gamora.editor.sticker.donation;

import X.C098200Yq;
import X.C11B2;
import X.C11BF;
import X.C1389600mGU;
import X.C1685300txQ;
import X.C189200o6;
import X.C19458411Aw;
import X.C19AK;
import X.C19C8;
import X.C19EG;
import X.C19GS;
import X.C214936199q;
import X.C2350509Ix;
import X.C293940Bfc;
import X.C786410Ut5;
import X.InterfaceC19394510uF;
import X.InterfaceC214877197j;
import X.InterfaceC21498919Br;
import Y.ARunnableS127S0100000_27;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes33.dex */
public final class EditSelectDonationOrganizationDialogFragment extends GlobalHookDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiItJCAhKWspLSYnJzdiOjs6Ky4pO2E3JystPSY8HELIOSJmsJLSYnGyAgLCwnDCoiKDs6JysDOygyJiw2KDs6JysIIC4/JyIKOy40JSAiPQ==";
    public C19C8 LL;
    public C11BF LLILLJJLI;
    public boolean LLILLL;

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        C19C8 c19c8 = this.LL;
        if (c19c8 == null) {
            c19c8 = null;
        }
        c19c8.LJII();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        C19C8 c19c8 = this.LL;
        if (c19c8 == null) {
            c19c8 = null;
        }
        c19c8.LIZJ();
        super.onPause();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        Dialog dialog;
        Window window;
        if (!this.LLILLL && (dialog = getDialog()) != null && (window = dialog.getWindow()) != null) {
            window.setWindowAnimations(0);
        }
        C19C8 c19c8 = this.LL;
        if (c19c8 == null) {
            c19c8 = null;
        }
        c19c8.LJI();
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C19C8 c19c8 = this.LL;
        if (c19c8 == null) {
            c19c8 = null;
        }
        c19c8.LIZLLL();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        C19C8 c19c8 = this.LL;
        if (c19c8 == null) {
            c19c8 = null;
        }
        c19c8.LJFF();
        View view = getView();
        if (view != null) {
            HandlerHook.viewPostDelay(view, new ARunnableS127S0100000_27(this, 33), 50L);
        }
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.ad5);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.a_w);
        }
        dialogOnCreateDialog.setCanceledOnTouchOutside(false);
        Window window2 = dialogOnCreateDialog.getWindow();
        if (window2 != null && (decorView = window2.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogOnCreateDialog);
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.LLILLL = true;
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C19458411Aw c19458411Aw;
        super.onViewCreated(view, bundle);
        final C19458411Aw c19458411Aw2 = new C19458411Aw();
        Bundle arguments = getArguments();
        if (arguments != null) {
            c19458411Aw2.mArguments = arguments;
        }
        C214936199q c214936199q = new C214936199q((Bundle) null, C19458411Aw.class);
        c214936199q.LIZJ = false;
        c214936199q.LIZLLL = false;
        c214936199q.LJ = 0;
        c214936199q.LJIIZILJ = C293940Bfc.LIZ();
        NavigationScene navigationScene = (NavigationScene) C2350509Ix.LIZ(c214936199q.LIZ(), NavigationScene.class);
        navigationScene.LLJIJIL = new InterfaceC214877197j() { // from class: X.11x7
            @Override // X.InterfaceC214877197j
            public final Scene LIZ(ClassLoader classLoader, String str, Bundle bundle2) {
                return c19458411Aw2;
            }
        };
        C19C8 c19c8 = new C19C8(new C19AK(R.id.tqy, new InterfaceC19394510uF(this) { // from class: X.10uA
            public final Fragment LIZ;

            {
                this.LIZ = this;
            }

            @Override // X.InterfaceC19394510uF
            public final <T extends View> T LIZ(int i) {
                T t;
                View view2 = this.LIZ.getView();
                if (view2 != null && (t = (T) view2.findViewById(i)) != null) {
                    return t;
                }
                try {
                    String resourceName = this.LIZ.getResources().getResourceName(i);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(' ');
                    sbLIZ.append(resourceName);
                    sbLIZ.append(" view not found");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                } catch (Resources.NotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(' ');
                    sbLIZ2.append(i);
                    sbLIZ2.append(" view not found");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        }, navigationScene, new InterfaceC21498919Br() { // from class: X.197h
            @Override // X.InterfaceC21498919Br
            public final C214937199r IQ() {
                return C214937199r.LJI.IQ();
            }
        }, null, false));
        this.LL = c19c8;
        c19c8.LIZIZ(requireActivity(), bundle);
        Scene sceneLLLLIIIILLL = navigationScene.LLLLIIIILLL();
        if ((sceneLLLLIIIILLL instanceof C19458411Aw) && (c19458411Aw = (C19458411Aw) sceneLLLLIIIILLL) != null) {
            c19458411Aw.LLJJIJIL = new C11B2() { // from class: X.11BI
                @Override // X.C11B2
                public final void onDismiss() {
                    this.LIZ.dismiss();
                    C11BF c11bf = this.LIZ.LLILLJJLI;
                    if (c11bf != null) {
                        c11bf.onDismiss();
                    }
                }

                @Override // X.C11B2
                public final void LIZ(C11BE c11be) {
                    C11BF c11bf = this.LIZ.LLILLJJLI;
                    if (c11bf != null) {
                        c11bf.LIZ(c11be);
                    }
                }
            };
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c4a, viewGroup, false);
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
