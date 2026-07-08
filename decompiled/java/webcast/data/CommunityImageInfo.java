package webcast.data;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class CommunityImageInfo {

    @C09CT("generated_image")
    public ImageModel generatedImage;

    @C09CT("redemption_records")
    public Map<Integer, CommunityRedemptionRecord> redemptionRecords = new LinkedHashMap();
}
