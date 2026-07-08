package com.ss.android.ugc.aweme.poi.quiz.data;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiQuizResponse implements Serializable {

    @C09CT("config")
    public final PoiQuizConfigModel config;

    @C09CT("log_id")
    public final String logId;

    @C09CT("poi_list")
    public final List<PoiQuizItem> poiList;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_message")
    public final String statusMessage;

    public PoiQuizResponse() {
        this(null, null, null, null, null);
    }

    public final boolean isConfigSuccess() {
        Integer num = this.statusCode;
        return (num == null || num.intValue() != 0 || this.config == null) ? false : true;
    }

    public final boolean isPoiListSuccess() {
        List<PoiQuizItem> list;
        Integer num = this.statusCode;
        return num != null && num.intValue() == 0 && (list = this.poiList) != null && (list.isEmpty() ^ true);
    }

    public PoiQuizResponse(Integer num, String str, String str2, PoiQuizConfigModel poiQuizConfigModel, List<PoiQuizItem> list) {
        this.statusCode = num;
        this.statusMessage = str;
        this.logId = str2;
        this.config = poiQuizConfigModel;
        this.poiList = list;
    }
}
