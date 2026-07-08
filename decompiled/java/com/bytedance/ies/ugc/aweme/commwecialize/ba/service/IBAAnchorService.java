package com.bytedance.ies.ugc.aweme.commwecialize.ba.service;

import X.C1050430dRR;
import X.C19EG;
import android.content.Context;
import com.ss.android.ugc.aweme.commercialize.anchor.model.CommerceAnchorInfo;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import java.util.List;
import kotlin.jvm.internal.AwS260S0300000_16;
import kotlin.jvm.internal.AwS273S0300000_29;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: loaded from: classes17.dex */
public interface IBAAnchorService {
    void LIZ(Context context, AnchorCommonStruct anchorCommonStruct, Aweme aweme, String str, String str2, CommerceAnchorInfo commerceAnchorInfo, String str3, String str4, Boolean bool);

    void LIZIZ(Aweme aweme, AnchorCommonStruct anchorCommonStruct, Context context, boolean z);

    void LIZJ(int i, Context context, AwS573S0100000_29 awS573S0100000_29);

    Integer LIZLLL();

    void LJ(C19EG c19eg, String str, AnchorCommonStruct anchorCommonStruct, Aweme aweme, String str2, String str3, Integer num, Integer num2);

    AnchorCommonStruct LJFF(Aweme aweme);

    String LJI(Integer num);

    boolean LJII(Aweme aweme);

    void LJIIIIZZ(int i, Context context, AwS273S0300000_29 awS273S0300000_29, AwS573S0100000_29 awS573S0100000_29);

    void LJIIIZ(Context context, CommerceAnchorInfo commerceAnchorInfo, AnchorCommonStruct anchorCommonStruct, Aweme aweme, String str, String str2, String str3);

    C1050430dRR LJIIJ(Context context, Aweme aweme, String str, AwS260S0300000_16 awS260S0300000_16);

    void LJIIJJI(Context context, User user, Aweme aweme, AnchorCommonStruct anchorCommonStruct, String str);

    void LJIIL(Context context);

    void LJIILIIL(String str, AnchorCommonStruct anchorCommonStruct, Aweme aweme, String str2, String str3, CommerceAnchorInfo commerceAnchorInfo, String str4);

    boolean LJIILJJIL();

    boolean LJIILL(List<AnchorPublishStruct> list);

    void LJIILLIIL(int i, Context context, CommerceAnchorInfo commerceAnchorInfo, AnchorCommonStruct anchorCommonStruct, Aweme aweme, String str, String str2, String str3);
}
