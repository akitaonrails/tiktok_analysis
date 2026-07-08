package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.C13IQ;
import X.C13LE;
import X.C294400BgM;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public final class ExposedEmojiPanelTrigger extends BaseSlotComponentTrigger {
    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseSlotComponentTrigger
    public final C13IQ<? extends UISlotAssem> getType() {
        return C13LE.LIZ(HorizontalEmojiMiniPanelAssemForKeyboard.class);
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseSlotComponentTrigger
    public final int Ho() {
        return C294400BgM.LIZ() ? R.id.oe0 : R.id.odz;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseSlotComponentTrigger
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Go(com.ss.android.ugc.aweme.comment.model.CommentContextSource r7, X.C1346950l9h r8) {
        /*
            r6 = this;
            r5 = 0
            if (r8 == 0) goto L4d
            X.0lAF r4 = r8.LL
        L5:
            X.0l9x r0 = X.C1347110l9x.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            r3 = 1
            r2 = 0
            if (r0 != 0) goto L4b
            X.0l9y r0 = X.C1347120l9y.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 != 0) goto L4b
            r1 = 0
        L18:
            boolean r0 = com.ss.android.ugc.aweme.comment.experiment.PersonalizedEmojiExperiment.LIZ()
            if (r0 != 0) goto L42
            if (r7 == 0) goto L2e
            com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel r0 = r7.getKeyboardModel()
            if (r0 == 0) goto L2e
            boolean r0 = r0.isLandscapeMode()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
        L2e:
            boolean r0 = X.C1346420l8q.LIZJ(r5)
            if (r0 != 0) goto L42
            if (r7 == 0) goto L4f
            com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel r0 = r7.getKeyboardModel()
            if (r0 == 0) goto L4f
            boolean r0 = r0.getHideExposedEmojiInNonePanel()
            if (r0 != r3) goto L4f
        L42:
            X.0l9y r0 = X.C1347120l9y.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 == 0) goto L4f
            return r2
        L4b:
            r1 = 1
            goto L18
        L4d:
            r4 = r5
            goto L5
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.ExposedEmojiPanelTrigger.Go(com.ss.android.ugc.aweme.comment.model.CommentContextSource, X.0l9h):boolean");
    }
}
