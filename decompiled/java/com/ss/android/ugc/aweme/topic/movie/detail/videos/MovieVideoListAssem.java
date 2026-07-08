package com.ss.android.ugc.aweme.topic.movie.detail.videos;

import X.AbstractC738140SxQ;
import X.C1220000hqw;
import X.C13LE;
import X.C1559260qg8;
import X.C1607950rwf;
import X.C451610HnL;
import X.C452070Ho5;
import X.C607770Nsd;
import X.C607950Nsv;
import X.C626940OiS;
import X.C723590SZx;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.View;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.detail.prefab.DetailListAssem;
import com.ss.android.ugc.aweme.detail.prefab.ability.InnerFlowAbility;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.topic.movie.detail.vm.MovieVideoListVM;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class MovieVideoListAssem extends DetailListAssem implements InnerFlowAbility<C607950Nsv> {
    public final C1559260qg8 LLJJJIL = new C1559260qg8(new C723590SZx(this, C626940OiS.class, null), checkSupervisorPrepared());
    public final C736950SvV LLJJJJ;

    public final C626940OiS Ap() {
        return (C626940OiS) this.LLJJJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.prefab.ListAssem
    public final AssemListViewModel tp() {
        return (AssemListViewModel) this.LLJJJJ.getValue();
    }

    public MovieVideoListAssem() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 1554);
        this.LLJJJJ = new C736950SvV(C13LE.LIZ(MovieVideoListVM.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(646), new AwS553S0100000_9((AbstractC738140SxQ) this, 1553), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.topic.movie.detail.videos.MovieVideoListAssem for r13v2 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.ss.android.ugc.aweme.detail.prefab.DetailListAssem, com.ss.android.ugc.aweme.prefab.ListAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(android.view.View r14) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.topic.movie.detail.videos.MovieVideoListAssem.onViewCreated(android.view.View):void");
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.InnerFlowAbility
    public final void Nu0(C607770Nsd c607770Nsd, View view) {
        String str;
        String str2;
        AccountUserService accountUserServiceLJIIJ = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(view.getContext(), "aweme://aweme/detail/");
        smartRouteBuildRoute.withParam("activity_has_activity_options", true);
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, ((C607950Nsv) c607770Nsd).LLILLJJLI.getAid(), bundle);
        C786410Ut5.LJJJI("userid", accountUserServiceLJIIJ.getCurUserId(), bundle);
        C786410Ut5.LJJJI("sec_userid", accountUserServiceLJIIJ.getCurSecUserId(), bundle);
        bundle.putInt("video_type", 47);
        C786410Ut5.LJJJI("enter_from", "movie_detail_page", bundle);
        C786410Ut5.LJJJI("video_from", "MOVIE_VIDEO_LIST_ENTRANCE", bundle);
        HashMap map = new HashMap();
        C626940OiS c626940OiSAp = Ap();
        String str3 = "";
        if (c626940OiSAp == null || (str = c626940OiSAp.LL) == null) {
            str = "";
        }
        map.put("movie_id", str);
        C626940OiS c626940OiSAp2 = Ap();
        if (c626940OiSAp2 != null && (str2 = c626940OiSAp2.LLILLJJLI) != null) {
            str3 = str2;
        }
        map.put("page_id", str3);
        C786410Ut5.LJJIZ(bundle, "feed_param_extra", map);
        smartRouteBuildRoute.withParam(bundle);
        smartRouteBuildRoute.withBundleAnimation(C1607950rwf.LIZ(view, view.getWidth(), view.getHeight()).LJFF());
        smartRouteBuildRoute.open();
    }
}
