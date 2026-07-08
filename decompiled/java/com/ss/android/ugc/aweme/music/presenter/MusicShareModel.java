package com.ss.android.ugc.aweme.music.presenter;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.presenter.MusicShareModel;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicShareModel extends ShareModel {
    public static final Parcelable.Creator<MusicShareModel> CREATOR = new Parcelable.Creator<MusicShareModel>() { // from class: X.0OnD
        @Override // android.os.Parcelable.Creator
        public final MusicShareModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Music music = (Music) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readSerializable());
                }
            }
            return new MusicShareModel(music, arrayList, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MusicShareModel[] newArray(int i) {
            return new MusicShareModel[i];
        }
    };
    public final int artistLabel;
    public final List<Aweme> awemeList;
    public final int behindTheSongVideoType;
    public final Music music;
    public final String pageName;
    public final String previousPage;
    public final String processId;

    @Override // com.ss.android.ugc.aweme.share.base.model.ShareModel, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.music);
        List<Aweme> list = this.awemeList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Aweme> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeSerializable(it2.next());
            }
        }
        parcel.writeString(this.processId);
        parcel.writeString(this.previousPage);
        parcel.writeInt(this.artistLabel);
        parcel.writeInt(this.behindTheSongVideoType);
        parcel.writeString(this.pageName);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MusicShareModel(Music music, List<? extends Aweme> list, String str, String str2, int i, int i2, String str3) {
        super(music);
        this.music = music;
        this.awemeList = list;
        this.processId = str;
        this.previousPage = str2;
        this.artistLabel = i;
        this.behindTheSongVideoType = i2;
        this.pageName = str3;
    }
}
