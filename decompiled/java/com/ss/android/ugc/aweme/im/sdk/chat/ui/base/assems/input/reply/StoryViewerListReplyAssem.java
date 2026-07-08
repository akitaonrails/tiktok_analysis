package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.reply;

import X.AbstractC738140SxQ;
import X.C0I3C;
import X.C1220000hqw;
import X.C13LE;
import X.C1559260qg8;
import X.C19719912Dl;
import X.C451610HnL;
import X.C452070Ho5;
import X.C454980Hsm;
import X.C457780HxI;
import X.C723590SZx;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736950SvV;
import X.C869590Y9l;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class StoryViewerListReplyAssem extends AbstractC738140SxQ {
    public final C1559260qg8 LL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C736950SvV LLILLJJLI;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public StoryViewerListReplyAssem() {
        AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(this, 269);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageReplyVM.class);
        AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(142);
        this.LLILLJJLI = new C736950SvV(c19719912DlLIZ, new AwS550S0100000_6(awS550S0100000_6, 270), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS236S0000000_6, new AwS550S0100000_6((AbstractC738140SxQ) this, 271), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        C869590Y9l storyViewerListReplyMsg = ((C457780HxI) this.LL.getValue()).LL.getStoryViewerListReplyMsg();
        if (storyViewerListReplyMsg != null) {
            ((MessageReplyVM) this.LLILLJJLI.getValue()).qH1(new C454980Hsm(storyViewerListReplyMsg, C0I3C.STORY_VIEWER_LIST_REPLY));
            ((C457780HxI) this.LL.getValue()).LL.setStoryViewerListReplyMsg(null);
        }
    }
}
