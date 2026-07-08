package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.topstoreidentity;

import X.C04DV;
import X.C04DW;
import X.C04FN;
import X.C2188811AlT;
import X.C703902ov;
import X.InterfaceC1891350zJl;
import X.InterfaceC746802vq;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LiveInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.topstoreidentity.UsPdpTopStoreIdentityModuleVO;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class UsPdpTopStoreIdentityModuleVO implements Parcelable, InterfaceC746802vq, C04DW, C04DV {
    public final Image avatarImage;
    public final String btm;
    public final String daInfo;
    public C04FN goda2Node;
    public String godaGroupId;
    public String godaNodeId;
    public final String jumpSchema;
    public final String jumpSchemaTrackParams;
    public final LiveInfo liveInfo;
    public final String liveInfoBtm;
    public final ECRichText subtitle;
    public final ECRichText title;
    public final String trailingIcon;
    public static final Parcelable.Creator<UsPdpTopStoreIdentityModuleVO> CREATOR = new Parcelable.Creator<UsPdpTopStoreIdentityModuleVO>() { // from class: X.02wq
        @Override // android.os.Parcelable.Creator
        public final UsPdpTopStoreIdentityModuleVO createFromParcel(Parcel parcel) {
            LiveInfo liveInfoCreateFromParcel;
            ECRichText eCRichText = (ECRichText) parcel.readParcelable(UsPdpTopStoreIdentityModuleVO.class.getClassLoader());
            ECRichText eCRichText2 = (ECRichText) parcel.readParcelable(UsPdpTopStoreIdentityModuleVO.class.getClassLoader());
            Image image = (Image) parcel.readParcelable(UsPdpTopStoreIdentityModuleVO.class.getClassLoader());
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
            return new UsPdpTopStoreIdentityModuleVO(eCRichText, eCRichText2, image, string, string2, string3, string4, string5, string6, liveInfoCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final UsPdpTopStoreIdentityModuleVO[] newArray(int i) {
            return new UsPdpTopStoreIdentityModuleVO[i];
        }
    };
    public static final int $stable = 8;

    public UsPdpTopStoreIdentityModuleVO() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsPdpTopStoreIdentityModuleVO)) {
            return false;
        }
        UsPdpTopStoreIdentityModuleVO usPdpTopStoreIdentityModuleVO = (UsPdpTopStoreIdentityModuleVO) obj;
        return Intrinsics.LJFF(this.title, usPdpTopStoreIdentityModuleVO.title) && Intrinsics.LJFF(this.subtitle, usPdpTopStoreIdentityModuleVO.subtitle) && Intrinsics.LJFF(this.avatarImage, usPdpTopStoreIdentityModuleVO.avatarImage) && Intrinsics.LJFF(this.trailingIcon, usPdpTopStoreIdentityModuleVO.trailingIcon) && Intrinsics.LJFF(this.jumpSchema, usPdpTopStoreIdentityModuleVO.jumpSchema) && Intrinsics.LJFF(this.jumpSchemaTrackParams, usPdpTopStoreIdentityModuleVO.jumpSchemaTrackParams) && Intrinsics.LJFF(this.daInfo, usPdpTopStoreIdentityModuleVO.daInfo) && Intrinsics.LJFF(this.btm, usPdpTopStoreIdentityModuleVO.btm) && Intrinsics.LJFF(this.liveInfoBtm, usPdpTopStoreIdentityModuleVO.liveInfoBtm) && Intrinsics.LJFF(this.liveInfo, usPdpTopStoreIdentityModuleVO.liveInfo);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC746802vq
    public final String getItemId() {
        return null;
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
        sbLIZ.append("UsPdpTopStoreIdentityModuleVO(title=");
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

    @Override // X.C04DV
    public final C04FN LJIIIIZZ() {
        return this.goda2Node;
    }

    @Override // X.C04DW
    public final String getGodaNodeId() {
        return this.godaNodeId;
    }

    public /* synthetic */ UsPdpTopStoreIdentityModuleVO(int i) {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    @Override // X.C04DV
    public final void LIZIZ(C04FN c04fn) {
        this.goda2Node = c04fn;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C703902ov.LIZ(this, interfaceC1891350zJl);
    }

    @Override // X.C04DW
    public final void setGodaGroupId(String str) {
        this.godaGroupId = str;
    }

    @Override // X.C04DW
    public final void setGodaNodeId(String str) {
        this.godaNodeId = str;
    }

    public UsPdpTopStoreIdentityModuleVO(ECRichText eCRichText, ECRichText eCRichText2, Image image, String str, String str2, String str3, String str4, String str5, String str6, LiveInfo liveInfo) {
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
        this.godaGroupId = "undefined";
        this.godaNodeId = "undefined";
    }
}
