package com.ss.android.ugc.aweme.commerce.tools.sticker.service;

import X.AbstractC856620Xj2;
import X.C1063180dm0;
import X.C1441190nbh;
import X.C1631010sXr;
import X.C1631400sYU;
import X.C1636920shO;
import X.C19GS;
import X.InterfaceC1452170ntP;
import X.InterfaceC1624480sNK;
import com.ss.android.ugc.aweme.commerce.tools.sticker.IBEStickerHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: loaded from: classes23.dex */
public interface ICommerceToolsStickerService {
    C1063180dm0 LIZIZ(AbstractC856620Xj2 abstractC856620Xj2);

    boolean LIZJ(VideoPublishEditModel videoPublishEditModel);

    boolean LIZLLL(C1441190nbh c1441190nbh);

    void LJ(ShortVideoContext shortVideoContext);

    void LJFF(InterfaceC1624480sNK interfaceC1624480sNK, ShortVideoContext shortVideoContext, Effect effect, boolean z, boolean z2, boolean z3);

    void LJI(String str);

    void LJII(InterfaceC1452170ntP interfaceC1452170ntP, VideoPublishEditModel videoPublishEditModel);

    C1631010sXr LJIIIIZZ(ShortVideoContext shortVideoContext, C1631400sYU c1631400sYU, List list);

    void LJIIIZ(String str);

    C1636920shO LJIIJ(C19GS c19gs, AwS552S0100000_8 awS552S0100000_8, ShortVideoContext shortVideoContext);

    void LJIIJJI(ShortVideoContext shortVideoContext, boolean z, String str, String str2, Boolean bool);

    IBEStickerHandler LJIIL(C19GS c19gs, ShortVideoContext shortVideoContext);
}
