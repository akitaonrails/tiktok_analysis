package com.ss.android.ugc.aweme.ecommerce.search.result.vertical.viewmodel;

import X.AnonymousClass0956;
import X.C0J5P;
import X.C1976407og;
import X.C2188811AlT;
import X.C23250099c;
import X.C487050J8d;
import X.C675470QeX;
import X.C675500Qea;
import X.C675530Qed;
import X.C7740030o;
import X.InterfaceC0148002o;
import X.InterfaceC486120J4o;
import X.InterfaceC665370Q7z;
import android.view.View;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.ecommerce.search.result.model.EComCreatorSearchStruct;
import com.ss.android.ugc.aweme.ecommerce.search.result.model.EComMallLiveTabCardStruct;
import com.ss.android.ugc.aweme.ecommerce.search.result.model.EComShopCardStruct;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.viewmodel.LiveVerticalViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class LiveVerticalViewModel extends AssemViewModel<C675530Qed> {
    public C0J5P LLILZ;
    public long LLILZLL;
    public HashMap<String, String> LLIZLLLIL;
    public AnonymousClass0956 LLJ;
    public InterfaceC665370Q7z LLJI;
    public C675500Qea LLJIJIL;
    public final Gson LL = C7740030o.LIZ().getGson();
    public final List<Aweme> LLILLJJLI = new ArrayList();
    public Boolean LLILLL = Boolean.TRUE;
    public final Map<String, String> LLILZIL = new LinkedHashMap();
    public List<Aweme> LLIZ = new ArrayList();
    public final C487050J8d LLJILJIL = new InterfaceC486120J4o() { // from class: X.0J8d
        @Override // X.InterfaceC486120J4o
        public final void LIZJ(Aweme aweme, EnterRoomConfig enterRoomConfig) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.InterfaceC486120J4o
        public final void LIZ(Aweme aweme, EnterRoomConfig enterRoomConfig) {
            EnterRoomConfig.ECWrapData eCWrapData;
            HashMap<String, String> map = new HashMap<>();
            LiveVerticalViewModel liveVerticalViewModel = this.LIZ;
            HashMap<String, String> map2 = liveVerticalViewModel.LLIZLLLIL;
            if (map2 != null) {
                map.putAll(map2);
                if ((aweme instanceof Aweme) && C123100dR.LIZ(aweme.getAid())) {
                    Object obj = ((LinkedHashMap) liveVerticalViewModel.LLILZIL).get(aweme.getAid());
                    if (obj != null) {
                        map.put("search_result_id", obj);
                    }
                }
            }
            if (enterRoomConfig != null && (eCWrapData = enterRoomConfig.mECData) != null) {
                eCWrapData.ecCommonExtraParam = map;
            }
        }

        @Override // X.InterfaceC486120J4o
        public final void LIZIZ(Object obj, EnterRoomConfig enterRoomConfig) {
            if (enterRoomConfig != null && enterRoomConfig.mLogData != null && enterRoomConfig.mLogData.search_result_id_v2 == null) {
                if (obj instanceof Aweme) {
                    Aweme aweme = (Aweme) obj;
                    if (C123100dR.LIZ(aweme.getAid())) {
                        enterRoomConfig.mLogData.search_result_id_v2 = (String) ((LinkedHashMap) this.LIZ.LLILZIL).get(aweme.getAid());
                    }
                }
                enterRoomConfig.mLogData.search_result_type = 2;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("log callback ");
                String str = enterRoomConfig.mLogData.search_result_id_v2;
                if (str == null) {
                    str = "";
                }
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
    };

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C675530Qed(0);
    }

    public final List<Aweme> vQ2(List<EComMallLiveTabCardStruct> list) {
        Aweme aweme;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (EComMallLiveTabCardStruct eComMallLiveTabCardStruct : list) {
                EComCreatorSearchStruct eComCreatorSearchStruct = eComMallLiveTabCardStruct.creatorCardInfo;
                Aweme aweme2 = null;
                if (eComCreatorSearchStruct != null) {
                    aweme = eComCreatorSearchStruct.liveEntity;
                } else {
                    aweme = null;
                }
                EComShopCardStruct eComShopCardStruct = eComMallLiveTabCardStruct.shopCardInfo;
                if (eComShopCardStruct != null) {
                    aweme2 = eComShopCardStruct.liveEntity;
                }
                if (aweme != null) {
                    arrayList.add(aweme);
                    String str = eComMallLiveTabCardStruct.searchResultId;
                    if (str != null) {
                        this.LLILZIL.put(aweme.getAid(), str);
                    }
                }
                if (aweme2 != null) {
                    arrayList.add(aweme2);
                    String str2 = eComMallLiveTabCardStruct.searchResultId;
                    if (str2 != null) {
                        this.LLILZIL.put(aweme2.getAid(), str2);
                    }
                }
            }
        }
        this.LLIZ = arrayList;
        ((ArrayList) this.LLILLJJLI).addAll(arrayList);
        return arrayList;
    }

    public final String yQ2(JSONObject jSONObject) {
        String strOptString;
        List<Object> list;
        if (jSONObject == null || (strOptString = jSONObject.optString("traffic_source_list")) == null) {
            strOptString = "[]";
        }
        JSONArray jSONArrayLIZ = C1976407og.LIZ(strOptString);
        if (jSONArrayLIZ != null) {
            list = JsonExtKt.toList(jSONArrayLIZ);
        } else {
            list = null;
        }
        String strLIZIZ = "";
        if (list != null) {
            Iterator<Object> it2 = list.iterator();
            while (it2.hasNext()) {
                String string = it2.next().toString();
                if (strLIZIZ.length() == 0) {
                    strLIZIZ = string;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append(',');
                    sbLIZ.append(string);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
            }
        }
        return strLIZIZ;
    }

    public final void wQ2(SearchResultParam searchResultParam, JSONObject jSONObject, View view, String str) {
        ((ArrayList) this.LLILLJJLI).clear();
        ((LinkedHashMap) this.LLILZIL).clear();
        C675500Qea c675500Qea = this.LLJIJIL;
        if (c675500Qea != null) {
            c675500Qea.LJ("request_start");
        }
        AnonymousClass0956 anonymousClass0956 = this.LLJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJ = C23250099c.LIZLLL(getAssemVMScope(), null, null, new C675470QeX(jSONObject, this, searchResultParam, str, view, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4 A[Catch: Exception -> 0x0128, TryCatch #4 {Exception -> 0x0128, blocks: (B:36:0x00ad, B:37:0x00b0, B:39:0x00b4, B:41:0x00b7), top: B:85:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b7 A[Catch: Exception -> 0x0128, TryCatch #4 {Exception -> 0x0128, blocks: (B:36:0x00ad, B:37:0x00b0, B:39:0x00b4, B:41:0x00b7), top: B:85:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object xQ2(com.ss.android.ugc.aweme.search.model.SearchResultParam r18, java.lang.String r19, X.C674800QdS r20, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock<X.InterfaceC1476705qH> r21, X.InterfaceC1364105Vn<? super kotlin.Unit> r22) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.result.vertical.viewmodel.LiveVerticalViewModel.xQ2(com.ss.android.ugc.aweme.search.model.SearchResultParam, java.lang.String, X.0QdS, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.05Vn):java.lang.Object");
    }
}
