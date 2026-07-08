package com.ss.android.vesdk.algorithm;

import X.EnumC12938054m;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class VECommAlgoInfo {
    public String infoName;
    public int infoType = EnumC12938054m.COMM_INFO_TYPE_NONE.ordinal();
    public String jsonString;
    public HashMap<String, VECommAlgoInfo> mapCommUnion;
    public ArrayList<ArrayList<VEAlgoCommUnion>> matCommUnion;
    public VEAlgoCommUnion unionValue1;
    public VEAlgoCommUnion unionValue2;
    public ArrayList<VEAlgoCommUnion> vecCommUnion;
}
