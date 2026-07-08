package com.ss.android.ugc.aweme.friendstab.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public abstract class SocialFeedRedDotRequest {

    @C09CT("client_read_gids")
    public List<String> clientReadGids;

    @C09CT("client_read_gids_all")
    public List<String> clientReadGidsAll;

    @C09CT("client_read_gids_notification")
    public List<String> clientReadGidsNotification;

    public final List<String> getClientReadGids() {
        return this.clientReadGids;
    }

    public final List<String> getClientReadGidsAll() {
        return this.clientReadGidsAll;
    }

    public final List<String> getClientReadGidsNotification() {
        return this.clientReadGidsNotification;
    }

    public final void setClientReadGids(List<String> list) {
        this.clientReadGids = list;
    }

    public final void setClientReadGidsAll(List<String> list) {
        this.clientReadGidsAll = list;
    }

    public final void setClientReadGidsNotification(List<String> list) {
        this.clientReadGidsNotification = list;
    }
}
