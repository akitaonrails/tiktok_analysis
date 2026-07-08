package com.ttnet.org.chromium.base.library_loader;

import X.C08VH;
import X.C854630Xfp;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;

/* JADX INFO: loaded from: classes14.dex */
public abstract class Linker {

    public static class LibInfo implements Parcelable {
        public static final Parcelable.Creator<LibInfo> CREATOR = new C854630Xfp(21);
        public String mLibFilePath;
        public long mLoadAddress;
        public long mLoadSize;
        public int mRelroFd;
        public long mRelroSize;
        public long mRelroStart;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 1;
        }

        public LibInfo() {
            this.mRelroFd = -1;
        }

        public LibInfo(Parcel parcel) {
            this.mRelroFd = -1;
            this.mLibFilePath = parcel.readString();
            this.mLoadAddress = parcel.readLong();
            this.mLoadSize = parcel.readLong();
            this.mRelroStart = parcel.readLong();
            this.mRelroSize = parcel.readLong();
            if (parcel.readInt() != 0) {
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
                if (parcelFileDescriptor != null) {
                    this.mRelroFd = parcelFileDescriptor.detachFd();
                    return;
                }
                return;
            }
            this.mRelroFd = -1;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2;
            parcel.writeString(this.mLibFilePath);
            parcel.writeLong(this.mLoadAddress);
            parcel.writeLong(this.mLoadSize);
            parcel.writeLong(this.mRelroStart);
            parcel.writeLong(this.mRelroSize);
            if (this.mRelroFd >= 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            parcel.writeInt(i2);
            int i3 = this.mRelroFd;
            if (i3 >= 0) {
                try {
                    ParcelFileDescriptor parcelFileDescriptorFromFd = ParcelFileDescriptor.fromFd(i3);
                    parcelFileDescriptorFromFd.writeToParcel(parcel, 0);
                    parcelFileDescriptorFromFd.close();
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C08VH.LIZ("Can't write LibInfo file descriptor to parcel", e);
                }
            }
        }
    }
}
