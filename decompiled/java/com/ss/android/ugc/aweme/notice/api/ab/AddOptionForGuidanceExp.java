package com.ss.android.ugc.aweme.notice.api.ab;

import X.C01GW;
import X.C09CT;
import X.C1697810uHb;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class AddOptionForGuidanceExp {
    public static final Config LIZ = new Config(0, 20, false, false, false, 1, false, 1);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(262));
    public static final int LIZJ = LIZ().featureExp;
    public static final boolean LIZLLL = LIZ().inboxCleanUpFreq;
    public static final int LJ = LIZ().inboxCleanUpFreqInterval;
    public static final boolean LJFF;
    public static final boolean LJI;
    public static final List<String> LJII;

    static {
        LIZ();
        LJFF = LIZ().onlyFriends;
        LJI = LIZ().defaultSelection == 1;
        LIZ();
        LJII = C1697810uHb.LJIILJJIL("comment", "publish");
    }

    public static Config LIZ() {
        return (Config) LIZIZ.getValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0052, code lost:
    
        if (r5.equals("repost") != false) goto L32;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZIZ(java.lang.String r5) {
        /*
            int r0 = r5.hashCode()
            java.lang.String r4 = "only_interaction"
            java.lang.String r3 = "only_friends"
            java.lang.String r2 = ""
            switch(r0) {
                case -934521517: goto L4c;
                case -880501304: goto Le;
                case -235365105: goto L17;
                case 755339170: goto L20;
                case 925887911: goto L3a;
                case 950398559: goto L43;
                default: goto Ld;
            }
        Ld:
            return r2
        Le:
            java.lang.String r0 = "self_video"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L54
            return r2
        L17:
            java.lang.String r0 = "publish"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L54
            return r2
        L20:
            java.lang.String r0 = "all_read_return_inbox"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Ld
            int r1 = com.ss.android.ugc.aweme.notice.api.ab.AddOptionForGuidanceExp.LIZJ
            r0 = 3
            if (r1 == r0) goto L5b
            r0 = 4
            if (r1 == r0) goto L5a
            r0 = 5
            if (r1 == r0) goto L5a
            r0 = 6
            if (r1 == r0) goto L5b
            r0 = 7
            if (r1 == r0) goto L5b
            return r2
        L3a:
            java.lang.String r0 = "in_app_share"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L54
            return r2
        L43:
            java.lang.String r0 = "comment"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L54
            return r2
        L4c:
            java.lang.String r0 = "repost"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Ld
        L54:
            int r0 = com.ss.android.ugc.aweme.notice.api.ab.AddOptionForGuidanceExp.LIZJ
            switch(r0) {
                case 1: goto L5d;
                case 2: goto L5c;
                case 3: goto L5d;
                case 4: goto L5c;
                case 5: goto L5c;
                case 6: goto L5d;
                case 7: goto L5d;
                default: goto L59;
            }
        L59:
            return r2
        L5a:
            return r4
        L5b:
            return r3
        L5c:
            return r4
        L5d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notice.api.ab.AddOptionForGuidanceExp.LIZIZ(java.lang.String):java.lang.String");
    }

    public static final class Config {

        @C09CT("default_selection")
        public final int defaultSelection;

        @C09CT("enable_inbox_popup")
        public final boolean enableInboxPopup;

        @C09CT("exp_value")
        public final int featureExp;

        @C09CT("inbox_cleanup_frequency")
        public final boolean inboxCleanUpFreq;

        @C09CT("inbox_cleanup_freq_interval")
        public final int inboxCleanUpFreqInterval;

        @C09CT("muf_count")
        public final int mufCount;

        @C09CT("only_friends")
        public final boolean onlyFriends;

        @C09CT("only_interaction")
        public final boolean onlyInteraction;

        public Config() {
            this(0, 20, false, false, false, 1, false, 1);
        }

        public Config(int i, int i2, boolean z, boolean z2, boolean z3, int i3, boolean z4, int i4) {
            this.featureExp = i;
            this.mufCount = i2;
            this.onlyFriends = z;
            this.onlyInteraction = z2;
            this.enableInboxPopup = z3;
            this.defaultSelection = i3;
            this.inboxCleanUpFreq = z4;
            this.inboxCleanUpFreqInterval = i4;
        }
    }
}
