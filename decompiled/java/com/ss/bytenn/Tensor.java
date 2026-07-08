package com.ss.bytenn;

import X.C08FF;
import X.C1554390qYH;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes24.dex */
public class Tensor implements Parcelable {
    public static final Parcelable.Creator<Tensor> CREATOR = new C1554390qYH(6);
    public int batch;
    public int channel;
    public DataFormat dataFormat;
    public DataType dataType;
    public int height;
    public String name;
    public ByteBuffer raw_data;
    public int width;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getOrdinalOfDataFormat() {
        return this.dataFormat.ordinal();
    }

    public int getOrdinalOfDataType() {
        return this.dataType.ordinal();
    }

    public Tensor() {
        this.dataFormat = DataFormat.NCHW;
        this.dataType = DataType.Float;
        this.name = "";
    }

    public int getBatch() {
        return this.batch;
    }

    public int getChannel() {
        return this.channel;
    }

    public ByteBuffer getData() {
        return this.raw_data;
    }

    public int getHeight() {
        return this.height;
    }

    public String getName() {
        return this.name;
    }

    public int getWidth() {
        return this.width;
    }

    public enum DataFormat {
        NCHW,
        NHWC;

        public static DataFormat valueOf(String str) {
            return (DataFormat) C08FF.LIZ(DataFormat.class, str);
        }
    }

    public enum DataType {
        U8,
        Int8,
        Int16,
        Uint16,
        Float,
        Fp16,
        Double;

        public static DataType valueOf(String str) {
            return (DataType) C08FF.LIZ(DataType.class, str);
        }
    }

    public Tensor(Parcel parcel) {
        this.dataFormat = DataFormat.values()[parcel.readInt()];
        this.dataType = DataType.values()[parcel.readInt()];
        this.batch = parcel.readInt();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.channel = parcel.readInt();
        parcel.readByteArray(null);
        this.raw_data = ByteBuffer.wrap(null);
        this.name = parcel.readString();
    }

    public void setBatch(int i) {
        this.batch = i;
    }

    public void setChannel(int i) {
        this.channel = i;
    }

    public void setData(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            this.raw_data = byteBuffer;
            return;
        }
        throw new Exception("ByteBuffer must be direct");
    }

    public void setDataFormat(DataFormat dataFormat) {
        this.dataFormat = dataFormat;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.dataFormat.ordinal());
        parcel.writeInt(this.dataType.ordinal());
        parcel.writeInt(this.batch);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.channel);
        parcel.writeByteArray(new byte[this.raw_data.remaining()]);
        parcel.writeString(this.name);
    }

    public void init(DataFormat dataFormat, DataType dataType, int i, int i2, int i3, int i4, ByteBuffer byteBuffer, String str) throws Exception {
        this.dataFormat = dataFormat;
        this.dataType = dataType;
        this.batch = i;
        this.width = i2;
        this.height = i3;
        this.channel = i4;
        if (byteBuffer != null && !byteBuffer.isDirect()) {
            throw new Exception("ByteBuffer must be direct");
        }
        this.raw_data = byteBuffer;
        this.name = str;
    }
}
