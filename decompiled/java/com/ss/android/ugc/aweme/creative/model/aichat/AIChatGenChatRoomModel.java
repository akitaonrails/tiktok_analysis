package com.ss.android.ugc.aweme.creative.model.aichat;

import X.C040H;
import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenChatRoomModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class AIChatGenChatRoomModel implements Parcelable {
    public static final Parcelable.Creator<AIChatGenChatRoomModel> CREATOR = new Parcelable.Creator<AIChatGenChatRoomModel>() { // from class: X.0wUE
        @Override // android.os.Parcelable.Creator
        public final AIChatGenChatRoomModel createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i = parcel.readInt();
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
            return new AIChatGenChatRoomModel(string, string2, string3, string4, string5, string6, i, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final AIChatGenChatRoomModel[] newArray(int i) {
            return new AIChatGenChatRoomModel[i];
        }
    };

    @C09CT("conversation_id")
    public final String conversationId;

    @C09CT("creation_id")
    public final String creationId;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("enter_method")
    public final String enterMethod;

    @C09CT("entrance_type")
    public final String entranceType;

    @C040H
    public Boolean isNewUser;

    @C09CT("quota")
    public int quota;

    @C09CT("shoot_way")
    public final String shootWay;

    /* JADX WARN: Multi-variable type inference failed */
    public AIChatGenChatRoomModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 255, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIChatGenChatRoomModel)) {
            return false;
        }
        AIChatGenChatRoomModel aIChatGenChatRoomModel = (AIChatGenChatRoomModel) obj;
        return Intrinsics.LJFF(this.entranceType, aIChatGenChatRoomModel.entranceType) && Intrinsics.LJFF(this.shootWay, aIChatGenChatRoomModel.shootWay) && Intrinsics.LJFF(this.enterMethod, aIChatGenChatRoomModel.enterMethod) && Intrinsics.LJFF(this.enterFrom, aIChatGenChatRoomModel.enterFrom) && Intrinsics.LJFF(this.conversationId, aIChatGenChatRoomModel.conversationId) && Intrinsics.LJFF(this.creationId, aIChatGenChatRoomModel.creationId) && this.quota == aIChatGenChatRoomModel.quota && Intrinsics.LJFF(this.isNewUser, aIChatGenChatRoomModel.isNewUser);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.entranceType.hashCode() * 31) + this.shootWay.hashCode()) * 31) + this.enterMethod.hashCode()) * 31) + this.enterFrom.hashCode()) * 31) + this.conversationId.hashCode()) * 31) + this.creationId.hashCode()) * 31) + this.quota) * 31;
        Boolean bool = this.isNewUser;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIChatGenChatRoomModel(entranceType=");
        sbLIZ.append(this.entranceType);
        sbLIZ.append(", shootWay=");
        sbLIZ.append(this.shootWay);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.enterMethod);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.conversationId);
        sbLIZ.append(", creationId=");
        sbLIZ.append(this.creationId);
        sbLIZ.append(", quota=");
        sbLIZ.append(this.quota);
        sbLIZ.append(", isNewUser=");
        sbLIZ.append(this.isNewUser);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ?? BooleanValue;
        parcel.writeString(this.entranceType);
        parcel.writeString(this.shootWay);
        parcel.writeString(this.enterMethod);
        parcel.writeString(this.enterFrom);
        parcel.writeString(this.conversationId);
        parcel.writeString(this.creationId);
        parcel.writeInt(this.quota);
        Boolean bool = this.isNewUser;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    public AIChatGenChatRoomModel(String str, String str2, String str3, String str4, String str5, String str6, int i, Boolean bool) {
        this.entranceType = str;
        this.shootWay = str2;
        this.enterMethod = str3;
        this.enterFrom = str4;
        this.conversationId = str5;
        this.creationId = str6;
        this.quota = i;
        this.isNewUser = bool;
    }

    public /* synthetic */ AIChatGenChatRoomModel(String str, String str2, String str3, String str4, String str5, String str6, int i, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) == 0 ? str6 : "", (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? null : bool);
    }
}
