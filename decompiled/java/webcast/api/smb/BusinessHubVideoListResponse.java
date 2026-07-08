package webcast.api.smb;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.PaginationInfo;

/* JADX INFO: loaded from: classes23.dex */
public final class BusinessHubVideoListResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("pagination_info")
        public PaginationInfo paginationInfo;

        @C09CT("videos")
        public List<Video> videos = new ArrayList();
    }
}
