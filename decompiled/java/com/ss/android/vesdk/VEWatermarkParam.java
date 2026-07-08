package com.ss.android.vesdk;

import X.C1864730ycp;
import X.C2188811AlT;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes28.dex */
public class VEWatermarkParam implements Parcelable {
    public static final Parcelable.Creator<VEWatermarkParam> CREATOR = new C1864730ycp(26);
    public long duration;
    public VEWatermarkEntity[] entities;
    public String extFile;
    public int height;
    public String[] images;
    public int interval;
    public VEWatermarkMask mask;
    public boolean needExtFile;
    public VEWaterMarkPosition position;
    public int rotation;
    public String[] secondHalfImages;
    public Bitmap waterMarkBitmap;
    public int width;
    public int xOffset;
    public int yOffset;

    public static class VEWatermarkEntity implements Parcelable {
        public static final Parcelable.Creator<VEWatermarkEntity> CREATOR = new C1864730ycp(24);
        public int height;
        public String[] images;
        public int interval;
        public VEWaterMarkPosition position;
        public int rotation;
        public long sequenceIn;
        public long sequenceOut;
        public int width;
        public int xOffset;
        public int yOffset;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public int getPosition() {
            return this.position.ordinal();
        }

        public VEWatermarkEntity() {
            this.position = VEWaterMarkPosition.TL_BR;
        }

        public VEWatermarkEntity(Parcel parcel) {
            VEWaterMarkPosition vEWaterMarkPosition;
            this.position = VEWaterMarkPosition.TL_BR;
            this.images = parcel.createStringArray();
            this.interval = parcel.readInt();
            this.xOffset = parcel.readInt();
            this.yOffset = parcel.readInt();
            this.width = parcel.readInt();
            this.height = parcel.readInt();
            this.sequenceIn = parcel.readLong();
            this.sequenceOut = parcel.readLong();
            int i = parcel.readInt();
            if (i == -1) {
                vEWaterMarkPosition = null;
            } else {
                vEWaterMarkPosition = VEWaterMarkPosition.values()[i];
            }
            this.position = vEWaterMarkPosition;
            this.rotation = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int iOrdinal;
            parcel.writeStringArray(this.images);
            parcel.writeInt(this.interval);
            parcel.writeInt(this.xOffset);
            parcel.writeInt(this.yOffset);
            parcel.writeInt(this.width);
            parcel.writeInt(this.height);
            parcel.writeLong(this.sequenceIn);
            parcel.writeLong(this.sequenceOut);
            VEWaterMarkPosition vEWaterMarkPosition = this.position;
            if (vEWaterMarkPosition == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = vEWaterMarkPosition.ordinal();
            }
            parcel.writeInt(iOrdinal);
            parcel.writeInt(this.rotation);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public VEWatermarkEntity[] getEntities() {
        int i;
        if (this.entities == null && this.images != null) {
            int i2 = this.secondHalfImages != null ? 2 : 1;
            this.entities = new VEWatermarkEntity[i2];
            int i3 = 0;
            do {
                VEWatermarkEntity vEWatermarkEntity = new VEWatermarkEntity();
                vEWatermarkEntity.images = this.images;
                vEWatermarkEntity.interval = this.interval;
                vEWatermarkEntity.width = this.width;
                vEWatermarkEntity.height = this.height;
                vEWatermarkEntity.position = this.position;
                long j = this.duration;
                long j2 = i2;
                vEWatermarkEntity.sequenceIn = (((long) i3) * j) / j2;
                i = i3 + 1;
                vEWatermarkEntity.sequenceOut = (j * ((long) i)) / j2;
                vEWatermarkEntity.rotation = this.rotation;
                vEWatermarkEntity.xOffset = this.xOffset;
                vEWatermarkEntity.yOffset = this.yOffset;
                this.entities[i3] = vEWatermarkEntity;
                i3 = i;
            } while (i < i2);
            if (i2 == 2) {
                this.entities[1].images = this.secondHalfImages;
            }
            if (this.position == VEWaterMarkPosition.TL_BR && i2 == 2) {
                VEWatermarkEntity[] vEWatermarkEntityArr = this.entities;
                vEWatermarkEntityArr[0].position = VEWaterMarkPosition.TL;
                vEWatermarkEntityArr[1].position = VEWaterMarkPosition.BR;
            }
        }
        return this.entities;
    }

    public VEWatermarkParam() {
        this.duration = -1L;
        this.position = VEWaterMarkPosition.TL_BR;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" needExtFile ");
        sbLIZ.append(this.needExtFile);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static class VEWatermarkMask implements Parcelable {
        public static final Parcelable.Creator<VEWatermarkMask> CREATOR = new C1864730ycp(25);
        public int height;
        public String maskImage;
        public int width;
        public int xOffset;
        public int yOffset;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public VEWatermarkMask() {
        }

        public VEWatermarkMask(Parcel parcel) {
            this.maskImage = parcel.readString();
            this.xOffset = parcel.readInt();
            this.yOffset = parcel.readInt();
            this.width = parcel.readInt();
            this.height = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.maskImage);
            parcel.writeInt(this.xOffset);
            parcel.writeInt(this.yOffset);
            parcel.writeInt(this.width);
            parcel.writeInt(this.height);
        }
    }

    public VEWatermarkParam(Parcel parcel) {
        boolean z;
        VEWaterMarkPosition vEWaterMarkPosition;
        this.duration = -1L;
        this.position = VEWaterMarkPosition.TL_BR;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.needExtFile = z;
        this.extFile = parcel.readString();
        this.entities = (VEWatermarkEntity[]) parcel.createTypedArray(VEWatermarkEntity.CREATOR);
        this.mask = (VEWatermarkMask) parcel.readParcelable(VEWatermarkMask.class.getClassLoader());
        this.images = parcel.createStringArray();
        this.waterMarkBitmap = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.secondHalfImages = parcel.createStringArray();
        this.interval = parcel.readInt();
        this.xOffset = parcel.readInt();
        this.yOffset = parcel.readInt();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.duration = parcel.readLong();
        int i = parcel.readInt();
        if (i == -1) {
            vEWaterMarkPosition = null;
        } else {
            vEWaterMarkPosition = VEWaterMarkPosition.values()[i];
        }
        this.position = vEWaterMarkPosition;
        this.rotation = parcel.readInt();
    }

    public void setEntities(VEWatermarkEntity[] vEWatermarkEntityArr) {
        this.entities = vEWatermarkEntityArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iOrdinal;
        parcel.writeByte(this.needExtFile ? (byte) 1 : (byte) 0);
        parcel.writeString(this.extFile);
        parcel.writeTypedArray(this.entities, i);
        parcel.writeParcelable(this.mask, i);
        parcel.writeStringArray(this.images);
        parcel.writeParcelable(this.waterMarkBitmap, i);
        parcel.writeStringArray(this.secondHalfImages);
        parcel.writeInt(this.interval);
        parcel.writeInt(this.xOffset);
        parcel.writeInt(this.yOffset);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeLong(this.duration);
        VEWaterMarkPosition vEWaterMarkPosition = this.position;
        if (vEWaterMarkPosition == null) {
            iOrdinal = -1;
        } else {
            iOrdinal = vEWaterMarkPosition.ordinal();
        }
        parcel.writeInt(iOrdinal);
        parcel.writeInt(this.rotation);
    }
}
