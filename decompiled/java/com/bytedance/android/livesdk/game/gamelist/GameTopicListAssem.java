package com.bytedance.android.livesdk.game.gamelist;

import X.C019F;
import X.C01GW;
import X.C036E;
import X.C09R3;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewOnClickListenerC1836610xtT;
import Y.ATListenerS446S0100000_12;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS626S0100000_12;
import kotlin.jvm.internal.AwS641S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class GameTopicListAssem extends UIListContentAssem<GameTopicListViewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 43));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 41));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 44));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 196));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 42));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 40));
    public final AssemVMLazy LLJILLL;
    public final AssemVMLazy LLJJ;
    public DataChannelAbility LLJJI;
    public final C01GW LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GameTopicListAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/game/gamelist/GameTopicListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(GameTopicListAssem.class, "searchViewModel", "getSearchViewModel()Lcom/bytedance/android/livesdk/game/gamelist/GameTopicSearchViewModel;", 0);
        c09r3.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public GameTopicListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GameTopicListViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ, 45), AFwS269S0000000_27.get$arr$(30), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(GameTopicSearchViewModel.class);
        this.LLJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ2, 39), AFwS269S0000000_27.get$arr$(29), null, true);
        this.LLJJIII = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(79));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLIZLLLIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = false;
        return c20603715jn;
    }

    public final String No() {
        return (String) this.LLJJIII.getValue();
    }

    public final LiveEditText Oo() {
        return (LiveEditText) this.LLJIJIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: So, reason: merged with bridge method [inline-methods] */
    public final GameTopicListViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (GameTopicListViewModel) assemVMLazy.getValue();
    }

    public final void Lo() {
        getContext();
        try {
            if (C036E.LIZ.LIZIZ()) {
                ((ViewOnClickListenerC1836610xtT) this.LLJILJIL.getValue()).LIZLLL();
                C786410Ut5.LJZL(0, (LinearLayout) this.LLJ.getValue());
                Oo().setEnabled(false);
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        ((ViewOnClickListenerC1836610xtT) this.LLJILJIL.getValue()).LJII();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        this.LLJJI = (DataChannelAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), DataChannelAbility.class, null);
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        viewOnAttachStateChangeListenerC20604515jvGo.LJIILJJIL(GameTopicCell.class);
        viewOnAttachStateChangeListenerC20604515jvGo.setItemAnimator(null);
        viewOnAttachStateChangeListenerC20604515jvGo.setLayoutManager(new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jvGo.getContext(), 1, false));
        viewOnAttachStateChangeListenerC20604515jvGo.setLifecycleOwner(this);
        viewOnAttachStateChangeListenerC20604515jvGo.LJIJJ();
        viewOnAttachStateChangeListenerC20604515jvGo.LJIJI();
        AssemVMLazy assemVMLazy = this.LLJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0xSE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2002407ss) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS641S0100000_27(this, 8), 4);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0xS8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1819630xS5) obj).LL);
            }
        }, C736820SvI.LIZLLL(), new AwS641S0100000_27(this, 9), 4);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0xSA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1819630xS5) obj).LLILLJJLI);
            }
        }, C736820SvI.LIZLLL(), new AwS641S0100000_27(this, 10), 4);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0xS9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1819630xS5) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS626S0100000_12(this, 18), 4);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0xS7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1819630xS5) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), new AwS626S0100000_12(this, 17), 4);
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.0xSC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1819630xS5 c1819630xS5 = (C1819630xS5) obj;
                c1819630xS5.getClass();
                return C627260Oiy.LIZLLL(c1819630xS5);
            }
        }, null, new AwS606S0100000_27(this, 66), new AwS556S0100000_12(this, 295), new AwS606S0100000_27(this, 67), 2, null);
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.0xSD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1819630xS5 c1819630xS5 = (C1819630xS5) obj;
                c1819630xS5.getClass();
                return C627260Oiy.LIZJ(c1819630xS5);
            }
        }, null, null, null, new AwS606S0100000_27(this, 68), 14, null);
        ((View) this.LLJILJILJ.getValue()).setOnTouchListener(new ATListenerS446S0100000_12(this, 28));
        Go().setOnTouchListener(new ATListenerS446S0100000_12(this, 29));
    }
}
