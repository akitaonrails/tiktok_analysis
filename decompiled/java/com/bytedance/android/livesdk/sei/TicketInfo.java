package com.bytedance.android.livesdk.sei;

import X.C09CT;

/* JADX INFO: loaded from: classes16.dex */
public final class TicketInfo {

    @C09CT("a_n")
    public String animId;

    @C09CT("c_p")
    public Integer completionProgress;

    @C09CT("rank")
    public Integer rank;

    @C09CT("s_n")
    public String styleName;

    @C09CT("ui_t")
    public String ticketUiStyle;

    @C09CT("ui_t_v2")
    public String ticketUiStyleV2;

    @C09CT("tkt_c")
    public Long ticketValue;

    public TicketInfo(Long l, String str, String str2, String str3, String str4, Integer num, Integer num2) {
        this.ticketValue = l;
        this.styleName = str;
        this.animId = str2;
        this.ticketUiStyle = str3;
        this.ticketUiStyleV2 = str4;
        this.completionProgress = num;
        this.rank = num2;
    }
}
