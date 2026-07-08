package com.ss.android.ugc.aweme.feed.adapter.widget.guide;

import X.C01GW;
import X.C0C3D;
import X.C0FEA;
import X.C10EU;
import X.C123100dR;
import X.C1243240iSQ;
import X.C1295960jpS;
import X.C1308910kAL;
import X.C1324840ka2;
import X.C13LE;
import X.C14KS;
import X.C1610740s1A;
import X.C1610770s1D;
import X.C19252910Tv;
import X.C19719912Dl;
import X.C19ME;
import X.C1A5L;
import X.C1AAU;
import X.C1AAV;
import X.C1ACA;
import X.C20684815ws;
import X.C2183471Acr;
import X.C2188811AlT;
import X.C2261501DfQ;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C2344009Gk;
import X.C416940GWm;
import X.C416990GWr;
import X.C418440Gaw;
import X.C424620Gku;
import X.C426750GoL;
import X.C452501pT;
import X.C487710JAr;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC494740Jai;
import X.InterfaceC662550Pyn;
import Y.ACListenerS167S0100000_33;
import Y.AObserverS235S0100000_33;
import android.animation.ObjectAnimator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveAvatarEntranceUnifySetting;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.bottom.LivePreviewBottomCardVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class PreviewEnterRoomGuideWidget extends LiveWatchPreviewWidget {
    public static final C01GW<Boolean> LLJL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(292));
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public InterfaceC662550Pyn LLJJLIIIJLLLLLLLZ;

    public PreviewEnterRoomGuideWidget() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LivePreviewGuideEnterVM.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 2106);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        EnumC494740Jai enumC494740Jai = EnumC494740Jai.WIDGET;
        this.LLJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, enumC494740Jai, awS577S0100000_33, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FeedLiveViewHolderVM.class);
        this.LLJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ2, enumC494740Jai, new AwS577S0100000_33(c19719912DlLIZ2, 2107), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(LivePreviewBottomCardVM.class);
        this.LLJIJIL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ3, enumC494740Jai, new AwS577S0100000_33(c19719912DlLIZ3, 2108), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        this.LLJILJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2111));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2099));
        this.LLJILLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2105));
        this.LLJJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2101));
        this.LLJJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2102));
        this.LLJJIII = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2098));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2109));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2110));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2104));
        this.LLJJJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2112));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2113));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2103));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2100));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2097));
        this.LLJJL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 377));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    public final FeedLiveViewHolderVM M1() {
        return (FeedLiveViewHolderVM) this.LLJI.getValue();
    }

    public final LivePreviewGuideEnterVM N1() {
        return (LivePreviewGuideEnterVM) this.LLJ.getValue();
    }

    public final C424620Gku O1() {
        return (C424620Gku) this.LLJJIJIIJIL.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        MutableLiveData<Boolean> mutableLiveData;
        C1ACA c1acaWQ2;
        LiveRoomStruct liveRoomStruct;
        User user;
        User user2;
        C416990GWr c416990GWr;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        LiveRoomStruct liveRoomStruct2;
        LiveRoomStruct liveRoomStruct3;
        LiveRoomStruct liveRoomStruct4;
        LiveRoomStruct liveRoomStruct5;
        SlimRoom.LinkMic linkMic;
        String strLIZIZ;
        List<com.bytedance.android.live.base.model.user.User> list;
        if (!isShowing()) {
            if (C1AAU.LIZ()) {
                ((TextView) this.LLJJI.getValue()).setText(C497740JfY.LJIJI(2131842202));
            } else {
                ((TextView) this.LLJJI.getValue()).setText(C497740JfY.LJIJI(2131842533));
            }
            C14KS.LJFF();
            C14KS.LIZLLL();
            if (C1AAU.LIZ()) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e3, getContext());
                if (numLIZJ != null) {
                    ((View) this.LLJILJILJ.getValue()).setBackgroundColor(numLIZJ.intValue());
                }
            } else {
                ((View) this.LLJILJILJ.getValue()).setBackgroundColor(C497740JfY.LJFF(R.color.a9_));
            }
            C500260Jjc.LJLJLJ((View) this.LLJILJIL.getValue(), true);
            ViewGroup.LayoutParams layoutParams = ((View) this.LLJILJIL.getValue()).getLayoutParams();
            if (C1AAU.LIZ()) {
                double dLIZLLL = ((double) C14KS.LIZLLL()) * 0.32d;
                if (layoutParams instanceof C19ME) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) dLIZLLL;
                }
                C0C3D.LIZ.getClass();
                if (C0C3D.LIZ()) {
                    LivePreviewGuideEnterVM livePreviewGuideEnterVMN1 = N1();
                    C500260Jjc.LJJZ(livePreviewGuideEnterVMN1 != null ? livePreviewGuideEnterVMN1.LLIZ + livePreviewGuideEnterVMN1.LLIZLLLIL : 0, (View) this.LLJJJJJIL.getValue());
                } else {
                    View view = (View) this.LLJJJJJIL.getValue();
                    LivePreviewGuideEnterVM livePreviewGuideEnterVMN12 = N1();
                    C500260Jjc.LJJZ(livePreviewGuideEnterVMN12 != null ? livePreviewGuideEnterVMN12.LLIZ : 0, view);
                }
            } else {
                int iLIZLLL = C14KS.LIZLLL() / 5;
                if (layoutParams instanceof C19ME) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = iLIZLLL + ((int) C497740JfY.LIZIZ(48.0f));
                }
            }
            C500260Jjc.LJLJLJ((View) this.LLJILLL.getValue(), true);
            if (!C1AAU.LIZ() && (O1().getLayoutParams() instanceof C19ME)) {
                ((ViewGroup.MarginLayoutParams) O1().getLayoutParams()).bottomMargin = (int) C497740JfY.LIZIZ(17.0f);
            }
            C1ACA c1acaZ1 = z1();
            if (c1acaZ1 != null && (liveRoomStruct5 = c1acaZ1.LIZJ) != null) {
                O1().setBackground(C497740JfY.LJIIJ(R.drawable.ela));
                C424620Gku c424620GkuO1 = O1();
                User user3 = liveRoomStruct5.owner;
                C1324840ka2.LJFF(c424620GkuO1, user3 != null ? user3.getAvatarThumb() : null);
                ((C1610740s1A) this.LLJJL.getValue()).LJFF(null, liveRoomStruct5.getClass(), null, null, null);
                ((C1610740s1A) this.LLJJL.getValue()).LIZ();
                try {
                    linkMic = (SlimRoom.LinkMic) C2183471Acr.LIZ(liveRoomStruct5.linkMic, new C2261501DfQ());
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    linkMic = null;
                }
                User user4 = liveRoomStruct5.owner;
                if (user4 == null || TextUtils.isEmpty(user4.getUniqueId())) {
                    strLIZIZ = C10EU.LIZIZ(liveRoomStruct5.owner, true);
                } else if (C0FEA.LIZ()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('@');
                    sbLIZ.append(C1243240iSQ.LJ(C1243240iSQ.LIZ, liveRoomStruct5.owner));
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    strLIZIZ = C1243240iSQ.LJ(C1243240iSQ.LIZ, liveRoomStruct5.owner);
                }
                if (linkMic != null && (list = linkMic.followedList) != null && list.size() > 0) {
                    C1243240iSQ c1243240iSQ = C1243240iSQ.LIZ;
                    String nickName = ((com.bytedance.android.live.base.model.user.User) ListProtector.get(list, 0)).getNickName();
                    String username = ((com.bytedance.android.live.base.model.user.User) ListProtector.get(list, 0)).getUsername();
                    c1243240iSQ.getClass();
                    String strLIZLLL = C1243240iSQ.LIZLLL(nickName, username);
                    if (C123100dR.LIZ(strLIZLLL)) {
                        if (C0FEA.LIZ()) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append('@');
                            sbLIZ2.append(strLIZLLL);
                            strLIZLLL = C2188811AlT.LIZIZ(sbLIZ2);
                        }
                        strLIZIZ = strLIZLLL;
                    }
                }
                ((TextView) this.LLJJJ.getValue()).setText(strLIZIZ);
            }
            C500260Jjc.LJLJLJ((View) this.LLJJIJI.getValue(), true);
            if (C1AAU.LIZ()) {
                ((TextView) this.LLJJIJI.getValue()).setText(C497740JfY.LJIJI(2131842201));
                C1ACA c1acaZ12 = z1();
                String str = (c1acaZ12 == null || (liveRoomStruct4 = c1acaZ12.LIZJ) == null) ? null : liveRoomStruct4.title;
                if (TextUtils.isEmpty(str)) {
                    ((TextView) this.LLJJJIL.getValue()).setText(C497740JfY.LJIJI(2131842200));
                } else {
                    ((TextView) this.LLJJJIL.getValue()).setText(str);
                }
            } else {
                ((TextView) this.LLJJIJI.getValue()).setText(C497740JfY.LJIJI(2131842532));
                ((TextView) this.LLJJJIL.getValue()).setText(C497740JfY.LJIJI(2131842534));
            }
            C1ACA c1acaZ13 = z1();
            long j = (c1acaZ13 == null || (liveRoomStruct3 = c1acaZ13.LIZJ) == null) ? -1L : liveRoomStruct3.maxPreviewTime;
            C1ACA c1acaZ14 = z1();
            long j2 = (c1acaZ14 == null || (liveRoomStruct2 = c1acaZ14.LIZJ) == null) ? -1L : liveRoomStruct2.allowPreviewTime;
            long j3 = 0;
            boolean z = j2 > 0;
            if (j > 0 && z) {
                ((TextView) this.LLJJJIL.getValue()).setText(C497740JfY.LJIJI(2131843856));
            }
            C786410Ut5.Y9((C1610770s1D) this.LLJJIJIL.getValue(), new ACListenerS167S0100000_33(this, 98));
            if (C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() == 1) {
                ViewGroup.LayoutParams layoutParams2 = ((View) this.LLJJIII.getValue()).getLayoutParams();
                if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(46));
                    C786410Ut5.a6((FrameLayout) this.LLJJIII.getValue(), marginLayoutParams);
                }
            }
            C786410Ut5.O7((FrameLayout) this.LLJJIII.getValue(), new ACListenerS167S0100000_33(this, 99));
            C786410Ut5.K7((ViewGroup) this.LLJJ.getValue(), new ACListenerS167S0100000_33(this, 100));
            C786410Ut5.I7(new ACListenerS167S0100000_33(this, 101), this.contentView);
            C2271391DvN.LIZ(this.contentView, (C1A5L) C2271381DvM.LJLL.getValue());
            C424620Gku c424620Gku = (C424620Gku) findViewById(R.id.mts);
            if (LiveAvatarEntranceUnifySetting.getValue()) {
                if (c424620Gku != null) {
                    C786410Ut5.k(c424620Gku, 0);
                    this.LLJJLIIIJLLLLLLLZ = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).v3().LJIJJLI(c424620Gku);
                }
                C786410Ut5.LJLLLLLL(8, (View) this.LLJILLL.getValue());
                C416940GWm c416940GWm = (C416940GWm) findViewById(R.id.user_avatar_container);
                if (c416940GWm != null) {
                    c416940GWm.LLILLJJLI = true;
                }
                C1610770s1D c1610770s1D = (C1610770s1D) this.LLJJIJIL.getValue();
                if ((c1610770s1D instanceof C416990GWr) && (c416990GWr = (C416990GWr) c1610770s1D) != null) {
                    c416990GWr.LLJILJIL = true;
                }
                O1().setBackground(null);
                O1().getHierarchy().LJJ(R.drawable.ela);
                float fLIZIZ = C418440Gaw.LIZIZ(Double.valueOf(2.5d));
                int iLIZIZ = (int) (C418440Gaw.LIZIZ(Float.valueOf(2.5f)) + (fLIZIZ / 2.0f));
                C426750GoL.LJIIL((View) this.LLJJIJIL.getValue(), 0, Integer.valueOf(iLIZIZ), 0, Integer.valueOf(iLIZIZ), 16);
                ((C1610770s1D) this.LLJJIJIL.getValue()).setInnerStrokeWidth((int) fLIZIZ);
            } else {
                if (c424620Gku != null) {
                    C786410Ut5.k(c424620Gku, 8);
                }
                C786410Ut5.LJLLLLLL(0, (View) this.LLJILLL.getValue());
            }
            LivePreviewGuideEnterVM livePreviewGuideEnterVMN13 = N1();
            if (livePreviewGuideEnterVMN13 != null && (c1acaWQ2 = livePreviewGuideEnterVMN13.wQ2()) != null) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from_merge", c1acaWQ2.LIZLLL);
                c2344009Gk.LJIIIIZZ("action_type", "click");
                LiveRoomStruct liveRoomStruct6 = c1acaWQ2.LIZJ;
                c2344009Gk.LJIIIIZZ("anchor_id", (liveRoomStruct6 == null || (user2 = liveRoomStruct6.owner) == null) ? null : user2.getUid());
                LiveRoomStruct liveRoomStruct7 = c1acaWQ2.LIZJ;
                c2344009Gk.LJ(liveRoomStruct7 != null ? Long.valueOf(liveRoomStruct7.id) : null, "room_id");
                Aweme aweme = c1acaWQ2.LIZIZ;
                c2344009Gk.LJIIIIZZ("request_id", aweme != null ? aweme.getRequestId() : null);
                c2344009Gk.LJIIIIZZ("enter_method", "live_cell");
                C487710JAr c487710JAr = C487710JAr.LIZ;
                LiveRoomStruct liveRoomStruct8 = c1acaWQ2.LIZJ;
                c487710JAr.getClass();
                c2344009Gk.LIZJ(C487710JAr.LIZ(liveRoomStruct8), "follow_status");
                C20684815ws.LJIILLIIL("livesdk_fyp_guidence_page_show", c2344009Gk.LIZ);
                LiveRoomStruct liveRoomStruct9 = c1acaWQ2.LIZJ;
                if (liveRoomStruct9 != null && liveRoomStruct9.allowPreviewTime > 0) {
                    C2344009Gk c2344009Gk2 = new C2344009Gk();
                    c2344009Gk2.LJIIIIZZ("enter_from_merge", c1acaWQ2.LIZLLL);
                    LiveRoomStruct liveRoomStruct10 = c1acaWQ2.LIZJ;
                    c2344009Gk2.LJIIIIZZ("anchor_id", (liveRoomStruct10 == null || (user = liveRoomStruct10.owner) == null) ? null : user.getUid());
                    LiveRoomStruct liveRoomStruct11 = c1acaWQ2.LIZJ;
                    c2344009Gk2.LJ(liveRoomStruct11 != null ? Long.valueOf(liveRoomStruct11.id) : null, "room_id");
                    Aweme aweme2 = c1acaWQ2.LIZIZ;
                    c2344009Gk2.LJIIIIZZ("request_id", aweme2 != null ? aweme2.getRequestId() : null);
                    c2344009Gk2.LJIIIIZZ("enter_method", "live_cell");
                    c2344009Gk2.LJIIIIZZ("action_type", "click");
                    C1ACA c1acaWQ22 = livePreviewGuideEnterVMN13.wQ2();
                    if (c1acaWQ22 != null && (liveRoomStruct = c1acaWQ22.LIZJ) != null) {
                        j3 = liveRoomStruct.maxPreviewTime;
                    }
                    c2344009Gk2.LIZLLL(j3 / 1000, "maximum_preview_duration");
                    C20684815ws.LJIILLIIL("livesdk_sub_only_live_enter_room_boot_show", c2344009Gk2.LIZ);
                }
            }
            if (C1AAU.LIZ()) {
                ((C1295960jpS) this.LLJJJJ.getValue()).resumeAnimation();
                C786410Ut5.T4((View) this.LLJJJJLIIL.getValue(), 0.0f);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLJJJJLIIL.getValue(), "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(600L);
                C786410Ut5.Pd(objectAnimatorOfFloat);
            } else {
                C786410Ut5.T4(this.contentView, 0.0f);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.contentView, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat2.setDuration(600L);
                C786410Ut5.Pd(objectAnimatorOfFloat2);
            }
            InterfaceC662550Pyn interfaceC662550Pyn = this.LLJJLIIIJLLLLLLLZ;
            if (interfaceC662550Pyn != null) {
                interfaceC662550Pyn.LIZ();
            }
        }
        super.show();
        LivePreviewGuideEnterVM livePreviewGuideEnterVMN14 = N1();
        if (livePreviewGuideEnterVMN14 == null || (mutableLiveData = livePreviewGuideEnterVMN14.LLILZIL) == null) {
            return;
        }
        mutableLiveData.setValue(Boolean.TRUE);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void E1() {
        hide();
        LivePreviewGuideEnterVM livePreviewGuideEnterVMN1 = N1();
        if (livePreviewGuideEnterVMN1 != null) {
            livePreviewGuideEnterVMN1.EQ2();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        LivePreviewGuideEnterVM livePreviewGuideEnterVMN1;
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 == null || c1acaZ1.LJII) {
            return;
        }
        if (isShowing() && (livePreviewGuideEnterVMN1 = N1()) != null) {
            livePreviewGuideEnterVMN1.CQ2("draw");
        }
        hide();
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return C1AAU.LIZ() ? R.layout.dg8 : R.layout.dg7;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        MutableLiveData<Boolean> mutableLiveData;
        super.hide();
        if (C1AAU.LIZ()) {
            ((C1295960jpS) this.LLJJJJ.getValue()).pauseAnimation();
        }
        InterfaceC662550Pyn interfaceC662550Pyn = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC662550Pyn != null) {
            interfaceC662550Pyn.LJIIZILJ();
        }
        LivePreviewGuideEnterVM livePreviewGuideEnterVMN1 = N1();
        if (livePreviewGuideEnterVMN1 == null || (mutableLiveData = livePreviewGuideEnterVMN1.LLILZIL) == null) {
            return;
        }
        mutableLiveData.setValue(Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJLIIIL(int i) {
        C1ACA c1acaZ1;
        LivePreviewGuideEnterVM livePreviewGuideEnterVMN1;
        if (i != 2) {
            hide();
            LivePreviewGuideEnterVM livePreviewGuideEnterVMN12 = N1();
            if (livePreviewGuideEnterVMN12 != null) {
                livePreviewGuideEnterVMN12.EQ2();
            }
        }
        if (isShowing() && (c1acaZ1 = z1()) != null && !c1acaZ1.LLFFF && (livePreviewGuideEnterVMN1 = N1()) != null) {
            livePreviewGuideEnterVMN1.CQ2("draw");
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        C2271391DvN.LIZ((View) this.LLJJIII.getValue(), (C1A5L) C2271381DvM.LJJZZI.getValue());
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        NextLiveData<Integer> nextLiveData;
        MutableLiveData<C1AAV> mutableLiveData;
        NextLiveData<Boolean> nextLiveData2;
        super.onLoad(objArr);
        FeedLiveViewHolderVM feedLiveViewHolderVMM1 = M1();
        if (feedLiveViewHolderVMM1 != null && (nextLiveData2 = feedLiveViewHolderVMM1.LLJJJIL) != null) {
            nextLiveData2.observe(this, new AObserverS235S0100000_33(this, 21));
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMM12 = M1();
        if (feedLiveViewHolderVMM12 != null && (mutableLiveData = feedLiveViewHolderVMM12.LLJL) != null) {
            mutableLiveData.observe(this, new AObserverS235S0100000_33(this, 22));
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMM13 = M1();
        if (feedLiveViewHolderVMM13 != null && (nextLiveData = feedLiveViewHolderVMM13.LLJJJJJIL) != null) {
            nextLiveData.observe(this, new AObserverS235S0100000_33(this, 23));
        }
    }
}
