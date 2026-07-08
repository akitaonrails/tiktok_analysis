package com.ss.android.ugc.aweme.inbox.bulletin;

import X.C098200Yq;
import X.C09M6;
import X.C0I7D;
import X.C1110404Vy;
import X.C1208860hYy;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C2187701Ajg;
import X.C384050F3z;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1352000lHq;
import X.ViewTreeObserverOnGlobalLayoutListenerC1208840hYw;
import Y.ACListenerS153S0100000_18;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.KeyboardFakePopupWindow;
import com.ss.android.ugc.aweme.comment.services.IKeyboardService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class BulletinQuickEditInputBoxFragment extends GlobalHookDialogFragment implements InterfaceC1352000lHq {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwiKyArZic5JSM2PCHELIOSwiZw0mJCkpPSY9GTAlKiQWLCw4ACEjPTEOJjcVOiQrJCo9PA==";
    public final Function1<String, Unit> LL;
    public View LLILLJJLI;
    public LinearLayout LLILLL;
    public C0I7D LLILZ;
    public C197039127h LLILZIL;

    public BulletinQuickEditInputBoxFragment() {
        this(null);
    }

    @Override // X.InterfaceC1352000lHq
    public final void LLILII() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.LLILLJJLI;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            layoutParams.height = 0;
        }
        View view2 = this.LLILLJJLI;
        if (view2 != null) {
            view2.requestLayout();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BulletinQuickEditInputBoxFragment(Function1<? super String, Unit> function1) {
        this.LL = function1;
    }

    @Override // X.InterfaceC1352000lHq
    public final void LLLLZI(int i) {
        ViewGroup.LayoutParams layoutParams;
        View view = this.LLILLJJLI;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            layoutParams.height = i;
        }
        View view2 = this.LLILLJJLI;
        if (view2 != null) {
            view2.requestLayout();
        }
    }

    @Override // X.InterfaceC1352000lHq
    public final void j(int i) {
        ViewGroup.LayoutParams layoutParams;
        C1110404Vy.LIZ().LIZIZ(i, true);
        View view = this.LLILLJJLI;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            layoutParams.height = i;
        }
        View view2 = this.LLILLJJLI;
        if (view2 != null) {
            view2.requestLayout();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewTreeObserver viewTreeObserver;
        ViewGroup.LayoutParams layoutParams;
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context == null) {
            return;
        }
        this.LLILLJJLI = view.findViewById(R.id.d44);
        this.LLILLL = (LinearLayout) view.findViewById(R.id.d43);
        this.LLILZ = (C0I7D) view.findViewById(R.id.d41);
        this.LLILZIL = (C197039127h) view.findViewById(R.id.d42);
        View view2 = this.LLILLJJLI;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null) {
            layoutParams.height = C1110404Vy.LIZ().LIZJ(false);
        }
        View view3 = this.LLILLJJLI;
        if (view3 != null) {
            view3.requestLayout();
        }
        LinearLayout linearLayout = this.LLILLL;
        if (linearLayout != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)));
            linearLayout.setBackground(c384050F3z.LIZ(context));
        }
        C0I7D c0i7d = this.LLILZ;
        if (c0i7d != null) {
            c0i7d.setHint(getString(2131828061));
            C197039127h c197039127h = this.LLILZIL;
            if (c197039127h != null) {
                c197039127h.setEnabled(false);
                C786410Ut5.U8(c197039127h, new ACListenerS153S0100000_18(this, 30));
            } else {
                c197039127h = null;
            }
            c0i7d.setFilters(new C09M6[]{new C09M6(LSPassThroughRecordSizeConfig.DEFAULT, this)});
            c0i7d.addTextChangedListener(new C1208860hYy(c197039127h, 1));
        }
        C0I7D c0i7d2 = this.LLILZ;
        if (c0i7d2 != null && (viewTreeObserver = c0i7d2.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC1208840hYw viewTreeObserverOnGlobalLayoutListenerC1208840hYw = new ViewTreeObserverOnGlobalLayoutListenerC1208840hYw(this, 1);
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1208840hYw);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1208840hYw, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View decorView;
        Window window;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.a60, viewGroup, false);
        IKeyboardService iKeyboardServiceLIZ = C1110404Vy.LIZ();
        Context context = getContext();
        C19EG activity = getActivity();
        C19GS c19gs = null;
        if (activity != null && (window = activity.getWindow()) != null) {
            decorView = window.getDecorView();
        } else {
            decorView = null;
        }
        KeyboardFakePopupWindow keyboardFakePopupWindowLIZ = iKeyboardServiceLIZ.LIZ(context, decorView);
        if (keyboardFakePopupWindowLIZ != null) {
            keyboardFakePopupWindowLIZ.LLJ = this;
        }
        if (keyboardFakePopupWindowLIZ != null) {
            keyboardFakePopupWindowLIZ.show();
        }
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity2 = getActivity();
                if (activity2 instanceof C19GS) {
                    c19gs = (C19GS) activity2;
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
