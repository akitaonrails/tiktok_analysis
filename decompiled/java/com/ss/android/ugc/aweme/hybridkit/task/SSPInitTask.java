package com.ss.android.ugc.aweme.hybridkit.task;

import X.C0CCZ;
import X.C0VZ0;
import X.C1042900dFI;
import X.C1042980dFQ;
import X.C1046900dLk;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC1046890dLj;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lynx.hybrid.ssp.RecordingTopDomainRequestResult;
import java.util.List;
import kotlin.text.u;

/* JADX INFO: loaded from: classes17.dex */
public final class SSPInitTask implements C0CCZ {
    public static final SSPInitTask LL = new SSPInitTask();

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "SSPInitTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        InterfaceC1046890dLj interfaceC1046890dLj = new InterfaceC1046890dLj() { // from class: X.0dLl
            @Override // X.InterfaceC1046890dLj
            public final Object LIZ(Class cls, String str) {
                return C09S2.LIZJ(cls, str);
            }
        };
        InterfaceC1046890dLj interfaceC1046890dLj2 = C1042900dFI.LJ;
        if (interfaceC1046890dLj2 != null) {
            interfaceC1046890dLj = interfaceC1046890dLj2;
        }
        C1042900dFI.LJ = interfaceC1046890dLj;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        RecordingTopDomainRequestResult.RequestMeta requestMeta = C1042980dFQ.LIZ;
        RecordingTopDomainRequestResult.RequestMeta requestMeta2 = (RecordingTopDomainRequestResult.RequestMeta) settingsManagerLIZLLL.LJIIIIZZ("hybrid_recording_config", RecordingTopDomainRequestResult.RequestMeta.class, requestMeta);
        if (requestMeta2 != null) {
            requestMeta = requestMeta2;
        }
        if ((u.LJJIIJZLJL(requestMeta.url, "http://", false) || u.LJJIIJZLJL(requestMeta.url, "https://", false)) && requestMeta.version > 0) {
            C1042900dFI.LJI = requestMeta;
        }
        C1042900dFI.LIZIZ = new C1046900dLk();
    }
}
