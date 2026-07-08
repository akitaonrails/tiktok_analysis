package com.ss.android.ugc.aweme.mix.api;

import X.C1169240gX4;
import X.C11NZ;
import X.C1499810p8F;
import X.C2093608Ic;
import X.C723080SXy;
import X.InterfaceC727570SgN;
import android.os.Bundle;
import com.ss.android.ugc.aweme.mix.api.response.MixVideosResponse;
import java.io.Serializable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class MixListNetPreload implements InterfaceC727570SgN<MixFeedApi, C11NZ<MixVideosResponse>> {
    public static final int $stable = 0;

    @Override // X.InterfaceC20153313tL
    public boolean enable(Bundle bundle) {
        return true;
    }

    @Override // X.InterfaceC727570SgN
    public C1499810p8F getPreloadStrategy(Bundle bundle) {
        return new C1499810p8F(false, null, null, 0, false, 31);
    }

    @Override // X.InterfaceC727570SgN
    public boolean handleException(Exception exc) {
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC727570SgN
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
        return mixFeedApiInvoke.getMixVideos2(mixId, mAid, 0L, i, mUsrId, str, false, numValueOf, 1, null, null);
    }
}
