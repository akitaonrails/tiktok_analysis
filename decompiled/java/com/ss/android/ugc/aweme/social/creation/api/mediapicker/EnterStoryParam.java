package com.ss.android.ugc.aweme.social.creation.api.mediapicker;

import X.C786410Ut5;
import X.EnumC563750M9d;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.StoryUploadPageEntranceType;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.search.CreationSearchModel;
import com.ss.android.ugc.aweme.secretreplies.model.SecretRepliesRecordParam;
import com.ss.android.ugc.aweme.services.story.IAlbumParam;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocialMediaPickerConfig;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class EnterStoryParam implements IAlbumParam, Parcelable, Serializable {
    public final EnumC563750M9d afterPublishLandingMode;
    public final SecretRepliesRecordParam baseSecretReplyData;
    public final String creationId;
    public final CreationSearchModel creationSearchModel;
    public final boolean enableSwipeUpExit;
    public final String enterFrom;
    public final String enterMethod;
    public final StoryUploadPageEntranceType entranceType;
    public final String fromGroupId;
    public final Function0<Boolean> interceptorWhenFailEnterStoryAlbum;
    public final boolean isFromSocialCameraEntrance;
    public final boolean isStoryEnhancedEntrance;
    public final boolean isSubOnlyStory;
    public final boolean isUploadDirectEnter;
    public final transient MusicBuzModel preselectedMusic;
    public final String requestId;
    public final float sharedElementRoundedMaskInitialY;
    public final int sharedElementTransitionMode;
    public final String shootEnterFrom;
    public final String shootEnterMethod;
    public final ShootExtraData shootExtraData;
    public final String shootWay;
    public final SocialMediaPickerConfig socAlbumConfig;
    public final String storyArchiveTabName;
    public final String storyShootEnterPosition;
    public final int storyTransType;
    public static final Parcelable.Creator<EnterStoryParam> CREATOR = new Parcelable.Creator<EnterStoryParam>() { // from class: X.0M9c
        @Override // android.os.Parcelable.Creator
        public final EnterStoryParam createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            SocialMediaPickerConfig socialMediaPickerConfigCreateFromParcel;
            boolean z4;
            boolean z5;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            ShootExtraData shootExtraData = (ShootExtraData) parcel.readParcelable(EnterStoryParam.class.getClassLoader());
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
            int i = parcel.readInt();
            float f = parcel.readFloat();
            int i2 = parcel.readInt();
            Function0 function0 = (Function0) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                socialMediaPickerConfigCreateFromParcel = null;
            } else {
                socialMediaPickerConfigCreateFromParcel = SocialMediaPickerConfig.CREATOR.createFromParcel(parcel);
            }
            SocialMediaPickerConfig socialMediaPickerConfig = socialMediaPickerConfigCreateFromParcel;
            CreationSearchModel creationSearchModel = (CreationSearchModel) parcel.readParcelable(EnterStoryParam.class.getClassLoader());
            String string9 = parcel.readString();
            SecretRepliesRecordParam secretRepliesRecordParam = (SecretRepliesRecordParam) parcel.readParcelable(EnterStoryParam.class.getClassLoader());
            StoryUploadPageEntranceType storyUploadPageEntranceType = (StoryUploadPageEntranceType) parcel.readParcelable(EnterStoryParam.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            String string10 = parcel.readString();
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            return new EnterStoryParam(string, string2, string3, string4, string5, string6, string7, string8, shootExtraData, z, z2, z3, i, f, i2, function0, socialMediaPickerConfig, creationSearchModel, string9, secretRepliesRecordParam, storyUploadPageEntranceType, z4, string10, z5, EnumC563750M9d.valueOf(parcel.readString()), (MusicBuzModel) parcel.readParcelable(EnterStoryParam.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final EnterStoryParam[] newArray(int i) {
            return new EnterStoryParam[i];
        }
    };
    public static final int $stable = 8;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public EnterStoryParam() {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        Object[] objArr16 = 0 == true ? 1 : 0;
        Object[] objArr17 = 0 == true ? 1 : 0;
        Object[] objArr18 = 0 == true ? 1 : 0;
        this(null, objArr, objArr2, objArr3, objArr4, objArr5, objArr6, objArr7, objArr8, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0.0f, 0 == true ? 1 : 0, objArr9, objArr10, objArr11, objArr12, objArr13, objArr14, 0 == true ? 1 : 0, objArr15, 0 == true ? 1 : 0, objArr16, objArr17, 67108863, objArr18);
    }

    public final EnterStoryParam copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ShootExtraData shootExtraData, boolean z, boolean z2, boolean z3, int i, float f, int i2, Function0<Boolean> function0, SocialMediaPickerConfig socialMediaPickerConfig, CreationSearchModel creationSearchModel, String str9, SecretRepliesRecordParam secretRepliesRecordParam, StoryUploadPageEntranceType storyUploadPageEntranceType, boolean z4, String str10, boolean z5, EnumC563750M9d enumC563750M9d, MusicBuzModel musicBuzModel) {
        return new EnterStoryParam(str, str2, str3, str4, str5, str6, str7, str8, shootExtraData, z, z2, z3, i, f, i2, function0, socialMediaPickerConfig, creationSearchModel, str9, secretRepliesRecordParam, storyUploadPageEntranceType, z4, str10, z5, enumC563750M9d, musicBuzModel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterStoryParam)) {
            return false;
        }
        EnterStoryParam enterStoryParam = (EnterStoryParam) obj;
        return Intrinsics.LJFF(this.shootWay, enterStoryParam.shootWay) && Intrinsics.LJFF(this.enterMethod, enterStoryParam.enterMethod) && Intrinsics.LJFF(this.enterFrom, enterStoryParam.enterFrom) && Intrinsics.LJFF(this.creationId, enterStoryParam.creationId) && Intrinsics.LJFF(this.fromGroupId, enterStoryParam.fromGroupId) && Intrinsics.LJFF(this.shootEnterFrom, enterStoryParam.shootEnterFrom) && Intrinsics.LJFF(this.shootEnterMethod, enterStoryParam.shootEnterMethod) && Intrinsics.LJFF(this.storyShootEnterPosition, enterStoryParam.storyShootEnterPosition) && Intrinsics.LJFF(this.shootExtraData, enterStoryParam.shootExtraData) && this.isUploadDirectEnter == enterStoryParam.isUploadDirectEnter && this.isStoryEnhancedEntrance == enterStoryParam.isStoryEnhancedEntrance && this.enableSwipeUpExit == enterStoryParam.enableSwipeUpExit && this.sharedElementTransitionMode == enterStoryParam.sharedElementTransitionMode && Float.compare(this.sharedElementRoundedMaskInitialY, enterStoryParam.sharedElementRoundedMaskInitialY) == 0 && this.storyTransType == enterStoryParam.storyTransType && Intrinsics.LJFF(this.interceptorWhenFailEnterStoryAlbum, enterStoryParam.interceptorWhenFailEnterStoryAlbum) && Intrinsics.LJFF(this.socAlbumConfig, enterStoryParam.socAlbumConfig) && Intrinsics.LJFF(this.creationSearchModel, enterStoryParam.creationSearchModel) && Intrinsics.LJFF(this.requestId, enterStoryParam.requestId) && Intrinsics.LJFF(this.baseSecretReplyData, enterStoryParam.baseSecretReplyData) && this.entranceType == enterStoryParam.entranceType && this.isFromSocialCameraEntrance == enterStoryParam.isFromSocialCameraEntrance && Intrinsics.LJFF(this.storyArchiveTabName, enterStoryParam.storyArchiveTabName) && this.isSubOnlyStory == enterStoryParam.isSubOnlyStory && this.afterPublishLandingMode == enterStoryParam.afterPublishLandingMode && Intrinsics.LJFF(this.preselectedMusic, enterStoryParam.preselectedMusic);
    }

    public String toString() {
        return "EnterStoryParam(shootWay=" + this.shootWay + ", enterMethod=" + this.enterMethod + ", enterFrom=" + this.enterFrom + ", creationId=" + this.creationId + ", fromGroupId=" + this.fromGroupId + ", shootEnterFrom=" + this.shootEnterFrom + ", shootEnterMethod=" + this.shootEnterMethod + ", storyShootEnterPosition=" + this.storyShootEnterPosition + ", shootExtraData=" + this.shootExtraData + ", isUploadDirectEnter=" + this.isUploadDirectEnter + ", isStoryEnhancedEntrance=" + this.isStoryEnhancedEntrance + ", enableSwipeUpExit=" + this.enableSwipeUpExit + ", sharedElementTransitionMode=" + this.sharedElementTransitionMode + ", sharedElementRoundedMaskInitialY=" + this.sharedElementRoundedMaskInitialY + ", storyTransType=" + this.storyTransType + ", interceptorWhenFailEnterStoryAlbum=" + this.interceptorWhenFailEnterStoryAlbum + ", socAlbumConfig=" + this.socAlbumConfig + ", creationSearchModel=" + this.creationSearchModel + ", requestId=" + this.requestId + ", baseSecretReplyData=" + this.baseSecretReplyData + ", entranceType=" + this.entranceType + ", isFromSocialCameraEntrance=" + this.isFromSocialCameraEntrance + ", storyArchiveTabName=" + this.storyArchiveTabName + ", isSubOnlyStory=" + this.isSubOnlyStory + ", afterPublishLandingMode=" + this.afterPublishLandingMode + ", preselectedMusic=" + this.preselectedMusic + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.shootWay);
        parcel.writeString(this.enterMethod);
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.creationId);
        parcel.writeString(this.fromGroupId);
        parcel.writeString(this.shootEnterFrom);
        parcel.writeString(this.shootEnterMethod);
        parcel.writeString(this.storyShootEnterPosition);
        parcel.writeParcelable(this.shootExtraData, i);
        parcel.writeInt(this.isUploadDirectEnter ? 1 : 0);
        parcel.writeInt(this.isStoryEnhancedEntrance ? 1 : 0);
        parcel.writeInt(this.enableSwipeUpExit ? 1 : 0);
        parcel.writeInt(this.sharedElementTransitionMode);
        parcel.writeFloat(this.sharedElementRoundedMaskInitialY);
        parcel.writeInt(this.storyTransType);
        parcel.writeSerializable((Serializable) this.interceptorWhenFailEnterStoryAlbum);
        SocialMediaPickerConfig socialMediaPickerConfig = this.socAlbumConfig;
        if (socialMediaPickerConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            socialMediaPickerConfig.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.creationSearchModel, i);
        parcel.writeString(this.requestId);
        parcel.writeParcelable(this.baseSecretReplyData, i);
        parcel.writeParcelable(this.entranceType, i);
        parcel.writeInt(this.isFromSocialCameraEntrance ? 1 : 0);
        parcel.writeString(this.storyArchiveTabName);
        parcel.writeInt(this.isSubOnlyStory ? 1 : 0);
        parcel.writeString(this.afterPublishLandingMode.name());
        parcel.writeParcelable(this.preselectedMusic, i);
    }

    public int hashCode() {
        int iHashCode = ((((this.shootWay.hashCode() * 31) + this.enterMethod.hashCode()) * 31) + this.enterFrom.hashCode()) * 31;
        String str = this.creationId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fromGroupId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shootEnterFrom;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.shootEnterMethod;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.storyShootEnterPosition;
        int iHashCode6 = (((((((((((((((((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.shootExtraData.hashCode()) * 31) + C786410Ut5.Z2(this.isUploadDirectEnter)) * 31) + C786410Ut5.Z2(this.isStoryEnhancedEntrance)) * 31) + C786410Ut5.Z2(this.enableSwipeUpExit)) * 31) + this.sharedElementTransitionMode) * 31) + Float.floatToIntBits(this.sharedElementRoundedMaskInitialY)) * 31) + this.storyTransType) * 31) + this.interceptorWhenFailEnterStoryAlbum.hashCode()) * 31;
        SocialMediaPickerConfig socialMediaPickerConfig = this.socAlbumConfig;
        int iHashCode7 = (iHashCode6 + (socialMediaPickerConfig == null ? 0 : socialMediaPickerConfig.hashCode())) * 31;
        CreationSearchModel creationSearchModel = this.creationSearchModel;
        int iHashCode8 = (iHashCode7 + (creationSearchModel == null ? 0 : creationSearchModel.hashCode())) * 31;
        String str6 = this.requestId;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        SecretRepliesRecordParam secretRepliesRecordParam = this.baseSecretReplyData;
        int iHashCode10 = (iHashCode9 + (secretRepliesRecordParam == null ? 0 : secretRepliesRecordParam.hashCode())) * 31;
        StoryUploadPageEntranceType storyUploadPageEntranceType = this.entranceType;
        int iHashCode11 = (((iHashCode10 + (storyUploadPageEntranceType == null ? 0 : storyUploadPageEntranceType.hashCode())) * 31) + C786410Ut5.Z2(this.isFromSocialCameraEntrance)) * 31;
        String str7 = this.storyArchiveTabName;
        int iHashCode12 = (((((iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31) + C786410Ut5.Z2(this.isSubOnlyStory)) * 31) + this.afterPublishLandingMode.hashCode()) * 31;
        MusicBuzModel musicBuzModel = this.preselectedMusic;
        return iHashCode12 + (musicBuzModel != null ? musicBuzModel.hashCode() : 0);
    }

    public final EnumC563750M9d getAfterPublishLandingMode() {
        return this.afterPublishLandingMode;
    }

    public final SecretRepliesRecordParam getBaseSecretReplyData() {
        return this.baseSecretReplyData;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final CreationSearchModel getCreationSearchModel() {
        return this.creationSearchModel;
    }

    public final boolean getEnableSwipeUpExit() {
        return this.enableSwipeUpExit;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final StoryUploadPageEntranceType getEntranceType() {
        return this.entranceType;
    }

    public final String getFromGroupId() {
        return this.fromGroupId;
    }

    public final Function0<Boolean> getInterceptorWhenFailEnterStoryAlbum() {
        return this.interceptorWhenFailEnterStoryAlbum;
    }

    public final MusicBuzModel getPreselectedMusic() {
        return this.preselectedMusic;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final float getSharedElementRoundedMaskInitialY() {
        return this.sharedElementRoundedMaskInitialY;
    }

    public final int getSharedElementTransitionMode() {
        return this.sharedElementTransitionMode;
    }

    public final String getShootEnterFrom() {
        return this.shootEnterFrom;
    }

    public final String getShootEnterMethod() {
        return this.shootEnterMethod;
    }

    public final ShootExtraData getShootExtraData() {
        return this.shootExtraData;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final SocialMediaPickerConfig getSocAlbumConfig() {
        return this.socAlbumConfig;
    }

    public final String getStoryArchiveTabName() {
        return this.storyArchiveTabName;
    }

    public final String getStoryShootEnterPosition() {
        return this.storyShootEnterPosition;
    }

    public final int getStoryTransType() {
        return this.storyTransType;
    }

    public final boolean isFromSocialCameraEntrance() {
        return this.isFromSocialCameraEntrance;
    }

    public final boolean isStoryEnhancedEntrance() {
        return this.isStoryEnhancedEntrance;
    }

    public final boolean isSubOnlyStory() {
        return this.isSubOnlyStory;
    }

    public final boolean isUploadDirectEnter() {
        return this.isUploadDirectEnter;
    }

    public EnterStoryParam(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ShootExtraData shootExtraData, boolean z, boolean z2, boolean z3, int i, float f, int i2, Function0<Boolean> function0, SocialMediaPickerConfig socialMediaPickerConfig, CreationSearchModel creationSearchModel, String str9, SecretRepliesRecordParam secretRepliesRecordParam, StoryUploadPageEntranceType storyUploadPageEntranceType, boolean z4, String str10, boolean z5, EnumC563750M9d enumC563750M9d, MusicBuzModel musicBuzModel) {
        this.shootWay = str;
        this.enterMethod = str2;
        this.enterFrom = str3;
        this.creationId = str4;
        this.fromGroupId = str5;
        this.shootEnterFrom = str6;
        this.shootEnterMethod = str7;
        this.storyShootEnterPosition = str8;
        this.shootExtraData = shootExtraData;
        this.isUploadDirectEnter = z;
        this.isStoryEnhancedEntrance = z2;
        this.enableSwipeUpExit = z3;
        this.sharedElementTransitionMode = i;
        this.sharedElementRoundedMaskInitialY = f;
        this.storyTransType = i2;
        this.interceptorWhenFailEnterStoryAlbum = function0;
        this.socAlbumConfig = socialMediaPickerConfig;
        this.creationSearchModel = creationSearchModel;
        this.requestId = str9;
        this.baseSecretReplyData = secretRepliesRecordParam;
        this.entranceType = storyUploadPageEntranceType;
        this.isFromSocialCameraEntrance = z4;
        this.storyArchiveTabName = str10;
        this.isSubOnlyStory = z5;
        this.afterPublishLandingMode = enumC563750M9d;
        this.preselectedMusic = musicBuzModel;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EnterStoryParam(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ShootExtraData shootExtraData, boolean z, boolean z2, boolean z3, int i, float f, int i2, Function0 function0, SocialMediaPickerConfig socialMediaPickerConfig, CreationSearchModel creationSearchModel, String str9, SecretRepliesRecordParam secretRepliesRecordParam, StoryUploadPageEntranceType storyUploadPageEntranceType, boolean z4, String str10, boolean z5, EnumC563750M9d enumC563750M9d, MusicBuzModel musicBuzModel, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        String str11 = str10;
        boolean z6 = z4;
        StoryUploadPageEntranceType storyUploadPageEntranceType2 = storyUploadPageEntranceType;
        SecretRepliesRecordParam secretRepliesRecordParam2 = secretRepliesRecordParam;
        String str12 = str9;
        CreationSearchModel creationSearchModel2 = creationSearchModel;
        SocialMediaPickerConfig socialMediaPickerConfig2 = socialMediaPickerConfig;
        Function0 function02 = function0;
        int i4 = i2;
        float f2 = f;
        int i5 = i;
        boolean z7 = z2;
        boolean z8 = z;
        ShootExtraData shootExtraData2 = shootExtraData;
        String str13 = str8;
        String str14 = str7;
        String str15 = str5;
        String str16 = str4;
        EnumC563750M9d enumC563750M9d2 = enumC563750M9d;
        String str17 = str2;
        String str18 = str6;
        boolean z9 = z3;
        String str19 = (i3 & 1) != 0 ? "story" : str;
        str17 = (i3 & 2) != 0 ? "unknown" : str17;
        String str20 = (i3 & 4) == 0 ? str3 : "unknown";
        str16 = (i3 & 8) != 0 ? null : str16;
        str15 = (i3 & 16) != 0 ? null : str15;
        str18 = (i3 & 32) != 0 ? null : str18;
        str14 = (i3 & 64) != 0 ? null : str14;
        this(str19, str17, str20, str16, str15, str18, str14, (i3 & 128) != 0 ? null : str13, (i3 & 256) != 0 ? new ShootExtraData(str18, null, null, null, str14, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777198, null) : shootExtraData2, (i3 & 512) != 0 ? true : z8, (i3 & 1024) != 0 ? false : z7, (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z9, (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? 0 : i5, (i3 & 8192) != 0 ? 0.0f : f2, (i3 & 16384) != 0 ? 6 : i4, (32768 & i3) != 0 ? AFwS194S0000000_8.get$arr$(193) : function02, (65536 & i3) != 0 ? null : socialMediaPickerConfig2, (131072 & i3) != 0 ? null : creationSearchModel2, (262144 & i3) != 0 ? null : str12, (524288 & i3) != 0 ? null : secretRepliesRecordParam2, (1048576 & i3) != 0 ? null : storyUploadPageEntranceType2, (2097152 & i3) != 0 ? false : z6, (4194304 & i3) != 0 ? null : str11, (8388608 & i3) == 0 ? z5 : false, (16777216 & i3) != 0 ? EnumC563750M9d.DEFAULT : enumC563750M9d2, (i3 & 33554432) == 0 ? musicBuzModel : null);
    }
}
