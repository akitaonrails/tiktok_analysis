package com.ss.android.ugc.aweme.creatortools.videogift;

import X.C11NZ;
import X.InterfaceC1075900e6W;
import X.InterfaceC1485505rh;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;

/* JADX INFO: loaded from: classes17.dex */
public final class VideoGiftApi {
    public static SetGiftSettingsApi LIZ;
    public static InterfaceC1075900e6W LIZIZ;

    public interface SetGiftSettingsApi {
        @InterfaceC1485505rh
        @InterfaceC1501170pAR("/tiktok/v1/gift/setting/")
        C11NZ<VideoGiftSettingResponse> setGiftSettings(@InterfaceC1501050pAF("accept_video_gift") int i);
    }
}
