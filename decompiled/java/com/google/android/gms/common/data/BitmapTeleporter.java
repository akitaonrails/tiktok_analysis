package com.google.android.gms.common.data;

import X.C0VSV;
import X.C0W3J;
import X.C817940W6u;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes14.dex */
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new Parcelable.Creator<BitmapTeleporter>() { // from class: X.0WL1
        @Override // android.os.Parcelable.Creator
        public final BitmapTeleporter createFromParcel(Parcel parcel) {
            int iLJJIII = C0W6J.LJJIII(parcel);
            int iLJIJJLI = 0;
            ParcelFileDescriptor parcelFileDescriptor = null;
            int iLJIJJLI2 = 0;
            while (parcel.dataPosition() < iLJJIII) {
                int i = parcel.readInt();
                char c = (char) i;
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            C0W6J.LJJII(i, parcel);
                        } else {
                            iLJIJJLI2 = C0W6J.LJIJJLI(i, parcel);
                        }
                    } else {
                        parcelFileDescriptor = (ParcelFileDescriptor) C0W6J.LJI(parcel, i, ParcelFileDescriptor.CREATOR);
                    }
                } else {
                    iLJIJJLI = C0W6J.LJIJJLI(i, parcel);
                }
            }
            C0W6J.LJIIL(iLJJIII, parcel);
            return new BitmapTeleporter(iLJIJJLI, parcelFileDescriptor, iLJIJJLI2);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BitmapTeleporter[] newArray(int i) {
            return new BitmapTeleporter[i];
        }
    };
    public final int LL;
    public ParcelFileDescriptor LLILLJJLI;
    public final int LLILLL;
    public Bitmap zad;
    public boolean zae;
    public File zaf;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.LLILLJJLI == null) {
            Bitmap bitmap = this.zad;
            C0W3J.LJIIIIZZ(bitmap);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(byteBufferAllocate);
            byte[] bArrArray = byteBufferAllocate.array();
            File file = this.zaf;
            if (file != null) {
                try {
                    File fileCreateTempFile = File.createTempFile("teleporter", ".tmp", file);
                    try {
                        C0VSV c0vsv = new C0VSV(fileCreateTempFile);
                        this.LLILLJJLI = ParcelFileDescriptor.open(fileCreateTempFile, 268435456);
                        fileCreateTempFile.delete();
                        DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(c0vsv));
                        try {
                            try {
                                dataOutputStream.writeInt(bArrArray.length);
                                dataOutputStream.writeInt(bitmap.getWidth());
                                dataOutputStream.writeInt(bitmap.getHeight());
                                dataOutputStream.writeUTF(bitmap.getConfig().toString());
                                dataOutputStream.write(bArrArray);
                                try {
                                    dataOutputStream.close();
                                } catch (IOException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            } catch (IOException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                throw new IllegalStateException("Could not write into unlinked file", e2);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            try {
                                dataOutputStream.close();
                                throw th;
                            } catch (IOException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                throw th;
                            }
                        }
                    } catch (FileNotFoundException e4) {
                        TryCatchGuardChecker.doCheck(e4);
                        throw new IllegalStateException("Temporary file is somehow already deleted");
                    }
                } catch (IOException e5) {
                    TryCatchGuardChecker.doCheck(e5);
                    throw new IllegalStateException("Could not create temporary file", e5);
                }
            } else {
                throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
            }
        }
        int iLJJ = C817940W6u.LJJ(20293, parcel);
        C817940W6u.LJIIJ(parcel, 1, this.LL);
        C817940W6u.LJIIZILJ(parcel, 2, this.LLILLJJLI, i | 1, false);
        C817940W6u.LJIIJ(parcel, 3, this.LLILLL);
        C817940W6u.LJJI(iLJJ, parcel);
        this.LLILLJJLI = null;
    }

    public BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.LL = i;
        this.LLILLJJLI = parcelFileDescriptor;
        this.LLILLL = i2;
    }
}
