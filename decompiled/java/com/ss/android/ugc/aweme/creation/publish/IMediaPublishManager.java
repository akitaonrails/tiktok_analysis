package com.ss.android.ugc.aweme.creation.publish;

import X.C09KS;
import X.C0YRX;
import X.C189200o6;
import X.C1DUR;
import X.C873900YQa;
import X.C911890Zpz;
import X.InterfaceC1364105Vn;
import X.InterfaceC1452170ntP;
import com.ss.android.ugc.aweme.creation.config.DMUploadImageResult;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
public interface IMediaPublishManager {
    public static final C911890Zpz LIZ = C911890Zpz.LIZ;

    void LIZ();

    void LIZIZ(C09KS c09ks, String str);

    void LIZJ();

    void LIZLLL(String str, C1DUR c1dur, boolean z, boolean z2, Map<String, String> map);

    Object LJ(String str, String str2, int i, boolean z, InterfaceC1364105Vn<? super C189200o6<DMUploadImageResult>> interfaceC1364105Vn);

    void LJFF(VideoPublishEditModel videoPublishEditModel, String str);

    void LJI(String str, BaseShortVideoContext baseShortVideoContext, boolean z, Map<String, String> map, Function2<? super C0YRX, ? super C873900YQa, Unit> function2);

    void LJII(VideoPublishEditModel videoPublishEditModel, InterfaceC1452170ntP interfaceC1452170ntP);

    void LJIIIIZZ(String str, Map<String, String> map, BaseShortVideoContext baseShortVideoContext, String str2);

    void LJIIIZ(String str, String str2, boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, Map<String, String> map, Function2<? super C0YRX, ? super C873900YQa, Unit> function2);

    int LJIIJ(String str);

    void LJIIJJI(C09KS c09ks, String str);
}
