package com.bytedance.android.livesdk.revenue.level.impl.fansclub.service;

import X.C0JT6;
import X.InterfaceC1093700eZE;
import com.bytedance.android.livesdk.livesetting.level.LiveUserLevelBackEnableSetting;
import com.bytedance.android.livesdk.revenue.level.api.service.IUserLevelBackService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class UserLevelBackService implements IUserLevelBackService {
    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IUserLevelBackService
    public final void Nn0(int i, String str) {
        if (!LiveUserLevelBackEnableSetting.INSTANCE.getValue()) {
            return;
        }
        C0JT6<Map<String, List<String>>> c0jt6 = InterfaceC1093700eZE.Lf;
        Map<String, List<String>> mapLIZ = c0jt6.LIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        if (mapLIZ != null) {
            linkedHashMap.putAll(mapLIZ);
            List<String> list = mapLIZ.get(str);
            if (list != null) {
                arrayList = new ArrayList(list);
            }
        }
        arrayList.add(String.valueOf(i));
        linkedHashMap.put(str, arrayList);
        c0jt6.LIZJ(linkedHashMap);
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IUserLevelBackService
    public final boolean vz(int i, String str) {
        Map<String, List<String>> mapLIZ;
        List<String> list;
        if (!LiveUserLevelBackEnableSetting.INSTANCE.getValue() || (mapLIZ = InterfaceC1093700eZE.Lf.LIZ()) == null || (list = mapLIZ.get(str)) == null) {
            return true;
        }
        return !list.contains(String.valueOf(i));
    }
}
