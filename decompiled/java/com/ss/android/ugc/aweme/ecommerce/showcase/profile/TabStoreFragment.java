package com.ss.android.ugc.aweme.ecommerce.showcase.profile;

import X.AbstractC1542070qEP;
import X.AnonymousClass0956;
import X.C034S;
import X.C098200Yq;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1120604Zw;
import X.C1390410mHn;
import X.C13LG;
import X.C13LP;
import X.C1421105hJ;
import X.C1537710q7N;
import X.C15438062q;
import X.C1547280qMo;
import X.C1685300txQ;
import X.C1733740vDY;
import X.C1735460vGK;
import X.C1739130vMF;
import X.C1739270vMT;
import X.C1739320vMY;
import X.C1741890vQh;
import X.C1742080vR0;
import X.C1743690vTb;
import X.C1749280vcc;
import X.C1776230wK5;
import X.C1776240wK6;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1AQS;
import X.C2010707uD;
import X.C20533215Wg;
import X.C21396218oK;
import X.C2187451AjH;
import X.C2187701Ajg;
import X.C2200821BBo;
import X.C2211631BhB;
import X.C418440Gaw;
import X.C598000Ncs;
import X.C616540OGe;
import X.C664270Q3t;
import X.C770702zh;
import X.C786410Ut5;
import X.C948503nH;
import X.InterfaceC1164530gPT;
import X.InterfaceC1740760vOs;
import X.InterfaceC2211731BhL;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import X.ViewTreeObserverOnGlobalLayoutListenerC1775940wJc;
import Y.AsS52S0100000_26;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.dependency.apm.ApmDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.search.SearchDependencyService;
import com.ss.android.ugc.aweme.ecommerce.model.RelatedProductInfo;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.apm.IApmDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.search.ISearchDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreBizLogService;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreTechLogService;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.GetCreatorShopInfoData;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.Shop;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.MiniUser;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class TabStoreFragment extends TabCommerceFragmentImpl implements InterfaceC1164530gPT, InterfaceC2211731BhL {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGHELIOSEgICo7Ki4gLWs8OyA1ISkpZxsyKhY4Jj02DjctLiI2JjE=";
    public C1749280vcc LLJJJJJIL;
    public C1390410mHn LLJJJJLIIL;
    public GetCreatorShopInfoData LLJJL;
    public AnonymousClass0956 LLJJLIIIJLLLLLLLZ;
    public long LLJL;
    public C21396218oK LLJLILLLLZIIL;
    public String LLJLIL = "";
    public final AsS52S0100000_26 LLJLL = new AsS52S0100000_26(this, 4);

    @Override // X.InterfaceC2211731BhL
    public final Object LLFZ() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragmentImpl
    public final int Rc() {
        return 14;
    }

    public final void YS() {
        try {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(zS().shopRouter), "sellerId");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                AnonymousClass0956 anonymousClass0956 = this.LLJJLIIIJLLLLLLLZ;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                this.LLJJLIIIJLLLLLLLZ = null;
                C1739270vMT.LIZJ.remove(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                this.LLJJL = null;
                this.LLJJI = 0L;
                C1749280vcc c1749280vccUS = US();
                if (c1749280vccUS != null) {
                    C786410Ut5.LJLLLLLL(8, c1749280vccUS);
                }
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJIJIIJIL;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                    this.LLJJIJIIJIL = null;
                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
                    C786410Ut5.LJJJLZIJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, (ViewGroup) getView());
                }
                this.LLJJLIIIJLLLLLLLZ = C948503nH.LJIIIIZZ(this, new C598000Ncs(this, zS().tabType == 14, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, null));
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.InterfaceC2211731BhL, X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "b3422";
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    public final C1749280vcc US() {
        View viewFindViewById = this.LLJJJJJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.hc6) : null;
            this.LLJJJJJIL = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public final C1390410mHn VS() {
        View viewFindViewById = this.LLJJJJLIIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.w2h) : null;
            this.LLJJJJLIIL = (C1390410mHn) viewFindViewById;
        }
        return (C1390410mHn) viewFindViewById;
    }

    public final Unit XS() {
        IEcommerceStoreTechLogService iEcommerceStoreTechLogService = (IEcommerceStoreTechLogService) PluggableExtentionKt.pluggableSpi$default(IEcommerceStoreTechLogService.class, false, false, false, 14, null);
        if (iEcommerceStoreTechLogService == null) {
            return null;
        }
        iEcommerceStoreTechLogService.LIZ(zS().id, getEnterFrom(), "profile_tab_store", new HashMap(), BS());
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1258040iqI
    public final View LJJLIIIJILLIZJL() {
        C1537710q7N c1537710q7NWS = wS();
        if (c1537710q7NWS != null) {
            return c1537710q7NWS.findViewByName("profile-shop-tab-list");
        }
        return null;
    }

    public final void PS() {
        ViewTreeObserver viewTreeObserver;
        if (getView() != null) {
            ((ViewGroup) getView()).addView(this.LLJJIJIIJIL, 0);
            C1537710q7N c1537710q7NWS = wS();
            if (c1537710q7NWS == null || (viewTreeObserver = c1537710q7NWS.getViewTreeObserver()) == null) {
                return;
            }
            ViewTreeObserverOnGlobalLayoutListenerC1775940wJc viewTreeObserverOnGlobalLayoutListenerC1775940wJc = new ViewTreeObserverOnGlobalLayoutListenerC1775940wJc(this, 4);
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1775940wJc);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1775940wJc, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    public final void eT() {
        View viewLJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        if (viewLJJLIIIJILLIZJL != null) {
            Rect rect = new Rect();
            viewLJJLIIIJILLIZJL.getGlobalVisibleRect(rect);
            int iHeight = rect.height();
            if (iHeight > 0) {
                HS("viewHeightUpdate", new JSONObject().put("height", C418440Gaw.LJFF(iHeight, viewLJJLIIIJILLIZJL.getContext())));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragmentImpl, com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        SparkContext sparkContext;
        RecyclerView recyclerView;
        View viewLJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        if ((viewLJJLIIIJILLIZJL instanceof RecyclerView) && (recyclerView = (RecyclerView) viewLJJLIIIJILLIZJL) != null) {
            recyclerView.removeOnScrollListener(this.LLJLL);
        }
        C21396218oK c21396218oK = this.LLJLILLLLZIIL;
        if (c21396218oK != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJIJIIJIL) != null && (sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext()) != null) {
            sparkContext.LJJIIJ(AbstractC1542070qEP.class, c21396218oK);
        }
        super.onDestroyView();
        this.LLJJJJJIL = null;
        this.LLJJJJLIIL = null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragmentImpl, com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(TabStoreFragment.class.getName());
        }
        super.onResume();
        C2211631BhB.LJIIZILJ(this, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC2211731BhL
    public final String qz() {
        for (Fragment parentFragment = getParentFragment(); parentFragment != 0; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof InterfaceC1740760vOs) {
                return ((InterfaceC1740760vOs) parentFragment).getBtmPageCode();
            }
        }
        return "b5836";
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return C664270Q3t.LIZ(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0073 A[LOOP:0: B:20:0x006d->B:22:0x0073, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragmentImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ES(int r13) throws org.json.JSONException {
        /*
            r12 = this;
            long r3 = r12.LLJL
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto Lb4
            if (r13 == 0) goto L9c
            boolean r2 = X.C034S.LIZ()
            if (r2 == 0) goto L8c
            X.04Zw r2 = X.C1120604Zw.LIZ
            r2.LIZ()
            long r4 = android.os.SystemClock.elapsedRealtime()
            r9 = 0
            com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService r2 = com.ss.android.ugc.aweme.ecommerce.dependency.ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(r9)
            if (r2 == 0) goto L21
            r9 = 1
        L21:
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService> r3 = com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService.class
            java.lang.String r7 = r3.getName()
            r6 = 1
            if (r2 == 0) goto L8a
            java.lang.Class r3 = r2.getClass()
            java.lang.String r8 = r3.getName()
        L32:
            X.C1AQS.LIZJ(r4, r6, r7, r8, r9)
        L35:
            com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService r2 = (com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService) r2
            boolean r2 = r2.isAppBackGround()
            if (r2 != 0) goto L9c
            X.19EG r2 = r12.requireActivity()
            boolean r2 = r2.isFinishing()
            if (r2 == 0) goto L87
            java.lang.String r8 = "return"
        L49:
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            long r3 = android.os.SystemClock.uptimeMillis()
            long r5 = r12.LLJL
            long r3 = r3 - r5
            java.lang.String r2 = "stay_time"
            org.json.JSONObject r3 = r7.put(r2, r3)
            java.lang.String r2 = "quit_type"
            org.json.JSONObject r5 = r3.put(r2, r8)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r12.LLJJIJI
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r4 = r2.iterator()
        L6d:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L9f
            java.lang.Object r2 = r4.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            r5.put(r3, r2)
            goto L6d
        L87:
            java.lang.String r8 = "next"
            goto L49
        L8a:
            r8 = 0
            goto L32
        L8c:
            X.04Zw r2 = X.C1120604Zw.LIZ
            r2.LIZ()
            X.04aq r3 = X.C1120604Zw.LIZJ
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService> r2 = com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService.class
            X.0317 r2 = r3.LIZLLL(r2)
            com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService r2 = (com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService) r2
            goto L35
        L9c:
            java.lang.String r8 = "close"
            goto L49
        L9f:
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreBizLogService> r6 = com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreBizLogService.class
            r7 = 0
            r10 = 14
            r11 = 0
            r8 = r7
            r9 = r7
            java.lang.Object r2 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r6, r7, r8, r9, r10, r11)
            com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreBizLogService r2 = (com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreBizLogService) r2
            if (r2 == 0) goto Lb2
            r2.LJ(r5)
        Lb2:
            r12.LLJL = r0
        Lb4:
            super.ES(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabStoreFragment.ES(int):void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragmentImpl
    public final void FS(int i) {
        super.FS(i);
        if (this.LLJL <= 0) {
            this.LLJL = SystemClock.uptimeMillis();
        }
    }

    public final void NS(SparkContext sparkContext) {
        if (getView() != null) {
            C21396218oK c21396218oK = this.LLJLILLLLZIIL;
            if (c21396218oK == null) {
                c21396218oK = new C21396218oK(VS());
                sparkContext.LJJ(AbstractC1542070qEP.class, c21396218oK);
            }
            this.LLJLILLLLZIIL = c21396218oK;
            sparkContext.LJJJJZI(new C1776240wK6(this, 0));
        }
        sparkContext.LJJJJZ(new C1776230wK5(1));
    }

    public final void gT(GetCreatorShopInfoData getCreatorShopInfoData) {
        String str;
        C13LG<Long> c13lg;
        Shop shop = getCreatorShopInfoData.shop;
        if (shop == null) {
            return;
        }
        String strLIZ = C1739130vMF.LIZ(getCreatorShopInfoData.creatorRole);
        this.LLJJIII.put("author_type", strLIZ);
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.LLJJIII);
        linkedHashMap.put("entrance_type", "top_button");
        boolean zLJFF = Intrinsics.LJFF(shop.onHoliday, Boolean.TRUE);
        String str2 = C1735460vGK.LIZ().shopTab;
        if (BS()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        this.LLJILLL = C2010707uD.LIZ(Uri.encode(C1741890vQh.LJIIIIZZ(linkedHashMap)), C2010707uD.LIZ(Integer.valueOf(zLJFF ? 1 : 0), C2010707uD.LIZ(Integer.valueOf(getCreatorShopInfoData.entrancePattern), C2010707uD.LIZ(Integer.valueOf(shop.status), C2010707uD.LIZ(Uri.encode(shop.shopName), C2010707uD.LIZ(shop.sellerId, C2010707uD.LIZ(this.LLJLIL, C2010707uD.LIZ("1", C2010707uD.LIZ(str, str2, "is_self"), "is_host_profile"), "session_id"), "seller_id"), "shop_name"), "shop_status"), "entrance_pattern"), "is_on_holiday"), "trackParams");
        if (C770702zh.LIZ(this.LLJJJIL)) {
            this.LLJILLL = C2010707uD.LIZ(this.LLJJJIL, this.LLJILLL, "video_id");
        }
        RelatedProductInfo relatedProductInfoLJLLI = ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJLLI(this.LLJJJIL, zS().id);
        if (relatedProductInfoLJLLI != null && (c13lg = relatedProductInfoLJLLI.productIdList) != null && c13lg.size() > 0) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(c13lg, 10));
            Iterator<Long> it2 = c13lg.iterator();
            while (it2.hasNext()) {
                arrayList.add(String.valueOf(it2.next().longValue()));
            }
            List listLJLJJLL = C13LP.LJLJJLL(arrayList);
            if (listLJLJJLL != null) {
                this.LLJILLL = C2010707uD.LIZ(Uri.encode(C1741890vQh.LJIIIIZZ(listLJLJJLL)), this.LLJILLL, "video_product_ids");
            }
        }
        this.LLJJIJI.put("shop_id", shop.sellerId);
        this.LLJJIJI.put("shop_status", Integer.valueOf(shop.status));
        this.LLJJIJI.put("author_type", strLIZ);
        this.LLJJIJI.put("is_holiday_mode", Integer.valueOf(zLJFF ? 1 : 0));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragmentImpl, com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String strLIZJ;
        String str;
        String str2;
        IECommerceHostService iECommerceHostService;
        IECommerceHostService iECommerceHostService2;
        boolean z;
        boolean z2;
        String name;
        super.onCreate(bundle);
        int i = C1742080vR0.LIZ;
        this.LLJ = C1742080vR0.LIZ(7, this.LLJ);
        if (bundle == null || (strLIZJ = bundle.getString("session_id")) == null) {
            strLIZJ = C1743690vTb.LIZJ();
        }
        this.LLJLIL = strLIZJ;
        if (BS()) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        this.LLJJIII.put("traffic_source_list", this.LLJ);
        this.LLJJIII.put("enter_from", getEnterFrom());
        this.LLJJIII.put("source_previous_page", str);
        Map<String, Object> map = this.LLJJIII;
        String str3 = (String) this.LLIZLLLIL.getValue();
        if (str3.length() == 0) {
            str3 = "click_button";
        }
        map.put("enter_method", str3);
        this.LLJJIII.put("author_id", zS().id);
        Map<String, Object> map2 = this.LLJJIII;
        if (zS().tabType == 14) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        map2.put("default_product_tab", str2);
        this.LLJJIII.put("follow_status", String.valueOf(zS().followStatus));
        Map<String, Object> map3 = this.LLJJIII;
        String name2 = null;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ISearchDependencyService iSearchDependencyServiceCreateISearchDependencyServicebyMonsterPlugin = SearchDependencyService.createISearchDependencyServicebyMonsterPlugin(false);
            if (iSearchDependencyServiceCreateISearchDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name3 = ISearchDependencyService.class.getName();
            if (iSearchDependencyServiceCreateISearchDependencyServicebyMonsterPlugin != null) {
                name = iSearchDependencyServiceCreateISearchDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name3, name, z2);
            iECommerceHostService = iSearchDependencyServiceCreateISearchDependencyServicebyMonsterPlugin;
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ISearchDependencyService.class);
        }
        map3.putAll(((ISearchDependencyService) iECommerceHostService).fetchSearchParams(getEnterFrom(), ""));
        this.LLJJIJI.putAll(this.LLJJIII);
        this.LLJJIJI.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        this.LLJJIJI.put("page_name", str);
        this.LLJJIJI.put("entrance_type", this.LLIZLLLIL.getValue());
        this.LLJJIJI.put("is_self", Integer.valueOf(BS() ? 1 : 0));
        Map<String, Object> map4 = this.LLJJIJI;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            IApmDependencyService iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin = ApmDependencyService.createIApmDependencyServicebyMonsterPlugin(false);
            if (iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name4 = IApmDependencyService.class.getName();
            if (iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin != null) {
                name2 = iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name2, z);
            iECommerceHostService2 = iApmDependencyServiceCreateIApmDependencyServicebyMonsterPlugin;
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApmDependencyService.class);
        }
        map4.put("traceparent", ((IApmDependencyService) iECommerceHostService2).newTrackingTraceparent());
        this.LLJJIJI.putAll(C1733740vDY.LJ(this, "c9203.d0"));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragmentImpl, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C786410Ut5.LJJJI("session_id", this.LLJLIL, bundle);
    }

    @Override // X.InterfaceC1257980iqC
    public final void q3(boolean z) {
        eT();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragmentImpl, com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        boolean zBooleanValue = z;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/ecommerce/showcase/profile/TabStoreFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(zBooleanValue)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnu3ZuhKqaILhr0sz6YkaWp60qRs/9fwC+E8ox+sjXXEjEU=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            zBooleanValue = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(zBooleanValue);
        if (zBooleanValue) {
            IEcommerceStoreBizLogService iEcommerceStoreBizLogService = (IEcommerceStoreBizLogService) PluggableExtentionKt.pluggableSpi$default(IEcommerceStoreBizLogService.class, false, false, false, 14, null);
            if (iEcommerceStoreBizLogService != null) {
                iEcommerceStoreBizLogService.LIZLLL(this.LLJJIJI);
            }
            if (this.LLJJL != null) {
                eT();
                FS(0);
            }
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && zBooleanValue) {
            C20533215Wg.LIZ(TabStoreFragment.class);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragmentImpl, X.InterfaceC1257980iqC
    public final void za(MiniUser miniUser) {
        boolean z;
        super.za(miniUser);
        if (!this.mStatusViewValid) {
            return;
        }
        if (this.LLJILJIL != null && Intrinsics.LJFF(zS().id, miniUser.id)) {
            z = true;
        } else {
            z = false;
        }
        this.LLJILJIL = miniUser;
        String strValueOf = String.valueOf(miniUser.followStatus);
        this.LLJJIII.put("follow_status", strValueOf);
        this.LLJJIJI.put("follow_status", strValueOf);
        if (z) {
            return;
        }
        String str = this.LLJJJIL;
        if (str != null && !a0.LJJJIL(str)) {
            this.LLJJIII.put("list_source_content_id", str);
            this.LLJJIJI.put("list_source_content_id", str);
            C1421105hJ.LIZJ("tiktokec_shop_entrance_show", this.LLJJIJI);
        }
        this.LLJJIII.put("author_id", miniUser.id);
        this.LLJJIJI.put("author_id", miniUser.id);
        YS();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0 A[Catch: s -> 0x00f0, TryCatch #2 {s -> 0x00f0, blocks: (B:33:0x00b6, B:35:0x00c5, B:43:0x00da, B:44:0x00e4, B:47:0x00ed, B:42:0x00d0), top: B:83:0x00b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object QS(java.lang.String r19, X.InterfaceC1364105Vn<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabStoreFragment.QS(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:0|2|(2:4|(1:6)(1:108))(0)|7|(1:(1:(1:(1:(9:13|14|15|(1:17)|18|(1:29)(1:22)|(1:26)|27|28)(2:109|110))(5:75|76|(2:(1:88)(1:81)|(1:83)(1:87))(2:(1:95)(1:92)|(1:94)(1:96))|84|(3:116|97|(2:101|102)(2:103|(1:105)(9:106|14|15|(0)|18|(2:20|29)(0)|(2:24|26)|27|28)))(8:107|15|(0)|18|(0)(0)|(0)|27|28)))(20:38|39|114|40|(1:45)(2:44|46)|(2:48|50)(1:49)|51|(1:53)|54|57|(1:59)|60|(1:62)|(1:64)|65|(2:67|(4:69|(1:71)|72|(1:74)))|76|(0)(0)|84|(0)(0)))(1:34))(2:30|(1:32)(1:33))|35|(1:37)|39|114|40|(17:42|45|(0)(0)|51|(0)|54|57|(0)|60|(0)|(0)|65|(0)|76|(0)(0)|84|(0)(0))(0)|15|(0)|18|(0)(0)|(0)|27|28|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0123, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0124, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1);
        r6 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0103 A[Catch: s -> 0x0123, TryCatch #2 {s -> 0x0123, blocks: (B:40:0x00e9, B:42:0x00f8, B:50:0x010d, B:51:0x0117, B:54:0x0120, B:49:0x0103), top: B:114:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d5  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragmentImpl] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r21v0, types: [androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragmentImpl, com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabStoreFragment, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2, types: [T] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object RS(java.lang.String r22, X.InterfaceC1364105Vn<? super kotlin.Unit> r23) {
        /*
            Method dump skipped, instruction units count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabStoreFragment.RS(java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        Integer num;
        Shop shop;
        String str3;
        C1739270vMT c1739270vMT;
        C1739320vMY c1739320vMY;
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(str2);
        Object obj = null;
        if (mapLJIIJ != null) {
            obj = mapLJIIJ.get("exposedProductLength");
        }
        if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
            int iIntValue = num.intValue();
            GetCreatorShopInfoData getCreatorShopInfoData = this.LLJJL;
            if (getCreatorShopInfoData != null && (shop = getCreatorShopInfoData.shop) != null && (str3 = shop.sellerId) != null && (c1739270vMT = C1739270vMT.LIZJ.get(str3)) != null && (c1739320vMY = c1739270vMT.LIZ.get(c1739270vMT.LIZIZ)) != null && iIntValue > c1739320vMY.LIZ) {
                c1739320vMY.LIZ = iIntValue;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragmentImpl, com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C2211631BhB.LJIIZILJ(this, true);
        YS();
    }

    public final TemplateData fT(String str, Response<n> response, Object obj) {
        String strLJIIIIZZ;
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("is_live", Integer.valueOf(zS().isLive ? 1 : 0));
        pairArr[1] = new Pair("recommend_context", str);
        Object objLJIIIIZZ = null;
        if (response != null) {
            strLJIIIIZZ = C1741890vQh.LJIIIIZZ(response);
        } else {
            strLJIIIIZZ = null;
        }
        pairArr[2] = new Pair("creator_info", strLJIIIIZZ);
        if (obj instanceof String) {
            objLJIIIIZZ = obj;
        } else if (obj != null) {
            objLJIIIIZZ = C1741890vQh.LJIIIIZZ(obj);
        }
        pairArr[3] = new Pair("product_list", objLJIIIIZZ);
        return C1547280qMo.LIZJ(pairArr);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.auo, viewGroup, false);
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

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r3.data != 0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ZS(java.lang.String r11, java.lang.String r12, X.AnonymousClass0957<? extends com.ss.android.ugc.aweme.ecommerce.api.model.Response<com.google.gson.n>> r13, boolean r14, X.InterfaceC1364105Vn<? super X.AnonymousClass0957<? extends com.ss.android.ugc.aweme.ecommerce.api.model.Response<com.google.gson.n>>> r15) {
        /*
            r10 = this;
            r7 = r11
            r8 = r12
            r6 = r14
            boolean r0 = r15 instanceof X.C598240NdG
            r5 = r10
            if (r0 == 0) goto L5e
            r4 = r15
            X.0NdG r4 = (X.C598240NdG) r4
            int r2 = r4.LLIZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5e
            int r2 = r2 - r1
            r4.LLIZ = r2
        L16:
            java.lang.Object r3 = r4.LLILZIL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLIZ
            r9 = 0
            r1 = 1
            if (r0 == 0) goto L3c
            if (r0 != r1) goto L64
            boolean r6 = r4.LLILZ
            X.0957 r13 = r4.LLILLL
            java.lang.Object r8 = r4.LLILLJJLI
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r4.LL
            java.lang.String r7 = (java.lang.String) r7
            X.C155000ia.LIZIZ(r3)
        L33:
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r3 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r3
            if (r3 == 0) goto L6c
            T r0 = r3.data
            if (r0 == 0) goto L6c
        L3b:
            return r13
        L3c:
            X.C155000ia.LIZIZ(r3)
            if (r13 == 0) goto L6c
            boolean r0 = r13.isCompleted()
            if (r0 == 0) goto L3b
            boolean r0 = r13.isCompleted()
            if (r0 != r1) goto L6c
            r4.LL = r7
            r4.LLILLJJLI = r8
            r4.LLILLL = r13
            r4.LLILZ = r6
            r4.LLIZ = r1
            java.lang.Object r3 = r13.LJLIIIL(r4)
            if (r3 != r2) goto L33
            return r2
        L5e:
            X.0NdG r4 = new X.0NdG
            r4.<init>(r5, r15)
            goto L16
        L64:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L6c:
            kotlin.coroutines.CoroutineContext r0 = r4.getContext()
            X.054G r1 = X.C2296808zG.LIZ(r0)
            X.0vMQ r4 = new X.0vMQ
            r4.<init>(r5, r6, r7, r8, r9)
            r0 = 3
            X.099G r13 = X.C23250099c.LIZIZ(r1, r9, r9, r4, r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabStoreFragment.ZS(java.lang.String, java.lang.String, X.0957, boolean, X.05Vn):java.lang.Object");
    }
}
