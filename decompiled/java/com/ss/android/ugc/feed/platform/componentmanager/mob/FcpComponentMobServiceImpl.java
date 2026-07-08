package com.ss.android.ugc.feed.platform.componentmanager.mob;

import X.C13LP;
import X.C20684815ws;
import X.C2344009Gk;
import X.C698670Rar;
import X.C698800Rb4;
import X.C699090RbX;
import X.C700100RdA;
import X.C700120RdC;
import X.C700410Rdf;
import X.C700460Rdk;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.FcpAwemeInfo;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class FcpComponentMobServiceImpl implements IFcpComponentMobService {
    @Override // com.ss.android.ugc.feed.platform.componentmanager.mob.IFcpComponentMobService
    public final boolean LIZ(ViewGroup viewGroup, Map map) {
        C699090RbX c699090RbX;
        C699090RbX c699090RbX2;
        FcpAwemeInfo fcpAwemeInfo;
        int i = C700100RdA.LJII;
        Object tag = viewGroup.getTag(i);
        if (tag instanceof C699090RbX) {
            c699090RbX = (C699090RbX) tag;
        } else {
            c699090RbX = null;
        }
        if (c699090RbX == null || !Intrinsics.LJFF(c699090RbX.LLILZ, "anchor_poi")) {
            return false;
        }
        C700410Rdf.LIZ.getClass();
        Object tag2 = viewGroup.getTag(i);
        if ((tag2 instanceof C699090RbX) && (c699090RbX2 = (C699090RbX) tag2) != null) {
            Object tag3 = viewGroup.getTag(C700100RdA.LJIIIIZZ);
            if ((tag3 instanceof FcpAwemeInfo) && (fcpAwemeInfo = (FcpAwemeInfo) tag3) != null) {
                String str = c699090RbX2.LLILZ;
                String matchedContainerKey = c699090RbX2.LLILLJJLI.getMatchedContainerKey();
                String str2 = c699090RbX2.LLILZLL;
                String str3 = c699090RbX2.LLILZIL;
                boolean zLJFF = Intrinsics.LJFF(c699090RbX2.LLJILJILJ, Boolean.TRUE);
                if (!TextUtils.isEmpty(str) && !C13LP.LJJJJ(str, C698800Rb4.LJ)) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LIZJ(C700120RdC.LIZ(str2) ? 1 : 0, "hit_fcp");
                    c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, str2);
                    if (str3 == null) {
                        str3 = fcpAwemeInfo.enterFrom;
                    }
                    c2344009Gk.LJIIIIZZ("enter_from", str3);
                    c2344009Gk.LJIIIIZZ("group_id", fcpAwemeInfo.groupId);
                    c2344009Gk.LJIIIIZZ("author_id", fcpAwemeInfo.authorId);
                    c2344009Gk.LJIIIIZZ("component_key", str);
                    c2344009Gk.LJIIIIZZ("component_type", C700460Rdk.LIZIZ(matchedContainerKey));
                    c2344009Gk.LIZJ(fcpAwemeInfo.awemeType, "aweme_type");
                    c2344009Gk.LJIIIIZZ("aweme_genres", fcpAwemeInfo.genreType);
                    c2344009Gk.LJIIIIZZ("enter_method", fcpAwemeInfo.enterMethod);
                    c2344009Gk.LIZJ(zLJFF ? 1 : 0, "should_preload");
                    C700410Rdf.LIZJ(c2344009Gk, c699090RbX2);
                    for (Map.Entry entry : map.entrySet()) {
                        c2344009Gk.LJFF((String) entry.getKey(), (String) entry.getValue());
                    }
                    C698670Rar.LIZ.getClass();
                    C698670Rar.LIZJ(c2344009Gk);
                    C20684815ws.LJIILLIIL("show_core_fdmt_component_dynamic_part", c2344009Gk.LIZ);
                    IFeedDebugService iFeedDebugService = (IFeedDebugService) PluggableExtentionKt.pluggableSpi$default(IFeedDebugService.class, false, false, false, 14, null);
                    if (iFeedDebugService != null) {
                        iFeedDebugService.LIZJ();
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }
}
