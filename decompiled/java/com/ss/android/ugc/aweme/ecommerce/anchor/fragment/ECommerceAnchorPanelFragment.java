package com.ss.android.ugc.aweme.ecommerce.anchor.fragment;

import X.AbstractC1056160dag;
import X.AbstractC21673619ry;
import X.AnonymousClass0206;
import X.AnonymousClass0317;
import X.C01GW;
import X.C034S;
import X.C098200Yq;
import X.C0H9I;
import X.C0HBC;
import X.C0OM1;
import X.C1120604Zw;
import X.C12ES;
import X.C1319560kRW;
import X.C1388190mED;
import X.C1389890mGx;
import X.C13LP;
import X.C1548820qPI;
import X.C1685300txQ;
import X.C16G0;
import X.C16G1;
import X.C1735020vFc;
import X.C1739800vNK;
import X.C1741890vQh;
import X.C1748770vbn;
import X.C1748780vbo;
import X.C1765350w2X;
import X.C1766860w4y;
import X.C189200o6;
import X.C189L;
import X.C18LA;
import X.C18LY;
import X.C18MZ;
import X.C18NE;
import X.C18Z4;
import X.C19EG;
import X.C19GS;
import X.C1AQS;
import X.C20154413tW;
import X.C2097608Jq;
import X.C21271118Mb;
import X.C21271918Mj;
import X.C21272018Mk;
import X.C21272218Mm;
import X.C21272518Mp;
import X.C21275118Np;
import X.C21578619ce;
import X.C2187451AjH;
import X.C2187701Ajg;
import X.C291260BbI;
import X.C421580Gg0;
import X.C452501pT;
import X.C616540OGe;
import X.C770702zh;
import X.C786410Ut5;
import X.C7937038d;
import X.C973303rH;
import X.InterfaceC1164530gPT;
import X.InterfaceC1324370kZH;
import X.InterfaceC1392640mLO;
import X.InterfaceC1752700vi8;
import X.InterfaceC1753920vk6;
import X.InterfaceC1754210vkZ;
import X.InterfaceC1754230vkb;
import X.InterfaceC1809520xBm;
import X.InterfaceC344240DeY;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewTreeObserverOnGlobalLayoutListenerC1006860cJA;
import Y.ARunnableS132S0100000_32;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdk.model.message.ext.GImage;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.anchor.baseview.ECommerceAnchorAppbarLayout$Behavior;
import com.ss.android.ugc.aweme.ecommerce.anchor.fragment.ECommerceAnchorPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.anchor.model.PanelPerformanceMetrics;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.AnchorBizUtils;
import com.ss.android.ugc.aweme.ecommerce.anchor.utils.PanelVoucherManager;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.AnchorCommonViewModel;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment;
import com.ss.android.ugc.aweme.ecommerce.config.AnchorPanelConfig;
import com.ss.android.ugc.aweme.ecommerce.dependency.ad.AdDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.commonfeed.CommonFeedDependService;
import com.ss.android.ugc.aweme.ecommerce.dependency.ecug.ECDiversionDependencyService;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.CartEntry;
import com.ss.android.ugc.aweme.ecommerce.model.PanelBannerInfo;
import com.ss.android.ugc.aweme.ecommerce.model.PanelVoucherInfo;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.PromotionResource;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IECDiversionDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.ICartService;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.CartEntryOptions;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.EnterCartParams;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.GetCartEntryRequest;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitBizType;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitContentInfo;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitInfo;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitItem;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartEntryFrom;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import g1c.AjS4S1200000_32;
import g1c.AjS72S0100000_32;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS159S0400000_32;
import kotlin.jvm.internal.AwS181S1100000_32;
import kotlin.jvm.internal.AwS241S0300000_32;
import kotlin.jvm.internal.AwS398S0200000_32;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.AwS681S0100000_32;
import kotlin.jvm.internal.AwS82S1000000_32;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes33.dex */
public final class ECommerceAnchorPanelFragment extends ECBaseSheetFragment implements Observer<List<? extends C21271118Mb>>, InterfaceC344240DeY, InterfaceC1164530gPT {
    public static boolean LLLLIILL = false;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGEyJiYkJjHELIOS19LjctLiI2JjFiDAw8JSgpOyw2CSsvISAhGCQiLCMVOiQrJCo9PA==";
    public FrameLayout LLIZ;
    public TuxIconView LLIZLLLIL;
    public C7937038d LLJ;
    public FrameLayout LLJI;
    public TuxTextView LLJIJIL;
    public ConstraintLayout LLJILJIL;
    public InterfaceC1392640mLO LLJILJILJ;
    public boolean LLJJIII;
    public int LLJJIJI;
    public AnchorCommonViewModel LLJJJ;
    public RecyclerView LLJJJIL;
    public ViewGroup LLJJJJ;
    public FrameLayout LLJJJJJIL;
    public C21578619ce LLJJJJLIIL;
    public C18Z4 LLJJL;
    public C1319560kRW LLJJLIIIJLLLLLLLZ;
    public C18NE LLJL;
    public ConstraintLayout LLJLL;
    public TuxAlertBadgeLayout LLJLLIL;
    public TuxIconView LLJLLL;
    public TuxIconView LLJZ;
    public long LLJZIJLIL;
    public int LLL;
    public int LLLF;
    public int LLLFFI;
    public int LLLFZ;
    public boolean LLLI;
    public ViewTreeObserverOnGlobalLayoutListenerC1006860cJA LLLIIII;
    public boolean LLLIIIL;
    public String LLLIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;
    public boolean LLLILZ;
    public long LLLILZJ;
    public InterfaceC1752700vi8 LLLILZLLLI;
    public CartBenefitInfo LLLIZZ;
    public boolean LLLJ;
    public AnchorCommonStruct LLJILLL = new AnchorCommonStruct();
    public String LLJJ = "video_multi_anchor";
    public ProductListModel LLJJI = new ProductListModel(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new AnchorPanelConfig(0, "video_anchor", 0, false, 0, false, false, false, false, new LinkedHashMap()), null, null, null, new LinkedHashMap());
    public AnchorPanelConfig LLJJIJIIJIL = new AnchorPanelConfig(0, "video_anchor", 0, false, 0, false, false, false, false, new LinkedHashMap());
    public final ECommerceAnchorPanelViewModel LLJJIJIL = new ECommerceAnchorPanelViewModel();
    public final IECommerceAnchorService LLJLIL = (IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class);
    public final IECommerceVideoService LLJLILLLLZIIL = (IECommerceVideoService) ServiceManager.get().getService(IECommerceVideoService.class);
    public final BPEAHandler LLLFF = new BPEAHandler(Looper.getMainLooper());
    public int LLLII = 4;
    public final C1748770vbn LLLIIIIL = new C1748770vbn();
    public final List<Integer> LLLJIL = new ArrayList();
    public final PanelPerformanceMetrics LLLJL = new PanelPerformanceMetrics(0, false, true);
    public final C0HBC LLLL = new C0HBC(this);
    public final C01GW LLLLII = C452501pT.LIZIZ(new AwS570S0100000_26(this, 155));
    public final C01GW LLLLIIIILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 154));
    public final ARunnableS132S0100000_32 LLLLIIL = new ARunnableS132S0100000_32(this, 29);

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    public final void bS(C16G0 c16g0) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    public final void dS(int i, int i2, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1748820vbs
    public final String getPageName() {
        return "video_anchor";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    public final boolean isHalfScreen() {
        return true;
    }

    public final boolean ES() {
        AnchorCommonViewModel anchorCommonViewModel;
        if (!this.LLLIIIL || (anchorCommonViewModel = this.LLJJJ) == null || !anchorCommonViewModel.LL) {
            return false;
        }
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("ec_sv_use_ymal_schema_from_server", false);
    }

    public final void GS() {
        InterfaceC1752700vi8 interfaceC1752700vi8 = this.LLLILZLLLI;
        if (interfaceC1752700vi8 != null) {
            View viewFindViewById = this.LLIZ;
            if (viewFindViewById == null) {
                View view = getView();
                viewFindViewById = view != null ? view.findViewById(R.id.trb) : null;
                this.LLIZ = (FrameLayout) viewFindViewById;
            }
            ViewGroup viewGroup = (ViewGroup) viewFindViewById;
            View viewFindViewById2 = this.LLIZLLLIL;
            if (viewFindViewById2 == null) {
                View view2 = getView();
                viewFindViewById2 = view2 != null ? view2.findViewById(R.id.v8n) : null;
                this.LLIZLLLIL = (TuxIconView) viewFindViewById2;
            }
            View view3 = this.LLJ;
            if (view3 == null) {
                View view4 = getView();
                View viewFindViewById3 = view4 != null ? view4.findViewById(R.id.v6e) : null;
                this.LLJ = (C7937038d) viewFindViewById3;
                view3 = viewFindViewById3;
            }
            interfaceC1752700vi8.LJI(viewGroup, viewFindViewById2, (C7937038d) view3, 10.0f, 0.0f, null, null);
        }
    }

    public final void HS() {
        List<Integer> list;
        RecyclerView recyclerView = this.LLJJJIL;
        C18MZ c18mz = (C18MZ) (recyclerView != null ? recyclerView.getAdapter() : null);
        this.LLLF = (c18mz == null || (list = c18mz.LLLIIIL) == null) ? 0 : ((ArrayList) list).size();
        RecyclerView recyclerView2 = this.LLJJJIL;
        if (recyclerView2 != null) {
            C1735020vFc c1735020vFc = C1735020vFc.LIZ;
            AwS681S0100000_32 awS681S0100000_32 = new AwS681S0100000_32(this, 5);
            c1735020vFc.getClass();
            C1735020vFc.LIZIZ(recyclerView2, awS681S0100000_32);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059 A[PHI: r5
      0x0059: PHI (r5v4 java.lang.String) = (r5v0 java.lang.String), (r5v5 java.lang.String) binds: [B:23:0x0057, B:21:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005d A[PHI: r5
      0x005d: PHI (r5v3 java.lang.String) = (r5v0 java.lang.String), (r5v4 java.lang.String) binds: [B:23:0x0057, B:25:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void nS() {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.fragment.ECommerceAnchorPanelFragment.nS():void");
    }

    public final C1765350w2X oS() {
        return (C1765350w2X) this.LLLLIIIILLL.getValue();
    }

    public final void rS() {
        C18Z4 c18z4 = this.LLJJL;
        if (c18z4 != null) {
            c18z4.setNeedInterceptScroll(new AwS576S0100000_32(this, 132));
        }
        C1319560kRW c1319560kRW = this.LLJJLIIIJLLLLLLLZ;
        if (c1319560kRW != null) {
            c1319560kRW.setIsIntercept(true);
        }
        C1319560kRW c1319560kRW2 = this.LLJJLIIIJLLLLLLLZ;
        if (c1319560kRW2 != null) {
            c1319560kRW2.setNeedInterceptScroll(new AwS681S0100000_32(this, 4));
        }
    }

    public final void yS() {
        C21271918Mj c21271918Mj = C21271918Mj.LIZ;
        int i = this.LLLFFI;
        ProductListModel productListModel = this.LLJJI;
        C21272018Mk c21272018Mk = C21272018Mk.LIZ;
        List<AnchorProductInfoModel> list = productListModel.products;
        ArrayList arrayList = list != null ? new ArrayList(list) : null;
        c21272018Mk.getClass();
        int iLJIILLIIL = C21272018Mk.LJIILLIIL(arrayList);
        String str = this.LLJJ;
        c21271918Mj.getClass();
        C21271918Mj.LJIJJLI(i, productListModel, iLJIILLIIL, str);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    public final void gS() {
        C1765350w2X c1765350w2XOS = oS();
        if (c1765350w2XOS != null) {
            c1765350w2XOS.G2(4);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        AnonymousClass0317 anonymousClass0317CreateIECDiversionDependencyServicebyMonsterPlugin;
        ViewTreeObserver viewTreeObserver;
        super.onDestroy();
        C18NE c18ne = this.LLJL;
        if (c18ne != null) {
            if (c18ne.LLILZIL) {
                c18ne.LLILZIL = false;
                ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_gyl_back_to_top", c18ne);
                C1548820qPI.LJIIIIZZ("ec_gyl_global_state", c18ne);
            }
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c18ne.LL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
            }
        }
        C18Z4 c18z4 = this.LLJJL;
        if (c18z4 != null && (viewTreeObserver = c18z4.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC1006860cJA viewTreeObserverOnGlobalLayoutListenerC1006860cJA = this.LLLIIII;
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1006860cJA);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1006860cJA, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_cart_refresh", this);
        RecyclerView recyclerView = this.LLJJJIL;
        C18MZ c18mz = (C18MZ) (recyclerView != null ? recyclerView.getAdapter() : null);
        if (c18mz != null) {
            c18mz.LLLI();
        }
        InterfaceC1752700vi8 interfaceC1752700vi8 = this.LLLILZLLLI;
        if (interfaceC1752700vi8 != null) {
            interfaceC1752700vi8.release(true);
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIECDiversionDependencyServicebyMonsterPlugin = ECDiversionDependencyService.createIECDiversionDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IECDiversionDependencyService.class.getName(), anonymousClass0317CreateIECDiversionDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIECDiversionDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIECDiversionDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIECDiversionDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IECDiversionDependencyService.class);
        }
        ((IECDiversionDependencyService) anonymousClass0317CreateIECDiversionDependencyServicebyMonsterPlugin).onPopupFragmentOnDestroy(getActivity(), this.LLJJI.trackParams);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        AnonymousClass0317 anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin;
        super.onDestroyView();
        this.LLLJL.setAnchorClickTime(0L);
        this.LLLFF.removeCallbacks(this.LLLLIIL);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = AdDependencyService.createIAdDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IAdDependencyService.class.getName(), anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAdDependencyService.class);
        }
        AbstractC1056160dag abstractC1056160dagOnAdEvent = ((IAdDependencyService) anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin).onAdEvent("landing_ad", "close", this.LLJJI.awemeRawAd);
        abstractC1056160dagOnAdEvent.LIZ.put("refer", "landing_page");
        abstractC1056160dagOnAdEvent.LIZIZ();
        this.LLJJIJIL.SQ2(this.LLL, this.LLLF, System.currentTimeMillis() - this.LLJZIJLIL, "return");
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLLILZ = false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LLLILZJ = System.currentTimeMillis() - this.LLJZIJLIL;
        C786410Ut5.LJLIIL(3000L, this.LLLFF, this.LLLLIIL);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(ECommerceAnchorPanelFragment.class.getName());
        }
        super.onResume();
        if (!this.LLLJ) {
            this.LLLJ = true;
            return;
        }
        TuxIconView tuxIconView = this.LLJLLL;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        if (tuxIconView.getVisibility() == 0) {
            TuxAlertBadgeLayout tuxAlertBadgeLayout = this.LLJLLIL;
            if (tuxAlertBadgeLayout == null) {
                tuxAlertBadgeLayout = null;
            }
            if (tuxAlertBadgeLayout.getVisibility() == 0) {
                TuxAlertBadgeLayout tuxAlertBadgeLayout2 = this.LLJLLIL;
                if ((tuxAlertBadgeLayout2 != null ? tuxAlertBadgeLayout2 : null).getCount() > 0) {
                    zS(false);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        AnonymousClass0317 anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin;
        C18MZ c18mz;
        super.onStart();
        RecyclerView recyclerView = this.LLJJJIL;
        AbstractC21673619ry adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if ((adapter instanceof C18MZ) && (c18mz = (C18MZ) adapter) != null) {
            c18mz.LLLIIIIL().LJIJ.setAnchorClickTime(this.LLLJL.getAnchorClickTime());
        }
        this.LLJZIJLIL = System.currentTimeMillis();
        RecyclerView recyclerView2 = this.LLJJJIL;
        C18MZ c18mz2 = (C18MZ) (recyclerView2 != null ? recyclerView2.getAdapter() : null);
        if (c18mz2 != null) {
            ((ArrayList) c18mz2.LLLIIIL).clear();
            ((ArrayList) c18mz2.LLLIIL).clear();
            c18mz2.LLLIILIL.clear();
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin = CommonFeedDependService.createICommonFeedDependServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, ICommonFeedDependService.class.getName(), anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin != null ? anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ICommonFeedDependService.class);
        }
        ((ICommonFeedDependService) anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin).setDescDialogShowing(true);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        RecyclerView recyclerView = this.LLJJJIL;
        C18MZ c18mz = (C18MZ) (recyclerView != null ? recyclerView.getAdapter() : null);
        if (c18mz != null) {
            ((ArrayList) c18mz.LLLIIIL).clear();
            ((ArrayList) c18mz.LLLIIL).clear();
            c18mz.LLLIILIL.clear();
            ((ArrayList) this.LLLJIL).clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    public final void iS() {
        dismiss();
    }

    public final String BS(String str) {
        boolean z;
        String str2;
        String string;
        Aweme aweme;
        String str3;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        TuxAlertBadgeLayout tuxAlertBadgeLayout = null;
        if (z) {
            return null;
        }
        AnchorProductInfoModel anchorProductInfoModel = (AnchorProductInfoModel) C13LP.LJJJLL(this.LLJJIJIL.LLILZIL);
        if (anchorProductInfoModel != null) {
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            Long l = anchorProductInfoModel.extraData.productId;
            if (l == null || (string = l.toString()) == null) {
                string = "";
            }
            ProductListModel productListModel = this.LLJJI;
            if (productListModel != null) {
                aweme = productListModel.aweme;
            } else {
                aweme = null;
            }
            ProductListModel productListModel2 = this.LLJJIJIL.LLILLJJLI;
            if (productListModel2 != null) {
                str3 = productListModel2.eventType;
            } else {
                str3 = null;
            }
            String strLJIIJ = C21272218Mm.LJIIJ(str2, anchorProductInfoModel, string, aweme, str3, this.LLJJ, true);
            if (strLJIIJ != null) {
                str = strLJIIJ;
            }
        }
        TuxAlertBadgeLayout tuxAlertBadgeLayout2 = this.LLJLLIL;
        if (tuxAlertBadgeLayout2 == null) {
            tuxAlertBadgeLayout2 = null;
        }
        String strLJFF = C18LA.LJFF(tuxAlertBadgeLayout2, str, "c92278.d6087", null);
        TuxAlertBadgeLayout tuxAlertBadgeLayout3 = this.LLJLLIL;
        if (tuxAlertBadgeLayout3 != null) {
            tuxAlertBadgeLayout = tuxAlertBadgeLayout3;
        }
        C786410Ut5.I7(new AjS4S1200000_32(tuxAlertBadgeLayout, this, strLJFF, 0), tuxAlertBadgeLayout);
        return strLJFF;
    }

    public final void FS(C21271118Mb c21271118Mb) {
        CartEntry cartEntry;
        String str;
        Integer num;
        int iIntValue;
        Integer num2;
        Integer num3;
        CartEntry cartEntry2;
        TuxIconView tuxIconView = null;
        if (c21271118Mb != null && (cartEntry = c21271118Mb.LJIIIZ) != null && cartEntry.link != null) {
            if (c21271118Mb == null || (cartEntry2 = c21271118Mb.LJIIIZ) == null || (str = cartEntry2.link) == null) {
                str = "";
            }
            String strBS = BS(str);
            if (strBS != null) {
                C1748780vbo.LIZ(this.LLLIIIIL, new AwS82S1000000_32(strBS, 9));
            }
            TuxIconView tuxIconView2 = this.LLJLLL;
            if (tuxIconView2 == null) {
                tuxIconView2 = null;
            }
            int iIntValue2 = 0;
            C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
            if (!c21271118Mb.LJIL) {
                CartEntry cartEntry3 = c21271118Mb.LJIIIZ;
                if (cartEntry3 != null && (num3 = cartEntry3.itemCount) != null) {
                    iIntValue = num3.intValue();
                } else {
                    iIntValue = 0;
                }
                wS(iIntValue, false);
                C21272518Mp c21272518Mp = C21272518Mp.LIZ;
                CartEntry cartEntry4 = c21271118Mb.LJIIIZ;
                if (cartEntry4 != null) {
                    num2 = cartEntry4.itemCount;
                } else {
                    num2 = null;
                }
                c21272518Mp.getClass();
                C21272518Mp.LIZIZ(num2);
            } else {
                C21272518Mp.LIZ.getClass();
                wS(C21272518Mp.LJIIJJI, false);
            }
            TuxIconView tuxIconView3 = this.LLJLLL;
            if (tuxIconView3 != null) {
                tuxIconView = tuxIconView3;
            }
            Map mapCreateReportParams$default = BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "c92278.d6087", PageFinder.via((View) tuxIconView), null, 4, null);
            C21271918Mj c21271918Mj = C21271918Mj.LIZ;
            CartEntry cartEntry5 = c21271118Mb.LJIIIZ;
            if (cartEntry5 != null && (num = cartEntry5.itemCount) != null) {
                iIntValue2 = num.intValue();
            }
            ProductListModel productListModel = this.LLJJIJIL.LLILLJJLI;
            String str2 = this.LLJJ;
            c21271918Mj.getClass();
            C21271918Mj.LJIIJJI(iIntValue2, productListModel, str2, mapCreateReportParams$default);
            return;
        }
        TuxIconView tuxIconView4 = this.LLJLLL;
        if (tuxIconView4 != null) {
            tuxIconView = tuxIconView4;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
        C1748780vbo.LIZIZ(c1748770vbn, "lib_track_builtin_lane_business", new AwS611S0100000_32(this, 56));
        c1748770vbn.LIZJ(this.LLLIIIIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(List<? extends C21271118Mb> list) {
        AbstractC21673619ry adapter;
        AbstractC21673619ry adapter2;
        AnonymousClass0317 anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        CartEntry cartEntry;
        Integer num;
        Map<String, String> map;
        String str;
        C18MZ c18mz;
        List<? extends C21271118Mb> list2 = list;
        RecyclerView recyclerView = this.LLJJJIL;
        PanelBannerInfo panelBannerInfo = null;
        if (recyclerView != null) {
            adapter = recyclerView.getAdapter();
        } else {
            adapter = null;
        }
        if ((adapter instanceof C18MZ) && (c18mz = (C18MZ) adapter) != 0) {
            c18mz.LLLJ(list2);
        }
        this.LLL = 1;
        C21271118Mb c21271118Mb = (C21271118Mb) C13LP.LJJJLL(list2);
        if (c21271118Mb != null && (map = c21271118Mb.LJJIIJZLJL) != null && (str = map.get("multi_panel_common_voucher_toast")) != null) {
            List<PanelVoucherInfo> list3 = c21271118Mb.LJJII;
            if (list3 != null && !list3.isEmpty()) {
                C1389890mGx c1389890mGx = new C1389890mGx(this);
                c1389890mGx.LJFF(R.raw.icon_tick_fill);
                c1389890mGx.LJII(R.attr.a0i);
                c1389890mGx.LJIIJ(str);
                c1389890mGx.LJIIJJI();
            } else {
                C1389890mGx c1389890mGx2 = new C1389890mGx(this);
                c1389890mGx2.LJFF(R.raw.icon_info_circle);
                c1389890mGx2.LJII(R.attr.ee);
                c1389890mGx2.LJIIJ(str);
                c1389890mGx2.LJIIJJI();
            }
        }
        RecyclerView recyclerView2 = this.LLJJJIL;
        if (recyclerView2 != null) {
            adapter2 = recyclerView2.getAdapter();
        } else {
            adapter2 = null;
        }
        if ((adapter2 instanceof C18MZ) && adapter2 != null && c21271118Mb != null && (cartEntry = c21271118Mb.LJIIIZ) != null && (num = cartEntry.itemCount) != null) {
            num.intValue();
        }
        FS(c21271118Mb);
        C1748780vbo.LIZ(this.LLLIIIIL, new AwS611S0100000_32(c21271118Mb, 288));
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = AdDependencyService.createIAdDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IAdDependencyService.class.getName();
            if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAdDependencyService.class);
        }
        AbstractC1056160dag abstractC1056160dagOnAdEvent = ((IAdDependencyService) anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin).onAdEvent("landing_ad", "detail_show_success", this.LLJJI.awemeRawAd);
        abstractC1056160dagOnAdEvent.LIZ.put("refer", "landing_page");
        abstractC1056160dagOnAdEvent.LIZIZ.put("entryPoint", "other");
        abstractC1056160dagOnAdEvent.LIZIZ.put("platform", "native");
        abstractC1056160dagOnAdEvent.LIZIZ();
        this.LLJJIJIL.RQ2(isResumed());
        if (c21271118Mb != null) {
            uS(c21271118Mb);
            PromotionResource promotionResource = c21271118Mb.LJJIFFI;
            if (promotionResource != null) {
                panelBannerInfo = promotionResource.panelBannerInfo;
            }
        }
        sS(panelBannerInfo);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        String strValueOf;
        Serializable serializable2;
        boolean z;
        int i;
        long anchorClickTime;
        Serializable serializable3;
        boolean z2;
        AnonymousClass0317 anonymousClass0317CreateIECDiversionDependencyServicebyMonsterPlugin;
        String string;
        InterfaceC1752700vi8 interfaceC1752700vi8LJFF;
        boolean z3;
        String name;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        InterfaceC1752700vi8 interfaceC1752700vi8 = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("anchorStruct");
        } else {
            serializable = null;
        }
        AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) serializable;
        if (anchorCommonStruct == null) {
            anchorCommonStruct = this.LLJILLL;
        }
        this.LLJILLL = anchorCommonStruct;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (strValueOf = arguments2.getString("productListModelCacheKey")) == null) {
            strValueOf = String.valueOf(System.currentTimeMillis());
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            serializable2 = arguments3.getSerializable("productListModel");
        } else {
            serializable2 = null;
        }
        ProductListModel productListModelLJIIJ = (ProductListModel) serializable2;
        if (productListModelLJIIJ == null) {
            C21272518Mp.LIZ.getClass();
            productListModelLJIIJ = C21272518Mp.LJIIJ(strValueOf);
            if (productListModelLJIIJ == null) {
                productListModelLJIIJ = this.LLJJI;
            }
        }
        this.LLJJI = productListModelLJIIJ;
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            z = arguments4.getBoolean("useBubbleIcon");
        } else {
            z = this.LLJJIII;
        }
        this.LLJJIII = z;
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            i = arguments5.getInt("anchorCount");
        } else {
            i = this.LLJJIJI;
        }
        this.LLJJIJI = i;
        PanelPerformanceMetrics panelPerformanceMetrics = this.LLLJL;
        Bundle arguments6 = getArguments();
        if (arguments6 != null) {
            anchorClickTime = arguments6.getLong("clickTime");
        } else {
            anchorClickTime = this.LLLJL.getAnchorClickTime();
        }
        panelPerformanceMetrics.setAnchorClickTime(anchorClickTime);
        ProductListModel productListModel = this.LLJJI;
        String str = productListModel.entranceForm;
        if (str == null) {
            str = this.LLJJ;
        }
        this.LLJJ = str;
        this.LLJJIJIL.IQ2(this.LLJILLL, this.LLJILJILJ, this.LLJJIII, this.LLJJIJI, productListModel);
        Bundle arguments7 = getArguments();
        if (arguments7 != null) {
            serializable3 = arguments7.getSerializable("panelConfig");
        } else {
            serializable3 = null;
        }
        this.LLJJIJIIJIL = (AnchorPanelConfig) serializable3;
        C19EG c19egRequireActivity = requireActivity();
        String str2 = this.LLJJI.aid;
        if (str2 == null) {
            str2 = "";
        }
        this.LLJJJ = (AnchorCommonViewModel) new ViewModelProvider(c19egRequireActivity, new C20154413tW(str2)).get(AnchorCommonViewModel.class);
        this.LLLIIL = null;
        this.LLLIILIL = false;
        this.LLLIL = false;
        if (this.LLJJIJIIJIL.enableMaybeYouLike && C770702zh.LIZIZ(C21275118Np.LIZ())) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LLLIIIL = z2;
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_cart_refresh", this);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIECDiversionDependencyServicebyMonsterPlugin = ECDiversionDependencyService.createIECDiversionDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIECDiversionDependencyServicebyMonsterPlugin != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            String name2 = IECDiversionDependencyService.class.getName();
            if (anonymousClass0317CreateIECDiversionDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIECDiversionDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z3);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIECDiversionDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IECDiversionDependencyService.class);
        }
        ((IECDiversionDependencyService) anonymousClass0317CreateIECDiversionDependencyServicebyMonsterPlugin).onPopupFragmentOnCreate(getActivity(), "video_anchor", this.LLJJI.trackParams, null, "seven_tenths_screen");
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        Bundle arguments8 = getArguments();
        if (arguments8 != null) {
            string = arguments8.getString("source_btm_token");
        } else {
            string = null;
        }
        btmSDK.registerBtmPageOnCreate(this, "a2270.b58272", string);
        Context context = getContext();
        if (context != null) {
            ICartService iCartService = (ICartService) PluggableExtentionKt.pluggableSpi$default(ICartService.class, false, false, false, 14, null);
            if (iCartService != null && (interfaceC1752700vi8LJFF = iCartService.LJFF(context)) != null) {
                interfaceC1752700vi8LJFF.LJII(AnonymousClass0206.get$arr$(348));
                interfaceC1752700vi8LJFF.LIZLLL(new InterfaceC1754210vkZ() { // from class: X.18Nr
                    @Override // X.InterfaceC1754210vkZ
                    public final void LIZIZ(CartBenefitInfo cartBenefitInfo) {
                    }

                    @Override // X.InterfaceC1754210vkZ
                    public final void LIZ(CartBenefitInfo cartBenefitInfo) throws JSONException {
                        CartBenefitBizType cartBenefitBizType;
                        CartBenefitContentInfo cartBenefitContentInfo;
                        CartBenefitContentInfo cartBenefitContentInfo2;
                        String str3;
                        String str4 = null;
                        if (cartBenefitInfo != null) {
                            cartBenefitBizType = cartBenefitInfo.cartBenefitBizType;
                        } else {
                            cartBenefitBizType = null;
                        }
                        if (cartBenefitBizType == CartBenefitBizType.CART_FREE_SHIPPING) {
                            ECommerceAnchorPanelFragment eCommerceAnchorPanelFragment = this.LIZ;
                            eCommerceAnchorPanelFragment.getClass();
                            C21271918Mj c21271918Mj = C21271918Mj.LIZ;
                            String str5 = eCommerceAnchorPanelFragment.LLJJ;
                            String str6 = eCommerceAnchorPanelFragment.LLJJI.pageName;
                            if (str6 == null) {
                                str6 = "video";
                            }
                            c21271918Mj.getClass();
                            C21271918Mj.LJIJJ(str5, str6);
                        }
                        ECommerceAnchorPanelFragment eCommerceAnchorPanelFragment2 = this.LIZ;
                        if (cartBenefitInfo != null) {
                            CartBenefitItem cartBenefitItem = cartBenefitInfo.dynamicItem;
                            if (cartBenefitItem != null && (cartBenefitContentInfo2 = cartBenefitItem.contentInfo) != null && (str3 = cartBenefitContentInfo2.schema) != null) {
                                str4 = str3;
                            } else {
                                CartBenefitItem cartBenefitItem2 = cartBenefitInfo.staticItem;
                                if (cartBenefitItem2 != null && (cartBenefitContentInfo = cartBenefitItem2.contentInfo) != null) {
                                    str4 = cartBenefitContentInfo.schema;
                                }
                            }
                        }
                        eCommerceAnchorPanelFragment2.BS(str4);
                        this.LIZ.LLLIZZ = cartBenefitInfo;
                    }
                });
                interfaceC1752700vi8LJFF.LJFF(new InterfaceC1754230vkb() { // from class: X.0w2d
                    /* JADX WARN: Removed duplicated region for block: B:17:0x001e  */
                    @Override // X.InterfaceC1754230vkb
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZ(com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitInfo r3) {
                        /*
                            r2 = this;
                            com.ss.android.ugc.aweme.ecommerce.anchor.fragment.ECommerceAnchorPanelFragment r1 = r2.LIZ
                            if (r3 == 0) goto L1e
                            com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitItem r0 = r3.dynamicItem
                            if (r0 == 0) goto L10
                            com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitContentInfo r0 = r0.contentInfo
                            if (r0 == 0) goto L10
                            java.lang.String r0 = r0.schema
                            if (r0 != 0) goto L1a
                        L10:
                            com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitItem r0 = r3.staticItem
                            if (r0 == 0) goto L1e
                            com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitContentInfo r0 = r0.contentInfo
                            if (r0 == 0) goto L1e
                            java.lang.String r0 = r0.schema
                        L1a:
                            r1.BS(r0)
                            return
                        L1e:
                            r0 = 0
                            goto L1a
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1765410w2d.LIZ(com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitInfo):void");
                    }
                });
                interfaceC1752700vi8LJFF.LIZJ(new InterfaceC1753920vk6() { // from class: X.18Nc
                    @Override // X.InterfaceC1753920vk6
                    public final void LIZLLL() {
                    }

                    @Override // X.InterfaceC1753920vk6
                    public final EnterCartParams LIZ() {
                        List<AnchorProductInfoModel> list = this.LIZ.LLJJI.products;
                        AnchorProductInfoModel anchorProductInfoModel = list != null ? (AnchorProductInfoModel) C13LP.LJJJLL(list) : null;
                        ECommerceAnchorPanelFragment eCommerceAnchorPanelFragment = this.LIZ;
                        Aweme aweme = eCommerceAnchorPanelFragment.LLJJI.aweme;
                        ProductListModel productListModel2 = eCommerceAnchorPanelFragment.LLJJIJIL.LLILLJJLI;
                        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(C21272218Mm.LJII(anchorProductInfoModel, null, aweme, productListModel2 != null ? productListModel2.eventType : null, eCommerceAnchorPanelFragment.LLJJ, true, null, 3840));
                        TuxAlertBadgeLayout tuxAlertBadgeLayout = this.LIZ.LLJLLIL;
                        if (tuxAlertBadgeLayout == null) {
                            tuxAlertBadgeLayout = null;
                        }
                        return new EnterCartParams(null, C18LA.LJ("c92278.d6087", tuxAlertBadgeLayout, null), "video", mapLJIIJ);
                    }
                });
                interfaceC1752700vi8 = interfaceC1752700vi8LJFF;
            }
            this.LLLILZLLLI = interfaceC1752700vi8;
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Aweme awemeLJJLIIIJJIZ;
        AnonymousClass0317 anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin;
        boolean z;
        LLLLIILL = false;
        AnchorCommonViewModel anchorCommonViewModel = this.LLJJJ;
        if (anchorCommonViewModel != null) {
            anchorCommonViewModel.LL = false;
            anchorCommonViewModel.LLILLJJLI = new MutableLiveData<>();
        }
        IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class);
        InterfaceC1392640mLO interfaceC1392640mLO = this.LLJILJILJ;
        String name = null;
        if (interfaceC1392640mLO != null) {
            awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ();
        } else {
            awemeLJJLIIIJJIZ = null;
        }
        String str = this.LLJJ;
        Integer numValueOf = Integer.valueOf(this.LLJJI.panelConfig.panelStyle);
        C21272018Mk c21272018Mk = C21272018Mk.LIZ;
        List<AnchorProductInfoModel> list = this.LLJJI.products;
        c21272018Mk.getClass();
        iECommerceAnchorService.LJIIJ(awemeLJJLIIIJJIZ, numValueOf, str, C21272018Mk.LIZLLL(list));
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin = CommonFeedDependService.createICommonFeedDependServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = ICommonFeedDependService.class.getName();
            if (anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ICommonFeedDependService.class);
        }
        ((ICommonFeedDependService) anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin).setDescDialogShowing(false);
        C1765350w2X c1765350w2XOS = oS();
        if (c1765350w2XOS != null) {
            c1765350w2XOS.G2(4);
        }
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
    public final void qS(View view) {
        C18NE c18ne;
        float f;
        C19EG c19egLIZIZ;
        if (ES() && !this.LLLIILIL) {
            return;
        }
        C18Z4 c18z4 = this.LLJJL;
        if (c18z4 != null) {
            C16G1 c16g1 = (C16G1) c18z4.getLayoutParams();
            ECommerceAnchorAppbarLayout$Behavior eCommerceAnchorAppbarLayout$Behavior = new ECommerceAnchorAppbarLayout$Behavior();
            eCommerceAnchorAppbarLayout$Behavior.LJIIIIZZ = new AwS576S0100000_32(this, 131);
            c16g1.LIZIZ(eCommerceAnchorAppbarLayout$Behavior);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c18z4);
            c18z4.setLayoutParams(c16g1);
        }
        View viewFindViewById = view.findViewById(R.id.j9v);
        Float fValueOf = null;
        if (viewFindViewById instanceof ViewStub) {
            this.LLJL = (C18NE) C786410Ut5.LJLLLL((ViewStub) viewFindViewById);
        } else if (this.LLJL == null) {
            if (viewFindViewById instanceof C18NE) {
                c18ne = (C18NE) viewFindViewById;
            } else {
                c18ne = null;
            }
            this.LLJL = c18ne;
        }
        if (this.LLJJIJIIJIL.panelFullScreen) {
            f = 1.0f;
        } else {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("ec_sv_ec_panel_should_limit_to_73_max_height", false)) {
                f = 0.73f;
            } else {
                f = 0.85f;
            }
        }
        Context context = getContext();
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            fValueOf = Float.valueOf((c19egLIZIZ.getResources().getDisplayMetrics().heightPixels * f) - C0H9I.LIZ(52.0d));
        }
        C0HBC c0hbc = this.LLLL;
        AwS433S0200000_32 awS433S0200000_32 = new AwS433S0200000_32(this, fValueOf, 10);
        c0hbc.getClass();
        if (!C291260BbI.LIZ()) {
            awS433S0200000_32.invoke();
        } else {
            c0hbc.LIZIZ = awS433S0200000_32;
        }
    }

    public final void sS(PanelBannerInfo panelBannerInfo) {
        View view;
        C189L c189l;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Integer numValueOf;
        if (this.LLJJIJIIJIL.enablePromotionBanner && panelBannerInfo != null && (view = getView()) != null && (c189l = (C189L) view.findViewById(R.id.q6b)) != null) {
            ViewGroup.LayoutParams layoutParams = c189l.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("ec_sv_anchor_panel_banner_v2_fix", true)) {
                    marginLayoutParams.height = C0H9I.LIZ(56.0d);
                    marginLayoutParams.bottomMargin = C0H9I.LIZ(-24.0d);
                } else {
                    marginLayoutParams.height = C0H9I.LIZ(40.0d);
                    marginLayoutParams.bottomMargin = C0H9I.LIZ(-8.0d);
                }
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c189l);
                c189l.setLayoutParams(marginLayoutParams);
                C1739800vNK c1739800vNK = C1739800vNK.LIZ;
                Context context = getContext();
                ProductListModel productListModel = this.LLJJI;
                c1739800vNK.getClass();
                AwS241S0300000_32 awS241S0300000_32 = new AwS241S0300000_32(productListModel, panelBannerInfo, c189l, 0);
                AwS159S0400000_32 awS159S0400000_32 = new AwS159S0400000_32(context, c189l, panelBannerInfo, productListModel, 5);
                AnchorBizUtils anchorBizUtils = AnchorBizUtils.LIZ;
                GImage gImage = panelBannerInfo.leftImg;
                SmartImageView ivBannerTitleFromXml = c189l.getIvBannerTitleFromXml();
                AwS398S0200000_32 awS398S0200000_32 = new AwS398S0200000_32(c189l, panelBannerInfo, 77);
                AFwS223S0000000_32 aFwS223S0000000_32 = AFwS223S0000000_32.get$arr$(172);
                anchorBizUtils.getClass();
                AnchorBizUtils.LJJLIIIJL(gImage, ivBannerTitleFromXml, awS398S0200000_32, aFwS223S0000000_32);
                AnchorBizUtils.LJJLIIIJL(panelBannerInfo.backgroundImg, c189l.getIvBannerBgFromXml(), new AwS398S0200000_32(c189l, awS241S0300000_32, 78), new AwS576S0100000_32(c189l, 524));
                c189l.getTvBannerSubTitleFromXml().setText(panelBannerInfo.subTitle);
                try {
                    String str = panelBannerInfo.subTitleColor;
                    if (str == null) {
                        str = "#FFFFFFFF";
                    }
                    numValueOf = Integer.valueOf(Color.parseColor(str));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    numValueOf = Integer.valueOf(ColorProtector.parseColor("#FFFFFFFF"));
                }
                int iIntValue = numValueOf.intValue();
                c189l.getTvBannerSubTitleFromXml().setTextColor(iIntValue);
                c189l.getIconArrowRightFromXml().setTintColor(iIntValue);
                C786410Ut5.I7(new AjS72S0100000_32(awS159S0400000_32, 3), c189l);
            }
        }
    }

    public final void uS(C21271118Mb c21271118Mb) {
        List<PanelVoucherInfo> list;
        View viewFindViewById;
        View viewFindViewById2 = null;
        if (this.LLJI == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.ibi);
            } else {
                viewFindViewById = null;
            }
            this.LLJI = (FrameLayout) viewFindViewById;
            if (viewFindViewById == null) {
                return;
            }
        }
        if (!this.LLJJIJIIJIL.enableClaimVoucher) {
            return;
        }
        if (c21271118Mb.LJJIII == null && ((list = c21271118Mb.LJJII) == null || list.isEmpty())) {
            return;
        }
        Pair[] pairArr = new Pair[7];
        pairArr[0] = new Pair("source_page_type", "video");
        pairArr[1] = new Pair("previous_page", "video");
        pairArr[2] = new Pair("coupon_zone", "video_panel_half");
        pairArr[3] = new Pair("page_name", "video");
        String str = this.LLJJI.eventType;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        pairArr[4] = new Pair("enter_from", str);
        String str3 = this.LLJJI.aid;
        if (str3 != null) {
            str2 = str3;
        }
        pairArr[5] = new Pair("source_content_id", str2);
        pairArr[6] = new Pair("entrance_form", this.LLJJ);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        View view2 = this.LLJI;
        if (view2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.ibi);
            }
            this.LLJI = (FrameLayout) viewFindViewById2;
            view2 = viewFindViewById2;
        }
        new PanelVoucherManager(this, (ViewGroup) view2, mapLJIIJ).LIZIZ(new C18LY(c21271118Mb.LJJII, c21271118Mb.LJJIII), "video_anchor", "video_anchor");
    }

    public final void zS(boolean z) {
        String strLJIIIIZZ = null;
        CartEntryOptions cartEntryOptions = new CartEntryOptions(z, null);
        CartEntryFrom cartEntryFrom = CartEntryFrom.VIDEO;
        PageSourceInfo pageSourceInfoLJ = C1766860w4y.LJ(C1766860w4y.LIZ, null, 3);
        if (pageSourceInfoLJ != null) {
            strLJIIIIZZ = C1741890vQh.LJIIIIZZ(pageSourceInfoLJ);
        }
        C973303rH.LL.getClass();
        GetCartEntryRequest getCartEntryRequest = new GetCartEntryRequest(cartEntryFrom, cartEntryOptions, strLJIIIIZZ, C973303rH.LLILLJJLI, null);
        InterfaceC1752700vi8 interfaceC1752700vi8 = this.LLLILZLLLI;
        if (interfaceC1752700vi8 != null) {
            interfaceC1752700vi8.LJ(getCartEntryRequest);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment, X.InterfaceC1058150ddt
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
        this.LLLII = i;
        C1765350w2X c1765350w2XOS = oS();
        if (c1765350w2XOS != null) {
            c1765350w2XOS.LLLLIIIILLL(tuxSheet, i);
        }
        super.LLLLIIIILLL(tuxSheet, i);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    public final void cS(TuxSheet tuxSheet, float f) {
        C1765350w2X c1765350w2XOS = oS();
        if (c1765350w2XOS != null) {
            c1765350w2XOS.LLLFFI(tuxSheet, f);
        }
    }

    public final void mS(C18Z4 c18z4, boolean z) {
        if (c18z4 == null) {
            return;
        }
        this.LLLIIII = new ViewTreeObserverOnGlobalLayoutListenerC1006860cJA(c18z4);
        C786410Ut5.x3(c18z4.getViewTreeObserver(), this.LLLIIII);
        if (!z) {
            C21578619ce c21578619ce = this.LLJJJJLIIL;
            if (c21578619ce != null) {
                c21578619ce.setOnScrollChangeListener(new InterfaceC1809520xBm() { // from class: X.18OA
                    @Override // X.InterfaceC1809520xBm
                    public final void LIZ(C21578619ce c21578619ce2, int i, int i2, int i3, int i4) {
                        ECommerceAnchorPanelFragment eCommerceAnchorPanelFragment = this.LIZ;
                        eCommerceAnchorPanelFragment.LLLFFI = i2 - i4;
                        ViewTreeObserverOnGlobalLayoutListenerC1006860cJA viewTreeObserverOnGlobalLayoutListenerC1006860cJA = eCommerceAnchorPanelFragment.LLLIIII;
                        if (viewTreeObserverOnGlobalLayoutListenerC1006860cJA != null) {
                            viewTreeObserverOnGlobalLayoutListenerC1006860cJA.LIZIZ();
                        }
                        this.LIZ.HS();
                    }
                });
            }
            C1319560kRW c1319560kRW = this.LLJJLIIIJLLLLLLLZ;
            if (c1319560kRW != null) {
                c1319560kRW.setStopScrollAction(new AwS576S0100000_32(this, 578));
                return;
            }
            return;
        }
        c18z4.LIZ(new InterfaceC1324370kZH() { // from class: X.18Nz
            @Override // X.InterfaceC1324380kZI
            public final void LLZZJLIL(C16GX c16gx, int i) {
                ECommerceAnchorPanelFragment eCommerceAnchorPanelFragment = this.LL;
                if (eCommerceAnchorPanelFragment.LLLI && i != 0) {
                    int i2 = eCommerceAnchorPanelFragment.LLLFZ;
                    if (i2 == 0) {
                        eCommerceAnchorPanelFragment.LLLFZ = i;
                    } else {
                        eCommerceAnchorPanelFragment.LLLFFI = i2 - i;
                    }
                    ViewTreeObserverOnGlobalLayoutListenerC1006860cJA viewTreeObserverOnGlobalLayoutListenerC1006860cJA = eCommerceAnchorPanelFragment.LLLIIII;
                    if (viewTreeObserverOnGlobalLayoutListenerC1006860cJA != null) {
                        viewTreeObserverOnGlobalLayoutListenerC1006860cJA.LIZIZ();
                    }
                    this.LL.HS();
                }
            }
        });
        C1319560kRW c1319560kRW2 = this.LLJJLIIIJLLLLLLLZ;
        if (c1319560kRW2 == null) {
            return;
        }
        c1319560kRW2.setActionDownCallBack(new AwS576S0100000_32(this, 579));
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        if (Intrinsics.LJFF(str, "ec_cart_refresh")) {
            C421580Gg0.LIZ(new AwS181S1100000_32(str2, this, 3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:319:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x06f7  */
    /* JADX WARN: Type inference failed for: r2v187, types: [java.lang.Object, java.lang.String, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v190 */
    /* JADX WARN: Type inference failed for: r2v290 */
    /* JADX WARN: Type inference failed for: r2v291 */
    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment, com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r37, android.os.Bundle r38) {
        /*
            Method dump skipped, instruction units count: 2160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.fragment.ECommerceAnchorPanelFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void wS(int i, boolean z) {
        View viewFindViewById = null;
        TuxAlertBadgeLayout tuxAlertBadgeLayout = null;
        if (i > 0) {
            TuxIconView tuxIconView = this.LLJLLL;
            if (tuxIconView == null) {
                tuxIconView = null;
            }
            if (tuxIconView.getVisibility() == 0) {
                zS(z);
                TuxAlertBadgeLayout tuxAlertBadgeLayout2 = this.LLJLLIL;
                if (tuxAlertBadgeLayout2 == null) {
                    tuxAlertBadgeLayout2 = null;
                }
                tuxAlertBadgeLayout2.setCount(i);
                TuxAlertBadgeLayout tuxAlertBadgeLayout3 = this.LLJLLIL;
                if (tuxAlertBadgeLayout3 != null) {
                    tuxAlertBadgeLayout = tuxAlertBadgeLayout3;
                }
                tuxAlertBadgeLayout.LIZJ();
                return;
            }
        }
        TuxAlertBadgeLayout tuxAlertBadgeLayout4 = this.LLJLLIL;
        if (tuxAlertBadgeLayout4 == null) {
            tuxAlertBadgeLayout4 = null;
        }
        tuxAlertBadgeLayout4.LIZIZ();
        InterfaceC1752700vi8 interfaceC1752700vi8 = this.LLLILZLLLI;
        if (interfaceC1752700vi8 != null) {
            interfaceC1752700vi8.LIZ();
        }
        View view = this.LLJ;
        if (view == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.v6e);
            }
            this.LLJ = (C7937038d) viewFindViewById;
            view = viewFindViewById;
            if (viewFindViewById == null) {
                return;
            }
        }
        C12ES.LJIILL(4, view);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.aod, viewGroup, false);
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
