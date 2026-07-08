package webcast.data;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class RelationshipTodayCard {

    @C09CT("button")
    public RelationTodayCardButton button;

    @C09CT("card_type")
    public int cardType;

    @C09CT("celebration_bg")
    public ImageModel celebrationBg;

    @C09CT("celebration_icon")
    public ImageModel celebrationIcon;

    @C09CT("milestone_cur_value")
    public long milestoneCurValue;

    @C09CT("milestone_target_value")
    public long milestoneTargetValue;

    @C09CT("timestamp")
    public long timestamp;

    @C09CT("celebration_title")
    public String celebrationTitle = "";

    @C09CT("actions")
    public List<RelationshipTodayCardAction> actions = new ArrayList();

    @C09CT("crm_tag")
    public String crmTag = "";

    @C09CT("milestone_id")
    public String milestoneId = "";

    @C09CT("milestone_target_type")
    public String milestoneTargetType = "";
}
