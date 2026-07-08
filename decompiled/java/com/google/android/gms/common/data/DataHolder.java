package com.google.android.gms.common.data;

import X.C817920W6s;
import X.C817940W6u;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.Closeable;

/* JADX INFO: loaded from: classes14.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new Parcelable.Creator<DataHolder>() { // from class: X.0W6r
        @Override // android.os.Parcelable.Creator
        public final DataHolder createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            String[] strArrLJIIIIZZ = null;
            int iLJIJJLI = 0;
            int iLJIJJLI2 = 0;
            CursorWindow[] cursorWindowArr = null;
            Bundle bundleLIZIZ = null;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                if (c != 1000) {
                                    C0W6J.LJJII(i, parcel);
                                } else {
                                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                                }
                            } else {
                                bundleLIZIZ = C0W6J.LIZIZ(i, parcel);
                            }
                        } else {
                            iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                        }
                    } else {
                        cursorWindowArr = (CursorWindow[]) C0W6J.LJIIJ(parcel, i, CursorWindow.CREATOR);
                    }
                } else {
                    strArrLJIIIIZZ = C0W6J.LJIIIIZZ(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            DataHolder dataHolder = new DataHolder(iLJIJJLI, strArrLJIIIIZZ, cursorWindowArr, iLJIJJLI2, bundleLIZIZ);
            dataHolder.LJLZ();
            return dataHolder;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DataHolder[] newArray(int i) {
            return new DataHolder[i];
        }
    };
    public static final C817920W6s zaf;
    public final int LL;
    public Bundle LLILLJJLI;
    public int[] LLILLL;
    public boolean LLILZ;
    public int zad;
    public final String[] zag;
    public final CursorWindow[] zah;
    public final int zai;
    public final Bundle zaj;
    public boolean zak = true;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            try {
                if (!this.LLILZ) {
                    this.LLILZ = true;
                    int i = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.zah;
                        if (i >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i].close();
                        i++;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    static {
        final String[] strArr = new String[0];
        zaf = new C817920W6s(strArr) { // from class: X.0W6t
        };
    }

    public final void LJLZ() {
        this.LLILLJJLI = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.zag;
            if (i2 >= strArr.length) {
                break;
            }
            this.LLILLJJLI.putInt(strArr[i2], i2);
            i2++;
        }
        this.LLILLL = new int[this.zah.length];
        int numRows = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.zah;
            if (i >= cursorWindowArr.length) {
                this.zad = numRows;
                return;
            }
            this.LLILLL[i] = numRows;
            numRows += this.zah[i].getNumRows() - (numRows - cursorWindowArr[i].getStartPosition());
            i++;
        }
    }

    public final void finalize() throws Throwable {
        boolean z;
        try {
            if (this.zak && this.zah.length > 0) {
                synchronized (this) {
                    try {
                        z = this.LLILZ;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                if (!z) {
                    close();
                    new StringBuilder(String.valueOf(toString()).length() + 178);
                }
            }
            super.finalize();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            super.finalize();
            throw th2;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIJI(parcel, 1, this.zag);
        C817940W6u.LJIJJLI(parcel, 2, this.zah, i);
        C817940W6u.LJIIJ(parcel, 3, this.zai);
        C817940W6u.LIZJ(parcel, 4, this.zaj);
        C817940W6u.LJIIJ(parcel, LSPassThroughRecordSizeConfig.DEFAULT, this.LL);
        C817940W6u.LJJI(iLJJ, parcel);
        if ((i & 1) != 0) {
            close();
        }
    }

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.LL = i;
        this.zag = strArr;
        this.zah = cursorWindowArr;
        this.zai = i2;
        this.zaj = bundle;
    }
}
