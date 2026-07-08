package kotlin.jvm.internal;

import X.C09AY;
import com.ss.bduploader.BDVideoUploader;
import com.ss.bduploader.BDVideoUploaderBase;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes35.dex */
public class AwS45S0001000_34 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f1002i0;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS45S0001000_34(int i) {
        super(1);
        this.$t = i;
        this.f1002i0 = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS45S0001000_34(int i, int i2) {
        super(1);
        this.$t = i2;
        this.f1002i0 = i;
    }

    public static final Object invoke$0(AwS45S0001000_34 awS45S0001000_34, Object obj) {
        ((BDVideoUploaderBase) obj).setPreUploadEncryptionMode(awS45S0001000_34.f1002i0);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS45S0001000_34 awS45S0001000_34, Object obj) {
        ((BDVideoUploaderBase) obj).setScenesTag(String.valueOf(awS45S0001000_34.f1002i0));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS45S0001000_34 awS45S0001000_34, Object obj) {
        ((BDVideoUploaderBase) obj).setSliceSize(awS45S0001000_34.f1002i0);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS45S0001000_34 awS45S0001000_34, Object obj) {
        ((BDVideoUploaderBase) obj).setSocketNum(awS45S0001000_34.f1002i0);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS45S0001000_34 awS45S0001000_34, Object obj) {
        BDVideoUploader bDVideoUploader = (BDVideoUploader) obj;
        int i = awS45S0001000_34.f1002i0;
        if (i > 0) {
            bDVideoUploader.setSpeedTestThresh(i);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS45S0001000_34 awS45S0001000_34, Object obj) {
        ((BDVideoUploader) obj).setSpeedTestValue(awS45S0001000_34.f1002i0);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS45S0001000_34 awS45S0001000_34, Object obj) {
        ((BDVideoUploader) obj).setRetryStatesOption(awS45S0001000_34.f1002i0);
        return Unit.LIZ;
    }
}
