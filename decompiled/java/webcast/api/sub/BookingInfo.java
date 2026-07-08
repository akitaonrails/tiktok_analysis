package webcast.api.sub;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class BookingInfo {

    @C09CT("duration_seconds")
    public int durationSeconds;

    @C09CT("event_template_id")
    public String eventTemplateId = "";

    @C09CT("location_text")
    public String locationText = "";

    @C09CT("service_info")
    public ServiceInfo serviceInfo;

    @C09CT("sku_id")
    public long skuId;
}
