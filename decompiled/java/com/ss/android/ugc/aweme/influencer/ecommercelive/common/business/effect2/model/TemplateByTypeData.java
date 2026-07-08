package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RespTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateByTypeData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class TemplateByTypeData implements Parcelable {

    @C09CT("server_time")
    public final Long serverTime;

    @C09CT("billboard_template")
    public final RespTemplateItem template;
    public static final Parcelable.Creator<TemplateByTypeData> CREATOR = new Parcelable.Creator<TemplateByTypeData>() { // from class: X.0v8M
        @Override // android.os.Parcelable.Creator
        public final TemplateByTypeData createFromParcel(Parcel parcel) {
            RespTemplateItem respTemplateItemCreateFromParcel;
            Long lValueOf = null;
            if (parcel.readInt() == 0) {
                respTemplateItemCreateFromParcel = null;
            } else {
                respTemplateItemCreateFromParcel = RespTemplateItem.CREATOR.createFromParcel(parcel);
            }
            RespTemplateItem respTemplateItem = respTemplateItemCreateFromParcel;
            if (parcel.readInt() != 0) {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            return new TemplateByTypeData(respTemplateItem, lValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final TemplateByTypeData[] newArray(int i) {
            return new TemplateByTypeData[i];
        }
    };
    public static final int $stable = 8;

    public TemplateByTypeData() {
        this(null, 0L);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateByTypeData)) {
            return false;
        }
        TemplateByTypeData templateByTypeData = (TemplateByTypeData) obj;
        return Intrinsics.LJFF(this.template, templateByTypeData.template) && Intrinsics.LJFF(this.serverTime, templateByTypeData.serverTime);
    }

    public final int hashCode() {
        RespTemplateItem respTemplateItem = this.template;
        int iHashCode = (respTemplateItem == null ? 0 : respTemplateItem.hashCode()) * 31;
        Long l = this.serverTime;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateByTypeData(template=");
        sbLIZ.append(this.template);
        sbLIZ.append(", serverTime=");
        sbLIZ.append(this.serverTime);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        RespTemplateItem respTemplateItem = this.template;
        if (respTemplateItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            respTemplateItem.writeToParcel(parcel, i);
        }
        Long l = this.serverTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    public TemplateByTypeData(RespTemplateItem respTemplateItem, Long l) {
        this.template = respTemplateItem;
        this.serverTime = l;
    }
}
