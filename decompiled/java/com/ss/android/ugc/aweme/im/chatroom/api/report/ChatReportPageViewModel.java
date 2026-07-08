package com.ss.android.ugc.aweme.im.chatroom.api.report;

import X.C2002907sx;
import X.C869590Y9l;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public abstract class ChatReportPageViewModel extends AssemViewModel<C2002907sx> {
    public abstract void vQ2();

    public abstract List<C869590Y9l> xQ2();

    public abstract void yQ2(List<? extends C869590Y9l> list);

    public abstract void zQ2(C869590Y9l c869590Y9l, boolean z);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* JADX INFO: renamed from: wQ2, reason: merged with bridge method [inline-methods] */
    public C2002907sx defaultState() {
        return new C2002907sx(0);
    }
}
