package kotlin.jvm.internal;

import X.C09AY;
import X.C0Y3I;
import X.C0Y8T;
import X.C0YRX;
import X.C0YTK;
import X.C189200o6;
import X.C1DUV;
import X.C2252611DEt;
import X.C2256611DUd;
import X.C869590Y9l;
import X.C873900YQa;
import X.C873910YQb;
import X.C896400ZEo;
import X.InterfaceC20236714Gf;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.swap.IPhotoSwapSendCallback;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes36.dex */
public class AwS311S0300000_35 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS311S0300000_35 awS311S0300000_35, Object obj, Object obj2) {
        String uuid;
        IPhotoSwapSendCallback iPhotoSwapSendCallback;
        C0Y8T c0y8t = (C0Y8T) obj;
        C869590Y9l c869590Y9l = (C869590Y9l) obj2;
        C0YTK c0ytk = (C0YTK) awS311S0300000_35.l0;
        if (c0ytk != null) {
            c0ytk.LIZLLL(c0y8t, c869590Y9l);
        }
        if (c869590Y9l != null && C896400ZEo.LJIIIZ(c869590Y9l) && (iPhotoSwapSendCallback = (IPhotoSwapSendCallback) PluggableExtentionKt.pluggableSpi$default(IPhotoSwapSendCallback.class, false, false, false, 14, null)) != null) {
            iPhotoSwapSendCallback.LIZJ((C0Y3I) awS311S0300000_35.l1, c869590Y9l);
        }
        String str = (String) ((Map) awS311S0300000_35.l2).get("pre_stage_track_uuid");
        if (str != null && str.length() > 0) {
            if (c869590Y9l != null && (uuid = c869590Y9l.getUuid()) != null) {
                C1DUV.LIZ(str).LIZ(uuid);
            }
            C1DUV.LIZ(str).LIZIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS311S0300000_35 awS311S0300000_35, Object obj, Object obj2) {
        String uuid;
        IPhotoSwapSendCallback iPhotoSwapSendCallback;
        C0Y8T c0y8t = (C0Y8T) obj;
        C869590Y9l c869590Y9l = (C869590Y9l) obj2;
        C0YTK c0ytk = (C0YTK) awS311S0300000_35.l0;
        if (c0ytk != null) {
            c0ytk.LIZLLL(c0y8t, c869590Y9l);
        }
        if (c869590Y9l != null && C896400ZEo.LJIIIZ(c869590Y9l) && (iPhotoSwapSendCallback = (IPhotoSwapSendCallback) PluggableExtentionKt.pluggableSpi$default(IPhotoSwapSendCallback.class, false, false, false, 14, null)) != null) {
            iPhotoSwapSendCallback.LIZJ((C0Y3I) awS311S0300000_35.l1, c869590Y9l);
        }
        String str = (String) ((Map) awS311S0300000_35.l2).get("pre_stage_track_uuid");
        if (str != null && str.length() > 0) {
            if (c869590Y9l != null && (uuid = c869590Y9l.getUuid()) != null) {
                C1DUV.LIZ(str).LIZ(uuid);
            }
            C1DUV.LIZ(str).LIZIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS311S0300000_35 awS311S0300000_35, Object obj, Object obj2) {
        C2256611DUd c2256611DUd = (C2256611DUd) awS311S0300000_35.l0;
        C873910YQb c873910YQb = (C873910YQb) awS311S0300000_35.l1;
        c2256611DUd.getClass();
        C2256611DUd.LIZJ(c873910YQb, (C0YRX) obj, (C873900YQa) obj2);
        if (((InterfaceC20236714Gf) awS311S0300000_35.l2).isActive()) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) awS311S0300000_35.l2;
            Unit unit = Unit.LIZ;
            C189200o6.m2constructorimpl(unit);
            interfaceC20236714Gf.resumeWith(unit);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS311S0300000_35 awS311S0300000_35, Object obj, Object obj2) {
        C2256611DUd c2256611DUd = (C2256611DUd) awS311S0300000_35.l0;
        C873910YQb c873910YQb = (C873910YQb) awS311S0300000_35.l1;
        c2256611DUd.getClass();
        C2256611DUd.LIZJ(c873910YQb, (C0YRX) obj, (C873900YQa) obj2);
        if (((InterfaceC20236714Gf) awS311S0300000_35.l2).isActive()) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) awS311S0300000_35.l2;
            Unit unit = Unit.LIZ;
            C189200o6.m2constructorimpl(unit);
            interfaceC20236714Gf.resumeWith(unit);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS311S0300000_35(C0YTK c0ytk, C0YTK c0ytk2, C0Y3I c0y3i, Map<String, String> map) {
        super(2);
        this.$t = map;
        this.l0 = c0ytk;
        this.l1 = c0ytk2;
        this.l2 = c0y3i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS311S0300000_35(C2256611DUd c2256611DUd, C873910YQb c873910YQb, C2252611DEt c2252611DEt, int i) {
        super(2);
        this.$t = i;
        this.l0 = c2256611DUd;
        this.l1 = c873910YQb;
        this.l2 = c2252611DEt;
    }
}
