package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.live;

import X.C019F;
import X.C01GW;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C704790Rkj;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1361270lWn;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellContentAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment.FriendsV3CommentAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.viewmodel.FriendsV3LiveCellViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3AudioMuteViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AFwS310S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import wh6.AbS703S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsV3LiveAudioMuteAssem extends BaseFriendsV3CellContentAssem<FriendsV3LiveAudioMuteAssem, InterfaceC1361270lWn> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public final AssemVMLazy LLJJJJJIL;
    public TuxIconView LLJJJJLIIL;
    public final C01GW LLJJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsV3LiveAudioMuteAssem.class, "audioMuteVM", "getAudioMuteVM()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3AudioMuteViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FriendsV3LiveAudioMuteAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FriendsV3AudioMuteViewModel.class);
        this.LLJJJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 458), AFwS264S0000000_24.get$arr$(143), null, true);
        this.LLJJL = C737910Sx3.LIZJ(this, C13LE.LIZ(FriendsV3LiveCellViewModel.class), AFwS264S0000000_24.get$arr$(144));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJJJLIIL = (TuxIconView) view.findViewById(R.id.ovv);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zg);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        view.setBackground(c384050F3z.LIZ(LJJIJL().getContext()));
        C786410Ut5.I7(new AbS703S0100000_24(this, 3), view);
        AssemVMLazy assemVMLazy = this.LLJJJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJLIIIJLLLLLLLZ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0s05
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1608260rxA) obj).LL);
            }
        }, null, AFwS310S0000000_24.get$arr$(16), 6);
        TuxIconView tuxIconView = this.LLJJJJLIIL;
        if (tuxIconView != null) {
            C786410Ut5.LJLLLLLL(8, tuxIconView);
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJL.getValue(), new C2217381BqS() { // from class: X.0s07
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1610110s09) obj).LL;
            }
        }, null, AFwS310S0000000_24.get$arr$(17), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJL.getValue(), new C2217381BqS() { // from class: X.0s06
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1610110s09) obj).LLILLJJLI);
            }
        }, null, AFwS310S0000000_24.get$arr$(18), 6);
    }

    @Override // X.InterfaceC705620Rm4
    public final boolean va(List<? extends Object> list) {
        int i = FriendsV3CommentAssem.LLJLLIL;
        return !C704790Rkj.LIZ(list);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
    }
}
