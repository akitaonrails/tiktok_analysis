package com.tiktok.ttm.ttmparam;

import X.C829660Wge;
import X.C829740Wgm;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class TTMJSONObjectParam extends ITTMParamData {
    public JSONObject value;

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public double[] getDictDoubleValuesImmediate() {
        try {
            JSONObject jSONObject = this.value;
            if (jSONObject != null) {
                double[] dArr = new double[jSONObject.length()];
                Iterator<String> itKeys = this.value.keys();
                int i = 0;
                while (itKeys.hasNext()) {
                    dArr[i] = C829740Wgm.LIZ(this.value.get(itKeys.next()), null);
                    i++;
                }
                return dArr;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return null;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public long[] getDictIntValuesImmediate() {
        try {
            JSONObject jSONObject = this.value;
            if (jSONObject != null) {
                long[] jArr = new long[jSONObject.length()];
                Iterator<String> itKeys = this.value.keys();
                int i = 0;
                while (itKeys.hasNext()) {
                    jArr[i] = C829740Wgm.LIZIZ(this.value.get(itKeys.next()), null);
                    i++;
                }
                return jArr;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return null;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public String[] getDictStringValuesImmediate() {
        try {
            JSONObject jSONObject = this.value;
            if (jSONObject != null) {
                String[] strArr = new String[jSONObject.length()];
                Iterator<String> itKeys = this.value.keys();
                int i = 0;
                while (itKeys.hasNext()) {
                    strArr[i] = C829740Wgm.LIZJ(this.value.get(itKeys.next()), null);
                    i++;
                }
                return strArr;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return null;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public int getType() {
        return 10;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public String[] getDictKeys() {
        try {
            JSONObject jSONObject = this.value;
            if (jSONObject == null) {
                return null;
            }
            String[] strArr = new String[jSONObject.length()];
            Iterator<String> itKeys = this.value.keys();
            int i = 0;
            while (itKeys.hasNext()) {
                strArr[i] = itKeys.next();
                i++;
            }
            return strArr;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public Object[] getDictValuesImmediate() {
        try {
            JSONObject jSONObject = this.value;
            if (jSONObject == null) {
                return null;
            }
            Object[] objArr = new Object[jSONObject.length()];
            Iterator<String> itKeys = this.value.keys();
            int i = 0;
            while (itKeys.hasNext()) {
                objArr[i] = this.value.get(itKeys.next());
                i++;
            }
            return objArr;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public Object getInputData() {
        return this.value;
    }

    public TTMJSONObjectParam(JSONObject jSONObject) {
        this.value = jSONObject;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public boolean containsKey(String str) {
        JSONObject jSONObject = this.value;
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                if (Objects.equals(itKeys.next(), str)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public double[] getAllDoubleValue(String str) {
        JSONObject jSONObject;
        if (str != null && (jSONObject = this.value) != null) {
            try {
                ITTMParamData iTTMParamDataLIZ = C829660Wge.LIZ(jSONObject.get(str));
                if (iTTMParamDataLIZ == null) {
                    return null;
                }
                return iTTMParamDataLIZ.getAllDoubleValue(null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public long[] getAllIntValue(String str) {
        JSONObject jSONObject;
        if (str != null && (jSONObject = this.value) != null) {
            try {
                ITTMParamData iTTMParamDataLIZ = C829660Wge.LIZ(jSONObject.get(str));
                if (iTTMParamDataLIZ == null) {
                    return null;
                }
                return iTTMParamDataLIZ.getAllIntValue(null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public String[] getAllStringValue(String str) {
        JSONObject jSONObject;
        if (str != null && (jSONObject = this.value) != null) {
            try {
                ITTMParamData iTTMParamDataLIZ = C829660Wge.LIZ(jSONObject.get(str));
                if (iTTMParamDataLIZ == null) {
                    return null;
                }
                return iTTMParamDataLIZ.getAllStringValue(null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public ITTMParamData getObjectItem(String str) {
        if (str != null) {
            try {
                JSONObject jSONObject = this.value;
                if (jSONObject != null) {
                    return C829660Wge.LIZ(jSONObject.get(str));
                }
                return null;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public void removeData(String str) {
        JSONObject jSONObject;
        if (str != null && (jSONObject = this.value) != null) {
            try {
                jSONObject.remove(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public double getDoubleValue(String str, int i) {
        JSONObject jSONObject;
        if (str != null && (jSONObject = this.value) != null) {
            try {
                return C829740Wgm.LIZ(jSONObject.get(str), str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return Double.MAX_VALUE;
            }
        }
        return Double.MAX_VALUE;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public long getIntValue(String str, int i) {
        JSONObject jSONObject;
        if (str != null && (jSONObject = this.value) != null) {
            try {
                return C829740Wgm.LIZIZ(jSONObject.get(str), str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return Long.MAX_VALUE;
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public String getStringValue(String str, int i) {
        JSONObject jSONObject;
        if (str != null && (jSONObject = this.value) != null) {
            try {
                return C829740Wgm.LIZJ(jSONObject.get(str), str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public void mergeDataAsSubData(String str, ITTMParamData iTTMParamData) {
        JSONObject jSONObject;
        if (str != null && iTTMParamData != null && (jSONObject = this.value) != null) {
            try {
                jSONObject.put(str, iTTMParamData.getInputData());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public boolean removeValue(String str, int i) {
        JSONObject jSONObject;
        if (str != null && (jSONObject = this.value) != null) {
            jSONObject.remove(str);
            return true;
        }
        return false;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public boolean addValue(String str, int i, Object obj) {
        JSONObject jSONObject;
        if (str != null && (jSONObject = this.value) != null) {
            try {
                if (obj instanceof Map) {
                    jSONObject.put(str, new JSONObject((Map) obj));
                    return true;
                }
                if (obj instanceof Collection) {
                    jSONObject.put(str, new JSONArray((Collection) obj));
                    return true;
                }
                jSONObject.put(str, obj);
                return true;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        return false;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public boolean replaceValue(String str, int i, Object obj) {
        if (str != null && this.value != null) {
            try {
                if (containsKey(str)) {
                    if (obj instanceof Map) {
                        this.value.put(str, new JSONObject((Map) obj));
                        return true;
                    }
                    if (obj instanceof Collection) {
                        this.value.put(str, new JSONArray((Collection) obj));
                        return true;
                    }
                    this.value.put(str, obj);
                }
                return true;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }
}
