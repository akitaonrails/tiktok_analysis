package com.bytedance.android.livesdk.broadcast.trymode.layer;

import X.AbstractC1080560eE2;
import X.AbstractC1081060eEq;
import X.C1080430eDp;
import X.C1081550eFd;
import X.C1082380eGy;
import X.C1083100eI8;
import X.C1083340eIW;
import X.C1161920gLG;
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
import com.bytedance.android.livesdk.livesetting.rank.LiveRankingCompetitiveAtmosphereSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveCommentPublicScreenBgOptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
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
public final class TryModeVideoLayeredElementManager extends BroadcastLayeredElementManager {
    @Override // com.bytedance.android.live.layer.broadcast.BroadcastLayeredElementManager, com.bytedance.android.live.layer.BaseLayeredElementManager, com.bytedance.ies.sdk.widgets.LayeredElementManager, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.bytedance.ies.sdk.widgets.LayeredElementContext] */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.bytedance.ies.sdk.widgets.LayeredElementContext] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.ies.sdk.widgets.LayeredElementContext] */
    public TryModeVideoLayeredElementManager(Context context, Fragment fragment, C1083340eIW c1083340eIW, DataChannel dataChannel) {
        int i;
        super(context, fragment, c1083340eIW, dataChannel);
        final AbstractC1080560eE2 abstractC1080560eE2 = (AbstractC1080560eE2) getLayeredElementContext();
        registerGroups(new AbstractC1081060eEq(abstractC1080560eE2) { // from class: X.0eF9
            {
                super(abstractC1080560eE2);
                final int i2 = C1079520eCM.LIZ;
                MultiElementSpecImplKt.element(this, new ElementSpecImpl(i2) { // from class: X.0eFD
                    public final C01GW LL = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(184));

                    {
                        addSceneObserver(new DataChannelSceneObserver<Long, LiveCenterFlingDurationChannel>() { // from class: X.0eFE
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
                        addSceneObserver(new DataChannelSceneObserver<Float, LiveCenterAlpha>() { // from class: X.0eFB
                            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                            public final Class<LiveCenterAlpha> getType() {
                                return LiveCenterAlpha.class;
                            }

                            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                            public final /* bridge */ /* synthetic */ void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Float f) {
                                f.floatValue();
                            }
                        });
                        addSceneObserver(new DataChannelSceneObserver<C0UVH, LiveCenterStatusChannel>() { // from class: X.0eFH
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
                MultiElementSpecImplKt.element(this, C1079520eCM.LIZJ);
                MultiElementSpecImplKt.element(this, new C782900UnQ(abstractC1080560eE2));
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
        registerLayer(new LayerSpecImpl(abstractC1080560eE22) { // from class: X.0eDn
            {
                super(abstractC1080560eE22);
                C1081740eFw c1081740eFwDf0 = ((ILayerService) C1161920gLG.LIZJ(ILayerService.class)).df0(abstractC1080560eE22);
                if (c1081740eFwDf0 != null) {
                    MultiElementSpecImplKt.element(this, c1081740eFwDf0);
                }
                MultiElementSpecImplKt.element(this, new C1080860eEW(abstractC1080560eE22) { // from class: X.0eDr
                });
                MultiElementSpecImplKt.element(this, new C1080490eDv(abstractC1080560eE22));
                MultiElementSpecImplKt.element(this, R.id.vkw);
                ElementSpecImpl elementSpecImpl = new ElementSpecImpl(R.id.v9c);
                ElementSpecImplKt.onAttach(elementSpecImpl, new AwS596S0100000_17(abstractC1080560eE22, 372));
                registerElement(elementSpecImpl);
            }
        });
        final ?? layeredElementContext = getLayeredElementContext();
        registerLayer(new LayerSpecImpl(layeredElementContext) { // from class: X.0eCy
            {
                C1079530eCN c1079530eCN = new C1079530eCN(R.id.q3y);
                int i2 = C1079590eCT.LJ;
                c1079530eCN.bindGroup(i2);
                registerElement(c1079530eCN);
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
                MultiElementSpecImplKt.element(this, R.id.pbp);
                MultiElementSpecImplKt.element(this, R.id.mu_);
                GroupableElementSpecImpl groupableElementSpecImpl = new GroupableElementSpecImpl(R.id.pve);
                int i3 = C1079520eCM.LIZ;
                int i4 = C1079430eCD.LIZ;
                int i5 = C1079430eCD.LIZJ;
                groupableElementSpecImpl.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)));
                groupableElementSpecImpl.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(C1079590eCT.LIZIZ), Integer.valueOf(i2)));
                registerElement(groupableElementSpecImpl);
                C1079520eCM.LIZ(this, R.id.azc);
                GroupableElementSpecImpl groupableElementSpecImpl2 = new GroupableElementSpecImpl(R.id.n5o);
                groupableElementSpecImpl2.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)));
                int i6 = C1079590eCT.LIZ;
                groupableElementSpecImpl2.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i6), Integer.valueOf(i2)));
                registerElement(groupableElementSpecImpl2);
                GroupableElementSpecImpl groupableElementSpecImpl3 = new GroupableElementSpecImpl(R.id.n7j);
                groupableElementSpecImpl3.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)));
                groupableElementSpecImpl3.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i6), Integer.valueOf(i2)));
                registerElement(groupableElementSpecImpl3);
                GroupableElementSpecImpl groupableElementSpecImpl4 = new GroupableElementSpecImpl(R.id.mw2);
                groupableElementSpecImpl4.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)));
                groupableElementSpecImpl4.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i6), Integer.valueOf(i2)));
                registerElement(groupableElementSpecImpl4);
                GroupableElementSpecImpl groupableElementSpecImpl5 = new GroupableElementSpecImpl(R.id.mxm);
                groupableElementSpecImpl5.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)));
                groupableElementSpecImpl5.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i6), Integer.valueOf(i2)));
                registerElement(groupableElementSpecImpl5);
                C1079530eCN c1079530eCN2 = new C1079530eCN(R.id.il0);
                c1079530eCN2.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i6), Integer.valueOf(i2), Integer.valueOf(i4)));
                registerElement(c1079530eCN2);
                MultiElementSpecImplKt.element(this, R.id.oin);
            }
        });
        final AbstractC1080560eE2 abstractC1080560eE23 = (AbstractC1080560eE2) getLayeredElementContext();
        registerLayer(new LayerSpecImpl(abstractC1080560eE23) { // from class: X.0eCs
            {
                super(abstractC1080560eE23);
                MultiElementSpecImplKt.element(this, R.id.kwg);
                GroupableElementSpecImpl groupableElementSpecImpl = new GroupableElementSpecImpl(R.id.bss);
                int i2 = C1079520eCM.LIZ;
                int i3 = C1079430eCD.LIZ;
                int i4 = C1079430eCD.LIZJ;
                groupableElementSpecImpl.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
                int i5 = C1079590eCT.LJ;
                groupableElementSpecImpl.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(C1079590eCT.LIZ), Integer.valueOf(C1079520eCM.LIZJ), Integer.valueOf(i5)));
                registerElement(groupableElementSpecImpl);
                MultiElementSpecImplKt.groupableElement(this, R.id.g_e, AFwS254S0000000_17.get$arr$(114));
                C1080520eDy c1080520eDy = new C1080520eDy(abstractC1080560eE23);
                c1080520eDy.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
                List<Integer> listLJIILJJIL = C1697810uHb.LJIILJJIL(Integer.valueOf(i5));
                if (!LiveCommentPublicScreenBgOptSetting.INSTANCE.getValue(true)) {
                    listLJIILJJIL.add(Integer.valueOf(C1079590eCT.LIZIZ));
                }
                c1080520eDy.bindGroups(listLJIILJJIL);
                registerElement(c1080520eDy);
                MultiElementSpecImplKt.groupableElement(this, R.id.g_h, AFwS254S0000000_17.get$arr$(115));
                GroupableElementSpecImpl groupableElementSpecImpl2 = new GroupableElementSpecImpl(R.id.n2m);
                groupableElementSpecImpl2.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
                int i6 = C1079590eCT.LIZIZ;
                int i7 = C1079590eCT.LJI;
                int i8 = C1079590eCT.LJII;
                groupableElementSpecImpl2.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i6), Integer.valueOf(i5), Integer.valueOf(i7), Integer.valueOf(i8)));
                registerElement(groupableElementSpecImpl2);
                GroupableElementSpecImpl groupableElementSpecImpl3 = new GroupableElementSpecImpl(R.id.myj);
                groupableElementSpecImpl3.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
                groupableElementSpecImpl3.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i6), Integer.valueOf(i5), Integer.valueOf(i7), Integer.valueOf(i8)));
                registerElement(groupableElementSpecImpl3);
                C1079880eCw c1079880eCw = new C1079880eCw();
                c1079880eCw.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
                c1079880eCw.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i6), Integer.valueOf(i5), Integer.valueOf(i7), Integer.valueOf(i8)));
                registerElement(c1079880eCw);
                GroupableElementSpecImpl groupableElementSpecImpl4 = new GroupableElementSpecImpl(R.id.qhj);
                groupableElementSpecImpl4.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
                groupableElementSpecImpl4.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i6), Integer.valueOf(i5), Integer.valueOf(i7), Integer.valueOf(i8)));
                registerElement(groupableElementSpecImpl4);
                GroupableElementSpecImpl groupableElementSpecImpl5 = new GroupableElementSpecImpl(R.id.fce);
                groupableElementSpecImpl5.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
                int i9 = C1079590eCT.LJFF;
                int i10 = C1079590eCT.LIZJ;
                groupableElementSpecImpl5.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i7), Integer.valueOf(i8)));
                registerElement(groupableElementSpecImpl5);
                GroupableElementSpecImpl groupableElementSpecImpl6 = new GroupableElementSpecImpl(R.id.fdx);
                groupableElementSpecImpl6.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
                groupableElementSpecImpl6.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i7), Integer.valueOf(i8)));
                registerElement(groupableElementSpecImpl6);
                GroupableElementSpecImpl groupableElementSpecImpl7 = new GroupableElementSpecImpl(R.id.weq);
                groupableElementSpecImpl7.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
                groupableElementSpecImpl7.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i7), Integer.valueOf(i8)));
                registerElement(groupableElementSpecImpl7);
                GroupableElementSpecImpl groupableElementSpecImpl8 = new GroupableElementSpecImpl(R.id.ik5);
                groupableElementSpecImpl8.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
                groupableElementSpecImpl8.bindGroups(Collections.singletonList(Integer.valueOf(i9)));
                registerElement(groupableElementSpecImpl8);
                GroupableElementSpecImpl groupableElementSpecImpl9 = new GroupableElementSpecImpl(R.id.qfy);
                groupableElementSpecImpl9.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
                groupableElementSpecImpl9.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i9), Integer.valueOf(i7), Integer.valueOf(i8)));
                registerElement(groupableElementSpecImpl9);
                GroupableElementSpecImpl groupableElementSpecImpl10 = new GroupableElementSpecImpl(R.id.n3l);
                groupableElementSpecImpl10.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
                groupableElementSpecImpl10.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i7), Integer.valueOf(i8)));
                ElementSpecImplKt.onAttach(groupableElementSpecImpl10, AFwS254S0000000_17.get$arr$(113));
                registerElement(groupableElementSpecImpl10);
            }
        });
        final AbstractC1080560eE2 abstractC1080560eE24 = (AbstractC1080560eE2) getLayeredElementContext();
        registerLayer(new LayerSpecImpl(abstractC1080560eE24) { // from class: X.0eCV
            {
                super(abstractC1080560eE24);
                GroupableElementSpecImpl groupableElementSpecImpl = new GroupableElementSpecImpl(R.id.uoc);
                int i2 = C1079520eCM.LIZ;
                int i3 = C1079430eCD.LIZ;
                int i4 = C1079430eCD.LIZJ;
                groupableElementSpecImpl.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
                int i5 = C1079590eCT.LIZ;
                int i6 = C1079590eCT.LJ;
                groupableElementSpecImpl.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i5), Integer.valueOf(i6)));
                registerElement(groupableElementSpecImpl);
                C1079440eCE c1079440eCE = new C1079440eCE();
                c1079440eCE.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
                int i7 = C1079430eCD.LJ;
                int i8 = C1079520eCM.LIZIZ;
                c1079440eCE.bindGroups(C1697810uHb.LJIILJJIL(Integer.valueOf(i5), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i6)));
                registerElement(c1079440eCE);
                C1079530eCN c1079530eCN = new C1079530eCN(R.id.tqe);
                int i9 = C1079430eCD.LJFF;
                c1079530eCN.bindGroups(C1697810uHb.LJIILJJIL(Integer.valueOf(i5), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i6)));
                registerElement(c1079530eCN);
                C1079530eCN c1079530eCN2 = new C1079530eCN(R.id.jgy);
                c1079530eCN2.setConstraintWidget(new LayeredTestingConstraintWidget());
                c1079530eCN2.bindGroups(C1697810uHb.LJIILJJIL(Integer.valueOf(i5), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i6)));
                c1079530eCN2.addSceneObserver(new WidgetHiddenChangedSceneObserver() { // from class: X.0eCW
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
                registerElement(c1079530eCN2);
                GroupableElementSpecImpl groupableElementSpecImpl2 = new GroupableElementSpecImpl(R.id.mut);
                groupableElementSpecImpl2.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
                int i10 = C1079590eCT.LIZLLL;
                List<Integer> listLJIILJJIL = C1697810uHb.LJIILJJIL(Integer.valueOf(i5), Integer.valueOf(i10), Integer.valueOf(i6));
                listLJIILJJIL.add(Integer.valueOf(i7));
                listLJIILJJIL.add(Integer.valueOf(i8));
                groupableElementSpecImpl2.bindGroups(listLJIILJJIL);
                registerElement(groupableElementSpecImpl2);
                GroupableElementSpecImpl groupableElementSpecImpl3 = new GroupableElementSpecImpl(R.id.yci);
                groupableElementSpecImpl3.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
                groupableElementSpecImpl3.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i5), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i6)));
                ElementSpecImplKt.onAttach(groupableElementSpecImpl3, AFwS254S0000000_17.get$arr$(119));
                registerElement(groupableElementSpecImpl3);
                GroupableElementSpecImpl groupableElementSpecImpl4 = new GroupableElementSpecImpl(R.id.wish_list_container);
                groupableElementSpecImpl4.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
                groupableElementSpecImpl4.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i5), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i6)));
                registerElement(groupableElementSpecImpl4);
                registerElement(new GroupableElementSpecImpl() { // from class: X.0eCU
                    {
                        List<Integer> listLJIILJJIL2 = C1697810uHb.LJIILJJIL(Integer.valueOf(C1079590eCT.LIZ), Integer.valueOf(C1079520eCM.LIZ), Integer.valueOf(C1079430eCD.LIZ), Integer.valueOf(C1079590eCT.LJ), Integer.valueOf(C1079430eCD.LIZJ));
                        listLJIILJJIL2.add(Integer.valueOf(C1079590eCT.LIZLLL));
                        bindGroups(listLJIILJJIL2);
                        ElementSpecImplKt.onAttach(this, AFwS254S0000000_17.get$arr$(121));
                    }
                });
                C1079520eCM.LIZ(this, R.id.yjr);
                GroupableElementSpecImpl groupableElementSpecImpl5 = new GroupableElementSpecImpl(R.id.v96);
                groupableElementSpecImpl5.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
                List<Integer> listLJIILJJIL2 = C1697810uHb.LJIILJJIL(Integer.valueOf(i5), Integer.valueOf(i6));
                listLJIILJJIL2.add(Integer.valueOf(i10));
                groupableElementSpecImpl5.bindGroups(listLJIILJJIL2);
                ElementSpecImplKt.onAttach(groupableElementSpecImpl5, AFwS254S0000000_17.get$arr$(120));
                registerElement(groupableElementSpecImpl5);
                C1079520eCM.LIZ(this, R.id.oya);
                MultiElementSpecImplKt.groupableElement(this, R.id.mue, AFwS254S0000000_17.get$arr$(116));
                C1079530eCN c1079530eCN3 = new C1079530eCN(R.id.sqk);
                c1079530eCN3.setConstraintWidget(new LayeredTestingConstraintWidget());
                List<Integer> listLJIILJJIL3 = C1697810uHb.LJIILJJIL(Integer.valueOf(i5), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i6));
                LiveExtendedScreenUiOptimizeSetting liveExtendedScreenUiOptimizeSetting = LiveExtendedScreenUiOptimizeSetting.INSTANCE;
                if (liveExtendedScreenUiOptimizeSetting.hideSecondRow(abstractC1080560eE24.getDataChannel())) {
                    listLJIILJJIL3.add(Integer.valueOf(i3));
                }
                c1079530eCN3.bindGroups(listLJIILJJIL3);
                registerElement(c1079530eCN3);
                C1079530eCN c1079530eCN4 = new C1079530eCN(R.id.sql);
                c1079530eCN4.setConstraintWidget(new LayeredTestingConstraintWidget());
                List<Integer> listLJIILJJIL4 = C1697810uHb.LJIILJJIL(Integer.valueOf(i5), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i6));
                if (liveExtendedScreenUiOptimizeSetting.hideSecondRow(abstractC1080560eE24.getDataChannel())) {
                    listLJIILJJIL4.add(Integer.valueOf(i3));
                }
                c1079530eCN4.bindGroups(listLJIILJJIL4);
                registerElement(c1079530eCN4);
                C1079530eCN c1079530eCN5 = new C1079530eCN(R.id.p4x);
                c1079530eCN5.bindGroup(C1079430eCD.LIZIZ);
                c1079530eCN5.bindGroups(C1697810uHb.LJIILJJIL(Integer.valueOf(i5), Integer.valueOf(i10), Integer.valueOf(i6)));
                registerElement(c1079530eCN5);
                C1079530eCN c1079530eCN6 = new C1079530eCN(R.id.yli);
                c1079530eCN6.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i5), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i6)));
                registerElement(c1079530eCN6);
                C1079530eCN c1079530eCN7 = new C1079530eCN(R.id.user_info_container);
                c1079530eCN7.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i5), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i6)));
                if (liveExtendedScreenUiOptimizeSetting.hideFirstRow(abstractC1080560eE24.getDataChannel())) {
                    c1079530eCN7.bindGroup(i3);
                }
                registerElement(c1079530eCN7);
                C1079530eCN c1079530eCN8 = new C1079530eCN(R.id.mo8);
                c1079530eCN8.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i5), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i6)));
                if (liveExtendedScreenUiOptimizeSetting.hideFirstRow(abstractC1080560eE24.getDataChannel())) {
                    c1079530eCN8.bindGroup(i3);
                }
                registerElement(c1079530eCN8);
                C1079530eCN c1079530eCN9 = new C1079530eCN(R.id.video_animate_container);
                int i11 = C1079590eCT.LIZIZ;
                c1079530eCN9.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i11), Integer.valueOf(i4)));
                registerElement(c1079530eCN9);
                GroupableElementSpecImpl groupableElementSpecImpl6 = new GroupableElementSpecImpl(R.id.vku);
                groupableElementSpecImpl6.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
                int i12 = C1079590eCT.LJFF;
                int i13 = C1079590eCT.LJI;
                int i14 = C1079590eCT.LJII;
                groupableElementSpecImpl6.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14)));
                registerElement(groupableElementSpecImpl6);
                GroupableElementSpecImpl groupableElementSpecImpl7 = new GroupableElementSpecImpl(R.id.ea1);
                groupableElementSpecImpl7.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
                groupableElementSpecImpl7.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i11), Integer.valueOf(i12)));
                ElementSpecImplKt.animation(groupableElementSpecImpl7, new C1081020eEm(groupableElementSpecImpl7.getId(), abstractC1080560eE24));
                registerElement(groupableElementSpecImpl7);
                MultiElementSpecImplKt.groupableElement(this, R.id.g_i, AFwS254S0000000_17.get$arr$(117));
                C1079530eCN c1079530eCN10 = new C1079530eCN(abstractC1080560eE24) { // from class: X.0eCX
                    {
                        super(R.id.y6v);
                        ElementSpecImplKt.onAttach(this, new AwS596S0100000_17(abstractC1080560eE24, 371));
                    }
                };
                c1079530eCN10.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i5), Integer.valueOf(i3), Integer.valueOf(C1079520eCM.LIZJ), Integer.valueOf(i6), Integer.valueOf(i4), Integer.valueOf(i13), Integer.valueOf(i14)));
                registerElement(c1079530eCN10);
                GroupableElementSpecImpl groupableElementSpecImpl8 = new GroupableElementSpecImpl(R.id.v9b);
                groupableElementSpecImpl8.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
                int i15 = C1079590eCT.LIZJ;
                groupableElementSpecImpl8.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i15), Integer.valueOf(i6), Integer.valueOf(i13), Integer.valueOf(i14)));
                registerElement(groupableElementSpecImpl8);
                GroupableElementSpecImpl groupableElementSpecImpl9 = new GroupableElementSpecImpl(R.id.v9d);
                groupableElementSpecImpl9.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
                groupableElementSpecImpl9.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i15), Integer.valueOf(i6), Integer.valueOf(i13), Integer.valueOf(i14)));
                registerElement(groupableElementSpecImpl9);
                GroupableElementSpecImpl groupableElementSpecImpl10 = new GroupableElementSpecImpl(R.id.vl5);
                groupableElementSpecImpl10.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
                groupableElementSpecImpl10.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i11), Integer.valueOf(i12)));
                registerElement(groupableElementSpecImpl10);
                MultiElementSpecImplKt.groupableElement(this, R.id.ebi, AFwS254S0000000_17.get$arr$(118));
                C1079530eCN c1079530eCN11 = new C1079530eCN(R.id.hj4);
                c1079530eCN11.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i5), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i6)));
                registerElement(c1079530eCN11);
            }
        });
        final ?? layeredElementContext2 = getLayeredElementContext();
        registerLayer(new LayerSpecImpl(layeredElementContext2) { // from class: X.0eCK
            {
                super(layeredElementContext2);
                C1079530eCN c1079530eCN = new C1079530eCN(R.id.j2h);
                int i2 = C1079590eCT.LIZ;
                int i3 = C1079590eCT.LJ;
                c1079530eCN.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3)));
                LiveExtendedScreenUiOptimizeSetting liveExtendedScreenUiOptimizeSetting = LiveExtendedScreenUiOptimizeSetting.INSTANCE;
                if (liveExtendedScreenUiOptimizeSetting.hideSecondRow(layeredElementContext2.getDataChannel())) {
                    c1079530eCN.bindGroup(C1079430eCD.LIZ);
                }
                registerElement(c1079530eCN);
                C1079530eCN c1079530eCN2 = new C1079530eCN(R.id.n4a);
                c1079530eCN2.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3)));
                if (liveExtendedScreenUiOptimizeSetting.hideSecondRow(layeredElementContext2.getDataChannel())) {
                    c1079530eCN2.bindGroup(C1079430eCD.LIZ);
                }
                registerElement(c1079530eCN2);
                C1079530eCN c1079530eCN3 = new C1079530eCN(R.id.ye6);
                c1079530eCN3.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(i3)));
                c1079530eCN3.addSceneObserver(new DataChannelSceneObserver<C956380azk, LinkCrossRoomStateChangeEvent>() { // from class: X.0eBn
                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<LinkCrossRoomStateChangeEvent> getType() {
                        return LinkCrossRoomStateChangeEvent.class;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext3, ConstraintProperty constraintProperty, C956380azk c956380azk) {
                        int i4 = c956380azk.LIZ;
                        if (i4 == 1) {
                            constraintProperty.connect(3, R.id.hei, 3, 0);
                            constraintProperty.apply();
                        } else {
                            if (i4 != 0) {
                                return;
                            }
                            constraintProperty.connect(3, R.id.p1a, 4, 0);
                            constraintProperty.apply();
                        }
                    }
                });
                c1079530eCN3.addSceneObserver(new DataChannelSceneObserver<C1081600eFi, MultiLiveRTCLayoutChannel>() { // from class: X.0eFS
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
                registerElement(c1079530eCN3);
                GroupableElementSpecImpl groupableElementSpecImpl = new GroupableElementSpecImpl(R.id.ez2);
                int i4 = C1079520eCM.LIZ;
                int i5 = C1079430eCD.LIZ;
                int i6 = C1079430eCD.LIZJ;
                groupableElementSpecImpl.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)));
                groupableElementSpecImpl.bindGroups(Collections.singletonList(Integer.valueOf(i3)));
                registerElement(groupableElementSpecImpl);
                C1079520eCM.LIZ(this, R.id.kv7);
                GroupableElementSpecImpl groupableElementSpecImpl2 = new GroupableElementSpecImpl(R.id.n3_);
                groupableElementSpecImpl2.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)));
                groupableElementSpecImpl2.bindGroups(Collections.singletonList(Integer.valueOf(i3)));
                registerElement(groupableElementSpecImpl2);
                GroupableElementSpecImpl groupableElementSpecImpl3 = new GroupableElementSpecImpl(R.id.hye);
                groupableElementSpecImpl3.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)));
                groupableElementSpecImpl3.bindGroups(Collections.singletonList(Integer.valueOf(i3)));
                registerElement(groupableElementSpecImpl3);
                GroupableElementSpecImpl groupableElementSpecImpl4 = new GroupableElementSpecImpl(R.id.w4w);
                groupableElementSpecImpl4.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)));
                groupableElementSpecImpl4.bindGroups(Collections.singletonList(Integer.valueOf(i3)));
                registerElement(groupableElementSpecImpl4);
                GroupableElementSpecImpl groupableElementSpecImpl5 = new GroupableElementSpecImpl(R.id.iuw);
                groupableElementSpecImpl5.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)));
                int i7 = C1079520eCM.LIZJ;
                groupableElementSpecImpl5.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i7), Integer.valueOf(i3)));
                registerElement(groupableElementSpecImpl5);
                GroupableElementSpecImpl groupableElementSpecImpl6 = new GroupableElementSpecImpl(R.id.b2t);
                groupableElementSpecImpl6.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)));
                groupableElementSpecImpl6.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i7), Integer.valueOf(i3)));
                registerElement(groupableElementSpecImpl6);
                C1079520eCM.LIZ(this, R.id.waq);
                GroupableElementSpecImpl groupableElementSpecImpl7 = new GroupableElementSpecImpl(R.id.q41);
                groupableElementSpecImpl7.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)));
                groupableElementSpecImpl7.bindGroups(Collections.singletonList(Integer.valueOf(i3)));
                registerElement(groupableElementSpecImpl7);
                GroupableElementSpecImpl groupableElementSpecImpl8 = new GroupableElementSpecImpl(R.id.kv5);
                groupableElementSpecImpl8.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)));
                groupableElementSpecImpl8.bindGroups(Collections.singletonList(Integer.valueOf(i3)));
                registerElement(groupableElementSpecImpl8);
                C1079520eCM.LIZ(this, R.id.h5d);
                MultiElementSpecImplKt.element(this, R.id.dc5);
                MultiElementSpecImplKt.element(this, R.id.myo);
                GroupableElementSpecImpl groupableElementSpecImpl9 = new GroupableElementSpecImpl(R.id.ylk);
                groupableElementSpecImpl9.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)));
                groupableElementSpecImpl9.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(C1079590eCT.LIZIZ), Integer.valueOf(C1079590eCT.LJFF)));
                ElementSpecImplKt.animation(groupableElementSpecImpl9, new C1080080eDG(groupableElementSpecImpl9.getId(), layeredElementContext2));
                registerElement(groupableElementSpecImpl9);
                GroupableElementSpecImpl groupableElementSpecImpl10 = new GroupableElementSpecImpl(R.id.mu6);
                groupableElementSpecImpl10.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)));
                groupableElementSpecImpl10.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(i2), Integer.valueOf(C1079510eCL.LIZIZ), Integer.valueOf(i3), Integer.valueOf(C1079590eCT.LJI), Integer.valueOf(C1079590eCT.LJII)));
                if (!LiveBillboardAvoidKeyboardSetting.INSTANCE.avoid()) {
                    groupableElementSpecImpl10.removeGroup(i2);
                }
                registerElement(groupableElementSpecImpl10);
            }
        });
        registerLayer(new C1080430eDp(getLayeredElementContext()));
        C1081550eFd c1081550eFdMA = ((ILayerService) C1161920gLG.LIZJ(ILayerService.class)).MA((AbstractC1080560eE2) getLayeredElementContext());
        if (c1081550eFdMA != null) {
            registerLayer(c1081550eFdMA);
        }
        if (LiveRankingCompetitiveAtmosphereSetting.INSTANCE.getRankingEntrancePositionOpt()) {
            i = 2;
            registerHorizontalChain(R.id.vyl, R.id.hh1, 2, ((AbstractC1080560eE2) getLayeredElementContext()).LIZLLL, R.id.tqe, R.id.sqk, R.id.sql, R.id.jgy);
        } else {
            i = 2;
            registerHorizontalChain(R.id.vyl, R.id.hh1, 2, ((AbstractC1080560eE2) getLayeredElementContext()).LIZLLL, R.id.tqe, R.id.jgy, R.id.sqk, R.id.sql);
        }
        int[] iArr = new int[i];
        // fill-array-data instruction
        iArr[0] = 2131382535;
        iArr[1] = 2131399177;
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.p1_, iArr);
        int[] iArr2 = new int[i];
        // fill-array-data instruction
        iArr2[0] = 2131371710;
        iArr2[1] = 2131381615;
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.hh1, iArr2);
        int[] iArr3 = new int[i];
        // fill-array-data instruction
        iArr3[0] = 2131382669;
        iArr3[1] = 2131379558;
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.p4r, iArr3);
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.hgs, R.id.tqe, R.id.jgy, R.id.sqk, R.id.sql, R.id.p4x, R.id.hgt);
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.hei, R.id.v97, R.id.mut);
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.kwc, R.id.ik5, R.id.fce, R.id.fdx, R.id.weq, R.id.qfy, R.id.n3l);
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.rg9, R.id.n2m, R.id.myj, R.id.g_h, R.id.ea1, R.id.isf);
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.kwd, R.id.ike, R.id.pbo);
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.ccg, R.id.v9c, R.id.cdt);
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.y6t, R.id.q2x, R.id.v9b);
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.vkv, R.id.ea1, R.id.isf);
        finishRegistration();
    }
}
