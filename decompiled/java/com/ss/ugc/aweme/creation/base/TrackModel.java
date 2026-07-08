package com.ss.ugc.aweme.creation.base;

import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.creation.base.TrackModel;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class TrackModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<TrackModel> CREATOR = new Parcelable.Creator<TrackModel>() { // from class: X.0Mbb
        @Override // android.os.Parcelable.Creator
        public final TrackModel createFromParcel(Parcel parcel) {
            Integer numValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            } else {
                numValueOf = null;
            }
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            while (true) {
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                if (i != 0) {
                    linkedHashMap.put(string8, string9);
                    i--;
                } else {
                    return new TrackModel(string, string2, string3, string4, string5, numValueOf, string6, string7, linkedHashMap, string8, string9, parcel.readString(), parcel.readString());
                }
            }
        }

        @Override // android.os.Parcelable.Creator
        public final TrackModel[] newArray(int i) {
            return new TrackModel[i];
        }
    };

    @C09CT("anchor_id")
    public String anchorId;

    @C09CT("enter_from")
    public String enterFrom;

    @C09CT("enter_from_page")
    public String enterFromPage;

    @C09CT("enter_method")
    public String enterMethod;

    @C09CT("enter_shoot_page_extra")
    public Map<String, String> enterShootPageExtra;

    @C09CT("fragment_id")
    public String fragmentId;

    @C09CT("fragment_type")
    public String fragmentType;

    @C09CT("group_id")
    public String groupId;

    @C09CT("music_selected_from")
    public String musicSelectedFrom;

    @C09CT("previous_page")
    public String previousPage;

    @C09CT("publisher_identity")
    public String publisherIdentity;

    @C09CT("route")
    public Integer route;

    @C09CT("shoot_way")
    public String shootWay;

    public TrackModel() {
        this(null, null, null, null, null, null, null, null, new LinkedHashMap(), null, null, null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.previousPage);
        parcel.writeString(this.shootWay);
        parcel.writeString(this.musicSelectedFrom);
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.enterMethod);
        Integer num = this.route;
        if (num != null) {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.fragmentId);
        parcel.writeString(this.fragmentType);
        Map<String, String> map = this.enterShootPageExtra;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        parcel.writeString(this.groupId);
        parcel.writeString(this.anchorId);
        parcel.writeString(this.publisherIdentity);
        parcel.writeString(this.enterFromPage);
    }

    public final String getAnchorId() {
        return this.anchorId;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterFromPage() {
        return this.enterFromPage;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final Map<String, String> getEnterShootPageExtra() {
        return this.enterShootPageExtra;
    }

    public final String getFragmentId() {
        return this.fragmentId;
    }

    public final String getFragmentType() {
        return this.fragmentType;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final String getMusicSelectedFrom() {
        return this.musicSelectedFrom;
    }

    public final String getPreviousPage() {
        return this.previousPage;
    }

    public final String getPublisherIdentity() {
        return this.publisherIdentity;
    }

    public final Integer getRoute() {
        return this.route;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final void setAnchorId(String str) {
        this.anchorId = str;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setEnterFromPage(String str) {
        this.enterFromPage = str;
    }

    public final void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public final void setEnterShootPageExtra(Map<String, String> map) {
        this.enterShootPageExtra = map;
    }

    public final void setFragmentId(String str) {
        this.fragmentId = str;
    }

    public final void setFragmentType(String str) {
        this.fragmentType = str;
    }

    public final void setGroupId(String str) {
        this.groupId = str;
    }

    public final void setMusicSelectedFrom(String str) {
        this.musicSelectedFrom = str;
    }

    public final void setPreviousPage(String str) {
        this.previousPage = str;
    }

    public final void setPublisherIdentity(String str) {
        this.publisherIdentity = str;
    }

    public final void setRoute(Integer num) {
        this.route = num;
    }

    public final void setShootWay(String str) {
        this.shootWay = str;
    }

    public TrackModel(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, Map<String, String> map, String str8, String str9, String str10, String str11) {
        this.previousPage = str;
        this.shootWay = str2;
        this.musicSelectedFrom = str3;
        this.enterFrom = str4;
        this.enterMethod = str5;
        this.route = num;
        this.fragmentId = str6;
        this.fragmentType = str7;
        this.enterShootPageExtra = map;
        this.groupId = str8;
        this.anchorId = str9;
        this.publisherIdentity = str10;
        this.enterFromPage = str11;
    }
}
