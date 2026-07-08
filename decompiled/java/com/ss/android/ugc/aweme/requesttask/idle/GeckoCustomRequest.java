package com.ss.android.ugc.aweme.requesttask.idle;

import X.C0CCZ;
import X.C0VZ0;
import X.C14EU;
import X.C2411109cb;
import X.C786410Ut5;
import X.C797990VSb;
import X.C799570VYd;
import X.C844470XAv;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.RunnableC1057890ddT;
import X.RunnableC1057900ddU;
import X.RunnableC2188351Akj;
import X.RunnableC2188361Akk;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.newuser.WeakNetCountryGeckoNormalOptSettings;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoCustomRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
public class GeckoCustomRequest implements C0CCZ {
    public Map<String, List<CheckRequestBodyModel.TargetChannel>> LLILLJJLI;
    public Map<String, List<CheckRequestBodyModel.TargetChannel>> LLILZ;
    public C2411109cb LLJJI;
    public final List<String> LL = Collections.singletonList("high_priority");
    public final List<String> LLILLL = Collections.singletonList("normal");
    public long LLILZIL = 0;
    public final long LLILZLL = 1;
    public final long LLIZ = 14;
    public boolean LLIZLLLIL = false;
    public boolean LLJ = false;
    public boolean LLJI = false;
    public boolean LLJIJIL = false;
    public final RunnableC2188351Akj LLJILJIL = new Runnable() { // from class: X.1Akj
        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("GeckoCustomRequest@b294.<field>$1");
            try {
                C797990VSb.LIZ.LJIILLIIL("occasion_high_priority");
                this.LL.LLIZLLLIL = true;
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("GeckoCustomRequest@b294.<field>$1");
        }
    };
    public final RunnableC1057890ddT LLJILJILJ = new Runnable() { // from class: X.0ddT
        public final void LIZ() {
            GeckoCustomRequest geckoCustomRequest = this.LL;
            if (geckoCustomRequest.LLILLJJLI == null) {
                geckoCustomRequest.LLILLJJLI = new HashMap();
                ArrayList arrayList = new ArrayList();
                String[] strArr = C23102093k.LIZ.whiteList;
                if (strArr != null && strArr.length > 0) {
                    for (String str : strArr) {
                        if (!TextUtils.isEmpty(str)) {
                            CheckRequestBodyModel.TargetChannel targetChannel = new CheckRequestBodyModel.TargetChannel();
                            targetChannel.channelName = str;
                            arrayList.add(targetChannel);
                        }
                    }
                }
                if (arrayList.size() > 0) {
                    this.LL.LLILLJJLI.put(C1553670qX7.LIZ(), arrayList);
                    C1551950qUL c1551950qULLJIIJJI = C1552050qUV.LJIIJJI();
                    if (c1551950qULLJIIJJI != null) {
                        c1551950qULLJIIJJI.LIZIZ("high_priority", null, this.LL.LLILLJJLI, null);
                    }
                }
            }
            this.LL.LLIZLLLIL = true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("GeckoCustomRequest@b294.<field>$2");
            try {
                LIZ();
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("GeckoCustomRequest@b294.<field>$2");
        }
    };
    public final RunnableC2188361Akk LLJILLL = new Runnable() { // from class: X.1Akk
        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("GeckoCustomRequest@b294.<field>$3");
            try {
                C797990VSb.LIZ.LJIILLIIL("occasion_normal");
                this.LL.LLJ = true;
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("GeckoCustomRequest@b294.<field>$3");
        }
    };
    public final RunnableC1057900ddU LLJJ = new Runnable() { // from class: X.0ddU
        public final void LIZ() {
            GeckoCustomRequest geckoCustomRequest = this.LL;
            if (geckoCustomRequest.LLILZ == null) {
                geckoCustomRequest.LLILZ = new HashMap();
                ArrayList arrayList = new ArrayList();
                String[] strArr = WeakNetCountryGeckoNormalOptSettings.LIZ().whiteList;
                if (strArr != null && strArr.length > 0) {
                    for (String str : strArr) {
                        if (!TextUtils.isEmpty(str)) {
                            CheckRequestBodyModel.TargetChannel targetChannel = new CheckRequestBodyModel.TargetChannel();
                            targetChannel.channelName = str;
                            arrayList.add(targetChannel);
                        }
                    }
                }
                if (arrayList.size() > 0) {
                    this.LL.LLILZ.put(C1553670qX7.LIZ(), arrayList);
                    C1551950qUL c1551950qULLJIILL = C1552050qUV.LJIILL();
                    if (c1551950qULLJIILL != null) {
                        c1551950qULLJIILL.LIZIZ("normal", null, this.LL.LLILZ, null);
                    }
                }
            }
            this.LL.LLJ = true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("GeckoCustomRequest@b294.<field>$4");
            try {
                LIZ();
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("GeckoCustomRequest@b294.<field>$4");
        }
    };

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "GeckoCustomRequest";
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

    public final long LIZ() {
        long j = this.LLILZIL;
        if (j != 0) {
            return j;
        }
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        try {
            long j2 = C786410Ut5.Y3(contextLIZ.getPackageManager(), contextLIZ.getPackageName(), 0).firstInstallTime;
            this.LLILZIL = j2;
            return j2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return this.LLILZIL;
        }
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    public final void LJ(C2411109cb c2411109cb) {
        int i = c2411109cb.LIZ;
        if (i == 0) {
            return;
        }
        C2411109cb c2411109cb2 = this.LLJJI;
        if (c2411109cb2 != null && c2411109cb2.LIZ == i) {
            return;
        }
        this.LLJJI = c2411109cb;
        if (this.LLJI) {
            if (i == 2) {
                C786410Ut5.LJLIIL(3000L, C799570VYd.LIZJ(), this.LLJILJIL);
                this.LLIZLLLIL = false;
            } else if (i == 1) {
                if (!this.LLIZLLLIL) {
                    C799570VYd.LIZJ().removeCallbacks(this.LLJILJIL);
                }
                C797990VSb.LIZ.LIZ("occasion_high_priority");
            }
        }
        if (this.LLJIJIL) {
            int i2 = c2411109cb.LIZ;
            if (i2 == 2) {
                C786410Ut5.LJLIIL(60000L, C799570VYd.LIZJ(), this.LLJILLL);
                this.LLJ = false;
            } else {
                if (i2 != 1) {
                    return;
                }
                if (!this.LLJ) {
                    C799570VYd.LIZJ().removeCallbacks(this.LLJILLL);
                }
                C797990VSb.LIZ.LIZ("occasion_normal");
            }
        }
    }

    @C14EU
    public void onEvent(C2411109cb c2411109cb) {
        LJ(c2411109cb);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC308150C6b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run(android.content.Context r12) {
        /*
            Method dump skipped, instruction units count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.requesttask.idle.GeckoCustomRequest.run(android.content.Context):void");
    }
}
