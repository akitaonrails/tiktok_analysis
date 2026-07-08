package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.suggestemote;

import X.C01GW;
import X.C09YA;
import X.C0JQ3;
import X.C0JS9;
import X.C0JVX;
import X.C1559260qg8;
import X.C2097908Jt;
import X.C452501pT;
import X.C492830JUj;
import X.InterfaceC0148002o;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Pair;
import kotlin.jvm.internal.AwS127S1200000_11;

/* JADX INFO: loaded from: classes8.dex */
public final class SuggestEmotePageViewModel extends AssemViewModel<C492830JUj> {
    public final C09YA LL = new C09YA(this, new C0JVX());
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C0JQ3.class, (Class<Object>) null, (String) 13), true);
    public final C01GW LLILLL = C452501pT.LIZIZ(new C0JS9());

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C492830JUj(0);
    }

    public final C0JQ3 wQ2() {
        return (C0JQ3) this.LLILLJJLI.getValue();
    }

    public final IHostSubscription.Params vQ2() {
        Pair<Integer, Integer> pair = getState().LLILLJJLI;
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
        String str = wQ2().LLILLJJLI;
        if (str == null) {
            str = "";
        }
        params.logInfo = C2097908Jt.LIZJ(new Pair("show_entrance", str));
        return params;
    }
}
