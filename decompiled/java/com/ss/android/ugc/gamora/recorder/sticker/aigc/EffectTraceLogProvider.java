package com.ss.android.ugc.gamora.recorder.sticker.aigc;

import X.C0C64;
import X.C1697810uHb;
import X.C806190Vjt;
import X.C806200Vju;
import X.C806210Vjv;
import X.InterfaceC806180Vjs;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.trace.api.TraceLogProvider;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class EffectTraceLogProvider implements TraceLogProvider {
    public final String LIZ = Source.EFFECT_AIGC.getSource();

    @Override // com.ss.android.ugc.aweme.trace.api.TraceLogProvider
    public final C806210Vjv LIZIZ() {
        return new C806210Vjv(C1697810uHb.LJIIJJI(new C806190Vjt(new InterfaceC806180Vjs() { // from class: X.0Vk0
            @Override // X.InterfaceC806180Vjs
            public final boolean LIZ(C806050Vjf c806050Vjf) {
                return C0C64.LJIILLIIL().LJIIIZ(31744, "studio_trace_default_allowlist", true, false);
            }
        }), new C806200Vju(C1697810uHb.LJIIJJI(new C806190Vjt(new InterfaceC806180Vjs() { // from class: X.0Vjz
            @Override // X.InterfaceC806180Vjs
            public final boolean LIZ(C806050Vjf c806050Vjf) {
                return C0C64.LJIILLIIL().LJIIIZ(31744, "studio_trace_default_sample", true, false);
            }
        }), new C806190Vjt(new InterfaceC806180Vjs() { // from class: X.0Vjy
            @Override // X.InterfaceC806180Vjs
            public final boolean LIZ(C806050Vjf c806050Vjf) {
                if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_trace_effect_aigc_downgrade", true, false)) {
                    return true;
                }
                return Intrinsics.LJFF(c806050Vjf.LJ, "ai_task_end");
            }
        })))));
    }

    @Override // com.ss.android.ugc.aweme.trace.api.TraceLogProvider
    public final boolean LIZ() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "studio_trace_effect_aigc_log_strategy_provider", true, false);
    }

    @Override // com.ss.android.ugc.aweme.trace.api.TraceLogProvider
    public final String getBusinessId() {
        return this.LIZ;
    }
}
