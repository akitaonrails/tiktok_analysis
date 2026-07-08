package com.ss.android.ugc.gamora.editor.lyric.service;

import X.C01GW;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.gamora.editor.lyric.api.ILyricTrimPointApi;
import com.ss.android.ugc.gamora.editor.lyric.api.ILyricTrimPointService;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class LyricTrimPointServiceImpl implements ILyricTrimPointService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(725));

    @Override // com.ss.android.ugc.gamora.editor.lyric.api.ILyricTrimPointService
    public final Object LIZ(int i, int i2, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        return ((ILyricTrimPointApi) this.LIZ.getValue()).requestMiniDraft(str, i, i2, interfaceC1364105Vn);
    }
}
