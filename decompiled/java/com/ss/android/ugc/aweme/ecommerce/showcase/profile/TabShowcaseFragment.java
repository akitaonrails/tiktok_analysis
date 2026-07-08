package com.ss.android.ugc.aweme.ecommerce.showcase.profile;

import X.AnonymousClass0956;
import X.C01GW;
import X.C036A;
import X.C098200Yq;
import X.C0C64;
import X.C0PEM;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1260300itw;
import X.C13LG;
import X.C13LP;
import X.C1537710q7N;
import X.C15438062q;
import X.C1685300txQ;
import X.C1733740vDY;
import X.C1739250vMR;
import X.C1739310vMX;
import X.C1741890vQh;
import X.C1742080vR0;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1DFH;
import X.C2010707uD;
import X.C20533215Wg;
import X.C2107308Nj;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2200821BBo;
import X.C2211631BhB;
import X.C2399609ak;
import X.C452501pT;
import X.C616540OGe;
import X.C664270Q3t;
import X.C770702zh;
import X.C786410Ut5;
import X.C948503nH;
import X.EnumC452301pR;
import X.InterfaceC1740760vOs;
import X.InterfaceC2211731BhL;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.model.RelatedProductInfo;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.IEcommerceStoreBizLogService;
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
import kotlin.Unit;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class TabShowcaseFragment extends TabCommerceFragmentImpl implements InterfaceC2211731BhL {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGEgHELIOSICo7Ki4gLWs8OyA1ISkpZxsyKhYkJjgwKTYpDz0yLygpJzs=";
    public final C1260300itw LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public boolean LLJLIL;
    public int LLJLILLLLZIIL;
    public String LLJLL;
    public AnonymousClass0956 LLJLLIL;

    @Override // X.InterfaceC2211731BhL
    public final Object LLFZ() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragmentImpl
    public final int Rc() {
        return 12;
    }

    @Override // X.InterfaceC2211731BhL, X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "b2631";
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.service.saas.TabCommerceFragment, X.InterfaceC1257980iqC
    public final void LJFF() {
        HS("profile_appear_event", new JSONObject().put("enter_method", "refresh").put("viewable_area", this.LLJL));
    }

    public TabShowcaseFragment() {
        C1260300itw c1260300itw = new C1260300itw();
        c1260300itw.LIZIZ = this;
        this.LLJJJJJIL = c1260300itw;
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS570S0100000_26(this, 651));
        this.LLJLL = "";
    }

    @Override // X.InterfaceC1258040iqI
    public final View LJJLIIIJILLIZJL() {
        C1537710q7N c1537710q7NWS = wS();
        if (c1537710q7NWS != null) {
            return c1537710q7NWS.findViewByName("profile-shop-list");
        }
        return null;
    }

    public final void PS() {
        C13LG<Long> c13lg;
        this.LLJJ = System.currentTimeMillis();
        AnonymousClass0956 anonymousClass0956 = this.LLJLLIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJLLIL = null;
        this.LLJJI = 0L;
        this.LLJJJJLIIL = false;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJJIJIIJIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            this.LLJJIJIIJIL = null;
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
            C786410Ut5.LJJJLZIJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, (ViewGroup) getView());
        }
        this.LLJILLL = u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(this.LLJILJILJ, "{author_id}", zS().id, false), "{target_sec_uid}", zS().secId, false), "{follow_status}", String.valueOf(zS().followStatus), false);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append("&nickname=");
        sbLIZ.append(Uri.encode(zS().nickname));
        this.LLJILLL = C2188811AlT.LIZIZ(sbLIZ);
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
                this.LLJILLL = C2010707uD.LIZ(Uri.encode(C1741890vQh.LJIIIIZZ(listLJLJJLL)), this.LLJILLL, "video_product_id");
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJLLIL = C948503nH.LJ(C948503nH.LIZIZ(this), C2107308Nj.LIZ, new C1739250vMR(this, null));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragmentImpl, com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(TabShowcaseFragment.class.getName());
        }
        super.onResume();
        C2211631BhB.LJIIZILJ(this, false);
        if (getUserVisibleHint()) {
            HS("profile_appear_event", new JSONObject().put("enter_method", Intrinsics.LJFF(getActivity(), C036A.LIZ()) ? "resume" : "pop").put("viewable_area", this.LLJL));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragmentImpl, com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        if (getUserVisibleHint()) {
            HS("profile_disappear_event", new JSONObject().put("quit_type", C036A.LIZIZ() ? "close" : requireActivity().isFinishing() ? "return" : "next"));
        }
        super.onStop();
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

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void MR(int i) {
        if (!getUserVisibleHint() && i == 1) {
            this.LLJJL = true;
        }
    }

    public final void NS(String str) {
        String string;
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString(str)) != null && !a0.LJJJIL(string)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLJILJILJ);
            sbLIZ.append('&');
            sbLIZ.append(str);
            sbLIZ.append('=');
            sbLIZ.append(string);
            this.LLJILJILJ = C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    @Override // X.InterfaceC1257980iqC
    public final void q3(boolean z) {
        boolean z2;
        JSONObject jSONObject = new JSONObject();
        if (LJJLIIIJILLIZJL() != null && !this.LLJJJJJIL.LIZIZ()) {
            z2 = true;
        } else {
            z2 = false;
        }
        HS("profile_move_event", jSONObject.put("is_full_screen", z2).put("viewable_area", this.LLJL));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragmentImpl, com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Bundle arguments;
        String str;
        Object obj;
        boolean zBooleanValue = z;
        String string = null;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/ecommerce/showcase/profile/TabShowcaseFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(zBooleanValue)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnu3ZuhKqaILhr0sz6YkaWp60qRs/9fsC+Q6hB6orHsWDy8Cweo=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            zBooleanValue = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(zBooleanValue);
        if (zBooleanValue) {
            if (this.LLJJJJLIIL) {
                JSONObject jSONObject = new JSONObject();
                if (this.LLJJL) {
                    str = "slide";
                } else {
                    str = "click";
                }
                HS("profile_appear_event", jSONObject.put("enter_method", str).put("viewable_area", this.LLJL));
            }
            Bundle arguments2 = getArguments();
            Map<String, String> map = (Map) this.LLJJLIIIJLLLLLLLZ.getValue();
            boolean zBS = BS();
            HashMap map2 = new HashMap();
            if (!this.LLJJJJLIIL) {
                map2.put("show_to_click", Long.valueOf(this.LLJJI - this.LLJJ));
            }
            map2.putAll(C1733740vDY.LJ(this, "c8467.d0"));
            IEcommerceStoreBizLogService iEcommerceStoreBizLogService = (IEcommerceStoreBizLogService) PluggableExtentionKt.pluggableSpi$default(IEcommerceStoreBizLogService.class, false, false, false, 14, null);
            if (iEcommerceStoreBizLogService != null) {
                iEcommerceStoreBizLogService.LIZJ(arguments2, map, map2, zBS);
            }
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                string = arguments3.getString("has_red_dot");
            }
            if (Intrinsics.LJFF(string, "1") && (arguments = getArguments()) != null) {
                C786410Ut5.LJJJI("has_red_dot", CardStruct.IStatusCode.DEFAULT, arguments);
            }
            this.LLJJL = false;
        } else if (this.LLJJJJLIIL) {
            HS("profile_disappear_event", new JSONObject().put("quit_type", "change_tab"));
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && zBooleanValue) {
            C20533215Wg.LIZ(TabShowcaseFragment.class);
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
        if (z) {
            HS("follow_status_update", new JSONObject().put("follow_status", miniUser.followStatus));
            return;
        }
        String str = this.LLJJJIL;
        if (str != null && !a0.LJJJIL(str)) {
            this.LLJJIII.put("list_source_content_id", str);
        }
        PS();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabCommerceFragmentImpl, com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String strLJI;
        String str2;
        String string;
        super.onViewCreated(view, bundle);
        C2211631BhB.LJIIZILJ(this, true);
        if (BS()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        if (BS() && C0C64.LJIILLIIL().LJIIIZ(31744, "ec_profile_seller_tab", true, false)) {
            n nVar = C1739310vMX.LIZ;
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            n nVar2 = C1739310vMX.LIZ;
            n nVar3 = (n) settingsManagerLIZLLL.LJIIIIZZ("roma_schema_group_creator_showcase", n.class, nVar2);
            if (nVar3 != null) {
                nVar2 = nVar3;
            }
            try {
                strLJI = C2399609ak.LIZJ(nVar2, "roma_schema_page_showcase_profile");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (strLJI == null) {
                strLJI = "";
            }
        } else {
            SettingsManager.LIZLLL().getClass();
            strLJI = SettingsManager.LJI("ec_profile_shop_tab_schema", "sslocal://lynxview?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_ecommerce_profile_shop%2Fpages%2Fprofile-shop.js&use_spark=1&hide_nav_bar=1&thread_strategy=0&immersive_mode=0&hide_status_bar=0&dynamic=1&use_gecko_first=1&is_host_profile={is_host_profile}&target_sec_uid={target_sec_uid}&enter_from={enter_from}&author_id={author_id}&follow_status={follow_status}&__live_platform__=webcast&ab_params=ec_showcase_new_entrance,profile_showcase_optimize_type");
        }
        this.LLJILJILJ = strLJI;
        this.LLJILJILJ = u.LJJIFFI(u.LJJIFFI(strLJI, "{enter_from}", getEnterFrom(), false), "{is_host_profile}", str, false);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLJILJILJ);
        sbLIZ.append("&is_self=");
        sbLIZ.append(str);
        this.LLJILJILJ = C2188811AlT.LIZIZ(sbLIZ);
        NS("show_window_source");
        NS("room_id");
        this.LLJJIII.put("enter_from", getEnterFrom());
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getInt("open_from") == 12) {
            str2 = "from_pdp";
        } else {
            str2 = "click";
        }
        this.LLJJIII.put("enter_method", str2);
        Map<String, Object> map = this.LLJJIII;
        int i = C1742080vR0.LIZ;
        map.put("traffic_source_list", C1742080vR0.LIZ(3, this.LLJ));
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString("source_content_id")) != null && !a0.LJJJIL(string)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this.LLJILJILJ);
            sbLIZ2.append("&source_content_id=");
            sbLIZ2.append(string);
            this.LLJILJILJ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        this.LLJJIII.putAll((Map) this.LLJJLIIIJLLLLLLLZ.getValue());
        HashMap<String, Object> map2 = this.LLJIJIL;
        if (map2 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : map2.entrySet()) {
                if (!this.LLJJIII.containsKey(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                this.LLJJIII.put((String) entry2.getKey(), entry2.getValue());
            }
        }
        PS();
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        FrameLayout frameLayout = new FrameLayout(requireContext());
        try {
            ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(frameLayout, this);
            frameLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return frameLayout;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return frameLayout;
        }
    }
}
