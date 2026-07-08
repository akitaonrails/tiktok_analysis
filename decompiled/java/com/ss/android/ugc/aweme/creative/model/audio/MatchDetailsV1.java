package com.ss.android.ugc.aweme.creative.model.audio;

import X.C040H;
import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.audio.MatchDetailsV1;
import com.ss.android.ugc.aweme.creative.model.audio.MatchPeriod;
import com.ss.android.ugc.aweme.creative.model.audio.SongInfo;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes15.dex */
public final class MatchDetailsV1 implements Parcelable {
    public static final Parcelable.Creator<MatchDetailsV1> CREATOR = new Parcelable.Creator<MatchDetailsV1>() { // from class: X.0ZBi
        @Override // android.os.Parcelable.Creator
        public final MatchDetailsV1 createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            long j = parcel.readLong();
            SongInfo songInfoCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(MatchPeriod.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                songInfoCreateFromParcel = SongInfo.CREATOR.createFromParcel(parcel);
            }
            return new MatchDetailsV1(j, arrayList, songInfoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MatchDetailsV1[] newArray(int i) {
            return new MatchDetailsV1[i];
        }
    };

    @C040H
    @C09CT("match_periods")
    public final ArrayList<MatchPeriod> matchPeriods;

    @C040H
    @C09CT("match_song_info")
    public final SongInfo matchSongInfo;

    @C040H
    @C09CT("matched_meta_song_id")
    public final long matchedMetaSongId;

    public MatchDetailsV1() {
        this(0L, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.matchedMetaSongId);
        ArrayList<MatchPeriod> arrayList = this.matchPeriods;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<MatchPeriod> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        SongInfo songInfo = this.matchSongInfo;
        if (songInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            songInfo.writeToParcel(parcel, i);
        }
    }

    public MatchDetailsV1(long j, ArrayList<MatchPeriod> arrayList, SongInfo songInfo) {
        this.matchedMetaSongId = j;
        this.matchPeriods = arrayList;
        this.matchSongInfo = songInfo;
    }
}
