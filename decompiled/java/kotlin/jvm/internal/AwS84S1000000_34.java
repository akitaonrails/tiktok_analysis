package kotlin.jvm.internal;

import X.AbstractRunnableC2239851Clb;
import X.C09AY;
import X.C2239791ClV;
import X.C2239801ClW;
import X.C2239891Clf;
import X.C2246381Cw8;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.bduploader.BDImageXUploaderBase;
import com.ss.bduploader.BDVideoUploader;
import com.ss.bduploader.BDVideoUploaderBase;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes35.dex */
public class AwS84S1000000_34 extends C09AY implements Function1 {
    public final int $t;
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
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS84S1000000_34(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AwS84S1000000_34 awS84S1000000_34, Object obj) {
        boolean z;
        AbstractRunnableC2239851Clb abstractRunnableC2239851Clb = (AbstractRunnableC2239851Clb) obj;
        if ((abstractRunnableC2239851Clb instanceof C2239791ClV) && Intrinsics.LJFF(((C2239791ClV) abstractRunnableC2239851Clb).LLILLL.LIZ.getAid(), awS84S1000000_34.s0)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$1(AwS84S1000000_34 awS84S1000000_34, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((C2239801ClW) obj).LLILLL.LIZ.getAid(), awS84S1000000_34.s0));
    }

    public static final Object invoke$10(AwS84S1000000_34 awS84S1000000_34, Object obj) {
        ((BDVideoUploaderBase) obj).setDiskResumeUniqueKey(awS84S1000000_34.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS84S1000000_34 awS84S1000000_34, Object obj) {
        ((BDVideoUploaderBase) obj).setPathName(awS84S1000000_34.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS84S1000000_34 awS84S1000000_34, Object obj) {
        ((BDVideoUploaderBase) obj).setTraceId(awS84S1000000_34.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS84S1000000_34 awS84S1000000_34, Object obj) {
        ((BDImageXUploaderBase) obj).setServerParameter(awS84S1000000_34.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS84S1000000_34 awS84S1000000_34, Object obj) {
        boolean z;
        AbstractRunnableC2239851Clb abstractRunnableC2239851Clb = (AbstractRunnableC2239851Clb) obj;
        if ((abstractRunnableC2239851Clb instanceof C2239891Clf) && Intrinsics.LJFF(((C2239891Clf) abstractRunnableC2239851Clb).LLILLL.LIZ.getAid(), awS84S1000000_34.s0)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$3(AwS84S1000000_34 awS84S1000000_34, Object obj) {
        return C2246381Cw8.LIZ((C2246381Cw8) obj, null, null, null, null, awS84S1000000_34.s0, null, false, null, 239);
    }

    public static final Object invoke$4(AwS84S1000000_34 awS84S1000000_34, Object obj) {
        String str = awS84S1000000_34.s0;
        return C2246381Cw8.LIZ((C2246381Cw8) obj, str, str, str, null, null, null, false, null, 248);
    }

    public static final Object invoke$5(AwS84S1000000_34 awS84S1000000_34, Object obj) {
        return C2246381Cw8.LIZ((C2246381Cw8) obj, awS84S1000000_34.s0, null, null, null, null, null, false, null, 254);
    }

    public static final Object invoke$6(AwS84S1000000_34 awS84S1000000_34, Object obj) {
        return C2246381Cw8.LIZ((C2246381Cw8) obj, null, null, awS84S1000000_34.s0, null, null, null, false, null, 251);
    }

    public static final Object invoke$7(AwS84S1000000_34 awS84S1000000_34, Object obj) {
        return C2246381Cw8.LIZ((C2246381Cw8) obj, null, null, awS84S1000000_34.s0, null, null, null, false, null, 251);
    }

    public static final Object invoke$8(AwS84S1000000_34 awS84S1000000_34, Object obj) {
        ((BDVideoUploaderBase) obj).setBusinessTag(awS84S1000000_34.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS84S1000000_34 awS84S1000000_34, Object obj) {
        ((BDVideoUploader) obj).setContext(awS84S1000000_34.s0);
        return Unit.LIZ;
    }
}
