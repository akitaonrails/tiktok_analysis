package com.ss.android.ugc.effectmanager.common.model;

import X.C09CT;
import X.C13H6;
import X.C13HG;
import X.C13HI;
import X.C19989713Jf;
import X.C19989813Jg;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1841100y0i;
import X.InterfaceC19983313Gt;
import X.InterfaceC19986513Hz;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1841100y0i
public final class BaseInfo implements Serializable, Parcelable {

    @C09CT("duration")
    public final Long duration;

    @C09CT("ext")
    public final String ext;

    @C09CT("height")
    public final Integer height;

    @C09CT("size")
    public final long size;

    @C09CT("width")
    public final Integer width;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<BaseInfo> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<BaseInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BaseInfo createFromParcel(Parcel parcel) {
            return new BaseInfo(parcel.readString(), parcel.readLong(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BaseInfo[] newArray(int i) {
            return new BaseInfo[i];
        }
    }

    public BaseInfo() {
        this("", 0L, null, null, null);
    }

    public static /* synthetic */ void getDuration$annotations() {
    }

    public static /* synthetic */ void getExt$annotations() {
    }

    public static /* synthetic */ void getHeight$annotations() {
    }

    public static /* synthetic */ void getSize$annotations() {
    }

    public static /* synthetic */ void getWidth$annotations() {
    }

    public final BaseInfo copy(String str, long j, Integer num, Integer num2, Long l) {
        return new BaseInfo(str, j, num, num2, l);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseInfo)) {
            return false;
        }
        BaseInfo baseInfo = (BaseInfo) obj;
        return Intrinsics.LJFF(this.ext, baseInfo.ext) && this.size == baseInfo.size && Intrinsics.LJFF(this.height, baseInfo.height) && Intrinsics.LJFF(this.width, baseInfo.width) && Intrinsics.LJFF(this.duration, baseInfo.duration);
    }

    public int hashCode() {
        int iHashCode = ((this.ext.hashCode() * 31) + C786410Ut5.Y2(this.size)) * 31;
        Integer num = this.height;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.width;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.duration;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseInfo(ext=");
        sbLIZ.append(this.ext);
        sbLIZ.append(", size=");
        sbLIZ.append(this.size);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ext);
        parcel.writeLong(this.size);
        Integer num = this.height;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.width;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Long l = this.duration;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    public static final class Companion {
        public final C13HG<BaseInfo> serializer() {
            return BaseInfo$$serializer.INSTANCE;
        }
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final String getExt() {
        return this.ext;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final long getSize() {
        return this.size;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public static final /* synthetic */ void write$Self$ckresource_model_release(BaseInfo baseInfo, InterfaceC19986513Hz interfaceC19986513Hz, InterfaceC19983313Gt interfaceC19983313Gt) {
        if (interfaceC19986513Hz.LJIJJ() || !Intrinsics.LJFF(baseInfo.ext, "")) {
            interfaceC19986513Hz.LJIILIIL(interfaceC19983313Gt, 0, baseInfo.ext);
        }
        if (interfaceC19986513Hz.LJIJJ() || baseInfo.size != 0) {
            interfaceC19986513Hz.LJFF(interfaceC19983313Gt, 1, baseInfo.size);
        }
        if (interfaceC19986513Hz.LJIJJ() || baseInfo.height != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 2, C13HI.LIZ, baseInfo.height);
        }
        if (interfaceC19986513Hz.LJIJJ() || baseInfo.width != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 3, C13HI.LIZ, baseInfo.width);
        }
        if (interfaceC19986513Hz.LJIJJ() || baseInfo.duration != null) {
            interfaceC19986513Hz.LJIIZILJ(interfaceC19983313Gt, 4, C13H6.LIZ, baseInfo.duration);
        }
    }

    public BaseInfo(String str, long j, Integer num, Integer num2, Long l) {
        this.ext = str;
        this.size = j;
        this.height = num;
        this.width = num2;
        this.duration = l;
    }

    public /* synthetic */ BaseInfo(int i, String str, long j, Integer num, Integer num2, Long l, C19989813Jg c19989813Jg) {
        if (0 == 0) {
            this.ext = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.size = 0L;
            } else {
                this.size = j;
            }
            if ((i & 4) == 0) {
                this.height = null;
            } else {
                this.height = num;
            }
            if ((i & 8) == 0) {
                this.width = null;
            } else {
                this.width = num2;
            }
            if ((i & 16) == 0) {
                this.duration = null;
                return;
            } else {
                this.duration = l;
                return;
            }
        }
        C19989713Jf.LIZ(i, 0, BaseInfo$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
}
