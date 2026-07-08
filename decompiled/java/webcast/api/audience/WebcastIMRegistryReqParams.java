package webcast.api.audience;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class WebcastIMRegistryReqParams {

    @C09CT("flags")
    public long flags;

    @C09CT("register")
    public RegisterData register;

    @C09CT(Scene.SCENE_SERVICE)
    public String scene = "";

    @C09CT("unregister")
    public RegisterData unregister;

    public static final class RegisterData {

        @C09CT("rooms")
        public List<Long> rooms = new ArrayList();

        @C09CT("users")
        public List<String> users = new ArrayList();
    }
}
