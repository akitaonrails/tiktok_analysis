package com.ss.android.ugc.aweme.im.sdk.chat.ui.camera;

import X.C0PEM;
import X.C0Z92;
import X.C0ZSW;
import X.C0ZTJ;
import X.C123100dR;
import X.C1389890mGx;
import X.C15612069i;
import X.C1720706oX;
import X.C2095008Iq;
import X.C2274381E0m;
import X.C23250099c;
import X.C461620I8i;
import X.C817503Hh;
import X.C869590Y9l;
import X.C893560Z3q;
import X.C896400ZEo;
import X.C902260ZaS;
import X.EnumC1446110njd;
import X.EnumC899970ZSh;
import X.InterfaceC457730HxD;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.PictureCardTemplate;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListPhotoClickAbility;
import com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.IMMediaServiceInternalBridge;
import com.ss.android.ugc.aweme.im.service.aweme.IAwemeOpenHelper;

/* JADX INFO: loaded from: classes15.dex */
public final class DefaultPhotoClickHandler implements MessageListPhotoClickAbility {
    public final SessionInfo LL;

    public DefaultPhotoClickHandler(SessionInfo sessionInfo) {
        this.LL = sessionInfo;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListPhotoClickAbility
    public final void KG0(View view, C869590Y9l c869590Y9l, PictureCardTemplate pictureCardTemplate, Aweme aweme) {
        LIZ(this, view, aweme, c869590Y9l, pictureCardTemplate, false, C0Z92.PHOTO_SWAP_REVEAL_BUTTON, false, 64);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListPhotoClickAbility
    public final void wM0(View view, C869590Y9l c869590Y9l, Aweme aweme, BaseTemplate baseTemplate, boolean z) {
        C0ZSW c0zswLJJII;
        Long lLJIILIIL;
        String strLJ = C896400ZEo.LJ(baseTemplate);
        if (C896400ZEo.LJIIIIZZ(c869590Y9l)) {
            IMCameraBridgeApi.LIZ.getClass();
            IMCameraBridgeApi iMCameraBridgeApiLIZ = C461620I8i.LIZ();
            if (iMCameraBridgeApiLIZ != null) {
                c0zswLJJII = iMCameraBridgeApiLIZ.LJJII(c869590Y9l);
            } else {
                c0zswLJJII = null;
            }
            if (c0zswLJJII == C0ZSW.PHOTO_SWAP_INITIATE_MASK && strLJ != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strLJ)) != null) {
                C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C15612069i(lLJIILIIL.longValue(), this, view, aweme, c869590Y9l, baseTemplate, z, null), 2);
                return;
            }
        }
        LIZ(this, view, aweme, c869590Y9l, baseTemplate, false, null, z, 32);
    }

    public static void LIZ(DefaultPhotoClickHandler defaultPhotoClickHandler, View view, Aweme aweme, C869590Y9l c869590Y9l, BaseTemplate baseTemplate, boolean z, C0Z92 c0z92, boolean z2, int i) {
        String strLIZ;
        boolean z3;
        String strLIZIZ;
        boolean z4;
        InterfaceC457730HxD interfaceC457730HxDLJI;
        IMCameraBridgeApi iMCameraBridgeApiLIZ;
        C0Z92 c0z922 = c0z92;
        if ((i & 32) != 0) {
            c0z922 = C0Z92.NORMAL;
        }
        if ((i & 64) != 0) {
            z2 = true;
        }
        defaultPhotoClickHandler.getClass();
        if (C2274381E0m.LIZIZ.LIZJ(true, true)) {
            C893560Z3q c893560Z3q = C893560Z3q.LIZ;
            Long lValueOf = Long.valueOf(c869590Y9l.getSender());
            String conversationId = c869590Y9l.getConversationId();
            String aid = null;
            if (baseTemplate != null) {
                strLIZ = C902260ZaS.LIZ(baseTemplate);
            } else {
                strLIZ = null;
            }
            boolean zLJI = C896400ZEo.LJI(c869590Y9l);
            boolean zLJIIIZ = C896400ZEo.LJIIIZ(c869590Y9l);
            IMCameraBridgeApi.LIZ.getClass();
            IMCameraBridgeApi iMCameraBridgeApiLIZ2 = C461620I8i.LIZ();
            if (iMCameraBridgeApiLIZ2 != null && iMCameraBridgeApiLIZ2.LJJI(c869590Y9l, defaultPhotoClickHandler.LL.isMediaMsgMasking())) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (baseTemplate != null) {
                strLIZIZ = C0ZTJ.LIZIZ(baseTemplate);
            } else {
                strLIZIZ = null;
            }
            C893560Z3q.LIZIZ(c893560Z3q, lValueOf, null, conversationId, "private_image", "private_image", strLIZ, zLJI, zLJIIIZ, z3, z, C123100dR.LIZ(strLIZIZ), null, null, null, null, 63488);
            if (z) {
                C1389890mGx c1389890mGx = new C1389890mGx(view);
                c1389890mGx.LJIIIZ(2131832158);
                c1389890mGx.LJIIJJI();
                return;
            }
            C1720706oX c1720706oX = IAwemeOpenHelper.LIZ;
            Context context = view.getContext();
            EnumC899970ZSh enumC899970ZSh = EnumC899970ZSh.MEDIA_PHOTO;
            if (aweme != null) {
                aid = aweme.getAid();
            }
            SessionInfo sessionInfo = defaultPhotoClickHandler.LL;
            if (!z2 || ((iMCameraBridgeApiLIZ = C461620I8i.LIZ()) != null && iMCameraBridgeApiLIZ.LJJIJIIJI(c869590Y9l))) {
                z4 = false;
            } else {
                z4 = true;
            }
            C1720706oX.LIZIZ(c1720706oX, context, view, c0z922, aweme, enumC899970ZSh, aid, c869590Y9l, sessionInfo, null, z4, "click", null, null, null, 14336);
            IMMediaServiceInternalBridge iMMediaServiceInternalBridgeLIZ = IMMediaServiceInternalBridge.LIZ.LIZ();
            if (iMMediaServiceInternalBridgeLIZ == null || (interfaceC457730HxDLJI = iMMediaServiceInternalBridgeLIZ.LJI()) == null) {
                return;
            }
            String.valueOf(c869590Y9l.getMsgId());
            interfaceC457730HxDLJI.LIZ(EnumC1446110njd.PHOTO);
        }
    }
}
