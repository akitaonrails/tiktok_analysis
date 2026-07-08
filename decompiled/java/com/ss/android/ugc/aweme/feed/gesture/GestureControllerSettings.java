package com.ss.android.ugc.aweme.feed.gesture;

import X.C01GW;
import X.C09CT;
import X.C1A5N;
import X.C2271381DvM;
import X.C452501pT;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes34.dex */
public final class GestureControllerSettings {
    public static final GestureControllerConfig LIZ = new GestureControllerConfig(false, false, false, false, 0, 0, 0, 0, false, false, null, null, 4095, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1A5N());
    public static final boolean LIZJ = LIZ().enableAllDetect;
    public static final boolean LIZLLL = LIZ().enableLocalDetect;
    public static final boolean LJ = LIZ().enableConsumeDetect;
    public static final boolean LJFF = LIZ().enableErrorDetect;
    public static final int LJI = LIZ().clickThreshold;
    public static final int LJII = LIZ().scrollThreshold;
    public static final int LJIIIIZZ = LIZ().clickQueueLength;
    public static final int LJIIIZ = LIZ().scrollQueueLength;
    public static final boolean LJIIJ = LIZ().enableShowRiskListAlarmWindow;
    public static final boolean LJIIJJI = LIZ().enableShowWholeListAlarmWindow;
    public static final List<String> LJIIL = LIZ().errorIgnoreList;
    public static final Set<String> LJIILIIL = LIZ().collectIgnoreList;

    public static final GestureControllerConfig LIZ() {
        return (GestureControllerConfig) LIZIZ.getValue();
    }

    public static final class GestureControllerConfig {

        @C09CT("click_queue_length")
        public final int clickQueueLength;

        @C09CT("click_threshold")
        public final int clickThreshold;

        @C09CT("collect_ignore_list")
        public final Set<String> collectIgnoreList;

        @C09CT("enable_all_detect")
        public final boolean enableAllDetect;

        @C09CT("enable_consume_detect")
        public final boolean enableConsumeDetect;

        @C09CT("enable_error_detect")
        public final boolean enableErrorDetect;

        @C09CT("enable_local_detect")
        public final boolean enableLocalDetect;

        @C09CT("enable_show_exceed_design_alarm_window")
        public final boolean enableShowRiskListAlarmWindow;

        @C09CT("enable_show_unregistered_alarm_window")
        public final boolean enableShowWholeListAlarmWindow;

        @C09CT("error_ignore_list")
        public final List<String> errorIgnoreList;

        @C09CT("scroll_queue_length")
        public final int scrollQueueLength;

        @C09CT("scroll_threshold")
        public final int scrollThreshold;

        public GestureControllerConfig() {
            this(false, false, false, false, 0, 0, 0, 0, false, false, null, null, 4095, null);
        }

        public GestureControllerConfig(boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, int i3, int i4, boolean z5, boolean z6, List<String> list, Set<String> set) {
            this.enableAllDetect = z;
            this.enableLocalDetect = z2;
            this.enableConsumeDetect = z3;
            this.enableErrorDetect = z4;
            this.clickThreshold = i;
            this.scrollThreshold = i2;
            this.clickQueueLength = i3;
            this.scrollQueueLength = i4;
            this.enableShowRiskListAlarmWindow = z5;
            this.enableShowWholeListAlarmWindow = z6;
            this.errorIgnoreList = list;
            this.collectIgnoreList = set;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public GestureControllerConfig(boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, int i3, int i4, boolean z5, boolean z6, List list, Set set, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            List arrayList = list;
            boolean z7 = z5;
            int i6 = i4;
            int i7 = i3;
            int i8 = i2;
            int i9 = i;
            boolean z8 = z4;
            boolean z9 = z3;
            boolean z10 = z2;
            Set set2 = set;
            boolean z11 = (i5 & 1) != 0 ? false : z;
            z10 = (i5 & 2) != 0 ? false : z10;
            z9 = (i5 & 4) != 0 ? false : z9;
            z8 = (i5 & 8) != 0 ? false : z8;
            i9 = (i5 & 16) != 0 ? 2000 : i9;
            i8 = (i5 & 32) != 0 ? LivePreCreateNextRoomPlayer.ENABLE : i8;
            i7 = (i5 & 64) != 0 ? 4 : i7;
            i6 = (i5 & 128) != 0 ? 3 : i6;
            z7 = (i5 & 256) != 0 ? false : z7;
            boolean z12 = (i5 & 512) == 0 ? z6 : false;
            arrayList = (i5 & 1024) != 0 ? new ArrayList() : arrayList;
            if ((i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
                boolean z13 = C2271381DvM.LIZ;
                set2 = C2271381DvM.LIZJ;
            }
            this(z11, z10, z9, z8, i9, i8, i7, i6, z7, z12, arrayList, set2);
        }
    }
}
