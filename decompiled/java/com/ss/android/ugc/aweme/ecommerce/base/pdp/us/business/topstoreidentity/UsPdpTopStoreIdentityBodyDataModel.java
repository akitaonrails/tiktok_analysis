package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.topstoreidentity;

import X.C033W;
import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC718502rH;
import X.InterfaceC746802vq;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LiveInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.topstoreidentity.UsPdpTopStoreIdentityBodyDataModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class UsPdpTopStoreIdentityBodyDataModel implements Parcelable, InterfaceC718502rH {

    @C09CT("avatar_image")
    public final Image avatarImage;

    @C09CT("btm")
    public final String btm;

    @C09CT("da_info")
    public final String daInfo;

    @C09CT("jump_schema")
    public final String jumpSchema;

    @C09CT("jump_schema_track_params")
    public final String jumpSchemaTrackParams;

    @C09CT("live_info")
    public final LiveInfo liveInfo;

    @C09CT("live_info_btm")
    public final String liveInfoBtm;

    @C09CT("subtitle")
    public final ECRichText subtitle;

    @C09CT("title")
    public final ECRichText title;

    @C09CT("trailing_icon")
    public final String trailingIcon;
    public static final Parcelable.Creator<UsPdpTopStoreIdentityBodyDataModel> CREATOR = new Parcelable.Creator<UsPdpTopStoreIdentityBodyDataModel>() { // from class: X.02wp
        @Override // android.os.Parcelable.Creator
        public final UsPdpTopStoreIdentityBodyDataModel createFromParcel(Parcel parcel) {
            LiveInfo liveInfoCreateFromParcel;
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(UsPdpTopStoreIdentityBodyDataModel.class.getClassLoader());
            ECRichText eCRichText2 = (ECRichText) parcel.readParcelable(UsPdpTopStoreIdentityBodyDataModel.class.getClassLoader());
            Image image = (Image) parcel.readParcelable(UsPdpTopStoreIdentityBodyDataModel.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                liveInfoCreateFromParcel = null;
            } else {
                liveInfoCreateFromParcel = LiveInfo.CREATOR.createFromParcel(parcel);
            }
            return new UsPdpTopStoreIdentityBodyDataModel(eCRichText, eCRichText2, image, string, string2, string3, string4, string5, string6, liveInfoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final UsPdpTopStoreIdentityBodyDataModel[] newArray(int i) {
            return new UsPdpTopStoreIdentityBodyDataModel[i];
        }
    };
    public static final int $stable = 8;

    public UsPdpTopStoreIdentityBodyDataModel() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsPdpTopStoreIdentityBodyDataModel)) {
            return false;
        }
        UsPdpTopStoreIdentityBodyDataModel usPdpTopStoreIdentityBodyDataModel = (UsPdpTopStoreIdentityBodyDataModel) obj;
        return Intrinsics.LJFF(this.title, usPdpTopStoreIdentityBodyDataModel.title) && Intrinsics.LJFF(this.subtitle, usPdpTopStoreIdentityBodyDataModel.subtitle) && Intrinsics.LJFF(this.avatarImage, usPdpTopStoreIdentityBodyDataModel.avatarImage) && Intrinsics.LJFF(this.trailingIcon, usPdpTopStoreIdentityBodyDataModel.trailingIcon) && Intrinsics.LJFF(this.jumpSchema, usPdpTopStoreIdentityBodyDataModel.jumpSchema) && Intrinsics.LJFF(this.jumpSchemaTrackParams, usPdpTopStoreIdentityBodyDataModel.jumpSchemaTrackParams) && Intrinsics.LJFF(this.daInfo, usPdpTopStoreIdentityBodyDataModel.daInfo) && Intrinsics.LJFF(this.btm, usPdpTopStoreIdentityBodyDataModel.btm) && Intrinsics.LJFF(this.liveInfoBtm, usPdpTopStoreIdentityBodyDataModel.liveInfoBtm) && Intrinsics.LJFF(this.liveInfo, usPdpTopStoreIdentityBodyDataModel.liveInfo);
    }

    public final int hashCode() {
        ECRichText eCRichText = this.title;
        int iHashCode = (eCRichText == null ? 0 : eCRichText.hashCode()) * 31;
        ECRichText eCRichText2 = this.subtitle;
        int iHashCode2 = (iHashCode + (eCRichText2 == null ? 0 : eCRichText2.hashCode())) * 31;
        Image image = this.avatarImage;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        String str = this.trailingIcon;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.jumpSchema;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.jumpSchemaTrackParams;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.daInfo;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.btm;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.liveInfoBtm;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        LiveInfo liveInfo = this.liveInfo;
        return iHashCode9 + (liveInfo != null ? liveInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UsPdpTopStoreIdentityBodyDataModel(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", subtitle=");
        sbLIZ.append(this.subtitle);
        sbLIZ.append(", avatarImage=");
        sbLIZ.append(this.avatarImage);
        sbLIZ.append(", trailingIcon=");
        sbLIZ.append(this.trailingIcon);
        sbLIZ.append(", jumpSchema=");
        sbLIZ.append(this.jumpSchema);
        sbLIZ.append(", jumpSchemaTrackParams=");
        sbLIZ.append(this.jumpSchemaTrackParams);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(", btm=");
        sbLIZ.append(this.btm);
        sbLIZ.append(", liveInfoBtm=");
        sbLIZ.append(this.liveInfoBtm);
        sbLIZ.append(", liveInfo=");
        sbLIZ.append(this.liveInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.title, i);
        parcel.writeParcelable(this.subtitle, i);
        parcel.writeParcelable(this.avatarImage, i);
        parcel.writeString(this.trailingIcon);
        parcel.writeString(this.jumpSchema);
        parcel.writeString(this.jumpSchemaTrackParams);
        parcel.writeString(this.daInfo);
        parcel.writeString(this.btm);
        parcel.writeString(this.liveInfoBtm);
        LiveInfo liveInfo = this.liveInfo;
        if (liveInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            liveInfo.writeToParcel(parcel, i);
        }
    }

    @Override // X.InterfaceC718502rH
    public final List<InterfaceC746802vq> LIZ(C033W c033w) {
        return Collections.singletonList(new UsPdpTopStoreIdentityModuleVO(this.title, this.subtitle, this.avatarImage, this.trailingIcon, this.jumpSchema, this.jumpSchemaTrackParams, this.daInfo, this.btm, this.liveInfoBtm, this.liveInfo));
    }

    public UsPdpTopStoreIdentityBodyDataModel(ECRichText eCRichText, ECRichText eCRichText2, Image image, String str, String str2, String str3, String str4, String str5, String str6, LiveInfo liveInfo) {
        this.title = eCRichText;
        this.subtitle = eCRichText2;
        this.avatarImage = image;
        this.trailingIcon = str;
        this.jumpSchema = str2;
        this.jumpSchemaTrackParams = str3;
        this.daInfo = str4;
        this.btm = str5;
        this.liveInfoBtm = str6;
        this.liveInfo = liveInfo;
    }
}
