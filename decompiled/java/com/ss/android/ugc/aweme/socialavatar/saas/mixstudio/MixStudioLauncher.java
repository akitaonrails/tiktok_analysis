package com.ss.android.ugc.aweme.socialavatar.saas.mixstudio;

import X.C05YD;
import X.C0HQ4;
import X.C0HSD;
import X.C0HSR;
import X.C0P0T;
import X.C19EG;
import X.C2188811AlT;
import X.C440640HPq;
import X.C441610HTj;
import X.C786410Ut5;
import X.EnumC441640HTm;
import X.InterfaceC1364105Vn;
import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.Emoji;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioLauncher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface MixStudioLauncher {
    void LIZ(C19EG c19eg, String str, EnumC441640HTm enumC441640HTm, String str2, Function0<Unit> function0, IdAndElementConfiguration idAndElementConfiguration, GenerationConfiguration generationConfiguration);

    void LIZIZ(C19EG c19eg, String str, EnumC441640HTm enumC441640HTm, C441610HTj c441610HTj, C0HSD c0hsd, FriendsIDInfo friendsIDInfo, Function0<Unit> function0, FragmentManager fragmentManager, String str2, IdAndElementConfiguration idAndElementConfiguration, GenerationConfiguration generationConfiguration);

    Object LIZJ(EnumC441640HTm enumC441640HTm, String str, String str2, InterfaceC1364105Vn<? super FriendsIDInfo> interfaceC1364105Vn);

    C0P0T LIZLLL(Context context, View view, Uri uri, String str, ViewGroup viewGroup, Boolean bool, AwS407S0200000_6 awS407S0200000_6);

    void LJ(Context context, FragmentManager fragmentManager, StickerItem stickerItem, EnumC441640HTm enumC441640HTm, C0HSR c0hsr);

    C05YD<Boolean> LJFF();

    void LJI(Context context, FragmentManager fragmentManager, Integer num, Long l, String str, EnumC441640HTm enumC441640HTm, C0HSR c0hsr);

    public static final class GenerationConfiguration implements Parcelable {
        public static final Parcelable.Creator<GenerationConfiguration> CREATOR = new Parcelable.Creator<GenerationConfiguration>() { // from class: X.0HQB
            @Override // android.os.Parcelable.Creator
            public final MixStudioLauncher.GenerationConfiguration createFromParcel(Parcel parcel) {
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
                return new MixStudioLauncher.GenerationConfiguration(z, z2);
            }

            @Override // android.os.Parcelable.Creator
            public final MixStudioLauncher.GenerationConfiguration[] newArray(int i) {
                return new MixStudioLauncher.GenerationConfiguration[i];
            }
        };
        public final boolean isAnimated;
        public final boolean isRemix;

        public GenerationConfiguration() {
            this(false, false);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GenerationConfiguration)) {
                return false;
            }
            GenerationConfiguration generationConfiguration = (GenerationConfiguration) obj;
            return this.isAnimated == generationConfiguration.isAnimated && this.isRemix == generationConfiguration.isRemix;
        }

        public final int hashCode() {
            return (C786410Ut5.Z2(this.isAnimated) * 31) + C786410Ut5.Z2(this.isRemix);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("GenerationConfiguration(isAnimated=");
            sbLIZ.append(this.isAnimated);
            sbLIZ.append(", isRemix=");
            sbLIZ.append(this.isRemix);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.isAnimated ? 1 : 0);
            parcel.writeInt(this.isRemix ? 1 : 0);
        }

        public GenerationConfiguration(boolean z, boolean z2) {
            this.isAnimated = z;
            this.isRemix = z2;
        }
    }

    public static final class IdAndElementConfiguration implements Parcelable {
        public final DefaultElementConfig defaultElementConfig;
        public final DefaultIdConfig defaultIdConfig;
        public final List<IdDropdownConfiguration> idDropdownConfigurations;
        public static final C0HQ4 Companion = new C0HQ4();
        public static final Parcelable.Creator<IdAndElementConfiguration> CREATOR = new Parcelable.Creator<IdAndElementConfiguration>() { // from class: X.0HQ3
            @Override // android.os.Parcelable.Creator
            public final MixStudioLauncher.IdAndElementConfiguration createFromParcel(Parcel parcel) {
                MixStudioLauncher.DefaultElementConfig defaultElementConfigCreateFromParcel;
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(MixStudioLauncher.IdDropdownConfiguration.CREATOR.createFromParcel(parcel));
                }
                MixStudioLauncher.DefaultIdConfig defaultIdConfigCreateFromParcel = MixStudioLauncher.DefaultIdConfig.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    defaultElementConfigCreateFromParcel = null;
                } else {
                    defaultElementConfigCreateFromParcel = MixStudioLauncher.DefaultElementConfig.CREATOR.createFromParcel(parcel);
                }
                return new MixStudioLauncher.IdAndElementConfiguration(arrayList, defaultIdConfigCreateFromParcel, defaultElementConfigCreateFromParcel);
            }

            @Override // android.os.Parcelable.Creator
            public final MixStudioLauncher.IdAndElementConfiguration[] newArray(int i) {
                return new MixStudioLauncher.IdAndElementConfiguration[i];
            }
        };

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IdAndElementConfiguration)) {
                return false;
            }
            IdAndElementConfiguration idAndElementConfiguration = (IdAndElementConfiguration) obj;
            return Intrinsics.LJFF(this.idDropdownConfigurations, idAndElementConfiguration.idDropdownConfigurations) && Intrinsics.LJFF(this.defaultIdConfig, idAndElementConfiguration.defaultIdConfig) && Intrinsics.LJFF(this.defaultElementConfig, idAndElementConfiguration.defaultElementConfig);
        }

        public final int hashCode() {
            int iHashCode = ((this.idDropdownConfigurations.hashCode() * 31) + this.defaultIdConfig.hashCode()) * 31;
            DefaultElementConfig defaultElementConfig = this.defaultElementConfig;
            return iHashCode + (defaultElementConfig == null ? 0 : defaultElementConfig.hashCode());
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("IdAndElementConfiguration(idDropdownConfigurations=");
            sbLIZ.append(this.idDropdownConfigurations);
            sbLIZ.append(", defaultIdConfig=");
            sbLIZ.append(this.defaultIdConfig);
            sbLIZ.append(", defaultElementConfig=");
            sbLIZ.append(this.defaultElementConfig);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            List<IdDropdownConfiguration> list = this.idDropdownConfigurations;
            parcel.writeInt(list.size());
            Iterator<IdDropdownConfiguration> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
            this.defaultIdConfig.writeToParcel(parcel, i);
            DefaultElementConfig defaultElementConfig = this.defaultElementConfig;
            if (defaultElementConfig == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                defaultElementConfig.writeToParcel(parcel, i);
            }
        }

        public IdAndElementConfiguration(List<IdDropdownConfiguration> list, DefaultIdConfig defaultIdConfig, DefaultElementConfig defaultElementConfig) {
            this.idDropdownConfigurations = list;
            this.defaultIdConfig = defaultIdConfig;
            this.defaultElementConfig = defaultElementConfig;
        }
    }

    public static final class IdDropdownConfiguration implements Parcelable {
        public static final Parcelable.Creator<IdDropdownConfiguration> CREATOR = new Parcelable.Creator<IdDropdownConfiguration>() { // from class: X.0HQ5
            @Override // android.os.Parcelable.Creator
            public final MixStudioLauncher.IdDropdownConfiguration createFromParcel(Parcel parcel) {
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readSerializable());
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(parcel.readSerializable());
                }
                return new MixStudioLauncher.IdDropdownConfiguration(arrayList, arrayList2, parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final MixStudioLauncher.IdDropdownConfiguration[] newArray(int i) {
                return new MixStudioLauncher.IdDropdownConfiguration[i];
            }
        };
        public final List<Pair<Integer, List<String>>> forcedIds;
        public final int sortingOrder;
        public final List<Pair<Integer, List<String>>> unforcedIds;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IdDropdownConfiguration)) {
                return false;
            }
            IdDropdownConfiguration idDropdownConfiguration = (IdDropdownConfiguration) obj;
            return Intrinsics.LJFF(this.forcedIds, idDropdownConfiguration.forcedIds) && Intrinsics.LJFF(this.unforcedIds, idDropdownConfiguration.unforcedIds) && this.sortingOrder == idDropdownConfiguration.sortingOrder;
        }

        public final int hashCode() {
            return (((this.forcedIds.hashCode() * 31) + this.unforcedIds.hashCode()) * 31) + this.sortingOrder;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("IdDropdownConfiguration(forcedIds=");
            sbLIZ.append(this.forcedIds);
            sbLIZ.append(", unforcedIds=");
            sbLIZ.append(this.unforcedIds);
            sbLIZ.append(", sortingOrder=");
            sbLIZ.append(this.sortingOrder);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            List<Pair<Integer, List<String>>> list = this.forcedIds;
            parcel.writeInt(list.size());
            Iterator<Pair<Integer, List<String>>> it2 = list.iterator();
            while (it2.hasNext()) {
                parcel.writeSerializable(it2.next());
            }
            List<Pair<Integer, List<String>>> list2 = this.unforcedIds;
            parcel.writeInt(list2.size());
            Iterator<Pair<Integer, List<String>>> it3 = list2.iterator();
            while (it3.hasNext()) {
                parcel.writeSerializable(it3.next());
            }
            parcel.writeInt(this.sortingOrder);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public IdDropdownConfiguration(List<? extends Pair<Integer, ? extends List<String>>> list, List<? extends Pair<Integer, ? extends List<String>>> list2, int i) {
            this.forcedIds = list;
            this.unforcedIds = list2;
            this.sortingOrder = i;
        }
    }

    public static final class ImageWithPromptPrefill implements Parcelable {
        public static final Parcelable.Creator<ImageWithPromptPrefill> CREATOR = new Parcelable.Creator<ImageWithPromptPrefill>() { // from class: X.0HQ8
            @Override // android.os.Parcelable.Creator
            public final MixStudioLauncher.ImageWithPromptPrefill createFromParcel(Parcel parcel) {
                return new MixStudioLauncher.ImageWithPromptPrefill(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final MixStudioLauncher.ImageWithPromptPrefill[] newArray(int i) {
                return new MixStudioLauncher.ImageWithPromptPrefill[i];
            }
        };
        public final String absolutePath;
        public final String localPath;
        public final String onlineUri;
        public final String onlineUrl;
        public final String prompt;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageWithPromptPrefill)) {
                return false;
            }
            ImageWithPromptPrefill imageWithPromptPrefill = (ImageWithPromptPrefill) obj;
            return Intrinsics.LJFF(this.localPath, imageWithPromptPrefill.localPath) && Intrinsics.LJFF(this.absolutePath, imageWithPromptPrefill.absolutePath) && Intrinsics.LJFF(this.prompt, imageWithPromptPrefill.prompt) && Intrinsics.LJFF(this.onlineUri, imageWithPromptPrefill.onlineUri) && Intrinsics.LJFF(this.onlineUrl, imageWithPromptPrefill.onlineUrl);
        }

        public final int hashCode() {
            int iHashCode = ((((this.localPath.hashCode() * 31) + this.absolutePath.hashCode()) * 31) + this.prompt.hashCode()) * 31;
            String str = this.onlineUri;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.onlineUrl;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ImageWithPromptPrefill(localPath=");
            sbLIZ.append(this.localPath);
            sbLIZ.append(", absolutePath=");
            sbLIZ.append(this.absolutePath);
            sbLIZ.append(", prompt=");
            sbLIZ.append(this.prompt);
            sbLIZ.append(", onlineUri=");
            sbLIZ.append(this.onlineUri);
            sbLIZ.append(", onlineUrl=");
            sbLIZ.append(this.onlineUrl);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.localPath);
            parcel.writeString(this.absolutePath);
            parcel.writeString(this.prompt);
            parcel.writeString(this.onlineUri);
            parcel.writeString(this.onlineUrl);
        }

        public /* synthetic */ ImageWithPromptPrefill(String str, String str2, String str3) {
            this(str, str2, str3, null, null);
        }

        public ImageWithPromptPrefill(String str, String str2, String str3, String str4, String str5) {
            this.localPath = str;
            this.absolutePath = str2;
            this.prompt = str3;
            this.onlineUri = str4;
            this.onlineUrl = str5;
        }
    }

    public static final class MemePrefill implements Parcelable {
        public static final Parcelable.Creator<MemePrefill> CREATOR = new Parcelable.Creator<MemePrefill>() { // from class: X.0HQ9
            @Override // android.os.Parcelable.Creator
            public final MixStudioLauncher.MemePrefill createFromParcel(Parcel parcel) {
                return new MixStudioLauncher.MemePrefill(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final MixStudioLauncher.MemePrefill[] newArray(int i) {
                return new MixStudioLauncher.MemePrefill[i];
            }
        };
        public final String id;
        public final String imageUri;
        public final String imageUrl;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MemePrefill)) {
                return false;
            }
            MemePrefill memePrefill = (MemePrefill) obj;
            return Intrinsics.LJFF(this.imageUri, memePrefill.imageUri) && Intrinsics.LJFF(this.imageUrl, memePrefill.imageUrl) && Intrinsics.LJFF(this.id, memePrefill.id);
        }

        public final int hashCode() {
            return (((this.imageUri.hashCode() * 31) + this.imageUrl.hashCode()) * 31) + this.id.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MemePrefill(imageUri=");
            sbLIZ.append(this.imageUri);
            sbLIZ.append(", imageUrl=");
            sbLIZ.append(this.imageUrl);
            sbLIZ.append(", id=");
            sbLIZ.append(this.id);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.imageUri);
            parcel.writeString(this.imageUrl);
            parcel.writeString(this.id);
        }

        public MemePrefill(String str, String str2, String str3) {
            this.imageUri = str;
            this.imageUrl = str2;
            this.id = str3;
        }
    }

    public static final class PrefillInfo implements Parcelable {
        public static final Parcelable.Creator<PrefillInfo> CREATOR = new Parcelable.Creator<PrefillInfo>() { // from class: X.0HSA
            @Override // android.os.Parcelable.Creator
            public final MixStudioLauncher.PrefillInfo createFromParcel(Parcel parcel) {
                MixStudioLauncher.ImageWithPromptPrefill imageWithPromptPrefillCreateFromParcel;
                String string = parcel.readString();
                Emoji emoji = (Emoji) parcel.readSerializable();
                if (parcel.readInt() == 0) {
                    imageWithPromptPrefillCreateFromParcel = null;
                } else {
                    imageWithPromptPrefillCreateFromParcel = MixStudioLauncher.ImageWithPromptPrefill.CREATOR.createFromParcel(parcel);
                }
                return new MixStudioLauncher.PrefillInfo(string, emoji, imageWithPromptPrefillCreateFromParcel);
            }

            @Override // android.os.Parcelable.Creator
            public final MixStudioLauncher.PrefillInfo[] newArray(int i) {
                return new MixStudioLauncher.PrefillInfo[i];
            }
        };
        public final Emoji prefillEmoji;
        public final ImageWithPromptPrefill prefillImage;
        public final String prefillText;

        /* JADX WARN: Multi-variable type inference failed */
        public PrefillInfo() {
            this((String) null, (Emoji) (0 == true ? 1 : 0), 7);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrefillInfo)) {
                return false;
            }
            PrefillInfo prefillInfo = (PrefillInfo) obj;
            return Intrinsics.LJFF(this.prefillText, prefillInfo.prefillText) && Intrinsics.LJFF(this.prefillEmoji, prefillInfo.prefillEmoji) && Intrinsics.LJFF(this.prefillImage, prefillInfo.prefillImage);
        }

        public final int hashCode() {
            String str = this.prefillText;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Emoji emoji = this.prefillEmoji;
            int iHashCode2 = (iHashCode + (emoji == null ? 0 : emoji.hashCode())) * 31;
            ImageWithPromptPrefill imageWithPromptPrefill = this.prefillImage;
            return iHashCode2 + (imageWithPromptPrefill != null ? imageWithPromptPrefill.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PrefillInfo(prefillText=");
            sbLIZ.append(this.prefillText);
            sbLIZ.append(", prefillEmoji=");
            sbLIZ.append(this.prefillEmoji);
            sbLIZ.append(", prefillImage=");
            sbLIZ.append(this.prefillImage);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.prefillText);
            parcel.writeSerializable(this.prefillEmoji);
            ImageWithPromptPrefill imageWithPromptPrefill = this.prefillImage;
            if (imageWithPromptPrefill == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                imageWithPromptPrefill.writeToParcel(parcel, i);
            }
        }

        public /* synthetic */ PrefillInfo(String str, Emoji emoji, int i) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : emoji, (ImageWithPromptPrefill) null);
        }

        public PrefillInfo(String str, Emoji emoji, ImageWithPromptPrefill imageWithPromptPrefill) {
            this.prefillText = str;
            this.prefillEmoji = emoji;
            this.prefillImage = imageWithPromptPrefill;
        }
    }

    public static final class PushInfo implements Parcelable {
        public static final Parcelable.Creator<PushInfo> CREATOR = new Parcelable.Creator<PushInfo>() { // from class: X.0HQW
            @Override // android.os.Parcelable.Creator
            public final MixStudioLauncher.PushInfo createFromParcel(Parcel parcel) {
                return new MixStudioLauncher.PushInfo(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final MixStudioLauncher.PushInfo[] newArray(int i) {
                return new MixStudioLauncher.PushInfo[i];
            }
        };
        public final String groupChatId;
        public final String storyId;
        public final String targetUserId;

        /* JADX WARN: Illegal instructions before constructor call */
        public PushInfo() {
            String str = null;
            this(str, str, str, 7);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PushInfo)) {
                return false;
            }
            PushInfo pushInfo = (PushInfo) obj;
            return Intrinsics.LJFF(this.storyId, pushInfo.storyId) && Intrinsics.LJFF(this.targetUserId, pushInfo.targetUserId) && Intrinsics.LJFF(this.groupChatId, pushInfo.groupChatId);
        }

        public final int hashCode() {
            String str = this.storyId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.targetUserId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.groupChatId;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PushInfo(storyId=");
            sbLIZ.append(this.storyId);
            sbLIZ.append(", targetUserId=");
            sbLIZ.append(this.targetUserId);
            sbLIZ.append(", groupChatId=");
            sbLIZ.append(this.groupChatId);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.storyId);
            parcel.writeString(this.targetUserId);
            parcel.writeString(this.groupChatId);
        }

        public PushInfo(String str, String str2, String str3) {
            this.storyId = str;
            this.targetUserId = str2;
            this.groupChatId = str3;
        }

        public /* synthetic */ PushInfo(String str, String str2, String str3, int i) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }
    }

    public static final class DefaultIdConfig implements Parcelable {
        public static final Parcelable.Creator<DefaultIdConfig> CREATOR = new Parcelable.Creator<DefaultIdConfig>() { // from class: X.0HQ6
            @Override // android.os.Parcelable.Creator
            public final MixStudioLauncher.DefaultIdConfig createFromParcel(Parcel parcel) {
                boolean z;
                String string = parcel.readString();
                int i = parcel.readInt();
                int i2 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return new MixStudioLauncher.DefaultIdConfig(string, i, i2, z);
            }

            @Override // android.os.Parcelable.Creator
            public final MixStudioLauncher.DefaultIdConfig[] newArray(int i) {
                return new MixStudioLauncher.DefaultIdConfig[i];
            }
        };
        public final boolean continuePreviousId;
        public final String friendUid;
        public final int idStrategy;
        public final int preferredIdType;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DefaultIdConfig)) {
                return false;
            }
            DefaultIdConfig defaultIdConfig = (DefaultIdConfig) obj;
            return Intrinsics.LJFF(this.friendUid, defaultIdConfig.friendUid) && this.preferredIdType == defaultIdConfig.preferredIdType && this.idStrategy == defaultIdConfig.idStrategy && this.continuePreviousId == defaultIdConfig.continuePreviousId;
        }

        public final int hashCode() {
            String str = this.friendUid;
            return ((((((str == null ? 0 : str.hashCode()) * 31) + this.preferredIdType) * 31) + this.idStrategy) * 31) + C786410Ut5.Z2(this.continuePreviousId);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DefaultIdConfig(friendUid=");
            sbLIZ.append(this.friendUid);
            sbLIZ.append(", preferredIdType=");
            sbLIZ.append(this.preferredIdType);
            sbLIZ.append(", idStrategy=");
            sbLIZ.append(this.idStrategy);
            sbLIZ.append(", continuePreviousId=");
            sbLIZ.append(this.continuePreviousId);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.friendUid);
            parcel.writeInt(this.preferredIdType);
            parcel.writeInt(this.idStrategy);
            parcel.writeInt(this.continuePreviousId ? 1 : 0);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ DefaultIdConfig(String str, int i, int i2, int i3) {
            boolean z;
            str = (i3 & 1) != 0 ? null : str;
            if ((i3 & 8) != 0) {
                z = true;
            } else {
                z = false;
            }
            this(str, i, i2, z);
        }

        public DefaultIdConfig(String str, int i, int i2, boolean z) {
            this.friendUid = str;
            this.preferredIdType = i;
            this.idStrategy = i2;
            this.continuePreviousId = z;
        }
    }

    public static final class StickerPrefill implements Parcelable {
        public static final Parcelable.Creator<StickerPrefill> CREATOR = new Parcelable.Creator<StickerPrefill>() { // from class: X.0HQ7
            @Override // android.os.Parcelable.Creator
            public final MixStudioLauncher.StickerPrefill createFromParcel(Parcel parcel) {
                return new MixStudioLauncher.StickerPrefill(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final MixStudioLauncher.StickerPrefill[] newArray(int i) {
                return new MixStudioLauncher.StickerPrefill[i];
            }
        };
        public final String id;
        public final String imageUri;
        public final String imageUrl;
        public final int stickerType;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StickerPrefill)) {
                return false;
            }
            StickerPrefill stickerPrefill = (StickerPrefill) obj;
            return Intrinsics.LJFF(this.imageUri, stickerPrefill.imageUri) && Intrinsics.LJFF(this.imageUrl, stickerPrefill.imageUrl) && Intrinsics.LJFF(this.id, stickerPrefill.id) && this.stickerType == stickerPrefill.stickerType;
        }

        public final int hashCode() {
            return (((((this.imageUri.hashCode() * 31) + this.imageUrl.hashCode()) * 31) + this.id.hashCode()) * 31) + this.stickerType;
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("StickerPrefill(imageUri=");
            sbLIZ.append(this.imageUri);
            sbLIZ.append(", imageUrl=");
            sbLIZ.append(this.imageUrl);
            sbLIZ.append(", id=");
            sbLIZ.append(this.id);
            sbLIZ.append(", stickerType=");
            sbLIZ.append(this.stickerType);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.imageUri);
            parcel.writeString(this.imageUrl);
            parcel.writeString(this.id);
            parcel.writeInt(this.stickerType);
        }

        public StickerPrefill(String str, String str2, String str3, int i) {
            this.imageUri = str;
            this.imageUrl = str2;
            this.id = str3;
            this.stickerType = i;
        }
    }

    public static final class DefaultElementConfig implements Parcelable {
        public final Emoji emoji;
        public final ImageWithPromptPrefill image;
        public final MemePrefill meme;
        public final StickerPrefill sticker;
        public final String text;
        public static final C440640HPq Companion = new Object() { // from class: X.0HPq
            /* JADX WARN: Multi-variable type inference failed */
            public static MixStudioLauncher.DefaultElementConfig LIZ(C440670HPt c440670HPt) {
                InterfaceC440090HNn interfaceC440090HNn = c440670HPt.LIZJ;
                if (interfaceC440090HNn instanceof C435610H6h) {
                    return new MixStudioLauncher.DefaultElementConfig(null, ((C435610H6h) c440670HPt.LIZJ).LIZ, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 29);
                }
                if (interfaceC440090HNn instanceof C0HGK) {
                    return new MixStudioLauncher.DefaultElementConfig(((C0HGK) c440670HPt.LIZJ).LIZ, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 30);
                }
                if (interfaceC440090HNn instanceof C440660HPs) {
                    C440660HPs c440660HPs = (C440660HPs) c440670HPt.LIZJ;
                    return new MixStudioLauncher.DefaultElementConfig(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, new MixStudioLauncher.StickerPrefill(c440660HPs.LIZ, c440660HPs.LIZIZ, c440660HPs.LIZJ, c440660HPs.LIZLLL), 15);
                }
                if (interfaceC440090HNn instanceof C435750H6v) {
                    C435750H6v c435750H6v = (C435750H6v) c440670HPt.LIZJ;
                    return new MixStudioLauncher.DefaultElementConfig(null, 0 == true ? 1 : 0, new MixStudioLauncher.MemePrefill(c435750H6v.LIZ, c435750H6v.LIZIZ, c435750H6v.LIZJ), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 27);
                }
                if (interfaceC440090HNn instanceof C440100HNo) {
                    C440100HNo c440100HNo = (C440100HNo) interfaceC440090HNn;
                    if (c440100HNo.LIZIZ != null && c440100HNo.LIZJ != null) {
                        C440100HNo c440100HNo2 = (C440100HNo) c440670HPt.LIZJ;
                        return new MixStudioLauncher.DefaultElementConfig(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, new MixStudioLauncher.ImageWithPromptPrefill(c440100HNo2.LIZJ, c440100HNo2.LIZIZ, c440100HNo2.LIZ), 0 == true ? 1 : 0, 23);
                    }
                    return null;
                }
                if (!(interfaceC440090HNn instanceof C440070HNl) && interfaceC440090HNn != null) {
                    throw new C1954807lC();
                }
                return null;
            }
        };
        public static final Parcelable.Creator<DefaultElementConfig> CREATOR = new Parcelable.Creator<DefaultElementConfig>() { // from class: X.0HQ2
            @Override // android.os.Parcelable.Creator
            public final MixStudioLauncher.DefaultElementConfig createFromParcel(Parcel parcel) {
                MixStudioLauncher.MemePrefill memePrefillCreateFromParcel;
                MixStudioLauncher.ImageWithPromptPrefill imageWithPromptPrefillCreateFromParcel;
                String string = parcel.readString();
                Emoji emoji = (Emoji) parcel.readSerializable();
                MixStudioLauncher.StickerPrefill stickerPrefillCreateFromParcel = null;
                if (parcel.readInt() == 0) {
                    memePrefillCreateFromParcel = null;
                } else {
                    memePrefillCreateFromParcel = MixStudioLauncher.MemePrefill.CREATOR.createFromParcel(parcel);
                }
                MixStudioLauncher.MemePrefill memePrefill = memePrefillCreateFromParcel;
                if (parcel.readInt() == 0) {
                    imageWithPromptPrefillCreateFromParcel = null;
                } else {
                    imageWithPromptPrefillCreateFromParcel = MixStudioLauncher.ImageWithPromptPrefill.CREATOR.createFromParcel(parcel);
                }
                MixStudioLauncher.ImageWithPromptPrefill imageWithPromptPrefill = imageWithPromptPrefillCreateFromParcel;
                if (parcel.readInt() != 0) {
                    stickerPrefillCreateFromParcel = MixStudioLauncher.StickerPrefill.CREATOR.createFromParcel(parcel);
                }
                return new MixStudioLauncher.DefaultElementConfig(string, emoji, memePrefill, imageWithPromptPrefill, stickerPrefillCreateFromParcel);
            }

            @Override // android.os.Parcelable.Creator
            public final MixStudioLauncher.DefaultElementConfig[] newArray(int i) {
                return new MixStudioLauncher.DefaultElementConfig[i];
            }
        };

        /* JADX WARN: Multi-variable type inference failed */
        public DefaultElementConfig() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DefaultElementConfig)) {
                return false;
            }
            DefaultElementConfig defaultElementConfig = (DefaultElementConfig) obj;
            return Intrinsics.LJFF(this.text, defaultElementConfig.text) && Intrinsics.LJFF(this.emoji, defaultElementConfig.emoji) && Intrinsics.LJFF(this.meme, defaultElementConfig.meme) && Intrinsics.LJFF(this.image, defaultElementConfig.image) && Intrinsics.LJFF(this.sticker, defaultElementConfig.sticker);
        }

        public final int hashCode() {
            String str = this.text;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Emoji emoji = this.emoji;
            int iHashCode2 = (iHashCode + (emoji == null ? 0 : emoji.hashCode())) * 31;
            MemePrefill memePrefill = this.meme;
            int iHashCode3 = (iHashCode2 + (memePrefill == null ? 0 : memePrefill.hashCode())) * 31;
            ImageWithPromptPrefill imageWithPromptPrefill = this.image;
            int iHashCode4 = (iHashCode3 + (imageWithPromptPrefill == null ? 0 : imageWithPromptPrefill.hashCode())) * 31;
            StickerPrefill stickerPrefill = this.sticker;
            return iHashCode4 + (stickerPrefill != null ? stickerPrefill.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DefaultElementConfig(text=");
            sbLIZ.append(this.text);
            sbLIZ.append(", emoji=");
            sbLIZ.append(this.emoji);
            sbLIZ.append(", meme=");
            sbLIZ.append(this.meme);
            sbLIZ.append(", image=");
            sbLIZ.append(this.image);
            sbLIZ.append(", sticker=");
            sbLIZ.append(this.sticker);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.text);
            parcel.writeSerializable(this.emoji);
            MemePrefill memePrefill = this.meme;
            if (memePrefill == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                memePrefill.writeToParcel(parcel, i);
            }
            ImageWithPromptPrefill imageWithPromptPrefill = this.image;
            if (imageWithPromptPrefill == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                imageWithPromptPrefill.writeToParcel(parcel, i);
            }
            StickerPrefill stickerPrefill = this.sticker;
            if (stickerPrefill == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                stickerPrefill.writeToParcel(parcel, i);
            }
        }

        public DefaultElementConfig(String str, Emoji emoji, MemePrefill memePrefill, ImageWithPromptPrefill imageWithPromptPrefill, StickerPrefill stickerPrefill) {
            this.text = str;
            this.emoji = emoji;
            this.meme = memePrefill;
            this.image = imageWithPromptPrefill;
            this.sticker = stickerPrefill;
        }

        public /* synthetic */ DefaultElementConfig(String str, Emoji emoji, MemePrefill memePrefill, ImageWithPromptPrefill imageWithPromptPrefill, StickerPrefill stickerPrefill, int i) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : emoji, (i & 4) != 0 ? null : memePrefill, (i & 8) != 0 ? null : imageWithPromptPrefill, (i & 16) == 0 ? stickerPrefill : null);
        }
    }
}
