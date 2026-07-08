package com.mcs.aidl;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public interface IMcsSdkService extends IInterface {

    public static class Default implements IMcsSdkService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.mcs.aidl.IMcsSdkService
        public void process(Bundle bundle) {
        }
    }

    public static abstract class Stub extends Binder implements IMcsSdkService {

        public static class Proxy implements IMcsSdkService {
            public static IMcsSdkService sDefaultImpl;
            public IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return "com.mcs.aidl.IMcsSdkService";
            }

            @Override // com.mcs.aidl.IMcsSdkService
            public void process(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.mcs.aidl.IMcsSdkService");
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    } else {
                        Stub.getDefaultImpl().process(bundle);
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
            attachInterface(this, "com.mcs.aidl.IMcsSdkService");
        }

        public static IMcsSdkService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.mcs.aidl.IMcsSdkService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMcsSdkService)) ? new Proxy(iBinder) : (IMcsSdkService) iInterfaceQueryLocalInterface;
        }

        public static IMcsSdkService getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IMcsSdkService iMcsSdkService) {
            if (Proxy.sDefaultImpl != null || iMcsSdkService == null) {
                return false;
            }
            Proxy.sDefaultImpl = iMcsSdkService;
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
                parcel2.writeString("com.mcs.aidl.IMcsSdkService");
                return true;
            }
            parcel.enforceInterface("com.mcs.aidl.IMcsSdkService");
            process(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }
    }

    void process(Bundle bundle);
}
