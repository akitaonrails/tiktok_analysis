package com.ss.android.ugc.aweme.ecommerce.anchor.fragment;

import X.AbstractActivityC1743740vTg;
import X.AbstractC1056160dag;
import X.AnonymousClass0317;
import X.C034S;
import X.C036A;
import X.C0H9I;
import X.C0NOH;
import X.C1018703yb;
import X.C1120604Zw;
import X.C12ES;
import X.C1308910kAL;
import X.C13LP;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C1748770vbn;
import X.C1748780vbo;
import X.C1766860w4y;
import X.C18LA;
import X.C18MX;
import X.C18O0;
import X.C1AQS;
import X.C21270618Lw;
import X.C21271218Mc;
import X.C21271918Mj;
import X.C21272518Mp;
import X.C299020Bno;
import X.C335910DEv;
import X.C786410Ut5;
import X.C7937038d;
import X.C973303rH;
import X.EnumC1740810vOx;
import X.EnumC335920DEw;
import X.InterfaceC1164530gPT;
import X.InterfaceC1740760vOs;
import X.InterfaceC1752700vi8;
import Y.ARunnableS132S0100000_32;
import Y.ARunnableS36S1100000_32;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.EcCommentAnchorPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.dependency.ad.AdDependencyService;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.AwemePruningModel;
import com.ss.android.ugc.aweme.ecommerce.model.GetItemProductInfoResponseData;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.CartEntryOptions;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.GetCartEntryRequest;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitInfo;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartEntryFrom;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import g1c.AjS4S1200000_32;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class EcCommentAnchorPanelActivity extends AbstractActivityC1743740vTg implements InterfaceC1164530gPT, InterfaceC1740760vOs {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGEyJiYkJjHELIOS19LjctLiI2JjFiDCwQJyghLCEnCSsvISAhGCQiLCMSKzElPyYnMQ==";
    public FrameLayout LLILZIL;
    public TuxAlertBadgeLayout LLILZLL;
    public TuxIconView LLIZ;
    public RecyclerView LLIZLLLIL;
    public ConstraintLayout LLJ;
    public TuxIconView LLJI;
    public C7937038d LLJIJIL;
    public ConstraintLayout LLJILJIL;
    public TuxTextView LLJILJILJ;
    public EcCommentAnchorPanelViewModel LLJJ;
    public C18O0 LLJJI;
    public AwemePruningModel LLJJIII;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public long LLJJJ;
    public boolean LLJJJIL;
    public C18MX LLJL;
    public InterfaceC1752700vi8 LLJLIL;
    public CartBenefitInfo LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public List<AnchorProductInfoModel> LLJILLL = new ArrayList();
    public final IECommerceVideoService LLJJIJI = (IECommerceVideoService) ServiceManager.get().getService(IECommerceVideoService.class);
    public final int LLJJJJ = C0H9I.LIZ(4.0d);
    public final int LLJJJJJIL = C0H9I.LIZ(8.0d);
    public final int LLJJJJLIIL = C0H9I.LIZ(16.0d);
    public final int LLJJL = C0H9I.LIZ(78.0d);
    public final C1748770vbn LLJJLIIIJLLLLLLLZ = new C1748770vbn();

    @Override // X.AbstractActivityC1743740vTg, X.InterfaceC1748820vbs
    public final String getPageName() {
        return "video_comment_anchor";
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStart() {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.anchor.fragment.EcCommentAnchorPanelActivity", "onStart", true);
        super.onStart();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.anchor.fragment.EcCommentAnchorPanelActivity", "onStart", false);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.anchor.fragment.EcCommentAnchorPanelActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    public final ConstraintLayout LLLLZLLIL() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.eck);
            this.LLJ = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final ConstraintLayout LLLLZLLLI() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.q2n);
            this.LLJILJIL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final RecyclerView LLLZ() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv2);
            this.LLIZLLLIL = (RecyclerView) callbackFindViewById;
        }
        return (RecyclerView) callbackFindViewById;
    }

    public final TuxAlertBadgeLayout LLLZIL() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.v6d);
            this.LLILZLL = (TuxAlertBadgeLayout) callbackFindViewById;
        }
        return (TuxAlertBadgeLayout) callbackFindViewById;
    }

    public final TuxIconView LLLZLZ() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.v8n);
            this.LLJI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return EnumC1740810vOx.VIDEO_COMMENT_ANCHOR_PAGE.getPageCode();
    }

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onResume() {
        AnonymousClass0317 anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.anchor.fragment.EcCommentAnchorPanelActivity", "onResume", true);
        super.onResume();
        this.LLJLLIL = true;
        if (!this.LLJLL) {
            this.LLJLL = true;
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.anchor.fragment.EcCommentAnchorPanelActivity", "onResume", false);
            return;
        }
        if (LLLZLZ().getVisibility() == 0 && LLLZIL().getVisibility() == 0 && this.LLJJIJIIJIL > 0) {
            LLZ(false);
        }
        this.LLJJJIL = false;
        this.LLJJJ = SystemClock.elapsedRealtime();
        C21271918Mj c21271918Mj = C21271918Mj.LIZ;
        List<AnchorProductInfoModel> list = this.LLJILLL;
        AwemePruningModel awemePruningModel = this.LLJJIII;
        Integer numValueOf = Integer.valueOf(this.LLJJIJIL);
        c21271918Mj.getClass();
        C1018703yb.LIZLLL("tiktokec_shopping_list_show", new C21270618Lw(awemePruningModel, list, null, numValueOf, null));
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = AdDependencyService.createIAdDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IAdDependencyService.class.getName(), anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAdDependencyService.class);
        }
        IAdDependencyService iAdDependencyService = (IAdDependencyService) anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin;
        AwemePruningModel awemePruningModel2 = this.LLJJIII;
        AbstractC1056160dag abstractC1056160dagOnAdEvent = iAdDependencyService.onAdEvent("landing_ad", "detail_show_success", awemePruningModel2 != null ? awemePruningModel2.awemeRawAd : null);
        abstractC1056160dagOnAdEvent.LIZ.put("refer", "landing_page");
        abstractC1056160dagOnAdEvent.LIZIZ.put("entryPoint", "other");
        abstractC1056160dagOnAdEvent.LIZIZ.put("platform", "native");
        abstractC1056160dagOnAdEvent.LIZIZ();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.anchor.fragment.EcCommentAnchorPanelActivity", "onResume", false);
    }

    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        MutableLiveData<GetItemProductInfoResponseData> mutableLiveData;
        super.onDestroy();
        C18MX c18mx = this.LLJL;
        if (c18mx != null) {
            Iterator it2 = ((LinkedHashMap) c18mx.LLJIJIL).entrySet().iterator();
            while (it2.hasNext()) {
                C21271218Mc c21271218Mc = (C21271218Mc) ((Map.Entry) it2.next()).getValue();
                c21271218Mc.getClass();
                try {
                    ((ArrayList) c21271218Mc.LJFF).clear();
                    BPEAHandler bPEAHandler = c21271218Mc.LJ;
                    ARunnableS132S0100000_32 aRunnableS132S0100000_32 = c21271218Mc.LJIIIZ;
                    if (aRunnableS132S0100000_32 == null) {
                        aRunnableS132S0100000_32 = null;
                    }
                    bPEAHandler.removeCallbacks(aRunnableS132S0100000_32);
                    c21271218Mc.LIZIZ = c21271218Mc.LIZLLL;
                    c21271218Mc.LIZ();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            ((LinkedHashMap) c18mx.LLJIJIL).clear();
            Iterator it3 = ((LinkedHashMap) c18mx.LLJILJIL).entrySet().iterator();
            while (it3.hasNext()) {
                ((C0NOH) ((Map.Entry) it3.next()).getValue()).LIZJ();
            }
            ((LinkedHashMap) c18mx.LLJILJIL).clear();
        }
        InterfaceC1752700vi8 interfaceC1752700vi8 = this.LLJLIL;
        if (interfaceC1752700vi8 != null) {
            interfaceC1752700vi8.release(true);
        }
        EcCommentAnchorPanelViewModel ecCommentAnchorPanelViewModel = this.LLJJ;
        if (ecCommentAnchorPanelViewModel != null && (mutableLiveData = ecCommentAnchorPanelViewModel.LL) != null) {
            mutableLiveData.removeObservers(this);
        }
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_cart_refresh", this);
        C21272518Mp.LIZ.getClass();
        C21272518Mp.LIZIZ = false;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onStop() {
        AnonymousClass0317 anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin;
        super.onStop();
        this.LLJLLIL = false;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLJJJ;
        C21271918Mj c21271918Mj = C21271918Mj.LIZ;
        List<AnchorProductInfoModel> list = this.LLJILLL;
        AwemePruningModel awemePruningModel = this.LLJJIII;
        Long lValueOf = Long.valueOf(jElapsedRealtime);
        Integer numValueOf = Integer.valueOf(this.LLJJIJIL);
        String str = C036A.LIZIZ() ? "close" : this.LLJJJIL ? "next" : "return";
        c21271918Mj.getClass();
        C1018703yb.LIZLLL("tiktokec_shopping_list_staytime", new C21270618Lw(awemePruningModel, list, lValueOf, numValueOf, str));
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = AdDependencyService.createIAdDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime2, 1, IAdDependencyService.class.getName(), anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAdDependencyService.class);
        }
        IAdDependencyService iAdDependencyService = (IAdDependencyService) anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin;
        AwemePruningModel awemePruningModel2 = this.LLJJIII;
        AbstractC1056160dag abstractC1056160dagOnAdEvent = iAdDependencyService.onAdEvent("landing_ad", "close", awemePruningModel2 != null ? awemePruningModel2.awemeRawAd : null);
        abstractC1056160dagOnAdEvent.LIZ.put("refer", "landing_page");
        abstractC1056160dagOnAdEvent.LIZIZ();
        this.LLJJJIL = false;
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    public final void LLZ(boolean z) {
        String strLJIIIIZZ = null;
        CartEntryOptions cartEntryOptions = new CartEntryOptions(z, null);
        CartEntryFrom cartEntryFrom = CartEntryFrom.VIDEO;
        PageSourceInfo pageSourceInfoLJ = C1766860w4y.LJ(C1766860w4y.LIZ, null, 3);
        if (pageSourceInfoLJ != null) {
            strLJIIIIZZ = C1741890vQh.LJIIIIZZ(pageSourceInfoLJ);
        }
        C973303rH.LL.getClass();
        GetCartEntryRequest getCartEntryRequest = new GetCartEntryRequest(cartEntryFrom, cartEntryOptions, strLJIIIIZZ, C973303rH.LLILLJJLI, null);
        InterfaceC1752700vi8 interfaceC1752700vi8 = this.LLJLIL;
        if (interfaceC1752700vi8 != null) {
            interfaceC1752700vi8.LJ(getCartEntryRequest);
        }
    }

    public final String LLZLI(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        C13LP.LJJJLZIJ(0, this.LLJILLL);
        String strLJFF = C18LA.LJFF(LLLZLZ(), str, "c5427.d8123", null);
        TuxIconView tuxIconViewLLLZLZ = LLLZLZ();
        C786410Ut5.I7(new AjS4S1200000_32(tuxIconViewLLLZLZ, this, strLJFF, 1), tuxIconViewLLLZLZ);
        return strLJFF;
    }

    @Override // X.AbstractActivityC1743740vTg, X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", new AwS611S0100000_32(this, 57));
        c1748770vbn.LIZJ(this.LLJJLIIIJLLLLLLLZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f2 A[PHI: r4
      0x01f2: PHI (r4v15 java.lang.String) = (r4v11 java.lang.String), (r4v16 java.lang.String) binds: [B:85:0x01f0, B:83:0x01ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f6 A[PHI: r4
      0x01f6: PHI (r4v14 java.lang.String) = (r4v11 java.lang.String), (r4v15 java.lang.String) binds: [B:85:0x01f0, B:87:0x01f4] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.AbstractActivityC1743740vTg, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r52) {
        /*
            Method dump skipped, instruction units count: 1198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.fragment.EcCommentAnchorPanelActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        boolean z;
        super.setTheme(i);
        if (C299020Bno.LIZ() != 0) {
            boolean z2 = false;
            if (!C1697810uHb.LJIIJJI(Integer.valueOf(R.style.a9t), Integer.valueOf(R.style.a9u), Integer.valueOf(R.style.a9v), Integer.valueOf(R.style.a9s)).contains(Integer.valueOf(i))) {
                Integer numLIZ = C1308910kAL.LIZ(R.attr.g0c, this);
                if (numLIZ != null && numLIZ.intValue() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                Integer numLIZ2 = C1308910kAL.LIZ(R.attr.g0d, this);
                if (numLIZ2 == null || numLIZ2.intValue() != 0) {
                    z2 = true;
                }
                if (z) {
                    getTheme().applyStyle(R.style.a9u, true);
                } else {
                    getTheme().applyStyle(R.style.a9t, true);
                }
                if (z2) {
                    getTheme().applyStyle(R.style.a9v, true);
                } else {
                    getTheme().applyStyle(R.style.a9s, true);
                }
            }
        }
        EnumC335920DEw enumC335920DEwLIZ = C335910DEv.LIZ();
        if (enumC335920DEwLIZ == EnumC335920DEw.V1) {
            getTheme().applyStyle(R.style.a9x, true);
        } else {
            if (enumC335920DEwLIZ != EnumC335920DEw.V2) {
                return;
            }
            getTheme().applyStyle(R.style.a9y, true);
        }
    }

    public final void LLLZZIL(int i, boolean z) {
        if (i > 0) {
            LLLZIL().setCount(i);
            LLLZIL().LIZJ();
            LLZ(z);
            return;
        }
        LLLZIL().LIZIZ();
        InterfaceC1752700vi8 interfaceC1752700vi8 = this.LLJLIL;
        if (interfaceC1752700vi8 != null) {
            interfaceC1752700vi8.LIZ();
        }
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            viewFindViewById = findViewById(R.id.v6e);
            this.LLJIJIL = (C7937038d) viewFindViewById;
            if (viewFindViewById == null) {
                return;
            }
        }
        C12ES.LJIILL(4, viewFindViewById);
    }

    @Override // X.AbstractActivityC1743740vTg, X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        if (Intrinsics.LJFF(str, "ec_cart_refresh")) {
            runOnUiThread(new ARunnableS36S1100000_32(this, str2, 0));
        }
    }
}
