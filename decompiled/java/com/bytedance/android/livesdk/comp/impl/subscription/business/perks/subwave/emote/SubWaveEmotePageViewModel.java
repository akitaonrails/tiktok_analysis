package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote;

import X.C01GW;
import X.C09YA;
import X.C0IJT;
import X.C0JTU;
import X.C0JUV;
import X.C0JVW;
import X.C1559260qg8;
import X.C2097908Jt;
import X.C452501pT;
import X.C474500IjA;
import X.C493010JVb;
import X.InterfaceC0148002o;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Pair;
import kotlin.jvm.internal.AwS127S1200000_11;

/* JADX INFO: loaded from: classes8.dex */
public final class SubWaveEmotePageViewModel extends AssemViewModel<C0JUV> {
    public final C09YA LL = new C09YA(this, new C493010JVb());
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C0JTU.class, (Class<Object>) null, (String) 13), true);
    public final C01GW LLILLL = C452501pT.LIZIZ(new C0JVW());

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0JUV(0);
    }

    public final C0JTU wQ2() {
        return (C0JTU) this.LLILLJJLI.getValue();
    }

    public final IHostSubscription.Params vQ2() {
        Pair<Integer, Integer> pair = getState().LLILLL;
        int iIntValue = pair.getFirst().intValue();
        int iIntValue2 = pair.getSecond().intValue();
        IHostSubscription.Params params = new IHostSubscription.Params();
        params.min_width = 255;
        params.min_height = 255;
        params.max_width = SpeechEngineDefines.TTS_WORK_MODE_BOTH;
        params.max_height = SpeechEngineDefines.TTS_WORK_MODE_BOTH;
        params.max_size = 20480000;
        params.max_count = iIntValue2 - iIntValue;
        params.emotesShowStyle = 0;
        String str = wQ2().LLILLL;
        if (str == null) {
            str = "";
        }
        params.logInfo = C2097908Jt.LIZJ(new Pair("show_entrance", str));
        return params;
    }

    public final void xQ2(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_sub_wave_emote_reward_click");
        c474500IjALIZ.LJJII(Long.valueOf(wQ2().LL), "anchor_id");
        c474500IjALIZ.LJJII(wQ2().LLILLL, "show_entrance");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LIZ();
    }

    public final void yQ2(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_sub_wave_emote_reward_submit");
        c474500IjALIZ.LJJII(Long.valueOf(wQ2().LL), "anchor_id");
        c474500IjALIZ.LJJII(wQ2().LLILLL, "show_entrance");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LIZ();
    }

    public final void zQ2(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_sub_wave_emote_reward_success");
        c474500IjALIZ.LJJII(Long.valueOf(wQ2().LL), "anchor_id");
        c474500IjALIZ.LJJII(wQ2().LLILLL, "show_entrance");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LIZ();
    }
}
