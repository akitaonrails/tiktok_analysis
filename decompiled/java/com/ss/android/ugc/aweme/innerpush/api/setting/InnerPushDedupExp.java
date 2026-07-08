package com.ss.android.ugc.aweme.innerpush.api.setting;

import X.C01GW;
import X.C09CT;
import X.C2097608Jq;
import X.C452501pT;
import java.util.Map;
import kotlin.jvm.internal.AFwS226S0000000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class InnerPushDedupExp {
    public static final Config LIZ = new Config(0, 0, 0, 0, 0, C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ(), 1);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS226S0000000_35.get$arr$(217));
    public static final boolean LIZJ;
    public static final boolean LIZLLL;
    public static final boolean LJ;
    public static final int LJFF;
    public static final Map<String, String> LJI;
    public static final Map<String, String> LJII;
    public static final Map<String, String> LJIIIIZZ;

    public static final class Config {

        @C09CT("create_time_tolerance")
        public final int createTimeTolerance;

        @C09CT("deduplicate_enabled")
        public final int deduplicatEnabled;

        @C09CT("inapp_push")
        public final Map<String, String> innerPush;

        @C09CT("inapp_push_avoid_notice")
        public final int innerPushAvoidNotice;

        @C09CT("inapp_push_enabled")
        public final int innerPushEnable;

        @C09CT("notice")
        public final Map<String, String> notice;

        @C09CT("notice_enabled")
        public final int noticeEnable;

        @C09CT("outapp_push")
        public final Map<String, String> outPush;

        @C09CT("outapp_push_enabled")
        public final int outPushEnable;

        public Config() {
            this(0, 0, 0, 0, 0, C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ(), 1);
        }

        public Config(int i, int i2, int i3, int i4, int i5, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, int i6) {
            this.deduplicatEnabled = i;
            this.innerPushEnable = i2;
            this.outPushEnable = i3;
            this.noticeEnable = i4;
            this.innerPushAvoidNotice = i5;
            this.innerPush = map;
            this.notice = map2;
            this.outPush = map3;
            this.createTimeTolerance = i6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    static {
        /*
            com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushDedupExp r0 = new com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushDedupExp
            com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushDedupExp$Config r1 = new com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushDedupExp$Config
            r2 = 0
            java.util.Map r7 = X.C2097608Jq.LJ()
            java.util.Map r8 = X.C2097608Jq.LJ()
            java.util.Map r9 = X.C2097608Jq.LJ()
            r10 = 1
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushDedupExp.LIZ = r1
            r0 = 217(0xd9, float:3.04E-43)
            kotlin.jvm.internal.AFwS226S0000000_35 r0 = kotlin.jvm.internal.AFwS226S0000000_35.get$arr$(r0)
            X.01GW r0 = X.C452501pT.LIZIZ(r0)
            com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushDedupExp.LIZIZ = r0
            com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushDedupExp$Config r0 = LIZ()
            int r0 = r0.deduplicatEnabled
            if (r0 != r10) goto L7b
            r1 = 1
            com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushDedupExp$Config r0 = LIZ()
            int r0 = r0.innerPushEnable
            if (r0 != r10) goto L7c
            r0 = 1
        L39:
            com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushDedupExp.LIZJ = r0
            if (r1 == 0) goto L79
            com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushDedupExp$Config r0 = LIZ()
            int r0 = r0.innerPushEnable
            if (r0 != r10) goto L79
            r0 = 1
        L46:
            com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushDedupExp.LIZLLL = r0
            if (r1 == 0) goto L53
            com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushDedupExp$Config r0 = LIZ()
            int r0 = r0.noticeEnable
            if (r0 != r10) goto L53
            r2 = 1
        L53:
            com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushDedupExp.LJ = r2
            LIZ()
            com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushDedupExp$Config r0 = LIZ()
            int r0 = r0.createTimeTolerance
            com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushDedupExp.LJFF = r0
            com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushDedupExp$Config r0 = LIZ()
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.innerPush
            com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushDedupExp.LJI = r0
            com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushDedupExp$Config r0 = LIZ()
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.notice
            com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushDedupExp.LJII = r0
            com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushDedupExp$Config r0 = LIZ()
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.outPush
            com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushDedupExp.LJIIIIZZ = r0
            return
        L79:
            r0 = 0
            goto L46
        L7b:
            r1 = 0
        L7c:
            r0 = 0
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushDedupExp.<clinit>():void");
    }

    public static Config LIZ() {
        return (Config) LIZIZ.getValue();
    }
}
