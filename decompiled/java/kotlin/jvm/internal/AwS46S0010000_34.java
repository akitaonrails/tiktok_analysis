package kotlin.jvm.internal;

import X.C09AY;
import X.C2245781CvA;
import X.C291001Au;
import X.InterfaceC2214741BmC;
import com.ss.android.ugc.aweme.creative.model.edit.EditEffectModel;
import com.ss.bduploader.BDImageXUploaderBase;
import com.ss.bduploader.BDVideoUploader;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes35.dex */
public class AwS46S0010000_34 extends C09AY implements Function1 {
    public final int $t;
    public boolean z0;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS46S0010000_34(int i) {
        super(1);
        this.$t = i;
        this.z0 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS46S0010000_34(boolean z, int i) {
        super(1);
        this.$t = i;
        this.z0 = z;
    }

    public static final Object invoke$0(AwS46S0010000_34 awS46S0010000_34, Object obj) {
        return C2245781CvA.LIZ((C2245781CvA) obj, new C291001Au(Boolean.valueOf(awS46S0010000_34.z0)), null, null, null, null, null, null, 126);
    }

    public static final Object invoke$1(AwS46S0010000_34 awS46S0010000_34, Object obj) {
        return C2245781CvA.LIZ((C2245781CvA) obj, new C291001Au(Boolean.valueOf(awS46S0010000_34.z0)), null, null, null, null, null, null, 126);
    }

    public static final Object invoke$2(AwS46S0010000_34 awS46S0010000_34, Object obj) {
        return EditEffectModel.LIZ((EditEffectModel) obj, awS46S0010000_34.z0);
    }

    public static final Object invoke$3(AwS46S0010000_34 awS46S0010000_34, Object obj) {
        ((InterfaceC2214741BmC) obj).setOperationResult(Boolean.valueOf(awS46S0010000_34.z0));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS46S0010000_34 awS46S0010000_34, Object obj) {
        ((InterfaceC2214741BmC) obj).setOperationResult(Boolean.valueOf(awS46S0010000_34.z0));
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS46S0010000_34 awS46S0010000_34, Object obj) {
        ((BDVideoUploader) obj).setPreUploadMode(awS46S0010000_34.z0 ? 1 : 0);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS46S0010000_34 awS46S0010000_34, Object obj) {
        ((BDVideoUploader) obj).setPrivateVideo(awS46S0010000_34.z0);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS46S0010000_34 awS46S0010000_34, Object obj) {
        ((BDImageXUploaderBase) obj).setOpenBoe(awS46S0010000_34.z0);
        return Unit.LIZ;
    }
}
