package com.ss.android.ugc.feed.platform.panel.autoscroll;

import X.C01GW;
import X.C1386360mBG;
import X.C19252910Tv;
import X.C1A5L;
import X.C21411818qq;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C786410Ut5;
import X.EnumC584570MwJ;
import X.EnumC700430Rdh;
import Y.ACListenerS155S0100000_21;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class AutoScrollSwitchAssem extends AutoScrollAssemBase {
    public C21411818qq LLLIIIL;

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.AutoScrollAssemBase
    public final void Jp() {
        IAutoAScrollAbility iAutoAScrollAbilityLIZIZ = C1386360mBG.LIZIZ(null);
        boolean z = (iAutoAScrollAbilityLIZIZ != null ? iAutoAScrollAbilityLIZIZ.xo1() : null) == EnumC584570MwJ.AUTO_SCROLL_STATE_START;
        C21411818qq c21411818qq = this.LLLIIIL;
        if (c21411818qq != null) {
            c21411818qq.setChecked(z);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bar;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.AutoScrollAssemBase
    public final View Vt() {
        return LJJIJL();
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.AutoScrollAssemBase
    public final void Bp(boolean z) {
        if (z) {
            C21411818qq c21411818qq = this.LLLIIIL;
            if (c21411818qq != null) {
                c21411818qq.setChecked(true);
                return;
            }
            return;
        }
        C21411818qq c21411818qq2 = this.LLLIIIL;
        if (c21411818qq2 == null) {
            return;
        }
        c21411818qq2.setChecked(false);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.autoscroll.AutoScrollAssemBase, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.bem);
        C21411818qq c21411818qq = (C21411818qq) view.findViewById(R.id.bek);
        this.LLLIIIL = c21411818qq;
        C01GW c01gw = C2271381DvM.g0;
        C2271391DvN.LIZ(c21411818qq, (C1A5L) c01gw.getValue());
        C2271391DvN.LIZ(view, (C1A5L) c01gw.getValue());
        C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJL().LJIILLIIL(this.LLLIIIL, tuxTextView);
        setComponentClickStatusExperimental(view, EnumC700430Rdh.POSITIVE);
        C786410Ut5.I7(new ACListenerS155S0100000_21(this, 104), view);
        C21411818qq c21411818qq2 = this.LLLIIIL;
        if (c21411818qq2 != null) {
            c21411818qq2.setInterceptToggleListener(new AwS565S0100000_21(this, 1079));
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        AutoScrollAssemBase.Qp(this);
        C21411818qq c21411818qq = this.LLLIIIL;
        if (c21411818qq != null) {
            c21411818qq.requestLayout();
        }
    }
}
