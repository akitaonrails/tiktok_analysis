package com.ss.android.ugc.aweme.hangout.component.interact.view;

import X.AnonymousClass0956;
import X.C019F;
import X.C01GW;
import X.C05P0;
import X.C0KZA;
import X.C1143680frq;
import X.C1324720kZq;
import X.C13LE;
import X.C1637806bA;
import X.C1669670tYD;
import X.C19719212De;
import X.C19719912Dl;
import X.C20028913Yh;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452501pT;
import X.C477860Ioa;
import X.C477870Iob;
import X.C478090Iox;
import X.C479140Iqe;
import X.C479760Ire;
import X.C481390IuH;
import X.C481410IuJ;
import X.C500260Jjc;
import X.C724240Sb0;
import X.C724750Sbp;
import X.CountDownTimerC521500Kcm;
import X.EnumC1427810nG7;
import X.EnumC1668010tVX;
import X.InterfaceC1680500tpg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC479210Iql;
import X.InterfaceC479240Iqo;
import Y.AObjectS350S0100000_7;
import Y.ARunnableS107S0100000_7;
import Y.ATListenerS441S0100000_7;
import android.view.View;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.feed.api.HangoutModuleReShowEvent;
import com.bytedance.android.live.liveinteract.multilive.social.model.RecommendedRoom;
import com.bytedance.android.livesdk.hangout.HangoutRandomMatchPanelFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.HangoutCmpGuidePanelEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.HangoutTopliveNewUserGuideEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TopliveHangoutInteractGuideTimesSetting;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.hangout.common.contract.LiveHangoutV2SelectableSlotAssem;
import com.ss.android.ugc.aweme.hangout.component.interact.viewmodel.MultiTopLiveRandomMatchViewModel;
import com.ss.android.ugc.aweme.toplive.assem.multi.HangoutPlayGuideDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS408S0200000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS621S0100000_7;
import kotlin.text.u;
import webcast.api.feed.MGModuleInteraction;

