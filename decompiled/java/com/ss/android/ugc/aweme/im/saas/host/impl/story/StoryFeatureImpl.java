package com.ss.android.ugc.aweme.im.saas.host.impl.story;

import X.C1608660rxo;
import X.C1609580rzI;
import X.C1618440sDa;
import X.C1E99;
import X.C298610Bn9;
import X.C694200RKw;
import X.C694210RKx;
import X.EnumC1609560rzG;
import X.EnumC1615506Uf;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.story.StoryFeature;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.ISocPubStatusRepoService;
import com.ss.android.ugc.aweme.story.setting.ui.color.ColorConfig;

/* JADX INFO: loaded from: classes25.dex */
public final class StoryFeatureImpl implements StoryFeature {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.story.StoryFeature
    public final Boolean LIZ() {
        return Boolean.valueOf(C1618440sDa.LIZIZ.LIZ());
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.story.StoryFeature
    public final String LIZLLL() {
        return (C298610Bn9.LIZ() && C1E99.LIZJ() && !((Boolean) C1E99.LJFF.getValue()).booleanValue()) ? "1" : CardStruct.IStatusCode.DEFAULT;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.story.StoryFeature
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(X.C869590Y9l r5) {
        /*
            r4 = this;
            boolean r0 = X.C281310B0v.LIZ()
            r3 = 1
            if (r0 == 0) goto L3a
            r2 = 0
            if (r5 == 0) goto L45
            java.lang.String r1 = r5.getScene()
        Le:
            java.lang.String r0 = "story_reply"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L42
            if (r5 == 0) goto L43
            java.lang.String r1 = r5.getScene()
        L1c:
            java.lang.String r0 = "story_reaction"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L42
            X.0HsE r0 = com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi.LIZ
            com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi r0 = r0.LIZIZ()
            com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService r0 = r0.getImSocialAvatarService()
            if (r5 == 0) goto L34
            java.lang.String r2 = r5.getScene()
        L34:
            boolean r0 = r0.LJJI(r2)
            if (r0 != 0) goto L42
        L3a:
            if (r5 == 0) goto L47
            boolean r0 = X.C0ZDX.LJJJJJ(r5)
            if (r0 != r3) goto L47
        L42:
            return r3
        L43:
            r1 = r2
            goto L1c
        L45:
            r1 = r2
            goto Le
        L47:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.saas.host.impl.story.StoryFeatureImpl.LIZIZ(X.0Y9l):boolean");
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.story.StoryFeature
    public final void LIZJ(C1609580rzI c1609580rzI) {
        int[] iArr;
        if (!C1608660rxo.LIZIZ) {
            c1609580rzI.setMode(EnumC1609560rzG.VERSION2_BACKGROUND);
            return;
        }
        ColorConfig colorConfig = C1618440sDa.LIZIZ.LJJIJLIJ().LIZ().LIZLLL;
        if (colorConfig.isShader) {
            c1609580rzI.setMode(EnumC1609560rzG.SHADER_MODE);
            C694200RKw c694200RKwLIZ = C694210RKx.LIZ(colorConfig, c1609580rzI.getContext());
            float[] fArr = null;
            if (c694200RKwLIZ != null) {
                iArr = c694200RKwLIZ.LIZ;
            } else {
                iArr = null;
            }
            c1609580rzI.setColors(iArr);
            if (c694200RKwLIZ != null) {
                fArr = c694200RKwLIZ.LIZIZ;
            }
            c1609580rzI.setShaderPosition(fArr);
            return;
        }
        Integer num = colorConfig.singleColor;
        if (num == null) {
            return;
        }
        c1609580rzI.setSingleColor(Integer.valueOf(Integer.valueOf(C694210RKx.LIZIZ(c1609580rzI.getContext(), num)).intValue()));
        c1609580rzI.setMode(EnumC1609560rzG.COLOR_MODE);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.story.StoryFeature
    public final int LJ(String str) {
        ISocPubStatusRepoService iSocPubStatusRepoService = (ISocPubStatusRepoService) PluggableExtentionKt.pluggableSpi$default(ISocPubStatusRepoService.class, false, false, false, 14, null);
        if (iSocPubStatusRepoService != null) {
            return iSocPubStatusRepoService.LJIIZILJ(EnumC1615506Uf.STORY, str);
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.story.StoryFeature
    public final void LJFF(User user) {
        ISocPubStatusRepoService iSocPubStatusRepoService = (ISocPubStatusRepoService) PluggableExtentionKt.pluggableSpi$default(ISocPubStatusRepoService.class, false, false, false, 14, null);
        if (iSocPubStatusRepoService != null) {
            EnumC1615506Uf enumC1615506Uf = EnumC1615506Uf.STORY;
            user.setStoryStatus(iSocPubStatusRepoService.LJIIZILJ(enumC1615506Uf, user.getUid()));
            user.setAllStoryMetadata(iSocPubStatusRepoService.LJIJI(enumC1615506Uf, user.getUid()));
            return;
        }
        throw new IllegalArgumentException("null ISocPubStatusRepoService service");
    }
}
