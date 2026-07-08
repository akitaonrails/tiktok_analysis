package com.ss.android.ugc.aweme.filter;

import X.C1466660oGm;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class StrArray implements Parcelable, Serializable {
    public static final Parcelable.Creator<StrArray> CREATOR = new C1466660oGm(8);
    public List<String> mItems;
    public List<Integer> numbers;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void addIndex() {
        int size = this.mItems.size();
        if (size > 0) {
            this.numbers.add(Integer.valueOf(size - 1));
        }
    }

    public String getLastOrNull() {
        if (this.mItems.isEmpty()) {
            return null;
        }
        return (String) ListProtector.get(this.mItems, r1.size() - 1);
    }

    public void removeLast() {
        if (this.mItems.isEmpty()) {
            return;
        }
        ListProtector.remove(this.mItems, r1.size() - 1);
    }

    public void removeLastArray() {
        int size = this.mItems.size();
        int size2 = this.numbers.size();
        if (size <= 0 || size2 <= 1) {
            return;
        }
        int iIntValue = ((Integer) ListProtector.get(this.numbers, size2 - 2)).intValue();
        for (int i = size - 1; i > iIntValue; i--) {
            ListProtector.remove(this.mItems, i);
        }
        ListProtector.remove(this.numbers, size2 - 1);
    }

    public void reset() {
        this.mItems.clear();
        this.numbers.clear();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = this.mItems.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) ListProtector.get(this.mItems, i));
            if (i != size - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public StrArray() {
        this.mItems = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.numbers = arrayList;
        arrayList.add(-1);
    }

    public StrArray(Parcel parcel) {
        this.numbers = new ArrayList();
        this.mItems = parcel.createStringArrayList();
        parcel.readList(this.numbers, Integer.class.getClassLoader());
    }

    public static StrArray from(String str) {
        StrArray strArray = new StrArray();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split(",")) {
                strArray.add(str2);
            }
        }
        return strArray;
    }

    public void add(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mItems.add(str);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.mItems);
        parcel.writeList(this.numbers);
    }
}
