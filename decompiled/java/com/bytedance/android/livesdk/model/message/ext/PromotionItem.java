package com.bytedance.android.livesdk.model.message.ext;

import X.C02XW;
import X.C09CT;
import X.C293501Bt;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.model.message.ext.GImage;
import com.bytedance.android.livesdk.model.message.ext.PromotionItem;
import com.bytedance.android.livesdk.model.message.ext.PromotionProperty;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PromotionItem implements Serializable, Parcelable {

    @C09CT("addition_waist_img")
    public GImage additionWaistImg;

    @C09CT("back_ground")
    public GImage backGround;

    @C09CT("countdown")
    public String countDown;

    @C09CT("dark_icon")
    public GImage darkIcon;

    @C09CT("end_time")
    public String endTime;

    @C09CT("extra_property")
    public List<PromotionProperty> extraProperty;

    @C09CT("icon")
    public GImage icon;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;
    public boolean isAsyncLoadImage;
    public Object lock;
    public volatile transient HashMap<String, Object> logExtraInMap;

    @C09CT("log_extra")
    public String log_extra;

    @C09CT("name")
    public String name;

    @C09CT("preview_show_text")
    public String previewShowText;

    @C09CT("price")
    public String price;

    @C09CT("start_time")
    public String startTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public Integer status;

    @C09CT("style")
    public Integer style;

    @C09CT("subheaders")
    public List<String> subHeaders;

    @C09CT("type")
    public Integer type;

    @C09CT("voucher_id")
    public String voucherId;

    @C09CT("waist_img")
    public GImage waistImg;
    public static final C02XW Companion = new Object() { // from class: X.02XW
    };
    public static final Parcelable.Creator<PromotionItem> CREATOR = new Parcelable.Creator<PromotionItem>() { // from class: X.02XT
        @Override // android.os.Parcelable.Creator
        public final PromotionItem createFromParcel(Parcel parcel) {
            GImage gImageCreateFromParcel;
            GImage gImageCreateFromParcel2;
            Integer numValueOf;
            Integer numValueOf2;
            ArrayList arrayList;
            GImage gImageCreateFromParcel3;
            Integer numValueOf3;
            GImage gImageCreateFromParcel4;
            GImage gImageCreateFromParcel5;
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                gImageCreateFromParcel = null;
            } else {
                gImageCreateFromParcel = GImage.CREATOR.createFromParcel(parcel);
            }
            GImage gImage = gImageCreateFromParcel;
            if (parcel.readInt() == 0) {
                gImageCreateFromParcel2 = null;
            } else {
                gImageCreateFromParcel2 = GImage.CREATOR.createFromParcel(parcel);
            }
            GImage gImage2 = gImageCreateFromParcel2;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf2 = null;
            } else {
                numValueOf2 = Integer.valueOf(parcel.readInt());
            }
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(PromotionProperty.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                gImageCreateFromParcel3 = null;
            } else {
                gImageCreateFromParcel3 = GImage.CREATOR.createFromParcel(parcel);
            }
            GImage gImage3 = gImageCreateFromParcel3;
            if (parcel.readInt() == 0) {
                numValueOf3 = null;
            } else {
                numValueOf3 = Integer.valueOf(parcel.readInt());
            }
            String string8 = parcel.readString();
            if (parcel.readInt() == 0) {
                gImageCreateFromParcel4 = null;
            } else {
                gImageCreateFromParcel4 = GImage.CREATOR.createFromParcel(parcel);
            }
            GImage gImage4 = gImageCreateFromParcel4;
            if (parcel.readInt() == 0) {
                gImageCreateFromParcel5 = null;
            } else {
                gImageCreateFromParcel5 = GImage.CREATOR.createFromParcel(parcel);
            }
            return new PromotionItem(string, string2, arrayListCreateStringArrayList, gImage, gImage2, numValueOf, string3, numValueOf2, string4, string5, string6, string7, arrayList, gImage3, numValueOf3, string8, gImage4, gImageCreateFromParcel5, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PromotionItem[] newArray(int i) {
            return new PromotionItem[i];
        }
    };

    public PromotionItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final PromotionItem copy(String str, String str2, List<String> list, GImage gImage, GImage gImage2, Integer num, String str3, Integer num2, String str4, String str5, String str6, String str7, List<PromotionProperty> list2, GImage gImage3, Integer num3, String str8, GImage gImage4, GImage gImage5, String str9) {
        return new PromotionItem(str, str2, list, gImage, gImage2, num, str3, num2, str4, str5, str6, str7, list2, gImage3, num3, str8, gImage4, gImage5, str9);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionItem)) {
            return false;
        }
        PromotionItem promotionItem = (PromotionItem) obj;
        return Intrinsics.LJFF(this.id, promotionItem.id) && Intrinsics.LJFF(this.name, promotionItem.name) && Intrinsics.LJFF(this.subHeaders, promotionItem.subHeaders) && Intrinsics.LJFF(this.icon, promotionItem.icon) && Intrinsics.LJFF(this.backGround, promotionItem.backGround) && Intrinsics.LJFF(this.style, promotionItem.style) && Intrinsics.LJFF(this.voucherId, promotionItem.voucherId) && Intrinsics.LJFF(this.type, promotionItem.type) && Intrinsics.LJFF(this.log_extra, promotionItem.log_extra) && Intrinsics.LJFF(this.countDown, promotionItem.countDown) && Intrinsics.LJFF(this.startTime, promotionItem.startTime) && Intrinsics.LJFF(this.endTime, promotionItem.endTime) && Intrinsics.LJFF(this.extraProperty, promotionItem.extraProperty) && Intrinsics.LJFF(this.waistImg, promotionItem.waistImg) && Intrinsics.LJFF(this.status, promotionItem.status) && Intrinsics.LJFF(this.price, promotionItem.price) && Intrinsics.LJFF(this.additionWaistImg, promotionItem.additionWaistImg) && Intrinsics.LJFF(this.darkIcon, promotionItem.darkIcon) && Intrinsics.LJFF(this.previewShowText, promotionItem.previewShowText);
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.subHeaders;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        GImage gImage = this.icon;
        int iHashCode4 = (iHashCode3 + (gImage == null ? 0 : gImage.hashCode())) * 31;
        GImage gImage2 = this.backGround;
        int iHashCode5 = (iHashCode4 + (gImage2 == null ? 0 : gImage2.hashCode())) * 31;
        Integer num = this.style;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.voucherId;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.type;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.log_extra;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.countDown;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.startTime;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.endTime;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<PromotionProperty> list2 = this.extraProperty;
        int iHashCode13 = (iHashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        GImage gImage3 = this.waistImg;
        int iHashCode14 = (iHashCode13 + (gImage3 == null ? 0 : gImage3.hashCode())) * 31;
        Integer num3 = this.status;
        int iHashCode15 = (iHashCode14 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str8 = this.price;
        int iHashCode16 = (iHashCode15 + (str8 == null ? 0 : str8.hashCode())) * 31;
        GImage gImage4 = this.additionWaistImg;
        int iHashCode17 = (iHashCode16 + (gImage4 == null ? 0 : gImage4.hashCode())) * 31;
        GImage gImage5 = this.darkIcon;
        int iHashCode18 = (iHashCode17 + (gImage5 == null ? 0 : gImage5.hashCode())) * 31;
        String str9 = this.previewShowText;
        return iHashCode18 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        return "PromotionItem(id=" + this.id + ", name=" + this.name + ", subHeaders=" + this.subHeaders + ", icon=" + this.icon + ", backGround=" + this.backGround + ", style=" + this.style + ", voucherId=" + this.voucherId + ", type=" + this.type + ", log_extra=" + this.log_extra + ", countDown=" + this.countDown + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", extraProperty=" + this.extraProperty + ", waistImg=" + this.waistImg + ", status=" + this.status + ", price=" + this.price + ", additionWaistImg=" + this.additionWaistImg + ", darkIcon=" + this.darkIcon + ", previewShowText=" + this.previewShowText + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeStringList(this.subHeaders);
        GImage gImage = this.icon;
        if (gImage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gImage.writeToParcel(parcel, i);
        }
        GImage gImage2 = this.backGround;
        if (gImage2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gImage2.writeToParcel(parcel, i);
        }
        Integer num = this.style;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.voucherId);
        Integer num2 = this.type;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.log_extra);
        parcel.writeString(this.countDown);
        parcel.writeString(this.startTime);
        parcel.writeString(this.endTime);
        List<PromotionProperty> list = this.extraProperty;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<PromotionProperty> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        GImage gImage3 = this.waistImg;
        if (gImage3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gImage3.writeToParcel(parcel, i);
        }
        Integer num3 = this.status;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.price);
        GImage gImage4 = this.additionWaistImg;
        if (gImage4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gImage4.writeToParcel(parcel, i);
        }
        GImage gImage5 = this.darkIcon;
        if (gImage5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gImage5.writeToParcel(parcel, i);
        }
        parcel.writeString(this.previewShowText);
    }

    public final HashMap<String, Object> getLogExtraInMap() {
        HashMap<String, Object> map;
        HashMap<String, Object> map2 = this.logExtraInMap;
        if (map2 != null) {
            return map2;
        }
        synchronized (this.lock) {
            try {
                HashMap<String, Object> map3 = this.logExtraInMap;
                if (map3 != null) {
                    return map3;
                }
                String str = this.log_extra;
                if (str == null || str.length() == 0) {
                    map = null;
                } else {
                    try {
                        map = (HashMap) C293501Bt.LIZ().LJIIIIZZ(this.log_extra, new TypeToken<HashMap<String, Object>>() { // from class: X.02XV
                        }.getType());
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        map = null;
                    }
                }
                if (map == null) {
                    map = new HashMap<>();
                }
                this.logExtraInMap = map;
                return map;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final GImage getAdditionWaistImg() {
        return this.additionWaistImg;
    }

    public final GImage getBackGround() {
        return this.backGround;
    }

    public final String getCountDown() {
        return this.countDown;
    }

    public final GImage getDarkIcon() {
        return this.darkIcon;
    }

    public final String getEndTime() {
        return this.endTime;
    }

    public final List<PromotionProperty> getExtraProperty() {
        return this.extraProperty;
    }

    public final GImage getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLog_extra() {
        return this.log_extra;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPreviewShowText() {
        return this.previewShowText;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final Integer getStyle() {
        return this.style;
    }

    public final List<String> getSubHeaders() {
        return this.subHeaders;
    }

    public final Integer getType() {
        return this.type;
    }

    public final String getVoucherId() {
        return this.voucherId;
    }

    public final GImage getWaistImg() {
        return this.waistImg;
    }

    public final boolean isAsyncLoadImage() {
        return this.isAsyncLoadImage;
    }

    public final void setAsyncLoadImage(boolean z) {
        this.isAsyncLoadImage = z;
    }

    public PromotionItem(String str, String str2, List<String> list, GImage gImage, GImage gImage2, Integer num, String str3, Integer num2, String str4, String str5, String str6, String str7, List<PromotionProperty> list2, GImage gImage3, Integer num3, String str8, GImage gImage4, GImage gImage5, String str9) {
        this.id = str;
        this.name = str2;
        this.subHeaders = list;
        this.icon = gImage;
        this.backGround = gImage2;
        this.style = num;
        this.voucherId = str3;
        this.type = num2;
        this.log_extra = str4;
        this.countDown = str5;
        this.startTime = str6;
        this.endTime = str7;
        this.extraProperty = list2;
        this.waistImg = gImage3;
        this.status = num3;
        this.price = str8;
        this.additionWaistImg = gImage4;
        this.darkIcon = gImage5;
        this.previewShowText = str9;
        this.lock = new Object();
    }
}
