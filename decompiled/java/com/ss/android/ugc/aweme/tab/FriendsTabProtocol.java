package com.ss.android.ugc.aweme.tab;

import X.AbstractC1583860rJo;
import X.C01GW;
import X.C08TN;
import X.C0BLH;
import X.C1388190mED;
import X.C14EU;
import X.C1583370rJ1;
import X.C1584010rK3;
import X.C1584190rKL;
import X.C1584420rKi;
import X.C1585030rLh;
import X.C1587170rP9;
import X.C1592290rXP;
import X.C1593140rYm;
import X.C1595430rcT;
import X.C452501pT;
import X.EnumC1583960rJy;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.ui.FriendsTabContainerFragment;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AwS568S0100000_24;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsTabProtocol extends BottomTabProtocol {
    public Context LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1200));
    public volatile boolean LLILZIL;
    public final C1592290rXP LLILZLL;
    public final Class<? extends Fragment> LLIZ;
    public final String LLIZLLLIL;
    public final EnumC1583960rJy LLJ;
    public final String LLJI;
    public final C1583370rJ1 LLJIJIL;

    /* JADX WARN: Type inference failed for: r1v13, types: [X.0rJ1] */
    public FriendsTabProtocol() {
        C1592290rXP c1592290rXP;
        boolean zLJIIL = C1585030rLh.LJIIL();
        Integer numValueOf = Integer.valueOf(R.id.jqp);
        Integer numValueOf2 = Integer.valueOf(R.id.nw6);
        if (zLJIIL) {
            c1592290rXP = new C1592290rXP(new C1593140rYm(R.raw.icon_tab_bottom_friends_fill, R.attr.a1h, false, 12), new C1593140rYm(R.raw.icon_tab_bottom_friends_fill, R.attr.a1h, false, 12), new C1593140rYm(R.raw.icon_tab_bottom_friends, R.attr.a1k, false, 12), new C1593140rYm(R.raw.icon_tab_bottom_friends, R.attr.a1k, false, 12), numValueOf2, numValueOf);
        } else {
            int i = C1584010rK3.LIZ[C1584190rKL.LIZ().ordinal()];
            if (i == 1) {
                c1592290rXP = new C1592290rXP(new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_friends_fill_light, R.attr.a1h, true, 4), new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_friends_fill_dark, R.attr.a1h, true, 4), new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_friends_light, R.attr.a1k, true, 4), new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_friends_dark, R.attr.a1k, true, 4), numValueOf2, numValueOf);
            } else if (i != 2) {
                c1592290rXP = new C1592290rXP(new C1593140rYm(R.drawable.bv8, R.attr.a1h, false, 12), new C1593140rYm(R.drawable.bv7, R.attr.ee, false, 12), new C1593140rYm(R.drawable.bv9, R.attr.a1k, false, 12), new C1593140rYm(R.drawable.bv6, R.attr.eg, false, 12), numValueOf2, numValueOf);
            } else {
                c1592290rXP = new C1592290rXP(new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_friends_fill_light, R.attr.a1h, true, 4), new C1593140rYm(R.raw.icon_bitmap_exp_02_icon_friends_fill_dark, R.attr.a1h, true, 4), new C1593140rYm(R.raw.icon_bitmap_exp_05_icon_friends_light, R.attr.a1h, true, 4), new C1593140rYm(R.raw.icon_bitmap_exp_05_icon_friends_dark, R.attr.a1h, true, 4), numValueOf2, numValueOf);
            }
        }
        this.LLILZLL = c1592290rXP;
        this.LLIZ = FriendsTabContainerFragment.class;
        this.LLIZLLLIL = "FRIENDS_TAB";
        this.LLJ = EnumC1583960rJy.TAB_2;
        this.LLJI = "homepage_friends";
        this.LLJIJIL = new AbstractC1583860rJo() { // from class: X.0rJ1
            public ExecutorService LIZ;
            public final boolean LIZIZ = true;

            @Override // X.AbstractC1583860rJo
            public final boolean LIZIZ() {
                return this.LIZIZ;
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x0042 A[PHI: r6
              0x0042: PHI (r6v3 boolean) = (r6v1 boolean), (r6v4 boolean), (r6v4 boolean) binds: [B:17:0x0040, B:15:0x003a, B:13:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.AbstractC1583860rJo
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.List<X.AbstractC1583720rJa> LIZ(android.content.Context r9) {
                /*
                    r8 = this;
                    com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility r1 = X.C1583510rJF.LJ(r9)
                    r5 = 1
                    r7 = 0
                    if (r1 != 0) goto L89
                    r6 = 1
                    java.util.concurrent.ExecutorService r0 = r8.LIZ
                    if (r0 == 0) goto L3a
                    java.lang.String r2 = "social_2tab_assem_opt"
                    X.0rJ3 r0 = new X.0rJ3
                    r0.<init>()
                    java.lang.Object r0 = X.C293120BeI.LIZ(r2, r0)
                    java.lang.Number r0 = (java.lang.Number) r0
                    int r0 = r0.intValue()
                    if (r0 != r5) goto L3a
                    boolean r0 = r9 instanceof X.C19EG
                    if (r0 == 0) goto L3a
                    X.19EG r9 = (X.C19EG) r9
                    if (r9 == 0) goto L3a
                    X.0rcT r0 = X.C1595430rcT.LIZIZ
                    com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService r1 = r0.LIZJ()
                    java.util.concurrent.ExecutorService r0 = r8.LIZ
                    X.0SxQ r1 = r1.initSocial2TabV1Assem(r9, r0)
                    boolean r0 = r1 instanceof com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility
                    if (r0 == 0) goto L42
                    com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility r1 = (com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility) r1
                L3a:
                    if (r1 == 0) goto L42
                L3c:
                    java.util.List r4 = r1.oK1()
                    if (r4 != 0) goto L44
                L42:
                    X.13BV r4 = X.C13BV.INSTANCE
                L44:
                    r0 = 4
                    kotlin.Pair[] r3 = new kotlin.Pair[r0]
                    kotlin.Pair r2 = new kotlin.Pair
                    java.lang.String r1 = "FriendTagGroup"
                    java.lang.String r0 = "event_from"
                    r2.<init>(r1, r0)
                    r3[r7] = r2
                    int r0 = r4.size()
                    java.lang.String r2 = java.lang.String.valueOf(r0)
                    kotlin.Pair r1 = new kotlin.Pair
                    java.lang.String r0 = "node_size"
                    r1.<init>(r2, r0)
                    r3[r5] = r1
                    int r0 = r4.size()
                    java.lang.String r2 = java.lang.String.valueOf(r0)
                    kotlin.Pair r1 = new kotlin.Pair
                    java.lang.String r0 = "distinct_node_size"
                    r1.<init>(r2, r0)
                    r0 = 2
                    r3[r0] = r1
                    java.lang.String r2 = java.lang.String.valueOf(r6)
                    kotlin.Pair r1 = new kotlin.Pair
                    java.lang.String r0 = "social_ability_null"
                    r1.<init>(r2, r0)
                    r0 = 3
                    r3[r0] = r1
                    java.lang.String r0 = "friends_tab_node_add_error_monitor"
                    X.C20684815ws.LJIJI(r0, r3)
                    return r4
                L89:
                    r6 = 0
                    goto L3c
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1583370rJ1.LIZ(android.content.Context):java.util.List");
            }

            @Override // X.AbstractC1583860rJo
            public final void LIZJ(ExecutorService executorService) {
                this.LIZ = executorService;
            }

            @Override // X.AbstractC1583860rJo
            public final void LIZLLL(Context context, String str, Bundle bundle) {
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
                if (c19egLIZIZ == null) {
                    return;
                }
                int iFQ2 = Hox.LLJILJIL.LIZ(c19egLIZIZ).FQ2(str);
                boolean z = bundle.getBoolean("isSmoothScroll", false);
                IFriendsTabLayoutAbility iFriendsTabLayoutAbilityLIZIZ = C1583510rJF.LIZIZ(context);
                if (iFriendsTabLayoutAbilityLIZIZ != null) {
                    iFriendsTabLayoutAbilityLIZIZ.Ky0(iFQ2, z);
                }
            }
        };
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final boolean enable() {
        return C1595430rcT.LIZIZ.LIZJ().shouldInitSocial2TabV1();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final C1592290rXP LIZJ() {
        return this.LLILZLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final EnumC1583960rJy LIZLLL() {
        return this.LLJ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final AbstractC1583860rJo LJFF() {
        return this.LLJIJIL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final Class<? extends Fragment> LLJIJIL() {
        return this.LLIZ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String getMob() {
        return this.LLJI;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String getTag() {
        return this.LLIZLLLIL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void LJII(Context context) {
        boolean zLJI = MethodIDManager.LJI(201108);
        ((View.OnClickListener) this.LLILZ.getValue()).onClick(null);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final Bundle V9(Context context) {
        Intent intent;
        Bundle extras;
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null && (intent = activityLIZ.getIntent()) != null) {
            try {
                extras = intent.getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                extras = null;
            }
            if (extras != null) {
                return extras;
            }
        }
        return new Bundle();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void init(Context context) {
        this.LLILLL = context;
        C08TN.LIZ().LJ("friend_tab_sub_thread_service_protocal_init", false);
        if (C0BLH.LIZ()) {
            this.LLILZIL = true;
            synchronized (this) {
                try {
                    EventBus eventBusLIZLLL = EventBus.LIZLLL();
                    if (!eventBusLIZLLL.LJIIJ(this)) {
                        eventBusLIZLLL.LJIJJ(this);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else {
            C1587170rP9.LIZ.getClass();
            C1587170rP9.LJI();
        }
        C08TN.LIZ().LJI("friend_tab_sub_thread_service_protocal_init");
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String mc(Context context) {
        return context.getString(2131834970);
    }

    @C14EU
    public final void onRenderFirstFrame(C1584420rKi c1584420rKi) {
        if (this.LLILZIL) {
            this.LLILZIL = false;
            synchronized (this) {
                try {
                    EventBus eventBusLIZLLL = EventBus.LIZLLL();
                    if (eventBusLIZLLL.LJIIJ(this)) {
                        eventBusLIZLLL.LJJI(this);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C1587170rP9.LIZ.getClass();
            C1587170rP9.LJI();
        }
    }
}
