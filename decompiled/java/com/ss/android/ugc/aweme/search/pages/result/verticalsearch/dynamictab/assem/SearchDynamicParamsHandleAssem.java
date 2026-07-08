package com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.assem;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0P91;
import X.C0PM7;
import X.C0PO5;
import X.C0PSG;
import X.C0Q3E;
import X.C0Q3Q;
import X.C14EU;
import X.C1533950q1J;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C19EG;
import X.C2097608Jq;
import X.C2344509Gp;
import X.C326370Cqp;
import X.C641110PCr;
import X.C644060POa;
import X.C646670PYb;
import X.C646870PYv;
import X.C646880PYw;
import X.C662670Pyz;
import X.C669480QNu;
import X.C679340Qkm;
import X.C723580SZw;
import X.C724240Sb0;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.search.common.utils.SearchLocationCacheData;
import com.ss.android.ugc.aweme.search.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.model.SearchEnterViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.survey.core.viewmodel.SurveyViewModel;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchRequestParam;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicPageAbility;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicParamsHandleAbility;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.fragment.BaseSearchDynamicTabFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchDynamicParamsHandleAssem<D> extends AbstractC738140SxQ implements ISearchDynamicParamsHandleAbility, InterfaceC1554640qYg {
    public final C1559260qg8 LL = new C1559260qg8(new C723580SZw(this, C646880PYw.class, "search_dynamic_fragment_data_key"), checkSupervisorPrepared());
    public SearchEnterViewModel LLILLJJLI;
    public SearchStartViewModel LLILLL;
    public SurveyViewModel LLILZ;
    public SearchStateViewModel LLILZIL;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -523800355) {
            return null;
        }
        return this;
    }

    public final C646880PYw<D> bo() {
        return (C646880PYw) this.LL.getValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009a  */
    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicParamsHandleAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String sb1() {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.assem.SearchDynamicParamsHandleAssem.sb1():java.lang.String");
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        C19EG c19eg;
        super.onParentViewCreated();
        EventBus.LIZLLL().LJIJJ(this);
        C646880PYw<D> c646880PYwBo = bo();
        if (c646880PYwBo == null || (c19eg = c646880PYwBo.LL) == null) {
            return;
        }
        this.LLILLJJLI = (SearchEnterViewModel) C679340Qkm.LIZIZ(C724240Sb0.LJI(this), c19eg).get(SearchEnterViewModel.class);
        this.LLILLL = (SearchStartViewModel) C679340Qkm.LIZIZ(C724240Sb0.LJI(this), c19eg).get(SearchStartViewModel.class);
        this.LLILZ = (SurveyViewModel) C679340Qkm.LIZIZ(C724240Sb0.LJI(this), c19eg).get(SurveyViewModel.class);
        this.LLILZIL = (SearchStateViewModel) C679340Qkm.LIZIZ(C724240Sb0.LJI(this), c19eg).get(SearchStateViewModel.class);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        C1558520qew.LIZLLL(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0159 A[PHI: r30
      0x0159: PHI (r30v8 java.lang.String) = (r30v0 java.lang.String), (r30v9 java.lang.String) binds: [B:98:0x0151, B:100:0x0157] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x015d A[PHI: r30 r31
      0x015d: PHI (r30v1 java.lang.String) = (r30v8 java.lang.String), (r30v9 java.lang.String) binds: [B:102:0x015b, B:100:0x0157] A[DONT_GENERATE, DONT_INLINE]
      0x015d: PHI (r31v0 java.lang.String) = (r31v7 java.lang.String), (r31v8 java.lang.String) binds: [B:102:0x015b, B:100:0x0157] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0163 A[PHI: r30 r31
      0x0163: PHI (r30v7 java.lang.String) = (r30v1 java.lang.String), (r30v8 java.lang.String) binds: [B:104:0x0161, B:102:0x015b] A[DONT_GENERATE, DONT_INLINE]
      0x0163: PHI (r31v6 java.lang.String) = (r31v0 java.lang.String), (r31v7 java.lang.String) binds: [B:104:0x0161, B:102:0x015b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0167 A[PHI: r30 r31 r32
      0x0167: PHI (r30v6 java.lang.String) = (r30v1 java.lang.String), (r30v7 java.lang.String) binds: [B:104:0x0161, B:106:0x0165] A[DONT_GENERATE, DONT_INLINE]
      0x0167: PHI (r31v5 java.lang.String) = (r31v0 java.lang.String), (r31v6 java.lang.String) binds: [B:104:0x0161, B:106:0x0165] A[DONT_GENERATE, DONT_INLINE]
      0x0167: PHI (r32v5 java.lang.String) = (r32v0 java.lang.String), (r32v6 java.lang.String) binds: [B:104:0x0161, B:106:0x0165] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x016d A[PHI: r30 r31 r32
      0x016d: PHI (r30v2 java.lang.String) = (r30v6 java.lang.String), (r30v7 java.lang.String) binds: [B:108:0x016b, B:106:0x0165] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r31v1 java.lang.String) = (r31v5 java.lang.String), (r31v6 java.lang.String) binds: [B:108:0x016b, B:106:0x0165] A[DONT_GENERATE, DONT_INLINE]
      0x016d: PHI (r32v1 java.lang.String) = (r32v5 java.lang.String), (r32v6 java.lang.String) binds: [B:108:0x016b, B:106:0x0165] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0171 A[PHI: r30 r31 r32 r33
      0x0171: PHI (r30v5 java.lang.String) = (r30v2 java.lang.String), (r30v6 java.lang.String) binds: [B:110:0x016f, B:108:0x016b] A[DONT_GENERATE, DONT_INLINE]
      0x0171: PHI (r31v4 java.lang.String) = (r31v1 java.lang.String), (r31v5 java.lang.String) binds: [B:110:0x016f, B:108:0x016b] A[DONT_GENERATE, DONT_INLINE]
      0x0171: PHI (r32v4 java.lang.String) = (r32v1 java.lang.String), (r32v5 java.lang.String) binds: [B:110:0x016f, B:108:0x016b] A[DONT_GENERATE, DONT_INLINE]
      0x0171: PHI (r33v3 java.lang.String) = (r33v0 java.lang.String), (r33v4 java.lang.String) binds: [B:110:0x016f, B:108:0x016b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0177 A[PHI: r30 r31 r32 r33
      0x0177: PHI (r30v4 java.lang.String) = (r30v2 java.lang.String), (r30v5 java.lang.String) binds: [B:110:0x016f, B:112:0x0175] A[DONT_GENERATE, DONT_INLINE]
      0x0177: PHI (r31v3 java.lang.String) = (r31v1 java.lang.String), (r31v4 java.lang.String) binds: [B:110:0x016f, B:112:0x0175] A[DONT_GENERATE, DONT_INLINE]
      0x0177: PHI (r32v3 java.lang.String) = (r32v1 java.lang.String), (r32v4 java.lang.String) binds: [B:110:0x016f, B:112:0x0175] A[DONT_GENERATE, DONT_INLINE]
      0x0177: PHI (r33v2 java.lang.String) = (r33v0 java.lang.String), (r33v3 java.lang.String) binds: [B:110:0x016f, B:112:0x0175] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x020c A[PHI: r15
      0x020c: PHI (r15v1 int) = (r15v0 int), (r15v4 int) binds: [B:164:0x0208, B:60:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f3 A[PHI: r22
      0x00f3: PHI (r22v3 java.lang.String) = (r22v0 java.lang.String), (r22v4 java.lang.String) binds: [B:72:0x00f1, B:70:0x00ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f9 A[PHI: r22
      0x00f9: PHI (r22v2 java.lang.String) = (r22v0 java.lang.String), (r22v3 java.lang.String) binds: [B:72:0x00f1, B:74:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0153 A[PHI: r30
      0x0153: PHI (r30v9 java.lang.String) = (r30v0 java.lang.String), (r30v10 java.lang.String) binds: [B:98:0x0151, B:96:0x014d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicParamsHandleAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void NP2(X.C0QER r39) {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.assem.SearchDynamicParamsHandleAssem.NP2(X.0QER):void");
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void setRequestSuccessConfig(C2344509Gp c2344509Gp) throws Throwable {
        jF1(c2344509Gp.LIZ, c2344509Gp.LIZIZ);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicParamsHandleAbility
    public final void uf2(Throwable th) {
        BaseSearchDynamicTabFragment<D> baseSearchDynamicTabFragment;
        ISearchDynamicPageAbility iSearchDynamicPageAbility;
        C646880PYw<D> c646880PYwBo = bo();
        SearchResultParam searchResultParamI = null;
        if (c646880PYwBo != null && (baseSearchDynamicTabFragment = c646880PYwBo.LLILLJJLI) != null && (iSearchDynamicPageAbility = (ISearchDynamicPageAbility) C1558520qew.LIZ(C1558360qeg.LJFF(baseSearchDynamicTabFragment, null), ISearchDynamicPageAbility.class, null)) != null) {
            searchResultParamI = iSearchDynamicPageAbility.I();
        }
        C644060POa.LIZ.getClass();
        C0PO5 c0po5LJII = C644060POa.LJII(searchResultParamI);
        c0po5LJII.LJIILIIL();
        c0po5LJII.LJIL(1);
        c0po5LJII.LJ(th.getMessage());
        c0po5LJII.LJIJI(th);
        c0po5LJII.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicParamsHandleAbility
    public final void Mg0(int i, SearchApiResult searchApiResult) {
        BaseSearchDynamicTabFragment<D> baseSearchDynamicTabFragment;
        ISearchDynamicPageAbility iSearchDynamicPageAbility;
        C646880PYw<D> c646880PYwBo = bo();
        SearchResultParam searchResultParamI = null;
        if (c646880PYwBo != null && (baseSearchDynamicTabFragment = c646880PYwBo.LLILLJJLI) != null && (iSearchDynamicPageAbility = (ISearchDynamicPageAbility) C1558520qew.LIZ(C1558360qeg.LJFF(baseSearchDynamicTabFragment, null), ISearchDynamicPageAbility.class, null)) != null) {
            searchResultParamI = iSearchDynamicPageAbility.I();
        }
        C644060POa.LIZ.getClass();
        C0PO5 c0po5LJII = C644060POa.LJII(searchResultParamI);
        c0po5LJII.LIZIZ(i);
        c0po5LJII.LJIILIIL();
        c0po5LJII.LJII(searchApiResult.getRequestId());
        c0po5LJII.LJIJ(searchApiResult);
        c0po5LJII.LJIL(0);
        c0po5LJII.LIZLLL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0135  */
    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicParamsHandleAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void jF1(com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig r16, com.ss.android.ugc.aweme.feed.model.LogPbBean r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.assem.SearchDynamicParamsHandleAssem.jF1(com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig, com.ss.android.ugc.aweme.feed.model.LogPbBean):void");
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.ability.ISearchDynamicParamsHandleAbility
    public final <D> SearchRequestParam ZX1(BaseSearchDynamicTabFragment<D> baseSearchDynamicTabFragment, C0PSG c0psg, String str, boolean z, String str2) {
        boolean z2;
        String strIS;
        Map mapLJ;
        C646870PYv c646870PYv;
        String str3;
        BaseSearchDynamicTabFragment<D> baseSearchDynamicTabFragment2;
        Integer num;
        String sugGenerateType;
        String queryLanguage;
        String str4;
        int i;
        int filterBy;
        int sortType;
        C646870PYv c646870PYv2;
        C646870PYv c646870PYv3;
        Context context;
        Map<String, String> mapLIZ;
        C646870PYv c646870PYv4;
        String str5 = ((C646670PYb) C0Q3E.LIZIZ(baseSearchDynamicTabFragment).Jh0().LIZJ()).LLILZIL;
        long j = ((C646670PYb) C0Q3E.LIZIZ(baseSearchDynamicTabFragment).Jh0().LIZJ()).LLJILLL;
        String str6 = ((C646670PYb) C0Q3E.LIZIZ(baseSearchDynamicTabFragment).Jh0().LIZJ()).LLJJ;
        int i2 = ((C646670PYb) C0Q3E.LIZIZ(baseSearchDynamicTabFragment).Jh0().LIZJ()).LLIZ;
        C646880PYw<D> c646880PYwBo = bo();
        if (c646880PYwBo != null && (c646870PYv4 = c646880PYwBo.LLILLL) != null && c646870PYv4.needLocationParams) {
            z2 = true;
        } else {
            z2 = false;
        }
        Long lValueOf = null;
        if (z2) {
            strIS = baseSearchDynamicTabFragment.iS();
        } else {
            strIS = null;
        }
        Map<String, String> mapHS = baseSearchDynamicTabFragment.hS();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null && (context = fragmentLJI.getContext()) != null && (mapLIZ = C0P91.LIZ(C641110PCr.LIZ(context, C724240Sb0.LJI(this)))) != null && (!mapLIZ.isEmpty())) {
            if (mapHS != null) {
                mapHS = C2097608Jq.LJIIL(mapHS, mapLIZ);
            } else {
                mapHS = mapLIZ;
            }
        } else if (mapHS == null) {
            mapHS = null;
        }
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 == null || fragmentLJI2.getContext() == null || mapHS == null) {
            mapLJ = C2097608Jq.LJ();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap(mapHS);
            mapLJ = linkedHashMap;
            if (C1533950q1J.LJ(strIS)) {
                linkedHashMap.remove("poi_card_id_list");
                mapLJ = linkedHashMap;
            }
        }
        C646880PYw<D> c646880PYwBo2 = bo();
        if (c646880PYwBo2 == null || (c646870PYv = c646880PYwBo2.LLILLL) == null) {
            c646870PYv = new C646870PYv(null, 0, null, null, false, false, false, false, 0, null, null, null, null, 8191, null);
        }
        int i3 = c646870PYv.loadMoreCount;
        String str7 = baseSearchDynamicTabFragment.LLILZIL.searchId;
        C646880PYw<D> c646880PYwBo3 = bo();
        String strLIZJ = "";
        if (c646880PYwBo3 == null || (c646870PYv3 = c646880PYwBo3.LLILLL) == null || (str3 = c646870PYv3.searchType) == null) {
            str3 = "";
        }
        String str8 = baseSearchDynamicTabFragment.LLJILJILJ;
        C646880PYw<D> c646880PYwBo4 = bo();
        if (c646880PYwBo4 != null) {
            baseSearchDynamicTabFragment2 = c646880PYwBo4.LLILLJJLI;
        } else {
            baseSearchDynamicTabFragment2 = null;
        }
        String strLIZ = C0Q3Q.LIZ(C724240Sb0.LIZ(this), baseSearchDynamicTabFragment2, baseSearchDynamicTabFragment.LLJIJIL);
        if (ComplianceServiceProvider.LJI().LJJII()) {
            num = 1;
        } else {
            num = null;
        }
        SearchResultParam searchResultParam = baseSearchDynamicTabFragment.LLJIJIL;
        if (searchResultParam != null) {
            sugGenerateType = searchResultParam.getSugGenerateType();
        } else {
            sugGenerateType = null;
        }
        SearchResultParam searchResultParam2 = baseSearchDynamicTabFragment.LLJIJIL;
        if (searchResultParam2 != null) {
            queryLanguage = searchResultParam2.getQueryLanguage();
        } else {
            queryLanguage = null;
        }
        if (z) {
            C01GW<C669480QNu> c01gw = C669480QNu.LJ;
            strLIZJ = C326370Cqp.LIZ().LIZJ();
            lValueOf = Long.valueOf(((C0PM7) C0Q3E.LJI().ak0().LIZJ()).LL);
        }
        C662670Pyz.LIZ.getClass();
        String strLIZ2 = C662670Pyz.LIZ();
        SearchLocationCacheData searchLocationCacheData = SearchLocationCacheData.LIZ;
        C646880PYw<D> c646880PYwBo5 = bo();
        if (c646880PYwBo5 == null || (c646870PYv2 = c646880PYwBo5.LLILLL) == null || (str4 = c646870PYv2.searchType) == null || str4.length() <= 0) {
            str4 = "vertical_unknown";
        }
        searchLocationCacheData.getClass();
        String strLIZLLL = SearchLocationCacheData.LIZLLL(SearchLocationCacheData.LJI, SearchLocationCacheData.LIZIZ, str4, "request");
        Integer numLIZ = SearchLocationCacheData.LIZ(searchLocationCacheData);
        if (c0psg != null && !c0psg.isDefaultOption()) {
            i = 1;
        } else {
            i = 0;
            if (c0psg == null) {
                filterBy = 0;
                sortType = 0;
            }
            return new SearchRequestParam(str5, 0, str8, str3, 0, i2, str6, str7, j, i3, str, null, null, null, null, null, strLIZJ, null, str2, null, null, null, null, null, null, strLIZ, null, num, sugGenerateType, queryLanguage, lValueOf, null, strLIZ2, null, strIS, null, strLIZLLL, numLIZ, i, filterBy, sortType, false, c0psg, null, mapLJ);
        }
        filterBy = c0psg.getFilterBy();
        sortType = c0psg.getSortType();
        return new SearchRequestParam(str5, 0, str8, str3, 0, i2, str6, str7, j, i3, str, null, null, null, null, null, strLIZJ, null, str2, null, null, null, null, null, null, strLIZ, null, num, sugGenerateType, queryLanguage, lValueOf, null, strLIZ2, null, strIS, null, strLIZLLL, numLIZ, i, filterBy, sortType, false, c0psg, null, mapLJ);
    }
}
