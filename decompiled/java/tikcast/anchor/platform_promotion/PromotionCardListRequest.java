package tikcast.anchor.platform_promotion;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PromotionCardListRequest {

    @C09CT("effective")
    public Effective effective;

    @C09CT("end_time")
    public long endTime;

    @C09CT("page")
    public int page;

    @C09CT("size")
    public int size;

    @C09CT("start_time")
    public long startTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("id_list")
    public List<String> idList = new ArrayList();

    @C09CT("name")
    public String name = "";

    @C09CT("creator_email")
    public String creatorEmail = "";

    public static final class Effective {

        @C09CT("val")
        public boolean val;
    }
}
