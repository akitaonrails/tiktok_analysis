package com.bytedance.android.livesdk.model;

import X.C09CT;
import X.InterfaceC2262081DgM;
import X.InterfaceC468260IXw;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class FeedBanner implements InterfaceC468260IXw {
    public ImageModel LIZ;

    @C09CT("avg_color")
    public String avgColor;

    @C09CT("banner_type")
    public int bannerType;

    @C09CT("business_type")
    public long businessType;

    @C09CT("height")
    public int height;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("schema_url")
    public String schemaUrl;

    @C09CT("text")
    public String text;

    @C09CT("title")
    public String title;

    @C09CT("uri")
    public String uri;

    @C09CT("url_list")
    public List<String> urlList;

    @C09CT("width")
    public int width;

    @C09CT("business_source")
    public String businessSource = "";

    @C09CT("activity_id")
    public String activityId = "";

    @C09CT("extra")
    public String extra = "";

    @C09CT("subtitle")
    public String subtitle = "";

    @Override // X.InterfaceC468260IXw
    public final InterfaceC2262081DgM author() {
        return null;
    }

    public final ImageModel LIZIZ() {
        if (this.LIZ == null && this.urlList != null && this.uri != null) {
            this.LIZ = new ImageModel(this.uri, this.urlList);
        }
        return this.LIZ;
    }

    @Override // X.InterfaceC468260IXw
    public final ImageModel cover() {
        return LIZIZ();
    }

    @Override // X.InterfaceC468260IXw
    public final long getId() {
        return this.id;
    }

    public final boolean LIZ(FeedBanner feedBanner) {
        if (this == feedBanner) {
            return true;
        }
        if (feedBanner == null || this.id != feedBanner.id || !TextUtils.equals(this.title, feedBanner.title) || !TextUtils.equals(this.uri, feedBanner.uri) || !TextUtils.equals(this.schemaUrl, feedBanner.schemaUrl) || !TextUtils.equals(this.text, feedBanner.text) || this.width != feedBanner.width || this.height != feedBanner.height) {
            return false;
        }
        List<String> list = this.urlList;
        if (list == null) {
            if (feedBanner.urlList != null) {
                return false;
            }
            if (feedBanner.urlList == null) {
                return true;
            }
        } else if (feedBanner.urlList == null) {
            return false;
        }
        if (list.size() != feedBanner.urlList.size()) {
            return false;
        }
        for (int i = 0; i < this.urlList.size(); i++) {
            if (!TextUtils.equals((CharSequence) ListProtector.get(this.urlList, i), (CharSequence) ListProtector.get(feedBanner.urlList, i))) {
                return false;
            }
        }
        return true;
    }
}
