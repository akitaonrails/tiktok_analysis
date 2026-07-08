package com.ss.android.ugc.aweme.ecommerce.ug.perf;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface IMallLandingPerfTracker {
    void LIZ(Long l, String str);

    void LIZIZ(String str, String str2, Map map);

    void LIZJ(String str);

    void LIZLLL(Long l, String str, Map map);

    void LJ(Long l, String str);

    void LJFF(Long l, String str);

    void LJI(Long l, String str);

    String newPerfId();

    void onClickMallEntry(String str, Long l);

    void onLandingFinished(String str, String str2, Map<String, ? extends Object> map, int i);

    void onSearchMixLandingFinished(String str, long j, String str2);

    void onStartJumpToMall(String str, Long l, boolean z);
}
