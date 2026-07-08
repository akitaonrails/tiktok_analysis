package com.ss.android.ugc.aweme.service;

import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.PaidVideoItem;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public interface ISeriesPlayNextService {
    void checkAndRemoveCache(Aweme aweme);

    void clearVideoListCache(long j);

    Object loadVideoList(Aweme aweme, long j, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    PaidVideoItem nextVideo(String str, long j);
}
