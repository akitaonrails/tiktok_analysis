package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.album.api.config.AlbumNextButtonConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AutoCutStyleNextBtnConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChoosePhotoPreviewPageConfig;

/* JADX INFO: loaded from: classes9.dex */
public final class ChoosePhotoPreviewPageConfig implements Parcelable {
    public AutoCutStyleNextBtnConfig autoCutStyleNextBtnConfig;
    public int chooseSceneMode;
    public boolean enableBottomBarRefactory;
    public boolean enableLivePhotoSwitch;
    public boolean forceHideMediaRecyclerView;
    public boolean hideAutoCutWithShowAutoCutModel;
    public boolean isAIGCAvatar;
    public boolean isAutoCutAnchorMode;
    public boolean isAutoCutSoundSyncMode;
    public boolean isCreatePUGCTemplateFrom;
    public boolean isEditorProReplace;
    public boolean isEnabledLayoutMode;
    public boolean isFromABRoll;
    public boolean isFromAutoCutAgent;
    public boolean isFromAutoPickAddMedia;
    public boolean isFromCutSame;
    public boolean isFromEditorProAnchor;
    public boolean isSoundSync;
    public boolean isUgcTemplate;
    public int maxUseEffectPhotoCount;
    public int minSelectedPhotoCount;
    public AlbumNextButtonConfig nextBtnConfig;
    public boolean nextRuleAdjustment;
    public boolean showAutoCutBtn;
    public boolean showDockInPreviewPage;
    public boolean showEditorProBtn;
    public boolean showUseEffectBtn;
    public boolean stickerMultiPhotosMode;
    public boolean supportRepeatSelect;
    public static final Parcelable.Creator<ChoosePhotoPreviewPageConfig> CREATOR = new Parcelable.Creator<ChoosePhotoPreviewPageConfig>() { // from class: X.0JEb
        @Override // android.os.Parcelable.Creator
        public final ChoosePhotoPreviewPageConfig createFromParcel(Parcel parcel) {
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
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            AutoCutStyleNextBtnConfig autoCutStyleNextBtnConfigCreateFromParcel;
            boolean z18;
            boolean z19;
            boolean z20;
            boolean z21;
            boolean z22;
            boolean z23;
            boolean z24;
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
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
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
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (parcel.readInt() != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (parcel.readInt() != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (parcel.readInt() != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (parcel.readInt() != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (parcel.readInt() != 0) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (parcel.readInt() == 0) {
                autoCutStyleNextBtnConfigCreateFromParcel = null;
            } else {
                autoCutStyleNextBtnConfigCreateFromParcel = AutoCutStyleNextBtnConfig.CREATOR.createFromParcel(parcel);
            }
            AutoCutStyleNextBtnConfig autoCutStyleNextBtnConfig = autoCutStyleNextBtnConfigCreateFromParcel;
            if (parcel.readInt() != 0) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (parcel.readInt() != 0) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (parcel.readInt() != 0) {
                z20 = true;
            } else {
                z20 = false;
            }
            if (parcel.readInt() != 0) {
                z21 = true;
            } else {
                z21 = false;
            }
            AlbumNextButtonConfig albumNextButtonConfig = (AlbumNextButtonConfig) parcel.readParcelable(ChoosePhotoPreviewPageConfig.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z22 = true;
            } else {
                z22 = false;
            }
            if (parcel.readInt() != 0) {
                z23 = true;
            } else {
                z23 = false;
            }
            if (parcel.readInt() != 0) {
                z24 = true;
            } else {
                z24 = false;
            }
            return new ChoosePhotoPreviewPageConfig(z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, i, i2, i3, z16, z17, autoCutStyleNextBtnConfig, z18, z19, z20, z21, albumNextButtonConfig, z22, z23, z24);
        }

        @Override // android.os.Parcelable.Creator
        public final ChoosePhotoPreviewPageConfig[] newArray(int i) {
            return new ChoosePhotoPreviewPageConfig[i];
        }
    };
    public static final int $stable = 8;

    public ChoosePhotoPreviewPageConfig() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.supportRepeatSelect ? 1 : 0);
        parcel.writeInt(this.showDockInPreviewPage ? 1 : 0);
        parcel.writeInt(this.nextRuleAdjustment ? 1 : 0);
        parcel.writeInt(this.isFromCutSame ? 1 : 0);
        parcel.writeInt(this.isSoundSync ? 1 : 0);
        parcel.writeInt(this.isUgcTemplate ? 1 : 0);
        parcel.writeInt(this.isAIGCAvatar ? 1 : 0);
        parcel.writeInt(this.isEditorProReplace ? 1 : 0);
        parcel.writeInt(this.isAutoCutSoundSyncMode ? 1 : 0);
        parcel.writeInt(this.isAutoCutAnchorMode ? 1 : 0);
        parcel.writeInt(this.isFromABRoll ? 1 : 0);
        parcel.writeInt(this.stickerMultiPhotosMode ? 1 : 0);
        parcel.writeInt(this.showAutoCutBtn ? 1 : 0);
        parcel.writeInt(this.showEditorProBtn ? 1 : 0);
        parcel.writeInt(this.showUseEffectBtn ? 1 : 0);
        parcel.writeInt(this.chooseSceneMode);
        parcel.writeInt(this.minSelectedPhotoCount);
        parcel.writeInt(this.maxUseEffectPhotoCount);
        parcel.writeInt(this.hideAutoCutWithShowAutoCutModel ? 1 : 0);
        parcel.writeInt(this.forceHideMediaRecyclerView ? 1 : 0);
        AutoCutStyleNextBtnConfig autoCutStyleNextBtnConfig = this.autoCutStyleNextBtnConfig;
        if (autoCutStyleNextBtnConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            autoCutStyleNextBtnConfig.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isCreatePUGCTemplateFrom ? 1 : 0);
        parcel.writeInt(this.isFromEditorProAnchor ? 1 : 0);
        parcel.writeInt(this.isEnabledLayoutMode ? 1 : 0);
        parcel.writeInt(this.enableLivePhotoSwitch ? 1 : 0);
        parcel.writeParcelable(this.nextBtnConfig, i);
        parcel.writeInt(this.enableBottomBarRefactory ? 1 : 0);
        parcel.writeInt(this.isFromAutoCutAgent ? 1 : 0);
        parcel.writeInt(this.isFromAutoPickAddMedia ? 1 : 0);
    }

    public final boolean LIZ() {
        int i = this.chooseSceneMode;
        return i == 57 || i == 60;
    }

    public final boolean LIZIZ() {
        return this.chooseSceneMode == 68;
    }

    public final boolean LIZJ() {
        return this.chooseSceneMode == 42;
    }

    public /* synthetic */ ChoosePhotoPreviewPageConfig(int i) {
        this(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, -1, 0, 0, false, false, null, false, false, false, false, null, false, false, false);
    }

    public ChoosePhotoPreviewPageConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i, int i2, int i3, boolean z16, boolean z17, AutoCutStyleNextBtnConfig autoCutStyleNextBtnConfig, boolean z18, boolean z19, boolean z20, boolean z21, AlbumNextButtonConfig albumNextButtonConfig, boolean z22, boolean z23, boolean z24) {
        this.supportRepeatSelect = z;
        this.showDockInPreviewPage = z2;
        this.nextRuleAdjustment = z3;
        this.isFromCutSame = z4;
        this.isSoundSync = z5;
        this.isUgcTemplate = z6;
        this.isAIGCAvatar = z7;
        this.isEditorProReplace = z8;
        this.isAutoCutSoundSyncMode = z9;
        this.isAutoCutAnchorMode = z10;
        this.isFromABRoll = z11;
        this.stickerMultiPhotosMode = z12;
        this.showAutoCutBtn = z13;
        this.showEditorProBtn = z14;
        this.showUseEffectBtn = z15;
        this.chooseSceneMode = i;
        this.minSelectedPhotoCount = i2;
        this.maxUseEffectPhotoCount = i3;
        this.hideAutoCutWithShowAutoCutModel = z16;
        this.forceHideMediaRecyclerView = z17;
        this.autoCutStyleNextBtnConfig = autoCutStyleNextBtnConfig;
        this.isCreatePUGCTemplateFrom = z18;
        this.isFromEditorProAnchor = z19;
        this.isEnabledLayoutMode = z20;
        this.enableLivePhotoSwitch = z21;
        this.nextBtnConfig = albumNextButtonConfig;
        this.enableBottomBarRefactory = z22;
        this.isFromAutoCutAgent = z23;
        this.isFromAutoPickAddMedia = z24;
    }
}
