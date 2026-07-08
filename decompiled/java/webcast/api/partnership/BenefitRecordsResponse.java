package webcast.api.partnership;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.BenefitRecord;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class BenefitRecordsResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("benefit_records")
        public List<BenefitRecord> benefitRecords = new ArrayList();
    }
}
