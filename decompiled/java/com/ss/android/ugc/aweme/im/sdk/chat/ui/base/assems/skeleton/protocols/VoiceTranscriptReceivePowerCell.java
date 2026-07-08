package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.protocols;

import X.AbstractC899510ZQn;
import X.C0Y8T;
import X.C0YSQ;
import X.C0ZL0;
import X.C0ZR8;
import X.C13LE;
import X.C1559260qg8;
import X.C1562980qm8;
import X.C19719912Dl;
import X.C457780HxI;
import X.C458620Hye;
import X.C462510IBt;
import X.C723590SZx;
import X.C869590Y9l;
import X.C899800ZRq;
import X.InterfaceC876950Yaj;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.messagelist.api.ui.IIMMessageBubbleService;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageLeftIconState;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.ability.SkeletonLayoutAssemblerBridge;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemReceive;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.content.VoiceReceiveAssem;
import java.util.List;
import kotlin.jvm.internal.AwS380S0200000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class VoiceTranscriptReceivePowerCell extends IMSkeletonLayoutPowerCell<IMSkeletonLayoutReusedUISlotAssemReceive, C899800ZRq> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        final C19719912Dl c19719912DlLIZ = C13LE.LIZ(VoiceReceiveAssem.class);
        return new IMSkeletonLayoutReusedUISlotAssemReceive(c19719912DlLIZ) { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.protocols.VoiceTranscriptReceivePowerCell$createAssemAttached2Cell$1
            public final C1559260qg8 LLLIIII = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00a6  */
            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void Tp() {
                /*
                    r11 = this;
                    X.0qg8 r0 = r11.LLLIIII
                    java.lang.Object r0 = r0.getValue()
                    X.0HxI r0 = (X.C457780HxI) r0
                    com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r0 = r0.LL
                    boolean r0 = r0.isGroupChat()
                    java.lang.String r8 = ""
                    r1 = 0
                    if (r0 == 0) goto Lad
                    com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.protocols.VoiceTranscriptReceivePowerCell r0 = r11.LLLIIIIL
                    X.0zJl r0 = r0.getItem()
                    X.0ZRq r0 = (X.C899800ZRq) r0
                    if (r0 == 0) goto Laa
                    X.0IB0 r0 = r0.LLILLJJLI
                    X.06XP r0 = r0.LIZ
                    X.0Y9l r0 = r0.LIZ
                    if (r0 == 0) goto Laa
                    java.lang.String r0 = r0.getConversationId()
                L29:
                    java.lang.String r7 = X.C1229100i5c.LIZLLL(r0)
                L2d:
                    com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.protocols.VoiceTranscriptReceivePowerCell r0 = r11.LLLIIIIL
                    X.0zJl r0 = r0.getItem()
                    X.0ZRq r0 = (X.C899800ZRq) r0
                    if (r0 == 0) goto La5
                    X.0ZRs r0 = r0.LLILLL
                    if (r0 == 0) goto La5
                    X.0ZRi r0 = r0.LIZJ
                    if (r0 == 0) goto La5
                    int r4 = r0.LIZIZ
                    com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.protocols.VoiceTranscriptReceivePowerCell r0 = r11.LLLIIIIL
                    X.0zJl r0 = r0.getItem()
                    X.0ZRq r0 = (X.C899800ZRq) r0
                    if (r0 == 0) goto La5
                    X.0IB0 r0 = r0.LLILLJJLI
                    X.06XP r0 = r0.LIZ
                    X.0Y9l r0 = r0.LIZ
                    if (r0 == 0) goto La5
                    boolean r5 = X.C0ZDX.LJJJJIZL(r0)
                    com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.protocols.VoiceTranscriptReceivePowerCell r0 = r11.LLLIIIIL
                    X.0zJl r0 = r0.getItem()
                    X.0ZRq r0 = (X.C899800ZRq) r0
                    if (r0 == 0) goto L78
                    X.0IB0 r0 = r0.LLILLJJLI
                    X.06XP r0 = r0.LIZ
                    X.0Y9l r0 = r0.LIZ
                    if (r0 == 0) goto L78
                    long r2 = r0.getSender()
                    java.lang.Long r0 = java.lang.Long.valueOf(r2)
                    java.lang.String r0 = r0.toString()
                    if (r0 == 0) goto L78
                    r8 = r0
                L78:
                    com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.protocols.VoiceTranscriptReceivePowerCell r0 = r11.LLLIIIIL
                    X.0zJl r0 = r0.getItem()
                    X.0ZRq r0 = (X.C899800ZRq) r0
                    if (r0 == 0) goto La8
                    X.0ZRl r0 = r0.LLILZ
                L84:
                    boolean r0 = r0 instanceof X.C0ZRD
                    if (r0 != 0) goto La6
                    com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.protocols.VoiceTranscriptReceivePowerCell r0 = r11.LLLIIIIL
                    X.0zJl r0 = r0.getItem()
                    X.0ZRq r0 = (X.C899800ZRq) r0
                    if (r0 == 0) goto L94
                    X.0ZRl r1 = r0.LLILZ
                L94:
                    boolean r0 = r1 instanceof X.C0ZRK
                    if (r0 != 0) goto La6
                    r9 = 0
                L99:
                    java.lang.String r3 = "chat"
                    r6 = 0
                    X.0I0B r0 = X.C0I0B.LJFF
                    X.05sz r10 = r0.LIZIZ()
                    X.C458640Hyg.LJI(r3, r4, r5, r6, r7, r8, r9, r10)
                La5:
                    return
                La6:
                    r9 = 1
                    goto L99
                La8:
                    r0 = r1
                    goto L84
                Laa:
                    r0 = r1
                    goto L29
                Lad:
                    X.0qg8 r0 = r11.LLLIIII
                    java.lang.Object r0 = r0.getValue()
                    X.0HxI r0 = (X.C457780HxI) r0
                    com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r0 = r0.LL
                    boolean r0 = r0.isSingleChat()
                    if (r0 == 0) goto Lc1
                    java.lang.String r7 = "private"
                    goto L2d
                Lc1:
                    r7 = r8
                    goto L2d
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.protocols.VoiceTranscriptReceivePowerCell$createAssemAttached2Cell$1.Tp():void");
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemReceive, com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.AbsSkeletonLayoutReusedUISlotAssem
            public final void op() {
                super.op();
                if (C458620Hye.LIZ.LIZJ()) {
                    SkeletonLayoutAssemblerBridge skeletonLayoutAssemblerBridgeBp = Bp();
                    AbstractC899510ZQn<?, ?> abstractC899510ZQnFQ2 = skeletonLayoutAssemblerBridgeBp != null ? skeletonLayoutAssemblerBridgeBp.fQ2(C462510IBt.LIZ) : null;
                    if (!(abstractC899510ZQnFQ2 instanceof AbstractC899510ZQn) || abstractC899510ZQnFQ2 == null) {
                        return;
                    }
                    tp(C462510IBt.LIZ);
                    sp(new AwS380S0200000_14(this, (VoiceTranscriptReceivePowerCell$createAssemAttached2Cell$1) abstractC899510ZQnFQ2, (AbstractC899510ZQn<?, MessageLeftIconState>) 37));
                }
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final List<C1562980qm8<C0ZL0>> Gp(C869590Y9l c869590Y9l) {
                C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(((C457780HxI) this.LLLIIII.getValue()).LL.getConversationId());
                if (c0y8tLIZ == null) {
                    return yp(c869590Y9l, false);
                }
                return C0ZR8.LIZ(c869590Y9l, Up(), c0y8tLIZ.getConversationShortId(), ((C457780HxI) this.LLLIIII.getValue()).LL);
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem, com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.AbsSkeletonLayoutReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
            public final void onViewCreated(View view) {
                View viewLJFF;
                super.onViewCreated(view);
                IIMMessageBubbleService iIMMessageBubbleService = (IIMMessageBubbleService) PluggableExtentionKt.pluggableSpiForReal(IIMMessageBubbleService.class);
                if (iIMMessageBubbleService != null && (viewLJFF = iIMMessageBubbleService.LJFF(view, false)) != null) {
                    VoiceTranscriptReceivePowerCell voiceTranscriptReceivePowerCell = this.LLLIIIIL;
                    dM(viewLJFF);
                    voiceTranscriptReceivePowerCell.R5(viewLJFF);
                    up(viewLJFF);
                }
            }
        };
    }
}
