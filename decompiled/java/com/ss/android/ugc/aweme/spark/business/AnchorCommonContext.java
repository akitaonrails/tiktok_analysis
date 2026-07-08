package com.ss.android.ugc.aweme.spark.business;

import X.AbstractC2205961BVi;
import X.C01GW;
import X.C0OM1;
import X.C11WM;
import X.C1250250idj;
import X.C1251150ifB;
import X.C13LP;
import X.C1893010zMR;
import X.C19326610jI;
import X.C19EG;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1541990qEH;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.ss.android.ugc.aweme.spark.business.AnchorCommonContext;
import com.ss.android.ugc.aweme.spark.common.BaseThirdPartyContext;
import com.ss.android.ugc.aweme.spark.common.ThirdPartyCustomUIContext;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes30.dex */
public abstract class AnchorCommonContext<T extends C11WM> extends ThirdPartyCustomUIContext<T> {
    public TuxNavBar LLILZIL;
    public View LLILZLL;
    public View LLIZ;
    public final C01GW LLIZLLLIL;

    @Override // com.ss.android.ugc.aweme.spark.common.ThirdPartyCustomUIContext, com.ss.android.ugc.aweme.spark.common.BaseThirdPartyContext, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.ss.android.ugc.aweme.spark.common.ThirdPartyCustomUIContext, com.ss.android.ugc.aweme.spark.common.BaseThirdPartyContext
    public final void LIZ() {
        this.LL.LJJ(AnchorCommonContext.class, this);
        super.LIZ();
        this.LL.LJJLIIIJLLLLLLLZ(new C1893010zMR() { // from class: X.0zMS
            @Override // X.InterfaceC1892990zMP
            public final View LJFF(Context context) {
                View viewLJI = this.LJI();
                if (viewLJI == null) {
                    TuxNavBar tuxNavBar = new TuxNavBar(context, null, 6);
                    C786410Ut5.S6(tuxNavBar, new ViewGroup.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(45))));
                    return tuxNavBar;
                }
                return viewLJI;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.spark.common.ThirdPartyCustomUIContext
    public final View LJI() {
        C19EG c19eg = this.LLILLL;
        if (c19eg == null) {
            return null;
        }
        TuxNavBar tuxNavBar = new TuxNavBar(c19eg, null, 6);
        C786410Ut5.S6(tuxNavBar, new ViewGroup.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(45))));
        this.LLILZIL = tuxNavBar;
        return tuxNavBar;
    }

