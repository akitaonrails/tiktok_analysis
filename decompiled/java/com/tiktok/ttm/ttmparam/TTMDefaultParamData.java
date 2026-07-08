package com.tiktok.ttm.ttmparam;

import X.C829660Wge;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public class TTMDefaultParamData extends ITTMParamData {
    public final Object inputData;
    public final int type;

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public int getArraySize() {
        TTMPrefMetric tTMPrefMetricCreateAndStart = TTMPrefMetric.createAndStart("GetArraySize");
        try {
            Object obj = this.inputData;
            if (obj == null) {
                if (tTMPrefMetricCreateAndStart != null) {
                    tTMPrefMetricCreateAndStart.endAndPrint();
                }
                return -1;
            }
            if (obj instanceof Collection) {
                int size = ((Collection) obj).size();
                if (tTMPrefMetricCreateAndStart != null) {
                    tTMPrefMetricCreateAndStart.endAndPrint();
                }
                return size;
            }
            if (obj instanceof Object[]) {
                int length = ((Object[]) obj).length;
                if (tTMPrefMetricCreateAndStart != null) {
                    tTMPrefMetricCreateAndStart.endAndPrint();
                }
                return length;
            }
            if (obj instanceof int[]) {
                int length2 = ((int[]) obj).length;
                if (tTMPrefMetricCreateAndStart != null) {
                    tTMPrefMetricCreateAndStart.endAndPrint();
                }
                return length2;
            }
            if (obj instanceof long[]) {
                int length3 = ((long[]) obj).length;
                if (tTMPrefMetricCreateAndStart != null) {
                    tTMPrefMetricCreateAndStart.endAndPrint();
                }
                return length3;
            }
            if (obj instanceof double[]) {
                int length4 = ((double[]) obj).length;
                if (tTMPrefMetricCreateAndStart != null) {
                    tTMPrefMetricCreateAndStart.endAndPrint();
                }
                return length4;
            }
            if (!(obj instanceof float[])) {
                if (tTMPrefMetricCreateAndStart != null) {
                    tTMPrefMetricCreateAndStart.endAndPrint();
                }
                return -1;
            }
            int length5 = ((float[]) obj).length;
            if (tTMPrefMetricCreateAndStart != null) {
                tTMPrefMetricCreateAndStart.endAndPrint();
            }
            return length5;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (tTMPrefMetricCreateAndStart != null) {
                tTMPrefMetricCreateAndStart.endAndPrint();
            }
            throw th;
        }
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public double[] getDictDoubleValuesImmediate() {
        Object obj;
        if (this.type != 0 || (obj = this.inputData) == null) {
            return null;
        }
        Collection collectionValues = ((Map) obj).values();
        double[] dArr = new double[collectionValues.size()];
        int i = 0;
        for (Object obj2 : collectionValues) {
            if (obj2 instanceof Number) {
                dArr[i] = ((Number) obj2).doubleValue();
                i++;
            } else {
                dArr[i] = -1.0d;
                i++;
            }
        }
        return dArr;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public long[] getDictIntValuesImmediate() {
        Object obj;
        int i;
        if (this.type != 0 || (obj = this.inputData) == null) {
            return null;
        }
        Collection collectionValues = ((Map) obj).values();
        long[] jArr = new long[collectionValues.size()];
        int i2 = 0;
        for (Object obj2 : collectionValues) {
            if (obj2 instanceof Boolean) {
                i = i2 + 1;
                jArr[i2] = ((Boolean) obj2).booleanValue() ? 1L : 0L;
            } else if (obj2 instanceof Number) {
                i = i2 + 1;
                jArr[i2] = ((Number) obj2).longValue();
            } else {
                jArr[i2] = -1;
                i2++;
            }
            i2 = i;
        }
        return jArr;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public String[] getDictKeys() {
        if (this.type != 0) {
            return null;
        }
        Set setKeySet = ((Map) this.inputData).keySet();
        return (String[]) setKeySet.toArray(new String[setKeySet.size()]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public String[] getDictStringValuesImmediate() {
        Object obj;
        if (this.type != 0 || (obj = this.inputData) == null) {
            return null;
        }
        Collection collectionValues = ((Map) obj).values();
        String[] strArr = new String[collectionValues.size()];
        Iterator it2 = collectionValues.iterator();
        int i = 0;
        while (it2.hasNext()) {
            strArr[i] = it2.next();
            i++;
        }
        return strArr;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public Object[] getDictValuesImmediate() {
        if (this.type != 0) {
            return null;
        }
        Collection collectionValues = ((Map) this.inputData).values();
        return collectionValues.toArray(new Object[collectionValues.size()]);
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public double getDoubleValue() {
        TTMPrefMetric tTMPrefMetricCreateAndStart = TTMPrefMetric.createAndStart("GetDoubleValue");
        try {
            int i = this.type;
            if (i == 2 || i == 4 || i == 5) {
                Object obj = this.inputData;
                if (obj instanceof Boolean) {
                    double d = ((Boolean) obj).booleanValue() ? 1.0d : 0.0d;
                    if (tTMPrefMetricCreateAndStart != null) {
                        tTMPrefMetricCreateAndStart.endAndPrint();
                    }
                    return d;
                }
                if (obj instanceof Number) {
                    double dDoubleValue = ((Number) obj).doubleValue();
                    if (tTMPrefMetricCreateAndStart != null) {
                        tTMPrefMetricCreateAndStart.endAndPrint();
                    }
                    return dDoubleValue;
                }
            }
            if (tTMPrefMetricCreateAndStart == null) {
                return -1.0d;
            }
            tTMPrefMetricCreateAndStart.endAndPrint();
            return -1.0d;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (tTMPrefMetricCreateAndStart != null) {
                tTMPrefMetricCreateAndStart.endAndPrint();
            }
            throw th;
        }
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public long getIntValue() {
        TTMPrefMetric tTMPrefMetricCreateAndStart = TTMPrefMetric.createAndStart("GetIntValue");
        try {
            int i = this.type;
            if (i == 2 || i == 4 || i == 5) {
                Object obj = this.inputData;
                if (obj instanceof Boolean) {
                    long j = ((Boolean) obj).booleanValue() ? 1L : 0L;
                    if (tTMPrefMetricCreateAndStart != null) {
                        tTMPrefMetricCreateAndStart.endAndPrint();
                    }
                    return j;
                }
                if (obj instanceof Number) {
                    long jLongValue = ((Number) obj).longValue();
                    if (tTMPrefMetricCreateAndStart != null) {
                        tTMPrefMetricCreateAndStart.endAndPrint();
                    }
                    return jLongValue;
                }
            }
            if (tTMPrefMetricCreateAndStart == null) {
                return -1L;
            }
            tTMPrefMetricCreateAndStart.endAndPrint();
            return -1L;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (tTMPrefMetricCreateAndStart != null) {
                tTMPrefMetricCreateAndStart.endAndPrint();
            }
            throw th;
        }
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public String getStringValue() {
        TTMPrefMetric tTMPrefMetricCreateAndStart = TTMPrefMetric.createAndStart("innerGetStringValue");
        try {
            if (this.type != 2) {
                if (tTMPrefMetricCreateAndStart == null) {
                    return null;
                }
                tTMPrefMetricCreateAndStart.endAndPrint();
                return null;
            }
            String str = (String) this.inputData;
            if (tTMPrefMetricCreateAndStart != null) {
                tTMPrefMetricCreateAndStart.endAndPrint();
            }
            return str;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (tTMPrefMetricCreateAndStart != null) {
                tTMPrefMetricCreateAndStart.endAndPrint();
            }
            throw th;
        }
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public int getType() {
        int i = this.type;
        if (i != 2) {
            return i;
        }
        Object obj = this.inputData;
        if (obj == null) {
            return 13;
        }
        if (obj instanceof Collection) {
            return 1;
        }
        if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Boolean)) {
            return 4;
        }
        if ((obj instanceof Float) || (obj instanceof Double)) {
            return 5;
        }
        if (obj instanceof String) {
            return 6;
        }
        if (obj instanceof String[]) {
            return 9;
        }
        if ((obj instanceof Integer[]) || (obj instanceof int[]) || (obj instanceof Long[]) || (obj instanceof long[])) {
            return 7;
        }
        if ((obj instanceof Double[]) || (obj instanceof double[]) || (obj instanceof Float[]) || (obj instanceof float[])) {
            return 8;
        }
        return i;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public Object getInputData() {
        return this.inputData;
    }

    public TTMDefaultParamData(double d) {
        this.inputData = Double.valueOf(d);
        this.type = 5;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public void addArrayItem(ITTMParamData iTTMParamData) {
        TTMPrefMetric tTMPrefMetricCreateAndStart = TTMPrefMetric.createAndStart("AddArrayItem");
        try {
            if (this.type != 1) {
                if (tTMPrefMetricCreateAndStart != null) {
                    tTMPrefMetricCreateAndStart.endAndPrint();
                }
            } else {
                ((Collection) this.inputData).add(Long.valueOf(iTTMParamData.getIntValue()));
                if (tTMPrefMetricCreateAndStart != null) {
                    tTMPrefMetricCreateAndStart.endAndPrint();
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (tTMPrefMetricCreateAndStart != null) {
                tTMPrefMetricCreateAndStart.endAndPrint();
            }
            throw th;
        }
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public double[] getAllDoubleValue(String str) {
        Object obj;
        TTMPrefMetric tTMPrefMetricCreateAndStart = TTMPrefMetric.createAndStart("jniGetAllDoubleValue");
        try {
            if (str == null) {
                obj = this.inputData;
            } else {
                obj = ((Map) this.inputData).get(str);
            }
            int i = 0;
            if (obj instanceof Collection) {
                double[] dArr = new double[((Collection) obj).size()];
                for (Object obj2 : (Collection) obj) {
                    if (obj2 instanceof Number) {
                        dArr[i] = ((Number) obj2).doubleValue();
                        i++;
                    } else {
                        dArr[i] = -1.0d;
                        i++;
                    }
                }
                if (tTMPrefMetricCreateAndStart != null) {
                    tTMPrefMetricCreateAndStart.endAndPrint();
                }
                return dArr;
            }
            if (obj instanceof Object[]) {
                double[] dArr2 = new double[((Object[]) obj).length];
                Object[] objArr = (Object[]) obj;
                int length = objArr.length;
                int i2 = 0;
                while (i < length) {
                    Object obj3 = objArr[i];
                    if (obj3 instanceof Number) {
                        int i3 = i2 + 1;
                        dArr2[i2] = ((Number) obj3).doubleValue();
                        i2 = i3;
                    } else {
                        dArr2[i2] = -1.0d;
                        i2++;
                    }
                    i++;
                }
                if (tTMPrefMetricCreateAndStart != null) {
                    tTMPrefMetricCreateAndStart.endAndPrint();
                }
                return dArr2;
            }
            if (obj instanceof double[]) {
                double[] dArr3 = (double[]) obj;
                if (tTMPrefMetricCreateAndStart != null) {
                    tTMPrefMetricCreateAndStart.endAndPrint();
                }
                return dArr3;
            }
            if (obj instanceof float[]) {
                double[] dArr4 = new double[((float[]) obj).length];
                int length2 = ((float[]) obj).length;
                int i4 = 0;
                while (i < length2) {
                    dArr4[i4] = r7[i];
                    i++;
                    i4++;
                }
                if (tTMPrefMetricCreateAndStart != null) {
                    tTMPrefMetricCreateAndStart.endAndPrint();
                }
                return dArr4;
            }
            if (tTMPrefMetricCreateAndStart != null) {
                tTMPrefMetricCreateAndStart.endAndPrint();
                return null;
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (tTMPrefMetricCreateAndStart != null) {
                tTMPrefMetricCreateAndStart.endAndPrint();
            }
            throw th;
        }
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public long[] getAllIntValue(String str) {
        Object obj;
        int i;
        long j;
        int i2;
        long j2;
        TTMPrefMetric tTMPrefMetricCreateAndStart = TTMPrefMetric.createAndStart("jniGetAllIntValue");
        try {
            if (str == null) {
                obj = this.inputData;
            } else {
                obj = ((Map) this.inputData).get(str);
            }
            int i3 = 0;
            if (obj instanceof Collection) {
                long[] jArr = new long[((Collection) obj).size()];
                for (Object obj2 : (Collection) obj) {
                    if (obj2 instanceof Boolean) {
                        i2 = i3 + 1;
                        if (((Boolean) obj2).booleanValue()) {
                            j2 = 1;
                        } else {
                            j2 = 0;
                        }
                        jArr[i3] = j2;
                    } else if (obj2 instanceof Number) {
                        i2 = i3 + 1;
                        jArr[i3] = ((Number) obj2).longValue();
                    } else {
                        jArr[i3] = -1;
                        i3++;
                    }
                    i3 = i2;
                }
                if (tTMPrefMetricCreateAndStart != null) {
                    tTMPrefMetricCreateAndStart.endAndPrint();
                }
                return jArr;
            }
            if (obj instanceof Object[]) {
                long[] jArr2 = new long[((Object[]) obj).length];
                Object[] objArr = (Object[]) obj;
                int length = objArr.length;
                int i4 = 0;
                while (i3 < length) {
                    Object obj3 = objArr[i3];
                    if (obj3 instanceof Boolean) {
                        i = i4 + 1;
                        if (((Boolean) obj3).booleanValue()) {
                            j = 1;
                        } else {
                            j = 0;
                        }
                        jArr2[i4] = j;
                    } else if (obj3 instanceof Number) {
                        i = i4 + 1;
                        jArr2[i4] = ((Number) obj3).longValue();
                    } else {
                        jArr2[i4] = -1;
                        i4++;
                        i3++;
                    }
                    i4 = i;
                    i3++;
                }
                if (tTMPrefMetricCreateAndStart != null) {
                    tTMPrefMetricCreateAndStart.endAndPrint();
                }
                return jArr2;
            }
            if (obj instanceof int[]) {
                long[] jArr3 = new long[((int[]) obj).length];
                int length2 = ((int[]) obj).length;
                int i5 = 0;
                while (i3 < length2) {
                    jArr3[i5] = r6[i3];
                    i3++;
                    i5++;
                }
                if (tTMPrefMetricCreateAndStart != null) {
                    tTMPrefMetricCreateAndStart.endAndPrint();
                }
                return jArr3;
            }
            if (obj instanceof long[]) {
                long[] jArr4 = (long[]) obj;
                if (tTMPrefMetricCreateAndStart != null) {
                    tTMPrefMetricCreateAndStart.endAndPrint();
                }
                return jArr4;
            }
            if (tTMPrefMetricCreateAndStart != null) {
                tTMPrefMetricCreateAndStart.endAndPrint();
                return null;
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (tTMPrefMetricCreateAndStart != null) {
                tTMPrefMetricCreateAndStart.endAndPrint();
            }
            throw th;
        }
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public String[] getAllStringValue(String str) {
        Object obj;
        TTMPrefMetric tTMPrefMetricCreateAndStart = TTMPrefMetric.createAndStart("jniGetAllStringValue");
        try {
            if (str == null) {
                obj = this.inputData;
            } else {
                obj = ((Map) this.inputData).get(str);
            }
            int i = 0;
            if (obj instanceof Collection) {
                String[] strArr = new String[((Collection) obj).size()];
                Iterator it2 = ((Collection) obj).iterator();
                while (it2.hasNext()) {
                    strArr[i] = (String) it2.next();
                    i++;
                }
                if (tTMPrefMetricCreateAndStart != null) {
                    tTMPrefMetricCreateAndStart.endAndPrint();
                }
                return strArr;
            }
            if (obj instanceof String[]) {
                String[] strArr2 = (String[]) obj;
                if (tTMPrefMetricCreateAndStart != null) {
                    tTMPrefMetricCreateAndStart.endAndPrint();
                }
                return strArr2;
            }
            if (obj instanceof Object[]) {
                String[] strArr3 = new String[((Object[]) obj).length];
                Object[] objArr = (Object[]) obj;
                int length = objArr.length;
                int i2 = 0;
                while (i < length) {
                    strArr3[i2] = objArr[i].toString();
                    i++;
                    i2++;
                }
                if (tTMPrefMetricCreateAndStart != null) {
                    tTMPrefMetricCreateAndStart.endAndPrint();
                }
                return strArr3;
            }
            if (tTMPrefMetricCreateAndStart != null) {
                tTMPrefMetricCreateAndStart.endAndPrint();
                return null;
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (tTMPrefMetricCreateAndStart != null) {
                tTMPrefMetricCreateAndStart.endAndPrint();
            }
            throw th;
        }
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public ITTMParamData getArrayItem(int i) {
        TTMPrefMetric tTMPrefMetricCreateAndStart = TTMPrefMetric.createAndStart("GetArrayItem");
        try {
            Object obj = this.inputData;
            Object obj2 = null;
            if (obj instanceof Collection) {
                Collection collection = (Collection) obj;
                if ((i >= 0 || (i = i + collection.size()) >= 0) && i < collection.size()) {
                    Iterator it2 = collection.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        int i3 = i2 + 1;
                        if (i2 != i) {
                            i2 = i3;
                        } else {
                            obj2 = next;
                            break;
                        }
                    }
                    ITTMParamData iTTMParamDataLIZ = C829660Wge.LIZ(obj2);
                    if (tTMPrefMetricCreateAndStart != null) {
                        tTMPrefMetricCreateAndStart.endAndPrint();
                    }
                    return iTTMParamDataLIZ;
                }
                if (tTMPrefMetricCreateAndStart != null) {
                    tTMPrefMetricCreateAndStart.endAndPrint();
                }
                return null;
            }
            if (obj instanceof Object[]) {
                if ((i >= 0 || (i = i + ((Object[]) obj).length) >= 0) && i < ((Object[]) obj).length) {
                    TTMDefaultParamData tTMDefaultParamData = new TTMDefaultParamData(((Object[]) obj)[i]);
                    if (tTMPrefMetricCreateAndStart != null) {
                        tTMPrefMetricCreateAndStart.endAndPrint();
                    }
                    return tTMDefaultParamData;
                }
                if (tTMPrefMetricCreateAndStart != null) {
                    tTMPrefMetricCreateAndStart.endAndPrint();
                }
                return null;
            }
            if (obj instanceof int[]) {
                if ((i >= 0 || (i = i + ((int[]) obj).length) >= 0) && i < ((int[]) obj).length) {
                    TTMDefaultParamData tTMDefaultParamData2 = new TTMDefaultParamData(((int[]) obj)[i]);
                    if (tTMPrefMetricCreateAndStart != null) {
                        tTMPrefMetricCreateAndStart.endAndPrint();
                    }
                    return tTMDefaultParamData2;
                }
                if (tTMPrefMetricCreateAndStart != null) {
                    tTMPrefMetricCreateAndStart.endAndPrint();
                }
                return null;
            }
            if (obj instanceof long[]) {
                if ((i < 0 || i >= ((long[]) obj).length) && (i = i + ((long[]) obj).length) < 0) {
                    if (tTMPrefMetricCreateAndStart != null) {
                        tTMPrefMetricCreateAndStart.endAndPrint();
                    }
                    return null;
                }
                TTMDefaultParamData tTMDefaultParamData3 = new TTMDefaultParamData(((long[]) obj)[i]);
                if (tTMPrefMetricCreateAndStart != null) {
                    tTMPrefMetricCreateAndStart.endAndPrint();
                }
                return tTMDefaultParamData3;
            }
            if (obj instanceof double[]) {
                if ((i >= 0 || (i = i + ((double[]) obj).length) >= 0) && i < ((double[]) obj).length) {
                    TTMDefaultParamData tTMDefaultParamData4 = new TTMDefaultParamData(((double[]) obj)[i]);
                    if (tTMPrefMetricCreateAndStart != null) {
                        tTMPrefMetricCreateAndStart.endAndPrint();
                    }
                    return tTMDefaultParamData4;
                }
                if (tTMPrefMetricCreateAndStart != null) {
                    tTMPrefMetricCreateAndStart.endAndPrint();
                }
                return null;
            }
            if (obj instanceof float[]) {
                if ((i >= 0 || (i = i + ((float[]) obj).length) >= 0) && i < ((float[]) obj).length) {
                    TTMDefaultParamData tTMDefaultParamData5 = new TTMDefaultParamData(((float[]) obj)[i]);
                    if (tTMPrefMetricCreateAndStart != null) {
                        tTMPrefMetricCreateAndStart.endAndPrint();
                    }
                    return tTMDefaultParamData5;
                }
                if (tTMPrefMetricCreateAndStart != null) {
                    tTMPrefMetricCreateAndStart.endAndPrint();
                }
                return null;
            }
            if (tTMPrefMetricCreateAndStart != null) {
                tTMPrefMetricCreateAndStart.endAndPrint();
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (tTMPrefMetricCreateAndStart != null) {
                tTMPrefMetricCreateAndStart.endAndPrint();
            }
            throw th;
        }
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public ITTMParamData getObjectItem(String str) {
        Object obj;
        TTMPrefMetric tTMPrefMetricCreateAndStart = TTMPrefMetric.createAndStart("GetObjectItem");
        try {
            if (this.type == 0 && (obj = this.inputData) != null) {
                ITTMParamData iTTMParamDataLIZ = C829660Wge.LIZ(((Map) obj).get(str));
                if (tTMPrefMetricCreateAndStart != null) {
                    tTMPrefMetricCreateAndStart.endAndPrint();
                }
                return iTTMParamDataLIZ;
            }
            if (tTMPrefMetricCreateAndStart != null) {
                tTMPrefMetricCreateAndStart.endAndPrint();
                return null;
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (tTMPrefMetricCreateAndStart != null) {
                tTMPrefMetricCreateAndStart.endAndPrint();
            }
            throw th;
        }
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public void removeData(String str) {
        TTMPrefMetric tTMPrefMetricCreateAndStart = TTMPrefMetric.createAndStart("removeData");
        try {
            if (this.type != 0) {
                if (tTMPrefMetricCreateAndStart != null) {
                    tTMPrefMetricCreateAndStart.endAndPrint();
                }
            } else {
                ((Map) this.inputData).remove(str);
                if (tTMPrefMetricCreateAndStart != null) {
                    tTMPrefMetricCreateAndStart.endAndPrint();
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (tTMPrefMetricCreateAndStart != null) {
                tTMPrefMetricCreateAndStart.endAndPrint();
            }
            throw th;
        }
    }

    public TTMDefaultParamData(float f) {
        this.inputData = Float.valueOf(f);
        this.type = 5;
    }

    public TTMDefaultParamData(int i) {
        this.inputData = Integer.valueOf(i);
        this.type = 4;
    }

    public TTMDefaultParamData(long j) {
        this.inputData = Long.valueOf(j);
        this.type = 4;
    }

    public TTMDefaultParamData(boolean z) {
        this.inputData = Integer.valueOf(z ? 1 : 0);
        this.type = 4;
    }

    public TTMDefaultParamData(double[] dArr) {
        this.inputData = dArr;
        this.type = 8;
    }

    public TTMDefaultParamData(float[] fArr) {
        this.inputData = fArr;
        this.type = 8;
    }

    public TTMDefaultParamData(Object obj) {
        this.inputData = obj;
        this.type = 2;
    }

    public TTMDefaultParamData(Collection<Object> collection) {
        this.inputData = collection;
        this.type = 1;
    }

    public TTMDefaultParamData(int[] iArr) {
        this.inputData = iArr;
        this.type = 7;
    }

    public TTMDefaultParamData(long[] jArr) {
        this.inputData = jArr;
        this.type = 7;
    }

    public TTMDefaultParamData(Map<String, Object> map) {
        this.inputData = map;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public double getDoubleValue(String str, int i) {
        Object obj;
        TTMPrefMetric tTMPrefMetricCreateAndStart = TTMPrefMetric.createAndStart("jniGetDoubleValue");
        try {
            if (str == null) {
                if (i != Integer.MAX_VALUE) {
                    Object obj2 = this.inputData;
                    if (obj2 instanceof List) {
                        if ((i >= 0 || (i = i + ((List) obj2).size()) >= 0) && i < ((List) this.inputData).size()) {
                            obj = ((List) this.inputData).get(i);
                        } else {
                            if (tTMPrefMetricCreateAndStart != null) {
                                tTMPrefMetricCreateAndStart.endAndPrint();
                            }
                            return Double.MAX_VALUE;
                        }
                    } else {
                        obj = null;
                        if (obj2 instanceof Collection) {
                            Collection collection = (Collection) obj2;
                            if ((i >= 0 || (i = i + collection.size()) >= 0) && i < collection.size()) {
                                Iterator it2 = collection.iterator();
                                int i2 = 0;
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    Object next = it2.next();
                                    int i3 = i2 + 1;
                                    if (i2 != i) {
                                        i2 = i3;
                                    } else {
                                        obj = next;
                                        break;
                                    }
                                }
                            } else {
                                if (tTMPrefMetricCreateAndStart != null) {
                                    tTMPrefMetricCreateAndStart.endAndPrint();
                                }
                                return Double.MAX_VALUE;
                            }
                        } else {
                            if (obj2 instanceof Object[]) {
                                if ((i >= 0 || (i = i + ((Object[]) obj2).length) >= 0) && i < ((Object[]) obj2).length) {
                                    double dDoubleValue = ((Number) ((Object[]) obj2)[i]).doubleValue();
                                    if (tTMPrefMetricCreateAndStart != null) {
                                        tTMPrefMetricCreateAndStart.endAndPrint();
                                    }
                                    return dDoubleValue;
                                }
                                if (tTMPrefMetricCreateAndStart != null) {
                                    tTMPrefMetricCreateAndStart.endAndPrint();
                                }
                                return Double.MAX_VALUE;
                            }
                            if (obj2 instanceof float[]) {
                                if ((i >= 0 || (i = i + ((float[]) obj2).length) >= 0) && i < ((float[]) obj2).length) {
                                    double d = ((float[]) obj2)[i];
                                    if (tTMPrefMetricCreateAndStart != null) {
                                        tTMPrefMetricCreateAndStart.endAndPrint();
                                    }
                                    return d;
                                }
                                if (tTMPrefMetricCreateAndStart != null) {
                                    tTMPrefMetricCreateAndStart.endAndPrint();
                                }
                                return Double.MAX_VALUE;
                            }
                            if (obj2 instanceof double[]) {
                                if ((i >= 0 || (i = i + ((double[]) obj2).length) >= 0) && i < ((double[]) obj2).length) {
                                    double d2 = ((double[]) obj2)[i];
                                    if (tTMPrefMetricCreateAndStart != null) {
                                        tTMPrefMetricCreateAndStart.endAndPrint();
                                    }
                                    return d2;
                                }
                                if (tTMPrefMetricCreateAndStart != null) {
                                    tTMPrefMetricCreateAndStart.endAndPrint();
                                }
                                return Double.MAX_VALUE;
                            }
                        }
                    }
                } else {
                    obj = this.inputData;
                }
            } else {
                obj = ((Map) this.inputData).get(str);
            }
            if (obj instanceof Number) {
                double dDoubleValue2 = ((Number) obj).doubleValue();
                if (tTMPrefMetricCreateAndStart != null) {
                    tTMPrefMetricCreateAndStart.endAndPrint();
                }
                return dDoubleValue2;
            }
            if (tTMPrefMetricCreateAndStart != null) {
                tTMPrefMetricCreateAndStart.endAndPrint();
            }
            return Double.MAX_VALUE;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (tTMPrefMetricCreateAndStart != null) {
                tTMPrefMetricCreateAndStart.endAndPrint();
            }
            throw th;
        }
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public long getIntValue(String str, int i) {
        Object obj;
        long j;
        TTMPrefMetric tTMPrefMetricCreateAndStart = TTMPrefMetric.createAndStart("jniGetIntValue");
        try {
            if (str != null) {
                obj = ((Map) this.inputData).get(str);
            } else if (i != Integer.MAX_VALUE) {
                Object obj2 = this.inputData;
                if (obj2 instanceof List) {
                    if ((i >= 0 || (i = i + ((List) obj2).size()) >= 0) && i < ((List) this.inputData).size()) {
                        obj = ((List) this.inputData).get(i);
                    } else {
                        if (tTMPrefMetricCreateAndStart != null) {
                            tTMPrefMetricCreateAndStart.endAndPrint();
                        }
                        return 2147483647L;
                    }
                } else {
                    obj = null;
                    if (obj2 instanceof Collection) {
                        if ((i >= 0 || (i = i + ((Collection) obj2).size()) >= 0) && i < ((Collection) this.inputData).size()) {
                            Iterator it2 = ((Collection) this.inputData).iterator();
                            int i2 = 0;
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                Object next = it2.next();
                                int i3 = i2 + 1;
                                if (i2 == i) {
                                    obj = next;
                                    break;
                                }
                                i2 = i3;
                            }
                        } else {
                            if (tTMPrefMetricCreateAndStart != null) {
                                tTMPrefMetricCreateAndStart.endAndPrint();
                            }
                            return 2147483647L;
                        }
                    } else {
                        if (obj2 instanceof Object[]) {
                            if ((i >= 0 || (i = i + ((Object[]) obj2).length) >= 0) && i < ((Object[]) obj2).length) {
                                long jIntValue = ((Number) ((Object[]) obj2)[i]).intValue();
                                if (tTMPrefMetricCreateAndStart != null) {
                                    tTMPrefMetricCreateAndStart.endAndPrint();
                                }
                                return jIntValue;
                            }
                            if (tTMPrefMetricCreateAndStart != null) {
                                tTMPrefMetricCreateAndStart.endAndPrint();
                            }
                            return 2147483647L;
                        }
                        if (obj2 instanceof int[]) {
                            if ((i >= 0 || (i = i + ((int[]) obj2).length) >= 0) && i < ((int[]) obj2).length) {
                                long j2 = ((int[]) obj2)[i];
                                if (tTMPrefMetricCreateAndStart != null) {
                                    tTMPrefMetricCreateAndStart.endAndPrint();
                                }
                                return j2;
                            }
                            if (tTMPrefMetricCreateAndStart != null) {
                                tTMPrefMetricCreateAndStart.endAndPrint();
                            }
                            return 2147483647L;
                        }
                        if (obj2 instanceof long[]) {
                            if ((i >= 0 || (i = ((long[]) obj2).length - i) >= 0) && i < ((long[]) obj2).length) {
                                long j3 = ((long[]) obj2)[i];
                                if (tTMPrefMetricCreateAndStart != null) {
                                    tTMPrefMetricCreateAndStart.endAndPrint();
                                }
                                return j3;
                            }
                            if (tTMPrefMetricCreateAndStart != null) {
                                tTMPrefMetricCreateAndStart.endAndPrint();
                            }
                            return 2147483647L;
                        }
                    }
                }
            } else {
                obj = this.inputData;
            }
            if (obj == null) {
                if (tTMPrefMetricCreateAndStart != null) {
                    tTMPrefMetricCreateAndStart.endAndPrint();
                }
                return Long.MAX_VALUE;
            }
            if (obj instanceof Boolean) {
                if (((Boolean) obj).booleanValue()) {
                    j = 1;
                } else {
                    j = 0;
                }
                if (tTMPrefMetricCreateAndStart != null) {
                    tTMPrefMetricCreateAndStart.endAndPrint();
                }
                return j;
            }
            if (obj instanceof Number) {
                long jLongValue = ((Number) obj).longValue();
                if (tTMPrefMetricCreateAndStart != null) {
                    tTMPrefMetricCreateAndStart.endAndPrint();
                }
                return jLongValue;
            }
            if (tTMPrefMetricCreateAndStart != null) {
                tTMPrefMetricCreateAndStart.endAndPrint();
            }
            return Long.MAX_VALUE;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (tTMPrefMetricCreateAndStart != null) {
                tTMPrefMetricCreateAndStart.endAndPrint();
            }
            throw th;
        }
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public String getStringValue(String str, int i) {
        Object string;
        int size;
        TTMPrefMetric tTMPrefMetricCreateAndStart = TTMPrefMetric.createAndStart("jniGetStringValue");
        try {
            if (str == null) {
                if (i != Integer.MAX_VALUE) {
                    Object obj = this.inputData;
                    if (obj instanceof List) {
                        if (i < 0) {
                            i = ((List) obj).size() - i;
                        }
                        if (i >= 0 && i < ((List) this.inputData).size()) {
                            string = ((List) this.inputData).get(i);
                        } else {
                            if (tTMPrefMetricCreateAndStart != null) {
                                tTMPrefMetricCreateAndStart.endAndPrint();
                            }
                            return null;
                        }
                    } else if (obj instanceof Collection) {
                        Collection collection = (Collection) obj;
                        if (i < 0) {
                            size = collection.size() - i;
                        } else {
                            size = i;
                        }
                        if (size >= 0 && size < ((Collection) this.inputData).size()) {
                            Iterator it2 = collection.iterator();
                            int i2 = 0;
                            while (true) {
                                if (it2.hasNext()) {
                                    string = it2.next();
                                    int i3 = i2 + 1;
                                    if (i2 == i) {
                                        break;
                                    }
                                    i2 = i3;
                                } else {
                                    string = null;
                                    break;
                                }
                            }
                        } else {
                            if (tTMPrefMetricCreateAndStart != null) {
                                tTMPrefMetricCreateAndStart.endAndPrint();
                            }
                            return null;
                        }
                    } else if (obj instanceof Object[]) {
                        if (i < 0) {
                            i = ((Object[]) obj).length - i;
                        }
                        if (i >= 0 && i < ((Object[]) obj).length) {
                            string = ((Object[]) obj)[i].toString();
                        } else {
                            if (tTMPrefMetricCreateAndStart != null) {
                                tTMPrefMetricCreateAndStart.endAndPrint();
                            }
                            return null;
                        }
                    } else {
                        string = null;
                    }
                } else {
                    string = this.inputData;
                }
            } else {
                string = ((Map) this.inputData).get(str);
            }
            if (string instanceof String) {
                String str2 = (String) string;
                if (tTMPrefMetricCreateAndStart != null) {
                    tTMPrefMetricCreateAndStart.endAndPrint();
                }
                return str2;
            }
            if (tTMPrefMetricCreateAndStart != null) {
                tTMPrefMetricCreateAndStart.endAndPrint();
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (tTMPrefMetricCreateAndStart != null) {
                tTMPrefMetricCreateAndStart.endAndPrint();
            }
            throw th;
        }
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public void mergeDataAsSubData(String str, ITTMParamData iTTMParamData) {
        TTMPrefMetric tTMPrefMetricCreateAndStart = TTMPrefMetric.createAndStart("mergeDataAsSubData");
        try {
            if (this.type != 0) {
                if (tTMPrefMetricCreateAndStart != null) {
                    tTMPrefMetricCreateAndStart.endAndPrint();
                }
            } else {
                ((Map) this.inputData).put(str, iTTMParamData.getInputData());
                if (tTMPrefMetricCreateAndStart != null) {
                    tTMPrefMetricCreateAndStart.endAndPrint();
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (tTMPrefMetricCreateAndStart != null) {
                tTMPrefMetricCreateAndStart.endAndPrint();
            }
            throw th;
        }
    }
}
