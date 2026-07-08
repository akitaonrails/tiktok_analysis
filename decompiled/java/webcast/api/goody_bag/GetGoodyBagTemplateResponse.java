package webcast.api.goody_bag;

import X.C09CT;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagCommonSelected;
import com.bytedance.android.livesdk.goody_bag.model.ParticipateThreshold;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class GetGoodyBagTemplateResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class CoinTemplate {

        @C09CT("total_coin")
        public int totalCoin;

        @C09CT("total_coin_options")
        public List<Integer> totalCoinOptions = new ArrayList();
    }

    public static final class CommonTemplate {

        @C09CT("common_selected")
        public GoodyBagCommonSelected commonSelected;

        @C09CT("winner_headcount_options")
        public List<Integer> winnerHeadcountOptions = new ArrayList();

        @C09CT("participate_method_options")
        public List<Integer> participateMethodOptions = new ArrayList();

        @C09CT("countdown_minute_options")
        public List<Integer> countdownMinuteOptions = new ArrayList();

        @C09CT("participate_threshold_options")
        public List<ParticipateThreshold> participateThresholdOptions = new ArrayList();
    }

    public static final class PreCheckResult {

        @C09CT("i18n_prompts")
        public String i18nPrompts = "";

        @C09CT("status_code")
        public int statusCode;
    }

    public static final class ResponseData {

        @C09CT("coin_template")
        public CoinTemplate coinTemplate;

        @C09CT("common_template")
        public CommonTemplate commonTemplate;

        @C09CT("result")
        public PreCheckResult result;

        @C09CT("skin_id")
        public long skinId;

        @C09CT("skin_reward")
        public boolean skinReward;

        @C09CT("template_extra")
        public TemplateExtra templateExtra;
    }

    public static final class TemplateExtra {

        @C09CT("online_club_fans_number")
        public Map<Long, Long> onlineClubFansNumber = new LinkedHashMap();
    }
}
