package com.ss.android.ugc.aweme.legoImp.task;

import X.C09CT;
import X.C0CCZ;
import X.C0VZ0;
import X.C786410Ut5;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import Y.ARunnableS103S0100000_3;
import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class PublicTestSupportTask implements C0CCZ {

    public static class GeckoPublishTestData {

        @C09CT("publish_support_test")
        public boolean publishTest;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PublicTestSupportTask";
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
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C786410Ut5.LJLIIL(1000L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS103S0100000_3(this, 39));
    }
}
