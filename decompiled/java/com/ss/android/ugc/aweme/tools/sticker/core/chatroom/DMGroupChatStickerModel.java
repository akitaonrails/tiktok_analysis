package com.ss.android.ugc.aweme.tools.sticker.core.chatroom;

import X.AbstractC1442160ndG;
import X.C040H;
import X.C08A4;
import X.C09CT;
import X.C0FKI;
import X.C123100dR;
import X.C1440500naa;
import X.C19591311kt;
import X.C19620011pW;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1466150oFx;
import X.EnumC19620411pa;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.groupchat.DMGroupChatStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerGroupInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerModel;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes30.dex */
public final class DMGroupChatStickerModel implements StickerModel, Parcelable, Serializable {

    @C09CT("base_sticker_model")
    public final BaseStickerModel baseStickerModel;

    @C09CT("event_tracking")
    public final Map<String, String> eventTracking;

    @C09CT("group_info")
    public final DMGroupChatStickerGroupInfo groupInfo;

    @C040H
    public final boolean isAutoAdded;

    @C09CT("ui_style")
    public final int uiStyle;

    @C09CT("use_new_tool_tip")
    public final boolean useNewToolTip;
    public static final C19620011pW Companion = new Object() { // from class: X.11pW
    };
    public static final Parcelable.Creator<DMGroupChatStickerModel> CREATOR = new Parcelable.Creator<DMGroupChatStickerModel>() { // from class: X.0oG9
        @Override // android.os.Parcelable.Creator
        public final DMGroupChatStickerModel createFromParcel(Parcel parcel) {
            DMGroupChatStickerGroupInfo dMGroupChatStickerGroupInfoCreateFromParcel;
            boolean z;
            boolean z2;
            BaseStickerModel baseStickerModelCreateFromParcel = BaseStickerModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                dMGroupChatStickerGroupInfoCreateFromParcel = null;
            } else {
                dMGroupChatStickerGroupInfoCreateFromParcel = DMGroupChatStickerGroupInfo.CREATOR.createFromParcel(parcel);
            }
            DMGroupChatStickerGroupInfo dMGroupChatStickerGroupInfo = dMGroupChatStickerGroupInfoCreateFromParcel;
            int i = parcel.readInt();
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
            int i2 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new DMGroupChatStickerModel(baseStickerModelCreateFromParcel, dMGroupChatStickerGroupInfo, i, z, z2, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final DMGroupChatStickerModel[] newArray(int i) {
            return new DMGroupChatStickerModel[i];
        }
    };
    public static final int $stable = 8;

    public final DMGroupChatStickerModel copy(BaseStickerModel baseStickerModel, DMGroupChatStickerGroupInfo dMGroupChatStickerGroupInfo, int i, boolean z, boolean z2, Map<String, String> map) {
        return new DMGroupChatStickerModel(baseStickerModel, dMGroupChatStickerGroupInfo, i, z, z2, map);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DMGroupChatStickerModel)) {
            return false;
        }
        DMGroupChatStickerModel dMGroupChatStickerModel = (DMGroupChatStickerModel) obj;
        return Intrinsics.LJFF(this.baseStickerModel, dMGroupChatStickerModel.baseStickerModel) && Intrinsics.LJFF(this.groupInfo, dMGroupChatStickerModel.groupInfo) && this.uiStyle == dMGroupChatStickerModel.uiStyle && this.useNewToolTip == dMGroupChatStickerModel.useNewToolTip && this.isAutoAdded == dMGroupChatStickerModel.isAutoAdded && Intrinsics.LJFF(this.eventTracking, dMGroupChatStickerModel.eventTracking);
    }

    public int hashCode() {
        int iHashCode = this.baseStickerModel.hashCode() * 31;
        DMGroupChatStickerGroupInfo dMGroupChatStickerGroupInfo = this.groupInfo;
        return ((((((((iHashCode + (dMGroupChatStickerGroupInfo == null ? 0 : dMGroupChatStickerGroupInfo.hashCode())) * 31) + this.uiStyle) * 31) + C786410Ut5.Z2(this.useNewToolTip)) * 31) + C786410Ut5.Z2(this.isAutoAdded)) * 31) + this.eventTracking.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isVERenderSticker() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean needCompile() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public AbstractC1442160ndG<?> stickerCompileComponent(Context context, String str, C1440500naa c1440500naa, C0FKI c0fki, String str2) {
        return null;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DMGroupChatStickerModel(baseStickerModel=");
        sbLIZ.append(this.baseStickerModel);
        sbLIZ.append(", groupInfo=");
        sbLIZ.append(this.groupInfo);
        sbLIZ.append(", uiStyle=");
        sbLIZ.append(this.uiStyle);
        sbLIZ.append(", useNewToolTip=");
        sbLIZ.append(this.useNewToolTip);
        sbLIZ.append(", isAutoAdded=");
        sbLIZ.append(this.isAutoAdded);
        sbLIZ.append(", eventTracking=");
        sbLIZ.append(this.eventTracking);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public StickerModel updateMediaSize(Pair<Integer, Integer> pair) {
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.baseStickerModel.writeToParcel(parcel, i);
        DMGroupChatStickerGroupInfo dMGroupChatStickerGroupInfo = this.groupInfo;
        if (dMGroupChatStickerGroupInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dMGroupChatStickerGroupInfo.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.uiStyle);
        parcel.writeInt(this.useNewToolTip ? 1 : 0);
        parcel.writeInt(this.isAutoAdded ? 1 : 0);
        Map<String, String> map = this.eventTracking;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public DMGroupChatStickerModel() {
        this(new BaseStickerModel(0, 0, EnumC1466150oFx.DM_GROUP_CHAT, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null), null, EnumC19620411pa.STICKER_WITH_BUTTON_WITH_WHITE.getValue(), false, false, C2097608Jq.LJ());
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public int getId() {
        return this.baseStickerModel.getId();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public InteractStickerStruct getInteractStickerStruct() throws JSONException {
        C19591311kt.LIZ.getClass();
        InteractStickerStruct interactStickerStructLIZLLL = C19591311kt.LIZLLL(this, true);
        JSONObject jSONObject = new JSONObject();
        DMGroupChatStickerGroupInfo dMGroupChatStickerGroupInfo = this.groupInfo;
        jSONObject.put("group_type", dMGroupChatStickerGroupInfo != null ? dMGroupChatStickerGroupInfo.getEtGroupType() : null);
        DMGroupChatStickerGroupInfo dMGroupChatStickerGroupInfo2 = this.groupInfo;
        jSONObject.put("group_owner_account_type", dMGroupChatStickerGroupInfo2 != null ? dMGroupChatStickerGroupInfo2.getGroupOwnerAccountType() : null);
        for (Map.Entry<String, String> entry : this.eventTracking.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if ((!a0.LJJJIL(key)) && value != null && !a0.LJJJIL(value)) {
                jSONObject.put(key, value);
            }
        }
        String strJ3 = C786410Ut5.J3(jSONObject);
        DMGroupChatStickerGroupInfo dMGroupChatStickerGroupInfo3 = this.groupInfo;
        Long conversationShortId = dMGroupChatStickerGroupInfo3 != null ? dMGroupChatStickerGroupInfo3.getConversationShortId() : null;
        DMGroupChatStickerGroupInfo dMGroupChatStickerGroupInfo4 = this.groupInfo;
        String groupName = dMGroupChatStickerGroupInfo4 != null ? dMGroupChatStickerGroupInfo4.getGroupName() : null;
        DMGroupChatStickerGroupInfo dMGroupChatStickerGroupInfo5 = this.groupInfo;
        String groupAvatar = dMGroupChatStickerGroupInfo5 != null ? dMGroupChatStickerGroupInfo5.getGroupAvatar() : null;
        DMGroupChatStickerGroupInfo dMGroupChatStickerGroupInfo6 = this.groupInfo;
        String accessCriteriaCopy = dMGroupChatStickerGroupInfo6 != null ? dMGroupChatStickerGroupInfo6.getAccessCriteriaCopy() : null;
        DMGroupChatStickerGroupInfo dMGroupChatStickerGroupInfo7 = this.groupInfo;
        Integer groupStatus = dMGroupChatStickerGroupInfo7 != null ? dMGroupChatStickerGroupInfo7.getGroupStatus() : null;
        Integer numValueOf = Integer.valueOf(this.uiStyle);
        DMGroupChatStickerGroupInfo dMGroupChatStickerGroupInfo8 = this.groupInfo;
        Integer groupMemberCount = dMGroupChatStickerGroupInfo8 != null ? dMGroupChatStickerGroupInfo8.getGroupMemberCount() : null;
        DMGroupChatStickerGroupInfo dMGroupChatStickerGroupInfo9 = this.groupInfo;
        interactStickerStructLIZLLL.setGroupChatStickerStruct(new DMGroupChatStickerStruct(conversationShortId, groupName, groupAvatar, accessCriteriaCopy, groupStatus, numValueOf, strJ3, groupMemberCount, dMGroupChatStickerGroupInfo9 != null ? dMGroupChatStickerGroupInfo9.getGroupDesc() : null));
        return interactStickerStructLIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isNotEmptyModel() {
        DMGroupChatStickerGroupInfo dMGroupChatStickerGroupInfo = this.groupInfo;
        if (!C08A4.LIZIZ(dMGroupChatStickerGroupInfo != null ? dMGroupChatStickerGroupInfo.getConversationShortId() : null)) {
            return false;
        }
        DMGroupChatStickerGroupInfo dMGroupChatStickerGroupInfo2 = this.groupInfo;
        return C123100dR.LIZ(dMGroupChatStickerGroupInfo2 != null ? dMGroupChatStickerGroupInfo2.getGroupName() : null);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public BaseStickerModel getBaseModel() {
        return this.baseStickerModel;
    }

    public final BaseStickerModel getBaseStickerModel() {
        return this.baseStickerModel;
    }

    public final Map<String, String> getEventTracking() {
        return this.eventTracking;
    }

    public final DMGroupChatStickerGroupInfo getGroupInfo() {
        return this.groupInfo;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public EnumC1466150oFx getStickerType() {
        return EnumC1466150oFx.DM_GROUP_CHAT;
    }

    public final int getUiStyle() {
        return this.uiStyle;
    }

    public final boolean getUseNewToolTip() {
        return this.useNewToolTip;
    }

    public final boolean isAutoAdded() {
        return this.isAutoAdded;
    }

    public DMGroupChatStickerModel(BaseStickerModel baseStickerModel, DMGroupChatStickerGroupInfo dMGroupChatStickerGroupInfo, int i, boolean z, boolean z2, Map<String, String> map) {
        this.baseStickerModel = baseStickerModel;
        this.groupInfo = dMGroupChatStickerGroupInfo;
        this.uiStyle = i;
        this.useNewToolTip = z;
        this.isAutoAdded = z2;
        this.eventTracking = map;
    }
}
