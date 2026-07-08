package com.ss.android.ugc.aweme.socialavatar.api.mixstudio;

import X.AbstractC440540HPg;
import X.AbstractC440840HQk;
import X.C05YD;
import X.C13BV;
import X.C13IQ;
import X.C1BNE;
import X.C2252321DDq;
import X.C440620HPo;
import X.C440830HQj;
import X.C441470HSv;
import X.C441500HSy;
import X.C823170WQx;
import X.InterfaceC1364105Vn;
import X.InterfaceC440090HNn;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.network.MixStudioBaseModel;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class DowngradeMixStudioStatusRepository implements MixStudioStatusRepository {
    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    public final C05YD<InterfaceC440090HNn> LIZ() {
        return C1BNE.LIZ(null);
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    public final boolean LIZJ() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    public final void LJIIIIZZ() {
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    public final void LJIIIZ(long j, AbstractC440840HQk abstractC440840HQk) {
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    public final void LJIILJJIL(List<MixStudioBaseModel> list, InterfaceC440090HNn interfaceC440090HNn, C441470HSv c441470HSv, String str, Integer num) {
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    public final C05YD<StickerItem> LJIILLIIL() {
        return C1BNE.LIZ(null);
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    public final void LJIIZILJ() {
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    public final C441500HSy getErrorInfo() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    public final String getTaskId() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    public final C823170WQx<String> LIZLLL() {
        return new C823170WQx<>();
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    public final Map<String, C13IQ<? extends Object>> LJ() {
        return new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    public final C05YD<List<C440830HQj>> LJFF() {
        return C1BNE.LIZ(C13BV.INSTANCE);
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    public final C05YD<Boolean> LJIIJ() {
        return C1BNE.LIZ(Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    public final C2252321DDq LJIIJJI() {
        return C1BNE.LIZ(Double.valueOf(0.0d));
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    public final C05YD<List<Pair<Integer, String>>> LJIIL() {
        return C1BNE.LIZ(C13BV.INSTANCE);
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    public final Map<String, List<String>> LJIILL() {
        return new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    public final C05YD<AbstractC440540HPg> getTaskStatus() {
        return C1BNE.LIZ(C440620HPo.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    public final Object LJII(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return Unit.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    public final Object LJI(Integer num, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    public final Object LJIILIIL(String str, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository
    public final Object LIZIZ(String str, String str2, int i, InterfaceC440090HNn interfaceC440090HNn, C441470HSv c441470HSv, int i2, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return false;
    }
}
