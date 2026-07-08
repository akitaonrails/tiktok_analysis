package webcast.api.sub;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class SMBServiceStatResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("service_sku_stat")
        public ServiceSKUStat serviceSkuStat;
    }

    public static final class ServiceSKUStat {

        @C09CT("booking_sku_count")
        public long bookingSkuCount;

        @C09CT("course_count")
        public long courseCount;

        @C09CT("dm_sku_count")
        public long dmSkuCount;

        @C09CT("form_sku_count")
        public long formSkuCount;

        @C09CT("max_booking_sku_count")
        public long maxBookingSkuCount;

        @C09CT("max_course_count")
        public long maxCourseCount;

        @C09CT("max_dm_sku_count")
        public long maxDmSkuCount;

        @C09CT("max_form_sku_count")
        public long maxFormSkuCount;

        @C09CT("max_sub_sku_count")
        public long maxSubSkuCount;

        @C09CT("sub_sku_count")
        public long subSkuCount;

        @C09CT("total_sku_count")
        public long totalSkuCount;
    }
}
