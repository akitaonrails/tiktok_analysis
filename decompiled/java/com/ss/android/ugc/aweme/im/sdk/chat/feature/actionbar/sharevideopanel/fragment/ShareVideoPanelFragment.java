package com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.sharevideopanel.fragment;

import X.C01GW;
import X.C04PJ;
import X.C098200Yq;
import X.C0I0B;
import X.C0OM1;
import X.C0Y8T;
import X.C0YSQ;
import X.C0ZFW;
import X.C1229100i5c;
import X.C1245500iW4;
import X.C1245510iW5;
import X.C1245520iW6;
import X.C1250250idj;
import X.C13BV;
import X.C13LQ;
import X.C1529305yl;
import X.C1646806cc;
import X.C1685300txQ;
import X.C1845940y8W;
import X.C1846060y8i;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2097608Jq;
import X.C23250099c;
import X.C259800zU;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1646906cd;
import X.InterfaceC1846110y8n;
import X.InterfaceC344240DeY;
import X.InterfaceC876950Yaj;
import Y.AObserverS216S0100000_12;
import Y.AObserverS223S0100000_19;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.sharevideopanel.fragment.ShareVideoPanelFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.sharevideopanel.viewmodel.ShareVideoPanelViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.sharevideo.IShareVideoService;
import com.ss.android.ugc.aweme.im.sdk.chat.utils.ChatRoomEventTrackingStore;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ShareVideoPanelFragment extends BaseFragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwhZzw3I2svIS4nZiMpKDsmOiBiKCwnISoiKyHELIOS4hZjYkKD02PiwoLCAjKSspJWE1OiQrJCo9PGsfIS4hLRMlLSo8GCQiLCMVOiQrJCo9PA==";
    public FrameLayout LLIZ;
    public C197039127h LLIZLLLIL;
    public C1846060y8i LLJI;
    public Boolean LLJILJIL;
    public boolean LLJILLL;
    public String LLJJ;
    public List<Integer> LLJ = C13BV.INSTANCE;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1503));
    public boolean LLJILJILJ = true;

    static {
        new C1245500iW4();
    }

    public final ShareVideoPanelViewModel SR() {
        return (ShareVideoPanelViewModel) this.LLJIJIL.getValue();
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131824662);
        c0om1.LIZJ = c1250250idj;
        return c0om1;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
        this.LLIZLLLIL = null;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [T, X.0956] */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        int[] intArray;
        List<Integer> listLJJLJ;
        Integer numValueOf;
        String string;
        String strLIZ;
        Bundle bundle3;
        Boolean boolValueOf;
        int i;
        C1646806cc c1646806ccLIZ;
        String string2;
        String strLIZLLL;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (intArray = arguments.getIntArray("panel_type_list")) != null && (listLJJLJ = C13LQ.LJJLJ(intArray)) != null) {
            this.LLJ = listLJJLJ;
            ShareVideoPanelViewModel shareVideoPanelViewModelSR = SR();
            List<Integer> list = this.LLJ;
            shareVideoPanelViewModelSR.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C1245520iW6(it2.next().intValue(), 5));
            }
            shareVideoPanelViewModelSR.LLILLJJLI.setValue(arrayList);
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                numValueOf = Integer.valueOf(arguments2.getInt("share_scene"));
            } else {
                numValueOf = null;
            }
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                string = arguments3.getString("conversation_id");
            } else {
                string = null;
            }
            String str = "";
            if (string == null) {
                string = "";
            }
            Bundle arguments4 = getArguments();
            if (arguments4 == null || (strLIZ = arguments4.getString("uuid")) == null) {
                strLIZ = ChatRoomEventTrackingStore.LIZIZ.LIZ();
            }
            Bundle arguments5 = getArguments();
            if (arguments5 != null) {
                bundle3 = arguments5.getBundle("key_local_ext");
            } else {
                bundle3 = null;
            }
            if (bundle3 != null) {
                boolValueOf = Boolean.valueOf(bundle3.getBoolean("force_old_ui_style", false));
            } else {
                boolValueOf = null;
            }
            this.LLJILJIL = boolValueOf;
            if (bundle3 != null) {
                i = bundle3.getInt("is_from_action_bar");
                String string3 = bundle3.getString("share_post_panel_enter_method");
                if (string3 != null) {
                    str = string3;
                }
            } else {
                i = 0;
            }
            C0I0B.LJFF.LIZIZ();
            C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(string);
            if (c0y8tLIZ != null) {
                if (c0y8tLIZ.isSingleChat()) {
                    strLIZLLL = "private";
                } else {
                    strLIZLLL = C1229100i5c.LIZLLL(string);
                }
                C20684815ws.LJIILLIIL("enter_dm_share_post", C2097608Jq.LJIIIIZZ(new Pair("conversation_id", string), new Pair("chat_type", strLIZLLL), new Pair("enter_from", "chat"), new Pair("enter_method", str), new Pair("is_from_action_bar", String.valueOf(i)), new Pair("is_master", C1529305yl.LIZ(Boolean.valueOf(C0ZFW.LJIJ(string))))));
            }
            SR().LLILZIL = bundle3;
            SR().LLILZLL = strLIZ;
            final ViewPager viewPager = (ViewPager) view.findViewById(R.id.v2y);
            IShareVideoService.LIZ.getClass();
            IShareVideoService value = C04PJ.LIZIZ.getValue();
            if (value != null) {
                c1646806ccLIZ = value.LIZ(this.LLJ, string, numValueOf, getChildFragmentManager(), this.LLJILJIL, getContext());
            } else {
                c1646806ccLIZ = null;
            }
            viewPager.setAdapter(c1646806ccLIZ);
            viewPager.setOffscreenPageLimit(3);
            C1846060y8i c1846060y8i = (C1846060y8i) view.findViewById(R.id.v2x);
            if (c1846060y8i != null) {
                this.LLJI = c1846060y8i;
                Iterator<Integer> it3 = this.LLJ.iterator();
                while (it3.hasNext()) {
                    int iIntValue = it3.next().intValue();
                    if (iIntValue == EnumC1646906cd.LIKED.getType()) {
                        string2 = getString(2131824661);
                    } else if (iIntValue == EnumC1646906cd.FAVORITE.getType()) {
                        string2 = getString(2131824660);
                    } else if (iIntValue == EnumC1646906cd.YOURS.getType()) {
                        string2 = getString(2131824663);
                    } else if (iIntValue == EnumC1646906cd.REPOSTED.getType()) {
                        string2 = getString(2131846354);
                    }
                    if (string2 != null) {
                        C1845940y8W c1845940y8WLJIIIZ = c1846060y8i.LJIIIZ();
                        c1845940y8WLJIIIZ.LIZIZ(string2);
                        c1846060y8i.LIZIZ(c1845940y8WLJIIIZ, c1846060y8i.LLILZLL.size(), c1846060y8i.LLILZLL.isEmpty());
                    }
                }
                C1846060y8i.LJIJI(c1846060y8i, viewPager);
                c1846060y8i.LIZ(new InterfaceC1846110y8n() { // from class: X.0iW3
                    @Override // X.InterfaceC1846110y8n
                    public final void LIZ(C1845940y8W c1845940y8W) {
                    }

                    @Override // X.InterfaceC1846110y8n
                    public final void LIZJ(C1845940y8W c1845940y8W) {
                    }

                    @Override // X.InterfaceC1846110y8n
                    public final void LIZIZ(C1845940y8W c1845940y8W) {
                        String str2;
                        this.LIZ.LLJILJILJ = false;
                        viewPager.setCurrentItem(c1845940y8W.LIZLLL, true);
                        ShareVideoPanelFragment shareVideoPanelFragment = this.LIZ;
                        int iIntValue2 = ((Number) ListProtector.get(shareVideoPanelFragment.LLJ, c1845940y8W.LIZLLL)).intValue();
                        shareVideoPanelFragment.getClass();
                        if (iIntValue2 == EnumC1646906cd.YOURS.getType()) {
                            str2 = "your";
                        } else if (iIntValue2 == EnumC1646906cd.LIKED.getType()) {
                            str2 = "liked";
                        } else if (iIntValue2 == EnumC1646906cd.FAVORITE.getType()) {
                            str2 = "favorite";
                        } else if (iIntValue2 == EnumC1646906cd.REPOSTED.getType()) {
                            str2 = "reposted";
                        } else {
                            str2 = "";
                        }
                        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
                        C830490Whz c830490Whz = new C830490Whz();
                        c830490Whz.put("enter_from", "chat");
                        c830490Whz.put("tab_name", str2);
                        interfaceC1493505szLIZIZ.sendEvent("change_share_tab", c830490Whz);
                    }
                });
            }
        }
        SR().LL.observe(this, new AObserverS216S0100000_12(this, 62));
        SR().LLILZ.observe(this, new AObserverS223S0100000_19(this, 53));
        C259800zU c259800zU = new C259800zU();
        String string4 = null;
        c259800zU.element = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(SR()), null, null, new C1245510iW5(this, c259800zU, null), 3);
        Bundle arguments6 = getArguments();
        if (arguments6 != null && (bundle2 = arguments6.getBundle("key_local_ext")) != null) {
            string4 = bundle2.getString("unique_key");
        }
        this.LLJJ = string4;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.chs, viewGroup, false);
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
