package com.ss.android.ugc.aweme.portrait.service;

import X.C0F9K;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C418440Gaw;
import X.C547790Le5;
import X.C814420VxA;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitContextModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitCreationModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitGeneratingModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitModel;
import com.ss.android.ugc.aweme.portrait.model.GenerateStatus;

/* JADX INFO: loaded from: classes9.dex */
public final class AIPortraitDraftServiceImpl implements IAIPortraitDraftService {
    public static final int LIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitDraftService
    public final boolean LIZIZ(AwemeDraft awemeDraft) {
        IAIPortraitCreationService iAIPortraitCreationServiceLJFF;
        AIPortraitModel aIPortraitModel;
        AIPortraitCreationModel aIPortraitCreationModel;
        AIPortraitContextModel aIPortraitContextModel;
        AIPortraitGeneratingModel aIPortraitGeneratingModel;
        IAIPortraitFeatureService.LIZ.getClass();
        IAIPortraitFeatureService iAIPortraitFeatureServiceLIZ = C547790Le5.LIZ();
        if (iAIPortraitFeatureServiceLIZ != null && (iAIPortraitCreationServiceLJFF = iAIPortraitFeatureServiceLIZ.LJFF()) != null && iAIPortraitCreationServiceLJFF.LIZ(awemeDraft) && (aIPortraitModel = awemeDraft.LIZ.aigcBusinessModel.aiPortraitModel) != null && (aIPortraitCreationModel = aIPortraitModel.creationModel) != null && aIPortraitCreationModel.showCameoInDraft && ((aIPortraitContextModel = aIPortraitModel.contextModel) == null || (aIPortraitGeneratingModel = aIPortraitContextModel.generatingModel) == null || aIPortraitGeneratingModel.status != GenerateStatus.APPLIED)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0096  */
    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitDraftService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.aikit.api.common.task.CameoDraft r10, X.InterfaceC1364105Vn<? super java.lang.Boolean> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C546390Lbp
            if (r0 == 0) goto L96
            r7 = r11
            X.0Lbp r7 = (X.C546390Lbp) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L96
            int r2 = r2 - r1
            r7.LLILZ = r2
        L12:
            java.lang.Object r2 = r7.LLILLJJLI
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r7.LLILZ
            r4 = 0
            r6 = 1
            if (r0 == 0) goto L4e
            if (r0 != r6) goto La2
            X.C155000ia.LIZIZ(r2)
        L23:
            boolean r0 = r2 instanceof com.ss.android.ugc.aweme.draft.model.AwemeDraft
            r1 = 0
            if (r0 == 0) goto L9d
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r2 = (com.ss.android.ugc.aweme.draft.model.AwemeDraft) r2
            if (r2 == 0) goto L9d
            boolean r0 = r2.LJIIL()
            if (r0 != 0) goto L48
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r2.LIZ
            com.ss.android.ugc.aweme.creative.model.aigc.AIGCBusinessModelSet r0 = r0.aigcBusinessModel
            com.ss.android.ugc.aweme.portrait.model.AIPortraitModel r0 = r0.aiPortraitModel
            if (r0 == 0) goto L44
            com.ss.android.ugc.aweme.portrait.model.AIPortraitContextModel r0 = r0.contextModel
            if (r0 == 0) goto L44
            com.ss.android.ugc.aweme.portrait.model.AIPortraitGeneratingModel r0 = r0.generatingModel
            if (r0 == 0) goto L44
            com.ss.android.ugc.aweme.portrait.model.GenerateStatus r1 = r0.status
        L44:
            com.ss.android.ugc.aweme.portrait.model.GenerateStatus r0 = com.ss.android.ugc.aweme.portrait.model.GenerateStatus.APPLIED
            if (r1 == r0) goto L49
        L48:
            r4 = 1
        L49:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L4e:
            X.C155000ia.LIZIZ(r2)
            if (r10 != 0) goto L58
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L58:
            X.0LeC r0 = X.C547860LeC.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.aikit.api.common.AIConfigService r1 = X.C547860LeC.LIZIZ()
            java.lang.String r0 = r10.business
            X.0LbL r5 = r1.LIZLLL(r0)
            if (r5 != 0) goto L6b
            X.0Ldr r5 = X.C547650Ldr.LIZ
        L6b:
            boolean r0 = r5 instanceof X.C0LOM
            if (r0 == 0) goto Laa
            java.lang.String r0 = r10.taskId
            if (r0 == 0) goto Laa
            X.0LfN r0 = X.C548590LfN.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.aikit.api.camera.ability.DraftService r3 = X.C548590LfN.LIZ()
            java.lang.String r2 = r10.taskId
            if (r2 != 0) goto L82
            java.lang.String r2 = ""
        L82:
            X.0LOJ r1 = new X.0LOJ
            boolean r0 = X.C306490Bzr.LIZ()
            r1.<init>(r4, r0)
            r7.LL = r5
            r7.LLILZ = r6
            java.lang.Object r2 = r3.LJII(r5, r2, r1, r7)
            if (r2 != r8) goto L23
            return r8
        L96:
            X.0Lbp r7 = new X.0Lbp
            r7.<init>(r9, r11)
            goto L12
        L9d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            return r0
        La2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Laa:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.portrait.service.AIPortraitDraftServiceImpl.LIZ(com.ss.android.ugc.aweme.aikit.api.common.task.CameoDraft, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitDraftService
    public final View LIZJ(Context context, String str) {
        C0F9K c0f9k = new C0F9K(context, null, 6, 0);
        int i = LIZ;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i, 17);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0f9k);
        c0f9k.setLayoutParams(layoutParams);
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        c1331670kl3LJIIIZ.LJJ(c0f9k);
        c1331670kl3LJIIIZ.LJIIJJI();
        return c0f9k;
    }
}
