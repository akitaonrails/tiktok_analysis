package com.bytedance.pns.pns_ttmachine_adapter;

import X.C786410Ut5;
import X.C826640Wbm;
import X.C829680Wgg;
import X.InterfaceC829690Wgh;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.tiktok.ttm.TTMParamData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class TTMAdapter {
    public static Map<Integer, TTMParamData> listMap;
    public static volatile AtomicBoolean soLoaded = new AtomicBoolean(false);

    public static native TTMachineExecuteResult attribution(String str, TTMParamData[] tTMParamDataArr);

    public static native TTMStatePreprocessTimeStatistics init(String str);

    public static native TTMachineExecuteResult validate3(String str, TTMParamData tTMParamData);

    static {
        soLoaded.set(C826640Wbm.LIZ("pns_ttmachine_adapter"));
        listMap = new HashMap();
    }

    public static boolean isNotConsent() {
        Object objLIZ = C829680Wgg.LIZ("is_not_consent", Collections.emptyList());
        if (objLIZ == null) {
            return false;
        }
        return ((Boolean) objLIZ).booleanValue();
    }

    public static TTMParamData pnsListCreate() {
        TTMParamData tTMParamDataNewEmptyListData = TTMParamData.newEmptyListData();
        listMap.put(Integer.valueOf(System.identityHashCode(tTMParamDataNewEmptyListData)), tTMParamDataNewEmptyListData);
        return tTMParamDataNewEmptyListData;
    }

    public static TTMStatePreprocessTimeStatistics initWrapper(String str) {
        if (!soLoaded.get()) {
            return null;
        }
        return init(str);
    }

    public static boolean isBackground(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i));
        Object objLIZ = C829680Wgg.LIZ("is_background", arrayList);
        if (objLIZ == null) {
            return false;
        }
        return ((Boolean) objLIZ).booleanValue();
    }

    public static TTMParamData pnsListCopy(TTMParamData tTMParamData) {
        TTMParamData tTMParamDataNewEmptyListData = TTMParamData.newEmptyListData();
        for (int i = 0; i < tTMParamData.GetArraySize(); i++) {
            tTMParamDataNewEmptyListData.AddArrayItem(tTMParamData.GetArrayItem(i));
        }
        listMap.put(Integer.valueOf(System.identityHashCode(tTMParamDataNewEmptyListData)), tTMParamDataNewEmptyListData);
        return tTMParamDataNewEmptyListData;
    }

    public static void pnsListDestroy(TTMParamData tTMParamData) {
        listMap.remove(Integer.valueOf(System.identityHashCode(tTMParamData)));
    }

    public static String usrdfCommonHandler(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String string = JSONObjectProtectorUtils.getString(jSONObject, "fun_name");
        JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "params");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.get(i));
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("rt_v", C829680Wgg.LIZ(string, arrayList));
        return C786410Ut5.J3(jSONObject2);
    }

    public static void addFunction(String str, InterfaceC829690Wgh interfaceC829690Wgh) {
        ((ConcurrentHashMap) C829680Wgg.LIZ).put(str, interfaceC829690Wgh);
    }

    public static TTMachineExecuteResult attributionWrapper(String str, TTMParamData[] tTMParamDataArr) {
        if (!soLoaded.get()) {
            return null;
        }
        return attribution(str, tTMParamDataArr);
    }

    public static void pnsListStore(TTMParamData tTMParamData, TTMParamData tTMParamData2) {
        tTMParamData.AddArrayItem(tTMParamData2);
    }

    public static void pnsRemoveFromData(TTMParamData tTMParamData, String str) {
        tTMParamData.removeData(str);
    }

    public static TTMachineExecuteResult validate3Wrapper(String str, TTMParamData tTMParamData) {
        if (!soLoaded.get()) {
            return null;
        }
        return validate3(str, tTMParamData);
    }

    public static void pnsMergeData(TTMParamData tTMParamData, TTMParamData tTMParamData2, String str) {
        tTMParamData.mergeDataAsSubData(str, tTMParamData2);
    }
}
