package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.vm;

import X.C01GW;
import X.C0JRE;
import X.C0JRW;
import X.C1554960qZC;
import X.C316840CbS;
import X.C452501pT;
import X.C492070JRl;
import X.C492120JRq;
import X.InterfaceC0148002o;
import X.InterfaceC1555100qZQ;
import X.InterfaceC665370Q7z;
import com.bytedance.android.livesdk.model.PollData;
import com.bytedance.android.livesdk.model.PollInfo;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import webcast.api.sub.EmotePollInfoResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class EmotePollDetailVM extends AssemViewModel<C316840CbS> {
    public InterfaceC665370Q7z LL;
    public C0JRE LLILLJJLI;
    public C0JRW LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new C492120JRq(this));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C316840CbS(0);
    }

    public final C0JRE wQ2() {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        if (this.LLILLJJLI == null) {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LL;
            C0JRE c0jre = null;
            if (interfaceC665370Q7z != null && (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", C0JRE.class, null)) != null) {
                c0jre = (C0JRE) interfaceC1555100qZQLIZIZ.getSource();
            }
            this.LLILLJJLI = c0jre;
        }
        return this.LLILLJJLI;
    }

    public final C492070JRl xQ2() {
        return (C492070JRl) this.LLILZ.getValue();
    }

    public final String vQ2() {
        EmotePollInfoResponse.Data data;
        PollInfo pollInfo;
        PollData pollData;
        C0JRE c0jreWQ2;
        EmotePollInfoResponse.Data data2;
        PollInfo pollInfo2;
        PollData pollData2;
        C0JRE c0jreWQ22 = wQ2();
        if ((c0jreWQ22 != null ? c0jreWQ22.LLJ : 0L) > 0 && ((c0jreWQ2 = wQ2()) == null || (data2 = c0jreWQ2.LLJJ) == null || (pollInfo2 = data2.pollInfo) == null || (pollData2 = pollInfo2.pollData) == null || pollData2.pollStatus != 2)) {
            return "ongoing";
        }
        C0JRE c0jreWQ23 = wQ2();
        Integer numValueOf = (c0jreWQ23 == null || (data = c0jreWQ23.LLJJ) == null || (pollInfo = data.pollInfo) == null || (pollData = pollInfo.pollData) == null) ? null : Integer.valueOf(pollData.endType);
        return (numValueOf == null || numValueOf.intValue() == 0) ? "poll_timeout" : numValueOf.intValue() == 1 ? "anchor_close" : numValueOf.intValue() == 2 ? "others" : numValueOf.intValue() == 3 ? "moderator_close" : "poll_timeout";
    }
}
