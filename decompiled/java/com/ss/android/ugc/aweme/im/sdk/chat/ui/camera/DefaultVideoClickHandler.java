package com.ss.android.ugc.aweme.im.sdk.chat.ui.camera;

import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListVideoClickAbility;

/* JADX INFO: loaded from: classes15.dex */
public final class DefaultVideoClickHandler implements MessageListVideoClickAbility {
    public final SessionInfo LL;

    public DefaultVideoClickHandler(SessionInfo sessionInfo) {
        this.LL = sessionInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListVideoClickAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void PJ(android.view.View r24, X.C869590Y9l r25, com.ss.android.ugc.aweme.feed.model.Aweme r26, com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate r27, boolean r28) {
        /*
            r23 = this;
            X.1E0m r0 = X.C2274381E0m.LIZIZ
            r4 = 1
            boolean r0 = r0.LIZJ(r4, r4)
            if (r0 != 0) goto La
            return
        La:
            X.06oX r7 = com.ss.android.ugc.aweme.im.service.aweme.IAwemeOpenHelper.LIZ
            r9 = r24
            android.content.Context r8 = r9.getContext()
            X.0Z92 r10 = X.C0Z92.NORMAL
            X.0ZSh r12 = X.EnumC899970ZSh.MEDIA_VIDEO
            r11 = r26
            java.lang.String r13 = r11.getAid()
            r1 = r23
            com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r3 = r1.LL
            r6 = 0
            r0 = r25
            if (r28 == 0) goto L36
            X.0I8i r2 = com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi.LIZ
            r2.getClass()
            com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi r2 = X.C461620I8i.LIZ()
            if (r2 == 0) goto Laf
            boolean r2 = r2.LJJIJIIJI(r0)
            if (r2 != r4) goto Laf
        L36:
            r17 = 0
        L38:
            java.lang.String r18 = "click"
            r22 = 14336(0x3800, float:2.0089E-41)
            r14 = r0
            r15 = r3
            r16 = r6
            r19 = r6
            r20 = r6
            r21 = r6
            X.C1720706oX.LIZIZ(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.0HxF r2 = com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.IMMediaServiceInternalBridge.LIZ
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.IMMediaServiceInternalBridge r2 = r2.LIZ()
            if (r2 == 0) goto L63
            X.0HxD r4 = r2.LJI()
            if (r4 == 0) goto L63
            long r2 = r0.getMsgId()
            java.lang.String.valueOf(r2)
            X.0njd r2 = X.EnumC1446110njd.VIDEO
            r4.LIZ(r2)
        L63:
            X.0Z3q r4 = X.C893560Z3q.LIZ
            long r2 = r0.getSender()
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            java.lang.String r7 = r0.getConversationId()
            java.lang.String r8 = "private_video"
            java.lang.String r9 = "private_video"
            java.lang.String r10 = X.C0ZDX.LIZLLL(r27)
            r11 = 0
            X.0I8i r2 = com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi.LIZ
            r2.getClass()
            com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi r2 = X.C461620I8i.LIZ()
            if (r2 == 0) goto Lad
            com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r1 = r1.LL
            boolean r1 = r1.isMediaMsgMasking()
            boolean r1 = r2.LJJI(r0, r1)
            r0 = 1
            if (r1 != r0) goto Lad
            r13 = 1
        L93:
            java.lang.String r0 = X.C0ZDX.LIZJ(r27)
            if (r0 == 0) goto Laa
            java.lang.String r18 = "dm_effect_game"
        L9b:
            java.lang.String r19 = ""
            r20 = 16064(0x3ec0, float:2.251E-41)
            r12 = r11
            r14 = r11
            r15 = r11
            r16 = r6
            r17 = r6
            X.C893560Z3q.LIZIZ(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        Laa:
            java.lang.String r18 = ""
            goto L9b
        Lad:
            r13 = 0
            goto L93
        Laf:
            r17 = 1
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.camera.DefaultVideoClickHandler.PJ(android.view.View, X.0Y9l, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate, boolean):void");
    }
}
