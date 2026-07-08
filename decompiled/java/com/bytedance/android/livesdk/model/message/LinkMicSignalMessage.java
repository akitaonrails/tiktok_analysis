package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;

/* JADX INFO: loaded from: classes.dex */
public class LinkMicSignalMessage extends AbstractC1136060ffY {
    public LinkMicSignal LL;

    @C09CT("content")
    public String signal;

    public final LinkMicSignal LIZ() {
        LinkMicSignal linkMicSignal = this.LL;
        if (linkMicSignal != null) {
            return linkMicSignal;
        }
        String str = this.signal;
        if (str != null) {
            try {
                LinkMicSignal linkMicSignal2 = (LinkMicSignal) new Gson().LJII(str.replaceAll("\\\\", ""), LinkMicSignal.class);
                this.LL = linkMicSignal2;
                return linkMicSignal2;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    public LinkMicSignalMessage() {
        this.type = C001A.LINK_MIC_SIGNAL;
    }
}
