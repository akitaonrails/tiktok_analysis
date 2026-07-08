package com.ss.android.ugc.gamora.editor.lyric.api;

import X.C1425705i3;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface ILyricMiniDraftApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/media/api/lyric/sticker/gen_minidraft")
    Object requestMiniDraft(@InterfaceC1501050pAF("effect_panel") String str, @InterfaceC1501050pAF("lyric_sticker_inputs") String str2, @InterfaceC1501050pAF("random_seed") long j, @InterfaceC1501130pAN Map<String, String> map, InterfaceC1364105Vn<? super C1425705i3> interfaceC1364105Vn);
}
