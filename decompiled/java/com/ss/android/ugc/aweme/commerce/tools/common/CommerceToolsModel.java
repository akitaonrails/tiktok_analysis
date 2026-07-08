package com.ss.android.ugc.aweme.commerce.tools.common;

import X.C040H;
import X.C09CT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.commerce.tools.common.CommerceToolsModel;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.commerce.tools.music.context.CommerceToolsMusicContext;
import com.ss.android.ugc.aweme.commerce.tools.music.model.CommerceToolsMusicModel;
import com.ss.android.ugc.aweme.commerce.tools.sticker.CommerceToolsStickerContext;
import com.ss.android.ugc.aweme.commerce.tools.sticker.IBEContext;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class CommerceToolsModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<CommerceToolsModel> CREATOR = new Parcelable.Creator<CommerceToolsModel>() { // from class: X.0nk4
        @Override // android.os.Parcelable.Creator
        public final CommerceToolsModel createFromParcel(Parcel parcel) {
            Mission missionCreateFromParcel;
            boolean z;
            CommerceToolsTcmModel commerceToolsTcmModelCreateFromParcel = CommerceToolsTcmModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                missionCreateFromParcel = null;
            } else {
                missionCreateFromParcel = Mission.CREATOR.createFromParcel(parcel);
            }
            Mission mission = missionCreateFromParcel;
            String string = parcel.readString();
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            return new CommerceToolsModel(commerceToolsTcmModelCreateFromParcel, mission, string, z, z2, (AVChallenge) parcel.readParcelable(CommerceToolsModel.class.getClassLoader()), parcel.readInt(), CommerceToolsStickerContext.CREATOR.createFromParcel(parcel), CommerceToolsMusicModel.CREATOR.createFromParcel(parcel), CommerceToolsMusicContext.CREATOR.createFromParcel(parcel), IBEContext.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CommerceToolsModel[] newArray(int i) {
            return new CommerceToolsModel[i];
        }
    };

    @C09CT("commerce_traffic_type")
    public String commerceTrafficType;

    @C09CT("ibe_context")
    public IBEContext ibeContext;

    @C09CT("is_showed_commerce_transform_bottom_button")
    public boolean isShowedCommerceTransformBottomButton;

    @C09CT("is_showed_commerce_transform_button")
    public boolean isShowedCommerceTransformButton;

    @C09CT("mission")
    public Mission mission;

    @C040H
    public final CommerceToolsMusicContext musicContext;

    @C09CT("music_model")
    public final CommerceToolsMusicModel musicModel;

    @C09CT("music_usage_confirmation")
    public int musicUsageConfirmation;

    @C09CT("record_challenge")
    public AVChallenge recordChallenge;

    @C09CT("sticker_context")
    public CommerceToolsStickerContext stickerContext;

    @C09CT("tcm_publish_model")
    public CommerceToolsTcmModel tcmModel;

    public CommerceToolsModel() {
        this(new CommerceToolsTcmModel(false, null, null, null, null, null, CardStruct.IStatusCode.DEFAULT, null, 0, false, false, false, null, 0, false), null, null, false, false, null, 0, new CommerceToolsStickerContext(), new CommerceToolsMusicModel(), new CommerceToolsMusicContext(), new IBEContext());
    }

    public final CommerceToolsModel copy(CommerceToolsTcmModel commerceToolsTcmModel, Mission mission, String str, boolean z, boolean z2, AVChallenge aVChallenge, int i, CommerceToolsStickerContext commerceToolsStickerContext, CommerceToolsMusicModel commerceToolsMusicModel, CommerceToolsMusicContext commerceToolsMusicContext, IBEContext iBEContext) {
        return new CommerceToolsModel(commerceToolsTcmModel, mission, str, z, z2, aVChallenge, i, commerceToolsStickerContext, commerceToolsMusicModel, commerceToolsMusicContext, iBEContext);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommerceToolsModel)) {
            return false;
        }
        CommerceToolsModel commerceToolsModel = (CommerceToolsModel) obj;
        return Intrinsics.LJFF(this.tcmModel, commerceToolsModel.tcmModel) && Intrinsics.LJFF(this.mission, commerceToolsModel.mission) && Intrinsics.LJFF(this.commerceTrafficType, commerceToolsModel.commerceTrafficType) && this.isShowedCommerceTransformButton == commerceToolsModel.isShowedCommerceTransformButton && this.isShowedCommerceTransformBottomButton == commerceToolsModel.isShowedCommerceTransformBottomButton && Intrinsics.LJFF(this.recordChallenge, commerceToolsModel.recordChallenge) && this.musicUsageConfirmation == commerceToolsModel.musicUsageConfirmation && Intrinsics.LJFF(this.stickerContext, commerceToolsModel.stickerContext) && Intrinsics.LJFF(this.musicModel, commerceToolsModel.musicModel) && Intrinsics.LJFF(this.musicContext, commerceToolsModel.musicContext) && Intrinsics.LJFF(this.ibeContext, commerceToolsModel.ibeContext);
    }

    public int hashCode() {
        int iHashCode = this.tcmModel.hashCode() * 31;
        Mission mission = this.mission;
        int iHashCode2 = (iHashCode + (mission == null ? 0 : mission.hashCode())) * 31;
        String str = this.commerceTrafficType;
        int iHashCode3 = (((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.isShowedCommerceTransformButton)) * 31) + C786410Ut5.Z2(this.isShowedCommerceTransformBottomButton)) * 31;
        AVChallenge aVChallenge = this.recordChallenge;
        return ((((((((((iHashCode3 + (aVChallenge != null ? aVChallenge.hashCode() : 0)) * 31) + this.musicUsageConfirmation) * 31) + this.stickerContext.hashCode()) * 31) + this.musicModel.hashCode()) * 31) + this.musicContext.hashCode()) * 31) + this.ibeContext.hashCode();
    }

    public String toString() {
        return "CommerceToolsModel(tcmModel=" + this.tcmModel + ", mission=" + this.mission + ", commerceTrafficType=" + this.commerceTrafficType + ", isShowedCommerceTransformButton=" + this.isShowedCommerceTransformButton + ", isShowedCommerceTransformBottomButton=" + this.isShowedCommerceTransformBottomButton + ", recordChallenge=" + this.recordChallenge + ", musicUsageConfirmation=" + this.musicUsageConfirmation + ", stickerContext=" + this.stickerContext + ", musicModel=" + this.musicModel + ", musicContext=" + this.musicContext + ", ibeContext=" + this.ibeContext + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.tcmModel.writeToParcel(parcel, i);
        Mission mission = this.mission;
        if (mission == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mission.writeToParcel(parcel, i);
        }
        parcel.writeString(this.commerceTrafficType);
        parcel.writeInt(this.isShowedCommerceTransformButton ? 1 : 0);
        parcel.writeInt(this.isShowedCommerceTransformBottomButton ? 1 : 0);
        parcel.writeParcelable(this.recordChallenge, i);
        parcel.writeInt(this.musicUsageConfirmation);
        this.stickerContext.writeToParcel(parcel, i);
        this.musicModel.writeToParcel(parcel, i);
        this.musicContext.writeToParcel(parcel, i);
        this.ibeContext.writeToParcel(parcel, i);
    }

    public final String getCommerceTrafficType() {
        return this.commerceTrafficType;
    }

    public final IBEContext getIbeContext() {
        return this.ibeContext;
    }

    public final Mission getMission() {
        return this.mission;
    }

    public final CommerceToolsMusicContext getMusicContext() {
        return this.musicContext;
    }

    public final CommerceToolsMusicModel getMusicModel() {
        return this.musicModel;
    }

    public final int getMusicUsageConfirmation() {
        return this.musicUsageConfirmation;
    }

    public final AVChallenge getRecordChallenge() {
        return this.recordChallenge;
    }

    public final CommerceToolsStickerContext getStickerContext() {
        return this.stickerContext;
    }

    public final CommerceToolsTcmModel getTcmModel() {
        return this.tcmModel;
    }

    public final boolean isShowedCommerceTransformBottomButton() {
        return this.isShowedCommerceTransformBottomButton;
    }

    public final boolean isShowedCommerceTransformButton() {
        return this.isShowedCommerceTransformButton;
    }

    public final void setCommerceTrafficType(String str) {
        this.commerceTrafficType = str;
    }

    public final void setIbeContext(IBEContext iBEContext) {
        this.ibeContext = iBEContext;
    }

    public final void setMission(Mission mission) {
        this.mission = mission;
    }

    public final void setMusicUsageConfirmation(int i) {
        this.musicUsageConfirmation = i;
    }

    public final void setRecordChallenge(AVChallenge aVChallenge) {
        this.recordChallenge = aVChallenge;
    }

    public final void setShowedCommerceTransformBottomButton(boolean z) {
        this.isShowedCommerceTransformBottomButton = z;
    }

    public final void setShowedCommerceTransformButton(boolean z) {
        this.isShowedCommerceTransformButton = z;
    }

    public final void setStickerContext(CommerceToolsStickerContext commerceToolsStickerContext) {
        this.stickerContext = commerceToolsStickerContext;
    }

    public final void setTcmModel(CommerceToolsTcmModel commerceToolsTcmModel) {
        this.tcmModel = commerceToolsTcmModel;
    }

    public CommerceToolsModel(CommerceToolsTcmModel commerceToolsTcmModel, Mission mission, String str, boolean z, boolean z2, AVChallenge aVChallenge, int i, CommerceToolsStickerContext commerceToolsStickerContext, CommerceToolsMusicModel commerceToolsMusicModel, CommerceToolsMusicContext commerceToolsMusicContext, IBEContext iBEContext) {
        this.tcmModel = commerceToolsTcmModel;
        this.mission = mission;
        this.commerceTrafficType = str;
        this.isShowedCommerceTransformButton = z;
        this.isShowedCommerceTransformBottomButton = z2;
        this.recordChallenge = aVChallenge;
        this.musicUsageConfirmation = i;
        this.stickerContext = commerceToolsStickerContext;
        this.musicModel = commerceToolsMusicModel;
        this.musicContext = commerceToolsMusicContext;
        this.ibeContext = iBEContext;
    }
}
