package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aicontent;

import X.C01GW;
import X.C0C64;
import X.C0CHQ;
import X.C0CNO;
import X.C0M4J;
import X.C11NZ;
import X.C13LP;
import X.C15O7;
import X.C1701940uOG;
import X.C19484611Ky;
import X.C201955140j;
import X.C2188811AlT;
import X.C273050An1;
import X.C301610Brz;
import X.C311010CHb;
import X.C452501pT;
import X.C533720KwU;
import X.C533790Kwb;
import X.C534820KyG;
import X.C534860KyK;
import X.C534910KyP;
import X.C535020Kya;
import X.C535030Kyb;
import X.C535050Kyd;
import X.C535390KzB;
import X.C552700Lm0;
import X.C581090Mqh;
import X.EnumC562220M3g;
import X.InterfaceC19483011Ki;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mediachoose.helper.AlbumAigcAnchor;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.aicontentprotocol.AlbumAiContentRepository;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.aicontentprotocol.AlbumAiContentService;
import java.util.List;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS59S1000000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AlbumAiContentServiceImpl implements AlbumAiContentService {
    public Boolean LJ;
    public volatile boolean LJI;
    public final C534910KyP LIZIZ = C534860KyK.LIZ();
    public final C535030Kyb LIZJ = (C535030Kyb) C534860KyK.LIZJ.getValue();
    public final C533720KwU<Keva> LIZLLL = (C533720KwU) C534860KyK.LIZ.getValue();
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS552S0100000_8(this, 244));

    @Override // com.ss.android.ugc.aweme.shortvideo.mediaselector.aicontentprotocol.AlbumAiContentService
    public final String LIZLLL() {
        return this.LIZLLL.LIZ().getString("last_green_dot_asset_path", "");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mediaselector.aicontentprotocol.AlbumAiContentService
    public final boolean LIZIZ() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "studio_album_support_ai_self_when_ai_content_empty", true, false);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mediaselector.aicontentprotocol.AlbumAiContentService
    public final boolean LJI() {
        C11NZ<List<C535020Kya>> c11nzLIZ;
        if (C311010CHb.LIZ() && (this.LIZLLL.LIZ().getBoolean("has_ai_content", false) || this.LIZLLL.LIZ().getBoolean("ai_self_new_generating", false))) {
            return true;
        }
        if (this.LJI) {
            return false;
        }
        this.LJI = true;
        AlbumAiContentRepository.LIZ.getClass();
        AlbumAiContentRepository albumAiContentRepository = (AlbumAiContentRepository) PluggableExtentionKt.pluggableSpi$default(AlbumAiContentRepository.class, false, false, false, 14, null);
        if (albumAiContentRepository != null && (c11nzLIZ = albumAiContentRepository.LIZ(new C534820KyG(0, true, true, 0, null, null, 57))) != null) {
            new C19484611Ky(c11nzLIZ.LJJJLZIJ(C1701940uOG.LIZIZ()), new InterfaceC19483011Ki() { // from class: X.0Kye
                @Override // X.InterfaceC19483011Ki
                public final boolean test(Object obj) {
                    List list = (List) obj;
                    boolean z = !list.isEmpty();
                    if (z) {
                        C552700Lm0 c552700Lm0 = C552700Lm0.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("checkAiContentExistenceInBackground: found ");
                        sbLIZ.append(list.size());
                        sbLIZ.append(" AI content items, terminating");
                        C201955140j.LIZLLL(c552700Lm0, "AlbumAiContentServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
                        this.LL.LIZLLL.LIZ().storeBoolean("has_ai_content", true);
                        C201955140j.LIZLLL(c552700Lm0, "AlbumAiContentServiceImpl", "checkAiContentExistenceInBackground: stored AI content existence to keva");
                    }
                    return z;
                }
            }).LJJIIJ(new C581090Mqh(this, 1)).LJJLJ();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mediaselector.aicontentprotocol.AlbumAiContentService
    public final void LJII() {
        if (isEnable()) {
            C201955140j.LIZLLL(C552700Lm0.LIZIZ, "AlbumAiContentServiceImpl", "markNewAiSelfGenerating");
            this.LIZLLL.LIZ().storeBoolean("ai_self_new_generating", true);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mediaselector.aicontentprotocol.AlbumAiContentService
    public final boolean LJIIIIZZ() {
        return C311010CHb.LIZ() && ((Number) C301610Brz.LIZ.getValue()).intValue() == 2;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mediaselector.aicontentprotocol.AlbumAiContentService
    public final boolean LJIIIZ() {
        return C535390KzB.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mediaselector.aicontentprotocol.AlbumAiContentService
    public final boolean isEnable() {
        return C311010CHb.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mediaselector.aicontentprotocol.AlbumAiContentService
    public final AlbumAigcAnchor LIZJ(String str) {
        AwemeDraft awemeDraft;
        if (!C311010CHb.LIZ() || (awemeDraft = (AwemeDraft) C13LP.LJJJLL(C0CHQ.LIZ().LJI().LJIILJJIL().queryDraftList(new C0M4J(true, false, EnumC562220M3g.ALL, null, new AwS59S1000000_8(str, 7), 58)))) == null) {
            return null;
        }
        AIGCOfflineModel aIGCOfflineModel = awemeDraft.LIZ.aigcOfflineModel;
        if (aIGCOfflineModel.propId.length() == 0) {
            return null;
        }
        return new AlbumAigcAnchor(aIGCOfflineModel.propName, aIGCOfflineModel.propId, aIGCOfflineModel.iconUrl, "");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mediaselector.aicontentprotocol.AlbumAiContentService
    public final void LJ(String str) {
        this.LIZLLL.LIZ().storeString("last_green_dot_asset_path", str);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mediaselector.aicontentprotocol.AlbumAiContentService
    public final C535020Kya LJFF(C535020Kya c535020Kya) {
        Boolean boolValueOf;
        boolean z;
        if (!C311010CHb.LIZ()) {
            return null;
        }
        synchronized (this.LIZIZ) {
            try {
                ((C533720KwU) this.LJFF.getValue()).LIZ();
                Boolean bool = this.LJ;
                Boolean bool2 = Boolean.TRUE;
                if (!Intrinsics.LJFF(bool, bool2) && this.LIZIZ.LJI() < ((Number) C273050An1.LIZ.getValue()).intValue()) {
                    this.LIZJ.getClass();
                    C535020Kya c535020KyaLIZ = C535030Kyb.LIZ(c535020Kya);
                    if (c535020KyaLIZ == null) {
                        return null;
                    }
                    this.LIZLLL.LIZ().storeBoolean("has_ai_content", true);
                    C535020Kya c535020Kya2 = (C535020Kya) C13LP.LJJJLL(this.LIZIZ.LJ(c535020KyaLIZ.LIZ));
                    if ((c535020Kya2 != null || (c535020Kya2 = (C535020Kya) C13LP.LJJJLL(this.LIZIZ.LJFF(c535020KyaLIZ.LIZIZ))) != null) && (boolValueOf = Boolean.valueOf(c535020Kya2.LJIIIZ)) != null) {
                        if (!c535020KyaLIZ.LJIIIZ && !boolValueOf.booleanValue()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        C552700Lm0 c552700Lm0 = C552700Lm0.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("insert to update: ");
                        sbLIZ.append(c535020KyaLIZ);
                        sbLIZ.append(", existingNewFlag=");
                        sbLIZ.append(boolValueOf);
                        sbLIZ.append(", mergedNewFlag=");
                        sbLIZ.append(z);
                        C201955140j.LIZLLL(c552700Lm0, "AlbumAiContentServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
                        C535020Kya c535020KyaLIZ2 = C535020Kya.LIZ(c535020KyaLIZ, 0, 0, 0, null, z, 0, 65023);
                        this.LIZIZ.LIZIZ(c535020KyaLIZ2);
                        return c535020KyaLIZ2;
                    }
                    C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("insert: ");
                    sbLIZ2.append(c535020KyaLIZ);
                    C201955140j.LIZLLL(c533790Kwb, "AlbumAiContentServiceImpl", C2188811AlT.LIZIZ(sbLIZ2));
                    this.LIZIZ.LIZIZ(c535020KyaLIZ);
                    return c535020KyaLIZ;
                }
                C533790Kwb c533790Kwb2 = C533790Kwb.LIZIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("insert exceed maximum: ");
                sbLIZ3.append(c535020Kya);
                C201955140j.LIZLLL(c533790Kwb2, "AlbumAiContentServiceImpl", C2188811AlT.LIZIZ(sbLIZ3));
                this.LJ = bool2;
                C535020Kya c535020KyaLIZ3 = C535020Kya.LIZ(c535020Kya, 0, 0, 0, null, false, 1, 32767);
                this.LIZIZ.LIZIZ(c535020KyaLIZ3);
                return c535020KyaLIZ3;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mediaselector.aicontentprotocol.AlbumAiContentService
    public final synchronized void LIZ(String str, String str2) {
        if (C311010CHb.LIZ()) {
            C0CNO.LIZ(C15O7.LJI, new C535050Kyd(this, str, str2));
        }
    }
}
