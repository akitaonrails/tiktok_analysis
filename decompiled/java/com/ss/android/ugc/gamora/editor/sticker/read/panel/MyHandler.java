package com.ss.android.ugc.gamora.editor.sticker.read.panel;

import X.C11Y7;
import X.C1664590tQ1;
import X.C1C7U;
import X.C201955140j;
import X.C2188811AlT;
import android.app.Activity;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.audio.ITTSService;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes30.dex */
public final class MyHandler extends BPEAHandler {
    public final WeakReference<Activity> LL;
    public final WeakReference<C11Y7> LLILLJJLI;

    public MyHandler(C11Y7 c11y7) {
        this.LL = new WeakReference<>(C1664590tQ1.LJII(c11y7));
        this.LLILLJJLI = new WeakReference<>(c11y7);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1C7U.LIZ("MyHandler@46bd.handleMessage");
        Activity activity = this.LL.get();
        C11Y7 c11y7 = this.LLILLJJLI.get();
        if (activity != null && c11y7 != null && message.what == 1024) {
            String string = message.getData().getString("speakId");
            String string2 = message.getData().getString("content");
            C11Y7.LLLLLZL.getClass();
            String str = C11Y7.LLLLZI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handleMessage speaker:");
            sbLIZ.append(string);
            sbLIZ.append(",content:");
            sbLIZ.append(string2);
            C201955140j.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
            ITTSService iTTSServiceTtsService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).ttsService();
            if (iTTSServiceTtsService != null) {
                iTTSServiceTtsService.stopStreamReading();
            }
            c11y7.da();
            if (string != null && string2 != null) {
                c11y7.ma(string, string2);
            }
        }
        C1C7U.LIZIZ("MyHandler@46bd.handleMessage");
    }
}
