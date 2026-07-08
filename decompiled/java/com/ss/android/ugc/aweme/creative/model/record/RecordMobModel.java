package com.ss.android.ugc.aweme.creative.model.record;

import X.C040H;
import X.C09CT;
import X.EnumC569740MWe;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.record.RecordMobModel;

/* JADX INFO: loaded from: classes23.dex */
public final class RecordMobModel implements Parcelable {
    public static final Parcelable.Creator<RecordMobModel> CREATOR = new Parcelable.Creator<RecordMobModel>() { // from class: X.0nXO
        @Override // android.os.Parcelable.Creator
        public final RecordMobModel createFromParcel(Parcel parcel) {
            return new RecordMobModel(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RecordMobModel[] newArray(int i) {
            return new RecordMobModel[i];
        }
    };

    @C040H
    public long backGroundDuration;

    @C040H
    public long decompressVESoCostTime;

    @C040H
    public long downloadResourceTime;

    @C040H
    public long duetStitchClickTime;

    @C040H
    public long effectDownloadTime;

    @C040H
    public long exitRecordTimeMillis;

    @C040H
    public long firstDrawnTimeMS;

    @C040H
    public long firstMeasureStartTimeMS;

    @C040H
    public String fromMusicId;

    @C040H
    public boolean isAfterDiscard;

    @C040H
    public boolean isColdStart;

    @C09CT("microphone_status")
    public String microphoneStatus;

    @C040H
    public long musicDownloadTime;

    @C040H
    public long onActivityResumeMillis;

    @C040H
    public long preloadVESoCostTime;

    @C040H
    public int preloadVESoStatus;

    @C040H
    public int recordFromTab;

    @C040H
    public int sdkLoadVESoStatus;

    @C040H
    public long startRecordTime;

    @C040H
    public long videoDownloadTime;

    @C040H
    public long waitVESoLoadDuration;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.microphoneStatus);
    }

    public RecordMobModel() {
        this("");
    }

    public RecordMobModel(String str) {
        this.microphoneStatus = str;
        this.fromMusicId = "";
        this.sdkLoadVESoStatus = -1;
        this.preloadVESoCostTime = -1L;
        this.preloadVESoStatus = -1;
        this.decompressVESoCostTime = -10086L;
        this.effectDownloadTime = -1L;
        this.musicDownloadTime = -1L;
        this.videoDownloadTime = -1L;
        this.exitRecordTimeMillis = -1L;
        this.waitVESoLoadDuration = -1L;
        this.onActivityResumeMillis = -1L;
        this.firstMeasureStartTimeMS = -1L;
        this.firstDrawnTimeMS = -1L;
        this.backGroundDuration = -1L;
        this.recordFromTab = EnumC569740MWe.DEFAULT.getTab();
    }
}
