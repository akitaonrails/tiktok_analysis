package com.ss.android.ugc.aweme.comment.exposedcmt;

import X.C0RZV;
import X.C729740Sjs;
import X.EnumC708390RqX;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.comment.api.IExposedCommentDataAbility;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* JADX INFO: loaded from: classes12.dex */
public final class ExposedCommentVM extends AssemViewModel<C0RZV> {
    public IExposedCommentDataAbility LL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0RZV(null, null);
    }

    public static EnumC708390RqX vQ2(VideoItemParams videoItemParams) {
        if (videoItemParams.getAweme().getExposedCommentInfoList() != null && (!r0.isEmpty())) {
            int i = ExposedCommentInfoTrigger.LLJL;
            if (C729740Sjs.LIZ(videoItemParams)) {
                return EnumC708390RqX.SHOW;
            }
        }
        return EnumC708390RqX.HIDE;
    }
}
