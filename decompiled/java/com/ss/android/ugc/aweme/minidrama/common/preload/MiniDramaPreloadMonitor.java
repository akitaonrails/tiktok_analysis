package com.ss.android.ugc.aweme.minidrama.common.preload;

import X.AbstractC1617510sC5;
import X.C09CT;
import X.C1163504gr;
import X.C1574620r4u;
import X.C1574630r4v;
import X.C1617520sC6;
import X.C1617540sC8;
import X.C1617550sC9;
import X.EnumC1574730r55;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public final class MiniDramaPreloadMonitor {
    public static final Map<String, MiniDramaPreloadEvent> LIZ = new LinkedHashMap();

    public static final class MiniDramaPreloadEvent {
        public long LIZ;

        @C09CT("error_code")
        public int errorCode;

        @C09CT("stage_duration")
        public long stageDuration;

        @C09CT("preload_type")
        public String preloadType = "";

        @C09CT("stage")
        public String stage = "";

        @C09CT("error_message")
        public String errorMsg = "";

        @C09CT("cache_key")
        public String cacheKey = "";

        @C09CT("component_preload_scene")
        public String componentPreloadScene = "";
    }

    public static void LIZIZ(EnumC1574730r55 enumC1574730r55, AbstractC1617510sC5 abstractC1617510sC5) {
        MiniDramaPreloadEvent miniDramaPreloadEvent = new MiniDramaPreloadEvent();
        miniDramaPreloadEvent.preloadType = enumC1574730r55.getValue();
        miniDramaPreloadEvent.stage = abstractC1617510sC5.LIZ();
        C1163504gr.LIZIZ.onEventV3("mini_drama_preload_action_event", new JSONObject(JsonParseUtils.LJ(miniDramaPreloadEvent)));
    }

    public static void LIZJ(EnumC1574730r55 enumC1574730r55, Function1 function1) {
        Map<String, MiniDramaPreloadEvent> map = LIZ;
        MiniDramaPreloadEvent miniDramaPreloadEvent = (MiniDramaPreloadEvent) ((LinkedHashMap) map).get(enumC1574730r55.getValue());
        if (miniDramaPreloadEvent == null) {
            return;
        }
        MiniDramaPreloadEvent miniDramaPreloadEvent2 = new MiniDramaPreloadEvent();
        miniDramaPreloadEvent2.preloadType = enumC1574730r55.getValue();
        miniDramaPreloadEvent2.stageDuration = SystemClock.elapsedRealtime() - miniDramaPreloadEvent.LIZ;
        if (function1 != null) {
            function1.invoke(miniDramaPreloadEvent2);
        }
        C1163504gr.LIZIZ.onEventV3("mini_drama_preload_action_event", new JSONObject(JsonParseUtils.LJ(miniDramaPreloadEvent2)));
        map.remove(enumC1574730r55.getValue());
    }

    public static void LIZ(String str, EnumC1574730r55 enumC1574730r55, AbstractC1617510sC5 abstractC1617510sC5, Function1 function1) {
        MiniDramaPreloadEvent miniDramaPreloadEvent;
        if (!(abstractC1617510sC5 instanceof C1574630r4v) && !(abstractC1617510sC5 instanceof C1574620r4u)) {
            if (abstractC1617510sC5 instanceof C1617550sC9) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) LIZ;
                Object miniDramaPreloadEvent2 = linkedHashMap.get(str);
                if (miniDramaPreloadEvent2 == null) {
                    miniDramaPreloadEvent2 = new MiniDramaPreloadEvent();
                    linkedHashMap.put(str, miniDramaPreloadEvent2);
                }
                miniDramaPreloadEvent = (MiniDramaPreloadEvent) miniDramaPreloadEvent2;
            } else {
                miniDramaPreloadEvent = (MiniDramaPreloadEvent) ((LinkedHashMap) LIZ).get(str);
            }
            if (miniDramaPreloadEvent == null) {
                return;
            }
        } else {
            miniDramaPreloadEvent = new MiniDramaPreloadEvent();
        }
        miniDramaPreloadEvent.cacheKey = str;
        miniDramaPreloadEvent.preloadType = enumC1574730r55.getValue();
        miniDramaPreloadEvent.stage = abstractC1617510sC5.LIZ();
        if (Intrinsics.LJFF(abstractC1617510sC5, C1617550sC9.LIZ)) {
            miniDramaPreloadEvent.LIZ = SystemClock.elapsedRealtime();
        } else if (!(abstractC1617510sC5 instanceof C1574630r4v) && !(abstractC1617510sC5 instanceof C1574620r4u)) {
            miniDramaPreloadEvent.stageDuration = SystemClock.elapsedRealtime() - miniDramaPreloadEvent.LIZ;
        }
        if (function1 != null) {
            function1.invoke(miniDramaPreloadEvent);
        }
        C1163504gr.LIZIZ.onEventV3("mini_drama_preload_action_event", new JSONObject(JsonParseUtils.LJ(miniDramaPreloadEvent)));
        if (Intrinsics.LJFF(abstractC1617510sC5, C1617520sC6.LIZ) || Intrinsics.LJFF(abstractC1617510sC5, C1617540sC8.LIZ)) {
            LIZ.remove(str);
        }
    }
}
