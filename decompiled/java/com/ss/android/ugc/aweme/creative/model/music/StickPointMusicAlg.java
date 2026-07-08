package com.ss.android.ugc.aweme.creative.model.music;

import X.C09CT;
import X.C1421080n5G;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.music.StickPointMusicAlg;
import java.io.Serializable;

/* JADX INFO: loaded from: classes23.dex */
public final class StickPointMusicAlg implements Serializable, Parcelable {
    public static int BEATES_FILE_DEFAULT;

    @C09CT("alg_type")
    public int algType = BEATES_FILE_DEFAULT;

    @C09CT("chorus_path")
    public String chorusPath;

    @C09CT("chorus_url")
    public String chorusUrl;

    @C09CT("defaultlocal_path")
    public String defaultLocalPath;

    @C09CT("defaultlocal_url")
    public String defaultLocalUrl;

    @C09CT("downbeats_path")
    public String downBeatsPath;

    @C09CT("downbeats_url")
    public String downBeatsUrl;

    @C09CT("manmodebeats_path")
    public String manModeBeatsPath;

    @C09CT("manmodebeats_url")
    public String manModeBeatsUrl;

    @C09CT("max_seg")
    public int maxSeg;

    @C09CT("min_seg")
    public int minSeg;

    @C09CT("music_id")
    public String musicId;

    @C09CT("music_sync_path")
    public String musicSyncPath;

    @C09CT("music_sync_url")
    public String musicsyncUrl;

    @C09CT("nostrengthbeats_path")
    public String noStrengthBeatsPath;

    @C09CT("nostrengthbeats_url")
    public String noStrengthBeatsUrl;

    @C09CT("vebeats_path")
    public String veBeatsPath;

    @C09CT("vebeats_url")
    public String veBeatsUrl;
    public static final C1421080n5G Companion = new Object() { // from class: X.0n5G
    };
    public static final Parcelable.Creator<StickPointMusicAlg> CREATOR = new Parcelable.Creator<StickPointMusicAlg>() { // from class: X.0nhZ
        @Override // android.os.Parcelable.Creator
        public final StickPointMusicAlg createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new StickPointMusicAlg();
        }

        @Override // android.os.Parcelable.Creator
        public final StickPointMusicAlg[] newArray(int i) {
            return new StickPointMusicAlg[i];
        }
    };
    public static int BEATES_FILE_SERVER_C = 1;
    public static int BEATES_FILE_BEATS_A0 = 2;
    public static int BEATES_FILE_CUSTOM = 3;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }

    public final int getAlgType() {
        return this.algType;
    }

    public final String getChorusPath() {
        return this.chorusPath;
    }

    public final String getChorusUrl() {
        return this.chorusUrl;
    }

    public final String getDefaultLocalPath() {
        return this.defaultLocalPath;
    }

    public final String getDefaultLocalUrl() {
        return this.defaultLocalUrl;
    }

    public final String getDownBeatsPath() {
        return this.downBeatsPath;
    }

    public final String getDownBeatsUrl() {
        return this.downBeatsUrl;
    }

    public final String getManModeBeatsPath() {
        return this.manModeBeatsPath;
    }

    public final String getManModeBeatsUrl() {
        return this.manModeBeatsUrl;
    }

    public final int getMaxSeg() {
        return this.maxSeg;
    }

    public final int getMinSeg() {
        return this.minSeg;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final String getMusicSyncPath() {
        return this.musicSyncPath;
    }

    public final String getMusicsyncUrl() {
        return this.musicsyncUrl;
    }

    public final String getNoStrengthBeatsPath() {
        return this.noStrengthBeatsPath;
    }

    public final String getNoStrengthBeatsUrl() {
        return this.noStrengthBeatsUrl;
    }

    public final String getVeBeatsPath() {
        return this.veBeatsPath;
    }

    public final String getVeBeatsUrl() {
        return this.veBeatsUrl;
    }

    public final void setAlgType(int i) {
        this.algType = i;
    }

    public final void setChorusPath(String str) {
        this.chorusPath = str;
    }

    public final void setChorusUrl(String str) {
        this.chorusUrl = str;
    }

    public final void setDefaultLocalPath(String str) {
        this.defaultLocalPath = str;
    }

    public final void setDefaultLocalUrl(String str) {
        this.defaultLocalUrl = str;
    }

    public final void setDownBeatsPath(String str) {
        this.downBeatsPath = str;
    }

    public final void setDownBeatsUrl(String str) {
        this.downBeatsUrl = str;
    }

    public final void setManModeBeatsPath(String str) {
        this.manModeBeatsPath = str;
    }

    public final void setManModeBeatsUrl(String str) {
        this.manModeBeatsUrl = str;
    }

    public final void setMaxSeg(int i) {
        this.maxSeg = i;
    }

    public final void setMinSeg(int i) {
        this.minSeg = i;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public final void setMusicSyncPath(String str) {
        this.musicSyncPath = str;
    }

    public final void setMusicsyncUrl(String str) {
        this.musicsyncUrl = str;
    }

    public final void setNoStrengthBeatsPath(String str) {
        this.noStrengthBeatsPath = str;
    }

    public final void setNoStrengthBeatsUrl(String str) {
        this.noStrengthBeatsUrl = str;
    }

    public final void setVeBeatsPath(String str) {
        this.veBeatsPath = str;
    }

    public final void setVeBeatsUrl(String str) {
        this.veBeatsUrl = str;
    }
}
