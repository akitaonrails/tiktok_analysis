package com.ss.android.ugc.aweme.socialavatar.saas.mixstudio;

import X.AbstractC440540HPg;
import X.AbstractC440840HQk;
import X.C05YD;
import X.C13IQ;
import X.C2252321DDq;
import X.C440830HQj;
import X.C441470HSv;
import X.C441500HSy;
import X.C823170WQx;
import X.InterfaceC1364105Vn;
import X.InterfaceC440090HNn;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioBaseModel;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public interface MixStudioStatusRepository {
    C05YD<InterfaceC440090HNn> LIZ();

    Object LIZIZ(String str, String str2, int i, InterfaceC440090HNn interfaceC440090HNn, C441470HSv c441470HSv, int i2, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);

    boolean LIZJ();

    C823170WQx<String> LIZLLL();

    Map<String, C13IQ<? extends Object>> LJ();

    C05YD<List<C440830HQj>> LJFF();

    Object LJI(Integer num, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);

    Object LJII(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    void LJIIIIZZ();

    void LJIIIZ(long j, AbstractC440840HQk abstractC440840HQk);

    C05YD<Boolean> LJIIJ();

    C2252321DDq LJIIJJI();

    C05YD<List<Pair<Integer, String>>> LJIIL();

    Object LJIILIIL(String str, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);

    void LJIILJJIL(List<MixStudioBaseModel> list, InterfaceC440090HNn interfaceC440090HNn, C441470HSv c441470HSv, String str, Integer num);

    Map<String, List<String>> LJIILL();

    C05YD<StickerItem> LJIILLIIL();

    void LJIIZILJ();

    C441500HSy getErrorInfo();

    String getTaskId();

    C05YD<AbstractC440540HPg> getTaskStatus();
}
