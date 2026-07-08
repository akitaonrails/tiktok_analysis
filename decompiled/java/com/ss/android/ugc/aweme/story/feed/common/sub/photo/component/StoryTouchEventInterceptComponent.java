package com.ss.android.ugc.aweme.story.feed.common.sub.photo.component;

import X.C0RH0;
import X.C0SUL;
import X.C628500Oky;
import X.C630740Ooa;
import Y.ATListenerS445S0100000_11;
import android.view.View;
import com.ss.android.ugc.aweme.feed.collection.sub.ability.LongPressAbility;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.common.sub.ability.StoryPinchAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryTouchEventInterceptComponent extends BaseCellContentComponent<StoryTouchEventInterceptComponent> {
    public final C630740Ooa LLJJJJLIIL = C628500Oky.LIZ(new AwS555S0100000_11(this, 638));
    public final C630740Ooa LLJJL = C628500Oky.LIZ(new AwS555S0100000_11(this, 637));

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ATListenerS445S0100000_11 aTListenerS445S0100000_11Qm0;
        if (!(view instanceof C0RH0)) {
            return;
        }
        C0RH0 c0rh0 = (C0RH0) view;
        StoryPinchAbility storyPinchAbility = (StoryPinchAbility) this.LLJJJJLIIL.getValue();
        C0SUL c0sulOm = null;
        if (storyPinchAbility != null) {
            aTListenerS445S0100000_11Qm0 = storyPinchAbility.qm0();
        } else {
            aTListenerS445S0100000_11Qm0 = null;
        }
        LongPressAbility longPressAbility = (LongPressAbility) this.LLJJL.getValue();
        if (longPressAbility != null) {
            c0sulOm = longPressAbility.om();
        }
        c0rh0.LL = aTListenerS445S0100000_11Qm0;
        c0rh0.LLILLJJLI = c0sulOm;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}
