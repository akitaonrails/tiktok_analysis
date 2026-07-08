package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.C1346950l9h;
import X.C13IQ;
import X.C13LE;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public final class SingleLineAreaBelowInputTrigger extends BaseSlotComponentTrigger {
    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseSlotComponentTrigger
    public final int Ho() {
        return R.id.vcb;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseSlotComponentTrigger
    public final C13IQ<? extends UISlotAssem> getType() {
        return C13LE.LIZ(SingleLineAreaBelowInputAssem.class);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseSlotComponentTrigger
    public final boolean Go(CommentContextSource commentContextSource, C1346950l9h c1346950l9h) {
        CommentKeyboardModel keyboardModel;
        boolean z = false;
        if (commentContextSource != null && (keyboardModel = commentContextSource.getKeyboardModel()) != null && keyboardModel.isLandscapeMode()) {
            z = true;
        }
        return !z;
    }
}
