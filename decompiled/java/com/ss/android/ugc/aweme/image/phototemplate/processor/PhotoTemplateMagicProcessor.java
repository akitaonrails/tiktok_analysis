package com.ss.android.ugc.aweme.image.phototemplate.processor;

import X.AbstractC19484711Kz;
import X.AbstractC354420Duy;
import X.C01GW;
import X.C09CT;
import X.C0CHQ;
import X.C0E06;
import X.C13LP;
import X.C13Q5;
import X.C13W0;
import X.C1413020msG;
import X.C1424090nA7;
import X.C1697810uHb;
import X.C20005413Pg;
import X.C2188811AlT;
import X.C2286708xd;
import X.C2298208zU;
import X.C348100Dkm;
import X.C352130DrH;
import X.C354210Dud;
import X.C354220Due;
import X.C354240Dug;
import X.C354470Dv3;
import X.C356740Dyi;
import X.C357320Dze;
import X.C371780Ehs;
import X.C385200F8k;
import X.C452501pT;
import X.C7740030o;
import X.C786410Ut5;
import X.EnumC20227914Cv;
import X.EnumC20228214Cy;
import X.InterfaceC1428340nGy;
import X.InterfaceC1428350nGz;
import X.InterfaceC1452170ntP;
import X.InterfaceC1487280oo2;
import X.InterfaceC20008113Qh;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoEffectSPtr;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.creative.model.edit.PhotoTemplateAsset;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.image.phototemplate.processor.PhotoTemplateMagicProcessor;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.android.davinciresource.DavinciResourceLibraryLoader;
import com.ss.ugc.android.davinciresource.jni.AlgorithmResourceFinder;
import com.ss.ugc.android.davinciresource.jni.DAVUnZipFunc;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS53S0200100_5;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes6.dex */
public final class PhotoTemplateMagicProcessor implements InterfaceC1428350nGz {
    public final InterfaceC1428340nGy LIZ;
    public final C1424090nA7 LIZIZ;
    public final C01GW LIZJ;
    public final C01GW LIZLLL;
    public C354240Dug LJ;
    public volatile String LJFF;
    public AwS53S0200100_5 LJI;
    public final C0E06 LJII;

    @Override // X.InterfaceC1428350nGz
    public final PhotoTemplateAsset LIZLLL() {
        return null;
    }

    @Override // X.InterfaceC1428350nGz
    public final void LJFF() {
        this.LJ = null;
    }

    @Override // X.InterfaceC1428350nGz
    public final NLEModel LJI(PhotoTemplateAsset photoTemplateAsset) {
        return null;
    }

    @Override // X.InterfaceC1428350nGz
    public final void LIZJ() {
        C385200F8k.LIZ("PhotoTemplateMagicProcessor", "cancelApplyMagic");
        this.LJFF = null;
        ((C357320Dze) this.LIZJ.getValue()).Hs();
        AwS53S0200100_5 awS53S0200100_5 = this.LJI;
        if (awS53S0200100_5 != null) {
            awS53S0200100_5.invoke(2, null, "apply_cancel");
        }
        this.LJI = null;
    }

    public static final class MagicJsonParam {

        @C09CT("editing_effect_algorithm_cache_url")
        public final String effectDir;

        public MagicJsonParam() {
            this(null);
        }

        public MagicJsonParam(String str) {
            this.effectDir = str;
        }
    }

