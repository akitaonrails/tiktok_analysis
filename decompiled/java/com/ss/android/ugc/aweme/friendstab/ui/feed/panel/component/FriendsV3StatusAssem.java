package com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component;

import X.C019F;
import X.C01GW;
import X.C0HTI;
import X.C0IVP;
import X.C0W17;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C20675115vJ;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C339190DRl;
import X.C418440Gaw;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C725890Sdf;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS124S0100000_24;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.skeleton.TuxSkeletonLayout;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3ListStatusAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3SkylightViewStatusAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public class FriendsV3StatusAssem extends BasePanelUIComponent implements FriendsV3ListStatusAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final C630740Ooa LLJIJIL = C628500Oky.LIZ(new AwS568S0100000_24(this, 544));
    public final AssemVMLazy LLJILJIL;
    public final C630740Ooa LLJILJILJ;
    public final C630740Ooa LLJILLL;
    public final C630740Ooa LLJJ;
    public final C01GW LLJJI;
    public TuxSkeletonLayout LLJJIII;
    public View LLJJIJI;
    public C1722300uv6 LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsV3StatusAssem.class, "feedViewModel", "getFeedViewModel()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3FeedListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FriendsV3StatusAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FriendsV3FeedListViewModel.class);
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 547), AFwS264S0000000_24.get$arr$(163), null, true);
        this.LLJILJILJ = C628500Oky.LIZ(new AwS568S0100000_24(this, 545));
        this.LLJILLL = C628500Oky.LIZ(new AwS568S0100000_24(this, 546));
        this.LLJJ = C628500Oky.LIZ(new AwS568S0100000_24(this, 542));
        this.LLJJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 548));
    }

    public FriendsV3FeedListViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (FriendsV3FeedListViewModel) assemVMLazy.getValue();
    }

    public final C1749280vcc Ho() {
        return (C1749280vcc) this.LLJJI.getValue();
    }

    public void Lo() {
        FriendsV3EmptyPageAbility friendsV3EmptyPageAbility = (FriendsV3EmptyPageAbility) this.LLJJ.getValue();
        if (friendsV3EmptyPageAbility != null && friendsV3EmptyPageAbility.cR1()) {
            C0W17.LIZJ("FriendsV3ErrorStatusAssem", "showSkeletonLoading, do not show skeleton when empty page showing");
            return;
        }
        if (this.LLJJIII == null) {
            View viewLIZ = C20675115vJ.LIZ(R.layout.cbn, LJJIJL().getContext());
            if (viewLIZ == null) {
                viewLIZ = C786410Ut5.Td(C786410Ut5.ne(LJJIJL().getContext()), R.layout.cbn, Ho(), false);
            }
            TuxSkeletonLayout tuxSkeletonLayout = viewLIZ instanceof TuxSkeletonLayout ? (TuxSkeletonLayout) viewLIZ : null;
            this.LLJJIII = tuxSkeletonLayout;
            this.LLJJIJI = tuxSkeletonLayout != null ? tuxSkeletonLayout.findViewById(R.id.vip) : null;
        }
        TuxSkeletonLayout tuxSkeletonLayout2 = this.LLJJIII;
        if (tuxSkeletonLayout2 != null) {
            Ho().LIZIZ(tuxSkeletonLayout2);
            tuxSkeletonLayout2.setLoading(true);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showSkeletonLoading, skylightFirstShown=");
        FriendsV3SkylightViewStatusAbility friendsV3SkylightViewStatusAbility = (FriendsV3SkylightViewStatusAbility) this.LLJILLL.getValue();
        sbLIZ.append(friendsV3SkylightViewStatusAbility != null ? Boolean.valueOf(friendsV3SkylightViewStatusAbility.ua1()) : null);
        C0W17.LIZJ("FriendsV3ErrorStatusAssem", C2188811AlT.LIZIZ(sbLIZ));
        View view = this.LLJJIJI;
        if (view != null) {
            FriendsV3SkylightViewStatusAbility friendsV3SkylightViewStatusAbility2 = (FriendsV3SkylightViewStatusAbility) this.LLJILLL.getValue();
            C725890Sdf.LIZIZ(view, (friendsV3SkylightViewStatusAbility2 == null || !friendsV3SkylightViewStatusAbility2.ua1()) && !C0IVP.LIZ());
        }
        Ho().LJ();
        C339190DRl.LIZLLL(Ho());
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3ListStatusAbility
    public final void QM2() {
        C0W17.LIZJ("FriendsV3ErrorStatusAssem", "onSkylightFirstShow");
        View view = this.LLJJIJI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    public void R() {
        C0W17.LIZJ("FriendsV3ErrorStatusAssem", "hideStatusView");
        C339190DRl.LIZIZ(Ho());
        TuxSkeletonLayout tuxSkeletonLayout = this.LLJJIII;
        if (tuxSkeletonLayout != null) {
            tuxSkeletonLayout.setLoading(false);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), FriendsV3ListStatusAbility.class, null);
        }
    }

    public void Jo(Throwable th) {
        Drawable drawableLIZ;
        Context context;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        View viewLJJIJL = LJJIJL();
        if (viewLJJIJL != null && (viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) viewLJJIJL.findViewById(R.id.hto)) != null) {
            C786410Ut5.LLF(8, viewOnAttachStateChangeListenerC20604515jv);
        }
        C0W17.LIZJ("FriendsV3ErrorStatusAssem", "showErrorView");
        if (this.LLJJIJIIJIL == null) {
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C1749280vcc c1749280vccHo = Ho();
            if (c1749280vccHo != null && (context = c1749280vccHo.getContext()) != null) {
                C0HTI c0hti = new C0HTI();
                c0hti.LIZ = R.drawable.nl;
                drawableLIZ = c0hti.LIZ(context);
            } else {
                drawableLIZ = null;
            }
            c1722300uv6.LIZJ = 2;
            c1722300uv6.LIZ = drawableLIZ;
            c1722300uv6.LJI = Ho().getContext().getString(2131838839);
            c1722300uv6.LJIIIIZZ = Ho().getContext().getString(2131838837);
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(75));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(75));
            c1722300uv6.LIZLLL = iLIZIZ;
            c1722300uv6.LJ = iLIZIZ2;
            c1722300uv6.LJIIIZ = new AwS603S0100000_24(this, 82);
            c1722300uv6.LJIIJ = new AwS603S0100000_24(this, 83);
            this.LLJJIJIIJIL = c1722300uv6;
        }
        C1722300uv6 c1722300uv62 = this.LLJJIJIIJIL;
        if (c1722300uv62 != null) {
            Ho().setStatus(c1722300uv62);
            TuxSkeletonLayout tuxSkeletonLayout = this.LLJJIII;
            if (tuxSkeletonLayout != null) {
                tuxSkeletonLayout.setLoading(false);
            }
            C339190DRl.LIZLLL(Ho());
        }
        C1749280vcc c1749280vccHo2 = Ho();
        if (c1749280vccHo2 != null) {
            HandlerHook.viewPost(c1749280vccHo2, new ARunnableS124S0100000_24(this, 30));
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, FriendsV3ListStatusAbility.class, null, null);
        }
        Ho().setLayoutVariant(1);
        Lo();
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0qwa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1223430hwT) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 37), 4);
        AssemViewModel.asyncSubscribe$default(Go(), new C2217381BqS() { // from class: X.0qwc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1223430hwT c1223430hwT = (C1223430hwT) obj;
                c1223430hwT.getClass();
                return C627260Oiy.LIZLLL(c1223430hwT);
            }
        }, this, null, new AwS603S0100000_24(this, 80), new AwS568S0100000_24(this, 543), new AwS603S0100000_24(this, 81), 4, null);
        Go().asyncSubscribe(new C2217381BqS() { // from class: X.0qwd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1223430hwT c1223430hwT = (C1223430hwT) obj;
                c1223430hwT.getClass();
                return C627260Oiy.LIZJ(c1223430hwT);
            }
        }, this, C736820SvI.LIZLLL(), AFwS264S0000000_24.get$arr$(162), AFwS213S0000000_24.get$arr$(181), AFwS264S0000000_24.get$arr$(161));
    }
}
