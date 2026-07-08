package com.ss.android.ugc.aweme.legoImp.task.pumbaa2;

import X.C09CT;
import X.C0WZ5;

/* JADX INFO: loaded from: classes14.dex */
public final class PumbaaSystemApi {
    /* JADX WARN: Removed duplicated region for block: B:8:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ() {
        /*
            java.lang.System.currentTimeMillis()
            X.0WYr r0 = X.C825190WYr.LIZ
            X.C825230WYv.LIZ = r0
            X.0WZ8 r0 = new X.C0WZC() { // from class: X.0WZ8
                static {
                    /*
                        X.0WZ8 r0 = new X.0WZ8
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0WZ8) X.0WZ8.LIZ X.0WZ8
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0WZ8.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0WZ8.<init>():void");
                }

                @Override // X.C0WZC
                public final void LIZ(java.lang.String r1, org.json.JSONObject r2, org.json.JSONObject r3, org.json.JSONObject r4) {
                    /*
                        r0 = this;
                        X.C823280WRi.LJI(r1, r2, r3, r4)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0WZ8.LIZ(java.lang.String, org.json.JSONObject, org.json.JSONObject, org.json.JSONObject):void");
                }
            }
            X.C825230WYv.LIZIZ = r0
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            java.lang.String r1 = X.C844470XAv.LJIILL
            java.lang.String r0 = "local_test"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            X.C825150WYn.LIZ = r0
            com.bytedance.ies.abmock.SettingsManager r3 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            java.lang.Class<com.ss.android.ugc.aweme.legoImp.task.pumbaa2.PumbaaSystemApi$TTSystemApiConfig> r2 = com.ss.android.ugc.aweme.legoImp.task.pumbaa2.PumbaaSystemApi.TTSystemApiConfig.class
            r1 = 0
            java.lang.String r0 = "pumbaa_system_api"
            java.lang.Object r3 = r3.LJIIIIZZ(r0, r2, r1)
            com.ss.android.ugc.aweme.legoImp.task.pumbaa2.PumbaaSystemApi$TTSystemApiConfig r3 = (com.ss.android.ugc.aweme.legoImp.task.pumbaa2.PumbaaSystemApi.TTSystemApiConfig) r3
            r2 = 1
            if (r3 == 0) goto L58
            boolean r0 = r3.enableContactControl
            if (r0 != r2) goto L46
            X.0WYx r1 = new X.0WYx
            r0 = 23
            kotlin.jvm.internal.AFwS247S0000000_13 r0 = kotlin.jvm.internal.AFwS247S0000000_13.get$arr$(r0)
            r1.<init>(r0)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            X.0WZ4 r0 = X.C0WZ4.INTERCEPT
            X.C0WZ2.LIZ(r1, r0)
            if (r3 == 0) goto L58
        L46:
            boolean r0 = r3.enablePipeline
            if (r0 != r2) goto L58
            X.0WYo r0 = new X.0WYo
            r0.<init>()
            java.util.List r1 = java.util.Collections.singletonList(r0)
            X.0WZ4 r0 = X.C0WZ4.ALL
            X.C0WZ2.LIZ(r1, r0)
        L58:
            X.0WZ7 r0 = X.C0WZ7.LIZLLL
            r0.getClass()
            X.C0WZ7.LJFF = r3
            X.C0WZ7.LJ = r2
            boolean r0 = X.C825150WYn.LIZ
            if (r0 == 0) goto L6a
            if (r3 == 0) goto L6a
            r3.toString()
        L6a:
            java.lang.System.currentTimeMillis()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.pumbaa2.PumbaaSystemApi.LIZ():void");
    }

    public static final class TTSystemApiConfig extends C0WZ5 {

        @C09CT("enable_contact_control")
        public final boolean enableContactControl;

        @C09CT("enable_pipeline")
        public final boolean enablePipeline;

        public TTSystemApiConfig() {
            this(false, false);
        }

        public TTSystemApiConfig(boolean z, boolean z2) {
            super(false, null, null, null, false, null);
            this.enablePipeline = z;
            this.enableContactControl = z2;
        }
    }
}
