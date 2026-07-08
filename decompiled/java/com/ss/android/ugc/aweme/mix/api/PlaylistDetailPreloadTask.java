package com.ss.android.ugc.aweme.mix.api;

import X.AbstractC19484711Kz;
import X.C0COU;
import X.C1169240gX4;
import android.os.Bundle;
import com.ss.android.ugc.aweme.mix.api.response.MixDetailResponse;
import com.ss.android.ugc.aweme.preload.PreloadExtraInfo;
import com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class PlaylistDetailPreloadTask extends AbsFcpDataPreloadTask<MixFeedApi, AbstractC19484711Kz<MixDetailResponse>> {
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask
    public String componentKey() {
        return "bottom_banner_playlist";
    }

    @Override // com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask
    public List<String> urlList() {
        return Collections.singletonList("/tiktok/v1/mix/detail/");
    }

    @Override // com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask, X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload */
    public AbstractC19484711Kz<MixDetailResponse> preload2(Bundle bundle, Function1<? super Class<MixFeedApi>, ? extends MixFeedApi> function1) {
        Serializable serializable;
        String mUsrId;
        String mSecUid;
        boolean fromShare;
        C1169240gX4 c1169240gX4;
        String mixId = null;
        if (bundle != null) {
            serializable = bundle.getSerializable("mix_video_list_params");
        } else {
            serializable = null;
        }
        if ((serializable instanceof C1169240gX4) && (c1169240gX4 = (C1169240gX4) serializable) != null) {
            mUsrId = c1169240gX4.getMUsrId();
            mSecUid = c1169240gX4.getMSecUid();
            c1169240gX4.getMAid();
            mixId = c1169240gX4.getMixId();
            fromShare = c1169240gX4.getFromShare();
        } else {
            mUsrId = null;
            mSecUid = null;
            fromShare = false;
        }
        MixFeedApi mixFeedApiInvoke = function1.invoke(MixFeedApi.class);
        String str = "";
        if (mixId == null) {
            mixId = "";
        }
        if (mUsrId == null) {
            mUsrId = "";
        }
        if (mSecUid != null) {
            str = mSecUid;
        }
        boolean zLIZ = C0COU.LIZ();
        PreloadExtraInfo preloadExtraInfo = new PreloadExtraInfo(-1, "homepage_hot", "homepage_hot", "/tiktok/v1/mix/detail/", null);
        preloadExtraInfo.bizTag = "bottom_banner_playlist";
        return mixFeedApiInvoke.getMixDetail(mixId, mUsrId, str, fromShare, true, zLIZ, preloadExtraInfo, null);
    }

    @Override // com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask, X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload */
    public /* bridge */ /* synthetic */ Object preload2(Bundle bundle, Function1 function1) {
        return preload2(bundle, (Function1<? super Class<MixFeedApi>, ? extends MixFeedApi>) function1);
    }
}
