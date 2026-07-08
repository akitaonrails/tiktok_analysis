package com.ss.android.ugc.aweme.poi.collect;

/* JADX INFO: loaded from: classes19.dex */
public interface IPoiCollectService {
    boolean canShowWantTogoCollection();

    void onCollectionDelete(String str);

    void onVideoAddToCollection(Boolean bool, String str, String str2, String str3, String str4);

    void onWantToGoClick();

    void onWantToGoShow();
}
