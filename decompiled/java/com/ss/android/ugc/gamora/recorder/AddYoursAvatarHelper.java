package com.ss.android.ugc.gamora.recorder;

import X.C01GW;
import X.C09CT;
import X.C11NZ;
import X.C11S5;
import X.C1701940uOG;
import X.C452501pT;
import X.C516201zk;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import Y.AfS178S0100000_9;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class AddYoursAvatarHelper {
    public static final AddYoursAvatarHelper LIZ = new AddYoursAvatarHelper();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(359));
    public static final Map<Long, List<AddYoursAvatar>> LIZJ = new LinkedHashMap();
    public static List<AddYoursAvatar> LIZLLL;

    public interface Api {
        @InterfaceC1501160pAQ("/tiktok/v1/addyours/topic/sticker")
        C11NZ<Response> getTopics(@InterfaceC1501070pAH("topic_id") long j, @InterfaceC1501070pAH("text") String str);
    }

    public static final class Response {

        @C09CT("status_code")
        public final Integer statusCode;

        @C09CT("sticker")
        public final AddYoursStickerStruct sticker;

        public Response() {
            this(null, null);
        }

        public Response(AddYoursStickerStruct addYoursStickerStruct, Integer num) {
            this.sticker = addYoursStickerStruct;
            this.statusCode = num;
        }
    }

    public static void LIZ(long j, Function2 function2) {
        boolean zLJI = MethodIDManager.LJI(202485);
        ((Api) LIZIZ.getValue()).getTopics(j, "").LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS178S0100000_9(function2, 33), new C516201zk(function2, 281));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
