package com.ss.android.ugc.aweme.creative.tangram.dsl.edit;

import X.EnumC568840MSs;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.tangram.dsl.edit.ImportItemModelCompat;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.ugc.aweme.creation.base.ImportItemModel;

/* JADX INFO: loaded from: classes9.dex */
public final class ImportItemModelCompat extends ImportItemModel {
    public static final Parcelable.Creator<ImportItemModelCompat> CREATOR = new Parcelable.Creator<ImportItemModelCompat>() { // from class: X.0MSv
        @Override // android.os.Parcelable.Creator
        public final ImportItemModelCompat createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new ImportItemModelCompat();
        }

        @Override // android.os.Parcelable.Creator
        public final ImportItemModelCompat[] newArray(int i) {
            return new ImportItemModelCompat[i];
        }
    };
    public AIGCInfo aigcInfo;

    public ImportItemModelCompat() {
        super("", EnumC568840MSs.ImportItemType_UNDEFINED, null, null);
    }

    @Override // com.ss.ugc.aweme.creation.base.ImportItemModel, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }

    public final AIGCInfo getAigcInfo() {
        return this.aigcInfo;
    }

    public final void setAigcInfo(AIGCInfo aIGCInfo) {
        this.aigcInfo = aIGCInfo;
    }
}
