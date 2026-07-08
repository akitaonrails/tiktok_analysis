package com.bytedance.android.livesdk.chatroom.ui.portrait;

import X.AbstractC1080560eE2;
import X.C1079780eCm;
import X.C1080140eDM;
import X.C1080550eE1;
import X.C1082380eGy;
import X.C1083100eI8;
import X.C1083340eIW;
import X.C1083350eIX;
import X.C1161920gLG;
import X.C13LP;
import X.C497740JfY;
import X.C500260Jjc;
import Y.ALAdapterS13S0100000_17;
import Y.AUListenerS266S0100000_17;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.layer.BaseLayeredElementManager;
import com.bytedance.android.live.layer.ILayerService;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.live.liveinteract.api.VoiceChatLayoutChannel;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.live.room.VideoOrientationChangeChannel;
import com.bytedance.android.live.uikit.setting.LiveConflictAvoidFollowCapsulePositionOpt;
import com.bytedance.android.live.uikit.setting.LiveConflictAvoidInputAnimOpt;
import com.bytedance.android.livesdk.RecommendButtonStatEvent;
import com.bytedance.android.livesdk.dataChannel.BottomAlphaLayoutEvent;
import com.bytedance.android.livesdk.dataChannel.ECStartClearScreenEvent;
import com.bytedance.android.livesdk.dataChannel.FirstFrameChannelEvent;
import com.bytedance.android.livesdk.dataChannel.HideTitleLayoutCaptionEvent;
import com.bytedance.android.livesdk.dataChannel.KeyboardStatusChannel;
import com.bytedance.android.livesdk.dataChannel.ProgrammedLiveMenuVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.StartClearScreenEvent;
import com.bytedance.android.livesdk.livesetting.LiveInteractionMaskConfigSetting;
import com.bytedance.android.livesdk.livesetting.LiveTopOneFixSetting;
import com.bytedance.android.livesdk.livesetting.performance.WidgetPlaceholderOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.WidgetPlaceholderOptV2Setting;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.GiftGuideLynxPopupEnableSetting;
import com.bytedance.android.livesdk.livesetting.skylight.LiveTopLiveSkylightOptSetting;
import com.bytedance.android.livesdk.setting.LiveInteractViewRemoveSettingV2;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.GroupableElementSpecImpl;
import com.bytedance.ies.sdk.widgets.LayerSpecImpl;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.MultiElementSpecImpl;
import com.bytedance.ies.sdk.widgets.MultiElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.PriorityConstraintSolver;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public class PortraitLayeredElementManager extends BaseLayeredElementManager<C1080550eE1> {
    @Override // com.bytedance.ies.sdk.widgets.LayeredElementManager, com.bytedance.ies.sdk.widgets.recycleelement.IRecycleLayeredElementManager
    public final boolean needReuse() {
        return true;
    }

    @Override // com.bytedance.android.live.layer.BaseLayeredElementManager, com.bytedance.ies.sdk.widgets.LayeredElementManager, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public static void LIZLLL(C1083340eIW c1083340eIW) {
        List listAsList;
        if (c1083340eIW == null) {
            return;
        }
        LiveInteractViewRemoveSettingV2 liveInteractViewRemoveSettingV2 = LiveInteractViewRemoveSettingV2.INSTANCE;
        boolean zIsViewRemoved = liveInteractViewRemoveSettingV2.isViewRemoved(R.id.cga);
        if (!liveInteractViewRemoveSettingV2.isViewRemoved(R.id.cej)) {
            C1083100eI8.fixReferencedIds(c1083340eIW, R.id.cej, R.id.mlc, R.id.ceh, R.id.cef, R.id.cei);
        }
        if (GiftGuideLynxPopupEnableSetting.INSTANCE.isCommentEvade()) {
            listAsList = Arrays.asList(Integer.valueOf(R.id.ike), Integer.valueOf(R.id.cga), Integer.valueOf(R.id.pbo), Integer.valueOf(R.id.s88), Integer.valueOf(R.id.wkn), Integer.valueOf(R.id.ixx));
        } else {
            listAsList = Arrays.asList(Integer.valueOf(R.id.ike), Integer.valueOf(R.id.cga), Integer.valueOf(R.id.pbo), Integer.valueOf(R.id.s88), Integer.valueOf(R.id.wkn));
        }
        ArrayList arrayList = new ArrayList(listAsList);
        if (zIsViewRemoved) {
            arrayList.remove(Integer.valueOf(R.id.cga));
        }
        if (liveInteractViewRemoveSettingV2.isViewRemoved(R.id.ike)) {
            arrayList.remove(Integer.valueOf(R.id.ike));
        }
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.kwd, C13LP.LLII(arrayList));
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.gex, R.id.kwd, R.id.gey);
        ArrayList arrayList2 = new ArrayList(Arrays.asList(Integer.valueOf(R.id.mxe), Integer.valueOf(R.id.ik5), Integer.valueOf(R.id.fce), Integer.valueOf(R.id.fdx), Integer.valueOf(R.id.weq), Integer.valueOf(R.id.qfy), Integer.valueOf(R.id.n3l), Integer.valueOf(R.id.jmj)));
        if (liveInteractViewRemoveSettingV2.isViewRemoved(R.id.fce)) {
            arrayList2.remove(Integer.valueOf(R.id.fce));
        }
        if (liveInteractViewRemoveSettingV2.isViewRemoved(R.id.fdx)) {
            arrayList2.remove(Integer.valueOf(R.id.fdx));
        }
        if (liveInteractViewRemoveSettingV2.isViewRemoved(R.id.weq)) {
            arrayList2.remove(Integer.valueOf(R.id.weq));
        }
        if (liveInteractViewRemoveSettingV2.isViewRemoved(R.id.qfy)) {
            arrayList2.remove(Integer.valueOf(R.id.qfy));
        }
        if (liveInteractViewRemoveSettingV2.isViewRemoved(R.id.mxe)) {
            arrayList2.remove(Integer.valueOf(R.id.mxe));
        }
        ArrayList arrayList3 = new ArrayList();
        if (LiveConflictAvoidFollowCapsulePositionOpt.INSTANCE.enable()) {
            arrayList3.add(Integer.valueOf(R.id.ieo));
        }
        if (!((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad() || C500260Jjc.LJJIII(C497740JfY.LIZ)) {
            arrayList3.add(Integer.valueOf(R.id.iq0));
        }
        arrayList3.addAll(arrayList2);
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.kwc, C13LP.LLII(arrayList3));
        ArrayList arrayList4 = new ArrayList();
        if (!((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad() || C500260Jjc.LJJIII(C497740JfY.LIZ)) {
            arrayList4.add(Integer.valueOf(R.id.iq0));
        }
        arrayList4.addAll(arrayList2);
        if (!liveInteractViewRemoveSettingV2.isViewRemoved(R.id.kwa)) {
            C1083100eI8.fixReferencedIds(c1083340eIW, R.id.kwa, C13LP.LLII(arrayList4));
        }
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.kw6, R.id.sme, R.id.f814ule, R.id.ukr, R.id.sup, R.id.n20);
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.sfq, R.id.kw9, R.id.kw7, R.id.n8j);
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.rg9, R.id.n2m, R.id.myj, R.id.g_h, R.id.ea1, R.id.isf);
        if (liveInteractViewRemoveSettingV2.isViewRemoved(R.id.sql)) {
            C1083100eI8.fixReferencedIds(c1083340eIW, R.id.hgs, R.id.oay, R.id.sqk, R.id.s8h, R.id.hgt);
        } else {
            C1083100eI8.fixReferencedIds(c1083340eIW, R.id.hgs, R.id.oay, R.id.sqk, R.id.sql, R.id.s8h, R.id.hgt);
        }
        if (((IProgrammedLiveService) C1161920gLG.LIZJ(IProgrammedLiveService.class)).lm1() || (C1161920gLG.LIZJ(IMicRoomService.class) != null && ((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).On1())) {
            C1083100eI8.fixReferencedIds(c1083340eIW, R.id.hh1, R.id.h4p, R.id.s8b);
        }
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.hei, R.id.yci, R.id.wish_list_container, R.id.v97);
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.s8g, R.id.s8f, R.id.p1a);
        if (!liveInteractViewRemoveSettingV2.isViewRemoved(R.id.ccg)) {
            C1083100eI8.fixReferencedIds(c1083340eIW, R.id.ccg, R.id.cdt);
        }
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.rf_, R.id.rg9, R.id.qhj);
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.vkv, R.id.ea1, R.id.isf);
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.rgd, R.id.j0x, R.id.isf);
    }

    @Override // com.bytedance.ies.sdk.widgets.LayeredElementManager
    public final void resolveChain(int i) {
        if (WidgetPlaceholderOptV2Setting.enableSecondRowChainOpt()) {
            resolveChainNew(i);
        } else {
            super.resolveChain(i);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LayeredElementManager
    public final void resolveSpacing(int i) {
        if (WidgetPlaceholderOptV2Setting.enableThirdRowSpacingResolverOpt()) {
            resolveSpacingNew(i);
        } else {
            super.resolveSpacing(i);
        }
    }

    @Override // com.bytedance.android.live.layer.BaseLayeredElementManager, com.bytedance.ies.sdk.widgets.LayeredElementManager, com.bytedance.ies.sdk.widgets.recycleelement.IRecycleLayeredElementManager
    public final void reuse(Fragment fragment, DataChannel dataChannel) {
        super.reuse(fragment, dataChannel);
        LIZLLL(this.mLayeredConstraintLayout);
        setGroupReferenceIds();
    }

    @Override // com.bytedance.ies.sdk.widgets.LayeredElementManager
    public final LayeredElementContext onCreateLayeredElementContext(Context context, ViewGroup viewGroup, DataChannel dataChannel) {
        return new C1080550eE1(context, viewGroup, dataChannel, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.bytedance.ies.sdk.widgets.LayeredElementContext] */
    /* JADX WARN: Type inference failed for: r0v19, types: [com.bytedance.ies.sdk.widgets.LayeredElementContext] */
    public PortraitLayeredElementManager(Context context, Fragment fragment, C1083340eIW c1083340eIW, DataChannel dataChannel) {
        super(context, fragment, c1083340eIW, dataChannel);
        c1083340eIW.setConstraintSolver(new PriorityConstraintSolver(new C1083350eIX()));
        C1082380eGy c1082380eGyRa0 = ((ILayerService) C1161920gLG.LIZJ(ILayerService.class)).ra0((AbstractC1080560eE2) getLayeredElementContext());
        final AbstractC1080560eE2 abstractC1080560eE2 = (AbstractC1080560eE2) getLayeredElementContext();
        registerGroups(new C1080140eDM(abstractC1080560eE2) { // from class: X.0eCc
            {
                super(abstractC1080560eE2);
                final View view = this.LIZ;
                MultiElementSpecImplKt.element(this, new AbstractC1079930eD1(abstractC1080560eE2, view) { // from class: X.0eCe
                });
                ElementSpecImpl elementSpecImpl = new ElementSpecImpl(C1079350eC5.LJIIJJI);
                elementSpecImpl.addSceneObserver(new C1079710eCf(abstractC1080560eE2));
                registerElement(elementSpecImpl);
                ElementSpecImpl elementSpecImpl2 = new ElementSpecImpl(C1079350eC5.LIZ);
                elementSpecImpl2.addSceneObserver(new C1080280eDa(abstractC1080560eE2));
                elementSpecImpl2.addSceneObserver(new C1080250eDX());
                registerElement(elementSpecImpl2);
                ElementSpecImpl elementSpecImpl3 = new ElementSpecImpl(C1079350eC5.LIZIZ);
                final int i = 1;
                elementSpecImpl3.addSceneObserver(new DataChannelSceneObserver<C1082930eHr, ECStartClearScreenEvent>(i) { // from class: X.0eHq
                    public final int LIZ;

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<ECStartClearScreenEvent> getType() {
                        return ECStartClearScreenEvent.class;
                    }

                    {
                        super(true);
                        this.LIZ = i;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C1082930eHr c1082930eHr) {
                        C1082930eHr c1082930eHr2 = c1082930eHr;
                        if (c1082930eHr2.LIZIZ == this.LIZ) {
                            if (c1082930eHr2.LIZ) {
                                constraintProperty.visibility(4);
                            } else {
                                constraintProperty.visibility(0);
                            }
                        }
                    }
                });
                registerElement(elementSpecImpl3);
                ElementSpecImpl elementSpecImpl4 = new ElementSpecImpl(C1079350eC5.LIZLLL);
                final int i2 = 3;
                elementSpecImpl4.addSceneObserver(new DataChannelSceneObserver<C1082930eHr, ECStartClearScreenEvent>(i2) { // from class: X.0eHq
                    public final int LIZ;

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<ECStartClearScreenEvent> getType() {
                        return ECStartClearScreenEvent.class;
                    }

                    {
                        super(true);
                        this.LIZ = i2;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C1082930eHr c1082930eHr) {
                        C1082930eHr c1082930eHr2 = c1082930eHr;
                        if (c1082930eHr2.LIZIZ == this.LIZ) {
                            if (c1082930eHr2.LIZ) {
                                constraintProperty.visibility(4);
                            } else {
                                constraintProperty.visibility(0);
                            }
                        }
                    }
                });
                registerElement(elementSpecImpl4);
                ElementSpecImpl elementSpecImpl5 = new ElementSpecImpl(C1079350eC5.LIZJ);
                final int i3 = 2;
                elementSpecImpl5.addSceneObserver(new DataChannelSceneObserver<C1082930eHr, ECStartClearScreenEvent>(i3) { // from class: X.0eHq
                    public final int LIZ;

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<ECStartClearScreenEvent> getType() {
                        return ECStartClearScreenEvent.class;
                    }

                    {
                        super(true);
                        this.LIZ = i3;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C1082930eHr c1082930eHr) {
                        C1082930eHr c1082930eHr2 = c1082930eHr;
                        if (c1082930eHr2.LIZIZ == this.LIZ) {
                            if (c1082930eHr2.LIZ) {
                                constraintProperty.visibility(4);
                            } else {
                                constraintProperty.visibility(0);
                            }
                        }
                    }
                });
                registerElement(elementSpecImpl5);
                ElementSpecImpl elementSpecImpl6 = new ElementSpecImpl(C1079350eC5.LJFF);
                elementSpecImpl6.addSceneObserver(new DataChannelSceneObserver<C0KVO, StartClearScreenEvent>(abstractC1080560eE2) { // from class: X.0eCh
                    public final C01GW LIZ;
                    public C0KVO LIZIZ;

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<StartClearScreenEvent> getType() {
                        return StartClearScreenEvent.class;
                    }

                    {
                        super(true);
                        this.LIZ = C292401Bi.LIZ(new AwS561S0100000_17(abstractC1080560eE2, 498));
                    }

                    @Override // com.bytedance.ies.sdk.widgets.SceneObserver
                    public final void dispose(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty) {
                        super.dispose(layeredElementContext, constraintProperty);
                        constraintProperty.alpha(1.0f);
                        ((ValueAnimator) this.LIZ.getValue()).cancel();
                        this.LIZIZ = null;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C0KVO c0kvo) {
                        C0KVO c0kvo2 = c0kvo;
                        C0KVO c0kvo3 = this.LIZIZ;
                        if (c0kvo3 != null && c0kvo3.LIZ == c0kvo2.LIZ) {
                            return;
                        }
                        AbstractC1080290eDb abstractC1080290eDb = c0kvo2.LIZJ;
                        if (LiveTopLiveSkylightOptSetting.INSTANCE.getEnable() && (abstractC1080290eDb instanceof C475530Ikp) && ((C475530Ikp) abstractC1080290eDb).LIZJ == EnumC475520Iko.SKYLIGHT_WITH_TITLE) {
                            this.LIZIZ = c0kvo2;
                            ((ValueAnimator) this.LIZ.getValue()).cancel();
                            constraintProperty.alpha(1.0f);
                            return;
                        }
                        ValueAnimator valueAnimator = (ValueAnimator) this.LIZ.getValue();
                        this.LIZIZ = c0kvo2;
                        valueAnimator.cancel();
                        valueAnimator.removeAllUpdateListeners();
                        valueAnimator.removeAllListeners();
                        if (c0kvo2.LIZ) {
                            valueAnimator.setFloatValues(1.0f, 0.0f);
                        } else {
                            valueAnimator.setFloatValues(0.0f, 1.0f);
                        }
                        valueAnimator.addUpdateListener(new AUListenerS266S0100000_17(constraintProperty, 99));
                        if (LiveInteractionMaskConfigSetting.INSTANCE.enableClearScreenMaskRespectAnim() && !c0kvo2.LIZJ.LIZIZ) {
                            valueAnimator.end();
                        } else {
                            valueAnimator.start();
                        }
                    }
                });
                registerElement(elementSpecImpl6);
                registerElement(new ElementSpecImpl(C1079350eC5.LJII));
                ElementSpecImpl elementSpecImpl7 = new ElementSpecImpl(C1079350eC5.LJIIIIZZ);
                ElementSpecImplKt.onAttach(elementSpecImpl7, AFwS254S0000000_17.get$arr$(216));
                registerElement(elementSpecImpl7);
                ElementSpecImpl elementSpecImpl8 = new ElementSpecImpl(C1079350eC5.LJI);
                elementSpecImpl8.addSceneObserver(new DataChannelSceneObserver<C0KVO, StartClearScreenEvent>(abstractC1080560eE2) { // from class: X.0eCj
                    public final C01GW LIZ;
                    public C0KVO LIZIZ;

                    public final ValueAnimator LIZ() {
                        return (ValueAnimator) this.LIZ.getValue();
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<StartClearScreenEvent> getType() {
                        return StartClearScreenEvent.class;
                    }

                    {
                        super(true);
                        this.LIZ = C292401Bi.LIZ(new AwS561S0100000_17(abstractC1080560eE2, 499));
                    }

                    @Override // com.bytedance.ies.sdk.widgets.SceneObserver
                    public final void dispose(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty) {
                        super.dispose(layeredElementContext, constraintProperty);
                        constraintProperty.alpha(1.0f);
                        constraintProperty.visibility(0);
                        LIZ().cancel();
                        this.LIZIZ = null;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C0KVO c0kvo) {
                        C0KVO c0kvo2 = c0kvo;
                        AbstractC1080290eDb abstractC1080290eDb = c0kvo2.LIZJ;
                        if (abstractC1080290eDb instanceof C0IJC) {
                            C0KVO c0kvo3 = this.LIZIZ;
                            if (c0kvo3 != null && c0kvo3.LIZ == c0kvo2.LIZ) {
                                return;
                            }
                            this.LIZIZ = c0kvo2;
                            boolean z = abstractC1080290eDb.LIZIZ;
                            LIZ().cancel();
                            LIZ().removeAllUpdateListeners();
                            LIZ().removeAllListeners();
                            if (c0kvo2.LIZ) {
                                LIZ().setFloatValues(constraintProperty.alpha(), 0.0f);
                                LIZ().addListener(new ALAdapterS13S0100000_17(constraintProperty, 83));
                            } else {
                                LIZ().setFloatValues(constraintProperty.alpha(), 1.0f);
                                LIZ().addListener(new ALAdapterS13S0100000_17(constraintProperty, 84));
                            }
                            LIZ().addUpdateListener(new AUListenerS266S0100000_17(constraintProperty, 100));
                            if (z) {
                                LIZ().start();
                            } else {
                                LIZ().end();
                            }
                        }
                    }
                });
                registerElement(elementSpecImpl8);
                ElementSpecImpl elementSpecImpl9 = new ElementSpecImpl(C1079350eC5.LJ);
                elementSpecImpl9.addSceneObserver(new DataChannelSceneObserver<C0KVO, StartClearScreenEvent>(abstractC1080560eE2) { // from class: X.0eCi
                    public final C01GW LIZ;
                    public C0KVO LIZIZ;

                    public final ValueAnimator LIZ() {
                        return (ValueAnimator) this.LIZ.getValue();
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<StartClearScreenEvent> getType() {
                        return StartClearScreenEvent.class;
                    }

                    {
                        super(true);
                        this.LIZ = C292401Bi.LIZ(new AwS561S0100000_17(abstractC1080560eE2, 497));
                    }

                    @Override // com.bytedance.ies.sdk.widgets.SceneObserver
                    public final void dispose(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty) {
                        super.dispose(layeredElementContext, constraintProperty);
                        constraintProperty.alpha(1.0f);
                        constraintProperty.visibility(0);
                        LIZ().cancel();
                        this.LIZIZ = null;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C0KVO c0kvo) {
                        C0KVO c0kvo2 = c0kvo;
                        AbstractC1080290eDb abstractC1080290eDb = c0kvo2.LIZJ;
                        if (!(abstractC1080290eDb instanceof C475530Ikp)) {
                            if (!c0kvo2.LIZ) {
                                constraintProperty.alpha(1.0f);
                                constraintProperty.visibility(0);
                                return;
                            }
                            return;
                        }
                        C0KVO c0kvo3 = this.LIZIZ;
                        if (c0kvo3 != null && c0kvo3.LIZ == c0kvo2.LIZ) {
                            return;
                        }
                        this.LIZIZ = c0kvo2;
                        boolean z = abstractC1080290eDb.LIZIZ;
                        LIZ().cancel();
                        LIZ().removeAllUpdateListeners();
                        LIZ().removeAllListeners();
                        if (c0kvo2.LIZ) {
                            LIZ().setFloatValues(constraintProperty.alpha(), 0.0f);
                            LIZ().addListener(new ALAdapterS13S0100000_17(constraintProperty, 81));
                        } else {
                            LIZ().setFloatValues(constraintProperty.alpha(), 1.0f);
                            LIZ().addListener(new ALAdapterS13S0100000_17(constraintProperty, 82));
                        }
                        LIZ().addUpdateListener(new AUListenerS266S0100000_17(constraintProperty, 98));
                        if (z) {
                            LIZ().start();
                        } else {
                            LIZ().end();
                        }
                    }
                });
                registerElement(elementSpecImpl9);
                if (!WidgetPlaceholderOptV2Setting.enableCaptionDeleteTopOpt()) {
                    MultiElementSpecImplKt.element(this, new ElementSpecImpl(abstractC1080560eE2) { // from class: X.0eBx
                        {
                            super(C1079430eCD.LJIIIZ);
                            addSceneObserver(new DataChannelSceneObserver<Boolean, HideTitleLayoutCaptionEvent>(abstractC1080560eE2) { // from class: X.0eBw
                                public final View LIZ;
                                public ValueAnimator LIZIZ;
                                public boolean LIZJ;

                                @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                                public final Class<HideTitleLayoutCaptionEvent> getType() {
                                    return HideTitleLayoutCaptionEvent.class;
                                }

                                {
                                    super(true);
                                    this.LIZ = abstractC1080560eE2.getContainer().findViewById(R.id.dc9);
                                }

                                @Override // com.bytedance.ies.sdk.widgets.SceneObserver
                                public final void dispose(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty) {
                                    super.dispose(layeredElementContext, constraintProperty);
                                    ValueAnimator valueAnimator = this.LIZIZ;
                                    if (valueAnimator != null) {
                                        valueAnimator.cancel();
                                    }
                                    this.LIZJ = false;
                                    C786410Ut5.LJLLLLLL(8, this.LIZ);
                                    constraintProperty.alpha(1.0f);
                                }

                                @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                                public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool) {
                                    boolean zBooleanValue = bool.booleanValue();
                                    if (this.LIZJ != zBooleanValue) {
                                        this.LIZJ = zBooleanValue;
                                        if (this.LIZIZ == null) {
                                            ValueAnimator valueAnimator = new ValueAnimator();
                                            valueAnimator.setDuration(layeredElementContext.getAnimationDuration());
                                            this.LIZIZ = valueAnimator;
                                        }
                                        ValueAnimator valueAnimator2 = this.LIZIZ;
                                        if (valueAnimator2 != null) {
                                            valueAnimator2.cancel();
                                        }
                                        ValueAnimator valueAnimator3 = this.LIZIZ;
                                        if (valueAnimator3 != null) {
                                            valueAnimator3.removeAllUpdateListeners();
                                        }
                                        if (zBooleanValue) {
                                            ValueAnimator valueAnimator4 = this.LIZIZ;
                                            if (valueAnimator4 != null) {
                                                valueAnimator4.setFloatValues(constraintProperty.alpha(), 0.0f);
                                            }
                                        } else {
                                            ValueAnimator valueAnimator5 = this.LIZIZ;
                                            if (valueAnimator5 != null) {
                                                valueAnimator5.setFloatValues(constraintProperty.alpha(), 1.0f);
                                            }
                                        }
                                        ValueAnimator valueAnimator6 = this.LIZIZ;
                                        if (valueAnimator6 != null) {
                                            valueAnimator6.addUpdateListener(new AUListenerS266S0100000_17(constraintProperty, 121));
                                        }
                                        ValueAnimator valueAnimator7 = this.LIZIZ;
                                        if (valueAnimator7 != null) {
                                            valueAnimator7.start();
                                        }
                                    }
                                }
                            });
                        }
                    });
                }
                if (!WidgetPlaceholderOptV2Setting.enableCaptionTextOpt()) {
                    MultiElementSpecImplKt.element(this, new ElementSpecImpl(abstractC1080560eE2) { // from class: X.0eBv
                        {
                            super(C1079430eCD.LJIIIIZZ);
                            addSceneObserver(new DataChannelSceneObserver<Boolean, BottomAlphaLayoutEvent>(abstractC1080560eE2) { // from class: X.0eBu
                                public final View LIZ;
                                public ValueAnimator LIZIZ;
                                public boolean LIZJ;

                                @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                                public final Class<BottomAlphaLayoutEvent> getType() {
                                    return BottomAlphaLayoutEvent.class;
                                }

                                {
                                    super(true);
                                    this.LIZ = abstractC1080560eE2.getContainer().findViewById(R.id.ddh);
                                }

                                @Override // com.bytedance.ies.sdk.widgets.SceneObserver
                                public final void dispose(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty) {
                                    super.dispose(layeredElementContext, constraintProperty);
                                    ValueAnimator valueAnimator = this.LIZIZ;
                                    if (valueAnimator != null) {
                                        valueAnimator.cancel();
                                    }
                                    this.LIZJ = false;
                                    C786410Ut5.LJLLLLLL(8, this.LIZ);
                                    constraintProperty.alpha(1.0f);
                                }

                                @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                                public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool) {
                                    boolean zBooleanValue = bool.booleanValue();
                                    if (this.LIZJ != zBooleanValue) {
                                        this.LIZJ = zBooleanValue;
                                        if (this.LIZIZ == null) {
                                            ValueAnimator valueAnimator = new ValueAnimator();
                                            valueAnimator.setDuration(layeredElementContext.getAnimationDuration());
                                            this.LIZIZ = valueAnimator;
                                        }
                                        ValueAnimator valueAnimator2 = this.LIZIZ;
                                        if (valueAnimator2 != null) {
                                            valueAnimator2.cancel();
                                        }
                                        ValueAnimator valueAnimator3 = this.LIZIZ;
                                        if (valueAnimator3 != null) {
                                            valueAnimator3.removeAllUpdateListeners();
                                        }
                                        if (zBooleanValue) {
                                            ValueAnimator valueAnimator4 = this.LIZIZ;
                                            if (valueAnimator4 != null) {
                                                valueAnimator4.setFloatValues(constraintProperty.alpha(), 0.3f);
                                            }
                                        } else {
                                            ValueAnimator valueAnimator5 = this.LIZIZ;
                                            if (valueAnimator5 != null) {
                                                valueAnimator5.setFloatValues(constraintProperty.alpha(), 1.0f);
                                            }
                                        }
                                        ValueAnimator valueAnimator6 = this.LIZIZ;
                                        if (valueAnimator6 != null) {
                                            valueAnimator6.addUpdateListener(new AUListenerS266S0100000_17(constraintProperty, 120));
                                        }
                                        ValueAnimator valueAnimator7 = this.LIZIZ;
                                        if (valueAnimator7 != null) {
                                            valueAnimator7.start();
                                        }
                                    }
                                }
                            });
                        }
                    });
                }
                registerElement(new ElementSpecImpl(C1079350eC5.LJIIIZ));
                MultiElementSpecImplKt.element(this, new ElementSpecImpl() { // from class: X.0eCd
                    {
                        int i4 = C1079350eC5.LJIIL;
                    }
                });
            }
        });
        final AbstractC1080560eE2 abstractC1080560eE22 = (AbstractC1080560eE2) getLayeredElementContext();
        registerGroups(new MultiElementSpecImpl<C1079780eCm>(abstractC1080560eE22) { // from class: X.0eCm
            {
                ElementSpecImpl elementSpecImpl = new ElementSpecImpl(C1079320eC2.LIZ);
                elementSpecImpl.addSceneObserver(new DataChannelSceneObserver<C2283361EZa, RecommendButtonStatEvent>() { // from class: X.0eCn
                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<RecommendButtonStatEvent> getType() {
                        return RecommendButtonStatEvent.class;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.SceneObserver
                    public final void dispose(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty) {
                        super.dispose(layeredElementContext, constraintProperty);
                        constraintProperty.alpha(1.0f);
                        constraintProperty.translationY(0.0f);
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C2283361EZa c2283361EZa) {
                        c2283361EZa.getClass();
                        constraintProperty.alpha(0.0f);
                        constraintProperty.translationY(layeredElementContext.getContainer().getHeight());
                    }
                });
                registerElement(elementSpecImpl);
            }
        });
        if (c1082380eGyRa0 != null) {
            registerLayer(c1082380eGyRa0);
        }
        final AbstractC1080560eE2 abstractC1080560eE23 = (AbstractC1080560eE2) getLayeredElementContext();
        registerLayer(new LayerSpecImpl(abstractC1080560eE23) { // from class: X.0eDq
            {
                super(abstractC1080560eE23);
                MultiElementSpecImplKt.element(this, new C1080820eES(abstractC1080560eE23));
                MultiElementSpecImplKt.element(this, R.id.vkw);
                C1081740eFw c1081740eFwDf0 = ((ILayerService) C1161920gLG.LIZJ(ILayerService.class)).df0(abstractC1080560eE23);
                if (c1081740eFwDf0 != null) {
                    MultiElementSpecImplKt.element(this, c1081740eFwDf0);
                }
                MultiElementSpecImplKt.element(this, new C1083020eI0(abstractC1080560eE23));
            }
        });
        final AbstractC1080560eE2 abstractC1080560eE24 = (AbstractC1080560eE2) getLayeredElementContext();
        registerLayer(new LayerSpecImpl(abstractC1080560eE24) { // from class: X.0eC1
            {
                super(abstractC1080560eE24);
                MultiElementSpecImpl.placeholderElement$default(this, R.id.h5d, null, 2, null);
                MultiElementSpecImplKt.element(this, R.id.bwl);
                MultiElementSpecImplKt.element(this, R.id.bwj);
                MultiElementSpecImplKt.element(this, R.id.ysi);
                MultiElementSpecImplKt.element(this, R.id.kv1);
                MultiElementSpecImpl.placeholderElement$default(this, R.id.qjn, null, 2, null);
                MultiElementSpecImplKt.element(this, R.id.o1w);
                MultiElementSpecImpl.placeholderElement$default(this, R.id.kve, null, 2, null);
                MultiElementSpecImpl.placeholderElement$default(this, R.id.pbp, null, 2, null);
                MultiElementSpecImpl.placeholderElement$default(this, R.id.j7j, null, 2, null);
                placeholderElement(R.id.viewer_wishes_container, AFwS254S0000000_17.get$arr$(240));
                MultiElementSpecImplKt.element(this, R.id.wig);
                MultiElementSpecImplKt.groupableElement(this, R.id.kw3, AFwS254S0000000_17.get$arr$(241));
                C1079350eC5.LIZ(this, R.id.pve, AFwS254S0000000_17.get$arr$(242));
                C1079350eC5.LIZ(this, R.id.uoc, AFwS254S0000000_17.get$arr$(243));
                C1079090eBf c1079090eBf = new C1079090eBf(abstractC1080560eE24);
                c1079090eBf.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(C1079590eCT.LIZ), Integer.valueOf(C1079350eC5.LJFF), Integer.valueOf(C1079350eC5.LJII)));
                registerElement(c1079090eBf);
                C1079350eC5.LIZ(this, R.id.g_e, AFwS254S0000000_17.get$arr$(244));
                MultiElementSpecImplKt.groupableElement(this, R.id.gf3, AFwS254S0000000_17.get$arr$(245));
                C1079350eC5.LIZ(this, R.id.n5o, AFwS254S0000000_17.get$arr$(246));
                C1079350eC5.LIZ(this, R.id.n7j, AFwS254S0000000_17.get$arr$(247));
                C1079350eC5.LIZ(this, R.id.mw2, AFwS254S0000000_17.get$arr$(237));
                MultiElementSpecImpl.placeholderElement$default(this, R.id.q6g, null, 2, null);
                registerElement(new C1079330eC3(R.id.mxm));
                MultiElementSpecImplKt.groupableElement(this, R.id.b_v, AFwS254S0000000_17.get$arr$(238));
                final ElementSpecImpl elementSpecImpl = new ElementSpecImpl(R.id.jrr);
                elementSpecImpl.addSceneObserver(new DataChannelSceneObserver<Boolean, FirstFrameChannelEvent>() { // from class: X.0eBj
                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<FirstFrameChannelEvent> getType() {
                        return FirstFrameChannelEvent.class;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool) {
                        if (bool.booleanValue()) {
                            constraintProperty.visibility(8);
                        }
                    }
                });
                elementSpecImpl.addSceneObserver(new DataChannelSceneObserver<C0IMR, VideoOrientationChangeChannel>() { // from class: X.0eBp
                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<VideoOrientationChangeChannel> getType() {
                        return VideoOrientationChangeChannel.class;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C0IMR c0imr) {
                        constraintProperty.removeConstraints(4);
                        constraintProperty.removeConstraints(3);
                        if (c0imr.LIZ()) {
                            constraintProperty.connect(4, R.id.video_bottom_guideline, 3, 0);
                        } else {
                            constraintProperty.connect(3, 0, 3, (int) C497740JfY.LIZIZ(100.0f));
                        }
                        constraintProperty.apply();
                    }
                });
                elementSpecImpl.addSceneObserver(new DataChannelSceneObserver<Boolean, KeyboardStatusChannel>() { // from class: X.0eC6
                    public boolean LIZ;

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<KeyboardStatusChannel> getType() {
                        return KeyboardStatusChannel.class;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(true);
                    }

                    @Override // com.bytedance.ies.sdk.widgets.SceneObserver
                    public final void dispose(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty) {
                        super.dispose(layeredElementContext, constraintProperty);
                        if (this.LIZ) {
                            abstractC1080560eE24.upElement(elementSpecImpl.getId());
                            this.LIZ = false;
                        }
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool) {
                        boolean zBooleanValue = bool.booleanValue();
                        if (constraintProperty.visibility() == 0) {
                            if (zBooleanValue) {
                                if (!this.LIZ) {
                                    abstractC1080560eE24.downElement(elementSpecImpl.getId());
                                    this.LIZ = true;
                                    return;
                                }
                                return;
                            }
                            if (!this.LIZ) {
                                return;
                            }
                            abstractC1080560eE24.upElement(elementSpecImpl.getId());
                            this.LIZ = false;
                        }
                    }
                });
                ElementSpecImplKt.onAttach(elementSpecImpl, new AwS596S0100000_17(abstractC1080560eE24, 542));
                registerElement(elementSpecImpl);
                placeholderElement(R.id.io_, new AwS383S0200000_17(this, abstractC1080560eE24, 97));
                C1079350eC5.LIZ(this, R.id.m21, AFwS254S0000000_17.get$arr$(239));
            }

            @Override // com.bytedance.ies.sdk.widgets.MultiElementSpecImpl
            public final boolean enableWidgetPlaceholderOpt(int i) {
                if (i == R.id.h5d) {
                    return WidgetPlaceholderOptSetting.enableEndWidgetContainerOpt();
                }
                if (i == R.id.qjn) {
                    return WidgetPlaceholderOptSetting.enablePkContainerOpt();
                }
                if (i == R.id.pbp) {
                    return WidgetPlaceholderOptSetting.enableNormalInteractWindowContainerOpt();
                }
                if (i == R.id.pve) {
                    return WidgetPlaceholderOptSetting.enableOthersLikeWidgetContainerOpt();
                }
                if (i == R.id.uoc) {
                    return WidgetPlaceholderOptSetting.enableSelfLikeWidgetContainerOpt();
                }
                if (i == R.id.g_e) {
                    return WidgetPlaceholderOptSetting.enableDrawGuessCanvasWidgetContainerOpt();
                }
                if (i == R.id.n5o) {
                    return WidgetPlaceholderOptSetting.enableLiveRoomStickerContainerOpt();
                }
                if (i == R.id.mw2) {
                    return WidgetPlaceholderOptSetting.enableLiveDecorationContainerOpt();
                }
                if (i == R.id.io_) {
                    return WidgetPlaceholderOptSetting.enableFullVideoLayoutOpt();
                }
                if (i == R.id.m21) {
                    return WidgetPlaceholderOptSetting.enableKaraokeHoverBallContainerOpt();
                }
                if (i == R.id.q6g) {
                    return WidgetPlaceholderOptSetting.enablePcsAudienceDslDecoration();
                }
                return false;
            }
        });
        final C1080550eE1 c1080550eE1 = (C1080550eE1) getLayeredElementContext();
        registerLayer(new LayerSpecImpl(c1080550eE1) { // from class: X.0eCZ
            {
                super(c1080550eE1);
                MultiElementSpecImplKt.element(this, R.id.kwg);
                if (!WidgetPlaceholderOptSetting.enableBarrageLayoutOpt()) {
                    C1079330eC3 c1079330eC3 = new C1079330eC3(R.id.bss);
                    c1079330eC3.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(C1079350eC5.LIZJ), Integer.valueOf(C1079350eC5.LIZLLL)));
                    registerElement(c1079330eC3);
                }
                if (!WidgetPlaceholderOptSetting.enableEcBarrageLayoutOpt()) {
                    int i = C1079350eC5.LIZ;
                    registerElement(new C1079330eC3(R.id.gf0));
                }
                MultiElementSpecImplKt.groupableElement(this, R.id.sfo, new AwS596S0100000_17(c1080550eE1, 518));
                MultiElementSpecImplKt.groupableElement(this, R.id.x_multi_tab_container, AFwS254S0000000_17.get$arr$(197));
                MultiElementSpecImplKt.groupableElement(this, R.id.o_c, new AwS596S0100000_17(c1080550eE1, 509));
                MultiElementSpecImplKt.groupableElement(this, R.id.n8i, AFwS254S0000000_17.get$arr$(205));
                MultiElementSpecImplKt.groupableElement(this, R.id.qhj, AFwS254S0000000_17.get$arr$(206));
                MultiElementSpecImplKt.groupableElement(this, R.id.sme, new AwS596S0100000_17(c1080550eE1, 512));
                MultiElementSpecImplKt.groupableElement(this, R.id.n2m, AFwS254S0000000_17.get$arr$(208));
                MultiElementSpecImplKt.groupableElement(this, R.id.myj, AFwS254S0000000_17.get$arr$(209));
                MultiElementSpecImplKt.groupableElement(this, R.id.g_h, AFwS254S0000000_17.get$arr$(195));
                MultiElementSpecImplKt.groupableElement(this, R.id.f814ule, new AwS596S0100000_17(c1080550eE1, 499));
                MultiElementSpecImplKt.groupableElement(this, R.id.sup, new AwS596S0100000_17(c1080550eE1, 501));
                MultiElementSpecImplKt.groupableElement(this, R.id.mmt, new AwS596S0100000_17(c1080550eE1, 502));
                MultiElementSpecImplKt.groupableElement(this, R.id.ukr, new AwS596S0100000_17(c1080550eE1, 503));
                LiveInteractViewRemoveSettingV2 liveInteractViewRemoveSettingV2 = LiveInteractViewRemoveSettingV2.INSTANCE;
                if (!liveInteractViewRemoveSettingV2.isViewRemoved(R.id.cga)) {
                    MultiElementSpecImplKt.groupableElement(this, R.id.cga, AFwS254S0000000_17.get$arr$(199));
                }
                if (!liveInteractViewRemoveSettingV2.isViewRemoved(R.id.fce)) {
                    MultiElementSpecImplKt.groupableElement(this, R.id.fce, new AwS596S0100000_17(c1080550eE1, 504));
                }
                if (!liveInteractViewRemoveSettingV2.isViewRemoved(R.id.fdx)) {
                    MultiElementSpecImplKt.groupableElement(this, R.id.fdx, new AwS596S0100000_17(c1080550eE1, 505));
                }
                if (!liveInteractViewRemoveSettingV2.isViewRemoved(R.id.weq)) {
                    MultiElementSpecImplKt.groupableElement(this, R.id.weq, new AwS596S0100000_17(c1080550eE1, 506));
                }
                if (!liveInteractViewRemoveSettingV2.isViewRemoved(R.id.qfy)) {
                    MultiElementSpecImplKt.groupableElement(this, R.id.qfy, AFwS254S0000000_17.get$arr$(204));
                }
                MultiElementSpecImplKt.groupableElement(this, R.id.ik5, new AwS596S0100000_17(c1080550eE1, 508));
                MultiElementSpecImplKt.groupableElement(this, R.id.jmj, new AwS596S0100000_17(c1080550eE1, 510));
                if (!liveInteractViewRemoveSettingV2.isViewRemoved(R.id.mxe)) {
                    MultiElementSpecImplKt.groupableElement(this, R.id.mxe, new AwS596S0100000_17(c1080550eE1, 511));
                }
                if (!liveInteractViewRemoveSettingV2.isViewRemoved(R.id.wqh)) {
                    MultiElementSpecImplKt.groupableElement(this, R.id.wqh, AFwS254S0000000_17.get$arr$(207));
                }
                GroupableElementSpecImpl groupableElementSpecImpl = new GroupableElementSpecImpl() { // from class: X.0eCa
                    public final C01GW LL = C292401Bi.LIZ(AFwS195S0000000_9.get$arr$(519));
                };
                groupableElementSpecImpl.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(C1079350eC5.LIZ), Integer.valueOf(C1079590eCT.LIZIZ), Integer.valueOf(C1079320eC2.LIZ), Integer.valueOf(C1079430eCD.LJIIIIZZ), Integer.valueOf(C1079350eC5.LJIIJJI)));
                if (LiveConflictAvoidInputAnimOpt.INSTANCE.enable()) {
                    groupableElementSpecImpl.bindGroup(C1079590eCT.LIZJ);
                }
                registerElement(groupableElementSpecImpl);
                MultiElementSpecImplKt.groupableElement(this, R.id.wkm, new AwS596S0100000_17(c1080550eE1, 513));
                MultiElementSpecImplKt.groupableElement(this, R.id.q0u, new AwS596S0100000_17(c1080550eE1, 514));
                MultiElementSpecImplKt.groupableElement(this, R.id.wiw, new AwS596S0100000_17(c1080550eE1, 515));
                MultiElementSpecImplKt.groupableElement(this, R.id.ieq, new AwS596S0100000_17(c1080550eE1, 516));
                MultiElementSpecImplKt.groupableElement(this, R.id.ixx, new AwS596S0100000_17(c1080550eE1, 517));
                MultiElementSpecImplKt.groupableElement(this, R.id.ieo, new AwS596S0100000_17(c1080550eE1, 519));
                MultiElementSpecImplKt.groupableElement(this, R.id.n20, AFwS254S0000000_17.get$arr$(210));
                MultiElementSpecImplKt.groupableElement(this, R.id.n3l, AFwS254S0000000_17.get$arr$(211));
                C1079330eC3 c1079330eC32 = new C1079330eC3(R.id.wu1);
                c1079330eC32.bindGroups(Collections.singletonList(Integer.valueOf(C1079350eC5.LIZLLL)));
                ElementSpecImplKt.onAttach(c1079330eC32, AFwS254S0000000_17.get$arr$(212));
                registerElement(c1079330eC32);
                C1079350eC5.LIZ(this, R.id.kv5, AFwS254S0000000_17.get$arr$(213));
                C1079350eC5.LIZ(this, R.id.dc9, AFwS254S0000000_17.get$arr$(214));
                C1079350eC5.LIZ(this, R.id.ddh, AFwS254S0000000_17.get$arr$(194));
                MultiElementSpecImplKt.groupableElement(this, R.id.vku, new AwS596S0100000_17(c1080550eE1, 498));
                MultiElementSpecImplKt.groupableElement(this, R.id.ea1, new AwS596S0100000_17(c1080550eE1, 500));
                MultiElementSpecImplKt.groupableElement(this, R.id.dhy, AFwS254S0000000_17.get$arr$(196));
                MultiElementSpecImplKt.groupableElement(this, R.id.kw2, AFwS254S0000000_17.get$arr$(198));
                MultiElementSpecImplKt.groupableElement(this, R.id.dhx, AFwS254S0000000_17.get$arr$(200));
                MultiElementSpecImplKt.groupableElement(this, R.id.gew, AFwS254S0000000_17.get$arr$(201));
                MultiElementSpecImplKt.groupableElement(this, R.id.gey, AFwS254S0000000_17.get$arr$(202));
                MultiElementSpecImplKt.groupableElement(this, R.id.video_animate_container, AFwS254S0000000_17.get$arr$(203));
                MultiElementSpecImplKt.groupableElement(this, R.id.isf, new AwS596S0100000_17(c1080550eE1, 507));
            }

            @Override // com.bytedance.ies.sdk.widgets.MultiElementSpecImpl
            public final boolean enableWidgetPlaceholderOpt(int i) {
                if (i == R.id.kv5) {
                    return WidgetPlaceholderOptSetting.enableInteractCutShortWidgetContainerOpt();
                }
                if (i == R.id.dc9) {
                    return WidgetPlaceholderOptV2Setting.enableCaptionDeleteTopOpt();
                }
                if (i == R.id.ddh) {
                    return WidgetPlaceholderOptV2Setting.enableCaptionTextOpt();
                }
                return false;
            }
        });
        final AbstractC1080560eE2 abstractC1080560eE25 = (AbstractC1080560eE2) getLayeredElementContext();
        registerLayer(new LayerSpecImpl(abstractC1080560eE25) { // from class: X.0eC7
            /* JADX WARN: Type inference failed for: r2v0, types: [X.0eCk] */
            {
                super(abstractC1080560eE25);
                placeholderElement(R.id.vit, new AwS596S0100000_17(new C1080280eDa(abstractC1080560eE25) { // from class: X.0eCk
                    @Override // X.C1080280eDa
                    public final void LIZJ(C0KVO c0kvo, ConstraintProperty constraintProperty, LayeredElementContext layeredElementContext) {
                        boolean z;
                        AbstractC1080290eDb abstractC1080290eDb = c0kvo.LIZJ;
                        if (abstractC1080290eDb instanceof C475530Ikp) {
                            EnumC475520Iko enumC475520Iko = ((C475530Ikp) abstractC1080290eDb).LIZJ;
                            if (enumC475520Iko != EnumC475520Iko.NEARBY && enumC475520Iko != EnumC475520Iko.SKYLIGHT_WITH_TITLE) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (c0kvo.LIZ && !Intrinsics.LJFF(layeredElementContext.getDataChannel().gg0(C750250Tbr.class), Boolean.TRUE) && !z) {
                                return;
                            }
                        }
                        super.LIZJ(c0kvo, constraintProperty, layeredElementContext);
                    }

                    @Override // X.C1080280eDa, com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final /* bridge */ /* synthetic */ void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C0KVO c0kvo) {
                        LIZJ(c0kvo, constraintProperty, layeredElementContext);
                    }
                }, abstractC1080560eE25, 491));
                placeholderElement(R.id.e2y, new AwS596S0100000_17(abstractC1080560eE25, 496));
                if (!WidgetPlaceholderOptSetting.enableBackWidgetContainerOpt() && !LiveTopOneFixSetting.INSTANCE.enable() && !LiveInteractViewRemoveSettingV2.INSTANCE.isViewRemoved(R.id.bnr)) {
                    C1079330eC3 c1079330eC3 = new C1079330eC3(R.id.bnr);
                    c1079330eC3.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(C1079350eC5.LJIIIZ), Integer.valueOf(C1079350eC5.LIZLLL)));
                    registerElement(c1079330eC3);
                }
                C1079350eC5.LIZ(this, R.id.ba7, AFwS254S0000000_17.get$arr$(188));
                C1079350eC5.LIZ(this, R.id.fas, AFwS254S0000000_17.get$arr$(189));
                placeholderElement(R.id.user_info_container, AFwS254S0000000_17.get$arr$(190));
                C1079350eC5.LIZ(this, R.id.mo8, AFwS254S0000000_17.get$arr$(191));
                MultiElementSpecImplKt.groupableElement(this, R.id.ght, new AwS596S0100000_17(abstractC1080560eE25, 497));
                C1079350eC5.LIZ(this, R.id.sqk, AFwS254S0000000_17.get$arr$(192));
                LiveInteractViewRemoveSettingV2 liveInteractViewRemoveSettingV2 = LiveInteractViewRemoveSettingV2.INSTANCE;
                if (!liveInteractViewRemoveSettingV2.isViewRemoved(R.id.sql)) {
                    C1079350eC5.LIZ(this, R.id.sql, AFwS254S0000000_17.get$arr$(180));
                }
                C1079350eC5.LIZ(this, R.id.yci, new AwS596S0100000_17(abstractC1080560eE25, 486));
                C1079350eC5.LIZ(this, R.id.wish_list_container, new AwS596S0100000_17(abstractC1080560eE25, 487));
                C1079350eC5.LIZ(this, R.id.v97, new AwS596S0100000_17(abstractC1080560eE25, 488));
                C1079350eC5.LIZ(this, R.id.xn2, AFwS254S0000000_17.get$arr$(181));
                C1079350eC5.LIZ(this, R.id.yjr, AFwS254S0000000_17.get$arr$(182));
                C1079350eC5.LIZ(this, R.id.bpl, AFwS254S0000000_17.get$arr$(183));
                C1079350eC5.LIZ(this, R.id.v96, AFwS254S0000000_17.get$arr$(184));
                if (!liveInteractViewRemoveSettingV2.isViewRemoved(R.id.irl)) {
                    C1079350eC5.LIZ(this, R.id.irl, new AwS596S0100000_17(abstractC1080560eE25, 489));
                }
                C1079350eC5.LIZ(this, R.id.ebi, new AwS596S0100000_17(abstractC1080560eE25, 490));
                C1079350eC5.LIZ(this, R.id.mlc, AFwS254S0000000_17.get$arr$(185));
                C1079350eC5.LIZ(this, R.id.tml, new AwS596S0100000_17(abstractC1080560eE25, 492));
                C1079350eC5.LIZ(this, R.id.cef, new AwS596S0100000_17(abstractC1080560eE25, 493));
                if (!liveInteractViewRemoveSettingV2.isViewRemoved(R.id.ceh)) {
                    C1079350eC5.LIZ(this, R.id.ceh, new AwS596S0100000_17(abstractC1080560eE25, 494));
                }
                if (!liveInteractViewRemoveSettingV2.isViewRemoved(R.id.cei)) {
                    C1079350eC5.LIZ(this, R.id.cei, new AwS596S0100000_17(abstractC1080560eE25, 495));
                }
                MultiElementSpecImplKt.groupableElement(this, R.id.iq0, AFwS254S0000000_17.get$arr$(186));
                MultiElementSpecImplKt.groupableElement(this, R.id.vl5, AFwS254S0000000_17.get$arr$(187));
            }

            @Override // com.bytedance.ies.sdk.widgets.MultiElementSpecImpl
            public final boolean enableWidgetPlaceholderOpt(int i) {
                if (i == R.id.vit) {
                    return WidgetPlaceholderOptSetting.enableSkylightSwitchWidgetContainerOpt();
                }
                if (i == R.id.e2y) {
                    return WidgetPlaceholderOptSetting.enableCloseWidgetContainerOpt();
                }
                if (i == R.id.ba7) {
                    return WidgetPlaceholderOptSetting.enableAudienceRankListOpt();
                }
                if (i == R.id.fas) {
                    return WidgetPlaceholderOptSetting.enableCumulativeWatchAudienceOpt();
                }
                if (i == R.id.user_info_container) {
                    return WidgetPlaceholderOptSetting.enableUserInfoContainerOpt();
                }
                if (i == R.id.mo8) {
                    return WidgetPlaceholderOptSetting.enableLikeUserInfoAnimContainerOpt();
                }
                if (i == R.id.yjr) {
                    return WidgetPlaceholderOptSetting.enableTreasureBoxWidgetContainerOpt();
                }
                if (i == R.id.tqe) {
                    return WidgetPlaceholderOptV2Setting.enableDonationStickerOpt();
                }
                if (i == R.id.jgy) {
                    return WidgetPlaceholderOptV2Setting.enableHashTagOpt();
                }
                if (i == R.id.sqk) {
                    return WidgetPlaceholderOptV2Setting.enableRank1Opt();
                }
                if (i == R.id.sql) {
                    return WidgetPlaceholderOptV2Setting.enableRank2Opt();
                }
                if (i == R.id.g_q) {
                    return WidgetPlaceholderOptV2Setting.enableDrawerEntranceOpt();
                }
                if (i == R.id.yci) {
                    return WidgetPlaceholderOptV2Setting.enableTopRightBannerOpt();
                }
                if (i == R.id.wish_list_container) {
                    return WidgetPlaceholderOptV2Setting.enableWishListOpt();
                }
                if (i == R.id.v97) {
                    return WidgetPlaceholderOptV2Setting.enableShortTouchOpt();
                }
                if (i == R.id.bpl) {
                    return WidgetPlaceholderOptV2Setting.enableBackupTipOpt();
                }
                if (i == R.id.v96) {
                    return WidgetPlaceholderOptV2Setting.enableShortTouchPreviewWidgetOpt();
                }
                if (i == R.id.mlc) {
                    return WidgetPlaceholderOptV2Setting.enableLeftToolbarOpt();
                }
                if (i == R.id.cef) {
                    return WidgetPlaceholderOptV2Setting.enableBottomLeftLinkHostOpt();
                }
                if (i == R.id.irl) {
                    return WidgetPlaceholderOptV2Setting.enableGamePartnershipEntranceOpt();
                }
                if (i == R.id.ceh) {
                    return WidgetPlaceholderOptV2Setting.enableBottomLeftSlotOpt();
                }
                if (i == R.id.cei) {
                    return WidgetPlaceholderOptV2Setting.enableSubscribeIconLeftOpt();
                }
                if (i == R.id.ebi) {
                    return WidgetPlaceholderOptV2Setting.enableCommentInputOpt();
                }
                if (i == R.id.tml) {
                    return WidgetPlaceholderOptV2Setting.enableRightToolbarOpt();
                }
                return false;
            }
        });
        final ?? layeredElementContext = getLayeredElementContext();
        registerLayer(new LayerSpecImpl(layeredElementContext) { // from class: X.0eC8
            {
                C1079350eC5.LIZ(this, R.id.fgl, null);
                C1079350eC5.LIZ(this, R.id.mw7, null);
                placeholderElement(R.id.kv7, AFwS254S0000000_17.get$arr$(221));
                placeholderElement(R.id.ir1, AFwS254S0000000_17.get$arr$(222));
                MultiElementSpecImplKt.element(this, R.id.n3_);
                MultiElementSpecImpl.placeholderElement$default(this, R.id.wif, null, 2, null);
            }

            @Override // com.bytedance.ies.sdk.widgets.MultiElementSpecImpl
            public final boolean enableWidgetPlaceholderOpt(int i) {
                if (i == R.id.kv7) {
                    return WidgetPlaceholderOptSetting.enableInteractDebugInfoContainerOpt();
                }
                if (i == R.id.ir1) {
                    return WidgetPlaceholderOptSetting.enableGameLinkmicInfoContainerOpt();
                }
                if (i == R.id.wif) {
                    return WidgetPlaceholderOptSetting.enableSubscribeMaskLayerOpt();
                }
                if (i == R.id.fgl) {
                    return WidgetPlaceholderOptV2Setting.enableDebugInfoOpt();
                }
                if (i == R.id.mw7) {
                    return WidgetPlaceholderOptV2Setting.enableLiveDetectOpt();
                }
                return false;
            }
        });
        final AbstractC1080560eE2 abstractC1080560eE26 = (AbstractC1080560eE2) getLayeredElementContext();
        registerLayer(new LayerSpecImpl(abstractC1080560eE26) { // from class: X.0eC4
            {
                super(abstractC1080560eE26);
                MultiElementSpecImplKt.groupableElement(this, R.id.vk_, AFwS254S0000000_17.get$arr$(227));
                MultiElementSpecImplKt.element(this, R.id.py0);
                MultiElementSpecImplKt.groupableElement(this, R.id.s86, AFwS254S0000000_17.get$arr$(228));
                placeholderElement(R.id.ioe, AFwS254S0000000_17.get$arr$(229));
                new DataChannelSceneObserver<C520220Kai, ProgrammedLiveMenuVisibilityChannel>() { // from class: X.0eBs
                    public final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper(), new C1151670g4j(this, 10));

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<ProgrammedLiveMenuVisibilityChannel> getType() {
                        return ProgrammedLiveMenuVisibilityChannel.class;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.SceneObserver
                    public final void dispose(LayeredElementContext layeredElementContext2, ConstraintProperty constraintProperty) {
                        super.dispose(layeredElementContext2, constraintProperty);
                        this.LIZ.removeCallbacksAndMessages(null);
                        constraintProperty.connect(7, R.id.e2y, 6, (int) C497740JfY.LIZIZ(28.0f));
                        constraintProperty.apply();
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext2, ConstraintProperty constraintProperty, C520220Kai c520220Kai) {
                        if (c520220Kai.LIZ) {
                            BPEAHandler bPEAHandler = this.LIZ;
                            Message message = new Message();
                            message.what = 0;
                            message.obj = constraintProperty;
                            C786410Ut5.LJLJLJ(bPEAHandler, message, 300L);
                            return;
                        }
                        this.LIZ.removeMessages(0);
                        constraintProperty.connect(7, R.id.e2y, 6, (int) C497740JfY.LIZIZ(28.0f));
                        constraintProperty.apply();
                    }
                };
                placeholderElement(R.id.s8f, AFwS254S0000000_17.get$arr$(230));
                C1079350eC5.LIZ(this, R.id.s8b, AFwS254S0000000_17.get$arr$(231));
                if (!LiveInteractViewRemoveSettingV2.INSTANCE.isViewRemoved(R.id.s8c)) {
                    placeholderElement(R.id.s8c, AFwS254S0000000_17.get$arr$(232));
                }
                placeholderElement(R.id.s8h, AFwS254S0000000_17.get$arr$(233));
                placeholderElement(R.id.oay, AFwS254S0000000_17.get$arr$(234));
                placeholderElement(R.id.s8_, new AwS596S0100000_17(abstractC1080560eE26, 535));
                C1079350eC5.LIZ(this, R.id.j2h, AFwS254S0000000_17.get$arr$(223));
                C1079330eC3 c1079330eC3 = new C1079330eC3(R.id.n4a);
                c1079330eC3.bindGroups(C1697810uHb.LJIIJJI(Integer.valueOf(C1079430eCD.LJIIIZ), Integer.valueOf(C1079350eC5.LIZLLL)));
                registerElement(c1079330eC3);
                C1079350eC5.LIZ(this, R.id.ye6, AFwS254S0000000_17.get$arr$(224));
                C1079350eC5.LIZ(this, R.id.j5k, AFwS254S0000000_17.get$arr$(225));
                C1079350eC5.LIZ(this, R.id.mnu, AFwS254S0000000_17.get$arr$(226));
                MultiElementSpecImplKt.element(this, R.id.mxv);
            }

            @Override // com.bytedance.ies.sdk.widgets.MultiElementSpecImpl
            public final boolean enableWidgetPlaceholderOpt(int i) {
                if (i == R.id.s8f) {
                    return WidgetPlaceholderOptSetting.enableProgrammedLiveTitleOpt();
                }
                if (i == R.id.j5k) {
                    return WidgetPlaceholderOptSetting.enableGreetingAnimWidgetOpt();
                }
                if (i == R.id.s8b) {
                    return WidgetPlaceholderOptV2Setting.enableProgrammedLiveOnlineAudienceWhenMenuCollapseOpt();
                }
                if (i == R.id.s8c) {
                    return WidgetPlaceholderOptV2Setting.enableProgrammedLiveOnlineAudienceWhenMenuExpandOpt();
                }
                if (i == R.id.s8h) {
                    return WidgetPlaceholderOptV2Setting.enableProgrammedLiveUserInfoOpt();
                }
                if (i == R.id.oay) {
                    return WidgetPlaceholderOptV2Setting.enableMicRoomInfoOpt();
                }
                if (i == R.id.s8_) {
                    return WidgetPlaceholderOptV2Setting.enableProgrammedLiveMenuOpt();
                }
                if (i == R.id.j2h) {
                    return WidgetPlaceholderOptV2Setting.enableGlobalNotificationOpt();
                }
                if (i == R.id.ye6) {
                    return WidgetPlaceholderOptV2Setting.enableTopEffectOpt();
                }
                return false;
            }
        });
        final ?? layeredElementContext2 = getLayeredElementContext();
        registerLayer(new LayerSpecImpl(layeredElementContext2) { // from class: X.0eFZ
            {
                super(layeredElementContext2);
                ElementSpecImpl elementSpecImpl = new ElementSpecImpl(R.id.sfs);
                ElementSpecImplKt.onAttach(elementSpecImpl, new AwS596S0100000_17(layeredElementContext2, 525));
                elementSpecImpl.addSceneObserver(new DataChannelSceneObserver<C1081600eFi, MultiLiveRTCLayoutChannel>() { // from class: X.0eFa
                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<MultiLiveRTCLayoutChannel> getType() {
                        return MultiLiveRTCLayoutChannel.class;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext3, ConstraintProperty constraintProperty, C1081600eFi c1081600eFi) {
                        C1081600eFi c1081600eFi2 = c1081600eFi;
                        if (!C1081540eFc.LIZ(false)) {
                            C1081580eFg.LIZ(layeredElementContext3.getDataChannel(), constraintProperty, c1081600eFi2, null);
                        }
                    }
                });
                elementSpecImpl.addSceneObserver(new DataChannelSceneObserver<C938170aWN, VoiceChatLayoutChannel>() { // from class: X.0eFY
                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<VoiceChatLayoutChannel> getType() {
                        return VoiceChatLayoutChannel.class;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final /* bridge */ /* synthetic */ void onEvent(LayeredElementContext layeredElementContext3, ConstraintProperty constraintProperty, C938170aWN c938170aWN) {
                    }
                });
                elementSpecImpl.addSceneObserver(new DataChannelSceneObserver<C956380azk, LinkCrossRoomStateChangeEvent>() { // from class: X.0eFb
                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<LinkCrossRoomStateChangeEvent> getType() {
                        return LinkCrossRoomStateChangeEvent.class;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext3, ConstraintProperty constraintProperty, C956380azk c956380azk) {
                        C956380azk c956380azk2 = c956380azk;
                        if (!C1081540eFc.LIZ(false)) {
                            C1081580eFg.LIZ(layeredElementContext3.getDataChannel(), constraintProperty, null, c956380azk2);
                        }
                    }
                });
                registerElement(elementSpecImpl);
            }
        });
        LIZLLL(c1083340eIW);
        finishRegistration();
    }
}
