package com.ss.android.ugc.aweme.feed.landscape.component.profile;

import X.C019F;
import X.C01GW;
import X.C04JD;
import X.C09R3;
import X.C1390410mHn;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C20603715jn;
import X.C20607315kN;
import X.C21673919s1;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1749320vcg;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS146S0100000_11;
import Y.ARunnableS23S0110000_4;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeViewPagerSelectedAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.profile.LandscapeProfileListAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS618S0100000_4;
import kotlin.jvm.internal.AwS653S0100000_4;

/* JADX INFO: loaded from: classes32.dex */
public final class LandscapeProfileListAssem extends UIListContentAssem<LandscapeProfileListViewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 646));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 654));
    public final AssemVMLazy LLJI;
    public final AssemVMLazy LLJIJIL;
    public C1390410mHn LLJILJIL;
    public C1390410mHn LLJILJILJ;
    public C1390410mHn LLJILLL;
    public C1749280vcc LLJJ;
    public View LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LandscapeProfileListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/feed/landscape/component/profile/LandscapeProfileListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(LandscapeProfileListAssem.class, "selectedVM", "getSelectedVM()Lcom/ss/android/ugc/aweme/feed/landscape/component/profile/LandscapeProfileListSelectViewModel;", 0);
        c09r3.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public LandscapeProfileListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LandscapeProfileListViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS575S0100000_31(c19719912DlLIZ, 652), AFwS276S0000000_31.get$arr$(122), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(LandscapeProfileListSelectViewModel.class);
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS575S0100000_31(c19719912DlLIZ2, 653), AFwS276S0000000_31.get$arr$(123), null, true);
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLIZLLLIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = false;
        c20603715jn.LIZ = 0;
        return c20603715jn;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Lo, reason: merged with bridge method [inline-methods] */
    public final LandscapeProfileListViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (LandscapeProfileListViewModel) assemVMLazy.getValue();
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class LandscapeProfileListLayoutManager extends LinearLayoutManager {
        public final C04JD LL;

        public LandscapeProfileListLayoutManager(Context context) {
            super(context, 1, false);
            this.LL = new C04JD(context, 0);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
            C04JD c04jd = this.LL;
            c04jd.LIZ = i;
            startSmoothScroll(c04jd);
        }
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Go().LJIILJJIL(LandscapeProfileListCell.class);
        C1390410mHn c1390410mHn = null;
        Go().setItemAnimator(null);
        Go().setLayoutManager(new LandscapeProfileListLayoutManager(getContext()));
        View viewSd = C786410Ut5.Sd(R.layout.d0j, C786410Ut5.ne(getContext()), null);
        this.LLJJI = viewSd;
        if (viewSd != null) {
            C786410Ut5.LJLLLLLL(8, viewSd);
        }
        View view2 = this.LLJJI;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS146S0100000_11(this, 95), view2);
        }
        Context context = getContext();
        if (context != null) {
            C1390410mHn c1390410mHn2 = new C1390410mHn(context, null, 6);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)));
            layoutParams.gravity = 1;
            C786410Ut5.V6(c1390410mHn2, layoutParams);
            c1390410mHn = c1390410mHn2;
        }
        this.LLJILJILJ = c1390410mHn;
        Go().LIZLLL(this.LLJILJILJ);
        Go().LIZLLL(this.LLJJI);
        this.LLJILLL = (C1390410mHn) view.findViewById(R.id.nnp);
        C1749280vcc c1749280vcc = (C1749280vcc) view.findViewById(R.id.w28);
        this.LLJJ = c1749280vcc;
        if (c1749280vcc != null) {
            c1749280vcc.LIZIZ(this.LLJILLL);
        }
        C1749280vcc c1749280vcc2 = this.LLJJ;
        if (c1749280vcc2 != null) {
            c1749280vcc2.LIZ(new InterfaceC1749320vcg() { // from class: X.15j7
                @Override // X.InterfaceC1749320vcg
                public final void hide() {
                    C1390410mHn c1390410mHn3 = this.LIZ.LLJILLL;
                    if (c1390410mHn3 != null) {
                        C786410Ut5.LLLZZIL(c1390410mHn3, 4);
                    }
                    C1390410mHn c1390410mHn4 = this.LIZ.LLJILLL;
                    if (c1390410mHn4 != null) {
                        c1390410mHn4.LIZLLL();
                    }
                }

                @Override // X.InterfaceC1749320vcg
                public final void show() {
                    C1390410mHn c1390410mHn3 = this.LIZ.LLJILLL;
                    if (c1390410mHn3 != null) {
                        C786410Ut5.LLLZZIL(c1390410mHn3, 0);
                    }
                    C1390410mHn c1390410mHn4 = this.LIZ.LLJILLL;
                    if (c1390410mHn4 != null) {
                        c1390410mHn4.LIZJ();
                    }
                }
            });
        }
        C1390410mHn c1390410mHn3 = (C1390410mHn) view.findViewById(R.id.jjv);
        this.LLJILJIL = c1390410mHn3;
        if (c1390410mHn3 != null) {
            C786410Ut5.LLLZZIL(c1390410mHn3, 8);
        }
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        C736680Sv4.LJIIIZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0SeU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C712380Rwy) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0SeV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C712380Rwy) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS653S0100000_4(this, 3), 8);
        getOwnLifecycleOwner();
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.15j6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C326020CqG c326020CqG = (C326020CqG) obj;
                c326020CqG.getClass();
                return C627260Oiy.LIZIZ(c326020CqG);
            }
        }, this, null, new AwS610S0100000_31(this, 193), new AwS575S0100000_31(this, 648), new AwS610S0100000_31(this, 194), 4, null);
        Go().LJII(new C20607315kN() { // from class: X.0Dao
            @Override // X.C20607315kN
            public final void LJI(boolean z) {
                int i;
                View view3 = this.LL.LLJJI;
                if (view3 != null) {
                    if (z) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    C786410Ut5.LJLLLLLL(i, view3);
                }
            }

            @Override // X.C20607315kN
            public final void LJIIIZ(boolean z) {
                LandscapeProfileListAssem landscapeProfileListAssem = this.LL;
                int i = 0;
                HandlerHook.viewPost(landscapeProfileListAssem.Go(), new ARunnableS23S0110000_4(landscapeProfileListAssem, false, 1));
                View view3 = this.LL.LLJJI;
                if (view3 != null) {
                    if (z) {
                        i = 8;
                    }
                    C786410Ut5.LJLLLLLL(i, view3);
                }
            }
        });
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.0Dap
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C326020CqG c326020CqG = (C326020CqG) obj;
                c326020CqG.getClass();
                return C627260Oiy.LIZLLL(c326020CqG);
            }
        }, this, null, new AwS610S0100000_31(this, 195), new AwS575S0100000_31(this, 651), new AwS610S0100000_31(this, 196), 4, null);
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.15j5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C326020CqG c326020CqG = (C326020CqG) obj;
                c326020CqG.getClass();
                return C627260Oiy.LIZJ(c326020CqG);
            }
        }, this, null, new AwS610S0100000_31(this, 191), new AwS575S0100000_31(this, 647), new AwS610S0100000_31(this, 192), 4, null);
        LandscapeViewPagerSelectedAbility landscapeViewPagerSelectedAbility = (LandscapeViewPagerSelectedAbility) this.LLJ.getValue();
        if (landscapeViewPagerSelectedAbility != null) {
            landscapeViewPagerSelectedAbility.RI(this, new AwS618S0100000_4(this, 10));
        }
    }
}
