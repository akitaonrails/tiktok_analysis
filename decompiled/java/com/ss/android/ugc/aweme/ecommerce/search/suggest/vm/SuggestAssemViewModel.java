package com.ss.android.ugc.aweme.ecommerce.search.suggest.vm;

import X.AnonymousClass0956;
import X.C098200Yq;
import X.C09R9;
import X.C0PEM;
import X.C0QCO;
import X.C0QER;
import X.C0QWI;
import X.C0QWJ;
import X.C0QXL;
import X.C0QXR;
import X.C1223304qV;
import X.C13LE;
import X.C13LP;
import X.C1697810uHb;
import X.C189200o6;
import X.C1DFH;
import X.C2107308Nj;
import X.C2190401Ao2;
import X.C23250099c;
import X.C650500PfM;
import X.C671510QVp;
import X.C672200QYg;
import X.C673230Qav;
import X.C673280Qb0;
import X.C673310Qb3;
import X.C673320Qb4;
import X.C673400QbC;
import X.C673540QbQ;
import X.C673940Qc4;
import X.C7740030o;
import X.EnumC673970Qc7;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import X.InterfaceC673410QbD;
import X.InterfaceC736910SvR;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.gson.Gson;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestContextAbilityNew;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestSubPageAbility;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.model.MiddleCouponModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SuggestAssemViewModel extends AssemViewModel<C673540QbQ> {
    public boolean LL;
    public C0QWJ LLILLL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public ISearchSuggestContextAbilityNew LLIZLLLIL;
    public ISearchSuggestSubPageAbility LLJ;
    public C0QWI LLJIJIL;
    public ListenableFuture<String> LLJILJILJ;
    public ListenableFuture<MiddleCouponModel> LLJILLL;
    public AnonymousClass0956 LLJJ;
    public AnonymousClass0956 LLJJI;
    public AnonymousClass0956 LLJJIII;
    public final C09R9 LLILLJJLI = new C09R9(this, C13LE.LIZ(C671510QVp.class));
    public boolean LLILZ = true;
    public boolean LLILZIL = true;
    public final Gson LLJI = C7740030o.LIZ().getGson();
    public int LLJILJIL = -1;
    public String LLJJIJI = "";
    public String LLJJIJIIJIL = "";
    public final List<Integer> LLJJIJIL = C1697810uHb.LJIIJJI(Integer.valueOf(C0QXR.LIVE_PRODUCT_LIST_MAGNIFIER.getValue()), Integer.valueOf(C0QXR.LIVE_PRODUCT_LIST_GUESS_WORDS.getValue()));

    public final InterfaceC736910SvR<InterfaceC673410QbD> DQ2() {
        return (InterfaceC736910SvR) this.LLILLJJLI.getValue();
    }

    public final boolean GQ2() {
        C0QER c0qer;
        ECSearchEntranceData ecSearchEntranceData;
        C0QWJ c0qwj = this.LLILLL;
        return (c0qwj == null || (c0qer = c0qwj.LIZ) == null || (ecSearchEntranceData = c0qer.getEcSearchEntranceData()) == null || !ecSearchEntranceData.getBooleanStrategy("disable_guess_strategy") || !FQ2(c0qer.getEcSearchEntranceData())) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0033 A[PHI: r0
      0x0033: PHI (r0v4 java.lang.String) = (r0v3 java.lang.String), (r0v7 java.lang.String) binds: [B:21:0x0030, B:14:0x001d] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String IQ2() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestContextAbilityNew r0 = r4.LLIZLLLIL
            r3 = 0
            if (r0 == 0) goto Ld
            int r1 = r0.q4()
            r0 = -1
            if (r1 != r0) goto Ld
            r3 = 1
        Ld:
            java.lang.String r2 = ""
            if (r3 == 0) goto L20
            X.0QWJ r0 = r4.LLILLL
            if (r0 == 0) goto L1f
            X.0QER r0 = r0.LIZ
            if (r0 == 0) goto L1f
            java.lang.String r0 = r0.getEnterSearchFrom()
            if (r0 != 0) goto L33
        L1f:
            return r2
        L20:
            com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestContextAbilityNew r0 = r4.LLIZLLLIL
            if (r0 == 0) goto L1f
            int r1 = r0.q4()
            com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestContextAbilityNew r0 = r4.LLIZLLLIL
            if (r0 == 0) goto L1f
            java.lang.String r0 = r0.bN0(r1)
            if (r0 != 0) goto L33
            return r2
        L33:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.SuggestAssemViewModel.IQ2():java.lang.String");
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C673540QbQ(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.lynx.tasm.TemplateData yQ2() {
        /*
            r4 = this;
            com.lynx.tasm.TemplateData r2 = new com.lynx.tasm.TemplateData
            r2.<init>()
            java.util.List r3 = r4.zQ2()
            java.lang.String r0 = "historyList"
            r2.LJIILIIL(r0, r3)
            com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestContextAbilityNew r0 = r4.LLIZLLLIL
            if (r0 == 0) goto L5f
            int r0 = r0.q4()
        L16:
            java.lang.String r1 = "current_tab_name"
            if (r0 < 0) goto L55
            java.lang.String r0 = X.C669740QOu.LIZLLL(r0)
            r2.LJIILIIL(r1, r0)
        L21:
            if (r3 == 0) goto L53
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            boolean r1 = r3.isEmpty()
            r0 = 1
            if (r1 != r0) goto L53
        L2c:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "is_force"
            r2.LJIILIIL(r0, r1)
            X.0QWJ r0 = r4.LLILLL
            if (r0 == 0) goto L51
            X.0QER r0 = r0.LIZ
            if (r0 == 0) goto L51
            java.lang.String r1 = r0.getEnterSearchFrom()
        L41:
            java.lang.String r0 = "enter_from"
            r2.LJIILIIL(r0, r1)
            boolean r0 = X.C1223304qV.LIZ()
            if (r0 == 0) goto L50
            java.lang.String r0 = "allSearchDataProcess"
            r2.LIZJ = r0
        L50:
            return r2
        L51:
            r1 = 0
            goto L41
        L53:
            r0 = 0
            goto L2c
        L55:
            X.0QOi r0 = X.EnumC669620QOi.SHOP
            java.lang.String r0 = r0.getTabName()
            r2.LJIILIIL(r1, r0)
            goto L21
        L5f:
            r0 = -1
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.SuggestAssemViewModel.yQ2():com.lynx.tasm.TemplateData");
    }

    public final List<Map<String, Object>> zQ2() {
        String str;
        C0QER c0qer;
        ECSearchEntranceData ecSearchEntranceData;
        C0QER c0qer2;
        C2190401Ao2 c2190401Ao2 = C2190401Ao2.LIZ;
        C0QWJ c0qwj = this.LLILLL;
        int ecSearchEntranceValue = (c0qwj == null || (c0qer2 = c0qwj.LIZ) == null) ? -100 : c0qer2.getEcSearchEntranceValue();
        c2190401Ao2.getClass();
        ArrayList arrayList = null;
        if (C2190401Ao2.LIZ(ecSearchEntranceValue)) {
            return null;
        }
        C0QWJ c0qwj2 = this.LLILLL;
        if (c0qwj2 != null && (c0qer = c0qwj2.LIZ) != null && (ecSearchEntranceData = c0qer.getEcSearchEntranceData()) != null && ecSearchEntranceData.getBooleanStrategy("disable_history_strategy")) {
            return new ArrayList();
        }
        C0QWJ c0qwj3 = this.LLILLL;
        if (c0qwj3 != null) {
            List<SearchHistory> listLLLIL = ((InterfaceC673410QbD) DQ2().getOperator()).LLLIL(c0qwj3.LIZ, true ^ this.LL, this.LLJIJIL, this.LLJ);
            arrayList = new ArrayList();
            for (SearchHistory searchHistory : listLLLIL) {
                if (searchHistory != null && (str = searchHistory.keyword) != null) {
                    HashMap map = new HashMap();
                    map.put("word", str);
                    arrayList.add(map);
                }
            }
        }
        return arrayList;
    }

    public static int HQ2(SuggestWordResponse suggestWordResponse) {
        List<TypeWords> list;
        TypeWords typeWords;
        List<Word> list2;
        if (suggestWordResponse != null && (list = suggestWordResponse.data) != null && (typeWords = (TypeWords) C13LP.LJJJLL(list)) != null && (list2 = typeWords.words) != null) {
            return list2.size();
        }
        return 0;
    }

    public static SuggestWordResponse JQ2(String str) {
        boolean z;
        Object c098200Yq;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        Object obj = null;
        if (z) {
            return null;
        }
        try {
            c098200Yq = (SuggestWordResponse) C7740030o.LIZ().getGson().LJII(str, SuggestWordResponse.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (SuggestWordResponse) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String BQ2(X.C0QWA r5) {
        /*
            r4 = this;
            int[] r0 = X.C0QYF.LIZ
            X.0QWJ r0 = r4.LLILLL
            r3 = 0
            if (r0 == 0) goto L28
            X.0QER r0 = r0.LIZ
        L9:
            boolean r0 = X.C0QYF.LIZIZ(r0)
            if (r0 == 0) goto L2a
            com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestContextAbilityNew r1 = r4.LLIZLLLIL
            if (r1 == 0) goto L26
            int r0 = r1.q4()
            java.lang.String r1 = r1.bN0(r0)
        L1b:
            X.0QWJ r0 = r4.LLILLL
            if (r0 == 0) goto L21
            X.0QER r3 = r0.LIZ
        L21:
            java.lang.String r0 = X.C0QR7.LIZLLL(r3, r1)
            return r0
        L26:
            r1 = r3
            goto L1b
        L28:
            r0 = r3
            goto L9
        L2a:
            X.0QWJ r0 = r4.LLILLL
            if (r0 == 0) goto L47
            X.0QER r2 = r0.LIZ
            if (r2 == 0) goto L48
            com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData r1 = r2.getEcSearchEntranceData()
            if (r1 == 0) goto L4a
            java.lang.String r0 = "middle_search_position"
            java.lang.String r1 = r1.getStringOrNullStrategy(r0)
            if (r1 == 0) goto L4a
            boolean r0 = X.C123100dR.LIZ(r1)
            if (r0 == 0) goto L4a
            return r1
        L47:
            r2 = r3
        L48:
            r1 = r3
            goto L4e
        L4a:
            java.lang.String r1 = r2.getLastSearchPosition()
        L4e:
            boolean r0 = X.C123100dR.LIZ(r1)
            if (r0 == 0) goto L57
            if (r1 == 0) goto L57
            return r1
        L57:
            int r1 = X.C650500PfM.LIZIZ(r2)
            X.0QXR r0 = X.C0QXR.PDP
            int r0 = r0.getValue()
            if (r1 != r0) goto L66
            java.lang.String r0 = "product_detail"
            return r0
        L66:
            com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestContextAbilityNew r0 = r4.LLIZLLLIL
            if (r0 == 0) goto L87
            java.lang.String r1 = r0.Nb2()
        L6e:
            X.0QWA r0 = X.C0QWA.RETURN
            if (r5 != r0) goto L7a
            int r0 = X.C650500PfM.LIZIZ(r2)
            java.lang.String r1 = X.C0QR7.LJFF(r0, r1)
        L7a:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L89
            if (r2 == 0) goto L86
            java.lang.String r3 = r2.getEnterSearchFrom()
        L86:
            return r3
        L87:
            r1 = r3
            goto L6e
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.SuggestAssemViewModel.BQ2(X.0QWA):java.lang.String");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002a -> B:29:0x002b). Please report as a decompilation issue!!! */
    public final TemplateData CQ2(String str) {
        Map mapLIZIZ;
        String enterSearchFrom;
        C0QER c0qer;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (str == null) {
            C0QXL.LIZ.getClass();
            mapLIZIZ = C0QXL.LIZIZ();
        } else {
            Object objLJII = this.LLJI.LJII(str, HashMap.class);
            if ((objLJII instanceof Map) && (mapLIZIZ = (Map) objLJII) != null) {
                C0QXL.LIZ.getClass();
                C0QXL.LIZJ(str, mapLIZIZ);
            } else {
                mapLIZIZ = null;
            }
        }
        try {
            TemplateData templateData = new TemplateData();
            templateData.LJIILIIL("newCustomerData", mapLIZIZ);
            templateData.LIZJ = "newCustomerDataProcess";
            C0QWJ c0qwj = this.LLILLL;
            if (c0qwj != null && (c0qer = c0qwj.LIZ) != null) {
                enterSearchFrom = c0qer.getEnterSearchFrom();
            } else {
                enterSearchFrom = null;
            }
            templateData.LJIILIIL("enter_from", enterSearchFrom);
            if (C1223304qV.LIZ()) {
                templateData.LIZJ = "allSearchDataProcess";
                return templateData;
            }
            return templateData;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject EQ2(X.C0QWA r14) {
        /*
            Method dump skipped, instruction units count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.SuggestAssemViewModel.EQ2(X.0QWA):org.json.JSONObject");
    }

    public final boolean FQ2(ECSearchEntranceData eCSearchEntranceData) {
        if (eCSearchEntranceData != null) {
            return this.LLJJIJIL.contains(Integer.valueOf(C650500PfM.LIZ(eCSearchEntranceData)));
        }
        return false;
    }

    public final void vQ2(C0QCO c0qco) {
        boolean z;
        String str;
        boolean zKF2;
        Map<String, String> timingLog;
        SuggestWordResponse.Extra extra;
        ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew = this.LLIZLLLIL;
        if (iSearchSuggestContextAbilityNew != null && !iSearchSuggestContextAbilityNew.n90()) {
            z = true;
        } else {
            z = false;
        }
        C0QWJ c0qwj = this.LLILLL;
        if (c0qwj != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strLLLFZ = ((InterfaceC673410QbD) DQ2().getOperator()).LLLFZ(c0qwj, z, !this.LL, this.LLJIJIL, this.LLJ);
            if (strLLLFZ != null) {
                SuggestWordResponse suggestWordResponseJQ2 = JQ2(strLLLFZ);
                int iHQ2 = HQ2(suggestWordResponseJQ2);
                C0QWI c0qwi = this.LLJIJIL;
                if (c0qwi != null) {
                    boolean z2 = !this.LL;
                    ISearchSuggestSubPageAbility iSearchSuggestSubPageAbility = this.LLJ;
                    if (iSearchSuggestSubPageAbility != null) {
                        zKF2 = iSearchSuggestSubPageAbility.KF2();
                    } else {
                        zKF2 = false;
                    }
                    Integer numValueOf = Integer.valueOf(iHQ2);
                    Long lValueOf = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
                    if (suggestWordResponseJQ2 != null && (extra = suggestWordResponseJQ2.extra) != null) {
                        timingLog = extra.getTimingLog();
                    } else {
                        timingLog = null;
                    }
                    c0qwi.LJ("guess", "response_success", true, z2, zKF2, numValueOf, lValueOf, false, false, timingLog);
                }
                if (this.LLILZ && iHQ2 > 0) {
                    this.LLILZLL = true;
                }
                C672200QYg.LIZIZ = true;
                TemplateData templateDataAQ2 = AQ2(strLLLFZ, true);
                if (templateDataAQ2 != null) {
                    templateDataAQ2.LJIILIIL("guess_request_time_millis", Long.valueOf(jCurrentTimeMillis));
                    C673320Qb4 c673320Qb4 = C673320Qb4.LIZ;
                    C673320Qb4.LJIILIIL();
                    LQ2(c0qco, templateDataAQ2, true);
                }
                C0QWI c0qwi2 = this.LLJIJIL;
                if (c0qwi2 != null) {
                    if (strLLLFZ.length() == 0) {
                        str = "1";
                    } else {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    C0QWI.LIZLLL(c0qwi2, "guess", "request", str);
                }
            }
        }
        this.LLILZ = false;
    }

    public final TemplateData AQ2(String str, boolean z) {
        Map<?, ?> map;
        int i;
        String enterSearchFrom;
        int i2;
        Object obj;
        Integer num;
        ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew;
        ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew2;
        C0QER c0qer;
        C0QER c0qer2;
        ECSearchEntranceData ecSearchEntranceData;
        C673320Qb4.LIZ.getClass();
        C673400QbC c673400QbC = C673320Qb4.LIZIZ;
        if (c673400QbC != null) {
            c673400QbC.LJIIJ = System.currentTimeMillis();
        }
        C673400QbC c673400QbC2 = C673320Qb4.LIZIZ;
        if (c673400QbC2 != null) {
            c673400QbC2.LJIILIIL = System.currentTimeMillis();
        }
        try {
            map = (Map) this.LLJI.LJII(str, HashMap.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            map = null;
        }
        C0QWJ c0qwj = this.LLILLL;
        if (c0qwj != null && (c0qer2 = c0qwj.LIZ) != null && (ecSearchEntranceData = c0qer2.getEcSearchEntranceData()) != null && ecSearchEntranceData.getBooleanStrategy("disable_guess_strategy")) {
            i = 1;
        } else {
            i = 0;
        }
        C0QWJ c0qwj2 = this.LLILLL;
        if (c0qwj2 == null || (c0qer = c0qwj2.LIZ) == null || (enterSearchFrom = c0qer.getEnterSearchFrom()) == null) {
            enterSearchFrom = "";
        }
        TemplateData templateData = new TemplateData();
        templateData.LJIILIIL("shouldDisableGuess", Integer.valueOf(i));
        templateData.LJIILIIL("isCachedSuggestWords", 0);
        templateData.LJIILIIL("enter_from", enterSearchFrom);
        if (map != null && !map.isEmpty()) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        templateData.LJIILIIL("is_force", Integer.valueOf(i2));
        templateData.LJIILIIL("is_ecommerce_cache", Integer.valueOf(z ? 1 : 0));
        templateData.LJIILIIL("guessSearchData", map);
        if (map != null) {
            obj = map.get("qrec_virtual_enable");
        } else {
            obj = null;
        }
        if (Intrinsics.LJFF(obj, "1") && (iSearchSuggestContextAbilityNew2 = this.LLIZLLLIL) != null) {
            iSearchSuggestContextAbilityNew2.yQ1(map);
        }
        C0QWJ c0qwj3 = this.LLILLL;
        if (c0qwj3 != null && (num = c0qwj3.LIZLLL) != null && num.intValue() == 2 && (iSearchSuggestContextAbilityNew = this.LLIZLLLIL) != null && iSearchSuggestContextAbilityNew.n90()) {
            templateData.LJIILIIL("is_from_outside", 1);
        }
        C673320Qb4 c673320Qb4 = C673320Qb4.LIZ;
        C673320Qb4.LJFF();
        try {
            templateData.LIZJ = "guessSearchDataProcess";
            if (C1223304qV.LIZ()) {
                templateData.LIZJ = "allSearchDataProcess";
            }
            return templateData;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final Object KQ2(String str, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZ, new C673230Qav(str, this, null));
    }

    public final void wQ2(C0QCO c0qco, Map<String, Object> map) {
        if (this.LLILZIL) {
            C673940Qc4.LJFF(EnumC673970Qc7.SEARCH);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC497601wk assemVMScope = getAssemVMScope();
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(assemVMScope, C2107308Nj.LIZ, null, new C673280Qb0(jCurrentTimeMillis, c0qco, this, map, null), 2);
    }

    public final void xQ2(C0QCO c0qco, Map<String, Object> map) {
        if (this.LLILZIL) {
            C673940Qc4.LJFF(EnumC673970Qc7.SEARCH);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC497601wk assemVMScope = getAssemVMScope();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJJI = C23250099c.LIZLLL(assemVMScope, C2107308Nj.LIZ, null, new C673310Qb3(jCurrentTimeMillis, c0qco, this, map, null), 2);
    }

    public final void LQ2(C0QCO c0qco, TemplateData templateData, boolean z) {
        Object obj;
        Long l;
        String str;
        C0QWI c0qwi = this.LLJIJIL;
        boolean zKF2 = false;
        long jLongValue = 0;
        if (c0qwi != null) {
            if (templateData.LIZ == 0) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            C0QWI.LIZLLL(c0qwi, "guess", "update_data", str);
        }
        C0QWI c0qwi2 = this.LLJIJIL;
        if (c0qwi2 != null) {
            boolean z2 = !this.LL;
            ISearchSuggestSubPageAbility iSearchSuggestSubPageAbility = this.LLJ;
            if (iSearchSuggestSubPageAbility != null) {
                zKF2 = iSearchSuggestSubPageAbility.KF2();
            }
            Map<Object, Object> mapLJIJI = templateData.LJIJI();
            if (mapLJIJI != null && (obj = ((HashMap) mapLJIJI).get("guess_request_time_millis")) != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if ((obj instanceof Long) && (l = (Long) obj) != null) {
                    jLongValue = l.longValue();
                }
                jLongValue = jCurrentTimeMillis - jLongValue;
            }
            c0qwi2.LJ("guess", "update_data", z, z2, zKF2, null, Long.valueOf(jLongValue), false, false, null);
        }
        if (C672200QYg.LIZIZ) {
            C673320Qb4 c673320Qb4 = C673320Qb4.LIZ;
            C673320Qb4.LJIJ();
        } else {
            C673320Qb4 c673320Qb42 = C673320Qb4.LIZ;
            C673320Qb4.LJIJI();
        }
        templateData.LJIILIIL("isFirstEnter", Integer.valueOf(!this.LL ? 1 : 0));
        C673320Qb4 c673320Qb43 = C673320Qb4.LIZ;
        Boolean boolValueOf = Boolean.valueOf(!C672200QYg.LIZIZ);
        c673320Qb43.getClass();
        templateData.LJIILIIL("performance_params", C673320Qb4.LIZJ(boolValueOf));
        if (c0qco != null) {
            c0qco.LJIIJ(templateData);
        }
    }
}
