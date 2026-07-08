package webcast.api.linkmic_multi_guest;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.linkcore.UserPosition;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.ContentPosition;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common.SpotInfo;

/* JADX INFO: loaded from: classes.dex */
public final class LayoutUpdateResponse {

    @C09CT("data")
    public ResponseData data;

    @C09CT("extra")
    public Extra extra;

    public static final class Extra {

        @C09CT("now")
        public long now;
    }

    public static final class ResponseData {

        @C09CT("layout")
        public LayoutState layout;

        @C09CT("user_pos")
        public List<UserPosition> userPos = new ArrayList();

        @C09CT("linked_user_ui_positions")
        public List<String> linkedUserUiPositions = new ArrayList();

        @C09CT("content_pos")
        public List<ContentPosition> contentPos = new ArrayList();

        @C09CT("ui_pos")
        public List<PosIdentity> uiPos = new ArrayList();

        @C09CT("layout_id")
        public String layoutId = "";

        @C09CT("spot_list")
        public List<SpotInfo> spotList = new ArrayList();
    }
}
