package com.ss.android.ugc.aweme.creative.model.publish;

import X.C040H;
import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1405070mfR;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.publish.MainTrackMediaInfo;
import com.ss.android.ugc.aweme.creative.model.publish.PublishMobParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class PublishMobParams implements Parcelable {
    public static final Parcelable.Creator<PublishMobParams> CREATOR = new Parcelable.Creator<PublishMobParams>() { // from class: X.0mfC
        @Override // android.os.Parcelable.Creator
        public final PublishMobParams createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            double d = parcel.readDouble();
            int i6 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i6);
            for (int i7 = 0; i7 != i6; i7++) {
                arrayList.add(MainTrackMediaInfo.CREATOR.createFromParcel(parcel));
            }
            return new PublishMobParams(i, i2, i3, i4, i5, d, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PublishMobParams[] newArray(int i) {
            return new PublishMobParams[i];
        }
    };

    @C040H
    public int checkFileBeforeCompile;

    @C040H
    public int checkFileBeforeEdit;

    @C040H
    public int checkFileBeforePublish;

    @C09CT("main_track_media_info_map_list")
    public List<MainTrackMediaInfo> mainTrackMediaInfoMapList;

    @C040H
    public int postPagePreloadFriendsType;

    @C040H
    public double postPagePreloadPredictValue;

    @C09CT("publish_cnt")
    public int publishCnt;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublishMobParams)) {
            return false;
        }
        PublishMobParams publishMobParams = (PublishMobParams) obj;
        return this.publishCnt == publishMobParams.publishCnt && this.checkFileBeforeEdit == publishMobParams.checkFileBeforeEdit && this.checkFileBeforePublish == publishMobParams.checkFileBeforePublish && this.checkFileBeforeCompile == publishMobParams.checkFileBeforeCompile && this.postPagePreloadFriendsType == publishMobParams.postPagePreloadFriendsType && Double.compare(this.postPagePreloadPredictValue, publishMobParams.postPagePreloadPredictValue) == 0 && Intrinsics.LJFF(this.mainTrackMediaInfoMapList, publishMobParams.mainTrackMediaInfoMapList);
    }

    public final int hashCode() {
        return (((((((((((this.publishCnt * 31) + this.checkFileBeforeEdit) * 31) + this.checkFileBeforePublish) * 31) + this.checkFileBeforeCompile) * 31) + this.postPagePreloadFriendsType) * 31) + C786410Ut5.X2(this.postPagePreloadPredictValue)) * 31) + this.mainTrackMediaInfoMapList.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishMobParams(publishCnt=");
        sbLIZ.append(this.publishCnt);
        sbLIZ.append(", checkFileBeforeEdit=");
        sbLIZ.append(this.checkFileBeforeEdit);
        sbLIZ.append(", checkFileBeforePublish=");
        sbLIZ.append(this.checkFileBeforePublish);
        sbLIZ.append(", checkFileBeforeCompile=");
        sbLIZ.append(this.checkFileBeforeCompile);
        sbLIZ.append(", postPagePreloadFriendsType=");
        sbLIZ.append(this.postPagePreloadFriendsType);
        sbLIZ.append(", postPagePreloadPredictValue=");
        sbLIZ.append(this.postPagePreloadPredictValue);
        sbLIZ.append(", mainTrackMediaInfoMapList=");
        sbLIZ.append(this.mainTrackMediaInfoMapList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.publishCnt);
        parcel.writeInt(this.checkFileBeforeEdit);
        parcel.writeInt(this.checkFileBeforePublish);
        parcel.writeInt(this.checkFileBeforeCompile);
        parcel.writeInt(this.postPagePreloadFriendsType);
        parcel.writeDouble(this.postPagePreloadPredictValue);
        List<MainTrackMediaInfo> list = this.mainTrackMediaInfoMapList;
        parcel.writeInt(list.size());
        Iterator<MainTrackMediaInfo> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public PublishMobParams() {
        this(0, -2, -2, -2, EnumC1405070mfR.NONE.getValue(), 0.0d, new ArrayList());
    }

    public PublishMobParams(int i, int i2, int i3, int i4, int i5, double d, List<MainTrackMediaInfo> list) {
        this.publishCnt = i;
        this.checkFileBeforeEdit = i2;
        this.checkFileBeforePublish = i3;
        this.checkFileBeforeCompile = i4;
        this.postPagePreloadFriendsType = i5;
        this.postPagePreloadPredictValue = d;
        this.mainTrackMediaInfoMapList = list;
    }
}
