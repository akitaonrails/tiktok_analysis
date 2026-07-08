package com.bytedance.android.livesdk.broadcast.video.layer;

import X.AbstractC1080560eE2;
import X.AbstractC1081060eEq;
import X.C1080430eDp;
import X.C1081550eFd;
import X.C1082380eGy;
import X.C1083100eI8;
import X.C1083340eIW;
import X.C1161920gLG;
import Y.AUListenerS266S0100000_17;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.billboard.LiveBillboardAvoidKeyboardSetting;
import com.bytedance.android.live.layer.ILayerService;
import com.bytedance.android.live.layer.broadcast.BroadcastLayeredElementManager;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.live.setting.LiveExtendedScreenUiOptimizeSetting;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.dataChannel.LiveCenterAlpha;
import com.bytedance.android.livesdk.dataChannel.LiveCenterFlingDurationChannel;
import com.bytedance.android.livesdk.dataChannel.LiveCenterStatusChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicBugFixLayoutContainerSizeSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveCommentPublicScreenBgOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMultiGuestGiftTrayOptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.AnimationInfo;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.GroupableElementSpecImpl;
import com.bytedance.ies.sdk.widgets.LayerSpecImpl;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.LayeredTestingConstraintWidget;
import com.bytedance.ies.sdk.widgets.MultiElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.WidgetHiddenChangedSceneObserver;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class VideoLayeredElementManager extends BroadcastLayeredElementManager {
    @Override // com.bytedance.android.live.layer.broadcast.BroadcastLayeredElementManager, com.bytedance.android.live.layer.BaseLayeredElementManager, com.bytedance.ies.sdk.widgets.LayeredElementManager, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.bytedance.ies.sdk.widgets.LayeredElementContext] */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.bytedance.ies.sdk.widgets.LayeredElementContext] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.ies.sdk.widgets.LayeredElementContext] */
    public VideoLayeredElementManager(Context context, Fragment fragment, C1083340eIW c1083340eIW, DataChannel dataChannel) {
        super(context, fragment, c1083340eIW, dataChannel);
        final AbstractC1080560eE2 abstractC1080560eE2 = (AbstractC1080560eE2) getLayeredElementContext();
        registerGroups(new AbstractC1081060eEq(abstractC1080560eE2) { // from class: X.0eFA
            {
                super(abstractC1080560eE2);
                final int i = C1079510eCL.LIZ;
                MultiElementSpecImplKt.element(this, new ElementSpecImpl(i) { // from class: X.0eFF
                    public final C01GW LL = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(288));

                    {
                        addSceneObserver(new DataChannelSceneObserver<Long, LiveCenterFlingDurationChannel>() { // from class: X.0eFG
                            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                            public final Class<LiveCenterFlingDurationChannel> getType() {
                                return LiveCenterFlingDurationChannel.class;
                            }

                            {
                                super(true);
                            }

                            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Long l) {
                                l.longValue();
                                getClass();
                            }
                        });
                        addSceneObserver(new DataChannelSceneObserver<Float, LiveCenterAlpha>() { // from class: X.0eFC
                            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                            public final Class<LiveCenterAlpha> getType() {
                                return LiveCenterAlpha.class;
                            }

                            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                            public final /* bridge */ /* synthetic */ void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Float f) {
                                f.floatValue();
                            }
                        });
                        addSceneObserver(new DataChannelSceneObserver<C0UVH, LiveCenterStatusChannel>() { // from class: X.0eFI
                            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                            public final Class<LiveCenterStatusChannel> getType() {
                                return LiveCenterStatusChannel.class;
                            }

                            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                            public final /* bridge */ /* synthetic */ void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C0UVH c0uvh) {
                            }
                        });
                    }
                });
                MultiElementSpecImplKt.element(this, C1079510eCL.LIZJ);
                MultiElementSpecImplKt.element(this, new C782910UnR(abstractC1080560eE2));
                MultiElementSpecImplKt.element(this, new C1082640eHO(abstractC1080560eE2));
                MultiElementSpecImplKt.element(this, new C1082630eHN(abstractC1080560eE2));
                MultiElementSpecImplKt.element(this, new C1082740eHY(abstractC1080560eE2));
                MultiElementSpecImplKt.element(this, new C1082730eHX(abstractC1080560eE2));
            }
        });
        C1082380eGy c1082380eGyRa0 = ((ILayerService) C1161920gLG.LIZJ(ILayerService.class)).ra0((AbstractC1080560eE2) getLayeredElementContext());
        if (c1082380eGyRa0 != null) {
            registerLayer(c1082380eGyRa0);
        }
        final AbstractC1080560eE2 abstractC1080560eE22 = (AbstractC1080560eE2) getLayeredElementContext();
        registerLayer(new LayerSpecImpl(abstractC1080560eE22) { // from class: X.0eDo
            {
                C1081740eFw c1081740eFwDf0;
                super(abstractC1080560eE22);
                if (LiveMultiGuestGiftTrayOptSetting.INSTANCE.isOptimizeMultiGuest() && (c1081740eFwDf0 = ((ILayerService) C1161920gLG.LIZJ(ILayerService.class)).df0(abstractC1080560eE22)) != null) {
                    MultiElementSpecImplKt.element(this, c1081740eFwDf0);
                }
                MultiElementSpecImplKt.element(this, new C1080860eEW(abstractC1080560eE22) { // from class: X.0eDs
                });
                MultiElementSpecImplKt.element(this, new C1080490eDv(abstractC1080560eE22));
                MultiElementSpecImplKt.element(this, R.id.vkw);
                ElementSpecImpl elementSpecImpl = new ElementSpecImpl(R.id.v9c);
                ElementSpecImplKt.onAttach(elementSpecImpl, new AwS596S0100000_17(abstractC1080560eE22, 578));
                registerElement(elementSpecImpl);
            }
        });
        final ?? layeredElementContext = getLayeredElementContext();
        registerLayer(new LayerSpecImpl(layeredElementContext) { // from class: X.0eCx
            {
                C1079540eCO c1079540eCO = new C1079540eCO(R.id.q3y);
                int i = C1079590eCT.LJ;
                c1079540eCO.bindGroup(i);
                registerElement(c1079540eCO);
                MultiElementSpecImplKt.element(this, R.id.dc4);
                MultiElementSpecImplKt.element(this, R.id.ysi);
                MultiElementSpecImplKt.element(this, R.id.qjn);
                if (LinkMicBugFixLayoutContainerSizeSetting.INSTANCE.isEnable() && LinkCoreModelKt.currentUserIsAnchor()) {
                    C931800aM6.LIZ.getClass();
                    if (C931800aM6.LIZIZ()) {
                        MultiElementSpecImplKt.element(this, R.id.qjo);
                    }
                }
                MultiElementSpecImplKt.element(this, R.id.kv1);
                MultiElementSpecImplKt.element(this, R.id.ool);
                MultiElementSpecImplKt.element(this, R.id.bwk);
                MultiElementSpecImplKt.element(this, R.id.sma);
                MultiElementSpecImplKt.element(this, R.id.kve);
                MultiElementSpecImplKt.element(this, R.id.pbp);
                MultiElementSpecImplKt.element(this, R.id.mu_);
                GroupableElementSpecImpl groupableElementSpecImpl = new GroupableElementSpecImpl(R.id.pve);
                int i2 = C1079510eCL.LIZ;
                int i3 = C1079430eCD.LIZ;
                int i4 = C1079430eCD.LIZJ;
                groupableElementSpecImpl.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
                groupableElementSpecImpl.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(C1079590eCT.LIZIZ), Integer.valueOf(i), Integer.valueOf(C1079590eCT.LJI), Integer.valueOf(C1079590eCT.LJII)));
                registerElement(groupableElementSpecImpl);
                GroupableElementSpecImpl groupableElementSpecImpl2 = new GroupableElementSpecImpl(R.id.uoc);
                groupableElementSpecImpl2.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
                int i5 = C1079590eCT.LIZ;
                groupableElementSpecImpl2.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i5), Integer.valueOf(i)));
                registerElement(groupableElementSpecImpl2);
                MultiElementSpecImplKt.element(this, R.id.gf1);
                C1079510eCL.LIZ(this, R.id.azc);
                GroupableElementSpecImpl groupableElementSpecImpl3 = new GroupableElementSpecImpl(R.id.n5o);
                groupableElementSpecImpl3.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
                groupableElementSpecImpl3.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i5), Integer.valueOf(i)));
                registerElement(groupableElementSpecImpl3);
                GroupableElementSpecImpl groupableElementSpecImpl4 = new GroupableElementSpecImpl(R.id.viewer_wishes_container);
                groupableElementSpecImpl4.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
                groupableElementSpecImpl4.bindGroups(Collections.singletonList(Integer.valueOf(i)));
                registerElement(groupableElementSpecImpl4);
                GroupableElementSpecImpl groupableElementSpecImpl5 = new GroupableElementSpecImpl(R.id.n7j);
                groupableElementSpecImpl5.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
                groupableElementSpecImpl5.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i5), Integer.valueOf(i)));
                registerElement(groupableElementSpecImpl5);
                GroupableElementSpecImpl groupableElementSpecImpl6 = new GroupableElementSpecImpl(R.id.mw2);
                groupableElementSpecImpl6.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
                groupableElementSpecImpl6.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i5), Integer.valueOf(i)));
                registerElement(groupableElementSpecImpl6);
                GroupableElementSpecImpl groupableElementSpecImpl7 = new GroupableElementSpecImpl(R.id.mxm);
                groupableElementSpecImpl7.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
                groupableElementSpecImpl7.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i5), Integer.valueOf(i)));
                registerElement(groupableElementSpecImpl7);
                MultiElementSpecImplKt.element(this, R.id.oin);
            }
        });
        final AbstractC1080560eE2 abstractC1080560eE23 = (AbstractC1080560eE2) getLayeredElementContext();
        registerLayer(new LayerSpecImpl(abstractC1080560eE23) { // from class: X.0eCr
            {
                super(abstractC1080560eE23);
                MultiElementSpecImplKt.element(this, R.id.kwg);
                GroupableElementSpecImpl groupableElementSpecImpl = new GroupableElementSpecImpl(R.id.bss);
                int i = C1079510eCL.LIZ;
                int i2 = C1079430eCD.LIZ;
                int i3 = C1079430eCD.LIZJ;
                groupableElementSpecImpl.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
                int i4 = C1079590eCT.LJ;
                groupableElementSpecImpl.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(C1079590eCT.LIZ), Integer.valueOf(C1079510eCL.LIZJ), Integer.valueOf(i4)));
                registerElement(groupableElementSpecImpl);
                MultiElementSpecImplKt.groupableElement(this, R.id.g_e, AFwS254S0000000_17.get$arr$(255));
                C1080520eDy c1080520eDy = new C1080520eDy(abstractC1080560eE23);
                c1080520eDy.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
                List<Integer> listLJIILJJIL = C1697810uHb.LJIILJJIL(Integer.valueOf(i4));
                if (!LiveCommentPublicScreenBgOptSetting.INSTANCE.getValue(true)) {
                    listLJIILJJIL.add(Integer.valueOf(C1079590eCT.LIZIZ));
                }
                c1080520eDy.bindGroups(listLJIILJJIL);
                registerElement(c1080520eDy);
                MultiElementSpecImplKt.groupableElement(this, R.id.g_h, AFwS254S0000000_17.get$arr$(256));
                GroupableElementSpecImpl groupableElementSpecImpl2 = new GroupableElementSpecImpl(R.id.n2m);
                groupableElementSpecImpl2.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
                int i5 = C1079590eCT.LIZIZ;
                int i6 = C1079590eCT.LJI;
                int i7 = C1079590eCT.LJII;
                groupableElementSpecImpl2.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(i6), Integer.valueOf(i7)));
                registerElement(groupableElementSpecImpl2);
                GroupableElementSpecImpl groupableElementSpecImpl3 = new GroupableElementSpecImpl(R.id.myj);
                groupableElementSpecImpl3.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
                groupableElementSpecImpl3.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(i6), Integer.valueOf(i7)));
                registerElement(groupableElementSpecImpl3);
                C1079880eCw c1079880eCw = new C1079880eCw();
                c1079880eCw.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
                c1079880eCw.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(i6), Integer.valueOf(i7)));
                registerElement(c1079880eCw);
                GroupableElementSpecImpl groupableElementSpecImpl4 = new GroupableElementSpecImpl(R.id.n8i);
                groupableElementSpecImpl4.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
                int i8 = C1079590eCT.LIZJ;
                groupableElementSpecImpl4.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i8), Integer.valueOf(i4), Integer.valueOf(i6), Integer.valueOf(i7)));
                registerElement(groupableElementSpecImpl4);
                GroupableElementSpecImpl groupableElementSpecImpl5 = new GroupableElementSpecImpl(R.id.qhj);
                groupableElementSpecImpl5.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
                groupableElementSpecImpl5.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(i6), Integer.valueOf(i7)));
                registerElement(groupableElementSpecImpl5);
                GroupableElementSpecImpl groupableElementSpecImpl6 = new GroupableElementSpecImpl(R.id.fce);
                groupableElementSpecImpl6.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
                int i9 = C1079590eCT.LJFF;
                int i10 = C1079590eCT.LJIIIIZZ;
                groupableElementSpecImpl6.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i9), Integer.valueOf(i8), Integer.valueOf(i10), Integer.valueOf(i6), Integer.valueOf(i7)));
                registerElement(groupableElementSpecImpl6);
                GroupableElementSpecImpl groupableElementSpecImpl7 = new GroupableElementSpecImpl(R.id.fdx);
                groupableElementSpecImpl7.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
                groupableElementSpecImpl7.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i9), Integer.valueOf(i8), Integer.valueOf(i10), Integer.valueOf(i6), Integer.valueOf(i7)));
                registerElement(groupableElementSpecImpl7);
                GroupableElementSpecImpl groupableElementSpecImpl8 = new GroupableElementSpecImpl(R.id.weq);
                groupableElementSpecImpl8.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
                groupableElementSpecImpl8.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i9), Integer.valueOf(i8), Integer.valueOf(i10), Integer.valueOf(i6), Integer.valueOf(i7)));
                registerElement(groupableElementSpecImpl8);
                GroupableElementSpecImpl groupableElementSpecImpl9 = new GroupableElementSpecImpl(R.id.ik5);
                groupableElementSpecImpl9.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
                groupableElementSpecImpl9.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i9), Integer.valueOf(i10)));
                registerElement(groupableElementSpecImpl9);
                GroupableElementSpecImpl groupableElementSpecImpl10 = new GroupableElementSpecImpl(R.id.qfy);
                groupableElementSpecImpl10.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
                groupableElementSpecImpl10.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i6), Integer.valueOf(i7)));
                registerElement(groupableElementSpecImpl10);
                C1079510eCL.LIZ(this, R.id.hvs);
                GroupableElementSpecImpl groupableElementSpecImpl11 = new GroupableElementSpecImpl(R.id.n3l);
                groupableElementSpecImpl11.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
                groupableElementSpecImpl11.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i8), Integer.valueOf(i6), Integer.valueOf(i7)));
                ElementSpecImplKt.onAttach(groupableElementSpecImpl11, AFwS254S0000000_17.get$arr$(254));
                registerElement(groupableElementSpecImpl11);
            }
        });
        final AbstractC1080560eE2 abstractC1080560eE24 = (AbstractC1080560eE2) getLayeredElementContext();
        registerLayer(new LayerSpecImpl(abstractC1080560eE24) { // from class: X.0eCR
            {
                super(abstractC1080560eE24);
                C1079440eCE c1079440eCE = new C1079440eCE();
                int i = C1079510eCL.LIZ;
                int i2 = C1079430eCD.LIZ;
                int i3 = C1079430eCD.LIZJ;
                c1079440eCE.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
                int i4 = C1079590eCT.LIZ;
                int i5 = C1079430eCD.LJ;
                int i6 = C1079510eCL.LIZIZ;
                int i7 = C1079590eCT.LJ;
                c1079440eCE.bindGroups(C1697810uHb.LJIILJJIL(Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7)));
                registerElement(c1079440eCE);
                C1079540eCO c1079540eCO = new C1079540eCO(R.id.tqe);
                int i8 = C1079430eCD.LJFF;
                c1079540eCO.bindGroups(C1697810uHb.LJIILJJIL(Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i8), Integer.valueOf(i7)));
                registerElement(c1079540eCO);
                MultiElementSpecImplKt.element(this, R.id.gfq);
                C1079540eCO c1079540eCO2 = new C1079540eCO(R.id.il0);
                c1079540eCO2.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i4), Integer.valueOf(i7), Integer.valueOf(i2)));
                registerElement(c1079540eCO2);
                C1079540eCO c1079540eCO3 = new C1079540eCO(R.id.jgy);
                c1079540eCO3.setConstraintWidget(new LayeredTestingConstraintWidget());
                c1079540eCO3.bindGroups(C1697810uHb.LJIILJJIL(Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i8), Integer.valueOf(i7)));
                c1079540eCO3.addSceneObserver(new WidgetHiddenChangedSceneObserver() { // from class: X.0eCS
                    @Override // com.bytedance.ies.sdk.widgets.WidgetHiddenChangedSceneObserver
                    public final void onHiddenChanged(LayeredElementContext layeredElementContext2, ConstraintProperty constraintProperty, boolean z) {
                        if (z) {
                            constraintProperty.constrainMaxWidth(0);
                            constraintProperty.apply();
                        } else {
                            constraintProperty.constrainMaxWidth((int) C497740JfY.LIZIZ(131.0f));
                            constraintProperty.apply();
                        }
                    }
                });
                registerElement(c1079540eCO3);
                GroupableElementSpecImpl groupableElementSpecImpl = new GroupableElementSpecImpl(R.id.c16);
                groupableElementSpecImpl.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
                groupableElementSpecImpl.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7)));
                registerElement(groupableElementSpecImpl);
                GroupableElementSpecImpl groupableElementSpecImpl2 = new GroupableElementSpecImpl(R.id.xn2);
                groupableElementSpecImpl2.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
                int i9 = C1079430eCD.LIZLLL;
                groupableElementSpecImpl2.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i7), Integer.valueOf(i9), Integer.valueOf(i5)));
                registerElement(groupableElementSpecImpl2);
                registerElement(new GroupableElementSpecImpl() { // from class: X.0eCP
                    {
                        List<Integer> listLJIILJJIL = C1697810uHb.LJIILJJIL(Integer.valueOf(C1079590eCT.LIZ), Integer.valueOf(C1079510eCL.LIZ), Integer.valueOf(C1079430eCD.LIZ), Integer.valueOf(C1079590eCT.LJ), Integer.valueOf(C1079430eCD.LIZJ), Integer.valueOf(C1079430eCD.LIZLLL));
                        listLJIILJJIL.add(Integer.valueOf(C1079590eCT.LIZLLL));
                        bindGroups(listLJIILJJIL);
                        ElementSpecImplKt.onAttach(this, AFwS254S0000000_17.get$arr$(263));
                    }
                });
                GroupableElementSpecImpl groupableElementSpecImpl3 = new GroupableElementSpecImpl(R.id.mut);
                groupableElementSpecImpl3.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
                int i10 = C1079590eCT.LIZLLL;
                List<Integer> listLJIILJJIL = C1697810uHb.LJIILJJIL(Integer.valueOf(i4), Integer.valueOf(i10), Integer.valueOf(i7));
                listLJIILJJIL.add(Integer.valueOf(i5));
                listLJIILJJIL.add(Integer.valueOf(i6));
                groupableElementSpecImpl3.bindGroups(listLJIILJJIL);
                registerElement(groupableElementSpecImpl3);
                GroupableElementSpecImpl groupableElementSpecImpl4 = new GroupableElementSpecImpl(R.id.yci);
                groupableElementSpecImpl4.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
                groupableElementSpecImpl4.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i9)));
                ElementSpecImplKt.onAttach(groupableElementSpecImpl4, AFwS254S0000000_17.get$arr$(262));
                registerElement(groupableElementSpecImpl4);
                GroupableElementSpecImpl groupableElementSpecImpl5 = new GroupableElementSpecImpl(R.id.wish_list_container);
                groupableElementSpecImpl5.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
                groupableElementSpecImpl5.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i9)));
                registerElement(groupableElementSpecImpl5);
                C1079510eCL.LIZ(this, R.id.yjr);
                GroupableElementSpecImpl groupableElementSpecImpl6 = new GroupableElementSpecImpl(R.id.v96);
                groupableElementSpecImpl6.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
                List<Integer> listLJIILJJIL2 = C1697810uHb.LJIILJJIL(Integer.valueOf(i4), Integer.valueOf(i7), Integer.valueOf(i9));
                listLJIILJJIL2.add(Integer.valueOf(i10));
                groupableElementSpecImpl6.bindGroups(listLJIILJJIL2);
                ElementSpecImplKt.onAttach(groupableElementSpecImpl6, AFwS254S0000000_17.get$arr$(257));
                registerElement(groupableElementSpecImpl6);
                C1079510eCL.LIZ(this, R.id.oya);
                MultiElementSpecImplKt.groupableElement(this, R.id.mue, AFwS254S0000000_17.get$arr$(258));
                C1079540eCO c1079540eCO4 = new C1079540eCO(R.id.sqk);
                c1079540eCO4.setConstraintWidget(new LayeredTestingConstraintWidget());
                List<Integer> listLJIILJJIL3 = C1697810uHb.LJIILJJIL(Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7));
                LiveExtendedScreenUiOptimizeSetting liveExtendedScreenUiOptimizeSetting = LiveExtendedScreenUiOptimizeSetting.INSTANCE;
                if (liveExtendedScreenUiOptimizeSetting.hideSecondRow(abstractC1080560eE24.getDataChannel())) {
                    listLJIILJJIL3.add(Integer.valueOf(i2));
                }
                c1079540eCO4.bindGroups(listLJIILJJIL3);
                registerElement(c1079540eCO4);
                C1079540eCO c1079540eCO5 = new C1079540eCO(R.id.sql);
                c1079540eCO5.setConstraintWidget(new LayeredTestingConstraintWidget());
                List<Integer> listLJIILJJIL4 = C1697810uHb.LJIILJJIL(Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7));
                if (liveExtendedScreenUiOptimizeSetting.hideSecondRow(abstractC1080560eE24.getDataChannel())) {
                    listLJIILJJIL4.add(Integer.valueOf(i2));
                }
                c1079540eCO5.bindGroups(listLJIILJJIL4);
                registerElement(c1079540eCO5);
                C1079540eCO c1079540eCO6 = new C1079540eCO(R.id.p4x);
                c1079540eCO6.bindGroup(C1079430eCD.LIZIZ);
                c1079540eCO6.bindGroups(C1697810uHb.LJIILJJIL(Integer.valueOf(i4), Integer.valueOf(i10), Integer.valueOf(i7)));
                registerElement(c1079540eCO6);
                C1079540eCO c1079540eCO7 = new C1079540eCO(R.id.ba7);
                c1079540eCO7.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(C1079430eCD.LJI)));
                if (liveExtendedScreenUiOptimizeSetting.hideFirstRow(abstractC1080560eE24.getDataChannel())) {
                    c1079540eCO7.bindGroup(i2);
                }
                registerElement(c1079540eCO7);
                C1079540eCO c1079540eCO8 = new C1079540eCO(R.id.user_info_container);
                c1079540eCO8.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7)));
                if (liveExtendedScreenUiOptimizeSetting.hideFirstRow(abstractC1080560eE24.getDataChannel())) {
                    c1079540eCO8.bindGroup(i2);
                }
                registerElement(c1079540eCO8);
                C1079540eCO c1079540eCO9 = new C1079540eCO(R.id.mo8);
                c1079540eCO9.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7)));
                if (liveExtendedScreenUiOptimizeSetting.hideFirstRow(abstractC1080560eE24.getDataChannel())) {
                    c1079540eCO9.bindGroup(i2);
                }
                registerElement(c1079540eCO9);
                GroupableElementSpecImpl groupableElementSpecImpl7 = new GroupableElementSpecImpl(R.id.vku);
                groupableElementSpecImpl7.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
                int i11 = C1079590eCT.LIZIZ;
                int i12 = C1079590eCT.LJFF;
                int i13 = C1079590eCT.LJI;
                int i14 = C1079590eCT.LJII;
                groupableElementSpecImpl7.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14)));
                registerElement(groupableElementSpecImpl7);
                GroupableElementSpecImpl groupableElementSpecImpl8 = new GroupableElementSpecImpl(R.id.ea1);
                groupableElementSpecImpl8.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
                groupableElementSpecImpl8.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i11), Integer.valueOf(i12)));
                ElementSpecImplKt.animation(groupableElementSpecImpl8, new C1081020eEm(groupableElementSpecImpl8.getId(), abstractC1080560eE24));
                registerElement(groupableElementSpecImpl8);
                GroupableElementSpecImpl groupableElementSpecImpl9 = new GroupableElementSpecImpl(R.id.jb9);
                groupableElementSpecImpl9.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
                groupableElementSpecImpl9.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i11), Integer.valueOf(i12)));
                final int id = groupableElementSpecImpl9.getId();
                ElementSpecImplKt.animation(groupableElementSpecImpl9, new AnimationInfo(id, abstractC1080560eE24) { // from class: X.0eDF
                    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
                    public final Animator onCreateHideAnimator(ConstraintProperty constraintProperty) {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                        valueAnimatorOfFloat.addUpdateListener(new AUListenerS266S0100000_17(constraintProperty, 110));
                        return valueAnimatorOfFloat;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.AnimationInfo
                    public final Animator onCreateShowAnimator(ConstraintProperty constraintProperty) {
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.addUpdateListener(new AUListenerS266S0100000_17(constraintProperty, 111));
                        return valueAnimatorOfFloat;
                    }
                });
                registerElement(groupableElementSpecImpl9);
                MultiElementSpecImplKt.groupableElement(this, R.id.g_i, AFwS254S0000000_17.get$arr$(259));
                GroupableElementSpecImpl groupableElementSpecImpl10 = new GroupableElementSpecImpl(R.id.v9b);
                groupableElementSpecImpl10.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
                int i15 = C1079590eCT.LIZJ;
                groupableElementSpecImpl10.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i15), Integer.valueOf(i7), Integer.valueOf(i13), Integer.valueOf(i14)));
                registerElement(groupableElementSpecImpl10);
                C1079540eCO c1079540eCO10 = new C1079540eCO(R.id.video_animate_container);
                c1079540eCO10.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i11), Integer.valueOf(i3)));
                registerElement(c1079540eCO10);
                C1079540eCO c1079540eCO11 = new C1079540eCO(abstractC1080560eE24) { // from class: X.0eCQ
                    {
                        super(R.id.y6v);
                        ElementSpecImplKt.onAttach(this, new AwS596S0100000_17(abstractC1080560eE24, 577));
                    }
                };
                c1079540eCO11.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i4), Integer.valueOf(i2), Integer.valueOf(C1079510eCL.LIZJ), Integer.valueOf(i7), Integer.valueOf(i3), Integer.valueOf(i13), Integer.valueOf(i14)));
                registerElement(c1079540eCO11);
                GroupableElementSpecImpl groupableElementSpecImpl11 = new GroupableElementSpecImpl(R.id.v9d);
                groupableElementSpecImpl11.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
                groupableElementSpecImpl11.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i15), Integer.valueOf(i7), Integer.valueOf(i13), Integer.valueOf(i14)));
                registerElement(groupableElementSpecImpl11);
                GroupableElementSpecImpl groupableElementSpecImpl12 = new GroupableElementSpecImpl(R.id.vl5);
                groupableElementSpecImpl12.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
                groupableElementSpecImpl12.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i11), Integer.valueOf(i12)));
                registerElement(groupableElementSpecImpl12);
                MultiElementSpecImplKt.groupableElement(this, R.id.ebi, AFwS254S0000000_17.get$arr$(260));
                MultiElementSpecImplKt.groupableElement(this, R.id.c1a, AFwS254S0000000_17.get$arr$(261));
                GroupableElementSpecImpl groupableElementSpecImpl13 = new GroupableElementSpecImpl(R.id.mvk);
                groupableElementSpecImpl13.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
                List<Integer> listLJIILJJIL5 = C1697810uHb.LJIILJJIL(Integer.valueOf(i4), Integer.valueOf(i10), Integer.valueOf(i7));
                listLJIILJJIL5.add(Integer.valueOf(i5));
                listLJIILJJIL5.add(Integer.valueOf(i6));
                groupableElementSpecImpl13.bindGroups(listLJIILJJIL5);
                registerElement(groupableElementSpecImpl13);
            }
        });
        final ?? layeredElementContext2 = getLayeredElementContext();
        registerLayer(new LayerSpecImpl(layeredElementContext2) { // from class: X.0eCJ
            {
                super(layeredElementContext2);
                C1079540eCO c1079540eCO = new C1079540eCO(R.id.j2h);
                int i = C1079590eCT.LIZ;
                int i2 = C1079590eCT.LJ;
                c1079540eCO.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i), Integer.valueOf(i2)));
                LiveExtendedScreenUiOptimizeSetting liveExtendedScreenUiOptimizeSetting = LiveExtendedScreenUiOptimizeSetting.INSTANCE;
                if (liveExtendedScreenUiOptimizeSetting.hideSecondRow(layeredElementContext2.getDataChannel())) {
                    c1079540eCO.bindGroup(C1079430eCD.LIZ);
                }
                registerElement(c1079540eCO);
                C1079540eCO c1079540eCO2 = new C1079540eCO(R.id.n4a);
                c1079540eCO2.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i), Integer.valueOf(i2)));
                if (liveExtendedScreenUiOptimizeSetting.hideSecondRow(layeredElementContext2.getDataChannel())) {
                    c1079540eCO2.bindGroup(C1079430eCD.LIZ);
                }
                registerElement(c1079540eCO2);
                C1079540eCO c1079540eCO3 = new C1079540eCO(R.id.ye6);
                c1079540eCO3.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i), Integer.valueOf(i2)));
                c1079540eCO3.addSceneObserver(new DataChannelSceneObserver<C956380azk, LinkCrossRoomStateChangeEvent>() { // from class: X.0eBo
                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<LinkCrossRoomStateChangeEvent> getType() {
                        return LinkCrossRoomStateChangeEvent.class;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext3, ConstraintProperty constraintProperty, C956380azk c956380azk) {
                        int i3 = c956380azk.LIZ;
                        if (i3 == 1) {
                            constraintProperty.connect(3, R.id.hei, 3, 0);
                            constraintProperty.apply();
                        } else {
                            if (i3 != 0) {
                                return;
                            }
                            constraintProperty.connect(3, R.id.p1a, 4, 0);
                            constraintProperty.apply();
                        }
                    }
                });
                c1079540eCO3.addSceneObserver(new DataChannelSceneObserver<C1081600eFi, MultiLiveRTCLayoutChannel>() { // from class: X.0eFT
                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<MultiLiveRTCLayoutChannel> getType() {
                        return MultiLiveRTCLayoutChannel.class;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext3, ConstraintProperty constraintProperty, C1081600eFi c1081600eFi) {
                        C1081600eFi c1081600eFi2 = c1081600eFi;
                        EnumC918970a1P enumC918970a1P = c1081600eFi2.LIZ;
                        if (enumC918970a1P != EnumC918970a1P.GRID_FIX && ((enumC918970a1P != EnumC918970a1P.GRID || c1081600eFi2.LIZIZ <= 0) && !C2104308Mf.LIZJ())) {
                            constraintProperty.connect(3, R.id.hei, 3, 0);
                            constraintProperty.apply();
                        } else {
                            constraintProperty.connect(3, R.id.p1a, 4, 0);
                            constraintProperty.apply();
                        }
                    }
                });
                registerElement(c1079540eCO3);
                GroupableElementSpecImpl groupableElementSpecImpl = new GroupableElementSpecImpl(R.id.ez2);
                int i3 = C1079510eCL.LIZ;
                int i4 = C1079430eCD.LIZ;
                int i5 = C1079430eCD.LIZJ;
                groupableElementSpecImpl.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)));
                groupableElementSpecImpl.bindGroups(Collections.singletonList(Integer.valueOf(i2)));
                registerElement(groupableElementSpecImpl);
                C1079510eCL.LIZ(this, R.id.vli);
                C1079510eCL.LIZ(this, R.id.kv7);
                C1079510eCL.LIZ(this, R.id.mtr);
                GroupableElementSpecImpl groupableElementSpecImpl2 = new GroupableElementSpecImpl(R.id.n3_);
                groupableElementSpecImpl2.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)));
                groupableElementSpecImpl2.bindGroups(Collections.singletonList(Integer.valueOf(i2)));
                registerElement(groupableElementSpecImpl2);
                GroupableElementSpecImpl groupableElementSpecImpl3 = new GroupableElementSpecImpl(R.id.hye);
                groupableElementSpecImpl3.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)));
                groupableElementSpecImpl3.bindGroups(Collections.singletonList(Integer.valueOf(i2)));
                registerElement(groupableElementSpecImpl3);
                GroupableElementSpecImpl groupableElementSpecImpl4 = new GroupableElementSpecImpl(R.id.w4w);
                groupableElementSpecImpl4.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)));
                groupableElementSpecImpl4.bindGroups(Collections.singletonList(Integer.valueOf(i2)));
                registerElement(groupableElementSpecImpl4);
                GroupableElementSpecImpl groupableElementSpecImpl5 = new GroupableElementSpecImpl(R.id.iuw);
                groupableElementSpecImpl5.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)));
                int i6 = C1079510eCL.LIZJ;
                groupableElementSpecImpl5.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i6), Integer.valueOf(i2)));
                registerElement(groupableElementSpecImpl5);
                GroupableElementSpecImpl groupableElementSpecImpl6 = new GroupableElementSpecImpl(R.id.b2t);
                groupableElementSpecImpl6.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)));
                groupableElementSpecImpl6.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i6), Integer.valueOf(i2)));
                registerElement(groupableElementSpecImpl6);
                C1079510eCL.LIZ(this, R.id.waq);
                MultiElementSpecImplKt.element(this, R.id.myo);
                GroupableElementSpecImpl groupableElementSpecImpl7 = new GroupableElementSpecImpl(R.id.m21);
                groupableElementSpecImpl7.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)));
                groupableElementSpecImpl7.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i4), Integer.valueOf(C1079430eCD.LJII)));
                registerElement(groupableElementSpecImpl7);
                C1079510eCL.LIZ(this, R.id.cjz);
                GroupableElementSpecImpl groupableElementSpecImpl8 = new GroupableElementSpecImpl(R.id.q41);
                groupableElementSpecImpl8.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)));
                groupableElementSpecImpl8.bindGroups(Collections.singletonList(Integer.valueOf(i2)));
                registerElement(groupableElementSpecImpl8);
                GroupableElementSpecImpl groupableElementSpecImpl9 = new GroupableElementSpecImpl(R.id.kv5);
                groupableElementSpecImpl9.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)));
                groupableElementSpecImpl9.bindGroups(Collections.singletonList(Integer.valueOf(i2)));
                registerElement(groupableElementSpecImpl9);
                C1079510eCL.LIZ(this, R.id.h5d);
                C1079510eCL.LIZ(this, R.id.h4z);
                MultiElementSpecImplKt.element(this, R.id.dc5);
                GroupableElementSpecImpl groupableElementSpecImpl10 = new GroupableElementSpecImpl(R.id.yaf);
                groupableElementSpecImpl10.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)));
                groupableElementSpecImpl10.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(C1079590eCT.LIZIZ), Integer.valueOf(C1079590eCT.LJFF)));
                ElementSpecImplKt.animation(groupableElementSpecImpl10, new C1080080eDG(groupableElementSpecImpl10.getId(), layeredElementContext2));
                registerElement(groupableElementSpecImpl10);
                GroupableElementSpecImpl groupableElementSpecImpl11 = new GroupableElementSpecImpl(R.id.mu6);
                groupableElementSpecImpl11.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)));
                groupableElementSpecImpl11.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i), Integer.valueOf(C1079510eCL.LIZIZ), Integer.valueOf(i2), Integer.valueOf(C1079590eCT.LJI), Integer.valueOf(C1079590eCT.LJII)));
                if (!LiveBillboardAvoidKeyboardSetting.INSTANCE.avoid()) {
                    groupableElementSpecImpl11.removeGroup(i);
                }
                registerElement(groupableElementSpecImpl11);
            }
        });
        registerLayer(new C1080430eDp(getLayeredElementContext()));
        C1081550eFd c1081550eFdMA = ((ILayerService) C1161920gLG.LIZJ(ILayerService.class)).MA((AbstractC1080560eE2) getLayeredElementContext());
        if (c1081550eFdMA != null) {
            registerLayer(c1081550eFdMA);
        }
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.p1_, R.id.p1a, R.id.user_info_container);
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.hh1, R.id.h4p, R.id.ocf);
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.p4r, R.id.p4x, R.id.mut);
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.hgs, R.id.tqe, R.id.jgy, R.id.sqk, R.id.sql, R.id.p4x, R.id.hgt);
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.hei, R.id.v97, R.id.mut, R.id.c16);
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.kwc, R.id.ik5, R.id.fce, R.id.fdx, R.id.weq, R.id.qfy, R.id.n3l);
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.rg9, R.id.n2m, R.id.myj, R.id.g_h, R.id.ea1);
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.kwd, R.id.ike, R.id.pbo);
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.ccg, R.id.v9c, R.id.cdt);
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.y6t, R.id.q2x, R.id.v9b);
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.vkv, R.id.ea1, R.id.jb9);
        finishRegistration();
    }
}
