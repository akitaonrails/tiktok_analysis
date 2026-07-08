package com.tiktok.ttm.ttmparam;

import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public class TTMStringParam extends ITTMParamData {
    public String value;

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public int getType() {
        return 6;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public double getDoubleValue() {
        double d = Double.MAX_VALUE;
        try {
            String str = this.value;
            if (str == null) {
                return Double.MAX_VALUE;
            }
            d = CastDoubleProtector.parseDouble(str);
            return d;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return d;
        }
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public long getIntValue() {
        long j = Long.MAX_VALUE;
        try {
            String str = this.value;
            if (str == null) {
                return Long.MAX_VALUE;
            }
            j = CastLongProtector.parseLong(str);
            return j;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return j;
        }
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public Object getInputData() {
        return this.value;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public String getStringValue() {
        return this.value;
    }

    public TTMStringParam(String str) {
        this.value = str;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public double getDoubleValue(String str, int i) {
        return getDoubleValue();
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public long getIntValue(String str, int i) {
        return getIntValue();
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public String getStringValue(String str, int i) {
        return this.value;
    }
}
