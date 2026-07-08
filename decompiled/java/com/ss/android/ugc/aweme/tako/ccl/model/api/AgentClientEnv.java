package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class AgentClientEnv {

    @C09CT("agent_protocol_version")
    public final long agentProtocolVersion;

    @C09CT("available_commands")
    public final List<String> availableCommands;

    @C09CT("feed")
    public final FeedStatus feed;

    @C09CT("locale")
    public final String locale;

    @C09CT("permission")
    public final AgentClientPermission permission;

    @C09CT("secuid")
    public final String secuid;

    @C09CT("tako_position")
    public final TakoPosition takoPosition;

    @C09CT("timezone")
    public final String timezone;

    @C09CT("user_name")
    public final String userName;

    public AgentClientEnv() {
        this(null, null, null, null, null, 0L, null, null, null, 511, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgentClientEnv)) {
            return false;
        }
        AgentClientEnv agentClientEnv = (AgentClientEnv) obj;
        return Intrinsics.LJFF(this.secuid, agentClientEnv.secuid) && Intrinsics.LJFF(this.userName, agentClientEnv.userName) && Intrinsics.LJFF(this.locale, agentClientEnv.locale) && Intrinsics.LJFF(this.timezone, agentClientEnv.timezone) && Intrinsics.LJFF(this.permission, agentClientEnv.permission) && this.agentProtocolVersion == agentClientEnv.agentProtocolVersion && Intrinsics.LJFF(this.availableCommands, agentClientEnv.availableCommands) && this.takoPosition == agentClientEnv.takoPosition && Intrinsics.LJFF(this.feed, agentClientEnv.feed);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.secuid.hashCode() * 31) + this.userName.hashCode()) * 31) + this.locale.hashCode()) * 31) + this.timezone.hashCode()) * 31) + this.permission.hashCode()) * 31) + C786410Ut5.Y2(this.agentProtocolVersion)) * 31) + this.availableCommands.hashCode()) * 31) + this.takoPosition.hashCode()) * 31;
        FeedStatus feedStatus = this.feed;
        return iHashCode + (feedStatus == null ? 0 : feedStatus.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AgentClientEnv(secuid=");
        sbLIZ.append(this.secuid);
        sbLIZ.append(", userName=");
        sbLIZ.append(this.userName);
        sbLIZ.append(", locale=");
        sbLIZ.append(this.locale);
        sbLIZ.append(", timezone=");
        sbLIZ.append(this.timezone);
        sbLIZ.append(", permission=");
        sbLIZ.append(this.permission);
        sbLIZ.append(", agentProtocolVersion=");
        sbLIZ.append(this.agentProtocolVersion);
        sbLIZ.append(", availableCommands=");
        sbLIZ.append(this.availableCommands);
        sbLIZ.append(", takoPosition=");
        sbLIZ.append(this.takoPosition);
        sbLIZ.append(", feed=");
        sbLIZ.append(this.feed);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AgentClientEnv(String str, String str2, String str3, String str4, AgentClientPermission agentClientPermission, long j, List<String> list, TakoPosition takoPosition, FeedStatus feedStatus) {
        this.secuid = str;
        this.userName = str2;
        this.locale = str3;
        this.timezone = str4;
        this.permission = agentClientPermission;
        this.agentProtocolVersion = j;
        this.availableCommands = list;
        this.takoPosition = takoPosition;
        this.feed = feedStatus;
    }

    public AgentClientEnv(String str, String str2, String str3, String str4, AgentClientPermission agentClientPermission, long j, List list, TakoPosition takoPosition, FeedStatus feedStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? new AgentClientPermission(PermissionState.UNKNOWN, PermissionState.UNKNOWN, PermissionState.UNKNOWN) : agentClientPermission, (i & 32) != 0 ? 0L : j, (i & 64) != 0 ? C13BV.INSTANCE : list, (i & 128) != 0 ? TakoPosition.CHAT_PAGE : takoPosition, (i & 256) != 0 ? null : feedStatus);
    }

    public static AgentClientEnv LIZ(AgentClientEnv agentClientEnv, String str, String str2, String str3, String str4, AgentClientPermission agentClientPermission, long j, List list, TakoPosition takoPosition, FeedStatus feedStatus, int i) {
        FeedStatus feedStatus2 = feedStatus;
        TakoPosition takoPosition2 = takoPosition;
        List list2 = list;
        long j2 = j;
        AgentClientPermission agentClientPermission2 = agentClientPermission;
        String str5 = str4;
        String str6 = str3;
        String str7 = str2;
        String str8 = str;
        if ((i & 1) != 0) {
            str8 = agentClientEnv.secuid;
        }
        if ((i & 2) != 0) {
            str7 = agentClientEnv.userName;
        }
        if ((i & 4) != 0) {
            str6 = agentClientEnv.locale;
        }
        if ((i & 8) != 0) {
            str5 = agentClientEnv.timezone;
        }
        if ((i & 16) != 0) {
            agentClientPermission2 = agentClientEnv.permission;
        }
        if ((i & 32) != 0) {
            j2 = agentClientEnv.agentProtocolVersion;
        }
        if ((i & 64) != 0) {
            list2 = agentClientEnv.availableCommands;
        }
        if ((i & 128) != 0) {
            takoPosition2 = agentClientEnv.takoPosition;
        }
        if ((i & 256) != 0) {
            feedStatus2 = agentClientEnv.feed;
        }
        agentClientEnv.getClass();
        return new AgentClientEnv(str8, str7, str6, str5, agentClientPermission2, j2, list2, takoPosition2, feedStatus2);
    }
}
