package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BasicPopUp;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.NoticeMessage;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.NoticeMessageUiConfig;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUpMessage;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RichBlock;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class NoticeMessage implements Parcelable {

    @C09CT("basic_pop_up")
    public final BasicPopUp basicPopUp;

    @C09CT("content")
    public final ECRichText content;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("notice_rich_blocks")
    public final List<RichBlock> descriptions;

    @C09CT("head_icon")
    public final Icon headIcon;

    @C09CT("notice_message_type")
    public final Integer noticeMessageType;

    @C09CT("pop_up_msg")
    public final PopUpMessage popUpMsg;

    @C09CT("title")
    public final ECRichText title;

    @C09CT("ui_config")
    public final NoticeMessageUiConfig uiConfig;
    public static final Parcelable.Creator<NoticeMessage> CREATOR = new Parcelable.Creator<NoticeMessage>() { // from class: X.0mgo
        @Override // android.os.Parcelable.Creator
        public final NoticeMessage createFromParcel(Parcel parcel) {
            PopUpMessage popUpMessageCreateFromParcel;
            BasicPopUp basicPopUpCreateFromParcel;
            Integer numValueOf;
            ArrayList arrayList;
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(NoticeMessage.class.getClassLoader());
            Icon icon = (Icon) parcel.readParcelable(NoticeMessage.class.getClassLoader());
            ECRichText eCRichText2 = (ECRichText) parcel.readParcelable(NoticeMessage.class.getClassLoader());
            NoticeMessageUiConfig noticeMessageUiConfigCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                popUpMessageCreateFromParcel = null;
            } else {
                popUpMessageCreateFromParcel = PopUpMessage.CREATOR.createFromParcel(parcel);
            }
            PopUpMessage popUpMessage = popUpMessageCreateFromParcel;
            if (parcel.readInt() == 0) {
                basicPopUpCreateFromParcel = null;
            } else {
                basicPopUpCreateFromParcel = BasicPopUp.CREATOR.createFromParcel(parcel);
            }
            BasicPopUp basicPopUp = basicPopUpCreateFromParcel;
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(RichBlock.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                noticeMessageUiConfigCreateFromParcel = NoticeMessageUiConfig.CREATOR.createFromParcel(parcel);
            }
            return new NoticeMessage(eCRichText, icon, eCRichText2, popUpMessage, basicPopUp, numValueOf, arrayList, noticeMessageUiConfigCreateFromParcel, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NoticeMessage[] newArray(int i) {
            return new NoticeMessage[i];
        }
    };
    public static final int $stable = 8;

    public NoticeMessage() {
        this(null, null, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeMessage)) {
            return false;
        }
        NoticeMessage noticeMessage = (NoticeMessage) obj;
        return Intrinsics.LJFF(this.title, noticeMessage.title) && Intrinsics.LJFF(this.headIcon, noticeMessage.headIcon) && Intrinsics.LJFF(this.content, noticeMessage.content) && Intrinsics.LJFF(this.popUpMsg, noticeMessage.popUpMsg) && Intrinsics.LJFF(this.basicPopUp, noticeMessage.basicPopUp) && Intrinsics.LJFF(this.noticeMessageType, noticeMessage.noticeMessageType) && Intrinsics.LJFF(this.descriptions, noticeMessage.descriptions) && Intrinsics.LJFF(this.uiConfig, noticeMessage.uiConfig) && Intrinsics.LJFF(this.daInfo, noticeMessage.daInfo);
    }

    public final int hashCode() {
        ECRichText eCRichText = this.title;
        int iHashCode = (eCRichText == null ? 0 : eCRichText.hashCode()) * 31;
        Icon icon = this.headIcon;
        int iHashCode2 = (iHashCode + (icon == null ? 0 : icon.hashCode())) * 31;
        ECRichText eCRichText2 = this.content;
        int iHashCode3 = (iHashCode2 + (eCRichText2 == null ? 0 : eCRichText2.hashCode())) * 31;
        PopUpMessage popUpMessage = this.popUpMsg;
        int iHashCode4 = (iHashCode3 + (popUpMessage == null ? 0 : popUpMessage.hashCode())) * 31;
        BasicPopUp basicPopUp = this.basicPopUp;
        int iHashCode5 = (iHashCode4 + (basicPopUp == null ? 0 : basicPopUp.hashCode())) * 31;
        Integer num = this.noticeMessageType;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        List<RichBlock> list = this.descriptions;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        NoticeMessageUiConfig noticeMessageUiConfig = this.uiConfig;
        int iHashCode8 = (iHashCode7 + (noticeMessageUiConfig == null ? 0 : noticeMessageUiConfig.hashCode())) * 31;
        String str = this.daInfo;
        return iHashCode8 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NoticeMessage(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", headIcon=");
        sbLIZ.append(this.headIcon);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", popUpMsg=");
        sbLIZ.append(this.popUpMsg);
        sbLIZ.append(", basicPopUp=");
        sbLIZ.append(this.basicPopUp);
        sbLIZ.append(", noticeMessageType=");
        sbLIZ.append(this.noticeMessageType);
        sbLIZ.append(", descriptions=");
        sbLIZ.append(this.descriptions);
        sbLIZ.append(", uiConfig=");
        sbLIZ.append(this.uiConfig);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.title, i);
        parcel.writeParcelable(this.headIcon, i);
        parcel.writeParcelable(this.content, i);
        PopUpMessage popUpMessage = this.popUpMsg;
        if (popUpMessage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            popUpMessage.writeToParcel(parcel, i);
        }
        BasicPopUp basicPopUp = this.basicPopUp;
        if (basicPopUp == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            basicPopUp.writeToParcel(parcel, i);
        }
        Integer num = this.noticeMessageType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        List<RichBlock> list = this.descriptions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<RichBlock> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        NoticeMessageUiConfig noticeMessageUiConfig = this.uiConfig;
        if (noticeMessageUiConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            noticeMessageUiConfig.writeToParcel(parcel, i);
        }
        parcel.writeString(this.daInfo);
    }

    public NoticeMessage(ECRichText eCRichText, Icon icon, ECRichText eCRichText2, PopUpMessage popUpMessage, BasicPopUp basicPopUp, Integer num, List<RichBlock> list, NoticeMessageUiConfig noticeMessageUiConfig, String str) {
        this.title = eCRichText;
        this.headIcon = icon;
        this.content = eCRichText2;
        this.popUpMsg = popUpMessage;
        this.basicPopUp = basicPopUp;
        this.noticeMessageType = num;
        this.descriptions = list;
        this.uiConfig = noticeMessageUiConfig;
        this.daInfo = str;
    }
}
