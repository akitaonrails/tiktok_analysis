package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.button.emojibutton;

import X.AnonymousClass0951;
import X.C09IC;
import X.C0PEM;
import X.C1440005kM;
import X.C1BNE;
import X.C2252321DDq;
import X.C23250099c;
import X.C441900HUm;
import X.C443790Haj;
import X.C443950Haz;
import X.InterfaceC497601wk;
import com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.IStickerFeatureIconAbility;
import com.ss.android.ugc.aweme.im.common.model.SubscriptionStatus;
import com.ss.android.ugc.aweme.im.sticker.api.model.StickerSetInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS236S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class DefaultStickerFeatureIconAbilityImpl implements IStickerFeatureIconAbility {
    public final InterfaceC497601wk LL;
    public final Function1<Integer, Unit> LLILLJJLI;
    public final C2252321DDq LLILLL;
    public final AnonymousClass0951 LLILZ;

    @Override // com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.IStickerFeatureIconAbility
    public final void LM2() {
        Integer num;
        C441900HUm c441900HUm = (C441900HUm) this.LLILLL.getValue();
        if (c441900HUm != null && (num = c441900HUm.LIZIZ) != null) {
            int iIntValue = num.intValue();
            this.LLILLJJLI.invoke(Integer.valueOf(iIntValue));
            C1440005kM.LIZ(new C443950Haz(new StickerSetInfo(null, null, null, null, Integer.valueOf(iIntValue), null, null, null, null, null, null, null, null, null, SubscriptionStatus.UNKNOWN, null, null, null, null, null, null, "click", "icon", null)));
        }
        this.LLILLL.setValue(null);
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.IStickerFeatureIconAbility
    public final void iB2() {
        this.LLILLL.setValue(null);
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.IStickerFeatureIconAbility
    public final AnonymousClass0951 Z21() {
        return this.LLILZ;
    }

    public DefaultStickerFeatureIconAbilityImpl(AFwS236S0000000_6 aFwS236S0000000_6, InterfaceC497601wk interfaceC497601wk) {
        this.LL = interfaceC497601wk;
        this.LLILLJJLI = aFwS236S0000000_6;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(null);
        this.LLILLL = c2252321DDqLIZ;
        this.LLILZ = C09IC.LIZIZ(c2252321DDqLIZ);
        C23250099c.LIZLLL(interfaceC497601wk, C0PEM.LIZJ, null, new C443790Haj(this, null), 2);
    }
}
