package com.squareup.wire;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import java.io.IOException;
import java.lang.reflect.Array;
import okio.ByteString;

/* JADX INFO: loaded from: classes24.dex */
public abstract class AndroidMessage<M extends Message<M, B>, B extends Message.Builder<M, B>> extends Message<M, B> implements Parcelable {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public static final class ProtoAdapterCreator<M> implements Parcelable.Creator<M> {
        public final ProtoAdapter<M> LIZ;

        public ProtoAdapterCreator(ProtoAdapter<M> protoAdapter) {
            this.LIZ = protoAdapter;
        }

        @Override // android.os.Parcelable.Creator
        public M createFromParcel(Parcel parcel) {
            try {
                return this.LIZ.decode(parcel.createByteArray());
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new RuntimeException(e);
            }
        }

        @Override // android.os.Parcelable.Creator
        public M[] newArray(int i) {
            return (M[]) ((Object[]) Array.newInstance(this.LIZ.javaType, i));
        }
    }

    public static <E> Parcelable.Creator<E> newCreator(ProtoAdapter<E> protoAdapter) {
        return new ProtoAdapterCreator(protoAdapter);
    }

    public AndroidMessage(ProtoAdapter<M> protoAdapter, ByteString byteString) {
        super(protoAdapter, byteString);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(encode());
    }
}
