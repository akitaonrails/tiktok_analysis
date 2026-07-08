package com.ss.android.ugc.aweme.services.external.ui;

import X.InterfaceC1364105Vn;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.external.UIServiceCallback;
import kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public interface IEditService {
    void startEdit(Context context, EditConfig editConfig);

    void startEdit(Context context, EditConfig editConfig, ShareConfig shareConfig);

    Object startEditorProChangeBanMusic(Aweme aweme, Activity activity, long j, ChangeBanMusicConfig changeBanMusicConfig, UIServiceCallback uIServiceCallback, String str, String str2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);
}
