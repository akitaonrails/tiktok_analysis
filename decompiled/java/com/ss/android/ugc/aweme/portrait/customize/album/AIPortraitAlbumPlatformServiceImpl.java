package com.ss.android.ugc.aweme.portrait.customize.album;

import X.AbstractC214814194y;
import X.C01GW;
import X.C05YF;
import X.C05YM;
import X.C0ET4;
import X.C13BV;
import X.C1659700tI8;
import X.C19A3;
import X.C19EG;
import X.C2188811AlT;
import X.C23222098a;
import X.C2496209qK;
import X.C2496409qM;
import X.C2496709qP;
import X.C345260DgC;
import X.C452501pT;
import X.C539960LFq;
import X.EnumC1642750sqn;
import X.InterfaceC1294060jmO;
import X.InterfaceC345200Dg6;
import com.ss.android.ugc.aweme.shortvideo.album.service.CreationAlbumPlatformService;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class AIPortraitAlbumPlatformServiceImpl implements CreationAlbumPlatformService {
    public final String LIZIZ = "ai_portrait";
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(601));

    @Override // com.ss.android.ugc.aweme.shortvideo.album.service.CreationAlbumPlatformService
    public final void LIZJ() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.album.service.CreationAlbumPlatformService
    public final void LIZLLL(C539960LFq c539960LFq, C19A3 c19a3) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.album.service.CreationAlbumPlatformService
    public final void LJ(C19EG c19eg, AbstractC214814194y abstractC214814194y, C345260DgC c345260DgC) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.album.service.CreationAlbumPlatformService
    public final void LJI(C539960LFq c539960LFq, C19A3 c19a3) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.album.service.CreationAlbumPlatformService
    public final String LIZ() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.album.service.CreationAlbumPlatformService
    @InterfaceC1294060jmO
    public final List<InterfaceC345200Dg6> LJFF() {
        return C13BV.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.album.service.CreationAlbumPlatformService
    public final void LIZIZ(C539960LFq c539960LFq, MvChoosePhotoScene mvChoosePhotoScene) {
        if (((Boolean) this.LIZJ.getValue()).booleanValue()) {
            EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("register component ");
            sbLIZ.append(C23222098a.class.getName());
            sbLIZ.append(" api ");
            sbLIZ.append(C05YM.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, C05YM.class, C23222098a.class, new AwS587S0100000_8(new C0ET4(), c539960LFq, 76));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("register component ");
            sbLIZ2.append(C2496409qM.class.getName());
            sbLIZ2.append(" api ");
            sbLIZ2.append(C05YF.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, C05YF.class, C2496409qM.class, new AwS587S0100000_8(new C0ET4(), c539960LFq, 77));
        }
        if (((Number) C2496709qP.LIZ.getValue()).floatValue() > 0.0f) {
            EnumC1642750sqn enumC1642750sqn2 = EnumC1642750sqn.IMMEDIATE;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("register component ");
            sbLIZ3.append(C2496209qK.class.getName());
            sbLIZ3.append(" api ");
            sbLIZ3.append(C05YF.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
            c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn2, null, C05YF.class, C2496209qK.class, new AwS587S0100000_8(new C0ET4(), c539960LFq, 78));
        }
    }
}
