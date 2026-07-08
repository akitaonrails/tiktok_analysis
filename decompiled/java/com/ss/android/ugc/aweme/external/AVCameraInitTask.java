package com.ss.android.ugc.aweme.external;

import X.C09X9;
import X.C0AHT;
import X.C0BWC;
import X.C0C64;
import X.C0CCZ;
import X.C0CHQ;
import X.C0PEM;
import X.C0VU1;
import X.C0VZ0;
import X.C104100aN;
import X.C11NJ;
import X.C1449450np1;
import X.C1515120pWw;
import X.C1653040t7O;
import X.C1BCF;
import X.C20163113uv;
import X.C201955140j;
import X.C201967140v;
import X.C2296808zG;
import X.C23250099c;
import X.C2428309fN;
import X.C497730JfX;
import X.C499180Jhs;
import X.C578030Mll;
import X.C860470XpF;
import X.C860540XpM;
import X.C860570XpP;
import X.C860580XpQ;
import X.C861870XrV;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.network.ToolsInterceptor;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS298S0000000_14;

/* JADX INFO: loaded from: classes31.dex */
@C1BCF(distinctId = 100, scene = "creative_tool", taskType = "preload")
public final class AVCameraInitTask implements C0CCZ, InterfaceC799590VYf {
    public static final C578030Mll LL = new C578030Mll();
    public static volatile boolean LLILLJJLI;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "AVCameraInitTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
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

    @Override // X.InterfaceC799590VYf
    public final int priority() {
        return ((Boolean) C0AHT.LIZ.getValue()).booleanValue() ? 2 : 1;
    }

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return (C104100aN.LIZ().isNewUser() && C104100aN.LIZ().LJJIJ(AFwS189S0000000_3.get$arr$(1766))) ? false : true;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return C0C64.LJIILLIIL().LJIIIIZZ(31744, 2, "av_camera_task_downgrade", true, false) ? EnumC799870VZh.APP_BACKGROUND : C104100aN.LIZ().LJJIJ(new C2428309fN()) ? EnumC799870VZh.APP_BACKGROUND : EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.IO;
    }

    /* JADX INFO: loaded from: classes9.dex */
    public static final class PostedDraftConvertToNormal implements C0CCZ {
        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ List finalizedBy() {
            return null;
        }

        @Override // X.InterfaceC800080Va2
        public final String key() {
            return "AVCameraInitTask$PostedDraftConvertToNormal";
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
            return EnumC799870VZh.SPARSE;
        }

        @Override // X.InterfaceC308150C6b
        public final void run(Context context) {
            Keva keva = C499180Jhs.LIZJ;
            boolean z = keva.getBoolean("posted_draft_experiment_last_status", false);
            if (!C09X9.LIZ() && z) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C497730JfX(null), 3);
            }
            keva.storeBoolean("posted_draft_experiment_last_status", C09X9.LIZ());
        }
    }

    /* JADX INFO: loaded from: classes26.dex */
    public static final class InitCBClickTrack implements C0CCZ {
        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ List finalizedBy() {
            return null;
        }

        @Override // X.InterfaceC800080Va2
        public final String key() {
            return "AVCameraInitTask$InitCBClickTrack";
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
            C11NJ c11nj = C1653040t7O.LIZ;
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class InitToolsActivityListener implements C0CCZ {
        @Override // X.InterfaceC800080Va2
        public final /* synthetic */ List finalizedBy() {
            return null;
        }

        @Override // X.InterfaceC800080Va2
        public final String key() {
            return "AVCameraInitTask$InitToolsActivityListener";
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
            C860570XpP c860570XpP = C860540XpM.LIZ;
            if (!C861870XrV.LIZ()) {
                if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_force_always_enable_tools_cpu_data_service", true, false)) {
                    C0CHQ.LIZ().LJIIL().listenToCurrentPage(AFwS298S0000000_14.get$arr$(16));
                }
            } else {
                if (C0BWC.LIZ()) {
                    C860580XpQ c860580XpQ = C860580XpQ.LIZIZ;
                }
                C0CHQ.LIZ().LJIIL().listenToCurrentPage(AFwS298S0000000_14.get$arr$(15));
            }
            if (C860470XpF.LIZIZ()) {
                C0CHQ.LIZ().LJIIL().listenToCurrentPage(AFwS298S0000000_14.get$arr$(17));
            }
            if (C20163113uv.LIZ().enable) {
                C1515120pWw.LIZIZ(new ToolsInterceptor());
            }
        }
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C201955140j.LIZLLL(C201967140v.LIZIZ, "PreloadVESo", "execute AVCameraInitTaskOld");
        C1449450np1.LIZ.LIZ(SystemClock.uptimeMillis(), "camera_init_task_old_start");
        LL.LIZ(context);
    }
}
