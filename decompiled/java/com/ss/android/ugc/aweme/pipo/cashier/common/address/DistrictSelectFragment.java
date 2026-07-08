package com.ss.android.ugc.aweme.pipo.cashier.common.address;

import X.C01GW;
import X.C098200Yq;
import X.C0OM1;
import X.C1194810hCJ;
import X.C1251150ifB;
import X.C1685300txQ;
import X.C1710990ucr;
import X.C1712450ufD;
import X.C1846060y8i;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C2222691Bz1;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1194840hCM;
import X.InterfaceC1709310ua9;
import X.InterfaceC1846110y8n;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class DistrictSelectFragment extends PipoCashierBaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUlOSB9KyQ/ISY2OmHELIOSsvJiI+JytiKCs3OiA/OmEXITY4OyYwPBYpJSowPAM+KCg+LSs4";
    public String LLJJJ;
    public boolean LLJJJIL;
    public String LLJJJJ;
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1098));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1096));

    @Override // com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment, X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        return null;
    }

    public final Map<String, String> getCommonParams() {
        Pair[] pairArr = new Pair[3];
        String str = this.LLJJJJ;
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("country_code", str);
        pairArr[1] = new Pair("without_next_level", this.LLJJJIL ? "1" : CardStruct.IStatusCode.DEFAULT);
        String str2 = this.LLJJJ;
        pairArr[2] = new Pair("default_geoname_id", str2 != null ? str2 : "");
        return C2097608Jq.LJIIJ(pairArr);
    }

    @Override // com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment
    public final void onCancel(DialogInterface dialogInterface) {
        InterfaceC1709310ua9 interfaceC1709310ua9LIZ = C1710990ucr.LIZ("CASHIER");
        Map<String, String> commonParams = getCommonParams();
        commonParams.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, CardStruct.IStatusCode.DEFAULT);
        interfaceC1709310ua9LIZ.LIZ("rd_pipo_district_select_leave", commonParams);
    }

    @Override // com.ss.android.ugc.aweme.pipo.cashier.common.uicomponent.bottomsheet.PipoCashierBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        super.onViewCreated(view, bundle);
        C0OM1 c0om1 = new C0OM1();
        boolean z = true;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS570S0100000_26(this, 1097));
        c0om1.LIZIZ(c1251150ifB);
        TuxNavBar tuxNavBar = (TuxNavBar) this.LLJJJJLIIL.getValue();
        if (tuxNavBar != null) {
            tuxNavBar.setNavActions(c0om1);
        }
        Bundle arguments = getArguments();
        String str = "";
        String lowerCase = null;
        if (arguments != null) {
            string = arguments.getString("geoname_id", "");
        } else {
            string = null;
        }
        this.LLJJJ = string;
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string2 = arguments2.getString("country_code")) != null) {
            lowerCase = string2.length() == 0 ? C2222691Bz1.LIZ().toLowerCase(Locale.ROOT) : string2;
        }
        this.LLJJJJ = lowerCase;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || !arguments3.getBoolean("without_next_level", false)) {
            z = false;
        }
        this.LLJJJIL = z;
        C1710990ucr.LIZ("CASHIER").LIZ("rd_pipo_district_select_show", getCommonParams());
        final C1712450ufD c1712450ufD = (C1712450ufD) this.LLJJJJJIL.getValue();
        if (c1712450ufD != null) {
            Region region = new Region(null, this.LLJJJ, this.LLJJJJ, null, null, null, null);
            boolean z2 = this.LLJJJIL;
            AwS605S0100000_26 awS605S0100000_26 = new AwS605S0100000_26(this, 361);
            AwS605S0100000_26 awS605S0100000_262 = new AwS605S0100000_26(this, 362);
            String str2 = region.code;
            if (str2 == null) {
                str2 = "";
            }
            c1712450ufD.LLIZ = str2;
            String str3 = region.geoNameId;
            if (str3 != null) {
                str = str3;
            }
            c1712450ufD.LLIZLLLIL = str;
            new C1194810hCJ(c1712450ufD.getTabBar(), c1712450ufD.getViewPager(), false, new InterfaceC1194840hCM() { // from class: X.0ufB
                @Override // X.InterfaceC1194840hCM
                public final void LIZ(C1845940y8W c1845940y8W, int i) {
                    if (i >= 0 && i < ((ArrayList) c1712450ufD.LLILZ).size()) {
                        c1845940y8W.LIZIZ((CharSequence) ListProtector.get(c1712450ufD.LLILZ, i));
                    }
                }
            }).LIZ();
            c1712450ufD.getTabBar().LIZ(new InterfaceC1846110y8n() { // from class: X.0ufC
                @Override // X.InterfaceC1846110y8n
                public final void LIZ(C1845940y8W c1845940y8W) {
                }

                @Override // X.InterfaceC1846110y8n
                public final void LIZJ(C1845940y8W c1845940y8W) {
                }

                @Override // X.InterfaceC1846110y8n
                public final void LIZIZ(C1845940y8W c1845940y8W) {
                    int i = c1845940y8W.LIZLLL;
                    C1712450ufD c1712450ufD2 = c1712450ufD;
                    c1712450ufD2.LLJ = i;
                    int tabCount = c1712450ufD2.getTabBar().getTabCount() - 1;
                    int i2 = i + 1;
                    if (i2 <= tabCount) {
                        while (true) {
                            c1712450ufD.getTabBar().LJIILIIL(tabCount);
                            if (tabCount == i2) {
                                break;
                            } else {
                                tabCount--;
                            }
                        }
                    }
                    int size = ((ArrayList) c1712450ufD.LLILZ).size();
                    for (int i3 = i2; i3 < size; i3++) {
                        C19719612Di.LJJIJIIJI(c1712450ufD.LLILZ);
                    }
                    int size2 = ((ArrayList) c1712450ufD.LLILZLL).size();
                    while (i2 < size2) {
                        C19719612Di.LJJIJIIJI(c1712450ufD.LLILZLL);
                        i2++;
                    }
                    int size3 = ((ArrayList) c1712450ufD.LLILZIL).size();
                    for (int i4 = i; i4 < size3; i4++) {
                        C19719612Di.LJJIJIIJI(c1712450ufD.LLILZIL);
                    }
                    if (i >= 0 && i < ((ArrayList) c1712450ufD.LLILZ).size()) {
                        c1845940y8W.LIZIZ((CharSequence) ListProtector.get(c1712450ufD.LLILZ, i));
                    }
                }
            });
            C1846060y8i tabBar = c1712450ufD.getTabBar();
            tabBar.LIZIZ(c1712450ufD.getTabBar().LJIIIZ(), tabBar.LLILZLL.size(), tabBar.LLILZLL.isEmpty());
            c1712450ufD.LIZ(region, z2, awS605S0100000_26, awS605S0100000_262);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dvo, viewGroup, false);
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
