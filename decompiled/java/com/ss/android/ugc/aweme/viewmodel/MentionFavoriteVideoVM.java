package com.ss.android.ugc.aweme.viewmodel;

import X.AbstractC316870CbV;
import X.AbstractC848400XPy;
import X.C0OBG;
import X.C0XQ7;
import X.C1157130gDX;
import X.C1220050hr1;
import X.C1220270hrN;
import X.C12823050b;
import X.C627660Ojc;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.fragments.MentionVideoListFragment;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class MentionFavoriteVideoVM extends BaseVideoListVM<C1220270hrN, C12823050b, Long> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1220270hrN(0);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void manualListRefresh() {
        withState(new AwS598S0100000_19(this, 597));
        super.manualListRefresh();
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C12823050b> c627660Ojc) {
        setState(new AwS598S0100000_19(c627660Ojc, (C627660Ojc<C1157130gDX>) 277));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        this.LLILZLL = true;
        return AQ2(0L, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5 A[Catch: Exception -> 0x0121, TryCatch #1 {Exception -> 0x0121, blocks: (B:29:0x009a, B:30:0x009d, B:32:0x00a3, B:37:0x00ad, B:41:0x00b5, B:42:0x00b9, B:44:0x00bf, B:46:0x00cb, B:48:0x00d1, B:49:0x00da, B:51:0x00e0, B:53:0x00e4, B:54:0x00ee, B:56:0x00f4, B:58:0x00fa, B:61:0x010e, B:60:0x0103, B:25:0x006f, B:26:0x0072, B:17:0x003e, B:22:0x004f, B:63:0x0119, B:64:0x0120, B:20:0x0049, B:18:0x0041), top: B:73:0x001d, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0103 A[Catch: Exception -> 0x0121, TryCatch #1 {Exception -> 0x0121, blocks: (B:29:0x009a, B:30:0x009d, B:32:0x00a3, B:37:0x00ad, B:41:0x00b5, B:42:0x00b9, B:44:0x00bf, B:46:0x00cb, B:48:0x00d1, B:49:0x00da, B:51:0x00e0, B:53:0x00e4, B:54:0x00ee, B:56:0x00f4, B:58:0x00fa, B:61:0x010e, B:60:0x0103, B:25:0x006f, B:26:0x0072, B:17:0x003e, B:22:0x004f, B:63:0x0119, B:64:0x0120, B:20:0x0049, B:18:0x0041), top: B:73:0x001d, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AQ2(long r13, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Long>> r15) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.viewmodel.MentionFavoriteVideoVM.AQ2(long, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return AQ2(((Number) obj).longValue(), interfaceC1364105Vn);
    }

    public final void zQ2(View view, Aweme aweme) {
        Fragment fragment;
        if (C0OBG.LIZIZ(view) || aweme == null || (fragment = this.LLILLL) == null || fragment.getActivity() == null || !BaseVideoListVM.vQ2(this.LLILLL)) {
            return;
        }
        Fragment fragment2 = this.LLILLL;
        if ((fragment2 instanceof MentionVideoListFragment) && fragment2 != null) {
            MentionVideoListFragment.LLJJIJIL = new C1220050hr1(this.LL, aweme);
        }
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, aweme.getAid(), bundle);
        C786410Ut5.LJJJI("video_from", "from_publish_add_video", bundle);
        C786410Ut5.LJJJI("userid", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), bundle);
        C786410Ut5.LJJJI("sec_userid", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurSecUserId(), bundle);
        C786410Ut5.LJJJI("refer", "collection_video", bundle);
        bundle.putInt("video_type", 4);
        C786410Ut5.LJJJI("mention_video_author_uid", AwemeExtKt.getAuthorUid(aweme), bundle);
        SmartRoute smartRouteBuildFragmentRoute = SmartRouter.buildFragmentRoute(this.LLILLL, "aweme://aweme/detail/");
        smartRouteBuildFragmentRoute.withParam(bundle);
        smartRouteBuildFragmentRoute.withParam("activity_has_activity_options", true);
        smartRouteBuildFragmentRoute.open(9);
    }
}
