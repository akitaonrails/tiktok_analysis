package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C01GW;
import X.C13LE;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C708870RrJ;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.RunnableC514301zR;
import X.ViewTreeObserverOnPreDrawListenerC337150DJp;
import Y.ACListenerS115S0200000_11;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class ReplaceMusicBottomBarAssem extends BaseCellSlotComponent<ReplaceMusicBottomBarAssem> {
    public ViewGroup LLJLLL;
    public TuxTextView LLJZ;
    public FrameLayout LLJZIJLIL;
    public VideoItemParams LLL;
    public long LLJLLIL = -1;
    public final C01GW LLLF = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(563));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b_y;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.t6v);
        this.LLJLLL = viewGroup;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(8, viewGroup);
        }
        this.LLJZ = (TuxTextView) view.findViewById(R.id.t6w);
        this.LLJZIJLIL = (FrameLayout) view.findViewById(R.id.t6t);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLF.getValue(), new C2217381BqS() { // from class: X.0RZX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, AFwS294S0000000_11.get$arr$(212), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        VideoItemParams videoItemParams2 = videoItemParams;
        this.LLL = videoItemParams2;
        this.LLJLLIL = -1L;
        if (C708870RrJ.LIZ(videoItemParams2.getAweme())) {
            ViewGroup viewGroup = this.LLJLLL;
            if (viewGroup != null) {
                C786410Ut5.LJLZ(0, viewGroup);
            }
            String string = getContentView().getResources().getString(2131834974);
            String string2 = getContentView().getResources().getString(2131834973);
            String string3 = getContentView().getResources().getString(2131834975);
            String string4 = getContentView().getResources().getString(2131834976, string3);
            Aweme aweme = videoItemParams2.getAweme();
            if (aweme.getMusic() != null && aweme.getMusic().getMid() != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(string2);
                sbLIZ.append(' ');
                sbLIZ.append(string);
                string4 = C2188811AlT.LIZIZ(sbLIZ);
            }
            Aweme aweme2 = videoItemParams2.getAweme();
            if (aweme2.getMusic() == null || aweme2.getMusic().getMid() == null) {
                string = string3;
            }
            TuxTextView tuxTextView = this.LLJZ;
            if (tuxTextView != null) {
                ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(tuxTextView, new RunnableC514301zR(tuxTextView, string4, this, tuxTextView, string, 1));
            }
            FrameLayout frameLayout = this.LLJZIJLIL;
            if (frameLayout != null) {
                C786410Ut5.O7(frameLayout, new ACListenerS115S0200000_11(videoItemParams2, this, 39));
            }
            C786410Ut5.I7(new ACListenerS115S0200000_11(videoItemParams2, this, 40), getContentView());
            return;
        }
        ViewGroup viewGroup2 = this.LLJLLL;
        if (viewGroup2 == null) {
            return;
        }
        C786410Ut5.LJLZ(8, viewGroup2);
    }
}
