package com.ss.android.ugc.aweme.search.pages.result.nimble.v2.component;

import X.C13LE;
import X.C19719912Dl;
import X.C684930Qtn;
import X.C724270Sb3;
import X.InterfaceC682670Qq9;
import X.InterfaceC685100Qu4;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.ImageData;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class Top1SurroundedImageListAssem extends Top1NimbleBaseAssem<C684930Qtn> {
    public final C19719912Dl LLJZ = C13LE.LIZ(Top1SurroundedImageListAssem.class);

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.eyy;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.v2.component.Top1NimbleBaseAssem
    public final InterfaceC685100Qu4 tp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return (C684930Qtn) (c724270Sb3 != null ? c724270Sb3.LL : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.v2.component.Top1NimbleBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r6) {
        /*
            r5 = this;
            r4 = 0
            X.01GW r0 = r5.LLJJLIIIJLLLLLLLZ     // Catch: java.lang.Exception -> L3c
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Exception -> L3c
            com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleContainerAbility r1 = (com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleContainerAbility) r1     // Catch: java.lang.Exception -> L3c
            if (r1 == 0) goto L40
            X.12Dl r0 = r5.LLJZ     // Catch: java.lang.Exception -> L3c
            X.14NX r0 = r1.Bs1(r0)     // Catch: java.lang.Exception -> L3c
            if (r0 == 0) goto L40
            com.ss.android.ugc.aweme.nimblecard.tako.model.TemplateData r0 = r0.getTemplateData()     // Catch: java.lang.Exception -> L3c
            if (r0 == 0) goto L40
            com.ss.android.ugc.aweme.nimblecard.tako.model.Layout r0 = r0.layout     // Catch: java.lang.Exception -> L3c
            if (r0 == 0) goto L40
            java.lang.String r0 = r0.width     // Catch: java.lang.Exception -> L3c
            if (r0 == 0) goto L40
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)     // Catch: java.lang.Exception -> L3c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L3c
            int r0 = r1.intValue()     // Catch: java.lang.Exception -> L3c
            if (r0 <= 0) goto L40
            float r0 = X.C418440Gaw.LIZIZ(r1)     // Catch: java.lang.Exception -> L3c
            int r0 = X.C814420VxA.LIZIZ(r0)     // Catch: java.lang.Exception -> L3c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L3c
            goto L41
        L3c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L40:
            r3 = r4
        L41:
            X.01GW r0 = r5.LLJJLIIIJLLLLLLLZ     // Catch: java.lang.Exception -> L7c
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Exception -> L7c
            com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleContainerAbility r1 = (com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleContainerAbility) r1     // Catch: java.lang.Exception -> L7c
            if (r1 == 0) goto L80
            X.12Dl r0 = r5.LLJZ     // Catch: java.lang.Exception -> L7c
            X.14NX r0 = r1.Bs1(r0)     // Catch: java.lang.Exception -> L7c
            if (r0 == 0) goto L80
            com.ss.android.ugc.aweme.nimblecard.tako.model.TemplateData r0 = r0.getTemplateData()     // Catch: java.lang.Exception -> L7c
            if (r0 == 0) goto L80
            com.ss.android.ugc.aweme.nimblecard.tako.model.Layout r0 = r0.layout     // Catch: java.lang.Exception -> L7c
            if (r0 == 0) goto L80
            java.lang.String r0 = r0.height     // Catch: java.lang.Exception -> L7c
            if (r0 == 0) goto L80
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)     // Catch: java.lang.Exception -> L7c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L7c
            int r0 = r1.intValue()     // Catch: java.lang.Exception -> L7c
            if (r0 <= 0) goto L80
            float r0 = X.C418440Gaw.LIZIZ(r1)     // Catch: java.lang.Exception -> L7c
            int r0 = X.C814420VxA.LIZIZ(r0)     // Catch: java.lang.Exception -> L7c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L7c
            goto L81
        L7c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L80:
            r2 = r4
        L81:
            kotlin.jvm.internal.AwS219S0300000_10 r1 = new kotlin.jvm.internal.AwS219S0300000_10
            r0 = 9
            r1.<init>(r5, r2, r3, r0)
            X.C723830SaL.LIZ(r5, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.nimble.v2.component.Top1SurroundedImageListAssem.onViewCreated(android.view.View):void");
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.v2.component.Top1NimbleBaseAssem
    public final boolean op(InterfaceC685100Qu4 interfaceC685100Qu4) {
        boolean z;
        InterfaceC682670Qq9 interfaceC682670Qq9;
        List<ImageData> subImages;
        C684930Qtn c684930Qtn = (C684930Qtn) interfaceC685100Qu4;
        if (c684930Qtn != null && (interfaceC682670Qq9 = c684930Qtn.LL) != null && (subImages = interfaceC682670Qq9.getSubImages()) != null && !subImages.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        return !z;
    }
}
