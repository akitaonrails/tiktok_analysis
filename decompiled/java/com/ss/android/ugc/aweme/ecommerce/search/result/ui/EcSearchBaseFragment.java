package com.ss.android.ugc.aweme.ecommerce.search.result.ui;

import X.C01GW;
import X.C0BQU;
import X.C0PD7;
import X.C0PDC;
import X.C0PR8;
import X.C0PSJ;
import X.C0Q3E;
import X.C19EG;
import X.C452501pT;
import X.C646000PVm;
import X.C650950Pg5;
import X.EnumC669620QOi;
import X.InterfaceC639130P5b;
import X.InterfaceC650190Per;
import X.InterfaceC664230Q3p;
import X.InterfaceC664250Q3r;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public abstract class EcSearchBaseFragment extends SearchVisibilityDetectFragmentNew implements InterfaceC650190Per {
    public static final /* synthetic */ int LLJJIJIL = 0;
    public SearchResultParam LLJ;
    public InterfaceC664250Q3r LLJI;
    public SearchResultParam LLJIJIL;
    public SearchResultParam LLJILJIL;
    public int LLJILLL;
    public int LLJJIII;
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 112));
    public String LLJJ = "";
    public String LLJJI = "";
    public final boolean LLJJIJI = true;
    public boolean LLJJIJIIJIL = true;

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final Object MR() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final Object SR(View view, String str) {
        return null;
    }

    public final String aS() {
        return ((InterfaceC639130P5b) this.LLJILJILJ.getValue()).getKeyword().LIZ;
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public boolean NR() {
        return this.LLJJIJI;
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final int OR() {
        return this.LLJJIII;
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final String RR(int i) {
        InterfaceC664230Q3p interfaceC664230Q3pLIZ;
        InterfaceC664250Q3r interfaceC664250Q3r = this.LLJI;
        if (interfaceC664250Q3r == null || (interfaceC664230Q3pLIZ = interfaceC664250Q3r.LIZ()) == null) {
            return "";
        }
        if (i == interfaceC664230Q3pLIZ.LIZJ(EnumC669620QOi.TOP)) {
            return "general";
        }
        if (i == interfaceC664230Q3pLIZ.LIZJ(EnumC669620QOi.VIDEO)) {
            return "video";
        }
        if (i == interfaceC664230Q3pLIZ.LIZJ(EnumC669620QOi.USER)) {
            return "user";
        }
        if (i == interfaceC664230Q3pLIZ.LIZJ(EnumC669620QOi.SOUND)) {
            return "music";
        }
        if (i == interfaceC664230Q3pLIZ.LIZJ(EnumC669620QOi.HASHTAG)) {
            return "challenge";
        }
        if (i == interfaceC664230Q3pLIZ.LIZJ(EnumC669620QOi.LIVE)) {
            return "live";
        }
        if (i == interfaceC664230Q3pLIZ.LIZJ(EnumC669620QOi.SHOP)) {
            return "shop";
        }
        if (i == interfaceC664230Q3pLIZ.LIZJ(EnumC669620QOi.STORE)) {
            return "store";
        }
        if (i == interfaceC664230Q3pLIZ.LIZJ(EnumC669620QOi.PLACE)) {
            return "place";
        }
        if (i != interfaceC664230Q3pLIZ.LIZJ(EnumC669620QOi.PHOTO)) {
            return "";
        }
        return "photos";
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final void UR(int i) {
        this.LLJILLL = i;
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final void VR(int i) {
        this.LLJJIII = i;
        this.LLILZIL.setTabIndex(i);
        this.LLILZIL.setSearchPosition(RR(i));
    }

    @Override // com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public void WR(SearchResultParam searchResultParam) {
        String keyword;
        int iLIZ = C0BQU.LIZ();
        if (iLIZ != 0 && (iLIZ == 1 || iLIZ == 2)) {
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
                    C0BQU.LIZ();
                    C0BQU.LIZ();
                }
            }
        }
        this.LLJ = searchResultParam;
    }

    public void bS(boolean z) {
        this.LLILZIL.setFragmentVisible(z);
        C0Q3E.LIZIZ(this).fe(new C0PD7(z));
    }

    public final void cS(String str) {
        this.LLJJI = str;
        this.LLILZIL.setEnterMethod(str);
        C0Q3E.LIZIZ(this).fe(new C0PDC(str));
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
        int i = this.LLJJIII;
        iSearchContextAbilityLIZIZ.fe(new C0PR8(i, RR(i)));
    }
}
