package com.bytedance.tt.reliability.monitor.bundlechecker;

import X.C2110908Ot;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public class BundleAndIntentLancet {
    public static final int BYTE_LIMIT_SIZE;
    public static final int CHAR_LIMIT_SIZE;
    public static final int CHAR_SEQUENCE_LIMIT_SIZE;
    public static final int DOUBLE_LIMIT_SIZE;
    public static final int FLOAT_LIMIT_SIZE;
    public static final int INT_LIMIT_SIZE;
    public static final int LONG_LIMIT_SIZE;
    public static final int SHORT_LIMIT_SIZE;
    public static final int STRING_LIMIT_SIZE;

    static {
        int i = BundleTooLargeChecker.LARGE_BUNDLE_SIZE;
        BYTE_LIMIT_SIZE = i;
        SHORT_LIMIT_SIZE = i / 2;
        CHAR_LIMIT_SIZE = i / 2;
        INT_LIMIT_SIZE = i / 4;
        FLOAT_LIMIT_SIZE = i / 4;
        LONG_LIMIT_SIZE = i / 8;
        DOUBLE_LIMIT_SIZE = i / 8;
        STRING_LIMIT_SIZE = (i - 48) / 2;
        CHAR_SEQUENCE_LIMIT_SIZE = (i - 56) / 2;
    }

    public void putAll(Bundle bundle) {
        if (bundle != null) {
            BundleTooLargeChecker.recordBundleTooLargePoint("putAll_bundle", bundle);
        }
        int i = C2110908Ot.LIZ;
    }

    public Intent putExtras(Intent intent) {
        BundleTooLargeChecker.recordBundleTooLargePoint("putExtras_intent", intent);
        int i = C2110908Ot.LIZ;
        return (Intent) new Object();
    }

    public Intent putExtras(Bundle bundle) {
        BundleTooLargeChecker.recordBundleTooLargePoint("putExtras_bundle", bundle);
        int i = C2110908Ot.LIZ;
        return (Intent) new Object();
    }

    public void putBinder(String str, IBinder iBinder) {
        BundleTooLargeChecker.recordBundleTooLargePoint(str, iBinder);
        int i = C2110908Ot.LIZ;
    }

    public void putBundle(String str, Bundle bundle) {
        BundleTooLargeChecker.recordBundleTooLargePoint(str, bundle);
        int i = C2110908Ot.LIZ;
    }

    public void putByteArray(String str, byte[] bArr) {
        if (bArr != null && bArr.length > BYTE_LIMIT_SIZE) {
            BundleTooLargeChecker.recordBundleTooLargePoint(str, bArr);
        }
        int i = C2110908Ot.LIZ;
    }

    public void putCharArray(String str, char[] cArr) {
        if (cArr != null && cArr.length > CHAR_LIMIT_SIZE) {
            BundleTooLargeChecker.recordBundleTooLargePoint(str, cArr);
        }
        int i = C2110908Ot.LIZ;
    }

    public void putCharSequence(String str, CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > CHAR_SEQUENCE_LIMIT_SIZE) {
            BundleTooLargeChecker.recordBundleTooLargePoint(str, charSequence);
        }
        int i = C2110908Ot.LIZ;
    }

    public void putCharSequenceArray(String str, CharSequence[] charSequenceArr) {
        BundleTooLargeChecker.recordBundleTooLargePoint(str, charSequenceArr);
        int i = C2110908Ot.LIZ;
    }

    public Intent putCharSequenceArrayListExtra(String str, ArrayList<CharSequence> arrayList) {
        BundleTooLargeChecker.recordBundleTooLargePoint(str, arrayList);
        int i = C2110908Ot.LIZ;
        return (Intent) new Object();
    }

    public Intent putExtra(String str, CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > CHAR_SEQUENCE_LIMIT_SIZE) {
            BundleTooLargeChecker.recordBundleTooLargePoint(str, charSequence);
        }
        int i = C2110908Ot.LIZ;
        return (Intent) new Object();
    }

    public void putFloatArray(String str, float[] fArr) {
        if (fArr != null && fArr.length > FLOAT_LIMIT_SIZE) {
            BundleTooLargeChecker.recordBundleTooLargePoint(str, fArr);
        }
        int i = C2110908Ot.LIZ;
    }

    public void putIntegerArrayList(String str, ArrayList<Integer> arrayList) {
        if (arrayList != null && arrayList.size() > INT_LIMIT_SIZE) {
            BundleTooLargeChecker.recordBundleTooLargePoint(str, arrayList);
        }
        int i = C2110908Ot.LIZ;
    }

    public Intent putIntegerArrayListExtra(String str, ArrayList<Integer> arrayList) {
        if (arrayList != null && arrayList.size() > INT_LIMIT_SIZE) {
            BundleTooLargeChecker.recordBundleTooLargePoint(str, arrayList);
        }
        int i = C2110908Ot.LIZ;
        return (Intent) new Object();
    }

    public void putParcelable(String str, Parcelable parcelable) {
        BundleTooLargeChecker.recordBundleTooLargePoint(str, parcelable);
        int i = C2110908Ot.LIZ;
    }

    public void putParcelableArray(String str, Parcelable[] parcelableArr) {
        BundleTooLargeChecker.recordBundleTooLargePoint(str, parcelableArr);
        int i = C2110908Ot.LIZ;
    }

    public void putParcelableArrayList(String str, ArrayList<? extends Parcelable> arrayList) {
        BundleTooLargeChecker.recordBundleTooLargePoint(str, arrayList);
        int i = C2110908Ot.LIZ;
    }

    public Intent putParcelableArrayListExtra(String str, ArrayList<? extends Parcelable> arrayList) {
        BundleTooLargeChecker.recordBundleTooLargePoint(str, arrayList);
        int i = C2110908Ot.LIZ;
        return (Intent) new Object();
    }

    public void putSerializable(String str, Serializable serializable) {
        BundleTooLargeChecker.recordBundleTooLargePoint(str, serializable);
        int i = C2110908Ot.LIZ;
    }

    public void putShortArray(String str, short[] sArr) {
        if (sArr != null && sArr.length > SHORT_LIMIT_SIZE) {
            BundleTooLargeChecker.recordBundleTooLargePoint(str, sArr);
        }
        int i = C2110908Ot.LIZ;
    }

    public void putSparseParcelableArray(String str, SparseArray<? extends Parcelable> sparseArray) {
        BundleTooLargeChecker.recordBundleTooLargePoint(str, sparseArray);
        int i = C2110908Ot.LIZ;
    }

    public void putString(String str, String str2) {
        if (str2 != null && str2.length() > STRING_LIMIT_SIZE) {
            BundleTooLargeChecker.recordBundleTooLargePoint(str, str2);
        }
        int i = C2110908Ot.LIZ;
    }

    public void putStringArrayList(String str, ArrayList<String> arrayList) {
        BundleTooLargeChecker.recordBundleTooLargePoint(str, arrayList);
        int i = C2110908Ot.LIZ;
    }

    public Intent putStringArrayListExtra(String str, ArrayList<String> arrayList) {
        BundleTooLargeChecker.recordBundleTooLargePoint(str, arrayList);
        int i = C2110908Ot.LIZ;
        return (Intent) new Object();
    }

    public Intent putExtra(String str, String str2) {
        if (str2 != null && str2.length() > STRING_LIMIT_SIZE) {
            BundleTooLargeChecker.recordBundleTooLargePoint(str, str2);
        }
        int i = C2110908Ot.LIZ;
        return (Intent) new Object();
    }

    public Intent putExtra(String str, byte[] bArr) {
        if (bArr != null && bArr.length > BYTE_LIMIT_SIZE) {
            BundleTooLargeChecker.recordBundleTooLargePoint(str, bArr);
        }
        int i = C2110908Ot.LIZ;
        return (Intent) new Object();
    }

    public Intent putExtra(String str, char[] cArr) {
        if (cArr != null && cArr.length > CHAR_LIMIT_SIZE) {
            BundleTooLargeChecker.recordBundleTooLargePoint(str, cArr);
        }
        int i = C2110908Ot.LIZ;
        return (Intent) new Object();
    }

    public Intent putExtra(String str, double[] dArr) {
        if (dArr != null && dArr.length > DOUBLE_LIMIT_SIZE) {
            BundleTooLargeChecker.recordBundleTooLargePoint(str, dArr);
        }
        int i = C2110908Ot.LIZ;
        return (Intent) new Object();
    }

    public Intent putExtra(String str, float[] fArr) {
        if (fArr != null && fArr.length > FLOAT_LIMIT_SIZE) {
            BundleTooLargeChecker.recordBundleTooLargePoint(str, fArr);
        }
        int i = C2110908Ot.LIZ;
        return (Intent) new Object();
    }

    public Intent putExtra(String str, int[] iArr) {
        if (iArr != null && iArr.length > INT_LIMIT_SIZE) {
            BundleTooLargeChecker.recordBundleTooLargePoint(str, iArr);
        }
        int i = C2110908Ot.LIZ;
        return (Intent) new Object();
    }

    public Intent putExtra(String str, long[] jArr) {
        if (jArr != null && jArr.length > LONG_LIMIT_SIZE) {
            BundleTooLargeChecker.recordBundleTooLargePoint(str, jArr);
        }
        int i = C2110908Ot.LIZ;
        return (Intent) new Object();
    }

    public Intent putExtra(String str, short[] sArr) {
        if (sArr != null && sArr.length > SHORT_LIMIT_SIZE) {
            BundleTooLargeChecker.recordBundleTooLargePoint(str, sArr);
        }
        int i = C2110908Ot.LIZ;
        return (Intent) new Object();
    }

    public Intent putExtra(String str, boolean[] zArr) {
        if (zArr != null && zArr.length > BYTE_LIMIT_SIZE) {
            BundleTooLargeChecker.recordBundleTooLargePoint(str, zArr);
        }
        int i = C2110908Ot.LIZ;
        return (Intent) new Object();
    }

    public Intent putExtra(String str, Bundle bundle) {
        BundleTooLargeChecker.recordBundleTooLargePoint(str, bundle);
        int i = C2110908Ot.LIZ;
        return (Intent) new Object();
    }

    public Intent putExtra(String str, Parcelable parcelable) {
        BundleTooLargeChecker.recordBundleTooLargePoint(str, parcelable);
        int i = C2110908Ot.LIZ;
        return (Intent) new Object();
    }

    public Intent putExtra(String str, Serializable serializable) {
        BundleTooLargeChecker.recordBundleTooLargePoint(str, serializable);
        int i = C2110908Ot.LIZ;
        return (Intent) new Object();
    }

    public Intent putExtra(String str, Parcelable[] parcelableArr) {
        BundleTooLargeChecker.recordBundleTooLargePoint(str, parcelableArr);
        int i = C2110908Ot.LIZ;
        return (Intent) new Object();
    }

    public Intent putExtra(String str, CharSequence[] charSequenceArr) {
        BundleTooLargeChecker.recordBundleTooLargePoint(str, charSequenceArr);
        int i = C2110908Ot.LIZ;
        return (Intent) new Object();
    }

    public Intent putExtra(String str, String[] strArr) {
        BundleTooLargeChecker.recordBundleTooLargePoint(str, strArr);
        int i = C2110908Ot.LIZ;
        return (Intent) new Object();
    }
}
