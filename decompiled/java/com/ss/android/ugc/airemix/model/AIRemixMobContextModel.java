package com.ss.android.ugc.airemix.model;

import X.AbstractC548720Lfa;
import X.C040H;
import X.C09CT;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC548750Lfd;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.airemix.model.AIRemixMobContextModel;
import com.ss.android.ugc.airemix.model.AIRemixUserData;
import com.ss.android.ugc.airemix.model.mob.datasource.AIRemixAwemeEntranceInfo;
import com.ss.android.ugc.airemix.model.mob.datasource.AIRemixCommonEntranceInfo;
import com.ss.android.ugc.airemix.model.mob.datasource.AIRemixConversationPageInfo;
import com.ss.android.ugc.airemix.model.mob.datasource.AIRemixCreationInputInfo;
import com.ss.android.ugc.airemix.model.mob.datasource.AIRemixOriginInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCItemCrtInfo;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIRemixMobContextModel extends AbstractC548720Lfa implements Parcelable {
    public static final Parcelable.Creator<AIRemixMobContextModel> CREATOR = new Parcelable.Creator<AIRemixMobContextModel>() { // from class: X.0Lfv
        @Override // android.os.Parcelable.Creator
        public final AIRemixMobContextModel createFromParcel(Parcel parcel) {
            AIRemixUserData aIRemixUserDataCreateFromParcel;
            AIRemixCommonEntranceInfo aIRemixCommonEntranceInfoCreateFromParcel = AIRemixCommonEntranceInfo.CREATOR.createFromParcel(parcel);
            AIRemixAwemeEntranceInfo aIRemixAwemeEntranceInfoCreateFromParcel = AIRemixAwemeEntranceInfo.CREATOR.createFromParcel(parcel);
            AIRemixOriginInfo aIRemixOriginInfoCreateFromParcel = AIRemixOriginInfo.CREATOR.createFromParcel(parcel);
            AIRemixConversationPageInfo aIRemixConversationPageInfoCreateFromParcel = AIRemixConversationPageInfo.CREATOR.createFromParcel(parcel);
            AIRemixCreationInputInfo aIRemixCreationInputInfoCreateFromParcel = AIRemixCreationInputInfo.CREATOR.createFromParcel(parcel);
            AIGCItemCrtInfo aIGCItemCrtInfo = (AIGCItemCrtInfo) parcel.readParcelable(AIRemixMobContextModel.class.getClassLoader());
            if (parcel.readInt() == 0) {
                aIRemixUserDataCreateFromParcel = null;
            } else {
                aIRemixUserDataCreateFromParcel = AIRemixUserData.CREATOR.createFromParcel(parcel);
            }
            return new AIRemixMobContextModel(aIRemixCommonEntranceInfoCreateFromParcel, aIRemixAwemeEntranceInfoCreateFromParcel, aIRemixOriginInfoCreateFromParcel, aIRemixConversationPageInfoCreateFromParcel, aIRemixCreationInputInfoCreateFromParcel, aIGCItemCrtInfo, aIRemixUserDataCreateFromParcel, 0L, -1L);
        }

        @Override // android.os.Parcelable.Creator
        public final AIRemixMobContextModel[] newArray(int i) {
            return new AIRemixMobContextModel[i];
        }
    };

    @C09CT("airemix_aweme_entrance_info")
    public AIRemixAwemeEntranceInfo aiRemixAwemeEntranceInfo;

    @C09CT("airemix_common_entrance_info")
    public AIRemixCommonEntranceInfo aiRemixCommonEntranceInfo;

    @C09CT("airemix_conversation_page_info")
    public AIRemixConversationPageInfo aiRemixConversationPageInfo;

    @C09CT("airemix_creation_input_info")
    public AIRemixCreationInputInfo aiRemixCreationInputInfo;

    @C09CT("airemix_origin_info")
    public AIRemixOriginInfo aiRemixOriginInfo;

    @C09CT("aigc_item_crt_info")
    public AIGCItemCrtInfo aigcItemCrtInfo;

    @C09CT("author")
    public AIRemixUserData author;

    @C040H
    public long clickTimestamp;

    @C040H
    public final String name;

    @C040H
    public long pagePopupDurationMs;

    public AIRemixMobContextModel() {
        this(new AIRemixCommonEntranceInfo(null, null, UUID.randomUUID().toString(), null, null, null), new AIRemixAwemeEntranceInfo(null, null, null, null), new AIRemixOriginInfo(null, null, null, null, null, null, null, null, null), new AIRemixConversationPageInfo(null, null, null), new AIRemixCreationInputInfo(0, null, null, null, Boolean.FALSE, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null), new AIGCItemCrtInfo(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null), null, 0L, -1L);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIRemixMobContextModel)) {
            return false;
        }
        AIRemixMobContextModel aIRemixMobContextModel = (AIRemixMobContextModel) obj;
        return Intrinsics.LJFF(this.aiRemixCommonEntranceInfo, aIRemixMobContextModel.aiRemixCommonEntranceInfo) && Intrinsics.LJFF(this.aiRemixAwemeEntranceInfo, aIRemixMobContextModel.aiRemixAwemeEntranceInfo) && Intrinsics.LJFF(this.aiRemixOriginInfo, aIRemixMobContextModel.aiRemixOriginInfo) && Intrinsics.LJFF(this.aiRemixConversationPageInfo, aIRemixMobContextModel.aiRemixConversationPageInfo) && Intrinsics.LJFF(this.aiRemixCreationInputInfo, aIRemixMobContextModel.aiRemixCreationInputInfo) && Intrinsics.LJFF(this.aigcItemCrtInfo, aIRemixMobContextModel.aigcItemCrtInfo) && Intrinsics.LJFF(this.author, aIRemixMobContextModel.author) && this.clickTimestamp == aIRemixMobContextModel.clickTimestamp && this.pagePopupDurationMs == aIRemixMobContextModel.pagePopupDurationMs;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.aiRemixCommonEntranceInfo.hashCode() * 31) + this.aiRemixAwemeEntranceInfo.hashCode()) * 31) + this.aiRemixOriginInfo.hashCode()) * 31) + this.aiRemixConversationPageInfo.hashCode()) * 31) + this.aiRemixCreationInputInfo.hashCode()) * 31) + this.aigcItemCrtInfo.hashCode()) * 31;
        AIRemixUserData aIRemixUserData = this.author;
        return ((((iHashCode + (aIRemixUserData == null ? 0 : aIRemixUserData.hashCode())) * 31) + C786410Ut5.Y2(this.clickTimestamp)) * 31) + C786410Ut5.Y2(this.pagePopupDurationMs);
    }

    @Override // X.AbstractC548720Lfa
    public final List<InterfaceC548750Lfd> provideDataSources() {
        return C1697810uHb.LJIIJJI(this.aiRemixCommonEntranceInfo, this.aiRemixAwemeEntranceInfo, this.aiRemixOriginInfo, this.aiRemixConversationPageInfo, this.aiRemixCreationInputInfo, this.aigcItemCrtInfo);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIRemixMobContextModel(aiRemixCommonEntranceInfo=");
        sbLIZ.append(this.aiRemixCommonEntranceInfo);
        sbLIZ.append(", aiRemixAwemeEntranceInfo=");
        sbLIZ.append(this.aiRemixAwemeEntranceInfo);
        sbLIZ.append(", aiRemixOriginInfo=");
        sbLIZ.append(this.aiRemixOriginInfo);
        sbLIZ.append(", aiRemixConversationPageInfo=");
        sbLIZ.append(this.aiRemixConversationPageInfo);
        sbLIZ.append(", aiRemixCreationInputInfo=");
        sbLIZ.append(this.aiRemixCreationInputInfo);
        sbLIZ.append(", aigcItemCrtInfo=");
        sbLIZ.append(this.aigcItemCrtInfo);
        sbLIZ.append(", author=");
        sbLIZ.append(this.author);
        sbLIZ.append(", clickTimestamp=");
        sbLIZ.append(this.clickTimestamp);
        sbLIZ.append(", pagePopupDurationMs=");
        sbLIZ.append(this.pagePopupDurationMs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.aiRemixCommonEntranceInfo.writeToParcel(parcel, i);
        this.aiRemixAwemeEntranceInfo.writeToParcel(parcel, i);
        this.aiRemixOriginInfo.writeToParcel(parcel, i);
        this.aiRemixConversationPageInfo.writeToParcel(parcel, i);
        this.aiRemixCreationInputInfo.writeToParcel(parcel, i);
        parcel.writeParcelable(this.aigcItemCrtInfo, i);
        AIRemixUserData aIRemixUserData = this.author;
        if (aIRemixUserData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aIRemixUserData.writeToParcel(parcel, i);
        }
    }

    @Override // X.InterfaceC548750Lfd
    public final String getName() {
        return this.name;
    }

    public static AIRemixMobContextModel LIZ(AIRemixMobContextModel aIRemixMobContextModel) {
        AIRemixCommonEntranceInfo aIRemixCommonEntranceInfo = aIRemixMobContextModel.aiRemixCommonEntranceInfo;
        AIRemixAwemeEntranceInfo aIRemixAwemeEntranceInfo = aIRemixMobContextModel.aiRemixAwemeEntranceInfo;
        AIRemixOriginInfo aIRemixOriginInfo = aIRemixMobContextModel.aiRemixOriginInfo;
        AIRemixConversationPageInfo aIRemixConversationPageInfo = aIRemixMobContextModel.aiRemixConversationPageInfo;
        AIRemixCreationInputInfo aIRemixCreationInputInfo = aIRemixMobContextModel.aiRemixCreationInputInfo;
        AIGCItemCrtInfo aIGCItemCrtInfo = aIRemixMobContextModel.aigcItemCrtInfo;
        AIRemixUserData aIRemixUserData = aIRemixMobContextModel.author;
        long j = aIRemixMobContextModel.clickTimestamp;
        long j2 = aIRemixMobContextModel.pagePopupDurationMs;
        aIRemixMobContextModel.getClass();
        return new AIRemixMobContextModel(aIRemixCommonEntranceInfo, aIRemixAwemeEntranceInfo, aIRemixOriginInfo, aIRemixConversationPageInfo, aIRemixCreationInputInfo, aIGCItemCrtInfo, aIRemixUserData, j, j2);
    }

    public AIRemixMobContextModel(AIRemixCommonEntranceInfo aIRemixCommonEntranceInfo, AIRemixAwemeEntranceInfo aIRemixAwemeEntranceInfo, AIRemixOriginInfo aIRemixOriginInfo, AIRemixConversationPageInfo aIRemixConversationPageInfo, AIRemixCreationInputInfo aIRemixCreationInputInfo, AIGCItemCrtInfo aIGCItemCrtInfo, AIRemixUserData aIRemixUserData, long j, long j2) {
        this.aiRemixCommonEntranceInfo = aIRemixCommonEntranceInfo;
        this.aiRemixAwemeEntranceInfo = aIRemixAwemeEntranceInfo;
        this.aiRemixOriginInfo = aIRemixOriginInfo;
        this.aiRemixConversationPageInfo = aIRemixConversationPageInfo;
        this.aiRemixCreationInputInfo = aIRemixCreationInputInfo;
        this.aigcItemCrtInfo = aIGCItemCrtInfo;
        this.author = aIRemixUserData;
        this.clickTimestamp = j;
        this.pagePopupDurationMs = j2;
        this.name = "AIRemixContextModel";
    }
}
