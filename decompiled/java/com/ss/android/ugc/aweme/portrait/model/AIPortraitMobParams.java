package com.ss.android.ugc.aweme.portrait.model;

import X.AbstractC553040LmY;
import X.C040H;
import X.C09CT;
import X.C1E4I;
import X.C1E4M;
import X.C1E4N;
import X.C1E4O;
import X.C2275371E4h;
import X.C786410Ut5;
import X.EnumC1419230n2H;
import X.EnumC550430LiL;
import X.EnumC570120MXq;
import X.InterfaceC548900Lfs;
import X.InterfaceC553020LmW;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitMobParams;
import com.ss.android.ugc.aweme.portrait.model.RefImageType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIPortraitMobParams extends AbstractC553040LmY implements Parcelable {
    public static final Parcelable.Creator<AIPortraitMobParams> CREATOR = new Parcelable.Creator<AIPortraitMobParams>() { // from class: X.0LiK
        @Override // android.os.Parcelable.Creator
        public final AIPortraitMobParams createFromParcel(Parcel parcel) {
            EnumC1419230n2H enumC1419230n2HValueOf;
            EnumC570120MXq enumC570120MXqValueOf;
            RefImageType refImageTypeCreateFromParcel;
            boolean z;
            String string = parcel.readString();
            EnumC550430LiL enumC550430LiLValueOf = null;
            if (parcel.readInt() == 0) {
                enumC1419230n2HValueOf = null;
            } else {
                enumC1419230n2HValueOf = EnumC1419230n2H.valueOf(parcel.readString());
            }
            if (parcel.readInt() == 0) {
                enumC570120MXqValueOf = null;
            } else {
                enumC570120MXqValueOf = EnumC570120MXq.valueOf(parcel.readString());
            }
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                refImageTypeCreateFromParcel = null;
            } else {
                refImageTypeCreateFromParcel = RefImageType.CREATOR.createFromParcel(parcel);
            }
            RefImageType refImageType = refImageTypeCreateFromParcel;
            if (parcel.readInt() != 0) {
                enumC550430LiLValueOf = EnumC550430LiL.valueOf(parcel.readString());
            }
            int i = parcel.readInt();
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            return new AIPortraitMobParams(string, enumC1419230n2HValueOf, enumC570120MXqValueOf, string2, refImageType, enumC550430LiLValueOf, i, string3, z, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AIPortraitMobParams[] newArray(int i) {
            return new AIPortraitMobParams[i];
        }
    };

    @InterfaceC553020LmW
    @C09CT("action_type")
    public final String actionType;

    @InterfaceC553020LmW
    @C09CT("entrance_ai_portrait_template_id")
    public final String entranceTemplateId;

    @InterfaceC553020LmW
    @C09CT("entrance_ai_portrait_template_pos")
    public final EnumC570120MXq entranceTemplatePos;

    @C09CT("entrance_ai_portrait_template_status")
    public final String entranceTemplateStatus;

    @InterfaceC553020LmW
    @C09CT("entrance_ai_portrait_template_type")
    public final EnumC1419230n2H entranceTemplateType;

    @InterfaceC553020LmW
    @C09CT("is_ref_img")
    public final RefImageType isRefImg;

    @InterfaceC553020LmW
    @C09CT("is_retry")
    public boolean isRetry;

    @C040H
    public final String name;

    @C09CT("ori_tpl_pos")
    public final String oriTplPos;

    @C09CT("ori_tpl_tp")
    public final String oriTplTp;

    @InterfaceC553020LmW
    @C09CT("prompt_length")
    public final int promptLength;

    @InterfaceC553020LmW
    @C09CT("prompt_source")
    public final EnumC550430LiL promptSource;

    public AIPortraitMobParams() {
        this("", null, null, null, null, null, 0, "", false, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIPortraitMobParams)) {
            return false;
        }
        AIPortraitMobParams aIPortraitMobParams = (AIPortraitMobParams) obj;
        return Intrinsics.LJFF(this.entranceTemplateId, aIPortraitMobParams.entranceTemplateId) && this.entranceTemplateType == aIPortraitMobParams.entranceTemplateType && this.entranceTemplatePos == aIPortraitMobParams.entranceTemplatePos && Intrinsics.LJFF(this.entranceTemplateStatus, aIPortraitMobParams.entranceTemplateStatus) && this.isRefImg == aIPortraitMobParams.isRefImg && this.promptSource == aIPortraitMobParams.promptSource && this.promptLength == aIPortraitMobParams.promptLength && Intrinsics.LJFF(this.actionType, aIPortraitMobParams.actionType) && this.isRetry == aIPortraitMobParams.isRetry && Intrinsics.LJFF(this.oriTplTp, aIPortraitMobParams.oriTplTp) && Intrinsics.LJFF(this.oriTplPos, aIPortraitMobParams.oriTplPos);
    }

    public final int hashCode() {
        int iHashCode = this.entranceTemplateId.hashCode() * 31;
        EnumC1419230n2H enumC1419230n2H = this.entranceTemplateType;
        int iHashCode2 = (iHashCode + (enumC1419230n2H == null ? 0 : enumC1419230n2H.hashCode())) * 31;
        EnumC570120MXq enumC570120MXq = this.entranceTemplatePos;
        int iHashCode3 = (iHashCode2 + (enumC570120MXq == null ? 0 : enumC570120MXq.hashCode())) * 31;
        String str = this.entranceTemplateStatus;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        RefImageType refImageType = this.isRefImg;
        int iHashCode5 = (iHashCode4 + (refImageType == null ? 0 : refImageType.hashCode())) * 31;
        EnumC550430LiL enumC550430LiL = this.promptSource;
        int iHashCode6 = (((((((iHashCode5 + (enumC550430LiL == null ? 0 : enumC550430LiL.hashCode())) * 31) + this.promptLength) * 31) + this.actionType.hashCode()) * 31) + C786410Ut5.Z2(this.isRetry)) * 31;
        String str2 = this.oriTplTp;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.oriTplPos;
        return iHashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "AIPortraitMobParams(entranceTemplateId=" + this.entranceTemplateId + ", entranceTemplateType=" + this.entranceTemplateType + ", entranceTemplatePos=" + this.entranceTemplatePos + ", entranceTemplateStatus=" + this.entranceTemplateStatus + ", isRefImg=" + this.isRefImg + ", promptSource=" + this.promptSource + ", promptLength=" + this.promptLength + ", actionType=" + this.actionType + ", isRetry=" + this.isRetry + ", oriTplTp=" + this.oriTplTp + ", oriTplPos=" + this.oriTplPos + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.entranceTemplateId);
        EnumC1419230n2H enumC1419230n2H = this.entranceTemplateType;
        if (enumC1419230n2H == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(enumC1419230n2H.name());
        }
        EnumC570120MXq enumC570120MXq = this.entranceTemplatePos;
        if (enumC570120MXq == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(enumC570120MXq.name());
        }
        parcel.writeString(this.entranceTemplateStatus);
        RefImageType refImageType = this.isRefImg;
        if (refImageType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            refImageType.writeToParcel(parcel, i);
        }
        EnumC550430LiL enumC550430LiL = this.promptSource;
        if (enumC550430LiL == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(enumC550430LiL.name());
        }
        parcel.writeInt(this.promptLength);
        parcel.writeString(this.actionType);
        parcel.writeInt(this.isRetry ? 1 : 0);
        parcel.writeString(this.oriTplTp);
        parcel.writeString(this.oriTplPos);
    }

    @Override // X.InterfaceC548750Lfd
    public final String getName() {
        return this.name;
    }

    @Override // X.AbstractC553040LmY, X.InterfaceC548750Lfd
    public final <T> T getValue(InterfaceC548900Lfs<T> interfaceC548900Lfs) {
        T t;
        if (interfaceC548900Lfs instanceof C2275371E4h) {
            EnumC550430LiL enumC550430LiL = this.promptSource;
            if (enumC550430LiL == null || (t = (T) enumC550430LiL.getValue()) == null) {
                return null;
            }
            return t;
        }
        if (interfaceC548900Lfs instanceof C1E4M) {
            t = (T) this.entranceTemplateId;
            if (t == null) {
                return null;
            }
        } else if (interfaceC548900Lfs instanceof C1E4N) {
            EnumC570120MXq enumC570120MXq = this.entranceTemplatePos;
            if (enumC570120MXq == null || (t = (T) enumC570120MXq.getValue()) == null) {
                return null;
            }
        } else if (interfaceC548900Lfs instanceof C1E4O) {
            EnumC1419230n2H enumC1419230n2H = this.entranceTemplateType;
            if (enumC1419230n2H == null || (t = (T) enumC1419230n2H.getValue()) == null) {
                return null;
            }
        } else if (interfaceC548900Lfs instanceof C1E4I) {
            RefImageType refImageType = this.isRefImg;
            if (refImageType == null || (t = (T) Integer.valueOf(refImageType.getValue())) == null) {
                return null;
            }
        } else {
            return (T) super.getValue(interfaceC548900Lfs);
        }
        return t;
    }

    public AIPortraitMobParams(String str, EnumC1419230n2H enumC1419230n2H, EnumC570120MXq enumC570120MXq, String str2, RefImageType refImageType, EnumC550430LiL enumC550430LiL, int i, String str3, boolean z, String str4, String str5) {
        this.entranceTemplateId = str;
        this.entranceTemplateType = enumC1419230n2H;
        this.entranceTemplatePos = enumC570120MXq;
        this.entranceTemplateStatus = str2;
        this.isRefImg = refImageType;
        this.promptSource = enumC550430LiL;
        this.promptLength = i;
        this.actionType = str3;
        this.isRetry = z;
        this.oriTplTp = str4;
        this.oriTplPos = str5;
        this.name = "AIPortraitMobParams";
    }
}
