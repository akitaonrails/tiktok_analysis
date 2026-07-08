package com.ss.android.ugc.aweme.feed.assem.earlyfeedback;

import X.C01GW;
import X.C0QSJ;
import X.C1155610gB5;
import X.C11NJ;
import X.C11NZ;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C1A19;
import X.C1A1A;
import X.C1A1C;
import X.C1A1E;
import X.C1DDV;
import X.C2188811AlT;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C688590Qzh;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C702420Rgu;
import X.C706240Rn4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC687730QyJ;
import X.InterfaceC699970Rcx;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import Y.AfS197S0100000_28;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.survey.OnboardingSurvey;
import com.ss.android.ugc.aweme.feed.model.survey.PersonalizedOnboardingSurvey;
import com.ss.android.ugc.aweme.service.earlyfeedback.IEarlyFeedbackService;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS321S0000000_33;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class EarlyFeedbackButtonTrigger extends BaseCellTriggerComponent<EarlyFeedbackButtonTrigger> implements EarlyFeedbackTriggerAbility, PriorityProtocol, InterfaceC699970Rcx, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public final /* synthetic */ C702420Rgu LLJJLIIIJLLLLLLLZ = new C702420Rgu();
    public final C01GW LLJL = C452501pT.LIZIZ(new C706240Rn4(this));
    public final C01GW LLJLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(EarlyFeedbackVM.class), new C1A1E());
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new C1A1C());
    public final C11NJ LLJLL = new C11NJ();
    public final C01GW LLJLLIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(89));
    public final ConcurrentHashMap<String, Boolean> LLJLLL = new ConcurrentHashMap<>();

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "bottom_button_early_feedback";
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
        C687700QyG.LIZ(this, new Class[]{EarlyFeedbackScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(EarlyFeedbackScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(EarlyFeedbackScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<EarlyFeedbackButtonAssem> getType() {
        return C13LE.LIZ(EarlyFeedbackButtonAssem.class);
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
        if (str.hashCode() != 1984802179) {
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
        return "bottom_button_early_feedback";
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C700450Rdj Ke1() {
        return new C700450Rdj(new C1A1A(), AFwS321S0000000_33.get$arr$(3), null, 4);
    }

    @Override // X.InterfaceC699970Rcx
    public final boolean Nm() {
        return this.LLJJLIIIJLLLLLLLZ.LL;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        this.LLJLL.LJ();
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

    @Override // X.C0RJL
    public final boolean oh() {
        return C1DDV.LIZ() > 0;
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

    @Override // com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackTriggerAbility
    public final void LLLILZ(Function1<? super Boolean, Unit> function1) {
        this.LLJLL.LJ();
        this.LLJLL.LIZ(((C11NZ) this.LLJLLIL.getValue()).LJJLJLI(new AfS197S0100000_28((AwS610S0100000_31) function1, 14)));
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackTriggerAbility
    public final void LLLLLL(boolean z) {
        PriorityAbility priorityAbility = (PriorityAbility) this.LLJL.getValue();
        if (priorityAbility != null) {
            priorityAbility.nw0(this, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackTriggerAbility
    public final void ei2(String str) {
        this.LLJLLL.put(str, Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        tp(videoItemParams);
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        if (lp(videoItemParams)) {
            if (oh()) {
                l5(false);
            }
            PriorityAbility priorityAbility = (PriorityAbility) this.LLJL.getValue();
            if (priorityAbility != null) {
                priorityAbility.Vx0(this, new C1A19(this), new AwS612S0100000_33(this, 66));
            }
            if (oh()) {
                LLLLLL(false);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        Boolean bool;
        C1155610gB5 c1155610gB5;
        boolean zLJFF;
        String str;
        boolean zBooleanValue;
        Boolean bool2;
        if (Intrinsics.LJFF(videoItemParams.mEventType, "homepage_hot") && !videoItemParams.getAweme().isAd() && !AwemeSaaSExtKt.isLive(videoItemParams.getAweme()) && !AwemeExtKt.isCard(videoItemParams.getAweme())) {
            Aweme aweme = videoItemParams.getAweme();
            if (aweme == null) {
                c1155610gB5 = new C1155610gB5(0);
            } else {
                OnboardingSurvey onboardingSurvey = aweme.getOnboardingSurvey();
                String str2 = null;
                if (onboardingSurvey != null && Intrinsics.LJFF(onboardingSurvey.inExperiment, Boolean.TRUE)) {
                    bool = onboardingSurvey.showSurvey;
                } else {
                    bool = null;
                }
                PersonalizedOnboardingSurvey personalizedOnboardingSurvey = aweme.getPersonalizedOnboardingSurvey();
                if (personalizedOnboardingSurvey != null) {
                    str2 = personalizedOnboardingSurvey.surveyName;
                    zLJFF = Intrinsics.LJFF(personalizedOnboardingSurvey.enablePersonalizedOnboardingSurvey, Boolean.TRUE);
                } else {
                    zLJFF = false;
                }
                c1155610gB5 = new C1155610gB5(str2, zLJFF, bool);
                aweme.getAid();
                Intrinsics.LJFF(c1155610gB5, c1155610gB5);
            }
            IEarlyFeedbackService iEarlyFeedbackService = (IEarlyFeedbackService) this.LLJLILLLLZIIL.getValue();
            if (iEarlyFeedbackService == null) {
                return false;
            }
            boolean zLIZJ = iEarlyFeedbackService.LIZJ(videoItemParams.getAweme().getAid(), c1155610gB5);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("flow: ");
            if (iEarlyFeedbackService.LJI()) {
                str = "Low Active";
            } else {
                str = "NU";
            }
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            String aid = videoItemParams.getAweme().getAid();
            if (aid != null && (bool2 = this.LLJLLL.get(aid)) != null) {
                zBooleanValue = bool2.booleanValue();
            } else {
                zBooleanValue = true;
            }
            if (zLIZJ && zBooleanValue) {
                return true;
            }
        }
        return false;
    }
}
