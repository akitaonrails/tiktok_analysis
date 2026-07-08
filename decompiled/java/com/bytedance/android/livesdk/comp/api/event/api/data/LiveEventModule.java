package com.bytedance.android.livesdk.comp.api.event.api.data;

import X.C09CT;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveEventModule {

    @C09CT("business_type")
    public final List<Integer> businessType;

    @C09CT("desc")
    public final String desc;

    @C09CT("duration")
    public final long duration;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("is_default_title")
    public final boolean isDefaultTitle;

    @C09CT("is_paid_event")
    public boolean isPaidEvent;

    @C09CT("periodic_settings")
    public String periodicSettings;

    @C09CT("periodic_shows")
    public String periodicTitle;

    @C09CT("start_time")
    public final long startTime;

    @C09CT("has_subscribed")
    public boolean subscribed;

    @C09CT("title")
    public final String title;

    public LiveEventModule() {
        this(null, 0L, null, null, false, false, false, null, 0L, false, false, null, null, 8191, null);
    }

    public final String LIZ() {
        return this.isPaidEvent ? "paid" : LIZIZ() ? "free_periodic" : "free";
    }

    public final boolean LIZIZ() {
        String str = this.periodicSettings;
        return !(str == null || str.length() == 0);
    }

    public LiveEventModule(String str, long j, String str2, List<Integer> list, boolean z, boolean z2, boolean z3, String str3, long j2, boolean z4, boolean z5, String str4, String str5) {
        this.id = str;
        this.startTime = j;
        this.title = str2;
        this.businessType = list;
        this.subscribed = z3;
        this.desc = str3;
        this.duration = j2;
        this.isDefaultTitle = z4;
        this.isPaidEvent = z5;
        this.periodicSettings = str4;
        this.periodicTitle = str5;
    }

    public LiveEventModule(String str, long j, String str2, List list, boolean z, boolean z2, boolean z3, String str3, long j2, boolean z4, boolean z5, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) == 0 ? str2 : "", (i & 8) != 0 ? C13BV.INSTANCE : list, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? null : str3, (i & 256) == 0 ? j2 : 0L, (i & 512) != 0 ? false : z4, (i & 1024) == 0 ? z5 : false, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str4, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? str5 : null);
    }
}
