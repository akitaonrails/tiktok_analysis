package com.ss.android.ugc.aweme.upvote.detail.reposttab;

import X.C01OT;
import X.C0PEM;
import X.C11NZ;
import X.C1265710j2f;
import X.C1358550lSP;
import X.C1358950lT3;
import X.C1499810p8F;
import X.C1697810uHb;
import X.C2296808zG;
import X.C23250099c;
import X.InterfaceC727570SgN;
import android.os.Bundle;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.preload.PreloadExtraInfo;
import com.ss.android.ugc.aweme.upvote.api.IUpvoteApi;
import com.ss.android.ugc.aweme.upvote.model.RepostListResponse;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class RepostTabPreload implements InterfaceC727570SgN<IUpvoteApi, C11NZ<RepostListResponse>> {
    public static final C1265710j2f Companion = new Object() { // from class: X.0j2f
    };

    @Override // X.InterfaceC20153313tL
    public boolean enable(Bundle bundle) {
        return true;
    }

    @Override // X.InterfaceC727570SgN
    public C1499810p8F getPreloadStrategy(Bundle bundle) {
        return new C1499810p8F(true, Api.LIZ, null, 300000, false, 24);
    }

    @Override // X.InterfaceC727570SgN
    public boolean handleException(Exception exc) {
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload */
    public C11NZ<RepostListResponse> preload2(Bundle bundle, Function1<? super Class<IUpvoteApi>, ? extends IUpvoteApi> function1) {
        String string;
        String string2;
        long j;
        int i;
        int i2;
        int i3;
        if (bundle != null) {
            string = bundle.getString("enter_from");
        } else {
            string = null;
        }
        if (bundle == null || (string2 = bundle.getString("user_id")) == null) {
            string2 = "";
        }
        if (bundle != null) {
            j = bundle.getLong("offset");
        } else {
            j = 0;
        }
        if (bundle != null) {
            i = bundle.getInt("count");
        } else {
            i = 21;
        }
        if (bundle != null) {
            i2 = bundle.getInt(Scene.SCENE_SERVICE);
            i3 = bundle.getInt("strategyId");
        } else {
            i2 = 0;
            i3 = 0;
        }
        PreloadExtraInfo preloadExtraInfo = new PreloadExtraInfo(i3, string, string, "tiktok/v1/upvote/item/list", C1697810uHb.LJIIJJI("user_id", "offset", "count", Scene.SCENE_SERVICE));
        C1358550lSP c1358550lSP = C1358550lSP.LIZ;
        boolean zLJFF = Intrinsics.LJFF(string, "personal_homepage");
        c1358550lSP.getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01OT(zLJFF, null), 3);
        IUpvoteApi iUpvoteApiInvoke = function1.invoke(IUpvoteApi.class);
        Integer numValueOf = Integer.valueOf(i2);
        C1358950lT3.LIZ.getClass();
        return iUpvoteApiInvoke.getRepostVideoList(string2, j, i, numValueOf, C1358950lT3.LIZIZ(), preloadExtraInfo, null);
    }
}
