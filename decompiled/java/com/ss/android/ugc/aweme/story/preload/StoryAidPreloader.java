package com.ss.android.ugc.aweme.story.preload;

import X.C13LP;
import X.C1499810p8F;
import X.C1720106oR;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C727530SgJ;
import X.C728330Shb;
import X.C730000SkI;
import X.InterfaceC727570SgN;
import android.os.Bundle;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.api.IStoryApi;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryAidPreloader implements InterfaceC727570SgN<IStoryApi, BatchDetailList> {
    public static final int $stable = 0;
    public static final C728330Shb Companion = new Object() { // from class: X.0Shb
    };

    @Override // X.InterfaceC20153313tL
    public boolean enable(Bundle bundle) {
        return true;
    }

    @Override // X.InterfaceC727570SgN
    public C1499810p8F getPreloadStrategy(Bundle bundle) {
        return new C1499810p8F(false, Api.LIZ, null, 0, false, 29);
    }

    @Override // X.InterfaceC727570SgN
    public boolean handleException(Exception exc) {
        int i = C2187451AjH.LIZ;
        C1720106oR.LIZIZ("STORY-Preloader", "preload failed", exc);
        C730000SkI.LIZIZ.LIZJ(249372176, 8);
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload */
    public BatchDetailList preload2(Bundle bundle, Function1<? super Class<IStoryApi>, ? extends IStoryApi> function1) {
        String string;
        String string2;
        Aweme aweme;
        String string3 = null;
        if (bundle != null) {
            string = bundle.getString("__story_aid_preloader_aid");
            string2 = bundle.getString("__story_aid_preloader_type");
            string3 = bundle.getString("__story_aid_preloader_push_params");
        } else {
            string = null;
            string2 = null;
        }
        int i = C2187451AjH.LIZ;
        C730000SkI c730000SkI = C730000SkI.LIZIZ;
        c730000SkI.LIZJ(249372176, 7);
        IStoryApi iStoryApiInvoke = function1.invoke(IStoryApi.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(string);
        sbLIZ.append(']');
        BatchDetailList batchDetailListLJFF = iStoryApiInvoke.queryBatchAwemeRx(C2188811AlT.LIZIZ(sbLIZ), string2, string3, 1).LJFF();
        c730000SkI.LIZJ(249372176, 8);
        List<Aweme> list = batchDetailListLJFF.items;
        if (list != null && (aweme = (Aweme) C13LP.LJJJLL(list)) != null) {
            C727530SgJ.LIZJ(aweme);
        }
        return batchDetailListLJFF;
    }
}
