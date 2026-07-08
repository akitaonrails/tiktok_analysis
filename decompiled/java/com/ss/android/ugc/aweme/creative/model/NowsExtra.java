package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.NowsExtra;

/* JADX INFO: loaded from: classes9.dex */
public final class NowsExtra implements Parcelable {
    public static final Parcelable.Creator<NowsExtra> CREATOR = new Parcelable.Creator<NowsExtra>() { // from class: X.0Mog
        @Override // android.os.Parcelable.Creator
        public final NowsExtra createFromParcel(Parcel parcel) {
            boolean z;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            int i = parcel.readInt();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            return new NowsExtra(string, string2, string3, string4, string5, string6, string7, string8, i, string9, string10, z, z2, parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NowsExtra[] newArray(int i) {
            return new NowsExtra[i];
        }
    };

    @C09CT("allow_change_ratio")
    public boolean allowChangeRatio;

    @C09CT("count_down_mode")
    public int countDownMode;

    @C09CT("enterFrom")
    public String enterFrom;

    @C09CT("is_9_16_ratio")
    public boolean is9To16Ratio;

    @C09CT("is_new_page")
    public int isNewPage;

    @C040H
    public String musicID;

    @C09CT("nowCardType")
    public String nowCardType;

    @C09CT("nowPostBy")
    public String nowPostBy;

    @C09CT("now_tab_enter_method")
    public String nowTabEnterMethod;

    @C09CT("nowType")
    public String nowType;

    @C09CT("previous_page")
    public String previousPage;

    @C09CT("shootEnterPosition")
    public String shootEnterPosition;

    @C09CT("shootOrder")
    public String shootOrder;

    @C09CT("nowShootWay")
    public String shootWay;

    @C09CT("tabName")
    public String tabName;

    public NowsExtra() {
        this("back_first", "", null, "", "", "now", "now_shoot_page", null, 0, null, null, false, false, 0, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.shootOrder);
        parcel.writeString(this.nowCardType);
        parcel.writeString(this.nowType);
        parcel.writeString(this.nowPostBy);
        parcel.writeString(this.shootEnterPosition);
        parcel.writeString(this.tabName);
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.shootWay);
        parcel.writeInt(this.isNewPage);
        parcel.writeString(this.previousPage);
        parcel.writeString(this.nowTabEnterMethod);
        parcel.writeInt(this.allowChangeRatio ? 1 : 0);
        parcel.writeInt(this.is9To16Ratio ? 1 : 0);
        parcel.writeInt(this.countDownMode);
        parcel.writeString(this.musicID);
    }

    public NowsExtra(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, String str10, boolean z, boolean z2, int i2, String str11) {
        this.shootOrder = str;
        this.nowCardType = str2;
        this.nowType = str3;
        this.nowPostBy = str4;
        this.shootEnterPosition = str5;
        this.tabName = str6;
        this.enterFrom = str7;
        this.shootWay = str8;
        this.isNewPage = i;
        this.previousPage = str9;
        this.nowTabEnterMethod = str10;
        this.allowChangeRatio = z;
        this.is9To16Ratio = z2;
        this.countDownMode = i2;
        this.musicID = str11;
    }
}
