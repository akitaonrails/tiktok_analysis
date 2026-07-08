package com.bytedance.android.livesdk.interaction;

import X.C011Z;
import X.C01GW;
import X.C098200Yq;
import X.C0IJT;
import X.C0KWW;
import X.C0KWZ;
import X.C0KX2;
import X.C0U3P;
import X.C0U3Q;
import X.C0UDL;
import X.C0UID;
import X.C0UIJ;
import X.C0UIM;
import X.C0UX6;
import X.C0UXQ;
import X.C1086960eOM;
import X.C1113800f5e;
import X.C1148020fyq;
import X.C1161920gLG;
import X.C162100jj;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C19MB;
import X.C20736316Cj;
import X.C452501pT;
import X.C474500IjA;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C501300JlI;
import X.C501390JlR;
import X.C501400JlS;
import X.C513200KAs;
import X.C518840KWk;
import X.C749420TaW;
import X.C749540Tai;
import X.C751980Tee;
import X.C753250Tgh;
import X.C754590Tir;
import X.C766720U5u;
import X.C769040UEs;
import X.C773900UXk;
import X.C773920UXm;
import X.C773940UXo;
import X.C774010UXv;
import X.C780330UjH;
import X.C781520UlC;
import X.C783150Unp;
import X.C785290UrH;
import X.C786410Ut5;
import X.EnumC1120860fH2;
import X.EnumC785300UrI;
import X.InterfaceC773910UXl;
import Y.ACListenerS116S0200000_12;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.gift.GiftService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.liveinteract.InteractServiceDel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.MultiCoHostIconGroupChangeChannel;
import com.bytedance.android.live.liveinteract.api.MultiGuestIconGroupChangeChannel;
import com.bytedance.android.live.toolbar.DismissToolbarPopEvent;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.api.revenue.goodybag.IGoodyBagService;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSettingsUIConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeCommerceRenewSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TryModeGuidanceSetting;
import com.bytedance.android.livesdk.livesetting.gift.ViewerWishesConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestIconInCoHostOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.PlaybookNonMultiGuestEnableSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveInteractionSheetFunctionCountTestSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LivePollSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.TtliveGameObsLiveGoalAndGuessingAdaptSetting;
import com.bytedance.android.livesdk.model.InteractionQuestionInfo;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS221S0300000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveInteractionFeaturesFragment extends LiveThemeAwareDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9ISs4LD0yKzHELIOSElJiF9BCw6LAY9PCA+KCwnISoiDyoyPDA+LDwVOiQrJCo9PA==";
    public C773900UXk LL;
    public ViewGroup LLILLJJLI;
    public ViewGroup LLILLL;
    public ViewGroup LLILZ;
    public ViewGroup LLILZIL;
    public ViewGroup LLILZLL;
    public ViewGroup LLIZ;
    public ViewGroup LLIZLLLIL;
    public ViewGroup LLJ;
    public ViewGroup LLJI;
    public ViewGroup LLJIJIL;
    public ViewGroup LLJILJIL;
    public ViewGroup LLJILJILJ;
    public ViewGroup LLJILLL;
    public ViewGroup LLJJ;
    public ViewGroup LLJJI;
    public ViewGroup LLJJIII;
    public ViewGroup LLJJIJI;
    public ViewGroup LLJJIJIIJIL;
    public DataChannel LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJLIL;
    public String LLJJJJ = "";
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(138));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 304));
    public boolean LLJJL = true;
    public final List<C773920UXm> LLJJLIIIJLLLLLLLZ = new ArrayList();
    public final List<C773920UXm> LLJL = new ArrayList();
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 303));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 302));

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final void NR() {
        C773900UXk c773900UXk = this.LL;
        if (c773900UXk == null) {
            return;
        }
        c773900UXk.setAllFunctions$liveroomfunction_impl_release(this.LLJJLIIIJLLLLLLLZ);
        int dimensionPixelSize = c773900UXk.getContext().getResources().getDimensionPixelSize(R.dimen.ar_);
        int paddingTop = c773900UXk.getPaddingTop();
        int paddingBottom = c773900UXk.getPaddingBottom();
        int dimensionPixelSize2 = c773900UXk.getContext().getResources().getDimensionPixelSize(R.dimen.ar9);
        if (OR()) {
            c773900UXk.setBackgroundResource(R.drawable.dy_);
            dimensionPixelSize = (int) C497740JfY.LIZIZ(12);
            paddingTop = (int) C497740JfY.LIZIZ(16);
            paddingBottom = (int) C497740JfY.LIZIZ(8);
            dimensionPixelSize2 = (int) C497740JfY.LIZIZ(80);
            c773900UXk.setCollapsableRowCountThreshold(1);
            c773900UXk.setLineSpacing$liveroomfunction_impl_release((int) C497740JfY.LIZIZ(18));
        }
        if (PR()) {
            paddingTop = (int) C497740JfY.LIZIZ(8);
            dimensionPixelSize2 = (int) C497740JfY.LIZIZ(76);
            c773900UXk.setCollapsableRowCountThreshold(1);
            c773900UXk.setLineSpacing$liveroomfunction_impl_release((int) C497740JfY.LIZIZ(16));
            dimensionPixelSize = 0;
            paddingBottom = 0;
        }
        c773900UXk.setPaddingRelative(dimensionPixelSize, paddingTop, dimensionPixelSize, paddingBottom);
        c773900UXk.setItemWidth$liveroomfunction_impl_release(dimensionPixelSize2);
        c773900UXk.setCollapsable$liveroomfunction_impl_release(this.LLJJJ);
        if (OR()) {
            c773900UXk.setBottomCollapseView$liveroomfunction_impl_release((View) this.LLJLL.getValue());
        } else {
            c773900UXk.setCollapseView$liveroomfunction_impl_release((View) this.LLJLILLLLZIIL.getValue());
        }
        c773900UXk.setCollapseViewAdaptivelyLayout$liveroomfunction_impl_release(true);
        C774010UXv c774010UXv = (C774010UXv) this.LLJLILLLLZIIL.getValue();
        if (c774010UXv != null) {
            c774010UXv.LIZ(this.LLJJL);
        }
        c773900UXk.setCollapsed$liveroomfunction_impl_release(this.LLJJL);
    }

    public final void RR() {
        if (C0UID.LJIIJ(this.LLJJIJIL)) {
            TryModeGuidanceSetting tryModeGuidanceSetting = TryModeGuidanceSetting.INSTANCE;
            if (tryModeGuidanceSetting.isV3()) {
                if (!tryModeGuidanceSetting.isV3NormalBubble()) {
                    C785290UrH.LIZ(EnumC785300UrI.ANCHOR_TRY_MODE_QUICK_QA_GUIDE);
                } else {
                    C1113800f5e c1113800f5e = C1113800f5e.LIZ;
                    C1113800f5e.LIZJ(EnumC1120860fH2.ANCHOR_TRY_MODE_QUICK_QA_GUIDE);
                }
            }
        }
    }

    public final void SR() {
        ViewGroup viewGroup;
        Room room;
        C1086960eOM c1086960eOM = C1086960eOM.LL;
        DataChannel dataChannel = this.LLJJIJIL;
        if ((c1086960eOM.LIZIZ((dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null) ? 0L : room.getId()) || C500260Jjc.LJJJIL(this.LLJJIJIL)) && (viewGroup = this.LLILLL) != null) {
            WR(new C0KX2(), viewGroup);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void UR() {
        /*
            r5 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r5.LLJJIJIL
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = X.C500260Jjc.LJJLIIIIJ(r0)
            r4 = 1
            if (r0 == 0) goto L5c
            com.bytedance.android.livesdk.model.RoomAuthStatus r0 = r0.getRoomAuthStatus()
            if (r0 == 0) goto L5c
            boolean r0 = r0.guessEntranceForHost
            if (r0 != r4) goto L5c
            r3 = 1
        L14:
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r5.LLJJIJIL
            boolean r0 = X.C500260Jjc.LJJIZ(r0)
            if (r0 != 0) goto L34
            com.bytedance.android.livesdk.livesetting.roomfunction.TtliveGameObsLiveGoalAndGuessingAdaptSetting r0 = com.bytedance.android.livesdk.livesetting.roomfunction.TtliveGameObsLiveGoalAndGuessingAdaptSetting.INSTANCE
            boolean r0 = r0.enable()
            if (r0 == 0) goto L5a
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r5.LLJJIJIL
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r1 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.THIRD_PARTY
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = X.C500260Jjc.LJJLIIIIJ(r0)
            if (r0 == 0) goto L58
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = r0.getStreamType()
        L32:
            if (r1 != r0) goto L5a
        L34:
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r5.LLJJIJIL
            boolean r2 = X.C500260Jjc.LJIIZILJ(r0)
            java.lang.Class<com.bytedance.android.livesdk.comp.api.game.service.IGameService> r0 = com.bytedance.android.livesdk.comp.api.game.service.IGameService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.comp.api.game.service.IGameService r0 = (com.bytedance.android.livesdk.comp.api.game.service.IGameService) r0
            r0.lU0()
            X.0Tgm r1 = new X.0Tgm
            r1.<init>()
            if (r3 == 0) goto L57
            if (r4 == 0) goto L57
            if (r2 == 0) goto L57
            android.view.ViewGroup r0 = r5.LLILLJJLI
            if (r0 == 0) goto L57
            r5.WR(r1, r0)
        L57:
            return
        L58:
            r0 = 0
            goto L32
        L5a:
            r4 = 0
            goto L34
        L5c:
            r3 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.interaction.LiveInteractionFeaturesFragment.UR():void");
    }

    public final void MR() {
        RR();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_interaction_panel_icon_click");
        c474500IjALIZ.LJIJJLI(this.LLJJIJIL);
        c474500IjALIZ.LJJII(this.LLJJL ? "more" : "less", "click_icon");
        c474500IjALIZ.LIZ();
        boolean z = !this.LLJJL;
        this.LLJJL = z;
        DataChannel dataChannel = this.LLJJIJIL;
        if (dataChannel != null) {
            dataChannel.SX0(C749420TaW.class, Boolean.valueOf(z));
        }
        C773900UXk c773900UXk = this.LL;
        if (c773900UXk != null) {
            c773900UXk.setCollapsed$liveroomfunction_impl_release(this.LLJJL);
        }
    }

    public final boolean OR() {
        return LiveHostSettingsUIConfig.v1() && this.LLJJJIL && C500260Jjc.LJIIZILJ(this.LLJJIJIL);
    }

    public final boolean PR() {
        return LiveHostSettingsUIConfig.v2() && this.LLJJJIL && C500260Jjc.LJIIZILJ(this.LLJJIJIL);
    }

    public final void VR() {
        if (C0UIM.LJI()) {
            DataChannel dataChannel = this.LLJJIJIL;
            if (dataChannel != null) {
                dataChannel.SX0(C753250Tgh.class, C0UIM.LJFF() ? "more_top" : "toolbar_interact");
            }
            ViewGroup viewGroup = this.LLILZIL;
            if (viewGroup != null) {
                WR(new C518840KWk(), viewGroup);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Iterator<C773920UXm> it2 = this.LLJJLIIIJLLLLLLLZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ.LIZ(this.LLJJIJIL);
        }
        ((ArrayList) this.LLJJLIIIJLLLLLLLZ).clear();
        ((ArrayList) this.LLJL).clear();
        DataChannel dataChannel = this.LLJJIJIL;
        if (dataChannel != null) {
            dataChannel.SX0(C749540Tai.class, "");
        }
        DataChannel dataChannel2 = this.LLJJIJIL;
        if (dataChannel2 != null) {
            dataChannel2.zQ2(this);
        }
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, X.InterfaceC513210KAt
    public final int getThemeOverlay(Context context) {
        if (C0UID.LJIIJ(C475510Ikn.LJ(this)) && TryModeGuidanceSetting.INSTANCE.isV3EnhancedBubble()) {
            return C011Z.LIZ.LJ();
        }
        return C513200KAs.LIZ(context);
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str = "";
        boolean zLJFF = false;
        if (arguments != null) {
            this.LLJJJ = arguments.getBoolean("collapsable", false);
            this.LLJJJJ = arguments.getString("entrance", "");
        }
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        this.LLJJIJIL = dataChannelLJ;
        if (dataChannelLJ != null) {
            dataChannelLJ.SX0(C773940UXo.class, this.LLJJJJ);
        }
        DataChannel dataChannel = this.LLJJIJIL;
        if (dataChannel != null) {
            zLJFF = Intrinsics.LJFF(dataChannel.gg0(C749420TaW.class), Boolean.TRUE);
        }
        this.LLJJL = zLJFF;
        String str2 = this.LLJJJJ;
        if (Intrinsics.LJFF(str2, "more_top")) {
            str = "foundation_more";
        } else if (Intrinsics.LJFF(str2, "toolbar")) {
            str = "foundation_anchor_interaction";
        }
        DataChannel dataChannel2 = this.LLJJIJIL;
        if (dataChannel2 != null) {
            dataChannel2.SX0(C749540Tai.class, str);
        }
        if (Intrinsics.LJFF(this.LLJJJJ, "more_top")) {
            this.LLJJJIL = true;
        }
        DataChannel dataChannel3 = this.LLJJIJIL;
        if (dataChannel3 != null) {
            dataChannel3.DQ2(MultiGuestIconGroupChangeChannel.class, this, new AwS591S0100000_12(this, 572));
        }
        DataChannel dataChannel4 = this.LLJJIJIL;
        if (dataChannel4 != null) {
            dataChannel4.DQ2(MultiCoHostIconGroupChangeChannel.class, this, new AwS591S0100000_12(this, 573));
        }
    }

    public static void ZR(int i, ConstraintLayout constraintLayout) {
        View viewFindViewById = constraintLayout.findViewById(i);
        if (viewFindViewById != null) {
            C500260Jjc.LJJLJLI(0, viewFindViewById);
            float fLIZIZ = C497740JfY.LIZIZ(4);
            C786410Ut5.Jc(viewFindViewById, fLIZIZ);
            C786410Ut5.ed(viewFindViewById, -fLIZIZ);
        }
        C19MB c19mb = new C19MB();
        c19mb.LJII(constraintLayout);
        c19mb.LJIIIIZZ(i, 6, R.id.jxe, 6);
        c19mb.LJIIIIZZ(i, 7, R.id.jxe, 7);
        c19mb.LJIIIIZZ(i, 3, R.id.jxe, 3);
        c19mb.LJIIIIZZ(i, 4, R.id.jxe, 4);
        c19mb.LJJII(1.0f, i);
        c19mb.LJJIIZ(0.0f, i);
        c19mb.LIZIZ(constraintLayout);
    }

    public final void WR(InterfaceC773910UXl interfaceC773910UXl, View view) {
        C773900UXk c773900UXk;
        ConstraintLayout constraintLayout;
        if (interfaceC773910UXl == null || (c773900UXk = this.LL) == null || c773900UXk.indexOfChild(view) == -1) {
            return;
        }
        LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.jxe);
        if (PR()) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) view.findViewById(R.id.jzp);
            if (constraintLayout2 != null) {
                ZR(R.id.t16, constraintLayout2);
                ZR(R.id.jd9, constraintLayout2);
            }
            if (liveIconView != null) {
                liveIconView.setIconTintAttr(R.attr.ezs);
            }
        }
        if (LiveHostSettingsUIConfig.v2() && C500260Jjc.LJIIZILJ(this.LLJJIJIL) && liveIconView != null) {
            liveIconView.setIconTintAttr(R.attr.ezs);
        }
        if (OR()) {
            if ((view instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) view) != null) {
                ZR(R.id.t16, constraintLayout);
                ZR(R.id.jd9, constraintLayout);
            }
            if (liveIconView != null) {
                liveIconView.setIconTintAttr(R.attr.ezq);
            }
        }
        TextView textView = (TextView) view.findViewById(R.id.text);
        if (liveIconView != null) {
            liveIconView.setIconAttr(interfaceC773910UXl.LJ());
        }
        if (C0UID.LJIIJ(this.LLJJIJIL) && TryModeGuidanceSetting.INSTANCE.isV3EnhancedBubble() && liveIconView != null) {
            liveIconView.setIconTint(C20736316Cj.LIZIZ(R.attr.c9j, getContext()));
        }
        textView.setText(interfaceC773910UXl.LIZIZ());
        interfaceC773910UXl.LJI(view, this, this.LLJJIJIL);
        C786410Ut5.I7(new ACListenerS116S0200000_12(this, interfaceC773910UXl, 33), view);
        List<C773920UXm> list = this.LLJJLIIIJLLLLLLLZ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (c773900UXk.indexOfChild(((C773920UXm) obj).LIZIZ) < c773900UXk.indexOfChild(view)) {
                arrayList.add(obj);
            }
        }
        int iMin = Math.min(arrayList.size(), ((ArrayList) this.LLJJLIIIJLLLLLLLZ).size());
        int testCount = LiveInteractionSheetFunctionCountTestSetting.INSTANCE.getTestCount();
        if (testCount < 0 || ((ArrayList) this.LLJJLIIIJLLLLLLLZ).size() < testCount) {
            ListProtector.add(this.LLJJLIIIJLLLLLLLZ, iMin, new C773920UXm(interfaceC773910UXl, view));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View view2;
        DataChannel dataChannel;
        Room room;
        RoomAuthStatus roomAuthStatus;
        Boolean boolValueOf;
        View view3;
        View view4;
        View view5;
        View view6;
        View view7;
        Room roomLJJLIIIIJ;
        RoomAuthStatus roomAuthStatus2;
        Room roomLJJLIIIIJ2;
        RoomAuthStatus roomAuthStatus3;
        View view8;
        View view9;
        View view10;
        InteractionQuestionInfo interactionQuestionInfo;
        View view11;
        ViewGroup viewGroup;
        DataChannel dataChannel2;
        ViewGroup viewGroup2;
        Room room2;
        View view12;
        View view13;
        View view14;
        super.onViewCreated(view, bundle);
        this.LL = (C773900UXk) view.findViewById(R.id.eux);
        this.LLILLJJLI = (ViewGroup) view.findViewById(R.id.j9w);
        this.LLILLL = (ViewGroup) view.findViewById(R.id.fch);
        this.LLILZ = (ViewGroup) view.findViewById(R.id.snc);
        this.LLILZIL = (ViewGroup) view.findViewById(R.id.rf9);
        this.LLILZLL = (ViewGroup) view.findViewById(R.id.g_f);
        this.LLIZ = (ViewGroup) view.findViewById(R.id.mmz);
        this.LLIZLLLIL = (ViewGroup) view.findViewById(R.id.qrl);
        this.LLJ = (ViewGroup) view.findViewById(R.id.yjq);
        this.LLJI = (ViewGroup) view.findViewById(R.id.wpl);
        this.LLJIJIL = (ViewGroup) view.findViewById(R.id.j3r);
        this.LLJILJIL = (ViewGroup) view.findViewById(R.id.sl7);
        this.LLJILJILJ = (ViewGroup) view.findViewById(R.id.m1z);
        this.LLJILLL = (ViewGroup) view.findViewById(R.id.au0);
        this.LLJJ = (ViewGroup) view.findViewById(R.id.qnn);
        this.LLJJI = (ViewGroup) view.findViewById(R.id.ook);
        this.LLJJIII = (ViewGroup) view.findViewById(R.id.oo1);
        this.LLJJIJI = (ViewGroup) view.findViewById(R.id.viewer_wishes_group);
        this.LLJJIJIIJIL = (ViewGroup) view.findViewById(R.id.vp5);
        Map map = null;
        if (C0UIM.LIZIZ()) {
            if (C0UIM.LIZJ()) {
                VR();
            } else {
                SR();
            }
            if (TtliveGameObsLiveGoalAndGuessingAdaptSetting.INSTANCE.enable()) {
                UR();
            } else if (C500260Jjc.LJJIZ(this.LLJJIJIL) && !C500260Jjc.LJJJIL(this.LLJJIJIL)) {
                UR();
            }
            DataChannel dataChannel3 = this.LLJJIJIL;
            if (dataChannel3 != null) {
                room2 = (Room) dataChannel3.gg0(RoomChannel.class);
            } else {
                room2 = null;
            }
            if (C0UXQ.LIZ(room2) && (view14 = this.LLJJ) != null) {
                WR(new C501400JlS(), view14);
            }
            if (LiveHostSettingsUIConfig.enable() && C500260Jjc.LJIIZILJ(this.LLJJIJIL)) {
                if (((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).enableRedEnvelopeForUserDiamond() && (view13 = this.LLJ) != null) {
                    WR(((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).provideInteractionView(this), view13);
                }
                if (((IGoodyBagService) C1161920gLG.LIZJ(IGoodyBagService.class)).ul2(this.LLJJIJIL) && (view12 = this.LLJIJIL) != null) {
                    WR(((IGoodyBagService) C1161920gLG.LIZJ(IGoodyBagService.class)).Cb(), view12);
                }
            }
        } else {
            boolean z = false;
            if (LiveSdkMultiGuestIconInCoHostOptSetting.INSTANCE.isEnable() && (dataChannel2 = this.LLJJIJIL) != null && Intrinsics.LJFF(dataChannel2.gg0(MultiGuestIconGroupChangeChannel.class), Boolean.TRUE) && (viewGroup2 = this.LLJJI) != null) {
                WR(new C783150Unp(viewGroup2), viewGroup2);
            }
            DataChannel dataChannel4 = this.LLJJIJIL;
            if (dataChannel4 != null && Intrinsics.LJFF(dataChannel4.gg0(MultiCoHostIconGroupChangeChannel.class), Boolean.TRUE) && (viewGroup = this.LLJJIII) != null) {
                WR(new C780330UjH(viewGroup), viewGroup);
            }
            if (C0UIM.LIZJ()) {
                VR();
            } else {
                SR();
                if ((LivePollSetting.INSTANCE.enable(this.LLJJIJIL) || ((dataChannel = this.LLJJIJIL) != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (roomAuthStatus = room.getRoomAuthStatus()) != null && roomAuthStatus.enableGiftPoll == 1)) && (view2 = this.LLILZ) != null) {
                    WR(new C0KWZ(), view2);
                }
            }
            C0KWW hostToolsUtil = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getHostToolsUtil();
            DataChannel dataChannel5 = this.LLJJIJIL;
            hostToolsUtil.getClass();
            LiveEffect liveEffectLIZIZ = C769040UEs.LIZIZ(dataChannel5);
            if (liveEffectLIZIZ != null && C766720U5u.LJIILLIIL(liveEffectLIZIZ) && (view11 = this.LLILZLL) != null) {
                WR(new C501300JlI(), view11);
            }
            Room roomLIZ = C162100jj.LIZ(this.LLJJIJIL);
            if (roomLIZ != null && (interactionQuestionInfo = roomLIZ.interactionQuestion) != null) {
                boolValueOf = Boolean.valueOf(interactionQuestionInfo.hasQuickAnswer);
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf) && (view10 = this.LLIZ) != null) {
                WR(new C0UIJ(), view10);
            }
            if (PlaybookNonMultiGuestEnableSetting.INSTANCE.enable() && !C500260Jjc.LJJJIL(this.LLJJIJIL) && C781520UlC.LJIIJJI(C751980Tee.LIZJ(this.LLJJIJIL)) && (view9 = this.LLIZLLLIL) != null) {
                final String str = this.LLJJJJ;
                WR(new InterfaceC773910UXl(str) { // from class: X.0UXq
                    public final String LL;
                    public DataChannel LLILLJJLI;

                    @Override // X.InterfaceC773910UXl
                    public final void LIZ(DataChannel dataChannel6) {
                    }

                    @Override // X.InterfaceC773910UXl
                    public final int LIZIZ() {
                        return 2131854143;
                    }

                    @Override // X.InterfaceC773910UXl
                    public final void onHide() {
                    }

                    @Override // X.InterfaceC773910UXl
                    public final void onShow() {
                    }

                    @Override // X.InterfaceC773910UXl
                    public final int LJ() {
                        return (LiveHostSettingsUIConfig.v1() || !LiveHostSettingsUIConfig.v2()) ? R.attr.e66 : R.attr.e67;
                    }

                    {
                        this.LL = str;
                    }

                    public final Map<String, String> LIZJ(String str2) {
                        Object obj;
                        Map<String, String> mapLT0;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        String str3 = "1";
                        if (!C500260Jjc.LJJIL() && ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).J8()) {
                            obj = "1";
                        } else {
                            obj = CardStruct.IStatusCode.DEFAULT;
                        }
                        linkedHashMap.put("is_in_live", obj);
                        if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).yK2(null) == null) {
                            str3 = CardStruct.IStatusCode.DEFAULT;
                        }
                        linkedHashMap.put("is_in_playbook", str3);
                        if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).J8() && (mapLT0 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).LT0(this.LLILLJJLI, str2)) != null) {
                            linkedHashMap.putAll(mapLT0);
                        }
                        return linkedHashMap;
                    }

                    @Override // X.InterfaceC773910UXl
                    public final void onClick(View view15) {
                        C01HZ c01hzKi1 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ki1();
                        if (c01hzKi1 != null) {
                            c01hzKi1.LIZIZ(EnumC499801x6.PLAYBOOK, C915900ZwS.LIZ("interaction_panel"), null);
                        }
                        C0UX6 c0ux6 = C0UX6.LIVE_PLAYBOOK_BROADCAST_SMB;
                        if (c0ux6.isShowing()) {
                            RedDotExtensionKt.LIZ(c0ux6);
                            C0KPJ.Te.LJFF(Boolean.TRUE);
                            C0UTJ c0utjPl1 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Pl1(this.LLILLJJLI);
                            if (c0utjPl1 != null) {
                                c0utjPl1.LJJI(false, "", new C915190ZvJ("interaction_panel", false, 6), EnumC20429314wl.INTERACT, 7);
                            }
                        } else {
                            C0UX6 c0ux62 = C0UX6.LIVE_PLAYBOOK_BROADCAST_GUIDE;
                            if (c0ux62.isShowing()) {
                                RedDotExtensionKt.LIZ(c0ux62);
                            }
                            C0UTJ c0utjPl12 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Pl1(this.LLILLJJLI);
                            if (c0utjPl12 != null) {
                                c0utjPl12.LJJI(false, "", new C915190ZvJ("interaction_panel", false, 6), EnumC20429314wl.INTERACT, null);
                            }
                        }
                        DataChannel dataChannel6 = this.LLILLJJLI;
                        if (dataChannel6 != null) {
                            dataChannel6.FQ2(DismissToolbarPopEvent.class);
                        }
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_playbook_entrance_click");
                        c474500IjALIZ.LJIJJLI(this.LLILLJJLI);
                        c474500IjALIZ.LJJII("interaction_panel", "enter_from");
                        c474500IjALIZ.LJJII(this.LL, "entrance");
                        c474500IjALIZ.LJJIIZI(LIZJ("livesdk_anchor_playbook_entrance_click"));
                        c474500IjALIZ.LIZ();
                    }

                    @Override // X.InterfaceC773910UXl
                    public final void LJI(View view15, LifecycleOwner lifecycleOwner, DataChannel dataChannel6) {
                        View viewFindViewById;
                        C978370bZD c978370bZDLIZLLL;
                        this.LLILLJJLI = dataChannel6;
                        if (view15 != null) {
                            viewFindViewById = view15.findViewById(R.id.t16);
                        } else {
                            viewFindViewById = null;
                        }
                        RedDotExtensionKt.LJI(viewFindViewById, lifecycleOwner, null, C0UX6.LIVE_PLAYBOOK_BROADCAST_GUIDE, null);
                        RedDotExtensionKt.LJI(viewFindViewById, lifecycleOwner, null, C0UX6.LIVE_PLAYBOOK_BROADCAST_SMB, null);
                        if (viewFindViewById != null) {
                            viewFindViewById.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC785980UsO(viewFindViewById, 4));
                        }
                        InterfaceC774000UXu interfaceC774000UXuG20 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).G20("livesdk_anchor_playbook_entrance_show");
                        if (interfaceC774000UXuG20 != null && (c978370bZDLIZLLL = interfaceC774000UXuG20.LIZLLL(this.LLILLJJLI)) != null) {
                            c978370bZDLIZLLL.LIZIZ.LJJII("interaction_panel", "enter_from");
                            c978370bZDLIZLLL.LIZIZ.LJJII(this.LL, "entrance");
                            c978370bZDLIZLLL.LIZJ.putAll(LIZJ("livesdk_anchor_playbook_entrance_show"));
                            c978370bZDLIZLLL.LIZ();
                        }
                    }

                    @Override // X.InterfaceC773910UXl
                    public final void LJFF(View view15, String str2, WeakReference<InterfaceC978780bZs> weakReference, DataChannel dataChannel6, boolean z2, int i) {
                        onClick(view15);
                    }
                }, view9);
            }
            if ((((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).enableRedEnvelopeForUserDiamond() || C500260Jjc.LJJJIL(this.LLJJIJIL)) && (view3 = this.LLJ) != null) {
                WR(((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).provideInteractionView(this), view3);
            }
            if ((((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).enableRedEnvelopeForSuperFan() || C500260Jjc.LJJJIL(this.LLJJIJIL)) && (view4 = this.LLJI) != null) {
                WR(((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).provideSuperFanTreasureBoxView(this), view4);
            }
            if ((((IGoodyBagService) C1161920gLG.LIZJ(IGoodyBagService.class)).ul2(this.LLJJIJIL) || C500260Jjc.LJJJIL(this.LLJJIJIL)) && (view5 = this.LLJIJIL) != null) {
                WR(((IGoodyBagService) C1161920gLG.LIZJ(IGoodyBagService.class)).Cb(), view5);
            }
            DataChannel dataChannel6 = this.LLJJIJIL;
            if (dataChannel6 != null && (roomLJJLIIIIJ2 = C500260Jjc.LJJLIIIIJ(dataChannel6)) != null && (roomAuthStatus3 = roomLJJLIIIIJ2.getRoomAuthStatus()) != null && roomAuthStatus3.viewerwishes == 1 && ViewerWishesConfig.INSTANCE.getGetValue().anchorEnabled && !C500260Jjc.LJJJIL(this.LLJJIJIL) && C781520UlC.LJIIJJI(C751980Tee.LIZJ(this.LLJJIJIL)) && (view8 = this.LLJJIJI) != null) {
                WR(GiftService.LLILLJJLI.provideViewerWishesIconForInteractionPanel(), view8);
            }
            DataChannel dataChannel7 = this.LLJJIJIL;
            if (dataChannel7 != null && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel7)) != null && (roomAuthStatus2 = roomLJJLIIIIJ.getRoomAuthStatus()) != null && roomAuthStatus2.musicgiftentrance == 1 && !C500260Jjc.LJJJIL(this.LLJJIJIL) && C781520UlC.LJIIJJI(C751980Tee.LIZJ(this.LLJJIJIL)) && C500260Jjc.LJIIZILJ(this.LLJJIJIL)) {
                ViewGroup viewGroup3 = this.LLJJIJIIJIL;
                if (viewGroup3 != null) {
                    C500260Jjc.LLFFF(viewGroup3);
                }
                View view15 = this.LLJJIJIIJIL;
                if (view15 != null) {
                    WR(((IMusicGiftService) C1161920gLG.LIZJ(IMusicGiftService.class)).lT0(), view15);
                }
            } else {
                ViewGroup viewGroup4 = this.LLJJIJIIJIL;
                if (viewGroup4 != null) {
                    C500260Jjc.LJIILIIL(viewGroup4);
                }
            }
            ConcurrentHashSet<C0U3Q> concurrentHashSet = C0U3P.LIZ;
            if (((!C0U3P.LIZIZ(C0U3Q.PAID_LIVE_EVENT) && !C0U3P.LIZIZ(C0U3Q.SUB_ONLY) && !C0U3P.LIZIZ(C0U3Q.COMMERCE)) || LiveKaraokeCommerceRenewSetting.INSTANCE.getValue()) && LiveKaraokeSetting.INSTANCE.enable() && !C500260Jjc.LJJJIL(this.LLJJIJIL)) {
                if (!C781520UlC.LJFF(C162100jj.LIZ(this.LLJJIJIL)) && (view7 = this.LLJILJILJ) != null) {
                    WR(new C0UDL(), view7);
                }
            } else {
                RedDotExtensionKt.LJIILL(C0UX6.LIVE_BROADCAST_KARAOKE_MORE, false);
                RedDotExtensionKt.LJIILL(C0UX6.LIVE_BROADCAST_KARAOKE_INTERACT, false);
            }
            if (InteractServiceDel.LLILLJJLI.Ub1(this.LLJJIJIL) && !C500260Jjc.LJJJIL(this.LLJJIJIL) && (view6 = this.LLJILLL) != null) {
                Bundle arguments = getArguments();
                if (arguments != null && arguments.getBoolean("collapsable")) {
                    z = true;
                }
                WR(new C501390JlR(z), view6);
            }
        }
        try {
            NR();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Map map2 = (Map) DataChannelGlobal.LLILZ.gg0(C1148020fyq.class);
        DataChannel dataChannel8 = this.LLJJIJIL;
        if (dataChannel8 != null) {
            map = (Map) dataChannel8.gg0(C754590Tir.class);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (map2 != null) {
            Iterator it2 = map2.keySet().iterator();
            while (it2.hasNext()) {
                long jLongValue = ((Number) it2.next()).longValue();
                if (Intrinsics.LJFF(map2.get(Long.valueOf(jLongValue)), Boolean.TRUE)) {
                    arrayList.add(Long.valueOf(jLongValue));
                }
            }
        }
        if (map != null) {
            Iterator it3 = map.keySet().iterator();
            while (it3.hasNext()) {
                long jLongValue2 = ((Number) it3.next()).longValue();
                if (Intrinsics.LJFF(map.get(Long.valueOf(jLongValue2)), Boolean.TRUE)) {
                    arrayList2.add(Long.valueOf(jLongValue2));
                }
            }
        }
        C773900UXk c773900UXk = this.LL;
        if (c773900UXk != null) {
            c773900UXk.setOnDisplayStateResolved$liveroomfunction_impl_release(new AwS221S0300000_12(this, (LiveInteractionFeaturesFragment) arrayList, (ArrayList<Long>) arrayList2, (ArrayList<Long>) 4));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (this.LLJJJ) {
            if (OR()) {
                i = R.layout.giz;
            } else if (PR()) {
                i = R.layout.gj0;
            } else {
                i = R.layout.giy;
            }
        } else {
            i = R.layout.gix;
        }
        View viewTd = C786410Ut5.Td(layoutInflater, i, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
