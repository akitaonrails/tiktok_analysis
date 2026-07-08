package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.interaction;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0HHT;
import X.C0OB8;
import X.C10EU;
import X.C1206504nn;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C337180DJs;
import X.C339190DRl;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C704790Rkj;
import X.C705700RmC;
import X.C724750Sbp;
import X.C729510SjV;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC452301pR;
import X.InterfaceC1361270lWn;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS146S0100000_11;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellUISlotAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment.FriendsV3CommentAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3EventDispatchViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsV3DiggAssem extends BaseFriendsV3CellUISlotAssem<FriendsV3DiggAssem, InterfaceC1361270lWn> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFF;
    public final InterfaceC1731706qJ LLJL;
    public final InterfaceC1731706qJ LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final ACListenerS146S0100000_11 LLLF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsV3DiggAssem.class, "diggVM", "getDiggVM()Lcom/ss/android/ugc/aweme/feed/assem/digg/VideoDiggVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(FriendsV3DiggAssem.class, "eventVM", "getEventVM()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3EventDispatchViewModel;", 0);
        c09r3.getClass();
        LLLFF = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public FriendsV3DiggAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoDiggVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, c1637906bB, new AwS555S0100000_11(c19719912DlLIZ, 451), null, AFwS243S0000000_11.get$arr$(217));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FriendsV3EventDispatchViewModel.class);
        this.LLJLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS555S0100000_11(c19719912DlLIZ2, 452), null, AFwS243S0000000_11.get$arr$(218));
        this.LLJLILLLLZIIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(219));
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLJLL = C452501pT.LIZ(enumC452301pR, new AwS555S0100000_11(this, 447));
        this.LLJLLIL = C452501pT.LIZ(enumC452301pR, new AwS555S0100000_11(this, 448));
        this.LLJLLL = C452501pT.LIZ(enumC452301pR, new AwS555S0100000_11(this, 446));
        this.LLJZ = C452501pT.LIZ(enumC452301pR, new AwS555S0100000_11(this, 445));
        this.LLJZIJLIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(115));
        this.LLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 449));
        this.LLLF = new ACListenerS146S0100000_11(this, 20);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C736680Sv4.LJIIIIZZ(this, tp(), new C2217381BqS() { // from class: X.0Slh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C730490Sl5) obj).LLILLJJLI;
            }
        }, null, AFwS294S0000000_11.get$arr$(17), 6);
        InterfaceC1731706qJ interfaceC1731706qJ = this.LLJLIL;
        InterfaceC2217461Bqa<?>[] interfaceC2217461BqaArr = LLLFF;
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) interfaceC1731706qJ.getValue(this, interfaceC2217461BqaArr[1]), new C2217381BqS() { // from class: X.0Slj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1393390mMb) obj).LL;
            }
        }, null, AFwS294S0000000_11.get$arr$(18), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLIL.getValue(this, interfaceC2217461BqaArr[1]), new C2217381BqS() { // from class: X.0Sli
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1393390mMb) obj).LLILLL;
            }
        }, null, AFwS294S0000000_11.get$arr$(19), 6);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LLJLIL.getValue(this, interfaceC2217461BqaArr[1]), new C2217381BqS() { // from class: X.0Slk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1393390mMb) obj).LLILLJJLI;
            }
        }, this, null, null, null, new AwS590S0100000_11(this, 23), 28, null);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLILLLLZIIL.getValue(), new C2217381BqS() { // from class: X.0STt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLJ;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(16), 4);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return ((Boolean) this.LLJZIJLIL.getValue()).booleanValue() ? R.layout.car : R.layout.caq;
    }

    public final TuxTextView sp() {
        return (TuxTextView) this.LLJLLL.getValue();
    }

    public final VideoDiggVM tp() {
        return (VideoDiggVM) this.LLJL.getValue(this, LLLFF[0]);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C705700RmC.LIZ(this, Oo(), new AwS555S0100000_11(this, 450));
    }

    public final void up() {
        sp().setText(CardStruct.IStatusCode.DEFAULT);
        if (C1206504nn.LIZ()) {
            C337180DJs.LIZ(sp());
        } else {
            C337180DJs.LIZIZ(sp());
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellUISlotAssem, X.InterfaceC712990Rxx
    public final void wr() {
        tp().QQ2(null);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C786410Ut5.I7(this.LLLF, LJJIJL());
        C786410Ut5.O7((FrameLayout) this.LLJZ.getValue(), this.LLLF);
        C786410Ut5.R7((LinearLayout) this.LLJLLIL.getValue(), this.LLLF);
        if (((Boolean) this.LLJZIJLIL.getValue()).booleanValue()) {
            sp().setMaxWidth(((Number) this.LLL.getValue()).intValue());
            LJJIJL().setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0);
            C426750GoL.LJIIIZ(LJJIJL(), null, null, 0, null, false, 27);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(Object obj) {
        Aweme aweme = ((C0OB8) obj).getAweme();
        if (C729510SjV.LJJIJIL(aweme) && C10EU.LJIILLIIL(aweme.getAuthor())) {
            C786410Ut5.LJLLLLLL(8, getContentView());
        } else if (C729510SjV.LJJIJIL(aweme)) {
            C786410Ut5.LJLLLLLL(0, getContentView());
            up();
        } else {
            C786410Ut5.LJLLLLLL(0, getContentView());
            C339190DRl.LIZLLL(sp());
        }
    }

    @Override // X.InterfaceC705620Rm4
    public final boolean va(List<? extends Object> list) {
        int i = FriendsV3CommentAssem.LLJLLIL;
        return !C704790Rkj.LIZ(list);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellUISlotAssem, X.InterfaceC712990Rxx
    public final void vr(Object obj) {
        tp().QQ2(getContext());
    }

    public final void yp(String str) {
        int iLIZIZ;
        if (str == null) {
            return;
        }
        if (Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        } else if (str.length() <= 2) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56));
        } else {
            iLIZIZ = -2;
        }
        View contentView = getContentView();
        ViewGroup.LayoutParams layoutParams = getContentView().getLayoutParams();
        layoutParams.width = iLIZIZ;
        C786410Ut5.W5(contentView, layoutParams);
        if (Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
            C337180DJs.LIZ(sp());
        } else {
            sp().setText(str);
            C339190DRl.LIZLLL(sp());
        }
    }
}
