package com.ss.android.ugc.aweme.im.chatroom.common.titlebar;

import X.C01GW;
import X.C1527105yP;
import X.C1559260qg8;
import X.C1639906bV;
import X.C343820Dds;
import X.C452501pT;
import X.C457780HxI;
import X.C723600SZy;
import X.C909290Zln;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.social.thought.api.ISocialThoughtDataCenterService;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class SingleTitleBarCenterViewModel extends AssemViewModel<C1639906bV> {
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, C457780HxI.class, null), true);
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new C723600SZy(this, C1527105yP.class, null), true);
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 347));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        String singleChatFromUserId;
        ISocialThoughtDataCenterService iSocialThoughtDataCenterService;
        ThoughtInfo thoughtInfoLIZIZ;
        EnterChatParams enterChatParams;
        IMUser fromUser;
        boolean z = false;
        z = false;
        z = false;
        C1639906bV c1639906bV = new C1639906bV(z ? 1 : 0);
        if (!C343820Dds.LIZ()) {
            return c1639906bV;
        }
        C909290Zln c909290Zln = (C909290Zln) this.LLILLL.getValue();
        C1639906bV c1639906bVLIZ = C1639906bV.LIZ(c1639906bV, null, null, null, false, null, (c909290Zln == null || (fromUser = c909290Zln.getFromUser()) == null || fromUser.getFollowStatus() != 2) ? false : true, null, null, null, 959);
        SessionInfo sessionInfo = (SessionInfo) this.LLILLL.getValue();
        if (sessionInfo == null || (singleChatFromUserId = sessionInfo.getSingleChatFromUserId()) == null || singleChatFromUserId.length() <= 0 || (iSocialThoughtDataCenterService = (ISocialThoughtDataCenterService) PluggableExtentionKt.pluggableSpiForReal(ISocialThoughtDataCenterService.class)) == null || (thoughtInfoLIZIZ = iSocialThoughtDataCenterService.LIZIZ(singleChatFromUserId)) == null) {
            return c1639906bVLIZ;
        }
        C457780HxI c457780HxI = (C457780HxI) this.LL.getValue();
        if (c457780HxI != null && (enterChatParams = c457780HxI.LLILLL) != null && enterChatParams.getHasThoughtAndWillShowAsExpanded()) {
            z = true;
        }
        return vQ2(C1639906bV.LIZ(c1639906bVLIZ, null, null, null, false, null, false, thoughtInfoLIZIZ, null, null, 895), z);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1639906bV vQ2(X.C1639906bV r16, boolean r17) {
        /*
            r15 = this;
            r4 = r16
            com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo r2 = r4.LLIZLLLIL
            boolean r0 = r4.LLIZ
            if (r0 == 0) goto L65
            if (r2 == 0) goto L65
            java.lang.String r12 = r2.textContent
            if (r12 != 0) goto L10
            java.lang.String r12 = ""
        L10:
            java.lang.String r0 = r4.LLJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r12)
            if (r0 == 0) goto L1f
            X.06IF r1 = r4.LLJI
            X.06IF r0 = X.C06IF.NONE
            if (r1 == r0) goto L1f
            return r4
        L1f:
            X.01GW r0 = r15.LLILLL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r0 = (com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo) r0
            if (r0 == 0) goto L63
            java.lang.String r3 = r0.getConversationId()
        L2d:
            java.lang.String r2 = r2.thoughtId
            if (r17 == 0) goto L60
            X.054H r1 = X.C054H.LIZ
            boolean r0 = r1.LIZIZ(r3, r2)
            if (r0 == 0) goto L60
            if (r3 == 0) goto L50
            boolean r0 = kotlin.text.a0.LJJJIL(r3)
            if (r0 != 0) goto L50
            if (r2 == 0) goto L50
            boolean r0 = kotlin.text.a0.LJJJIL(r2)
            if (r0 != 0) goto L50
            com.bytedance.keva.Keva r0 = r1.LIZ()
            r0.storeString(r3, r2)
        L50:
            X.06IF r13 = X.C06IF.LARGE
        L52:
            r5 = 0
            r8 = 0
            r14 = 255(0xff, float:3.57E-43)
            r6 = r5
            r7 = r5
            r9 = r5
            r10 = r8
            r11 = r5
            X.06bV r0 = X.C1639906bV.LIZ(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L60:
            X.06IF r13 = X.C06IF.SMALL
            goto L52
        L63:
            r3 = 0
            goto L2d
        L65:
            X.06IF r0 = r4.LLJI
            X.06IF r13 = X.C06IF.NONE
            if (r0 != r13) goto L74
            java.lang.String r0 = r4.LLJ
            int r0 = r0.length()
            if (r0 != 0) goto L74
            return r4
        L74:
            r5 = 0
            r8 = 0
            java.lang.String r12 = ""
            r14 = 255(0xff, float:3.57E-43)
            r6 = r5
            r7 = r5
            r9 = r5
            r10 = r8
            r11 = r5
            X.06bV r0 = X.C1639906bV.LIZ(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.chatroom.common.titlebar.SingleTitleBarCenterViewModel.vQ2(X.06bV, boolean):X.06bV");
    }
}
