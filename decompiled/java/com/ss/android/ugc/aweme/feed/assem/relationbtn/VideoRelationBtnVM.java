package com.ss.android.ugc.aweme.feed.assem.relationbtn;

import X.C0T0Y;
import X.C1159310gH3;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.AwS32S0010000_18;
import kotlin.jvm.internal.AwS384S0200000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class VideoRelationBtnVM extends FeedBaseViewModel<C1159310gH3> {
    public static final /* synthetic */ int LLILLL = 0;
    public Integer LL;
    public boolean LLILLJJLI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1159310gH3(0);
    }

    public final void vQ2() {
        Aweme aweme;
        VideoItemParams item = getItem();
        if (item == null || (aweme = item.getAweme()) == null) {
            return;
        }
        withState(new AwS384S0200000_18(aweme, this, 54));
    }

    public final void wQ2(boolean z) {
        Aweme aweme;
        VideoItemParams item = getItem();
        if (item != null && (aweme = item.getAweme()) != null) {
            setState(new AwS32S0010000_18(z, 4));
            C0T0Y.LIZJ(aweme, !z);
        }
    }
}
