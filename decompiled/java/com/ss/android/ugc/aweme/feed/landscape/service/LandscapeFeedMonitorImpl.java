package com.ss.android.ugc.aweme.feed.landscape.service;

import X.C054G;
import X.C09AE;
import X.C0PEM;
import X.C1561780qkC;
import X.C1569250qwF;
import X.C1569280qwI;
import X.C1569290qwJ;
import X.C1569300qwK;
import X.C1697810uHb;
import X.C1DFH;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2107308Nj;
import X.C2296808zG;
import X.C289000BUk;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.service.ILandscapeFeedMonitor;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS162S0101000_24;
import kotlin.jvm.internal.AwS173S1100000_24;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class LandscapeFeedMonitorImpl implements ILandscapeFeedMonitor {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("landscape_feed_click_entrance", "landscape_feed_container_layer_start_construct", "landscape_feed_view_pager_set_data", "landscape_feed_container_layer_finish_construct", "landscape_feed_interaction_layer_start_construct", "landscape_feed_interaction_layer_finish_construct", "landscape_feed_launch_video_first_frame_rendered", "landscape_feed_launch_animation_finish");
    public static final Map<String, Integer> LIZIZ = C2097608Jq.LJIIIIZZ(new Pair("landscape_feed_click_entrance", 0), new Pair("landscape_feed_container_layer_start_construct", 1), new Pair("landscape_feed_view_pager_set_data", 2), new Pair("landscape_feed_container_layer_finish_construct", 3), new Pair("landscape_feed_interaction_layer_start_construct", 4), new Pair("landscape_feed_interaction_layer_finish_construct", 5), new Pair("landscape_feed_launch_video_first_frame_rendered", 6), new Pair("landscape_feed_launch_animation_finish", 7));
    public static final List<String> LIZJ = C1697810uHb.LJIIJJI("landscape_feed_scroll_to_view_fully_in_screen", "landscape_feed_scroll_to_video_first_frame_rendered");
    public static final Map<String, Integer> LIZLLL = C2097608Jq.LJIIIIZZ(new Pair("landscape_feed_scroll_to_view_fully_in_screen", 0), new Pair("landscape_feed_scroll_to_video_first_frame_rendered", 1));
    public static final List<String> LJ = C1697810uHb.LJIIJJI("landscape_feed_start_exit", "landscape_feed_end_exit");
    public static final Map<String, Integer> LJFF = C2097608Jq.LJIIIIZZ(new Pair("landscape_feed_start_exit", 0), new Pair("landscape_feed_end_exit", 1));
    public static final Map<String, C1569250qwF> LJI = new LinkedHashMap();
    public static final Map<String, C09AE> LJII = new LinkedHashMap();
    public static final HashMap<Integer, Pair<Long, Map<String, String>>> LJIIIIZZ = new HashMap<>();
    public static final HashMap<Integer, Pair<Long, Map<String, String>>> LJIIIZ = new HashMap<>();
    public static boolean LJIIJ;
    public static boolean LJIIJJI;
    public static final C054G LJIIL;
    public static final Map<String, String> LJIILIIL;
    public static final BPEAHandler LJIILJJIL;

    static {
        C1DFH c1dfh = C0PEM.LIZ;
        LJIIL = C2296808zG.LIZ(C2107308Nj.LIZ);
        LJIILIIL = C2097908Jt.LIZJ(new Pair("isRefactorOff", "1"));
        LJIILJJIL = new BPEAHandler(Looper.getMainLooper());
    }

    @Override // com.ss.android.ugc.aweme.service.ILandscapeFeedMonitor
    public final void LIZLLL() {
        if (C289000BUk.LIZ()) {
            C1561780qkC.LIZ(AFwS213S0000000_24.get$arr$(143));
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ILandscapeFeedMonitor
    public final void LIZ(Map<String, String> map) {
        if (!C289000BUk.LIZ()) {
            return;
        }
        C1561780qkC.LIZ(new AwS425S0200000_24(this, (LandscapeFeedMonitorImpl) map, (Map<String, String>) 16));
    }

    @Override // com.ss.android.ugc.aweme.service.ILandscapeFeedMonitor
    public final void LIZJ(Map<String, String> map) {
        if (!C289000BUk.LIZ()) {
            return;
        }
        C1561780qkC.LIZ(new AwS425S0200000_24(this, (LandscapeFeedMonitorImpl) map, (Map<String, String>) 17));
    }

    @Override // com.ss.android.ugc.aweme.service.ILandscapeFeedMonitor
    public final void LJII(Map<String, String> map) {
        if (!C289000BUk.LIZ()) {
            return;
        }
        C1561780qkC.LIZ(new AwS568S0100000_24(map, (Map<String, String>) 413));
    }

    @Override // com.ss.android.ugc.aweme.service.ILandscapeFeedMonitor
    public final void LJIIIIZZ(Map<String, String> map) {
        if (!C289000BUk.LIZ()) {
            return;
        }
        C1561780qkC.LIZ(new AwS568S0100000_24(map, (Map<String, String>) 412));
    }

    @Override // com.ss.android.ugc.aweme.service.ILandscapeFeedMonitor
    public final void LJIIJ(Map<String, String> map) {
        if (C289000BUk.LIZ() && !LJIIJ) {
            LJIIJ = true;
            C1561780qkC.LIZ(new AwS568S0100000_24(map, (Map<String, String>) 411));
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ILandscapeFeedMonitor
    public final void LJIIJJI(Map<String, String> map) {
        if (!C289000BUk.LIZ()) {
            return;
        }
        C1561780qkC.LIZ(new AwS568S0100000_24(map, (Map<String, String>) 414));
    }

    @Override // com.ss.android.ugc.aweme.service.ILandscapeFeedMonitor
    public final void LJIIL(Map<String, String> map) {
        if (!C289000BUk.LIZ()) {
            return;
        }
        C1561780qkC.LIZ(new AwS568S0100000_24(map, (Map<String, String>) 416));
    }

    @Override // com.ss.android.ugc.aweme.service.ILandscapeFeedMonitor
    public final void LJIILIIL(Map<String, String> map) {
        if (!C289000BUk.LIZ()) {
            return;
        }
        C1561780qkC.LIZ(new AwS568S0100000_24(map, (Map<String, String>) 415));
    }

    @Override // com.ss.android.ugc.aweme.service.ILandscapeFeedMonitor
    public final void LJ(int i, String str) {
        C1561780qkC.LIZ(new C1569300qwK(this, str, i));
    }

    @Override // com.ss.android.ugc.aweme.service.ILandscapeFeedMonitor
    public final void LJFF(int i, Map<String, String> map) {
        C1561780qkC.LIZ(new AwS162S0101000_24(i, (int) map, (Map<String, String>) 1));
    }

    @Override // com.ss.android.ugc.aweme.service.ILandscapeFeedMonitor
    public final void LJI(String str, Map<String, String> map) {
        if (!C289000BUk.LIZ()) {
            return;
        }
        C1561780qkC.LIZ(new AwS173S1100000_24((Map) map, (Map<String, String>) str, (String) 2));
    }

    @Override // com.ss.android.ugc.aweme.service.ILandscapeFeedMonitor
    public final void LIZIZ(int i, String str, Map map) {
        C1561780qkC.LIZ(new C1569290qwJ(i, map, this, str));
    }

    @Override // com.ss.android.ugc.aweme.service.ILandscapeFeedMonitor
    public final void LJIIIZ(String str, String str2, String str3, Map<String, String> map) {
        if (!C289000BUk.LIZ()) {
            return;
        }
        C1561780qkC.LIZ(new C1569280qwI(this, str2, str, str3, map));
    }
}
