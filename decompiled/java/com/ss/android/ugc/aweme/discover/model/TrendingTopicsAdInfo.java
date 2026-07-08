package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes17.dex */
public final class TrendingTopicsAdInfo implements Serializable {

    @C09CT("ad_id")
    public final long adId;

    @C09CT("ad_label")
    public final AdLabel adLabel;

    @C09CT("ad_position")
    public final int adPosition;

    @C09CT("click_track_url_list")
    public final UrlModel clickTrackUrlList;

    @C09CT("creative_id")
    public final long creativeId;

    @C09CT("description")
    public final String description;

    @C09CT("image_list")
    public final List<UrlModel> imageList;

    @C09CT("is_preview")
    public final boolean isPreview;

    @C09CT("label")
    public final AwemeTextLabelModel label;

    @C09CT("log_extra")
    public final String logExtra;

    @C09CT("mp_url")
    public final String mpUrl;

    @C09CT("open_url")
    public final String openUrl;

    @C09CT("source")
    public final String source;

    @C09CT("title")
    public final String title;

    @C09CT("track_url_list")
    public final UrlModel trackUrlList;

    @C09CT("type")
    public final String type;

    @C09CT("web_title")
    public final String webTitle;

    @C09CT("web_url")
    public final String webUrl;

    public TrendingTopicsAdInfo() {
        this(0, 0L, 0L, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 262143, null);
    }

    public final boolean isPreview() {
        return this.isPreview;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TrendingTopicsAdInfo(int i, long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, UrlModel urlModel, UrlModel urlModel2, List<? extends UrlModel> list, boolean z, String str7, String str8, String str9, AwemeTextLabelModel awemeTextLabelModel, AdLabel adLabel) {
        this.adPosition = i;
        this.adId = j;
        this.creativeId = j2;
        this.type = str;
        this.source = str2;
        this.logExtra = str3;
        this.webUrl = str4;
        this.title = str5;
        this.webTitle = str6;
        this.clickTrackUrlList = urlModel;
        this.trackUrlList = urlModel2;
        this.imageList = list;
        this.isPreview = z;
        this.openUrl = str7;
        this.mpUrl = str8;
        this.description = str9;
        this.label = awemeTextLabelModel;
        this.adLabel = adLabel;
    }

    public TrendingTopicsAdInfo(int i, long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, UrlModel urlModel, UrlModel urlModel2, List list, boolean z, String str7, String str8, String str9, AwemeTextLabelModel awemeTextLabelModel, AdLabel adLabel, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? 0L : j, (i2 & 4) == 0 ? j2 : 0L, (i2 & 8) != 0 ? "" : str, (i2 & 16) != 0 ? "" : str2, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? "" : str4, (i2 & 128) != 0 ? "" : str5, (i2 & 256) != 0 ? "" : str6, (i2 & 512) != 0 ? null : urlModel, (i2 & 1024) != 0 ? null : urlModel2, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? C13BV.INSTANCE : list, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? false : z, (i2 & 8192) != 0 ? "" : str7, (i2 & 16384) != 0 ? "" : str8, (32768 & i2) == 0 ? str9 : "", (65536 & i2) != 0 ? null : awemeTextLabelModel, (i2 & 131072) != 0 ? null : adLabel);
    }
}
