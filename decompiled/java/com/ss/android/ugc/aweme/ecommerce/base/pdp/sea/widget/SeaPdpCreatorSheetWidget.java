package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget;

import X.AbstractC1177930gl5;
import X.AbstractC1539010q9T;
import X.AbstractC1542200qEc;
import X.AnonymousClass0317;
import X.AnonymousClass0378;
import X.C01GW;
import X.C034S;
import X.C0H9H;
import X.C0H9I;
import X.C1120604Zw;
import X.C13LE;
import X.C1537900q7g;
import X.C1541950qED;
import X.C16G1;
import X.C1741890vQh;
import X.C1744700vVE;
import X.C1745060vVo;
import X.C1763890w0B;
import X.C1842040y2E;
import X.C18EW;
import X.C18FD;
import X.C18IP;
import X.C19719912Dl;
import X.C19EG;
import X.C1AQS;
import X.C1DUE;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C631470Opl;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1164530gPT;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import X.ViewTreeObserverOnGlobalLayoutListenerC1775940wJc;
import Y.ARunnableS113S0100000_13;
import Y.ARunnableS126S0100000_26;
import Y.ARunnableS32S0110000_13;
import Y.ATListenerS458S0100000_26;
import android.animation.ValueAnimator;
import android.os.Looper;
import android.os.SystemClock;
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
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.widget.RadiusLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.base.arch.JediBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Container;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LynxCreatorModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpCreatorSheetWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
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
import kotlin.jvm.internal.AwS38S0010000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS592S0100000_13;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import r4b.a;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPdpCreatorSheetWidget extends JediBaseWidget implements InterfaceC1164530gPT {
    public static final int LLJLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(240));
    public static final int LLJZ = 1;
    public static final int LLJZIJLIL = 2;
    public final SeaPdpFragment LLJ;
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
    public C1763890w0B LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public LynxCreatorModule LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public int LLJLIL;
    public Integer LLJLILLLLZIIL;
    public boolean LLJLL;
    public String LLJLLIL;

    @Override // com.bytedance.widget.Widget
    public final int LIZLLL() {
        return R.layout.avz;
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [X.0gl5, X.0w0B] */
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
            C1DUE c1due = (C1DUE) ViewDataBinding.LIZIZ(R.layout.avz, view);
            if (c1due != null) {
                c1due.LJIILLIIL(new a());
            }
        }
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
        ?? r1 = new AbstractC1177930gl5() { // from class: X.0w0B
            @Override // X.AbstractC1177930gl5
            public final void LIZJ(View view3, float f) {
                this.LIZ.LJIILIIL(f);
            }

            @Override // X.AbstractC1177930gl5
            public final void LIZLLL(int i, View view3) {
                View viewFindViewById10;
                boolean z;
                boolean z2;
                View viewFindViewById11;
                boolean z3;
                View viewFindViewById12;
                boolean z4;
                View viewFindViewById13;
                RadiusLayout radiusLayout3;
                View viewFindViewById14;
                boolean z5 = true;
                if (i != 3) {
                    if (i == 4) {
                        this.LIZ.LLJJIJIL.setHideable(false);
                        SeaPdpCreatorSheetWidget seaPdpCreatorSheetWidget = this.LIZ;
                        if (!seaPdpCreatorSheetWidget.LLJJJJLIIL && ((seaPdpCreatorSheetWidget.LJIIIIZZ().JR2() && !this.LIZ.LLJJJJJIL) || (!this.LIZ.LJIIIIZZ().JR2() && this.LIZ.LLJJJJJIL))) {
                            SeaPdpCreatorSheetWidget seaPdpCreatorSheetWidget2 = this.LIZ;
                            if (seaPdpCreatorSheetWidget2.LLJJL == null && (radiusLayout3 = seaPdpCreatorSheetWidget2.LLJJIII) != null && (viewFindViewById14 = radiusLayout3.findViewById(R.id.f86)) != null) {
                                HandlerHook.viewPost(viewFindViewById14, new ARunnableS126S0100000_26(this.LIZ, 63));
                            }
                            this.LIZ.LLJJJJLIIL = true;
                        }
                        SeaPdpCreatorSheetWidget seaPdpCreatorSheetWidget3 = this.LIZ;
                        if (!seaPdpCreatorSheetWidget3.LLJIJIL && seaPdpCreatorSheetWidget3.LLJJJJJIL && seaPdpCreatorSheetWidget3.LJIIIIZZ().JR2()) {
                            this.LIZ.LJIIIZ();
                            this.LIZ.LLJJIJIL.setState(3);
                        }
                        SeaPdpCreatorSheetWidget seaPdpCreatorSheetWidget4 = this.LIZ;
                        seaPdpCreatorSheetWidget4.LLJJJJJIL = false;
                        RadiusLayout radiusLayout4 = seaPdpCreatorSheetWidget4.LLJJIII;
                        if (radiusLayout4 != null && (viewFindViewById13 = radiusLayout4.findViewById(R.id.f86)) != null) {
                            HandlerHook.viewPost(viewFindViewById13, new ARunnableS32S0110000_13((Object) seaPdpCreatorSheetWidget4, true, 2));
                        }
                        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LIZ.LLJJIJI;
                        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                            String str = C18FD.LIZ;
                            C18FD.LIZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, Boolean.FALSE);
                        }
                    }
                } else {
                    this.LIZ.LJIILIIL(1.0f);
                    SeaPdpCreatorSheetWidget seaPdpCreatorSheetWidget5 = this.LIZ;
                    RadiusLayout radiusLayout5 = seaPdpCreatorSheetWidget5.LLJJIII;
                    if (radiusLayout5 != null && (viewFindViewById10 = radiusLayout5.findViewById(R.id.f86)) != null) {
                        HandlerHook.viewPost(viewFindViewById10, new ARunnableS32S0110000_13((Object) seaPdpCreatorSheetWidget5, false, 2));
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
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    viewFindViewById12.setClickable(z4);
                }
                RadiusLayout radiusLayout7 = this.LIZ.LLJJIII;
                if (radiusLayout7 != null && (viewFindViewById11 = radiusLayout7.findViewById(R.id.f86)) != null) {
                    if (i != 3) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    viewFindViewById11.setEnabled(z3);
                }
                SeaPdpCreatorSheetWidget seaPdpCreatorSheetWidget6 = this.LIZ;
                if (i == 4) {
                    z = true;
                } else {
                    z = false;
                }
                seaPdpCreatorSheetWidget6.LJIIJJI(z);
                if (i != 4) {
                    if (i == 5) {
                        SeaPdpViewModel.GS2(this.LIZ.LJIIIIZZ(), 0, null, 2);
                    }
                } else {
                    SeaPdpViewModel.GS2(this.LIZ.LJIIIIZZ(), this.LIZ.LLJLILLLLZIIL, null, 2);
                }
                C1755820vnA c1755820vnA = this.LIZ.LJIIIIZZ().LLLLJI.LLILLJJLI;
                c1755820vnA.getClass();
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        return;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = true;
                }
                c1755820vnA.LIZLLL = z2;
                C1755680vmw c1755680vmw = c1755820vnA.LIZ;
                if (!c1755820vnA.LIZJ || z2 || c1755820vnA.LJ) {
                    z5 = false;
                }
                c1755680vmw.getClass();
                c1755680vmw.LIZ(new AwS38S0010000_26(z5, 12));
            }
        };
        this.LLJJJJ = r1;
        this.LLJJIJIL.addBottomSheetCallback(r1);
        RadiusLayout radiusLayout3 = this.LLJJIII;
        if (radiusLayout3 != null && (layoutParams = radiusLayout3.getLayoutParams()) != null) {
            layoutParams.height = LLJLLL;
        }
        RadiusLayout radiusLayout4 = this.LLJJIII;
        ViewGroup.LayoutParams layoutParams2 = radiusLayout4 != null ? radiusLayout4.getLayoutParams() : null;
        if ((layoutParams2 instanceof C16G1) && (c16g1 = (C16G1) layoutParams2) != null) {
            c16g1.LIZIZ(this.LLJJIJIL);
        }
        this.LLJJIJIL.setPeekHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(136)));
        this.LLJJJIL = new ViewTreeObserverOnGlobalLayoutListenerC1775940wJc(this, 5);
        View view3 = this.LLJI;
        if (view3 != null && (viewTreeObserver = view3.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC1775940wJc viewTreeObserverOnGlobalLayoutListenerC1775940wJc = this.LLJJJIL;
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1775940wJc);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1775940wJc, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        RadiusLayout radiusLayout5 = this.LLJJIII;
        if (radiusLayout5 != null && (viewFindViewById5 = radiusLayout5.findViewById(R.id.j48)) != null) {
            viewFindViewById5.setOnTouchListener(new ATListenerS458S0100000_26(this, 3));
        }
        RadiusLayout radiusLayout6 = this.LLJJIII;
        if (radiusLayout6 != null && (viewFindViewById4 = radiusLayout6.findViewById(R.id.f86)) != null) {
            viewFindViewById4.setOnTouchListener(new ATListenerS458S0100000_26(this, 4));
        }
        RadiusLayout radiusLayout7 = this.LLJJIII;
        if (radiusLayout7 != null && (viewFindViewById3 = radiusLayout7.findViewById(R.id.f86)) != null) {
            C786410Ut5.I7(new AjS70S0100000_26(this, 37), viewFindViewById3);
        }
        RadiusLayout radiusLayout8 = this.LLJJIII;
        if (radiusLayout8 != null && (viewFindViewById2 = radiusLayout8.findViewById(R.id.j48)) != null) {
            C786410Ut5.I7(new AjS70S0100000_26(this, 38), viewFindViewById2);
        }
        View view4 = this.LLJJJ;
        if (view4 != null) {
            C786410Ut5.I7(new AjS70S0100000_26(this, 39), view4);
        }
        RadiusLayout radiusLayout9 = this.LLJJIII;
        if (radiusLayout9 != null && (viewFindViewById = radiusLayout9.findViewById(R.id.e26)) != null) {
            C786410Ut5.I7(new AjS70S0100000_26(this, 41), viewFindViewById);
        }
        LJIIIIZZ().hR2(new C2217381BqS() { // from class: X.0voG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SeaPdpMainState) obj).getCreatorSheetVO();
            }
        }, new AwS605S0100000_26(this, 462));
        LJIIIIZZ().hR2(new C2217381BqS() { // from class: X.0vke
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((SeaPdpMainState) obj).getSheetState());
            }
        }, new AwS605S0100000_26(this, 438));
        LJIIIIZZ().hR2(new C2217381BqS() { // from class: X.0vsh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((SeaPdpMainState) obj).getCreatorSheetSlideOffset());
            }
        }, new AwS592S0100000_13(this, 40));
        LJIIIIZZ().hR2(new C2217381BqS() { // from class: X.0viz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((SeaPdpMainState) obj).getScrollOrientation());
            }
        }, new AwS605S0100000_26(this, 444));
        LJIIIIZZ().hR2(new C2217381BqS() { // from class: X.0voF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SeaPdpMainState) obj).getCreatorSheetVO();
            }
        }, new AwS605S0100000_26(this, 458));
        AnonymousClass0378.LIZ().LIZLLL("ec_pdp_hide_creator_widget", this);
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
        C1763890w0B c1763890w0B = this.LLJJJJ;
        if (c1763890w0B != null) {
            this.LLJJIJIL.removeBottomSheetCallback(c1763890w0B);
        }
        AnonymousClass0378.LIZ().LIZJ("ec_pdp_hide_creator_widget", this);
    }

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final SeaPdpViewModel LJIIIIZZ() {
        return (SeaPdpViewModel) this.LLJJI.getValue();
    }

    public final void LJIIIZ() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJII;
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        Map<String, Object> map;
        HashMap map2;
        Object obj;
        if (this.LLJJIJI != null) {
            return;
        }
        ((ValueAnimator) this.LLJJLIIIJLLLLLLLZ.getValue()).end();
        IPdpStarter.PdpEnterParam pdpEnterParam = LJIIIIZZ().LLIZ;
        if (pdpEnterParam != null && (map = pdpEnterParam.trackParams) != null && (obj = (map2 = new HashMap(map)).get("source_page_type")) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("c_side_");
            sbLIZ.append(obj);
            map2.put("source_page_type", C2188811AlT.LIZIZ(sbLIZ));
        }
        LynxCreatorModule lynxCreatorModule = this.LLJJL;
        if (lynxCreatorModule != null) {
            Container container = lynxCreatorModule.expandingContainer;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJII = LJII(LLJZIJLIL, container != null ? container.schema : null, container != null ? container.data : null);
        } else {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJII = LJII(LLJZIJLIL, null, "");
        }
        this.LLJJIJI = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJII;
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJII.LJIIIIZZ();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJIJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            C786410Ut5.r5(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, 0.0f);
            RadiusLayout radiusLayout = this.LLJJIII;
            if (radiusLayout != null) {
                radiusLayout.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, new FrameLayout.LayoutParams(-1, -2));
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LLJJIJI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
                C0H9H.LJI(C0H9I.LIZ(28.0d), sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2);
            }
            RadiusLayout radiusLayout2 = this.LLJJIII;
            if (radiusLayout2 != null && (viewFindViewById3 = radiusLayout2.findViewById(R.id.f86)) != null) {
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
        ((ValueAnimator) this.LLJJLIIIJLLLLLLLZ.getValue()).setStartDelay(1000L);
        ((ValueAnimator) this.LLJJLIIIJLLLLLLLZ.getValue()).setRepeatCount(1);
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS113S0100000_13(this, 96));
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
            if (!this.LLJLL || !z) {
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
        SeaPdpViewModel seaPdpViewModelLJIIIIZZ = LJIIIIZZ();
        seaPdpViewModelLJIIIIZZ.getClass();
        seaPdpViewModelLJIIIIZZ.setState(new AwS12S0000001_26(f, 0));
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
        if (Intrinsics.LJFF(str, "ec_pdp_hide_creator_widget")) {
            this.LLJJIJIL.setHideable(true);
            this.LLJJIJIL.setState(5);
            this.LLJJIJIL = new BottomSheetBehavior<>();
        }
    }

    public SeaPdpCreatorSheetWidget(SeaPdpFragment seaPdpFragment, View view, boolean z) {
        int i;
        this.LLJ = seaPdpFragment;
        this.LLJI = view;
        this.LLJIJIL = z;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJJI = C452501pT.LIZIZ(new AwS260S0300000_16(this, c19719912DlLIZ, c19719912DlLIZ, 11));
        this.LLJJIJIL = new BottomSheetBehavior<>();
        this.LLJJJJJIL = true;
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 441));
        this.LLJL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(126));
        if (z) {
            i = 4;
        } else {
            i = 3;
        }
        this.LLJLIL = i;
    }

    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LJII(final int i, String str, final String str2) {
        HashMap map;
        String str3;
        String str4;
        String str5;
        int i2;
        ProductBase productBase;
        Map<String, Object> map2;
        IPdpStarter.PdpEnterParam pdpEnterParam = LJIIIIZZ().LLIZ;
        String strLJIIIIZZ = null;
        if (pdpEnterParam != null && (map2 = pdpEnterParam.trackParams) != null) {
            map = new HashMap(map2);
            Object obj = map.get("source_page_type");
            if (obj != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("c_side_");
                sbLIZ.append(obj);
                map.put("source_page_type", C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            map = null;
        }
        if (map != null) {
            ProductPackStruct productPackStruct = LJIIIIZZ().LLJIJIL;
            if (productPackStruct != null && (productBase = productPackStruct.baseInfo) != null) {
                str4 = productBase.categoryName;
            } else {
                str4 = null;
            }
            map.put("product_category", str4);
            SkuPanelState skuPanelState = LJIIIIZZ().LLJILJIL;
            if (skuPanelState != null) {
                str5 = skuPanelState.skuId;
            } else {
                str5 = null;
            }
            map.put("sku_id", str5);
            if (this.LLJLIL == 4) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            map.put("is_pdp_full_screen", Integer.valueOf(i2));
            map.put("type", "module");
            map.put("module_name", "affiliate_info_bottom_bar");
            map.put("page_name", "product_detail");
        }
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        C19EG c19egLIZ = C1745060vVo.LIZ(this);
        SparkContext sparkContext = new SparkContext();
        String str6 = "";
        if (str == null) {
            str = "";
        }
        sparkContext.LJJLIIJ(str);
        if (map != null) {
            strLJIIIIZZ = C1741890vQh.LJIIIIZZ(map);
        }
        sparkContext.LJJJZ("trackParams", String.valueOf(strLJIIIIZZ));
        ProductPackStruct productPackStruct2 = LJIIIIZZ().LLJIJIL;
        if (productPackStruct2 != null && (str3 = productPackStruct2.productId) != null) {
            str6 = str3;
        }
        sparkContext.LJJJZ("product_id", str6);
        sparkContext.LJJJZ("hide_loading", "1");
        sparkContext.LJJJJZI(new AbstractC1542200qEc() { // from class: X.0w0E
            @Override // X.AbstractC1537870q7d
            public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                ViewGroup.LayoutParams layoutParams;
                RadiusLayout radiusLayout = this.LLILLJJLI.LLJJIII;
                if (radiusLayout != null) {
                    C786410Ut5.LJLLLLLL(0, radiusLayout);
                }
                if (!this.LLILLJJLI.LJIIIIZZ().JR2() && i == SeaPdpCreatorSheetWidget.LLJZ) {
                    SeaPdpCreatorSheetWidget seaPdpCreatorSheetWidget = this.LLILLJJLI;
                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = seaPdpCreatorSheetWidget.LLJJIJIIJIL;
                    if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                        HandlerHook.viewPostDelay(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, new ARunnableS126S0100000_26(seaPdpCreatorSheetWidget, 31), 300L);
                        return;
                    }
                    return;
                }
                RadiusLayout radiusLayout2 = this.LLILLJJLI.LLJJIII;
                if (radiusLayout2 == null || (layoutParams = radiusLayout2.getLayoutParams()) == null) {
                    return;
                }
                layoutParams.height = -2;
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLJI(InterfaceC1541990qEH interfaceC1541990qEH) {
                C1075770e6J c1075770e6J = (C1075770e6J) interfaceC1541990qEH.getHybridContext().LJFF(C1075770e6J.class);
                if (c1075770e6J != null) {
                    c1075770e6J.LJIJ(PageFinder.class, PageFinder.via((Fragment) this.LLILLJJLI.LLJ));
                }
            }
        });
        sparkContext.LJJ(AbstractC1539010q9T.class, new AbstractC1539010q9T() { // from class: X.0w0G
            @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
            public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                C1537910q7h c1537910q7h;
                TemplateData templateDataLJIIIIZZ;
                if ((interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
                    int i3 = i;
                    String str7 = str2;
                    if (i3 == SeaPdpCreatorSheetWidget.LLJZ) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("{ \"folding_container_data\": ");
                        sbLIZ2.append(str7);
                        sbLIZ2.append(" }");
                        templateDataLJIIIIZZ = TemplateData.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ2));
                    } else {
                        templateDataLJIIIIZZ = TemplateData.LJIIIIZZ(str7);
                    }
                    c1537910q7h.LJIJJ = templateDataLJIIIIZZ;
                }
            }
        });
        c1537900q7g.getClass();
        return new C1541950qED(c19egLIZ, sparkContext).LIZ(false);
    }
}
