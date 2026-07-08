package com.ss.android.ugc.aweme.service;

import X.AbstractC1433570nPP;
import X.AbstractC1434490nQt;
import X.AbstractC1435110nRt;
import X.C0LAB;
import X.C1410350mnx;
import X.C1430860nL2;
import X.C1433230nOr;
import X.C1435900nTA;
import X.C1436180nTc;
import X.C2221281Bwk;
import X.InterfaceC1434300nQa;
import X.InterfaceC1452170ntP;
import android.content.Intent;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public interface ICreativeSocialBridgeService {
    void LIZ();

    String LIZIZ(VideoPublishEditModel videoPublishEditModel);

    boolean LIZJ(InterfaceC1452170ntP interfaceC1452170ntP);

    void LIZLLL(C1433230nOr c1433230nOr, String str);

    AwemeDraft LJ(VideoPublishEditModel videoPublishEditModel);

    C1435900nTA LJFF(ArrayList arrayList, InterfaceC1434300nQa interfaceC1434300nQa, String str, Function2 function2);

    void LJI(NLEEditor nLEEditor, VideoPublishEditModel videoPublishEditModel);

    boolean LJII(VideoPublishEditModel videoPublishEditModel);

    void LJIIIIZZ(String str, AbstractC1433570nPP abstractC1433570nPP);

    void LJIIIZ(String str, String str2);

    List<CreateAnchorInfo> LJIIJ();

    void LJIIJJI();

    boolean LJIIL(VideoPublishEditModel videoPublishEditModel);

    String LJIILIIL(long j);

    void LJIILJJIL(C0LAB c0lab, VideoPublishEditModel videoPublishEditModel);

    boolean LJIILL(VideoPublishEditModel videoPublishEditModel);

    C1436180nTc LJIILLIIL();

    VideoPublishEditModel LJIIZILJ(Intent intent);

    String LJIJ(VideoPublishEditModel videoPublishEditModel);

    void LJIJI(C1410350mnx c1410350mnx);

    void LJIJJ(VideoPublishEditModel videoPublishEditModel, ImageAlbumData imageAlbumData);

    String LJIJJLI(INLEMediaSession iNLEMediaSession, VideoPublishEditModel videoPublishEditModel);

    String LJIL(VideoPublishEditModel videoPublishEditModel, Pair<String, String> pair);

    C1430860nL2 LJJ();

    VEVideoEncodeSettings LJJI(VideoPublishEditModel videoPublishEditModel, InterfaceC1452170ntP interfaceC1452170ntP, String str, AbstractC1435110nRt abstractC1435110nRt, boolean z, boolean z2, boolean z3);

    void LJJIFFI(VideoPublishEditModel videoPublishEditModel, VEVideoEncodeSettings vEVideoEncodeSettings, boolean z, int i);

    String LJJII(VideoPublishEditModel videoPublishEditModel);

    SynthetiseResult LJJIII(VideoPublishEditModel videoPublishEditModel, String str);

    boolean LJJIIJ(String str);

    void LJJIIJZLJL(VideoPublishEditModel videoPublishEditModel, VEVideoEncodeSettings vEVideoEncodeSettings);

    AbstractC1434490nQt LJJIIZ(VideoPublishEditModel videoPublishEditModel);

    C0LAB LJJIIZI(VideoPublishEditModel videoPublishEditModel, String str);

    void LJJIJ(String str, AbstractC1433570nPP abstractC1433570nPP);

    String LJJIJIIJI();

    String LJJIJIIJIL(PublishModel publishModel);

    C2221281Bwk LJJIJIL(String str, String str2);

    int[] LJJIJL(VideoPublishEditModel videoPublishEditModel);
}
