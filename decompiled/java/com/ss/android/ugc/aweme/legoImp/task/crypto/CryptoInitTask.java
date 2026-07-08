package com.ss.android.ugc.aweme.legoImp.task.crypto;

import X.C0CCZ;
import X.C0VZ0;
import X.C786410Ut5;
import X.C799570VYd;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import Y.AObjectS379S0100000_3;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.pns.crypto2.CryptoInitializer;
import com.bytedance.pns.crypto2.fallback.DeFallbackCrypto;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.legoImp.task.region.RegionInitTask;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class CryptoInitTask implements C0CCZ {
    public static final CryptoInitTask LL = new CryptoInitTask();

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "CryptoInitTask";
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
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        RegionInitTask.LL.run(context);
        C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new Runnable() { // from class: X.09jK
            public static void LIZ() {
                C2452709jJ.LIZ.getClass();
                if (((Boolean) C2453509jR.LIZ.getValue()).booleanValue()) {
                    ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIILL(new InterfaceC586170Myt() { // from class: X.09jW
                        @Override // X.InterfaceC586170Myt
                        public final void onAccountResult(int i, boolean z, int i2, User user) {
                            String uid = null;
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i == 4) {
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("onAccountResult: ");
                                            sbLIZ.append(z);
                                            sbLIZ.append(" login end ");
                                            if (user != null) {
                                                uid = user.getUid();
                                            }
                                            sbLIZ.append(uid);
                                            C2188811AlT.LIZIZ(sbLIZ);
                                            return;
                                        }
                                        return;
                                    }
                                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2453809jU(z, user, null), 3);
                                    return;
                                }
                                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2453909jV(z, user, null), 3);
                                return;
                            }
                            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2453709jT(z, user, null), 3);
                        }
                    });
                    boolean z = C2452909jL.LIZ().usingGlobalRsaKeyForFallback;
                    C2452909jL.LIZ();
                    int i = CryptoInitializer.LJFF;
                    DeFallbackCrypto deFallbackCrypto = DeFallbackCrypto.LIZ;
                    AObjectS379S0100000_3 aObjectS379S0100000_3 = new AObjectS379S0100000_3(7);
                    AObjectS379S0100000_3 aObjectS379S0100000_32 = new AObjectS379S0100000_3(8);
                    deFallbackCrypto.getClass();
                    DeFallbackCrypto.LIZJ = aObjectS379S0100000_3;
                    DeFallbackCrypto.LIZLLL = aObjectS379S0100000_32;
                    DeFallbackCrypto.LIZIZ.set(Boolean.valueOf(z));
                }
                if (!Intrinsics.LJFF(C2452709jJ.LIZ(), CardStruct.IStatusCode.DEFAULT)) {
                    C0S78.LIZJ(new C2453309jP(), true);
                    return;
                }
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("crypto_negotiation_config", false)) {
                    C2452709jJ.LJ();
                } else {
                    C0S78.LIZJ(AFwS189S0000000_3.get$arr$(1297), true);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CryptoInitTask@10a.runInner$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("CryptoInitTask@10a.runInner$1");
            }
        });
    }
}
