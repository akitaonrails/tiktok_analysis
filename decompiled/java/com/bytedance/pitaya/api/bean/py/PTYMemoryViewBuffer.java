package com.bytedance.pitaya.api.bean.py;

import X.C786410Ut5;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.pitaya.api.bean.PTYClass;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class PTYMemoryViewBuffer extends PTYClass {
    public final String customInfoStr;
    public final byte[] rawBytes;
    public final int rawDataType;
    public final float[] rawFloats;
    public final boolean readOnly;
    public final int[] shape;
    public final long size;

    public PTYMemoryViewBuffer() {
        this((byte[]) null, (float[]) null, true, (int[]) null, (JSONObject) null);
    }

    public static /* synthetic */ void getRawDataType$annotations() {
    }

    public final String getCustomInfoStr() {
        return this.customInfoStr;
    }

    public final byte[] getRawBytes() {
        return this.rawBytes;
    }

    public final float[] getRawFloats() {
        return this.rawFloats;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    public final int[] getShape() {
        return this.shape;
    }

    public final long getSize() {
        return this.size;
    }

    public PTYMemoryViewBuffer(byte[] bArr, float[] fArr, boolean z, int[] iArr, JSONObject jSONObject) {
        long length;
        String strJ3;
        int i;
        super(1);
        this.rawBytes = bArr;
        this.rawFloats = fArr;
        this.readOnly = z;
        this.shape = iArr;
        if (bArr != null) {
            length = bArr.length;
        } else if (fArr != null) {
            length = ((long) fArr.length) * 4;
        } else {
            length = 0;
        }
        this.size = length;
        if (jSONObject != null) {
            strJ3 = C786410Ut5.J3(jSONObject);
        } else {
            strJ3 = null;
        }
        this.customInfoStr = strJ3;
        if (z) {
            if (bArr != null) {
                i = 2;
            } else if (fArr != null) {
                i = 3;
            } else {
                throw new IllegalArgumentException("Tensor has no data!");
            }
            this.rawDataType = i;
            return;
        }
        throw new IllegalArgumentException("Only READ_ONLY MemoryViewBuffer is supported since Pitaya 2.7,More information please contact with mabenteng");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PTYMemoryViewBuffer(byte[] bArr, float[] fArr, boolean z, String str, String str2) {
        int[] iArr;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                iArr = new int[length];
                for (int i = 0; i < length; i++) {
                    iArr[i] = JSONArrayProtectorUtils.getInt(jSONArray, i);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                iArr = null;
            }
        } else {
            iArr = null;
        }
        if (str2 != null) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        this(bArr, fArr, z, iArr, jSONObject);
    }
}
