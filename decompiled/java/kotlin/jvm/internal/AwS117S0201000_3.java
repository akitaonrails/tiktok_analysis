package kotlin.jvm.internal;

import X.C01GW;
import X.C09AY;
import X.C0PEM;
import X.C1ECA;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C2445209i6;
import X.C2449709ip;
import X.C2449809iq;
import X.C2450109it;
import X.C291001Au;
import X.C704830Rkn;
import X.C736680Sv4;
import X.C736820SvI;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.feed.hvr.FollowingHvrLabelInFypVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public class AwS117S0201000_3 extends C09AY implements Function2 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS117S0201000_3 awS117S0201000_3, Object obj, Object obj2) {
        Map<String, Object> map;
        Map<String, Object> map2;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            if (awS117S0201000_3.i2 == ((Number) c291001Au.LIZ).intValue()) {
                if (Intrinsics.LJFF(((C2449809iq) awS117S0201000_3.l0).LLJIJIL, "homepage_hot")) {
                    C2449809iq c2449809iq = (C2449809iq) awS117S0201000_3.l0;
                    VideoItemParams videoItemParams = (VideoItemParams) awS117S0201000_3.l1;
                    c2449809iq.getClass();
                    C1ECA.LIZ.getClass();
                    if (!C1ECA.LIZ()) {
                        c2449809iq.LJ(false);
                    } else {
                        C736680Sv4.LJIIIIZZ(c2449809iq, c2449809iq.LJI(), new C2217381BqS() { // from class: X.09i1
                            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                            public final Object get(Object obj3) {
                                return ((C2444609i0) obj3).LL;
                            }
                        }, C736820SvI.LIZLLL(), new AwS439S0200000_3(videoItemParams, c2449809iq, 4), 4);
                    }
                    C2449809iq c2449809iq2 = (C2449809iq) awS117S0201000_3.l0;
                    C704830Rkn c704830Rkn = c2449809iq2.LLILLL;
                    if (c704830Rkn != null && (map2 = c704830Rkn.LJFF) != null) {
                        map2.put("KEY_BUTTON_VM", c2449809iq2.LJI());
                    }
                    C01GW c01gw = C1ECA.LJIIIIZZ;
                    if (((Number) c01gw.getValue()).intValue() == 1) {
                        ((C2449809iq) awS117S0201000_3.l0).LJI().wQ2(((VideoItemParams) awS117S0201000_3.l1).getAweme(), "from_video_init");
                    } else if (((Number) c01gw.getValue()).intValue() == 2) {
                        C2449809iq c2449809iq3 = (C2449809iq) awS117S0201000_3.l0;
                        c2449809iq3.getClass();
                        C2450109it.LIZ.observe(c2449809iq3, (Observer) c2449809iq3.LLJILJIL.getValue());
                    }
                } else if (Intrinsics.LJFF(((C2449809iq) awS117S0201000_3.l0).LLJIJIL, "others_homepage")) {
                    C2449809iq c2449809iq4 = (C2449809iq) awS117S0201000_3.l0;
                    VideoItemParams videoItemParams2 = (VideoItemParams) awS117S0201000_3.l1;
                    c2449809iq4.getClass();
                    C1ECA.LIZ.getClass();
                    if (!C1ECA.LIZJ()) {
                        c2449809iq4.LJ(false);
                    } else {
                        C736680Sv4.LJIIIIZZ(c2449809iq4, c2449809iq4.LJII(), new C2217381BqS() { // from class: X.09iF
                            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                            public final Object get(Object obj3) {
                                return ((C2446009iE) obj3).LL;
                            }
                        }, null, new AwS439S0200000_3(videoItemParams2, c2449809iq4, 5), 6);
                    }
                    C2449809iq c2449809iq5 = (C2449809iq) awS117S0201000_3.l0;
                    C704830Rkn c704830Rkn2 = c2449809iq5.LLILLL;
                    if (c704830Rkn2 != null && (map = c704830Rkn2.LJFF) != null) {
                        map.put("KEY_BUTTON_VM", c2449809iq5.LJII());
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS117S0201000_3 awS117S0201000_3, Object obj, Object obj2) {
        Map<String, Object> map;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            if (awS117S0201000_3.i2 == ((Number) c291001Au.LIZ).intValue()) {
                C2449709ip c2449709ip = (C2449709ip) awS117S0201000_3.l0;
                C704830Rkn c704830Rkn = c2449709ip.LLILLL;
                if (c704830Rkn != null && (map = c704830Rkn.LJFF) != null) {
                    map.put("KEY_FYP_VM", c2449709ip.LJI());
                }
                FollowingHvrLabelInFypVM followingHvrLabelInFypVMLJI = ((C2449709ip) awS117S0201000_3.l0).LJI();
                Aweme aweme = ((VideoItemParams) awS117S0201000_3.l1).getAweme();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("try show label，aweme ");
                sbLIZ.append(aweme.getAid());
                sbLIZ.append(", ");
                sbLIZ.append("from_video_init");
                C2188811AlT.LIZIZ(sbLIZ);
                C23250099c.LIZLLL(followingHvrLabelInFypVMLJI.getAssemVMScope(), C0PEM.LIZJ, null, new C2445209i6(followingHvrLabelInFypVMLJI, aweme, "from_video_init", null), 2);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S0201000_3(int i, C2449709ip c2449709ip, VideoItemParams videoItemParams, int i2) {
        super(2);
        this.$t = i2;
        this.i2 = i;
        this.l0 = c2449709ip;
        this.l1 = videoItemParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S0201000_3(int i, C2449809iq c2449809iq, VideoItemParams videoItemParams, int i2) {
        super(2);
        this.$t = i2;
        this.i2 = i;
        this.l0 = c2449809iq;
        this.l1 = videoItemParams;
    }
}
