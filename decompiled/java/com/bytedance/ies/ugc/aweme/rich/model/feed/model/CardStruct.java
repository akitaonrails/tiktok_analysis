package com.bytedance.ies.ugc.aweme.rich.model.feed.model;

import X.C09CT;
import X.C1216604pQ;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.Serializable;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class CardStruct implements Serializable {

    @C09CT("card_data")
    public Object cardData;

    @C09CT("card_style")
    public int cardStyle;

    @C09CT("card_type")
    public int cardType;

    @C09CT("card_url")
    public String cardUrl;

    @C09CT("dynamic_type")
    public int dynamicType;

    @C09CT("gecko_channel")
    public List<String> geckoChannel;

    @C09CT("log_extra")
    public String logExtra;

    @C09CT("preload_before_show")
    public int preloadBeforeVideoEnd;

    @C09CT("preload_type")
    public int preloadType;

    @C09CT("show_duration")
    public int showDuration;

    @C09CT("track_url_list")
    public UrlModel trackUrlList;

    @C09CT("show_seconds")
    public int showSeconds = -1;

    @C09CT("only_track_event_not_show")
    public Boolean onlyTrackEventNotShow = Boolean.FALSE;

    @C09CT("sub_type")
    public int subType = 0;

    public int getPreloadBeforeVideoEnd() {
        return this.preloadBeforeVideoEnd * LSPassThroughRecordSizeConfig.DEFAULT;
    }

    public boolean isEnablePreload() {
        return this.preloadType == 1;
    }

    public JSONObject getCardData() {
        try {
            return new JSONObject(C1216604pQ.LIZ().LJIILL(this.cardData));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public int getCardStyle() {
        return this.cardStyle;
    }

    public int getCardSubType() {
        return this.subType;
    }

    public int getCardType() {
        return this.cardType;
    }

    public String getCardUrl() {
        return this.cardUrl;
    }

    public int getDynamicType() {
        return this.dynamicType;
    }

    public List<String> getGeckoChannel() {
        return this.geckoChannel;
    }

    public String getLogExtra() {
        return this.logExtra;
    }

    public Boolean getOnlyTrackEventNotShow() {
        return this.onlyTrackEventNotShow;
    }

    public int getShowDuration() {
        return this.showDuration;
    }

    public int getShowSeconds() {
        return this.showSeconds;
    }

    public UrlModel getTrackUrlList() {
        return this.trackUrlList;
    }

    public void setCardType(int i) {
        this.cardType = i;
    }

    public void setCardUrl(String str) {
        this.cardUrl = str;
    }

    public void setLogExtra(String str) {
        this.logExtra = str;
    }

    public void setPreloadBeforeVideoEnd(int i) {
        this.preloadBeforeVideoEnd = i;
    }

    public void setTrackUrlList(UrlModel urlModel) {
        this.trackUrlList = urlModel;
    }
}
