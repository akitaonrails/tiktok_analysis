package com.ss.android.ugc.aweme.live.liveevent.storysticker;

import X.AbstractC19589811ke;
import X.AbstractC388880FMo;
import X.C0FTH;
import X.C0FUH;
import X.C19616211ou;
import X.C19621811po;
import X.C390420FSm;
import X.InterfaceC388760FMc;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.liveeventstory.LiveEventStoryStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.liveeventstory.service.ILiveEventStoryStickerService;

/* JADX INFO: loaded from: classes30.dex */
public final class LiveEventStoryStickerServiceImpl implements ILiveEventStoryStickerService {
    @Override // com.ss.android.ugc.aweme.tools.sticker.core.liveeventstory.service.ILiveEventStoryStickerService
    public final Class<AbstractC19589811ke<?>> LIZ() {
        return C19616211ou.class;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.11po] */
    @Override // com.ss.android.ugc.aweme.tools.sticker.core.liveeventstory.service.ILiveEventStoryStickerService
    public final C19621811po LIZIZ(final Context context, final FrameLayout frameLayout, final FrameLayout frameLayout2, final LifecycleOwner lifecycleOwner, final InterfaceC388760FMc interfaceC388760FMc, C0FTH c0fth, final C0FUH c0fuh, final C390420FSm c390420FSm) {
        return new AbstractC388880FMo<LiveEventStoryStickerModel>(context, frameLayout, frameLayout2, lifecycleOwner, interfaceC388760FMc, c0fuh, c390420FSm) { // from class: X.11po
            public final InterfaceC388760FMc LJII;

            @Override // X.AbstractC388880FMo
            public final EnumC1466150oFx LIZLLL() {
                return EnumC1466150oFx.LIVE_EVENT_STORY;
            }

            @Override // X.AbstractC388880FMo
            public final StickerModel LIZJ(StickerModel stickerModel, int i) {
                LiveEventStoryStickerModel liveEventStoryStickerModel = (LiveEventStoryStickerModel) stickerModel;
                return liveEventStoryStickerModel.copy(BaseStickerModel.copy$default(liveEventStoryStickerModel.getBaseStickerModel(), i, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 1.0f, null, null, null, false, 2147483646, 15, null), liveEventStoryStickerModel.title, liveEventStoryStickerModel.endTime, liveEventStoryStickerModel.subscribe, liveEventStoryStickerModel.eventId, liveEventStoryStickerModel.backgroundColor);
            }

            @Override // X.AbstractC388880FMo
            public final C0FFE<StickerModel> LIZ(StickerModel stickerModel, C0FFO c0ffo, LifecycleOwner lifecycleOwner2) {
                return new C19622011pq(this.LIZ, (LiveEventStoryStickerModel) stickerModel, this.LIZIZ, this.LJII, c0ffo, lifecycleOwner2, this.LJFF);
            }

            {
                this.LJII = interfaceC388760FMc;
            }
        };
    }
}
