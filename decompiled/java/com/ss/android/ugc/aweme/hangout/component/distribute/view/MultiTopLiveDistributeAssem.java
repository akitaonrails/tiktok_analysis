package com.ss.android.ugc.aweme.hangout.component.distribute.view;

import X.C019F;
import X.C01GW;
import X.C09JN;
import X.C0IVR;
import X.C0UO0;
import X.C1161920gLG;
import X.C1308910kAL;
import X.C13LE;
import X.C158B;
import X.C1637806bA;
import X.C1834150xpV;
import X.C19490011Na;
import X.C19719912Dl;
import X.C19EG;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C346270Dhp;
import X.C452501pT;
import X.C472700IgG;
import X.C477340Ink;
import X.C477450Inv;
import X.C477500Io0;
import X.C477750IoP;
import X.C477770IoR;
import X.C477860Ioa;
import X.C477870Iob;
import X.C478090Iox;
import X.C497740JfY;
import X.C500260Jjc;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.EnumC477350Inl;
import X.EnumC477760IoQ;
import X.EnumC479370Ir1;
import X.InterfaceC2217461Bqa;
import X.InterfaceC420801kM;
import X.InterfaceC472680IgE;
import X.InterfaceC472710IgH;
import X.InterfaceC475300IkS;
import X.InterfaceC479190Iqj;
import X.InterfaceC479210Iql;
import X.InterfaceC479240Iqo;
import X.InterfaceC781210Ukh;
import X.RunnableC781530UlD;
import Y.ARunnableS12S1100000_7;
import Y.ATListenerS441S0100000_7;
import Y.AfS27S0301000_7;
import Y.AsS34S0100000_7;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.feed.api.HangoutModuleReShowEvent;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.social.model.RecommendItem;
import com.bytedance.android.live.liveinteract.multilive.social.model.RecommendShowUser;
import com.bytedance.android.livesdk.dataChannel.ViewPagerScrollInterceptionGlobalEvent;
import com.bytedance.android.livesdk.feed.skylight.multi.MultiTopLiveSkylightAdapter;
import com.bytedance.android.livesdk.livesetting.linkmic.HangoutRoomFeedEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.HangoutSkylightShowInviteRoomSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestHangupP2EnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiTopLiveHangoutEnableSkylightSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TiktokLiveTopLiveArchitectureOptSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.message.GuestApplyInfo;
import com.bytedance.android.livesdkapi.TopLiveRandomMatchFragmentDismissEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.hangout.common.contract.LiveHangoutV2SelectableSlotAssem;
import com.ss.android.ugc.aweme.hangout.component.distribute.view.MultiTopLiveDistributeAssem;
import com.ss.android.ugc.aweme.hangout.component.distribute.viewmodel.MultiTopLiveDistributeVM;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS621S0100000_7;
import kotlin.jvm.internal.AwS67S0301000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiTopLiveDistributeAssem extends LiveHangoutV2SelectableSlotAssem implements InterfaceC479190Iqj, InterfaceC479210Iql, InterfaceC479240Iqo {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public final AssemVMLazy LLJJIII;
    public final C01GW LLJJIJI;
    public FrameLayout LLJJIJIIJIL;
    public InterfaceC472710IgH LLJJIJIL;
    public boolean LLJJJ;
    public int LLJJJIL;
    public InterfaceC475300IkS LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public final C01GW LLJJL;
    public C477770IoR LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final Set<String> LLJLL;
    public EnumC477760IoQ LLJLLIL;
    public String LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MultiTopLiveDistributeAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/hangout/component/distribute/viewmodel/MultiTopLiveDistributeVM;", 0);
        C13LE.LIZ.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MultiTopLiveDistributeAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MultiTopLiveDistributeVM.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS551S0100000_7(c19719912DlLIZ, 186), AFwS237S0000000_7.get$arr$(70), null, true);
        this.LLJJIJI = C452501pT.LIZIZ(new AwS551S0100000_7(this, 185));
        this.LLJJL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 184));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(121));
        this.LLJLL = new LinkedHashSet();
        this.LLJLLIL = EnumC477760IoQ.LL;
        this.LLJLLL = "";
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.di6;
    }

    public final void Fp() {
        Fragment fragmentLJI;
        C19EG activity;
        Integer numLIZJ;
        if (!HangoutRoomFeedEnableSetting.INSTANCE.isEnable() || (fragmentLJI = C724240Sb0.LJI(this)) == null || (activity = fragmentLJI.getActivity()) == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.zm, C1834150xpV.LJII(activity))) == null) {
            return;
        }
        int iIntValue = numLIZJ.intValue();
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(activity, ImmersionBar.LJIILJJIL(activity));
        tuxImmersionBar.LJIIIZ(iIntValue);
        tuxImmersionBar.LIZLLL();
    }

    @Override // X.InterfaceC479240Iqo
    public final void LJJLIIIIJ() {
        C477770IoR c477770IoR;
        C20441214yg.LIZIZ("MultiTopLiveDistributeAssem", "onConfigurationChanged");
        InterfaceC472710IgH interfaceC472710IgH = this.LLJJIJIL;
        if (interfaceC472710IgH == null || (c477770IoR = ((C472700IgG) interfaceC472710IgH).LIZJ) == null || c477770IoR.getAdapter() == null) {
            return;
        }
        HandlerHook.viewPost(c477770IoR, new ARunnableS12S1100000_7(c477770IoR, "MultiTopLiveDistributeAssem", 18));
    }

    @Override // X.InterfaceC479210Iql
    public final void LLLLIILL() {
        C20441214yg.LIZIZ("MultiTopLiveDistributeAssem", "onUnSelected");
        this.LLJJJJLIIL = false;
        C478090Iox c478090IoxMp = mp();
        if (c478090IoxMp != null) {
            c478090IoxMp.LIZLLL();
        }
        this.LLJL = false;
        this.LLJLL.clear();
        InterfaceC475300IkS interfaceC475300IkS = this.LLJJJJ;
        if (interfaceC475300IkS != null) {
            interfaceC475300IkS.F2(false);
        }
        this.LLJLIL = false;
        ip();
    }

    public final void ip() {
        FrameLayout frameLayout = this.LLJJIJIIJIL;
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        FrameLayout frameLayout2 = this.LLJJIJIIJIL;
        if (frameLayout2 != null) {
            C786410Ut5.LJZ(8, frameLayout2);
        }
        this.LLJLLIL = EnumC477760IoQ.LL;
        this.LLJLLL = "";
    }

    public final Map<Long, InterfaceC420801kM> lp() {
        return (Map) this.LLJLILLLLZIIL.getValue();
    }

    public final C478090Iox mp() {
        return (C478090Iox) this.LLJJL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C478090Iox c478090IoxMp;
        C20441214yg.LIZIZ("MultiTopLiveDistributeAssem", "onDestroy");
        InterfaceC475300IkS interfaceC475300IkS = this.LLJJJJ;
        if (interfaceC475300IkS != null) {
            interfaceC475300IkS.F2(false);
        }
        this.LLJJJJ = null;
        if (TiktokLiveTopLiveArchitectureOptSetting.INSTANCE.isArchOpt() && this.LLJJJJJIL) {
            this.LLJJJJJIL = false;
            DataChannelGlobal.LLILZ.FQ2(ViewPagerScrollInterceptionGlobalEvent.class, Boolean.FALSE);
        }
        InterfaceC472710IgH interfaceC472710IgH = this.LLJJIJIL;
        if (interfaceC472710IgH != null) {
            C472700IgG c472700IgG = (C472700IgG) interfaceC472710IgH;
            C477770IoR c477770IoR = c472700IgG.LIZJ;
            if (c477770IoR != null) {
                c477770IoR.setAdapter(null);
            }
            c472700IgG.LIZLLL = null;
            c472700IgG.LIZJ = null;
            c472700IgG.LIZIZ = null;
        }
        this.LLJJIJIL = null;
        C477450Inv.LIZLLL((C477340Ink) sp().LLILLL.getValue());
        C477770IoR c477770IoR2 = this.LLJJLIIIJLLLLLLLZ;
        if (c477770IoR2 != null && (c478090IoxMp = mp()) != null) {
            c477770IoR2.removeOnScrollListener(c478090IoxMp.LJIIIZ);
            if (c478090IoxMp.LJIIIIZZ != 0) {
                c478090IoxMp.LJIIIIZZ = 0;
                c478090IoxMp.LJI();
            }
        }
        this.LLJJLIIIJLLLLLLLZ = null;
        C478090Iox c478090IoxMp2 = mp();
        if (c478090IoxMp2 != null) {
            c478090IoxMp2.LIZLLL();
        }
        Iterator<Map.Entry<Long, InterfaceC420801kM>> it2 = lp().entrySet().iterator();
        while (it2.hasNext()) {
            C500260Jjc.LJJLIIIJLJLI(it2.next().getValue());
        }
        lp().clear();
        super.onDestroy();
    }

    @Override // X.InterfaceC479190Iqj
    public final void rg() {
        C20441214yg.LIZIZ("MultiTopLiveDistributeAssem", "onViewHidden");
        this.LLJLIL = false;
        this.LLJLL.clear();
        ip();
    }

    public final MultiTopLiveDistributeVM sp() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZ;
        return (MultiTopLiveDistributeVM) assemVMLazy.getValue();
    }

    public static boolean Ap(RecommendItem recommendItem) {
        long id;
        if (!HangoutSkylightShowInviteRoomSetting.INSTANCE.getValue()) {
            return false;
        }
        Room room = recommendItem.room;
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        if (recommendItem.skylightItemType != 7 || id <= 0) {
            return false;
        }
        C477500Io0.LIZ.getClass();
        if (((Set) C477500Io0.LIZLLL.getValue()).contains(Long.valueOf(id))) {
            return false;
        }
        return true;
    }

    public static String hp(GuestApplyInfo guestApplyInfo) {
        String str;
        if (guestApplyInfo == null || (str = guestApplyInfo.preLinkmicId) == null) {
            str = "";
        }
        if (str.length() > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pre:");
            sbLIZ.append(str);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (guestApplyInfo != null) {
            long j = guestApplyInfo.roomId;
            if (j > 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("room:");
                sbLIZ2.append(j);
                return C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        return "";
    }

    public static String op(int i) {
        String strLJIJI = C497740JfY.LJIJI(R.string.ttlive_hangoutMulti_join_btn);
        String strLJIJI2 = C497740JfY.LJIJI(2131854697);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJIJI);
        sbLIZ.append('(');
        sbLIZ.append(strLJIJI2);
        sbLIZ.append(')');
        return C786410Ut5.j4(C2188811AlT.LIZIZ(sbLIZ), Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean zp(java.util.List r3) {
        /*
            boolean r0 = com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestHangupP2EnableSetting.isEnable()
            r2 = 0
            if (r0 == 0) goto L37
            X.14i1<java.lang.Boolean> r0 = X.InterfaceC934710aQn.Pc
            java.lang.Object r0 = r0.LIZIZ()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L37
            r0 = r3
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L38
            r0 = r3
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r1 = r0.iterator()
        L25:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r1.next()
            com.bytedance.android.live.liveinteract.multilive.social.model.RecommendItem r0 = (com.bytedance.android.live.liveinteract.multilive.social.model.RecommendItem) r0
            boolean r0 = Ap(r0)
            if (r0 == 0) goto L25
        L37:
            return r2
        L38:
            r0 = r3
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L37
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r1 = r3.iterator()
        L47:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r0 = r1.next()
            com.bytedance.android.live.liveinteract.multilive.social.model.RecommendItem r0 = (com.bytedance.android.live.liveinteract.multilive.social.model.RecommendItem) r0
            com.bytedance.android.livesdk.model.message.GuestApplyInfo r0 = r0.guestApplyInfo
            if (r0 == 0) goto L47
            int r0 = r0.applyStatus
            if (r0 != 0) goto L47
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.hangout.component.distribute.view.MultiTopLiveDistributeAssem.zp(java.util.List):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ep(java.util.List<com.bytedance.android.live.liveinteract.multilive.social.model.RecommendItem> r21) {
        /*
            Method dump skipped, instruction units count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.hangout.component.distribute.view.MultiTopLiveDistributeAssem.Ep(java.util.List):void");
    }

    @Override // X.InterfaceC479190Iqj
    public final void b7(boolean z) {
        this.LLJJJ = false;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewResumed isFirstEnter=");
        sbLIZ.append(z);
        sbLIZ.append(" hasInitTopTab=");
        sbLIZ.append(false);
        C20441214yg.LIZIZ("MultiTopLiveDistributeAssem", C2188811AlT.LIZIZ(sbLIZ));
        kp("onViewResumed");
    }

    public final void kp(String str) {
        if (this.LLJLIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("skip fetchSkylightList, already fetched in current visible session, source=");
            sbLIZ.append(str);
            C20441214yg.LIZIZ("MultiTopLiveDistributeAssem", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        this.LLJLIL = true;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("fetchSkylightList, source=");
        sbLIZ2.append(str);
        C20441214yg.LIZIZ("MultiTopLiveDistributeAssem", C2188811AlT.LIZIZ(sbLIZ2));
        sp().xQ2(EnumC479370Ir1.INIT, "landing_init");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [X.0IoO] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0IoR, android.view.View, androidx.recyclerview.widget.RecyclerView] */
    @Override // com.ss.android.ugc.aweme.hangout.common.contract.LiveHangoutV2SelectableSlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        FrameLayout frameLayout;
        InterfaceC475300IkS interfaceC475300IkS;
        boolean zIsVisible;
        MultiTopLiveSkylightAdapter multiTopLiveSkylightAdapter;
        Fragment fragmentLJI;
        ILiveFeedApiService iLiveFeedApiService;
        C477770IoR c477770IoR;
        ViewGroup viewGroup;
        InterfaceC472710IgH interfaceC472710IgH;
        ViewGroup viewGroup2;
        MultiTopLiveSkylightAdapter multiTopLiveSkylightAdapter2;
        super.onViewCreated(view);
        C20441214yg.LIZIZ("MultiTopLiveDistributeAssem", "onViewCreated");
        if (!MultiTopLiveHangoutEnableSkylightSetting.isEnable()) {
            C786410Ut5.LJLLLLLL(8, getContentView());
            return;
        }
        View contentView = getContentView();
        final AttributeSet attributeSet = null;
        if (contentView != null) {
            frameLayout = (FrameLayout) contentView.findViewById(R.id.f728jg5);
        } else {
            frameLayout = null;
        }
        this.LLJJIJIIJIL = frameLayout;
        Object obj = getConfig().LLILZ.get("tab_root");
        if (obj instanceof InterfaceC475300IkS) {
            interfaceC475300IkS = (InterfaceC475300IkS) obj;
        } else {
            interfaceC475300IkS = null;
        }
        this.LLJJJJ = interfaceC475300IkS;
        this.LLJJJIL = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        final int i = 0;
        if (this.LLJJIJIL == null && (fragmentLJI = C724240Sb0.LJI(this)) != null) {
            C19EG activity = fragmentLJI.getActivity();
            if ((activity instanceof C19EG) && activity != null && (iLiveFeedApiService = (ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)) != 0) {
                C472700IgG c472700IgGML1 = iLiveFeedApiService.mL1(new InterfaceC472680IgE() { // from class: X.0IoO
                    @Override // X.InterfaceC472640IgA
                    public final boolean LIZ() {
                        return true;
                    }

                    @Override // X.InterfaceC472640IgA
                    public final void LJFF(List<? extends FeedItem> list) {
                    }

                    @Override // X.InterfaceC472680IgE
                    public final void onBind() {
                    }

                    @Override // X.InterfaceC472680IgE
                    public final void LIZJ() {
                        C477770IoR c477770IoR2;
                        InterfaceC472710IgH interfaceC472710IgH2 = this.LIZ.LLJJIJIL;
                        if (interfaceC472710IgH2 == null || (c477770IoR2 = ((C472700IgG) interfaceC472710IgH2).LIZJ) == null) {
                            return;
                        }
                        c477770IoR2.scrollToPosition(0);
                    }

                    @Override // X.InterfaceC472640IgA
                    public final void LIZLLL() {
                        C786410Ut5.LJLLLLLL(8, this.LIZ.getContentView());
                    }

                    @Override // X.InterfaceC472640IgA
                    public final void LIZIZ(int i2) {
                        MultiTopLiveDistributeAssem multiTopLiveDistributeAssem = this.LIZ;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MultiTopLiveDistributeAssem.LLJZ;
                        multiTopLiveDistributeAssem.up(i2, "MultiTopLiveDistributeAssem#onViewAttachedToWindow", false);
                    }

                    @Override // X.InterfaceC472680IgE
                    public final void LJ(int i2, RecommendItem recommendItem) {
                        ILiveOuterService iLiveOuterService;
                        InterfaceC20673515v3 interfaceC20673515v3K4;
                        String str;
                        Long lValueOf;
                        String string;
                        User user;
                        User owner;
                        C478090Iox c478090IoxMp = this.LIZ.mp();
                        if (c478090IoxMp != null) {
                            c478090IoxMp.LJ(2000L);
                        }
                        C477860Ioa.LJIIIIZZ("click", this.LIZ.LLJJJ);
                        EnumC477480Iny enumC477480Iny = null;
                        Long lValueOf2 = null;
                        this.LIZ.getClass();
                        if (i2 != -1) {
                            if (recommendItem == null || recommendItem.skylightItemType != 100) {
                                str = "hangout_cover";
                            } else {
                                str = "hangout_go_live";
                            }
                            Integer numValueOf = Integer.valueOf(Math.max(0, recommendItem.showUserList.size() - 1));
                            Room room = recommendItem.room;
                            if (room != null && (owner = room.getOwner()) != null) {
                                lValueOf = Long.valueOf(owner.getId());
                            } else {
                                lValueOf = null;
                            }
                            Room room2 = recommendItem.room;
                            if (room2 != null) {
                                lValueOf2 = Long.valueOf(room2.getId());
                            }
                            String str2 = recommendItem.requestId;
                            str2.toString();
                            C477870Iob c477870Iob = new C477870Iob("toplive_mg_skylight", "hangout_cover", str, numValueOf, 1, lValueOf, lValueOf2, str2, null, str, str, recommendItem.recallReason, Integer.valueOf(i2 + 1), "MultiTopLiveDistributeAssem#onItemClicked", null, 16384);
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            C477500Io0.LIZ.getClass();
                            linkedHashMap.put("mg_distribution_type", C477500Io0.LJI(recommendItem));
                            RecommendShowUser recommendShowUser = recommendItem.user;
                            if (recommendShowUser == null || (user = recommendShowUser.user) == null || (string = Long.valueOf(user.getId()).toString()) == null) {
                                string = "";
                            }
                            linkedHashMap.put("distribution_user_id", string);
                            linkedHashMap.put("distribution_user_list", C477500Io0.LJII(recommendItem));
                            enumC477480Iny = null;
                            C477860Ioa.LJIIIZ(c477870Iob, null, linkedHashMap, 2);
                        }
                        if (recommendItem != null && recommendItem.skylightItemType == 100) {
                            Context context = this.LIZ.getContext();
                            if (context != null && (iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null) {
                                interfaceC20673515v3K4.handleSchema(context, "sslocal://openRecord?enter_from=direct_shoot&tab=live&source_params={\"request_from\":\"toplive_hangout_golive\"}", new Bundle());
                                return;
                            }
                            return;
                        }
                        this.LIZ.sp().vQ2(recommendItem, i2, "hangout_cover", enumC477480Iny);
                        this.LIZ.Fp();
                    }
                }, EnumC477350Inl.DEFAULT);
                this.LLJJIJIL = c472700IgGML1;
                if (c472700IgGML1 != null && (viewGroup2 = (ViewGroup) this.LLJJIJI.getValue()) != null) {
                    c472700IgGML1.LIZIZ = viewGroup2;
                    final Context context = viewGroup2.getContext();
                    if (context != null) {
                        ?? r4 = new RunnableC781530UlD(context, attributeSet, i) { // from class: X.0IoR
                            public float LLJ;
                            public float LLJI;
                            public ViewGroup LLJIJIL;
                            public final C01GW LLJILJIL;

                            private final int getTouchSlop() {
                                return ((Number) this.LLJILJIL.getValue()).intValue();
                            }

                            /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
                            /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
                            /* JADX WARN: Removed duplicated region for block: B:54:0x00bb  */
                            @Override // android.view.ViewGroup, android.view.View
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
                                /*
                                    Method dump skipped, instruction units count: 287
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C477770IoR.dispatchTouchEvent(android.view.MotionEvent):boolean");
                            }

                            public final void setConflictParent(ViewGroup viewGroup3) {
                                this.LLJIJIL = viewGroup3;
                            }

                            {
                                super(context, attributeSet, i);
                                this.LLJILJIL = C452501pT.LIZIZ(new AwS551S0100000_7(context, 781));
                                addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
                            }
                        };
                        r4.setLayoutManager(new LinearLayoutManager(context, 0, false));
                        InterfaceC472680IgE interfaceC472680IgE = c472700IgGML1.LIZ;
                        if (interfaceC472680IgE != null) {
                            multiTopLiveSkylightAdapter2 = new MultiTopLiveSkylightAdapter(interfaceC472680IgE);
                            c472700IgGML1.LIZLLL = multiTopLiveSkylightAdapter2;
                        } else {
                            multiTopLiveSkylightAdapter2 = null;
                        }
                        r4.setAdapter(multiTopLiveSkylightAdapter2);
                        r4.setItemAnimator(null);
                        r4.setOverScrollMode(0);
                        r4.setOnTouchListener(new ATListenerS441S0100000_7(c472700IgGML1, 15));
                        r4.addItemDecoration(new C346270Dhp(10));
                        r4.setMinimumHeight((int) C497740JfY.LIZIZ(96.0f));
                        c472700IgGML1.LIZJ = r4;
                        ViewGroup viewGroup3 = c472700IgGML1.LIZIZ;
                        if (viewGroup3 != null) {
                            C786410Ut5.LJJJJI(viewGroup3);
                        }
                        ViewGroup viewGroup4 = c472700IgGML1.LIZIZ;
                        if (viewGroup4 != 0) {
                            viewGroup4.addView((View) r4, new ViewGroup.LayoutParams(-1, -2));
                        }
                    }
                }
                if (TiktokLiveTopLiveArchitectureOptSetting.INSTANCE.isArchOpt() && (interfaceC472710IgH = this.LLJJIJIL) != null) {
                    ((C472700IgG) interfaceC472710IgH).LJ = new ATListenerS441S0100000_7(this, 1);
                }
                InterfaceC472710IgH interfaceC472710IgH2 = this.LLJJIJIL;
                if (interfaceC472710IgH2 != null && (c477770IoR = ((C472700IgG) interfaceC472710IgH2).LIZJ) != null) {
                    Object obj2 = getConfig().LLILZ.get("conflict_parent");
                    if ((obj2 instanceof ViewGroup) && (viewGroup = (ViewGroup) obj2) != null) {
                        c477770IoR.setConflictParent(viewGroup);
                    }
                    this.LLJJLIIIJLLLLLLLZ = c477770IoR;
                    C478090Iox c478090IoxMp = mp();
                    if (c478090IoxMp != null) {
                        c478090IoxMp.LIZ(c477770IoR);
                    }
                    c477770IoR.addOnScrollListener(new AsS34S0100000_7(this, 0));
                }
            }
        }
        InterfaceC472710IgH interfaceC472710IgH3 = this.LLJJIJIL;
        if (interfaceC472710IgH3 != null && (multiTopLiveSkylightAdapter = ((C472700IgG) interfaceC472710IgH3).LIZLLL) != null) {
            multiTopLiveSkylightAdapter.LLILLL = true;
            multiTopLiveSkylightAdapter.LLILZ = 8;
            ((ArrayList) multiTopLiveSkylightAdapter.LLILLJJLI).clear();
            multiTopLiveSkylightAdapter.notifyDataSetChanged();
        }
        C786410Ut5.LJLLLLLL(0, getContentView());
        C477450Inv.LIZJ((C477340Ink) sp().LLILLL.getValue());
        C736680Sv4.LJIIIIZZ(this, sp(), new C2217381BqS() { // from class: X.0IoU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj3) {
                return ((C477730IoN) obj3).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS621S0100000_7(this, 21), 4);
        C736680Sv4.LJIIIIZZ(this, sp(), new C2217381BqS() { // from class: X.0IoS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj3) {
                return ((C477730IoN) obj3).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS621S0100000_7(this, 22), 4);
        C736680Sv4.LJIIIIZZ(this, sp(), new C2217381BqS() { // from class: X.0IoV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj3) {
                return ((C477730IoN) obj3).LLILZ;
            }
        }, C736820SvI.LIZLLL(), new AwS621S0100000_7(this, 23), 4);
        C736680Sv4.LJIIIIZZ(this, sp(), new C2217381BqS() { // from class: X.0IoT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj3) {
                return ((C477730IoN) obj3).LLILZIL;
            }
        }, C736820SvI.LIZLLL(), new AwS621S0100000_7(this, 24), 4);
        if (TiktokLiveTopLiveArchitectureOptSetting.INSTANCE.isArchOpt()) {
            zIsVisible = this.LLJJJJLIIL;
        } else {
            Fragment fragmentLJI2 = C724240Sb0.LJI(this);
            if (fragmentLJI2 != null && !fragmentLJI2.isHidden()) {
                zIsVisible = fragmentLJI2.isVisible();
            }
            DataChannelGlobal.LLILZ.BQ2(this, this, TopLiveRandomMatchFragmentDismissEvent.class, new AwS586S0100000_7(this, 206));
            DataChannelGlobal.LLILZ.BQ2(this, this, HangoutModuleReShowEvent.class, new AwS586S0100000_7(this, 205));
        }
        if (zIsVisible) {
            kp("onViewCreated#hostVisible");
        }
        DataChannelGlobal.LLILZ.BQ2(this, this, TopLiveRandomMatchFragmentDismissEvent.class, new AwS586S0100000_7(this, 206));
        DataChannelGlobal.LLILZ.BQ2(this, this, HangoutModuleReShowEvent.class, new AwS586S0100000_7(this, 205));
    }

    public final void tp(String str, boolean z) {
        MultiTopLiveSkylightAdapter multiTopLiveSkylightAdapter;
        InterfaceC472710IgH interfaceC472710IgH;
        C477770IoR c477770IoR;
        LinearLayoutManager linearLayoutManager;
        InterfaceC472710IgH interfaceC472710IgH2 = this.LLJJIJIL;
        if (interfaceC472710IgH2 != null && (multiTopLiveSkylightAdapter = ((C472700IgG) interfaceC472710IgH2).LIZLLL) != null && multiTopLiveSkylightAdapter.getItemCount() != 0 && (interfaceC472710IgH = this.LLJJIJIL) != null && (c477770IoR = ((C472700IgG) interfaceC472710IgH).LIZJ) != null) {
            RecyclerView.LayoutManager layoutManager = c477770IoR.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                if (iFindFirstVisibleItemPosition < 0 || iFindLastVisibleItemPosition < 0 || iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
                    return;
                }
                while (true) {
                    up(iFindFirstVisibleItemPosition, str, z);
                    if (iFindFirstVisibleItemPosition != iFindLastVisibleItemPosition) {
                        iFindFirstVisibleItemPosition++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC479210Iql
    public final void u(boolean z, boolean z2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSelected, hasInitTopTab: ");
        sbLIZ.append(z2);
        C20441214yg.LIZIZ("MultiTopLiveDistributeAssem", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJJJLIIL = true;
        this.LLJJJ = z2;
        kp("onSelected");
    }

    public final void yp(GuestApplyInfo guestApplyInfo, Integer num) {
        InterfaceC472710IgH interfaceC472710IgH;
        if (num != null) {
            if (num.intValue() == 2) {
                InterfaceC472710IgH interfaceC472710IgH2 = this.LLJJIJIL;
                if (interfaceC472710IgH2 != null) {
                    ((C472700IgG) interfaceC472710IgH2).LIZ(1, guestApplyInfo);
                    return;
                }
                return;
            }
            if (num == null) {
                return;
            }
            if (num.intValue() == 3) {
                InterfaceC472710IgH interfaceC472710IgH3 = this.LLJJIJIL;
                if (interfaceC472710IgH3 == null) {
                    return;
                }
                ((C472700IgG) interfaceC472710IgH3).LIZ(2, guestApplyInfo);
                return;
            }
            if (num.intValue() != 4 || (interfaceC472710IgH = this.LLJJIJIL) == null) {
                return;
            }
            ((C472700IgG) interfaceC472710IgH).LIZ(3, guestApplyInfo);
        }
    }

    public final void Bp(final RecommendItem recommendItem, int i, GuestApplyInfo guestApplyInfo) {
        boolean zLJFF;
        String str;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        if (!MultiGuestHangupP2EnableSetting.isEnable()) {
            C20441214yg.LIZIZ("MultiTopLiveDistributeAssem", "hangupInfoBanner is not enable");
            return;
        }
        C477500Io0.LIZ.getClass();
        if (guestApplyInfo == null) {
            zLJFF = false;
        } else {
            zLJFF = Intrinsics.LJFF(((Map) C477500Io0.LIZJ.getValue()).get(guestApplyInfo.preLinkmicId), Boolean.TRUE);
        }
        String str2 = null;
        if (zLJFF) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("hangupInfoBanner for preLinkMicID:");
            if (guestApplyInfo != null) {
                str2 = guestApplyInfo.preLinkmicId;
            }
            sbLIZ.append(str2);
            C20441214yg.LIZIZ("MultiTopLiveDistributeAssem", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        Context context = getContext();
        if (context != null) {
            C477750IoP c477750IoP = new C477750IoP(context, null, 6);
            ip();
            C500260Jjc.LJLJLJ(c477750IoP.LLILLJJLI, true);
            Object[] objArr = new Object[1];
            GuestApplyInfo guestApplyInfo2 = recommendItem.guestApplyInfo;
            if (guestApplyInfo2 != null) {
                str = guestApplyInfo2.ownerNickName;
            } else {
                str = null;
            }
            objArr[0] = str;
            c477750IoP.setHangoutInfoText(C497740JfY.LJIJJ(2131854287, objArr));
            GuestApplyInfo guestApplyInfo3 = recommendItem.guestApplyInfo;
            long id = 0;
            if (guestApplyInfo3 != null) {
                j = guestApplyInfo3.permitExpireTime;
            } else {
                j = 0;
            }
            int iLIZJ = (int) (j - C158B.LIZJ());
            if (iLIZJ > 0) {
                c477750IoP.setJoinText(op(iLIZJ));
                Map<Long, InterfaceC420801kM> mapLp = lp();
                GuestApplyInfo guestApplyInfo4 = recommendItem.guestApplyInfo;
                if (guestApplyInfo4 != null) {
                    j2 = guestApplyInfo4.roomId;
                } else {
                    j2 = 0;
                }
                InterfaceC420801kM interfaceC420801kM = mapLp.get(Long.valueOf(j2));
                if (interfaceC420801kM != null && !interfaceC420801kM.isDisposed()) {
                    Map<Long, InterfaceC420801kM> mapLp2 = lp();
                    GuestApplyInfo guestApplyInfo5 = recommendItem.guestApplyInfo;
                    if (guestApplyInfo5 != null) {
                        j4 = guestApplyInfo5.roomId;
                    } else {
                        j4 = 0;
                    }
                    InterfaceC420801kM interfaceC420801kM2 = mapLp2.get(Long.valueOf(j4));
                    if (interfaceC420801kM2 != null) {
                        C500260Jjc.LJJLIIIJLJLI(interfaceC420801kM2);
                    }
                    Map<Long, InterfaceC420801kM> mapLp3 = lp();
                    GuestApplyInfo guestApplyInfo6 = recommendItem.guestApplyInfo;
                    if (guestApplyInfo6 != null) {
                        j5 = guestApplyInfo6.roomId;
                    } else {
                        j5 = 0;
                    }
                    mapLp3.remove(Long.valueOf(j5));
                }
                Map<Long, InterfaceC420801kM> mapLp4 = lp();
                GuestApplyInfo guestApplyInfo7 = recommendItem.guestApplyInfo;
                if (guestApplyInfo7 != null) {
                    j3 = guestApplyInfo7.roomId;
                } else {
                    j3 = 0;
                }
                mapLp4.put(Long.valueOf(j3), C19490011Na.LIZLLL(0L, ((long) iLIZJ) + 1, 0L, 1L, TimeUnit.SECONDS).LJIILIIL(new C0UO0()).LJJZ(new AfS27S0301000_7(iLIZJ, recommendItem, this, c477750IoP, 0), new C09JN() { // from class: X.00Sm
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("MultiTopLiveDistributeAssem@76ec.setJoinCountDownText$2");
                        C20441214yg.LJFF("MultiTopLiveDistributeAssem", "setJoinCountDownText failed", (Throwable) obj);
                        C1C7U.LIZIZ("MultiTopLiveDistributeAssem@76ec.setJoinCountDownText$2");
                    }
                }, new InterfaceC781210Ukh() { // from class: X.0Inw
                    @Override // X.InterfaceC781210Ukh
                    public final void run() {
                        Map<Long, InterfaceC420801kM> mapLp5 = this.LIZ.lp();
                        GuestApplyInfo guestApplyInfo8 = recommendItem.guestApplyInfo;
                        mapLp5.remove(Long.valueOf(guestApplyInfo8 != null ? guestApplyInfo8.roomId : 0L));
                    }
                }));
            }
            AwS67S0301000_7 awS67S0301000_7 = new AwS67S0301000_7(i, recommendItem, this, c477750IoP, 0);
            c477750IoP.LLILZ = null;
            c477750IoP.LLILLL = awS67S0301000_7;
            FrameLayout frameLayout = this.LLJJIJIIJIL;
            if (frameLayout != null) {
                C786410Ut5.LJZ(0, frameLayout);
                frameLayout.addView(c477750IoP);
                this.LLJLLIL = EnumC477760IoQ.LLILLJJLI;
                this.LLJLLL = hp(guestApplyInfo);
                if (guestApplyInfo != null) {
                    ((Map) C477500Io0.LIZJ.getValue()).put(guestApplyInfo.preLinkmicId, Boolean.TRUE);
                }
                Room room = recommendItem.room;
                if (room != null) {
                    id = room.getId();
                }
                C477860Ioa.LIZJ(id, "toplive_cover_mg_apply_accepted", "show");
            }
        }
    }

    public final void up(int i, String str, boolean z) {
        int size;
        InterfaceC472710IgH interfaceC472710IgH;
        MultiTopLiveSkylightAdapter multiTopLiveSkylightAdapter;
        List<RecommendItem> list;
        RecommendItem recommendItem;
        long id;
        String strLIZIZ;
        boolean z2;
        String str2;
        Long lValueOf;
        String string;
        String string2;
        User user;
        User owner;
        MultiTopLiveSkylightAdapter multiTopLiveSkylightAdapter2;
        List<RecommendItem> list2;
        if ((TiktokLiveTopLiveArchitectureOptSetting.INSTANCE.isArchOpt() && !this.LLJJJJLIIL) || i == -1) {
            return;
        }
        InterfaceC472710IgH interfaceC472710IgH2 = this.LLJJIJIL;
        Long lValueOf2 = null;
        if (interfaceC472710IgH2 != null && (multiTopLiveSkylightAdapter2 = ((C472700IgG) interfaceC472710IgH2).LIZLLL) != null && (list2 = multiTopLiveSkylightAdapter2.LLILLJJLI) != null) {
            size = list2.size();
        } else {
            size = 0;
        }
        if (i < size && (interfaceC472710IgH = this.LLJJIJIL) != null && (multiTopLiveSkylightAdapter = ((C472700IgG) interfaceC472710IgH).LIZLLL) != null && (list = multiTopLiveSkylightAdapter.LLILLJJLI) != null && (recommendItem = (RecommendItem) ListProtector.get(list, i)) != null) {
            if (recommendItem.skylightItemType == 100) {
                strLIZIZ = "go_live";
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("room:");
                Room room = recommendItem.room;
                if (room != null) {
                    id = room.getId();
                } else {
                    id = 0;
                }
                sbLIZ.append(id);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            if (!z && this.LLJLL.contains(strLIZIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("logItemShow: skip duplicate report, itemKey=");
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append(", source=");
                sbLIZ2.append(str);
                C20441214yg.LIZIZ("MultiTopLiveDistributeAssem", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            this.LLJLL.add(strLIZIZ);
            if (recommendItem.skylightItemType == 100) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                str2 = "hangout_cover";
            } else {
                str2 = "hangout_go_live";
            }
            Integer numValueOf = Integer.valueOf(Math.max(0, recommendItem.showUserList.size() - 1));
            Room room2 = recommendItem.room;
            if (room2 != null && (owner = room2.getOwner()) != null) {
                lValueOf = Long.valueOf(owner.getId());
            } else {
                lValueOf = null;
            }
            Room room3 = recommendItem.room;
            if (room3 != null) {
                lValueOf2 = Long.valueOf(room3.getId());
            }
            String str3 = recommendItem.requestId;
            str3.toString();
            C477870Iob c477870Iob = new C477870Iob("toplive_mg_skylight", "hangout_cover", str2, numValueOf, 1, lValueOf, lValueOf2, str3, null, str2, str2, recommendItem.recallReason, Integer.valueOf(i + 1), str, null, 16384);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C477500Io0.LIZ.getClass();
            linkedHashMap.put("mg_distribution_type", C477500Io0.LJI(recommendItem));
            RecommendShowUser recommendShowUser = recommendItem.user;
            if (recommendShowUser == null || (user = recommendShowUser.user) == null || (string = Long.valueOf(user.getId()).toString()) == null) {
                string = "";
            }
            linkedHashMap.put("distribution_user_id", string);
            linkedHashMap.put("distribution_user_list", C477500Io0.LJII(recommendItem));
            C477860Ioa.LJIIJ(c477870Iob, linkedHashMap);
            Uri.Builder builderAuthority = new Uri.Builder().scheme("sslocal").authority("webcast_room");
            Room room4 = recommendItem.room;
            if (room4 != null) {
                string2 = Long.valueOf(room4.getId()).toString();
            } else {
                string2 = null;
            }
            Uri uriBuild = builderAuthority.appendQueryParameter("room_id", string2).appendQueryParameter("enter_from", "live_merge").appendQueryParameter("enter_method", "hangout_cover").appendQueryParameter("enter_from_merge", "live_merge").appendQueryParameter("enter_mg_reason", C477500Io0.LJIIIIZZ(recommendItem)).appendQueryParameter("is_from_mg_toplive", "1").build();
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            C0IVR.LJII(enterRoomConfig, uriBuild, true);
            enterRoomConfig.mRoomsData.mgDistributionInfo = linkedHashMap;
            C477860Ioa.LJFF(enterRoomConfig, recommendItem.room, str, null);
        }
    }
}
