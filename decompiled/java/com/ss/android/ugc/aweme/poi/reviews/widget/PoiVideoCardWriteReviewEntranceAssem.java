package com.ss.android.ugc.aweme.poi.reviews.widget;

import X.AbstractC1189550h3p;
import X.C019F;
import X.C01GW;
import X.C1209000hZC;
import X.C1367960lha;
import X.C1388190mED;
import X.C1389890mGx;
import X.C13LE;
import X.C1440005kM;
import X.C1548820qPI;
import X.C1558520qew;
import X.C1578630rBN;
import X.C1637806bA;
import X.C1871910yoP;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C262100zr;
import X.C339190DRl;
import X.C452501pT;
import X.C586460MzM;
import X.C694180RKu;
import X.C698840Rb8;
import X.C699500RcC;
import X.C700450Rdj;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC1192370h8N;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import Y.AAListenerS329S0100000_18;
import Y.ARunnableS118S0100000_18;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.bubblelist.IBubbleListAssemAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AFwS302S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiVideoCardWriteReviewEntranceAssem extends BaseCellContentComponent<PoiVideoCardWriteReviewEntranceAssem> implements ComponentPriorityProtocol, InterfaceC1141530foN {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1997));
    public final C01GW LLJJL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS256S0000000_18.get$arr$(639));
    public final ARunnableS118S0100000_18 LLJJLIIIJLLLLLLLZ = new ARunnableS118S0100000_18(this, 43);
    public InterfaceC1192370h8N LLJL;
    public ObjectAnimator LLJLIL;
    public ObjectAnimator LLJLILLLLZIIL;
    public boolean LLJLL;
    public final InterfaceC1731706qJ LLJLLIL;
    public final AwS562S0100000_18 LLJLLL;

    public static final class PoiWriteReviewViewModel extends AssemViewModel<InterfaceC0148002o> {
        public final Map<String, String> LL = new LinkedHashMap();
        public final Map<String, String> LLILLJJLI = new LinkedHashMap();

        @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
        public final InterfaceC0148002o defaultState() {
            return new C1209000hZC(2);
        }

        public PoiWriteReviewViewModel() {
            new LinkedHashMap();
        }
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiVideoCardWriteReviewEntranceAssem.class, "reviewVm", "getReviewVm()Lcom/ss/android/ugc/aweme/poi/reviews/widget/PoiVideoCardWriteReviewEntranceAssem$PoiWriteReviewViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiVideoCardWriteReviewEntranceAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiWriteReviewViewModel.class);
        this.LLJLLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1998), null, AFwS256S0000000_18.get$arr$(638));
        this.LLJLLL = new AwS562S0100000_18(this, 1999);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "left_container_poi_write_review_card";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        return false;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C700450Rdj vN0() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    public final IBubbleListAssemAbility ep() {
        return (IBubbleListAssemAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IBubbleListAssemAbility.class, null);
    }

    public final void hp() {
        if (!C1578630rBN.LJIIIZ(this) && Bo()) {
            ObjectAnimator objectAnimator = this.LLJLILLLLZIIL;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(LJJIJL(), "alpha", 1.0f, 0.0f);
            this.LLJLILLLLZIIL = objectAnimatorOfFloat;
            if (objectAnimatorOfFloat != null) {
                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            }
            ObjectAnimator objectAnimator2 = this.LLJLILLLLZIIL;
            if (objectAnimator2 != null) {
                objectAnimator2.setDuration(200L);
            }
            ObjectAnimator objectAnimator3 = this.LLJLILLLLZIIL;
            if (objectAnimator3 != null) {
                objectAnimator3.addListener(new AAListenerS329S0100000_18(this, 3));
            }
            ObjectAnimator objectAnimator4 = this.LLJLILLLLZIIL;
            if (objectAnimator4 != null) {
                C786410Ut5.Pd(objectAnimator4);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        if (Bo()) {
            HandlerHook.viewRemoveCallbacks(LJJIJL(), this.LLJJLIIIJLLLLLLLZ);
            ObjectAnimator objectAnimator = this.LLJLIL;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            ObjectAnimator objectAnimator2 = this.LLJLILLLLZIIL;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    public final void ip(boolean z) {
        View view;
        View viewFindViewById;
        int i;
        C698840Rb8 c698840Rb8 = C698840Rb8.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        }
        Aweme aweme = ((VideoItemParams) obj).getAweme();
        c698840Rb8.getClass();
        if (!C698840Rb8.LIZ(aweme, true)) {
            return;
        }
        Object parent = LJJIJL().getParent().getParent();
        if ((parent instanceof View) && (view = (View) parent) != null && (viewFindViewById = view.findViewById(R.id.bm5)) != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, viewFindViewById);
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        Boolean boolValueOf;
        String strLJFF;
        boolean zLIZIZ;
        if (Bo() && Intrinsics.LJFF(c262100zr.LIZ, "closeReviewSubmitPage")) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            String strLJFF2 = null;
            if (interfaceC1107590evd != null) {
                boolValueOf = Boolean.valueOf(C1871910yoP.LIZIZ(interfaceC1107590evd, "isSubmitReviewSuccess", false));
            } else {
                boolValueOf = null;
            }
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            if (interfaceC1107590evd2 == null || (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd2, "originalPostSource", "")) == null) {
                strLJFF = "";
            }
            InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
            if (interfaceC1107590evd3 != null) {
                zLIZIZ = C1871910yoP.LIZIZ(interfaceC1107590evd3, "isFinalPage", false);
            } else {
                zLIZIZ = false;
            }
            C1367960lha.LIZ.getClass();
            AbstractC1189550h3p abstractC1189550h3pLJJZ = C1367960lha.LIZ().LJJZ();
            if (abstractC1189550h3pLJJZ != null && abstractC1189550h3pLJJZ.LIZIZ(strLJFF)) {
                if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                    C19EG c19egLIZIZ = C1388190mED.LIZIZ(LJJIJL().getContext());
                    if (c19egLIZIZ == null || c19egLIZIZ.isDestroyed()) {
                        return;
                    }
                    if (LJJIJL().getVisibility() == 0) {
                        HandlerHook.viewRemoveCallbacks(LJJIJL(), this.LLJJLIIIJLLLLLLLZ);
                        C339190DRl.LIZIZ(LJJIJL());
                        IBubbleListAssemAbility iBubbleListAssemAbilityEp = ep();
                        if (iBubbleListAssemAbilityEp != null) {
                            iBubbleListAssemAbilityEp.tt0(false);
                        }
                        ip(true);
                    }
                    InterfaceC1107590evd interfaceC1107590evd4 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd4 != null) {
                        strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd4, "poiID", "");
                    }
                    C1440005kM.LIZ(new C586460MzM(strLJFF2));
                    if (zLIZIZ) {
                        C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
                        c1389890mGx.LJIIIZ(2131858029);
                        c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
                        c1389890mGx.LJII(R.attr.a0i);
                        c1389890mGx.LJIIJJI();
                    } else {
                        return;
                    }
                } else if (!zLIZIZ) {
                    return;
                }
                C1548820qPI.LJIIIIZZ("closeReviewSubmitPage", this);
            }
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        if (!Bo()) {
            return;
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJL.getValue(), new C2217381BqS() { // from class: X.0hQb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, AFwS302S0000000_18.get$arr$(10), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJL.getValue(), new C2217381BqS() { // from class: X.0hQd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, AFwS302S0000000_18.get$arr$(11), 6);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJJJJLIIL.getValue();
        if (interactAreaCommonAbility != null) {
            interactAreaCommonAbility.zB1(this);
        }
        InterfaceC1192370h8N interfaceC1192370h8N = this.LLJL;
        if (interfaceC1192370h8N != null) {
            interfaceC1192370h8N.resetStar();
        }
    }
}
