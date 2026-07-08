package com.ss.android.ugc.aweme.commercialize.chatagent.botpage.actionbar.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceAgentActiveActionItem {

    @C09CT("action_type")
    public final String actionType;

    @C09CT("description")
    public final String description;

    @C09CT("emoji")
    public final String emoji;

    @C09CT("enter_hint")
    public final String enterHint;

    @C09CT("exit_hint")
    public final String exitHint;

    @C09CT("action_id")
    public final long id;

    @C09CT("action_name")
    public final String name;

    @C09CT("action_process_id")
    public final String processId;

    @C09CT("action_rank")
    public final String rank;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommerceAgentActiveActionItem)) {
            return false;
        }
        CommerceAgentActiveActionItem commerceAgentActiveActionItem = (CommerceAgentActiveActionItem) obj;
        return Intrinsics.LJFF(this.rank, commerceAgentActiveActionItem.rank) && this.id == commerceAgentActiveActionItem.id && Intrinsics.LJFF(this.name, commerceAgentActiveActionItem.name) && Intrinsics.LJFF(this.enterHint, commerceAgentActiveActionItem.enterHint) && Intrinsics.LJFF(this.exitHint, commerceAgentActiveActionItem.exitHint) && Intrinsics.LJFF(this.processId, commerceAgentActiveActionItem.processId) && Intrinsics.LJFF(this.emoji, commerceAgentActiveActionItem.emoji) && Intrinsics.LJFF(this.description, commerceAgentActiveActionItem.description) && Intrinsics.LJFF(this.actionType, commerceAgentActiveActionItem.actionType);
    }

    public final int hashCode() {
        String str = this.rank;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Y2(this.id)) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.enterHint;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.exitHint;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.processId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.emoji;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.description;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.actionType;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommerceAgentActiveActionItem(rank=");
        sbLIZ.append(this.rank);
        sbLIZ.append(", id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", enterHint=");
        sbLIZ.append(this.enterHint);
        sbLIZ.append(", exitHint=");
        sbLIZ.append(this.exitHint);
        sbLIZ.append(", processId=");
        sbLIZ.append(this.processId);
        sbLIZ.append(", emoji=");
        sbLIZ.append(this.emoji);
        sbLIZ.append(", description=");
        sbLIZ.append(this.description);
        sbLIZ.append(", actionType=");
        sbLIZ.append(this.actionType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CommerceAgentActiveActionItem() {
        this("", 0L, "", "", "", "", "", "", "");
    }

    public CommerceAgentActiveActionItem(String str, long j, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.rank = str;
        this.id = j;
        this.name = str2;
        this.enterHint = str3;
        this.exitHint = str4;
        this.processId = str5;
        this.emoji = str6;
        this.description = str7;
        this.actionType = str8;
    }
}
