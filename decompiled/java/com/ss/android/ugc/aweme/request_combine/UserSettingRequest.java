package com.ss.android.ugc.aweme.request_combine;

import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C315690CZb;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799780VYy;
import android.content.Context;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class UserSettingRequest {
    public static final /* synthetic */ int LIZ = 0;

    public static final class IdleTask implements C0CCZ, InterfaceC799780VYy {
        public final PushSettings LL;

        @Override // X.InterfaceC799780VYy
        public final long LIZ() {
            return 1000L;
        }

        @Override // X.InterfaceC799780VYy
        public final /* synthetic */ void LJ(Long l) {
        }

        @Override // X.InterfaceC799780VYy
        public final void LJFF() {
        }

        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ List finalizedBy() {
            return null;
        }

        @Override // X.InterfaceC800080Va2
        public final String key() {
            return "RealUpdatePushSettingTask";
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

        @Override // X.InterfaceC799780VYy
        public final C0VU1 threadType() {
            return C0VU1.CPU;
        }

        @Override // X.C0CCZ
        public final EnumC799870VZh type() {
            return EnumC799870VZh.IDLE;
        }

        public IdleTask(PushSettings pushSettings) {
            this.LL = pushSettings;
        }

        @Override // X.InterfaceC308150C6b
        public final void run(Context context) {
            C315690CZb.LIZ(this.LL);
        }
    }
}
