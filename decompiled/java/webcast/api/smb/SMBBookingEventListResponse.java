package webcast.api.smb;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.PaginationInfo;

/* JADX INFO: loaded from: classes23.dex */
public final class SMBBookingEventListResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("past_pagination_info")
        public PaginationInfo pastPaginationInfo;

        @C09CT("upcoming_pagination_info")
        public PaginationInfo upcomingPaginationInfo;

        @C09CT("upcoming_event_list")
        public List<SMBBookingEventWrapper> upcomingEventList = new ArrayList();

        @C09CT("past_event_list")
        public List<SMBBookingEventWrapper> pastEventList = new ArrayList();
    }
}
