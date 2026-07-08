package com.ss.android.ugc.aweme.compliance.business.trashbin;

import X.C01GW;
import X.C11NZ;
import X.C452501pT;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501160pAQ;
import com.bytedance.scene.Scene;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class TrashBinApiManager {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(122));

    public interface TrashBinApi {
        @InterfaceC1501160pAQ("/aweme/v1/aweme/deletion/constraints/")
        C11NZ<DeleteCheckItemRecyclableResponse> checkItemRecyclable(@InterfaceC1501120pAM("aweme_id") String str, @InterfaceC1501120pAM(Scene.SCENE_SERVICE) int i);
    }
}
