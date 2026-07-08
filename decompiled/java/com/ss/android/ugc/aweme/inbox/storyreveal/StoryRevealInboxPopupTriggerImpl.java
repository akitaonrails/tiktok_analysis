package com.ss.android.ugc.aweme.inbox.storyreveal;

import X.C2252408s6;
import X.EnumC717440SCg;
import X.InterfaceC20660615sy;
import android.content.Context;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.story.reveal.IStoryRevealInboxPopupTrigger;
import com.ss.android.ugc.aweme.story.reveal.IStoryRevealService;
import kotlin.jvm.internal.AwS6S0400100_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryRevealInboxPopupTriggerImpl implements IStoryRevealInboxPopupTrigger {
    public final long LIZ = 500;
    public long LIZIZ;

    @Override // com.ss.android.ugc.aweme.story.reveal.IStoryRevealInboxPopupTrigger
    public final void LIZ(InterfaceC20660615sy interfaceC20660615sy, Context context, Fragment fragment, boolean z) {
        EnumC717440SCg enumC717440SCgLIZIZ;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.LIZIZ < this.LIZ || context == null) {
            return;
        }
        IStoryRevealService iStoryRevealService = (IStoryRevealService) PluggableExtentionKt.pluggableSpi$default(IStoryRevealService.class, false, false, false, 14, null);
        if (iStoryRevealService != null && (enumC717440SCgLIZIZ = iStoryRevealService.LIZIZ()) != null) {
            C2252408s6.LJIIIIZZ(new AwS6S0400100_11(fragment, interfaceC20660615sy, enumC717440SCgLIZIZ, this, jElapsedRealtime, 1));
            return;
        }
        if (z) {
            return;
        }
        IStoryRevealService iStoryRevealService2 = (IStoryRevealService) PluggableExtentionKt.pluggableSpi$default(IStoryRevealService.class, false, false, false, 14, null);
        if (iStoryRevealService2 != null && !iStoryRevealService2.LJIILIIL()) {
            return;
        }
        C2252408s6.LJIIIIZZ(new AwS6S0400100_11(fragment, interfaceC20660615sy, context, this, jElapsedRealtime, 2));
    }
}
