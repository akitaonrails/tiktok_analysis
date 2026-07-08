package com.ss.android.ugc.aweme.inbox.bulletin.assem.sharemusic;

import X.C019F;
import X.C09R3;
import X.C1324840ka2;
import X.C1360520lVa;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C1841350y17;
import X.C19719912Dl;
import X.C2215091Bml;
import X.C2217381BqS;
import X.C339190DRl;
import X.C618900OPg;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC2215081Bmk;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.publishpanel.BulletinPublishPanelViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.sharemusic.BulletinShareMusicListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import wh6.AbS691S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinShareMusicPresaveItemAssem extends ReusedUISlotAssem<BulletinShareMusicPresaveItemAssem> implements InterfaceC712990Rxx<C618900OPg> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLL;
    public LinearLayout LLJJLIIIJLLLLLLLZ;
    public RemoteImageView LLJL;
    public TuxTextView LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public C1841350y17 LLJLLIL;
    public C618900OPg LLJLLL;
    public final AssemVMLazy LLJZ;
    public final AssemVMLazy LLJZIJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinShareMusicPresaveItemAssem.class, "bulletinPublishPanelVM", "getBulletinPublishPanelVM()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/publishpanel/BulletinPublishPanelViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BulletinShareMusicPresaveItemAssem.class, "bulletinShareMusicListVM", "getBulletinShareMusicListVM()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/sharemusic/BulletinShareMusicListViewModel;", 0);
        c09r3.getClass();
        LLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public BulletinShareMusicPresaveItemAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinPublishPanelViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ, 490), AFwS240S0000000_9.get$arr$(276), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BulletinShareMusicListViewModel.class);
        this.LLJZIJLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ2, 491), AFwS240S0000000_9.get$arr$(277), null, true);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.a8d;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final BulletinShareMusicListViewModel op() {
        AssemVMLazy assemVMLazy = this.LLJZIJLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLL;
        return (BulletinShareMusicListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJLIIIJLLLLLLLZ = (LinearLayout) view.findViewById(R.id.d4v);
        this.LLJL = (RemoteImageView) view.findViewById(R.id.d4w);
        View viewFindViewById = view.findViewById(R.id.d4z);
        if (viewFindViewById != null) {
            C339190DRl.LIZIZ(viewFindViewById);
        }
        this.LLJLIL = (TuxTextView) view.findViewById(R.id.d4y);
        this.LLJLILLLLZIIL = (TuxTextView) view.findViewById(R.id.d51);
        this.LLJLL = (TuxTextView) view.findViewById(R.id.d52);
        this.LLJLLIL = (C1841350y17) view.findViewById(R.id.d50);
        LinearLayout linearLayout = this.LLJJLIIIJLLLLLLLZ;
        if (linearLayout != null) {
            C786410Ut5.I7(new AbS691S0100000_9(this, 2, 42), linearLayout);
        }
        C1841350y17 c1841350y17 = this.LLJLLIL;
        if (c1841350y17 != null) {
            C786410Ut5.I7(new AbS691S0100000_9(this, 3, 42), c1841350y17);
        }
        C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.0OXj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C618880OPe) obj).LLILLJJLI;
            }
        }, null, AFwS292S0000000_9.get$arr$(62), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C618900OPg c618900OPg) {
        RemoteImageView remoteImageView;
        C618900OPg c618900OPg2 = c618900OPg;
        this.LLJLLL = c618900OPg2;
        String str = c618900OPg2.LL.backgroundImage;
        if (str != null && (remoteImageView = this.LLJL) != null) {
            C1324840ka2.LJIIJ(remoteImageView, str, -1, -1);
        }
        TuxTextView tuxTextView = this.LLJLIL;
        if (tuxTextView != null) {
            C1360520lVa c1360520lVa = new C1360520lVa();
            String str2 = c618900OPg2.LL.albumTitle;
            if (str2 == null) {
                str2 = "";
            }
            c1360520lVa.LIZ.append((CharSequence) str2);
            tuxTextView.setText(c1360520lVa.LIZ);
        }
        Long l = c618900OPg2.LL.endTime;
        if (l != null) {
            String strLIZLLL = C2215091Bml.LIZLLL(l.longValue(), null, Collections.singleton(EnumC2215081Bmk.Date), null, false, false, false, 1690);
            TuxTextView tuxTextView2 = this.LLJLILLLLZIIL;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(strLIZLLL);
            }
        }
        TuxTextView tuxTextView3 = this.LLJLL;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(2131828011);
        }
        C736680Sv4.LJIJJ(op(), new AwS588S0100000_9(this, 573));
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C618900OPg c618900OPg) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C618900OPg c618900OPg) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
