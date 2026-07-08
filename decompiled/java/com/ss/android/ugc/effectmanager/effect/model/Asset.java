package com.ss.android.ugc.effectmanager.effect.model;

import X.C09CT;
import X.C13BV;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class Asset implements Serializable, Parcelable {
    public static final Parcelable.Creator<Asset> CREATOR = new Creator();

    @C09CT("asset_consumer_type")
    public int asset_consumer_type;

    @C09CT("asset_id")
    public String asset_id;

    @C09CT("asset_parent_type")
    public int asset_parent_type;

    @C09CT("asset_type")
    public int asset_type;

    @C09CT("author")
    public final Author author;

    @C09CT("business_extra")
    public final BusinessExtra business_extra;

    @C09CT("cover")
    public final CoverInfo cover;

    @C09CT("cover_list")
    public final List<CoverInfo> cover_list;

    @C09CT("creator_search_info")
    public final String creatorSearchInfo;

    @C09CT("desc")
    public final String desc;

    @C09CT("extra")
    public final String extra;

    @C09CT("file")
    public FileInf file;

    @C09CT("from_source")
    public int from_source;

    @C09CT("icon")
    public Icon icon;

    @C09CT("icon_list")
    public final List<Icon> icon_list;

    @C09CT("package_list")
    public final List<FileInf> package_list;

    @C09CT("resource_id")
    public final String resource_id;

    @C09CT("tags")
    public List<String> tags;

    @C09CT("title")
    public String title;

    @C09CT("version")
    public final String version;

    public static final class Creator implements Parcelable.Creator<Asset> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Asset createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            String string = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Author authorCreateFromParcel = Author.CREATOR.createFromParcel(parcel);
            FileInf fileInfCreateFromParcel = FileInf.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i4 = parcel.readInt();
                arrayList = new ArrayList(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    arrayList.add(FileInf.CREATOR.createFromParcel(parcel));
                }
            }
            CoverInfo coverInfoCreateFromParcel = parcel.readInt() == 0 ? null : CoverInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i6 = parcel.readInt();
                arrayList2 = new ArrayList(i6);
                for (int i7 = 0; i7 != i6; i7++) {
                    arrayList2.add(CoverInfo.CREATOR.createFromParcel(parcel));
                }
            }
            Icon iconCreateFromParcel = parcel.readInt() == 0 ? null : Icon.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i8 = parcel.readInt();
                arrayList3 = new ArrayList(i8);
                for (int i9 = 0; i9 != i8; i9++) {
                    arrayList3.add(Icon.CREATOR.createFromParcel(parcel));
                }
            }
            return new Asset(string, i, i2, i3, string2, string3, string4, authorCreateFromParcel, fileInfCreateFromParcel, arrayList, coverInfoCreateFromParcel, arrayList2, iconCreateFromParcel, arrayList3, BusinessExtra.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Asset[] newArray(int i) {
            return new Asset[i];
        }
    }

    public final Asset copy(String str, int i, int i2, int i3, String str2, String str3, String str4, Author author, FileInf fileInf, List<FileInf> list, CoverInfo coverInfo, List<CoverInfo> list2, Icon icon, List<Icon> list3, BusinessExtra businessExtra, List<String> list4, String str5, String str6, String str7, int i4) {
        return new Asset(str, i, i2, i3, str2, str3, str4, author, fileInf, list, coverInfo, list2, icon, list3, businessExtra, list4, str5, str6, str7, i4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Asset)) {
            return false;
        }
        Asset asset = (Asset) obj;
        return Intrinsics.LJFF(this.asset_id, asset.asset_id) && this.asset_parent_type == asset.asset_parent_type && this.asset_consumer_type == asset.asset_consumer_type && this.asset_type == asset.asset_type && Intrinsics.LJFF(this.resource_id, asset.resource_id) && Intrinsics.LJFF(this.title, asset.title) && Intrinsics.LJFF(this.desc, asset.desc) && Intrinsics.LJFF(this.author, asset.author) && Intrinsics.LJFF(this.file, asset.file) && Intrinsics.LJFF(this.package_list, asset.package_list) && Intrinsics.LJFF(this.cover, asset.cover) && Intrinsics.LJFF(this.cover_list, asset.cover_list) && Intrinsics.LJFF(this.icon, asset.icon) && Intrinsics.LJFF(this.icon_list, asset.icon_list) && Intrinsics.LJFF(this.business_extra, asset.business_extra) && Intrinsics.LJFF(this.tags, asset.tags) && Intrinsics.LJFF(this.extra, asset.extra) && Intrinsics.LJFF(this.version, asset.version) && Intrinsics.LJFF(this.creatorSearchInfo, asset.creatorSearchInfo) && this.from_source == asset.from_source;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.asset_id.hashCode() * 31) + this.asset_parent_type) * 31) + this.asset_consumer_type) * 31) + this.asset_type) * 31) + this.resource_id.hashCode()) * 31) + this.title.hashCode()) * 31) + this.desc.hashCode()) * 31) + this.author.hashCode()) * 31) + this.file.hashCode()) * 31;
        List<FileInf> list = this.package_list;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        CoverInfo coverInfo = this.cover;
        int iHashCode3 = (iHashCode2 + (coverInfo == null ? 0 : coverInfo.hashCode())) * 31;
        List<CoverInfo> list2 = this.cover_list;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Icon icon = this.icon;
        int iHashCode5 = (iHashCode4 + (icon == null ? 0 : icon.hashCode())) * 31;
        List<Icon> list3 = this.icon_list;
        int iHashCode6 = (((((((((iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31) + this.business_extra.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.extra.hashCode()) * 31) + this.version.hashCode()) * 31;
        String str = this.creatorSearchInfo;
        return ((iHashCode6 + (str != null ? str.hashCode() : 0)) * 31) + this.from_source;
    }

    public String toString() {
        return "Asset(asset_id=" + this.asset_id + ", asset_parent_type=" + this.asset_parent_type + ", asset_consumer_type=" + this.asset_consumer_type + ", asset_type=" + this.asset_type + ", resource_id=" + this.resource_id + ", title=" + this.title + ", desc=" + this.desc + ", author=" + this.author + ", file=" + this.file + ", package_list=" + this.package_list + ", cover=" + this.cover + ", cover_list=" + this.cover_list + ", icon=" + this.icon + ", icon_list=" + this.icon_list + ", business_extra=" + this.business_extra + ", tags=" + this.tags + ", extra=" + this.extra + ", version=" + this.version + ", creatorSearchInfo=" + this.creatorSearchInfo + ", from_source=" + this.from_source + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.asset_id);
        parcel.writeInt(this.asset_parent_type);
        parcel.writeInt(this.asset_consumer_type);
        parcel.writeInt(this.asset_type);
        parcel.writeString(this.resource_id);
        parcel.writeString(this.title);
        parcel.writeString(this.desc);
        this.author.writeToParcel(parcel, i);
        this.file.writeToParcel(parcel, i);
        List<FileInf> list = this.package_list;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<FileInf> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        CoverInfo coverInfo = this.cover;
        if (coverInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            coverInfo.writeToParcel(parcel, i);
        }
        List<CoverInfo> list2 = this.cover_list;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<CoverInfo> it3 = list2.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        Icon icon = this.icon;
        if (icon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            icon.writeToParcel(parcel, i);
        }
        List<Icon> list3 = this.icon_list;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<Icon> it4 = list3.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(parcel, i);
            }
        }
        this.business_extra.writeToParcel(parcel, i);
        parcel.writeStringList(this.tags);
        parcel.writeString(this.extra);
        parcel.writeString(this.version);
        parcel.writeString(this.creatorSearchInfo);
        parcel.writeInt(this.from_source);
    }

    public Asset() {
        int value = AssetParentType.TEMPLATE.getValue();
        int value2 = AssetConsumerType.CC_TEMPLATE.getValue();
        int value3 = AssetType.AUTOCUT_AI_TEMPLATE.getValue();
        Author author = new Author("", null, null, null);
        FileInf fileInf = new FileInf(null, null, null, null, null);
        CoverInfo coverInfo = new CoverInfo(null, null, null, null, null);
        C13BV c13bv = C13BV.INSTANCE;
        this("", value, value2, value3, "", "", "", author, fileInf, null, coverInfo, null, new Icon("", null, null, c13bv), null, new BusinessExtra(null, null, null, null, null, "", "", null, null, null, null, null, null, "", "", "", null, null, null, null, "", null, null, null, "", "", "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "", "", false, null, null, null, null, null, null, null, null, null, null, null, false, null, Boolean.FALSE, null, null, null, null, null, null, "", null, null, null, null, null, null), c13bv, "", "", null, -1);
    }

    public final int getAsset_consumer_type() {
        return this.asset_consumer_type;
    }

    public final String getAsset_id() {
        return this.asset_id;
    }

    public final int getAsset_parent_type() {
        return this.asset_parent_type;
    }

    public final int getAsset_type() {
        return this.asset_type;
    }

    public final Author getAuthor() {
        return this.author;
    }

    public final BusinessExtra getBusiness_extra() {
        return this.business_extra;
    }

    public final CoverInfo getCover() {
        return this.cover;
    }

    public final List<CoverInfo> getCover_list() {
        return this.cover_list;
    }

    public final String getCreatorSearchInfo() {
        return this.creatorSearchInfo;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final FileInf getFile() {
        return this.file;
    }

    public final int getFrom_source() {
        return this.from_source;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final List<Icon> getIcon_list() {
        return this.icon_list;
    }

    public final List<FileInf> getPackage_list() {
        return this.package_list;
    }

    public final String getResource_id() {
        return this.resource_id;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getVersion() {
        return this.version;
    }

    public final void setAsset_consumer_type(int i) {
        this.asset_consumer_type = i;
    }

    public final void setAsset_id(String str) {
        this.asset_id = str;
    }

    public final void setAsset_parent_type(int i) {
        this.asset_parent_type = i;
    }

    public final void setAsset_type(int i) {
        this.asset_type = i;
    }

    public final void setFile(FileInf fileInf) {
        this.file = fileInf;
    }

    public final void setFrom_source(int i) {
        this.from_source = i;
    }

    public final void setIcon(Icon icon) {
        this.icon = icon;
    }

    public final void setTags(List<String> list) {
        this.tags = list;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public Asset(String str, int i, int i2, int i3, String str2, String str3, String str4, Author author, FileInf fileInf, List<FileInf> list, CoverInfo coverInfo, List<CoverInfo> list2, Icon icon, List<Icon> list3, BusinessExtra businessExtra, List<String> list4, String str5, String str6, String str7, int i4) {
        this.asset_id = str;
        this.asset_parent_type = i;
        this.asset_consumer_type = i2;
        this.asset_type = i3;
        this.resource_id = str2;
        this.title = str3;
        this.desc = str4;
        this.author = author;
        this.file = fileInf;
        this.package_list = list;
        this.cover = coverInfo;
        this.cover_list = list2;
        this.icon = icon;
        this.icon_list = list3;
        this.business_extra = businessExtra;
        this.tags = list4;
        this.extra = str5;
        this.version = str6;
        this.creatorSearchInfo = str7;
        this.from_source = i4;
    }
}
