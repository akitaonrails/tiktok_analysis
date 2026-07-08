package com.ss.android.ugc.aweme.tako.otherpage.share.api;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes10.dex */
public interface TakoShareApi {
    @InterfaceC1501160pAQ("/aweme/v1/tako/load/share/message/")
    Object loadShareMessage(@InterfaceC1501070pAH("share_id") String str, @InterfaceC1501070pAH("cursor_message_id") String str2, InterfaceC1364105Vn<? super LoadShareMessageResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/aweme/v1/tako/share/message/")
    Object shareMessage(@InterfaceC1501050pAF("share_id") String str, @InterfaceC1501050pAF("share_messages") String str2, @InterfaceC1501050pAF(Scene.SCENE_SERVICE) String str3, @InterfaceC1501050pAF("dm_msg_content") String str4, InterfaceC1364105Vn<? super ShareMessageResponse> interfaceC1364105Vn);
}
