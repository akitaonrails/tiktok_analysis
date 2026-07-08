package com.ss.android.ugc.tiktok.security.settings;

import X.C09CT;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes33.dex */
public final class BostonRouterGatewayModel {
    public Map<String, BostonVirtualRouterModel> LIZ;

    @C09CT("dead_zone")
    public List<String> deadZone;

    @C09CT("dead_zone_action")
    public int deadZoneAction;

    @C09CT("enable")
    public boolean enable;

    @C09CT("hint_enable")
    public boolean hintEnable;

    @C09CT("report_enable")
    public boolean reportEnable;

    @C09CT("sensitive_jsb_callers")
    public List<BostonSensitiveCaller> sensitiveJsbCallers;

    @C09CT("sensitive_native_callers")
    public List<BostonSensitiveCaller> sensitiveNativeCallers;

    @C09CT("unsafe_zone_action")
    public int unsafeAction;

    @C09CT("unsafe_zone_test")
    public List<String> unsafeTestZone;

    @C09CT("unsafe_zone")
    public List<String> unsafeZone;

    @C09CT("virtual_routers")
    public List<BostonVirtualRouterModel> virtualRouters;

    public BostonRouterGatewayModel() {
        this(false, false, false, null, 0, null, 0, null, null, null, null, null, 4095, null);
    }

    public BostonRouterGatewayModel(boolean z, boolean z2, boolean z3, List<String> list, int i, List<String> list2, int i2, List<String> list3, List<BostonVirtualRouterModel> list4, Map<String, BostonVirtualRouterModel> map, List<BostonSensitiveCaller> list5, List<BostonSensitiveCaller> list6) {
        this.enable = z;
        this.reportEnable = z2;
        this.hintEnable = z3;
        this.deadZone = list;
        this.deadZoneAction = i;
        this.unsafeZone = list2;
        this.unsafeAction = i2;
        this.unsafeTestZone = list3;
        this.virtualRouters = list4;
        this.LIZ = map;
        this.sensitiveNativeCallers = list5;
        this.sensitiveJsbCallers = list6;
    }

    public BostonRouterGatewayModel(boolean z, boolean z2, boolean z3, List list, int i, List list2, int i2, List list3, List list4, Map map, List list5, List list6, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? false : z2, (i3 & 4) == 0 ? z3 : false, (i3 & 8) != 0 ? C13BV.INSTANCE : list, (i3 & 16) != 0 ? 1 : i, (i3 & 32) != 0 ? C13BV.INSTANCE : list2, (i3 & 64) == 0 ? i2 : 1, (i3 & 128) != 0 ? null : list3, (i3 & 256) != 0 ? null : list4, (i3 & 512) != 0 ? null : map, (i3 & 1024) != 0 ? null : list5, (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? list6 : null);
    }
}
