package com.ss.android.ugc.gamora.editor.recommendeffect.net;

import X.C01GW;
import X.C11NZ;
import X.C452501pT;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import java.util.List;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: loaded from: classes23.dex */
public final class RecommendEffectRequestApi {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(233));

    public interface Api {
        @InterfaceC1501160pAQ("/aweme/v1/sticker/recommendation/")
        C11NZ<RecommendEffectResponse> getRecommendEffects(@InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("tos_url") String str, @InterfaceC1501070pAH("algorithm_key") String str2, @InterfaceC1501070pAH("original_resolution_list") List<String> list, @InterfaceC1501070pAH("video_length_list") List<Float> list2, @InterfaceC1501070pAH("shoot_way") String str3, @InterfaceC1501070pAH("content_source") String str4, @InterfaceC1501070pAH("material_type") String str5, @InterfaceC1501070pAH("is_multi_content") String str6, @InterfaceC1501070pAH("mix_type") String str7, @InterfaceC1501070pAH("music_id") String str8, @InterfaceC1501070pAH("sticker_id_list") String str9, @InterfaceC1501070pAH("effect_id_list") String str10, @InterfaceC1501070pAH("prop_id_list") String str11, @InterfaceC1501070pAH("text_list") String str12, @InterfaceC1501070pAH("sdk_version") String str13, @InterfaceC1501070pAH("app_version") String str14);
    }
}
