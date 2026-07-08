package kotlin.jvm.internal;

import X.C09AY;
import X.C0RQ8;
import X.C0RQG;
import X.C1002190cBd;
import X.C1023640ckE;
import X.C1027620cqe;
import X.C1035880d3y;
import X.C1040740dBo;
import X.C1043500dGG;
import X.C1483410ohn;
import X.C1E1Y;
import X.C2188811AlT;
import X.C692050RCp;
import X.InterfaceC1008930cMV;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.FeatureCenterModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.preload.services.PreloadServiceImpl;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public class AwS35S1110000_16 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS35S1110000_16 awS35S1110000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1043500dGG.LIZ.getClass();
        c1023640ckE.withParam(C1043500dGG.LJLIIIL, Integer.valueOf(awS35S1110000_16.z2 ? 1 : 0));
        c1023640ckE.withParam(C1043500dGG.LJLIIL, awS35S1110000_16.s0);
        c1023640ckE.withParam(C1043500dGG.LJIILJJIL, Integer.valueOf(((C1040740dBo) awS35S1110000_16.l1).LLILLL));
        c1023640ckE.withParam(C1043500dGG.LJIILLIIL, ((C1040740dBo) awS35S1110000_16.l1).LLJI);
        c1023640ckE.withParam(C1043500dGG.LJLLI, Integer.valueOf(((C1040740dBo) awS35S1110000_16.l1).LLJJIII));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS35S1110000_16 awS35S1110000_16, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Function1<? super Boolean, Unit> function1 = ((C1027620cqe) awS35S1110000_16.l1).LJ().LIZ.LJIIL;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(zBooleanValue));
        }
        if (((C1027620cqe) awS35S1110000_16.l1).LJ().LIZIZ.LJJIZ) {
            if (zBooleanValue) {
                C0RQG c0rqgLJJIJL = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJJIJL();
                if (c0rqgLJJIJL != null) {
                    c0rqgLJJIJL.LIZ(C0RQ8.PAUSE);
                }
                InterfaceC1008930cMV interfaceC1008930cMVLIZJ = ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZIZ().LIZJ(((C1027620cqe) awS35S1110000_16.l1).LIZLLL(), ((C1027620cqe) awS35S1110000_16.l1).LJI(), awS35S1110000_16.s0, true);
                if (interfaceC1008930cMVLIZJ != null) {
                    interfaceC1008930cMVLIZJ.LJIILL(new C692050RCp(false));
                }
            } else {
                C0RQG c0rqgLJJIJL2 = ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJJIJL();
                if (c0rqgLJJIJL2 != null) {
                    c0rqgLJJIJL2.LIZ(C0RQ8.RESUME);
                }
                InterfaceC1008930cMV interfaceC1008930cMVLIZJ2 = ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZIZ().LIZJ(((C1027620cqe) awS35S1110000_16.l1).LIZLLL(), ((C1027620cqe) awS35S1110000_16.l1).LJI(), awS35S1110000_16.s0, true);
                if (interfaceC1008930cMVLIZJ2 != null) {
                    interfaceC1008930cMVLIZJ2.LJIILL(new C692050RCp(true));
                }
            }
        } else if (!awS35S1110000_16.z2 && !Intrinsics.LJFF(((C1027620cqe) awS35S1110000_16.l1).LJ().LJ.LIZ, "result_ad")) {
            if (zBooleanValue) {
                C1483410ohn.LJLJJI().LIZ();
            } else {
                C1483410ohn.LJLJJI().LJIILLIIL();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS35S1110000_16 awS35S1110000_16, Object obj) {
        PreloadServiceImpl preloadServiceImpl = (PreloadServiceImpl) awS35S1110000_16.l1;
        boolean z = awS35S1110000_16.z2;
        String str = awS35S1110000_16.s0;
        preloadServiceImpl.getClass();
        PreloadServiceImpl.LIZJ((Fragment) obj, str, z);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS35S1110000_16 awS35S1110000_16, Object obj) {
        String str;
        Integer num;
        FeatureCenterModel feature;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1E1Y.LIZ.getClass();
        c1023640ckE.withParam(C1E1Y.LJFF, "get_rule");
        C1002190cBd c1002190cBd = C1E1Y.LJ;
        if (awS35S1110000_16.z2) {
            str = "success";
        } else {
            str = "fail";
        }
        c1023640ckE.withParam(c1002190cBd, str);
        c1023640ckE.withParam(C1E1Y.LIZLLL, awS35S1110000_16.s0);
        C1002190cBd c1002190cBd2 = C1E1Y.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("features-");
        AwemeRawAd awemeRawAd = ((C1035880d3y) awS35S1110000_16.l1).getAwemeRawAd();
        if (awemeRawAd != null && (feature = awemeRawAd.getFeature()) != null) {
            num = feature.iabRecordingType;
        } else {
            num = null;
        }
        sbLIZ.append(num);
        c1023640ckE.withParam(c1002190cBd2, C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS35S1110000_16 awS35S1110000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1043500dGG.LIZ.getClass();
        c1023640ckE.withParam(C1043500dGG.LLJJJJJIL, Integer.valueOf(awS35S1110000_16.z2 ? 1 : 0));
        c1023640ckE.withParam(C1043500dGG.LLJJLIIIJLLLLLLLZ, (Integer) awS35S1110000_16.l1);
        c1023640ckE.withParam(C1043500dGG.LLJL, awS35S1110000_16.s0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS35S1110000_16(C1027620cqe c1027620cqe, String str, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1027620cqe;
        this.s0 = str;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS35S1110000_16(C1035880d3y c1035880d3y, String str, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.s0 = str;
        this.l1 = c1035880d3y;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS35S1110000_16(PreloadServiceImpl preloadServiceImpl, boolean z, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = preloadServiceImpl;
        this.z2 = z;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS35S1110000_16(Integer num, String str, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l1 = num;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS35S1110000_16(boolean z, String str, C1040740dBo c1040740dBo, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.s0 = str;
        this.l1 = c1040740dBo;
    }
}
