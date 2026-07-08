package com.ss.android.ugc.aweme.commercialize.hybrid.impl;

import X.C01GW;
import X.C0TVI;
import X.C1009540cNU;
import X.C1016930cZP;
import X.C1022620cia;
import X.C1025720cna;
import X.C1026310coX;
import X.C1026350cob;
import X.C1029630ctt;
import X.C1029640ctu;
import X.C1036130d4N;
import X.C1036290d4d;
import X.C1036360d4k;
import X.C1037280d6E;
import X.C1041990dDp;
import X.C1054430dXt;
import X.C1388190mED;
import X.C1391190mJ3;
import X.C13LE;
import X.C1440005kM;
import X.C14EU;
import X.C14K9;
import X.C1537710q7N;
import X.C1548820qPI;
import X.C1602160rnK;
import X.C1757130vpH;
import X.C1954807lC;
import X.C19EG;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2522109uV;
import X.C343980De8;
import X.C397901gf;
import X.C427660Gpo;
import X.C452501pT;
import X.C486860J7k;
import X.C602130NjX;
import X.C786410Ut5;
import X.C905703gN;
import X.EnumC1030360cv4;
import X.EnumC1036120d4M;
import X.EnumC1036160d4Q;
import X.EnumC1036640d5C;
import X.InterfaceC1020550cfF;
import X.InterfaceC1034470d1h;
import X.InterfaceC1035540d3Q;
import X.InterfaceC1036150d4P;
import X.InterfaceC1036270d4b;
import X.InterfaceC1036280d4c;
import X.InterfaceC1036310d4f;
import X.InterfaceC1036350d4j;
import X.InterfaceC1036590d57;
import X.InterfaceC1039570d9v;
import X.InterfaceC1056670dbV;
import X.InterfaceC1058150ddt;
import X.InterfaceC1318670kQ5;
import X.InterfaceC1541990qEH;
import X.InterfaceC1892990zMP;
import X.InterfaceC2217461Bqa;
import X.InterfaceC602100NjU;
import X.InterfaceC603260NlM;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.ARunnableS116S0100000_16;
import Y.ARunnableS85S0200000_16;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.api.component.videoshrink.CommerceLandingPageVideoShrinkComponent;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.AdlpExtraModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService;
import com.ss.android.ugc.aweme.web.service.IAdWebUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS134S0110000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes17.dex */
public final class AdSparkHybridFragment extends SparkFragment implements InterfaceC1034470d1h, InterfaceC1058150ddt, DialogInterface.OnDismissListener, InterfaceC1036590d57 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2OiYlKCM6HELIOSMiBiITYxOiwoZyY+OCliCCsAOCQ+IgcqKjclLQkhKSIhLCEn";
    public final boolean LLJZ;
    public SparkContext LLJZIJLIL;
    public InterfaceC1056670dbV LLL;
    public InterfaceC1036150d4P LLLF;
    public View LLLFF;
    public View LLLFFI;
    public C1036360d4k LLLFZ;
    public C1026310coX LLLI;
    public C1029630ctt LLLII;
    public TuxNavBar LLLIIII;
    public C1029640ctu LLLIIIIL;
    public FrameLayout LLLIIIL;
    public FrameLayout LLLIIL;
    public EnumC1036120d4M LLLIILIL;
    public boolean LLLIL;
    public C1537710q7N LLLILZ;
    public WebView LLLILZJ;
    public boolean LLLILZLLLI;
    public String LLLIZZ;
    public Runnable LLLJ;
    public InterfaceC1036270d4b LLLJIL;
    public final C01GW LLLJL;
    public final C01GW LLLL;
    public final C01GW LLLLII;
    public InterfaceC1036280d4c LLLLIIIILLL;
    public InterfaceC1036350d4j LLLLIIL;
    public final C1036290d4d LLLLIILL;
    public volatile C1054430dXt LLLLIILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AdSparkHybridFragment.class, "shopifyService", "getShopifyService()Lcom/ss/android/ugc/aweme/business/shopify/ICommerceShopifyService;", 0);
        C13LE.LIZ.getClass();
        LLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AdSparkHybridFragment() {
        this(false);
    }

    @Override // X.InterfaceC1034470d1h
    public final void Oo(CommerceLandingPageVideoShrinkComponent commerceLandingPageVideoShrinkComponent) {
    }

    @Override // X.InterfaceC1034470d1h
    public final <T> T Sj(Class<T> cls) {
        return null;
    }

    @Override // X.InterfaceC1034470d1h
    public final C1757130vpH U8() {
        return null;
    }

    @Override // X.InterfaceC1034470d1h
    public final void WM() {
        this.LLLILZLLLI = true;
    }

    @Override // X.InterfaceC1034470d1h
    public final void XM(InterfaceC1039570d9v interfaceC1039570d9v) {
    }

    @Override // X.InterfaceC1034470d1h
    public final void Yc() {
    }

    @Override // X.InterfaceC1034470d1h
    public final void Zn(String str, float f, C1036130d4N c1036130d4N) {
    }

    @Override // X.InterfaceC1034470d1h
    public final String aH() {
        return null;
    }

    @Override // X.InterfaceC1034470d1h
    /* JADX INFO: renamed from: do */
    public final void mo47do() {
    }

    @Override // X.InterfaceC1034470d1h
    public final Fragment getFragment() {
        return this;
    }

    @Override // X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        return false;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
    }

    @Override // X.InterfaceC1034470d1h
    public final void pd() {
    }

    @Override // X.InterfaceC1034470d1h
    public final void tx(AwS134S0110000_16 awS134S0110000_16) {
    }

    public final SparkContext LLIILZL() {
        SparkContext sparkContextLIZ = this.LLJZIJLIL;
        if (sparkContextLIZ == null) {
            C905703gN.LIZ.getClass();
            C1041990dDp c1041990dDp = C1041990dDp.LIZ;
            Bundle arguments = getArguments();
            String string = arguments != null ? arguments.getString("SparkContextContainerId") : null;
            c1041990dDp.getClass();
            sparkContextLIZ = C1041990dDp.LIZ(string);
        }
        this.LLJZIJLIL = sparkContextLIZ;
        return sparkContextLIZ;
    }

    public final IAdLandingPagePopUpService aS() {
        return (IAdLandingPagePopUpService) this.LLLL.getValue();
    }

    public final InterfaceC1036150d4P bS() {
        InterfaceC1036150d4P interfaceC1036150d4P = this.LLLF;
        if (interfaceC1036150d4P == null) {
            SparkContext sparkContextLLIILZL = LLIILZL();
            if (sparkContextLLIILZL == null || (interfaceC1036150d4P = (InterfaceC1036150d4P) sparkContextLLIILZL.LJFF(InterfaceC1036150d4P.class)) == null) {
                interfaceC1036150d4P = null;
            } else {
                interfaceC1036150d4P.LLLILZJ();
            }
        }
        this.LLLF = interfaceC1036150d4P;
        return interfaceC1036150d4P;
    }

    public final InterfaceC1056670dbV cS() {
        InterfaceC1036150d4P interfaceC1036150d4P;
        InterfaceC1056670dbV interfaceC1056670dbV = this.LLL;
        if (interfaceC1056670dbV == null) {
            SparkContext sparkContextLLIILZL = LLIILZL();
            interfaceC1056670dbV = sparkContextLLIILZL != null ? (InterfaceC1056670dbV) sparkContextLLIILZL.LJFF(InterfaceC1056670dbV.class) : null;
            if ((interfaceC1056670dbV instanceof InterfaceC1036150d4P) && (interfaceC1036150d4P = (InterfaceC1036150d4P) interfaceC1056670dbV) != null) {
                interfaceC1036150d4P.LLLILZJ();
            }
        }
        this.LLL = interfaceC1056670dbV;
        return interfaceC1056670dbV;
    }

    public final InterfaceC1035540d3Q dS() {
        C1054430dXt c1054430dXt = this.LLLLIILLL;
        if (c1054430dXt == null) {
            synchronized (this) {
                c1054430dXt = this.LLLLIILLL;
                if (c1054430dXt == null) {
                    C1054430dXt c1054430dXt2 = new C1054430dXt();
                    this.LLLLIILLL = c1054430dXt2;
                    return c1054430dXt2;
                }
            }
        }
        return c1054430dXt;
    }

    @Override // X.InterfaceC1034470d1h
    public final String getContainerID() {
        SparkContext sparkContext = this.LLJZIJLIL;
        if (sparkContext != null) {
            return sparkContext.containerId;
        }
        return null;
    }

    @Override // X.InterfaceC1034470d1h
    public final void LJJJLZIJ() {
        InterfaceC1036150d4P interfaceC1036150d4PBS = bS();
        if (interfaceC1036150d4PBS != null) {
            interfaceC1036150d4PBS.LJJJLZIJ();
        }
    }

    @Override // X.InterfaceC1034470d1h
    public final boolean SQ() {
        InterfaceC1036150d4P interfaceC1036150d4PBS = bS();
        if (interfaceC1036150d4PBS != null) {
            return interfaceC1036150d4PBS.onBackPress();
        }
        return false;
    }

    @Override // com.bytedance.hybrid.spark.page.SparkFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC1036150d4P interfaceC1036150d4PBS = bS();
        if (interfaceC1036150d4PBS != null) {
            interfaceC1036150d4PBS.LLLILZ();
        }
        EventBus.LIZLLL().LJJI(this);
        InterfaceC1036280d4c interfaceC1036280d4c = this.LLLLIIIILLL;
        if (interfaceC1036280d4c != null) {
            interfaceC1036280d4c.onDestroy();
        }
        InterfaceC1036270d4b interfaceC1036270d4b = this.LLLJIL;
        if (interfaceC1036270d4b != null) {
            boolean z = getParentFragment() instanceof TuxSheet;
            interfaceC1036270d4b.Pu(this);
        }
    }

    @Override // com.bytedance.hybrid.spark.page.SparkFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        InterfaceC1036150d4P interfaceC1036150d4P = this.LLLF;
        if (interfaceC1036150d4P != null) {
            interfaceC1036150d4P.onPause();
        }
        InterfaceC1036270d4b interfaceC1036270d4b = this.LLLJIL;
        if (interfaceC1036270d4b != null) {
            boolean z = getParentFragment() instanceof TuxSheet;
            interfaceC1036270d4b.Yc();
        }
    }

    @Override // com.bytedance.hybrid.spark.page.SparkFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC1036150d4P interfaceC1036150d4P = this.LLLF;
        if (interfaceC1036150d4P != null) {
            interfaceC1036150d4P.onResume();
        }
        InterfaceC1036270d4b interfaceC1036270d4b = this.LLLJIL;
        if (interfaceC1036270d4b != null) {
            boolean z = getParentFragment() instanceof TuxSheet;
            interfaceC1036270d4b.Rg(this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0d4d] */
    public AdSparkHybridFragment(boolean z) {
        this.LLJZ = z;
        this.LLLIILIL = EnumC1036120d4M.DEFAULT;
        this.LLLJL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 171));
        this.LLLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(133));
        this.LLLLII = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(134));
        this.LLLLIILL = new InterfaceC1318670kQ5() { // from class: X.0d4d
            @Override // X.InterfaceC1318670kQ5
            public final void LIZ(int i) {
            }

            @Override // X.InterfaceC1318670kQ5
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1318670kQ5
            public final void LJIJJLI() {
            }

            @Override // X.InterfaceC1318670kQ5
            public final void LJIJJ() {
                C1037280d6E c1037280d6E;
                C1029640ctu c1029640ctu = this.LIZ.LLLIIIIL;
                if (c1029640ctu == null || (c1037280d6E = c1029640ctu.LLJIJIL) == null) {
                    return;
                }
                c1037280d6E.LJFF(null);
            }

            @Override // X.InterfaceC1318670kQ5
            public final void onScrollChanged(int i, int i2, int i3, int i4) {
                C1037280d6E c1037280d6E;
                C1029640ctu c1029640ctu = this.LIZ.LLLIIIIL;
                if (c1029640ctu != null && (c1037280d6E = c1029640ctu.LLJIJIL) != null) {
                    c1037280d6E.LJ(i2, i4);
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1318590kPx ZR(android.view.View r6) {
        /*
            r5 = 0
            if (r6 != 0) goto L4
            return r5
        L4:
            boolean r0 = r6 instanceof X.C1318590kPx
            if (r0 == 0) goto L12
            r1 = r6
            X.0kPx r1 = (X.C1318590kPx) r1
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L12
            return r1
        L12:
            boolean r4 = r6 instanceof android.view.ViewGroup
            if (r4 == 0) goto L41
            r0 = r6
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L41
            int r3 = r0.getChildCount()
            if (r3 <= 0) goto L41
            r2 = 0
        L22:
            if (r4 == 0) goto L3f
            r0 = r6
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L3f
            android.view.View r0 = r0.getChildAt(r2)
        L2d:
            X.0kPx r1 = ZR(r0)
            if (r1 == 0) goto L3a
            int r0 = r6.getVisibility()
            if (r0 != 0) goto L3a
            return r1
        L3a:
            int r2 = r2 + 1
            if (r2 >= r3) goto L41
            goto L22
        L3f:
            r0 = r5
            goto L2d
        L41:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdSparkHybridFragment.ZR(android.view.View):X.0kPx");
    }

    @Override // X.InterfaceC1034470d1h
    public final void LJJ(String str) {
        SparkContext sparkContext;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILLL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext()) != null) {
            sparkContext.LJJLIIJ(str);
            if (!C2522109uV.LIZ) {
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIJ(sparkContext);
            }
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIIIIZZ();
        }
    }

    @Override // X.InterfaceC1034470d1h
    public final void LLJI(Runnable runnable) {
        InterfaceC1036150d4P interfaceC1036150d4PBS = bS();
        if (interfaceC1036150d4PBS != null) {
            interfaceC1036150d4PBS.LLJI(runnable);
        }
    }

    @Override // X.InterfaceC1034470d1h
    public final void LLLIL(String str) {
        TuxSheet tuxSheet;
        EnumC1036160d4Q enumC1036160d4Q;
        String str2;
        InterfaceC1541990qEH kitView;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILLL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
            kitView.onHide();
        }
        InterfaceC1036150d4P interfaceC1036150d4PBS = bS();
        String str3 = null;
        if (interfaceC1036150d4PBS != null) {
            C1036360d4k c1036360d4k = this.LLLFZ;
            if (c1036360d4k != null) {
                enumC1036160d4Q = c1036360d4k.LJFF;
            } else {
                enumC1036160d4Q = null;
            }
            if (enumC1036160d4Q == EnumC1036160d4Q.FROM_SPLIT_SCREEN) {
                str2 = this.LLLIZZ;
            } else {
                str2 = str;
            }
            interfaceC1036150d4PBS.LLLIL(str2);
        }
        InterfaceC1036270d4b interfaceC1036270d4b = this.LLLJIL;
        if (interfaceC1036270d4b != null) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment instanceof TuxSheet) {
                tuxSheet = (TuxSheet) parentFragment;
            } else {
                tuxSheet = null;
            }
            C1029630ctt c1029630ctt = this.LLLII;
            if (c1029630ctt != null) {
                str3 = c1029630ctt.LIZJ;
            }
            interfaceC1036270d4b.ha(tuxSheet, this, str, str3);
        }
        C1440005kM.LIZ(new C1009540cNU(false));
    }

    @Override // X.InterfaceC1034470d1h
    public final void LM(ARunnableS85S0200000_16 aRunnableS85S0200000_16) {
        this.LLLJ = aRunnableS85S0200000_16;
    }

    @Override // X.InterfaceC1036590d57
    public final void Pt(String str) {
        InterfaceC1036150d4P interfaceC1036150d4PBS;
        int iHashCode = str.hashCode();
        TuxSheet tuxSheet = null;
        if (iHashCode != -1577550664) {
            if (iHashCode != 1452188919) {
                if (iHashCode == 1452530533 && str.equals("navBarMore")) {
                    if (this.LLLILZJ != null) {
                        C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), null, "report"));
                    } else {
                        C1537710q7N c1537710q7N = this.LLLILZ;
                        if (c1537710q7N != null) {
                            c1537710q7N.LIZ("report", null);
                        }
                    }
                    IAdLandingPagePopUpService iAdLandingPagePopUpServiceAS = aS();
                    if (iAdLandingPagePopUpServiceAS != null) {
                        iAdLandingPagePopUpServiceAS.LJFF(true);
                    }
                    C786410Ut5.LJLIIL(1000L, (Handler) this.LLLLII.getValue(), new ARunnableS116S0100000_16(this, 35));
                    return;
                }
                return;
            }
            if (!str.equals("navBarBack")) {
                return;
            }
            if (this.LLLILZJ != null) {
                C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), null, "goBack"));
            } else {
                C1537710q7N c1537710q7N2 = this.LLLILZ;
                if (c1537710q7N2 != null) {
                    c1537710q7N2.LIZ("goBack", null);
                    if (this.LLLILZLLLI && (interfaceC1036150d4PBS = bS()) != null) {
                        interfaceC1036150d4PBS.onBackPress();
                    }
                }
            }
            this.LLLIZZ = "button";
            InterfaceC1036270d4b interfaceC1036270d4b = this.LLLJIL;
            if (interfaceC1036270d4b == null) {
                return;
            }
            Fragment parentFragment = getParentFragment();
            if (parentFragment instanceof TuxSheet) {
                tuxSheet = (TuxSheet) parentFragment;
            }
            interfaceC1036270d4b.ni(tuxSheet, this);
            return;
        }
        if (!str.equals("navBarShoppingCart")) {
            return;
        }
        if (this.LLLILZJ != null) {
            C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), null, "openShoppingCart"));
            return;
        }
        C1537710q7N c1537710q7N3 = this.LLLILZ;
        if (c1537710q7N3 == null) {
            return;
        }
        c1537710q7N3.LIZ("openShoppingCart", null);
    }

    @Override // X.InterfaceC1034470d1h
    public final void ge(EnumC1036640d5C enumC1036640d5C) {
        C1029630ctt c1029630ctt;
        TuxSheet tuxSheet;
        InterfaceC1541990qEH kitView;
        String refer;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        AdlpExtraModel adlpExtraModel;
        C1029630ctt c1029630ctt2;
        ((IAdWebUtils) ServiceManager.get().getService(IAdWebUtils.class)).Yu();
        SparkContext sparkContextLLIILZL = LLIILZL();
        String str = null;
        if (sparkContextLLIILZL != null) {
            c1029630ctt = (C1029630ctt) sparkContextLLIILZL.LJFF(C1029630ctt.class);
        } else {
            c1029630ctt = null;
        }
        if (c1029630ctt != null && c1029630ctt.LIZIZ) {
            if (C1026350cob.LIZJ(c1029630ctt.LIZJ)) {
                C1029640ctu c1029640ctu = this.LLLIIIIL;
                if (c1029640ctu != null) {
                    int visibility = c1029640ctu.getVisibility();
                    c1029640ctu.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility, 0, c1029640ctu);
                }
                C1029640ctu c1029640ctu2 = this.LLLIIIIL;
                if (c1029640ctu2 != null) {
                    SparkContext sparkContextLLIILZL2 = LLIILZL();
                    C1016930cZP c1016930cZP = c1029630ctt.LIZLLL;
                    Runnable runnable = this.LLLJ;
                    if (sparkContextLLIILZL2 != null) {
                        c1029630ctt2 = (C1029630ctt) sparkContextLLIILZL2.LJFF(C1029630ctt.class);
                    } else {
                        c1029630ctt2 = null;
                    }
                    c1029640ctu2.LLJILJIL = c1029630ctt2;
                    c1029640ctu2.setAdLpBottomModel(c1016930cZP);
                    c1029640ctu2.setEnterProfilePageListener(runnable);
                    c1029640ctu2.setAvatarView((C427660Gpo) c1029640ctu2.findViewById(R.id.bkz));
                    c1029640ctu2.setNickName((TuxTextView) c1029640ctu2.findViewById(R.id.p94));
                    c1029640ctu2.setBaLabel((TuxIconView) c1029640ctu2.findViewById(R.id.bmo));
                    c1029640ctu2.setNavigationBarShow(true);
                    c1029640ctu2.LJIILLIIL(c1016930cZP, runnable);
                    c1029640ctu2.getView();
                    c1029640ctu2.LLJIJIL = new C1037280d6E(c1029640ctu2, false, c1029640ctu2.LL, c1029640ctu2.LLILLJJLI, null, new AwS595S0100000_16(c1029640ctu2, 394), new AwS560S0100000_16(c1029640ctu2, 937), 48);
                }
            } else {
                C1029640ctu c1029640ctu3 = this.LLLIIIIL;
                if (c1029640ctu3 != null) {
                    int visibility2 = c1029640ctu3.getVisibility();
                    c1029640ctu3.setVisibility(8);
                    C1602160rnK.LIZIZ(visibility2, 8, c1029640ctu3);
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("context is ");
        sbLIZ.append(getContext());
        sbLIZ.append(", lynxModel is ");
        sbLIZ.append(this.LLLII);
        C1022620cia.LIZ("AdSparkHybridFragment", C2188811AlT.LIZIZ(sbLIZ));
        Context context = getContext();
        if (context != null) {
            C1026310coX c1026310coX = this.LLLI;
            if (c1026310coX != null && (adlpExtraModel = c1026310coX.getAdlpExtraModel()) != null) {
                refer = adlpExtraModel.getRefer();
            } else {
                refer = null;
            }
            if (this.LLLLIILLL == null) {
                synchronized (this) {
                    if (this.LLLLIILLL == null) {
                        this.LLLLIILLL = new C1054430dXt();
                    }
                }
            }
            C1026310coX c1026310coX2 = this.LLLI;
            if (c1026310coX2 != null) {
                awemeRawAd = c1026310coX2.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            if (C1054430dXt.LIZ(awemeRawAd, refer)) {
                InterfaceC1035540d3Q interfaceC1035540d3QDS = dS();
                C1026310coX c1026310coX3 = this.LLLI;
                if (c1026310coX3 != null) {
                    awemeRawAd2 = c1026310coX3.getAwemeRawAd();
                } else {
                    awemeRawAd2 = null;
                }
                ((C1054430dXt) interfaceC1035540d3QDS).LIZJ(context, awemeRawAd2);
            }
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLILLL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
            kitView.onShow();
        }
        InterfaceC1036150d4P interfaceC1036150d4PBS = bS();
        if (interfaceC1036150d4PBS != null) {
            interfaceC1036150d4PBS.onShow();
        }
        InterfaceC1036270d4b interfaceC1036270d4b = this.LLLJIL;
        if (interfaceC1036270d4b != null) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment instanceof TuxSheet) {
                tuxSheet = (TuxSheet) parentFragment;
            } else {
                tuxSheet = null;
            }
            C1029630ctt c1029630ctt3 = this.LLLII;
            if (c1029630ctt3 != null) {
                str = c1029630ctt3.LIZJ;
            }
            interfaceC1036270d4b.s8(tuxSheet, this, str);
        }
        C1440005kM.LIZ(new C1009540cNU(true));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        InterfaceC1892990zMP interfaceC1892990zMP;
        Context context;
        View viewLJFF;
        SparkContext sparkContextLLIILZL = LLIILZL();
        if (sparkContextLLIILZL == null || (interfaceC1892990zMP = (InterfaceC1892990zMP) sparkContextLLIILZL.LJFF(InterfaceC1892990zMP.class)) == null) {
            InterfaceC1056670dbV interfaceC1056670dbVCS = cS();
            if (interfaceC1056670dbVCS instanceof InterfaceC1892990zMP) {
                interfaceC1892990zMP = (InterfaceC1892990zMP) interfaceC1056670dbVCS;
            } else {
                interfaceC1892990zMP = null;
            }
        }
        InterfaceC1056670dbV interfaceC1056670dbVCS2 = cS();
        if (interfaceC1056670dbVCS2 != null && (context = getContext()) != null) {
            interfaceC1056670dbVCS2.LJIILJJIL(context);
            interfaceC1056670dbVCS2.LJJIJ();
            ViewGroup viewGroupLJIJJ = interfaceC1056670dbVCS2.LJIJJ();
            if (interfaceC1892990zMP != null && (viewLJFF = interfaceC1892990zMP.LJFF(context)) != null) {
                C786410Ut5.LJJJJI(viewGroupLJIJJ);
                ViewParent parent = viewLJFF.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    C786410Ut5.LJJJLZIJ(viewLJFF, (ViewGroup) parent);
                }
                viewGroupLJIJJ.addView(viewLJFF);
            }
        }
        super.onCreate(bundle);
        EventBus.LIZLLL().LJIJJ(this);
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
    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C602130NjX c602130NjX) {
        Context context;
        C19EG c19egLIZIZ;
        IAdLandingPagePopUpService iAdLandingPagePopUpServiceAS;
        C19EG c19egLIZIZ2;
        IAdLandingPagePopUpService iAdLandingPagePopUpServiceAS2;
        TuxSheet tuxSheet;
        Number count;
        Context context2;
        C19EG c19egLIZIZ3;
        Object obj = c602130NjX.LIZ;
        int iIntValue = 0;
        z = false;
        boolean z = false;
        iIntValue = 0;
        EnumC1036160d4Q enumC1036160d4Q = null;
        Number type = null;
        EnumC1036160d4Q enumC1036160d4Q2 = null;
        AwemeRawAd awemeRawAd = null;
        if (obj instanceof InterfaceC602100NjU) {
            InterfaceC602100NjU interfaceC602100NjU = (InterfaceC602100NjU) obj;
            if (interfaceC602100NjU != null) {
                type = interfaceC602100NjU.getType();
            }
            boolean zLJFF = Intrinsics.LJFF(type, 0);
            int i = R.raw.icon_chevron_left_offset_ltr;
            if (zLJFF) {
                InterfaceC1036280d4c interfaceC1036280d4c = this.LLLLIIIILLL;
                if (interfaceC1036280d4c != null) {
                    interfaceC1036280d4c.LIZLLL(R.raw.icon_chevron_left_offset_ltr);
                    return;
                }
                return;
            }
            if (Intrinsics.LJFF(type, 1)) {
                InterfaceC1036280d4c interfaceC1036280d4c2 = this.LLLLIIIILLL;
                if (interfaceC1036280d4c2 == null) {
                    return;
                }
                boolean zIsFullScreen = this.LLLIILIL.isFullScreen();
                if (!zIsFullScreen) {
                    if (!zIsFullScreen) {
                        i = R.raw.icon_x_mark;
                    } else {
                        throw new C1954807lC();
                    }
                }
                interfaceC1036280d4c2.LIZLLL(i);
                return;
            }
            InterfaceC1036280d4c interfaceC1036280d4c3 = this.LLLLIIIILLL;
            if (interfaceC1036280d4c3 == null) {
                return;
            }
            interfaceC1036280d4c3.LIZLLL(R.raw.icon_chevron_left_offset_ltr);
            return;
        }
        if (obj instanceof InterfaceC1020550cfF) {
            InterfaceC1020550cfF interfaceC1020550cfF = (InterfaceC1020550cfF) obj;
            if (interfaceC1020550cfF != null && interfaceC1020550cfF.getEnableFollowSlide()) {
                z = true;
            }
            this.LLLIL = z;
            C1036360d4k c1036360d4k = this.LLLFZ;
            if (c1036360d4k != null) {
                enumC1036160d4Q2 = c1036360d4k.LJFF;
            }
            if (enumC1036160d4Q2 != EnumC1036160d4Q.FROM_SCROLL_VIEW_PAGER || (context2 = getContext()) == null || (c19egLIZIZ3 = C1388190mED.LIZIZ(context2)) == null) {
                return;
            }
            C486860J7k.LIZIZ(c19egLIZIZ3).KQ2(this.LLLIL);
            return;
        }
        if (obj instanceof InterfaceC603260NlM) {
            InterfaceC1036280d4c interfaceC1036280d4c4 = this.LLLLIIIILLL;
            if (interfaceC1036280d4c4 == null) {
                return;
            }
            InterfaceC603260NlM interfaceC603260NlM = (InterfaceC603260NlM) obj;
            if (interfaceC603260NlM != null && (count = interfaceC603260NlM.getCount()) != null) {
                iIntValue = count.intValue();
            }
            interfaceC1036280d4c4.LIZJ(iIntValue);
            return;
        }
        if (TextUtils.equals(obj.toString(), "closeTuxSheet")) {
            InterfaceC1036270d4b interfaceC1036270d4b = this.LLLJIL;
            if (interfaceC1036270d4b != null) {
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof TuxSheet) {
                    tuxSheet = (TuxSheet) parentFragment;
                } else {
                    tuxSheet = null;
                }
                interfaceC1036270d4b.ni(tuxSheet, this);
            }
            Context context3 = getContext();
            if (context3 == null || (c19egLIZIZ2 = C1388190mED.LIZIZ(context3)) == null || (iAdLandingPagePopUpServiceAS2 = aS()) == null) {
                return;
            }
            C1026310coX c1026310coX = this.LLLI;
            if (c1026310coX != null) {
                awemeRawAd = c1026310coX.getAwemeRawAd();
            }
            iAdLandingPagePopUpServiceAS2.LJJ(c19egLIZIZ2, awemeRawAd, C343980De8.LIZ, true, null);
            return;
        }
        if (!TextUtils.equals(c602130NjX.LIZ.toString(), "closeFullScreen") || (context = getContext()) == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null || (iAdLandingPagePopUpServiceAS = aS()) == null) {
            return;
        }
        C1026310coX c1026310coX2 = this.LLLI;
        C1036360d4k c1036360d4k2 = this.LLLFZ;
        if (c1036360d4k2 != null) {
            enumC1036160d4Q = c1036360d4k2.LJFF;
        }
        iAdLandingPagePopUpServiceAS.LJIJJLI(c19egLIZIZ, c1026310coX2, enumC1036160d4Q, EnumC1030360cv4.CLICK_BACK);
    }

    @Override // X.InterfaceC1034470d1h
    public final void r(InterfaceC1036270d4b interfaceC1036270d4b) {
        this.LLLJIL = interfaceC1036270d4b;
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
        InterfaceC1036310d4f interfaceC1036310d4f;
        if (this.LLLIILIL == EnumC1036120d4M.SPLIT_SCREEN_NON_IMMERSION && (interfaceC1036310d4f = (InterfaceC1036310d4f) this.LLLJL.getValue()) != null) {
            interfaceC1036310d4f.LIZ(f);
        }
        InterfaceC1036350d4j interfaceC1036350d4j = this.LLLLIIL;
        if (interfaceC1036350d4j != null) {
            interfaceC1036350d4j.LIZIZ(f);
        }
        InterfaceC1036280d4c interfaceC1036280d4c = this.LLLLIIIILLL;
        if (interfaceC1036280d4c != null) {
            interfaceC1036280d4c.LIZIZ(f);
        }
        InterfaceC1036270d4b interfaceC1036270d4b = this.LLLJIL;
        if (interfaceC1036270d4b != null) {
            interfaceC1036270d4b.LLLFFI(tuxSheet, f);
        }
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
        C1025720cna tuxSheetConfig;
        C1025720cna tuxSheetConfig2;
        InterfaceC1036310d4f interfaceC1036310d4f;
        InterfaceC1036270d4b interfaceC1036270d4b = this.LLLJIL;
        if (interfaceC1036270d4b != null) {
            interfaceC1036270d4b.LLLLIIIILLL(tuxSheet, i);
        }
        if (this.LLLIILIL == EnumC1036120d4M.SPLIT_SCREEN_NON_IMMERSION && (interfaceC1036310d4f = (InterfaceC1036310d4f) this.LLLJL.getValue()) != null) {
            interfaceC1036310d4f.LIZIZ(tuxSheet, i);
        }
        InterfaceC1036350d4j interfaceC1036350d4j = this.LLLLIIL;
        if (interfaceC1036350d4j != null) {
            interfaceC1036350d4j.LIZ();
        }
        InterfaceC1036280d4c interfaceC1036280d4c = this.LLLLIIIILLL;
        if (interfaceC1036280d4c != null) {
            interfaceC1036280d4c.LIZ();
        }
        C1026310coX c1026310coX = this.LLLI;
        int i2 = 0;
        if (c1026310coX != null && (tuxSheetConfig = c1026310coX.getTuxSheetConfig()) != null && tuxSheetConfig.variant == 2) {
            String str = TuxSheet._pnsPageId;
            C1026310coX c1026310coX2 = this.LLLI;
            if (c1026310coX2 != null && (tuxSheetConfig2 = c1026310coX2.getTuxSheetConfig()) != null) {
                i2 = tuxSheetConfig2.dynamicHeight;
            }
            C1391190mJ3.LJIILL(i2, this);
        }
    }

    @Override // X.InterfaceC1034470d1h
    public final void XN(C1036130d4N c1036130d4N, boolean z) {
        C1029630ctt c1029630ctt;
        SparkContext sparkContextLLIILZL = LLIILZL();
        if (sparkContextLLIILZL != null && (c1029630ctt = (C1029630ctt) sparkContextLLIILZL.LJFF(C1029630ctt.class)) != null) {
            c1029630ctt.LIZJ = c1036130d4N.LJ;
            c1029630ctt.LIZLLL = c1036130d4N.LJI;
        }
    }

    @Override // com.bytedance.hybrid.spark.page.SparkFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        final View view2;
        if (Build.VERSION.SDK_INT >= 35 && (view2 = getView()) != null) {
            C14K9.LJIJJ(view2, new C0TVI() { // from class: X.0R03
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view3, C20246014Ju c20246014Ju) {
                    C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(WindowInsets.Type.navigationBars());
                    View view4 = view2;
                    view4.setPadding(view4.getPaddingLeft(), view4.getPaddingTop(), view4.getPaddingRight(), c20244914JjLIZ.LIZLLL);
                    return c20246014Ju;
                }
            });
        }
        if (this.LLJZ) {
            return;
        }
        super.onViewCreated(view, bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0138  */
    @Override // com.bytedance.hybrid.spark.page.SparkFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r9, android.view.ViewGroup r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instruction units count: 709
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdSparkHybridFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
