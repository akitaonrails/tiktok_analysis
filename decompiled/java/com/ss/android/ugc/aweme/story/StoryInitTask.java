package com.ss.android.ugc.aweme.story;

import X.C0CCZ;
import X.C0VZ0;
import X.C10UI;
import X.C1209404oG;
import X.C1618440sDa;
import X.C215000sG;
import X.C295190Bhd;
import X.C319400Cfa;
import X.EnumC313670CRh;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.ugc.aweme.story.inbox.IStoryInboxService;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class StoryInitTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "StoryInitTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
        c1618440sDa.LJIIIZ();
        IStoryInboxService iStoryInboxServiceLJJIIZI = c1618440sDa.LJJIIZI();
        if (!C10UI.LIZ()) {
            C319400Cfa.LIZ(C319400Cfa.LIZ, context, EnumC313670CRh.PRELOAD_STORY_BOOT);
        }
        if (!iStoryInboxServiceLJJIIZI.canShowStoryCell() || C295190Bhd.LIZJ() || ((Boolean) C215000sG.LIZ.getValue()).booleanValue() || C1209404oG.LIZ()) {
            return;
        }
        iStoryInboxServiceLJJIIZI.preloadOnBoot();
    }
}
