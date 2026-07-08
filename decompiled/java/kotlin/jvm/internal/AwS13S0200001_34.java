package kotlin.jvm.internal;

import X.C09AY;
import X.C2215191Bmv;
import X.C817403Hg;
import X.DialogC1390150mHN;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureUploadHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes35.dex */
public class AwS13S0200001_34 extends C09AY implements Function1 {
    public final int $t;
    public float f2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS13S0200001_34 awS13S0200001_34, Object obj) {
        C2215191Bmv.invokeSuspend$safeUpdateProgress((DialogC1390150mHN) awS13S0200001_34.l0, (C817403Hg) awS13S0200001_34.l1, C2215191Bmv.invokeSuspend$getProgress(awS13S0200001_34.f2, 1.0f, ((Number) obj).floatValue()));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS13S0200001_34 awS13S0200001_34, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        AIGCPictureUploadHandler aIGCPictureUploadHandler = (AIGCPictureUploadHandler) awS13S0200001_34.l0;
        DialogC1390150mHN dialogC1390150mHN = (DialogC1390150mHN) awS13S0200001_34.l1;
        float f = awS13S0200001_34.f2;
        aIGCPictureUploadHandler.getClass();
        float f2 = (1.0f / f) * 100;
        float f3 = 100.0f;
        if (f2 < 100.0f) {
            f3 = ((1 / f) * fFloatValue) + f2;
        }
        aIGCPictureUploadHandler.LJI(f3, dialogC1390150mHN);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS13S0200001_34(DialogC1390150mHN dialogC1390150mHN, C817403Hg c817403Hg, float f, int i) {
        super(1);
        this.$t = i;
        this.f2 = f;
        this.l0 = dialogC1390150mHN;
        this.l1 = c817403Hg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS13S0200001_34(AIGCPictureUploadHandler aIGCPictureUploadHandler, DialogC1390150mHN dialogC1390150mHN, float f, int i) {
        super(1);
        this.$t = i;
        this.l0 = aIGCPictureUploadHandler;
        this.l1 = dialogC1390150mHN;
        this.f2 = f;
    }
}
