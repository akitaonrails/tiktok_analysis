package com.ss.android.ugc.aweme.search.pages.result.videosearch.core.ui;

import X.AbstractC1255880imo;
import X.AbstractC641560PEk;
import X.AbstractC654930PmV;
import X.AbstractC661100PwS;
import X.AbstractC683590Qrd;
import X.C01GW;
import X.C07H8;
import X.C07L7;
import X.C0BE5;
import X.C0BRN;
import X.C0C64;
import X.C0N0Y;
import X.C0P5E;
import X.C0P6H;
import X.C0P6T;
import X.C0P6Y;
import X.C0P71;
import X.C0P7W;
import X.C0P8F;
import X.C0P8H;
import X.C0PCE;
import X.C0PCO;
import X.C0PDE;
import X.C0PDF;
import X.C0PIF;
import X.C0PL7;
import X.C0PME;
import X.C0PMF;
import X.C0PN2;
import X.C0PNL;
import X.C0PPU;
import X.C0PRC;
import X.C0PRW;
import X.C0PYE;
import X.C0Q3E;
import X.C0R42;
import X.C0SU6;
import X.C0VWN;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1108604Vg;
import X.C1200530hLX;
import X.C1388190mED;
import X.C1483370ohj;
import X.C14EU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1603960rqE;
import X.C1606420ruC;
import X.C1607950rwf;
import X.C16GX;
import X.C18177079z;
import X.C1820807Be;
import X.C19EG;
import X.C20533215Wg;
import X.C2097608Jq;
import X.C21689319uV;
import X.C2187451AjH;
import X.C2200821BBo;
import X.C2367809Po;
import X.C293680BfC;
import X.C294600Bgg;
import X.C294780Bgy;
import X.C430110Gtl;
import X.C436190H8n;
import X.C452501pT;
import X.C616540OGe;
import X.C639360P5y;
import X.C639380P6a;
import X.C639390P6b;
import X.C639420P6e;
import X.C639740P7k;
import X.C639800P7q;
import X.C639830P7t;
import X.C640060P8q;
import X.C641550PEj;
import X.C643350PLh;
import X.C643360PLi;
import X.C643400PLm;
import X.C643450PLr;
import X.C643800PNa;
import X.C644460PPo;
import X.C644560PPy;
import X.C644910PRh;
import X.C645140PSe;
import X.C646000PVm;
import X.C650950Pg5;
import X.C650960Pg6;
import X.C651290Pgd;
import X.C651970Phj;
import X.C651980Phk;
import X.C653660PkS;
import X.C659630Pu5;
import X.C660210Pv1;
import X.C660870Pw5;
import X.C661490Px5;
import X.C663370Q0h;
import X.C664000Q2s;
import X.C664030Q2v;
import X.C664290Q3v;
import X.C667750QHd;
import X.C723850SaN;
import X.C737030Svd;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC1581960rGk;
import X.InterfaceC1587520rPi;
import X.InterfaceC214897198d;
import X.InterfaceC214902198i;
import X.InterfaceC588610N6t;
import X.InterfaceC644470PPp;
import X.InterfaceC649890PeN;
import X.InterfaceC659300PtY;
import X.InterfaceC683650Qrj;
import Y.AObserverS214S0100000_10;
import Y.ARunnableS110S0100000_10;
import Y.ARunnableS12S0210000_10;
import Y.ARunnableS29S0110000_10;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchIntentStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorCustomData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.EnhancedProduct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.model.dataproviders.VerticalScrollDoubleColumnProvider;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.viewmodel.Taco;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchOriginalFragment;
import com.ss.android.ugc.aweme.search.pages.result.common.scrolling.firstscreen.assem.FirstScreenHelperAbility;
import com.ss.android.ugc.aweme.search.pages.result.videosearch.core.ui.SearchFeedFragment;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public class SearchFeedFragment extends SearchOriginalFragment<Aweme> implements InterfaceC659300PtY, InterfaceC683650Qrj, InterfaceC1587520rPi {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpKD0wIGs8KCg2O2s+LDwmHELIOSJDFiPyY3LSo/LC4hKy1iKiAhLWs5IGEALSQ+KicVLSAoDz0yLygpJzs=";
    public C643450PLr LLLLLL;
    public C0PNL LLLLLLIL;
    public final String LLLLLLJ;
    public C0P6Y LLLLLLL;
    public C639390P6b LLLLLLLLL;
    public C0P6T LLLLLLLLLL;
    public final C01GW LLLLLLLZIL;
    public C641550PEj LLLLLLZ;
    public C0PCO LLLLLLZZ;
    public VerticalScrollDoubleColumnProvider LLLLLZ;
    public final C01GW LLLLLZIL;
    public final C01GW LLLLLZL;

    @Override // X.InterfaceC1587520rPi
    public final void N8() {
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final boolean NR() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public final String cS() {
        return "video";
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final boolean lT() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void YS() {
        C645140PSe c645140PSe;
        this.LLLIIIL = this.LLLLLL.LJJJJ();
        this.LLLIIL = this.LLLLLL.LLILZLL;
        AbstractC683590Qrd<Aweme> abstractC683590QrdNS = NS();
        if (!(abstractC683590QrdNS instanceof C645140PSe) || (c645140PSe = (C645140PSe) abstractC683590QrdNS) == null) {
            return;
        }
        c645140PSe.LLILZLL = (C0P7W) this.LLLLLZL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void ZS() {
        this.LLLLLJIL = new C643350PLh(C0PL7.OUTFLOW);
        cU().LJIIJJI(this);
        C643800PNa<?> c643800PNaCU = cU();
        c643800PNaCU.LLILZIL = this;
        T t = c643800PNaCU.LL;
        if (t != 0) {
            ((C0PN2) t).LLJ = ZA();
        }
        cU().LLILZ = this.LLLLLL;
        this.LLLLLLIL = new C0PNL();
        ((C643350PLh) cU()).LJIIJ(this.LLLLLLIL);
        C0PNL c0pnl = this.LLLLLLIL;
        if (c0pnl != null) {
            c0pnl.LLJJJIL = "video_search";
        }
        if (getActivity() != null) {
            MutableLiveData<Integer> mutableLiveData = GS().searchState;
            if (mutableLiveData != null) {
                C0PDE c0pde = new C0PDE();
                c0pde.LL = new C0PDF() { // from class: X.0P6d
                    @Override // X.C0PDF
                    public final void LIZ() {
                    }

                    @Override // X.C0PDF
                    public final void LLFF() {
                    }

                    @Override // X.C0PDF
                    public final void LIZIZ(boolean z) {
                        boolean z2;
                        SearchFeedFragment searchFeedFragment = this.LIZ;
                        C639390P6b c639390P6b = searchFeedFragment.LLLLLLLLL;
                        if (c639390P6b != null) {
                            if (z && searchFeedFragment.getUserVisibleHint()) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c639390P6b.LIZJ(Boolean.valueOf(z2));
                        }
                    }
                };
                mutableLiveData.observe(this, c0pde);
            }
            MutableLiveData<Boolean> mutableLiveData2 = GS().backToMiddle;
            if (mutableLiveData2 != null) {
                mutableLiveData2.observe(this, new AObserverS214S0100000_10(this, 68));
            }
            GS().isHavingFocus.observe(getViewLifecycleOwner(), new AObserverS214S0100000_10(this, 69));
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public final void iS() {
        if (this.LLLIL != null) {
            GS().queryWordChangeInProcess.add(1);
        }
    }

    public SearchFeedFragment() {
        if (this.LLLLLL == null) {
            this.LLLLLL = new C643450PLr(this, this);
        }
        this.LLLLLL = this.LLLLLL;
        this.LLLLLLJ = "a2270.b5547";
        this.LLLLLLLZIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 830));
        this.LLLLLZIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 831));
        this.LLLLLZL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 829));
        C644560PPy.LIZ.getClass();
        this.LLJILLL = C644560PPy.LJJ();
    }

    @Override // X.InterfaceC683650Qrj
    public final boolean LJIIJJI() {
        AbstractC1255880imo abstractC1255880imo;
        T t = cU().LL;
        return (t instanceof AbstractC1255880imo) && (abstractC1255880imo = (AbstractC1255880imo) t) != null && abstractC1255880imo.isHasMore();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void OT() {
        super.OT();
        nT();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchOriginalFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C0P6H c0p6h;
        RecyclerView recyclerView;
        super.onDestroyView();
        cU().LIZ();
        this.LLLLLL.onDestroyView();
        if ((((Number) C1108604Vg.LIZ.getValue()).intValue() & 2) != 2 || (recyclerView = (c0p6h = (C0P6H) this.LLLLLZIL.getValue()).LIZJ) == null) {
            return;
        }
        recyclerView.removeOnScrollListener(c0p6h.LJIIIIZZ);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(getClass().getName());
        }
        super.onResume();
    }

    @Override // X.InterfaceC683650Qrj
    public final void preload() {
        if (XS() && (!this.LLJZIJLIL.isEmpty())) {
            return;
        }
        LJJIFFI();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment
    public final SparseArray<InterfaceC1581960rGk> registerComponents() {
        SparseArray<InterfaceC1581960rGk> sparseArrayRegisterComponents = super.registerComponents();
        sparseArrayRegisterComponents.append(C0SU6.LIZIZ, this.LLLLLL);
        return sparseArrayRegisterComponents;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void uS() {
        super.uS();
        if (C07H8.LIZ()) {
            C723850SaN.LIZ(this, false, null, new AwS585S0100000_6(this, 163), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public final String bS() {
        return this.LLLLLLJ;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
    }

    @Override // X.InterfaceC659300PtY
    public final void Ap(C643400PLm c643400PLm) {
        C653660PkS c653660PkSLIZ;
        String str;
        String str2;
        String str3;
        long jLongValue;
        C1606420ruC c1606420ruCLIZ;
        Bundle bundleLJFF;
        int iIntValue;
        String str4;
        String ecSearchBoBcLabelText;
        String str5;
        String str6;
        String str7;
        FirstScreenHelperAbility firstScreenHelperAbility;
        C664000Q2s c664000Q2s;
        C664030Q2v c664030Q2v;
        Integer numValueOf;
        String str8;
        String str9;
        String strLIZ;
        C664030Q2v c664030Q2v2;
        C650960Pg6 immutableData;
        C0PYE c0pye;
        Long l;
        C644910PRh c644910PRhLIZJ;
        C644910PRh c644910PRhLIZJ2;
        new C667750QHd(this, this).LJ();
        Aweme aweme = c643400PLm.LIZIZ;
        View view = c643400PLm.LIZ;
        String str10 = c643400PLm.LIZJ;
        Product product = c643400PLm.LJ;
        if (view != null) {
            c653660PkSLIZ = C660870Pw5.LIZ(view);
        } else {
            c653660PkSLIZ = null;
        }
        if (aweme != null && getActivity() != null) {
            C1603960rqE.LIZ = (AbstractC1255880imo) cU().LL;
            C646000PVm c646000PVm = C650950Pg5.Companion;
            c646000PVm.getClass();
            C0PRW c0prwLIZIZ = C646000PVm.LIZIZ();
            if (c0prwLIZIZ != null) {
                str = c0prwLIZIZ.searchId;
            } else {
                str = null;
            }
            InterfaceC644470PPp.LIZ.getClass();
            String strLIZ2 = C644460PPo.LIZ(4);
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, aweme.getAid(), bundle);
            C786410Ut5.LJJJI("refer", str10, bundle);
            C786410Ut5.LJJJI("video_from", "from_search", bundle);
            bundle.putInt("profile_enterprise_type", AwemeExtKt.getEnterpriseType(aweme));
            bundle.putInt("page_type", 9);
            C786410Ut5.LJJJI("search_keyword", dS(), bundle);
            C786410Ut5.LJJJI("search_id", str, bundle);
            C786410Ut5.LJJJI("playlist_search_id", str, bundle);
            bundle.putInt("is_from_video", 1);
            C786410Ut5.LJJJI("key_search_type", strLIZ2, bundle);
            bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 65280);
            InterfaceC649890PeN interfaceC649890PeNLIZ = C664290Q3v.LIZ();
            if (interfaceC649890PeNLIZ != null && (c644910PRhLIZJ2 = interfaceC649890PeNLIZ.LIZJ()) != null) {
                str2 = c644910PRhLIZJ2.LIZJ;
            } else {
                str2 = null;
            }
            C786410Ut5.LJJJI("tns_ban_type", str2, bundle);
            InterfaceC649890PeN interfaceC649890PeNLIZ2 = C664290Q3v.LIZ();
            if (interfaceC649890PeNLIZ2 != null && (c644910PRhLIZJ = interfaceC649890PeNLIZ2.LIZJ()) != null) {
                str3 = c644910PRhLIZJ.LIZLLL;
            } else {
                str3 = null;
            }
            C786410Ut5.LJJJI("use_scenario", str3, bundle);
            C786410Ut5.LJJJI("previous_page", "search_result", bundle);
            bundle.putBoolean("is_update_search_result_id", true);
            C19EG activity = getActivity();
            c646000PVm.getClass();
            C650950Pg5 c650950Pg5LJIIIZ = C646000PVm.LJIIIZ(this, activity);
            if (c650950Pg5LJIIIZ != null && (immutableData = c650950Pg5LJIIIZ.getImmutableData()) != null && (c0pye = immutableData.searchSessionModel) != null && (l = c0pye.searchSessionId) != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            bundle.putLong("search_session_id", jLongValue);
            C0Q3E.LIZIZ(this).ak0().LIZJ();
            c646000PVm.getClass();
            C646000PVm.LJIIIZ(this, this);
            if (product != null) {
                C660210Pv1.LIZ.getClass();
                Map mapLIZLLL = C660210Pv1.LIZLLL(aweme, product, c653660PkSLIZ);
                c646000PVm.getClass();
                C650960Pg6 c650960Pg6LJII = C646000PVm.LJII(this, this);
                if (c650960Pg6LJII == null || (c664030Q2v2 = c650960Pg6LJII.searchVideoModel) == null || (str9 = c664030Q2v2.groupId) == null) {
                    str9 = "";
                }
                mapLIZLLL.put("last_from_group_id", str9);
                EnhancedProduct enhancedProduct = c643400PLm.LJIIIIZZ;
                if (enhancedProduct != null && (strLIZ = C659630Pu5.LIZ(c643400PLm.LIZIZ, enhancedProduct)) != null) {
                    mapLIZLLL.put("use_custom_entrance_form", "1");
                    mapLIZLLL.put("entrance_form", strLIZ);
                    mapLIZLLL.put("jump_pdp_based_on_product_id", "1");
                }
                C786410Ut5.LJJIZ(bundle, "feed_anchor_custom_data", new AnchorCustomData(true, true, C660210Pv1.LJ(mapLIZLLL), null, null, null, null));
            }
            if (view != null) {
                c1606420ruCLIZ = C1607950rwf.LIZ(view, view.getWidth(), view.getHeight());
            } else {
                c1606420ruCLIZ = null;
            }
            if (C293680BfC.LIZ()) {
                IEcomSearchService iEcomSearchService = (IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class);
                RecyclerView recyclerViewBS = BS();
                Pair[] pairArr = new Pair[2];
                if (str == null) {
                    if (c653660PkSLIZ == null || (str8 = c653660PkSLIZ.LJIIJ) == null) {
                        str8 = "";
                    }
                } else {
                    str8 = str;
                }
                pairArr[0] = new Pair("search_id", str8);
                pairArr[1] = new Pair("search_result_id", aweme.getAid());
                iEcomSearchService.LJJLIIJ(recyclerViewBS, "c78057", "", C2097608Jq.LJIIJ(pairArr), null);
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getActivity(), "//aweme/detail");
            smartRouteBuildRoute.withParam(bundle);
            if (c1606420ruCLIZ != null) {
                bundleLJFF = c1606420ruCLIZ.LJFF();
            } else {
                bundleLJFF = null;
            }
            smartRouteBuildRoute.withBundleAnimation(bundleLJFF);
            smartRouteBuildRoute.withParam("activity_has_activity_options", true);
            smartRouteBuildRoute.withParam("source_btm_token", c643400PLm.LJIIIZ);
            smartRouteBuildRoute.open();
            C1483370ohj.LIZ(aweme);
            RecyclerView.LayoutManager layoutManager = BS().getLayoutManager();
            if (layoutManager != null && view != null && (numValueOf = Integer.valueOf(layoutManager.getPosition(view))) != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = -1;
            }
            c646000PVm.getClass();
            C0PRW c0prwLIZIZ2 = C646000PVm.LIZIZ();
            if (c0prwLIZIZ2 != null) {
                str4 = c0prwLIZIZ2.searchKeyword;
            } else {
                str4 = null;
            }
            C663370Q0h.LJ(view, "search_result", aweme, str4, iIntValue, c643400PLm.LJFF, c643400PLm.LJIILLIIL);
            Pair[] pairArr2 = new Pair[18];
            pairArr2[0] = new Pair("token_type", "video");
            pairArr2[1] = new Pair("is_aladdin", String.valueOf(0));
            AwemeCommerceStruct commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo();
            if (commerceVideoAuthInfo != null) {
                ecSearchBoBcLabelText = commerceVideoAuthInfo.getEcSearchBoBcLabelText();
            } else {
                ecSearchBoBcLabelText = null;
            }
            if (C294600Bgg.LIZ(ecSearchBoBcLabelText)) {
                str5 = "1";
            } else {
                str5 = CardStruct.IStatusCode.DEFAULT;
            }
            pairArr2[2] = new Pair("compliance_certification", str5);
            pairArr2[3] = new Pair("search_result_id", aweme.getAid());
            pairArr2[4] = new Pair("is_search_scene", "1");
            pairArr2[5] = new Pair("rank", String.valueOf(AwemeBizExtKt.getRank(aweme)));
            pairArr2[6] = new Pair("search_keyword", dS());
            pairArr2[7] = new Pair("search_type", "video");
            if (str == null) {
                str = "";
            }
            pairArr2[8] = new Pair("search_id", str);
            pairArr2[9] = new Pair("search_enter_position", "video");
            pairArr2[10] = new Pair("enter_position", "video");
            c646000PVm.getClass();
            C650960Pg6 c650960Pg6LJII2 = C646000PVm.LJII(this, this);
            if (c650960Pg6LJII2 == null || (c664030Q2v = c650960Pg6LJII2.searchVideoModel) == null || (str6 = c664030Q2v.groupId) == null) {
                str6 = "";
            }
            pairArr2[11] = new Pair("last_from_group_id", str6);
            pairArr2[12] = new Pair("is_from_video", "1");
            C19EG c19egRequireActivity = requireActivity();
            c646000PVm.getClass();
            C650960Pg6 c650960Pg6LJII3 = C646000PVm.LJII(this, c19egRequireActivity);
            if (c650960Pg6LJII3 == null || (c664000Q2s = c650960Pg6LJII3.searchCommonModel) == null || (str7 = c664000Q2s.enterFrom) == null) {
                str7 = "";
            }
            pairArr2[13] = new Pair("search_entrance", str7);
            pairArr2[14] = new Pair("group_id", aweme.getAid());
            pairArr2[15] = new Pair("search_outer_rank", String.valueOf(AwemeBizExtKt.getRank(aweme)));
            pairArr2[16] = new Pair("search_enter_method", ((C0PRC) C0Q3E.LIZIZ(this).Ph1().LIZJ()).LLJLL);
            pairArr2[17] = new Pair("fullscreen_enter_doc_id", aweme.getAid());
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr2);
            C651970Phj.LLILLL.getClass();
            C651980Phk.LJFF(mapLJIIIIZZ, false);
            if (C0BRN.LIZ() && (firstScreenHelperAbility = (FirstScreenHelperAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), FirstScreenHelperAbility.class, null)) != null) {
                firstScreenHelperAbility.Am();
            }
            C0PNL c0pnl = this.LLLLLLIL;
            if (c0pnl != null) {
                String strLIZ3 = C436190H8n.LIZ(aweme);
                if (strLIZ3 == null) {
                    strLIZ3 = "";
                }
                c0pnl.LLJJJJ = "";
                c0pnl.LLJJJJJIL = strLIZ3;
                c0pnl.LLJJJJLIIL = true;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void CT(SearchResultParam searchResultParam) {
        super.CT(searchResultParam);
        C0PNL c0pnl = this.LLLLLLIL;
        if (c0pnl != null) {
            c0pnl.LLJJJIL = "video_search";
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void RT(FollowStatus followStatus) {
        if (!isViewValid()) {
            return;
        }
        ((AbstractC654930PmV) NS()).LLLIILIL(followStatus);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.research.core.vability.SearchFragmentAbility
    public final void Wy(boolean z) {
        if (((Boolean) C1820807Be.LIZ.getValue()).booleanValue()) {
            super.Wy(true);
            return;
        }
        View view = getView();
        if (view == null) {
            return;
        }
        HandlerHook.viewPostDelay(view, new ARunnableS29S0110000_10(this, 2), 1000L);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchOriginalFragment
    public final void dU(int i) {
        C0P6H c0p6h;
        RecyclerView recyclerView;
        cU().LIZJ(1, dS(), Integer.valueOf(i), Integer.valueOf(this.LLJJJJJIL), this.LLILZ);
        C01GW c01gw = C1108604Vg.LIZ;
        if ((((Number) c01gw.getValue()).intValue() & 2) == 2) {
            C0P6H c0p6h2 = (C0P6H) this.LLLLLZIL.getValue();
            c0p6h2.LJ = 0;
            c0p6h2.LJFF = 0;
            c0p6h2.LJI = 0;
            c0p6h2.LIZLLL = false;
            c0p6h2.LJII = 0;
            if ((((Number) c01gw.getValue()).intValue() & 4) == 4 && (recyclerView = (c0p6h = (C0P6H) this.LLLLLZIL.getValue()).LIZJ) != null) {
                HandlerHook.viewPostDelay(recyclerView, new ARunnableS110S0100000_10(c0p6h, 100), 800L);
            }
        }
    }

    @Override // X.InterfaceC683650Qrj
    public final void n2(boolean z) {
        this.LLLLLL.LLILZIL.showLoadMoreEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @C14EU
    public final void onVideoEvent(C737030Svd c737030Svd) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        InterfaceC214902198i interfaceC214902198i;
        if (!isViewValid() || c737030Svd.LIZ != 66 || !getUserVisibleHint()) {
            return;
        }
        Context context = getContext();
        Context context2 = getContext();
        if (context2 != null) {
            componentCallbacks2LJFF = SAFExtensionKt.LJFF(context2);
        } else {
            componentCallbacks2LJFF = null;
        }
        if (!C294780Bgy.LIZ() ? !(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF() : !(componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
            interfaceC214902198i = null;
            break;
        }
        Fragment parentFragment = this;
        while (!(parentFragment instanceof InterfaceC214902198i)) {
            parentFragment = parentFragment.getParentFragment();
            if (parentFragment == 0) {
                interfaceC214902198i = null;
                break;
            }
        }
        interfaceC214902198i = (InterfaceC214902198i) parentFragment;
        if (!C651290Pgd.LJII(context, interfaceC214902198i)) {
            return;
        }
        C0Q3E.LIZIZ(this).fe(new C639740P7k(new C0P71(null, null, null)));
        C0PNL c0pnl = this.LLLLLLIL;
        if (c0pnl != null) {
            C0PIF c0pif = C0PIF.LIZ;
            List<Aweme> items = c0pnl.getItems();
            c0pif.getClass();
            C0PIF.LJIIIIZZ(items);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Taco tacoLIZ;
        InterfaceC588610N6t interfaceC588610N6t;
        C19EG c19egLIZIZ;
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/search/pages/result/videosearch/core/ui/SearchFeedFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtYo3N1HzhDDRLpI72YnZMf+rOW74IHLIvvPuxYzL3B7JKZg0yxsGScXaNTmlyZG7rEZ3vSXfcVZc=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        this.LLLLLL.setUserVisibleHint(z);
        C639390P6b c639390P6b = this.LLLLLLLLL;
        if (c639390P6b != null) {
            c639390P6b.LIZJ(Boolean.valueOf(z));
        }
        if (!z) {
            this.LLLLLL.getClass();
            if (C18177079z.LIZ) {
                SAFHelper sAFHelper = SAFHelper.LIZ;
                Context context = getContext();
                if (context != null) {
                    c19egLIZIZ = C1388190mED.LIZIZ(context);
                } else {
                    c19egLIZIZ = null;
                }
                sAFHelper.getClass();
                List list = (List) ((HashMap) C640060P8q.LIZ.LIZ).get(Integer.valueOf(SAFHelper.LJIILL(this, c19egLIZIZ)));
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        C0N0Y c0n0y = ((C661490Px5) it2.next()).LJIILIIL;
                        if (c0n0y != null) {
                            c0n0y.LJJIJ(null);
                            c0n0y.release();
                        }
                    }
                }
            }
        } else {
            C643450PLr c643450PLr = this.LLLLLL;
            if (c643450PLr.isViewValid()) {
                int childCount = c643450PLr.LLILZ.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    RecyclerView.ViewHolder childViewHolder = c643450PLr.LLILZ.getChildViewHolder(c643450PLr.LLILZ.getChildAt(i));
                    if (childViewHolder.getItemViewType() == 0) {
                        AbstractC661100PwS abstractC661100PwS = (AbstractC661100PwS) childViewHolder;
                        if (!abstractC661100PwS.d6()) {
                            abstractC661100PwS.a6();
                            abstractC661100PwS.e6();
                        }
                    }
                }
            }
            nT();
            if (mT() && ((tacoLIZ = C0PCE.LIZ(BS(), false)) == null || (interfaceC588610N6t = tacoLIZ.LLILLJJLI) == null || interfaceC588610N6t.LJFF() == null)) {
                RecyclerView recyclerViewBS = BS();
                if (recyclerViewBS.isLaidOut() && !recyclerViewBS.isLayoutRequested()) {
                    C0PCO c0pco = this.LLLLLLZZ;
                    if (c0pco != null) {
                        c0pco.LJFF();
                    }
                } else {
                    recyclerViewBS.addOnLayoutChangeListener(new C0R42(this, 4));
                }
            }
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(getClass());
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final Map<String, String> zS(String str) {
        return C1200530hLX.LIZIZ(null, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, X.InterfaceC1212360hec
    public final void LLJJJIL(List<? extends Aweme> list, boolean z) {
        SearchIntentStruct searchIntentStruct;
        GS().queryWordChangeInProcess.remove(1);
        if (!isViewValid()) {
            return;
        }
        GlobalDoodleConfig globalDoodleConfig = this.LLL;
        if (globalDoodleConfig != null && Intrinsics.LJFF(globalDoodleConfig.getHideResults(), Boolean.TRUE)) {
            this.LLJZIJLIL = list;
        }
        HandlerHook.viewPost(BS(), new ARunnableS12S0210000_10(this, list, z, 0));
        GS().setIsRefreshingData(false);
        C430110Gtl.LIZ(BS(), new AwS554S0100000_10(this, 832));
        C07L7 c07l7 = C07L7.LIZ;
        int iHashCode = hashCode();
        c07l7.getClass();
        ((Map) C07L7.LIZIZ.getValue()).put(Integer.valueOf(iHashCode), null);
        GlobalDoodleConfig globalDoodleConfig2 = this.LLL;
        if (globalDoodleConfig2 != null && (searchIntentStruct = globalDoodleConfig2.getSearchIntentStruct()) != null && Intrinsics.LJFF(searchIntentStruct.getHasPoiIntent(), Boolean.TRUE) && !((C639830P7t) C0Q3E.LIZIZ(this).dP0().LIZJ()).LL) {
            C0Q3E.LIZIZ(this).fe(new C639800P7q());
            CertProviderManagerKt.findCert("bpea-search_poi_fetch_location", 1476395008, "nany");
            C0P5E.LIZ(new AwS554S0100000_10(this, 833));
        }
        sT(true);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, X.InterfaceC1212360hec
    public final void Pj(List<? extends Aweme> list, boolean z) {
        this.LLLLLL.Pj(list, z);
        QS().LIZ();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchOriginalFragment, X.InterfaceC643870PNh
    public final void XF(DynamicPatch dynamicPatch, String str) {
        C0PMF.LIZ(this, new C0PME(getActivity(), dynamicPatch, str, this.LLJJJJ, getView(), this, GS(), this.LLLLLLL));
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void eT(View view, Bundle bundle) {
        this.LLLLLL.onViewCreated(view, bundle);
        YS();
        NS().setLoadEmptyTextColor(Integer.valueOf(C960203pA.LIZ(R.attr.a1k, view.getContext())));
        C643450PLr c643450PLr = this.LLLLLL;
        c643450PLr.LLJILJILJ = 9;
        C645140PSe c645140PSe = c643450PLr.LLILZIL;
        if (c645140PSe != null) {
            c645140PSe.setLoadMoreListener(this);
        }
        C643450PLr c643450PLr2 = this.LLLLLL;
        c643450PLr2.getClass();
        RecyclerView recyclerView = c643450PLr2.LLILZ;
        if (recyclerView != null && (recyclerView instanceof C21689319uV)) {
            ((C21689319uV) recyclerView).setLabel("");
        }
        C0VWN.LIZ("", false).LIZIZ(c643450PLr2.LLILZ);
        C645140PSe c645140PSe2 = c643450PLr2.LLILZIL;
        if (c645140PSe2 != null) {
            c645140PSe2.mmLabel = "";
        }
        this.LLLLLL.LLJILLL = (C0P7W) this.LLLLLZL.getValue();
        BS().setClipToPadding(false);
        C16GX c16gx = this.LLLII;
        if (c16gx != null) {
            c16gx.setBackground(null);
        }
        if ((((Number) C1108604Vg.LIZ.getValue()).intValue() & 2) == 2) {
            ((C0P6H) this.LLLLLZIL.getValue()).LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, X.InterfaceC1212360hec
    public final void mE(List<? extends Aweme> list, boolean z) {
        this.LLLLLL.Pj(list, z);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        int iHashCode;
        C0PPU c0ppu;
        GridLayoutManager gridLayoutManager;
        super.onViewCreated(view, bundle);
        RecyclerView.LayoutManager layoutManager = BS().getLayoutManager();
        C639420P6e c639420P6e = null;
        if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null) {
            i = gridLayoutManager.LLILLJJLI;
        } else {
            i = -1;
        }
        if (C643360PLi.LIZ()) {
            return;
        }
        if ((!C0BE5.LIZ || !C0P8F.LIZ()) && C2367809Po.LIZ() && i <= 2) {
            this.LLLLLLLLL = new C639390P6b();
            if (C639360P5y.LIZ < 0) {
                C639360P5y.LIZ = C0C64.LJIILLIIL().LJIJ(31744, 0, "search_window_visibility_status_opt", true);
            }
            if (C639360P5y.LIZ == 1) {
                c639420P6e = new C639420P6e();
            }
            RecyclerView recyclerViewBS = BS();
            if ((recyclerViewBS instanceof C0PPU) && (c0ppu = (C0PPU) recyclerViewBS) != null) {
                c0ppu.setWindowVisibilityStatus(c639420P6e);
            }
            this.LLLLLLL = new C0P6Y();
            C0P6T c0p6t = new C0P6T();
            c0p6t.LLILLJJLI = new AwS554S0100000_10(this, 1109);
            this.LLLLLLLLLL = c0p6t;
            this.LLLLLLZ = new C641550PEj(BS());
            this.LLLLLLZZ = new C0PCO(BS());
            this.LLLLLZ = new VerticalScrollDoubleColumnProvider(this, BS());
            C0P8H c0p8h = new C0P8H("video_search", this);
            C0PCO c0pco = this.LLLLLLZZ;
            if (c0pco != null) {
                iHashCode = c0pco.hashCode();
            } else {
                iHashCode = 0;
            }
            c0p8h.LIZIZ(c0pco, iHashCode);
            c0p8h.LIZIZ(this.LLLLLZ, 1);
            c0p8h.LIZIZ(this.LLLLLLZ, 19);
            c0p8h.LIZLLL(new C639380P6a(GS(), this));
            c0p8h.LIZLLL(this.LLLLLLZ);
            c0p8h.LIZLLL(this.LLLLLLLLL);
            c0p8h.LIZLLL(c639420P6e);
            c0p8h.LIZLLL(this.LLLLLLLLLL);
            c0p8h.LIZLLL(this.LLLLLLL);
            c0p8h.LIZLLL((AbstractC641560PEk) this.LLLLLLLZIL.getValue());
            c0p8h.LIZ().LJFF();
        }
    }
}
