package com.ss.android.ugc.aweme.social.creation.record.launch.toolbar.microphone;

import X.C054G;
import X.C05YD;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C09IC;
import X.C0PEM;
import X.C13LE;
import X.C155000ia;
import X.C1659920tIU;
import X.C1659970tIZ;
import X.C1659980tIa;
import X.C1660080tIk;
import X.C1664750tQH;
import X.C1664770tQJ;
import X.C19514711Wn;
import X.C19741112Lp;
import X.C19EG;
import X.C1BNE;
import X.C1C7U;
import X.C1DFH;
import X.C1DRG;
import X.C2020607vo;
import X.C2107308Nj;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C533930Kwp;
import X.InterfaceC1364105Vn;
import X.InterfaceC1461640o8g;
import X.InterfaceC1658490tGB;
import X.InterfaceC1660090tIl;
import X.InterfaceC1660130tIp;
import X.InterfaceC19515111Wr;
import X.InterfaceC2217461Bqa;
import X.InterfaceC379610EuV;
import X.InterfaceC497601wk;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.social.creation.record.launch.toolbar.microphone.ToolbarMicHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: loaded from: classes26.dex */
public final class ToolbarMicHandler implements InterfaceC1660130tIp<C1659920tIU>, InterfaceC379610EuV {
    public static final C1659980tIa LLILZIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C1DRG LL;
    public final C1664750tQH LLILLJJLI;
    public final C1664750tQH LLILLL;
    public final C2252321DDq LLILZ = C1BNE.LIZ(new C1659970tIZ(false));

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0tIa] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ToolbarMicHandler.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(ToolbarMicHandler.class, "toolbarComponent", "getToolbarComponent()Lcom/ss/android/ugc/aweme/social/creation/record/viewmodel/toolbar/ToolbarApiComponent;", 0)};
        LLILZIL = new Object() { // from class: X.0tIa
        };
    }

    @Override // X.InterfaceC1660130tIp
    public final void LIZIZ() {
        LLILZIL.getClass();
        if (C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO")) {
            return;
        }
        C19741112Lp c19741112Lp = C19741112Lp.LIZ;
        C19EG c19egLIZJ = LIZJ();
        c19741112Lp.getClass();
        final boolean zLJI = C19741112Lp.LJI(c19egLIZJ, "android.permission.RECORD_AUDIO", false);
        C19514711Wn.LIZIZ.LIZIZ(LIZJ(), TokenCert.Companion.with("bpea-request_audio_by_click_mic")).LIZIZ("android.permission.RECORD_AUDIO").LIZJ(new InterfaceC19515111Wr() { // from class: X.0tIY
            @Override // X.InterfaceC19515111Wr
            public final void onCanceled() {
            }

            @Override // X.InterfaceC19515111Wr
            public final void LIZ(C0HWO... c0hwoArr) {
                C0HWO c0hwo = (C0HWO) C13LQ.LJIL(c0hwoArr);
                if (c0hwo.LIZIZ == EnumC442280HVy.DENIED_PERMANENT && zLJI) {
                    C540290LGx c540290LGx = C540290LGx.LIZ;
                    C19EG c19egLIZJ2 = this.LIZJ();
                    c540290LGx.getClass();
                    C540290LGx.LJIILIIL(c19egLIZJ2);
                    return;
                }
                if (c0hwo.LIZ()) {
                    C2252321DDq c2252321DDq = this.LLILZ;
                    c2252321DDq.getValue().getClass();
                    c2252321DDq.setValue(new C1659970tIZ(true));
                    ToolbarMicHandler toolbarMicHandler = this;
                    ((InterfaceC1658490tGB) toolbarMicHandler.LLILLL.getValue(toolbarMicHandler, ToolbarMicHandler.LLILZLL[1])).WF1(C1659920tIU.LIZ, false);
                    return;
                }
                C2252321DDq c2252321DDq2 = this.LLILZ;
                c2252321DDq2.getValue().getClass();
                c2252321DDq2.setValue(new C1659970tIZ(false));
            }
        });
    }

    public final C19EG LIZJ() {
        return (C19EG) this.LLILLJJLI.getValue(this, LLILZLL[0]);
    }

    @Override // X.InterfaceC1660130tIp
    public final C05YD<InterfaceC1461640o8g<C1659920tIU>> getState() {
        return C09IC.LIZIZ(this.LLILZ);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.social.creation.record.launch.toolbar.microphone.ToolbarMicHandler$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes4.dex */
    @C09DV(c = "com.ss.android.ugc.aweme.social.creation.record.launch.toolbar.microphone.ToolbarMicHandler$1", f = "ToolbarMicHandler.kt", l = {}, m = "invokeSuspend")
    public final class AnonymousClass1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public AnonymousClass1(InterfaceC1364105Vn<? super AnonymousClass1> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return ToolbarMicHandler.this.new AnonymousClass1(interfaceC1364105Vn);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            final Lifecycle lifecycle;
            C1C7U.LIZ("ToolbarMicHandler@41da.<init>$1");
            C099R.LJFF();
            C155000ia.LIZIZ(obj);
            C19EG c19egLIZJ = ToolbarMicHandler.this.LIZJ();
            if ((c19egLIZJ instanceof LifecycleOwner) && c19egLIZJ != null && (lifecycle = c19egLIZJ.getLifecycle()) != null) {
                final ToolbarMicHandler toolbarMicHandler = ToolbarMicHandler.this;
                lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.social.creation.record.launch.toolbar.microphone.ToolbarMicHandler$1$1$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        int i = C2020607vo.LIZ[event.ordinal()];
                        if (i != 1) {
                            if (i == 2) {
                                lifecycle.removeObserver(this);
                                return;
                            }
                            return;
                        }
                        ToolbarMicHandler.LLILZIL.getClass();
                        boolean zLIZLLL = C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO");
                        C2252321DDq c2252321DDq = toolbarMicHandler.LLILZ;
                        c2252321DDq.getValue().getClass();
                        c2252321DDq.setValue(new C1659970tIZ(zLIZLLL));
                        if (!zLIZLLL) {
                            return;
                        }
                        ToolbarMicHandler toolbarMicHandler2 = toolbarMicHandler;
                        ((InterfaceC1658490tGB) toolbarMicHandler2.LLILLL.getValue(toolbarMicHandler2, ToolbarMicHandler.LLILZLL[1])).WF1(C1659920tIU.LIZ, false);
                    }
                });
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ToolbarMicHandler@41da.<init>$1");
            return unit;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }
    }

    public ToolbarMicHandler(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLJJLI = C1664770tQJ.LIZ(c1drg, C19EG.class, null);
        this.LLILLL = C1664770tQJ.LIZ(c1drg, InterfaceC1658490tGB.class, null);
        C054G c054gLIZ = C2296808zG.LIZ(C2296908zH.LIZ());
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c054gLIZ, C2107308Nj.LIZ, null, new AnonymousClass1(null), 2);
    }

    @Override // X.InterfaceC1660130tIp
    public final void LIZ(InterfaceC1660090tIl interfaceC1660090tIl) {
        C1660080tIk.LIZ(this, interfaceC1660090tIl);
    }
}
