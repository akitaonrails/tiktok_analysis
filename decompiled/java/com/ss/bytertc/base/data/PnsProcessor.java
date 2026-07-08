package com.ss.bytertc.base.data;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class PnsProcessor {
    public static boolean isVaild() {
        IRTCPnsInterface iRTCPnsInterface = (IRTCPnsInterface) ServiceManager.get().getService(IRTCPnsInterface.class);
        if (iRTCPnsInterface != null) {
            return iRTCPnsInterface.isValid();
        }
        return false;
    }

    public static ArrayList<String> processFiles(String[] strArr) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : strArr) {
            arrayList.add(str);
        }
        IRTCPnsInterface iRTCPnsInterface = (IRTCPnsInterface) ServiceManager.get().getService(IRTCPnsInterface.class);
        if (iRTCPnsInterface != null) {
            return iRTCPnsInterface.processFiles(arrayList);
        }
        return arrayList;
    }
}
