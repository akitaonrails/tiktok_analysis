package kotlin.jvm.internal;

import X.C03H5;
import X.C09AY;
import X.C0HH2;
import X.C0RK4;
import X.C16F4;
import X.C637920P0k;
import X.C701480RfO;
import X.C734390SrN;
import Y.ARunnableS44S0300000_11;
import android.view.MotionEvent;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdAceSurveyBottomBarAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public class AwS51S1300000_11 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS51S1300000_11 awS51S1300000_11, Object obj) {
        ((C0HH2) obj).LIZIZ(awS51S1300000_11.s0, new AwS590S0100000_11((AdAceSurveyBottomBarAssem) awS51S1300000_11.l1, 35), new AwS225S0300000_16((AdAceSurveyBottomBarAssem) awS51S1300000_11.l1, (Aweme) awS51S1300000_11.l2, (VideoItemParams) awS51S1300000_11.l3, 4));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS51S1300000_11 awS51S1300000_11, Object obj) {
        Assembler assembler = (Assembler) obj;
        ((ReusedUIAssem) awS51S1300000_11.l1).subscribeChildAssemState(assembler, new C0RK4(true));
        ReusedAssem reusedAssem = (ReusedAssem) awS51S1300000_11.l2;
        if (reusedAssem instanceof ReusedUISlotAssem) {
            assembler.MQ2((ReusedUIAssem) awS51S1300000_11.l1, new AwS96S1200000_11(reusedAssem, (ReusedAssem<? extends C03H5>) awS51S1300000_11.l3, (C701480RfO) awS51S1300000_11.s0, (String) 6));
        } else {
            assembler.KQ2((ReusedUIAssem) awS51S1300000_11.l1, new AwS590S0100000_11(reusedAssem, (ReusedAssem<? extends C03H5>) 403));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS51S1300000_11 awS51S1300000_11, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C734390SrN.LIZLLL((Aweme) awS51S1300000_11.l1, awS51S1300000_11.s0);
        } else {
            C734390SrN.LIZIZ((Aweme) awS51S1300000_11.l1, awS51S1300000_11.s0);
        }
        C16F4 c16f4 = (C16F4) awS51S1300000_11.l2;
        if (c16f4 != null) {
            C637920P0k.LIZ(c16f4, new ARunnableS44S0300000_11((Aweme) awS51S1300000_11.l1, c16f4, (MotionEvent) awS51S1300000_11.l3, 13));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS51S1300000_11(ReusedUIAssem reusedUIAssem, ReusedUIAssem<? extends C03H5> reusedUIAssem2, ReusedAssem<? extends C03H5> reusedAssem, C701480RfO c701480RfO, String str) {
        super(1);
        this.$t = str;
        this.l1 = reusedUIAssem;
        this.l2 = reusedUIAssem2;
        this.l3 = reusedAssem;
        this.s0 = c701480RfO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS51S1300000_11(Aweme aweme, String str, C16F4 c16f4, MotionEvent motionEvent, int i) {
        super(1);
        this.$t = i;
        this.l1 = aweme;
        this.s0 = str;
        this.l2 = c16f4;
        this.l3 = motionEvent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS51S1300000_11(String str, AdAceSurveyBottomBarAssem adAceSurveyBottomBarAssem, Aweme aweme, VideoItemParams videoItemParams, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = adAceSurveyBottomBarAssem;
        this.l2 = aweme;
        this.l3 = videoItemParams;
    }
}
