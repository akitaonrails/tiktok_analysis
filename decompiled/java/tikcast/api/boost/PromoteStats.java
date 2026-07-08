package tikcast.api.boost;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class PromoteStats {

    @C09CT("active")
    public boolean active;

    @C09CT("advertisers")
    public List<Advertiser> advertisers = new ArrayList();

    @C09CT("end_time")
    public long endTime;

    @C09CT("impressions")
    public long impressions;

    @C09CT("new_followers")
    public long newFollowers;

    @C09CT("start_time")
    public long startTime;

    @C09CT("viewers")
    public long viewers;

    public static final class Advertiser {

        @C09CT("avatar")
        public ImageModel avatar;

        @C09CT("uid")
        public long uid;
    }
}
