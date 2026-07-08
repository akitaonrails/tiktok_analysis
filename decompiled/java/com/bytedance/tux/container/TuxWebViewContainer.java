package com.bytedance.tux.container;

import X.C098200Yq;
import X.C0OM1;
import X.C1251150ifB;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C189200o6;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ARunnableS104S0100000_4;
import Y.ATListenerS465S0100000_33;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.BaseSheet;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS8S1102000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class TuxWebViewContainer extends BaseSheet {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWs4PDd9KyoiPS46HELIOSJiA+ZxsmMBIpKxk6LTIPJiEnKSwiLD0=";
    public int LLJJIII;
    public View LLJJIJI;
    public TuxNavBar LLJJIJIIJIL;
    public FrameLayout LLJJIJIL;
    public C1749280vcc LLJJJ;

    @Override // com.bytedance.tux.sheet.BaseSheet
    public final int OR() {
        return R.style.akw;
    }

    @Override // com.bytedance.tux.sheet.BaseSheet, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Window window2;
        View viewQe;
        super.onStart();
        View view = getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS104S0100000_4(this, 8));
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null && (viewQe = C786410Ut5.qe(window2, R.id.fpl)) != null) {
            viewQe.setBackgroundColor(0);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // com.bytedance.tux.sheet.BaseSheet, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLILZ = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = getContext();
        if (context == null) {
            try {
                C189200o6.m2constructorimpl(Unit.LIZ);
                return null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return null;
            }
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.TuxWebViewContainer, R.attr.z7, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxWebViewContainer_tux_webViewContainer_startIcon, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxWebViewContainer_tux_webViewContainer_endIcon, 0);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxWebViewContainer_tux_webViewContainer_unsafeStatusIcon, 0);
        typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxWebViewContainer_tux_webViewContainer_maybeUnsafeStatusIcon, 0);
        typedArrayObtainStyledAttributes.getResourceId(R$styleable.TuxWebViewContainer_tux_webViewContainer_notFoundStatusIcon, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxWebViewContainer_tux_webViewContainer_statusIconColor, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxWebViewContainer_tux_webViewContainer_statusIconBGColor, 0);
        C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxWebViewContainer_tux_webViewContainer_unsafeStatusTitle);
        C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxWebViewContainer_tux_webViewContainer_maybeUnsafeStatusTitle);
        C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxWebViewContainer_tux_webViewContainer_notFoundStatusTitle);
        C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxWebViewContainer_tux_webViewContainer_unsafeStatusMessage);
        C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxWebViewContainer_tux_webViewContainer_maybeUnsafeStatusMessage);
        C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxWebViewContainer_tux_webViewContainer_notFoundStatusMessage);
        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxWebViewContainer_tux_webViewContainer_statusGoBackButtonText);
        String strXd2 = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxWebViewContainer_tux_webViewContainer_statusOpenAnywayButtonText);
        int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.TuxWebViewContainer_tux_webViewContainer_statusGoBackButtonVariant, 0);
        int integer2 = typedArrayObtainStyledAttributes.getInteger(R$styleable.TuxWebViewContainer_tux_webViewContainer_statusOpenAnywayButtonVariant, 0);
        int integer3 = typedArrayObtainStyledAttributes.getInteger(R$styleable.TuxWebViewContainer_tux_webViewContainer_statusButtonSize, 0);
        C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxWebViewContainer_tux_webViewContainer_moreString);
        C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxWebViewContainer_tux_webViewContainer_sendToString);
        int color3 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxWebViewContainer_tux_webViewContainer_primaryColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.LLJJIII = color3;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.hc, viewGroup, false);
        this.LLJJIJI = viewTd.findViewById(R.id.y9g);
        this.LLJJIJIIJIL = (TuxNavBar) viewTd.findViewById(R.id.bsp);
        viewTd.findViewById(R.id.s9k);
        this.LLJJIJIL = (FrameLayout) viewTd.findViewById(R.id.ik7);
        this.LLJJJ = (C1749280vcc) viewTd.findViewById(R.id.w2l);
        RadiusLayout radiusLayout = (RadiusLayout) viewTd.findViewById(R.id.spp);
        if (radiusLayout == null) {
            radiusLayout = null;
        }
        radiusLayout.setRadius(0.0f);
        View view = this.LLJJIJI;
        if (view == null) {
            view = null;
        }
        view.setBackgroundColor(color3);
        C1749280vcc c1749280vcc = this.LLJJJ;
        if (c1749280vcc == null) {
            c1749280vcc = null;
        }
        c1749280vcc.setLayoutVariant(0);
        FrameLayout frameLayout = this.LLJJIJIL;
        if (frameLayout == null) {
            frameLayout = null;
        }
        frameLayout.setBackgroundColor(color3);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        c419910GdJ.LIZ = resourceId3;
        c419910GdJ.LIZLLL = Integer.valueOf(color);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(requireContext());
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = Integer.valueOf(color2);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(72));
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
        C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(requireContext()));
        new C1722300uv6();
        new AwS8S1102000_33(strXd, integer, integer3, this, 0);
        new C1722300uv6();
        new C419910GdJ();
        Integer.valueOf(color);
        new AwS8S1102000_33(strXd2, integer2, integer3, this, 1);
        new C1722300uv6();
        new C419910GdJ();
        Integer.valueOf(color);
        new AwS8S1102000_33(strXd, integer, integer3, this, 2);
        TuxNavBar tuxNavBar = this.LLJJIJIIJIL;
        if (tuxNavBar == null) {
            tuxNavBar = null;
        }
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = resourceId;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS577S0100000_33(this, 3907));
        c0om1.LJ(c1251150ifB);
        C1251150ifB c1251150ifB2 = new C1251150ifB();
        c1251150ifB2.LIZLLL();
        c1251150ifB2.LIZJ = resourceId2;
        c1251150ifB2.LIZLLL = true;
        c1251150ifB2.LIZJ(new AwS577S0100000_33(this, 3908));
        c0om1.LIZIZ(c1251150ifB2);
        tuxNavBar.setNavActions(c0om1);
        GestureDetector gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: X.19aW
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                super.onDoubleTap(motionEvent);
                this.LL.getClass();
                throw null;
            }
        });
        TuxNavBar tuxNavBar2 = this.LLJJIJIIJIL;
        if (tuxNavBar2 == null) {
            tuxNavBar2 = null;
        }
        tuxNavBar2.setOnTouchListener(new ATListenerS465S0100000_33(gestureDetector, 8));
        TuxNavBar tuxNavBar3 = this.LLJJIJIIJIL;
        if (tuxNavBar3 == null) {
            tuxNavBar3 = null;
        }
        tuxNavBar3.LJIIZILJ(true);
        throw null;
    }
}
