package com.ss.android.ugc.aweme.homepage.spi;

import X.AbstractC1583720rJa;
import X.C0CUJ;
import X.C0CUL;
import X.C0DML;
import X.C0QSJ;
import X.C13BV;
import X.C13LP;
import X.C14LC;
import X.C15438062q;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1583620rJQ;
import X.C1584320rKY;
import X.C1585030rLh;
import X.C1592450rXf;
import X.C1594480raw;
import X.C1606660rua;
import X.C19EG;
import X.C2188811AlT;
import X.C296200BjG;
import X.C297720Bli;
import X.C324500Cno;
import X.C687700QyG;
import X.InterfaceC1570900qyu;
import X.InterfaceC1583870rJp;
import X.InterfaceC665370Q7z;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.experiment.SlidePage;
import com.ss.android.ugc.aweme.experiment.SlidePageItem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.spi.HomePageCommonService;
import com.ss.android.ugc.aweme.unlogin.UnloginSignUpFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS232S0000000_4;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class HomePageCommonServiceImpl implements HomePageCommonService {
    @Override // com.ss.android.ugc.aweme.spi.HomePageCommonService
    public final int LIZ() {
        C1592450rXf.LLLIZZ.getClass();
        return C1592450rXf.LLLL;
    }

    @Override // com.ss.android.ugc.aweme.spi.HomePageCommonService
    public final AbstractC1583720rJa LIZIZ() {
        C1583620rJQ.LIZ.getClass();
        return C1583620rJQ.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.spi.HomePageCommonService
    public final AbstractC1583720rJa LJI() {
        C1583620rJQ.LIZ.getClass();
        return C1583620rJQ.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.spi.HomePageCommonService
    public final boolean LIZLLL() {
        return ((IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class)).LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.spi.HomePageCommonService
    public final int LJFF() {
        return C14LC.LJIILIIL;
    }

    @Override // com.ss.android.ugc.aweme.spi.HomePageCommonService
    public final Class<? extends Fragment> LJII() {
        return UnloginSignUpFragment.class;
    }

    @Override // com.ss.android.ugc.aweme.spi.HomePageCommonService
    public final boolean LJIIIIZZ() {
        return C1594480raw.LLILZIL;
    }

    @Override // com.ss.android.ugc.aweme.spi.HomePageCommonService
    public final AbstractC1583720rJa LJIIIZ(C19EG c19eg) {
        SlidePageItem slidePageItem;
        C1583620rJQ.LIZ.getClass();
        SlidePage slidePageLJIIIZ = C1585030rLh.LJIIIZ();
        if (slidePageLJIIIZ != null && (slidePageItem = slidePageLJIIIZ.right) != null) {
            C1583620rJQ.LIZJ = C1583620rJQ.LIZ(c19eg, slidePageItem.landingPage);
        }
        return C1583620rJQ.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.spi.HomePageCommonService
    public final JSONObject LIZJ(C19EG c19eg, ITabStrip iTabStrip) {
        HomeTabAbility homeTabAbility;
        List listL32;
        List<BottomTabProtocol> listSz;
        String str;
        boolean z;
        String str2;
        int i;
        HomeViewPagerAbility homeViewPagerAbility;
        int size;
        C0CUJ c0cujRo2;
        Pair<List<InterfaceC1570900qyu>, List<InterfaceC1570900qyu>> pairPI;
        String strLIZIZ;
        Object ability;
        String str3;
        Object ability2;
        new Object() { // from class: X.0DMP
        }.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            InterfaceC665370Q7z interfaceC665370Q7zLJI = C1558360qeg.LJI(c19eg, null);
            if (C296200BjG.LIZ()) {
                C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(interfaceC665370Q7zLJI, MainActivityScope.class);
                if (c0qsjLIZJ != null) {
                    ability2 = c0qsjLIZJ.getAbility(HomeTabAbility.class);
                } else {
                    ability2 = null;
                }
                if (!(ability2 instanceof HomeTabAbility)) {
                    ability2 = null;
                }
                homeTabAbility = (HomeTabAbility) ability2;
            } else {
                homeTabAbility = (HomeTabAbility) C1558520qew.LIZ(interfaceC665370Q7zLJI, HomeTabAbility.class, null);
            }
            if (homeTabAbility != null) {
                listL32 = homeTabAbility.l32();
            } else {
                listL32 = null;
            }
            if (listL32 == null) {
                listL32 = C13BV.INSTANCE;
            }
            if (homeTabAbility == null || (listSz = homeTabAbility.Sz()) == null) {
                C1584320rKY.LIZ.getClass();
                listSz = C1584320rKY.LIZIZ;
            }
            if (iTabStrip != null) {
                Pair<List<String>, List<String>> pairTg1 = iTabStrip.Tg1();
                List<String> first = pairTg1.getFirst();
                List<String> second = pairTg1.getSecond();
                C1592450rXf c1592450rXfLV0 = iTabStrip.LV0();
                if (!(c1592450rXfLV0 instanceof C1592450rXf)) {
                    c1592450rXfLV0 = null;
                }
                jSONObject.put("full_tab_cnt", first.size());
                jSONObject.put("full_tab_name", C13LP.LJJLIIIJ(first, ",", null, null, 0, null, null, 62));
                jSONObject.put("tab_cnt", second.size());
                jSONObject.put("tab_name", C13LP.LJJLIIIJ(second, ",", null, null, 0, null, null, 62));
                if (c1592450rXfLV0 != null) {
                    String strLJJLIIIJ = C13LP.LJJLIIIJ(C324500Cno.LIZ(c1592450rXfLV0, first, AFwS232S0000000_4.get$arr$(38)), ",", null, null, 0, null, null, 62);
                    String strLJJLIIIJ2 = C13LP.LJJLIIIJ(C324500Cno.LIZ(c1592450rXfLV0, second, AFwS232S0000000_4.get$arr$(39)), ",", null, null, 0, null, null, 62);
                    jSONObject.put("local_full_tab_name", strLJJLIIIJ);
                    jSONObject.put("local_tab_name", strLJJLIIIJ2);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1606660rua.LIZIZ.LJIIJ("show_homepage_tab", linkedHashMap);
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listSz, 10));
            for (BottomTabProtocol bottomTabProtocol : listSz) {
                C1584320rKY c1584320rKY = C1584320rKY.LIZ;
                String tag = bottomTabProtocol.getTag();
                c1584320rKY.getClass();
                arrayList.add(C1584320rKY.LJI(tag));
            }
            int size2 = arrayList.size();
            String str4 = "be_null";
            if (size2 < 2) {
                str = "be_null";
            } else {
                str = (String) arrayList.get(1);
            }
            jSONObject.put("bottom_2tab_name", str);
            IMainTabStripReport iMainTabStripReport = (IMainTabStripReport) PluggableExtentionKt.pluggableSpi$default(IMainTabStripReport.class, false, false, false, 14, null);
            if (iMainTabStripReport == null || !iMainTabStripReport.LIZ()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (size2 < 3) {
                    str3 = "be_null";
                } else {
                    str3 = (String) arrayList.get(2);
                }
                jSONObject.put("bottom_3tab_name", str3);
            }
            if (size2 < 4) {
                str2 = "be_null";
            } else {
                str2 = (String) arrayList.get(3);
            }
            jSONObject.put("bottom_4tab_name", str2);
            if (size2 >= 5) {
                str4 = (String) arrayList.get(4);
            }
            jSONObject.put("bottom_5tab_name", str4);
            if (arrayList.size() >= 6 && C1585030rLh.LJIIL()) {
                jSONObject.put("bottom_6tab_name", arrayList.get(5));
            }
            if (size2 >= 2 && TextUtils.equals((CharSequence) arrayList.get(1), "homepage_live")) {
                jSONObject.put("live_tab_style", "2");
            }
            if (C297720Bli.LIZ()) {
                i = 0;
                C0QSJ c0qsjLIZJ2 = C687700QyG.LIZJ(interfaceC665370Q7zLJI, MainActivityScope.class);
                if (c0qsjLIZJ2 != null) {
                    ability = c0qsjLIZJ2.getAbility(HomeViewPagerAbility.class);
                } else {
                    ability = null;
                }
                if (!(ability instanceof HomeViewPagerAbility)) {
                    ability = null;
                }
                homeViewPagerAbility = (HomeViewPagerAbility) ability;
            } else {
                i = 0;
                homeViewPagerAbility = (HomeViewPagerAbility) C1558520qew.LIZ(interfaceC665370Q7zLJI, HomeViewPagerAbility.class, null);
            }
            if (homeViewPagerAbility == null) {
                size = listL32.size() - 1;
            } else {
                size = homeViewPagerAbility.P81();
            }
            int size3 = listL32.size();
            while (i < size3) {
                int i2 = size - i;
                if (i2 >= 0) {
                    i2++;
                }
                if (i2 < 0) {
                    strLIZIZ = "top_neg1tab_name";
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("top_");
                    sbLIZ.append(i2);
                    sbLIZ.append("tab_name");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                C1584320rKY c1584320rKY2 = C1584320rKY.LIZ;
                String strTag = ((InterfaceC1583870rJp) listL32.get(i)).tag();
                c1584320rKY2.getClass();
                jSONObject.put(strLIZIZ, C1584320rKY.LJI(strTag));
                for (Map.Entry<String, String> entry2 : ((InterfaceC1583870rJp) listL32.get(i)).LIZ().entrySet()) {
                    jSONObject.put(entry2.getKey(), entry2.getValue());
                }
                i++;
            }
            IMFToolBarAbility iMFToolBarAbilityLIZIZ = C0CUL.LIZIZ(interfaceC665370Q7zLJI);
            if (iMFToolBarAbilityLIZIZ != null) {
                c0cujRo2 = iMFToolBarAbilityLIZIZ.ro2();
            } else {
                c0cujRo2 = null;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (c0cujRo2 != null) {
            jSONObject.put("top_left_icon", C13LP.LJJLIIIJ(c0cujRo2.LIZ, ",", null, null, 0, null, null, 62));
            jSONObject.put("top_right_icon", C13LP.LJJLIIIJ(c0cujRo2.LIZIZ, ",", null, null, 0, null, null, 62));
            return jSONObject;
        }
        if (homeTabAbility != null && (pairPI = homeTabAbility.pI()) != null) {
            for (Map.Entry entry3 : ((HashMap) C0DML.LIZIZ(pairPI)).entrySet()) {
                jSONObject.put((String) entry3.getKey(), entry3.getValue());
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bc  */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r11v1, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0CPp] */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.0CPp] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2, types: [T] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // com.ss.android.ugc.aweme.spi.HomePageCommonService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ(android.view.ViewGroup r11, android.view.ViewGroup r12) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.homepage.spi.HomePageCommonServiceImpl.LJ(android.view.ViewGroup, android.view.ViewGroup):boolean");
    }
}
