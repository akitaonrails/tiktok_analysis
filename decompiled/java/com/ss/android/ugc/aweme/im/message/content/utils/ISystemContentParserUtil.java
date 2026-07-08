package com.ss.android.ugc.aweme.im.message.content.utils;

import X.InterfaceC1631630sYr;
import android.text.SpannableStringBuilder;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public interface ISystemContentParserUtil {
    Pair<Boolean, SpannableStringBuilder> parse(String str, String str2, SystemContent.Key[] keyArr, Function1<? super SystemContent.Key, Boolean> function1, Function1<? super SystemContent.Key, Boolean> function12, InterfaceC1631630sYr<? super SystemContent.Key, ? super SpannableStringBuilder, ? super Integer, ? super Integer, Unit> interfaceC1631630sYr);
}
