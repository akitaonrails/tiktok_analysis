package webcast.api.smb;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SMBOptInStep;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class GetSMBOptInProgressResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("opt_in_steps")
        public List<SMBOptInStep> optInSteps = new ArrayList();

        @C09CT("skip_form_setup")
        public boolean skipFormSetup;
    }
}
