package com.mcs.aidl;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public interface IMcsSdkEventCallback extends IInterface {

    public static class Default implements IMcsSdkEventCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.mcs.aidl.IMcsSdkEventCallback
        public void onResult(int i, Bundle bundle, String str) {
        }
    }

    public static abstract class Stub extends Binder implements IMcsSdkEventCallback {

        public static class Proxy implements IMcsSdkEventCallback {
            public static IMcsSdkEventCallback sDefaultImpl;
            public IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return "com.mcs.aidl.IMcsSdkEventCallback";
            }

            @Override // com.mcs.aidl.IMcsSdkEventCallback
            public void onResult(int i, Bundle bundle, String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.mcs.aidl.IMcsSdkEventCallback");
                    parcelObtain.writeInt(i);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeString(str);
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    } else {
                        Stub.getDefaultImpl().onResult(i, bundle, str);
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.mcs.aidl.IMcsSdkEventCallback");
        }

        public static IMcsSdkEventCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.mcs.aidl.IMcsSdkEventCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMcsSdkEventCallback)) ? new Proxy(iBinder) : (IMcsSdkEventCallback) iInterfaceQueryLocalInterface;
        }

        public static IMcsSdkEventCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IMcsSdkEventCallback iMcsSdkEventCallback) {
            if (Proxy.sDefaultImpl != null || iMcsSdkEventCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iMcsSdkEventCallback;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("com.mcs.aidl.IMcsSdkEventCallback");
                return true;
            }
            parcel.enforceInterface("com.mcs.aidl.IMcsSdkEventCallback");
            onResult(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    void onResult(int i, Bundle bundle, String str);
}
