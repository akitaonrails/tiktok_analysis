package com.ss.android.ugc.aweme.creative.model.audio;

import X.C040H;
import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.audio.MatchDetail;
import com.ss.android.ugc.aweme.creative.model.audio.MatchDetailsV1;
import com.ss.android.ugc.aweme.creative.model.audio.MusicInfo;
import com.ss.android.ugc.aweme.creative.model.audio.PreCheckResultModel;
import com.ss.android.ugc.aweme.creative.model.audio.UnavailableReason;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes15.dex */
public final class PreCheckResultModel implements Parcelable {
    public static final Parcelable.Creator<PreCheckResultModel> CREATOR = new Parcelable.Creator<PreCheckResultModel>() { // from class: X.0XkA
        @Override // android.os.Parcelable.Creator
        public final PreCheckResultModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            boolean z;
            boolean z2;
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(MusicInfo.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(MatchDetail.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i5 = parcel.readInt();
                arrayList3 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList3.add(MatchDetailsV1.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i7 = parcel.readInt();
                arrayList4 = new ArrayList(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    arrayList4.add(UnavailableReason.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new PreCheckResultModel(arrayList, arrayList2, arrayList3, arrayList4, numValueOf, string, z, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final PreCheckResultModel[] newArray(int i) {
            return new PreCheckResultModel[i];
        }
    };

    @C040H
    public boolean detectPass;

    @C040H
    public boolean hasShowResult;

    @C040H
    @C09CT("match_details")
    public final ArrayList<MatchDetail> matchDetails;

    @C040H
    @C09CT("match_details_v1")
    public final ArrayList<MatchDetailsV1> matchDetailsV1;

    @C040H
    @C09CT("music_infos")
    public final ArrayList<MusicInfo> musicInfos;

    @C040H
    @C09CT("pre_check_id")
    public final String preCheckId;

    @C040H
    @C09CT("unavailable_reasons")
    public final ArrayList<UnavailableReason> unavailableReasons;

    @C040H
    @C09CT("un_availed_reason")
    public final Integer unavailableReasonsV1;

    public PreCheckResultModel() {
        this(null, null, null, null, 0, "", false, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ArrayList<MusicInfo> arrayList = this.musicInfos;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<MusicInfo> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        ArrayList<MatchDetail> arrayList2 = this.matchDetails;
        if (arrayList2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList2.size());
            Iterator<MatchDetail> it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        ArrayList<MatchDetailsV1> arrayList3 = this.matchDetailsV1;
        if (arrayList3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList3.size());
            Iterator<MatchDetailsV1> it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(parcel, i);
            }
        }
        ArrayList<UnavailableReason> arrayList4 = this.unavailableReasons;
        if (arrayList4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList4.size());
            Iterator<UnavailableReason> it5 = arrayList4.iterator();
            while (it5.hasNext()) {
                it5.next().writeToParcel(parcel, i);
            }
        }
        Integer num = this.unavailableReasonsV1;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.preCheckId);
        parcel.writeInt(this.hasShowResult ? 1 : 0);
        parcel.writeInt(this.detectPass ? 1 : 0);
    }

    public PreCheckResultModel(ArrayList<MusicInfo> arrayList, ArrayList<MatchDetail> arrayList2, ArrayList<MatchDetailsV1> arrayList3, ArrayList<UnavailableReason> arrayList4, Integer num, String str, boolean z, boolean z2) {
        this.musicInfos = arrayList;
        this.matchDetails = arrayList2;
        this.matchDetailsV1 = arrayList3;
        this.unavailableReasons = arrayList4;
        this.unavailableReasonsV1 = num;
        this.preCheckId = str;
        this.hasShowResult = z;
        this.detectPass = z2;
    }
}
