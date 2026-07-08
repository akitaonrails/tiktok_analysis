package com.ss.android.ugc.aweme.creative.model.draft;

import X.C040H;
import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel;

/* JADX INFO: loaded from: classes23.dex */
public final class DraftInfoModel implements Parcelable {
    public static final Parcelable.Creator<DraftInfoModel> CREATOR = new Parcelable.Creator<DraftInfoModel>() { // from class: X.0nWX
        @Override // android.os.Parcelable.Creator
        public final DraftInfoModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            boolean z9;
            boolean z10;
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
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            long j = parcel.readLong();
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            String string4 = parcel.readString();
            long j2 = parcel.readLong();
            int i3 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            int i4 = parcel.readInt();
            String string5 = parcel.readString();
            long j3 = parcel.readLong();
            String string6 = parcel.readString();
            if (parcel.readInt() != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (parcel.readInt() != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (parcel.readInt() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            long j4 = parcel.readLong();
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            return new DraftInfoModel(z, z2, z3, j, string, z4, string2, string3, i, i2, string4, j2, i3, z5, i4, string5, j3, string6, z6, z7, z8, z9, j4, z10);
        }

        @Override // android.os.Parcelable.Creator
        public final DraftInfoModel[] newArray(int i) {
            return new DraftInfoModel[i];
        }
    };

    @C040H
    public boolean clickNextToPublishPage;

    @C040H
    public boolean deleteAfterPublished;

    @C040H
    public int draftAIGCType;

    @C09CT("draft_aweme_type")
    public int draftAwemeType;

    @C040H
    public long draftDuration;

    @C040H
    public boolean draftFromShoot;

    @C040H
    public int draftId;

    @C040H
    public String draftLandPage;

    @C040H
    public String draftName;

    @C040H
    public long draftSaveTime;

    @C09CT("first_save_draft_scene")
    public String firstSaveDraftScene;

    @C09CT("from_draft_popup")
    public boolean fromDraftPopup;

    @C040H
    public boolean isConvertToNormalDraft;

    @C040H
    public boolean isDirectToPublishByNewExp;

    @C040H
    public boolean isDraft;

    @C040H
    public boolean isPostDraftPrompt;

    @C040H
    public boolean isPublishedDraft;

    @C040H
    public long lastEditTime;

    @C040H
    public String newDraftId;

    @C040H
    public String publishedAwemeId;

    @C040H
    public long publishedTime;

    @C040H
    public boolean saveDraftRoutedToWaveDag;

    @C09CT(Scene.SCENE_SERVICE)
    public String saveDraftScene;

    @C040H
    public int version;

    public DraftInfoModel() {
        this(false, false, false, 0L, "", false, Scene.SCENE_SERVICE, null, -1, 0, "", 0L, 0, false, -1, "", 0L, "", false, true, false, false, 0L, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isDraft ? 1 : 0);
        parcel.writeInt(this.fromDraftPopup ? 1 : 0);
        parcel.writeInt(this.isPublishedDraft ? 1 : 0);
        parcel.writeLong(this.publishedTime);
        parcel.writeString(this.publishedAwemeId);
        parcel.writeInt(this.isConvertToNormalDraft ? 1 : 0);
        parcel.writeString(this.saveDraftScene);
        parcel.writeString(this.firstSaveDraftScene);
        parcel.writeInt(this.draftAwemeType);
        parcel.writeInt(this.draftId);
        parcel.writeString(this.newDraftId);
        parcel.writeLong(this.draftSaveTime);
        parcel.writeInt(this.version);
        parcel.writeInt(this.draftFromShoot ? 1 : 0);
        parcel.writeInt(this.draftAIGCType);
        parcel.writeString(this.draftName);
        parcel.writeLong(this.draftDuration);
        parcel.writeString(this.draftLandPage);
        parcel.writeInt(this.isDirectToPublishByNewExp ? 1 : 0);
        parcel.writeInt(this.clickNextToPublishPage ? 1 : 0);
        parcel.writeInt(this.isPostDraftPrompt ? 1 : 0);
        parcel.writeInt(this.deleteAfterPublished ? 1 : 0);
        parcel.writeLong(this.lastEditTime);
        parcel.writeInt(this.saveDraftRoutedToWaveDag ? 1 : 0);
    }

    public DraftInfoModel(boolean z, boolean z2, boolean z3, long j, String str, boolean z4, String str2, String str3, int i, int i2, String str4, long j2, int i3, boolean z5, int i4, String str5, long j3, String str6, boolean z6, boolean z7, boolean z8, boolean z9, long j4, boolean z10) {
        this.isDraft = z;
        this.fromDraftPopup = z2;
        this.isPublishedDraft = z3;
        this.publishedTime = j;
        this.publishedAwemeId = str;
        this.isConvertToNormalDraft = z4;
        this.saveDraftScene = str2;
        this.firstSaveDraftScene = str3;
        this.draftAwemeType = i;
        this.draftId = i2;
        this.newDraftId = str4;
        this.draftSaveTime = j2;
        this.version = i3;
        this.draftFromShoot = z5;
        this.draftAIGCType = i4;
        this.draftName = str5;
        this.draftDuration = j3;
        this.draftLandPage = str6;
        this.isDirectToPublishByNewExp = z6;
        this.clickNextToPublishPage = z7;
        this.isPostDraftPrompt = z8;
        this.deleteAfterPublished = z9;
        this.lastEditTime = j4;
        this.saveDraftRoutedToWaveDag = z10;
    }
}
