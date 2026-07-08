package com.bytedance.android.livesdk.gallery.api;

import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.android.livesdk.gift.model.GiftGalleryEntranceResponse;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes13.dex */
public interface GalleryEntranceApi {
    @InterfaceC1501160pAQ("/webcast/gift/gallery_entrance/")
    C11NZ<GiftGalleryEntranceResponse> getGalleryEntranceData(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("anchor_id") long j, @InterfaceC1501070pAH("room_id") long j2, @InterfaceC1501070pAH("to_user_id") long j3);
}
