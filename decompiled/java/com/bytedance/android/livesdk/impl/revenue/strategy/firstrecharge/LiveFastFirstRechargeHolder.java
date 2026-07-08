package com.bytedance.android.livesdk.impl.revenue.strategy.firstrecharge;

import X.C09JN;
import X.C0IPN;
import X.C1123200fKo;
import X.C1143680frq;
import X.C1148670fzt;
import X.C11NJ;
import X.InterfaceC1106030et7;
import X.InterfaceC1134150fcT;
import Y.AfS186S0100000_17;
import com.bytedance.android.live.wallet.IWalletCenter;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.livesdk.api.revenue.strategy.firstrecharge.ILiveFastFirstRechargeHolder;
import com.bytedance.android.livesdk.impl.revenue.strategy.firstrecharge.LiveFastFirstRechargeHolder;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastPictureMemOpt;
import com.bytedance.android.livesdk.livesetting.wallet.CanRechargeSetting;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveFastFirstRechargeHolder implements ILiveFastFirstRechargeHolder {
    public static final LiveFastFirstRechargeHolder LL = new LiveFastFirstRechargeHolder();
    public static Long LLILLJJLI;
    public static Long LLILLL;
    public static Long LLILZ;
    public static Boolean LLILZIL;
    public static InterfaceC1134150fcT LLILZLL;
    public static C11NJ LLIZ;
    public static boolean LLIZLLLIL;
    public static boolean LLJ;

    @Override // com.bytedance.android.livesdk.api.revenue.strategy.firstrecharge.ILiveFastFirstRechargeHolder
    public final void CU0() {
        LLILZLL = null;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.strategy.firstrecharge.ILiveFastFirstRechargeHolder
    public final void Eh1() {
        LLILZLL = null;
        LLILZIL = null;
        LLILLJJLI = null;
        LLILLL = null;
        LLILZ = null;
        C11NJ c11nj = LLIZ;
        if (c11nj != null) {
            c11nj.dispose();
        }
        C11NJ c11nj2 = LLIZ;
        if (c11nj2 != null) {
            c11nj2.LJ();
        }
        LLIZ = null;
        LLIZLLLIL = false;
        LLJ = false;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.strategy.firstrecharge.ILiveFastFirstRechargeHolder
    public final boolean Bq2() {
        if (!CanRechargeSetting.INSTANCE.getValue()) {
            return false;
        }
        if (!LiveBroadcastPictureMemOpt.forbidPreloadInvalidGecko()) {
            C1143680frq.LJJII(C0IPN.LIZ("tiktok_live_watch_resource", "tiktok_live_revenue_demand_1"), "ttlive_welcome_pack_refresh.webp");
        }
        C1143680frq.LJJII(C0IPN.LIZ("tiktok_live_watch_resource", "tiktok_live_revenue_normal_1"), "ttlive_fast_welcome_pack_icon.png");
        return true;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.strategy.firstrecharge.ILiveFastFirstRechargeHolder
    public final void RK0() {
        if (LLIZLLLIL) {
            return;
        }
        LLIZLLLIL = true;
        LLIZ = new C11NJ();
        IWalletCenter iWalletCenterWalletCenter = C1148670fzt.LIZ().walletCenter();
        C11NJ c11nj = LLIZ;
        if (c11nj != null) {
            c11nj.LIZ(iWalletCenterWalletCenter.l22().LJJLJLI(new AfS186S0100000_17(iWalletCenterWalletCenter, 56)));
        }
        C11NJ c11nj2 = LLIZ;
        if (c11nj2 != null) {
            c11nj2.LIZ(iWalletCenterWalletCenter.EU().LJJLJLI(new C09JN() { // from class: X.0fcS
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("LiveFastFirstRechargeHolder@b81f.observeBalanceAndCoinStatus$2");
                    LiveFastFirstRechargeHolder.LLILLJJLI = (Long) obj;
                    LiveFastFirstRechargeHolder liveFastFirstRechargeHolder = LiveFastFirstRechargeHolder.LL;
                    Boolean bool = LiveFastFirstRechargeHolder.LLILZIL;
                    Long l = LiveFastFirstRechargeHolder.LLILLL;
                    Long l2 = LiveFastFirstRechargeHolder.LLILLJJLI;
                    Long l3 = LiveFastFirstRechargeHolder.LLILZ;
                    liveFastFirstRechargeHolder.getClass();
                    LiveFastFirstRechargeHolder.LIZ(bool, l, l2, l3);
                    C1C7U.LIZIZ("LiveFastFirstRechargeHolder@b81f.observeBalanceAndCoinStatus$2");
                }
            }));
        }
    }

    @Override // com.bytedance.android.livesdk.api.revenue.strategy.firstrecharge.ILiveFastFirstRechargeHolder
    public final boolean Ev1() {
        WalletStruct walletStructTF1;
        IWalletCenter iWalletCenterWalletCenter = C1148670fzt.LIZ().walletCenter();
        return (iWalletCenterWalletCenter == null || (walletStructTF1 = iWalletCenterWalletCenter.TF1()) == null || walletStructTF1.revenue == null || LLJ) ? false : true;
    }

    @Override // com.bytedance.android.livesdk.api.revenue.strategy.firstrecharge.ILiveFastFirstRechargeHolder
    public final void GE1(C1123200fKo c1123200fKo) {
        LLILZLL = c1123200fKo;
        if (!Intrinsics.LJFF(InterfaceC1106030et7.d7.LIZ(), Boolean.TRUE)) {
            InterfaceC1134150fcT interfaceC1134150fcT = LLILZLL;
            if (interfaceC1134150fcT != null) {
                interfaceC1134150fcT.LIZ(false);
                return;
            }
            return;
        }
        InterfaceC1134150fcT interfaceC1134150fcT2 = LLILZLL;
        if (interfaceC1134150fcT2 == null) {
            return;
        }
        interfaceC1134150fcT2.LIZ(true);
    }

    public static void LIZ(Boolean bool, Long l, Long l2, Long l3) {
        boolean z;
        if (LLILZIL != null && LLILLL != null && LLILLJJLI != null && LLILZ != null) {
            if (Intrinsics.LJFF(bool, Boolean.TRUE) && l != null && l.longValue() == 0 && l2 != null && l2.longValue() == 0 && l3 != null && l3.longValue() == 0) {
                z = true;
            } else {
                z = false;
            }
            InterfaceC1106030et7.d7.LIZJ(Boolean.valueOf(z));
            InterfaceC1134150fcT interfaceC1134150fcT = LLILZLL;
            if (interfaceC1134150fcT != null) {
                interfaceC1134150fcT.LIZ(z);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d1  */
    @Override // com.bytedance.android.livesdk.api.revenue.strategy.firstrecharge.ILiveFastFirstRechargeHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Sb1(com.bytedance.ies.sdk.datachannel.DataChannel r12, java.lang.String r13, java.lang.String r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.strategy.firstrecharge.LiveFastFirstRechargeHolder.Sb1(com.bytedance.ies.sdk.datachannel.DataChannel, java.lang.String, java.lang.String, boolean):void");
    }
}
