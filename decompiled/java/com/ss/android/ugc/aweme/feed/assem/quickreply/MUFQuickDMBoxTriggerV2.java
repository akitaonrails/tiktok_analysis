package com.ss.android.ugc.aweme.feed.assem.quickreply;

import X.C01GW;
import X.C03H5;
import X.C0QSJ;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C1908940zm8;
import X.C19719912Dl;
import X.C1A1F;
import X.C1A1K;
import X.C2217381BqS;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C688590Qzh;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C702420Rgu;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC687730QyJ;
import X.InterfaceC699970Rcx;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AFwS289S0000000_6;
import kotlin.jvm.internal.AFwS321S0000000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class MUFQuickDMBoxTriggerV2 extends BaseCellTriggerComponent<MUFQuickDMBoxTriggerV2> implements PriorityProtocol, IMUFQuickDMBoxSourceAbility, InterfaceC699970Rcx, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public static final C1908940zm8 LLJZIJLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLL;
    public final /* synthetic */ C702420Rgu LLJJLIIIJLLLLLLLZ = new C702420Rgu();
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2170));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2169));
    public final C01GW LLJLILLLLZIIL = C737910Sx3.LIZJ(this, C13LE.LIZ(MUFQuickReplyViewModel.class), AFwS279S0000000_33.get$arr$(118));
    public final InterfaceC1731706qJ LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public C1A1K LLJZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MUFQuickDMBoxTriggerV2.class, "quickDMViewModel", "getQuickDMViewModel()Lcom/ss/android/ugc/aweme/feed/assem/quickreply/QuickDMViewModel;", 0);
        C13LE.LIZ.getClass();
        LLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJZIJLIL = new C1908940zm8();
    }

    public MUFQuickDMBoxTriggerV2() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(QuickDMViewModel.class);
        this.LLJLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, C1637806bA.LIZ, new AwS577S0100000_33(c19719912DlLIZ, 2171), null, AFwS279S0000000_33.get$arr$(117));
        this.LLJLLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), AFwS279S0000000_33.get$arr$(119));
        this.LLJLLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS279S0000000_33.get$arr$(120));
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "bottom_button_dm_quick_reply";
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C700450Rdj Ke1() {
        return null;
    }

    @Override // X.C0RJM
    public final boolean Kj() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean YZ() {
        return false;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{QuickDMFeedReplyScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(QuickDMFeedReplyScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(QuickDMFeedReplyScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(MUFQuickDMBoxAssemV2.class);
    }

    @Override // X.InterfaceC699970Rcx
    public final boolean l5(boolean z) {
        return this.LLJJLIIIJLLLLLLLZ.l5(z);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean lk2() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1261074875) {
            return null;
        }
        return this;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return "bottom_button_dm_quick_reply";
    }

    @Override // X.InterfaceC699970Rcx
    public final boolean Nm() {
        return this.LLJJLIIIJLLLLLLLZ.LL;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return !C1A1F.LIZIZ(((VideoItemParams) (this.LLJI != null ? r0.LL : null)).mEventType);
    }

    public final MUFQuickReplyViewModel yp() {
        return (MUFQuickReplyViewModel) this.LLJLILLLLZIIL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        C688590Qzh.LIZLLL(this);
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final View Vt() {
        return LJJIJL();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        C688590Qzh.LIZJ(this);
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        C688590Qzh.LIZIZ(this);
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return Vt();
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.quickreply.IMUFQuickDMBoxSourceAbility
    public final C1A1K gU0() {
        return this.LLJZ;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Object obj;
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0NzT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C709790Rsn) obj2).LLILLL;
            }
        }, null, AFwS321S0000000_33.get$arr$(40), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0Nl4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C709790Rsn) obj2).LLILZ;
            }
        }, C736820SvI.LIZLLL(), AFwS289S0000000_6.get$arr$(52), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLIL.getValue(), new C2217381BqS() { // from class: X.0cFl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C1ELP) obj2).LLILZIL;
            }
        }, null, AFwS321S0000000_33.get$arr$(42), 6);
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (C1A1F.LIZIZ(((VideoItemParams) obj).mEventType)) {
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLIL.getValue(), new C2217381BqS() { // from class: X.0SCc
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj2) {
                    return ((C1ELP) obj2).LLJJI;
                }
            }, null, AFwS321S0000000_33.get$arr$(5), 6);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void tp(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        tp(videoItemParams);
        if (lp(videoItemParams)) {
            PriorityAbility priorityAbility = (PriorityAbility) this.LLJL.getValue();
            if (priorityAbility != null) {
                priorityAbility.Vx0(this, new AwS612S0100000_33(this, 68), AFwS279S0000000_33.get$arr$(116));
                return;
            }
            return;
        }
        C786410Ut5.LJLLLLLL(8, LJJIJL());
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        if (r1.LJFF(r0) != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean up(com.ss.android.ugc.aweme.feed.model.VideoItemParams r6) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.quickreply.MUFQuickDMBoxTriggerV2.up(com.ss.android.ugc.aweme.feed.model.VideoItemParams):boolean");
    }

    public final void zp(C1A1K c1a1k) {
        this.LLJZ = c1a1k;
        if (c1a1k != C1A1K.FRIENDS_STABLE_SHOW) {
            PriorityAbility priorityAbility = (PriorityAbility) this.LLJL.getValue();
            if (priorityAbility != null) {
                priorityAbility.nw0(this, true);
            }
            FeedBottomButtonAbility feedBottomButtonAbility = (FeedBottomButtonAbility) this.LLJLIL.getValue();
            if (feedBottomButtonAbility != null) {
                feedBottomButtonAbility.Ds2();
            }
        }
    }
}
