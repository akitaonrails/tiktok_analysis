package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.protocols;

import X.C01GW;
import X.C0Y8T;
import X.C0YSQ;
import X.C0ZL0;
import X.C0ZR8;
import X.C0ZXL;
import X.C0ZXS;
import X.C0ZXU;
import X.C0ZXV;
import X.C0ZXY;
import X.C0ZXZ;
import X.C1383370m6R;
import X.C13LE;
import X.C1509305vX;
import X.C1559260qg8;
import X.C1562980qm8;
import X.C1954807lC;
import X.C19719912Dl;
import X.C2441009hQ;
import X.C423680GjO;
import X.C457780HxI;
import X.C723590SZx;
import X.C869590Y9l;
import X.C899810ZRr;
import X.InterfaceC422340GhE;
import X.InterfaceC876950Yaj;
import X.InterfaceC907020Zi8;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.messagelist.api.ui.IIMMessageBubbleService;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemSend;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.content.VoiceSendAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: loaded from: classes15.dex */
public class VoiceTranscriptSendPowerCell extends IMSkeletonLayoutPowerCell<IMSkeletonLayoutReusedUISlotAssemSend, C899810ZRr> implements InterfaceC907020Zi8 {
    public View LLJJJIL;
    public final C01GW LLJJJJ = C1509305vX.LIZ(AFwS201S0000000_14.get$arr$(209));
    public final Map<Integer, View> LLJJJJJIL = new LinkedHashMap();

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        final C19719912Dl c19719912DlLIZ = C13LE.LIZ(VoiceSendAssem.class);
        return new IMSkeletonLayoutReusedUISlotAssemSend(c19719912DlLIZ) { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.protocols.VoiceTranscriptSendPowerCell$createAssemAttached2Cell$1
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
                    com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.protocols.VoiceTranscriptSendPowerCell r0 = r11.LLLIIIIL
                    X.0zJl r0 = r0.getItem()
                    X.0ZRr r0 = (X.C899810ZRr) r0
                    if (r0 == 0) goto Laa
                    X.0IB0 r0 = r0.LLILLJJLI
                    X.06XP r0 = r0.LIZ
                    X.0Y9l r0 = r0.LIZ
                    if (r0 == 0) goto Laa
                    java.lang.String r0 = r0.getConversationId()
                L29:
                    java.lang.String r7 = X.C1229100i5c.LIZLLL(r0)
                L2d:
                    com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.protocols.VoiceTranscriptSendPowerCell r0 = r11.LLLIIIIL
                    X.0zJl r0 = r0.getItem()
                    X.0ZRr r0 = (X.C899810ZRr) r0
                    if (r0 == 0) goto La5
                    X.0ZRs r0 = r0.LLILLL
                    if (r0 == 0) goto La5
                    X.0ZRi r0 = r0.LIZJ
                    if (r0 == 0) goto La5
                    int r4 = r0.LIZIZ
                    com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.protocols.VoiceTranscriptSendPowerCell r0 = r11.LLLIIIIL
                    X.0zJl r0 = r0.getItem()
                    X.0ZRr r0 = (X.C899810ZRr) r0
                    if (r0 == 0) goto La5
                    X.0IB0 r0 = r0.LLILLJJLI
                    X.06XP r0 = r0.LIZ
                    X.0Y9l r0 = r0.LIZ
                    if (r0 == 0) goto La5
                    boolean r5 = X.C0ZDX.LJJJJIZL(r0)
                    com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.protocols.VoiceTranscriptSendPowerCell r0 = r11.LLLIIIIL
                    X.0zJl r0 = r0.getItem()
                    X.0ZRr r0 = (X.C899810ZRr) r0
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
                    com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.protocols.VoiceTranscriptSendPowerCell r0 = r11.LLLIIIIL
                    X.0zJl r0 = r0.getItem()
                    X.0ZRr r0 = (X.C899810ZRr) r0
                    if (r0 == 0) goto La8
                    X.0ZRl r0 = r0.LLILZ
                L84:
                    boolean r0 = r0 instanceof X.C0ZRD
                    if (r0 != 0) goto La6
                    com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.protocols.VoiceTranscriptSendPowerCell r0 = r11.LLLIIIIL
                    X.0zJl r0 = r0.getItem()
                    X.0ZRr r0 = (X.C899810ZRr) r0
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
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.protocols.VoiceTranscriptSendPowerCell$createAssemAttached2Cell$1.Tp():void");
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
                    VoiceTranscriptSendPowerCell voiceTranscriptSendPowerCell = this.LLLIIIIL;
                    dM(viewLJFF);
                    voiceTranscriptSendPowerCell.R5(viewLJFF);
                    up(viewLJFF);
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC907020Zi8
    public final View getBackgroundView() {
        View view;
        C0ZXS c0zxs;
        C899810ZRr c899810ZRr = (C899810ZRr) getItem();
        C0ZXL c0zxl = (c899810ZRr == null || (c0zxs = c899810ZRr.LL) == null) ? null : c0zxs.LIZJ;
        if (c0zxl instanceof C0ZXV) {
            view = this.LLJJJIL;
            if (view == null) {
                IIMMessageBubbleService iIMMessageBubbleService = (IIMMessageBubbleService) PluggableExtentionKt.pluggableSpiForReal(IIMMessageBubbleService.class);
                viewLJFF = iIMMessageBubbleService != null ? iIMMessageBubbleService.LJFF(LJJIJL(), false) : null;
                this.LLJJJIL = viewLJFF;
                return viewLJFF;
            }
            return view;
        }
        if (!(c0zxl instanceof C0ZXY) && !(c0zxl instanceof C0ZXZ)) {
            if (c0zxl instanceof C0ZXU) {
                if (((C0ZXU) c0zxl).LIZIZ.LIZJ instanceof C0ZXV) {
                    view = this.LLJJJIL;
                    if (view == null) {
                        IIMMessageBubbleService iIMMessageBubbleService2 = (IIMMessageBubbleService) PluggableExtentionKt.pluggableSpiForReal(IIMMessageBubbleService.class);
                        viewLJFF = iIMMessageBubbleService2 != null ? iIMMessageBubbleService2.LJFF(LJJIJL(), false) : null;
                        this.LLJJJIL = viewLJFF;
                        return viewLJFF;
                    }
                    return view;
                }
            } else if (c0zxl != null) {
                throw new C1954807lC();
            }
        }
        return viewLJFF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC907020Zi8
    public final void LJLLL(double d) {
        C0ZXL c0zxl;
        C0ZXS c0zxs;
        C899810ZRr c899810ZRr = (C899810ZRr) getItem();
        View view = null;
        if (c899810ZRr != null && (c0zxs = c899810ZRr.LL) != null) {
            c0zxl = c0zxs.LIZJ;
        } else {
            c0zxl = null;
        }
        if (c0zxl instanceof C0ZXV) {
            InterfaceC422340GhE interfaceC422340GhE = (InterfaceC422340GhE) this.LLJJJJ.getValue();
            if (interfaceC422340GhE != null) {
                interfaceC422340GhE.LIZ(d);
            }
            InterfaceC422340GhE interfaceC422340GhE2 = (InterfaceC422340GhE) this.LLJJJJ.getValue();
            if (interfaceC422340GhE2 != null) {
                C0ZXV c0zxv = (C0ZXV) c0zxl;
                interfaceC422340GhE2.LIZIZ(c0zxv.LIZ, c0zxv.LIZIZ, c0zxv.LIZJ);
            }
            Map<Integer, View> map = this.LLJJJJJIL;
            Integer numValueOf = Integer.valueOf(R.id.k9m);
            LinkedHashMap linkedHashMap = (LinkedHashMap) map;
            Object objFindViewById = linkedHashMap.get(numValueOf);
            if (objFindViewById == null) {
                objFindViewById = LJJIJL().findViewById(R.id.k9m);
                linkedHashMap.put(numValueOf, objFindViewById);
            }
            if (objFindViewById instanceof View) {
                view = (View) objFindViewById;
            }
            C423680GjO c423680GjO = (C423680GjO) view;
            if (c423680GjO != null) {
                int iLJFF = C1383370m6R.LJFF(R.attr.ee);
                int iLJI = C2441009hQ.LJI(0.7f, C1383370m6R.LJFF(R.attr.a1s), C1383370m6R.LJFF(R.attr.c3));
                c423680GjO.LLILLJJLI.setColor(iLJFF);
                c423680GjO.LLILLL.setColor(iLJI);
                c423680GjO.invalidate();
            }
        }
    }
}
