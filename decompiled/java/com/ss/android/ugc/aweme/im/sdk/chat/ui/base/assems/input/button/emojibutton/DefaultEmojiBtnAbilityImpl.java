package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.button.emojibutton;

import X.AbstractC440540HPg;
import X.AnonymousClass0951;
import X.C05YD;
import X.C09IC;
import X.C0I0B;
import X.C1400340mXo;
import X.C1697810uHb;
import X.C1BNE;
import X.C2252321DDq;
import X.C23250099c;
import X.C437530HDr;
import X.C441850HUh;
import X.C441860HUi;
import X.C441870HUj;
import X.C441900HUm;
import X.C516501zn;
import X.EnumC441840HUg;
import X.EnumC441890HUl;
import X.InterfaceC346201Wa;
import X.InterfaceC441910HUn;
import X.InterfaceC441960HUs;
import X.InterfaceC497601wk;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility;
import com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.IEmojiBtnAbility;
import com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.IStickerFeatureIconAbility;
import com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.IStickerIconRedDotAbility;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioEntranceControl;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class DefaultEmojiBtnAbilityImpl implements IEmojiBtnAbility {
    public final C2252321DDq LL;
    public final AnonymousClass0951 LLILLJJLI;
    public final InterfaceC346201Wa<C441900HUm> LLILLL;
    public final InterfaceC346201Wa<List<EnumC441890HUl>> LLILZ;
    public final MixStudioEntranceControl LLILZIL;
    public final boolean LLILZLL;
    public final InterfaceC346201Wa<AbstractC440540HPg> LLIZ;
    public final C2252321DDq LLIZLLLIL;
    public final List<InterfaceC346201Wa<Object>> LLJ;

    @Override // com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.IEmojiBtnAbility
    public final C05YD<InterfaceC441910HUn> W90() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.IEmojiBtnAbility
    public final void fh0(boolean z) {
        this.LLIZLLLIL.setValue(Boolean.valueOf(z));
    }

    public DefaultEmojiBtnAbilityImpl(InterfaceC497601wk interfaceC497601wk, IInputFieldAbility iInputFieldAbility, InterfaceC441960HUs interfaceC441960HUs, C2252321DDq c2252321DDq, MixStudioStatusRepository mixStudioStatusRepository, IStickerIconRedDotAbility iStickerIconRedDotAbility, IStickerFeatureIconAbility iStickerFeatureIconAbility) {
        boolean zLIZIZ;
        boolean z;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C441860HUi(EnumC441840HUg.EMOJI));
        this.LL = c2252321DDqLIZ;
        this.LLILLJJLI = C09IC.LIZIZ(c2252321DDqLIZ);
        InterfaceC346201Wa<C441900HUm> c516501zn = (iStickerFeatureIconAbility == null || (c516501zn = iStickerFeatureIconAbility.Z21()) == null) ? new C516501zn(null, 1) : c516501zn;
        this.LLILLL = c516501zn;
        InterfaceC346201Wa<List<EnumC441890HUl>> c516501zn2 = (iStickerIconRedDotAbility == null || (c516501zn2 = iStickerIconRedDotAbility.CZ()) == null) ? new C516501zn(null, 1) : c516501zn2;
        this.LLILZ = c516501zn2;
        MixStudioEntranceControl mixStudioEntranceControl = (MixStudioEntranceControl) PluggableExtentionKt.pluggableSpiForReal(MixStudioEntranceControl.class);
        this.LLILZIL = mixStudioEntranceControl;
        User currentUser = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurrentUser();
        if (currentUser != null) {
            zLIZIZ = C437530HDr.LIZIZ(currentUser);
        } else {
            zLIZIZ = false;
        }
        this.LLILZLL = zLIZIZ;
        InterfaceC346201Wa<AbstractC440540HPg> c516501zn3 = (mixStudioStatusRepository == null || (c516501zn3 = mixStudioStatusRepository.getTaskStatus()) == null) ? new C516501zn(null, 1) : c516501zn3;
        this.LLIZ = c516501zn3;
        if (mixStudioEntranceControl != null && mixStudioEntranceControl.LIZJ(zLIZIZ)) {
            z = true;
        } else {
            z = false;
        }
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(Boolean.valueOf(z));
        this.LLIZLLLIL = c2252321DDqLIZ2;
        this.LLJ = C1697810uHb.LJIIJJI(c2252321DDq, interfaceC441960HUs.getPanelType(), c516501zn2, iInputFieldAbility.Kv(), c516501zn, c516501zn3, c2252321DDqLIZ2);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C441870HUj(iInputFieldAbility, this, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C441850HUh(null, this), 3);
    }
}
