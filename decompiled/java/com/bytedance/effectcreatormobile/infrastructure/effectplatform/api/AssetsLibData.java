package com.bytedance.effectcreatormobile.infrastructure.effectplatform.api;

import X.C1420210n3r;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.effectcreatormobile.infrastructure.effectplatform.api.AssetsLibData;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class AssetsLibData implements Parcelable {
    public final List<AssetsLibCategory> categories;
    public static final Parcelable.Creator<AssetsLibData> CREATOR = new Parcelable.Creator<AssetsLibData>() { // from class: X.0n3t
        @Override // android.os.Parcelable.Creator
        public final AssetsLibData createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(AssetsLibData.AssetsLibCategory.CREATOR.createFromParcel(parcel));
            }
            return new AssetsLibData(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AssetsLibData[] newArray(int i) {
            return new AssetsLibData[i];
        }
    };
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AssetsLibData) && Intrinsics.LJFF(this.categories, ((AssetsLibData) obj).categories);
    }

    public final int hashCode() {
        return this.categories.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AssetsLibData(categories=");
        sbLIZ.append(this.categories);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<AssetsLibCategory> list = this.categories;
        parcel.writeInt(list.size());
        Iterator<AssetsLibCategory> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public AssetsLibData(List<AssetsLibCategory> list) {
        this.categories = list;
    }

    public static final class AssetsLibCategory implements Parcelable {
        public int cursor;
        public final String extra;
        public final boolean fullScreen;
        public boolean has_more;
        public final String iconUrl;
        public final String id;
        public final List<AssetsItemData> items;
        public final String key;
        public final String name;
        public int sorting_position;
        public final String trackingType;
        public String version;
        public static final Parcelable.Creator<AssetsLibCategory> CREATOR = new Parcelable.Creator<AssetsLibCategory>() { // from class: X.0n3s
            @Override // android.os.Parcelable.Creator
            public final AssetsLibData.AssetsLibCategory createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(AssetsLibData.AssetsItemData.CREATOR.createFromParcel(parcel));
                }
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i3 = parcel.readInt();
                int i4 = parcel.readInt();
                String string7 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return new AssetsLibData.AssetsLibCategory(string, string2, string3, arrayList, string4, string5, string6, z, i3, i4, string7, z2);
            }

            @Override // android.os.Parcelable.Creator
            public final AssetsLibData.AssetsLibCategory[] newArray(int i) {
                return new AssetsLibData.AssetsLibCategory[i];
            }
        };
        public static final int $stable = 8;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AssetsLibCategory)) {
                return false;
            }
            AssetsLibCategory assetsLibCategory = (AssetsLibCategory) obj;
            return Intrinsics.LJFF(this.extra, assetsLibCategory.extra) && Intrinsics.LJFF(this.name, assetsLibCategory.name) && Intrinsics.LJFF(this.key, assetsLibCategory.key) && Intrinsics.LJFF(this.items, assetsLibCategory.items) && Intrinsics.LJFF(this.id, assetsLibCategory.id) && Intrinsics.LJFF(this.iconUrl, assetsLibCategory.iconUrl) && Intrinsics.LJFF(this.version, assetsLibCategory.version) && this.has_more == assetsLibCategory.has_more && this.cursor == assetsLibCategory.cursor && this.sorting_position == assetsLibCategory.sorting_position && Intrinsics.LJFF(this.trackingType, assetsLibCategory.trackingType) && this.fullScreen == assetsLibCategory.fullScreen;
        }

        public final int hashCode() {
            int iHashCode = ((((((((((((((((((this.extra.hashCode() * 31) + this.name.hashCode()) * 31) + this.key.hashCode()) * 31) + this.items.hashCode()) * 31) + this.id.hashCode()) * 31) + this.iconUrl.hashCode()) * 31) + this.version.hashCode()) * 31) + C786410Ut5.Z2(this.has_more)) * 31) + this.cursor) * 31) + this.sorting_position) * 31;
            String str = this.trackingType;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.fullScreen);
        }

        public final String toString() {
            return "AssetsLibCategory(extra=" + this.extra + ", name=" + this.name + ", key=" + this.key + ", items=" + this.items + ", id=" + this.id + ", iconUrl=" + this.iconUrl + ", version=" + this.version + ", has_more=" + this.has_more + ", cursor=" + this.cursor + ", sorting_position=" + this.sorting_position + ", trackingType=" + this.trackingType + ", fullScreen=" + this.fullScreen + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.extra);
            parcel.writeString(this.name);
            parcel.writeString(this.key);
            List<AssetsItemData> list = this.items;
            parcel.writeInt(list.size());
            Iterator<AssetsItemData> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
            parcel.writeString(this.id);
            parcel.writeString(this.iconUrl);
            parcel.writeString(this.version);
            parcel.writeInt(this.has_more ? 1 : 0);
            parcel.writeInt(this.cursor);
            parcel.writeInt(this.sorting_position);
            parcel.writeString(this.trackingType);
            parcel.writeInt(this.fullScreen ? 1 : 0);
        }

        public static AssetsLibCategory LIZ(AssetsLibCategory assetsLibCategory, String str, String str2, String str3, List list, String str4, String str5, String str6, boolean z, int i, int i2) {
            int i3;
            String str7;
            boolean z2;
            int i4 = i;
            boolean z3 = z;
            String str8 = str6;
            String str9 = str5;
            String str10 = str4;
            List list2 = list;
            String str11 = str3;
            String str12 = str2;
            String str13 = str;
            if ((i2 & 1) != 0) {
                str13 = assetsLibCategory.extra;
            }
            if ((i2 & 2) != 0) {
                str12 = assetsLibCategory.name;
            }
            if ((i2 & 4) != 0) {
                str11 = assetsLibCategory.key;
            }
            if ((i2 & 8) != 0) {
                list2 = assetsLibCategory.items;
            }
            if ((i2 & 16) != 0) {
                str10 = assetsLibCategory.id;
            }
            if ((i2 & 32) != 0) {
                str9 = assetsLibCategory.iconUrl;
            }
            if ((i2 & 64) != 0) {
                str8 = assetsLibCategory.version;
            }
            if ((i2 & 128) != 0) {
                z3 = assetsLibCategory.has_more;
            }
            if ((i2 & 256) != 0) {
                i3 = assetsLibCategory.cursor;
            } else {
                i3 = 0;
            }
            if ((i2 & 512) != 0) {
                i4 = assetsLibCategory.sorting_position;
            }
            if ((i2 & 1024) != 0) {
                str7 = assetsLibCategory.trackingType;
            } else {
                str7 = null;
            }
            if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
                z2 = assetsLibCategory.fullScreen;
            } else {
                z2 = false;
            }
            assetsLibCategory.getClass();
            return new AssetsLibCategory(str13, str12, str11, list2, str10, str9, str8, z3, i3, i4, str7, z2);
        }

        public AssetsLibCategory(String str, String str2, String str3, List<AssetsItemData> list, String str4, String str5, String str6, boolean z, int i, int i2, String str7, boolean z2) {
            this.extra = str;
            this.name = str2;
            this.key = str3;
            this.items = list;
            this.id = str4;
            this.iconUrl = str5;
            this.version = str6;
            this.has_more = z;
            this.cursor = i;
            this.sorting_position = i2;
            this.trackingType = str7;
            this.fullScreen = z2;
        }

        public /* synthetic */ AssetsLibCategory(String str, String str2, String str3, List list, String str4, String str5, String str6, boolean z, int i, int i2, String str7, boolean z2, int i3) {
            this(str, str2, str3, list, str4, (i3 & 32) != 0 ? "" : str5, (i3 & 64) != 0 ? CardStruct.IStatusCode.DEFAULT : str6, (i3 & 128) != 0 ? false : z, (i3 & 256) != 0 ? 0 : i, (i3 & 512) != 0 ? 0 : i2, (i3 & 1024) != 0 ? null : str7, (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z2);
        }
    }

    public static final class AssetsItemData implements Parcelable {
        public final String capabilities;
        public final String category;
        public final String effectId;
        public final Effect effectModel;
        public final String extra;
        public final boolean fullScreen;
        public final String iconUrl;
        public boolean isDownload;
        public final String itemType;
        public final String lokiPanelKey;
        public final String name;
        public final String realExtra;
        public final int resourceHeight;
        public final String resourceId;
        public final int resourceWidth;
        public final String trackingType;
        public final String unZipPath;
        public final Boolean unique;
        public final Boolean useAIMatting;
        public final String videoCoverPath;
        public final Long videoLength;
        public static final C1420210n3r Companion = new Object() { // from class: X.0n3r
        };
        public static final Parcelable.Creator<AssetsItemData> CREATOR = new Parcelable.Creator<AssetsItemData>() { // from class: X.0mjo
            @Override // android.os.Parcelable.Creator
            public final AssetsLibData.AssetsItemData createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Boolean boolValueOf;
                Long lValueOf;
                boolean z3;
                boolean z4;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                String string8 = parcel.readString();
                Boolean boolValueOf2 = null;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    if (parcel.readInt() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolValueOf = Boolean.valueOf(z2);
                }
                String string9 = parcel.readString();
                int i = parcel.readInt();
                int i2 = parcel.readInt();
                String string10 = parcel.readString();
                if (parcel.readInt() == 0) {
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(parcel.readLong());
                }
                if (parcel.readInt() != 0) {
                    if (parcel.readInt() != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolValueOf2 = Boolean.valueOf(z4);
                }
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                return new AssetsLibData.AssetsItemData(string, string2, string3, string4, string5, string6, string7, z, string8, boolValueOf, string9, i, i2, string10, lValueOf, boolValueOf2, string11, string12, string13, z3, (Effect) parcel.readParcelable(AssetsLibData.AssetsItemData.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final AssetsLibData.AssetsItemData[] newArray(int i) {
                return new AssetsLibData.AssetsItemData[i];
            }
        };
        public static final int $stable = 8;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AssetsItemData)) {
                return false;
            }
            AssetsItemData assetsItemData = (AssetsItemData) obj;
            return Intrinsics.LJFF(this.effectId, assetsItemData.effectId) && Intrinsics.LJFF(this.category, assetsItemData.category) && Intrinsics.LJFF(this.iconUrl, assetsItemData.iconUrl) && Intrinsics.LJFF(this.name, assetsItemData.name) && Intrinsics.LJFF(this.extra, assetsItemData.extra) && Intrinsics.LJFF(this.realExtra, assetsItemData.realExtra) && Intrinsics.LJFF(this.unZipPath, assetsItemData.unZipPath) && this.isDownload == assetsItemData.isDownload && Intrinsics.LJFF(this.capabilities, assetsItemData.capabilities) && Intrinsics.LJFF(this.unique, assetsItemData.unique) && Intrinsics.LJFF(this.resourceId, assetsItemData.resourceId) && this.resourceWidth == assetsItemData.resourceWidth && this.resourceHeight == assetsItemData.resourceHeight && Intrinsics.LJFF(this.videoCoverPath, assetsItemData.videoCoverPath) && Intrinsics.LJFF(this.videoLength, assetsItemData.videoLength) && Intrinsics.LJFF(this.useAIMatting, assetsItemData.useAIMatting) && Intrinsics.LJFF(this.itemType, assetsItemData.itemType) && Intrinsics.LJFF(this.trackingType, assetsItemData.trackingType) && Intrinsics.LJFF(this.lokiPanelKey, assetsItemData.lokiPanelKey) && this.fullScreen == assetsItemData.fullScreen && Intrinsics.LJFF(this.effectModel, assetsItemData.effectModel);
        }

        public final int hashCode() {
            int iHashCode = ((((((((this.effectId.hashCode() * 31) + this.category.hashCode()) * 31) + this.iconUrl.hashCode()) * 31) + this.name.hashCode()) * 31) + this.extra.hashCode()) * 31;
            String str = this.realExtra;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.unZipPath;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Z2(this.isDownload)) * 31) + this.capabilities.hashCode()) * 31;
            Boolean bool = this.unique;
            int iHashCode4 = (((((((iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31) + this.resourceId.hashCode()) * 31) + this.resourceWidth) * 31) + this.resourceHeight) * 31;
            String str3 = this.videoCoverPath;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Long l = this.videoLength;
            int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
            Boolean bool2 = this.useAIMatting;
            int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str4 = this.itemType;
            int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.trackingType;
            int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.lokiPanelKey;
            int iHashCode10 = (((iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31) + C786410Ut5.Z2(this.fullScreen)) * 31;
            Effect effect = this.effectModel;
            return iHashCode10 + (effect != null ? effect.hashCode() : 0);
        }

        public final String toString() {
            return "AssetsItemData(effectId=" + this.effectId + ", category=" + this.category + ", iconUrl=" + this.iconUrl + ", name=" + this.name + ", extra=" + this.extra + ", realExtra=" + this.realExtra + ", unZipPath=" + this.unZipPath + ", isDownload=" + this.isDownload + ", capabilities=" + this.capabilities + ", unique=" + this.unique + ", resourceId=" + this.resourceId + ", resourceWidth=" + this.resourceWidth + ", resourceHeight=" + this.resourceHeight + ", videoCoverPath=" + this.videoCoverPath + ", videoLength=" + this.videoLength + ", useAIMatting=" + this.useAIMatting + ", itemType=" + this.itemType + ", trackingType=" + this.trackingType + ", lokiPanelKey=" + this.lokiPanelKey + ", fullScreen=" + this.fullScreen + ", effectModel=" + this.effectModel + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.effectId);
            parcel.writeString(this.category);
            parcel.writeString(this.iconUrl);
            parcel.writeString(this.name);
            parcel.writeString(this.extra);
            parcel.writeString(this.realExtra);
            parcel.writeString(this.unZipPath);
            parcel.writeInt(this.isDownload ? 1 : 0);
            parcel.writeString(this.capabilities);
            Boolean bool = this.unique;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool.booleanValue() ? 1 : 0);
            }
            parcel.writeString(this.resourceId);
            parcel.writeInt(this.resourceWidth);
            parcel.writeInt(this.resourceHeight);
            parcel.writeString(this.videoCoverPath);
            Long l = this.videoLength;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l.longValue());
            }
            Boolean bool2 = this.useAIMatting;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool2.booleanValue() ? 1 : 0);
            }
            parcel.writeString(this.itemType);
            parcel.writeString(this.trackingType);
            parcel.writeString(this.lokiPanelKey);
            parcel.writeInt(this.fullScreen ? 1 : 0);
            parcel.writeParcelable(this.effectModel, i);
        }

        public AssetsItemData(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, Boolean bool, String str9, int i, int i2, String str10, Long l, Boolean bool2, String str11, String str12, String str13, boolean z2, Effect effect) {
            this.effectId = str;
            this.category = str2;
            this.iconUrl = str3;
            this.name = str4;
            this.extra = str5;
            this.realExtra = str6;
            this.unZipPath = str7;
            this.isDownload = z;
            this.capabilities = str8;
            this.unique = bool;
            this.resourceId = str9;
            this.resourceWidth = i;
            this.resourceHeight = i2;
            this.videoCoverPath = str10;
            this.videoLength = l;
            this.useAIMatting = bool2;
            this.itemType = str11;
            this.trackingType = str12;
            this.lokiPanelKey = str13;
            this.fullScreen = z2;
            this.effectModel = effect;
        }

        public /* synthetic */ AssetsItemData(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, Boolean bool, String str9, int i, int i2, String str10, Long l, Boolean bool2, String str11, String str12, String str13, boolean z2, Effect effect, int i3) {
            this(str, str2, str3, str4, str5, str6, (i3 & 64) != 0 ? null : str7, (i3 & 128) != 0 ? false : z, str8, (i3 & 512) != 0 ? null : bool, str9, (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? -1 : i, (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? -1 : i2, (i3 & 8192) != 0 ? null : str10, (i3 & 16384) != 0 ? null : l, (32768 & i3) != 0 ? null : bool2, (65536 & i3) != 0 ? null : str11, (131072 & i3) != 0 ? null : str12, (262144 & i3) != 0 ? null : str13, (524288 & i3) != 0 ? false : z2, (i3 & 1048576) == 0 ? effect : null);
        }
    }
}
