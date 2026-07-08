package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.C13BV;
import X.C1730000v7W;
import X.C1730370v87;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardActivityInfo;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardGiveawayInfo;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardTrackParams;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ProductTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateDecoration;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class ProductTemplateItem implements TemplateItem, Parcelable {
    public final BillboardActivityInfo activityInfo;
    public final String bgImgUrl;
    public final List<TemplateField> fieldList;
    public final BillboardGiveawayInfo giveawayInfo;
    public final String introduction;
    public final boolean isChanged;
    public final boolean isDisplayEnable;
    public final boolean isLiveTakeDefault;
    public final boolean isUsing;
    public final String keyMessage;
    public final Integer subType;
    public final boolean supportAutoDisplay;
    public final List<TemplateDecoration> templateDecorationList;
    public final String templateId;
    public final String templateImgUrl;
    public final BillboardTrackParams trackParams;
    public final int type;
    public final Long useTime;
    public static final C1730370v87 Companion = new C1730370v87();
    public static final Parcelable.Creator<ProductTemplateItem> CREATOR = new Parcelable.Creator<ProductTemplateItem>() { // from class: X.0v8G
        @Override // android.os.Parcelable.Creator
        public final ProductTemplateItem createFromParcel(Parcel parcel) {
            Integer numValueOf;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            BillboardActivityInfo billboardActivityInfoCreateFromParcel;
            BillboardGiveawayInfo billboardGiveawayInfoCreateFromParcel;
            ArrayList arrayList;
            TemplateDecoration templateDecorationCreateFromParcel;
            Long lValueOf;
            boolean z5;
            int i = parcel.readInt();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList2.add(TemplateField.CREATOR.createFromParcel(parcel));
            }
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
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
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
                int i4 = parcel.readInt();
                arrayList = new ArrayList(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    if (parcel.readInt() == 0) {
                        templateDecorationCreateFromParcel = null;
                    } else {
                        templateDecorationCreateFromParcel = TemplateDecoration.CREATOR.createFromParcel(parcel);
                    }
                    arrayList.add(templateDecorationCreateFromParcel);
                }
            }
            if (parcel.readInt() == 0) {
                lValueOf = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            return new ProductTemplateItem(i, numValueOf, string, string2, string3, string4, string5, arrayList2, z, z2, z3, z4, billboardActivityInfo, billboardGiveawayInfo, arrayList, lValueOf, z5, BillboardTrackParams.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ProductTemplateItem[] newArray(int i) {
            return new ProductTemplateItem[i];
        }
    };
    public static final int $stable = 8;

    public ProductTemplateItem() {
        this(null, null, null, null, null, null, null, false, false, false, false, null, null, null, 262143);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductTemplateItem)) {
            return false;
        }
        ProductTemplateItem productTemplateItem = (ProductTemplateItem) obj;
        return this.type == productTemplateItem.type && Intrinsics.LJFF(this.subType, productTemplateItem.subType) && Intrinsics.LJFF(this.templateId, productTemplateItem.templateId) && Intrinsics.LJFF(this.bgImgUrl, productTemplateItem.bgImgUrl) && Intrinsics.LJFF(this.templateImgUrl, productTemplateItem.templateImgUrl) && Intrinsics.LJFF(this.keyMessage, productTemplateItem.keyMessage) && Intrinsics.LJFF(this.introduction, productTemplateItem.introduction) && Intrinsics.LJFF(this.fieldList, productTemplateItem.fieldList) && this.isUsing == productTemplateItem.isUsing && this.isDisplayEnable == productTemplateItem.isDisplayEnable && this.isChanged == productTemplateItem.isChanged && this.supportAutoDisplay == productTemplateItem.supportAutoDisplay && Intrinsics.LJFF(this.activityInfo, productTemplateItem.activityInfo) && Intrinsics.LJFF(this.giveawayInfo, productTemplateItem.giveawayInfo) && Intrinsics.LJFF(this.templateDecorationList, productTemplateItem.templateDecorationList) && Intrinsics.LJFF(this.useTime, productTemplateItem.useTime) && this.isLiveTakeDefault == productTemplateItem.isLiveTakeDefault && Intrinsics.LJFF(this.trackParams, productTemplateItem.trackParams);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int i = this.type * 31;
        Integer num = this.subType;
        int iHashCode = (((((((((((((((((((((i + (num == null ? 0 : num.hashCode())) * 31) + this.templateId.hashCode()) * 31) + this.bgImgUrl.hashCode()) * 31) + this.templateImgUrl.hashCode()) * 31) + this.keyMessage.hashCode()) * 31) + this.introduction.hashCode()) * 31) + this.fieldList.hashCode()) * 31) + C786410Ut5.Z2(this.isUsing)) * 31) + C786410Ut5.Z2(this.isDisplayEnable)) * 31) + C786410Ut5.Z2(this.isChanged)) * 31) + C786410Ut5.Z2(this.supportAutoDisplay)) * 31;
        BillboardActivityInfo billboardActivityInfo = this.activityInfo;
        int iHashCode2 = (iHashCode + (billboardActivityInfo == null ? 0 : billboardActivityInfo.hashCode())) * 31;
        BillboardGiveawayInfo billboardGiveawayInfo = this.giveawayInfo;
        int iHashCode3 = (iHashCode2 + (billboardGiveawayInfo == null ? 0 : billboardGiveawayInfo.hashCode())) * 31;
        List<TemplateDecoration> list = this.templateDecorationList;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.useTime;
        return ((((iHashCode4 + (l != null ? l.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.isLiveTakeDefault)) * 31) + this.trackParams.hashCode();
    }

    public final String toString() {
        return "ProductTemplateItem(type=" + this.type + ", subType=" + this.subType + ", templateId=" + this.templateId + ", bgImgUrl=" + this.bgImgUrl + ", templateImgUrl=" + this.templateImgUrl + ", keyMessage=" + this.keyMessage + ", introduction=" + this.introduction + ", fieldList=" + this.fieldList + ", isUsing=" + this.isUsing + ", isDisplayEnable=" + this.isDisplayEnable + ", isChanged=" + this.isChanged + ", supportAutoDisplay=" + this.supportAutoDisplay + ", activityInfo=" + this.activityInfo + ", giveawayInfo=" + this.giveawayInfo + ", templateDecorationList=" + this.templateDecorationList + ", useTime=" + this.useTime + ", isLiveTakeDefault=" + this.isLiveTakeDefault + ", trackParams=" + this.trackParams + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.type);
        Integer num = this.subType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.templateId);
        parcel.writeString(this.bgImgUrl);
        parcel.writeString(this.templateImgUrl);
        parcel.writeString(this.keyMessage);
        parcel.writeString(this.introduction);
        List<TemplateField> list = this.fieldList;
        parcel.writeInt(list.size());
        Iterator<TemplateField> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isUsing ? 1 : 0);
        parcel.writeInt(this.isDisplayEnable ? 1 : 0);
        parcel.writeInt(this.isChanged ? 1 : 0);
        parcel.writeInt(this.supportAutoDisplay ? 1 : 0);
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
        } else {
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
        Long l = this.useTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.isLiveTakeDefault ? 1 : 0);
        this.trackParams.writeToParcel(parcel, i);
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem
    public final String Cc() {
        return this.introduction;
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem
    public final boolean LJJIZ() {
        return this.isChanged;
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem
    public final boolean PK() {
        return this.supportAutoDisplay;
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem
    public final String S3() {
        return this.keyMessage;
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem
    public final boolean Sm() {
        return this.isDisplayEnable;
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem
    public final List<TemplateField> T5() {
        return this.fieldList;
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem
    public final Long TA() {
        return this.useTime;
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem
    public final boolean b0() {
        return this.isUsing;
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem
    public final boolean fR() {
        return this.isLiveTakeDefault;
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem
    public final BillboardActivityInfo getActivityInfo() {
        return this.activityInfo;
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem
    public final Integer getSubType() {
        return this.subType;
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem
    public final String getTemplateId() {
        return this.templateId;
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem
    public final BillboardTrackParams getTrackParams() {
        return this.trackParams;
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem
    public final int getType() {
        return this.type;
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem
    public final String gy() {
        return this.bgImgUrl;
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem
    public final String kv() {
        return this.templateImgUrl;
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem
    public final List<TemplateDecoration> tc() {
        return this.templateDecorationList;
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem
    public final BillboardGiveawayInfo vI() {
        return this.giveawayInfo;
    }

    @Override // com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C1730000v7W.LIZ(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C1730000v7W.LIZIZ(this, interfaceC1891350zJl);
    }

    public static ProductTemplateItem LIZ(ProductTemplateItem productTemplateItem, String str, List list, boolean z, boolean z2, boolean z3, BillboardTrackParams billboardTrackParams, int i) {
        int i2;
        Integer num;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z4;
        BillboardActivityInfo billboardActivityInfo;
        BillboardGiveawayInfo billboardGiveawayInfo;
        List<TemplateDecoration> list2;
        BillboardTrackParams billboardTrackParams2 = billboardTrackParams;
        boolean z5 = z3;
        boolean z6 = z2;
        boolean z7 = z;
        List list3 = list;
        String str6 = str;
        boolean z8 = false;
        if ((i & 1) != 0) {
            i2 = productTemplateItem.type;
        } else {
            i2 = 0;
        }
        Long l = null;
        if ((i & 2) != 0) {
            num = productTemplateItem.subType;
        } else {
            num = null;
        }
        if ((i & 4) != 0) {
            str6 = productTemplateItem.templateId;
        }
        if ((i & 8) != 0) {
            str2 = productTemplateItem.bgImgUrl;
        } else {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str3 = productTemplateItem.templateImgUrl;
        } else {
            str3 = null;
        }
        if ((i & 32) != 0) {
            str4 = productTemplateItem.keyMessage;
        } else {
            str4 = null;
        }
        if ((i & 64) != 0) {
            str5 = productTemplateItem.introduction;
        } else {
            str5 = null;
        }
        if ((i & 128) != 0) {
            list3 = productTemplateItem.fieldList;
        }
        if ((i & 256) != 0) {
            z7 = productTemplateItem.isUsing;
        }
        if ((i & 512) != 0) {
            z6 = productTemplateItem.isDisplayEnable;
        }
        if ((i & 1024) != 0) {
            z4 = productTemplateItem.isChanged;
        } else {
            z4 = false;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z8 = productTemplateItem.supportAutoDisplay;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            billboardActivityInfo = productTemplateItem.activityInfo;
        } else {
            billboardActivityInfo = null;
        }
        if ((i & 8192) != 0) {
            billboardGiveawayInfo = productTemplateItem.giveawayInfo;
        } else {
            billboardGiveawayInfo = null;
        }
        if ((i & 16384) != 0) {
            list2 = productTemplateItem.templateDecorationList;
        } else {
            list2 = null;
        }
        if ((32768 & i) != 0) {
            l = productTemplateItem.useTime;
        }
        if ((65536 & i) != 0) {
            z5 = productTemplateItem.isLiveTakeDefault;
        }
        if ((i & 131072) != 0) {
            billboardTrackParams2 = productTemplateItem.trackParams;
        }
        productTemplateItem.getClass();
        return new ProductTemplateItem(i2, num, str6, str2, str3, str4, str5, list3, z7, z6, z4, z8, billboardActivityInfo, billboardGiveawayInfo, list2, l, z5, billboardTrackParams2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ProductTemplateItem(Integer num, String str, String str2, String str3, String str4, String str5, List list, boolean z, boolean z2, boolean z3, boolean z4, BillboardActivityInfo billboardActivityInfo, BillboardGiveawayInfo billboardGiveawayInfo, List list2, int i) {
        int i2;
        List list3 = list2;
        BillboardGiveawayInfo billboardGiveawayInfo2 = billboardGiveawayInfo;
        List list4 = list;
        boolean z5 = z4;
        boolean z6 = z3;
        boolean z7 = z2;
        boolean z8 = z;
        String str6 = str4;
        String str7 = str3;
        String str8 = str2;
        String str9 = str;
        BillboardActivityInfo billboardActivityInfo2 = billboardActivityInfo;
        Integer num2 = num;
        if ((i & 1) != 0) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        this(i2, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? "" : str9, (i & 8) != 0 ? "" : str8, (i & 16) != 0 ? "" : str7, (i & 32) != 0 ? "" : str6, (i & 64) == 0 ? str5 : "", (i & 128) != 0 ? C13BV.INSTANCE : list4, (i & 256) != 0 ? false : z8, (i & 512) != 0 ? false : z7, (i & 1024) != 0 ? false : z6, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? true : z5, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : billboardActivityInfo2, (i & 8192) != 0 ? null : billboardGiveawayInfo2, (i & 16384) != 0 ? null : list3, null, false, (i & 131072) != 0 ? new BillboardTrackParams(0) : null);
    }

    public ProductTemplateItem(int i, Integer num, String str, String str2, String str3, String str4, String str5, List<TemplateField> list, boolean z, boolean z2, boolean z3, boolean z4, BillboardActivityInfo billboardActivityInfo, BillboardGiveawayInfo billboardGiveawayInfo, List<TemplateDecoration> list2, Long l, boolean z5, BillboardTrackParams billboardTrackParams) {
        this.type = i;
        this.subType = num;
        this.templateId = str;
        this.bgImgUrl = str2;
        this.templateImgUrl = str3;
        this.keyMessage = str4;
        this.introduction = str5;
        this.fieldList = list;
        this.isUsing = z;
        this.isDisplayEnable = z2;
        this.isChanged = z3;
        this.supportAutoDisplay = z4;
        this.activityInfo = billboardActivityInfo;
        this.giveawayInfo = billboardGiveawayInfo;
        this.templateDecorationList = list2;
        this.useTime = l;
        this.isLiveTakeDefault = z5;
        this.trackParams = billboardTrackParams;
    }
}
