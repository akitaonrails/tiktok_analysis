package com.ss.android.ugc.aweme.widget.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class AppWidgetStruct {

    @C09CT("ch_info")
    public List<ChallengeStruct> challengeStructList;

    @C09CT("cursor")
    public long cursor;

    @C09CT("status_code")
    public int statusCode;

    @C09CT("status_msg")
    public String statusMsg;

    public final List<ChallengeStruct> getChallengeStructList() {
        return this.challengeStructList;
    }

    public final long getCursor() {
        return this.cursor;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final void setChallengeStructList(List<ChallengeStruct> list) {
        this.challengeStructList = list;
    }

    public final void setCursor(long j) {
        this.cursor = j;
    }

    public final void setStatusCode(int i) {
        this.statusCode = i;
    }

    public final void setStatusMsg(String str) {
        this.statusMsg = str;
    }

    public AppWidgetStruct(int i, String str, long j, List<ChallengeStruct> list) {
        this.statusCode = i;
        this.statusMsg = str;
        this.cursor = j;
        this.challengeStructList = list;
    }
}
