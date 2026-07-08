package com.ss.android.ugc.aweme.creative.model.aichat;

import X.C09CT;
import X.C2188811AlT;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenChatRoomModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenConsumptionModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class AIChatGenModel implements Parcelable {
    public static final Parcelable.Creator<AIChatGenModel> CREATOR = new Parcelable.Creator<AIChatGenModel>() { // from class: X.18T0
        @Override // android.os.Parcelable.Creator
        public final AIChatGenModel createFromParcel(Parcel parcel) {
            AIChatGenChatRoomModel aIChatGenChatRoomModelCreateFromParcel;
            AIChatGenConsumptionModel aIChatGenConsumptionModelCreateFromParcel;
            AIChatGenNode aIChatGenNodeCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                aIChatGenChatRoomModelCreateFromParcel = null;
            } else {
                aIChatGenChatRoomModelCreateFromParcel = AIChatGenChatRoomModel.CREATOR.createFromParcel(parcel);
            }
            AIChatGenChatRoomModel aIChatGenChatRoomModel = aIChatGenChatRoomModelCreateFromParcel;
            if (parcel.readInt() == 0) {
                aIChatGenConsumptionModelCreateFromParcel = null;
            } else {
                aIChatGenConsumptionModelCreateFromParcel = AIChatGenConsumptionModel.CREATOR.createFromParcel(parcel);
            }
            AIChatGenConsumptionModel aIChatGenConsumptionModel = aIChatGenConsumptionModelCreateFromParcel;
            if (parcel.readInt() != 0) {
                aIChatGenNodeCreateFromParcel = AIChatGenNode.CREATOR.createFromParcel(parcel);
            }
            return new AIChatGenModel(aIChatGenChatRoomModel, aIChatGenConsumptionModel, aIChatGenNodeCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AIChatGenModel[] newArray(int i) {
            return new AIChatGenModel[i];
        }
    };

    @C09CT("chat_room_model")
    public AIChatGenChatRoomModel chatRoomModel;

    @C09CT("consumption_model")
    public final AIChatGenConsumptionModel consumptionModel;

    @C09CT("post_node")
    public AIChatGenNode postAIChatGenNode;

    /* JADX WARN: Multi-variable type inference failed */
    public AIChatGenModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIChatGenModel)) {
            return false;
        }
        AIChatGenModel aIChatGenModel = (AIChatGenModel) obj;
        return Intrinsics.LJFF(this.chatRoomModel, aIChatGenModel.chatRoomModel) && Intrinsics.LJFF(this.consumptionModel, aIChatGenModel.consumptionModel) && Intrinsics.LJFF(this.postAIChatGenNode, aIChatGenModel.postAIChatGenNode);
    }

    public final int hashCode() {
        AIChatGenChatRoomModel aIChatGenChatRoomModel = this.chatRoomModel;
        int iHashCode = (aIChatGenChatRoomModel == null ? 0 : aIChatGenChatRoomModel.hashCode()) * 31;
        AIChatGenConsumptionModel aIChatGenConsumptionModel = this.consumptionModel;
        int iHashCode2 = (iHashCode + (aIChatGenConsumptionModel == null ? 0 : aIChatGenConsumptionModel.hashCode())) * 31;
        AIChatGenNode aIChatGenNode = this.postAIChatGenNode;
        return iHashCode2 + (aIChatGenNode != null ? aIChatGenNode.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIChatGenModel(chatRoomModel=");
        sbLIZ.append(this.chatRoomModel);
        sbLIZ.append(", consumptionModel=");
        sbLIZ.append(this.consumptionModel);
        sbLIZ.append(", postAIChatGenNode=");
        sbLIZ.append(this.postAIChatGenNode);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AIChatGenChatRoomModel aIChatGenChatRoomModel = this.chatRoomModel;
        if (aIChatGenChatRoomModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aIChatGenChatRoomModel.writeToParcel(parcel, i);
        }
        AIChatGenConsumptionModel aIChatGenConsumptionModel = this.consumptionModel;
        if (aIChatGenConsumptionModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aIChatGenConsumptionModel.writeToParcel(parcel, i);
        }
        AIChatGenNode aIChatGenNode = this.postAIChatGenNode;
        if (aIChatGenNode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aIChatGenNode.writeToParcel(parcel, i);
        }
    }

    public AIChatGenModel(AIChatGenChatRoomModel aIChatGenChatRoomModel, AIChatGenConsumptionModel aIChatGenConsumptionModel, AIChatGenNode aIChatGenNode) {
        this.chatRoomModel = aIChatGenChatRoomModel;
        this.consumptionModel = aIChatGenConsumptionModel;
        this.postAIChatGenNode = aIChatGenNode;
    }

    public /* synthetic */ AIChatGenModel(AIChatGenChatRoomModel aIChatGenChatRoomModel, AIChatGenConsumptionModel aIChatGenConsumptionModel, AIChatGenNode aIChatGenNode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : aIChatGenChatRoomModel, (i & 2) != 0 ? null : aIChatGenConsumptionModel, (i & 4) != 0 ? null : aIChatGenNode);
    }
}
