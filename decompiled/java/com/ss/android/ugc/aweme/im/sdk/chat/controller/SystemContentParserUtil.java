package com.ss.android.ugc.aweme.im.sdk.chat.controller;

import X.C13LQ;
import X.C1AF0;
import X.InterfaceC1631630sYr;
import android.text.SpannableStringBuilder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import com.ss.android.ugc.aweme.im.message.content.utils.ISystemContentParserUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class SystemContentParserUtil implements ISystemContentParserUtil {
    @Override // com.ss.android.ugc.aweme.im.message.content.utils.ISystemContentParserUtil
    public final Pair<Boolean, SpannableStringBuilder> parse(String str, String str2, SystemContent.Key[] keyArr, Function1<? super SystemContent.Key, Boolean> function1, Function1<? super SystemContent.Key, Boolean> function12, InterfaceC1631630sYr<? super SystemContent.Key, ? super SpannableStringBuilder, ? super Integer, ? super Integer, Unit> interfaceC1631630sYr) {
        String name;
        Object next;
        try {
            List listLJLI = C13LQ.LJLI(keyArr);
            Sequence sequenceFindAll$default = Regex.findAll$default(SystemContent.Companion.getREGEX(), str2, 0, 2, null);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int length = spannableStringBuilder.length();
            Iterator it2 = sequenceFindAll$default.iterator();
            while (true) {
                String str3 = "#";
                if (it2.hasNext()) {
                    MatchResult matchResult = (MatchResult) it2.next();
                    spannableStringBuilder.append((CharSequence) str2.substring(length, matchResult.LIZIZ().LL));
                    String value = matchResult.getValue();
                    String strSubstring = value.substring(2, value.length() - 2);
                    Iterator it3 = ((ArrayList) listLJLI).iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (Intrinsics.LJFF(((SystemContent.Key) next).getKey(), strSubstring)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    SystemContent.Key key = (SystemContent.Key) next;
                    if (key != null) {
                        ((ArrayList) listLJLI).remove(key);
                        if (function1.invoke(key).booleanValue()) {
                            return new Pair<>(Boolean.FALSE, new SpannableStringBuilder(str2));
                        }
                        if (!function12.invoke(key).booleanValue()) {
                            int length2 = spannableStringBuilder.length();
                            String name2 = key.getName();
                            if (name2 != null) {
                                str3 = name2;
                            }
                            spannableStringBuilder.append((CharSequence) str3);
                            interfaceC1631630sYr.invoke(key, spannableStringBuilder, Integer.valueOf(length2), Integer.valueOf(spannableStringBuilder.length()));
                        }
                    }
                    length = matchResult.LIZIZ().LLILLJJLI + 1;
                } else {
                    spannableStringBuilder.append((CharSequence) str2.substring(length));
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                    for (SystemContent.Key key2 : (ArrayList) listLJLI) {
                        if (key2.getKey() != null) {
                            String name3 = key2.getName();
                            if (name3 == null || name3.length() == 0) {
                                name = "#";
                            } else {
                                name = key2.getName();
                                if (name == null) {
                                    name = "";
                                }
                            }
                            int iLJJJ = a0.LJJJ(spannableStringBuilder, name, 0, false, 6);
                            if (iLJJJ >= 0) {
                                interfaceC1631630sYr.invoke(key2, spannableStringBuilder2, Integer.valueOf(iLJJJ), Integer.valueOf(iLJJJ + name.length()));
                            }
                        }
                    }
                    return new Pair<>(Boolean.TRUE, spannableStringBuilder2);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            return new Pair<>(Boolean.FALSE, new SpannableStringBuilder(str2));
        }
    }
}
