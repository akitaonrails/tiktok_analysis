package webcast.api.linkmic_multi_guest;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common.SpotInfo;

/* JADX INFO: loaded from: classes.dex */
public final class SwitchSpotResponse {

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

        @C09CT("ui_pos")
        public List<PosIdentity> uiPos = new ArrayList();

        @C09CT("spot_list")
        public List<SpotInfo> spotList = new ArrayList();
    }
}
