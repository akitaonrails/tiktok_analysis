package com.ss.android.ugc.aweme.discover.model;

import X.C08FF;
import X.C09CS;
import X.C09CT;
import X.C0X12;
import X.C2188811AlT;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes30.dex */
public class Banner implements C0X12, Serializable {
    public static final long serialVersionUID = 1;

    @C09CT("ad_data")
    @C09CS(StringJsonAdapterFactory.class)
    public BannerAdData adData;

    @C09CT("banner_url")
    public UrlModel bannerUrl;

    @C09CT("bid")
    public String bid;

    @C09CT("height")
    public int height;
    public String requestId;

    @C09CT("schema")
    public String schema;

    @C09CT("title")
    public String title;

    @C09CT("width")
    public int width;

    public String getCategoryId() {
        String strGroup = null;
        if (this.schema == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("(?<=");
        sbLIZ.append(BannerSchemaType.PLAYLIST.schemaPattern);
        sbLIZ.append(")[0-9]+");
        Matcher matcher = PatternProtector.compile(C2188811AlT.LIZIZ(sbLIZ)).matcher(this.schema);
        try {
            if (!matcher.find()) {
                return null;
            }
            strGroup = matcher.group();
            return strGroup;
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            return strGroup;
        }
    }

    public List<String> getClickTrackUrlList() {
        BannerAdData bannerAdData = this.adData;
        if (bannerAdData == null) {
            return null;
        }
        return bannerAdData.clickTrackUrlList;
    }

    public long getCreativeId() {
        BannerAdData bannerAdData = this.adData;
        if (bannerAdData == null) {
            return 0L;
        }
        return bannerAdData.creativeId;
    }

    public String getLogExtra() {
        BannerAdData bannerAdData = this.adData;
        if (bannerAdData == null) {
            return null;
        }
        return bannerAdData.logExtra;
    }

    public String getMusicId() {
        String strGroup = null;
        if (this.schema == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("(?<=");
        sbLIZ.append(BannerSchemaType.MUSIC.schemaPattern);
        sbLIZ.append(")[0-9]+");
        Matcher matcher = PatternProtector.compile(C2188811AlT.LIZIZ(sbLIZ)).matcher(this.schema);
        try {
            if (!matcher.find()) {
                return null;
            }
            strGroup = matcher.group();
            return strGroup;
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            return strGroup;
        }
    }

    public String getPackageName() {
        BannerAdData bannerAdData = this.adData;
        if (bannerAdData == null) {
            return null;
        }
        return bannerAdData.packageName;
    }

    public BannerSchemaType getSchemaType() {
        if (this.schema == null) {
            return BannerSchemaType.UNKNOWN;
        }
        for (BannerSchemaType bannerSchemaType : BannerSchemaType.values()) {
            if (PatternProtector.compile(bannerSchemaType.schemaPattern).matcher(this.schema).find()) {
                return bannerSchemaType;
            }
        }
        return BannerSchemaType.UNKNOWN;
    }

    public List<String> getTrackUrlList() {
        BannerAdData bannerAdData = this.adData;
        if (bannerAdData == null) {
            return null;
        }
        return bannerAdData.trackUrlList;
    }

    public String getType() {
        BannerAdData bannerAdData = this.adData;
        if (bannerAdData == null) {
            return null;
        }
        return bannerAdData.type;
    }

    public int hashCode() {
        String str = this.bid;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        UrlModel urlModel = this.bannerUrl;
        int iHashCode3 = (((((iHashCode2 + (urlModel != null ? urlModel.hashCode() : 0)) * 31) + this.height) * 31) + this.width) * 31;
        String str3 = this.schema;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public boolean isAd() {
        BannerAdData bannerAdData = this.adData;
        return bannerAdData != null && bannerAdData.isAd;
    }

    public static class BannerAdData implements Serializable {

        @C09CT("ad_label")
        public AdLabel adLabel;

        @C09CT("click_track_url_list")
        public List<String> clickTrackUrlList;

        @C09CT("creative_id")
        public long creativeId;

        @C09CT("is_ad")
        public boolean isAd = true;

        @C09CT("log_extra")
        public String logExtra;

        @C09CT("package_name")
        public String packageName;

        @C09CT("track_url_list")
        public List<String> trackUrlList;

        @C09CT("type")
        public String type;

        public AdLabel getAdLabel() {
            return this.adLabel;
        }
    }

    public BannerAdData getAdData() {
        return this.adData;
    }

    public UrlModel getBannerUrl() {
        return this.bannerUrl;
    }

    public String getBid() {
        return this.bid;
    }

    public int getHeight() {
        return this.height;
    }

    @Override // X.C0X12
    public String getRequestId() {
        return this.requestId;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getTitle() {
        return this.title;
    }

    public int getWidth() {
        return this.width;
    }

    public enum BannerSchemaType {
        MUSIC("music/detail/", "single_song"),
        AI_RECOMMEND_PLAYLIST("assmusic/category/.*ai_recommend=1", "recommend_native_page"),
        PLAYLIST("assmusic/category/", "playlist"),
        WEB("https?://", "H5_page"),
        UNKNOWN(".*", "other");

        public final String mobValue;
        public final String schemaPattern;

        public static BannerSchemaType valueOf(String str) {
            return (BannerSchemaType) C08FF.LIZ(BannerSchemaType.class, str);
        }

        BannerSchemaType(String str, String str2) {
            this.schemaPattern = str;
            this.mobValue = str2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Banner banner = (Banner) obj;
        if (this.height != banner.height || this.width != banner.width) {
            return false;
        }
        String str = this.bid;
        if (str != null) {
            if (!str.equals(banner.bid)) {
                return false;
            }
        } else if (banner.bid != null) {
            return false;
        }
        String str2 = this.title;
        if (str2 != null) {
            if (!str2.equals(banner.title)) {
                return false;
            }
        } else if (banner.title != null) {
            return false;
        }
        UrlModel urlModel = this.bannerUrl;
        if (urlModel != null) {
            if (!urlModel.equals(banner.bannerUrl)) {
                return false;
            }
        } else if (banner.bannerUrl != null) {
            return false;
        }
        String str3 = this.schema;
        String str4 = banner.schema;
        if (str3 != null) {
            return str3.equals(str4);
        }
        if (str4 == null) {
            return true;
        }
        return false;
    }

    public void setBannerUrl(UrlModel urlModel) {
        this.bannerUrl = urlModel;
    }

    public void setBid(String str) {
        this.bid = str;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    @Override // X.C0X12
    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
