package com.ss.android.ugc.aweme.commercialize.ecommerce.pdp.ui;

import X.AbstractC1024610cln;
import X.C01GW;
import X.C098200Yq;
import X.C1030450cvD;
import X.C1041990dDp;
import X.C1389600mGU;
import X.C13LE;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C19GU;
import X.C2189691Amt;
import X.C2217381BqS;
import X.C452501pT;
import X.C786410Ut5;
import X.C905703gN;
import X.InterfaceC197050127s;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS167S0100000_33;
import Y.ARunnableS133S0100000_33;
import Y.ATListenerS465S0100000_33;
import Y.AfS165S0200000_31;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ScrollView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.commercialize.ecommerce.pdp.log.PdpLogHelper;
import com.ss.android.ugc.aweme.commercialize.ecommerce.pdp.model.ShopifyPdpAdInfo;
import com.ss.android.ugc.aweme.commercialize.ecommerce.pdp.ui.PdpBulletBottomSheetFragment;
import com.ss.android.ugc.aweme.spark.AdSparkContext;
import com.ss.android.ugc.aweme.spark.AdSparkUtils;
import com.ss.android.ugc.aweme.spark.IAdSparkUtils;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class PdpBulletBottomSheetFragment extends GlobalHookDialogFragment {
    public static final C1030450cvD LLJJIII;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2OiYlKCM6MiBiLCw8HELIOSJSgpOyw2ZjUoOWEmIWscLT8RPSkgLDsRJzE4JiIAICApPQkhKSIhLCEn";
    public SparkFragment LLIZLLLIL;
    public long LLJ;
    public View LLJI;
    public float LLJIJIL;
    public BottomSheetBehavior<View> LLJILJIL;
    public Integer LLJILLL;
    public boolean LLJJ;
    public volatile PdpLogHelper LLJJI;
    public final C01GW LL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 418));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 416));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 415));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 417));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 414));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 419));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 413));
    public int LLJILJILJ = 4;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0cvD] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PdpBulletBottomSheetFragment.class, "pdpLogHelper", "getPdpLogHelper()Lcom/ss/android/ugc/aweme/commercialize/ecommerce/pdp/log/PdpLogHelper;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIII = new Object() { // from class: X.0cvD
        };
    }

    public final ViewGroup NR() {
        return (ViewGroup) this.LLILZIL.getValue();
    }

    public final PdpLogHelper OR() {
        PdpLogHelper pdpLogHelper = this.LLJJI;
        if (pdpLogHelper == null) {
            synchronized (this) {
                pdpLogHelper = this.LLJJI;
                if (pdpLogHelper == null) {
                    PdpLogHelper pdpLogHelper2 = new PdpLogHelper();
                    this.LLJJI = pdpLogHelper2;
                    return pdpLogHelper2;
                }
            }
        }
        return pdpLogHelper;
    }

    public final View MR(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        for (View view : new C2189691Amt(viewGroup, 0)) {
            if (view instanceof ScrollView) {
                view.setOnTouchListener(new ATListenerS465S0100000_33(this, 1));
                return view;
            }
            if (view instanceof ViewGroup) {
                return MR((ViewGroup) view);
            }
        }
        return null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View view = (View) this.LLILZLL.getValue();
        if (view != null) {
            C786410Ut5.I7(new ACListenerS167S0100000_33(this, 31), view);
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: X.19dm
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    float fFloatValue;
                    Window window;
                    Dialog dialog2 = this.LL.getDialog();
                    if (dialog2 != null && (window = dialog2.getWindow()) != null && Build.VERSION.SDK_INT >= 26) {
                        window.setNavigationBarColor(-16777216);
                        C1360720lVu.LIZJ(window, false);
                    }
                    this.LL.getClass();
                    ViewGroup viewGroupNR = this.LL.NR();
                    if (viewGroupNR != null) {
                        viewGroupNR.setOutlineProvider(new C2189491AmZ(this.LL, 1));
                    }
                    ViewGroup viewGroupNR2 = this.LL.NR();
                    if (viewGroupNR2 != null) {
                        viewGroupNR2.setClipToOutline(true);
                    }
                    ViewGroup viewGroupNR3 = this.LL.NR();
                    if (viewGroupNR3 != null) {
                        final PdpBulletBottomSheetFragment pdpBulletBottomSheetFragment = this.LL;
                        BottomSheetBehavior<View> bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewGroupNR3);
                        pdpBulletBottomSheetFragment.LLJILJIL = bottomSheetBehaviorFrom;
                        if (bottomSheetBehaviorFrom != null) {
                            bottomSheetBehaviorFrom.setHideable(true);
                        }
                        BottomSheetBehavior<View> bottomSheetBehavior = pdpBulletBottomSheetFragment.LLJILJIL;
                        if (bottomSheetBehavior != null) {
                            bottomSheetBehavior.setSkipCollapsed(false);
                        }
                        BottomSheetBehavior<View> bottomSheetBehavior2 = pdpBulletBottomSheetFragment.LLJILJIL;
                        if (bottomSheetBehavior2 != null) {
                            float fLJIIIIZZ = C12ES.LJIIIIZZ(pdpBulletBottomSheetFragment.getContext());
                            Float f = (Float) pdpBulletBottomSheetFragment.LLILLJJLI.getValue();
                            if (f != null) {
                                fFloatValue = f.floatValue();
                            } else {
                                fFloatValue = 0.73f;
                            }
                            bottomSheetBehavior2.setPeekHeight((int) (fLJIIIIZZ * fFloatValue));
                        }
                        BottomSheetBehavior<View> bottomSheetBehavior3 = pdpBulletBottomSheetFragment.LLJILJIL;
                        if (bottomSheetBehavior3 != null) {
                            bottomSheetBehavior3.setBottomSheetCallback(new AbstractC1177930gl5() { // from class: X.19dn
                                @Override // X.AbstractC1177930gl5
                                public final void LIZJ(View view2, float f2) {
                                    PdpBulletBottomSheetFragment pdpBulletBottomSheetFragment2 = pdpBulletBottomSheetFragment;
                                    if (pdpBulletBottomSheetFragment2.LLJIJIL < 0.5f && f2 >= 0.5f) {
                                        ViewGroup viewGroupNR4 = pdpBulletBottomSheetFragment2.NR();
                                        if (viewGroupNR4 != null) {
                                            HandlerHook.viewPost(viewGroupNR4, new ARunnableS133S0100000_33(pdpBulletBottomSheetFragment, 40));
                                        }
                                        pdpBulletBottomSheetFragment.LLJILLL = 3;
                                    }
                                    PdpBulletBottomSheetFragment pdpBulletBottomSheetFragment3 = pdpBulletBottomSheetFragment;
                                    if (pdpBulletBottomSheetFragment3.LLJIJIL >= 0.5f && f2 < 0.5f) {
                                        ViewGroup viewGroupNR5 = pdpBulletBottomSheetFragment3.NR();
                                        if (viewGroupNR5 != null) {
                                            HandlerHook.viewPost(viewGroupNR5, new ARunnableS133S0100000_33(pdpBulletBottomSheetFragment, 41));
                                        }
                                        pdpBulletBottomSheetFragment.LLJILLL = 4;
                                    }
                                    pdpBulletBottomSheetFragment.LLJIJIL = f2;
                                }

                                @Override // X.AbstractC1177930gl5
                                public final void LIZLLL(int i, View view2) {
                                    View view3;
                                    boolean z;
                                    ViewGroup viewGroupNR4;
                                    Integer num;
                                    ViewGroup viewGroupNR5;
                                    if (i == 5) {
                                        Dialog dialog3 = pdpBulletBottomSheetFragment.getDialog();
                                        if (dialog3 != null) {
                                            dialog3.dismiss();
                                            C785410UrT.LIZ(dialog3);
                                        }
                                    } else {
                                        pdpBulletBottomSheetFragment.getClass();
                                    }
                                    if (i == 1 && (num = pdpBulletBottomSheetFragment.LLJILLL) != null && num.intValue() == 3 && (viewGroupNR5 = pdpBulletBottomSheetFragment.NR()) != null) {
                                        HandlerHook.viewPost(viewGroupNR5, new ARunnableS133S0100000_33(pdpBulletBottomSheetFragment, 42));
                                    }
                                    if (i == 1) {
                                        Integer num2 = pdpBulletBottomSheetFragment.LLJILLL;
                                        if (num2 != null && num2.intValue() == 4 && (viewGroupNR4 = pdpBulletBottomSheetFragment.NR()) != null) {
                                            HandlerHook.viewPost(viewGroupNR4, new ARunnableS133S0100000_33(pdpBulletBottomSheetFragment, 43));
                                        }
                                    } else if (i == 3 || i == 4 || i == 5) {
                                        PdpBulletBottomSheetFragment pdpBulletBottomSheetFragment2 = pdpBulletBottomSheetFragment;
                                        pdpBulletBottomSheetFragment2.LLJILJILJ = i;
                                        pdpBulletBottomSheetFragment2.OR().LL.onNext(Integer.valueOf(i));
                                    }
                                    View view4 = (View) pdpBulletBottomSheetFragment.LLIZ.getValue();
                                    if (view4 != null) {
                                        if (i != 2) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        view4.setEnabled(z);
                                    }
                                    if (i == 3 && (view3 = pdpBulletBottomSheetFragment.LLJI) != null) {
                                        view3.scrollBy(0, 1);
                                    }
                                }
                            });
                        }
                    }
                }
            });
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.19dp
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    if (i == 4) {
                        keyEvent.getAction();
                    }
                    return false;
                }
            });
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getLifecycle().addObserver(OR());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.19do] */
    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        final C19EG c19egRequireActivity = requireActivity();
        final ?? r0 = new InterfaceC197050127s() { // from class: X.19do
            @Override // X.InterfaceC197050127s
            public final void LIZIZ() {
                this.LIZ.LLJILLL = null;
            }

            @Override // X.InterfaceC197050127s
            public final void LIZ(boolean z) {
                ViewGroup viewGroupNR;
                boolean z2;
                PdpBulletBottomSheetFragment pdpBulletBottomSheetFragment = this.LIZ;
                View view = pdpBulletBottomSheetFragment.LLJI;
                if (view != null && (viewGroupNR = pdpBulletBottomSheetFragment.NR()) != null) {
                    if (z || (pdpBulletBottomSheetFragment.LLJILJILJ == 3 && view.getScrollY() != 0)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    viewGroupNR.requestDisallowInterceptTouchEvent(z2);
                }
            }
        };
        C19GU c19gu = new C19GU(c19egRequireActivity, r0) { // from class: X.127r
            public final InterfaceC197050127s LLILZLL;
            public float LLIZ;
            public float LLIZLLLIL;
            public float LLJ;
            public float LLJI;

            /* JADX WARN: Removed duplicated region for block: B:13:0x0014  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
            @Override // android.app.Dialog, android.view.Window.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean dispatchTouchEvent(android.view.MotionEvent r6) {
                /*
                    r5 = this;
                    int r1 = r6.getAction()
                    if (r1 == 0) goto L51
                    r4 = 1
                    if (r1 == r4) goto L49
                    r0 = 2
                    if (r1 == r0) goto L1c
                    r0 = 3
                    if (r1 == r0) goto L49
                Lf:
                    r4 = 0
                L10:
                    X.127s r0 = r5.LLILZLL
                    if (r0 == 0) goto L17
                    r0.LIZ(r4)
                L17:
                    boolean r0 = super.dispatchTouchEvent(r6)
                    return r0
                L1c:
                    float r3 = r6.getX()
                    float r2 = r6.getY()
                    float r1 = r5.LLIZ
                    float r0 = r5.LLJ
                    float r0 = r3 - r0
                    float r0 = java.lang.Math.abs(r0)
                    float r1 = r1 + r0
                    r5.LLIZ = r1
                    float r1 = r5.LLIZLLLIL
                    float r0 = r5.LLJI
                    float r0 = r2 - r0
                    float r0 = java.lang.Math.abs(r0)
                    float r1 = r1 + r0
                    r5.LLIZLLLIL = r1
                    r5.LLJ = r3
                    r5.LLJI = r2
                    float r0 = r5.LLIZ
                    int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    if (r0 <= 0) goto Lf
                    goto L10
                L49:
                    X.127s r0 = r5.LLILZLL
                    if (r0 == 0) goto Lf
                    r0.LIZIZ()
                    goto Lf
                L51:
                    r0 = 0
                    r5.LLIZ = r0
                    r5.LLIZLLLIL = r0
                    float r0 = r6.getX()
                    r5.LLJ = r0
                    float r0 = r6.getY()
                    r5.LLJI = r0
                    goto Lf
                */
                throw new UnsupportedOperationException("Method not decompiled: X.DialogC197049127r.dispatchTouchEvent(android.view.MotionEvent):boolean");
            }

            @Override // X.C19GU, X.C19EK, android.app.Dialog
            public final void setContentView(int i) {
                LJJLL(1);
                super.setContentView(i);
                Window window = getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
            }

            @Override // X.C19GU, X.C19EK, android.app.Dialog
            public final void setContentView(View view) {
                LJJLL(1);
                super.setContentView(view);
                Window window = getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
            }

            {
                this.LLILZLL = r0;
            }
        };
        Window window = c19gu.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(c19gu);
        return c19gu;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SparkFragment sparkFragment;
        Bundle bundle2;
        SparkContext sparkContext;
        IAdSparkUtils iAdSparkUtilsLJFF;
        AdSparkContext adSparkContextLIZJ;
        String str;
        Long l;
        super.onViewCreated(view, bundle);
        IAdSparkUtils iAdSparkUtilsLJFF2 = AdSparkUtils.LJFF();
        boolean z = false;
        if (iAdSparkUtilsLJFF2 == null || (sparkFragment = iAdSparkUtilsLJFF2.LIZIZ(false)) == null) {
            sparkFragment = new SparkFragment();
        }
        this.LLIZLLLIL = sparkFragment;
        String string = (String) this.LLILZ.getValue();
        if (string == null) {
            string = "about:blank";
        }
        ShopifyPdpAdInfo shopifyPdpAdInfo = (ShopifyPdpAdInfo) this.LL.getValue();
        if (shopifyPdpAdInfo != null && shopifyPdpAdInfo.isAd()) {
            z = true;
        }
        if (z) {
            string = UriProtector.parse(string).buildUpon().appendQueryParameter("is_ad", "1").build().toString();
            bundle2 = new Bundle();
            ShopifyPdpAdInfo shopifyPdpAdInfo2 = (ShopifyPdpAdInfo) this.LL.getValue();
            if (shopifyPdpAdInfo2 != null && (l = shopifyPdpAdInfo2.creativeId) != null) {
                bundle2.putLong("ad_id", l.longValue());
            }
            ShopifyPdpAdInfo shopifyPdpAdInfo3 = (ShopifyPdpAdInfo) this.LL.getValue();
            if (shopifyPdpAdInfo3 != null && (str = shopifyPdpAdInfo3.logExtra) != null) {
                C786410Ut5.LJJJI("bundle_download_app_log_extra", str, bundle2);
            }
        } else {
            bundle2 = null;
        }
        AbstractC1024610cln abstractC1024610cln = new AbstractC1024610cln() { // from class: X.19i2
            @Override // X.AbstractC1537870q7d
            public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                EnumC1067640dtC type;
                int i;
                PdpBulletBottomSheetFragment pdpBulletBottomSheetFragment = this.LL;
                if (!pdpBulletBottomSheetFragment.LLJJ) {
                    pdpBulletBottomSheetFragment.LLJI = pdpBulletBottomSheetFragment.MR((ViewGroup) interfaceC1541990qEH.e1());
                    PdpLogHelper pdpLogHelperOR = this.LL.OR();
                    int i2 = this.LL.LLJILJILJ;
                    C11PQ<Integer> c11pq = pdpLogHelperOR.LL;
                    c11pq.getClass();
                    pdpLogHelperOR.LLILLJJLI.LIZ(new C19475711Hn(c11pq).LJJLIL(Integer.valueOf(i2)).LJJIFFI().LJL(C11S5.LIZ()).LJJLL(new AfS165S0200000_31(pdpLogHelperOR, interfaceC1541990qEH, 4), new C09JN() { // from class: X.00Nb
                        @Override // X.C09JN
                        public final /* bridge */ /* synthetic */ void accept(Object obj) {
                            C1C7U.LIZ("PdpLogHelper@204e.startToListenSheetStateChange$2");
                            C1C7U.LIZIZ("PdpLogHelper@204e.startToListenSheetStateChange$2");
                        }
                    }));
                    this.LL.OR();
                    InterfaceC1531560pxS interfaceC1531560pxS = interfaceC1541990qEH.getHybridContext().hybridParams;
                    if (interfaceC1531560pxS != null) {
                        type = interfaceC1531560pxS.getType();
                    } else {
                        type = null;
                    }
                    if (type == EnumC1067640dtC.LYNX) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    PdpLogHelper.LIZ(i, this.LL.LLJ);
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str2) {
                PdpBulletBottomSheetFragment pdpBulletBottomSheetFragment = this.LL;
                pdpBulletBottomSheetFragment.LLJJ = false;
                pdpBulletBottomSheetFragment.LLJ = System.currentTimeMillis();
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str2, String str3) {
                PdpBulletBottomSheetFragment pdpBulletBottomSheetFragment = this.LL;
                pdpBulletBottomSheetFragment.LLJJ = true;
                pdpBulletBottomSheetFragment.OR();
                PdpLogHelper.LIZ(-1, this.LL.LLJ);
            }
        };
        Context context = getContext();
        if (context != null && (iAdSparkUtilsLJFF = AdSparkUtils.LJFF()) != null && (adSparkContextLIZJ = iAdSparkUtilsLJFF.LIZJ(context, string, bundle2, null, false)) != null) {
            adSparkContextLIZJ.LJJLJ(abstractC1024610cln);
            sparkContext = adSparkContextLIZJ;
        } else {
            sparkContext = new SparkContext();
        }
        SparkFragment sparkFragment2 = this.LLIZLLLIL;
        if (sparkFragment2 == null) {
            sparkFragment2 = null;
        }
        Bundle bundle3 = new Bundle();
        C905703gN.LIZ.getClass();
        C1041990dDp.LIZ.getClass();
        C1041990dDp.LIZJ(sparkContext);
        C786410Ut5.LJJJI("SparkContextContainerId", sparkContext.containerId, bundle3);
        sparkFragment2.setArguments(bundle3);
        SparkFragment sparkFragment3 = this.LLIZLLLIL;
        if (sparkFragment3 == null) {
            sparkFragment3 = null;
        }
        Bundle arguments = sparkFragment3.getArguments();
        if (arguments != null) {
            C786410Ut5.LJJIIJZLJL(arguments, bundle2);
        }
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        SparkFragment sparkFragment4 = this.LLIZLLLIL;
        if (sparkFragment4 == null) {
            sparkFragment4 = null;
        }
        c19ehLJIIJ.LJIJ(R.id.cxx, sparkFragment4, null);
        c19ehLJIIJ.LJIIJ();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c87, viewGroup, false);
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
