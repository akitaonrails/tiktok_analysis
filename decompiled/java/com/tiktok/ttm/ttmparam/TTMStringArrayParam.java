package com.tiktok.ttm.ttmparam;

/* JADX INFO: loaded from: classes14.dex */
public class TTMStringArrayParam extends ITTMParamData {
    public String[] value;

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public int getType() {
        return 9;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public int getArraySize() {
        return this.value.length;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public Object getInputData() {
        return this.value;
    }

    public TTMStringArrayParam(String[] strArr) {
        this.value = strArr;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public String[] getAllStringValue(String str) {
        return this.value;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public ITTMParamData getArrayItem(int i) {
        int length;
        String str;
        String[] strArr = this.value;
        if (strArr == null) {
            return null;
        }
        if (i < 0) {
            length = strArr.length + i;
            if (length < 0) {
                return null;
            }
        } else {
            length = 0;
        }
        if (length >= strArr.length || (str = strArr[i]) == null) {
            return null;
        }
        return new TTMStringParam(str);
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public String getStringValue(String str, int i) {
        String[] strArr;
        int length;
        if (str == null && i != Integer.MAX_VALUE && (strArr = this.value) != null) {
            if (i < 0) {
                length = strArr.length + i;
                if (length >= 0) {
                }
            } else {
                length = 0;
            }
            if (length < strArr.length) {
                return strArr[length];
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public boolean replaceValue(String str, int i, Object obj) {
        String[] strArr;
        int length;
        if (i != Integer.MAX_VALUE && (strArr = this.value) != 0 && (obj instanceof String)) {
            if (i < 0) {
                length = strArr.length + i;
                if (length >= 0) {
                }
            } else {
                length = 0;
            }
            if (length < strArr.length) {
                strArr[length] = obj;
                return true;
            }
        }
        return false;
    }
}
