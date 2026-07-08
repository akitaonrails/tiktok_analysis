package com.ss.android.ugc.aweme.im.service.service;

import X.C437780HEq;
import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public interface IQuickDmService {
    public static final C437780HEq Companion = new Object() { // from class: X.0HEq
    };

    Integer getNumEmojiToDisplayElseNull(String str);

    void onQuickReplyEmojiSendAnimations(View view, String str, Integer num, Function0<String> function0);
}
