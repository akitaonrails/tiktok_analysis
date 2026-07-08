package webcast.api.smb;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class SMBBannerInfoResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class Banner {

        @C09CT("extra_params")
        public BannerExtraParams extraParams;

        @C09CT("icon")
        public BannerIcon icon;

        @C09CT("priority")
        public long priority;

        @C09CT("type")
        public int type;

        @C09CT("text")
        public String text = "";

        @C09CT("schema")
        public String schema = "";
    }

    public static final class ResponseData {

        @C09CT("banners")
        public List<Banner> banners = new ArrayList();
    }
}
