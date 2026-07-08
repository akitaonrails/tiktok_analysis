package com.ss.android.ugc.aweme.utils;

import X.C06T7;
import X.C0ZYF;
import X.C0ZYH;
import X.C869590Y9l;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.models.MessageBubbleStyle;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;

/* JADX INFO: loaded from: classes15.dex */
public interface IChatCustomizeResourceHelper {
    public static final C0ZYF LIZ = C0ZYF.LIZ;

    MessageBubbleStyle getBubbleStyleForMessage(C869590Y9l c869590Y9l);

    ConcurrentHashMap<String, MessageBubbleStyle> getBubbleStyles();

    List<C0ZYH> getCategories();

    C0ZYH getCategoryFromId(String str);

    MessageBubbleStyle getLoadedBubbleStyle(String str);

    Set<String> getSettableBubbleStyleResourceIds();

    boolean isBubbleStyleSettable(String str);

    boolean isSettableBubbleStylesReady();

    void updateSettableBubbleStyles(C06T7 c06t7, String str);

    Object updateSettableBubbleStylesSuspending(C06T7 c06t7, String str, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);
}
