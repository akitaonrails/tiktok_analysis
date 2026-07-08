package com.ss.android.ugc.aweme.mention.ui.assem;

import X.AbstractC1906720ziY;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0AMW;
import X.C0BVD;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C20509915Nh;
import X.C20603715jn;
import X.C20610815kw;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS165S0100000_31;
import Y.AsS56S0100000_31;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.mention.ui.cell.VideoCaptionMentionSearchCell;
import com.ss.android.ugc.aweme.mention.viewmodel.VideoCaptionMentionSearchViewModel;
import com.ss.android.ugc.aweme.mention.viewmodel.VideoCaptionMentionStateViewModel;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS645S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class VideoCaptionMentionSearchListAssem extends UIListContentAssem<VideoCaptionMentionSearchViewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 793));
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public boolean LLJJIJIIJIL;
    public C20509915Nh LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoCaptionMentionSearchListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/mention/viewmodel/VideoCaptionMentionSearchViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(VideoCaptionMentionSearchListAssem.class, "videoCaptionMentionStateVM", "getVideoCaptionMentionStateVM()Lcom/ss/android/ugc/aweme/mention/viewmodel/VideoCaptionMentionStateViewModel;", 0);
        c09r3.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public VideoCaptionMentionSearchListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoCaptionMentionSearchViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS575S0100000_31(c19719912DlLIZ, 797), AFwS276S0000000_31.get$arr$(154), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(VideoCaptionMentionStateViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS575S0100000_31(c19719912DlLIZ2, 789), AFwS276S0000000_31.get$arr$(155), null, true);
        this.LLJIJIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 792));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 796));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 794));
        this.LLJILLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 791));
        this.LLJJ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(223));
        this.LLJJI = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(224));
        this.LLJJIII = C452501pT.LIZIZ(new AwS575S0100000_31(this, 790));
        this.LLJJIJI = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(222));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLIZLLLIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        if (((Boolean) C0AMW.LIZ.getValue()).booleanValue()) {
            C20603715jn c20603715jn = new C20603715jn();
            c20603715jn.LIZ = 5;
            c20603715jn.LIZJ = false;
            return c20603715jn;
        }
        C20603715jn c20603715jn2 = new C20603715jn();
        c20603715jn2.LIZ = 5;
        c20603715jn2.LIZLLL = LoadingFooterCell.class;
        c20603715jn2.LIZJ = false;
        return c20603715jn2;
    }

    public final C1749280vcc Lo() {
        return (C1749280vcc) this.LLJIJIL.getValue();
    }

    public final VideoCaptionMentionStateViewModel No() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (VideoCaptionMentionStateViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Oo, reason: merged with bridge method [inline-methods] */
    public final VideoCaptionMentionSearchViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (VideoCaptionMentionSearchViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C20610815kw c20610815kw = C20610815kw.LIZ;
        String str = ip().LL;
        boolean z = No().getState().LLILZLL;
        c20610815kw.getClass();
        C20610815kw.LIZIZ(str, z);
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        viewOnAttachStateChangeListenerC20604515jvGo.LJIILJJIL(VideoCaptionMentionSearchCell.class);
        viewOnAttachStateChangeListenerC20604515jvGo.setItemAnimator(null);
        if (C0BVD.LIZ() && !No().getState().LLILZLL) {
            viewOnAttachStateChangeListenerC20604515jvGo.addOnScrollListener(new AsS56S0100000_31(this, 3));
        }
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.15j4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C325550CpV c325550CpV = (C325550CpV) obj;
                c325550CpV.getClass();
                return C627260Oiy.LIZLLL(c325550CpV);
            }
        }, null, new AwS610S0100000_31(this, 218), new AwS575S0100000_31(this, 795), new AwS610S0100000_31(this, 219), 2, null);
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.15j3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C325550CpV c325550CpV = (C325550CpV) obj;
                c325550CpV.getClass();
                return C627260Oiy.LIZJ(c325550CpV);
            }
        }, null, null, null, new AwS610S0100000_31(this, 220), 14, null);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.15ki
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C325550CpV) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS645S0100000_31(this, 49), 4);
        if (C0BVD.LIZ()) {
            Go().LIZJ((AbstractC1906720ziY) this.LLJJ.getValue());
            Go().LIZJ((AbstractC1906720ziY) this.LLJJI.getValue());
            C736680Sv4.LJIIIIZZ(this, No(), new C2217381BqS() { // from class: X.15kf
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C449310Hjd) obj).LL;
                }
            }, C736820SvI.LIZLLL(), new AwS645S0100000_31(this, 45), 4);
            C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.15kh
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C325550CpV) obj).LLILLL;
                }
            }, C736820SvI.LIZLLL(), new AwS645S0100000_31(this, 46), 4);
        } else {
            C736680Sv4.LJIIIIZZ(this, No(), new C2217381BqS() { // from class: X.15kg
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C449310Hjd) obj).LL;
                }
            }, C736820SvI.LIZLLL(), new AwS645S0100000_31(this, 47), 4);
        }
        C736680Sv4.LJIIIIZZ(this, No(), new C2217381BqS() { // from class: X.15ke
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C449310Hjd) obj).LLIZLLLIL);
            }
        }, C736820SvI.LIZLLL(), new AwS645S0100000_31(this, 48), 4);
    }

    public static void So(VideoCaptionMentionSearchListAssem videoCaptionMentionSearchListAssem, boolean z, String str, String str2, Integer num, Function1 function1, int i) {
        int i2;
        int i3;
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        ACListenerS165S0100000_31 aCListenerS165S0100000_31 = null;
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            function1 = null;
        }
        int i4 = 8;
        if (z) {
            C786410Ut5.LLLZLZ(videoCaptionMentionSearchListAssem.Lo(), 8);
        }
        LinearLayout linearLayout = (LinearLayout) videoCaptionMentionSearchListAssem.LLJILJILJ.getValue();
        if (linearLayout != null) {
            TuxTextView tuxTextView = (TuxTextView) linearLayout.findViewById(R.id.awf);
            if (str.length() == 0) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            C786410Ut5.LLLLZLL(tuxTextView, i2);
            tuxTextView.setText(str);
            if (num != null && tuxTextView.getContext() != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = num.intValue();
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(tuxTextView.getContext());
                tuxIconDrawableLIZ.setBounds(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
                tuxTextView.setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                tuxTextView.setCompoundDrawablesRelative(tuxIconDrawableLIZ, null, null, null);
            }
            TuxTextView tuxTextView2 = (TuxTextView) linearLayout.findViewById(R.id.awe);
            if (str2.length() == 0) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            C786410Ut5.LLLLZLL(tuxTextView2, i3);
            tuxTextView2.setText(str2);
            if (z) {
                i4 = 0;
            }
            C786410Ut5.LJZL(i4, linearLayout);
            if (function1 != null) {
                aCListenerS165S0100000_31 = new ACListenerS165S0100000_31(function1, 78);
            }
            C786410Ut5.R7(linearLayout, aCListenerS165S0100000_31);
        }
    }
}
