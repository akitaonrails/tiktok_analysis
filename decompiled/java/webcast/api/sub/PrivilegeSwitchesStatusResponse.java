package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.PrivilegeSwitch;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class PrivilegeSwitchesStatusResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("switch_list")
        public List<PrivilegeSwitch> switchList = new ArrayList();
    }
}
