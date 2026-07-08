package com.tiktok.ttm.ttmparam;

/* JADX INFO: loaded from: classes14.dex */
public class TTMNumberObjectArrayParam extends ITTMParamData {
    public Number[] inputValue;
    public int type;

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public int getArraySize() {
        Number[] numberArr = this.inputValue;
        if (numberArr != null) {
            return numberArr.length;
        }
        return 0;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public Object getInputData() {
        return this.inputValue;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public int getType() {
        return this.type;
    }

    public TTMNumberObjectArrayParam(Number[] numberArr) {
        if (!(numberArr instanceof Integer[]) && !(numberArr instanceof Long[])) {
            if ((numberArr instanceof Float[]) || (numberArr instanceof Double[])) {
                this.type = 8;
                this.inputValue = numberArr;
                return;
            }
            return;
        }
        this.type = 7;
        this.inputValue = numberArr;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public double[] getAllDoubleValue(String str) {
        Number[] numberArr = this.inputValue;
        if (numberArr != null) {
            double[] dArr = new double[numberArr.length];
            int length = numberArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                dArr[i2] = numberArr[i].doubleValue();
                i++;
                i2++;
            }
            return dArr;
        }
        return null;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public long[] getAllIntValue(String str) {
        Number[] numberArr = this.inputValue;
        if (numberArr != null) {
            long[] jArr = new long[numberArr.length];
            int length = numberArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                jArr[i2] = numberArr[i].longValue();
                i++;
                i2++;
            }
            return jArr;
        }
        return null;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public ITTMParamData getArrayItem(int i) {
        Number number;
        Number[] numberArr = this.inputValue;
        if (numberArr == null) {
            return null;
        }
        if ((i < 0 && (i = i + numberArr.length) < 0) || i >= numberArr.length || (number = numberArr[i]) == null) {
            return null;
        }
        return new TTMNumberParam(number);
    }

    public TTMNumberObjectArrayParam(Double[] dArr) {
        this.inputValue = dArr;
        this.type = 8;
    }

    public TTMNumberObjectArrayParam(Float[] fArr) {
        this.inputValue = fArr;
        this.type = 8;
    }

    public TTMNumberObjectArrayParam(Integer[] numArr) {
        this.inputValue = numArr;
        this.type = 7;
    }

    public TTMNumberObjectArrayParam(Long[] lArr) {
        this.inputValue = lArr;
        this.type = 7;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public double getDoubleValue(String str, int i) {
        Number[] numberArr = this.inputValue;
        if (numberArr == null || ((i < 0 && (i = i + numberArr.length) < 0) || i >= numberArr.length)) {
            return Double.MAX_VALUE;
        }
        return numberArr[i].doubleValue();
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public long getIntValue(String str, int i) {
        Number[] numberArr = this.inputValue;
        if (numberArr == null || ((i < 0 && (i = i + numberArr.length) < 0) || i >= numberArr.length)) {
            return Long.MAX_VALUE;
        }
        return numberArr[i].longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public boolean replaceValue(String str, int i, Object obj) {
        Number[] numberArr;
        if (i != Integer.MAX_VALUE && (numberArr = this.inputValue) != 0) {
            long length = i;
            if (i < 0) {
                length = numberArr.length + i;
            }
            if (length >= 0 && length < numberArr.length) {
                numberArr[(int) length] = obj;
                return true;
            }
        }
        return false;
    }
}
