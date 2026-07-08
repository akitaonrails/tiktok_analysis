package com.ss.android.ugc.aweme.ecommerce.base.pdp.widget;

import X.AbstractC1177930gl5;
import X.AnonymousClass0317;
import X.AnonymousClass0378;
import X.C01GW;
import X.C034S;
import X.C0H9H;
import X.C0H9I;
import X.C1120604Zw;
import X.C13LE;
import X.C16G1;
import X.C1744700vVE;
import X.C1745060vVo;
import X.C1763910w0D;
import X.C1842040y2E;
import X.C18EW;
import X.C18FD;
import X.C18IP;
import X.C19719912Dl;
import X.C1AQS;
import X.C1DUD;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C631470Opl;
import X.C786410Ut5;
import X.C814420VxA;
import X.C834903Nz;
import X.InterfaceC1164530gPT;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import X.ViewTreeObserverOnGlobalLayoutListenerC1775940wJc;
import Y.ARunnableS113S0100000_13;
import Y.ARunnableS126S0100000_26;
import Y.ARunnableS32S0110000_13;
import Y.ATListenerS458S0100000_26;
import android.animation.ObjectAnimator;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.widget.RadiusLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.base.arch.JediBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Container;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LynxCreatorModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpCreatorSheetWidget;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.zhiliaoapp.musically.R;
import g1c.AjS70S0100000_26;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS12S0000001_26;
import kotlin.jvm.internal.AwS260S0300000_16;
import kotlin.jvm.internal.AwS592S0100000_13;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import p8b.c;
import r4b.a;
import r4b.d;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpCreatorSheetWidget extends JediBaseWidget implements c, InterfaceC1164530gPT {
    public static final int LLJLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(240));
    public static final int LLJLLL = 1;
    public static final int LLJZ = 2;
    public final PdpFragment LLJ;
    public final View LLJI;
    public final boolean LLJIJIL;
    public LinearLayout LLJILJIL;
    public RadiusLayout LLJILJILJ;
    public View LLJILLL;
    public FrameLayout LLJJ;
    public final C01GW LLJJI;
    public RadiusLayout LLJJIII;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJJIJI;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJJIJIIJIL;
    public BottomSheetBehavior<FrameLayout> LLJJIJIL;
    public View LLJJJ;
    public ViewTreeObserverOnGlobalLayoutListenerC1775940wJc LLJJJIL;
    public C1763910w0D LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public LynxCreatorModule LLJJL;
    public ObjectAnimator LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public int LLJLIL;
    public boolean LLJLILLLLZIIL;
    public String LLJLL;

    @Override // com.bytedance.widget.Widget
    public final int LIZLLL() {
        return R.layout.arn;
    }

    @Override // p8b.c
    public final String getViewName() {
        return "PdpCreatorSheetWidget";
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [X.0gl5, X.0w0D] */
    @Override // com.bytedance.widget.Widget
    public final void onCreate() {
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        View viewFindViewById4;
        View viewFindViewById5;
        ViewTreeObserver viewTreeObserver;
        C16G1 c16g1;
        ViewGroup.LayoutParams layoutParams;
        this.LLILLJJLI = false;
        View view = this.LLILZ;
        if (view != null) {
            DataBinderMapperImpl dataBinderMapperImpl = C1842040y2E.LIZ;
            C1DUD c1dud = (C1DUD) ViewDataBinding.LIZIZ(R.layout.arn, view);
            if (c1dud != null) {
                d aVar = (d) C834903Nz.LIZ(this, "product_detail", LJIIIIZZ().AR2(), null, 12);
                if (aVar == null) {
                    aVar = new a();
                }
                c1dud.LJIILLIIL(aVar);
            }
        }
        LJIIIIZZ().hR2(new C2217381BqS() { // from class: X.0vp4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((PdpMainState) obj).getCreatorSheetVO();
            }
        }, new AwS605S0100000_26(this, 713));
        LJIIIIZZ().hR2(new C2217381BqS() { // from class: X.0vkh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((PdpMainState) obj).getSheetState());
            }
        }, new AwS605S0100000_26(this, 714));
        LJIIIIZZ().hR2(new C2217381BqS() { // from class: X.0vsi
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((PdpMainState) obj).getCreatorSheetSlideOffset());
            }
        }, new AwS592S0100000_13(this, 41));
        LJIIIIZZ().hR2(new C2217381BqS() { // from class: X.0viL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((PdpMainState) obj).getScrollOrientation());
            }
        }, new AwS605S0100000_26(this, 711));
        LJIIIIZZ().hR2(new C2217381BqS() { // from class: X.0vp3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((PdpMainState) obj).getCreatorSheetVO();
            }
        }, new AwS605S0100000_26(this, 712));
        AnonymousClass0378.LIZ().LIZLLL("ec_pdp_hide_creator_widget", this);
        AnonymousClass0378.LIZ().LIZLLL("ec_pdp_fold_creator_widget", this);
        View viewFindViewById6 = this.LLJILJILJ;
        if (viewFindViewById6 == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById6 = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.f7w) : null;
            this.LLJILJILJ = (RadiusLayout) viewFindViewById6;
        }
        this.LLJJIII = (RadiusLayout) viewFindViewById6;
        View viewFindViewById7 = this.LLJILLL;
        if (viewFindViewById7 == null) {
            View view2 = this.LLILZ;
            viewFindViewById7 = view2 != null ? view2.findViewById(R.id.o1b) : null;
            this.LLJILLL = viewFindViewById7;
        }
        this.LLJJJ = viewFindViewById7;
        if (this.LLJIJIL) {
            this.LLJJIJIL = new BottomSheetBehavior<>();
            RadiusLayout radiusLayout = this.LLJJIII;
            if (radiusLayout != null) {
                radiusLayout.clearAnimation();
            }
            this.LLJJIJIL.setDraggable(false);
        } else {
            View viewFindViewById8 = this.LLJILJILJ;
            if (viewFindViewById8 == null) {
                View viewLJJIJL2 = LJJIJL();
                viewFindViewById8 = viewLJJIJL2 != null ? viewLJJIJL2.findViewById(R.id.f7w) : null;
                this.LLJILJILJ = (RadiusLayout) viewFindViewById8;
            }
            this.LLJJIJIL = BottomSheetBehavior.from(viewFindViewById8);
        }
        View viewFindViewById9 = this.LLJILJIL;
        if (viewFindViewById9 == null) {
            View viewLJJIJL3 = LJJIJL();
            viewFindViewById9 = viewLJJIJL3 != null ? viewLJJIJL3.findViewById(R.id.ajk) : null;
            this.LLJILJIL = (LinearLayout) viewFindViewById9;
        }
        C631470Opl.LIZ(viewFindViewById9, Float.valueOf(4), null, null, null, null, 30);
        RadiusLayout radiusLayout2 = this.LLJJIII;
        if (radiusLayout2 != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(C1744700vVE.LJ(C1745060vVo.LIZ(this), null) ? R.attr.bz : R.attr.bx);
            radiusLayout2.setBackground(c384050F3z.LIZ(C1745060vVo.LIZ(this)));
        }
        ?? r1 = new AbstractC1177930gl5() { // from class: X.0w0D
            @Override // X.AbstractC1177930gl5
            public final void LIZJ(View view3, float f) {
                if (f >= 1.0f) {
                    return;
                }
                this.LIZ.LJIILIIL(f);
            }

            @Override // X.AbstractC1177930gl5
            public final void LIZLLL(int i, View view3) {
                View viewFindViewById10;
                View viewFindViewById11;
                boolean z;
                View viewFindViewById12;
                boolean z2;
                View viewFindViewById13;
                RadiusLayout radiusLayout3;
                View viewFindViewById14;
                boolean z3 = true;
                if (i != 3) {
                    if (i == 4) {
                        this.LIZ.LLJJIJIL.setHideable(false);
                        PdpCreatorSheetWidget pdpCreatorSheetWidget = this.LIZ;
                        if (!pdpCreatorSheetWidget.LLJJJJLIIL && ((pdpCreatorSheetWidget.LJIIIIZZ().FR2() && !this.LIZ.LLJJJJJIL) || (!this.LIZ.LJIIIIZZ().FR2() && this.LIZ.LLJJJJJIL))) {
                            PdpCreatorSheetWidget pdpCreatorSheetWidget2 = this.LIZ;
                            if (pdpCreatorSheetWidget2.LLJJL == null && (radiusLayout3 = pdpCreatorSheetWidget2.LLJJIII) != null && (viewFindViewById14 = radiusLayout3.findViewById(R.id.f86)) != null) {
                                HandlerHook.viewPost(viewFindViewById14, new ARunnableS126S0100000_26(this.LIZ, 100));
                            }
                            this.LIZ.LLJJJJLIIL = true;
                        }
                        PdpCreatorSheetWidget pdpCreatorSheetWidget3 = this.LIZ;
                        if (!pdpCreatorSheetWidget3.LLJIJIL && pdpCreatorSheetWidget3.LLJJJJJIL && pdpCreatorSheetWidget3.LJIIIIZZ().FR2()) {
                            this.LIZ.LJIIIZ();
                            this.LIZ.LLJJIJIL.setState(3);
                        }
                        PdpCreatorSheetWidget pdpCreatorSheetWidget4 = this.LIZ;
                        pdpCreatorSheetWidget4.LLJJJJJIL = false;
                        RadiusLayout radiusLayout4 = pdpCreatorSheetWidget4.LLJJIII;
                        if (radiusLayout4 != null && (viewFindViewById13 = radiusLayout4.findViewById(R.id.f86)) != null) {
                            HandlerHook.viewPost(viewFindViewById13, new ARunnableS32S0110000_13((Object) pdpCreatorSheetWidget4, true, 8));
                        }
                        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LIZ.LLJJIJI;
                        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                            String str = C18FD.LIZ;
                            C18FD.LIZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, Boolean.FALSE);
                        }
                        this.LIZ.LJIILIIL(0.0f);
                    }
                } else {
                    this.LIZ.LJIILIIL(1.0f);
                    PdpCreatorSheetWidget pdpCreatorSheetWidget5 = this.LIZ;
                    RadiusLayout radiusLayout5 = pdpCreatorSheetWidget5.LLJJIII;
                    if (radiusLayout5 != null && (viewFindViewById10 = radiusLayout5.findViewById(R.id.f86)) != null) {
                        HandlerHook.viewPost(viewFindViewById10, new ARunnableS32S0110000_13((Object) pdpCreatorSheetWidget5, false, 8));
                    }
                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LIZ.LLJJIJI;
                    if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
                        String str2 = C18FD.LIZ;
                        C18FD.LIZIZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2, Boolean.TRUE);
                    }
                }
                RadiusLayout radiusLayout6 = this.LIZ.LLJJIII;
                if (radiusLayout6 != null && (viewFindViewById12 = radiusLayout6.findViewById(R.id.f86)) != null) {
                    if (i != 3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    viewFindViewById12.setClickable(z2);
                }
                RadiusLayout radiusLayout7 = this.LIZ.LLJJIII;
                if (radiusLayout7 != null && (viewFindViewById11 = radiusLayout7.findViewById(R.id.f86)) != null) {
                    if (i != 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    viewFindViewById11.setEnabled(z);
                }
                PdpCreatorSheetWidget pdpCreatorSheetWidget6 = this.LIZ;
                if (i != 4) {
                    z3 = false;
                }
                pdpCreatorSheetWidget6.LJIIJJI(z3);
            }
        };
        this.LLJJJJ = r1;
        this.LLJJIJIL.addBottomSheetCallback(r1);
        RadiusLayout radiusLayout3 = this.LLJJIII;
        if (radiusLayout3 != null && (layoutParams = radiusLayout3.getLayoutParams()) != null) {
            layoutParams.height = LLJLLIL;
        }
        RadiusLayout radiusLayout4 = this.LLJJIII;
        ViewGroup.LayoutParams layoutParams2 = radiusLayout4 != null ? radiusLayout4.getLayoutParams() : null;
        if ((layoutParams2 instanceof C16G1) && (c16g1 = (C16G1) layoutParams2) != null) {
            c16g1.LIZIZ(this.LLJJIJIL);
        }
        this.LLJJIJIL.setPeekHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(136)));
        this.LLJJJIL = new ViewTreeObserverOnGlobalLayoutListenerC1775940wJc(this, 7);
        View view3 = this.LLJI;
        if (view3 != null && (viewTreeObserver = view3.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC1775940wJc viewTreeObserverOnGlobalLayoutListenerC1775940wJc = this.LLJJJIL;
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1775940wJc);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1775940wJc, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        RadiusLayout radiusLayout5 = this.LLJJIII;
        if (radiusLayout5 != null && (viewFindViewById5 = radiusLayout5.findViewById(R.id.j48)) != null) {
            viewFindViewById5.setOnTouchListener(new ATListenerS458S0100000_26(this, 7));
        }
        RadiusLayout radiusLayout6 = this.LLJJIII;
        if (radiusLayout6 != null && (viewFindViewById4 = radiusLayout6.findViewById(R.id.f86)) != null) {
            viewFindViewById4.setOnTouchListener(new ATListenerS458S0100000_26(this, 8));
        }
        RadiusLayout radiusLayout7 = this.LLJJIII;
        if (radiusLayout7 != null && (viewFindViewById3 = radiusLayout7.findViewById(R.id.f86)) != null) {
            C786410Ut5.I7(new AjS70S0100000_26(this, 82), viewFindViewById3);
        }
        RadiusLayout radiusLayout8 = this.LLJJIII;
        if (radiusLayout8 != null && (viewFindViewById2 = radiusLayout8.findViewById(R.id.j48)) != null) {
            C786410Ut5.I7(new AjS70S0100000_26(this, 83), viewFindViewById2);
        }
        View view4 = this.LLJJJ;
        if (view4 != null) {
            C786410Ut5.I7(new AjS70S0100000_26(this, 84), view4);
        }
        RadiusLayout radiusLayout9 = this.LLJJIII;
        if (radiusLayout9 == null || (viewFindViewById = radiusLayout9.findViewById(R.id.e26)) == null) {
            return;
        }
        C786410Ut5.I7(new AjS70S0100000_26(this, 85), viewFindViewById);
    }

    @Override // com.bytedance.widget.Widget
    public final void onDestroy() {
        ViewTreeObserver viewTreeObserver;
        this.LLILLJJLI = true;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJIJIIJIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LLJJIJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
            boolean z2 = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.LJJ(true);
        }
        View view = this.LLJI;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC1775940wJc viewTreeObserverOnGlobalLayoutListenerC1775940wJc = this.LLJJJIL;
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1775940wJc);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1775940wJc, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        C1763910w0D c1763910w0D = this.LLJJJJ;
        if (c1763910w0D != null) {
            this.LLJJIJIL.removeBottomSheetCallback(c1763910w0D);
        }
        AnonymousClass0378.LIZ().LIZJ("ec_pdp_hide_creator_widget", this);
        AnonymousClass0378.LIZ().LIZJ("ec_pdp_fold_creator_widget", this);
    }

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final PdpViewModel LJIIIIZZ() {
        return (PdpViewModel) this.LLJJI.getValue();
    }

    public final void LJIIIZ() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJII;
        View viewFindViewById;
        View viewFindViewById2;
        RadiusLayout radiusLayout;
        View viewFindViewById3;
        Map<String, Object> map;
        HashMap map2;
        Object obj;
        if (this.LLJJIJI != null) {
            return;
        }
        ObjectAnimator objectAnimator = this.LLJJLIIIJLLLLLLLZ;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
        IPdpStarter.PdpEnterParam pdpEnterParam = LJIIIIZZ().LLJI;
        if (pdpEnterParam != null && (map = pdpEnterParam.trackParams) != null && (obj = (map2 = new HashMap(map)).get("source_page_type")) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("c_side_");
            sbLIZ.append(obj);
            map2.put("source_page_type", C2188811AlT.LIZIZ(sbLIZ));
        }
        LynxCreatorModule lynxCreatorModule = this.LLJJL;
        if (lynxCreatorModule != null) {
            Container container = lynxCreatorModule.expandingContainer;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJII = LJII(LLJZ, container != null ? container.schema : null, container != null ? container.data : null);
        } else {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJII = LJII(LLJZ, null, "");
        }
        this.LLJJIJI = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJII;
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJII.LJIIIIZZ();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJIJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            C786410Ut5.r5(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, 0.0f);
            RadiusLayout radiusLayout2 = this.LLJJIII;
            if (radiusLayout2 != null) {
                radiusLayout2.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, new FrameLayout.LayoutParams(-1, -2));
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LLJJIJI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
                C0H9H.LJI(C0H9I.LIZ(28.0d), sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2);
            }
            SettingsManager.LIZLLL().getClass();
            if (!SettingsManager.LIZ("eu_pdp_creator_accessibility", false) && (radiusLayout = this.LLJJIII) != null && (viewFindViewById3 = radiusLayout.findViewById(R.id.f86)) != null) {
                viewFindViewById3.bringToFront();
            }
            RadiusLayout radiusLayout3 = this.LLJJIII;
            if (radiusLayout3 != null && (viewFindViewById2 = radiusLayout3.findViewById(R.id.j48)) != null) {
                viewFindViewById2.bringToFront();
            }
            RadiusLayout radiusLayout4 = this.LLJJIII;
            if (radiusLayout4 != null && (viewFindViewById = radiusLayout4.findViewById(R.id.e26)) != null) {
                viewFindViewById.bringToFront();
            }
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            String strCreateJumpSourceBtmToken = btmSDK.createJumpSourceBtmToken("c036552.d0", PageFinder.via((Fragment) this.LLJ), null);
            String str = C18FD.LIZ;
            btmSDK.getDepend().getClass();
            C18IP.LJIIJ(new C18EW(new WeakReference(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB), "a2270.b6891", false, strCreateJumpSourceBtmToken, 92));
        }
    }

    public final void LJIIL() {
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        if (this.LLJJIII == null) {
            return;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IAccountDependencyService.class.getName(), anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        String userId = ((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getUserId();
        if (userId == null || userId.length() == 0) {
            userId = "unknown";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(userId);
        sbLIZ.append("_1");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (((Keva) this.LLJL.getValue()).getInt(strLIZIZ, 0) > 3) {
            return;
        }
        ((Keva) this.LLJL.getValue()).storeInt(strLIZIZ, ((Keva) this.LLJL.getValue()).getInt(strLIZIZ, 0) + 1);
        ObjectAnimator duration = this.LLJJLIIIJLLLLLLLZ;
        if (duration == null) {
            RadiusLayout radiusLayout = this.LLJJIII;
            if (radiusLayout == null) {
                return;
            }
            duration = ObjectAnimator.ofFloat(radiusLayout, (Property<RadiusLayout, Float>) View.TRANSLATION_Y, 0.0f, C0H9I.LIZ(-20.0d), 0.0f).setDuration(700L);
            this.LLJJLIIIJLLLLLLLZ = duration;
            if (duration == null) {
                return;
            }
        }
        duration.setStartDelay(1000L);
        duration.setRepeatCount(1);
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS113S0100000_13(duration, 98));
    }

    public final void LJI(Function0<Unit> function0) {
        if (this.LLJJIJIL.getState() == 4) {
            this.LLJJIJIL.setState(3);
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        if (this.LLJJIJIL.getState() != 3) {
            return;
        }
        this.LLJJIJIL.setState(4);
    }

    public final void LJIIJJI(boolean z) {
        View viewFindViewById;
        RadiusLayout radiusLayout = this.LLJJIII;
        if (radiusLayout != null && (viewFindViewById = radiusLayout.findViewById(R.id.e26)) != null) {
            int i = 0;
            if (!this.LLJLILLLLZIIL || !z) {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, viewFindViewById);
        }
    }

    public final void LJIILIIL(float f) {
        TuxIconView tuxIconView;
        View viewFindViewById;
        TuxIconView tuxIconView2;
        int i;
        RadiusLayout radiusLayout = this.LLJJIII;
        ConstraintLayout constraintLayout = null;
        if (radiusLayout != null) {
            constraintLayout = (ConstraintLayout) radiusLayout.findViewById(R.id.f86);
        }
        if (constraintLayout != null) {
            C786410Ut5.c5(constraintLayout, 1 - f);
        }
        View view = this.LLJJJ;
        int i2 = 8;
        if (view != null) {
            if (f > 0.0f) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
        View view2 = this.LLJJJ;
        if (view2 != null) {
            C786410Ut5.T4(view2, f);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJIJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            C786410Ut5.r5(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, f);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LLJJIJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
            C786410Ut5.LLLLIIIILLL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2, 0);
        }
        RadiusLayout radiusLayout2 = this.LLJJIII;
        if (radiusLayout2 != null && (tuxIconView2 = (TuxIconView) radiusLayout2.findViewById(R.id.j49)) != null) {
            C786410Ut5.x5(tuxIconView2, f);
        }
        RadiusLayout radiusLayout3 = this.LLJJIII;
        if (radiusLayout3 != null && (viewFindViewById = radiusLayout3.findViewById(R.id.j49)) != null) {
            if (f > 0.0f) {
                i2 = 0;
            }
            C786410Ut5.LJLLLLLL(i2, viewFindViewById);
        }
        RadiusLayout radiusLayout4 = this.LLJJIII;
        if (radiusLayout4 != null && (tuxIconView = (TuxIconView) radiusLayout4.findViewById(R.id.j4a)) != null) {
            C786410Ut5.x5(tuxIconView, 1 - f);
        }
        PdpViewModel pdpViewModelLJIIIIZZ = LJIIIIZZ();
        pdpViewModelLJIIIIZZ.getClass();
        pdpViewModelLJIIIIZZ.setState(new AwS12S0000001_26(f, 3));
    }

    public final void LJIIJ(MotionEvent motionEvent, View view) {
        if (motionEvent.getAction() == 0 && this.LLJJIJIL.getState() == 4) {
            LJIIIZ();
        } else {
            if (1 != motionEvent.getAction()) {
                return;
            }
            view.performClick();
        }
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        RadiusLayout radiusLayout;
        View viewFindViewById;
        if (Intrinsics.LJFF(str, "ec_pdp_hide_creator_widget")) {
            this.LLJJIJIL.setHideable(true);
            this.LLJJIJIL.setState(5);
            this.LLJJIJIL = new BottomSheetBehavior<>();
        } else {
            if (!Intrinsics.LJFF(str, "ec_pdp_fold_creator_widget") || this.LLJJIJIL.getState() != 3 || (radiusLayout = this.LLJJIII) == null || (viewFindViewById = radiusLayout.findViewById(R.id.j48)) == null) {
                return;
            }
            viewFindViewById.performClick();
        }
    }

    public PdpCreatorSheetWidget(PdpFragment pdpFragment, View view, boolean z) {
        int i;
        this.LLJ = pdpFragment;
        this.LLJI = view;
        this.LLJIJIL = z;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PdpViewModel.class);
        this.LLJJI = C452501pT.LIZIZ(new AwS260S0300000_16(this, c19719912DlLIZ, c19719912DlLIZ, 16));
        this.LLJJIJIL = new BottomSheetBehavior<>();
        this.LLJJJJJIL = true;
        this.LLJL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(141));
        if (z) {
            i = 4;
        } else {
            i = 3;
        }
        this.LLJLIL = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0108 A[PHI: r0
      0x0108: PHI (r0v10 android.view.View) = (r0v9 android.view.View), (r0v24 android.view.View) binds: [B:35:0x00b5, B:40:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LJII(final int r10, java.lang.String r11, final java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpCreatorSheetWidget.LJII(int, java.lang.String, java.lang.String):X.0qEB");
    }
}
