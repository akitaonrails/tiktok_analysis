package com.ss.android.ugc.aweme.social.sticker.editcomponent.interactiveemoji;

import X.AbstractC19589811ke;
import X.AbstractC388880FMo;
import X.C19602711mj;
import X.C19604811n4;
import X.C390420FSm;
import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.interactiveemoji.IInteractiveEmojiStickerComponentProvider;
import com.ss.android.ugc.aweme.tools.sticker.core.interactiveemoji.InteractiveEmojiStickerModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class InteractiveEmojiStickerComponentProviderImpl implements IInteractiveEmojiStickerComponentProvider {
    @Override // com.ss.android.ugc.aweme.tools.sticker.core.interactiveemoji.IInteractiveEmojiStickerComponentProvider
    public final Class<? extends AbstractC19589811ke<?>> LIZIZ() {
        return C19602711mj.class;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.11n4] */
    @Override // com.ss.android.ugc.aweme.tools.sticker.core.interactiveemoji.IInteractiveEmojiStickerComponentProvider
    public final C19604811n4 LIZ(Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, C390420FSm c390420FSm) {
        return new AbstractC388880FMo<InteractiveEmojiStickerModel>(context, frameLayout, frameLayout2, lifecycleOwner, c390420FSm) { // from class: X.11n4
            public C19604911n5 LJII;

            @Override // X.AbstractC388880FMo
            public final EnumC1466150oFx LIZLLL() {
                return EnumC1466150oFx.INTERACTIVE_EMOJI;
            }

            @Override // X.AbstractC388880FMo
            public final StickerModel LIZJ(StickerModel stickerModel, int i) {
                InteractiveEmojiStickerModel interactiveEmojiStickerModel = (InteractiveEmojiStickerModel) stickerModel;
                return interactiveEmojiStickerModel.copy(BaseStickerModel.copy$default(interactiveEmojiStickerModel.getBaseStickerModel(), i, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -2, 15, null), interactiveEmojiStickerModel.clickable, interactiveEmojiStickerModel.visible, interactiveEmojiStickerModel.emojiContent, interactiveEmojiStickerModel.androidVer, interactiveEmojiStickerModel.iosVer);
            }

            @Override // X.AbstractC388880FMo
            public final C0FFE<StickerModel> LIZ(StickerModel stickerModel, C0FFO c0ffo, LifecycleOwner lifecycleOwner2) {
                return new C19605011n6(this.LIZ, (InteractiveEmojiStickerModel) stickerModel, this.LIZIZ, c0ffo, lifecycleOwner2, this.LJFF);
            }

            {
                C0FUH c0fuhLIZIZ = C390410FSl.LIZIZ(c390420FSm);
            }

            @Override // X.AbstractC388880FMo
            public final void LJI(C0FTJ c0ftj, C388340FKm c388340FKm, C390370FSh c390370FSh, String str, Function1 function1) {
                Parcelable interactiveEmojiStickerModel;
                if (c0ftj == null || (interactiveEmojiStickerModel = c0ftj.LJLI()) == null) {
                    int height = this.LIZIZ.getHeight();
                    interactiveEmojiStickerModel = new InteractiveEmojiStickerModel(new BaseStickerModel(0, 0, EnumC1466150oFx.INTERACTIVE_EMOJI, 0, 0, 0.0f, 0.0f, 0, 0, this.LIZIZ.getLeft(), this.LIZIZ.getTop(), this.LIZIZ.getWidth(), height, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -7685, 15, null), false, true, "😍", "19", "8.3");
                }
                InteractiveEmojiStickerModel interactiveEmojiStickerModel2 = (InteractiveEmojiStickerModel) interactiveEmojiStickerModel;
                if (C19618011pC.LIZ(str)) {
                    interactiveEmojiStickerModel2.getBaseStickerModel().setStickerSource("2");
                }
                C0FSM c0fsm = new C0FSM(EnumC1466150oFx.INTERACTIVE_EMOJI, function1, c390370FSh, c0ftj);
                C19604911n5 c19604911n5 = this.LJII;
                if (c19604911n5 == null) {
                    this.LJII = new C19604911n5(this.LIZ, interactiveEmojiStickerModel2, this.LJFF, c0fsm);
                    this.LIZJ.addView(this.LJII, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    int visibility = c19604911n5.getVisibility();
                    c19604911n5.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility, 0, c19604911n5);
                    c19604911n5.LIZIZ(interactiveEmojiStickerModel2, c0fsm);
                }
            }
        };
    }
}
