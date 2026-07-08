package com.bytedance.android.livesdk.game.broadcast.fragment;

import X.C01GW;
import X.C098200Yq;
import X.C11JF;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C452501pT;
import X.C475510Ikn;
import X.C748890TZf;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.livesetting.game.GameDualDeviceInvitingSetting;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class GameDualDevicePositionSelectFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGExOiotLSwyOzFiHELIOSLz0yLygpJzt9DyQhLAsmKSkILDk6KyAcJjw6PCwjJxw2JCAvPQkhKSIhLCEn";
    public final C01GW LL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(121));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(120));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 252));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 253));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 251));
    public int LLILZLL = -1;
    public C11JF LLIZ;

    public final boolean NR() {
        return ((Boolean) this.LLILLL.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OR(android.widget.ImageView r4) {
        /*
            r3 = this;
            com.bytedance.android.livesdk.livesetting.game.GameDualDeviceInvitingSetting r0 = com.bytedance.android.livesdk.livesetting.game.GameDualDeviceInvitingSetting.INSTANCE
            boolean r0 = r0.isExperiment()
            if (r0 == 0) goto L7e
            boolean r0 = r4 instanceof com.bytedance.android.live.design.view.icon.LiveIconView
            if (r0 == 0) goto L68
            android.content.Context r1 = r3.getContext()
            r0 = 2131104698(0x7f0613ba, float:1.7821898E38)
            X.16Fd r2 = X.C20736316Cj.LIZLLL(r0, r1)
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L69
            boolean r1 = X.C960203pA.LIZIZ(r0)
            r0 = 1
            if (r1 != r0) goto L69
            java.lang.String r0 = com.bytedance.android.livesdk.game.broadcast.fragment.dualdevice3.GameDualDeviceDialogV3._pnsPageId
            X.01GW r0 = r3.LLILZIL
            java.lang.Object r1 = r0.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "live_take_prepare"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L69
            if (r2 == 0) goto L5e
            android.content.Context r0 = r4.getContext()
            android.content.Context r1 = X.C1834150xpV.LJII(r0)
            r0 = 2131103798(0x7f061036, float:1.7820072E38)
            int r0 = X.C20736316Cj.LIZIZ(r0, r1)
            r2.setTint(r0)
        L4a:
            r1 = 23
            if (r2 == 0) goto L5e
            float r0 = (float) r1
            float r0 = X.C497740JfY.LIZIZ(r0)
            int r0 = (int) r0
            r2.LLJJL = r0
            float r0 = (float) r1
            float r0 = X.C497740JfY.LIZIZ(r0)
            int r0 = (int) r0
            r2.LLJJLIIIJLLLLLLLZ = r0
        L5e:
            com.bytedance.android.live.design.view.icon.LiveIconView r4 = (com.bytedance.android.live.design.view.icon.LiveIconView) r4
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r4.setScaleType(r0)
            r4.setIcon(r2)
        L68:
            return
        L69:
            if (r2 == 0) goto L5e
            android.content.Context r0 = r4.getContext()
            android.content.Context r1 = X.C1834150xpV.LJIIIIZZ(r0)
            r0 = 2131103801(0x7f061039, float:1.7820078E38)
            int r0 = X.C20736316Cj.LIZIZ(r0, r1)
            r2.setTint(r0)
            goto L4a
        L7e:
            X.11JF r0 = r3.LLIZ
            if (r0 == 0) goto L85
            r0.dispose()
        L85:
            java.lang.String r0 = "ttlive_game_dual_device_position_selected.png"
            X.11K9 r1 = X.C11NZ.LJJJJZ(r0)
            X.0TDR<T, R> r0 = new X.InterfaceC1487280oo2() { // from class: X.0TDR
                static {
                    /*
                        X.0TDR r0 = new X.0TDR
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0TDR<T, R>) X.0TDR.LL X.0TDR
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0TDR.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0TDR.<init>():void");
                }

                @Override // X.InterfaceC1487280oo2
                public final java.lang.Object apply(java.lang.Object r2) {
                    /*
                        r1 = this;
                        java.lang.String r2 = (java.lang.String) r2
                        java.lang.String r0 = "tiktok_live_game_demand_1"
                        android.graphics.drawable.Drawable r0 = X.C1143680frq.LIZ(r0, r2)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0TDR.apply(java.lang.Object):java.lang.Object");
                }
            }
            X.11ON r1 = r1.LJJJJZI(r0)
            X.0UO0 r0 = new X.0UO0
            r0.<init>()
            X.11NZ r2 = r1.LJIILIIL(r0)
            Y.AfS181S0100000_12 r1 = new Y.AfS181S0100000_12
            r0 = 86
            r1.<init>(r4, r0)
            X.01kM r1 = r2.LJJLJLI(r1)
            r0 = r1
            X.11JF r0 = (X.C11JF) r0
            r3.LLIZ = r0
            r3.MR(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.game.broadcast.fragment.GameDualDevicePositionSelectFragment.OR(android.widget.ImageView):void");
    }

    public final void PR(int i) {
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.SX0(C748890TZf.class, Integer.valueOf(i));
        }
        this.LLILZLL = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.game.broadcast.fragment.GameDualDevicePositionSelectFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        View viewTd;
        if (GameDualDeviceInvitingSetting.INSTANCE.isExperiment()) {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.gid, viewGroup, false);
        } else {
            if (NR()) {
                i = R.layout.gia;
            } else if (((Boolean) this.LLILZ.getValue()).booleanValue()) {
                i = R.layout.gic;
            } else {
                i = R.layout.gib;
            }
            viewTd = C786410Ut5.Td(layoutInflater, i, viewGroup, false);
        }
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
