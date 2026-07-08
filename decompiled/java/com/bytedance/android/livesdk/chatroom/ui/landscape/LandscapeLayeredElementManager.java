package com.bytedance.android.livesdk.chatroom.ui.landscape;

import X.C1079990eD7;
import X.C1080530eDz;
import X.C1083100eI8;
import X.C1083340eIW;
import Y.ALAdapterS12S0200000_17;
import Y.ALAdapterS13S0100000_17;
import Y.ALAdapterS4S0200000_7;
import Y.AUListenerS266S0100000_17;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.layer.BaseLayeredElementManager;
import com.bytedance.android.livesdk.LandscapeInteractionMarginData;
import com.bytedance.android.livesdk.dataChannel.KeyboardStatusChannel;
import com.bytedance.android.livesdk.dataChannel.ProgrammedLiveMenuVisibilityChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkLinkMicLandscapeSetting;
import com.bytedance.android.livesdk.livesetting.performance.WidgetPlaceholderOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveGameMomentQuickCommentWatchliveSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.ElementSpec;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.LayerSpecImpl;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.MultiElementSpecImpl;
import com.bytedance.ies.sdk.widgets.MultiElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.RxBusSceneObserver;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public class LandscapeLayeredElementManager extends BaseLayeredElementManager<C1080530eDz> {
    @Override // com.bytedance.ies.sdk.widgets.LayeredElementManager, com.bytedance.ies.sdk.widgets.recycleelement.IRecycleLayeredElementManager
    public final boolean needReuse() {
        return true;
    }

    @Override // com.bytedance.android.live.layer.BaseLayeredElementManager, com.bytedance.ies.sdk.widgets.LayeredElementManager, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LIZLLL(C1083340eIW c1083340eIW) {
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.p1_, R.id.p1a, R.id.user_info_container, R.id.dnp, R.id.bn8, R.id.wu0, R.id.uzz);
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.hgs, R.id.hhm, R.id.oay, R.id.ba7, R.id.sqk, R.id.sql, R.id.wish_list_container, R.id.v97, R.id.s8h);
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.btk, R.id.v97, R.id.wish_list_container);
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.btd, R.id.sqk, R.id.sql, R.id.ba7);
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.m51, R.id.sqk, R.id.sql, R.id.ba7, R.id.s8a);
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.m52, R.id.sqk, R.id.sql, R.id.ba7, R.id.s8a);
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.s8g, R.id.s8f, R.id.p1a);
        C1083100eI8.fixReferencedIds(c1083340eIW, R.id.o_e, R.id.ea1, R.id.isf);
    }

    @Override // com.bytedance.android.live.layer.BaseLayeredElementManager, com.bytedance.ies.sdk.widgets.LayeredElementManager, com.bytedance.ies.sdk.widgets.recycleelement.IRecycleLayeredElementManager
    public final void reuse(Fragment fragment, DataChannel dataChannel) {
        super.reuse(fragment, dataChannel);
        LIZLLL(this.mLayeredConstraintLayout);
        setGroupReferenceIds();
    }

    @Override // com.bytedance.ies.sdk.widgets.LayeredElementManager
    public final LayeredElementContext onCreateLayeredElementContext(Context context, ViewGroup viewGroup, DataChannel dataChannel) {
        return new C1080530eDz(context, viewGroup, dataChannel, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.bytedance.ies.sdk.widgets.LayeredElementContext] */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.bytedance.ies.sdk.widgets.LayeredElementContext] */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.bytedance.ies.sdk.widgets.LayeredElementContext] */
    public LandscapeLayeredElementManager(Context context, Fragment fragment, C1083340eIW c1083340eIW, DataChannel dataChannel) {
        super(context, fragment, c1083340eIW, dataChannel);
        final C1080530eDz c1080530eDz = (C1080530eDz) getLayeredElementContext();
        registerGroups(new MultiElementSpecImpl<C1079990eD7>(c1080530eDz) { // from class: X.0eD7
            {
                super(c1080530eDz);
                ElementSpecImpl elementSpecImpl = new ElementSpecImpl(C1080000eD8.LIZ);
                elementSpecImpl.addSceneObserver(new RxBusSceneObserver<C473120Igw>(0, new AwS596S0100000_17(c1080530eDz, 378)) { // from class: X.0eD3
                    public final int LIZ;
                    public final Function1<Boolean, Unit> LIZIZ;
                    public ValueAnimator LIZJ;
                    public boolean LIZLLL;

                    @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
                    public final Class<C473120Igw> getType() {
                        return C473120Igw.class;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.LIZ = i;
                        this.LIZIZ = function1;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.SceneObserver
                    public final void dispose(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty) {
                        super.dispose(layeredElementContext, constraintProperty);
                        this.LIZLLL = false;
                        ValueAnimator valueAnimator = this.LIZJ;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        constraintProperty.alpha(1.0f);
                        constraintProperty.translationY(0.0f);
                    }

                    @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C473120Igw c473120Igw) {
                        C473120Igw c473120Igw2 = c473120Igw;
                        boolean z = c473120Igw2.LIZ.get(this.LIZ);
                        if (z != this.LIZLLL) {
                            this.LIZLLL = z;
                            Function1<Boolean, Unit> function1 = this.LIZIZ;
                            if (function1 != null) {
                                function1.invoke(Boolean.valueOf(z));
                            }
                            ValueAnimator valueAnimator = this.LIZJ;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            ValueAnimator valueAnimator2 = this.LIZJ;
                            if (valueAnimator2 != null) {
                                valueAnimator2.removeAllListeners();
                            }
                            ValueAnimator valueAnimator3 = this.LIZJ;
                            if (valueAnimator3 != null) {
                                valueAnimator3.removeAllUpdateListeners();
                            }
                            if (c473120Igw2.LIZJ) {
                                if (z) {
                                    constraintProperty.alpha(0.0f);
                                    constraintProperty.translationY(layeredElementContext.getContainer().getHeight());
                                    return;
                                } else {
                                    constraintProperty.alpha(1.0f);
                                    constraintProperty.translationY(0.0f);
                                    return;
                                }
                            }
                            if (this.LIZJ == null) {
                                ValueAnimator valueAnimator4 = new ValueAnimator();
                                valueAnimator4.setDuration(layeredElementContext.getAnimationDuration());
                                this.LIZJ = valueAnimator4;
                            }
                            if (z) {
                                ValueAnimator valueAnimator5 = this.LIZJ;
                                if (valueAnimator5 != null) {
                                    valueAnimator5.setFloatValues(constraintProperty.alpha(), 0.0f);
                                    valueAnimator5.addUpdateListener(new AUListenerS266S0100000_17(constraintProperty, 64));
                                    valueAnimator5.addListener(new ALAdapterS12S0200000_17(constraintProperty, layeredElementContext, 17));
                                }
                            } else {
                                ValueAnimator valueAnimator6 = this.LIZJ;
                                if (valueAnimator6 != null) {
                                    valueAnimator6.setFloatValues(constraintProperty.alpha(), 1.0f);
                                    valueAnimator6.addUpdateListener(new AUListenerS266S0100000_17(constraintProperty, 66));
                                    valueAnimator6.addListener(new ALAdapterS13S0100000_17(constraintProperty, 44));
                                }
                            }
                            ValueAnimator valueAnimator7 = this.LIZJ;
                            if (valueAnimator7 == null) {
                                return;
                            }
                            valueAnimator7.start();
                        }
                    }
                });
                registerElement(elementSpecImpl);
                ElementSpecImpl elementSpecImpl2 = new ElementSpecImpl(C1080000eD8.LIZIZ);
                elementSpecImpl2.addSceneObserver(new RxBusSceneObserver<C473120Igw>(2, new AwS596S0100000_17(c1080530eDz, 379)) { // from class: X.0eD3
                    public final int LIZ;
                    public final Function1<Boolean, Unit> LIZIZ;
                    public ValueAnimator LIZJ;
                    public boolean LIZLLL;

                    @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
                    public final Class<C473120Igw> getType() {
                        return C473120Igw.class;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.LIZ = i;
                        this.LIZIZ = function1;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.SceneObserver
                    public final void dispose(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty) {
                        super.dispose(layeredElementContext, constraintProperty);
                        this.LIZLLL = false;
                        ValueAnimator valueAnimator = this.LIZJ;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        constraintProperty.alpha(1.0f);
                        constraintProperty.translationY(0.0f);
                    }

                    @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C473120Igw c473120Igw) {
                        C473120Igw c473120Igw2 = c473120Igw;
                        boolean z = c473120Igw2.LIZ.get(this.LIZ);
                        if (z != this.LIZLLL) {
                            this.LIZLLL = z;
                            Function1<Boolean, Unit> function1 = this.LIZIZ;
                            if (function1 != null) {
                                function1.invoke(Boolean.valueOf(z));
                            }
                            ValueAnimator valueAnimator = this.LIZJ;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            ValueAnimator valueAnimator2 = this.LIZJ;
                            if (valueAnimator2 != null) {
                                valueAnimator2.removeAllListeners();
                            }
                            ValueAnimator valueAnimator3 = this.LIZJ;
                            if (valueAnimator3 != null) {
                                valueAnimator3.removeAllUpdateListeners();
                            }
                            if (c473120Igw2.LIZJ) {
                                if (z) {
                                    constraintProperty.alpha(0.0f);
                                    constraintProperty.translationY(layeredElementContext.getContainer().getHeight());
                                    return;
                                } else {
                                    constraintProperty.alpha(1.0f);
                                    constraintProperty.translationY(0.0f);
                                    return;
                                }
                            }
                            if (this.LIZJ == null) {
                                ValueAnimator valueAnimator4 = new ValueAnimator();
                                valueAnimator4.setDuration(layeredElementContext.getAnimationDuration());
                                this.LIZJ = valueAnimator4;
                            }
                            if (z) {
                                ValueAnimator valueAnimator5 = this.LIZJ;
                                if (valueAnimator5 != null) {
                                    valueAnimator5.setFloatValues(constraintProperty.alpha(), 0.0f);
                                    valueAnimator5.addUpdateListener(new AUListenerS266S0100000_17(constraintProperty, 64));
                                    valueAnimator5.addListener(new ALAdapterS12S0200000_17(constraintProperty, layeredElementContext, 17));
                                }
                            } else {
                                ValueAnimator valueAnimator6 = this.LIZJ;
                                if (valueAnimator6 != null) {
                                    valueAnimator6.setFloatValues(constraintProperty.alpha(), 1.0f);
                                    valueAnimator6.addUpdateListener(new AUListenerS266S0100000_17(constraintProperty, 66));
                                    valueAnimator6.addListener(new ALAdapterS13S0100000_17(constraintProperty, 44));
                                }
                            }
                            ValueAnimator valueAnimator7 = this.LIZJ;
                            if (valueAnimator7 == null) {
                                return;
                            }
                            valueAnimator7.start();
                        }
                    }
                });
                registerElement(elementSpecImpl2);
                ElementSpecImpl elementSpecImpl3 = new ElementSpecImpl(C1080000eD8.LIZJ);
                elementSpecImpl3.addSceneObserver(new RxBusSceneObserver<C473120Igw>(1, null) { // from class: X.0eD3
                    public final int LIZ;
                    public final Function1<Boolean, Unit> LIZIZ;
                    public ValueAnimator LIZJ;
                    public boolean LIZLLL;

                    @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
                    public final Class<C473120Igw> getType() {
                        return C473120Igw.class;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.LIZ = i;
                        this.LIZIZ = function1;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.SceneObserver
                    public final void dispose(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty) {
                        super.dispose(layeredElementContext, constraintProperty);
                        this.LIZLLL = false;
                        ValueAnimator valueAnimator = this.LIZJ;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        constraintProperty.alpha(1.0f);
                        constraintProperty.translationY(0.0f);
                    }

                    @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C473120Igw c473120Igw) {
                        C473120Igw c473120Igw2 = c473120Igw;
                        boolean z = c473120Igw2.LIZ.get(this.LIZ);
                        if (z != this.LIZLLL) {
                            this.LIZLLL = z;
                            Function1<Boolean, Unit> function1 = this.LIZIZ;
                            if (function1 != null) {
                                function1.invoke(Boolean.valueOf(z));
                            }
                            ValueAnimator valueAnimator = this.LIZJ;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            ValueAnimator valueAnimator2 = this.LIZJ;
                            if (valueAnimator2 != null) {
                                valueAnimator2.removeAllListeners();
                            }
                            ValueAnimator valueAnimator3 = this.LIZJ;
                            if (valueAnimator3 != null) {
                                valueAnimator3.removeAllUpdateListeners();
                            }
                            if (c473120Igw2.LIZJ) {
                                if (z) {
                                    constraintProperty.alpha(0.0f);
                                    constraintProperty.translationY(layeredElementContext.getContainer().getHeight());
                                    return;
                                } else {
                                    constraintProperty.alpha(1.0f);
                                    constraintProperty.translationY(0.0f);
                                    return;
                                }
                            }
                            if (this.LIZJ == null) {
                                ValueAnimator valueAnimator4 = new ValueAnimator();
                                valueAnimator4.setDuration(layeredElementContext.getAnimationDuration());
                                this.LIZJ = valueAnimator4;
                            }
                            if (z) {
                                ValueAnimator valueAnimator5 = this.LIZJ;
                                if (valueAnimator5 != null) {
                                    valueAnimator5.setFloatValues(constraintProperty.alpha(), 0.0f);
                                    valueAnimator5.addUpdateListener(new AUListenerS266S0100000_17(constraintProperty, 64));
                                    valueAnimator5.addListener(new ALAdapterS12S0200000_17(constraintProperty, layeredElementContext, 17));
                                }
                            } else {
                                ValueAnimator valueAnimator6 = this.LIZJ;
                                if (valueAnimator6 != null) {
                                    valueAnimator6.setFloatValues(constraintProperty.alpha(), 1.0f);
                                    valueAnimator6.addUpdateListener(new AUListenerS266S0100000_17(constraintProperty, 66));
                                    valueAnimator6.addListener(new ALAdapterS13S0100000_17(constraintProperty, 44));
                                }
                            }
                            ValueAnimator valueAnimator7 = this.LIZJ;
                            if (valueAnimator7 == null) {
                                return;
                            }
                            valueAnimator7.start();
                        }
                    }
                });
                registerElement(elementSpecImpl3);
                ElementSpecImpl elementSpecImpl4 = new ElementSpecImpl(C1080000eD8.LIZLLL);
                elementSpecImpl4.addSceneObserver(new DataChannelSceneObserver<C520220Kai, ProgrammedLiveMenuVisibilityChannel>(c1080530eDz) { // from class: X.0eD6
                    public final C01GW LIZ;

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<ProgrammedLiveMenuVisibilityChannel> getType() {
                        return ProgrammedLiveMenuVisibilityChannel.class;
                    }

                    {
                        super(false);
                        this.LIZ = C292401Bi.LIZ(new AwS561S0100000_17(c1080530eDz, 394));
                    }

                    @Override // com.bytedance.ies.sdk.widgets.SceneObserver
                    public final void dispose(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty) {
                        super.dispose(layeredElementContext, constraintProperty);
                        constraintProperty.alpha(1.0f);
                        constraintProperty.translationY(0.0f);
                        ((ValueAnimator) this.LIZ.getValue()).cancel();
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C520220Kai c520220Kai) {
                        ValueAnimator valueAnimator = (ValueAnimator) this.LIZ.getValue();
                        valueAnimator.cancel();
                        valueAnimator.removeAllListeners();
                        valueAnimator.removeAllUpdateListeners();
                        if (c520220Kai.LIZ) {
                            valueAnimator.setFloatValues(constraintProperty.alpha(), 0.0f);
                            valueAnimator.addListener(new ALAdapterS12S0200000_17(constraintProperty, layeredElementContext, 18));
                        } else {
                            valueAnimator.setFloatValues(constraintProperty.alpha(), 1.0f);
                            valueAnimator.addListener(new ALAdapterS13S0100000_17(constraintProperty, 45));
                        }
                        valueAnimator.addUpdateListener(new AUListenerS266S0100000_17(constraintProperty, 67));
                        valueAnimator.start();
                    }
                });
                registerElement(elementSpecImpl4);
                ElementSpecImpl elementSpecImpl5 = new ElementSpecImpl(C1080000eD8.LJ);
                elementSpecImpl5.addSceneObserver(new RxBusSceneObserver<C1085120eLO>(c1080530eDz) { // from class: X.0eD5
                    public final C01GW LIZ;

                    @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
                    public final Class<C1085120eLO> getType() {
                        return C1085120eLO.class;
                    }

                    {
                        this.LIZ = C292401Bi.LIZ(new AwS561S0100000_17(c1080530eDz, 395));
                    }

                    @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C1085120eLO c1085120eLO) {
                        float f;
                        ValueAnimator valueAnimator = (ValueAnimator) this.LIZ.getValue();
                        valueAnimator.cancel();
                        valueAnimator.removeAllListeners();
                        valueAnimator.removeAllUpdateListeners();
                        float[] fArr = new float[2];
                        fArr[0] = constraintProperty.alpha();
                        if (c1085120eLO.LIZIZ) {
                            f = 0.0f;
                        } else {
                            f = 1.0f;
                        }
                        fArr[1] = f;
                        valueAnimator.setFloatValues(fArr);
                        valueAnimator.addUpdateListener(new AUListenerS266S0100000_17(constraintProperty, 68));
                        valueAnimator.start();
                    }
                });
                registerElement(elementSpecImpl5);
            }
        });
        final C1080530eDz c1080530eDz2 = (C1080530eDz) getLayeredElementContext();
        registerLayer(new LayerSpecImpl(c1080530eDz2) { // from class: X.0eEA
            {
                super(c1080530eDz2);
                MultiElementSpecImplKt.element(this, new C1080660eEC(c1080530eDz2));
                MultiElementSpecImplKt.element(this, new C1080670eED(c1080530eDz2));
                ElementSpecImpl elementSpecImpl = new ElementSpecImpl(R.id.ebm);
                ElementSpecImplKt.onAttach(elementSpecImpl, new AwS596S0100000_17(c1080530eDz2, 380));
                registerElement(elementSpecImpl);
                ElementSpecImpl elementSpecImpl2 = new ElementSpecImpl(R.id.video_start_guideline);
                elementSpecImpl2.addSceneObserver(new DataChannelSceneObserver<C0IFN, LandscapeInteractionMarginData>() { // from class: X.0eEH
                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<LandscapeInteractionMarginData> getType() {
                        return LandscapeInteractionMarginData.class;
                    }

                    {
                        super(true);
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C0IFN c0ifn) {
                        boolean zBooleanValue;
                        C0IFN c0ifn2 = c0ifn;
                        Boolean bool = (Boolean) layeredElementContext.getDataChannel().gg0(C1082790eHd.class);
                        int i = 0;
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        if (c1080530eDz2.LJIIJJI) {
                            if (!zBooleanValue) {
                                i = c0ifn2.LIZJ;
                            }
                            constraintProperty.margin(2, i);
                            constraintProperty.apply();
                            return;
                        }
                        if (!zBooleanValue) {
                            i = c0ifn2.LIZ;
                        }
                        constraintProperty.margin(1, i);
                        constraintProperty.apply();
                    }
                });
                ElementSpecImplKt.onAttach(elementSpecImpl2, new AwS596S0100000_17(c1080530eDz2, 381));
                registerElement(elementSpecImpl2);
                ElementSpecImpl elementSpecImpl3 = new ElementSpecImpl(R.id.video_top_guideline);
                elementSpecImpl3.addSceneObserver(new DataChannelSceneObserver<C0IFN, LandscapeInteractionMarginData>() { // from class: X.0eEG
                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<LandscapeInteractionMarginData> getType() {
                        return LandscapeInteractionMarginData.class;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C0IFN c0ifn) {
                        C0IFN c0ifn2 = c0ifn;
                        Boolean bool = (Boolean) layeredElementContext.getDataChannel().gg0(C1082790eHd.class);
                        int i = 0;
                        if (bool == null || !bool.booleanValue()) {
                            i = c0ifn2.LIZIZ;
                        }
                        constraintProperty.margin(3, i);
                        constraintProperty.apply();
                    }
                });
                registerElement(elementSpecImpl3);
                ElementSpecImpl elementSpecImpl4 = new ElementSpecImpl(R.id.video_end_guideline);
                elementSpecImpl4.addSceneObserver(new DataChannelSceneObserver<C0IFN, LandscapeInteractionMarginData>() { // from class: X.0eEI
                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<LandscapeInteractionMarginData> getType() {
                        return LandscapeInteractionMarginData.class;
                    }

                    {
                        super(true);
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C0IFN c0ifn) {
                        boolean zBooleanValue;
                        C0IFN c0ifn2 = c0ifn;
                        Boolean bool = (Boolean) layeredElementContext.getDataChannel().gg0(C1082790eHd.class);
                        int i = 0;
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        if (c1080530eDz2.LJIIJJI) {
                            if (!zBooleanValue) {
                                i = c0ifn2.LIZ;
                            }
                            constraintProperty.margin(1, i);
                            constraintProperty.apply();
                            return;
                        }
                        if (!zBooleanValue) {
                            i = c0ifn2.LIZJ;
                        }
                        constraintProperty.margin(2, i);
                        constraintProperty.apply();
                    }
                });
                ElementSpecImplKt.onAttach(elementSpecImpl4, new AwS596S0100000_17(c1080530eDz2, 382));
                registerElement(elementSpecImpl4);
                ElementSpecImpl elementSpecImpl5 = new ElementSpecImpl(R.id.video_bottom_guideline);
                elementSpecImpl5.addSceneObserver(new DataChannelSceneObserver<C0IFN, LandscapeInteractionMarginData>() { // from class: X.0eEL
                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<LandscapeInteractionMarginData> getType() {
                        return LandscapeInteractionMarginData.class;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C0IFN c0ifn) {
                        C0IFN c0ifn2 = c0ifn;
                        Boolean bool = (Boolean) layeredElementContext.getDataChannel().gg0(C1082790eHd.class);
                        int i = 0;
                        if (bool == null || !bool.booleanValue()) {
                            i = c0ifn2.LIZLLL;
                        }
                        constraintProperty.margin(4, i);
                        constraintProperty.apply();
                    }
                });
                registerElement(elementSpecImpl5);
                ElementSpecImpl elementSpecImpl6 = new ElementSpecImpl(R.id.video_left_guideline);
                elementSpecImpl6.addSceneObserver(new DataChannelSceneObserver<C0IFN, LandscapeInteractionMarginData>() { // from class: X.0eEJ
                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<LandscapeInteractionMarginData> getType() {
                        return LandscapeInteractionMarginData.class;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C0IFN c0ifn) {
                        C0IFN c0ifn2 = c0ifn;
                        Boolean bool = (Boolean) layeredElementContext.getDataChannel().gg0(C1082790eHd.class);
                        int i = 0;
                        if (bool == null || !bool.booleanValue()) {
                            i = c0ifn2.LIZ;
                        }
                        constraintProperty.margin(1, i);
                        constraintProperty.apply();
                    }
                });
                registerElement(elementSpecImpl6);
                ElementSpecImpl elementSpecImpl7 = new ElementSpecImpl(R.id.video_right_guideline);
                elementSpecImpl7.addSceneObserver(new DataChannelSceneObserver<C0IFN, LandscapeInteractionMarginData>() { // from class: X.0eEK
                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<LandscapeInteractionMarginData> getType() {
                        return LandscapeInteractionMarginData.class;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C0IFN c0ifn) {
                        C0IFN c0ifn2 = c0ifn;
                        Boolean bool = (Boolean) layeredElementContext.getDataChannel().gg0(C1082790eHd.class);
                        int i = 0;
                        if (bool == null || !bool.booleanValue()) {
                            i = c0ifn2.LIZJ;
                        }
                        constraintProperty.margin(2, i);
                        constraintProperty.apply();
                    }
                });
                registerElement(elementSpecImpl7);
            }
        });
        final C1080530eDz c1080530eDz3 = (C1080530eDz) getLayeredElementContext();
        registerLayer(new LayerSpecImpl(c1080530eDz3) { // from class: X.0eDH
            {
                super(c1080530eDz3);
                if (LiveSdkLinkMicLandscapeSetting.isEnable()) {
                    MultiElementSpecImpl.placeholderElement$default(this, R.id.pbp, null, 2, null);
                }
                MultiElementSpecImpl.placeholderElement$default(this, R.id.viewer_wishes_container, null, 2, null);
                MultiElementSpecImplKt.element(this, R.id.h5d);
                C1080010eD9 c1080010eD9 = new C1080010eD9(R.id.nut);
                ElementSpecImplKt.onAttach(c1080010eD9, AFwS254S0000000_17.get$arr$(139));
                registerElement(c1080010eD9);
                MultiElementSpecImplKt.groupableElement(this, R.id.nus, AFwS254S0000000_17.get$arr$(140));
                MultiElementSpecImplKt.groupableElement(this, R.id.ixx, new AwS596S0100000_17(c1080530eDz3, 385));
                MultiElementSpecImplKt.element(this, R.id.m5_);
                MultiElementSpecImpl.placeholderElement$default(this, R.id.b_v, null, 2, null);
                MultiElementSpecImplKt.element(this, new C1080330eDf(c1080530eDz3));
                MultiElementSpecImplKt.element(this, R.id.vxl);
                AwS596S0100000_17 awS596S0100000_17 = new AwS596S0100000_17(c1080530eDz3, 389);
                ElementSpec elementSpecImpl = new ElementSpecImpl(R.id.ebi);
                awS596S0100000_17.invoke(elementSpecImpl);
                registerElement(elementSpecImpl);
                MultiElementSpecImplKt.groupableElement(this, R.id.np0, AFwS254S0000000_17.get$arr$(141));
                C1080010eD9 c1080010eD92 = new C1080010eD9(R.id.dnp);
                int i = C1080000eD8.LIZLLL;
                c1080010eD92.bindGroup(i);
                ElementSpecImplKt.onAttach(c1080010eD92, new AwS596S0100000_17(c1080530eDz3, 386));
                registerElement(c1080010eD92);
                C1080010eD9 c1080010eD93 = new C1080010eD9(R.id.wu0);
                c1080010eD93.bindGroup(i);
                ElementSpecImplKt.onAttach(c1080010eD93, new AwS596S0100000_17(c1080530eDz3, 387));
                registerElement(c1080010eD93);
                C1080010eD9 c1080010eD94 = new C1080010eD9(R.id.uzz);
                c1080010eD94.bindGroup(i);
                ElementSpecImplKt.onAttach(c1080010eD94, new AwS596S0100000_17(c1080530eDz3, 388));
                registerElement(c1080010eD94);
                MultiElementSpecImplKt.groupableElement(this, R.id.wi_, AFwS254S0000000_17.get$arr$(142));
                registerElement(new C1080360eDi(c1080530eDz3));
                C1080200eDS c1080200eDS = new C1080200eDS(c1080530eDz3);
                c1080200eDS.bindGroups(C1080000eD8.LJFF);
                registerElement(c1080200eDS);
                MultiElementSpecImplKt.groupableElement(this, R.id.ea1, new AwS596S0100000_17(c1080530eDz3, 383));
                MultiElementSpecImplKt.groupableElement(this, R.id.isf, new AwS596S0100000_17(c1080530eDz3, 384));
                if (LiveSdkLinkMicLandscapeSetting.isEnable()) {
                    C1079350eC5.LIZ(this, R.id.m21, null);
                }
            }

            @Override // com.bytedance.ies.sdk.widgets.MultiElementSpecImpl
            public final boolean enableWidgetPlaceholderOpt(int i) {
                if (LiveSdkLinkMicLandscapeSetting.isEnable()) {
                    if (i == R.id.m21) {
                        return WidgetPlaceholderOptSetting.enableKaraokeHoverBallContainerOpt();
                    }
                    if (i == R.id.pbp) {
                        return WidgetPlaceholderOptSetting.enableNormalInteractWindowContainerOpt();
                    }
                    return false;
                }
                return false;
            }
        });
        LiveGameMomentQuickCommentWatchliveSetting liveGameMomentQuickCommentWatchliveSetting = LiveGameMomentQuickCommentWatchliveSetting.INSTANCE;
        if (liveGameMomentQuickCommentWatchliveSetting.isLandscapeAccessLayerChange()) {
            final ?? layeredElementContext = getLayeredElementContext();
            registerLayer(new LayerSpecImpl(layeredElementContext) { // from class: X.0eCq
                {
                    super(layeredElementContext);
                    ElementSpecImpl elementSpecImpl = new ElementSpecImpl(R.id.kwg);
                    elementSpecImpl.addSceneObserver(new DataChannelSceneObserver<Boolean, KeyboardStatusChannel>() { // from class: X.0eCp
                        @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                        public final Class<KeyboardStatusChannel> getType() {
                            return KeyboardStatusChannel.class;
                        }

                        @Override // com.bytedance.ies.sdk.widgets.SceneObserver
                        public final void dispose(LayeredElementContext layeredElementContext2, ConstraintProperty constraintProperty) {
                            super.dispose(layeredElementContext2, constraintProperty);
                            constraintProperty.visibility(8);
                        }

                        @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                        public final void onEvent(LayeredElementContext layeredElementContext2, ConstraintProperty constraintProperty, Boolean bool) {
                            if (bool.booleanValue()) {
                                constraintProperty.visibility(0);
                            } else {
                                constraintProperty.visibility(8);
                            }
                        }
                    });
                    ElementSpecImplKt.onAttach(elementSpecImpl, new AwS596S0100000_17(layeredElementContext, 377));
                    registerElement(elementSpecImpl);
                }
            });
        }
        final C1080530eDz c1080530eDz4 = (C1080530eDz) getLayeredElementContext();
        registerLayer(new LayerSpecImpl(c1080530eDz4) { // from class: X.0eDB
            {
                super(c1080530eDz4);
                MultiElementSpecImplKt.element(this, R.id.qfy);
                ElementSpecImpl elementSpecImpl = new ElementSpecImpl(R.id.video_animate_container);
                ElementSpecImplKt.onAttach(elementSpecImpl, AFwS254S0000000_17.get$arr$(122));
                registerElement(elementSpecImpl);
                MultiElementSpecImplKt.groupableElement(this, R.id.qhj, AFwS254S0000000_17.get$arr$(124));
                C1080010eD9 c1080010eD9 = new C1080010eD9(R.id.bn8);
                ElementSpecImplKt.onAttach(c1080010eD9, new AwS596S0100000_17(c1080530eDz4, 375));
                registerElement(c1080010eD9);
                C1080000eD8.LIZ(this, R.id.user_info_container);
                C1080000eD8.LIZ(this, R.id.mo8);
                C1080000eD8.LIZ(this, R.id.oay);
                C1080000eD8.LIZ(this, R.id.ba7);
                C1080000eD8.LIZ(this, R.id.sqk);
                C1080000eD8.LIZ(this, R.id.sql);
                MultiElementSpecImplKt.groupableElement(this, R.id.n2m, AFwS254S0000000_17.get$arr$(125));
                MultiElementSpecImplKt.groupableElement(this, R.id.f814ule, AFwS254S0000000_17.get$arr$(126));
                registerElement(new C1080020eDA());
                registerElement(new ElementSpecImpl(R.id.v96));
                MultiElementSpecImplKt.element(this, R.id.wqh);
                MultiElementSpecImplKt.element(this, R.id.n3_);
                MultiElementSpecImplKt.element(this, R.id.m5g);
                C1080000eD8.LIZ(this, R.id.yjr);
                C1080010eD9 c1080010eD92 = new C1080010eD9(R.id.wish_list_container);
                ElementSpecImplKt.onAttach(c1080010eD92, AFwS254S0000000_17.get$arr$(127));
                registerElement(c1080010eD92);
                MultiElementSpecImplKt.element(this, R.id.fdx);
                MultiElementSpecImplKt.groupableElement(this, R.id.wu1, AFwS254S0000000_17.get$arr$(128));
                MultiElementSpecImplKt.element(this, R.id.iq1);
                MultiElementSpecImplKt.groupableElement(this, R.id.ieq, new AwS596S0100000_17(c1080530eDz4, 374));
                ElementSpecImpl elementSpecImpl2 = new ElementSpecImpl(R.id.krj);
                elementSpecImpl2.addSceneObserver(new RxBusSceneObserver<C1085120eLO>() { // from class: X.0eDC
                    @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
                    public final Class<C1085120eLO> getType() {
                        return C1085120eLO.class;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext2, ConstraintProperty constraintProperty, C1085120eLO c1085120eLO) {
                        C1085120eLO c1085120eLO2 = c1085120eLO;
                        if (LiveGameMomentQuickCommentWatchliveSetting.INSTANCE.quiciCommentLandscapeEnable()) {
                            if (c1085120eLO2.LIZIZ) {
                                constraintProperty.connect(4, 0, 4, c1085120eLO2.LIZ + C497740JfY.LJIIIZ(R.dimen.as6));
                            } else {
                                constraintProperty.connect(4, R.id.ebi, 3, 0);
                            }
                        }
                    }
                });
                registerElement(elementSpecImpl2);
                ElementSpecImpl elementSpecImpl3 = new ElementSpecImpl(R.id.sme);
                ElementSpecImplKt.onAttach(elementSpecImpl3, AFwS254S0000000_17.get$arr$(123));
                registerElement(elementSpecImpl3);
            }
        });
        final C1080530eDz c1080530eDz5 = (C1080530eDz) getLayeredElementContext();
        registerLayer(new LayerSpecImpl(c1080530eDz5) { // from class: X.0eDV
            {
                super(c1080530eDz5);
                ElementSpecImpl elementSpecImpl = new ElementSpecImpl(R.id.s8f);
                elementSpecImpl.addSceneObserver(new DataChannelSceneObserver<C520220Kai, ProgrammedLiveMenuVisibilityChannel>() { // from class: X.0eDU
                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<ProgrammedLiveMenuVisibilityChannel> getType() {
                        return ProgrammedLiveMenuVisibilityChannel.class;
                    }

                    @Override // com.bytedance.ies.sdk.widgets.SceneObserver
                    public final void dispose(LayeredElementContext layeredElementContext2, ConstraintProperty constraintProperty) {
                        super.dispose(layeredElementContext2, constraintProperty);
                        constraintProperty.connect(7, R.id.uzz, 6, (int) C497740JfY.LIZIZ(42.0f));
                        constraintProperty.apply();
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext2, ConstraintProperty constraintProperty, C520220Kai c520220Kai) {
                        if (c520220Kai.LIZ) {
                            constraintProperty.connect(7, R.id.s8_, 6, (int) C497740JfY.LIZIZ(42.0f));
                        } else {
                            constraintProperty.connect(7, R.id.uzz, 6, (int) C497740JfY.LIZIZ(42.0f));
                        }
                        constraintProperty.apply();
                    }
                });
                registerElement(elementSpecImpl);
                C1080010eD9 c1080010eD9 = new C1080010eD9(R.id.s8h);
                ElementSpecImplKt.onAttach(c1080010eD9, AFwS254S0000000_17.get$arr$(131));
                registerElement(c1080010eD9);
                C1080000eD8.LIZ(this, R.id.s8a);
                ElementSpecImpl elementSpecImpl2 = new ElementSpecImpl(R.id.s8_);
                ElementSpecImplKt.onAttach(elementSpecImpl2, AFwS254S0000000_17.get$arr$(132));
                elementSpecImpl2.addSceneObserver(new DataChannelSceneObserver<C520220Kai, ProgrammedLiveMenuVisibilityChannel>(c1080530eDz5) { // from class: X.0eDW
                    public final C01GW LIZ;

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final Class<ProgrammedLiveMenuVisibilityChannel> getType() {
                        return ProgrammedLiveMenuVisibilityChannel.class;
                    }

                    {
                        super(false);
                        this.LIZ = C292401Bi.LIZ(new AwS561S0100000_17(c1080530eDz5, 393));
                    }

                    @Override // com.bytedance.ies.sdk.widgets.SceneObserver
                    public final void dispose(LayeredElementContext layeredElementContext2, ConstraintProperty constraintProperty) {
                        float fLJIILLIIL;
                        super.dispose(layeredElementContext2, constraintProperty);
                        if (C497740JfY.LJJ()) {
                            fLJIILLIIL = -C497740JfY.LJIILLIIL();
                        } else {
                            fLJIILLIIL = C497740JfY.LJIILLIIL();
                        }
                        constraintProperty.translationX(fLJIILLIIL);
                        C784440Upu.LIZ().LIZIZ(new C520200Kag(false, null));
                        ((ValueAnimator) this.LIZ.getValue()).cancel();
                    }

                    @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                    public final void onEvent(LayeredElementContext layeredElementContext2, ConstraintProperty constraintProperty, C520220Kai c520220Kai) {
                        float fLJIILLIIL;
                        C520220Kai c520220Kai2 = c520220Kai;
                        ValueAnimator valueAnimator = (ValueAnimator) this.LIZ.getValue();
                        valueAnimator.cancel();
                        valueAnimator.removeAllListeners();
                        valueAnimator.removeAllUpdateListeners();
                        if (c520220Kai2.LIZ) {
                            valueAnimator.setFloatValues(constraintProperty.translationX(), 0.0f);
                            valueAnimator.addListener(new ALAdapterS4S0200000_7(c520220Kai2, constraintProperty, 7));
                        } else {
                            float[] fArr = new float[2];
                            fArr[0] = constraintProperty.translationX();
                            if (C497740JfY.LJJ()) {
                                fLJIILLIIL = -C497740JfY.LJIILLIIL();
                            } else {
                                fLJIILLIIL = C497740JfY.LJIILLIIL();
                            }
                            fArr[1] = fLJIILLIIL;
                            valueAnimator.setFloatValues(fArr);
                            valueAnimator.addListener(new ALAdapterS4S0200000_7(c520220Kai2, constraintProperty, 8));
                        }
                        valueAnimator.addUpdateListener(new AUListenerS266S0100000_17(constraintProperty, 65));
                        valueAnimator.start();
                    }
                });
                registerElement(elementSpecImpl2);
                MultiElementSpecImplKt.groupableElement(this, R.id.j2h, AFwS254S0000000_17.get$arr$(133));
                MultiElementSpecImplKt.groupableElement(this, R.id.n4a, AFwS254S0000000_17.get$arr$(134));
                MultiElementSpecImplKt.groupableElement(this, R.id.ye6, AFwS254S0000000_17.get$arr$(135));
                MultiElementSpecImplKt.groupableElement(this, R.id.ir1, AFwS254S0000000_17.get$arr$(136));
                MultiElementSpecImplKt.element(this, R.id.uoc);
            }
        });
        if (LiveSdkLinkMicLandscapeSetting.isEnable()) {
            final ?? layeredElementContext2 = getLayeredElementContext();
            registerLayer(new LayerSpecImpl(layeredElementContext2) { // from class: X.0eCo
                {
                    int i = C1079350eC5.LIZ;
                    registerElement(new C1079330eC3(R.id.fgl));
                    registerElement(new C1079330eC3(R.id.mw7));
                    if (LiveSdkLinkMicLandscapeSetting.isEnable()) {
                        MultiElementSpecImplKt.element(this, R.id.ysi);
                        MultiElementSpecImpl.placeholderElement$default(this, R.id.qjn, null, 2, null);
                        MultiElementSpecImplKt.element(this, R.id.o1w);
                    }
                    if (WidgetPlaceholderOptSetting.enableInteractDebugInfoContainerOpt()) {
                        placeholderElement(R.id.kv7, AFwS254S0000000_17.get$arr$(137));
                    } else {
                        MultiElementSpecImplKt.groupableElement(this, R.id.kv7, AFwS254S0000000_17.get$arr$(138));
                    }
                }
            });
        }
        if (!liveGameMomentQuickCommentWatchliveSetting.isLandscapeAccessLayerChange()) {
            final ?? layeredElementContext3 = getLayeredElementContext();
            registerLayer(new LayerSpecImpl(layeredElementContext3) { // from class: X.0eCq
                {
                    super(layeredElementContext3);
                    ElementSpecImpl elementSpecImpl = new ElementSpecImpl(R.id.kwg);
                    elementSpecImpl.addSceneObserver(new DataChannelSceneObserver<Boolean, KeyboardStatusChannel>() { // from class: X.0eCp
                        @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                        public final Class<KeyboardStatusChannel> getType() {
                            return KeyboardStatusChannel.class;
                        }

                        @Override // com.bytedance.ies.sdk.widgets.SceneObserver
                        public final void dispose(LayeredElementContext layeredElementContext22, ConstraintProperty constraintProperty) {
                            super.dispose(layeredElementContext22, constraintProperty);
                            constraintProperty.visibility(8);
                        }

                        @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                        public final void onEvent(LayeredElementContext layeredElementContext22, ConstraintProperty constraintProperty, Boolean bool) {
                            if (bool.booleanValue()) {
                                constraintProperty.visibility(0);
                            } else {
                                constraintProperty.visibility(8);
                            }
                        }
                    });
                    ElementSpecImplKt.onAttach(elementSpecImpl, new AwS596S0100000_17(layeredElementContext3, 377));
                    registerElement(elementSpecImpl);
                }
            });
        }
        LIZLLL(c1083340eIW);
        finishRegistration();
    }
}
