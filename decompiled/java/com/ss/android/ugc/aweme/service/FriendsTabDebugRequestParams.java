package com.ss.android.ugc.aweme.service;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsTabDebugRequestParams {

    @C09CT("client_read_gids")
    public final List<String> clientReadGids;

    @C09CT("client_read_gids_notification")
    public final List<String> clientReadGidsNotification;

    @C09CT("client_unread_gids")
    public final String clientUnreadGids;

    @C09CT("page_token")
    public final String pageToken;

    @C09CT("pull_type")
    public final int pullType;

    @C09CT("source")
    public final int source;

    public FriendsTabDebugRequestParams(String str, int i, int i2, List<String> list, List<String> list2, String str2) {
        this.pageToken = str;
        this.source = i;
        this.pullType = i2;
        this.clientReadGids = list;
        this.clientReadGidsNotification = list2;
        this.clientUnreadGids = str2;
    }
}
