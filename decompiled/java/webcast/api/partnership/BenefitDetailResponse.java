package webcast.api.partnership;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.BenefitDetail;

/* JADX INFO: loaded from: classes.dex */
public final class BenefitDetailResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("benefit_detail")
        public BenefitDetail benefitDetail;
    }
}
