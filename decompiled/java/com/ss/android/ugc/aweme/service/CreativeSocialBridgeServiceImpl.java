package com.ss.android.ugc.aweme.service;

import X.AbstractC1433570nPP;
import X.AbstractC1434490nQt;
import X.AbstractC1435110nRt;
import X.C0CHQ;
import X.C0EMD;
import X.C0EMG;
import X.C0LAB;
import X.C13LP;
import X.C1403720mdG;
import X.C1407050mid;
import X.C1410350mnx;
import X.C1410390mo1;
import X.C1420470n4H;
import X.C1429420nIi;
import X.C1430860nL2;
import X.C1431220nLc;
import X.C1433120nOg;
import X.C1433230nOr;
import X.C1433290nOx;
import X.C1433500nPI;
import X.C1433530nPL;
import X.C1433730nPf;
import X.C1433740nPg;
import X.C1434140nQK;
import X.C1435900nTA;
import X.C1436180nTc;
import X.C1436230nTh;
import X.C1436830nUf;
import X.C1437030nUz;
import X.C1438570nXT;
import X.C1439880nZa;
import X.C1440210na7;
import X.C1440470naX;
import X.C1441320nbu;
import X.C1442180ndI;
import X.C1449990npt;
import X.C2221281Bwk;
import X.C352130DrH;
import X.C560870LzB;
import X.C572660Md6;
import X.InterfaceC1434300nQa;
import X.InterfaceC1452170ntP;
import X.InterfaceRunnableC1433480nPG;
import android.content.Intent;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class CreativeSocialBridgeServiceImpl implements ICreativeSocialBridgeService {
    @Override // com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService
    public final List<CreateAnchorInfo> LJIIJ() {
        C1429420nIi.LIZ.getClass();
        return C1429420nIi.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService
    public final void LJIIJJI() {
        if (Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").getBoolean("redesign_has_posted", false)) {
            return;
        }
        Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").storeBoolean("redesign_has_posted", true);
    }

    @Override // com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService
    public final C1436180nTc LJIILLIIL() {
        return new C1436180nTc();
    }

    @Override // com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService
    public final C1430860nL2 LJJ() {
        return new C1430860nL2();
    }

    @Override // com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService
    public final String LJJIJIIJI() {
        C1436230nTh.LIZ.getClass();
        return C1436230nTh.LJ;
    }

    @Override // com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService
    public final void LIZ() {
        C1433730nPf.LJJII();
    }

    @Override // com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService
    public final String LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        C0EMG.LIZ.getClass();
        return C0EMG.LIZ(videoPublishEditModel);
    }

    @Override // com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService
    public final boolean LIZJ(InterfaceC1452170ntP interfaceC1452170ntP) {
        C1449990npt.LIZ.getClass();
        NLEModel nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntP);
        if (nLEModelLIZ == null) {
            return true;
        }
        return C1449990npt.LJFF(nLEModelLIZ);
    }

    @Override // com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService
    public final AwemeDraft LJ(VideoPublishEditModel videoPublishEditModel) {
        new C1438570nXT("text_publish");
        return C1438570nXT.LIZLLL(videoPublishEditModel);
    }

    @Override // com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService
    public final boolean LJII(VideoPublishEditModel videoPublishEditModel) {
        return C1440210na7.LIZLLL(videoPublishEditModel);
    }

    @Override // com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService
    public final boolean LJIIL(VideoPublishEditModel videoPublishEditModel) {
        C0EMD.LIZ.getClass();
        return C0EMD.LIZLLL(videoPublishEditModel);
    }

    @Override // com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService
    public final String LJIILIIL(long j) {
        return C1441320nbu.LIZLLL(j);
    }

    @Override // com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService
    public final boolean LJIILL(VideoPublishEditModel videoPublishEditModel) {
        return C1439880nZa.LJIIIIZZ(videoPublishEditModel);
    }

    @Override // com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService
    public final VideoPublishEditModel LJIIZILJ(Intent intent) {
        new C1438570nXT("text_publish");
        return C1438570nXT.LJFF(intent);
    }

    @Override // com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService
    public final String LJIJ(VideoPublishEditModel videoPublishEditModel) {
        return C1440210na7.LIZIZ(videoPublishEditModel);
    }

    @Override // com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService
    public final void LJIJI(C1410350mnx c1410350mnx) {
        C1410390mo1.LIZ(c1410350mnx);
    }

    @Override // com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService
    public final String LJJII(VideoPublishEditModel videoPublishEditModel) {
        return C1403720mdG.LIZ(videoPublishEditModel);
    }

    @Override // com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService
    public final boolean LJJIIJ(String str) {
        return C1433730nPf.LJIJI(str);
    }

    @Override // com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService
    public final AbstractC1434490nQt LJJIIZ(VideoPublishEditModel videoPublishEditModel) {
        return C1433290nOx.LIZ(videoPublishEditModel, false, false, AFwS210S0000000_22.get$arr$(357));
    }

    @Override // com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService
    public final String LJJIJIIJIL(PublishModel publishModel) {
        return C1433730nPf.LIZLLL(publishModel, false);
    }

    @Override // com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService
    public final int[] LJJIJL(VideoPublishEditModel videoPublishEditModel) {
        return C1439880nZa.LJFF(videoPublishEditModel);
    }

    @Override // com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService
    public final void LIZLLL(C1433230nOr c1433230nOr, String str) {
        C1433500nPI c1433500nPI;
        String creationId;
        VideoPublishEditModel videoPublishEditModel;
        if (str != null) {
            C1433730nPf c1433730nPf = C1433730nPf.LIZ;
            if (str.length() != 0) {
                C1433730nPf.LIZ.getClass();
                C1433740nPg c1433740nPg = C1433730nPf.LJFF;
                synchronized (c1433740nPg) {
                    for (C1433530nPL c1433530nPL : c1433740nPg.LIZ) {
                        if (Intrinsics.LJFF(c1433530nPL.LIZIZ, str)) {
                            if (c1433530nPL.LJI == null) {
                                C1433500nPI c1433500nPI2 = new C1433500nPI(new C1434140nQK(), C1433730nPf.LIZLLL, c1433530nPL, C1433730nPf.LJFF, C1433730nPf.LJI);
                                c1433530nPL.LJI = c1433500nPI2;
                                List listLLIIII = C13LP.LLIIII(c1433530nPL.LIZJ);
                                c1433530nPL.LIZJ.clear();
                                Iterator it2 = listLLIIII.iterator();
                                while (it2.hasNext()) {
                                    c1433500nPI2.LJZI((AbstractC1433570nPP) it2.next());
                                }
                            }
                            InterfaceRunnableC1433480nPG interfaceRunnableC1433480nPG = c1433530nPL.LJI;
                            if ((interfaceRunnableC1433480nPG instanceof C1433500nPI) && (c1433500nPI = (C1433500nPI) interfaceRunnableC1433480nPG) != null) {
                                BaseShortVideoContext baseShortVideoContext = c1433500nPI.LLILZIL.LIZ.editModel;
                                if (!(baseShortVideoContext instanceof VideoPublishEditModel) || baseShortVideoContext == null || (creationId = baseShortVideoContext.getCreationId()) == null) {
                                    creationId = "";
                                }
                                c1433500nPI.LJIILL(c1433230nOr);
                                C0CHQ.LIZ().getPublishService().LJIIL();
                                BaseShortVideoContext baseShortVideoContext2 = c1433500nPI.LLILZIL.LIZ.editModel;
                                if ((baseShortVideoContext2 instanceof VideoPublishEditModel) && (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext2) != null) {
                                    C1436830nUf.LJIJI(new C572660Md6(videoPublishEditModel));
                                }
                                C1436830nUf.LJIIZILJ(creationId);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
            }
        }
        C1433730nPf.LJFF.LJIIJ(C1433730nPf.LJI, c1433230nOr);
    }

    @Override // com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService
    public final void LJI(NLEEditor nLEEditor, VideoPublishEditModel videoPublishEditModel) {
        C1407050mid.LIZ.getClass();
        C1407050mid.LIZ(nLEEditor, videoPublishEditModel);
    }

    @Override // com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService
    public final void LJIIIIZZ(String str, AbstractC1433570nPP abstractC1433570nPP) {
        C1433730nPf.LIZ(str, abstractC1433570nPP);
    }

    @Override // com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService
    public final void LJIIIZ(String str, String str2) {
        C560870LzB.LIZ(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService
    public final void LJIILJJIL(C0LAB c0lab, VideoPublishEditModel videoPublishEditModel) {
        C0EMD.LIZIZ(c0lab, videoPublishEditModel);
    }

    @Override // com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService
    public final void LJIJJ(VideoPublishEditModel videoPublishEditModel, ImageAlbumData imageAlbumData) throws IOException {
        C1440470naX.LIZ.getClass();
        C1440470naX.LIZIZ(videoPublishEditModel, imageAlbumData);
    }

    @Override // com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService
    public final String LJIJJLI(INLEMediaSession iNLEMediaSession, VideoPublishEditModel videoPublishEditModel) {
        C1407050mid.LIZ.getClass();
        return C1407050mid.LIZIZ(iNLEMediaSession, videoPublishEditModel);
    }

    @Override // com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService
    public final String LJIL(VideoPublishEditModel videoPublishEditModel, Pair<String, String> pair) {
        C1433120nOg.LIZ.getClass();
        return C1433120nOg.LIZ(videoPublishEditModel, pair);
    }

    @Override // com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService
    public final SynthetiseResult LJJIII(VideoPublishEditModel videoPublishEditModel, String str) {
        return C1431220nLc.LIZ(videoPublishEditModel, str);
    }

    @Override // com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService
    public final void LJJIIJZLJL(VideoPublishEditModel videoPublishEditModel, VEVideoEncodeSettings vEVideoEncodeSettings) {
        C1440210na7.LIZ(videoPublishEditModel, vEVideoEncodeSettings);
    }

    @Override // com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService
    public final C0LAB LJJIIZI(VideoPublishEditModel videoPublishEditModel, String str) {
        C1420470n4H c1420470n4H = new C1420470n4H(str);
        C0LAB c0lab = new C0LAB();
        c1420470n4H.LIZ(videoPublishEditModel, c0lab);
        return c0lab;
    }

    @Override // com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService
    public final void LJJIJ(String str, AbstractC1433570nPP abstractC1433570nPP) {
        C1433730nPf.LJJ(str, abstractC1433570nPP);
    }

    @Override // com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService
    public final C2221281Bwk LJJIJIL(String str, String str2) {
        return new C2221281Bwk(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService
    public final C1435900nTA LJFF(ArrayList arrayList, InterfaceC1434300nQa interfaceC1434300nQa, String str, Function2 function2) {
        return new C1435900nTA(arrayList, interfaceC1434300nQa, str, function2);
    }

    @Override // com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService
    public final void LJJIFFI(VideoPublishEditModel videoPublishEditModel, VEVideoEncodeSettings vEVideoEncodeSettings, boolean z, int i) {
        C1442180ndI.LIZJ(videoPublishEditModel, vEVideoEncodeSettings, z, i, false);
    }

    @Override // com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService
    public final VEVideoEncodeSettings LJJI(VideoPublishEditModel videoPublishEditModel, InterfaceC1452170ntP interfaceC1452170ntP, String str, AbstractC1435110nRt abstractC1435110nRt, boolean z, boolean z2, boolean z3) {
        return C1437030nUz.LIZJ(videoPublishEditModel, null, interfaceC1452170ntP, str, abstractC1435110nRt, z, z2, z3);
    }
}
