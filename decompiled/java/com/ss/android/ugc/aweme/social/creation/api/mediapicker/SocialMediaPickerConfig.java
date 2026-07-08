package com.ss.android.ugc.aweme.social.creation.api.mediapicker;

import X.C0L9L;
import X.C0LJD;
import X.C0LJE;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC563850M9n;
import X.EnumC563950M9x;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocialMediaPickerConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class SocialMediaPickerConfig implements Parcelable, Serializable {
    public final EnumC563850M9n aiLiveSwitchStyle;
    public final boolean defaultEnableAiLiveSwitch;
    public final boolean enableAiLive;
    public final boolean hasStoryArchiveV2Entrance;
    public final MediaAreaUIConfig mediaAreaUIConfig;
    public final MediaLoadingStrategy mediaLoadingStrategy;
    public final MultiEntranceAreaUIConfig multiEntranceAreaUIConfig;
    public final PageUIConfig pageUIConfig;
    public final MediaSelectorStrategy selectorStrategy;
    public final StickySelectorAreaUIConfig stickySelectorAreaUIConfig;
    public final TabAreaUIConfig tabAreaUIConfig;
    public final TitleAreaUIConfig titleAreaUIConfig;
    public static final Parcelable.Creator<SocialMediaPickerConfig> CREATOR = new Parcelable.Creator<SocialMediaPickerConfig>() { // from class: X.0M9m
        @Override // android.os.Parcelable.Creator
        public final SocialMediaPickerConfig createFromParcel(Parcel parcel) {
            SocialMediaPickerConfig.TitleAreaUIConfig titleAreaUIConfigCreateFromParcel;
            SocialMediaPickerConfig.MultiEntranceAreaUIConfig multiEntranceAreaUIConfigCreateFromParcel;
            SocialMediaPickerConfig.StickySelectorAreaUIConfig stickySelectorAreaUIConfigCreateFromParcel;
            boolean z;
            boolean z2;
            boolean z3;
            SocialMediaPickerConfig.PageUIConfig pageUIConfigCreateFromParcel = SocialMediaPickerConfig.PageUIConfig.CREATOR.createFromParcel(parcel);
            SocialMediaPickerConfig.TabAreaUIConfig tabAreaUIConfigCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                titleAreaUIConfigCreateFromParcel = null;
            } else {
                titleAreaUIConfigCreateFromParcel = SocialMediaPickerConfig.TitleAreaUIConfig.CREATOR.createFromParcel(parcel);
            }
            SocialMediaPickerConfig.TitleAreaUIConfig titleAreaUIConfig = titleAreaUIConfigCreateFromParcel;
            if (parcel.readInt() == 0) {
                multiEntranceAreaUIConfigCreateFromParcel = null;
            } else {
                multiEntranceAreaUIConfigCreateFromParcel = SocialMediaPickerConfig.MultiEntranceAreaUIConfig.CREATOR.createFromParcel(parcel);
            }
            SocialMediaPickerConfig.MultiEntranceAreaUIConfig multiEntranceAreaUIConfig = multiEntranceAreaUIConfigCreateFromParcel;
            if (parcel.readInt() == 0) {
                stickySelectorAreaUIConfigCreateFromParcel = null;
            } else {
                stickySelectorAreaUIConfigCreateFromParcel = SocialMediaPickerConfig.StickySelectorAreaUIConfig.CREATOR.createFromParcel(parcel);
            }
            SocialMediaPickerConfig.StickySelectorAreaUIConfig stickySelectorAreaUIConfig = stickySelectorAreaUIConfigCreateFromParcel;
            if (parcel.readInt() != 0) {
                tabAreaUIConfigCreateFromParcel = SocialMediaPickerConfig.TabAreaUIConfig.CREATOR.createFromParcel(parcel);
            }
            SocialMediaPickerConfig.TabAreaUIConfig tabAreaUIConfig = tabAreaUIConfigCreateFromParcel;
            SocialMediaPickerConfig.MediaAreaUIConfig mediaAreaUIConfigCreateFromParcel = SocialMediaPickerConfig.MediaAreaUIConfig.CREATOR.createFromParcel(parcel);
            SocialMediaPickerConfig.MediaLoadingStrategy mediaLoadingStrategyCreateFromParcel = SocialMediaPickerConfig.MediaLoadingStrategy.CREATOR.createFromParcel(parcel);
            SocialMediaPickerConfig.MediaSelectorStrategy mediaSelectorStrategyCreateFromParcel = SocialMediaPickerConfig.MediaSelectorStrategy.CREATOR.createFromParcel(parcel);
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
            return new SocialMediaPickerConfig(pageUIConfigCreateFromParcel, titleAreaUIConfig, multiEntranceAreaUIConfig, stickySelectorAreaUIConfig, tabAreaUIConfig, mediaAreaUIConfigCreateFromParcel, mediaLoadingStrategyCreateFromParcel, mediaSelectorStrategyCreateFromParcel, z, z2, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final SocialMediaPickerConfig[] newArray(int i) {
            return new SocialMediaPickerConfig[i];
        }
    };
    public static final int $stable = 8;

    public static final class MediaAreaUIConfig implements Parcelable, Serializable {
        public final boolean enableItemCornerPreviewIcon;
        public final boolean hasCameraEntrance;
        public final boolean hasFloatingMultiSelector;
        public final C0L9L itemDisplayWHRatio;
        public final boolean supportLongPress;
        public static final Parcelable.Creator<MediaAreaUIConfig> CREATOR = new Parcelable.Creator<MediaAreaUIConfig>() { // from class: X.0M9o
            @Override // android.os.Parcelable.Creator
            public final SocialMediaPickerConfig.MediaAreaUIConfig createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
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
                C0L9L c0l9lValueOf = C0L9L.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                return new SocialMediaPickerConfig.MediaAreaUIConfig(z, z2, z3, c0l9lValueOf, z4);
            }

            @Override // android.os.Parcelable.Creator
            public final SocialMediaPickerConfig.MediaAreaUIConfig[] newArray(int i) {
                return new SocialMediaPickerConfig.MediaAreaUIConfig[i];
            }
        };
        public static final int $stable = 8;

        public final MediaAreaUIConfig copy(boolean z, boolean z2, boolean z3, C0L9L c0l9l, boolean z4) {
            return new MediaAreaUIConfig(z, z2, z3, c0l9l, z4);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaAreaUIConfig)) {
                return false;
            }
            MediaAreaUIConfig mediaAreaUIConfig = (MediaAreaUIConfig) obj;
            return this.hasCameraEntrance == mediaAreaUIConfig.hasCameraEntrance && this.hasFloatingMultiSelector == mediaAreaUIConfig.hasFloatingMultiSelector && this.enableItemCornerPreviewIcon == mediaAreaUIConfig.enableItemCornerPreviewIcon && this.itemDisplayWHRatio == mediaAreaUIConfig.itemDisplayWHRatio && this.supportLongPress == mediaAreaUIConfig.supportLongPress;
        }

        public int hashCode() {
            return (((((((C786410Ut5.Z2(this.hasCameraEntrance) * 31) + C786410Ut5.Z2(this.hasFloatingMultiSelector)) * 31) + C786410Ut5.Z2(this.enableItemCornerPreviewIcon)) * 31) + this.itemDisplayWHRatio.hashCode()) * 31) + C786410Ut5.Z2(this.supportLongPress);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MediaAreaUIConfig(hasCameraEntrance=");
            sbLIZ.append(this.hasCameraEntrance);
            sbLIZ.append(", hasFloatingMultiSelector=");
            sbLIZ.append(this.hasFloatingMultiSelector);
            sbLIZ.append(", enableItemCornerPreviewIcon=");
            sbLIZ.append(this.enableItemCornerPreviewIcon);
            sbLIZ.append(", itemDisplayWHRatio=");
            sbLIZ.append(this.itemDisplayWHRatio);
            sbLIZ.append(", supportLongPress=");
            sbLIZ.append(this.supportLongPress);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.hasCameraEntrance ? 1 : 0);
            parcel.writeInt(this.hasFloatingMultiSelector ? 1 : 0);
            parcel.writeInt(this.enableItemCornerPreviewIcon ? 1 : 0);
            parcel.writeString(this.itemDisplayWHRatio.name());
            parcel.writeInt(this.supportLongPress ? 1 : 0);
        }

        public MediaAreaUIConfig() {
            this(false, false, false, C0L9L.WIDTH_HEIGHT_9_16, false);
        }

        public final boolean getEnableItemCornerPreviewIcon() {
            return this.enableItemCornerPreviewIcon;
        }

        public final boolean getHasCameraEntrance() {
            return this.hasCameraEntrance;
        }

        public final boolean getHasFloatingMultiSelector() {
            return this.hasFloatingMultiSelector;
        }

        public final C0L9L getItemDisplayWHRatio() {
            return this.itemDisplayWHRatio;
        }

        public final boolean getSupportLongPress() {
            return this.supportLongPress;
        }

        public MediaAreaUIConfig(boolean z, boolean z2, boolean z3, C0L9L c0l9l, boolean z4) {
            this.hasCameraEntrance = z;
            this.hasFloatingMultiSelector = z2;
            this.enableItemCornerPreviewIcon = z3;
            this.itemDisplayWHRatio = c0l9l;
            this.supportLongPress = z4;
        }
    }

    public static final class MediaLoadingStrategy implements Parcelable, Serializable {
        public final C0LJD permissionBannerStyle;
        public final boolean supportGif;
        public final boolean supportLivePhoto;
        public final C0LJE supportMediaType;
        public static final Parcelable.Creator<MediaLoadingStrategy> CREATOR = new Parcelable.Creator<MediaLoadingStrategy>() { // from class: X.0LJC
            @Override // android.os.Parcelable.Creator
            public final SocialMediaPickerConfig.MediaLoadingStrategy createFromParcel(Parcel parcel) {
                boolean z;
                C0LJE c0ljeValueOf = C0LJE.valueOf(parcel.readString());
                boolean z2 = true;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                return new SocialMediaPickerConfig.MediaLoadingStrategy(c0ljeValueOf, z, z2, C0LJD.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final SocialMediaPickerConfig.MediaLoadingStrategy[] newArray(int i) {
                return new SocialMediaPickerConfig.MediaLoadingStrategy[i];
            }
        };
        public static final int $stable = 8;

        public final MediaLoadingStrategy copy(C0LJE c0lje, boolean z, boolean z2, C0LJD c0ljd) {
            return new MediaLoadingStrategy(c0lje, z, z2, c0ljd);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaLoadingStrategy)) {
                return false;
            }
            MediaLoadingStrategy mediaLoadingStrategy = (MediaLoadingStrategy) obj;
            return this.supportMediaType == mediaLoadingStrategy.supportMediaType && this.supportGif == mediaLoadingStrategy.supportGif && this.supportLivePhoto == mediaLoadingStrategy.supportLivePhoto && this.permissionBannerStyle == mediaLoadingStrategy.permissionBannerStyle;
        }

        public int hashCode() {
            return (((((this.supportMediaType.hashCode() * 31) + C786410Ut5.Z2(this.supportGif)) * 31) + C786410Ut5.Z2(this.supportLivePhoto)) * 31) + this.permissionBannerStyle.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MediaLoadingStrategy(supportMediaType=");
            sbLIZ.append(this.supportMediaType);
            sbLIZ.append(", supportGif=");
            sbLIZ.append(this.supportGif);
            sbLIZ.append(", supportLivePhoto=");
            sbLIZ.append(this.supportLivePhoto);
            sbLIZ.append(", permissionBannerStyle=");
            sbLIZ.append(this.permissionBannerStyle);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.supportMediaType.name());
            parcel.writeInt(this.supportGif ? 1 : 0);
            parcel.writeInt(this.supportLivePhoto ? 1 : 0);
            parcel.writeString(this.permissionBannerStyle.name());
        }

        public MediaLoadingStrategy() {
            this(C0LJE.IMAGE_AND_VIDEO, false, false, C0LJD.FIXED_TOP);
        }

        public final C0LJD getPermissionBannerStyle() {
            return this.permissionBannerStyle;
        }

        public final boolean getSupportGif() {
            return this.supportGif;
        }

        public final boolean getSupportLivePhoto() {
            return this.supportLivePhoto;
        }

        public final C0LJE getSupportMediaType() {
            return this.supportMediaType;
        }

        public MediaLoadingStrategy(C0LJE c0lje, boolean z, boolean z2, C0LJD c0ljd) {
            this.supportMediaType = c0lje;
            this.supportGif = z;
            this.supportLivePhoto = z2;
            this.permissionBannerStyle = c0ljd;
        }
    }

    public SocialMediaPickerConfig() {
        this(new PageUIConfig(false, EnumC563950M9x.STORY_STYLE, false), null, null, null, null, new MediaAreaUIConfig(false, false, false, C0L9L.WIDTH_HEIGHT_9_16, false), new MediaLoadingStrategy(C0LJE.IMAGE_AND_VIDEO, false, false, C0LJD.FIXED_TOP), new MediaSelectorStrategy(false, 35, false, false), false, false, false);
    }

    public static /* synthetic */ void getAiLiveSwitchStyle$annotations() {
    }

    public final SocialMediaPickerConfig copy(PageUIConfig pageUIConfig, TitleAreaUIConfig titleAreaUIConfig, MultiEntranceAreaUIConfig multiEntranceAreaUIConfig, StickySelectorAreaUIConfig stickySelectorAreaUIConfig, TabAreaUIConfig tabAreaUIConfig, MediaAreaUIConfig mediaAreaUIConfig, MediaLoadingStrategy mediaLoadingStrategy, MediaSelectorStrategy mediaSelectorStrategy, boolean z, boolean z2, boolean z3) {
        return new SocialMediaPickerConfig(pageUIConfig, titleAreaUIConfig, multiEntranceAreaUIConfig, stickySelectorAreaUIConfig, tabAreaUIConfig, mediaAreaUIConfig, mediaLoadingStrategy, mediaSelectorStrategy, z, z2, z3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocialMediaPickerConfig)) {
            return false;
        }
        SocialMediaPickerConfig socialMediaPickerConfig = (SocialMediaPickerConfig) obj;
        return Intrinsics.LJFF(this.pageUIConfig, socialMediaPickerConfig.pageUIConfig) && Intrinsics.LJFF(this.titleAreaUIConfig, socialMediaPickerConfig.titleAreaUIConfig) && Intrinsics.LJFF(this.multiEntranceAreaUIConfig, socialMediaPickerConfig.multiEntranceAreaUIConfig) && Intrinsics.LJFF(this.stickySelectorAreaUIConfig, socialMediaPickerConfig.stickySelectorAreaUIConfig) && Intrinsics.LJFF(this.tabAreaUIConfig, socialMediaPickerConfig.tabAreaUIConfig) && Intrinsics.LJFF(this.mediaAreaUIConfig, socialMediaPickerConfig.mediaAreaUIConfig) && Intrinsics.LJFF(this.mediaLoadingStrategy, socialMediaPickerConfig.mediaLoadingStrategy) && Intrinsics.LJFF(this.selectorStrategy, socialMediaPickerConfig.selectorStrategy) && this.enableAiLive == socialMediaPickerConfig.enableAiLive && this.defaultEnableAiLiveSwitch == socialMediaPickerConfig.defaultEnableAiLiveSwitch && this.hasStoryArchiveV2Entrance == socialMediaPickerConfig.hasStoryArchiveV2Entrance;
    }

    public int hashCode() {
        int iHashCode = this.pageUIConfig.hashCode() * 31;
        TitleAreaUIConfig titleAreaUIConfig = this.titleAreaUIConfig;
        int iHashCode2 = (iHashCode + (titleAreaUIConfig == null ? 0 : titleAreaUIConfig.hashCode())) * 31;
        MultiEntranceAreaUIConfig multiEntranceAreaUIConfig = this.multiEntranceAreaUIConfig;
        int iHashCode3 = (iHashCode2 + (multiEntranceAreaUIConfig == null ? 0 : multiEntranceAreaUIConfig.hashCode())) * 31;
        StickySelectorAreaUIConfig stickySelectorAreaUIConfig = this.stickySelectorAreaUIConfig;
        int iHashCode4 = (iHashCode3 + (stickySelectorAreaUIConfig == null ? 0 : stickySelectorAreaUIConfig.hashCode())) * 31;
        TabAreaUIConfig tabAreaUIConfig = this.tabAreaUIConfig;
        return ((((((((((((iHashCode4 + (tabAreaUIConfig != null ? tabAreaUIConfig.hashCode() : 0)) * 31) + this.mediaAreaUIConfig.hashCode()) * 31) + this.mediaLoadingStrategy.hashCode()) * 31) + this.selectorStrategy.hashCode()) * 31) + C786410Ut5.Z2(this.enableAiLive)) * 31) + C786410Ut5.Z2(this.defaultEnableAiLiveSwitch)) * 31) + C786410Ut5.Z2(this.hasStoryArchiveV2Entrance);
    }

    public String toString() {
        return "SocialMediaPickerConfig(pageUIConfig=" + this.pageUIConfig + ", titleAreaUIConfig=" + this.titleAreaUIConfig + ", multiEntranceAreaUIConfig=" + this.multiEntranceAreaUIConfig + ", stickySelectorAreaUIConfig=" + this.stickySelectorAreaUIConfig + ", tabAreaUIConfig=" + this.tabAreaUIConfig + ", mediaAreaUIConfig=" + this.mediaAreaUIConfig + ", mediaLoadingStrategy=" + this.mediaLoadingStrategy + ", selectorStrategy=" + this.selectorStrategy + ", enableAiLive=" + this.enableAiLive + ", defaultEnableAiLiveSwitch=" + this.defaultEnableAiLiveSwitch + ", hasStoryArchiveV2Entrance=" + this.hasStoryArchiveV2Entrance + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.pageUIConfig.writeToParcel(parcel, i);
        TitleAreaUIConfig titleAreaUIConfig = this.titleAreaUIConfig;
        if (titleAreaUIConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            titleAreaUIConfig.writeToParcel(parcel, i);
        }
        MultiEntranceAreaUIConfig multiEntranceAreaUIConfig = this.multiEntranceAreaUIConfig;
        if (multiEntranceAreaUIConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            multiEntranceAreaUIConfig.writeToParcel(parcel, i);
        }
        StickySelectorAreaUIConfig stickySelectorAreaUIConfig = this.stickySelectorAreaUIConfig;
        if (stickySelectorAreaUIConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickySelectorAreaUIConfig.writeToParcel(parcel, i);
        }
        TabAreaUIConfig tabAreaUIConfig = this.tabAreaUIConfig;
        if (tabAreaUIConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tabAreaUIConfig.writeToParcel(parcel, i);
        }
        this.mediaAreaUIConfig.writeToParcel(parcel, i);
        this.mediaLoadingStrategy.writeToParcel(parcel, i);
        this.selectorStrategy.writeToParcel(parcel, i);
        parcel.writeInt(this.enableAiLive ? 1 : 0);
        parcel.writeInt(this.defaultEnableAiLiveSwitch ? 1 : 0);
        parcel.writeInt(this.hasStoryArchiveV2Entrance ? 1 : 0);
    }

    public static final class MediaSelectorStrategy implements Parcelable, Serializable {
        public final boolean disableMultiMediaTypeSelect;
        public final boolean enableMultiSelectAtFirst;
        public final boolean fastSelect;
        public final int maxSelectable;
        public static final Parcelable.Creator<MediaSelectorStrategy> CREATOR = new Parcelable.Creator<MediaSelectorStrategy>() { // from class: X.0M9q
            @Override // android.os.Parcelable.Creator
            public final SocialMediaPickerConfig.MediaSelectorStrategy createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                boolean z3 = true;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (parcel.readInt() == 0) {
                    z3 = false;
                }
                return new SocialMediaPickerConfig.MediaSelectorStrategy(z, i, z2, z3);
            }

            @Override // android.os.Parcelable.Creator
            public final SocialMediaPickerConfig.MediaSelectorStrategy[] newArray(int i) {
                return new SocialMediaPickerConfig.MediaSelectorStrategy[i];
            }
        };
        public static final int $stable = 8;

        public MediaSelectorStrategy() {
            this(false, 35, false, false);
        }

        public final MediaSelectorStrategy copy(boolean z, int i, boolean z2, boolean z3) {
            return new MediaSelectorStrategy(z, i, z2, z3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaSelectorStrategy)) {
                return false;
            }
            MediaSelectorStrategy mediaSelectorStrategy = (MediaSelectorStrategy) obj;
            return this.enableMultiSelectAtFirst == mediaSelectorStrategy.enableMultiSelectAtFirst && this.maxSelectable == mediaSelectorStrategy.maxSelectable && this.fastSelect == mediaSelectorStrategy.fastSelect && this.disableMultiMediaTypeSelect == mediaSelectorStrategy.disableMultiMediaTypeSelect;
        }

        public int hashCode() {
            return (((((C786410Ut5.Z2(this.enableMultiSelectAtFirst) * 31) + this.maxSelectable) * 31) + C786410Ut5.Z2(this.fastSelect)) * 31) + C786410Ut5.Z2(this.disableMultiMediaTypeSelect);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MediaSelectorStrategy(enableMultiSelectAtFirst=");
            sbLIZ.append(this.enableMultiSelectAtFirst);
            sbLIZ.append(", maxSelectable=");
            sbLIZ.append(this.maxSelectable);
            sbLIZ.append(", fastSelect=");
            sbLIZ.append(this.fastSelect);
            sbLIZ.append(", disableMultiMediaTypeSelect=");
            sbLIZ.append(this.disableMultiMediaTypeSelect);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.enableMultiSelectAtFirst ? 1 : 0);
            parcel.writeInt(this.maxSelectable);
            parcel.writeInt(this.fastSelect ? 1 : 0);
            parcel.writeInt(this.disableMultiMediaTypeSelect ? 1 : 0);
        }

        public final boolean getDisableMultiMediaTypeSelect() {
            return this.disableMultiMediaTypeSelect;
        }

        public final boolean getEnableMultiSelectAtFirst() {
            return this.enableMultiSelectAtFirst;
        }

        public final boolean getFastSelect() {
            return this.fastSelect;
        }

        public final int getMaxSelectable() {
            return this.maxSelectable;
        }

        public MediaSelectorStrategy(boolean z, int i, boolean z2, boolean z3) {
            this.enableMultiSelectAtFirst = z;
            this.maxSelectable = i;
            this.fastSelect = z2;
            this.disableMultiMediaTypeSelect = z3;
        }
    }

    public static final class MultiEntranceAreaUIConfig implements Parcelable, Serializable {
        public final boolean disableCameraEntrance;
        public static final Parcelable.Creator<MultiEntranceAreaUIConfig> CREATOR = new Parcelable.Creator<MultiEntranceAreaUIConfig>() { // from class: X.0M9r
            @Override // android.os.Parcelable.Creator
            public final SocialMediaPickerConfig.MultiEntranceAreaUIConfig createFromParcel(Parcel parcel) {
                boolean z;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return new SocialMediaPickerConfig.MultiEntranceAreaUIConfig(z);
            }

            @Override // android.os.Parcelable.Creator
            public final SocialMediaPickerConfig.MultiEntranceAreaUIConfig[] newArray(int i) {
                return new SocialMediaPickerConfig.MultiEntranceAreaUIConfig[i];
            }
        };
        public static final int $stable = 8;

        public MultiEntranceAreaUIConfig() {
            this(false);
        }

        public final MultiEntranceAreaUIConfig copy(boolean z) {
            return new MultiEntranceAreaUIConfig(z);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MultiEntranceAreaUIConfig) && this.disableCameraEntrance == ((MultiEntranceAreaUIConfig) obj).disableCameraEntrance;
        }

        public int hashCode() {
            return C786410Ut5.Z2(this.disableCameraEntrance);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MultiEntranceAreaUIConfig(disableCameraEntrance=");
            sbLIZ.append(this.disableCameraEntrance);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.disableCameraEntrance ? 1 : 0);
        }

        public final boolean getDisableCameraEntrance() {
            return this.disableCameraEntrance;
        }

        public MultiEntranceAreaUIConfig(boolean z) {
            this.disableCameraEntrance = z;
        }
    }

    public static final class PageUIConfig implements Parcelable, Serializable {
        public final boolean disableSystemBarInsets;
        public final EnumC563950M9x pageUIStyle;
        public final boolean supportDaylightMode;
        public static final Parcelable.Creator<PageUIConfig> CREATOR = new Parcelable.Creator<PageUIConfig>() { // from class: X.0M9p
            @Override // android.os.Parcelable.Creator
            public final SocialMediaPickerConfig.PageUIConfig createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2 = true;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                EnumC563950M9x enumC563950M9xValueOf = EnumC563950M9x.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                return new SocialMediaPickerConfig.PageUIConfig(z, enumC563950M9xValueOf, z2);
            }

            @Override // android.os.Parcelable.Creator
            public final SocialMediaPickerConfig.PageUIConfig[] newArray(int i) {
                return new SocialMediaPickerConfig.PageUIConfig[i];
            }
        };
        public static final int $stable = 8;

        public PageUIConfig() {
            this(false, EnumC563950M9x.STORY_STYLE, false);
        }

        public final PageUIConfig copy(boolean z, EnumC563950M9x enumC563950M9x, boolean z2) {
            return new PageUIConfig(z, enumC563950M9x, z2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PageUIConfig)) {
                return false;
            }
            PageUIConfig pageUIConfig = (PageUIConfig) obj;
            return this.supportDaylightMode == pageUIConfig.supportDaylightMode && this.pageUIStyle == pageUIConfig.pageUIStyle && this.disableSystemBarInsets == pageUIConfig.disableSystemBarInsets;
        }

        public int hashCode() {
            return (((C786410Ut5.Z2(this.supportDaylightMode) * 31) + this.pageUIStyle.hashCode()) * 31) + C786410Ut5.Z2(this.disableSystemBarInsets);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PageUIConfig(supportDaylightMode=");
            sbLIZ.append(this.supportDaylightMode);
            sbLIZ.append(", pageUIStyle=");
            sbLIZ.append(this.pageUIStyle);
            sbLIZ.append(", disableSystemBarInsets=");
            sbLIZ.append(this.disableSystemBarInsets);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.supportDaylightMode ? 1 : 0);
            parcel.writeString(this.pageUIStyle.name());
            parcel.writeInt(this.disableSystemBarInsets ? 1 : 0);
        }

        public final boolean getDisableSystemBarInsets() {
            return this.disableSystemBarInsets;
        }

        public final EnumC563950M9x getPageUIStyle() {
            return this.pageUIStyle;
        }

        public final boolean getSupportDaylightMode() {
            return this.supportDaylightMode;
        }

        public PageUIConfig(boolean z, EnumC563950M9x enumC563950M9x, boolean z2) {
            this.supportDaylightMode = z;
            this.pageUIStyle = enumC563950M9x;
            this.disableSystemBarInsets = z2;
        }
    }

    public static final class StickySelectorAreaUIConfig implements Parcelable, Serializable {
        public final boolean disableSelector;
        public final boolean hideMultipleSwitcher;
        public static final Parcelable.Creator<StickySelectorAreaUIConfig> CREATOR = new Parcelable.Creator<StickySelectorAreaUIConfig>() { // from class: X.0M9s
            @Override // android.os.Parcelable.Creator
            public final SocialMediaPickerConfig.StickySelectorAreaUIConfig createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2 = true;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                return new SocialMediaPickerConfig.StickySelectorAreaUIConfig(z, z2);
            }

            @Override // android.os.Parcelable.Creator
            public final SocialMediaPickerConfig.StickySelectorAreaUIConfig[] newArray(int i) {
                return new SocialMediaPickerConfig.StickySelectorAreaUIConfig[i];
            }
        };
        public static final int $stable = 8;

        public StickySelectorAreaUIConfig() {
            this(false, false);
        }

        public final StickySelectorAreaUIConfig copy(boolean z, boolean z2) {
            return new StickySelectorAreaUIConfig(z, z2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StickySelectorAreaUIConfig)) {
                return false;
            }
            StickySelectorAreaUIConfig stickySelectorAreaUIConfig = (StickySelectorAreaUIConfig) obj;
            return this.disableSelector == stickySelectorAreaUIConfig.disableSelector && this.hideMultipleSwitcher == stickySelectorAreaUIConfig.hideMultipleSwitcher;
        }

        public int hashCode() {
            return (C786410Ut5.Z2(this.disableSelector) * 31) + C786410Ut5.Z2(this.hideMultipleSwitcher);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("StickySelectorAreaUIConfig(disableSelector=");
            sbLIZ.append(this.disableSelector);
            sbLIZ.append(", hideMultipleSwitcher=");
            sbLIZ.append(this.hideMultipleSwitcher);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.disableSelector ? 1 : 0);
            parcel.writeInt(this.hideMultipleSwitcher ? 1 : 0);
        }

        public final boolean getDisableSelector() {
            return this.disableSelector;
        }

        public final boolean getHideMultipleSwitcher() {
            return this.hideMultipleSwitcher;
        }

        public StickySelectorAreaUIConfig(boolean z, boolean z2) {
            this.disableSelector = z;
            this.hideMultipleSwitcher = z2;
        }
    }

    public static final class TabAreaUIConfig implements Parcelable, Serializable {
        public final C0LJE defaultLandingType;
        public final List<C0LJE> mediaTabList;
        public static final Parcelable.Creator<TabAreaUIConfig> CREATOR = new Parcelable.Creator<TabAreaUIConfig>() { // from class: X.0LJH
            @Override // android.os.Parcelable.Creator
            public final SocialMediaPickerConfig.TabAreaUIConfig createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(C0LJE.valueOf(parcel.readString()));
                    }
                }
                return new SocialMediaPickerConfig.TabAreaUIConfig(arrayList, C0LJE.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final SocialMediaPickerConfig.TabAreaUIConfig[] newArray(int i) {
                return new SocialMediaPickerConfig.TabAreaUIConfig[i];
            }
        };
        public static final int $stable = 8;

        public TabAreaUIConfig() {
            this(null, null, 3, null);
        }

        public final TabAreaUIConfig copy(List<? extends C0LJE> list, C0LJE c0lje) {
            return new TabAreaUIConfig(list, c0lje);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TabAreaUIConfig)) {
                return false;
            }
            TabAreaUIConfig tabAreaUIConfig = (TabAreaUIConfig) obj;
            return Intrinsics.LJFF(this.mediaTabList, tabAreaUIConfig.mediaTabList) && this.defaultLandingType == tabAreaUIConfig.defaultLandingType;
        }

        public int hashCode() {
            List<C0LJE> list = this.mediaTabList;
            return ((list == null ? 0 : list.hashCode()) * 31) + this.defaultLandingType.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TabAreaUIConfig(mediaTabList=");
            sbLIZ.append(this.mediaTabList);
            sbLIZ.append(", defaultLandingType=");
            sbLIZ.append(this.defaultLandingType);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            List<C0LJE> list = this.mediaTabList;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                Iterator<C0LJE> it2 = list.iterator();
                while (it2.hasNext()) {
                    parcel.writeString(it2.next().name());
                }
            }
            parcel.writeString(this.defaultLandingType.name());
        }

        public final C0LJE getDefaultLandingType() {
            return this.defaultLandingType;
        }

        public final List<C0LJE> getMediaTabList() {
            return this.mediaTabList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TabAreaUIConfig(List<? extends C0LJE> list, C0LJE c0lje) {
            this.mediaTabList = list;
            this.defaultLandingType = c0lje;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public TabAreaUIConfig(List list, C0LJE c0lje, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                C0LJE.Companion.getClass();
                list = C0LJE.ALL_SUPPORTED_TYPE;
            }
            this(list, (i & 2) != 0 ? C0LJE.IMAGE_AND_VIDEO : c0lje);
        }
    }

    public static final class TitleAreaUIConfig implements Parcelable, Serializable {
        public final boolean hasSelector;
        public final boolean hideCloseButton;
        public final String simpleHintText;
        public final String title;
        public static final Parcelable.Creator<TitleAreaUIConfig> CREATOR = new Parcelable.Creator<TitleAreaUIConfig>() { // from class: X.0M9u
            @Override // android.os.Parcelable.Creator
            public final SocialMediaPickerConfig.TitleAreaUIConfig createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2 = true;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                return new SocialMediaPickerConfig.TitleAreaUIConfig(z, z2, parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SocialMediaPickerConfig.TitleAreaUIConfig[] newArray(int i) {
                return new SocialMediaPickerConfig.TitleAreaUIConfig[i];
            }
        };
        public static final int $stable = 8;

        public TitleAreaUIConfig() {
            this(false, false, null, null);
        }

        public final TitleAreaUIConfig copy(boolean z, boolean z2, String str, String str2) {
            return new TitleAreaUIConfig(z, z2, str, str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TitleAreaUIConfig)) {
                return false;
            }
            TitleAreaUIConfig titleAreaUIConfig = (TitleAreaUIConfig) obj;
            return this.hideCloseButton == titleAreaUIConfig.hideCloseButton && this.hasSelector == titleAreaUIConfig.hasSelector && Intrinsics.LJFF(this.title, titleAreaUIConfig.title) && Intrinsics.LJFF(this.simpleHintText, titleAreaUIConfig.simpleHintText);
        }

        public int hashCode() {
            int iZ2 = ((C786410Ut5.Z2(this.hideCloseButton) * 31) + C786410Ut5.Z2(this.hasSelector)) * 31;
            String str = this.title;
            int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.simpleHintText;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TitleAreaUIConfig(hideCloseButton=");
            sbLIZ.append(this.hideCloseButton);
            sbLIZ.append(", hasSelector=");
            sbLIZ.append(this.hasSelector);
            sbLIZ.append(", title=");
            sbLIZ.append(this.title);
            sbLIZ.append(", simpleHintText=");
            sbLIZ.append(this.simpleHintText);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.hideCloseButton ? 1 : 0);
            parcel.writeInt(this.hasSelector ? 1 : 0);
            parcel.writeString(this.title);
            parcel.writeString(this.simpleHintText);
        }

        public final boolean getHasSelector() {
            return this.hasSelector;
        }

        public final boolean getHideCloseButton() {
            return this.hideCloseButton;
        }

        public final String getSimpleHintText() {
            return this.simpleHintText;
        }

        public final String getTitle() {
            return this.title;
        }

        public TitleAreaUIConfig(boolean z, boolean z2, String str, String str2) {
            this.hideCloseButton = z;
            this.hasSelector = z2;
            this.title = str;
            this.simpleHintText = str2;
        }
    }

    public final EnumC563850M9n getAiLiveSwitchStyle() {
        return this.aiLiveSwitchStyle;
    }

    public final boolean getDefaultEnableAiLiveSwitch() {
        return this.defaultEnableAiLiveSwitch;
    }

    public final boolean getEnableAiLive() {
        return this.enableAiLive;
    }

    public final boolean getHasStoryArchiveV2Entrance() {
        return this.hasStoryArchiveV2Entrance;
    }

    public final MediaAreaUIConfig getMediaAreaUIConfig() {
        return this.mediaAreaUIConfig;
    }

    public final MediaLoadingStrategy getMediaLoadingStrategy() {
        return this.mediaLoadingStrategy;
    }

    public final MultiEntranceAreaUIConfig getMultiEntranceAreaUIConfig() {
        return this.multiEntranceAreaUIConfig;
    }

    public final PageUIConfig getPageUIConfig() {
        return this.pageUIConfig;
    }

    public final MediaSelectorStrategy getSelectorStrategy() {
        return this.selectorStrategy;
    }

    public final StickySelectorAreaUIConfig getStickySelectorAreaUIConfig() {
        return this.stickySelectorAreaUIConfig;
    }

    public final TabAreaUIConfig getTabAreaUIConfig() {
        return this.tabAreaUIConfig;
    }

    public final TitleAreaUIConfig getTitleAreaUIConfig() {
        return this.titleAreaUIConfig;
    }

    public SocialMediaPickerConfig(PageUIConfig pageUIConfig, TitleAreaUIConfig titleAreaUIConfig, MultiEntranceAreaUIConfig multiEntranceAreaUIConfig, StickySelectorAreaUIConfig stickySelectorAreaUIConfig, TabAreaUIConfig tabAreaUIConfig, MediaAreaUIConfig mediaAreaUIConfig, MediaLoadingStrategy mediaLoadingStrategy, MediaSelectorStrategy mediaSelectorStrategy, boolean z, boolean z2, boolean z3) {
        EnumC563850M9n enumC563850M9n;
        this.pageUIConfig = pageUIConfig;
        this.titleAreaUIConfig = titleAreaUIConfig;
        this.multiEntranceAreaUIConfig = multiEntranceAreaUIConfig;
        this.stickySelectorAreaUIConfig = stickySelectorAreaUIConfig;
        this.tabAreaUIConfig = tabAreaUIConfig;
        this.mediaAreaUIConfig = mediaAreaUIConfig;
        this.mediaLoadingStrategy = mediaLoadingStrategy;
        this.selectorStrategy = mediaSelectorStrategy;
        this.enableAiLive = z;
        this.defaultEnableAiLiveSwitch = z2;
        this.hasStoryArchiveV2Entrance = z3;
        if (!z) {
            enumC563850M9n = EnumC563850M9n.DISABLE;
        } else if (multiEntranceAreaUIConfig != null) {
            enumC563850M9n = EnumC563850M9n.CELL_BUTTON;
        } else if (stickySelectorAreaUIConfig == null) {
            enumC563850M9n = EnumC563850M9n.TOP_TOGGLE;
        } else {
            enumC563850M9n = EnumC563850M9n.FLOAT_TOGGLE;
        }
        this.aiLiveSwitchStyle = enumC563850M9n;
        if (mediaSelectorStrategy.getMaxSelectable() >= 1) {
            if (mediaSelectorStrategy.getMaxSelectable() > 1 && mediaSelectorStrategy.getFastSelect()) {
                throw new IllegalArgumentException("fastSelect must be false if maxSelectable greater than 1");
            }
            return;
        }
        throw new IllegalArgumentException("maxSelectable must be greater than or equal to 1");
    }
}
