package com.ss.android.ugc.aweme.poi.videopublish;

import com.ss.android.ugc.aweme.creative.model.MediaLocationMetaDataModel;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.aweme.services.publish.MobParam;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public interface IPoiVideoPublishService {
    boolean enableReadLocationMetaData();

    PoiData getPoiData(Function1<? super Class<? extends Object>, ? extends Object> function1);

    Pair<PoiData, PoiMobParam> getPoiDataAndMobParams(Function1<? super Class<? extends Object>, ? extends Object> function1);

    boolean hitDraftPreloadPoiRecommendExp();

    boolean hitPreloadPoiRecommendExp();

    Map<String, Object> preloadPoiRecommend(MobParam mobParam, List<MediaLocationMetaDataModel> list);

    void requestVideoUnderstand(String str, Long l, String str2, String str3);

    void startExtractFrame(String str, String str2);

    void trackReadMetaDataDuration(long j);

    void trackReadMetaDataSuccessRate(boolean z);
}
