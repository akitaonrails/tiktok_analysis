package com.bytedance.android.livesdk.gallery.api;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.android.livesdk.gift.model.GiftGalleryResponse;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes.dex */
public interface GalleryApi {
    @InterfaceC1501160pAQ("/webcast/gift/gallery/")
    Object getGiftGallery(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i, @InterfaceC1501070pAH("anchor_id") long j2, @InterfaceC1501070pAH("last_played_timestamp") long j3, @InterfaceC1501070pAH("user_id") long j4, @InterfaceC1501070pAH("to_user_id") long j5, InterfaceC1364105Vn<? super GiftGalleryResponse> interfaceC1364105Vn);
}
