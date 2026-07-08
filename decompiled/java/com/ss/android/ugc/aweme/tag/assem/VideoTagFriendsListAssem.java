package com.ss.android.ugc.aweme.tag.assem;

import X.C019F;
import X.C01GW;
import X.C09JN;
import X.C11S5;
import X.C1252710ihh;
import X.C13LE;
import X.C15NN;
import X.C15NY;
import X.C15O7;
import X.C1637806bA;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C20749016Hg;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACallableS434S0100000_31;
import Y.AfS200S0100000_31;
import Y.AsS56S0100000_31;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tag.FriendsListCell;
import com.ss.android.ugc.aweme.tag.SectionCell;
import com.ss.android.ugc.aweme.tag.viewmodel.VideoTagFriendsListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS645S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class VideoTagFriendsListAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final AssemVMLazy LLIZLLLIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJ;
    public C1749280vcc LLJI;
    public final C01GW LLJIJIL;
    public Boolean LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoTagFriendsListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/tag/viewmodel/VideoTagFriendsListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public VideoTagFriendsListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoTagFriendsListViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS556S0100000_12(c19719912DlLIZ, 615), AFwS276S0000000_31.get$arr$(220), null, true);
        this.LLJIJIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 614));
    }

    public final void Go() {
        C1722300uv6 c1722300uv6 = (C1722300uv6) this.LLJIJIL.getValue();
        if (c1722300uv6 != null) {
            C1749280vcc c1749280vcc = this.LLJI;
            if (c1749280vcc == null) {
                c1749280vcc = null;
            }
            c1749280vcc.setStatus(c1722300uv6);
            C1749280vcc c1749280vcc2 = this.LLJI;
            C786410Ut5.LLLZLZ(c1749280vcc2 != null ? c1749280vcc2 : null, 0);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C1749280vcc c1749280vcc = (C1749280vcc) LJJIJL().findViewById(R.id.w28);
        this.LLJI = c1749280vcc;
        if (c1749280vcc == null) {
            c1749280vcc = null;
        }
        c1749280vcc.LJ();
        C786410Ut5.LLLZLZ(c1749280vcc, 0);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) LJJIJL().findViewById(R.id.im9);
        this.LLJ = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv == null) {
            viewOnAttachStateChangeListenerC20604515jv = null;
        }
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(FriendsListCell.class, SectionCell.class);
        viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
        viewOnAttachStateChangeListenerC20604515jv.addOnScrollListener(new AsS56S0100000_31(this, 6));
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        VideoTagFriendsListViewModel videoTagFriendsListViewModel = (VideoTagFriendsListViewModel) assemVMLazy.getValue();
        ((ArrayList) videoTagFriendsListViewModel.LLJILJILJ).clear();
        Aweme aweme = videoTagFriendsListViewModel.vQ2().getAweme();
        if (aweme != null && (true ^ TextUtils.isEmpty(aweme.getAid()))) {
            ((C15NY) videoTagFriendsListViewModel.LL.getValue().getOperator()).LJFF(CastLongProtector.parseLong(aweme.getAid())).LJL(C11S5.LIZ()).LJJLL(new AfS200S0100000_31(videoTagFriendsListViewModel, 48), new C09JN() { // from class: X.00PH
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("VideoTagFriendsListViewModel@4d0b.refresh$2$2");
                    C1C7U.LIZIZ("VideoTagFriendsListViewModel@4d0b.refresh$2$2");
                }
            });
        }
        C15O7.LIZJ(new ACallableS434S0100000_31(videoTagFriendsListViewModel, 11)).LJ(new C20749016Hg(videoTagFriendsListViewModel, 9), C15O7.LJIIIIZZ, null);
        C736680Sv4.LJIIIIZZ(this, this.LLIZLLLIL.getValue(), new C2217381BqS() { // from class: X.15NL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C15NF) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS645S0100000_31(this, 68), 4);
        C1252710ihh.LJIIJJI(this, C13LE.LIZ(C15NN.class), new C2217381BqS() { // from class: X.15NJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C15GH) obj).LIZIZ;
            }
        }, new C2217381BqS() { // from class: X.15NK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C15GH) obj).LIZ;
            }
        }, new AwS645S0100000_31(this, 69));
        C736680Sv4.LJIIIIZZ(this, this.LLIZLLLIL.getValue(), new C2217381BqS() { // from class: X.15NM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C15NF) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS645S0100000_31(this, 70), 4);
    }
}
