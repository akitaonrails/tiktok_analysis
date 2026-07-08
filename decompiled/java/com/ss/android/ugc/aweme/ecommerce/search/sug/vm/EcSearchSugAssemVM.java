package com.ss.android.ugc.aweme.ecommerce.search.sug.vm;

import X.C07P4;
import X.C098200Yq;
import X.C0QER;
import X.C0QNG;
import X.C0QOY;
import X.C0QR7;
import X.C0QT1;
import X.C0QT9;
import X.C0QTB;
import X.C0QUG;
import X.C0QXT;
import X.C0QYF;
import X.C1558520qew;
import X.C189200o6;
import X.C19719512Dh;
import X.C19EG;
import X.C275150AqP;
import X.C584850Mwl;
import X.C650500PfM;
import X.C665950QAf;
import X.C669740QOu;
import X.C670100QQe;
import X.C670150QQj;
import X.C670250QQt;
import X.C670790QSv;
import X.C670800QSw;
import X.C670810QSx;
import X.C670820QSy;
import X.C670830QSz;
import X.C670890QTf;
import X.C672610QZv;
import X.C672650QZz;
import X.C848530XQl;
import X.EnumC669620QOi;
import X.InterfaceC0148002o;
import X.InterfaceC665370Q7z;
import X.InterfaceC736910SvR;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.ab.EcSearchSugRequestCancelQueueConfig;
import com.ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.ss.android.ugc.aweme.ecommerce.search.sug.ISearchSugContextAbility;
import com.ss.android.ugc.aweme.ecommerce.search.sug.repo.EcSearchSugResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchSugAssemVM extends AssemViewModel<C0QT9> {
    public final C19EG LL;
    public final View LLILLJJLI;
    public final ISearchSugContextAbility LLILLL;
    public C0QER LLILZ;
    public String LLILZIL = "";
    public boolean LLILZLL = true;
    public String LLIZ;
    public Integer LLIZLLLIL;
    public boolean LLJ;
    public LogPbBean LLJI;
    public RecommendWordMob LLJIJIL;
    public InterfaceC736910SvR<C0QTB> LLJILJIL;
    public final boolean LLJILJILJ;
    public final ConcurrentHashMap<Long, C670790QSv> LLJILLL;
    public String LLJJ;

    public final String AQ2() {
        String enterSearchFrom;
        C670810QSx c670810QSxS61;
        ISearchSugContextAbility iSearchSugContextAbility = this.LLILLL;
        C0QER c0qer = (iSearchSugContextAbility == null || (c670810QSxS61 = iSearchSugContextAbility.S61()) == null) ? null : c670810QSxS61.LIZ;
        return C0QYF.LIZIZ(c0qer) ? C0QR7.LJ(c0qer) : (c0qer == null || (enterSearchFrom = c0qer.getEnterSearchFrom()) == null) ? "" : enterSearchFrom;
    }

    public final String BQ2() {
        C670830QSz c670830QSzPD2;
        String str;
        C670830QSz c670830QSzPD22;
        C670810QSx c670810QSxS61;
        ISearchSugContextAbility iSearchSugContextAbility = this.LLILLL;
        String str2 = null;
        C0QER c0qer = (iSearchSugContextAbility == null || (c670810QSxS61 = iSearchSugContextAbility.S61()) == null) ? null : c670810QSxS61.LIZ;
        if (!C0QYF.LIZIZ(c0qer)) {
            ISearchSugContextAbility iSearchSugContextAbility2 = this.LLILLL;
            return (iSearchSugContextAbility2 == null || (c670830QSzPD2 = iSearchSugContextAbility2.pD2()) == null || (str = c670830QSzPD2.LIZIZ) == null) ? AQ2() : str;
        }
        ISearchSugContextAbility iSearchSugContextAbility3 = this.LLILLL;
        if (iSearchSugContextAbility3 != null && (c670830QSzPD22 = iSearchSugContextAbility3.pD2()) != null) {
            str2 = c670830QSzPD22.LIZIZ;
        }
        return C0QR7.LIZLLL(c0qer, str2);
    }

    public final int CQ2() {
        C670830QSz c670830QSzPD2;
        ISearchSugContextAbility iSearchSugContextAbility = this.LLILLL;
        if (iSearchSugContextAbility == null || (c670830QSzPD2 = iSearchSugContextAbility.pD2()) == null) {
            return -1;
        }
        return c670830QSzPD2.LIZ;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0QT9(null, null, null);
    }

    public final List wQ2(String str, EcSearchSugResponse ecSearchSugResponse) {
        String str2;
        String info;
        String imprId;
        Object objObtainEcLogData;
        Object objObtainLogData;
        Object objObtainEcLogData2;
        Map map;
        Object c098200Yq;
        Integer numValueOf;
        C670830QSz c670830QSzPD2;
        String str3;
        List<SearchSugEntity> list = ecSearchSugResponse.sugList;
        if (Intrinsics.LJFF("1", ecSearchSugResponse.sugVirtualEnable)) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (SearchSugEntity searchSugEntity : ecSearchSugResponse.sugList) {
                if (searchSugEntity.sugExtraInfo.isRichSug()) {
                    str3 = "enrich_sug";
                } else {
                    str3 = "normal_sug";
                }
                arrayList2.add(str3);
                arrayList.add(searchSugEntity.content);
            }
            ISearchSugContextAbility iSearchSugContextAbility = this.LLILLL;
            if (iSearchSugContextAbility != null) {
                iSearchSugContextAbility.Tb0(arrayList2);
            }
        }
        if (!list.isEmpty()) {
            String str4 = this.LLIZ;
            ISearchSugContextAbility iSearchSugContextAbility2 = this.LLILLL;
            String str5 = "";
            if (iSearchSugContextAbility2 == null || (c670830QSzPD2 = iSearchSugContextAbility2.pD2()) == null || (str2 = c670830QSzPD2.LIZJ) == null) {
                str2 = "";
            }
            C670100QQe.LIZIZ(str4, null, str, null, str2, "show");
            String strBQ2 = BQ2();
            String strLIZIZ = C584850Mwl.LIZ.LIZIZ(str);
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            String str6 = ecSearchSugResponse.LLILLJJLI;
            if (str6 == null) {
                str6 = "";
            }
            concurrentHashMap.put("raw_query", str6);
            RecommendWordMob recommendWordMob = ecSearchSugResponse.recommendWordMob;
            if (recommendWordMob == null || (info = recommendWordMob.getInfo()) == null) {
                info = "";
            }
            concurrentHashMap.put("info", info);
            concurrentHashMap.put("sug_session_id", "");
            LogPbBean logPbBean = ecSearchSugResponse.logPb;
            if (logPbBean == null || (imprId = logPbBean.getImprId()) == null) {
                imprId = "";
            }
            concurrentHashMap.put("impr_id", imprId);
            if (strLIZIZ != null) {
                str5 = strLIZIZ;
            }
            concurrentHashMap.put("log_pb", str5);
            concurrentHashMap.put("search_position", strBQ2);
            int size = ecSearchSugResponse.sugList.size();
            for (int i = 0; i < size; i++) {
                ((SearchSugEntity) ListProtector.get(ecSearchSugResponse.sugList, i)).LJ = concurrentHashMap;
            }
            if (!C670890QTf.LIZIZ()) {
                String strAQ2 = AQ2();
                String strBQ22 = BQ2();
                C0QER c0qer = this.LLILZ;
                String str7 = C0QOY.LIZ;
                String wordsSource = null;
                if (c0qer != null) {
                    objObtainEcLogData = c0qer.obtainEcLogData("search_entrance");
                } else {
                    objObtainEcLogData = null;
                }
                if (objObtainEcLogData != null) {
                    strAQ2 = String.valueOf(c0qer.obtainEcLogData("search_entrance"));
                }
                if (C0QYF.LIZIZ(c0qer)) {
                    strAQ2 = C0QR7.LJ(c0qer);
                }
                C670150QQj<C670820QSy> c670150QQj = new C670150QQj<C670820QSy>() { // from class: X.0QSy
                };
                c670150QQj.LJIILLIIL("search_position", strBQ22);
                if (c0qer != null) {
                    objObtainLogData = c0qer.obtainLogData("tab_name");
                } else {
                    objObtainLogData = null;
                }
                if (objObtainLogData != null) {
                    c670150QQj.LJ("tab_name", objObtainLogData.toString());
                }
                if (C650500PfM.LIZJ(c0qer)) {
                    c670150QQj.LJIILLIIL("EVENT_ORIGIN_FEATURE", "TEMAI");
                }
                if (c0qer != null) {
                    objObtainEcLogData2 = c0qer.obtainEcLogData("ec_middle_extra_log_params");
                } else {
                    objObtainEcLogData2 = null;
                }
                if (C19719512Dh.LJII(objObtainEcLogData2)) {
                    map = (Map) objObtainEcLogData2;
                } else {
                    map = null;
                }
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        c670150QQj.LJIILLIIL((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                C672650QZz.LIZ.getClass();
                Map mapLIZIZ = C672650QZz.LIZIZ(c0qer, "client_metric_params");
                if (mapLIZIZ != null) {
                    for (Map.Entry entry2 : mapLIZIZ.entrySet()) {
                        c670150QQj.LJIILLIIL((String) entry2.getKey(), entry2.getValue().toString());
                    }
                }
                String strLIZIZ2 = C848530XQl.LIZIZ(C848530XQl.LIZ, null, "{}");
                if (strLIZIZ2 != null) {
                    try {
                        c098200Yq = new JSONObject(strLIZIZ2).optString("traffic_diversion_info");
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    String str8 = (String) c098200Yq;
                    if (str8 != null) {
                        c670150QQj.LJIILLIIL("traffic_diversion_info", str8);
                    }
                }
                c670150QQj.LJIIZILJ("enter_method", C0QUG.LIZLLL());
                List<SearchSugEntity> list2 = ecSearchSugResponse.sugList;
                if (list2 != null) {
                    numValueOf = Integer.valueOf(list2.size());
                } else {
                    numValueOf = null;
                }
                c670150QQj.LJIILLIIL("words_num", String.valueOf(numValueOf));
                RecommendWordMob recommendWordMob2 = ecSearchSugResponse.recommendWordMob;
                if (recommendWordMob2 != null) {
                    wordsSource = recommendWordMob2.getWordsSource();
                }
                c670150QQj.LJIILLIIL("words_source", wordsSource);
                c670150QQj.LIZIZ(concurrentHashMap);
                c670150QQj.LJIILLIIL("new_sug_session_id", str7);
                c670150QQj.LJIILLIIL("search_entrance", strAQ2);
                c670150QQj.LJIILJJIL();
            }
        }
        return list;
    }

    public final void zQ2(Long l, String str) {
        C670810QSx c670810QSxS61;
        String string;
        ISearchSugContextAbility iSearchSugContextAbility = this.LLILLL;
        if (iSearchSugContextAbility != null && (c670810QSxS61 = iSearchSugContextAbility.S61()) != null && c670810QSxS61.LIZIZ) {
            String strAQ2 = AQ2();
            String strBQ2 = BQ2();
            int iCQ2 = CQ2();
            int iLIZIZ = C650500PfM.LIZIZ(this.LLILZ);
            C665950QAf<C670250QQt> c665950QAf = new C665950QAf<C670250QQt>() { // from class: X.0QQt
            };
            c665950QAf.LJIILLIIL("type", str);
            c665950QAf.LIZLLL = strAQ2;
            c665950QAf.LJIILLIIL("enter_from", strAQ2);
            c665950QAf.LJIILLIIL("search_position", strBQ2);
            Integer numValueOf = Integer.valueOf(iLIZIZ);
            if (numValueOf != null) {
                string = numValueOf.toString();
            } else {
                string = null;
            }
            c665950QAf.LJIILLIIL("root_enter_from_type", string);
            c665950QAf.LJIILLIIL("tab_name", C669740QOu.LIZLLL(iCQ2));
            c665950QAf.LJIILLIIL("EVENT_ORIGIN_FEATURE", "TEMAI");
            if (l != null) {
                c665950QAf.LJIILLIIL("duration", String.valueOf(System.currentTimeMillis() - l.longValue()));
            }
            c665950QAf.LJIILJJIL();
        }
    }

    public EcSearchSugAssemVM(InterfaceC665370Q7z interfaceC665370Q7z, C19EG c19eg, View view) {
        this.LL = c19eg;
        this.LLILLJJLI = view;
        this.LLILLL = (ISearchSugContextAbility) C1558520qew.LIZ(interfaceC665370Q7z, ISearchSugContextAbility.class, null);
        C670800QSw.LIZ.getClass();
        this.LLJILJILJ = ((EcSearchSugRequestCancelQueueConfig) C670800QSw.LIZJ.getValue()).enable;
        this.LLJILLL = new ConcurrentHashMap<>();
    }

    public final SearchResultParam vQ2(InterfaceC665370Q7z interfaceC665370Q7z, SearchSugEntity searchSugEntity, boolean z, boolean z2) throws JSONException {
        boolean z3;
        String str;
        String str2;
        String userId;
        SearchResultParam searchResultParamKQ0;
        String sugShopId;
        String strIsRichSugValue;
        SugExtraInfo sugExtraInfo;
        String wordsType;
        String penetrateInfo;
        Map mapLIZ;
        String attachProductId;
        String resultTab;
        this.LLJ = true;
        SearchResultParam searchResultParam = new SearchResultParam();
        searchResultParam.setKeyword(searchSugEntity.content);
        searchResultParam.setSugHint(searchSugEntity.sugExtraInfo.getSugHint());
        searchResultParam.setWordState(C670100QQe.LIZ(searchSugEntity));
        SugExtraInfo sugExtraInfo2 = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo2 != null && sugExtraInfo2.isSasType()) {
            z3 = true;
        } else {
            z3 = false;
        }
        String str3 = "1";
        if (z3) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        searchResultParam.setIsSasWord(str);
        SugExtraInfo sugExtraInfo3 = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo3 == null || !sugExtraInfo3.getHasSasIcon()) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        searchResultParam.setHasSasIcon(str3);
        SugExtraInfo sugExtraInfo4 = searchSugEntity.sugExtraInfo;
        String sugShopId2 = null;
        if (sugExtraInfo4 != null) {
            sugShopId2 = sugExtraInfo4.getSugShopId();
        }
        searchResultParam.setSugShopId(sugShopId2);
        searchResultParam.setQueryState(C670100QQe.LIZ(searchSugEntity));
        searchResultParam.setSearchFrom("search_sug");
        if (C0QNG.LJ(searchSugEntity)) {
            str2 = "enrich_sug";
        } else {
            str2 = "normal_sug";
        }
        searchResultParam.setSugType(str2);
        searchResultParam.setOpenNewSearchContainer(false);
        searchResultParam.setTrendingWordsId((String) ((ConcurrentHashMap) searchSugEntity.LJ).get("impr_id"));
        searchResultParam.setQueryState(C670100QQe.LIZ(searchSugEntity));
        SugExtraInfo sugExtraInfo5 = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo5 != null && (resultTab = sugExtraInfo5.getResultTab()) != null) {
            if (Intrinsics.LJFF(resultTab, "general")) {
                searchResultParam.getSearchEnterParam().setTargetTab(EnumC669620QOi.TOP);
                searchResultParam.setLandTap("general");
            } else if (Intrinsics.LJFF(resultTab, "ecom")) {
                searchResultParam.getSearchEnterParam().setTargetTab(EnumC669620QOi.SHOP);
                searchResultParam.setLandTap("shop");
            }
        }
        SugExtraInfo sugExtraInfo6 = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo6 != null && (attachProductId = sugExtraInfo6.getAttachProductId()) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("product_id", attachProductId);
            jSONObject.put("position", 1);
            searchResultParam.setResultAttachCard(new C672610QZv(C0QXT.PRODUCT_CARD, Collections.singletonList(jSONObject).toString(), null, null, null));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SugExtraInfo sugExtraInfo7 = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo7 != null && (penetrateInfo = sugExtraInfo7.getPenetrateInfo()) != null && (mapLIZ = C07P4.LIZ(penetrateInfo)) != null) {
            linkedHashMap.putAll(mapLIZ);
        }
        if (((Boolean) C275150AqP.LIZ.getValue()).booleanValue() && (sugExtraInfo = searchSugEntity.sugExtraInfo) != null && (wordsType = sugExtraInfo.getWordsType()) != null) {
            linkedHashMap.put("words_extra_type", wordsType);
        }
        searchResultParam.setEcSuggestWordsExtraMobMap(linkedHashMap);
        SugExtraInfo sugExtraInfo8 = searchSugEntity.sugExtraInfo;
        String str4 = "";
        if (sugExtraInfo8 == null || (userId = sugExtraInfo8.getUserId()) == null) {
            userId = "";
        }
        searchResultParam.setSugUserId(userId);
        SugExtraInfo sugExtraInfo9 = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo9 != null && (strIsRichSugValue = sugExtraInfo9.isRichSugValue()) != null) {
            str4 = strIsRichSugValue;
        }
        searchResultParam.setIsRichSug(str4);
        SugExtraInfo sugExtraInfo10 = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo10 != null && (sugShopId = sugExtraInfo10.getSugShopId()) != null) {
            searchResultParam.setSugShopId(sugShopId);
        }
        ISearchSugContextAbility iSearchSugContextAbility = this.LLILLL;
        if (iSearchSugContextAbility != null && (searchResultParamKQ0 = iSearchSugContextAbility.KQ0(interfaceC665370Q7z, searchResultParam, z, z2)) != null) {
            return searchResultParamKQ0;
        }
        return searchResultParam;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yQ2(long r7, X.C670780QSu r9, java.lang.String r10, java.lang.Long r11) throws org.json.JSONException {
        /*
            r6 = this;
            boolean r0 = r6.LLJILJILJ
            if (r0 != 0) goto L5
            return
        L5:
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, X.0QSv> r1 = r6.LLJILLL
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            java.lang.Object r2 = r1.get(r0)
            X.0QSv r2 = (X.C670790QSv) r2
            if (r2 != 0) goto L14
            return
        L14:
            if (r9 != 0) goto L17
            return
        L17:
            X.0QT1 r0 = X.C0QT1.LIZ
            r0.getClass()
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r1 = r2.LIZ
            java.lang.String r0 = "search_position"
            r3.put(r0, r1)
            java.lang.String r1 = "tab_index"
            int r0 = r2.LIZIZ
            r3.put(r1, r0)
            boolean r1 = r2.LIZJ
            java.lang.String r0 = "is_first_sug"
            r3.put(r0, r1)
            java.lang.String r1 = "keyword_len"
            int r0 = r2.LIZLLL
            r3.put(r1, r0)
            int r1 = r9.LIZ
            java.lang.String r0 = "max_parallel_count"
            r3.put(r0, r1)
            java.lang.String r1 = "max_queue_size"
            int r0 = r9.LIZIZ
            r3.put(r1, r0)
            java.lang.Long r0 = r9.LIZJ
            r2 = 0
            if (r0 == 0) goto La4
            long r4 = r0.longValue()
            java.lang.Long r0 = r9.LIZLLL
            if (r0 == 0) goto La4
            long r0 = r0.longValue()
            long r0 = r0 - r4
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L61:
            java.lang.String r0 = "queue_wait_ms"
            r3.put(r0, r1)
            java.lang.Long r0 = r9.LIZLLL
            if (r0 == 0) goto L7b
            long r4 = r0.longValue()
            java.lang.Long r0 = r9.LJ
            if (r0 == 0) goto L7b
            long r0 = r0.longValue()
            long r0 = r0 - r4
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
        L7b:
            java.lang.String r0 = "request_cost_ms"
            r3.put(r0, r2)
            if (r11 == 0) goto L8b
            long r1 = r11.longValue()
            java.lang.String r0 = "input_to_show_ms"
            r3.put(r0, r1)
        L8b:
            java.lang.String r0 = "result_state"
            r3.put(r0, r10)
            boolean r1 = r9.LJFF
            java.lang.String r0 = "pending_queue_trimmed"
            r3.put(r0, r1)
            boolean r1 = r9.LJI
            java.lang.String r0 = "response_filtered_by_order"
            r3.put(r0, r1)
            java.lang.String r0 = "ec_search_sug_opt_perf"
            com.ss.android.common.lib.AppLogNewUtils.onEventV3(r0, r3)
            return
        La4:
            r1 = r2
            goto L61
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.sug.vm.EcSearchSugAssemVM.yQ2(long, X.0QSu, java.lang.String, java.lang.Long):void");
    }

    public final void xQ2(long j, String str, Long l, int i, int i2) {
        String str2;
        Object c098200Yq;
        int i3;
        C670790QSv c670790QSvRemove = this.LLJILLL.remove(Long.valueOf(j));
        if (c670790QSvRemove == null) {
            return;
        }
        C0QT1 c0qt1 = C0QT1.LIZ;
        if (this.LLJILJILJ) {
            str2 = "optimized";
        } else {
            str2 = "legacy";
        }
        c0qt1.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sug_opt_mode", str2);
            jSONObject.put("search_position", c670790QSvRemove.LIZ);
            jSONObject.put("tab_index", c670790QSvRemove.LIZIZ);
            if (c670790QSvRemove.LIZJ) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            jSONObject.put("is_first_sug", i3);
            jSONObject.put("keyword_len", c670790QSvRemove.LIZLLL);
            if (l != null) {
                jSONObject.put("input_to_valid_show_ms", l.longValue());
            }
            jSONObject.put("result_state", str);
            jSONObject.put("is_stale_result_visible", i);
            jSONObject.put("is_latest_keyword_success", i2);
            AppLogNewUtils.onEventV3("ec_search_sug_experience_perf", jSONObject);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }
}
