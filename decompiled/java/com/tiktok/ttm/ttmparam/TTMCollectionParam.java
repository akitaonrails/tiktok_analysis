package com.tiktok.ttm.ttmparam;

import X.C829660Wge;
import X.C829740Wgm;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class TTMCollectionParam extends ITTMParamData {
    public Collection<Object> inputData;
    public boolean isList;

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public int getType() {
        return 1;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public int getArraySize() {
        Collection<Object> collection = this.inputData;
        if (collection != null) {
            return collection.size();
        }
        return 0;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public Object getInputData() {
        return this.inputData;
    }

    public TTMCollectionParam(List<Object> list) {
        this.inputData = list;
        this.isList = true;
    }

    private Object getObjectValue(int i) {
        int realIndex = getRealIndex(i);
        if (realIndex == -1) {
            return null;
        }
        if (this.isList) {
            return ListProtector.get((List) this.inputData, realIndex);
        }
        int i2 = 0;
        for (Object obj : this.inputData) {
            int i3 = i2 + 1;
            if (i2 == realIndex) {
                return obj;
            }
            i2 = i3;
        }
        return null;
    }

    private int getRealIndex(int i) {
        if ((i >= 0 || (i = i + this.inputData.size()) >= 0) && i < this.inputData.size()) {
            return i;
        }
        return -1;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public void addArrayItem(ITTMParamData iTTMParamData) {
        Collection<Object> collection = this.inputData;
        if (collection != null) {
            collection.add(iTTMParamData);
        }
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public double[] getAllDoubleValue(String str) {
        Collection<Object> collection = this.inputData;
        if (collection == null) {
            return null;
        }
        double[] dArr = new double[collection.size()];
        Iterator<Object> it2 = this.inputData.iterator();
        int i = 0;
        while (it2.hasNext()) {
            dArr[i] = C829740Wgm.LIZ(it2.next(), null);
            i++;
        }
        return dArr;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public long[] getAllIntValue(String str) {
        Collection<Object> collection = this.inputData;
        if (collection == null) {
            return null;
        }
        long[] jArr = new long[collection.size()];
        Iterator<Object> it2 = this.inputData.iterator();
        int i = 0;
        while (it2.hasNext()) {
            jArr[i] = C829740Wgm.LIZIZ(it2.next(), null);
            i++;
        }
        return jArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public String[] getAllStringValue(String str) {
        int i;
        Collection<Object> collection = this.inputData;
        if (collection != null) {
            String[] strArr = new String[collection.size()];
            int i2 = 0;
            for (Object obj : this.inputData) {
                if (obj instanceof ITTMParamData) {
                    i = i2 + 1;
                    strArr[i2] = ((ITTMParamData) obj).getStringValue(str, Integer.MAX_VALUE);
                } else if (obj instanceof String) {
                    i = i2 + 1;
                    strArr[i2] = obj;
                }
                i2 = i;
            }
            return strArr;
        }
        return null;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public ITTMParamData getArrayItem(int i) {
        int realIndex;
        Object obj = null;
        if (this.inputData == null || (realIndex = getRealIndex(i)) == -1) {
            return null;
        }
        if (this.isList) {
            return C829660Wge.LIZ(ListProtector.get((List) this.inputData, realIndex));
        }
        Iterator<Object> it2 = this.inputData.iterator();
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            int i3 = i2 + 1;
            if (i2 == realIndex) {
                obj = next;
                break;
            }
            i2 = i3;
        }
        return C829660Wge.LIZ(obj);
    }

    public TTMCollectionParam(Collection<Object> collection) {
        this.inputData = collection;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public double getDoubleValue(String str, int i) {
        if (i != Integer.MAX_VALUE && this.inputData != null) {
            return C829740Wgm.LIZ(getObjectValue(i), str);
        }
        return Double.MAX_VALUE;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public long getIntValue(String str, int i) {
        if (i != Integer.MAX_VALUE && this.inputData != null) {
            return C829740Wgm.LIZIZ(getObjectValue(i), str);
        }
        return Long.MAX_VALUE;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public String getStringValue(String str, int i) {
        if (i != Integer.MAX_VALUE && this.inputData != null) {
            return C829740Wgm.LIZJ(getObjectValue(i), str);
        }
        return null;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public boolean removeValue(String str, int i) {
        int realIndex;
        if (i == Integer.MAX_VALUE || this.inputData == null || (realIndex = getRealIndex(i)) == -1) {
            return false;
        }
        if (this.isList) {
            ListProtector.remove((List) this.inputData, realIndex);
            return true;
        }
        int i2 = 0;
        for (Object obj : this.inputData) {
            int i3 = i2 + 1;
            if (i2 == realIndex) {
                this.inputData.remove(obj);
                return true;
            }
            i2 = i3;
        }
        return false;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public boolean addValue(String str, int i, Object obj) {
        Collection<Object> collection = this.inputData;
        if (collection != null) {
            collection.add(obj);
            return true;
        }
        return false;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public boolean replaceValue(String str, int i, Object obj) {
        int realIndex;
        int i2 = 0;
        if (i == Integer.MAX_VALUE || this.inputData == null || (realIndex = getRealIndex(i)) == -1) {
            return false;
        }
        if (this.isList) {
            ListProtector.set((List) this.inputData, realIndex, obj);
            return true;
        }
        for (Object obj2 : this.inputData) {
            this.inputData.remove(obj2);
            int i3 = i2 + 1;
            if (i2 == realIndex) {
                this.inputData.add(obj);
            } else {
                this.inputData.add(obj2);
            }
            i2 = i3;
        }
        return true;
    }
}
