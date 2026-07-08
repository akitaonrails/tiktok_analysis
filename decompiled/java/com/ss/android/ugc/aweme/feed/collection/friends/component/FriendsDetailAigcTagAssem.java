package com.ss.android.ugc.aweme.feed.collection.friends.component;

import X.C01GW;
import X.C098200Yq;
import X.C0SD5;
import X.C189200o6;
import X.C337180DJs;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import Y.ACListenerS146S0100000_11;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsDetailAigcTagAssem extends BaseCellSlotComponent<FriendsDetailAigcTagAssem> {
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 302));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b6y;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void mo() {
        try {
            C337180DJs.LIZJ(LJJIJL());
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
        try {
            C337180DJs.LIZ(LJJIJL());
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        TuxTextView tuxTextView = (TuxTextView) this.LLJLLIL.getValue();
        if (tuxTextView != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.bt);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
            tuxTextView.setBackground(c384050F3z.LIZ(view.getContext()));
            C786410Ut5.h9(tuxTextView, new ACListenerS146S0100000_11(this, 13));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        Aweme aweme = videoItemParams.getAweme();
        if (aweme == null || !C0SD5.LIZIZ(aweme)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        VideoItemParams videoItemParams2 = videoItemParams;
        TextView textView = (TextView) this.LLJLLIL.getValue();
        if (textView != null) {
            textView.setText(C0SD5.LIZ(getContext(), videoItemParams2.getAweme()));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }
}
