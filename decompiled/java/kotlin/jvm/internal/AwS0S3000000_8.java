package kotlin.jvm.internal;

import X.C09AY;
import com.ss.android.ugc.aweme.composer.BasicModelDsl;
import com.ss.ugc.aweme.creation.base.TrackModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public class AwS0S3000000_8 extends C09AY implements Function1 {
    public final int $t;
    public String s0;
    public String s1;
    public String s2;

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

    public static final Object invoke$0(AwS0S3000000_8 awS0S3000000_8, Object obj) {
        ((BasicModelDsl) obj).track(new AwS0S3000000_8(awS0S3000000_8.s0, awS0S3000000_8.s1, awS0S3000000_8.s2, 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S3000000_8 awS0S3000000_8, Object obj) {
        TrackModel trackModel = (TrackModel) obj;
        trackModel.setEnterFrom(awS0S3000000_8.s0);
        trackModel.setEnterMethod(awS0S3000000_8.s1);
        trackModel.setShootWay(awS0S3000000_8.s2);
        Map<String, String> enterShootPageExtra = trackModel.getEnterShootPageExtra();
        String str = awS0S3000000_8.s2;
        enterShootPageExtra.put("shoot_way_extra", str);
        enterShootPageExtra.put("launch_method", str);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S3000000_8(String str, String str2, String str3, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
    }
}
