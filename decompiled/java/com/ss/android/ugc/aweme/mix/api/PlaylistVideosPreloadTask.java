package com.ss.android.ugc.aweme.mix.api;

import X.C1169240gX4;
import X.C11NZ;
import X.C2093608Ic;
import X.C723080SXy;
import android.os.Bundle;
import com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse;
import com.ss.android.ugc.aweme.preload.PreloadExtraInfo;
import com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class PlaylistVideosPreloadTask extends AbsFcpDataPreloadTask<MixFeedApi, C11NZ<MixVideosResponse>> {
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask
    public String componentKey() {
        return "bottom_banner_playlist";
    }

    @Override // com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask
    public List<String> urlList() {
        return Collections.singletonList("/tiktok/v1/mix/videos/");
    }

    @Override // com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask, X.InterfaceC727570SgN
    public boolean handleException(Exception exc) {
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask, X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload */
    public C11NZ<MixVideosResponse> preload2(Bundle bundle, Function1<? super Class<MixFeedApi>, ? extends MixFeedApi> function1) {
        Serializable serializable;
        String mUsrId;
        String mSecUid;
        String mAid;
        int i;
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
            mAid = c1169240gX4.getMAid();
            mixId = c1169240gX4.getMixId();
        } else {
            mUsrId = null;
            mSecUid = null;
            mAid = null;
        }
        Integer numValueOf = Integer.valueOf(C723080SXy.LIZ());
        if (!C2093608Ic.LJ(mAid)) {
            i = 4;
        } else {
            i = 1;
        }
        MixFeedApi mixFeedApiInvoke = function1.invoke(MixFeedApi.class);
        String str = "";
        if (mixId == null) {
            mixId = "";
        }
        if (mAid == null) {
            mAid = "";
        }
        if (mUsrId == null) {
            mUsrId = "";
        }
        if (mSecUid != null) {
            str = mSecUid;
        }
        PreloadExtraInfo preloadExtraInfo = new PreloadExtraInfo(-1, "homepage_hot", "homepage_hot", "/tiktok/v1/mix/videos/", null);
        preloadExtraInfo.bizTag = "bottom_banner_playlist";
        return mixFeedApiInvoke.getMixVideos2(mixId, mAid, 0L, i, mUsrId, str, false, numValueOf, 1, preloadExtraInfo, null);
    }

    @Override // com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask, X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload */
    public /* bridge */ /* synthetic */ Object preload2(Bundle bundle, Function1 function1) {
        return preload2(bundle, (Function1<? super Class<MixFeedApi>, ? extends MixFeedApi>) function1);
    }
}
