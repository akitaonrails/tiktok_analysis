package com.bytedance.android.livesdk.aireply;

import X.C01PM;
import X.C054G;
import X.C09IR;
import X.C0PEM;
import X.C19322110iZ;
import X.C1DFH;
import X.C2107308Nj;
import X.C2252331DDr;
import X.C2296808zG;
import X.C23250099c;
import X.InterfaceC346201Wa;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.aireply.IAIReplyWatcherManagerService;
import com.bytedance.android.livesdk.model.message.CommentReplyMessage;

/* JADX INFO: loaded from: classes.dex */
public class AIReplyWatcherManagerService implements IAIReplyWatcherManagerService {
    public final C054G LL;
    public final C2252331DDr LLILLJJLI;

    public AIReplyWatcherManagerService() {
        C1DFH c1dfh = C0PEM.LIZ;
        this.LL = C2296808zG.LIZ(C2107308Nj.LIZ);
        this.LLILLJJLI = C09IR.LIZIZ(0, 0, null, 7);
    }

    @Override // com.bytedance.android.live.aireply.IAIReplyWatcherManagerService
    public final /* bridge */ /* synthetic */ InterfaceC346201Wa getFeedbackState() {
        return this.LLILLJJLI;
    }

    @Override // com.bytedance.android.live.aireply.IAIReplyWatcherManagerService
    public final /* bridge */ /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.aireply.IAIReplyWatcherManagerService
    public final void showFeedbackDialog(FragmentManager fragmentManager, CommentReplyMessage commentReplyMessage) {
        if (fragmentManager == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("param_msg_id", commentReplyMessage.getMessageId());
        C19322110iZ.LIZLLL(fragmentManager, AIReplyAssistantFeedbackDialog.class, "AIReplyAssistantFeedbackDialog", null, bundle);
    }

    @Override // com.bytedance.android.live.aireply.IAIReplyWatcherManagerService
    public final void showProfileDialog(FragmentManager fragmentManager, CommentReplyMessage commentReplyMessage) {
        if (fragmentManager == null) {
            return;
        }
        C19322110iZ.LIZLLL(fragmentManager, AIReplyAssistantProfileDialog.class, "AIReplyAssistantProfileDialog", null, new Bundle());
    }

    @Override // com.bytedance.android.live.aireply.IAIReplyWatcherManagerService
    public final boolean feedbackComment(CommentReplyMessage commentReplyMessage, long j, boolean z) {
        if (commentReplyMessage.LLILLJJLI) {
            return false;
        }
        commentReplyMessage.LLILLJJLI = true;
        C23250099c.LIZLLL(this.LL, null, null, new C01PM(z, commentReplyMessage, j, this, null), 3);
        return true;
    }
}
