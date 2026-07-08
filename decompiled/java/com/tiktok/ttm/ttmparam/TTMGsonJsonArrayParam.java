package com.tiktok.ttm.ttmparam;

import X.C829660Wge;
import X.C829740Wgm;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.n;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public class TTMGsonJsonArrayParam extends ITTMParamData {
    public h value;

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public int getType() {
        return 11;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public int getArraySize() {
        h hVar = this.value;
        if (hVar != null) {
            return hVar.size();
        }
        return 0;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public Object getInputData() {
        return this.value;
    }

    public TTMGsonJsonArrayParam(h hVar) {
        this.value = hVar;
    }

    private Object getObjectValue(int i) {
        int realIndex = getRealIndex(i);
        if (realIndex == -1) {
            return null;
        }
        try {
            return this.value.LJJIIJZLJL(realIndex);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    private int getRealIndex(int i) {
        if ((i >= 0 || (i = i + this.value.size()) >= 0) && i < this.value.size()) {
            return i;
        }
        return -1;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public double[] getAllDoubleValue(String str) {
        int i;
        h hVar = this.value;
        if (hVar != null) {
            double[] dArr = new double[hVar.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < this.value.size(); i3++) {
                try {
                    i = i2 + 1;
                    try {
                        dArr[i2] = C829740Wgm.LIZ(this.value.LJJIIJZLJL(i3), str);
                        i2 = i;
                    } catch (Exception e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        i2 = i + 1;
                        dArr[i] = Double.MAX_VALUE;
                    }
                } catch (Exception e2) {
                    e = e2;
                    i = i2;
                }
            }
            return dArr;
        }
        return null;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public long[] getAllIntValue(String str) {
        int i;
        h hVar = this.value;
        if (hVar != null) {
            long[] jArr = new long[hVar.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < this.value.size(); i3++) {
                try {
                    i = i2 + 1;
                    try {
                        jArr[i2] = C829740Wgm.LIZIZ(this.value.LJJIIJZLJL(i3), str);
                        i2 = i;
                    } catch (Exception e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        i2 = i + 1;
                        jArr[i] = Long.MAX_VALUE;
                    }
                } catch (Exception e2) {
                    e = e2;
                    i = i2;
                }
            }
            return jArr;
        }
        return null;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public String[] getAllStringValue(String str) {
        int i;
        h hVar = this.value;
        if (hVar == null || str != null) {
            return null;
        }
        String[] strArr = new String[hVar.size()];
        int i2 = 0;
        for (int i3 = 0; i3 < this.value.size(); i3++) {
            try {
                i = i2 + 1;
                try {
                    strArr[i2] = C829740Wgm.LIZJ(this.value.LJJIIJZLJL(i3), null);
                    i2 = i;
                } catch (Exception e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    i2 = i + 1;
                    strArr[i] = null;
                }
            } catch (Exception e2) {
                e = e2;
                i = i2;
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
                return C829660Wge.LIZ(this.value.LJJIIJZLJL(realIndex));
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
        ((ArrayList) this.value.LL).remove(realIndex);
        return true;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public boolean addValue(String str, int i, Object obj) {
        if (this.value != null) {
            try {
                this.value.LJJIFFI(new Gson().LJIJJLI(obj).LJIILIIL());
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
        if (i == Integer.MAX_VALUE || this.value == null || getRealIndex(i) == -1) {
            return false;
        }
        try {
            n nVarLJIILIIL = new Gson().LJIJJLI(obj).LJIILIIL();
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
