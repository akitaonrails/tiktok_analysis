package com.tiktok.ttm.ttmparam;

import X.C829660Wge;
import X.C829740Wgm;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public class TTMGsonJsonObjectParam extends ITTMParamData {
    public n value;

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public double[] getDictDoubleValuesImmediate() {
        try {
            n nVar = this.value;
            if (nVar != null) {
                Set<String> setLJJIJIL = nVar.LJJIJIL();
                double[] dArr = new double[setLJJIJIL.size()];
                Iterator<String> it2 = setLJJIJIL.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    dArr[i] = C829740Wgm.LIZ(this.value.LJJIIZ(it2.next()), null);
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
            n nVar = this.value;
            if (nVar != null) {
                Set<String> setLJJIJIL = nVar.LJJIJIL();
                long[] jArr = new long[setLJJIJIL.size()];
                Iterator<String> it2 = setLJJIJIL.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    jArr[i] = C829740Wgm.LIZIZ(this.value.LJJIIZ(it2.next()), null);
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
            n nVar = this.value;
            if (nVar != null) {
                Set<String> setLJJIJIL = nVar.LJJIJIL();
                String[] strArr = new String[setLJJIJIL.size()];
                Iterator<String> it2 = setLJJIJIL.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    strArr[i] = C829740Wgm.LIZJ(this.value.LJJIIZ(it2.next()), null);
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
    public void mergeDataAsSubData(String str, ITTMParamData iTTMParamData) {
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public String[] getDictKeys() {
        try {
            n nVar = this.value;
            if (nVar != null) {
                return (String[]) nVar.LJJIJIL().toArray(new String[this.value.LJJIJIL().size()]);
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public Object[] getDictValuesImmediate() {
        try {
            n nVar = this.value;
            if (nVar == null) {
                return null;
            }
            Set<String> setLJJIJIL = nVar.LJJIJIL();
            Object[] objArr = new Object[setLJJIJIL.size()];
            Iterator<String> it2 = setLJJIJIL.iterator();
            int i = 0;
            while (it2.hasNext()) {
                objArr[i] = this.value.LJJIIZ(it2.next());
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

    public TTMGsonJsonObjectParam(n nVar) {
        this.value = nVar;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public boolean containsKey(String str) {
        n nVar = this.value;
        if (nVar != null) {
            return nVar.LJJIJIL().contains(str);
        }
        return false;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public double[] getAllDoubleValue(String str) {
        n nVar;
        if (str != null && (nVar = this.value) != null) {
            try {
                ITTMParamData iTTMParamDataLIZ = C829660Wge.LIZ(nVar.LJJIIZ(str));
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
        n nVar;
        if (str != null && (nVar = this.value) != null) {
            try {
                ITTMParamData iTTMParamDataLIZ = C829660Wge.LIZ(nVar.LJJIIZ(str));
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
        n nVar;
        if (str != null && (nVar = this.value) != null) {
            try {
                ITTMParamData iTTMParamDataLIZ = C829660Wge.LIZ(nVar.LJJIIZ(str));
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
                n nVar = this.value;
                if (nVar != null) {
                    return C829660Wge.LIZ(nVar.LJJIIZ(str));
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
        n nVar;
        if (str != null && (nVar = this.value) != null) {
            try {
                nVar.LJJIJL(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public double getDoubleValue(String str, int i) {
        n nVar;
        if (str != null && (nVar = this.value) != null) {
            try {
                return C829740Wgm.LIZ(nVar.LJJIIZ(str), str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return Double.MAX_VALUE;
            }
        }
        return Double.MAX_VALUE;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public long getIntValue(String str, int i) {
        n nVar;
        if (str != null && (nVar = this.value) != null) {
            try {
                return C829740Wgm.LIZIZ(nVar.LJJIIZ(str), str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return Long.MAX_VALUE;
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public String getStringValue(String str, int i) {
        n nVar;
        if (str != null && (nVar = this.value) != null) {
            try {
                return C829740Wgm.LIZJ(nVar.LJJIIZ(str), str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public boolean removeValue(String str, int i) {
        n nVar;
        if (str != null && (nVar = this.value) != null) {
            nVar.LJJIJL(str);
            return true;
        }
        return false;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public boolean addValue(String str, int i, Object obj) {
        if (str != null && this.value != null) {
            try {
                this.value.LJJIFFI(str, new Gson().LJIJJLI((Map) obj).LJIILIIL());
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
        if (str != null && this.value != null) {
            try {
                if (containsKey(str)) {
                    this.value.LJJIFFI(str, new Gson().LJIJJLI((Map) obj).LJIILIIL());
                }
                return true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }
}
