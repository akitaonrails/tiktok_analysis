package com.tiktok.ttm.ttmparam;

/* JADX INFO: loaded from: classes14.dex */
public class TTMNumberArrayParam extends ITTMParamData {
    public double[] doubleArray;
    public float[] floatArray;
    public int[] intArray;
    public long[] longArray;
    public final int type = 8;

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public int getArraySize() {
        int[] iArr = this.intArray;
        if (iArr != null) {
            return iArr.length;
        }
        float[] fArr = this.floatArray;
        if (fArr != null) {
            return fArr.length;
        }
        double[] dArr = this.doubleArray;
        if (dArr != null) {
            return dArr.length;
        }
        long[] jArr = this.longArray;
        if (jArr != null) {
            return jArr.length;
        }
        return 0;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public Object getInputData() {
        int[] iArr = this.intArray;
        if (iArr != null) {
            return iArr;
        }
        long[] jArr = this.longArray;
        if (jArr != null) {
            return jArr;
        }
        double[] dArr = this.doubleArray;
        if (dArr != null) {
            return dArr;
        }
        float[] fArr = this.floatArray;
        if (fArr != null) {
            return fArr;
        }
        return null;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public int getType() {
        return this.type;
    }

    public TTMNumberArrayParam(double[] dArr) {
        this.doubleArray = dArr;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public double[] getAllDoubleValue(String str) {
        int[] iArr = this.intArray;
        int i = 0;
        if (iArr != null) {
            double[] dArr = new double[iArr.length];
            int length = iArr.length;
            int i2 = 0;
            while (i < length) {
                dArr[i2] = iArr[i];
                i++;
                i2++;
            }
            return dArr;
        }
        double[] dArr2 = this.doubleArray;
        if (dArr2 != null) {
            return dArr2;
        }
        long[] jArr = this.longArray;
        if (jArr != null) {
            double[] dArr3 = new double[jArr.length];
            int length2 = jArr.length;
            int i3 = 0;
            while (i < length2) {
                dArr3[i3] = jArr[i];
                i++;
                i3++;
            }
            return dArr3;
        }
        float[] fArr = this.floatArray;
        if (fArr != null) {
            double[] dArr4 = new double[fArr.length];
            int length3 = fArr.length;
            int i4 = 0;
            while (i < length3) {
                dArr4[i4] = fArr[i];
                i++;
                i4++;
            }
            return dArr4;
        }
        return null;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public long[] getAllIntValue(String str) {
        int[] iArr = this.intArray;
        int i = 0;
        if (iArr != null) {
            long[] jArr = new long[iArr.length];
            int length = iArr.length;
            int i2 = 0;
            while (i < length) {
                jArr[i2] = iArr[i];
                i++;
                i2++;
            }
            return jArr;
        }
        long[] jArr2 = this.longArray;
        if (jArr2 != null) {
            return jArr2;
        }
        double[] dArr = this.doubleArray;
        if (dArr != null) {
            long[] jArr3 = new long[dArr.length];
            int length2 = dArr.length;
            int i3 = 0;
            while (i < length2) {
                jArr3[i3] = (long) dArr[i];
                i++;
                i3++;
            }
            return jArr3;
        }
        float[] fArr = this.floatArray;
        if (fArr != null) {
            long[] jArr4 = new long[fArr.length];
            int length3 = fArr.length;
            int i4 = 0;
            while (i < length3) {
                jArr4[i4] = (long) fArr[i];
                i++;
                i4++;
            }
            return jArr4;
        }
        return null;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public ITTMParamData getArrayItem(int i) {
        int[] iArr = this.intArray;
        int length = 0;
        if (iArr != null) {
            if ((i < 0 && (length = iArr.length + i) < 0) || length >= iArr.length) {
                return null;
            }
            return new TTMNumberParam(iArr[i]);
        }
        long[] jArr = this.longArray;
        if (jArr != null) {
            if ((i < 0 && (length = jArr.length + i) < 0) || length >= jArr.length) {
                return null;
            }
            return new TTMNumberParam(jArr[i]);
        }
        double[] dArr = this.doubleArray;
        if (dArr != null) {
            if ((i < 0 && (length = dArr.length + i) < 0) || length >= dArr.length) {
                return null;
            }
            return new TTMNumberParam(dArr[i]);
        }
        float[] fArr = this.floatArray;
        if (fArr == null || ((i < 0 && (length = fArr.length + i) < 0) || length >= fArr.length)) {
            return null;
        }
        return new TTMNumberParam(fArr[i]);
    }

    public TTMNumberArrayParam(float[] fArr) {
        this.floatArray = fArr;
    }

    public TTMNumberArrayParam(int[] iArr) {
        this.intArray = iArr;
    }

    public TTMNumberArrayParam(long[] jArr) {
        this.longArray = jArr;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public double getDoubleValue(String str, int i) {
        if (i == Integer.MAX_VALUE) {
            return Double.MAX_VALUE;
        }
        int[] iArr = this.intArray;
        int length = 0;
        if (iArr != null) {
            if ((i < 0 && (length = iArr.length + i) < 0) || length >= iArr.length) {
                return Double.MAX_VALUE;
            }
            return iArr[length];
        }
        long[] jArr = this.longArray;
        if (jArr != null) {
            if ((i < 0 && (length = jArr.length + i) < 0) || length >= jArr.length) {
                return Double.MAX_VALUE;
            }
            return jArr[length];
        }
        float[] fArr = this.floatArray;
        if (fArr != null) {
            if ((i < 0 && (length = fArr.length + i) < 0) || length >= fArr.length) {
                return Double.MAX_VALUE;
            }
            return fArr[length];
        }
        double[] dArr = this.doubleArray;
        if (dArr == null) {
            return Double.MAX_VALUE;
        }
        if ((i < 0 && (length = dArr.length + i) < 0) || length >= dArr.length) {
            return Double.MAX_VALUE;
        }
        return dArr[length];
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public long getIntValue(String str, int i) {
        if (i != Integer.MAX_VALUE) {
            int[] iArr = this.intArray;
            int length = 0;
            if (iArr != null) {
                if ((i < 0 && (length = iArr.length + i) < 0) || length >= iArr.length) {
                    return Long.MAX_VALUE;
                }
                return iArr[length];
            }
            long[] jArr = this.longArray;
            if (jArr != null) {
                if ((i < 0 && (length = jArr.length + i) < 0) || length >= jArr.length) {
                    return Long.MAX_VALUE;
                }
                return jArr[length];
            }
            float[] fArr = this.floatArray;
            if (fArr != null) {
                if ((i < 0 && (length = fArr.length + i) < 0) || length >= fArr.length) {
                    return Long.MAX_VALUE;
                }
                return (long) fArr[length];
            }
            double[] dArr = this.doubleArray;
            if (dArr != null && ((i >= 0 || (length = dArr.length + i) >= 0) && length < dArr.length)) {
                return (long) dArr[length];
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public boolean replaceValue(String str, int i, Object obj) {
        long length;
        long length2;
        long length3;
        long length4;
        if (i != Integer.MAX_VALUE && (obj instanceof Number)) {
            int[] iArr = this.intArray;
            if (iArr != null) {
                if (i < 0) {
                    length4 = iArr.length + i;
                    if (length4 >= 0) {
                    }
                    return false;
                }
                length4 = 0;
                if (length4 < iArr.length) {
                    iArr[(int) length4] = ((Number) obj).intValue();
                    return true;
                }
                return false;
            }
            long[] jArr = this.longArray;
            if (jArr != null) {
                if (i < 0) {
                    length3 = jArr.length + i;
                    if (length3 >= 0) {
                    }
                    return false;
                }
                length3 = 0;
                if (length3 < jArr.length) {
                    jArr[(int) length3] = ((Number) obj).longValue();
                    return true;
                }
                return false;
            }
            float[] fArr = this.floatArray;
            if (fArr != null) {
                if (i < 0) {
                    length2 = fArr.length + i;
                    if (length2 >= 0) {
                    }
                    return false;
                }
                length2 = 0;
                if (length2 < fArr.length) {
                    fArr[(int) length2] = ((Number) obj).floatValue();
                    return true;
                }
                return false;
            }
            double[] dArr = this.doubleArray;
            if (dArr != null) {
                if (i < 0) {
                    length = dArr.length + i;
                    if (length >= 0) {
                    }
                } else {
                    length = 0;
                }
                if (length < dArr.length) {
                    dArr[(int) length] = ((Number) obj).doubleValue();
                    return true;
                }
            }
        }
        return false;
    }
}
