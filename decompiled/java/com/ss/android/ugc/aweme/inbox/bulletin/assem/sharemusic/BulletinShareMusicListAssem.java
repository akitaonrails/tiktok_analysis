package com.ss.android.ugc.aweme.inbox.bulletin.assem.sharemusic;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0P6P;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2217381BqS;
import X.C339190DRl;
import X.C452501pT;
import X.C621070OXp;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import X.InterfaceC634570Oul;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AsS36S0100000_9;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.sharemusic.BulletinShareMusicListFooterCell;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.publishpanel.BulletinPublishPanelViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.sharemusic.BulletinShareMusicListViewModel;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinShareMusicListAssem extends UIListContentAssem<BulletinShareMusicListViewModel> implements InterfaceC634570Oul {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public View LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;
    public final C01GW LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinShareMusicListAssem.class, "bulletinPublishPanelVM", "getBulletinPublishPanelVM()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/publishpanel/BulletinPublishPanelViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BulletinShareMusicListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/sharemusic/BulletinShareMusicListViewModel;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public BulletinShareMusicListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinPublishPanelViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ, 487), AFwS240S0000000_9.get$arr$(273), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BulletinShareMusicListViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ2, 488), AFwS240S0000000_9.get$arr$(274), null, true);
        this.LLJIJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 486));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJIJIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = true;
        c20603715jn.LIZ = 2;
        c20603715jn.LIZLLL = BulletinShareMusicListFooterCell.class;
        return c20603715jn;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0OXo] */
    @Override // X.InterfaceC634570Oul
    public final C621070OXp LJIIZILJ() {
        return new C621070OXp(Go(), new C0P6P() { // from class: X.0OXo
            @Override // X.C0P6P
            public final void LJJIFFI() {
                this.LL.ip().manualListRetry(EnumC323450Cm7.Next);
            }
        });
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Lo, reason: merged with bridge method [inline-methods] */
    public final BulletinShareMusicListViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (BulletinShareMusicListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        View viewFindViewById = view.findViewById(R.id.d4u);
        this.LLIZLLLIL = viewFindViewById;
        if (viewFindViewById != null) {
            C339190DRl.LIZIZ(viewFindViewById);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        viewOnAttachStateChangeListenerC20604515jvGo.setLayoutManager(new WrapLinearLayoutManager(viewOnAttachStateChangeListenerC20604515jvGo.getContext(), 1));
        viewOnAttachStateChangeListenerC20604515jvGo.setItemAnimator(null);
        viewOnAttachStateChangeListenerC20604515jvGo.addOnScrollListener(new AsS36S0100000_9(this, 9));
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.0OXn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C618880OPe c618880OPe = (C618880OPe) obj;
                c618880OPe.getClass();
                return C627260Oiy.LIZLLL(c618880OPe);
            }
        }, this, null, new AwS588S0100000_9(this, 570), new AwS553S0100000_9(this, 1752), new AwS588S0100000_9(this, 572), 4, null);
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.06Js
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1588106Jr) obj).LLIZ;
            }
        }, null, new AwS623S0100000_9(this, 198), 6);
    }
}
