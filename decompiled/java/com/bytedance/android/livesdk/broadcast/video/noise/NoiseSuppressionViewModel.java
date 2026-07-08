package com.bytedance.android.livesdk.broadcast.video.noise;

import X.AbstractC1180704jd;
import X.AbstractC775500UbU;
import X.AnonymousClass0956;
import X.C01KE;
import X.C099R;
import X.C09R3;
import X.C0IJT;
import X.C1180604jc;
import X.C13LE;
import X.C1954807lC;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C474500IjA;
import X.C497700JfU;
import X.C754300TiO;
import X.C768310UBx;
import X.C775490UbT;
import X.C775510UbV;
import X.C775520UbW;
import X.C775530UbX;
import X.C775540UbY;
import X.C775550UbZ;
import X.C775600Ube;
import X.C775630Ubh;
import X.C781270Ukn;
import X.InterfaceC1106030et7;
import X.InterfaceC1112400f3O;
import X.InterfaceC1364105Vn;
import X.InterfaceC2217461Bqa;
import X.InterfaceC497710JfV;
import X.InterfaceC774460UZo;
import X.InterfaceC774930UaZ;
import X.InterfaceC775610Ubf;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.broadcast.setting.BroadcastNoiseSuppressionSetting;
import com.bytedance.android.livesdk.broadcast.setting.NoiseSuppressionConfig;
import com.bytedance.android.livesdk.broadcast.video.noise.NoiseSuppressionViewModel;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleStyleItemConfig;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.mvi.core.MviViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class NoiseSuppressionViewModel extends MviViewModel<C775600Ube, AbstractC775500UbU, AbstractC1180704jd> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public InterfaceC775610Ubf LLILZLL;
    public AnonymousClass0956 LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public final NoiseSuppressionConfig LLJIJIL;
    public volatile C768310UBx LLJILJIL;
    public volatile C775630Ubh LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(NoiseSuppressionViewModel.class, "dataSource", "getDataSource()Lcom/bytedance/android/livesdk/broadcast/video/noise/NoiseSuppressionDataSource;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(NoiseSuppressionViewModel.class, "logReporter", "getLogReporter()Lcom/bytedance/android/livesdk/broadcast/video/noise/NoiseLogReporter;", 0);
        c09r3.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NoiseSuppressionViewModel() {
        Boolean boolLIZ = InterfaceC1106030et7.p9.LIZ();
        boolean zBooleanValue = boolLIZ != null ? boolLIZ.booleanValue() : false;
        Integer numLIZ = InterfaceC1106030et7.q9.LIZ();
        super(new C775600Ube(zBooleanValue, numLIZ == null || numLIZ.intValue() < 7));
        this.LLJIJIL = BroadcastNoiseSuppressionSetting.INSTANCE.getConfig();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0Ubh] */
    public final C775630Ubh AQ2() {
        C775630Ubh c775630Ubh = this.LLJILJILJ;
        if (c775630Ubh == null) {
            synchronized (this) {
                c775630Ubh = this.LLJILJILJ;
                if (c775630Ubh == null) {
                    ?? r0 = new Object() { // from class: X.0Ubh
                    };
                    this.LLJILJILJ = r0;
                    return r0;
                }
            }
        }
        return c775630Ubh;
    }

    public final void CQ2() {
        C20441214yg.LIZIZ("NoiseDetectViewModel", "startNoiseSuppression");
        InterfaceC775610Ubf interfaceC775610Ubf = this.LLILZLL;
        if (interfaceC775610Ubf != null) {
            interfaceC775610Ubf.LIZLLL(true);
        }
    }

    public final void DQ2() {
        if (this.LLIZLLLIL) {
            C20441214yg.LIZIZ("NoiseDetectViewModel", "stopNoiseDetect");
            InterfaceC775610Ubf interfaceC775610Ubf = this.LLILZLL;
            if (interfaceC775610Ubf != null) {
                interfaceC775610Ubf.LJI(0, this.LLJIJIL.detectInterval);
            }
            this.LLIZLLLIL = false;
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C497700JfU c497700JfU = C497700JfU.LIZ;
        C497700JfU.LIZLLL(this);
    }

    public final void BQ2(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startNoiseDetect for ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("NoiseDetectViewModel", C2188811AlT.LIZIZ(sbLIZ));
        this.LLIZLLLIL = true;
        InterfaceC775610Ubf interfaceC775610Ubf = this.LLILZLL;
        if (interfaceC775610Ubf != null) {
            NoiseSuppressionConfig noiseSuppressionConfig = this.LLJIJIL;
            interfaceC775610Ubf.LJI(noiseSuppressionConfig.detectDuration, noiseSuppressionConfig.detectInterval);
        }
    }

    public final void zQ2(String str) {
        if (this.LLIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cancelNoiseDetectJob for ");
            sbLIZ.append(str);
            C20441214yg.LIZIZ("NoiseDetectViewModel", C2188811AlT.LIZIZ(sbLIZ));
            AnonymousClass0956 anonymousClass0956 = this.LLIZ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLIZ = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v71, types: [X.0UZu] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.android.livesdk.mvi.core.MviViewModel
    public final Object yQ2(InterfaceC774460UZo interfaceC774460UZo, InterfaceC1364105Vn interfaceC1364105Vn) {
        long jLongValue;
        Unit unit;
        AbstractC775500UbU abstractC775500UbU = (AbstractC775500UbU) interfaceC774460UZo;
        if (abstractC775500UbU instanceof C775490UbT) {
            C768310UBx c768310UBx = this.LLJILJIL;
            if (c768310UBx == null) {
                synchronized (this) {
                    c768310UBx = this.LLJILJIL;
                    if (c768310UBx == null) {
                        c768310UBx = new C768310UBx();
                        this.LLJILJIL = c768310UBx;
                    }
                }
            }
            C775490UbT c775490UbT = (C775490UbT) abstractC775500UbU;
            c768310UBx.LIZ = c775490UbT.LIZIZ;
            InterfaceC775610Ubf interfaceC775610Ubf = c775490UbT.LIZ;
            this.LLILZLL = interfaceC775610Ubf;
            if (interfaceC775610Ubf != 0) {
                interfaceC775610Ubf.LJIIJ(new InterfaceC774930UaZ() { // from class: X.0UZu
                    @Override // X.InterfaceC774930UaZ
                    public final void LIZ(int i) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onNoiseDetected: ");
                        sbLIZ.append(i);
                        C20441214yg.LIZIZ("NoiseDetectViewModel", C2188811AlT.LIZIZ(sbLIZ));
                        if (i == 1) {
                            NoiseSuppressionViewModel noiseSuppressionViewModel = this.LIZ;
                            noiseSuppressionViewModel.getClass();
                            C20441214yg.LIZIZ("NoiseDetectViewModel", "noise level is high, show noise capsule");
                            C01KE.LIZ(ViewModelKt.getViewModelScope(noiseSuppressionViewModel), new C754280TiM(noiseSuppressionViewModel, null));
                        }
                    }
                });
            }
            C20441214yg.LIZIZ("NoiseDetectViewModel", "initializeNoiseSuppression");
            if (xQ2().LIZ) {
                CQ2();
            } else {
                C20441214yg.LIZIZ("NoiseDetectViewModel", "stopNoiseSuppression");
                InterfaceC775610Ubf interfaceC775610Ubf2 = this.LLILZLL;
                if (interfaceC775610Ubf2 != null) {
                    interfaceC775610Ubf2.LIZLLL(false);
                }
            }
        } else {
            if (abstractC775500UbU instanceof C775530UbX) {
                C20441214yg.LIZIZ("NoiseDetectViewModel", "startNoiseDetectTask");
                long jCurrentTimeMillis = System.currentTimeMillis() / 86400000;
                Long lLIZ = InterfaceC1106030et7.r9.LIZ();
                if (lLIZ != null) {
                    jLongValue = lLIZ.longValue();
                } else {
                    jLongValue = 0;
                }
                long j = jLongValue / 86400000;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("currentDay: ");
                sbLIZ.append(jCurrentTimeMillis);
                sbLIZ.append(", lastNoiseDetectTaskDay: ");
                sbLIZ.append(j);
                C20441214yg.LIZIZ("NoiseDetectViewModel", C2188811AlT.LIZIZ(sbLIZ));
                if (j < jCurrentTimeMillis) {
                    if (xQ2().LIZ) {
                        C20441214yg.LIZIZ("NoiseDetectViewModel", "startNoiseDetectTaskFailFor switchOpened");
                        unit = Unit.LIZ;
                    } else if (!xQ2().LIZIZ) {
                        C20441214yg.LIZIZ("NoiseDetectViewModel", "startNoiseDetectTaskFailFor backgroundDetectDisable");
                        unit = Unit.LIZ;
                    } else {
                        AnonymousClass0956 anonymousClass0956 = this.LLIZ;
                        if (anonymousClass0956 != null) {
                            anonymousClass0956.LIZIZ(null);
                        }
                        this.LLIZ = C01KE.LIZ(ViewModelKt.getViewModelScope(this), new C754300TiO(this, null));
                        unit = Unit.LIZ;
                    }
                } else {
                    C20441214yg.LIZIZ("NoiseDetectViewModel", "startNoiseDetectTaskFailFor once one day limit");
                    unit = Unit.LIZ;
                }
                if (unit != C099R.LJFF()) {
                    return Unit.LIZ;
                }
                return unit;
            }
            if (Intrinsics.LJFF(abstractC775500UbU, C775510UbV.LIZ)) {
                C20441214yg.LIZIZ("NoiseDetectViewModel", "handleStartCapsuleDetect");
                C781270Ukn.LJIJI().bQ1(80, new InterfaceC1112400f3O() { // from class: X.0Ubz
                    @Override // X.InterfaceC1112400f3O
                    public final boolean LIZ() {
                        return true;
                    }

                    @Override // X.InterfaceC1112400f3O
                    public final void LIZIZ(CapsuleMessage capsuleMessage, Map<String, String> map) {
                    }

                    @Override // X.InterfaceC1112400f3O
                    public final void LJII(C1112330f3H c1112330f3H, Map<String, String> map) {
                    }

                    @Override // X.InterfaceC1112400f3O
                    public final boolean LJIIJJI(C1112330f3H c1112330f3H) {
                        return false;
                    }

                    @Override // X.InterfaceC1112400f3O
                    public final void LJIILLIIL() {
                    }

                    @Override // X.InterfaceC1112400f3O
                    public final int LJIIZILJ() {
                        return 0;
                    }

                    @Override // X.InterfaceC1112400f3O
                    public final void LJIJ(C1112330f3H c1112330f3H, Map<String, String> map) {
                    }

                    @Override // X.InterfaceC1112400f3O
                    public final void LJJIFFI(C1112330f3H c1112330f3H, Map<String, String> map) {
                    }

                    @Override // X.InterfaceC1112400f3O
                    public final void LJJIIJ(C1112330f3H c1112330f3H) {
                    }

                    @Override // X.InterfaceC1112400f3O
                    public final int LJJIIZI(CapsuleMessage capsuleMessage) {
                        return -1;
                    }

                    @Override // X.InterfaceC1112400f3O
                    public final void LJJIJIIJI() {
                    }

                    @Override // X.InterfaceC1112400f3O
                    public final boolean LJJIJIL(C1109770ez9 c1109770ez9, CapsuleMessage capsuleMessage) {
                        return false;
                    }

                    @Override // X.InterfaceC1112400f3O
                    public final int LJJIJL(CapsuleMessage capsuleMessage) {
                        return -1;
                    }

                    @Override // X.InterfaceC1112400f3O
                    public final LiveCapsuleStyleItemConfig LJI() {
                        return C952230at3.LIZ();
                    }

                    @Override // X.InterfaceC1112400f3O
                    public final boolean LJIIIIZZ(C1112330f3H c1112330f3H) {
                        return C952230at3.LIZJ();
                    }

                    @Override // X.InterfaceC1112400f3O
                    public final boolean LJIIIZ(C1112330f3H c1112330f3H) {
                        this.LL.getClass();
                        C20441214yg.LIZIZ("NoiseDetectViewModel", "onCapsuleClick");
                        InterfaceC1106030et7.q9.LIZJ(0);
                        return false;
                    }

                    @Override // X.InterfaceC1112400f3O
                    public final void LJIL(C1112330f3H c1112330f3H) {
                        NoiseSuppressionViewModel noiseSuppressionViewModel = this.LL;
                        noiseSuppressionViewModel.getClass();
                        C20441214yg.LIZIZ("NoiseDetectViewModel", "onCapsuleShow");
                        C01KE.LIZ(ViewModelKt.getViewModelScope(noiseSuppressionViewModel), new C754270TiL(noiseSuppressionViewModel, null));
                    }

                    @Override // X.InterfaceC1112400f3O
                    public final boolean LJJIIZ(C1112330f3H c1112330f3H) {
                        return C952230at3.LIZIZ(c1112330f3H);
                    }
                });
            } else if (Intrinsics.LJFF(abstractC775500UbU, C775520UbW.LIZ)) {
                C20441214yg.LIZIZ("NoiseDetectViewModel", "handleStartLinkMicDetect");
                C497700JfU c497700JfU = C497700JfU.LIZ;
                C497700JfU.LIZJ.put(this, new InterfaceC497710JfV() { // from class: X.0Ubc
                    @Override // X.InterfaceC497710JfV
                    public final void LIZ(EnumC768840UDy enumC768840UDy, EnumC768840UDy enumC768840UDy2) {
                        if (enumC768840UDy.isLink()) {
                            C20441214yg.LIZIZ("NoiseDetectViewModel", "broadcast scene change to linkmic");
                            this.LIZ.CQ2();
                            NoiseSuppressionViewModel noiseSuppressionViewModel = this.LIZ;
                            if (noiseSuppressionViewModel.LLIZ != null) {
                                noiseSuppressionViewModel.LLJ = true;
                                noiseSuppressionViewModel.zQ2("start link");
                            } else if (noiseSuppressionViewModel.LLIZLLLIL) {
                                C20441214yg.LIZIZ("NoiseDetectViewModel", "stop noise detect for linkmic");
                                NoiseSuppressionViewModel noiseSuppressionViewModel2 = this.LIZ;
                                noiseSuppressionViewModel2.LLJ = true;
                                noiseSuppressionViewModel2.DQ2();
                            }
                        }
                        if (enumC768840UDy2.isLink() && enumC768840UDy.isBroadcast()) {
                            C20441214yg.LIZIZ("NoiseDetectViewModel", "broadcast scene change from linkmic to broadcast");
                            NoiseSuppressionViewModel noiseSuppressionViewModel3 = this.LIZ;
                            if (noiseSuppressionViewModel3.LLJ && !noiseSuppressionViewModel3.LLJI) {
                                noiseSuppressionViewModel3.BQ2("link finish");
                            }
                            if (this.LIZ.xQ2().LIZ) {
                                this.LIZ.CQ2();
                            } else {
                                NoiseSuppressionViewModel noiseSuppressionViewModel4 = this.LIZ;
                                noiseSuppressionViewModel4.getClass();
                                C20441214yg.LIZIZ("NoiseDetectViewModel", "stopNoiseSuppression");
                                InterfaceC775610Ubf interfaceC775610Ubf3 = noiseSuppressionViewModel4.LLILZLL;
                                if (interfaceC775610Ubf3 != null) {
                                    interfaceC775610Ubf3.LIZLLL(false);
                                }
                            }
                            this.LIZ.LLJ = false;
                        }
                    }
                });
            } else if (abstractC775500UbU instanceof C775540UbY) {
                if (xQ2().LIZ) {
                    String str = ((C775540UbY) abstractC775500UbU).LIZ;
                    C20441214yg.LIZIZ("NoiseDetectViewModel", "handleCloseNoiseSuppression");
                    this.LLJI = true;
                    zQ2("close noise suppression");
                    DQ2();
                    if (C497700JfU.LIZ.LIZ().isBroadcast()) {
                        C20441214yg.LIZIZ("NoiseDetectViewModel", "stopNoiseSuppression");
                        InterfaceC775610Ubf interfaceC775610Ubf3 = this.LLILZLL;
                        if (interfaceC775610Ubf3 != null) {
                            interfaceC775610Ubf3.LIZLLL(false);
                        }
                    }
                    AQ2();
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_audio_denoise_setting_click");
                    c474500IjALIZ.LJJII(0, "audio_denoise_enabled");
                    c474500IjALIZ.LJJII(str, "enter_from");
                    c474500IjALIZ.LIZ();
                    setState(AFwS245S0000000_12.get$arr$(223));
                } else {
                    String str2 = ((C775540UbY) abstractC775500UbU).LIZ;
                    C20441214yg.LIZIZ("NoiseDetectViewModel", "handleOpenNoiseSuppression");
                    this.LLJI = true;
                    zQ2("open noise suppression");
                    DQ2();
                    if (C497700JfU.LIZ.LIZ().isBroadcast()) {
                        CQ2();
                    }
                    AQ2();
                    C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_audio_denoise_setting_click");
                    c474500IjALIZ2.LJJII(1, "audio_denoise_enabled");
                    c474500IjALIZ2.LJJII(str2, "enter_from");
                    c474500IjALIZ2.LIZ();
                    setState(AFwS245S0000000_12.get$arr$(224));
                    wQ2(new C1180604jc());
                }
            } else if (Intrinsics.LJFF(abstractC775500UbU, C775550UbZ.LIZ)) {
                setState(AFwS245S0000000_12.get$arr$(225));
            } else {
                throw new C1954807lC();
            }
        }
        return Unit.LIZ;
    }
}
