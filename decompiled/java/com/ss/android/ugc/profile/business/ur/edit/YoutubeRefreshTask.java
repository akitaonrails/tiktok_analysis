package com.ss.android.ugc.profile.business.ur.edit;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C09UZ;
import X.C0CCZ;
import X.C0CLW;
import X.C0COB;
import X.C0VZ0;
import X.C0XQ7;
import X.C20684815ws;
import X.C2344009Gk;
import X.C316660CbA;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC2194071Atx;
import Y.ARunnableS88S0200000_19;
import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.edit.api.YoutubeApi;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class YoutubeRefreshTask implements C0CCZ, InterfaceC2194071Atx, WeakHandler.IHandler {
    public Context LL;
    public WeakHandler LLILLJJLI;
    public int LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(170));

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "YoutubeRefreshTask";
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
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC2194071Atx
    public final void LIZ(IESSettingsProxy iESSettingsProxy) {
        WeakHandler weakHandler = this.LLILLJJLI;
        Context context = null;
        if (weakHandler != null) {
            weakHandler.removeCallbacksAndMessages(null);
        }
        Context context2 = this.LL;
        if (context2 != null) {
            context = context2;
        }
        run(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.ss.android.ugc.aweme.profile.model.User r17) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.edit.YoutubeRefreshTask.LJ(com.ss.android.ugc.aweme.profile.model.User):void");
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (message != null && message.what == 1) {
            WeakHandler weakHandler = this.LLILLJJLI;
            if (weakHandler != null) {
                weakHandler.removeMessages(1);
            }
            int i = this.LLILLL + 1;
            this.LLILLL = i;
            if (i > 3) {
                SettingsManagerProxy.inst().removeSettingsWatcher(this);
                WeakHandler weakHandler2 = this.LLILLJJLI;
                if (weakHandler2 != null) {
                    weakHandler2.removeCallbacksAndMessages(null);
                    return;
                }
                return;
            }
            WeakHandler weakHandler3 = this.LLILLJJLI;
            if (weakHandler3 == null) {
                return;
            }
            C786410Ut5.LJLJJI(1, 1000L, weakHandler3);
        }
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        boolean z;
        this.LL = context;
        C0COB c0cobLIZ = C0COB.LIZ();
        c0cobLIZ.getClass();
        synchronized (C0COB.class) {
            try {
                z = c0cobLIZ.LIZ;
            } finally {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (!z) {
            SettingsManagerProxy.inst().registerSettingsWatcher(this, true);
            if (this.LLILLJJLI == null) {
                HandlerThread handlerThread = new HandlerThread("youtube-refresh-timer");
                handlerThread.start();
                this.LLILLJJLI = new WeakHandler(C786410Ut5.W2(handlerThread), this);
            }
            if (this.LLILLJJLI.hasMessages(1)) {
                this.LLILLJJLI.removeMessages(1);
            }
            C786410Ut5.LJLILLLLZI(this.LLILLJJLI, 1);
            return;
        }
        try {
            Integer thirdPartyDataRefresh = C0CLW.LIZIZ.LIZ.getThirdPartyDataRefresh();
            if (thirdPartyDataRefresh != null) {
                if (thirdPartyDataRefresh.intValue() == 1) {
                    User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
                    long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                    long youTubeLastRefreshTime = curUser.getYouTubeLastRefreshTime();
                    if (youTubeLastRefreshTime > 0 && jCurrentTimeMillis - youTubeLastRefreshTime > TimeUnit.DAYS.toSeconds(30L)) {
                        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                            C09UZ.LIZIZ(new ARunnableS88S0200000_19(this, curUser, 26), "YoutubeRefreshTask");
                        } else {
                            LJ(curUser);
                        }
                    }
                }
            }
        } catch (C316660CbA e) {
        }
    }

    public static void LJFF(YoutubeRefreshTask youtubeRefreshTask, boolean z, Boolean bool, Exception exc, Integer num, YoutubeApi.YouTubeResponse youTubeResponse, int i) {
        Integer num2 = null;
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            exc = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            youTubeResponse = null;
        }
        youtubeRefreshTask.getClass();
        YoutubeApi youtubeApi = YoutubeApi.LIZ;
        Context context = youtubeRefreshTask.LL;
        if (context == null) {
            context = null;
        }
        youtubeApi.getClass();
        String strLIZ = YoutubeApi.LIZ(context, exc, num, youTubeResponse);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("platform", "youtube");
        c2344009Gk.LJ(Boolean.valueOf(z), "is_success");
        c2344009Gk.LIZJ(Intrinsics.LJFF(bool, Boolean.TRUE) ? 1 : 0, "auto_unlink");
        if (youTubeResponse != null) {
            num2 = youTubeResponse.statusCode;
        }
        c2344009Gk.LJIIIIZZ("error_code", String.valueOf(num2));
        c2344009Gk.LJIIIIZZ("error_desc", strLIZ);
        C20684815ws.LJIILLIIL("social_profile_check", c2344009Gk.LIZ);
    }
}
