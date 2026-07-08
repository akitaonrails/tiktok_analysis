package com.bytedance.android.livesdk.model;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class FansClubMember {

    @C09CT("data")
    public FansClubData data;

    @C09CT("prefer_data")
    public Map<Integer, FansClubData> preferData;

    public FansClubData getData() {
        return this.data;
    }

    public Map<Integer, FansClubData> getPreferData() {
        return this.preferData;
    }

    public void setData(FansClubData fansClubData) {
        this.data = fansClubData;
    }

    public void setPreferData(Map<Integer, FansClubData> map) {
        this.preferData = map;
    }
}
