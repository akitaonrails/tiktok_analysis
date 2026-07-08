package com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base;

import X.C01GW;
import X.C06NG;
import X.C06NH;
import X.C06RC;
import X.C1676806hS;
import X.C452501pT;
import X.EnumC1596306Mv;
import X.EnumC1641806bo;
import X.EnumC1670906gV;
import X.EnumC1674506h5;
import X.InterfaceC1675606hG;
import com.ss.android.ugc.aweme.im.chatroom.api.IAnimationConflictChecker;
import com.ss.android.ugc.aweme.im.prompts.api.freqcontrol.IPromptUnifiedFrequencyController;
import java.util.Map;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS229S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class AnimationConflictCheckerImpl implements IAnimationConflictChecker {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(379));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(380));

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.IAnimationConflictChecker
    public final boolean LIZ(String str) {
        boolean z;
        boolean z2;
        Map<String, C06RC> mapLJIIIIZZ;
        C06RC c06rc;
        C1676806hS<InterfaceC1675606hG> c1676806hSR0;
        C1676806hS<EnumC1641806bo> c1676806hSP0;
        C1676806hS<EnumC1670906gV> c1676806hSU0;
        C1676806hS<EnumC1674506h5> c1676806hSW0;
        EnumC1596306Mv enumC1596306MvLIZJ;
        IChatNoticeFlowEngine iChatNoticeFlowEngine = (IChatNoticeFlowEngine) this.LIZ.getValue();
        C06NG uiPosition = null;
        if (iChatNoticeFlowEngine != null && (enumC1596306MvLIZJ = iChatNoticeFlowEngine.LIZJ(C06NH.BOTTOM)) != null) {
            uiPosition = enumC1596306MvLIZJ.getUiPosition();
        }
        if (uiPosition == C06NG.BOTTOM_OTHERS) {
            z = true;
        } else {
            z = false;
        }
        IPromptUnifiedFrequencyController iPromptUnifiedFrequencyController = (IPromptUnifiedFrequencyController) this.LIZIZ.getValue();
        if (iPromptUnifiedFrequencyController != null && (mapLJIIIIZZ = iPromptUnifiedFrequencyController.LJIIIIZZ()) != null && (c06rc = mapLJIIIIZZ.get(str)) != null && (((c1676806hSR0 = c06rc.r0()) != null && c1676806hSR0.LIZIZ(AFwS229S0000000_2.get$arr$(260))) || (((c1676806hSP0 = c06rc.p0()) != null && c1676806hSP0.LIZIZ(AFwS229S0000000_2.get$arr$(261))) || (((c1676806hSU0 = c06rc.u0()) != null && c1676806hSU0.LIZIZ(AFwS229S0000000_2.get$arr$(262))) || ((c1676806hSW0 = c06rc.w0()) != null && c1676806hSW0.LIZIZ(AFwS229S0000000_2.get$arr$(263))))))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }
}
