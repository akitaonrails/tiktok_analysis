package com.ss.android.ugc.aweme.minis.page.main.functions.notification.page;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.page.main.functions.notification.page.MinisNotificationSettingsParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class MinisNotificationSettingsParams implements Parcelable {

    @C09CT("schema_data")
    public final SchemaParserData schemaParserData;
    public static final Parcelable.Creator<MinisNotificationSettingsParams> CREATOR = new Parcelable.Creator<MinisNotificationSettingsParams>() { // from class: X.0m3P
        @Override // android.os.Parcelable.Creator
        public final MinisNotificationSettingsParams createFromParcel(Parcel parcel) {
            return new MinisNotificationSettingsParams(SchemaParserData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MinisNotificationSettingsParams[] newArray(int i) {
            return new MinisNotificationSettingsParams[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MinisNotificationSettingsParams) && Intrinsics.LJFF(this.schemaParserData, ((MinisNotificationSettingsParams) obj).schemaParserData);
    }

    public final int hashCode() {
        return this.schemaParserData.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisNotificationSettingsParams(schemaParserData=");
        sbLIZ.append(this.schemaParserData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.schemaParserData.writeToParcel(parcel, i);
    }

    public MinisNotificationSettingsParams(SchemaParserData schemaParserData) {
        this.schemaParserData = schemaParserData;
    }
}
