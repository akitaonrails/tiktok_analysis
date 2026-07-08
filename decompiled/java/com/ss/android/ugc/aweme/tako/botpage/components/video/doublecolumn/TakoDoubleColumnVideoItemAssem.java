package com.ss.android.ugc.aweme.tako.botpage.components.video.doublecolumn;

import X.C1558520qew;
import X.C1559260qg8;
import X.C329470Cvp;
import X.C329510Cvt;
import X.C723590SZx;
import X.InterfaceC665370Q7z;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.tako.botpage.components.video.commonvideo.TakoVideoCommonItemAssem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoDoubleColumnVideoItemAssem extends TakoVideoCommonItemAssem<TakoDoubleColumnVideoItemAssem> {
    public final C1559260qg8 LLLFF = new C1559260qg8(new C723590SZx(this, C329470Cvp.class, null), checkSupervisorPrepared());

    @Override // com.ss.android.ugc.aweme.tako.botpage.components.video.commonvideo.TakoVideoCommonItemAssem
    public final String sp() {
        return "video_panel";
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.components.video.commonvideo.TakoVideoCommonItemAssem
    public final void yp(String str) {
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.components.video.commonvideo.TakoVideoCommonItemAssem
    public final void up() {
        TakoVideoItem takoVideoItem;
        C329510Cvt c329510Cvt = this.LLLF;
        if (c329510Cvt == null || (takoVideoItem = c329510Cvt.LLILLJJLI) == null) {
            return;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getContext(), "//aweme/detail");
        smartRouteBuildRoute.withParam("video_from", "tako_double_column_inner_cell");
        smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, takoVideoItem.awemeId);
        smartRouteBuildRoute.withParam("enter_from", getCommonParams().get("enter_from"));
        smartRouteBuildRoute.withParam("enter_method", getCommonParams().get("enter_method"));
        smartRouteBuildRoute.withParam("message_id", ((C329470Cvp) this.LLLFF.getValue()).getUuid());
        smartRouteBuildRoute.withParam("process_id", getCommonParams().get("process_id"));
        smartRouteBuildRoute.withParam("tako_session_id", getCommonParams().get("tako_session_id"));
        smartRouteBuildRoute.withParam("tako_chat_id", getCommonParams().get("tako_chat_id"));
        smartRouteBuildRoute.withParam("situation", "video_recommend");
        smartRouteBuildRoute.withParam("page", "video_panel");
        smartRouteBuildRoute.withParam("innerfeed_entrance_group_id", takoVideoItem.awemeId);
        C329510Cvt c329510Cvt2 = this.LLLF;
        smartRouteBuildRoute.withParam("innerfeed_entrance_rank", String.valueOf(c329510Cvt2 != null ? Integer.valueOf(c329510Cvt2.LL) : null));
        smartRouteBuildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.components.video.commonvideo.TakoVideoCommonItemAssem
    public final InterfaceC665370Q7z zp() {
        InterfaceC665370Q7z vscope = ((C329470Cvp) this.LLLFF.getValue()).getVscope();
        return vscope == null ? C1558520qew.LJIIL(this) : vscope;
    }
}
