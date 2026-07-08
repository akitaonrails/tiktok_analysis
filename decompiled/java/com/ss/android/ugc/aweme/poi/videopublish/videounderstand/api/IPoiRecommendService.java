package com.ss.android.ugc.aweme.poi.videopublish.videounderstand.api;

import com.ss.android.ugc.aweme.poi.videopublish.videounderstand.data.PoiVideoUnderstandResponse;
import kotlin.Pair;

/* JADX INFO: loaded from: classes19.dex */
public interface IPoiRecommendService {
    Pair<String, PoiVideoUnderstandResponse> LIZ();

    Pair<String, PoiVideoUnderstandResponse> LIZIZ(String str);

    void requestVideoUnderstand(String str, Long l, String str2, String str3);
}
