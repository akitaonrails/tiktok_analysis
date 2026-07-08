package com.ss.android.ugc.aweme.live.liveevent.sticker.service;

import X.AbstractC19589811ke;
import X.C0FTH;
import X.C0FUH;
import X.C19616411ow;
import X.C19616611oy;
import X.C19633911rl;
import X.C19EG;
import X.C390420FSm;
import X.C705930RmZ;
import X.InterfaceC388760FMc;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.liveevent.LiveEventCountdownStickerEnableSetting;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tools.sticker.core.liveevent.service.ILiveEventStickerService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes30.dex */
public final class LiveEventStickerServiceImpl implements ILiveEventStickerService {
    @Override // com.ss.android.ugc.aweme.tools.sticker.core.liveevent.service.ILiveEventStickerService
    public final boolean LIZ() {
        return LiveEventCountdownStickerEnableSetting.INSTANCE.getValue();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.liveevent.service.ILiveEventStickerService
    public final Class<AbstractC19589811ke<?>> LIZIZ() {
        return C19616411ow.class;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.liveevent.service.ILiveEventStickerService
    public final C19616611oy LIZLLL(Context context, C705930RmZ c705930RmZ, Aweme aweme, C19EG c19eg, boolean z, Function0 function0) {
        return new C19616611oy(context, c705930RmZ, aweme, c19eg, z, function0);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.liveevent.service.ILiveEventStickerService
    public final C19633911rl LIZJ(Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, InterfaceC388760FMc interfaceC388760FMc, C0FTH c0fth, C0FUH c0fuh, C390420FSm c390420FSm) {
        return new C19633911rl(context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fuh, c390420FSm);
    }
}
