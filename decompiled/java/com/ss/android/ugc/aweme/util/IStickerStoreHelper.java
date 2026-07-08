package com.ss.android.ugc.aweme.util;

import X.AbstractC450200Hl4;
import X.C01S9;
import X.C0HY9;
import X.EnumC441530HTb;
import X.InterfaceC1364105Vn;
import X.InterfaceC450440HlS;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.common.model.StickerVariant;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.sticker.api.model.StickerSetInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public interface IStickerStoreHelper {
    public static final C0HY9 LIZ = C0HY9.LIZ;

    Object LIZ(String str, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);

    Object LIZIZ(String str, String str2, View view, long j, String str3, int i, String str4, Integer num, InterfaceC450440HlS interfaceC450440HlS, Function0<Unit> function0, boolean z, Integer num2, Integer num3, boolean z2, String str5, EnumC441530HTb enumC441530HTb, Integer num4, String str6, boolean z3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    StickerTemplate LIZJ(StickerItem stickerItem, Context context);

    boolean LIZLLL(String str);

    Object LJ(Long l, String str, InterfaceC1364105Vn<? super StickerSetInfo> interfaceC1364105Vn);

    Object LJFF(View view, Long l, String str, Integer num, String str2, Long l2, Integer num2, InterfaceC450440HlS interfaceC450440HlS, Integer num3, String str3, boolean z, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    C01S9<AbstractC450200Hl4> getFavouriteStickerUpdateFlow();

    void updateFavStickerVariant(long j, @StickerVariant int i);
}
