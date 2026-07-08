package com.ss.android.ugc.aweme.service;

import X.C0SFO;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.PostModeEgressEtData;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public interface IPhotoModeLogUtil {
    C0SFO getSbLogger(String str, boolean z, boolean z2);

    void logBackToFeed(PostModeEgressEtData postModeEgressEtData, String str, Aweme aweme, String str2);

    void logMultiPhotoSlide(String str, String str2, Aweme aweme, int i, String str3, int i2, Map<String, String> map);

    void logPinchZoom(String str, Aweme aweme, int i, long j, boolean z, Integer num, boolean z2, Float f, Boolean bool, Boolean bool2, Boolean bool3, String str2);

    void logPinchZoom(String str, Aweme aweme, int i, long j, boolean z, Integer num, boolean z2, Float f, Boolean bool, Boolean bool2, Boolean bool3, String str2, Float f2, String str3);
}
