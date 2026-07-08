package webcast.api.partnership;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class RewardDropsClaimRequest {

    @C09CT("round")
    public int round;

    @C09CT("drops_id")
    public String dropsId = "";

    @C09CT("task_id")
    public String taskId = "";

    @C09CT("room_id")
    public String roomId = "";

    @C09CT("anchor_id")
    public String anchorId = "";

    @C09CT("input")
    public String input = "";

    public static final class GameAccountInputPatternInfo {

        @C09CT("input_patterns")
        public List<InputPatternItem> inputPatterns = new ArrayList();

        @C09CT("version_id")
        public String versionId = "";
    }

    public static final class InputPatternItem {

        @C09CT("pattern_index")
        public int patternIndex;

        @C09CT("pattern_value")
        public String patternValue = "";
    }
}
