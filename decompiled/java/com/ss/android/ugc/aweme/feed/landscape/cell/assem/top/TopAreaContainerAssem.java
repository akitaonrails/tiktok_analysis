package com.ss.android.ugc.aweme.feed.landscape.cell.assem.top;

import X.C0HHT;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C692760RFi;
import X.C695370RPj;
import X.C723830SaL;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS144S0100000_9;
import Y.ACListenerS146S0100000_11;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class TopAreaContainerAssem extends FeedBaseContentAssem<TopAreaContainerAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJJJJ;
    public TuxIconView LLJJJJJIL;
    public TuxIconView LLJJJJLIIL;
    public TuxTextView LLJJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TopAreaContainerAssem.class, "topAreaVM", "getTopAreaVM()Lcom/ss/android/ugc/aweme/feed/landscape/cell/assem/top/TopAreaContainerVM;", 0);
        C13LE.LIZ.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TopAreaContainerAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TopAreaContainerVM.class);
        this.LLJJJJ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 156), null, AFwS243S0000000_11.get$arr$(198));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Object obj;
        Object obj2;
        TuxTextView tuxTextView = null;
        C723830SaL.LIZ(this, null, new AwS590S0100000_11(this, 144));
        this.LLJJJJJIL = (TuxIconView) view.findViewById(R.id.mko);
        this.LLJJJJLIIL = (TuxIconView) view.findViewById(R.id.tm2);
        this.LLJJL = (TuxTextView) view.findViewById(R.id.vtv);
        C695370RPj c695370RPj = C695370RPj.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        Aweme aweme = ((VideoItemParams) obj).getAweme();
        c695370RPj.getClass();
        if (C695370RPj.LIZ(aweme).LIZJ()) {
            TuxIconView tuxIconView = this.LLJJJJJIL;
            if (tuxIconView == null) {
                tuxIconView = null;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            TuxIconView tuxIconView2 = this.LLJJJJLIIL;
            if (tuxIconView2 == null) {
                tuxIconView2 = null;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
            TuxTextView tuxTextView2 = this.LLJJL;
            if (tuxTextView2 == null) {
                tuxTextView2 = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView2, 8);
        } else {
            C723830SaL.LIZ(this, null, new AwS590S0100000_11(this, 552));
            TuxIconView tuxIconView3 = this.LLJJJJJIL;
            if (tuxIconView3 == null) {
                tuxIconView3 = null;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
            TuxIconView tuxIconView4 = this.LLJJJJLIIL;
            if (tuxIconView4 == null) {
                tuxIconView4 = null;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView4, 0);
            TuxTextView tuxTextView3 = this.LLJJL;
            if (tuxTextView3 == null) {
                tuxTextView3 = null;
            }
            C786410Ut5.LLLLZLL(tuxTextView3, 0);
        }
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        } else {
            obj2 = null;
        }
        if (((VideoItemParams) obj2).getAweme().isPaidContent) {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("paid_content_landscape_enable_speed_change", false)) {
                TuxTextView tuxTextView4 = this.LLJJL;
                if (tuxTextView4 == null) {
                    tuxTextView4 = null;
                }
                C786410Ut5.LLLLZLL(tuxTextView4, 0);
            } else {
                TuxTextView tuxTextView5 = this.LLJJL;
                if (tuxTextView5 == null) {
                    tuxTextView5 = null;
                }
                C786410Ut5.LLLLZLL(tuxTextView5, 8);
            }
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJ.getValue(this, LLJJLIIIJLLLLLLLZ[0]), new C2217381BqS() { // from class: X.0RIO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj3) {
                return Float.valueOf(((C00GQ) obj3).LL);
            }
        }, null, AFwS294S0000000_11.get$arr$(82), 6);
        TuxIconView tuxIconView5 = this.LLJJJJJIL;
        if (tuxIconView5 == null) {
            tuxIconView5 = null;
        }
        C786410Ut5.a9(tuxIconView5, new ACListenerS144S0100000_9(this, 139));
        TuxIconView tuxIconView6 = this.LLJJJJLIIL;
        if (tuxIconView6 == null) {
            tuxIconView6 = null;
        }
        C786410Ut5.a9(tuxIconView6, new ACListenerS144S0100000_9(this, 140));
        TuxTextView tuxTextView6 = this.LLJJL;
        if (tuxTextView6 != null) {
            tuxTextView = tuxTextView6;
        }
        C786410Ut5.h9(tuxTextView, new ACListenerS146S0100000_11(this, 91));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(VideoItemParams videoItemParams) {
        if (C692760RFi.LIZ) {
            C723830SaL.LJ(this, C13LE.LIZ(TopStatusBarAssem.class), true, null);
        }
    }
}
