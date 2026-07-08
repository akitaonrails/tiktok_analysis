package com.bytedance.android.livesdk.broadcast.preview.widget.revision;

import X.C098200Yq;
import X.C0IJT;
import X.C0UI4;
import X.C0UI9;
import X.C0UIB;
import X.C0UJS;
import X.C0ULO;
import X.C0UYZ;
import X.C1143680frq;
import X.C1161920gLG;
import X.C11S5;
import X.C1295710jp3;
import X.C1295870jpJ;
import X.C1295960jpS;
import X.C1324720kZq;
import X.C158B;
import X.C189200o6;
import X.C20721089v;
import X.C2095008Iq;
import X.C2782015w;
import X.C474500IjA;
import X.C480460Ism;
import X.C497740JfY;
import X.C500260Jjc;
import X.C760180Trs;
import X.C770730ULf;
import X.C786410Ut5;
import X.InterfaceC1143790fs1;
import Y.ALAdapterS5S0300000_12;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS81S0200000_12;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Looper;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.api.PreviewLiveTabCapsuleColorThemeChangeEvent;
import com.bytedance.android.live.broadcast.model.ActivitiesIconInfo;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.api.BroadcastRoomApi;
import com.bytedance.android.livesdk.broadcast.preview.widget.revision.PreviewCampaignCenterWidget;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewMoreLessVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorPreviewUniformStyleABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostWsMigrationSwitch;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.host.IHostTux;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import webcast.api.room.EventTrackingMeta;
import webcast.api.room.EventTrackingReportReqMessage;
import webcast.data.LiveGoLivePageContainer;
import webcast.data.TopRightBannerContainerComponent;
import webcast.data.TopRightContainerComponent;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewCampaignCenterWidget extends PreviewWidget {
    public ActivitiesIconInfo LLILZ;
    public C1295960jpS LLILZIL;
    public TuxIconView LLILZLL;
    public C1324720kZq LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public boolean LLJI;
    public int LLJIJIL;
    public final BPEAHandler LLJILJIL = new BPEAHandler(Looper.getMainLooper());
    public Uri.Builder LLJILJILJ;
    public TopRightContainerComponent LLJILLL;
    public boolean LLJJ;
    public ARunnableS81S0200000_12 LLJJI;
    public ARunnableS112S0100000_12 LLJJIII;
    public Map<Integer, LiveGoLivePageContainer> LLJJIJI;
    public boolean LLJJIJIIJIL;
    public int LLJJIJIL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i0z;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void G1() {
        ARunnableS81S0200000_12 aRunnableS81S0200000_12 = this.LLJJI;
        if (aRunnableS81S0200000_12 != null) {
            this.LLJILJIL.removeCallbacks(aRunnableS81S0200000_12);
        }
        ARunnableS112S0100000_12 aRunnableS112S0100000_12 = this.LLJJIII;
        if (aRunnableS112S0100000_12 != null) {
            this.LLJILJIL.removeCallbacks(aRunnableS112S0100000_12);
        }
        this.LLJJI = null;
        this.LLJJIII = null;
    }

    public final void H1() {
        LiveGoLivePageContainer liveGoLivePageContainerLIZIZ;
        TopRightContainerComponent topRightContainerComponent;
        boolean z;
        DataChannel dataChannel;
        Integer numLJIIJJI;
        TopRightContainerComponent next;
        Map<Integer, LiveGoLivePageContainer> map = this.LLJJIJI;
        if (map == null || (liveGoLivePageContainerLIZIZ = C760180Trs.LIZIZ(this.dataChannel, map)) == null) {
            return;
        }
        TopRightBannerContainerComponent topRightBannerContainerComponent = liveGoLivePageContainerLIZIZ.topRightBannerContainer;
        this.LLJJ = topRightBannerContainerComponent != null && topRightBannerContainerComponent.targetTopRightContainerItemType == 2;
        List<TopRightContainerComponent> list = liveGoLivePageContainerLIZIZ.topRightContainer;
        if (list != null) {
            Iterator<TopRightContainerComponent> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (next.type == 2) {
                        break;
                    }
                }
            }
            topRightContainerComponent = next;
        } else {
            topRightContainerComponent = null;
        }
        this.LLJILLL = topRightContainerComponent;
        if (topRightContainerComponent == null) {
            hide();
            return;
        }
        String str = this.LLIZLLLIL;
        String str2 = this.LLJ;
        if (str != null && str2 != null) {
            try {
                C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
                c474500IjALIZ.LJJIIJZLJL(new JSONObject(str2));
                c474500IjALIZ.LIZ();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            this.LLIZLLLIL = null;
            this.LLJ = null;
        }
        DataChannel dataChannel2 = this.dataChannel;
        TopRightContainerComponent topRightContainerComponent2 = this.LLJILLL;
        C2782015w.LIZIZ(dataChannel2, topRightContainerComponent2 != null ? topRightContainerComponent2.trackExtra : null);
        TopRightContainerComponent topRightContainerComponent3 = this.LLJILLL;
        if (topRightContainerComponent3 != null && !Intrinsics.LJFF(C20721089v.LIZ(topRightContainerComponent3.tuxUrl), "IconFlagStarFill")) {
            ((IHostTux) C1161920gLG.LIZJ(IHostTux.class)).Xl2(this.LLILZLL, topRightContainerComponent3.tuxUrl, this.context, false);
        }
        TopRightContainerComponent topRightContainerComponent4 = this.LLJILLL;
        Map<String, String> map2 = topRightContainerComponent4 != null ? topRightContainerComponent4.extra : null;
        String strO1 = O1("number", map2);
        int iMin = Math.min((strO1 == null || (numLJIIJJI = C2095008Iq.LJIIJJI(strO1)) == null) ? 0 : numLJIIJJI.intValue(), 9);
        this.LLJIJIL = iMin;
        this.LLJI = iMin != 0;
        Intrinsics.LJFF(O1("has_new_campaign_launched", map2), "true");
        this.LLIZLLLIL = O1("event_name", map2);
        this.LLJ = O1("event_data", map2);
        if (this.LLJILLL != null) {
            final ActivitiesIconInfo activitiesIconInfo = new ActivitiesIconInfo();
            String strO12 = O1("ab_group", map2);
            Long lLJIILIIL = strO12 != null ? C2095008Iq.LJIILIIL(strO12) : null;
            if (lLJIILIIL == null) {
                lLJIILIIL = 0L;
            }
            activitiesIconInfo.abGroup = lLJIILIIL;
            String strO13 = O1("activity_id", map2);
            if (strO13 == null) {
                strO13 = "";
            }
            activitiesIconInfo.activityId = strO13;
            activitiesIconInfo.isLiveFest = Intrinsics.LJFF(O1("is_live_fest", map2), "true");
            String strO14 = O1("current_phase", map2);
            if (strO14 == null) {
                strO14 = "";
            }
            activitiesIconInfo.currenPhase = strO14;
            ImageModel imageModel = new ImageModel();
            String strO15 = O1("url", map2);
            if (strO15 == null) {
                strO15 = "";
            }
            imageModel.setUrls(Collections.singletonList(strO15));
            String strO16 = O1("url", map2);
            if (strO16 == null) {
                strO16 = "";
            }
            imageModel.setUri(strO16);
            activitiesIconInfo.iconImage = imageModel;
            this.LLILZ = activitiesIconInfo;
            if (!I1()) {
                Long l = activitiesIconInfo.abGroup;
                if (l == null || l.longValue() != 0) {
                    if (activitiesIconInfo.iconImage == null) {
                        C0UI9.LIZIZ(C0UI4.LIVE_CAMPAIGN_ANIMATION);
                    } else if (this.LLJJ) {
                        L1("banner_exist", false);
                        C0UI9.LIZIZ(C0UI4.LIVE_CAMPAIGN_ANIMATION);
                    } else {
                        C0UI9.LIZJ(C0UI4.LIVE_CAMPAIGN_ANIMATION, new C0UIB() { // from class: X.0UM2
                            @Override // X.C0UIB
                            public final void LIZ() {
                                PreviewCampaignCenterWidget.N1(this.LIZ, false, 0L, 7);
                                this.LIZ.L1("icon_priority", false);
                            }

                            @Override // X.C0UIB
                            public final void show() {
                                ViewPropertyAnimator viewPropertyAnimatorAnimate;
                                PreviewCampaignCenterWidget previewCampaignCenterWidget = this.LIZ;
                                ActivitiesIconInfo activitiesIconInfo2 = activitiesIconInfo;
                                previewCampaignCenterWidget.getClass();
                                try {
                                    C1295960jpS c1295960jpS = previewCampaignCenterWidget.LLILZIL;
                                    if (c1295960jpS != null) {
                                        C500260Jjc.LJIILLIIL(c1295960jpS);
                                    }
                                    C500260Jjc.LJIILLIIL(previewCampaignCenterWidget.LLILZLL);
                                    C500260Jjc.LLFFF(previewCampaignCenterWidget.LLIZ);
                                    C1324720kZq c1324720kZq = previewCampaignCenterWidget.LLIZ;
                                    if (c1324720kZq == null || (viewPropertyAnimatorAnimate = c1324720kZq.animate()) == null) {
                                        viewPropertyAnimatorAnimate = null;
                                    } else {
                                        viewPropertyAnimatorAnimate.scaleX(0.0f);
                                        viewPropertyAnimatorAnimate.scaleY(0.0f);
                                        viewPropertyAnimatorAnimate.setDuration(150L);
                                        viewPropertyAnimatorAnimate.setStartDelay(0L);
                                        viewPropertyAnimatorAnimate.setInterpolator(new DecelerateInterpolator(1.5f));
                                        viewPropertyAnimatorAnimate.setListener(new ALAdapterS5S0300000_12(previewCampaignCenterWidget, activitiesIconInfo2, viewPropertyAnimatorAnimate, 0));
                                        viewPropertyAnimatorAnimate.start();
                                    }
                                    C189200o6.m2constructorimpl(viewPropertyAnimatorAnimate);
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                                }
                            }
                        });
                        z = true;
                    }
                }
                z = false;
            } else if (this.LLJJ) {
                L1("banner_exist", false);
                z = false;
            } else {
                L1("", true);
                C1324720kZq c1324720kZq = this.LLIZ;
                if (c1324720kZq != null) {
                    G1();
                    C1295960jpS c1295960jpS = this.LLILZIL;
                    if (c1295960jpS != null) {
                        C500260Jjc.LJIILLIIL(c1295960jpS);
                    }
                    C500260Jjc.LJIILLIIL(c1324720kZq);
                    c1324720kZq.animate().cancel();
                    C786410Ut5.Yb(c1324720kZq, 1.0f);
                    C786410Ut5.xc(c1324720kZq, 1.0f);
                    TuxIconView tuxIconView = this.LLILZLL;
                    if (tuxIconView != null) {
                        C500260Jjc.LLFFF(tuxIconView);
                        tuxIconView.animate().cancel();
                        C786410Ut5.hc(tuxIconView, 1.0f);
                        C786410Ut5.Cc(tuxIconView, 1.0f);
                    }
                    ARunnableS81S0200000_12 aRunnableS81S0200000_12 = new ARunnableS81S0200000_12(activitiesIconInfo, this, 80);
                    this.LLJJI = aRunnableS81S0200000_12;
                    C786410Ut5.LJLIIL(1000L, this.LLJILJIL, aRunnableS81S0200000_12);
                }
                z = true;
            }
        } else {
            z = false;
        }
        if (this.LLJI && !z) {
            J1(2000L, true, false);
        }
        if (!C500260Jjc.LJJJI(Boolean.valueOf(this.LLJJIJIIJIL))) {
            if (C770730ULf.LIZIZ(this.dataChannel)) {
                C0UI9.LIZIZ(C0UI4.LIVE_CAMPAIGN_ANIMATION);
            }
            hide();
            return;
        }
        show();
        TopRightBannerContainerComponent topRightBannerContainerComponent2 = liveGoLivePageContainerLIZIZ.topRightBannerContainer;
        if (topRightBannerContainerComponent2 == null || topRightBannerContainerComponent2.targetTopRightContainerItemType != 2 || (dataChannel = this.dataChannel) == null) {
            return;
        }
        dataChannel.zW(PreviewBannerAnchorViewChannel.class, getView());
    }

    public final boolean I1() {
        TopRightContainerComponent topRightContainerComponent = this.LLJILLL;
        return Intrinsics.LJFF(O1("is_live_fest", topRightContainerComponent != null ? topRightContainerComponent.extra : null), "true");
    }

    public final void P1() {
        String str;
        String str2;
        ActivitiesIconInfo activitiesIconInfo;
        EventTrackingReportReqMessage eventTrackingReportReqMessage = new EventTrackingReportReqMessage();
        List<EventTrackingMeta> list = eventTrackingReportReqMessage.metaList;
        EventTrackingMeta eventTrackingMeta = new EventTrackingMeta();
        eventTrackingMeta.type = I1() ? 6 : 4;
        if (!I1() || (activitiesIconInfo = this.LLILZ) == null || (str = activitiesIconInfo.currenPhase) == null) {
            str = "1";
        }
        eventTrackingMeta.objectId = str;
        eventTrackingMeta.timestamp = C158B.LIZJ();
        list.add(eventTrackingMeta);
        List<EventTrackingMeta> list2 = eventTrackingReportReqMessage.metaList;
        EventTrackingMeta eventTrackingMeta2 = new EventTrackingMeta();
        eventTrackingMeta2.type = 3;
        ActivitiesIconInfo activitiesIconInfo2 = this.LLILZ;
        if (activitiesIconInfo2 == null || (str2 = activitiesIconInfo2.activityId) == null) {
            str2 = "";
        }
        eventTrackingMeta2.objectId = str2;
        eventTrackingMeta2.timestamp = C158B.LIZJ();
        list2.add(eventTrackingMeta2);
        if (LiveHostWsMigrationSwitch.INSTANCE.isEnable()) {
            C0UYZ.LIZ(eventTrackingReportReqMessage);
        } else {
            C480460Ism.LIZ().getClass();
            ((BroadcastRoomApi) C480460Ism.LIZLLL(BroadcastRoomApi.class)).reportCampaignEvent(eventTrackingReportReqMessage).LJL(C11S5.LIZ()).LJJLJ();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        View view;
        LiveMode liveMode;
        super.C1();
        H1();
        if (!AnchorPreviewUniformStyleABSetting.INSTANCE.enable() || (view = getView()) == null) {
            return;
        }
        DataChannel dataChannel = this.dataChannel;
        int i = (dataChannel == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null) ? -1 : C0UJS.LIZ[liveMode.ordinal()];
        if (i == 1) {
            C0ULO.LIZ(view, 1, "PreviewCampaignCenterWidget", false);
        } else if (i != 2) {
            C0ULO.LIZ(view, 0, "PreviewCampaignCenterWidget", false);
        } else {
            C0ULO.LIZ(view, this.LLJJIJIL, "PreviewCampaignCenterWidget", false);
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        this.LLILZIL = (C1295960jpS) findViewById(R.id.widget_animation);
        this.LLIZ = (C1324720kZq) findViewById(R.id.widget_icon);
        this.LLILZLL = (TuxIconView) findViewById(R.id.z0m);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, RoomCreateInfoChannel.class, new AwS591S0100000_12(this, 382));
            dataChannel.EQ2(this, PreviewMoreLessVisibilityChannel.class, new AwS591S0100000_12(this, 383));
            dataChannel.EQ2(this, PreviewLiveTabCapsuleColorThemeChangeEvent.class, new AwS591S0100000_12(this, 384));
        }
        View view = getView();
        if (view != null) {
            C500260Jjc.LJLIIIL(1000L, view, new AwS591S0100000_12(this, 385));
        }
    }

    public final void M1() {
        G1();
        C1295960jpS c1295960jpS = this.LLILZIL;
        if (c1295960jpS != null) {
            C500260Jjc.LJIILLIIL(c1295960jpS);
        }
        C1324720kZq c1324720kZq = this.LLIZ;
        if (c1324720kZq != null) {
            C500260Jjc.LJIILLIIL(c1324720kZq);
        }
        TuxIconView tuxIconView = this.LLILZLL;
        if (tuxIconView != null) {
            C500260Jjc.LLFFF(tuxIconView);
        }
        TuxIconView tuxIconView2 = this.LLILZLL;
        if (tuxIconView2 != null) {
            C786410Ut5.hc(tuxIconView2, 1.0f);
        }
        TuxIconView tuxIconView3 = this.LLILZLL;
        if (tuxIconView3 != null) {
            C786410Ut5.Cc(tuxIconView3, 1.0f);
        }
        this.LLILZ = null;
        N1(this, false, 0L, 7);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        super.onDestroy();
        C1295960jpS c1295960jpS = this.LLILZIL;
        if (c1295960jpS != null) {
            c1295960jpS.cancelAnimation();
        }
        this.LLILZIL = null;
        C1324720kZq c1324720kZq = this.LLIZ;
        if (c1324720kZq != null && (viewPropertyAnimatorAnimate = c1324720kZq.animate()) != null) {
            viewPropertyAnimatorAnimate.cancel();
        }
        this.LLIZ = null;
        TuxIconView tuxIconView = this.LLILZLL;
        if (tuxIconView != null) {
            tuxIconView.animate().cancel();
        }
        this.LLILZLL = null;
        G1();
        this.LLJILJIL.removeCallbacksAndMessages(null);
        if (this.LLILZ != null) {
            P1();
        }
    }

    public static String O1(String str, Map map) {
        if (map != null) {
            return (String) map.get(str);
        }
        return null;
    }

    public final void L1(String str, boolean z) {
        String str2;
        String str3;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_campaign_icon_release");
        c474500IjALIZ.LJIIIIZZ();
        ActivitiesIconInfo activitiesIconInfo = this.LLILZ;
        if (activitiesIconInfo == null || (str2 = activitiesIconInfo.activityId) == null) {
            str2 = "";
        }
        c474500IjALIZ.LJJII(str2, "activity_id");
        if (z) {
            str3 = "success";
        } else {
            str3 = "fail";
        }
        c474500IjALIZ.LJJII(str3, "show_status");
        if (!z) {
            c474500IjALIZ.LJJII(str, "fail_reason");
        }
        c474500IjALIZ.LIZ();
    }

    public final void J1(final long j, final boolean z, final boolean z2) {
        String str;
        final C1295960jpS c1295960jpS = this.LLILZIL;
        C1295710jp3 c1295710jp3 = new C1295710jp3(c1295960jpS) { // from class: X.0UM3
            @Override // X.C1295710jp3
            public final String LIZ(String str2) {
                if (Intrinsics.LJFF(str2, "9")) {
                    return String.valueOf(this.LIZJ.LLJIJIL);
                }
                return str2;
            }
        };
        C1295960jpS c1295960jpS2 = this.LLILZIL;
        if (c1295960jpS2 != null) {
            c1295960jpS2.setTextDelegate(c1295710jp3);
        }
        try {
            C1295960jpS c1295960jpS3 = this.LLILZIL;
            if (c1295960jpS3 != null && this.context != null) {
                c1295960jpS3.setFontAssetDelegate(new C1295870jpJ() { // from class: X.0frz
                    @Override // X.C1295870jpJ
                    public final Typeface LIZ(String str2, String str3, String str4) {
                        Typeface typefaceLIZIZ = C1697580uHE.LIZIZ(0.0f, OppoPermissionPopupMaskDelayExp.DEFAULT, 0.0f, 0.0f, null, 0.0f, 0, null, 253);
                        if (typefaceLIZIZ == null) {
                            C20441214yg.LJ("LottieFontAssetDelegate", "typeface is null");
                        }
                        return typefaceLIZIZ;
                    }
                });
                if (C497740JfY.LJJ()) {
                    str = "ttlive_preview_campaign_center_icon_with_num_rtl.zip";
                } else {
                    str = "ttlive_preview_campaign_center_icon_with_num.zip";
                }
                C1143680frq.LJIILL(this.LLILZIL, "tiktok_live_broadcast_demand_7", str, false, new InterfaceC1143790fs1() { // from class: X.0UM5
                    @Override // X.InterfaceC1143790fs1
                    public final void onFinish(boolean z3) {
                        PreviewCampaignCenterWidget previewCampaignCenterWidget = this.LIZ;
                        if (previewCampaignCenterWidget.context != null && z3) {
                            if (z) {
                                C786410Ut5.LJLIIL(j, previewCampaignCenterWidget.LLJILJIL, new ARunnableS112S0100000_12(previewCampaignCenterWidget, 264));
                            } else {
                                if (z2) {
                                    C786410Ut5.LJLIIL(j, previewCampaignCenterWidget.LLJILJIL, new ARunnableS112S0100000_12(previewCampaignCenterWidget, 265));
                                    PreviewCampaignCenterWidget previewCampaignCenterWidget2 = this.LIZ;
                                    C786410Ut5.LJLIIL(j + ((long) DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), previewCampaignCenterWidget2.LLJILJIL, new ARunnableS112S0100000_12(previewCampaignCenterWidget2, 266));
                                    return;
                                }
                                C786410Ut5.LJLIIL(j, previewCampaignCenterWidget.LLJILJIL, new ARunnableS112S0100000_12(previewCampaignCenterWidget, 267));
                            }
                        }
                    }
                });
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void N1(PreviewCampaignCenterWidget previewCampaignCenterWidget, boolean z, long j, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        if (previewCampaignCenterWidget.LLJI) {
            previewCampaignCenterWidget.J1(j, false, z);
        }
    }
}
