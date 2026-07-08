package com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model;

import com.google.gson.j;

/* JADX INFO: loaded from: classes29.dex */
public final class PrivacyItemConfigAdapter implements j<PrivacyItemConfigModel> {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    @Override // com.google.gson.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model.PrivacyItemConfigModel deserialize(com.google.gson.k r6, java.lang.reflect.Type r7, com.google.gson.i r8) {
        /*
            r5 = this;
            com.google.gson.n r2 = r6.LJIILIIL()
            r1 = 0
            java.lang.String r0 = "item_type"
            com.google.gson.k r0 = r2.LJJIIZ(r0)     // Catch: java.lang.Throwable -> L7c
            int r0 = r0.LJIIJJI()     // Catch: java.lang.Throwable -> L7c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L80
            int r4 = r0.intValue()
            java.lang.String r0 = "item_tag"
            com.google.gson.k r0 = r2.LJJIIZ(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = r0.LJIL()     // Catch: java.lang.Throwable -> L24
            goto L2a
        L24:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r3 = ""
        L2a:
            java.lang.String r0 = "item_info"
            com.google.gson.k r2 = r2.LJJIIZ(r0)
            if (r4 == 0) goto L6f
            r0 = 1
            if (r4 == r0) goto L62
            r0 = 2
            if (r4 == r0) goto L55
            r0 = 3
            if (r4 != r0) goto L4b
            if (r8 == 0) goto L4b
            java.lang.Class<com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model.PrivacyItemInfoConfigModel> r0 = com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model.PrivacyItemInfoConfigModel.class
            com.google.gson.internal.bind.TreeTypeAdapter$a r8 = (com.google.gson.internal.bind.TreeTypeAdapter.a) r8
            java.lang.Object r1 = r8.LIZ(r2, r0)
            com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model.PrivacyItemInfoConfigModel r1 = (com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model.PrivacyItemInfoConfigModel) r1
        L47:
            if (r1 == 0) goto L4b
            r1.LIZ = r3
        L4b:
            com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model.PrivacyItemConfigModel r2 = new com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model.PrivacyItemConfigModel
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r2.<init>(r0, r3, r1)
            return r2
        L55:
            if (r8 == 0) goto L4b
            java.lang.Class<com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model.PrivacyRadioGroupConfigModel> r0 = com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model.PrivacyRadioGroupConfigModel.class
            com.google.gson.internal.bind.TreeTypeAdapter$a r8 = (com.google.gson.internal.bind.TreeTypeAdapter.a) r8
            java.lang.Object r1 = r8.LIZ(r2, r0)
            com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model.PrivacyItemInfoConfigModel r1 = (com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model.PrivacyItemInfoConfigModel) r1
            goto L47
        L62:
            if (r8 == 0) goto L4b
            java.lang.Class<com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model.PrivacySwitchConfigModel> r0 = com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model.PrivacySwitchConfigModel.class
            com.google.gson.internal.bind.TreeTypeAdapter$a r8 = (com.google.gson.internal.bind.TreeTypeAdapter.a) r8
            java.lang.Object r1 = r8.LIZ(r2, r0)
            com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model.PrivacyItemInfoConfigModel r1 = (com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model.PrivacyItemInfoConfigModel) r1
            goto L47
        L6f:
            if (r8 == 0) goto L4b
            java.lang.Class<com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model.PrivacyDisclosureConfigModel> r0 = com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model.PrivacyDisclosureConfigModel.class
            com.google.gson.internal.bind.TreeTypeAdapter$a r8 = (com.google.gson.internal.bind.TreeTypeAdapter.a) r8
            java.lang.Object r1 = r8.LIZ(r2, r0)
            com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model.PrivacyItemInfoConfigModel r1 = (com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model.PrivacyItemInfoConfigModel) r1
            goto L47
        L7c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L80:
            com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model.PrivacyItemConfigModel r2 = new com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model.PrivacyItemConfigModel
            r2.<init>(r1, r1, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model.PrivacyItemConfigAdapter.deserialize(com.google.gson.k, java.lang.reflect.Type, com.google.gson.i):java.lang.Object");
    }
}
