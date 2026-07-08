package com.mcs.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes35.dex */
public interface INotifiPermissionCallback extends IInterface {

    public static class Default implements INotifiPermissionCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.mcs.aidl.INotifiPermissionCallback
        public void onFail(int i, String str) {
        }

        @Override // com.mcs.aidl.INotifiPermissionCallback
        public void onSuccess() {
        }
    }

    public static abstract class Stub extends Binder implements INotifiPermissionCallback {

        public static class Proxy implements INotifiPermissionCallback {
            public static INotifiPermissionCallback sDefaultImpl;
            public IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return "com.mcs.aidl.INotifiPermissionCallback";
            }

            @Override // com.mcs.aidl.INotifiPermissionCallback
            public void onFail(int i, String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.mcs.aidl.INotifiPermissionCallback");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    if (this.mRemote.transact(2, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    } else {
                        Stub.getDefaultImpl().onFail(i, str);
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

            @Override // com.mcs.aidl.INotifiPermissionCallback
            public void onSuccess() {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.mcs.aidl.INotifiPermissionCallback");
                    if (this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) || Stub.getDefaultImpl() == null) {
                        parcelObtain2.readException();
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    } else {
                        Stub.getDefaultImpl().onSuccess();
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
            attachInterface(this, "com.mcs.aidl.INotifiPermissionCallback");
        }

        public static INotifiPermissionCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.mcs.aidl.INotifiPermissionCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof INotifiPermissionCallback)) ? new Proxy(iBinder) : (INotifiPermissionCallback) iInterfaceQueryLocalInterface;
        }

        public static INotifiPermissionCallback getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(INotifiPermissionCallback iNotifiPermissionCallback) {
            if (Proxy.sDefaultImpl != null || iNotifiPermissionCallback == null) {
                return false;
            }
            Proxy.sDefaultImpl = iNotifiPermissionCallback;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("com.mcs.aidl.INotifiPermissionCallback");
                onSuccess();
            } else {
                if (i != 2) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString("com.mcs.aidl.INotifiPermissionCallback");
                    return true;
                }
                parcel.enforceInterface("com.mcs.aidl.INotifiPermissionCallback");
                onFail(parcel.readInt(), parcel.readString());
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onFail(int i, String str);

    void onSuccess();
}
