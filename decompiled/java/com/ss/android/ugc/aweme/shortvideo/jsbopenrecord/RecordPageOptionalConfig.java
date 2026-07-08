package com.ss.android.ugc.aweme.shortvideo.jsbopenrecord;

import X.C040H;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.CompressConfig;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.OptionalComponents;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordBottomTabConfig;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordPageOptionalConfig;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.UploadConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class RecordPageOptionalConfig implements Parcelable {
    public static final Parcelable.Creator<RecordPageOptionalConfig> CREATOR = new Parcelable.Creator<RecordPageOptionalConfig>() { // from class: X.0LEl
        @Override // android.os.Parcelable.Creator
        public final RecordPageOptionalConfig createFromParcel(Parcel parcel) {
            UploadConfig uploadConfigCreateFromParcel;
            boolean z;
            boolean z2;
            int i = parcel.readInt();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            OptionalComponents optionalComponentsCreateFromParcel = OptionalComponents.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            RecordBottomTabConfig recordBottomTabConfigCreateFromParcel = RecordBottomTabConfig.CREATOR.createFromParcel(parcel);
            CompressConfig compressConfigCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                uploadConfigCreateFromParcel = null;
            } else {
                uploadConfigCreateFromParcel = UploadConfig.CREATOR.createFromParcel(parcel);
            }
            UploadConfig uploadConfig = uploadConfigCreateFromParcel;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                compressConfigCreateFromParcel = CompressConfig.CREATOR.createFromParcel(parcel);
            }
            CompressConfig compressConfig = compressConfigCreateFromParcel;
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new RecordPageOptionalConfig(i, arrayListCreateStringArrayList, optionalComponentsCreateFromParcel, string, recordBottomTabConfigCreateFromParcel, uploadConfig, z, compressConfig, string2, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final RecordPageOptionalConfig[] newArray(int i) {
            return new RecordPageOptionalConfig[i];
        }
    };

    @C040H
    public final CompressConfig compressConfig;

    @C040H
    public final int exteriorRecordPageType;

    @C040H
    public final boolean nopeMemory;

    @C040H
    public final OptionalComponents optionalComponents;

    @C040H
    public final String previousPage;

    @C040H
    public final RecordBottomTabConfig recordBottomTabConfig;

    @C040H
    public final String shootWay;

    @C040H
    public final boolean showPreviewAfterRecord;

    @C040H
    public final ArrayList<String> toolbarType;

    @C040H
    public final UploadConfig uploadConfig;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordPageOptionalConfig)) {
            return false;
        }
        RecordPageOptionalConfig recordPageOptionalConfig = (RecordPageOptionalConfig) obj;
        return this.exteriorRecordPageType == recordPageOptionalConfig.exteriorRecordPageType && Intrinsics.LJFF(this.toolbarType, recordPageOptionalConfig.toolbarType) && Intrinsics.LJFF(this.optionalComponents, recordPageOptionalConfig.optionalComponents) && Intrinsics.LJFF(this.shootWay, recordPageOptionalConfig.shootWay) && Intrinsics.LJFF(this.recordBottomTabConfig, recordPageOptionalConfig.recordBottomTabConfig) && Intrinsics.LJFF(this.uploadConfig, recordPageOptionalConfig.uploadConfig) && this.showPreviewAfterRecord == recordPageOptionalConfig.showPreviewAfterRecord && Intrinsics.LJFF(this.compressConfig, recordPageOptionalConfig.compressConfig) && Intrinsics.LJFF(this.previousPage, recordPageOptionalConfig.previousPage) && this.nopeMemory == recordPageOptionalConfig.nopeMemory;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.exteriorRecordPageType * 31) + this.toolbarType.hashCode()) * 31) + this.optionalComponents.hashCode()) * 31) + this.shootWay.hashCode()) * 31) + this.recordBottomTabConfig.hashCode()) * 31;
        UploadConfig uploadConfig = this.uploadConfig;
        int iHashCode2 = (((iHashCode + (uploadConfig == null ? 0 : uploadConfig.hashCode())) * 31) + C786410Ut5.Z2(this.showPreviewAfterRecord)) * 31;
        CompressConfig compressConfig = this.compressConfig;
        int iHashCode3 = (iHashCode2 + (compressConfig == null ? 0 : compressConfig.hashCode())) * 31;
        String str = this.previousPage;
        return ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.nopeMemory);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecordPageOptionalConfig(exteriorRecordPageType=");
        sbLIZ.append(this.exteriorRecordPageType);
        sbLIZ.append(", toolbarType=");
        sbLIZ.append(this.toolbarType);
        sbLIZ.append(", optionalComponents=");
        sbLIZ.append(this.optionalComponents);
        sbLIZ.append(", shootWay=");
        sbLIZ.append(this.shootWay);
        sbLIZ.append(", recordBottomTabConfig=");
        sbLIZ.append(this.recordBottomTabConfig);
        sbLIZ.append(", uploadConfig=");
        sbLIZ.append(this.uploadConfig);
        sbLIZ.append(", showPreviewAfterRecord=");
        sbLIZ.append(this.showPreviewAfterRecord);
        sbLIZ.append(", compressConfig=");
        sbLIZ.append(this.compressConfig);
        sbLIZ.append(", previousPage=");
        sbLIZ.append(this.previousPage);
        sbLIZ.append(", nopeMemory=");
        sbLIZ.append(this.nopeMemory);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.exteriorRecordPageType);
        parcel.writeStringList(this.toolbarType);
        this.optionalComponents.writeToParcel(parcel, i);
        parcel.writeString(this.shootWay);
        this.recordBottomTabConfig.writeToParcel(parcel, i);
        UploadConfig uploadConfig = this.uploadConfig;
        if (uploadConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uploadConfig.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.showPreviewAfterRecord ? 1 : 0);
        CompressConfig compressConfig = this.compressConfig;
        if (compressConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            compressConfig.writeToParcel(parcel, i);
        }
        parcel.writeString(this.previousPage);
        parcel.writeInt(this.nopeMemory ? 1 : 0);
    }

    public RecordPageOptionalConfig(int i, ArrayList<String> arrayList, OptionalComponents optionalComponents, String str, RecordBottomTabConfig recordBottomTabConfig, UploadConfig uploadConfig, boolean z, CompressConfig compressConfig, String str2, boolean z2) {
        this.exteriorRecordPageType = i;
        this.toolbarType = arrayList;
        this.optionalComponents = optionalComponents;
        this.shootWay = str;
        this.recordBottomTabConfig = recordBottomTabConfig;
        this.uploadConfig = uploadConfig;
        this.showPreviewAfterRecord = z;
        this.compressConfig = compressConfig;
        this.previousPage = str2;
        this.nopeMemory = z2;
    }
}
