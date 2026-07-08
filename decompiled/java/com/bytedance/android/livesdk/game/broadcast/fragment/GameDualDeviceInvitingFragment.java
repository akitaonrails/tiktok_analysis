package com.bytedance.android.livesdk.game.broadcast.fragment;

import X.C01GW;
import X.C098200Yq;
import X.C09JN;
import X.C0J1N;
import X.C11NJ;
import X.C11NZ;
import X.C11RD;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C452501pT;
import X.C786410Ut5;
import Y.AfS181S0100000_12;
import Y.AfS33S1000000_12;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.livesetting.game.GameDualDeviceInvitingConfigSetting;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class GameDualDeviceInvitingFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGExOiotLSwyHELIOSOzFiLz0yLygpJzt9DyQhLAsmKSkILDk6KyAFJzk6PCwiLgkhKSIhLCEn";
    public final C01GW LL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 242));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 243));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(115));
    public final C11NJ LLILZ = new C11NJ();

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LLILZ.dispose();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        String strValueOf = String.valueOf(System.currentTimeMillis());
        long j = GameDualDeviceInvitingConfigSetting.INSTANCE.getConfig().gameDualDeviceInvitingInterval;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.LLILZ.LIZ(((C0J1N) C11NZ.LJJJJJL(0L, j, timeUnit).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LIZLLL(this))).LIZ(new AfS33S1000000_12(strValueOf, 2), new C09JN() { // from class: X.0T7a
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("GameDualDeviceInvitingFragment@3522.onResume$2");
                C20441214yg.LJ("GameDualDeviceInvitingFragment", Log.getStackTraceString((Throwable) obj));
                C1C7U.LIZIZ("GameDualDeviceInvitingFragment@3522.onResume$2");
            }
        }));
        this.LLILZ.LIZ(((C0J1N) C11NZ.LJLJJLL(r7.getConfig().gameDualDeviceInvitingTime, timeUnit).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LIZLLL(this))).LIZ(new AfS181S0100000_12(this, 82), new C09JN() { // from class: X.0T7b
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("GameDualDeviceInvitingFragment@3522.onResume$5");
                C20441214yg.LJ("GameDualDeviceInvitingFragment", Log.getStackTraceString((Throwable) obj));
                C1C7U.LIZIZ("GameDualDeviceInvitingFragment@3522.onResume$5");
            }
        }));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
            r4 = this;
            super.onViewCreated(r5, r6)
            r0 = 2131395865(0x7f0a8519, float:1.8412455E38)
            android.view.View r3 = r5.findViewById(r0)
            if (r3 == 0) goto L39
            android.content.Context r0 = r3.getContext()
            boolean r0 = X.C960203pA.LIZIZ(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 == 0) goto Lb2
            java.lang.String r0 = com.bytedance.android.livesdk.game.broadcast.fragment.dualdevice3.GameDualDeviceDialogV3._pnsPageId
            X.01GW r0 = r4.LL
            java.lang.Object r1 = r0.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "live_take_prepare"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto Lb2
            java.lang.String r2 = "ttlive_dual_device_inviting_dark.png"
        L32:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            java.lang.String r0 = "tiktok_live_game_demand_2"
            X.C1143680frq.LJ(r3, r0, r2, r1)
        L39:
            r0 = 2131395790(0x7f0a84ce, float:1.8412302E38)
            android.view.View r2 = r5.findViewById(r0)
            if (r2 == 0) goto L4c
            Y.ACListenerS147S0100000_12 r1 = new Y.ACListenerS147S0100000_12
            r0 = 14
            r1.<init>(r4, r0)
            X.C786410Ut5.I7(r1, r2)
        L4c:
            r0 = 2131395750(0x7f0a84a6, float:1.8412221E38)
            android.view.View r2 = r5.findViewById(r0)
            if (r2 == 0) goto L5f
            Y.ACListenerS147S0100000_12 r1 = new Y.ACListenerS147S0100000_12
            r0 = 15
            r1.<init>(r4, r0)
            X.C786410Ut5.I7(r1, r2)
        L5f:
            X.11PQ r1 = X.C0TDF.LIZJ()
            X.11RO r0 = X.C1701940uOG.LIZIZ()
            X.11O8 r1 = r1.LJJJLZIJ(r0)
            X.11L0 r0 = X.C11RD.LIZLLL(r4)
            java.lang.Object r2 = r1.LIZJ(r0)
            X.0J1N r2 = (X.C0J1N) r2
            Y.AfS181S0100000_12 r1 = new Y.AfS181S0100000_12
            r0 = 83
            r1.<init>(r4, r0)
            X.0T7Z<T> r0 = new X.C09JN() { // from class: X.0T7Z
                static {
                    /*
                        X.0T7Z r0 = new X.0T7Z
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0T7Z<T>) X.0T7Z.LL X.0T7Z
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0T7Z.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0T7Z.<init>():void");
                }

                @Override // X.C09JN
                public final void accept(java.lang.Object r4) {
                    /*
                        r3 = this;
                        java.lang.String r2 = "GameDualDeviceInvitingFragment@3522.onViewCreated$2"
                        X.C1C7U.LIZ(r2)
                        java.lang.Throwable r4 = (java.lang.Throwable) r4
                        java.lang.String r1 = "GameDualDeviceInvitingFragment"
                        java.lang.String r0 = android.util.Log.getStackTraceString(r4)
                        X.C20441214yg.LJ(r1, r0)
                        X.C1C7U.LIZIZ(r2)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0T7Z.accept(java.lang.Object):void");
                }
            }
            r2.LIZ(r1, r0)
            X.01GW r0 = r4.LLILLJJLI
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Laf
            java.lang.String r3 = "splice"
        L91:
            X.01GW r0 = r4.LLILLL
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            java.lang.String r2 = java.lang.String.valueOf(r0)
            X.01GW r0 = r4.LL
            java.lang.Object r1 = r0.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "screen_share"
            X.C0TDL.LIZLLL(r2, r0, r1, r3)
            return
        Laf:
            java.lang.String r3 = "embed"
            goto L91
        Lb2:
            java.lang.String r2 = "ttlive_dual_device_inviting.png"
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.game.broadcast.fragment.GameDualDeviceInvitingFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gi5, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
