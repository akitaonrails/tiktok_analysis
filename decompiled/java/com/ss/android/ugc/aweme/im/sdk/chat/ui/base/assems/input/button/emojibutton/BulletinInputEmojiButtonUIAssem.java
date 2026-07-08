package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.button.emojibutton;

import X.C06YU;
import X.C1558520qew;
import X.C23250099c;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C786410Ut5;
import X.C814420VxA;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.ability.InputEmojiButtonAbility;
import com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.InputEmojiButtonUIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class BulletinInputEmojiButtonUIAssem extends InputEmojiButtonUIAssem {
    public Integer LLJJJ;

    @Override // com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.InputEmojiButtonUIAssem, com.ss.android.ugc.aweme.im.common.assem.IMUISlotViewAssem
    public final View LLLILZJ() {
        Context context = getContext();
        if (context == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        C786410Ut5.M6(tuxIconView, new ViewGroup.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36))));
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        tuxIconView.setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
        tuxIconView.setTuxIcon(hp());
        tuxIconView.setContentDescription(tuxIconView.getContext().getString(2131835715));
        return tuxIconView;
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.InputEmojiButtonUIAssem
    public final C419910GdJ hp() {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_emoji;
        Integer num = this.LLJJJ;
        if (num == null) {
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            return c419910GdJ;
        }
        c419910GdJ.LIZLLL = num;
        return c419910GdJ;
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.InputEmojiButtonUIAssem
    public final C419910GdJ kp() {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_keyboard_circle;
        Integer num = this.LLJJJ;
        if (num == null) {
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            return c419910GdJ;
        }
        c419910GdJ.LIZLLL = num;
        return c419910GdJ;
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.InputEmojiButtonUIAssem
    public final void ip() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C06YU(this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.InputEmojiButtonUIAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        InputEmojiButtonAbility inputEmojiButtonAbility = (InputEmojiButtonAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InputEmojiButtonAbility.class, null);
        if (inputEmojiButtonAbility != null) {
            inputEmojiButtonAbility.mU(this.LLJJIII);
        }
        InputEmojiButtonAbility inputEmojiButtonAbility2 = (InputEmojiButtonAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), InputEmojiButtonAbility.class, null);
        if (inputEmojiButtonAbility2 != null) {
            inputEmojiButtonAbility2.ZW1(new AwS581S0100000_2(this, 222));
        }
    }
}
