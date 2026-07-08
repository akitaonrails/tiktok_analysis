package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C1025003zc;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSale;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSaleReminderButton;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class FlashSale implements Parcelable {

    @C09CT("activity_id")
    public final String activityId;

    @C09CT("atmosphere_style")
    public final Integer atmosphereStyle;

    @C09CT("countdown")
    public final String countdown;

    @C09CT("countdown_bg_img")
    public final Image countdownBg;

    @C09CT("end_time")
    public final String endTime;

    @C09CT("flash_sale_style")
    public final Integer flashSaleStyle;

    @C09CT("bg_img")
    public final Image image;

    @C09CT("log_extra")
    public final String logExtra;

    @C09CT("price")
    public final String price;

    @C09CT("reminder_button")
    public final FlashSaleReminderButton remindButton;

    @C09CT("start_time")
    public final String startTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    @C09CT("tag_img")
    public final Image tagImg;

    @C09CT("title")
    public final String title;
    public static final C1025003zc Companion = new Object() { // from class: X.03zc
    };
    public static final Parcelable.Creator<FlashSale> CREATOR = new Parcelable.Creator<FlashSale>() { // from class: X.03zb
        @Override // android.os.Parcelable.Creator
        public final FlashSale createFromParcel(Parcel parcel) {
            Integer numValueOf;
            FlashSaleReminderButton flashSaleReminderButtonCreateFromParcel;
            Integer numValueOf2;
            String string = parcel.readString();
            Integer numValueOf3 = null;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            Image image = (Image) parcel.readParcelable(FlashSale.class.getClassLoader());
            Image image2 = (Image) parcel.readParcelable(FlashSale.class.getClassLoader());
            Image image3 = (Image) parcel.readParcelable(FlashSale.class.getClassLoader());
            if (parcel.readInt() == 0) {
                flashSaleReminderButtonCreateFromParcel = null;
            } else {
                flashSaleReminderButtonCreateFromParcel = FlashSaleReminderButton.CREATOR.createFromParcel(parcel);
            }
            FlashSaleReminderButton flashSaleReminderButton = flashSaleReminderButtonCreateFromParcel;
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            String string7 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            return new FlashSale(string, numValueOf, string2, string3, string4, string5, string6, image, image2, image3, flashSaleReminderButton, numValueOf2, string7, numValueOf3);
        }

        @Override // android.os.Parcelable.Creator
        public final FlashSale[] newArray(int i) {
            return new FlashSale[i];
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
        if (!(obj instanceof FlashSale)) {
            return false;
        }
        FlashSale flashSale = (FlashSale) obj;
        return Intrinsics.LJFF(this.activityId, flashSale.activityId) && Intrinsics.LJFF(this.status, flashSale.status) && Intrinsics.LJFF(this.countdown, flashSale.countdown) && Intrinsics.LJFF(this.startTime, flashSale.startTime) && Intrinsics.LJFF(this.endTime, flashSale.endTime) && Intrinsics.LJFF(this.title, flashSale.title) && Intrinsics.LJFF(this.price, flashSale.price) && Intrinsics.LJFF(this.image, flashSale.image) && Intrinsics.LJFF(this.countdownBg, flashSale.countdownBg) && Intrinsics.LJFF(this.tagImg, flashSale.tagImg) && Intrinsics.LJFF(this.remindButton, flashSale.remindButton) && Intrinsics.LJFF(this.flashSaleStyle, flashSale.flashSaleStyle) && Intrinsics.LJFF(this.logExtra, flashSale.logExtra) && Intrinsics.LJFF(this.atmosphereStyle, flashSale.atmosphereStyle);
    }

    public final int hashCode() {
        String str = this.activityId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.status;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.countdown;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.startTime;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.endTime;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.title;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.price;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Image image = this.image;
        int iHashCode8 = (iHashCode7 + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.countdownBg;
        int iHashCode9 = (iHashCode8 + (image2 == null ? 0 : image2.hashCode())) * 31;
        Image image3 = this.tagImg;
        int iHashCode10 = (iHashCode9 + (image3 == null ? 0 : image3.hashCode())) * 31;
        FlashSaleReminderButton flashSaleReminderButton = this.remindButton;
        int iHashCode11 = (iHashCode10 + (flashSaleReminderButton == null ? 0 : flashSaleReminderButton.hashCode())) * 31;
        Integer num2 = this.flashSaleStyle;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str7 = this.logExtra;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num3 = this.atmosphereStyle;
        return iHashCode13 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "FlashSale(activityId=" + this.activityId + ", status=" + this.status + ", countdown=" + this.countdown + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", title=" + this.title + ", price=" + this.price + ", image=" + this.image + ", countdownBg=" + this.countdownBg + ", tagImg=" + this.tagImg + ", remindButton=" + this.remindButton + ", flashSaleStyle=" + this.flashSaleStyle + ", logExtra=" + this.logExtra + ", atmosphereStyle=" + this.atmosphereStyle + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.activityId);
        Integer num = this.status;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.countdown);
        parcel.writeString(this.startTime);
        parcel.writeString(this.endTime);
        parcel.writeString(this.title);
        parcel.writeString(this.price);
        parcel.writeParcelable(this.image, i);
        parcel.writeParcelable(this.countdownBg, i);
        parcel.writeParcelable(this.tagImg, i);
        FlashSaleReminderButton flashSaleReminderButton = this.remindButton;
        if (flashSaleReminderButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            flashSaleReminderButton.writeToParcel(parcel, i);
        }
        Integer num2 = this.flashSaleStyle;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.logExtra);
        Integer num3 = this.atmosphereStyle;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
    }

    public static FlashSale LIZ(FlashSale flashSale, Integer num, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Image image;
        Image image2;
        Image image3;
        FlashSaleReminderButton flashSaleReminderButton;
        Integer num2;
        String str7;
        Integer num3 = num;
        Integer num4 = null;
        if ((i & 1) != 0) {
            str = flashSale.activityId;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            num3 = flashSale.status;
        }
        if ((i & 4) != 0) {
            str2 = flashSale.countdown;
        } else {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = flashSale.startTime;
        } else {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = flashSale.endTime;
        } else {
            str4 = null;
        }
        if ((i & 32) != 0) {
            str5 = flashSale.title;
        } else {
            str5 = null;
        }
        if ((i & 64) != 0) {
            str6 = flashSale.price;
        } else {
            str6 = null;
        }
        if ((i & 128) != 0) {
            image = flashSale.image;
        } else {
            image = null;
        }
        if ((i & 256) != 0) {
            image2 = flashSale.countdownBg;
        } else {
            image2 = null;
        }
        if ((i & 512) != 0) {
            image3 = flashSale.tagImg;
        } else {
            image3 = null;
        }
        if ((i & 1024) != 0) {
            flashSaleReminderButton = flashSale.remindButton;
        } else {
            flashSaleReminderButton = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            num2 = flashSale.flashSaleStyle;
        } else {
            num2 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str7 = flashSale.logExtra;
        } else {
            str7 = null;
        }
        if ((i & 8192) != 0) {
            num4 = flashSale.atmosphereStyle;
        }
        flashSale.getClass();
        return new FlashSale(str, num3, str2, str3, str4, str5, str6, image, image2, image3, flashSaleReminderButton, num2, str7, num4);
    }

    public FlashSale(String str, Integer num, String str2, String str3, String str4, String str5, String str6, Image image, Image image2, Image image3, FlashSaleReminderButton flashSaleReminderButton, Integer num2, String str7, Integer num3) {
        this.activityId = str;
        this.status = num;
        this.countdown = str2;
        this.startTime = str3;
        this.endTime = str4;
        this.title = str5;
        this.price = str6;
        this.image = image;
        this.countdownBg = image2;
        this.tagImg = image3;
        this.remindButton = flashSaleReminderButton;
        this.flashSaleStyle = num2;
        this.logExtra = str7;
        this.atmosphereStyle = num3;
    }
}
