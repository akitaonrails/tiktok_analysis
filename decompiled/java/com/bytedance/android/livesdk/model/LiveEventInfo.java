package com.bytedance.android.livesdk.model;

import X.C09CT;
import java.util.HashMap;
import java.util.List;
import webcast.data.EventUserInfo;
import webcast.data.PaidEventPreview;

/* JADX INFO: loaded from: classes.dex */
public class LiveEventInfo {

    @C09CT("event_user_info")
    public List<EventUserInfo> eventUserInfo;

    @C09CT("is_paid_event")
    public Boolean isPaidEvent;

    @C09CT("paid_event_preview")
    public PaidEventPreview paidEventPreview;

    @C09CT("pay_method")
    public int payMethod;

    @C09CT("register_type")
    public long registerType;

    @C09CT("has_subscribed")
    public Boolean subscribed;

    @C09CT("subscribed_count")
    public long subscribedCount;

    @C09CT("ticket_amount")
    public Long ticketAmount;

    @C09CT("wallet_package")
    public WalletPackage walletPackage;

    @C09CT("wallet_pkg_dict")
    public HashMap<String, WalletPackage> walletPkgDict;

    @C09CT("periodic_shows")
    public String periodicShows = "";

    @C09CT("periodic_settings")
    public String periodicSettings = "";

    @C09CT("event_id")
    public Long eventId = 0L;

    @C09CT("start_time")
    public Long startTime = 0L;

    @C09CT("duration")
    public Long duration = 0L;

    @C09CT("title")
    public String title = "";

    @C09CT("description")
    public String description = "";

    public LiveEventInfo() {
        Boolean bool = Boolean.FALSE;
        this.subscribed = bool;
        this.isPaidEvent = bool;
        this.walletPkgDict = new HashMap<>();
    }
}
