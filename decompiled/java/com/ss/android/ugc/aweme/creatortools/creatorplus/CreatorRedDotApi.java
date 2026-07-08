package com.ss.android.ugc.aweme.creatortools.creatorplus;

import X.C01GW;
import X.C452501pT;
import X.EnumC452301pR;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501240pAY;
import com.bytedance.scene.Scene;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class CreatorRedDotApi {
    public static final C01GW<InterfaceC0015CreatorRedDotApi> LIZ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS206S0000000_18.get$arr$(94));

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.creatortools.creatorplus.CreatorRedDotApi$CreatorRedDotApi, reason: collision with other inner class name */
    public interface InterfaceC0015CreatorRedDotApi {
        @InterfaceC1501240pAY("/tiktok/studio_platform/red_dot/update")
        Object clearCreatorRedDot(@InterfaceC1501070pAH("tool") String str, InterfaceC1364105Vn<Object> interfaceC1364105Vn);

        @InterfaceC1501200pAU("/tiktok/studio_platform/red_dot")
        Object creatorRedDotShow(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, InterfaceC1364105Vn<Object> interfaceC1364105Vn);
    }
}
