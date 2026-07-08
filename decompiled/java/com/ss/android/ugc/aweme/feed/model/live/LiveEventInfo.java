package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes34.dex */
public final class LiveEventInfo implements Serializable {

    @C09CT("description")
    public String description;

    @C09CT("duration")
    public long duration;

    @C09CT("event_id")
    public long id;

    @C09CT("is_paid_event")
    public Boolean isPaidEvent;
    public String localPaidEventPrice;

    @C09CT("paid_event_preview")
    public PaidEventPreview paidEventPreview;

    @C09CT("start_time")
    public long startTime;

    @C09CT("has_subscribed")
    public boolean subscribed;

    @C09CT("ticket_amount")
    public Long ticketAmount;

    @C09CT("title")
    public String title;

    @C09CT("wallet_package")
    public WalletPackage walletPackage;

    public LiveEventInfo() {
        this(0L, 0L, 0L, "", "", false, null, Boolean.FALSE, null, null);
    }

    public final Boolean isPaidEvent() {
        return this.isPaidEvent;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setLocalPaidEventPrice(String str) {
        this.localPaidEventPrice = str;
    }

    public final void setPaidEvent(Boolean bool) {
        this.isPaidEvent = bool;
    }

    public final void setPaidEventPreview(PaidEventPreview paidEventPreview) {
        this.paidEventPreview = paidEventPreview;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setSubscribed(boolean z) {
        this.subscribed = z;
    }

    public final void setTicketAmount(Long l) {
        this.ticketAmount = l;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setWalletPackage(WalletPackage walletPackage) {
        this.walletPackage = walletPackage;
    }

    public LiveEventInfo(long j, long j2, long j3, String str, String str2, boolean z, Long l, Boolean bool, WalletPackage walletPackage, PaidEventPreview paidEventPreview) {
        this.id = j;
        this.startTime = j2;
        this.duration = j3;
        this.title = str;
        this.description = str2;
        this.subscribed = z;
        this.ticketAmount = l;
        this.isPaidEvent = bool;
        this.walletPackage = walletPackage;
        this.paidEventPreview = paidEventPreview;
    }
}
