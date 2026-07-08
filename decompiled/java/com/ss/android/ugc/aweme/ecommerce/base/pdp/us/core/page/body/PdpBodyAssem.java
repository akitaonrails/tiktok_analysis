package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body;

import X.AbstractC1338480kw2;
import X.AbstractC1389240mFu;
import X.AbstractC1585810rMx;
import X.AnonymousClass0317;
import X.AnonymousClass0378;
import X.C013C;
import X.C019F;
import X.C01GW;
import X.C034S;
import X.C037C;
import X.C04BA;
import X.C04DW;
import X.C04DX;
import X.C09R3;
import X.C0C64;
import X.C0H9H;
import X.C0Q4Y;
import X.C0QSJ;
import X.C1019103yf;
import X.C1034540d1o;
import X.C10460047e;
import X.C1054004Ag;
import X.C1058220de0;
import X.C1058304Bx;
import X.C1120604Zw;
import X.C1121904a9;
import X.C1158380gFY;
import X.C127G;
import X.C12ES;
import X.C1308910kAL;
import X.C1326490kch;
import X.C1338500kw4;
import X.C13JW;
import X.C13JX;
import X.C13LE;
import X.C13LP;
import X.C1406720mi6;
import X.C1427600nFm;
import X.C1440005kM;
import X.C1455905mv;
import X.C14EU;
import X.C1637806bA;
import X.C1713070ugD;
import X.C1723500ux2;
import X.C1741890vQh;
import X.C1745680vWo;
import X.C1749280vcc;
import X.C1754960vlm;
import X.C1755030vlt;
import X.C1755050vlv;
import X.C1755060vlw;
import X.C1755500vme;
import X.C1755530vmh;
import X.C1755630vmr;
import X.C1755690vmx;
import X.C1756090vnb;
import X.C1756150vnh;
import X.C1756440voA;
import X.C1760500vui;
import X.C1763690vzr;
import X.C1766860w4y;
import X.C18ZQ;
import X.C19719512Dh;
import X.C19719912Dl;
import X.C19EG;
import X.C1AQS;
import X.C20161913uj;
import X.C20600815jK;
import X.C2187701Ajg;
import X.C2217381BqS;
import X.C2371409Qy;
import X.C268660Afw;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C531650Kt9;
import X.C687700QyG;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C732802ta;
import X.C736680Sv4;
import X.C736820SvI;
import X.C785860UsC;
import X.C786410Ut5;
import X.C814420VxA;
import X.C838410Wul;
import X.C954703oH;
import X.C958103op;
import X.EnumC1014603xw;
import X.EnumC1755520vmg;
import X.ExecutorC10416045m;
import X.InterfaceC1146704e9;
import X.InterfaceC1164530gPT;
import X.InterfaceC1338540kw8;
import X.InterfaceC1456405n0;
import X.InterfaceC1748810vbr;
import X.InterfaceC1752680vi6;
import X.InterfaceC1755020vls;
import X.InterfaceC1755040vlu;
import X.InterfaceC1755080vly;
import X.InterfaceC1755100vm0;
import X.InterfaceC1755510vmf;
import X.InterfaceC1755640vms;
import X.InterfaceC1755770vn5;
import X.InterfaceC1756080vna;
import X.InterfaceC1756840voo;
import X.InterfaceC1761670vwb;
import X.InterfaceC1763030vyn;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import X.ViewTreeObserverOnGlobalLayoutListenerC1775940wJc;
import Y.ACListenerS160S0100000_26;
import Y.AObjectS400S0100000_26;
import Y.AsS35S0200000_26;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductUnavailableInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.bundledeal.PdpBundleDealCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.PdpBridgeHeaderCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.PdpCarouselCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.desc.PdpAboutThisProductHeaderCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.desc.PdpBridgeActionCardCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.desc.PdpBridgeDescImageCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.desc.PdpBridgeDescTextCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.desc.PdpBridgeNoticeCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.desc.PdpBridgeVideoCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.divider.PdpBridgeDividerCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.divider.PdpBridgeSpanCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.divider.UsPdpDividerCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.insurance.PdpBridgeInsuranceCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.lockup.PdpBridgeProductInfoTopSpanCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.logisticis.PdpBridgeUsShippingCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.modelcard.PdpBridgeSizeGuideCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.producthighlight.PdpBridgeHighlightCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.productinterlink.PdpBridgeInterlinkCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.productrecommend.PdpBridgeRecommendCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.PdpBridgeDealsEntranceCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.purchasemethod.PdpBridgePurchaseMethodCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.returnpolicy.PdpBridgeReturnPolicyCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.richtext.UsPdpRichTitleCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.PdpBridgeSESSellerCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.PdpBridgeSESShopPerfCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.PdpBridgeSpotlightCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shoprecommend.PdpBridgeShopPhaseTwoRecommendCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shoprecommend.PdpBridgeShopRecommendCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.skeleton.PdpBridgeSkeletonCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.PdpBridgeSkuCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.dropdown.PdpSkuPropDropdownCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.assem.selection.PdpSkuPropSelectionCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.spark.PdpBridgeLynxBrickCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.spark.PdpBridgeLynxCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.title.PdpBridgeTitleCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.topstoreidentity.UsPdpTopStoreIdentityCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.lazyload.PdpLynxCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.PdpBodyAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.module.PdpBodyTopAnchorCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.libra.EcPdpLockupFrameworkUpgradeConfig;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.libra.PdpLynxLazyLoadConfig;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.core.utils.KeyBoardVisibilityUtil;
import com.ss.android.ugc.aweme.ecommerce.core.utils.ScrollTopLinearLayoutManager;
import com.ss.android.ugc.aweme.ecommerce.dependency.ActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.performanceopt.PerformanceOptDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.share.ShareDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.performanceopt.IPerformanceOptDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.share.IShareDependencyService;
import com.zhiliaoapp.musically.R;
import g1c.AjS12S0000000_26;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS154S0400000_26;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS30S2200000_1;
import kotlin.jvm.internal.AwS38S0001000_26;
import kotlin.jvm.internal.AwS402S0200000_1;
import kotlin.jvm.internal.AwS427S0200000_26;
import kotlin.jvm.internal.AwS45S2100000_26;
import kotlin.jvm.internal.AwS461S0200000_26;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS640S0100000_26;
import kotlin.jvm.internal.AwS675S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KTypeProjection;
import org.json.JSONObject;
import p8b.c;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpBodyAssem extends UISlotAssem implements c, InterfaceC1164530gPT, InterfaceC1756840voo, InterfaceC1756080vna, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLIILL;
    public final AssemVMLazy LLJJI;
    public final PdpBodyAssem LLJJIII;
    public final PdpBodyAssem LLJJIJI;
    public KeyBoardVisibilityUtil LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final float LLJJJ;
    public final int LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public Map<String, Object> LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public final ViewTreeObserverOnGlobalLayoutListenerC1775940wJc LLLFF;
    public final C01GW LLLFFI;
    public boolean LLLFZ;
    public boolean LLLI;
    public AnimatorSet LLLII;
    public ValueAnimator LLLIIII;
    public final BPEAHandler LLLIIIIL;
    public boolean LLLIIIL;
    public final boolean LLLIIL;
    public final C1754960vlm LLLIILIL;
    public final C01GW LLLIL;
    public volatile InterfaceC1755020vls LLLILZ;
    public volatile InterfaceC1755040vlu LLLILZJ;
    public volatile InterfaceC1456405n0 LLLILZLLLI;
    public volatile InterfaceC1752680vi6 LLLIZZ;
    public volatile InterfaceC1763030vyn LLLJ;
    public volatile InterfaceC1755080vly LLLJIL;
    public volatile InterfaceC1761670vwb LLLJL;
    public volatile C1756150vnh LLLL;
    public C127G LLLLII;
    public InterfaceC665370Q7z LLLLIIIILLL;
    public C0QSJ LLLLIIL;

    /* JADX WARN: Type inference failed for: r0v30, types: [X.0vlm] */
    public PdpBodyAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PdpBodyVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 192), AFwS268S0000000_26.get$arr$(247), null, true);
        this.LLJJIII = this;
        this.LLJJIJI = this;
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1385));
        this.LLJJJ = C958103op.LIZJ() - C958103op.LJ();
        this.LLJJJIL = 44;
        this.LLJJJJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 477));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 193));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 476));
        this.LLJJL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 478));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 191));
        this.LLJL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 480));
        this.LLJLIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 194));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 479));
        this.LLJLLL = true;
        this.LLLFF = new ViewTreeObserverOnGlobalLayoutListenerC1775940wJc(this, 3);
        this.LLLFFI = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(140));
        this.LLLIIIIL = new BPEAHandler(Looper.getMainLooper());
        this.LLLIIL = true;
        this.LLLIILIL = new AbstractC1389240mFu() { // from class: X.0vlm
            @Override // X.AbstractC1389240mFu
            public final boolean LIZ(String str) {
                Context context;
                PdpViewModel pdpViewModelLp;
                Fragment fragmentLJI = C724240Sb0.LJI(this.LIZ);
                if (fragmentLJI != null && (context = fragmentLJI.getContext()) != null && (pdpViewModelLp = this.LIZ.lp()) != null && pdpViewModelLp.LLJIJIL) {
                    PdpBodyAssem pdpBodyAssem = this.LIZ;
                    if (pdpBodyAssem.LLLIIL && C948503nH.LIZJ(pdpBodyAssem) && !this.LIZ.zp()) {
                        this.LIZ.Ep(context, BitmapFactory.decodeFile(str));
                        return true;
                    }
                    return true;
                }
                return true;
            }
        };
        this.LLLIL = C452501pT.LIZIZ(new C1755060vlw(this));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.b31;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{PdpFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PdpFragmentScope.class);
        return arrayList;
    }

    @Override // p8b.c
    public final String getViewName() {
        return "PdpBodyWidget";
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x014f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zp() {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.PdpBodyAssem.zp():boolean");
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PdpBodyAssem.class, "confCenter", "getConfCenter()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/page/ability/IPdpConfigurationAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PdpBodyAssem.class, "lazyLoadManager", "getLazyLoadManager()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/lazyload/ILazyLoadManager;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(PdpBodyAssem.class, "moduleStayTracker", "getModuleStayTracker()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/lazyload/IModuleStayTracker;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(PdpBodyAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/page/body/PdpBodyVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(PdpBodyAssem.class, "pdpTabBarAbility", "getPdpTabBarAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/business/tabbar/IPdpTabBarAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(PdpBodyAssem.class, "galleryViewerAbility", "getGalleryViewerAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/business/carousel/assem/ICarouselGalleryViewerAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(PdpBodyAssem.class, "pdpTaskMgr", "getPdpTaskMgr()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/opt/ITaskManager;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(PdpBodyAssem.class, "pageViewModelAbility", "getPageViewModelAbility()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/page/ability/IPdpPageViewModelAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(PdpBodyAssem.class, "pdpPerfTrackService", "getPdpPerfTrackService()Lcom/ss/android/ugc/aweme/ecommerce/base/pdp/us/core/perf/tti/PdpRenderPerfService;", 0);
        c09r3.getClass();
        LLLLIILL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9};
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ip() {
        /*
            Method dump skipped, instruction units count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.body.PdpBodyAssem.Ip():void");
    }

    public final C0QSJ hp() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLLLIIL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLLIIIILLL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLLLIIIILLL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{PdpFragmentScope.class});
        this.LLLLIIL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final C1338500kw4 kp() {
        return (C1338500kw4) this.LLJJJJ.getValue();
    }

    public final PdpViewModel lp() {
        InterfaceC1761670vwb interfaceC1761670vwb = this.LLLJL;
        if (interfaceC1761670vwb == null) {
            synchronized (this) {
                interfaceC1761670vwb = this.LLLJL;
                if (interfaceC1761670vwb == null) {
                    C0QSJ c0qsjHp = hp();
                    if (c0qsjHp != null) {
                        interfaceC1761670vwb = (InterfaceC1761670vwb) c0qsjHp.getAbility(InterfaceC1761670vwb.class);
                        C687700QyG.LJ(interfaceC1761670vwb, InterfaceC1761670vwb.class);
                    } else {
                        interfaceC1761670vwb = null;
                    }
                    this.LLLJL = interfaceC1761670vwb;
                }
            }
        }
        return interfaceC1761670vwb.lX();
    }

    public final InterfaceC1456405n0 mp() {
        InterfaceC1456405n0 interfaceC1456405n0;
        InterfaceC1456405n0 interfaceC1456405n02 = this.LLLILZLLLI;
        if (interfaceC1456405n02 == null) {
            synchronized (this) {
                interfaceC1456405n02 = this.LLLILZLLLI;
                if (interfaceC1456405n02 == null) {
                    C0QSJ c0qsjHp = hp();
                    if (c0qsjHp != null) {
                        interfaceC1456405n0 = (InterfaceC1456405n0) c0qsjHp.getAbility(InterfaceC1456405n0.class);
                        C687700QyG.LJ(interfaceC1456405n0, InterfaceC1456405n0.class);
                    } else {
                        interfaceC1456405n0 = null;
                    }
                    this.LLLILZLLLI = interfaceC1456405n0;
                    return interfaceC1456405n0;
                }
            }
        }
        return interfaceC1456405n02;
    }

    public final C1756150vnh op() {
        C1756150vnh c1756150vnh = this.LLLL;
        if (c1756150vnh == null) {
            synchronized (this) {
                c1756150vnh = this.LLLL;
                if (c1756150vnh == null) {
                    C0QSJ c0qsjHp = hp();
                    C1756150vnh c1756150vnh2 = c0qsjHp != null ? (C1756150vnh) c0qsjHp.getAbility(C1756150vnh.class) : null;
                    this.LLLL = c1756150vnh2;
                    return c1756150vnh2;
                }
            }
        }
        return c1756150vnh;
    }

    public final InterfaceC1752680vi6 sp() {
        InterfaceC1752680vi6 interfaceC1752680vi6 = this.LLLIZZ;
        if (interfaceC1752680vi6 == null) {
            synchronized (this) {
                interfaceC1752680vi6 = this.LLLIZZ;
                if (interfaceC1752680vi6 == null) {
                    C0QSJ c0qsjHp = hp();
                    InterfaceC1752680vi6 interfaceC1752680vi62 = c0qsjHp != null ? (InterfaceC1752680vi6) c0qsjHp.getAbility(InterfaceC1752680vi6.class) : null;
                    this.LLLIZZ = interfaceC1752680vi62;
                    return interfaceC1752680vi62;
                }
            }
        }
        return interfaceC1752680vi6;
    }

    public final InterfaceC1755080vly tp() {
        InterfaceC1755080vly interfaceC1755080vly;
        InterfaceC1755080vly interfaceC1755080vly2 = this.LLLJIL;
        if (interfaceC1755080vly2 == null) {
            synchronized (this) {
                interfaceC1755080vly2 = this.LLLJIL;
                if (interfaceC1755080vly2 == null) {
                    C0QSJ c0qsjHp = hp();
                    if (c0qsjHp != null) {
                        interfaceC1755080vly = (InterfaceC1755080vly) c0qsjHp.getAbility(InterfaceC1755080vly.class);
                        C687700QyG.LJ(interfaceC1755080vly, InterfaceC1755080vly.class);
                    } else {
                        interfaceC1755080vly = null;
                    }
                    this.LLLJIL = interfaceC1755080vly;
                    return interfaceC1755080vly;
                }
            }
        }
        return interfaceC1755080vly2;
    }

    public final C1749280vcc up() {
        return (C1749280vcc) this.LLJJJJJIL.getValue();
    }

    public final PdpBodyVM yp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLIILL;
        return (PdpBodyVM) assemVMLazy.getValue();
    }

    public final void Ap() {
        ViewTreeObserver viewTreeObserver = kp().getViewTreeObserver();
        if (viewTreeObserver != null) {
            ViewTreeObserverOnGlobalLayoutListenerC1775940wJc viewTreeObserverOnGlobalLayoutListenerC1775940wJc = this.LLLFF;
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1775940wJc);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1775940wJc, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    public final void Gp() {
        LinearLayoutManager linearLayoutManager;
        C04DW c04dw;
        String godaNodeId;
        C1755690vmx currentState;
        C04DW c04dw2;
        C1338500kw4 c1338500kw4Kp = kp();
        RecyclerView.LayoutManager layoutManager = c1338500kw4Kp.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            return;
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition != -1) {
            if (iFindLastVisibleItemPosition != -1) {
                int height = c1338500kw4Kp.getHeight();
                List<InterfaceC1891350zJl> listItems = kp().getListItems();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition) {
                    int i = iFindFirstVisibleItemPosition;
                    while (true) {
                        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(i);
                        if (viewFindViewByPosition != null) {
                            Object objLJJJLZIJ = C13LP.LJJJLZIJ(i, listItems);
                            if ((objLJJJLZIJ instanceof C04DW) && (c04dw2 = (C04DW) objLJJJLZIJ) != null) {
                                String godaNodeId2 = c04dw2.getGodaNodeId();
                                if (!Intrinsics.LJFF(godaNodeId2, "undefined")) {
                                    linkedHashMap.put(godaNodeId2, new C1455905mv(Math.max(0, Math.min(viewFindViewByPosition.getBottom(), height) - Math.max(viewFindViewByPosition.getTop(), 0)), viewFindViewByPosition.getTop(), viewFindViewByPosition.getBottom()));
                                }
                            }
                        }
                        if (i == iFindLastVisibleItemPosition) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                mp().Fb(height, linkedHashMap);
            }
            if (iFindFirstVisibleItemPosition != -1 && iFindLastVisibleItemPosition != -1) {
                InterfaceC1752680vi6 interfaceC1752680vi6Sp = sp();
                int i2 = (interfaceC1752680vi6Sp == null || (currentState = interfaceC1752680vi6Sp.getCurrentState()) == null) ? 0 : currentState.LLILZ;
                while (iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition) {
                    View viewFindViewByPosition2 = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                    if (viewFindViewByPosition2 == null || viewFindViewByPosition2.getBottom() > i2) {
                        break;
                    } else {
                        iFindFirstVisibleItemPosition++;
                    }
                }
                List<InterfaceC1891350zJl> listItems2 = kp().getListItems();
                if (iFindFirstVisibleItemPosition < 0 || iFindFirstVisibleItemPosition >= listItems2.size()) {
                    C1019103yf.LIZ(EnumC1014603xw.ERR_PDP_ASSEM_VISIBLE_POS_OUT_OF_RANGE, null, null);
                    return;
                }
                IntRange intRange = new IntRange(iFindFirstVisibleItemPosition, iFindLastVisibleItemPosition);
                ArrayList arrayList = new ArrayList();
                C531650Kt9 it2 = intRange.iterator();
                while (it2.LLILLL) {
                    Object objLJJJLZIJ2 = C13LP.LJJJLZIJ(it2.nextInt(), listItems2);
                    if ((objLJJJLZIJ2 instanceof C04DW) && (c04dw = (C04DW) objLJJJLZIJ2) != null && (godaNodeId = c04dw.getGodaNodeId()) != null) {
                        arrayList.add(godaNodeId);
                    }
                }
                PdpViewModel pdpViewModelLp = lp();
                pdpViewModelLp.getClass();
                pdpViewModelLp.setState(new AwS605S0100000_26(arrayList, (List<C1745680vWo>) 919));
                return;
            }
        }
        C1019103yf.LIZ(EnumC1014603xw.ERR_PDP_ASSEM_VISIBLE_POS_NO_POSITION, null, null);
    }

    @Override // X.InterfaceC1756080vna
    public final void cn() {
        if (EcPdpLockupFrameworkUpgradeConfig.LIZIZ()) {
            return;
        }
        yp().LLJ = true;
        if (((Boolean) C268660Afw.LIZ.getValue()).booleanValue() && (C13LP.LJJJLL(kp().getListItems()) instanceof C04DX)) {
            C20600815jK.LJIILIIL(kp().getState(), 0);
        }
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLLLII;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLLLII;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{PdpBodyVM.class, new AObjectS400S0100000_26(this, 10)}, defaultViewModelProviderFactory);
                    this.LLLLII = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    public final String ip() {
        LinearLayoutManager linearLayoutManager;
        PdpViewModel pdpViewModelLp;
        C1058304Bx c1058304Bx;
        RecyclerView.LayoutManager layoutManager = kp().getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null && (pdpViewModelLp = lp()) != null && (c1058304Bx = (C1058304Bx) pdpViewModelLp.LLJLLIL.getValue()) != null) {
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            ArrayList arrayList = new ArrayList();
            if (iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition) {
                while (true) {
                    Object obj = ((LinkedHashMap) c1058304Bx.LIZIZ).get(Integer.valueOf(iFindFirstVisibleItemPosition));
                    if (obj != null) {
                        arrayList.add(obj);
                    }
                    if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                        break;
                    }
                    iFindFirstVisibleItemPosition++;
                }
            }
            List<String> list = c1058304Bx.LIZ;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : (ArrayList) list) {
                if (arrayList.contains(obj2) && !c1058304Bx.LIZJ.contains(obj2)) {
                    arrayList2.add(obj2);
                }
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62);
            if (strLJJLIIIJ != null) {
                return strLJJLIIIJ;
            }
        }
        return "";
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        String str;
        String str2;
        String str3;
        AnonymousClass0317 anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin;
        Activity.ScreenCaptureCallback screenCaptureCallback;
        Fragment fragmentLJI;
        C19EG activity;
        String str4;
        super.onDestroy();
        PdpViewModel pdpViewModelLp = lp();
        if (pdpViewModelLp == null) {
            return;
        }
        C1054004Ag c1054004Ag = pdpViewModelLp.LLJLILLLLZIIL;
        if (c1054004Ag != null) {
            c1054004Ag.LJJIIJZLJL.clear();
        }
        ProductPackStruct productPackStruct = pdpViewModelLp.LLJILLL;
        String str5 = "";
        if (productPackStruct == null || (str = productPackStruct.productId) == null) {
            str = "";
        }
        C1760500vui.LIZ(str);
        Ap();
        KeyBoardVisibilityUtil keyBoardVisibilityUtil = this.LLJJIJIIJIL;
        if (keyBoardVisibilityUtil != null) {
            keyBoardVisibilityUtil.onDestroy();
        }
        C1713070ugD.LIZIZ(this);
        ((LinkedHashMap) C732802ta.LIZ).clear();
        C04BA c04ba = pdpViewModelLp.LLLLLZL;
        FrameLayout frameLayout = (FrameLayout) this.LLJJLIIIJLLLLLLLZ.getValue();
        for (View view : ((LinkedHashMap) c04ba.LJ).values()) {
            if (frameLayout != null) {
                C786410Ut5.LJJJZ(view, frameLayout);
            }
        }
        ((LinkedHashMap) c04ba.LJ).clear();
        c04ba.LIZIZ.clear();
        c04ba.LIZJ = null;
        ProductPackStruct productPackStruct2 = pdpViewModelLp.LLJILLL;
        if (productPackStruct2 != null && (str4 = productPackStruct2.productId) != null) {
            str5 = str4;
        }
        boolean z = pdpViewModelLp.LLJILJILJ;
        IPdpStarter.PdpEnterParam pdpEnterParam = pdpViewModelLp.LLJI;
        if (pdpEnterParam != null) {
            str2 = pdpEnterParam.awemeId;
            str3 = pdpEnterParam.clickFrom;
        } else {
            str2 = null;
            str3 = null;
        }
        C1440005kM.LIZ(new C1034540d1o(4, str5, str2, str3, Integer.valueOf(z ? 2 : 3)));
        C1755630vmr c1755630vmr = (C1755630vmr) this.LLLFFI.getValue();
        c1755630vmr.LIZIZ = null;
        c1755630vmr.LIZJ = null;
        AnonymousClass0378.LIZ().LIZJ("ec_live_shop_widget_on_destroy", this);
        C1427600nFm c1427600nFmGR2 = pdpViewModelLp.GR2();
        c1427600nFmGR2.getClass();
        try {
            C785860UsC c785860UsC = c1427600nFmGR2.LJII;
            if (c785860UsC != null) {
                c785860UsC.cancel();
            }
            ((Timer) c1427600nFmGR2.LJI.getValue()).cancel();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (Build.VERSION.SDK_INT >= 34) {
            Object value = this.LLLIL.getValue();
            if ((value instanceof Activity.ScreenCaptureCallback) && (screenCaptureCallback = (Activity.ScreenCaptureCallback) value) != null && (fragmentLJI = C724240Sb0.LJI(this)) != null && (activity = fragmentLJI.getActivity()) != null) {
                activity.unregisterScreenCaptureCallback(screenCaptureCallback);
            }
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IActivityStackDependencyService.class.getName(), anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IActivityStackDependencyService.class);
        }
        ((IActivityStackDependencyService) anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin).removeAppBackGroundListener((C18ZQ) this.LLJJIJIL.getValue());
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin = ShareDependencyService.createIShareDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime2, 1, IShareDependencyService.class.getName(), anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IShareDependencyService.class);
        }
        ((IShareDependencyService) anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin).removeScreenShotListener(this.LLLIILIL);
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        mp().pause();
        Ip();
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        C1756090vnb c1756090vnb;
        Type type;
        super.onResume();
        mp().resume();
        PdpViewModel pdpViewModelLp = lp();
        if (pdpViewModelLp == null) {
            return;
        }
        C1755050vlv c1755050vlv = new C1755050vlv(pdpViewModelLp.getProductId());
        c1755050vlv.LIZ.put("enter_from_merge", pdpViewModelLp.IR2());
        c1755050vlv.LIZIZ();
        pdpViewModelLp.a.LIZJ((InterfaceC1748810vbr) C724240Sb0.LJI(this), pdpViewModelLp, pdpViewModelLp.getProductId());
        C1766860w4y.LIZ.getClass();
        String strLIZIZ = C1766860w4y.LIZIZ("search_query_data");
        Map<String, Object> map = null;
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            if (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) {
                type = new TypeToken<Map<String, Object>>() { // from class: X.0vln
                }.getType();
            } else {
                C13JX c13jx = KTypeProjection.LIZJ;
                C13JW c13jwLJII = C13LE.LJII(String.class);
                c13jx.getClass();
                type = C2371409Qy.LIZJ(C13LE.LIZJ(C13LE.LJIIIZ(Map.class, C13JX.LIZ(c13jwLJII), C13JX.LIZ(C13LE.LJII(Object.class)))));
            }
            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, strLIZIZ, type);
            if (!C19719512Dh.LJII(objFromJson)) {
                objFromJson = null;
            }
            map = (Map) objFromJson;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LLJZ = map;
        pdpViewModelLp.GR2().LJ();
        C1756150vnh c1756150vnhOp = op();
        if (c1756150vnhOp == null || (c1756090vnb = c1756150vnhOp.LIZ) == null || c1756090vnb.LIZ().get("t_fragment_lifecycle_handler_start") == null) {
            return;
        }
        c1756090vnb.LJII("t_fragment_lifecycle_handler_end", true);
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        C1054004Ag c1054004Ag;
        super.onStart();
        PdpViewModel pdpViewModelLp = lp();
        if (pdpViewModelLp != null && (c1054004Ag = pdpViewModelLp.LLJLILLLLZIIL) != null) {
            c1054004Ag.LJI = SystemClock.elapsedRealtime();
            c1054004Ag.LJII = System.currentTimeMillis();
        }
        Ip();
        this.LLJLLIL = false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        AnonymousClass0317 anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin;
        super.onStop();
        final PdpViewModel pdpViewModelLp = lp();
        if (pdpViewModelLp == null) {
            return;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IActivityStackDependencyService.class.getName(), anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IActivityStackDependencyService.class);
        }
        if (((IActivityStackDependencyService) anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin).isAppBackGround()) {
            C1054004Ag c1054004Ag = pdpViewModelLp.LLJLILLLLZIIL;
            if (c1054004Ag != null) {
                c1054004Ag.LJJIII = "close";
            }
            C1755530vmh c1755530vmh = new C1755530vmh(pdpViewModelLp.getProductId());
            c1755530vmh.LIZJ(((ECBaseFragment) C724240Sb0.LJI(this)).SR());
            EnumC1755520vmg enumC1755520vmg = EnumC1755520vmg.CLOSE;
            c1755530vmh.LIZLLL(enumC1755520vmg);
            c1755530vmh.LIZIZ();
            C1054004Ag c1054004Ag2 = pdpViewModelLp.LLJLILLLLZIIL;
            if (c1054004Ag2 != null) {
                c1054004Ag2.LJJIII(enumC1755520vmg);
            }
        }
        C1054004Ag c1054004Ag3 = pdpViewModelLp.LLJLILLLLZIIL;
        final long jElapsedRealtime2 = 0;
        if (c1054004Ag3 != null) {
            long j = c1054004Ag3.LJI;
            if (j != 0) {
                jElapsedRealtime2 = SystemClock.elapsedRealtime() - j;
            }
        }
        C785860UsC c785860UsC = pdpViewModelLp.GR2().LJII;
        if (c785860UsC != null) {
            c785860UsC.cancel();
        }
        ExecutorC10416045m.LLILLJJLI.execute(new Runnable() { // from class: X.049x
            /* JADX WARN: Removed duplicated region for block: B:118:0x02fd A[PHI: r1
              0x02fd: PHI (r1v13 com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO) = 
              (r1v4 com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO)
              (r1v14 com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO)
             binds: [B:117:0x02fb, B:113:0x02f3] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:125:0x030f  */
            /* JADX WARN: Removed duplicated region for block: B:137:0x0354  */
            /* JADX WARN: Removed duplicated region for block: B:160:0x0417  */
            /* JADX WARN: Removed duplicated region for block: B:169:0x0431  */
            /* JADX WARN: Removed duplicated region for block: B:174:0x043d A[PHI: r25
              0x043d: PHI (r25v1 java.lang.Float) = (r25v0 java.lang.Float), (r25v3 java.lang.Float) binds: [B:172:0x0439, B:124:0x030d] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:175:0x0441  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ() {
                /*
                    Method dump skipped, instruction units count: 1100
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC10531049x.LIZ():void");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PdpBodyAssem@f8a4.onStop$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PdpBodyAssem@f8a4.onStop$1");
            }
        });
    }

    public final void Fp(RecyclerView recyclerView) {
        boolean z;
        int i;
        C1755030vlt c1755030vlt;
        int height;
        ProductPackStruct productPackStruct;
        Integer num;
        PdpViewModel pdpViewModelLp = lp();
        if (pdpViewModelLp == null) {
            return;
        }
        Resources resources = recyclerView.getContext().getResources();
        ProductPackStruct productPackStruct2 = pdpViewModelLp.LLJILLL;
        if (productPackStruct2 != null && (num = productPackStruct2.status) != null && num.intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z && (productPackStruct = pdpViewModelLp.LLJILLL) != null && productPackStruct.unavailableInfo != null) {
            i = R.dimen.o4;
        } else {
            i = R.dimen.o3;
        }
        float dimension = resources.getDimension(i);
        int[] iArr = new int[2];
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
            return;
        }
        while (true) {
            View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
            if (viewFindViewByPosition == null) {
                return;
            }
            Object tag = viewFindViewByPosition.getTag(R.id.ei0);
            if ((tag instanceof C1755030vlt) && (c1755030vlt = (C1755030vlt) tag) != null) {
                viewFindViewByPosition.getLocationInWindow(iArr);
                int i2 = iArr[1];
                View contentView = getContentView();
                if (contentView != null) {
                    height = contentView.getHeight();
                } else {
                    height = 0;
                }
                int i3 = (int) (height - dimension);
                if (1 <= i2 && i2 < i3) {
                    if (!c1755030vlt.LIZIZ) {
                        c1755030vlt.LIZIZ = true;
                        Object obj = c1755030vlt.LIZ;
                        if ((obj instanceof C1406720mi6) && Intrinsics.LJFF(((C1406720mi6) obj).LLILLJJLI, "title")) {
                            if (i2 < i3 / 2) {
                                c1755030vlt.LIZIZ = true;
                            }
                        } else {
                            Object obj2 = c1755030vlt.LIZ;
                            if (obj2 instanceof ReviewItemStruct) {
                                if (pdpViewModelLp.LLJLILLLLZIIL != null) {
                                    C1054004Ag.LJJJJZ(new AwS402S0200000_1(pdpViewModelLp, c1755030vlt, 34), false);
                                }
                            } else if ((obj2 instanceof InterfaceC1755100vm0) && pdpViewModelLp.LLJLILLLLZIIL != null) {
                                C1054004Ag.LJJJJZ(new AwS427S0200000_26(pdpViewModelLp, c1755030vlt, 30), false);
                            }
                        }
                    }
                } else if (c1755030vlt.LIZIZ) {
                    c1755030vlt.LIZIZ = false;
                }
            }
            if (iFindFirstVisibleItemPosition != iFindLastVisibleItemPosition) {
                iFindFirstVisibleItemPosition++;
            } else {
                return;
            }
        }
    }

    @Override // X.InterfaceC1756840voo
    public final void V0(boolean z) {
        C1338500kw4 c1338500kw4Kp = kp();
        if (c1338500kw4Kp != null) {
            c1338500kw4Kp.LLJILJILJ = z;
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PdpFragmentScope.class});
        c0qsjLIZIZ.unbindAbility(this.LLJJIJI, InterfaceC1756080vna.class);
        c0qsjLIZIZ.unbindAbility(this.LLJJIII, InterfaceC1756840voo.class);
        c0qsjLIZIZ.unbindAbility(yp(), InterfaceC1755770vn5.class);
    }

    @C14EU
    public final void onRefreshPdp(C037C c037c) {
        String str;
        PdpViewModel pdpViewModelLp;
        ProductPackStruct productPackStruct;
        String str2 = c037c.LIZ;
        PdpViewModel pdpViewModelLp2 = lp();
        if (pdpViewModelLp2 != null && (productPackStruct = pdpViewModelLp2.LLJILLL) != null) {
            str = productPackStruct.productId;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str2, str) && (pdpViewModelLp = lp()) != null) {
            PdpViewModel.lS2(pdpViewModelLp, false, true, null, false, false, 124);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int iIntValue;
        AnonymousClass0317 anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin;
        boolean z;
        boolean z2;
        String name;
        Context context;
        Activity.ScreenCaptureCallback screenCaptureCallback;
        C19EG activity;
        C04BA c04ba;
        C04BA c04ba2;
        boolean z3;
        String name2;
        C19EG c19eg;
        super.onViewCreated(view);
        C1749280vcc c1749280vccUp = up();
        PdpViewModel pdpViewModelLp = lp();
        if (pdpViewModelLp == null || !pdpViewModelLp.LLJIJIL) {
            C426750GoL.LJIIL(c1749280vccUp, null, null, null, Integer.valueOf((int) this.LLJJJ), 23);
        }
        C01GW c01gw = C954703oH.LIZ;
        c1749280vccUp.LIZIZ(C954703oH.LIZ(c1749280vccUp.getContext(), R.layout.ars, c1749280vccUp, false));
        C786410Ut5.I7(new AjS12S0000000_26(5), c1749280vccUp);
        C0H9H.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), (View) this.LLJJL.getValue());
        C1338500kw4 c1338500kw4Kp = kp();
        c1338500kw4Kp.getState().LIZLLL = C0Q4Y.BUFFER;
        C1326490kch c1326490kch = C1326490kch.LIZ;
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(this, 1525);
        c1326490kch.getClass();
        C1326490kch.LIZIZ(awS570S0100000_26);
        Map<String, Integer> map = C1158380gFY.LIZ;
        c1338500kw4Kp.LJIILJJIL(PdpBodyTopAnchorCell.class, PdpCarouselCell.class, PdpBridgeHeaderCell.class, PdpBridgeSkeletonCell.class, PdpBridgeSkuCell.class, PdpSkuPropSelectionCell.class, PdpSkuPropDropdownCell.class, PdpBridgeDividerCell.class, PdpBridgeDescTextCell.class, PdpBridgeSpanCell.class, PdpBridgeHighlightCell.class, PdpBridgeDealsEntranceCell.class, PdpBridgeDescImageCell.class, PdpBridgeVideoCell.class, PdpBridgeRecommendCell.class, PdpBridgeLynxBrickCell.class, PdpBridgeTitleCell.class, PdpBridgeProductInfoTopSpanCell.class, PdpBridgeReturnPolicyCell.class, PdpBridgeSESShopPerfCell.class, PdpBridgeSpotlightCell.class, PdpAboutThisProductHeaderCell.class, PdpBridgeActionCardCell.class, PdpBridgePurchaseMethodCell.class, PdpBridgeInsuranceCell.class, PdpBridgeNoticeCell.class, PdpBridgeInterlinkCell.class, PdpBundleDealCell.class, PdpBridgeSizeGuideCell.class, UsPdpTopStoreIdentityCell.class, UsPdpRichTitleCell.class, UsPdpDividerCell.class, PdpBridgeUsShippingCell.class);
        Iterator<T> it2 = C1158380gFY.LIZ.values().iterator();
        while (it2.hasNext()) {
            int iIntValue2 = ((Number) it2.next()).intValue();
            if (iIntValue2 > 52000) {
                c1338500kw4Kp.LJIJ(new C1723500ux2(iIntValue2, PdpLynxCell.class));
            } else {
                c1338500kw4Kp.LJIJ(new C1723500ux2(iIntValue2, PdpBridgeLynxCell.class));
            }
        }
        c1338500kw4Kp.LJIJ(new C1723500ux2(55004, PdpBridgeHeaderCell.class), new C1723500ux2(55005, PdpBridgeHeaderCell.class), new C1723500ux2(55006, PdpCarouselCell.class));
        c1338500kw4Kp.LJIJ(new C1723500ux2(55001, PdpBridgeSESSellerCell.class), new C1723500ux2(55002, PdpBridgeSESSellerCell.class), new C1723500ux2(55003, PdpBridgeSESSellerCell.class));
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_pdp_same_store_recommendation", true) == 1) {
            c1338500kw4Kp.LJIILJJIL(PdpBridgeShopPhaseTwoRecommendCell.class);
        } else {
            c1338500kw4Kp.LJIILJJIL(PdpBridgeShopRecommendCell.class);
        }
        String name3 = null;
        c1338500kw4Kp.setItemAnimator(null);
        ScrollTopLinearLayoutManager scrollTopLinearLayoutManager = new ScrollTopLinearLayoutManager(c1338500kw4Kp.getContext());
        scrollTopLinearLayoutManager.LL = 0;
        c1338500kw4Kp.setLayoutManager(scrollTopLinearLayoutManager);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ng, c1338500kw4Kp.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        c1338500kw4Kp.addItemDecoration(new C1058220de0(iIntValue, (int) C12ES.LIZJ(0.5f, c1338500kw4Kp.getContext()), C12ES.LIZJ(16.0f, c1338500kw4Kp.getContext())));
        c1338500kw4Kp.setDownListener(new InterfaceC1338540kw8() { // from class: X.0vlE
            @Override // X.InterfaceC1338540kw8
            public final void LIZ() {
                PdpViewModel pdpViewModelLp2 = this.LIZ.lp();
                if (pdpViewModelLp2 != null) {
                    pdpViewModelLp2.LLZLI = true;
                }
            }
        });
        c1338500kw4Kp.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0vjv
            public int LL;
            public int LLILLJJLI;

            @Override // X.AbstractC1585810rMx
            public final void LJJIIJ(RecyclerView recyclerView, int i) {
                InterfaceC1752680vi6 interfaceC1752680vi6Sp;
                String str;
                PdpViewModel pdpViewModelLp2 = this.LLILLL.lp();
                if (pdpViewModelLp2 == null) {
                    return;
                }
                if (this.LL > C958103op.LJ) {
                    pdpViewModelLp2.wR2("glide");
                    C1053804Ae c1053804Ae = pdpViewModelLp2.LLILZIL;
                    c1053804Ae.getClass();
                    Map<String, Object> mapLJ = c1053804Ae.LJ("a2270.b6661");
                    C1054004Ag c1054004Ag = pdpViewModelLp2.LLJLILLLLZIIL;
                    if (c1054004Ag != null) {
                        if (this.LL > this.LLILLJJLI) {
                            str = "down";
                        } else {
                            str = "up";
                        }
                        C1054004Ag.LJJJJZ(new AwS30S2200000_1(c1054004Ag, (C1054004Ag) "fulltodetail", str, (String) mapLJ, (Map<String, ? extends Object>) 1), false);
                    }
                    this.LLILLJJLI = this.LL;
                }
                pdpViewModelLp2.LLLLLLLZIL.LIZ = Integer.valueOf(i);
                if (i == 0) {
                    this.LLILLL.Gp();
                    if (!recyclerView.canScrollVertically(-1)) {
                        new C1753830vjx(pdpViewModelLp2.getProductId()).LIZIZ();
                        this.LL = 0;
                        pdpViewModelLp2.setState(new AwS38S0001000_26(0, 23));
                    }
                    C786410Ut5.W4((LinearLayout) this.LLILLL.LLJJL.getValue(), 1.0f);
                    C786410Ut5.T4((View) this.LLILLL.LLJJJJLIIL.getValue(), 1.0f);
                }
                if ((i == 0 || i == 1) && (interfaceC1752680vi6Sp = this.LLILLL.sp()) != null) {
                    interfaceC1752680vi6Sp.sm1(false);
                }
                if (i != 1 && i != 2) {
                    return;
                }
                C786410Ut5.W4((LinearLayout) this.LLILLL.LLJJL.getValue(), 0.5f);
                C786410Ut5.T4((View) this.LLILLL.LLJJJJLIIL.getValue(), 0.5f);
            }

            /* JADX WARN: Removed duplicated region for block: B:53:0x00f5  */
            @Override // X.AbstractC1585810rMx
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJJIIZI(androidx.recyclerview.widget.RecyclerView r9, int r10, int r11) {
                /*
                    Method dump skipped, instruction units count: 283
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1753810vjv.LJJIIZI(androidx.recyclerview.widget.RecyclerView, int, int):void");
            }
        });
        Context context2 = getContext();
        if ((context2 instanceof C19EG) && (c19eg = (C19EG) context2) != null) {
            this.LLJJIJIIJIL = new KeyBoardVisibilityUtil(c19eg, C20161913uj.LIZIZ(c19eg), new AwS640S0100000_26(this, 152));
        }
        final C1755630vmr c1755630vmr = (C1755630vmr) this.LLLFFI.getValue();
        C1338500kw4 c1338500kw4Kp2 = kp();
        InterfaceC1755640vms interfaceC1755640vms = new InterfaceC1755640vms() { // from class: X.0vll
            @Override // X.InterfaceC1755640vms
            public final void LIZ() {
                PdpViewModel pdpViewModelLp2 = this.LIZ.lp();
                if (pdpViewModelLp2 == null) {
                    return;
                }
                C1754810vlX c1754810vlX = new C1754810vlX(pdpViewModelLp2.getProductId());
                InterfaceC1755040vlu interfaceC1755040vlu = null;
                c1754810vlX.LIZJ(EnumC1754800vlW.DRAG, null);
                c1754810vlX.LIZIZ();
                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                PdpLynxLazyLoadConfig pdpLynxLazyLoadConfig = C1061704Df.LIZ;
                PdpLynxLazyLoadConfig pdpLynxLazyLoadConfig2 = (PdpLynxLazyLoadConfig) settingsManagerLIZLLL.LJIIIIZZ("ec_pdp_lynx_lazy_load_framework", PdpLynxLazyLoadConfig.class, pdpLynxLazyLoadConfig);
                if (pdpLynxLazyLoadConfig2 == null) {
                    pdpLynxLazyLoadConfig2 = pdpLynxLazyLoadConfig;
                }
                if (!pdpLynxLazyLoadConfig2.reviewModuleEnable) {
                    pdpViewModelLp2.LLLLLILLIL.LIZ();
                }
                PdpLynxLazyLoadConfig pdpLynxLazyLoadConfig3 = (PdpLynxLazyLoadConfig) SettingsManager.LIZLLL().LJIIIIZZ("ec_pdp_lynx_lazy_load_framework", PdpLynxLazyLoadConfig.class, pdpLynxLazyLoadConfig);
                if (pdpLynxLazyLoadConfig3 != null) {
                    pdpLynxLazyLoadConfig = pdpLynxLazyLoadConfig3;
                }
                if (!pdpLynxLazyLoadConfig.creatorVideoModuleEnable) {
                    pdpViewModelLp2.LLLLLZIL.LIZIZ();
                }
                PdpBodyAssem pdpBodyAssem = this.LIZ;
                InterfaceC1755040vlu interfaceC1755040vlu2 = pdpBodyAssem.LLLILZJ;
                if (interfaceC1755040vlu2 == null) {
                    synchronized (pdpBodyAssem) {
                        interfaceC1755040vlu2 = pdpBodyAssem.LLLILZJ;
                        if (interfaceC1755040vlu2 == null) {
                            C0QSJ c0qsjHp = pdpBodyAssem.hp();
                            if (c0qsjHp != null) {
                                interfaceC1755040vlu = (InterfaceC1755040vlu) c0qsjHp.getAbility(InterfaceC1755040vlu.class);
                                C687700QyG.LJ(interfaceC1755040vlu, InterfaceC1755040vlu.class);
                            }
                            pdpBodyAssem.LLLILZJ = interfaceC1755040vlu;
                            interfaceC1755040vlu2 = interfaceC1755040vlu;
                        }
                    }
                }
                interfaceC1755040vlu2.LJIJJ();
            }

            @Override // X.InterfaceC1755640vms
            public final void LIZIZ() {
                PdpViewModel pdpViewModelLp2 = this.LIZ.lp();
                if (pdpViewModelLp2 == null) {
                    return;
                }
                C1754810vlX c1754810vlX = new C1754810vlX(pdpViewModelLp2.getProductId());
                c1754810vlX.LIZJ(EnumC1754800vlW.STOP, null);
                c1754810vlX.LIZIZ();
            }

            @Override // X.InterfaceC1755640vms
            public final void LIZLLL() {
                C1546400qLO.LIZ(C1546400qLO.LIZ, this.LIZ.getContext(), 11, EnumC1755660vmu.SCROLL.getValue(), null, null, 24);
            }

            @Override // X.InterfaceC1755640vms
            public final void LIZJ(boolean z4) {
                PdpViewModel pdpViewModelLp2 = this.LIZ.lp();
                if (pdpViewModelLp2 == null) {
                    return;
                }
                C1754810vlX c1754810vlX = new C1754810vlX(pdpViewModelLp2.getProductId());
                c1754810vlX.LIZJ(EnumC1754800vlW.FLING, Boolean.valueOf(z4));
                c1754810vlX.LIZIZ();
            }
        };
        c1755630vmr.LIZIZ = c1338500kw4Kp2;
        c1755630vmr.LIZJ = interfaceC1755640vms;
        c1338500kw4Kp2.setFlingListener(new AbstractC1338480kw2() { // from class: X.0vlr
            @Override // X.AbstractC1338480kw2
            public final boolean LIZ(int i, int i2) {
                boolean z4;
                InterfaceC1755640vms interfaceC1755640vms2 = c1755630vmr.LIZJ;
                if (interfaceC1755640vms2 != null) {
                    if (i2 >= 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    interfaceC1755640vms2.LIZJ(z4);
                }
                return false;
            }
        });
        c1338500kw4Kp2.addOnScrollListener(new AsS35S0200000_26(c1755630vmr, c1338500kw4Kp2, 3));
        C786410Ut5.x3(kp().getViewTreeObserver(), this.LLLFF);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin = PerformanceOptDependencyService.createIPerformanceOptDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            String name4 = IPerformanceOptDependencyService.class.getName();
            if (anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin != null) {
                name2 = anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name2 = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name4, name2, z3);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IPerformanceOptDependencyService.class);
        }
        ((IPerformanceOptDependencyService) anonymousClass0317CreateIPerformanceOptDependencyServicebyMonsterPlugin).createFpsMonitor("tiktokec_anchor_product_detail").LIZIZ(kp());
        View view2 = (View) this.LLJJJJLIIL.getValue();
        C786410Ut5.LJLLLLLL(8, view2);
        C786410Ut5.I7(new ACListenerS160S0100000_26(this, 72), view2);
        C786410Ut5.hd((LinearLayout) this.LLJLILLLLZIIL.getValue(), (C958103op.LIZJ() * 0.6666667f) + 120);
        final PdpViewModel pdpViewModelLp2 = lp();
        if (pdpViewModelLp2 != null) {
            final PdpFragment pdpFragment = (PdpFragment) C724240Sb0.LJI(this);
            ((C1755500vme) getContentView().findViewById(R.id.c8_)).setListener(new InterfaceC1755510vmf() { // from class: X.0vlD
                @Override // X.InterfaceC1755510vmf
                public final boolean LIZ() {
                    return pdpViewModelLp2.ZR2();
                }

                @Override // X.InterfaceC1755510vmf
                public final void LIZIZ() {
                    String string;
                    ProductUnavailableInfo productUnavailableInfo;
                    if (this.LLJLLL) {
                        C1389890mGx c1389890mGx = new C1389890mGx(pdpFragment);
                        ProductPackStruct productPackStruct = pdpViewModelLp2.LLJILLL;
                        if (productPackStruct == null || (productUnavailableInfo = productPackStruct.productUnavailableInfo) == null || (string = productUnavailableInfo.text) == null || string.length() <= 0) {
                            string = C7879035x.LIZ().getString(2131845266);
                        }
                        c1389890mGx.LJIIJ(string);
                        c1389890mGx.LJIIJJI();
                        PdpViewModel pdpViewModel = pdpViewModelLp2;
                        C1054004Ag c1054004Ag = pdpViewModel.LLJLILLLLZIIL;
                        if (c1054004Ag != null) {
                            String strJR2 = pdpViewModel.JR2();
                            InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ = c1054004Ag.LJJIJLIJ();
                            if (interfaceC1748810vbrLJJIJLIJ != null) {
                                C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new AnonymousClass0481(), new AwS45S2100000_26(c1054004Ag, strJR2, 17));
                            }
                        }
                    }
                }

                @Override // X.InterfaceC1755510vmf
                public final void LIZJ() {
                    PdpBodyAssem pdpBodyAssem = this;
                    if (pdpBodyAssem.LLJLLL) {
                        return;
                    }
                    pdpViewModelLp2.pR2(C724240Sb0.LIZ(pdpBodyAssem), pdpFragment);
                }

                @Override // X.InterfaceC1755510vmf
                public final void LJI() {
                    this.LLJLLL = true;
                }
            });
        }
        PdpViewModel pdpViewModelLp3 = lp();
        if (pdpViewModelLp3 != null && (c04ba2 = pdpViewModelLp3.LLLLLZL) != null) {
            c04ba2.LIZIZ = new WeakReference<>(this.LLJJLIIIJLLLLLLLZ.getValue());
        }
        PdpViewModel pdpViewModelLp4 = lp();
        if (pdpViewModelLp4 != null && (c04ba = pdpViewModelLp4.LLLLLZL) != null) {
            c04ba.LIZJ = new AwS570S0100000_26(this, 1524);
        }
        if (Build.VERSION.SDK_INT >= 34 && (context = getContext()) != null) {
            Object value = this.LLLIL.getValue();
            if ((value instanceof Activity.ScreenCaptureCallback) && (screenCaptureCallback = (Activity.ScreenCaptureCallback) value) != null) {
                Executor executorLIZJ = C838410Wul.LIZJ(context);
                Fragment fragmentLJI = C724240Sb0.LJI(this);
                if (fragmentLJI != null && (activity = fragmentLJI.getActivity()) != null) {
                    activity.registerScreenCaptureCallback(executorLIZJ, screenCaptureCallback);
                }
            }
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name5 = IActivityStackDependencyService.class.getName();
            if (anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, name5, name, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IActivityStackDependencyService.class);
        }
        ((IActivityStackDependencyService) anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin).addAppBackGroundListener((C18ZQ) this.LLJJIJIL.getValue());
        if (C10460047e.LIZ()) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin = ShareDependencyService.createIShareDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name6 = IShareDependencyService.class.getName();
                if (anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin != null) {
                    name3 = anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin.getClass().getName();
                }
                C1AQS.LIZJ(jElapsedRealtime3, 1, name6, name3, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IShareDependencyService.class);
            }
            ((IShareDependencyService) anonymousClass0317CreateIShareDependencyServicebyMonsterPlugin).addScreenShotListener(this.LLLIILIL);
        }
        AnonymousClass0378.LIZ().LIZLLL("ec_live_shop_widget_on_destroy", this);
        C736680Sv4.LJIIIIZZ(this, yp(), new C2217381BqS() { // from class: X.0vlh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1754870vld) obj).LL;
            }
        }, null, new AwS461S0200000_26(this, new C013C(), 15), 6);
        C736680Sv4.LJIIIZ(this, yp(), new C2217381BqS() { // from class: X.0vhP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1754870vld) obj).LLILLJJLI);
            }
        }, new C2217381BqS() { // from class: X.0vlq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1754870vld) obj).LLILLL;
            }
        }, null, new AwS675S0100000_26(this, 39), 12);
        C736680Sv4.LJIIIIZZ(this, yp(), new C2217381BqS() { // from class: X.0vli
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1754870vld) obj).LLILZ);
            }
        }, null, new AwS461S0200000_26(this, new C013C(), 16), 6);
        PdpBodyVM pdpBodyVMYp = yp();
        AwS154S0400000_26 awS154S0400000_26 = new AwS154S0400000_26(pdpBodyVMYp, new C2217381BqS() { // from class: X.0vle
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((C1754870vld) obj).LLILZIL);
            }
        }, new C2217381BqS() { // from class: X.0vlj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1754870vld) obj).LLILZ);
            }
        }, this, 28);
        if (C1756440voA.LIZ().postExpensiveTasks) {
            pdpBodyVMYp.LLILLJJLI.LIZJ(awS154S0400000_26);
        } else {
            awS154S0400000_26.invoke();
        }
        PdpBodyVM pdpBodyVMYp2 = yp();
        AwS270S0300000_26 awS270S0300000_26 = new AwS270S0300000_26(pdpBodyVMYp2, new C2217381BqS() { // from class: X.0vlo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1754870vld) obj).LLILZLL);
            }
        }, this, 138);
        if (C1756440voA.LIZ().postExpensiveTasks) {
            pdpBodyVMYp2.LLILLJJLI.LIZJ(awS270S0300000_26);
        } else {
            awS270S0300000_26.invoke();
        }
        PdpViewModel pdpViewModelLp5 = lp();
        if (pdpViewModelLp5 != null) {
            AwS605S0100000_26 awS605S0100000_26 = new AwS605S0100000_26(this, 770);
            if (!((ArrayList) pdpViewModelLp5.LLJJIJI).contains(awS605S0100000_26)) {
                ((ArrayList) pdpViewModelLp5.LLJJIJI).add(awS605S0100000_26);
            }
        }
        C736680Sv4.LJIIIZ(this, yp(), new C2217381BqS() { // from class: X.0vgo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1754870vld) obj).LLJ;
            }
        }, new C2217381BqS() { // from class: X.0vlp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1754870vld) obj).LLILZLL);
            }
        }, null, new AwS675S0100000_26(this, 40), 12);
        C736680Sv4.LJIIIIZZ(this, yp(), new C2217381BqS() { // from class: X.0vlg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1754870vld) obj).LLIZ;
            }
        }, C736820SvI.LIZLLL(), new AwS640S0100000_26(this, 150), 4);
        C736680Sv4.LJIIIIZZ(this, yp(), new C2217381BqS() { // from class: X.0vlf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1754870vld) obj).LLIZLLLIL;
            }
        }, C736820SvI.LIZLLL(), new AwS640S0100000_26(this, 151), 4);
        C1713070ugD.LIZ(this);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{PdpFragmentScope.class});
        c0qsjLIZIZ.bindAbility(this.LLJJIJI, InterfaceC1756080vna.class);
        c0qsjLIZIZ.bindAbility(this.LLJJIII, InterfaceC1756840voo.class);
        c0qsjLIZIZ.bindAbility(yp(), InterfaceC1755770vn5.class);
    }

    public final void Bp(float f, float f2) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLJLIL.getValue(), "rotation", f, f2);
        objectAnimatorOfFloat.setDuration(200L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    public final void Ep(Context context, Bitmap bitmap) {
        C1763690vzr c1763690vzr;
        Map<String, ? extends Object> map;
        IPdpStarter.PdpEnterParam pdpEnterParam;
        PdpViewModel pdpViewModelLp = lp();
        if (pdpViewModelLp != null && (c1763690vzr = pdpViewModelLp.LLLLLJLJLL) != null) {
            PdpViewModel pdpViewModelLp2 = lp();
            if (pdpViewModelLp2 != null && (pdpEnterParam = pdpViewModelLp2.LLJI) != null) {
                map = pdpEnterParam.trackParams;
            } else {
                map = null;
            }
            c1763690vzr.LIZIZ(context, "product_detail", map, bitmap, null);
        }
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        PdpViewModel pdpViewModelLp;
        Object obj;
        Map<String, Object> map;
        if (Intrinsics.LJFF(str, "ec_live_shop_widget_on_destroy")) {
            PdpFragment pdpFragment = (PdpFragment) C724240Sb0.LJI(this);
            Boolean bool = null;
            try {
                Object obj2 = new JSONObject(str2).get("room_id");
                if (obj2 != null) {
                    InterfaceC1755020vls interfaceC1755020vls = this.LLLILZ;
                    if (interfaceC1755020vls == null) {
                        synchronized (this) {
                            interfaceC1755020vls = this.LLLILZ;
                            if (interfaceC1755020vls == null) {
                                C0QSJ c0qsjHp = hp();
                                if (c0qsjHp != null) {
                                    interfaceC1755020vls = (InterfaceC1755020vls) c0qsjHp.getAbility(InterfaceC1755020vls.class);
                                    C687700QyG.LJ(interfaceC1755020vls, InterfaceC1755020vls.class);
                                } else {
                                    interfaceC1755020vls = null;
                                }
                                this.LLLILZ = interfaceC1755020vls;
                            }
                        }
                    }
                    IPdpStarter.PdpEnterParam pdpEnterParamV4 = interfaceC1755020vls.v4();
                    if (pdpEnterParamV4 != null && (map = pdpEnterParamV4.trackParams) != null) {
                        obj = map.get("lineup_room_id");
                    } else {
                        obj = null;
                    }
                    if (Intrinsics.LJFF(obj2, obj)) {
                        bool = Boolean.TRUE;
                    }
                }
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (Intrinsics.LJFF(bool, Boolean.TRUE) && (pdpViewModelLp = lp()) != null) {
                pdpViewModelLp.pR2(C724240Sb0.LIZ(this), pdpFragment);
            }
        }
    }
}
