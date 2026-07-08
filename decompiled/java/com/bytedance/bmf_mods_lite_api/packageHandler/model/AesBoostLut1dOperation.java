package com.bytedance.bmf_mods_lite_api.packageHandler.model;

import X.C09CT;
import X.C2177941ALo;
import X.C2189641Amo;
import X.InterfaceC1978007ow;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class AesBoostLut1dOperation implements InterfaceC1978007ow, Parcelable, Serializable {
    public static final Parcelable.Creator<AesBoostLut1dOperation> CREATOR = new C2189641Amo(13);
    public static final Map<String, C2177941ALo> OP_INFO_MAP;
    public static final long serialVersionUID = 1;

    @C09CT("op_name")
    public String opName;

    @C09CT("op_type")
    public int opType;

    @C09CT("params")
    public float[] params;

    @C09CT("version")
    public int version;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.InterfaceC1978007ow
    public int paramType() {
        return 1;
    }

    static {
        HashMap map = new HashMap();
        OP_INFO_MAP = map;
        map.put("srgb2linear", new C2177941ALo(1));
        map.put("shadow", new C2177941ALo(2));
        map.put("highlight", new C2177941ALo(4));
        map.put("contrast", new C2177941ALo(8));
        map.put("gamma", new C2177941ALo(16));
        map.put("linear2srgb", new C2177941ALo(32));
        map.put("saturation", new C2177941ALo(32768));
        map.put("hue", new C2177941ALo(65536));
        map.put("temperature", new C2177941ALo(131072));
    }

    public AesBoostLut1dOperation() {
    }

    public AesBoostLut1dOperation(Parcel parcel) {
        this.version = parcel.readInt();
        this.opName = parcel.readString();
        this.opType = parcel.readInt();
        this.params = parcel.createFloatArray();
    }

    public static <T extends InterfaceC1978007ow> Map<Long, Object> toParamMap(List<T> list) {
        HashMap map = new HashMap();
        int[] iArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            iArr[i] = LIZ(map, (AesBoostLut1dOperation) ListProtector.get(list, i), i);
        }
        map.put(12210L, iArr);
        return map;
    }

    public static Map<Long, Object> toParamMap(AesBoostLut1dOperation aesBoostLut1dOperation) {
        HashMap map = new HashMap();
        map.put(12210L, new int[]{LIZ(map, aesBoostLut1dOperation, 0)});
        return map;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.version);
        parcel.writeString(this.opName);
        parcel.writeInt(this.opType);
        parcel.writeFloatArray(this.params);
    }

    public static int LIZ(Map<Long, Object> map, AesBoostLut1dOperation aesBoostLut1dOperation, int i) {
        C2177941ALo c2177941ALo;
        int i2 = aesBoostLut1dOperation.opType;
        if (!TextUtils.isEmpty(aesBoostLut1dOperation.opName) && (c2177941ALo = OP_INFO_MAP.get(aesBoostLut1dOperation.opName)) != null) {
            i2 = c2177941ALo.LIZ;
        }
        if (aesBoostLut1dOperation.params == null) {
            aesBoostLut1dOperation.params = new float[0];
        }
        ((HashMap) map).put(Long.valueOf(((long) i) + 12400), aesBoostLut1dOperation.params);
        return i2;
    }

    public AesBoostLut1dOperation(int i, String str, int i2, float[] fArr) {
        this.version = i;
        this.opName = str;
        this.opType = i2;
        this.params = fArr;
    }
}
