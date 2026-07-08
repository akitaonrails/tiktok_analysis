package com.bytedance.byted_bach_sdk.buffer;

import X.C08FF;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class BachObject {
    public BachObjectType infoType = BachObjectType.INFO_TYPE_NONE;
    public HashMap<String, BachObject> mapResult;
    public AlgorithmResultUnion valueResult;
    public BachObject[] vectorResult;

    public enum BachObjectType {
        INFO_TYPE_NONE,
        INFO_TYPE_INT,
        INFO_TYPE_REAL,
        INFO_TYPE_STRING,
        INFO_TYPE_VECXI,
        INFO_TYPE_VECXF,
        INFO_TYPE_VECXS,
        INFO_TYPE_MATXF,
        INFO_TYPE_BITMAP,
        INFO_TYPE_HASHMAP,
        INFO_TYPE_VEC,
        INFO_TYPE_BYTEARRAY;

        public static BachObjectType valueOf(String str) {
            return (BachObjectType) C08FF.LIZ(BachObjectType.class, str);
        }
    }
}
