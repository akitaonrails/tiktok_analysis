package com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn;

import X.AnonymousClass0951;
import X.C09IC;
import X.C13BV;
import X.C1BNE;
import X.C2252321DDq;
import X.EnumC441890HUl;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes7.dex */
public final class DefaultStickerIconRedDotAbilityImpl implements IStickerIconRedDotAbility {
    public final C2252321DDq LL;
    public final AnonymousClass0951 LLILLJJLI;

    public DefaultStickerIconRedDotAbilityImpl() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C13BV.INSTANCE);
        this.LL = c2252321DDqLIZ;
        this.LLILLJJLI = C09IC.LIZIZ(c2252321DDqLIZ);
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.IStickerIconRedDotAbility
    public final AnonymousClass0951 CZ() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.IStickerIconRedDotAbility
    public final void ax(EnumC441890HUl enumC441890HUl) {
        ArrayList arrayList = new ArrayList((Collection) this.LL.getValue());
        if (arrayList.add(enumC441890HUl)) {
            this.LL.setValue(arrayList);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.IStickerIconRedDotAbility
    public final void z42(EnumC441890HUl enumC441890HUl) {
        ArrayList arrayList = new ArrayList((Collection) this.LL.getValue());
        if (arrayList.remove(enumC441890HUl)) {
            this.LL.setValue(arrayList);
        }
    }
}
