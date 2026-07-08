package com.ss.android.ugc.aweme.feed.component.surveybutton;

import X.C019F;
import X.C01GW;
import X.C0P4Y;
import X.C13LE;
import X.C1566140qrE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C299750Boz;
import X.C452501pT;
import X.C584960Mww;
import X.C587470N2j;
import X.C599890Nfv;
import X.C600080NgE;
import X.C603370NlX;
import X.C628500Oky;
import X.C630740Ooa;
import X.C724750Sbp;
import X.EnumC452301pR;
import X.InterfaceC1565950qqv;
import X.InterfaceC2217461Bqa;
import X.InterfaceC603390NlZ;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS127S0110000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class FeedBottomSurveyButtonComponent extends BasePanelComponent {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C01GW LL;
    public final C630740Ooa LLILLJJLI;
    public final AssemVMLazy LLILLL;
    public final C603370NlX LLILZ;
    public final C0P4Y LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FeedBottomSurveyButtonComponent.class, "buttonShowVM", "getButtonShowVM()Lcom/ss/android/ugc/aweme/feed/component/surveybutton/FeedBottomSurveyButtonVM;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FeedBottomSurveyButtonComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS553S0100000_9((InterfaceC1565950qqv) this, 154), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS127S0110000_9(false, (InterfaceC1565950qqv) this, 3));
        }
        this.LL = c01gwLIZIZ;
        this.LLILLJJLI = C628500Oky.LIZ(new AwS553S0100000_9(this, 155));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedBottomSurveyButtonVM.class);
        this.LLILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 153), AFwS240S0000000_9.get$arr$(96), null, true);
        C587470N2j.LIZ.getClass();
        if (C587470N2j.LIZIZ() == 1 || C587470N2j.LIZIZ() == 4) {
            this.LLILZ = new C603370NlX(new C600080NgE(this));
        }
        this.LLILZIL = new C0P4Y(this, 3);
    }

    @Override // X.AbstractC738140SxQ
    public final void onAssemPostCreate() {
        super.onAssemPostCreate();
        C603370NlX c603370NlX = this.LLILZ;
        if (c603370NlX != null) {
            C584960Mww.LIZ.LIZ(c603370NlX);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C603370NlX c603370NlX = this.LLILZ;
        if (c603370NlX != null) {
            C584960Mww.LIZ.LIZ.remove(c603370NlX);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) this.LLILLJJLI.getValue();
        if (iViewPagerComponentAbility != null) {
            iViewPagerComponentAbility.Bv0(this.LLILZIL);
        }
        IViewPagerAbility iViewPagerAbility = (IViewPagerAbility) this.LLILLJJLI.getValue();
        int iLJIL = iViewPagerAbility != null ? iViewPagerAbility.LJIL() : 0;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LL.getValue();
        bo(iLJIL, iFeedPanelPlatformAbility != null ? iFeedPanelPlatformAbility.xy2() : null);
    }

    public final void bo(int i, String str) {
        if (str == null) {
            return;
        }
        if (C599890Nfv.LIZIZ.add(str)) {
            C599890Nfv.LIZIZ().LIZJ("survey_key_vv_gap_count", C599890Nfv.LIZIZ().getInt("survey_key_vv_gap_count", 0) + 1);
        }
        C603370NlX c603370NlX = this.LLILZ;
        if (c603370NlX != null) {
            Iterator<InterfaceC603390NlZ> it2 = c603370NlX.LIZIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ(i, str);
            }
        }
    }
}