    @Override // X.InterfaceC1428350nGz
    public final String LIZ(NLEModel nLEModel) {
        NLETrack mainTrack;
        VecNLETrackSlotSPtr slots;
        NLETrackSlot nLETrackSlot;
        VecNLEVideoEffectSPtr videoEffects;
        NLEVideoEffect nLEVideoEffect;
        NLESegmentEffect segment;
        String jsonParam;
        NLEModel nLEModel2;
        C354240Dug c354240Dug = this.LJ;
        if (c354240Dug != null && (nLEModel2 = c354240Dug.LIZJ) != null) {
            nLEModel = nLEModel2;
        }
        String strLIZIZ = null;
        if (nLEModel != null && (mainTrack = nLEModel.getMainTrack()) != null && (slots = mainTrack.getSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(slots)) != null && (videoEffects = nLETrackSlot.getVideoEffects()) != null && (nLEVideoEffect = (NLEVideoEffect) C13LP.LJJJLL(videoEffects)) != null && (segment = nLEVideoEffect.getSegment()) != null && (jsonParam = segment.getJsonParam()) != null) {
            try {
                String str = ((MagicJsonParam) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), jsonParam, MagicJsonParam.class)).effectDir;
                if (str != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append("/result.png");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                String str2 = C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), this.LIZ.LIZ(), EnumC20228214Cy.PHOTO_MODE, null, false, 12) + "origin/" + System.currentTimeMillis() + "_applied_template.png";
                C2286708xd.LJFF(strLIZIZ, str2);
                return str2;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
                C385200F8k.LIZIZ("PhotoTemplateMagicProcessor", "getAppliedMagicPng failed", e);
            }
        }
        return null;
    }

    @Override // X.InterfaceC1428350nGz
    public final void LIZIZ(SingleImageData singleImageData) {
        this.LJ = null;
        this.LJFF = null;
        this.LJI = null;
    }

    @Override // X.InterfaceC1428350nGz
    public final boolean LJII(PhotoTemplateAsset photoTemplateAsset) {
        return C1413020msG.LIZJ(photoTemplateAsset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0E06, com.ss.ugc.android.davinciresource.jni.DAVUnZipFunc] */
    public PhotoTemplateMagicProcessor(Context context, InterfaceC1428340nGy interfaceC1428340nGy, C1424090nA7 c1424090nA7) {
        NLEEditor nLEEditor;
        INLEMediaSession iNLEMediaSession;
        this.LIZ = interfaceC1428340nGy;
        this.LIZIZ = c1424090nA7;
        DavinciResourceLibraryLoader.INSTANCE.loadLibrary();
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(40));
        this.LIZJ = c01gwLIZIZ;
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS552S0100000_8(this, 133));
        this.LIZLLL = c01gwLIZIZ2;
        ?? r5 = new DAVUnZipFunc() { // from class: X.0E06
            public final boolean renameFile(String str, String str2) {
                if (new C0VSJ(str2).exists()) {
                    C08QA.LJIIZILJ(new C0VSJ(str2));
                }
                C0VSJ c0vsj = new C0VSJ(str);
                C0VSJ c0vsj2 = new C0VSJ(str2);
                if (!c0vsj.exists()) {
                    return false;
                }
                return c0vsj.renameTo(c0vsj2);
            }

            @Override // com.ss.ugc.android.davinciresource.jni.DAVUnZipFunc
            public final boolean unZip(String str, String str2, boolean z) {
                boolean zRenameFile = false;
                if (str != null && !a0.LJJJIL(str) && str2 != null && !a0.LJJJIL(str2)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str2);
                    sbLIZ.append("_temp");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    C0VSJ c0vsj = new C0VSJ(strLIZIZ);
                    if (c0vsj.exists()) {
                        c0vsj.delete();
                    }
                    try {
                        C13SB.LJIJJLI(str, strLIZIZ);
                        zRenameFile = renameFile(c0vsj.getAbsolutePath(), str2);
                        if (z) {
                            new C0VSJ(str).delete();
                            return zRenameFile;
                        }
                    } catch (C2225308nj e) {
                        TryCatchGuardChecker.doCheck(e);
                        C385200F8k.LIZIZ("PhotoTemplateMagicProcessor", "unZip", e);
                    } catch (SecurityException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C385200F8k.LIZIZ("PhotoTemplateMagicProcessor", "unZip", e2);
                        return zRenameFile;
                    }
                }
                return zRenameFile;
            }
        };
        this.LJII = r5;
        C357320Dze c357320Dze = (C357320Dze) c01gwLIZIZ.getValue();
        C13W0 c13w0 = new C13W0(C786410Ut5.N3(context), interfaceC1428340nGy.LIZ());
        C356740Dyi c356740Dyi = new C356740Dyi();
        c356740Dyi.LIZ = c13w0;
        c356740Dyi.LIZIZ = c13w0;
        c356740Dyi.LIZJ = c13w0;
        c356740Dyi.LIZLLL = c13w0;
        c356740Dyi.LJ = c13w0;
        c357320Dze.LIZLLL(context, c356740Dyi.LIZ(), r5);
        INLEPlayer playerApi = null;
        String path = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.MAGIC_PROCESSOR, "", true).getPath();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init: dir=");
        sbLIZ.append(path);
        C385200F8k.LIZ("PhotoTemplateMagicProcessor", C2188811AlT.LIZIZ(sbLIZ));
        C357320Dze c357320Dze2 = (C357320Dze) c01gwLIZIZ.getValue();
        AbstractC354420Duy[] abstractC354420DuyArr = new AbstractC354420Duy[3];
        abstractC354420DuyArr[0] = new C354210Dud();
        abstractC354420DuyArr[1] = new C354220Due();
        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ((InterfaceC1452170ntP) c01gwLIZIZ2.getValue());
        if (c348100DkmLIZIZ != null && (nLEEditor = c348100DkmLIZIZ.LIZ) != null) {
            C348100Dkm c348100DkmLIZIZ2 = C352130DrH.LIZIZ((InterfaceC1452170ntP) c01gwLIZIZ2.getValue());
            if (c348100DkmLIZIZ2 != null && (iNLEMediaSession = c348100DkmLIZIZ2.LIZIZ) != null) {
                playerApi = iNLEMediaSession.getPlayerApi();
            }
            abstractC354420DuyArr[2] = new C354470Dv3(nLEEditor, playerApi, path, 80);
            c357320Dze2.LIZ(C1697810uHb.LJ(abstractC354420DuyArr));
            C20005413Pg c20005413PgLIZ = C13Q5.LIZ();
            InterfaceC20008113Qh interfaceC20008113Qh = new InterfaceC20008113Qh() { // from class: X.0E02
                @Override // X.InterfaceC20008113Qh
                public final String LIZ(String str) {
                    return AlgorithmResourceFinder.resourceFinder(null, "", str);
                }
            };
            synchronized (c20005413PgLIZ) {
                try {
                    c20005413PgLIZ.LJI = interfaceC20008113Qh;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC1428350nGz
    public final AbstractC19484711Kz<NLEModel> LJ(int i, final PhotoTemplateAsset photoTemplateAsset, final NLETrackSlot nLETrackSlot, final NLEModel nLEModel, LifecycleOwner lifecycleOwner, final Function1<? super Integer, Unit> function1) {
        C1424090nA7 c1424090nA7 = this.LIZIZ;
        Asset asset = photoTemplateAsset.getAsset();
        C371780Ehs.LIZLLL(asset);
        return c1424090nA7.LIZ(asset, false).LJIIZILJ(new InterfaceC1487280oo2() { // from class: X.0E05
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                photoTemplateAsset.setResourcePath(((Effect) obj).getUnzipPath());
                final PhotoTemplateMagicProcessor photoTemplateMagicProcessor = this;
                final PhotoTemplateAsset photoTemplateAsset2 = photoTemplateAsset;
                final NLETrackSlot nLETrackSlot2 = nLETrackSlot;
                final NLEModel nLEModel2 = nLEModel;
                final Function1<Integer, Unit> function12 = function1;
                photoTemplateMagicProcessor.getClass();
                final long jCurrentTimeMillis = System.currentTimeMillis();
                final String string = UUID.randomUUID().toString();
                photoTemplateMagicProcessor.LJFF = string;
                return AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0E03
                    @Override // X.InterfaceC300801Eo
                    public final void subscribe(InterfaceC2329309At<NLEModel> interfaceC2329309At) {
                        PhotoTemplateMagicProcessor photoTemplateMagicProcessor2 = photoTemplateMagicProcessor;
                        PhotoTemplateAsset photoTemplateAsset3 = photoTemplateAsset2;
                        photoTemplateMagicProcessor2.getClass();
                        Asset asset2 = photoTemplateAsset3.getAsset();
                        C371780Ehs.LIZLLL(asset2);
                        String title = asset2.getTitle();
                        String asset_id = asset2.getAsset_id();
                        String resource_id = asset2.getResource_id();
                        String resourcePath = photoTemplateAsset3.getResourcePath();
                        if (resourcePath != null) {
                            final C354240Dug c354240Dug = new C354240Dug(new C354510Dv7(title, resource_id, asset_id, resourcePath, C1697810uHb.LJ(EnumC356200Dxq.PHOTO), C0E00.COMBINE_GAME_PLAY, null, null, null, 0, false, 4032), nLETrackSlot2, nLEModel2);
                            PhotoTemplateMagicProcessor photoTemplateMagicProcessor3 = photoTemplateMagicProcessor;
                            photoTemplateMagicProcessor3.LJI = new AwS53S0200100_5(jCurrentTimeMillis, c354240Dug, photoTemplateMagicProcessor3, 1);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("applyMagic ");
                            sbLIZ.append(c354240Dug);
                            C385200F8k.LIZ("PhotoTemplateMagicProcessor", C2188811AlT.LIZIZ(sbLIZ));
                            ((InterfaceC1452170ntP) photoTemplateMagicProcessor.LIZLLL.getValue()).yc(nLEModel2);
                            ((InterfaceC1452170ntP) photoTemplateMagicProcessor.LIZLLL.getValue()).prepare();
                            ((InterfaceC1452170ntP) photoTemplateMagicProcessor.LIZLLL.getValue()).play();
                            C357320Dze c357320Dze = (C357320Dze) photoTemplateMagicProcessor.LIZJ.getValue();
                            final PhotoTemplateMagicProcessor photoTemplateMagicProcessor4 = photoTemplateMagicProcessor;
                            final String str = string;
                            final long j = jCurrentTimeMillis;
                            final Function1<Integer, Unit> function13 = function12;
                            final NLEModel nLEModel3 = nLEModel2;
                            final C11KT c11kt = (C11KT) interfaceC2329309At;
                            c357320Dze.LIZIZ(c354240Dug, new InterfaceC356810Dyp() { // from class: X.0E04
                                @Override // X.InterfaceC356810Dyp
                                public final void onStart() {
                                }

                                @Override // X.InterfaceC356810Dyp
                                public final void LIZ(C356900Dyy c356900Dyy) {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("applyMagic onFail: ");
                                    sbLIZ2.append(c356900Dyy);
                                    C385200F8k.LIZ("PhotoTemplateMagicProcessor", C2188811AlT.LIZIZ(sbLIZ2));
                                    if (!Intrinsics.LJFF(photoTemplateMagicProcessor4.LJFF, str)) {
                                        return;
                                    }
                                    AwS53S0200100_5 awS53S0200100_5 = photoTemplateMagicProcessor4.LJI;
                                    if (awS53S0200100_5 != null) {
                                        awS53S0200100_5.invoke(1, Integer.valueOf(c356900Dyy.LIZ), c356900Dyy.LIZIZ);
                                    }
                                    photoTemplateMagicProcessor4.LJI = null;
                                    InterfaceC2329309At<NLEModel> interfaceC2329309At2 = c11kt;
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("Apply Magic failed ");
                                    sbLIZ3.append(c356900Dyy);
                                    interfaceC2329309At2.onError(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3), new RuntimeException(String.valueOf(EnumC358710E4n.APPLY_EFFECT_FAIL.getValue()))));
                                }

                                @Override // X.InterfaceC356810Dyp
                                public final void LIZIZ(C354570DvD c354570DvD) {
                                    C385200F8k.LIZ("PhotoTemplateMagicProcessor", "applyMagic onSuccess");
                                    if (!Intrinsics.LJFF(photoTemplateMagicProcessor4.LJFF, str)) {
                                        return;
                                    }
                                    PhotoTemplateMagicProcessor photoTemplateMagicProcessor5 = photoTemplateMagicProcessor4;
                                    photoTemplateMagicProcessor5.LJ = c354240Dug;
                                    AwS53S0200100_5 awS53S0200100_5 = photoTemplateMagicProcessor5.LJI;
                                    if (awS53S0200100_5 != null) {
                                        awS53S0200100_5.invoke(0, null, "apply_succeed");
                                    }
                                    photoTemplateMagicProcessor4.LJI = null;
                                    c11kt.onSuccess(nLEModel3);
                                }

                                @Override // X.InterfaceC356810Dyp
                                public final void onProgress(int i2) {
                                    if (!Intrinsics.LJFF(photoTemplateMagicProcessor4.LJFF, str)) {
                                        return;
                                    }
                                    long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
                                    if (jCurrentTimeMillis2 < 2000) {
                                        i2 = (int) ((i2 * jCurrentTimeMillis2) / 2000);
                                    }
                                    function13.invoke(Integer.valueOf(i2));
                                }
                            });
                            return;
                        }
                        "Required value was null.".toString();
                        throw new IllegalStateException("Required value was null.");
                    }
                });
            }
        });
    }
}
