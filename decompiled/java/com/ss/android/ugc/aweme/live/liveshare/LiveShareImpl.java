package com.ss.android.ugc.aweme.live.liveshare;

import X.AbstractC19589811ke;
import X.AbstractC388880FMo;
import X.C0FUH;
import X.C19610611o0;
import X.C19617511p7;
import X.C390420FSm;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.live.model.LiveShareStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.liveshare.ILiveShare;
import com.ss.android.ugc.aweme.tools.sticker.core.liveshare.LiveShareStickerModel;

/* JADX INFO: loaded from: classes3.dex */
public final class LiveShareImpl implements ILiveShare {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.11o0] */
    @Override // com.ss.android.ugc.aweme.tools.sticker.core.liveshare.ILiveShare
    public final C19610611o0 LIZIZ() {
        return new AbstractC19589811ke<LiveShareStickerModel>() { // from class: X.11o0
            @Override // X.AbstractC19589811ke
            public final InterfaceC19592111l1<?> LIZJ() {
                return new C19625211qM(LJ().LIZLLL, LJ());
            }

            @Override // X.AbstractC19589811ke
            public final StickerModel LJII(InteractStickerStruct interactStickerStruct) {
                if (interactStickerStruct.getLiveShareStickerStruct() == null) {
                    return new LiveShareStickerModel(new BaseStickerModel(0, 0, EnumC1466150oFx.LIVE_SHARE, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null), "", "", null);
                }
                LiveShareStickerStruct liveShareStickerStruct = interactStickerStruct.getLiveShareStickerStruct();
                return new LiveShareStickerModel(new BaseStickerModel(0, 0, EnumC1466150oFx.ADD_YOURS, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null), String.valueOf(liveShareStickerStruct.getRoomId()), liveShareStickerStruct.getLiveOwnerName(), null);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.11p7] */
    @Override // com.ss.android.ugc.aweme.tools.sticker.core.liveshare.ILiveShare
    public final C19617511p7 LIZ(Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, C0FUH c0fuh, C390420FSm c390420FSm) {
        return new AbstractC388880FMo<LiveShareStickerModel>(context, frameLayout, frameLayout2, lifecycleOwner, c0fuh, c390420FSm) { // from class: X.11p7
            @Override // X.AbstractC388880FMo
            public final EnumC1466150oFx LIZLLL() {
                return EnumC1466150oFx.LIVE_SHARE;
            }

            @Override // X.AbstractC388880FMo
            public final StickerModel LIZJ(StickerModel stickerModel, int i) {
                LiveShareStickerModel liveShareStickerModel = (LiveShareStickerModel) stickerModel;
                return liveShareStickerModel.copy(BaseStickerModel.copy$default(liveShareStickerModel.getBaseStickerModel(), i + 1, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -2, 15, null), liveShareStickerModel.getRoomId(), liveShareStickerModel.getLiveOwnerName(), liveShareStickerModel.liveRoomStruct);
            }

            @Override // X.AbstractC388880FMo
            public final C0FFE<StickerModel> LIZ(StickerModel stickerModel, C0FFO c0ffo, LifecycleOwner lifecycleOwner2) {
                return new C19617611p8(this.LIZ, (LiveShareStickerModel) stickerModel, this.LIZIZ, c0ffo, lifecycleOwner2, this.LJFF);
            }
        };
    }
}
