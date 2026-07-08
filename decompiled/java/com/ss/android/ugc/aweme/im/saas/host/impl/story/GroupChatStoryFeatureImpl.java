package com.ss.android.ugc.aweme.im.saas.host.impl.story;

import X.C0ZPB;
import X.C1618440sDa;
import X.C19EG;
import X.C735840Sti;
import X.EnumC1606080rte;
import X.EnumC1615506Uf;
import X.InterfaceC2135708Yh;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.story.GroupChatStoryFeature;
import com.ss.android.ugc.aweme.service.ISocPubStatusRepoService;
import java.util.HashMap;

/* JADX INFO: loaded from: classes25.dex */
public final class GroupChatStoryFeatureImpl implements GroupChatStoryFeature {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.story.GroupChatStoryFeature
    public final InterfaceC2135708Yh LIZIZ(LifecycleOwner lifecycleOwner) {
        return C1618440sDa.LIZIZ.LIZIZ(lifecycleOwner);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.story.GroupChatStoryFeature
    public final void LJ(SmartRoute smartRoute, boolean z) {
        String str;
        if (z) {
            str = "STORY_ENTRANCE_AVATAR";
        } else {
            str = "STORY_ENTRANCE_INBOX_GROUP_CHAT";
        }
        C735840Sti c735840Sti = C735840Sti.LIZ;
        c735840Sti.getClass();
        c735840Sti.getClass();
        smartRoute.withParam("story type", 0);
        smartRoute.withParam("enter_from", "chat");
        smartRoute.withParam("video_from", str);
        smartRoute.withParam("previous_page", "chat");
        if (z) {
            smartRoute.withParam("story_is_from_group_chat_single_avatar", true);
        }
        smartRoute.withParam("enter_position", "head");
        HashMap map = new HashMap();
        map.put("enter_position", "head");
        smartRoute.withParam("feed_param_extra", map);
        smartRoute.withParam("story_cover_transition", true);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.story.GroupChatStoryFeature
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r12, java.util.List r13, X.InterfaceC1364105Vn r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof X.C05G7
            if (r0 == 0) goto L4d
            r3 = r14
            X.05G7 r3 = (X.C05G7) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4d
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r4 = r3.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 != r1) goto L53
            X.C155000ia.LIZIZ(r4)
        L22:
            if (r4 != 0) goto L30
        L24:
            com.ss.android.ugc.aweme.model.GroupRelatedInfoResponse r4 = new com.ss.android.ugc.aweme.model.GroupRelatedInfoResponse
            r5 = 0
            r9 = 15
            r6 = r5
            r7 = r5
            r8 = r5
            r10 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10)
        L30:
            return r4
        L31:
            X.C155000ia.LIZIZ(r4)
            java.lang.Class<com.ss.android.ugc.aweme.service.ISocPubStatusRepoService> r4 = com.ss.android.ugc.aweme.service.ISocPubStatusRepoService.class
            r5 = 0
            r8 = 14
            r9 = 0
            r6 = r5
            r7 = r5
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r4, r5, r6, r7, r8, r9)
            com.ss.android.ugc.aweme.service.ISocPubStatusRepoService r0 = (com.ss.android.ugc.aweme.service.ISocPubStatusRepoService) r0
            if (r0 == 0) goto L24
            r3.LLILLL = r1
            java.lang.Object r4 = r0.LJ(r12, r13, r3)
            if (r4 != r2) goto L22
            return r2
        L4d:
            X.05G7 r3 = new X.05G7
            r3.<init>(r11, r14)
            goto L12
        L53:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.saas.host.impl.story.GroupChatStoryFeatureImpl.LIZLLL(java.lang.String, java.util.List, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.story.GroupChatStoryFeature
    public final C0ZPB LIZJ(C19EG c19eg, LifecycleOwner lifecycleOwner, EnumC1615506Uf enumC1615506Uf, EnumC1606080rte enumC1606080rte, String str) {
        ISocPubStatusRepoService iSocPubStatusRepoService = (ISocPubStatusRepoService) PluggableExtentionKt.pluggableSpi$default(ISocPubStatusRepoService.class, false, false, false, 14, null);
        if (iSocPubStatusRepoService != null) {
            return iSocPubStatusRepoService.LIZJ(c19eg, lifecycleOwner, enumC1615506Uf, enumC1606080rte, str);
        }
        throw new IllegalStateException("ISocPubStatusRepoService not available");
    }
}
