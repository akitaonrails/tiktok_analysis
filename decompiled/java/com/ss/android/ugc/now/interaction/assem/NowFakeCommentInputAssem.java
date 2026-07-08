package com.ss.android.ugc.now.interaction.assem;

import X.C019F;
import X.C01GW;
import X.C03IT;
import X.C0WZX;
import X.C1344030l4z;
import X.C1352140lI4;
import X.C1352150lI5;
import X.C1352160lI6;
import X.C1352460lIa;
import X.C1352810lJ9;
import X.C1353510lKH;
import X.C1354870lMT;
import X.C13LE;
import X.C1402120mag;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C1848410yCV;
import X.C19719912Dl;
import X.C19EG;
import X.C19EH;
import X.C2204961BRm;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C2217381BqS;
import X.C427660Gpo;
import X.C452230HoL;
import X.C452250HoN;
import X.C452501pT;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C946803n0;
import X.InterfaceC1554640qYg;
import X.InterfaceC1603190roz;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import Y.ACListenerS155S0100000_21;
import Y.ACListenerS56S0101000_21;
import Y.ATListenerS454S0100000_21;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import avg.f;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.NowKeyboardFragment;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.NowKeyboardVM;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS23S0600000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.AwS635S0100000_21;
import mf.a;

/* JADX INFO: loaded from: classes22.dex */
public final class NowFakeCommentInputAssem extends UISlotAssem implements IFakeKeyboardInputAssemAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public C427660Gpo LLJJI;
    public FrameLayout LLJJIII;
    public TuxIconView LLJJIJI;
    public C1353510lKH LLJJIJIIJIL;
    public C1352460lIa LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public Comment LLJLIL;
    public String LLJLILLLLZIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(NowFakeCommentInputAssem.class, "commentListVM", "getCommentListVM()Lcom/ss/android/ugc/now/interaction/assem/CommentListVM;", 0);
        C13LE.LIZ.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public NowFakeCommentInputAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(NowKeyboardVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJJ = C452501pT.LIZIZ(new AwS23S0600000_19(this, c19719912DlLIZ, c1637906bB, new C452230HoL(c19719912DlLIZ), new C452250HoN(), (Function0) null, 68));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(CommentListVM.class);
        C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ2, 2027), AFwS259S0000000_21.get$arr$(297), null, true);
        this.LLJJJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1119));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1122));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1123));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1121));
        this.LLJJL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1120));
        this.LLJL = CardStruct.IStatusCode.DEFAULT;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a3z;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -430695812) {
            return null;
        }
        return this;
    }

    public final C1353510lKH hp() {
        return (C1353510lKH) this.LLJJL.getValue();
    }

    public final C1352460lIa ip() {
        C1352460lIa c1352460lIa = this.LLJJIJIL;
        return c1352460lIa == null ? C1352810lJ9.LIZ(this) : c1352460lIa;
    }

    public final NowKeyboardVM kp() {
        return (NowKeyboardVM) this.LLJJJ.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.now.interaction.assem.IFakeKeyboardInputAssemAbility
    public final void dr(C1352460lIa c1352460lIa) {
        this.LLJJIJIL = c1352460lIa;
    }

    public final void lp(C1352140lI4 c1352140lI4) {
        C19EG activity;
        int i;
        int childCount;
        C19EH c19ehLJIIJ;
        View childAt;
        Fragment fragmentLIZ = C946803n0.LIZ(hp());
        if (fragmentLIZ != null && (activity = fragmentLIZ.getActivity()) != null) {
            C1344030l4z.LIZJ("xjccccc", "showKeyboardFragment click input ");
            View view = null;
            if (c1352140lI4 != null) {
                c1352140lI4.LIZIZ = C2204961BRm.M(hp(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3Y2ayk6aP6tcZ7NyDus9jTyrBoGO/cwE6YTV5n/OmDjrvAAoCjN3YtMHsVnRMY=", null));
            }
            String str = NowKeyboardFragment._pnsPageId;
            C1352460lIa c1352460lIaIp = ip();
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1352160lI6 c1352160lI6 = C1352150lI5.LIZ;
            if (c1352160lI6.LIZIZ == 0) {
                c1352160lI6.LIZIZ = jCurrentTimeMillis;
            }
            SAFHelper.LIZ.getClass();
            if (SAFHelper.LJIIJ() && (activity instanceof InterfaceC1603190roz)) {
                i = R.id.tyd;
            } else {
                i = android.R.id.content;
            }
            ViewGroup viewGroup = (ViewGroup) activity.findViewById(i);
            if (viewGroup != null) {
                childCount = viewGroup.getChildCount();
            } else {
                childCount = 0;
            }
            boolean z = false;
            int i2 = -1;
            for (int i3 = 0; i3 < childCount; i3++) {
                if (viewGroup != null && (childAt = viewGroup.getChildAt(i3)) != null) {
                    if (childAt.getId() == R.id.pg6) {
                        i2 = i3;
                        view = childAt;
                        z = true;
                    } else {
                        childAt.getId();
                    }
                }
            }
            if (z && viewGroup != null) {
                C786410Ut5.LJJLIL(i2, viewGroup);
                viewGroup.addView(view);
            }
            Window window = activity.getWindow();
            if (window != null) {
                window.setSoftInputMode(48);
            }
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Fragment fragmentLJJJJZI = supportFragmentManager.LJJJJZI("NowKeyboardFragment");
            View viewFindViewById = activity.findViewById(R.id.pg6);
            if ((fragmentLJJJJZI instanceof NowKeyboardFragment) && viewFindViewById != null) {
                NowKeyboardFragment nowKeyboardFragment = (NowKeyboardFragment) fragmentLJJJJZI;
                nowKeyboardFragment.dr(c1352460lIaIp);
                nowKeyboardFragment.LLIZ = c1352140lI4;
                nowKeyboardFragment.VR();
                return;
            }
            if (fragmentLJJJJZI != null && (c19ehLJIIJ = supportFragmentManager.LJIIJ()) != null) {
                c19ehLJIIJ.LJIIZILJ(fragmentLJJJJZI);
                c19ehLJIIJ.LJIIJ();
            }
            if (viewFindViewById == null) {
                FrameLayout frameLayout = new FrameLayout(activity);
                frameLayout.setId(R.id.pg6);
                if (viewGroup != null) {
                    viewGroup.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
                }
            }
            NowKeyboardFragment nowKeyboardFragment2 = new NowKeyboardFragment();
            nowKeyboardFragment2.dr(c1352460lIaIp);
            nowKeyboardFragment2.LLIZ = c1352140lI4;
            C19EH c19ehLJIIJ2 = supportFragmentManager.LJIIJ();
            if (c19ehLJIIJ2 != null) {
                c19ehLJIIJ2.LIZJ(R.id.pg6, nowKeyboardFragment2, "NowKeyboardFragment");
                c19ehLJIIJ2.LJIIJ();
            }
            nowKeyboardFragment2.VR();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int iLJJI;
        String aid;
        String enterFrom;
        Aweme aweme;
        C03IT c03itLIZ = C1354870lMT.LIZ(((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUser());
        if (c03itLIZ != null) {
            C427660Gpo.LJIIJJI((C427660Gpo) this.LLJJJJ.getValue(), c03itLIZ, false, null, null, false, false, null, null, false, null, 1006);
        }
        C786410Ut5.LJLLLLLL(0, (View) this.LLJJJJLIIL.getValue());
        hp().setFocusable(false);
        hp().setFocusableInTouchMode(false);
        hp().setInputType(0);
        hp().addTextChangedListener(new C1402120mag(this, 15));
        hp().setOnTouchListener(new ATListenerS454S0100000_21(this, 20));
        C1353510lKH c1353510lKHHp = hp();
        View.OnClickListener aCListenerS155S0100000_21 = new ACListenerS155S0100000_21(this, 216);
        if (C1848410yCV.LIZ) {
            aCListenerS155S0100000_21 = new f(aCListenerS155S0100000_21);
        }
        a aVar = new a(aCListenerS155S0100000_21);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1353510lKHHp);
        }
        c1353510lKHHp.setOnClickListener(aVar);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0lHz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1352050lHv) obj).LLJILJIL;
            }
        }, null, new AwS635S0100000_21(this, 153), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0lIE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1352050lHv) obj).LLJJIII;
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 154), 4);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0lID
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1352050lHv) obj).LLJJ;
            }
        }, C736820SvI.LIZLLL(), new AwS616S0100000_2(this, 125), 4);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0lHy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1352050lHv) obj).LLJILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 148), 4);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0lIA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1352050lHv) obj).LLJ;
            }
        }, null, new AwS635S0100000_21(this, 149), 6);
        C786410Ut5.I7(new ACListenerS155S0100000_21(this, 215), (View) this.LLJJJJLIIL.getValue());
        NowFeedMobHierarchyData nowFeedMobHierarchyData = ip().LLILZIL;
        if (nowFeedMobHierarchyData != null && (enterFrom = nowFeedMobHierarchyData.getEnterFrom()) != null && !enterFrom.equals("from_music")) {
            FeedCommonService feedCommonService = (FeedCommonService) ServiceManager.get().getService(FeedCommonService.class);
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            C1352460lIa c1352460lIaIp = ip();
            if (c1352460lIaIp != null) {
                aweme = c1352460lIaIp.LL;
            } else {
                aweme = null;
            }
            iLJJI = feedCommonService.LJJI(c19egLIZ, aweme);
        } else {
            iLJJI = -1;
        }
        C786410Ut5.O7((FrameLayout) this.LLJJJJJIL.getValue(), new ACListenerS56S0101000_21(this, iLJJI, 4));
        Aweme aweme2 = ip().LL;
        if (aweme2 == null || (aid = aweme2.getAid()) == null) {
            aid = CardStruct.IStatusCode.DEFAULT;
        }
        this.LLJL = aid;
    }
}