    public final String LJIIIIZZ() {
        String title;
        InterfaceC1541990qEH kitView;
        View viewE1;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = C19326610jI.LIZ(this.LL);
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ == null || (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.getKitView()) == null || (viewE1 = kitView.e1()) == null || !(viewE1 instanceof WebKitView) || (title = ((WebView) viewE1).getTitle()) == null) {
            title = "";
        }
        return TextUtils.isEmpty(title) ? ((C11WM) this.LLILLJJLI).LIZJ : title;
    }

    @Override // com.ss.android.ugc.aweme.spark.common.ThirdPartyCustomUIContext
    public final void LJFF() {
    }

    public AnchorCommonContext(SparkContext sparkContext) {
        super(sparkContext);
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 475));
    }

    @Override // com.ss.android.ugc.aweme.spark.common.BaseThirdPartyContext
    public final AbstractC2205961BVi LIZLLL(final BaseThirdPartyContext<T>.a aVar) {
        return new AbstractC2205961BVi() { // from class: X.11WN
            public boolean LL;

            @Override // X.AbstractC2205961BVi
            public final void onReceivedError(WebView webView, int i, String str, String str2) {
            }

            @Override // X.AbstractC1541670qDl
            public final AbstractC1541650qDj<?> getExtension() {
                return aVar;
            }

            @Override // X.AbstractC2205961BVi
            public final void onPageFinished(WebView webView, String str) {
                Object objH2;
                Context context;
                String str2;
                TuxNavBar tuxNavBar;
                super.onPageFinished(webView, str);
                AnchorCommonContext<T> anchorCommonContext = this;
                ((C11WM) anchorCommonContext.LLILLJJLI).LJIIIIZZ = false;
                View view = anchorCommonContext.LLILZLL;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(8, view);
                }
                if (this.LL) {
                    this.LJIIJ("close", true);
                    this.LJIIJ("back", true);
                    this.LJIIJ("more", false);
                    ((C11WM) this.LLILLJJLI).LJIIJJI = false;
                    return;
                }
                if (str == null) {
                    return;
                }
                Uri uri = UriProtector.parse(str);
                String strLJII = this.LJII(uri, "title");
                if ((((strLJII == null || strLJII.length() == 0) && (strLJII = ((C11WM) this.LLILLJJLI).LIZJ) == null) || strLJII.length() == 0) && (webView == null || (strLJII = webView.getTitle()) == null)) {
                    strLJII = "";
                }
                AnchorCommonContext<T> anchorCommonContext2 = this;
                anchorCommonContext2.getClass();
                if (strLJII != null && strLJII.length() != 0 && ((str2 = ((C11WM) anchorCommonContext2.LLILLJJLI).LJIILIIL.get("enter_from")) == null || str2.length() == 0 || ((C11WM) anchorCommonContext2.LLILLJJLI).LJIIL.length() == 0)) {
                    ((C11WM) anchorCommonContext2.LLILLJJLI).LJIIL = strLJII;
                    C19EG c19eg = anchorCommonContext2.LLILLL;
                    if (c19eg != null && (tuxNavBar = anchorCommonContext2.LLILZIL) != null) {
                        C1250250idj c1250250idj = new C1250250idj();
                        c1250250idj.LIZJ = strLJII;
                        c1250250idj.LIZLLL = u.LJJIFFI(c19eg.getString(2131826563), "%@", anchorCommonContext2.LJIIIZ(uri.toString()), false);
                        tuxNavBar.LJIJJ(c1250250idj);
                    }
                }
                AnchorCommonContext<T> anchorCommonContext3 = this;
                ((C11WM) anchorCommonContext3.LLILLJJLI).LIZLLL = u.LJIJI(anchorCommonContext3.LJII(uri, "noRedirect"), "true", true);
                AnchorCommonContext<T> anchorCommonContext4 = this;
                C11WM c11wm = (C11WM) anchorCommonContext4.LLILLJJLI;
                c11wm.LJIIJJI = false;
                if (c11wm.LJIIIZ) {
                    c11wm.LJIIIZ = false;
                    View view2 = anchorCommonContext4.LLIZ;
                    if (view2 != null && (context = view2.getContext()) != null) {
                        objH2 = C786410Ut5.H2(context, "input_method");
                    } else {
                        objH2 = null;
                    }
                    ((InputMethodManager) objH2).showSoftInput(C19326610jI.LIZ(this.LL), 1);
                }
            }

            @Override // X.AbstractC2205961BVi
            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                ThirdPartyCustomUIContext thirdPartyCustomUIContext = this;
                if (((C11WM) thirdPartyCustomUIContext.LLILLJJLI).LIZLLL) {
                    C19EG c19eg = thirdPartyCustomUIContext.LLILLL;
                    if (c19eg != null) {
                        C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
                        c1389890mGx.LJIIIZ(2131830084);
                        c1389890mGx.LJIIJJI();
                    }
                    return true;
                }
                if (str == null || str.length() == 0) {
                    return true;
                }
                ((C11WM) this.LLILLJJLI).LJIIJJI = true;
                return false;
            }

            @Override // X.AbstractC2205961BVi
            public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                this.LL = false;
            }

            @Override // X.AbstractC2205961BVi
            public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                    this.LL = true;
                }
            }
        };
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.spark.common.ThirdPartyCustomUIContext
    public void LJ(View view) {
        int i;
        String str = ((C11WM) this.LLILLJJLI).LIZIZ;
        if (str != null && str.length() != 0) {
            Uri uriBuild = UriProtector.parse(((C11WM) this.LLILLJJLI).LIZIZ).buildUpon().build();
            View viewFindViewById = view.findViewById(R.id.en2);
            if (viewFindViewById != null) {
                this.LLILZLL = viewFindViewById;
                if (((C11WM) this.LLILLJJLI).LJIIIIZZ) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, viewFindViewById);
            }
            TuxNavBar tuxNavBar = this.LLILZIL;
            if (tuxNavBar != null) {
                C0OM1 c0om1 = new C0OM1();
                C1251150ifB c1251150ifB = new C1251150ifB();
                c1251150ifB.LIZLLL();
                c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
                c1251150ifB.LIZIZ = "back";
                c1251150ifB.LIZJ(new AwS573S0100000_29(this, 472));
                c0om1.LJ(c1251150ifB);
                C1251150ifB c1251150ifB2 = new C1251150ifB();
                c1251150ifB2.LIZLLL();
                c1251150ifB2.LIZJ = R.raw.icon_x_mark;
                c1251150ifB2.LIZIZ = "close";
                c1251150ifB2.LIZJ(new AwS573S0100000_29(this, 473));
                c0om1.LJ(c1251150ifB2);
                C1251150ifB c1251150ifB3 = new C1251150ifB();
                c1251150ifB3.LIZLLL();
                c1251150ifB3.LIZJ = R.raw.icon_ellipsis_vertical;
                c1251150ifB3.LIZIZ = "more";
                c1251150ifB3.LIZJ(new AwS573S0100000_29(this, 474));
                c0om1.LIZIZ(c1251150ifB3);
                c0om1.LIZJ = new C1250250idj();
                tuxNavBar.setNavActions(c0om1);
            }
            if (u.LJIJI(LJII(uriBuild, "hide_nav_bar"), "1", true)) {
                TuxNavBar tuxNavBar2 = this.LLILZIL;
                if (tuxNavBar2 != null) {
                    C786410Ut5.LLLLZLLLI(tuxNavBar2, 8);
                    return;
                }
                return;
            }
            TuxNavBar tuxNavBar3 = this.LLILZIL;
            if (tuxNavBar3 != null) {
                C786410Ut5.LLLLZLLLI(tuxNavBar3, 0);
            }
            LJIIJ("close", true);
            LJIIJ("back", true);
            LJIIJ("more", ((C11WM) this.LLILLJJLI).LIZ);
        }
    }

    public final String LJIIIZ(String str) {
        boolean z;
        String host;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z || (host = UriProtector.parse(str).getHost()) == null) {
            return "";
        }
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(host, new String[]{e3.d}, 0, 6);
        if (listLJJLIIIJILLIZJL.size() > 2) {
            return C13LP.LJJLIIIJ(C13LP.LLD(2, listLJJLIIIJILLIZJL), e3.d, null, null, 0, null, null, 62);
        }
        return host;
    }

    @Override // com.ss.android.ugc.aweme.spark.common.ThirdPartyCustomUIContext, com.ss.android.ugc.aweme.spark.common.BaseThirdPartyContext, androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        String strLJIIIIZZ;
        Intent intent;
        super.onCreate(lifecycleOwner);
        String str = ((C11WM) this.LLILLJJLI).LJII;
        if (str == null || str.length() == 0) {
            T t = this.LLILLJJLI;
            C11WM c11wm = (C11WM) t;
            AnchorListManager anchorListManager = AnchorListManager.LIZ;
            C11WM c11wm2 = (C11WM) t;
            int i = c11wm2.LJ;
            String str2 = c11wm2.LJFF;
            anchorListManager.getClass();
            AnchorPublishStruct anchorPublishStructLJFF = AnchorListManager.LJFF(i, str2);
            if (anchorPublishStructLJFF == null || (strLJIIIIZZ = AnchorListManager.LJIIIIZZ(anchorPublishStructLJFF)) == null) {
                strLJIIIIZZ = "";
            }
            c11wm.LJII = strLJIIIIZZ;
        }
        C19EG c19eg = this.LLILLL;
        if (c19eg != null && (intent = c19eg.getIntent()) != null) {
            intent.putExtra("sec_link_scene", "anchors");
        }
        ((C11WM) this.LLILLJJLI).LJIIJJI = true;
    }

    public final String LJII(Uri uri, String str) {
        try {
            return UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public final void LJIIJ(Object obj, boolean z) {
        TuxNavBar tuxNavBar = this.LLILZIL;
        if (tuxNavBar != null) {
            tuxNavBar.LJJ(new AwS41S0010000_29(z, 31), obj);
        }
    }
}
