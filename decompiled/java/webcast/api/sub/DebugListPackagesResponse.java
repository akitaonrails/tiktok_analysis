package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SubPackage;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class DebugListPackagesResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("package_list")
        public List<SubPackage> packageList = new ArrayList();
    }
}