/* JADX INFO: loaded from: classes8.dex */
public final class HangoutInteractModuleV2Assem extends LiveHangoutV2SelectableSlotAssem implements InterfaceC479210Iql, InterfaceC479240Iqo {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLII;
    public final AssemVMLazy LLJJIII;
    public final C01GW LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final C01GW LLJJJ;
    public boolean LLJJJIL;
    public float LLJJJJ;
    public float LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public C1324720kZq LLJLL;
    public C1324720kZq LLJLLIL;
    public C481390IuH LLJLLL;
    public ARunnableS107S0100000_7 LLJZ;
    public HangoutRandomMatchPanelFragment LLJZIJLIL;
    public AnonymousClass0956 LLL;
    public long LLLF;
    public String LLLFF;
    public String LLLFFI;
    public String LLLFZ;
    public volatile boolean LLLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HangoutInteractModuleV2Assem.class, "randomMatchViewModel", "getRandomMatchViewModel()Lcom/ss/android/ugc/aweme/hangout/component/interact/viewmodel/MultiTopLiveRandomMatchViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public HangoutInteractModuleV2Assem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MultiTopLiveRandomMatchViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS551S0100000_7(c19719912DlLIZ, 192), AFwS237S0000000_7.get$arr$(72), null, true);
        this.LLJJIJI = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(125));
        this.LLJJJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 191));
        this.LLJJL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 193));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(126));
        this.LLJL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(124));
        this.LLJLIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 190));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 189));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return HangoutTopliveNewUserGuideEnableSetting.INSTANCE.value() == 2 ? R.layout.dih : R.layout.dig;
    }

    @Override // X.InterfaceC479240Iqo
    public final void LJJLIIIIJ() {
        C20441214yg.LIZIZ("InteractModuleV2Assem", "onConfigurationChanged");
    }

    @Override // X.InterfaceC479210Iql
    public final void LLLLIILL() {
        C20441214yg.LIZIZ("InteractModuleV2Assem", "onUnSelected");
        this.LLJJIJIIJIL = false;
        C478090Iox c478090Iox = (C478090Iox) this.LLJJJ.getValue();
        if (c478090Iox != null) {
            c478090Iox.LIZLLL();
        }
        this.LLJJJIL = false;
    }

    public final MultiTopLiveRandomMatchViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLII;
        return (MultiTopLiveRandomMatchViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C20441214yg.LIZIZ("InteractModuleV2Assem", "onDestroy");
        AnonymousClass0956 anonymousClass0956 = this.LLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLL = null;
        ip().xQ2("onDestroy");
        this.LLJZIJLIL = null;
        this.LLLI = false;
        this.LLLFFI = null;
        this.LLLFZ = null;
        this.LLLFF = null;
        ARunnableS107S0100000_7 aRunnableS107S0100000_7 = this.LLJZ;
        if (aRunnableS107S0100000_7 != null) {
            LinkedHashSet<Runnable> linkedHashSet = C479760Ire.LJIJJLI;
            synchronized (linkedHashSet) {
                try {
                    linkedHashSet.remove(aRunnableS107S0100000_7);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        this.LLJZ = null;
        this.LLJLLL = null;
        C478090Iox c478090Iox = (C478090Iox) this.LLJJJ.getValue();
        if (c478090Iox != null) {
            c478090Iox.LIZLLL();
        }
        super.onDestroy();
    }

    public final void sp() {
        if (this.LLJJIJIIJIL) {
            return;
        }
        tp((MGModuleInteraction) this.LLJJLIIIJLLLLLLLZ.getValue(), 1);
        tp((MGModuleInteraction) this.LLJL.getValue(), 2);
        this.LLJJIJIIJIL = true;
    }

    public final void mp(MGModuleInteraction mGModuleInteraction) {
        EnumC1668010tVX enumC1668010tVX;
        C477860Ioa.LJIIIIZZ("click", this.LLJJIJIL);
        int i = ((Keva) this.LLJJIJI.getValue()).getInt("guide_dialog_showed_times", 0);
        if (i < TopliveHangoutInteractGuideTimesSetting.INSTANCE.getValue() && HangoutCmpGuidePanelEnableSetting.INSTANCE.enable()) {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI == null) {
                C20441214yg.LJ("MultiTopLiveInteractAssem", "openHangoutPlayGuide: fragment is null");
            } else {
                FragmentManager childFragmentManager = fragmentLJI.getChildFragmentManager();
                if (childFragmentManager == null) {
                    C20441214yg.LJ("MultiTopLiveInteractAssem", "openHangoutPlayGuide: fragmentManager is null");
                } else {
                    C477860Ioa.LIZJ(0L, "random_match_landing_page", "show");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getMatchTypeByModuleItemType: ");
                    sbLIZ.append(mGModuleInteraction.type);
                    C20441214yg.LIZIZ("InteractModuleV2Assem", C2188811AlT.LIZIZ(sbLIZ));
                    int i2 = mGModuleInteraction.type;
                    if (i2 != 1) {
                        if (i2 != 3) {
                            enumC1668010tVX = EnumC1668010tVX.RANDOM_CHAT;
                        } else {
                            enumC1668010tVX = EnumC1668010tVX.RANDOM_CHAT;
                        }
                    } else {
                        enumC1668010tVX = EnumC1668010tVX.DATING;
                    }
                    AwS408S0200000_7 awS408S0200000_7 = new AwS408S0200000_7(this, mGModuleInteraction, 42);
                    AFwS193S0000000_7 aFwS193S0000000_7 = AFwS193S0000000_7.get$arr$(245);
                    HangoutPlayGuideDialogFragment hangoutPlayGuideDialogFragment = new HangoutPlayGuideDialogFragment();
                    hangoutPlayGuideDialogFragment.LL = awS408S0200000_7;
                    hangoutPlayGuideDialogFragment.LLILLL = enumC1668010tVX;
                    hangoutPlayGuideDialogFragment.LLILLJJLI = aFwS193S0000000_7;
                    hangoutPlayGuideDialogFragment.show(childFragmentManager, "HangoutPlayGuideDialogFragment");
                }
            }
            ((Keva) this.LLJJIJI.getValue()).storeInt("guide_dialog_showed_times", i + 1);
            return;
        }
        up(mGModuleInteraction);
    }

    @Override // com.ss.android.ugc.aweme.hangout.common.contract.LiveHangoutV2SelectableSlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C20441214yg.LIZIZ("InteractModuleV2Assem", "onViewCreated");
        super.onViewCreated(view);
        if (HangoutTopliveNewUserGuideEnableSetting.INSTANCE.value() == 2) {
            ComposeView composeView = (ComposeView) view.findViewById(R.id.eo6);
            if (composeView == null) {
                C20441214yg.LJIIL("InteractModuleV2Assem", "compose_interact_module view not found; CMP UI skipped");
            } else {
                boolean z = C479760Ire.LJIJI;
                boolean zLIZ = C479140Iqe.LIZ();
                final AwS621S0100000_7 awS621S0100000_7 = new AwS621S0100000_7(this, 58);
                final C05P0 c05p0LJI = C20028913Yh.LJI(Boolean.valueOf(zLIZ));
                C1669670tYD.LJ(composeView, EnumC1427810nG7.Dark, new C19719212De(-1383763632, new Function2<InterfaceC1680500tpg, Integer, Unit>() { // from class: X.0MAI
                    @Override // kotlin.jvm.functions.Function2
                    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
                        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
                        if ((num.intValue() & 3) == 2 && interfaceC1680500tpg2.LIZ()) {
                            interfaceC1680500tpg2.LIZJ();
                        } else {
                            C1674960tgk.LIZIZ(6, 0, interfaceC1680500tpg2, c.LJ(InterfaceC1685750ty9.LIZ, 1.0f), awS621S0100000_7, c05p0LJI.getValue().booleanValue());
                        }
                        return Unit.LIZ;
                    }
                }, true));
                this.LLJLLL = new C481390IuH(new AObjectS350S0100000_7(c05p0LJI, 106));
                if (zLIZ) {
                    ARunnableS107S0100000_7 aRunnableS107S0100000_7 = new ARunnableS107S0100000_7(this, 165);
                    this.LLJZ = aRunnableS107S0100000_7;
                    LinkedHashSet<Runnable> linkedHashSet = C479760Ire.LJIJJLI;
                    synchronized (linkedHashSet) {
                        try {
                            linkedHashSet.add(aRunnableS107S0100000_7);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            }
            getContentView().setOnTouchListener(new ATListenerS441S0100000_7(this, 9));
            DataChannelGlobal.LLILZ.BQ2(this, this, HangoutModuleReShowEvent.class, new AwS586S0100000_7(this, 210));
            return;
        }
        this.LLJLL = (C1324720kZq) getContentView().findViewById(R.id.lsa);
        this.LLJLLIL = (C1324720kZq) getContentView().findViewById(R.id.le6);
        C1143680frq.LIZLLL(this.LLJLL, "tiktok_live_interaction_normal_3", "bg_interact_random_chat.png");
        C1143680frq.LIZLLL(this.LLJLLIL, "tiktok_live_interaction_normal_3", "bg_interact_dating.png");
        C500260Jjc.LJLIIIL(500L, (View) this.LLJLIL.getValue(), new AwS586S0100000_7(this, 356));
        C500260Jjc.LJLIIIL(500L, (View) this.LLJLILLLLZIIL.getValue(), new AwS586S0100000_7(this, 358));
        getContentView().setOnTouchListener(new ATListenerS441S0100000_7(this, 9));
        DataChannelGlobal.LLILZ.BQ2(this, this, HangoutModuleReShowEvent.class, new AwS586S0100000_7(this, 211));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(final webcast.api.feed.MGModuleInteraction r5) {
        /*
            r4 = this;
            com.bytedance.android.livesdk.hangout.HangoutRandomMatchPanelFragment r0 = r4.LLJZIJLIL
            r2 = 0
            if (r0 == 0) goto L20
            boolean r1 = r0.isAdded()
            r0 = 1
            if (r1 != r0) goto L20
        Lc:
            java.lang.String r1 = "InteractModuleV2Assem"
            if (r0 != 0) goto L67
            boolean r0 = r4.LLLI
            if (r0 != 0) goto L67
            androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r4)
            if (r0 != 0) goto L22
            java.lang.String r0 = "openRandomMatchSheet: fragment is null"
            X.C20441214yg.LJ(r1, r0)
            return
        L20:
            r0 = 0
            goto Lc
        L22:
            androidx.fragment.app.FragmentManager r3 = r0.getChildFragmentManager()
            java.lang.String r1 = r5.name
            r0 = 2
            com.bytedance.android.livesdk.hangout.HangoutRandomMatchPanelFragment r2 = X.C0JSW.LIZ(r1, r2, r0)
            r4.LLJZIJLIL = r2
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r0 = r0.user()
            com.bytedance.android.live.base.model.user.User r0 = r0.LJIJJLI()
            if (r0 == 0) goto L65
            com.bytedance.android.live.base.model.ImageModel r0 = r0.getAvatarThumb()
            if (r0 == 0) goto L65
            java.util.List r0 = r0.getUrls()
            if (r0 == 0) goto L65
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            java.lang.String r0 = (java.lang.String) r0
        L4f:
            r2.LLJJIJI = r0
            kotlin.jvm.internal.AwS621S0100000_7 r1 = new kotlin.jvm.internal.AwS621S0100000_7
            r0 = 25
            r1.<init>(r4, r0)
            r2.LLILZIL = r1
            X.0IuG r0 = new X.0IuG
            r0.<init>(r4)
            r2.LLJJIII = r0
            r2.NR(r3)
            return
        L65:
            r0 = 0
            goto L4f
        L67:
            java.lang.String r0 = "openRandomMatchSheet: panel already showing or entering room, skip"
            X.C20441214yg.LIZIZ(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.hangout.component.interact.view.HangoutInteractModuleV2Assem.up(webcast.api.feed.MGModuleInteraction):void");
    }

    public final void lp(C481410IuJ c481410IuJ, MGModuleInteraction mGModuleInteraction) {
        RecommendedRoom recommendedRoom;
        if (ip().LLILZLL || this.LLLI || (recommendedRoom = c481410IuJ.LIZ) == null) {
            return;
        }
        kp(recommendedRoom, (List) ip().LLILZ.getValue(), mGModuleInteraction, c481410IuJ.LIZIZ, false);
    }

    public final void op(MGModuleInteraction mGModuleInteraction, int i) {
        String strLJJIFFI = u.LJJIFFI(mGModuleInteraction.name, "hangout_mg_agg_playlabel_", "", false);
        C477860Ioa.LJIIIZ(new C477870Iob("interact_module", "playlabel", strLJJIFFI, null, Integer.valueOf((int) mGModuleInteraction.count), null, null, null, null, strLJJIFFI, strLJJIFFI, mGModuleInteraction.title, Integer.valueOf(i), "InteractModuleV2Assem#logModuleClick", null, 16384), null, null, 6);
    }

    public final void tp(MGModuleInteraction mGModuleInteraction, int i) {
        String strLJJIFFI = u.LJJIFFI(mGModuleInteraction.name, "hangout_mg_agg_playlabel_", "", false);
        C477860Ioa.LJIIJ(new C477870Iob("interact_module", "playlabel", strLJJIFFI, null, Integer.valueOf((int) mGModuleInteraction.count), null, null, null, null, strLJJIFFI, strLJJIFFI, mGModuleInteraction.title, Integer.valueOf(i), "InteractModuleV2Assem#logModuleShow", null, 16384), null);
    }

    @Override // X.InterfaceC479210Iql
    public final void u(boolean z, boolean z2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSelected, hasInitTopTab: ");
        sbLIZ.append(z2);
        C20441214yg.LIZIZ("InteractModuleV2Assem", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJIJIL = z2;
        if (!this.LLJJJIL) {
            this.LLJJJIL = true;
            C478090Iox c478090Iox = (C478090Iox) this.LLJJJ.getValue();
            if (c478090Iox != null) {
                c478090Iox.LJ(4000L);
            }
        }
        sp();
    }

    public final void hp(Long l, String str, Long l2, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLLF;
        String str3 = this.LLLFFI;
        if (str3 == null) {
            str3 = "";
        }
        C477860Ioa.LIZLLL(jCurrentTimeMillis, str3, str, str2, l, l2);
        HangoutRandomMatchPanelFragment hangoutRandomMatchPanelFragment = this.LLJZIJLIL;
        if (hangoutRandomMatchPanelFragment != null) {
            CountDownTimerC521500Kcm countDownTimerC521500Kcm = hangoutRandomMatchPanelFragment.LLJJLIIIJLLLLLLLZ;
            if (countDownTimerC521500Kcm != null) {
                countDownTimerC521500Kcm.cancel();
            }
            C0KZA c0kza = hangoutRandomMatchPanelFragment.LLIZLLLIL;
            if (c0kza != null) {
                c0kza.LIZLLL();
            }
            hangoutRandomMatchPanelFragment.dismiss();
        }
        AnonymousClass0956 anonymousClass0956 = this.LLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLL = null;
        ip().yQ2();
        this.LLJZIJLIL = null;
        this.LLLI = false;
        this.LLLFFI = null;
        this.LLLFZ = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void kp(com.bytedance.android.live.liveinteract.multilive.social.model.RecommendedRoom r41, java.util.List<com.bytedance.android.live.liveinteract.multilive.social.model.RecommendedRoom> r42, webcast.api.feed.MGModuleInteraction r43, java.lang.String r44, boolean r45) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.hangout.component.interact.view.HangoutInteractModuleV2Assem.kp(com.bytedance.android.live.liveinteract.multilive.social.model.RecommendedRoom, java.util.List, webcast.api.feed.MGModuleInteraction, java.lang.String, boolean):void");
    }
}
