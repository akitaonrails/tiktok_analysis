package com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.share;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.ImageData;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.share.SearchImageShareModel;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchImageShareModel extends ShareModel {
    public final String feedbackType;
    public final boolean hideDownloadAction;
    public final ImageData imageData;
    public final Map<String, String> mobParams;
    public static final Parcelable.Creator<SearchImageShareModel> CREATOR = new Parcelable.Creator<SearchImageShareModel>() { // from class: X.0QC9
        @Override // android.os.Parcelable.Creator
        public final SearchImageShareModel createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            ImageData imageData = (ImageData) parcel.readSerializable();
            boolean z = false;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new SearchImageShareModel(imageData, linkedHashMap, string, z);
        }

        @Override // android.os.Parcelable.Creator
        public final SearchImageShareModel[] newArray(int i) {
            return new SearchImageShareModel[i];
        }
    };
    public static final int $stable = 8;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchImageShareModel)) {
            return false;
        }
        SearchImageShareModel searchImageShareModel = (SearchImageShareModel) obj;
        return Intrinsics.LJFF(this.imageData, searchImageShareModel.imageData) && Intrinsics.LJFF(this.mobParams, searchImageShareModel.mobParams) && Intrinsics.LJFF(this.feedbackType, searchImageShareModel.feedbackType) && this.hideDownloadAction == searchImageShareModel.hideDownloadAction;
    }

    public final int hashCode() {
        int iHashCode = this.imageData.hashCode() * 31;
        Map<String, String> map = this.mobParams;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.feedbackType;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.hideDownloadAction);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchImageShareModel(imageData=");
        sbLIZ.append(this.imageData);
        sbLIZ.append(", mobParams=");
        sbLIZ.append(this.mobParams);
        sbLIZ.append(", feedbackType=");
        sbLIZ.append(this.feedbackType);
        sbLIZ.append(", hideDownloadAction=");
        sbLIZ.append(this.hideDownloadAction);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.ShareModel, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.imageData);
        Map<String, String> map = this.mobParams;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        parcel.writeString(this.feedbackType);
        parcel.writeInt(this.hideDownloadAction ? 1 : 0);
    }

    public SearchImageShareModel(ImageData imageData, Map<String, String> map, String str, boolean z) {
        super(imageData);
        this.imageData = imageData;
        this.mobParams = map;
        this.feedbackType = str;
        this.hideDownloadAction = z;
    }
}
