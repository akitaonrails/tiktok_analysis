package com.ss.android.ugc.gamora.editor.lyric.api;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501200pAU;
import com.ss.android.ugc.aweme.music.model.TrimPointResponse;

/* JADX INFO: loaded from: classes3.dex */
public interface ILyricTrimPointApi {
    @InterfaceC1501200pAU("/tiktok/v1/smart/sound/trim/")
    Object requestMiniDraft(@InterfaceC1501070pAH("music_id") String str, @InterfaceC1501070pAH("video_duration") int i, @InterfaceC1501070pAH("music_duration") int i2, InterfaceC1364105Vn<? super TrimPointResponse> interfaceC1364105Vn);
}
