package com.ss.android.ugc.aweme.story.preload;

import X.C01GW;
import X.C13BV;
import X.C13LP;
import X.C1499810p8F;
import X.C1618440sDa;
import X.C1720106oR;
import X.C1935107i1;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C727530SgJ;
import X.C728090ShD;
import X.C728340Shc;
import X.C728370Shf;
import X.C730000SkI;
import X.InterfaceC497601wk;
import X.InterfaceC727570SgN;
import X.InterfaceC729990SkH;
import android.os.Bundle;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.api.IStoryApi;
import com.ss.android.ugc.aweme.story.model.UserStoriesResponse;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryUidPreloader implements InterfaceC727570SgN<IStoryApi, UserStoriesResponse> {
    public final C01GW preloadScope$delegate = C1935107i1.LIZ(AFwS198S0000000_11.get$arr$(203));
    public static final C728340Shc Companion = new Object() { // from class: X.0Shc
    };
    public static final int $stable = 8;

    @Override // X.InterfaceC20153313tL
    public boolean enable(Bundle bundle) {
        return true;
    }

    private final InterfaceC497601wk getPreloadScope() {
        return (InterfaceC497601wk) this.preloadScope$delegate.getValue();
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
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload */
    public UserStoriesResponse preload2(Bundle bundle, Function1<? super Class<IStoryApi>, ? extends IStoryApi> function1) throws Exception {
        String string;
        String string2;
        Integer numValueOf;
        String str;
        Aweme aweme;
        Aweme aweme2;
        boolean zLJI = MethodIDManager.LJI(201079);
        if (bundle == null || (string = bundle.getString("__story_uid_preloader_require_uids")) == null) {
            string = "";
        }
        if (bundle != null) {
            string2 = bundle.getString("__story_uid_preloader_insert_param");
        } else {
            string2 = null;
        }
        boolean z = false;
        if (bundle != null) {
            z = bundle.getBoolean("__story_uid_preloader_write_user_story_repo", false);
        }
        int i = C2187451AjH.LIZ;
        InterfaceC729990SkH interfaceC729990SkHLJJIZ = C1618440sDa.LIZIZ.LJJIZ();
        C730000SkI c730000SkI = C730000SkI.LIZIZ;
        c730000SkI.LIZJ(249372176, 7);
        if (interfaceC729990SkHLJJIZ != null) {
            interfaceC729990SkHLJJIZ.LJ(1);
        }
        try {
            C728370Shf c728370Shf = C728370Shf.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('[');
            sbLIZ.append(string);
            sbLIZ.append(']');
            T tLJ = C728370Shf.LIZ(c728370Shf, C2188811AlT.LIZIZ(sbLIZ), string2, 0, function1, 4).LJ();
            UserStoriesResponse userStoriesResponse = (UserStoriesResponse) tLJ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("preload result: ");
            List<Aweme> awemes = userStoriesResponse.getAwemes();
            if (awemes != null && (aweme2 = (Aweme) C13LP.LJJJLL(awemes)) != null) {
                numValueOf = Integer.valueOf(aweme2.hashCode());
            } else {
                numValueOf = null;
            }
            sbLIZ2.append(numValueOf);
            C2188811AlT.LIZIZ(sbLIZ2);
            c730000SkI.LIZJ(249372176, 8);
            if (interfaceC729990SkHLJJIZ != null) {
                interfaceC729990SkHLJJIZ.LJ(2);
            }
            List<Aweme> awemes2 = userStoriesResponse.getAwemes();
            if (awemes2 != null && (aweme = (Aweme) C13LP.LJJJLL(awemes2)) != null) {
                C727530SgJ.LIZJ(aweme);
            }
            if (z) {
                C728090ShD c728090ShD = C728090ShD.LIZ;
                List<Aweme> awemes3 = userStoriesResponse.getAwemes();
                if (awemes3 == null) {
                    awemes3 = C13BV.INSTANCE;
                }
                BaseResponse.ServerTimeExtra serverTimeExtra = userStoriesResponse.extra;
                if (serverTimeExtra != null) {
                    str = serverTimeExtra.logid;
                } else {
                    str = null;
                }
                c728090ShD.LIZ(awemes3, str, null, true);
            }
            UserStoriesResponse userStoriesResponse2 = (UserStoriesResponse) tLJ;
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return userStoriesResponse2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (interfaceC729990SkHLJJIZ != null) {
                interfaceC729990SkHLJJIZ.LJ(4);
            }
            if (zLJI) {
                MethodIDManager.LJ();
            }
            throw e;
        }
    }

    @Override // X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload */
    public /* bridge */ /* synthetic */ UserStoriesResponse preload2(Bundle bundle, Function1<? super Class<IStoryApi>, ? extends IStoryApi> function1) throws Exception {
        boolean zLJI = MethodIDManager.LJI(201079);
        UserStoriesResponse userStoriesResponsePreload2 = preload2(bundle, function1);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return userStoriesResponsePreload2;
    }
}
