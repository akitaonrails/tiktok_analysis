package com.bytedance.ies.ugc.aweme.commercialize.compliance.thirdpartyadconsent.entry;

import X.AbstractC1387200mCc;
import X.C01GW;
import X.C0SZ8;
import X.C0T4X;
import X.C0TOM;
import X.C10GR;
import X.C1388190mED;
import X.C1389300mG0;
import X.C1566140qrE;
import X.C1668306g5;
import X.C1906580ziK;
import X.C19EG;
import X.C299750Boz;
import X.C452501pT;
import X.C630740Ooa;
import X.EnumC452301pR;
import X.InterfaceC1565950qqv;
import X.InterfaceC1616070s9l;
import android.app.Activity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.api.ICommercializeComplianceApi;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.ThirdPartyAdConsentPromptModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.thirdpartyadconsent.viewmodel.ThirdPartyAdConsentViewModel;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS130S0110000_12;
import kotlin.jvm.internal.AwS31S0202000_12;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class ThirdPartyAdConsentPanelComponent extends BasePanelComponent implements InterfaceC1616070s9l {
    public final C01GW LL;

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onBeforePageChange() {
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageScrolledEnd(int i, float f, int i2) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageSelected(int i, boolean z) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageUnSelected(C0SZ8 c0sz8) {
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onScrollToItemStart(int i) {
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onScrollToItemStart(int i, boolean z) {
    }

    public ThirdPartyAdConsentPanelComponent() {
        C01GW c01gwLIZIZ;
        if (C299750Boz.LIZ()) {
            C630740Ooa c630740Ooa = new C630740Ooa(EnumC452301pR.PUBLICATION, new AwS556S0100000_12((InterfaceC1565950qqv) this, 355), null);
            C1566140qrE.LIZJ(this, c630740Ooa);
            c01gwLIZIZ = c630740Ooa;
        } else {
            c01gwLIZIZ = C452501pT.LIZIZ(new AwS130S0110000_12(false, (InterfaceC1565950qqv) this, 8));
        }
        this.LL = c01gwLIZIZ;
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.AbstractC738140SxQ
    public final void onDestroy() {
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        super.onDestroy();
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LL.getValue();
        if (iFeedPanelPlatformAbility == null || (iViewPagerComponentAbilityMb = iFeedPanelPlatformAbility.Mb()) == null) {
            return;
        }
        iViewPagerComponentAbilityMb.Xl0(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        super.onParentViewCreated();
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LL.getValue();
        if (iFeedPanelPlatformAbility == null || (iViewPagerComponentAbilityMb = iFeedPanelPlatformAbility.Mb()) == null) {
            return;
        }
        iViewPagerComponentAbilityMb.Bv0(this);
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        final int i2;
        Activity activityLIZIZ;
        final C19EG c19egLIZIZ;
        String aid;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbility;
        IViewPagerComponentAbility iViewPagerComponentAbilityMb;
        ThirdPartyAdConsentPromptModel thirdPartyAdConsentPromptModel;
        Integer num;
        ThirdPartyAdConsentPromptModel thirdPartyAdConsentPromptModel2;
        Integer num2;
        Aweme awemeLJIIIIZZ;
        int iIntValue = 0;
        if (C1389300mG0.LJIIIIZZ(getPanelContext())) {
            i2 = 1;
        } else if (C1389300mG0.LJIL(getPanelContext())) {
            i2 = 0;
        } else {
            i2 = -1;
        }
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ)) != null) {
            Set<String> set = C0T4X.LIZ;
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility2 = (IFeedPanelPlatformAbility) this.LL.getValue();
            if (iFeedPanelPlatformAbility2 != null && (awemeLJIIIIZZ = iFeedPanelPlatformAbility2.LJIIIIZZ()) != null) {
                aid = awemeLJIIIIZZ.getAid();
            } else {
                aid = null;
            }
            if (!C0T4X.LIZJ) {
                C0TOM c0tom = C0TOM.LIZ;
                c0tom.getClass();
                AdPersonalitySettings adPersonalitySettingsLIZIZ = C0TOM.LIZIZ();
                if (adPersonalitySettingsLIZIZ != null && (thirdPartyAdConsentPromptModel = adPersonalitySettingsLIZIZ.thirdPartyAdConsentPromptConfig) != null && (num = thirdPartyAdConsentPromptModel.triggerVideoCount) != null && num.intValue() > 0) {
                    if (aid != null) {
                        Set<String> set2 = C0T4X.LIZ;
                        if (!set2.contains(aid)) {
                            set2.add(aid);
                            int i3 = C0T4X.LIZIZ + 1;
                            C0T4X.LIZIZ = i3;
                            c0tom.getClass();
                            AdPersonalitySettings adPersonalitySettingsLIZIZ2 = C0TOM.LIZIZ();
                            if (adPersonalitySettingsLIZIZ2 != null && (thirdPartyAdConsentPromptModel2 = adPersonalitySettingsLIZIZ2.thirdPartyAdConsentPromptConfig) != null && (num2 = thirdPartyAdConsentPromptModel2.triggerVideoCount) != null) {
                                iIntValue = num2.intValue();
                            }
                            if (i3 > iIntValue) {
                                PopupManager.LJIIZILJ(new C10GR(i2, c19egLIZIZ) { // from class: X.0TQY
                                    public final C19EG LL;
                                    public final int LLILLJJLI;
                                    public final int LLILLL = 140;

                                    @Override // X.InterfaceC20660415sw
                                    public final C688120Qyw i2() {
                                        C19EG c19eg = this.LL;
                                        return new C688120Qyw(c19eg, c19eg, null);
                                    }

                                    @Override // X.InterfaceC20660515sx
                                    public final int getPriority() {
                                        return this.LLILLL;
                                    }

                                    {
                                        this.LL = c19egLIZIZ;
                                        this.LLILLJJLI = i2;
                                    }

                                    @Override // X.InterfaceC20659015si
                                    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                                        ThirdPartyAdConsentPromptModel thirdPartyAdConsentPromptModel3;
                                        Integer num3;
                                        C746500TQa c746500TQa;
                                        FragmentManager supportFragmentManager;
                                        C19EG c19egLIZIZ2 = c688120Qyw.LIZIZ();
                                        if (c19egLIZIZ2 != null) {
                                            C746520TQc c746520TQc = C746520TQc.LIZ;
                                            int i4 = this.LLILLJJLI;
                                            c746520TQc.getClass();
                                            C0TOM.LIZ.getClass();
                                            AdPersonalitySettings adPersonalitySettingsLIZIZ3 = C0TOM.LIZIZ();
                                            if (adPersonalitySettingsLIZIZ3 != null && (thirdPartyAdConsentPromptModel3 = adPersonalitySettingsLIZIZ3.thirdPartyAdConsentPromptConfig) != null && (num3 = thirdPartyAdConsentPromptModel3.promptStyle) != null && (num3.intValue() == 1 || num3.intValue() == 2 || num3.intValue() == 3)) {
                                                int iIntValue2 = num3.intValue();
                                                ThirdPartyAdConsentViewModel thirdPartyAdConsentViewModel = (ThirdPartyAdConsentViewModel) new ViewModelProvider(c19egLIZIZ2).get(ThirdPartyAdConsentViewModel.class);
                                                if (thirdPartyAdConsentViewModel == null) {
                                                    c20656615sK.LIZ();
                                                    return;
                                                }
                                                if (iIntValue2 != 1) {
                                                    if (iIntValue2 != 2) {
                                                        if (iIntValue2 != 3) {
                                                            c20656615sK.LIZ();
                                                            return;
                                                        }
                                                        c746500TQa = new C746500TQa(c19egLIZIZ2.getString(2131821992), C1697810uHb.LJIIJJI(new C746510TQb(R.raw.icon_disco_ball, c19egLIZIZ2.getString(2131821986)), new C746510TQb(R.raw.icon_heart, c19egLIZIZ2.getString(2131821987)), new C746510TQb(R.raw.icon_control, c19egLIZIZ2.getString(2131821988))), c19egLIZIZ2.getString(2131821991), c19egLIZIZ2.getString(2131821989), c19egLIZIZ2.getString(2131821990));
                                                    } else {
                                                        c746500TQa = new C746500TQa(c19egLIZIZ2.getString(2131821985), C1697810uHb.LJIIJJI(new C746510TQb(R.raw.icon_disco_ball, c19egLIZIZ2.getString(2131821979)), new C746510TQb(R.raw.icon_heart, c19egLIZIZ2.getString(2131821980)), new C746510TQb(R.raw.icon_control, c19egLIZIZ2.getString(2131821981))), c19egLIZIZ2.getString(2131821984), c19egLIZIZ2.getString(2131821982), c19egLIZIZ2.getString(2131821983));
                                                    }
                                                } else {
                                                    c746500TQa = new C746500TQa(c19egLIZIZ2.getString(2131821978), C1697810uHb.LJIIJJI(new C746510TQb(R.raw.icon_disco_ball, c19egLIZIZ2.getString(2131821972)), new C746510TQb(R.raw.icon_emoji_happy, c19egLIZIZ2.getString(2131821973)), new C746510TQb(R.raw.icon_control, c19egLIZIZ2.getString(2131821974))), c19egLIZIZ2.getString(2131821977), c19egLIZIZ2.getString(2131821975), c19egLIZIZ2.getString(2131821976));
                                                }
                                                C746520TQc.LIZIZ = false;
                                                AwS31S0202000_12 awS31S0202000_12 = new AwS31S0202000_12(new C013C(), i4, iIntValue2, c20656615sK, 1);
                                                TuxTextView tuxTextView = new TuxTextView(c19egLIZIZ2, null, 6, 0);
                                                tuxTextView.setText(c746500TQa.LIZJ);
                                                tuxTextView.setTuxFont(81);
                                                tuxTextView.setGravity(1);
                                                tuxTextView.setTextColorRes(R.attr.a1k);
                                                tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                                                C1391960mKI c1391960mKI = new C1391960mKI();
                                                C0HTI c0hti = new C0HTI();
                                                c0hti.LIZ = R.drawable.f625yd;
                                                c1391960mKI.LIZLLL = c0hti.LIZ(c19egLIZIZ2);
                                                c1391960mKI.LJI = 1;
                                                c1391960mKI.LJII = c746500TQa.LIZ;
                                                List<C746510TQb> list = c746500TQa.LIZIZ;
                                                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                                                int i5 = 0;
                                                for (C746510TQb c746510TQb : list) {
                                                    int i6 = i5 + 1;
                                                    if (i5 >= 0) {
                                                        C746510TQb c746510TQb2 = c746510TQb;
                                                        arrayList.add(new C1391890mKB(c746510TQb2.LIZIZ, Integer.valueOf(c746510TQb2.LIZ), null, 4));
                                                        i5 = i6;
                                                    } else {
                                                        C1697810uHb.LJIJI();
                                                        throw null;
                                                    }
                                                }
                                                C1391890mKB[] c1391890mKBArr = (C1391890mKB[]) arrayList.toArray(new C1391890mKB[0]);
                                                c1391960mKI.LJIIIZ = C13LQ.LJJLL(Arrays.copyOf(c1391890mKBArr, c1391890mKBArr.length));
                                                c1391960mKI.LJIILL = tuxTextView;
                                                c1391960mKI.LIZ = true;
                                                c1391960mKI.LJIILJJIL = true;
                                                c1391960mKI.LIZJ(c746500TQa.LJ, new C746530TQd(i4, iIntValue2));
                                                c1391960mKI.LIZIZ(c746500TQa.LIZLLL, new C0TQZ(thirdPartyAdConsentViewModel, i4, iIntValue2));
                                                C439850HMp c439850HMpLIZ = c1391960mKI.LIZ();
                                                DialogInterfaceOnDismissListenerC786080UsY dialogInterfaceOnDismissListenerC786080UsY = new DialogInterfaceOnDismissListenerC786080UsY(awS31S0202000_12, 46);
                                                TuxPanel tuxPanel = c439850HMpLIZ.LIZ;
                                                tuxPanel.LLILZIL = dialogInterfaceOnDismissListenerC786080UsY;
                                                tuxPanel.LLILZLL = new DialogInterfaceOnCancelListenerC786010UsR(awS31S0202000_12, 8);
                                                C19EG c19egLIZIZ3 = C1388190mED.LIZIZ(c19egLIZIZ2);
                                                if (c19egLIZIZ3 != null && (supportFragmentManager = c19egLIZIZ3.getSupportFragmentManager()) != null) {
                                                    try {
                                                        ((ICommercializeComplianceApi) thirdPartyAdConsentViewModel.LL.getValue()).report3PConsentPromptShow().enqueue(new InterfaceC594300NSq<BaseResponse>() { // from class: X.06L0
                                                            @Override // X.InterfaceC594300NSq
                                                            public final void onResponse(C0X9S<BaseResponse> c0x9s, C0X52<BaseResponse> c0x52) {
                                                            }

                                                            @Override // X.InterfaceC594300NSq
                                                            public final void onFailure(C0X9S<BaseResponse> c0x9s, Throwable th) {
                                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                                sbLIZ.append("report3PConsentPromptShow failed: ");
                                                                sbLIZ.append(th.getMessage());
                                                                C1022620cia.LIZ("ThirdPartyAdReConsentPrompt", C2188811AlT.LIZIZ(sbLIZ));
                                                            }
                                                        });
                                                    } catch (Exception e) {
                                                        TryCatchGuardChecker.doCheck(e);
                                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                        sbLIZ.append("report3PConsentPromptShow exception: ");
                                                        sbLIZ.append(e.getMessage());
                                                        C1022620cia.LIZ("ThirdPartyAdReConsentPrompt", C2188811AlT.LIZIZ(sbLIZ));
                                                    }
                                                    tuxPanel.show(supportFragmentManager, "ThirdPartyAdConsentViewModel");
                                                    C746520TQc.LIZ.getClass();
                                                    C2344009Gk c2344009Gk = new C2344009Gk();
                                                    c2344009Gk.LIZJ(i4, "enter_from");
                                                    c2344009Gk.LIZJ(iIntValue2, "prompt_type");
                                                    C20684815ws.LJIILLIIL("show_3p_ad_reconsent_prompt", c2344009Gk.LIZ);
                                                    return;
                                                }
                                                c20656615sK.LIZ();
                                                return;
                                            }
                                            c20656615sK.LIZ();
                                            return;
                                        }
                                        c20656615sK.LIZ();
                                    }
                                }, new C1668306g5("privacy_and_compliance_3p_ads_consent_prompt"));
                                C0T4X.LIZJ = true;
                            }
                        }
                    }
                } else {
                    C0T4X.LIZJ = true;
                }
            }
            if (C0T4X.LIZJ && (iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) this.LL.getValue()) != null && (iViewPagerComponentAbilityMb = iFeedPanelPlatformAbility.Mb()) != null) {
                iViewPagerComponentAbilityMb.Xl0(this);
            }
        }
    }
}
