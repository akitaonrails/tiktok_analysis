package com.ss.android.ugc.aweme.social.sticker.editcomponent.emojislider;

import X.AbstractC19589811ke;
import X.AbstractC388880FMo;
import X.C0FUH;
import X.C19602611mi;
import X.C19603711mt;
import X.C390420FSm;
import android.content.Context;
import android.os.Parcelable;
import android.text.Editable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.emojislider.EmojiSliderStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.emojislider.IEmojiSliderStickerComponentProvider;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class EmojiSliderStickerComponentProviderImpl implements IEmojiSliderStickerComponentProvider {
    @Override // com.ss.android.ugc.aweme.tools.sticker.core.emojislider.IEmojiSliderStickerComponentProvider
    public final Class<? extends AbstractC19589811ke<?>> LIZIZ() {
        return C19602611mi.class;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.11mt] */
    @Override // com.ss.android.ugc.aweme.tools.sticker.core.emojislider.IEmojiSliderStickerComponentProvider
    public final C19603711mt LIZ(Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, C0FUH c0fuh, C390420FSm c390420FSm) {
        return new AbstractC388880FMo<EmojiSliderStickerModel>(context, frameLayout, frameLayout2, lifecycleOwner, c0fuh, c390420FSm) { // from class: X.11mt
            public C19604211my LJII;

            @Override // X.AbstractC388880FMo
            public final EnumC1466150oFx LIZLLL() {
                return EnumC1466150oFx.EMOJI_SLIDER;
            }

            @Override // X.AbstractC388880FMo
            public final StickerModel LIZJ(StickerModel stickerModel, int i) {
                EmojiSliderStickerModel emojiSliderStickerModel = (EmojiSliderStickerModel) stickerModel;
                return emojiSliderStickerModel.copy(BaseStickerModel.copy$default(emojiSliderStickerModel.getBaseStickerModel(), i, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -2, 15, null), emojiSliderStickerModel.clickable, emojiSliderStickerModel.visible, emojiSliderStickerModel.questionText, emojiSliderStickerModel.emojiContent, emojiSliderStickerModel.voteVal, emojiSliderStickerModel.answerCount, emojiSliderStickerModel.voteAverage, emojiSliderStickerModel.androidVer, emojiSliderStickerModel.iosVer);
            }

            @Override // X.AbstractC388880FMo
            public final C0FFE<StickerModel> LIZ(StickerModel stickerModel, C0FFO c0ffo, LifecycleOwner lifecycleOwner2) {
                return new C19603511mr(this.LIZ, (EmojiSliderStickerModel) stickerModel, this.LIZIZ, c0ffo, lifecycleOwner2, this.LJFF);
            }

            @Override // X.AbstractC388880FMo
            public final void LJI(C0FTJ c0ftj, C388340FKm c388340FKm, C390370FSh c390370FSh, String str, Function1 function1) throws Throwable {
                Parcelable emojiSliderStickerModel;
                int length;
                if (c0ftj == null || (emojiSliderStickerModel = c0ftj.LJLI()) == null) {
                    int height = this.LIZIZ.getHeight();
                    emojiSliderStickerModel = new EmojiSliderStickerModel(new BaseStickerModel(0, 0, EnumC1466150oFx.EMOJI_SLIDER, 0, 0, 0.0f, 0.0f, 0, 0, this.LIZIZ.getLeft(), this.LIZIZ.getTop(), this.LIZIZ.getWidth(), height, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -7685, 15, null), false, true, null, "😍", null, null, null, "19", "8.3");
                }
                EmojiSliderStickerModel emojiSliderStickerModel2 = (EmojiSliderStickerModel) emojiSliderStickerModel;
                if (C19618011pC.LIZ(str)) {
                    emojiSliderStickerModel2.getBaseStickerModel().setStickerSource("2");
                }
                C19604211my c19604211my = this.LJII;
                if (c19604211my != null) {
                    int visibility = c19604211my.getVisibility();
                    c19604211my.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility, 0, c19604211my);
                    c19604211my.LIZIZ(emojiSliderStickerModel2, c390370FSh);
                } else {
                    this.LJII = new C19604211my(this.LIZ, this.LJFF, emojiSliderStickerModel2, c390370FSh);
                    this.LIZJ.addView(this.LJII, new ViewGroup.LayoutParams(-1, -1));
                }
                C19604211my c19604211my2 = this.LJII;
                if (c19604211my2 != null) {
                    c19604211my2.setStickerEditListener(new C0FSM(EnumC1466150oFx.EMOJI_SLIDER, function1, c390370FSh, c0ftj));
                }
                C19604211my c19604211my3 = this.LJII;
                if (c19604211my3 != null) {
                    c19604211my3.getEmojiSliderEditText().requestFocus();
                    C0I7D emojiSliderEditText = c19604211my3.getEmojiSliderEditText();
                    Editable editableLLLLJI = C2204961BRm.LLLLJI(c19604211my3.getEmojiSliderEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmnYJbP0HxrPah5xMPTV/JolMnC3GIt2Qychq2+8uTDJ0RpSV0UAh7MDG8lGTzzLivhVG0VWrB/Y3VosTPd5nFKxeY=", null));
                    if (editableLLLLJI != null) {
                        length = editableLLLLJI.length();
                    } else {
                        length = 0;
                    }
                    emojiSliderEditText.setSelection(length);
                }
                if (c0ftj != null) {
                    c0ftj.setVisible(false);
                }
            }
        };
    }
}
