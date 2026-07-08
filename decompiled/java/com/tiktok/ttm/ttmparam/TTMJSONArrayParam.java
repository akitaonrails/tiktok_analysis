package com.tiktok.ttm.ttmparam;

import X.C829660Wge;
import X.C829740Wgm;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class TTMJSONArrayParam extends ITTMParamData {
    public JSONArray value;

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public int getType() {
        return 11;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public int getArraySize() {
        JSONArray jSONArray = this.value;
        if (jSONArray != null) {
            return jSONArray.length();
        }
        return 0;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public Object getInputData() {
        return this.value;
    }

    public TTMJSONArrayParam(JSONArray jSONArray) {
        this.value = jSONArray;
    }

    private Object getObjectValue(int i) {
        int realIndex = getRealIndex(i);
        if (realIndex == -1) {
            return null;
        }
        try {
            return this.value.get(realIndex);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    private int getRealIndex(int i) {
        if ((i >= 0 || (i = i + this.value.length()) >= 0) && i < this.value.length()) {
            return i;
        }
        return -1;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public double[] getAllDoubleValue(String str) {
        int i;
        JSONArray jSONArray = this.value;
        if (jSONArray != null) {
            double[] dArr = new double[jSONArray.length()];
            int i2 = 0;
            for (int i3 = 0; i3 < this.value.length(); i3++) {
                try {
                    i = i2 + 1;
                } catch (JSONException e) {
                    e = e;
                    i = i2;
                }
                try {
                    dArr[i2] = C829740Wgm.LIZ(this.value.get(i3), str);
                    i2 = i;
                } catch (JSONException e2) {
                    e = e2;
                    TryCatchGuardChecker.doCheck(e);
                    i2 = i + 1;
                    dArr[i] = Double.MAX_VALUE;
                }
            }
            return dArr;
        }
        return null;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public long[] getAllIntValue(String str) {
        int i;
        JSONArray jSONArray = this.value;
        if (jSONArray != null) {
            long[] jArr = new long[jSONArray.length()];
            int i2 = 0;
            for (int i3 = 0; i3 < this.value.length(); i3++) {
                try {
                    i = i2 + 1;
                } catch (JSONException e) {
                    e = e;
                    i = i2;
                }
                try {
                    jArr[i2] = C829740Wgm.LIZIZ(this.value.get(i3), str);
                    i2 = i;
                } catch (JSONException e2) {
                    e = e2;
                    TryCatchGuardChecker.doCheck(e);
                    i2 = i + 1;
                    jArr[i] = Long.MAX_VALUE;
                }
            }
            return jArr;
        }
        return null;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public String[] getAllStringValue(String str) {
        int i;
        JSONArray jSONArray = this.value;
        if (jSONArray == null || str != null) {
            return null;
        }
        String[] strArr = new String[jSONArray.length()];
        int i2 = 0;
        for (int i3 = 0; i3 < this.value.length(); i3++) {
            try {
                i = i2 + 1;
            } catch (JSONException e) {
                e = e;
                i = i2;
            }
            try {
                strArr[i2] = C829740Wgm.LIZJ(this.value.get(i3), str);
                i2 = i;
            } catch (JSONException e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
                i2 = i + 1;
                strArr[i] = null;
            }
        }
        return strArr;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public ITTMParamData getArrayItem(int i) {
        if (this.value != null) {
            try {
                int realIndex = getRealIndex(i);
                if (realIndex == -1) {
                    return null;
                }
                return C829660Wge.LIZ(this.value.get(realIndex));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public double getDoubleValue(String str, int i) {
        return C829740Wgm.LIZ(getObjectValue(i), str);
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public long getIntValue(String str, int i) {
        return C829740Wgm.LIZIZ(getObjectValue(i), str);
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public String getStringValue(String str, int i) {
        return C829740Wgm.LIZJ(getObjectValue(i), str);
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public boolean removeValue(String str, int i) {
        int realIndex;
        if (i == Integer.MAX_VALUE || this.value == null || (realIndex = getRealIndex(i)) == -1) {
            return false;
        }
        this.value.remove(realIndex);
        return true;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public boolean addValue(String str, int i, Object obj) {
        JSONArray jSONArray = this.value;
        if (jSONArray != null) {
            try {
                if (obj instanceof Map) {
                    jSONArray.put(new JSONObject((Map) obj));
                    return true;
                }
                if (jSONArray instanceof Collection) {
                    jSONArray.put(new JSONArray((Collection) obj));
                    return true;
                }
                jSONArray.put(obj);
                return true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        return false;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public boolean replaceValue(String str, int i, Object obj) {
        if (i != Integer.MAX_VALUE && this.value != null) {
            long realIndex = getRealIndex(i);
            if (realIndex == -1) {
                return false;
            }
            try {
                this.value.put((int) realIndex, obj);
                return true;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }
}
