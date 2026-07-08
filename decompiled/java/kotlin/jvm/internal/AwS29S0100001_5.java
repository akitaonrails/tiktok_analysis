package kotlin.jvm.internal;

import X.C09AY;
import X.C0F30;
import X.C1322110kVd;
import X.C1664680tQA;
import X.C1697810uHb;
import X.C352310DrZ;
import X.C354160DuY;
import X.C356830Dyr;
import X.C360610EBv;
import X.C368130Ebz;
import X.C368230Ec9;
import X.C368280EcE;
import X.C368400EcQ;
import X.C368680Ecs;
import X.C368870EdB;
import X.C368880EdC;
import X.C368890EdD;
import X.C368920EdG;
import X.C368930EdH;
import X.C368940EdI;
import X.C368950EdJ;
import X.C370920EgU;
import X.C376330EpD;
import X.C391140FVg;
import X.C786410Ut5;
import X.DialogC1390150mHN;
import X.InterfaceC354020DuK;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class AwS29S0100001_5 extends C09AY implements Function0 {
    public final int $t;
    public float f1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS29S0100001_5 awS29S0100001_5) {
        DialogC1390150mHN dialogC1390150mHNLJIIJ;
        DialogC1390150mHN dialogC1390150mHNLJIIJ2 = ((C356830Dyr) awS29S0100001_5.l0).LJIIJ();
        if (dialogC1390150mHNLJIIJ2 != null && dialogC1390150mHNLJIIJ2.isShowing() && (dialogC1390150mHNLJIIJ = ((C356830Dyr) awS29S0100001_5.l0).LJIIJ()) != null) {
            dialogC1390150mHNLJIIJ.LJJLL(awS29S0100001_5.f1, false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS29S0100001_5 awS29S0100001_5) {
        C354160DuY c354160DuY = (C354160DuY) awS29S0100001_5.l0;
        if (c354160DuY.LLJILLL == 0) {
            c354160DuY.LLJILLL = 5;
        }
        int i = (int) (c354160DuY.LLJILLL + (awS29S0100001_5.f1 * ((100 - r1) / 100.0f) * 100));
        InterfaceC354020DuK interfaceC354020DuK = c354160DuY.LLJILJILJ;
        if (interfaceC354020DuK != null) {
            interfaceC354020DuK.onProgress(i);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS29S0100001_5 awS29S0100001_5) {
        C368680Ecs c368680Ecs;
        C368880EdC c368880EdC;
        int iLIZ;
        RelativeLayout.LayoutParams layoutParams;
        float f = C368130Ebz.LIZLLL;
        C368870EdB c368870EdB = (C368870EdB) awS29S0100001_5.l0;
        double d = c368870EdB.LLJ * ((double) awS29S0100001_5.f1);
        c368870EdB.LLJ = d;
        if (d <= c368870EdB.getLimitedMinScale()) {
            ((C368870EdB) awS29S0100001_5.l0).LLJ = r2.getLimitedMinScale();
        }
        C368870EdB c368870EdB2 = (C368870EdB) awS29S0100001_5.l0;
        double d2 = f;
        if (c368870EdB2.LLJ >= d2) {
            c368870EdB2.LLJ = d2;
        }
        int i = C360610EBv.LIZ;
        C360610EBv.LIZ = (int) (((double) LSPassThroughRecordSizeConfig.DEFAULT) / c368870EdB2.LLJ);
        C368930EdH c368930EdH = c368870EdB2.LLILLL;
        if (c368930EdH != null && (c368880EdC = c368930EdH.LLJI) != null) {
            for (C368950EdJ c368950EdJ : (ArrayList) c368880EdC.LLJI) {
                C368280EcE c368280EcE = c368950EdJ.LIZ;
                C368890EdD c368890EdD = c368950EdJ.LIZIZ;
                NLETrackSlot mainTrackSlot$editor_trackpanel_release = c368280EcE.getMainTrackSlot$editor_trackpanel_release();
                if (mainTrackSlot$editor_trackpanel_release != null) {
                    iLIZ = C352310DrZ.LIZ(mainTrackSlot$editor_trackpanel_release.getDuration());
                } else {
                    iLIZ = 0;
                }
                float fLIZJ = (iLIZ * C360610EBv.LIZJ()) + (c368880EdC.LLILLL * 2);
                ViewGroup.LayoutParams layoutParams2 = c368280EcE.getLayoutParams();
                int i2 = (int) fLIZJ;
                layoutParams2.width = i2;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c368280EcE);
                c368280EcE.setLayoutParams(layoutParams2);
                ViewGroup.LayoutParams layoutParams3 = c368890EdD.getLayoutParams();
                layoutParams3.width = i2;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c368890EdD);
                c368890EdD.setLayoutParams(layoutParams3);
                c368280EcE.LIZIZ();
                float fLIZJ2 = (c368280EcE.LLILZLL / c368280EcE.LLIZ) * C360610EBv.LIZJ();
                C368230Ec9 c368230Ec9 = c368280EcE.LLILLL;
                if (c368230Ec9 != null) {
                    c368230Ec9.LJ(fLIZJ2);
                }
                C368230Ec9 c368230Ec92 = c368280EcE.LLILLL;
                if (c368230Ec92 != null) {
                    c368230Ec92.invalidate();
                }
                int i3 = 0;
                for (C368940EdI c368940EdI : c368890EdD.LLJJJIL) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        C368940EdI c368940EdI2 = c368940EdI;
                        ViewGroup.LayoutParams layoutParams4 = c368940EdI2.LIZ.getLayoutParams();
                        if ((layoutParams4 instanceof RelativeLayout.LayoutParams) && (layoutParams = (RelativeLayout.LayoutParams) layoutParams4) != null) {
                            layoutParams.width = c368890EdD.LJI(c368940EdI2);
                            layoutParams.setMarginStart(c368890EdD.LJFF(c368940EdI2));
                            C368400EcQ c368400EcQ = c368940EdI2.LIZ;
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c368400EcQ);
                            c368400EcQ.setLayoutParams(layoutParams);
                        }
                        i3 = i4;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                c368890EdD.requestLayout();
                c368890EdD.invalidate();
            }
            C370920EgU c370920EgU = c368880EdC.LLIZLLLIL;
            if (c370920EgU != null) {
                c370920EgU.LJFF(false);
            }
        }
        C368920EdG c368920EdG = ((C368870EdB) awS29S0100001_5.l0).LL;
        if (c368920EdG != null) {
            c368920EdG.requestLayout();
        }
        C368870EdB c368870EdB3 = (C368870EdB) awS29S0100001_5.l0;
        long j = c368870EdB3.LLILZLL;
        C368680Ecs c368680Ecs2 = c368870EdB3.LLILZ;
        if ((c368680Ecs2 == null || c368680Ecs2.getScrollX() != ((int) (j * C360610EBv.LIZJ()))) && (c368680Ecs = ((C368870EdB) awS29S0100001_5.l0).LLILZ) != null) {
            C368680Ecs.e0(c368680Ecs, (int) (j * C360610EBv.LIZJ()), false, false, 6);
        }
        C368680Ecs c368680Ecs3 = ((C368870EdB) awS29S0100001_5.l0).LLILZ;
        if (c368680Ecs3 != null) {
            c368680Ecs3.setTimelineScale(C360610EBv.LIZJ());
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS29S0100001_5 awS29S0100001_5) {
        float f;
        C0F30 c0f30 = (C0F30) awS29S0100001_5.l0;
        C376330EpD c376330EpD = c0f30.LLILLJJLI;
        if (c0f30.e0()) {
            f = -awS29S0100001_5.f1;
        } else {
            f = awS29S0100001_5.f1;
        }
        C786410Ut5.Xc(c376330EpD, f);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS29S0100001_5 awS29S0100001_5) {
        View view = (View) awS29S0100001_5.l0;
        float f = awS29S0100001_5.f1;
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        C786410Ut5.Ob(view, f);
        C786410Ut5.pc(view, f);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS29S0100001_5 awS29S0100001_5) {
        ((C1664680tQA) ((C391140FVg) awS29S0100001_5.l0).LLJ.getValue()).LIZLLL(new AwS3S0000001_5(awS29S0100001_5.f1, 22), true);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS29S0100001_5(C354160DuY c354160DuY, float f, int i) {
        super(0);
        this.$t = i;
        this.l0 = c354160DuY;
        this.f1 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS29S0100001_5(C356830Dyr c356830Dyr, float f, int i) {
        super(0);
        this.$t = i;
        this.l0 = c356830Dyr;
        this.f1 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS29S0100001_5(C368870EdB c368870EdB, float f, int i) {
        super(0);
        this.$t = i;
        this.l0 = c368870EdB;
        this.f1 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS29S0100001_5(C0F30 c0f30, float f, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0f30;
        this.f1 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS29S0100001_5(C391140FVg c391140FVg, float f, int i) {
        super(0);
        this.$t = i;
        this.l0 = c391140FVg;
        this.f1 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS29S0100001_5(C1322110kVd c1322110kVd, float f, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1322110kVd;
        this.f1 = f;
    }
}
