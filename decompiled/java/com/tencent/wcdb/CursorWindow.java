package com.tencent.wcdb;

import X.C2188811AlT;
import X.C786410Ut5;
import android.content.res.Resources;
import android.database.CharArrayBuffer;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tencent.wcdb.CursorWindow;
import com.tencent.wcdb.database.a;

/* JADX INFO: loaded from: classes15.dex */
public class CursorWindow extends a implements Parcelable {
    public static final Parcelable.Creator<CursorWindow> CREATOR;
    public static int sCursorWindowSize;
    public final String mName;
    public int mStartPos;
    public long mWindowPtr;

    public static native boolean nativeAllocRow(long j);

    public static native void nativeClear(long j);

    public static native void nativeCopyStringToBuffer(long j, int i, int i2, CharArrayBuffer charArrayBuffer);

    public static native long nativeCreate(String str, int i);

    public static native void nativeDispose(long j);

    public static native void nativeFreeLastRow(long j);

    public static native byte[] nativeGetBlob(long j, int i, int i2);

    public static native double nativeGetDouble(long j, int i, int i2);

    public static native long nativeGetLong(long j, int i, int i2);

    public static native int nativeGetNumRows(long j);

    public static native String nativeGetString(long j, int i, int i2);

    public static native int nativeGetType(long j, int i, int i2);

    public static native boolean nativePutBlob(long j, byte[] bArr, int i, int i2);

    public static native boolean nativePutDouble(long j, double d, int i, int i2);

    public static native boolean nativePutLong(long j, long j2, int i, int i2);

    public static native boolean nativePutNull(long j, int i, int i2);

    public static native boolean nativePutString(long j, String str, int i, int i2);

    public static native boolean nativeSetNumColumns(long j, int i);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        int integer = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
        try {
            int iN3 = C786410Ut5.n3(Resources.getSystem(), "config_cursorWindowSize", "integer", "android");
            if (iN3 != 0) {
                integer = Resources.getSystem().getInteger(iN3);
            }
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        sCursorWindowSize = integer * 1024;
        CREATOR = new Parcelable.Creator<CursorWindow>() { // from class: X.0Zjo
            @Override // android.os.Parcelable.Creator
            public final CursorWindow createFromParcel(Parcel parcel) {
                new CursorWindow();
                throw null;
            }

            @Override // android.os.Parcelable.Creator
            public final CursorWindow[] newArray(int i) {
                return new CursorWindow[i];
            }
        };
    }

    @Override // com.tencent.wcdb.database.a
    public final void LIZIZ() {
        long j = this.mWindowPtr;
        if (j != 0) {
            nativeDispose(j);
            this.mWindowPtr = 0L;
        }
    }

    public final void finalize() throws Throwable {
        try {
            long j = this.mWindowPtr;
            if (j != 0) {
                nativeDispose(j);
                this.mWindowPtr = 0L;
            }
            super.finalize();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            super.finalize();
            throw th;
        }
    }

    public CursorWindow() {
        throw new UnsupportedOperationException();
    }

    public final void LJFF() {
        LIZ();
        try {
            this.mStartPos = 0;
            nativeClear(this.mWindowPtr);
            LIZLLL();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZLLL();
            throw th;
        }
    }

    public final int LJIIZILJ() {
        LIZ();
        try {
            int iNativeGetNumRows = nativeGetNumRows(this.mWindowPtr);
            LIZLLL();
            return iNativeGetNumRows;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZLLL();
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.mName);
        sbLIZ.append(" {");
        sbLIZ.append(Long.toHexString(this.mWindowPtr));
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CursorWindow(String str) {
        str = (str == null || str.length() == 0) ? "<unnamed>" : str;
        this.mName = str;
        long jNativeCreate = nativeCreate(str, sCursorWindowSize);
        this.mWindowPtr = jNativeCreate;
        if (jNativeCreate != 0) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cursor window allocation of ");
        sbLIZ.append(sCursorWindowSize / 1024);
        sbLIZ.append(" kb failed. ");
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        throw new RuntimeException(strLIZIZ) { // from class: X.09PW
        };
    }

    public final byte[] LJII(int i, int i2) {
        LIZ();
        try {
            byte[] bArrNativeGetBlob = nativeGetBlob(this.mWindowPtr, i - this.mStartPos, i2);
            LIZLLL();
            return bArrNativeGetBlob;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZLLL();
            throw th;
        }
    }

    public final double LJIILL(int i, int i2) {
        LIZ();
        try {
            double dNativeGetDouble = nativeGetDouble(this.mWindowPtr, i - this.mStartPos, i2);
            LIZLLL();
            return dNativeGetDouble;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZLLL();
            throw th;
        }
    }

    public final long LJIILLIIL(int i, int i2) {
        LIZ();
        try {
            long jNativeGetLong = nativeGetLong(this.mWindowPtr, i - this.mStartPos, i2);
            LIZLLL();
            return jNativeGetLong;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZLLL();
            throw th;
        }
    }

    public final String LJIJJ(int i, int i2) {
        LIZ();
        try {
            String strNativeGetString = nativeGetString(this.mWindowPtr, i - this.mStartPos, i2);
            LIZLLL();
            return strNativeGetString;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZLLL();
            throw th;
        }
    }

    public final int LJIJJLI(int i, int i2) {
        LIZ();
        try {
            int iNativeGetType = nativeGetType(this.mWindowPtr, i - this.mStartPos, i2);
            LIZLLL();
            return iNativeGetType;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZLLL();
            throw th;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        throw new UnsupportedOperationException();
    }

    public final void LJI(int i, int i2, CharArrayBuffer charArrayBuffer) {
        if (charArrayBuffer != null) {
            LIZ();
            try {
                nativeCopyStringToBuffer(this.mWindowPtr, i - this.mStartPos, i2, charArrayBuffer);
                LIZLLL();
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LIZLLL();
                throw th;
            }
        }
        throw new IllegalArgumentException("CharArrayBuffer should not be null");
    }
}
