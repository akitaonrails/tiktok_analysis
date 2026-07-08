package com.bytedance.android.livesdk.model.linksetting;

import X.C09CT;
import X.C2188811AlT;
import android.util.ArrayMap;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestPermissionInfo;
import com.bytedance.android.live.liveinteract.multilive.model.RoomHostMultiGuestPermissionInfo;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import webcast.data.LinkmicGuestUser;
import webcast.data.RoomMultiGuestLinkmicInfo;

/* JADX INFO: loaded from: classes.dex */
public final class MultiLiveUserSettings implements Serializable {

    @C09CT("linkmic_scene_linker")
    public ArrayMap<Integer, Long> channelMap;

    @C09CT("cohost")
    public CoHost coHost;

    @C09CT("multi_live")
    public MultiLiveUserApplySettings multiLiveUserApplySettings;

    public MultiLiveUserSettings() {
        this(null, new ArrayMap(), null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiLiveUserSettings(multiLiveUserApplySettings=");
        sbLIZ.append(this.multiLiveUserApplySettings);
        sbLIZ.append(", channelMap=");
        sbLIZ.append(this.channelMap);
        sbLIZ.append(", coHost=");
        sbLIZ.append(this.coHost);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final long getErrCodeAnchorSide() {
        RoomHostMultiGuestPermissionInfo roomHostMultiGuestPermissionInfo;
        MultiGuestPermissionInfo multiGuestPermissionInfo;
        Long lValueOf;
        MultiLiveUserApplySettings multiLiveUserApplySettings = this.multiLiveUserApplySettings;
        if (multiLiveUserApplySettings == null || (roomHostMultiGuestPermissionInfo = multiLiveUserApplySettings.roomHostMultiGuestPermissionInfo) == null || (multiGuestPermissionInfo = roomHostMultiGuestPermissionInfo.permissionInfo) == null || (lValueOf = Long.valueOf(multiGuestPermissionInfo.errCode)) == null) {
            return 0L;
        }
        return lValueOf.longValue();
    }

    public final long getErrCodeAudienceSide() {
        RoomAudienceMultiGuestPermissionInfo roomAudienceMultiGuestPermissionInfo;
        MultiGuestPermissionInfo multiGuestPermissionInfo;
        Long lValueOf;
        MultiLiveUserApplySettings multiLiveUserApplySettings = this.multiLiveUserApplySettings;
        if (multiLiveUserApplySettings == null || (roomAudienceMultiGuestPermissionInfo = multiLiveUserApplySettings.roomAudienceMultiGuestPermissionInfo) == null || (multiGuestPermissionInfo = roomAudienceMultiGuestPermissionInfo.permissionInfo) == null || (lValueOf = Long.valueOf(multiGuestPermissionInfo.errCode)) == null) {
            return 0L;
        }
        return lValueOf.longValue();
    }

    public final String getErrPromptAudienceSide() {
        RoomAudienceMultiGuestPermissionInfo roomAudienceMultiGuestPermissionInfo;
        MultiGuestPermissionInfo multiGuestPermissionInfo;
        String str;
        MultiLiveUserApplySettings multiLiveUserApplySettings = this.multiLiveUserApplySettings;
        return (multiLiveUserApplySettings == null || (roomAudienceMultiGuestPermissionInfo = multiLiveUserApplySettings.roomAudienceMultiGuestPermissionInfo) == null || (multiGuestPermissionInfo = roomAudienceMultiGuestPermissionInfo.permissionInfo) == null || (str = multiGuestPermissionInfo.noPermissionPrompt) == null) ? "" : str;
    }

    public final boolean hasErrCodeAudienceSide() {
        RoomAudienceMultiGuestPermissionInfo roomAudienceMultiGuestPermissionInfo;
        MultiGuestPermissionInfo multiGuestPermissionInfo;
        MultiLiveUserApplySettings multiLiveUserApplySettings = this.multiLiveUserApplySettings;
        return multiLiveUserApplySettings != null && (roomAudienceMultiGuestPermissionInfo = multiLiveUserApplySettings.roomAudienceMultiGuestPermissionInfo) != null && roomAudienceMultiGuestPermissionInfo.roomPackSuccessFlag && ((multiGuestPermissionInfo = roomAudienceMultiGuestPermissionInfo.permissionInfo) == null || multiGuestPermissionInfo.errCode != 0);
    }

    public final boolean hasMultiGuestPermissionAnchorSide() {
        RoomHostMultiGuestPermissionInfo roomHostMultiGuestPermissionInfo;
        MultiGuestPermissionInfo multiGuestPermissionInfo;
        MultiLiveUserApplySettings multiLiveUserApplySettings = this.multiLiveUserApplySettings;
        return multiLiveUserApplySettings != null && (roomHostMultiGuestPermissionInfo = multiLiveUserApplySettings.roomHostMultiGuestPermissionInfo) != null && roomHostMultiGuestPermissionInfo.roomPackSuccessFlag && (multiGuestPermissionInfo = roomHostMultiGuestPermissionInfo.permissionInfo) != null && multiGuestPermissionInfo.flag && multiGuestPermissionInfo.errCode == 0;
    }

    public final boolean hasMultiGuestPermissionAudienceSide() {
        RoomAudienceMultiGuestPermissionInfo roomAudienceMultiGuestPermissionInfo;
        MultiGuestPermissionInfo multiGuestPermissionInfo;
        MultiLiveUserApplySettings multiLiveUserApplySettings = this.multiLiveUserApplySettings;
        return (multiLiveUserApplySettings == null || (roomAudienceMultiGuestPermissionInfo = multiLiveUserApplySettings.roomAudienceMultiGuestPermissionInfo) == null || !roomAudienceMultiGuestPermissionInfo.roomPackSuccessFlag || (multiGuestPermissionInfo = roomAudienceMultiGuestPermissionInfo.permissionInfo) == null || multiGuestPermissionInfo.errCode != 0) ? false : true;
    }

    public final boolean isMultiGuestPermissionInfoAudienceSideNotNull() {
        RoomAudienceMultiGuestPermissionInfo roomAudienceMultiGuestPermissionInfo;
        MultiLiveUserApplySettings multiLiveUserApplySettings = this.multiLiveUserApplySettings;
        return (multiLiveUserApplySettings == null || (roomAudienceMultiGuestPermissionInfo = multiLiveUserApplySettings.roomAudienceMultiGuestPermissionInfo) == null || roomAudienceMultiGuestPermissionInfo.permissionInfo == null) ? false : true;
    }

    public final boolean isMultiLiveEnable() {
        MultiLiveUserApplySettings multiLiveUserApplySettings = this.multiLiveUserApplySettings;
        return multiLiveUserApplySettings != null && multiLiveUserApplySettings.tryOpenMultiGuest;
    }

    public final boolean isRoomPackSucAbSettings() {
        RoomMultiGuestLinkmicInfo roomMultiGuestLinkmicInfo;
        String str;
        MultiLiveUserApplySettings multiLiveUserApplySettings = this.multiLiveUserApplySettings;
        if (multiLiveUserApplySettings == null || (roomMultiGuestLinkmicInfo = multiLiveUserApplySettings.roomMultiGuestLinkmicInfo) == null) {
            return false;
        }
        long j = roomMultiGuestLinkmicInfo.packErrCode;
        return ((j != 0 && j != -1) || (str = roomMultiGuestLinkmicInfo.linkmicRoomCreateAbParam) == null || str.length() == 0) ? false : true;
    }

    public final boolean isRoomPackSuccAudienceSide() {
        RoomAudienceMultiGuestPermissionInfo roomAudienceMultiGuestPermissionInfo;
        MultiLiveUserApplySettings multiLiveUserApplySettings = this.multiLiveUserApplySettings;
        if (multiLiveUserApplySettings == null || (roomAudienceMultiGuestPermissionInfo = multiLiveUserApplySettings.roomAudienceMultiGuestPermissionInfo) == null) {
            return false;
        }
        return roomAudienceMultiGuestPermissionInfo.roomPackSuccessFlag;
    }

    public final int getCoHostGuestCountInCurrentRoom(long j) {
        Map<Long, LinkmicGuestUser> map;
        CoHost coHost = this.coHost;
        if (coHost == null || (map = coHost.linkedGuestUsers) == null) {
            return 0;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Long, LinkmicGuestUser> entry : map.entrySet()) {
            if (entry.getValue().roomId == j && j > 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.size();
    }

    public MultiLiveUserSettings(MultiLiveUserApplySettings multiLiveUserApplySettings, ArrayMap<Integer, Long> arrayMap, CoHost coHost) {
        this.multiLiveUserApplySettings = multiLiveUserApplySettings;
        this.channelMap = arrayMap;
        this.coHost = coHost;
    }
}
