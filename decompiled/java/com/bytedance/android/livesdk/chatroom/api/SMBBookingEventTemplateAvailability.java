package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SMBBookingEventTemplateAvailability {

    @C09CT("type")
    public int type;

    @C09CT("wday")
    public int wday;

    @C09CT("interval_list")
    public List<SMBBookingEventTemplateAvailabilityInterval> intervalList = new ArrayList();

    @C09CT("date")
    public String date = "";
}
