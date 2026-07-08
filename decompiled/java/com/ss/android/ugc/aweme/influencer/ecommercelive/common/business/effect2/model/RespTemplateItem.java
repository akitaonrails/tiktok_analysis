package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.C09CT;
import X.C1729950v7R;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardActivityInfo;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardGiveawayInfo;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RespTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateDecoration;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class RespTemplateItem implements Parcelable {

    @C09CT("billboard_activity_info")
    public final BillboardActivityInfo activityInfo;

    @C09CT("background_url")
    public final String backgroundUrl;

    @C09CT("field_list")
    public final List<TemplateField> fieldList;

    @C09CT("billboard_giveaway_info")
    public final BillboardGiveawayInfo giveawayInfo;

    @C09CT("introduction")
    public final String introduction;

    @C09CT("is_changed")
    public final Boolean isChanged;

    @C09CT("display")
    public final Boolean isUsing;

    @C09CT("key_message")
    public final String keyMessage;

    @C09CT("template_sub_type")
    public final Integer subType;

    @C09CT("support_auto_display")
    public final Boolean supportAutoDisplay;

    @C09CT("template_decoration_list")
    public final List<TemplateDecoration> templateDecorationList;

    @C09CT("template_id")
    public final String templateId;

    @C09CT("template_url")
    public final String templateUrl;

    @C09CT("template_type")
    public final Integer type;
    public static final C1729950v7R Companion = new C1729950v7R();
    public static final Parcelable.Creator<RespTemplateItem> CREATOR = new Parcelable.Creator<RespTemplateItem>() { // from class: X.0v8K
        @Override // android.os.Parcelable.Creator
        public final RespTemplateItem createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Integer numValueOf2;
            boolean z;
            Boolean boolValueOf;
            boolean z2;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            BillboardActivityInfo billboardActivityInfoCreateFromParcel;
            BillboardGiveawayInfo billboardGiveawayInfoCreateFromParcel;
            ArrayList arrayList;
            TemplateDecoration templateDecorationCreateFromParcel;
            String string = parcel.readString();
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
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList2.add(TemplateField.CREATOR.createFromParcel(parcel));
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z3 = true;
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
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                if (parcel.readInt() == 0) {
                    z3 = false;
                }
                boolValueOf3 = Boolean.valueOf(z3);
            }
            if (parcel.readInt() == 0) {
                billboardActivityInfoCreateFromParcel = null;
            } else {
                billboardActivityInfoCreateFromParcel = BillboardActivityInfo.CREATOR.createFromParcel(parcel);
            }
            BillboardActivityInfo billboardActivityInfo = billboardActivityInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                billboardGiveawayInfoCreateFromParcel = null;
            } else {
                billboardGiveawayInfoCreateFromParcel = BillboardGiveawayInfo.CREATOR.createFromParcel(parcel);
            }
            BillboardGiveawayInfo billboardGiveawayInfo = billboardGiveawayInfoCreateFromParcel;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                arrayList = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    if (parcel.readInt() == 0) {
                        templateDecorationCreateFromParcel = null;
                    } else {
                        templateDecorationCreateFromParcel = TemplateDecoration.CREATOR.createFromParcel(parcel);
                    }
                    arrayList.add(templateDecorationCreateFromParcel);
                }
            }
            return new RespTemplateItem(string, numValueOf, numValueOf2, arrayList2, string2, string3, boolValueOf, string4, string5, boolValueOf2, boolValueOf3, billboardActivityInfo, billboardGiveawayInfo, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final RespTemplateItem[] newArray(int i) {
            return new RespTemplateItem[i];
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
        if (!(obj instanceof RespTemplateItem)) {
            return false;
        }
        RespTemplateItem respTemplateItem = (RespTemplateItem) obj;
        return Intrinsics.LJFF(this.templateId, respTemplateItem.templateId) && Intrinsics.LJFF(this.type, respTemplateItem.type) && Intrinsics.LJFF(this.subType, respTemplateItem.subType) && Intrinsics.LJFF(this.fieldList, respTemplateItem.fieldList) && Intrinsics.LJFF(this.backgroundUrl, respTemplateItem.backgroundUrl) && Intrinsics.LJFF(this.templateUrl, respTemplateItem.templateUrl) && Intrinsics.LJFF(this.isChanged, respTemplateItem.isChanged) && Intrinsics.LJFF(this.keyMessage, respTemplateItem.keyMessage) && Intrinsics.LJFF(this.introduction, respTemplateItem.introduction) && Intrinsics.LJFF(this.isUsing, respTemplateItem.isUsing) && Intrinsics.LJFF(this.supportAutoDisplay, respTemplateItem.supportAutoDisplay) && Intrinsics.LJFF(this.activityInfo, respTemplateItem.activityInfo) && Intrinsics.LJFF(this.giveawayInfo, respTemplateItem.giveawayInfo) && Intrinsics.LJFF(this.templateDecorationList, respTemplateItem.templateDecorationList);
    }

    public final int hashCode() {
        String str = this.templateId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.type;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.subType;
        int iHashCode3 = (((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.fieldList.hashCode()) * 31;
        String str2 = this.backgroundUrl;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.templateUrl;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isChanged;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.keyMessage;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.introduction;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.isUsing;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.supportAutoDisplay;
        int iHashCode10 = (iHashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        BillboardActivityInfo billboardActivityInfo = this.activityInfo;
        int iHashCode11 = (iHashCode10 + (billboardActivityInfo == null ? 0 : billboardActivityInfo.hashCode())) * 31;
        BillboardGiveawayInfo billboardGiveawayInfo = this.giveawayInfo;
        int iHashCode12 = (iHashCode11 + (billboardGiveawayInfo == null ? 0 : billboardGiveawayInfo.hashCode())) * 31;
        List<TemplateDecoration> list = this.templateDecorationList;
        return iHashCode12 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "RespTemplateItem(templateId=" + this.templateId + ", type=" + this.type + ", subType=" + this.subType + ", fieldList=" + this.fieldList + ", backgroundUrl=" + this.backgroundUrl + ", templateUrl=" + this.templateUrl + ", isChanged=" + this.isChanged + ", keyMessage=" + this.keyMessage + ", introduction=" + this.introduction + ", isUsing=" + this.isUsing + ", supportAutoDisplay=" + this.supportAutoDisplay + ", activityInfo=" + this.activityInfo + ", giveawayInfo=" + this.giveawayInfo + ", templateDecorationList=" + this.templateDecorationList + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.templateId);
        Integer num = this.type;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.subType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        List<TemplateField> list = this.fieldList;
        parcel.writeInt(list.size());
        Iterator<TemplateField> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.backgroundUrl);
        parcel.writeString(this.templateUrl);
        Boolean bool = this.isChanged;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.keyMessage);
        parcel.writeString(this.introduction);
        Boolean bool2 = this.isUsing;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.supportAutoDisplay;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        BillboardActivityInfo billboardActivityInfo = this.activityInfo;
        if (billboardActivityInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            billboardActivityInfo.writeToParcel(parcel, i);
        }
        BillboardGiveawayInfo billboardGiveawayInfo = this.giveawayInfo;
        if (billboardGiveawayInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            billboardGiveawayInfo.writeToParcel(parcel, i);
        }
        List<TemplateDecoration> list2 = this.templateDecorationList;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        for (TemplateDecoration templateDecoration : list2) {
            if (templateDecoration == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                templateDecoration.writeToParcel(parcel, i);
            }
        }
    }

    public RespTemplateItem(String str, Integer num, Integer num2, List<TemplateField> list, String str2, String str3, Boolean bool, String str4, String str5, Boolean bool2, Boolean bool3, BillboardActivityInfo billboardActivityInfo, BillboardGiveawayInfo billboardGiveawayInfo, List<TemplateDecoration> list2) {
        this.templateId = str;
        this.type = num;
        this.subType = num2;
        this.fieldList = list;
        this.backgroundUrl = str2;
        this.templateUrl = str3;
        this.isChanged = bool;
        this.keyMessage = str4;
        this.introduction = str5;
        this.isUsing = bool2;
        this.supportAutoDisplay = bool3;
        this.activityInfo = billboardActivityInfo;
        this.giveawayInfo = billboardGiveawayInfo;
        this.templateDecorationList = list2;
    }
}
