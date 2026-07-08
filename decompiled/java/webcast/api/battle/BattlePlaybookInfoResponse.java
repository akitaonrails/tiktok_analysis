package webcast.api.battle;

import X.C09CT;
import com.bytedance.android.livesdkapi.depend.model.live.match.AnchorGiftModeMap;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: loaded from: classes.dex */
public final class BattlePlaybookInfoResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("anchors_permission")
        public Map<Long, Integer> anchorsPermission = new LinkedHashMap();

        @C09CT("gift_mode")
        public List<GiftMode> giftMode = new ArrayList();

        @C09CT("anchor_gift_mode_map_by_type")
        public Map<Integer, AnchorGiftModeMap> anchorGiftModeMapByType = new LinkedHashMap();

        @C09CT("match_playbooks")
        public List<Playbook> matchPlaybooks = new ArrayList();
    }
}
