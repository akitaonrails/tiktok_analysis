package com.ss.android.ugc.aweme.tako.aivideo.detail.page;

import X.C0DSB;
import X.C786410Ut5;
import X.C814420VxA;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes5.dex */
public final class TakoAIVideoDownloadProgressBarAssem extends UIContentAssem {
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        View viewFindViewById = view.findViewById(R.id.g4s);
        if (viewFindViewById != null) {
            viewFindViewById.setPaddingRelative(0, 0, 0, C814420VxA.LIZIZ(C0DSB.LIZ(6)));
        }
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.g4t);
        if (viewStub != null) {
            C786410Ut5.LJLLLL(viewStub).setPaddingRelative(0, 0, 0, C814420VxA.LIZIZ(C0DSB.LIZ(6)));
        }
    }
}
