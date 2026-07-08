package com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment;

import X.C01GW;
import X.C0BQU;
import X.C0P9D;
import X.C0P9E;
import X.C0P9O;
import X.C0PD7;
import X.C0PDC;
import X.C0PR8;
import X.C0PSJ;
import X.C0PSL;
import X.C0Q3E;
import X.C0Q94;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1393800mNG;
import X.C18IO;
import X.C19EG;
import X.C452501pT;
import X.C640350P9t;
import X.C640880PBu;
import X.C644560PPy;
import X.C646000PVm;
import X.C650950Pg5;
import X.InterfaceC214902198i;
import X.InterfaceC650190Per;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public abstract class SearchBaseFragment extends SearchVisibilityDetectFragment implements InterfaceC650190Per {
    public static final /* synthetic */ int LLJL = 0;
    public SearchResultParam LLJ;
    public SearchResultParam LLJI;
    public SearchResultParam LLJIJIL;
    public int LLJILLL;
    public int LLJJJJ;
    public String LLJILJIL = "";
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 431));
    public String LLJJ = "";
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 433));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS554S0100000_10(this, 432));
    public String LLJJIJI = "";
    public String LLJJIJIIJIL = "";
    public String LLJJIJIL = "";
    public String LLJJJ = "";
    public String LLJJJIL = "";
    public int LLJJJJJIL = 1;
    public boolean LLJJJJLIIL = true;
    public boolean LLJJL = true;
    public final String LLJJLIIIJLLLLLLLZ = "";

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public boolean NR() {
        return this instanceof SearchJediMixFeedFragment;
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public Object SR(View view, String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    /* JADX INFO: renamed from: aS, reason: merged with bridge method [inline-methods] */
    public C0Q94 MR() {
        return null;
    }

    public abstract String cS();

    public void iS() {
    }

    public void kS() {
    }

    public final InterfaceC214902198i F0() {
        return (InterfaceC214902198i) this.LLJJIII.getValue();
    }

    public final C0P9D gS() {
        return (C0P9D) this.LLJILJILJ.getValue();
    }

    public final Integer hS() {
        return (Integer) this.LLJJI.getValue();
    }

    public final String dS() {
        return gS().getKeyword().LIZ;
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final int OR() {
        return this.LLJJJJ;
    }

    public String bS() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final String RR(int i) {
        if (i == C644560PPy.LJIJJLI()) {
            return "general";
        }
        C644560PPy.LIZ.getClass();
        if (i == C644560PPy.LJJ()) {
            return "video";
        }
        if (i == C644560PPy.LJIL()) {
            return "user";
        }
        if (i == C644560PPy.LJIJ()) {
            return "music";
        }
        if (i == C644560PPy.LJIIIZ()) {
            return "challenge";
        }
        if (i == C644560PPy.LJIIL()) {
            return "live";
        }
        if (i == C644560PPy.LJIIZILJ()) {
            return "shop";
        }
        if (i == C644560PPy.LJIILL()) {
            return "place";
        }
        if (i == C644560PPy.LJIILJJIL()) {
            return "photos";
        }
        if (i == C644560PPy.LIZIZ(i)) {
            return C644560PPy.LIZJ(i);
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final void UR(int i) {
        this.LLJILLL = i;
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final void VR(int i) {
        this.LLJJJJ = i;
        this.LLILZIL.setTabIndex(i);
        this.LLILZIL.setSearchPosition(RR(i));
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public void WR(SearchResultParam searchResultParam) {
        String keyword;
        SearchResultParam searchResultParam2 = this.LLJ;
        String keyword2 = null;
        if (searchResultParam2 != null) {
            keyword = searchResultParam2.getKeyword();
        } else {
            keyword = null;
        }
        if (!TextUtils.isEmpty(keyword)) {
            SearchResultParam searchResultParam3 = this.LLJ;
            if (searchResultParam3 != null) {
                keyword2 = searchResultParam3.getKeyword();
            }
            if (!TextUtils.equals(keyword2, searchResultParam.getKeyword())) {
                int iLIZ = C0BQU.LIZ();
                if (iLIZ != 1) {
                    if (iLIZ == 2) {
                        iS();
                    }
                } else {
                    kS();
                }
            }
        }
        this.LLJ = searchResultParam;
        ISearchContextAbility iSearchContextAbilityLIZIZ = C0Q3E.LIZIZ(this);
        String keyword3 = searchResultParam.getKeyword();
        String str = "";
        if (keyword3 == null) {
            keyword3 = "";
        }
        iSearchContextAbilityLIZIZ.fe(new C0P9O(keyword3));
        ISearchContextAbility iSearchContextAbilityLIZIZ2 = C0Q3E.LIZIZ(this);
        String keyword4 = searchResultParam.getKeyword();
        if (keyword4 != null) {
            str = keyword4;
        }
        iSearchContextAbilityLIZIZ2.fe(new C640880PBu(str));
    }

    public void mS(boolean z) {
        this.LLILZIL.setFragmentVisible(z);
        C0Q3E.LIZIZ(this).fe(new C0PD7(z));
        if (z) {
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            Boolean bool = Boolean.TRUE;
            C0PSL c0psl = new C0PSL();
            c0psl.LIZ = true;
            btmSDK.onPageShow(this, bool, c0psl);
        }
    }

    public final void nS(String str) {
        this.LLJJIJI = str;
        this.LLILZIL.setEnterMethod(str);
        C0Q3E.LIZIZ(this).fe(new C0PDC(str));
    }

    public final void oS(String str) {
        gS().LIZ(new C0P9E(str, 2));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C646000PVm c646000PVm = C650950Pg5.Companion;
        C19EG c19egRequireActivity = requireActivity();
        c646000PVm.getClass();
        C650950Pg5 c650950Pg5LJIIIZ = C646000PVm.LJIIIZ(this, c19egRequireActivity);
        if (c650950Pg5LJIIIZ == null) {
            return;
        }
        C0PSJ mutableData = c650950Pg5LJIIIZ.getMutableData();
        C650950Pg5 c650950Pg5Copy = c650950Pg5LJIIIZ.copy(c650950Pg5LJIIIZ.LL, mutableData.copy(this.LLILZIL, mutableData.globalData));
        c646000PVm.getClass();
        C646000PVm.LIZ(this, c650950Pg5Copy);
        ISearchContextAbility iSearchContextAbilityLIZIZ = C0Q3E.LIZIZ(this);
        int i = this.LLJJJJ;
        iSearchContextAbilityLIZIZ.fe(new C0PR8(i, RR(i)));
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        if (bS().length() > 0) {
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            String strBS = bS();
            boolean z = false;
            boolean z2 = true;
            SAFHelper sAFHelper = SAFHelper.LIZ;
            C19EG activity = getActivity();
            sAFHelper.getClass();
            Bundle bundleLIZLLL = SAFHelper.LIZLLL(this, activity);
            if (bundleLIZLLL != null) {
                string = bundleLIZLLL.getString("source_btm_token");
            } else {
                string = null;
            }
            btmSDK.registerBtmPageOnCreate(new C18IO(this, strBS, z, z, z2, string, 76));
            String pageId = btmSDK.getPageId(PageFinder.via((Fragment) this));
            ISearchContextAbility iSearchContextAbilityLIZIZ = C0Q3E.LIZIZ(this);
            if (pageId == null) {
                pageId = "";
            }
            iSearchContextAbilityLIZIZ.fe(new C640350P9t(pageId));
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/search/pages/result/common/core/ui/fragment/SearchBaseFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtYo3N1HzhDDRLpI72YnZMf+rOTrgB6IgwXYfZLQfz62aabjulGvOwJE7aMlI+aZ8GP4CmoOhfrrmSrVyI", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        if (z) {
            C0PSL c0psl = new C0PSL();
            c0psl.LIZ = true;
            C1393800mNG.LIZ(this, c0psl);
        }
    }
}
