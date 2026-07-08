package com.ss.android.ugc.aweme.mix.api;

import X.AbstractC19484711Kz;
import X.C1169240gX4;
import X.C1499810p8F;
import X.InterfaceC727570SgN;
import android.os.Bundle;
import com.ss.android.ugc.aweme.mix.api.response.MixDetailResponse;
import java.io.Serializable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class MixDetailNetPreload implements InterfaceC727570SgN<MixFeedApi, AbstractC19484711Kz<MixDetailResponse>> {
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
        return mixFeedApiInvoke.getMixDetail(mixId, mUsrId, str, fromShare, true, true, null, null);
    }
}
