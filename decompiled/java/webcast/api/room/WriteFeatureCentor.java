package webcast.api.room;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class WriteFeatureCentor {

    @C09CT("elimination_count")
    public int eliminationCount;

    @C09CT("elimination_duration")
    public int eliminationDuration;

    @C09CT("feature_storage_type")
    public int featureStorageType;

    @C09CT("write_feature_type")
    public int writeFeatureType;

    @C09CT("feature_info")
    public String featureInfo = "";

    @C09CT("events")
    public List<RelativeEvent> events = new ArrayList();
}
