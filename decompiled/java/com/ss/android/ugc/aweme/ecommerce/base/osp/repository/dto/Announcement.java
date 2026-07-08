package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Announcement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Announcement implements Parcelable {

    @C09CT("announcement_id")
    public String announcementId;

    @C09CT("announcement_show_type")
    public Integer announcementShowType;

    @C09CT("arguments")
    public Map<String, String> arguments;

    @C09CT("background")
    public Image background;

    @C09CT("bold_text")
    public String boldText;

    @C09CT("button_text")
    public String buttonText;

    @C09CT("clickable")
    public Boolean clickable;

    @C09CT("closeable")
    public Boolean closeable;

    @C09CT("da_info")
    public String daInfo;

    @C09CT("icon")
    public Image icon;

    @C09CT("icon_text")
    public String iconText;

    @C09CT("link")
    public String link;

    @C09CT("link_arguments")
    public Map<String, LinkText> linkArguments;

    @C09CT("material_type")
    public Integer materialType;

    @C09CT("max_text_line")
    public Long maxTextLine;

    @C09CT("text")
    public String text;

    @C09CT("usable_end_time")
    public Long usableEndTime;
    public static final Parcelable.Creator<Announcement> CREATOR = new Parcelable.Creator<Announcement>() { // from class: X.02Xc
        @Override // android.os.Parcelable.Creator
        public final Announcement createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            boolean z;
            Boolean boolValueOf;
            Long lValueOf;
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2;
            Long lValueOf2;
            boolean z2;
            Boolean boolValueOf2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Image image = (Image) parcel.readParcelable(Announcement.class.getClassLoader());
            String string3 = parcel.readString();
            Image image2 = (Image) parcel.readParcelable(Announcement.class.getClassLoader());
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            if (parcel.readInt() == 0) {
                linkedHashMap2 = null;
            } else {
                int i3 = parcel.readInt();
                linkedHashMap2 = new LinkedHashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashMap2.put(parcel.readString(), LinkText.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                lValueOf2 = null;
            } else {
                lValueOf2 = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolValueOf2 = Boolean.valueOf(z2);
            }
            return new Announcement(string, string2, image, string3, image2, numValueOf, numValueOf2, boolValueOf, string4, string5, string6, string7, lValueOf, linkedHashMap, linkedHashMap2, lValueOf2, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final Announcement[] newArray(int i) {
            return new Announcement[i];
        }
    };
    public static final int $stable = 8;

    public Announcement() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Announcement)) {
            return false;
        }
        Announcement announcement = (Announcement) obj;
        return Intrinsics.LJFF(this.announcementId, announcement.announcementId) && Intrinsics.LJFF(this.text, announcement.text) && Intrinsics.LJFF(this.icon, announcement.icon) && Intrinsics.LJFF(this.link, announcement.link) && Intrinsics.LJFF(this.background, announcement.background) && Intrinsics.LJFF(this.materialType, announcement.materialType) && Intrinsics.LJFF(this.announcementShowType, announcement.announcementShowType) && Intrinsics.LJFF(this.clickable, announcement.clickable) && Intrinsics.LJFF(this.daInfo, announcement.daInfo) && Intrinsics.LJFF(this.iconText, announcement.iconText) && Intrinsics.LJFF(this.boldText, announcement.boldText) && Intrinsics.LJFF(this.buttonText, announcement.buttonText) && Intrinsics.LJFF(this.usableEndTime, announcement.usableEndTime) && Intrinsics.LJFF(this.arguments, announcement.arguments) && Intrinsics.LJFF(this.linkArguments, announcement.linkArguments) && Intrinsics.LJFF(this.maxTextLine, announcement.maxTextLine) && Intrinsics.LJFF(this.closeable, announcement.closeable);
    }

    public final int hashCode() {
        String str = this.announcementId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.icon;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        String str3 = this.link;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Image image2 = this.background;
        int iHashCode5 = (iHashCode4 + (image2 == null ? 0 : image2.hashCode())) * 31;
        Integer num = this.materialType;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.announcementShowType;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.clickable;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.daInfo;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.iconText;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.boldText;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.buttonText;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l = this.usableEndTime;
        int iHashCode13 = (iHashCode12 + (l == null ? 0 : l.hashCode())) * 31;
        Map<String, String> map = this.arguments;
        int iHashCode14 = (iHashCode13 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, LinkText> map2 = this.linkArguments;
        int iHashCode15 = (iHashCode14 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Long l2 = this.maxTextLine;
        int iHashCode16 = (iHashCode15 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool2 = this.closeable;
        return iHashCode16 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return "Announcement(announcementId=" + this.announcementId + ", text=" + this.text + ", icon=" + this.icon + ", link=" + this.link + ", background=" + this.background + ", materialType=" + this.materialType + ", announcementShowType=" + this.announcementShowType + ", clickable=" + this.clickable + ", daInfo=" + this.daInfo + ", iconText=" + this.iconText + ", boldText=" + this.boldText + ", buttonText=" + this.buttonText + ", usableEndTime=" + this.usableEndTime + ", arguments=" + this.arguments + ", linkArguments=" + this.linkArguments + ", maxTextLine=" + this.maxTextLine + ", closeable=" + this.closeable + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.announcementId);
        parcel.writeString(this.text);
        parcel.writeParcelable(this.icon, i);
        parcel.writeString(this.link);
        parcel.writeParcelable(this.background, i);
        Integer num = this.materialType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.announcementShowType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Boolean bool = this.clickable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.daInfo);
        parcel.writeString(this.iconText);
        parcel.writeString(this.boldText);
        parcel.writeString(this.buttonText);
        Long l = this.usableEndTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Map<String, String> map = this.arguments;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        Map<String, LinkText> map2 = this.linkArguments;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map2.size());
            for (Map.Entry<String, LinkText> entry2 : map2.entrySet()) {
                parcel.writeString(entry2.getKey());
                entry2.getValue().writeToParcel(parcel, i);
            }
        }
        Long l2 = this.maxTextLine;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Boolean bool2 = this.closeable;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public Announcement(String str, String str2, Image image, String str3, Image image2, Integer num, Integer num2, Boolean bool, String str4, String str5, String str6, String str7, Long l, Map<String, String> map, Map<String, LinkText> map2, Long l2, Boolean bool2) {
        this.announcementId = str;
        this.text = str2;
        this.icon = image;
        this.link = str3;
        this.background = image2;
        this.materialType = num;
        this.announcementShowType = num2;
        this.clickable = bool;
        this.daInfo = str4;
        this.iconText = str5;
        this.boldText = str6;
        this.buttonText = str7;
        this.usableEndTime = l;
        this.arguments = map;
        this.linkArguments = map2;
        this.maxTextLine = l2;
        this.closeable = bool2;
    }
}
