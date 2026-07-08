package com.tiktok.strategycenter;

import com.tiktok.ttm.TTMParamData;

/* JADX INFO: loaded from: classes14.dex */
public class TTMStrategyAdapter {
    public static void paramDataListDestroy(TTMParamData tTMParamData) {
    }

    public static TTMParamData paramDataListCreate() {
        return TTMParamData.newEmptyListData();
    }

    public static TTMParamData paramListCopy(TTMParamData tTMParamData) {
        TTMParamData tTMParamDataNewEmptyListData = TTMParamData.newEmptyListData();
        for (int i = 0; i < tTMParamData.GetArraySize(); i++) {
            tTMParamDataNewEmptyListData.AddArrayItem(tTMParamData.GetArrayItem(i));
        }
        return tTMParamDataNewEmptyListData;
    }

    public static void paramListStore(TTMParamData tTMParamData, TTMParamData tTMParamData2) {
        tTMParamData.AddArrayItem(tTMParamData2);
    }
}
