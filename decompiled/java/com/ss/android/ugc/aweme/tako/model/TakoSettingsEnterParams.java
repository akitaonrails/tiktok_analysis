package com.ss.android.ugc.aweme.tako.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC111300bX;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoSettingsEnterParams implements Serializable, InterfaceC111300bX {
    public static final int $stable = 8;

    @C09CT("bot_id")
    public long botId;

    @C09CT("bot_source")
    public int botSource;

    @C09CT("enter_from")
    public String enterFrom;

    @C09CT("enter_method")
    public String enterMethod;

    @C09CT("intent_type")
    public String intentType;

    @C09CT("process_id")
    public String processId;

    @C09CT("search_id")
    public String searchId;

    @C09CT("tako_chat_id")
    public String takoChatId;

    @C09CT("tako_session_id")
    public String takoSessionId;

    public final TakoSettingsEnterParams copy(String str, String str2, String str3, String str4, String str5, long j, String str6, int i, String str7) {
        return new TakoSettingsEnterParams(str, str2, str3, str4, str5, j, str6, i, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoSettingsEnterParams)) {
            return false;
        }
        TakoSettingsEnterParams takoSettingsEnterParams = (TakoSettingsEnterParams) obj;
        return Intrinsics.LJFF(this.enterFrom, takoSettingsEnterParams.enterFrom) && Intrinsics.LJFF(this.enterMethod, takoSettingsEnterParams.enterMethod) && Intrinsics.LJFF(this.processId, takoSettingsEnterParams.processId) && Intrinsics.LJFF(this.takoSessionId, takoSettingsEnterParams.takoSessionId) && Intrinsics.LJFF(this.takoChatId, takoSettingsEnterParams.takoChatId) && this.botId == takoSettingsEnterParams.botId && Intrinsics.LJFF(this.searchId, takoSettingsEnterParams.searchId) && this.botSource == takoSettingsEnterParams.botSource && Intrinsics.LJFF(this.intentType, takoSettingsEnterParams.intentType);
    }

    public int hashCode() {
        return (((((((((((((((this.enterFrom.hashCode() * 31) + this.enterMethod.hashCode()) * 31) + this.processId.hashCode()) * 31) + this.takoSessionId.hashCode()) * 31) + this.takoChatId.hashCode()) * 31) + C786410Ut5.Y2(this.botId)) * 31) + this.searchId.hashCode()) * 31) + this.botSource) * 31) + this.intentType.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoSettingsEnterParams(enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.enterMethod);
        sbLIZ.append(", processId=");
        sbLIZ.append(this.processId);
        sbLIZ.append(", takoSessionId=");
        sbLIZ.append(this.takoSessionId);
        sbLIZ.append(", takoChatId=");
        sbLIZ.append(this.takoChatId);
        sbLIZ.append(", botId=");
        sbLIZ.append(this.botId);
        sbLIZ.append(", searchId=");
        sbLIZ.append(this.searchId);
        sbLIZ.append(", botSource=");
        sbLIZ.append(this.botSource);
        sbLIZ.append(", intentType=");
        sbLIZ.append(this.intentType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoSettingsEnterParams() {
        this("", "", "", "", "", 1L, "", 1, "");
    }

    public final long getBotId() {
        return this.botId;
    }

    public final int getBotSource() {
        return this.botSource;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final String getIntentType() {
        return this.intentType;
    }

    public final String getProcessId() {
        return this.processId;
    }

    public final String getSearchId() {
        return this.searchId;
    }

    public final String getTakoChatId() {
        return this.takoChatId;
    }

    public final String getTakoSessionId() {
        return this.takoSessionId;
    }

    public final void setBotId(long j) {
        this.botId = j;
    }

    public final void setBotSource(int i) {
        this.botSource = i;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public final void setIntentType(String str) {
        this.intentType = str;
    }

    public final void setProcessId(String str) {
        this.processId = str;
    }

    public final void setSearchId(String str) {
        this.searchId = str;
    }

    public final void setTakoChatId(String str) {
        this.takoChatId = str;
    }

    public final void setTakoSessionId(String str) {
        this.takoSessionId = str;
    }

    public TakoSettingsEnterParams(String str, String str2, String str3, String str4, String str5, long j, String str6, int i, String str7) {
        this.enterFrom = str;
        this.enterMethod = str2;
        this.processId = str3;
        this.takoSessionId = str4;
        this.takoChatId = str5;
        this.botId = j;
        this.searchId = str6;
        this.botSource = i;
        this.intentType = str7;
    }
}
