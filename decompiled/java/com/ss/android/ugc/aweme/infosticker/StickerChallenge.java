package com.ss.android.ugc.aweme.infosticker;

import X.C09CT;
import X.C1439750nZN;
import X.C19719512Dh;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class StickerChallenge implements Parcelable, Serializable {
    public static final C1439750nZN CREATOR = new Parcelable.Creator<StickerChallenge>() { // from class: X.0nZN
        @Override // android.os.Parcelable.Creator
        public final StickerChallenge createFromParcel(Parcel parcel) {
            return new StickerChallenge(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final StickerChallenge[] newArray(int i) {
            return new StickerChallenge[i];
        }
    };

    @C09CT(alternate = {"d"}, value = "edit_effect_sticker_challenge_list")
    public List<AVChallenge> editEffectStickerChallengeList;

    @C09CT(alternate = {"c"}, value = "record_sticker_challenge_list")
    public List<AVChallenge> recordStickerChallengeList;

    @C09CT(alternate = {"a"}, value = "sticker_list")
    public List<String> stickerList;

    @C09CT(alternate = {"b"}, value = "sticker_to_challenge")
    public HashMap<String, AVChallenge> stickerToChallenge;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Collection<AVChallenge> infoStickerChallenges() {
        return this.stickerToChallenge.values();
    }

    public StickerChallenge() {
        this.stickerList = new ArrayList();
        this.stickerToChallenge = new HashMap<>();
        this.recordStickerChallengeList = new ArrayList();
        this.editEffectStickerChallengeList = new ArrayList();
    }

    public final List<AVChallenge> getEditEffectStickerChallengeList() {
        return this.editEffectStickerChallengeList;
    }

    public final List<AVChallenge> getRecordStickerChallengeList() {
        return this.recordStickerChallengeList;
    }

    public final List<String> getStickerList() {
        return this.stickerList;
    }

    public final HashMap<String, AVChallenge> getStickerToChallenge() {
        return this.stickerToChallenge;
    }

    public StickerChallenge(Parcel parcel) {
        this();
        parcel.readStringList(this.stickerList);
        this.stickerToChallenge = (HashMap) parcel.readSerializable();
        this.recordStickerChallengeList = C19719512Dh.LIZIZ(parcel.readArrayList(AVChallenge.class.getClassLoader()));
        this.editEffectStickerChallengeList = C19719512Dh.LIZIZ(parcel.readArrayList(AVChallenge.class.getClassLoader()));
    }

    public final void setEditEffectStickerChallengeList(List<AVChallenge> list) {
        this.editEffectStickerChallengeList = list;
    }

    public final void setRecordStickerChallengeList(List<AVChallenge> list) {
        this.recordStickerChallengeList = list;
    }

    public final void setStickerList(List<String> list) {
        this.stickerList = list;
    }

    public final void setStickerToChallenge(HashMap<String, AVChallenge> map) {
        this.stickerToChallenge = map;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.stickerList);
        parcel.writeSerializable(this.stickerToChallenge);
        parcel.writeList(this.recordStickerChallengeList);
        parcel.writeList(this.editEffectStickerChallengeList);
    }
}
