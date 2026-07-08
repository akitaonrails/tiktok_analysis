package com.ss.android.ugc.aweme.service;

import X.C0CGL;
import X.C0Y3I;
import X.C869590Y9l;
import X.C901590ZYn;
import X.C911640Zpa;
import android.app.Activity;
import com.ss.android.ugc.aweme.creation.publish.IMediaPublishManager;
import com.ss.android.ugc.aweme.im.message.persistentext.adapter.FeatureAttachmentData;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import com.ss.android.ugc.aweme.services.dm.DMCreativeStickerFontData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public interface IIMMediaCreativeService {
    public static final C911640Zpa LIZ = C911640Zpa.LIZ;

    void LIZ();

    void LIZIZ();

    PreviewHintComponent LIZJ();

    void LIZLLL(int i, Activity activity, C0CGL c0cgl, FeatureAttachmentData featureAttachmentData, BaseHeaderComponent baseHeaderComponent, QuoteMode quoteMode, String str, String str2, String str3, String str4, Map map, Map map2, Function0 function0);

    void LJ(int i, Function1 function1, Function1 function12, boolean z);

    void LJFF(C0Y3I c0y3i, C869590Y9l c869590Y9l);

    Unit LJI(String str, List list, List list2);

    void LJII(boolean z);

    void LJIIIIZZ(Activity activity, String str, int i, String str2, String str3, String str4, Effect effect, Long l, String str5, DMCreativeStickerFontData dMCreativeStickerFontData, C901590ZYn c901590ZYn, boolean z, String str6, Map<String, String> map, Map<String, String> map2, Integer num, boolean z2, String str7, String str8, Boolean bool, boolean z3, boolean z4, boolean z5, QuoteMode quoteMode, BaseHeaderComponent baseHeaderComponent, FeatureAttachmentData featureAttachmentData);

    IMediaPublishManager LJIIIZ();
}
