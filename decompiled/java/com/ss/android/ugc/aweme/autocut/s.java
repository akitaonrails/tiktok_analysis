package com.ss.android.ugc.aweme.autocut;

import X.AbstractC1452680nuE;
import X.AnonymousClass0960;
import X.BinderC532620Kui;
import X.C01GW;
import X.C08F1;
import X.C095D;
import X.C096C;
import X.C097U;
import X.C098200Yq;
import X.C09IC;
import X.C0C64;
import X.C0CHI;
import X.C0CHQ;
import X.C0CHU;
import X.C0CHV;
import X.C0CIJ;
import X.C0E3A;
import X.C0FGC;
import X.C0L95;
import X.C0LE4;
import X.C0MJ9;
import X.C0PEM;
import X.C0VSJ;
import X.C0XF1;
import X.C11JF;
import X.C1227904rF;
import X.C123100dR;
import X.C1398350mUb;
import X.C13BV;
import X.C13LN;
import X.C13LP;
import X.C1403130mcJ;
import X.C1412660mrg;
import X.C1416110mxF;
import X.C1417320mzC;
import X.C1417710mzp;
import X.C1417910n09;
import X.C1417940n0C;
import X.C1417970n0F;
import X.C1418000n0I;
import X.C1418020n0K;
import X.C1418340n0q;
import X.C1418360n0s;
import X.C1418510n17;
import X.C1418540n1A;
import X.C1418550n1B;
import X.C1419550n2n;
import X.C1419810n3D;
import X.C1419920n3O;
import X.C1420480n4I;
import X.C1426005i6;
import X.C1428470nHB;
import X.C1429050nI7;
import X.C1432940nOO;
import X.C1444810nhX;
import X.C1463670oBx;
import X.C15438062q;
import X.C1697810uHb;
import X.C189200o6;
import X.C1931007hM;
import X.C1967607nG;
import X.C19719612Di;
import X.C20130113pb;
import X.C201955140j;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2286708xd;
import X.C2295408z2;
import X.C2298208zU;
import X.C23157095n;
import X.C23158095o;
import X.C23159095p;
import X.C23160095q;
import X.C23164095u;
import X.C23181096l;
import X.C23187096r;
import X.C2325381G0q;
import X.C2471909mP;
import X.C2501109r7;
import X.C2537209ww;
import X.C259800zU;
import X.C290450BZz;
import X.C301650Bs3;
import X.C311120CHm;
import X.C311170CHr;
import X.C311200CHu;
import X.C346630DiP;
import X.C352310DrZ;
import X.C443120HZe;
import X.C452501pT;
import X.C516501zn;
import X.C527950KnB;
import X.C536290L1n;
import X.C7740030o;
import X.C786410Ut5;
import X.EnumC1412640mre;
import X.EnumC1417520mzW;
import X.EnumC1418280n0k;
import X.EnumC20228214Cy;
import X.InterfaceC1417640mzi;
import X.InterfaceC1418120n0U;
import X.InterfaceC1452170ntP;
import X.InterfaceC1455860nzM;
import X.InterfaceC1635410sex;
import X.InterfaceC346201Wa;
import Y.AComparatorS41S0000000_22;
import Y.AComparatorS519S0100000_22;
import Y.ARunnableS108S0100000_8;
import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.cutsame.cut_android.NLEPrepareListener;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEAIMatting;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceDownloadCallback;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAIMatting;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.nle.editor_jni.VecString;
import com.bytedance.ies.smartmovie.jni.MusicRequestCallback;
import com.bytedance.ies.smartmovie.jni.MusicRequestParams;
import com.bytedance.ies.smartmovie.jni.NLEModelRequestParams;
import com.bytedance.ies.smartmovie.jni.SmartMovie;
import com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode;
import com.bytedance.ies.smartmovie.jni.SmartMovieJniJNI;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import com.bytedance.ies.smartmovie.jni.VecMeta;
import com.bytedance.ies.smartmovie.jni.VecStr;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.google.gson.k;
import com.google.gson.o;
import com.google.gson.p;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.MetaExt;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.TemplateDynamicSlotModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.cutsame.TemplateList;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.interfaces.ITemplateInsertMediaService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.IMusicPublishBridgeService;
import com.ss.android.ugc.aweme.services.external.TemplateScene;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.cut_ui.CutSource;
import com.ss.android.ugc.cut_ui.CutSourceType;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.AssetPanelModelKt;
import com.ss.android.ugc.effectmanager.effect.model.AssetType;
import com.ss.android.vesdk.VEUtils;
import com.ss.ugc.android.davinciresource.DavinciResource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS139S0110000_22;
import kotlin.jvm.internal.AwS217S0300000_8;
import kotlin.jvm.internal.AwS37S0600000_22;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS636S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public final class s {
    public static C11JF LJ;
    public static C1419550n2n LJFF;
    public static volatile Keva LJI;
    public static volatile InterfaceC1417640mzi LJII;
    public static volatile List<AutoCutThemeData> LJIIIIZZ;
    public static volatile Boolean LJIIIZ;
    public static final s LIZ = new s();
    public static final List<String> LIZIZ = Collections.singletonList("single_song");
    public static final List<String> LIZJ = C1697810uHb.LJIIJJI("sync_page_recommend", "slideshow_rec", "video_capsule_recommend");
    public static final List<String> LIZLLL = C1697810uHb.LJIIJJI("shoot_page_recommend", "edit_page_recommend");
    public static final C01GW LJIIJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(38));

    public static String LJJII() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
        Date time = Calendar.getInstance(TimeZone.getTimeZone("GMT+8")).getTime();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(simpleDateFormat.format(time));
        sbLIZ.append(".mp4");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJJJJJL() {
        Keva keva;
        if (LJFF != null) {
            LJFF();
        }
        if (LJI == null || (((keva = LJI) != null && keva.getBoolean("is_auto_cut_inited", false)) || TTNetInit.getEffectiveConnectionType() >= 6)) {
            C1419550n2n c1419550n2n = C1419550n2n.LL;
            LJFF = c1419550n2n;
            C786410Ut5.f3(c1419550n2n, Looper.myQueue());
        }
    }

    public static void LJFF() {
        MessageQueue messageQueueMyQueue = Looper.myQueue();
        C1419550n2n c1419550n2n = LJFF;
        if (c1419550n2n == null) {
            return;
        }
        messageQueueMyQueue.removeIdleHandler(c1419550n2n);
        C11JF c11jf = LJ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        LJFF = null;
        LJ = null;
    }

    public static boolean LJJIJIL() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "autocut_no_network_interact_optimize", true, false) && !C0XF1.LIZLLL(C0CHQ.LIZ);
    }

    public static final boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.isCurrentAutoCutMode() && videoPublishEditModel.getVoiceVolume() > 0.0f) {
            List<AutoCutMediaModel> listLJJI = LJJI(videoPublishEditModel);
            if (!listLJJI.isEmpty()) {
                Iterator<AutoCutMediaModel> it2 = listLJJI.iterator();
                while (it2.hasNext()) {
                    if (it2.next().isVideoType) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static NLEModel LIZLLL(List list) {
        NLEResType nLEResType;
        NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
        NLEModel model = nLEEditorLIZ.getModel();
        NLETrack nLETrack = new NLETrack();
        nLETrack.setMainTrack(true);
        long j = 0;
        for (MetaExt metaExt : (ArrayList) list) {
            long j2 = metaExt.duration * 1000;
            NLETrackSlot nLETrackSlot = new NLETrackSlot();
            nLETrackSlot.setStartTime(j);
            NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
            NLEResourceAV nLEResourceAV = new NLEResourceAV();
            nLEResourceAV.setResourceFile(metaExt.path);
            nLESegmentVideo.setTimeClipStart(0L);
            nLESegmentVideo.setTimeClipEnd(j2);
            nLEResourceAV.setDuration(j2);
            nLESegmentVideo.setSpeed(1.0f);
            nLEResourceAV.setHasAudio(metaExt.hasAudio);
            if (metaExt.isVideo()) {
                nLEResType = NLEResType.VIDEO;
            } else {
                nLEResType = NLEResType.IMAGE;
            }
            nLEResourceAV.setResourceType(nLEResType);
            nLESegmentVideo.setAVFile(nLEResourceAV);
            nLESegmentVideo.setEnableAudio(metaExt.hasAudio);
            nLETrackSlot.setMainSegment(nLESegmentVideo);
            j += j2;
            nLETrack.addSlot(nLETrackSlot);
        }
        if (!nLETrack.getSlots().isEmpty()) {
            nLETrack.setEndTime(((NLETimeSpaceNode) C13LP.LJJLIIIJJI(nLETrack.getSlots())).getEndTime());
            nLETrack.setDuration(((NLETimeSpaceNode) C13LP.LJJLIIIJJI(nLETrack.getSlots())).getEndTime());
        }
        model.addTrack(nLETrack);
        model.setDuration(nLETrack.getEndTime());
        nLEEditorLIZ.commit();
        nLEEditorLIZ.done();
        return model;
    }

    public static String LJ(AutoCutThemeData autoCutThemeData) {
        String musicId;
        if (autoCutThemeData == null) {
            return "theme is null";
        }
        Pair pairLJJL = LJJL(autoCutThemeData);
        AVMusic aVMusic = (AVMusic) pairLJJL.getFirst();
        String str = (String) pairLJJL.getSecond();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("musicId: ");
        sbLIZ.append(str);
        sbLIZ.append(", music's id ");
        if (aVMusic != null) {
            musicId = aVMusic.getMusicId();
        } else {
            musicId = null;
        }
        sbLIZ.append(musicId);
        sbLIZ.append(", templateId = ");
        sbLIZ.append(autoCutThemeData.templateId);
        sbLIZ.append(", templateType - ");
        sbLIZ.append(autoCutThemeData.templateId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LJI(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutHelper cancelTask: execId: ");
        sbLIZ.append(str);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        C1418540n1A.LIZ.getClass();
        C1418550n1B c1418550n1BLIZ = C1418540n1A.LIZ();
        SmartMovie smartMovie = c1418550n1BLIZ.LIZ;
        if (smartMovie == null) {
            smartMovie = null;
        }
        SmartMovieJniJNI.SmartMovie_cancel(smartMovie.LIZ, smartMovie, str);
        Long l = (Long) ((HashMap) c1418550n1BLIZ.LIZLLL.getValue()).get(str);
        if (l != null) {
            Object value = c1418550n1BLIZ.LIZJ.getValue();
            long jLongValue = l.longValue();
            value.getClass();
            C1418510n17.LIZ(jLongValue);
        }
    }

    public static void LJII(NLEModel nLEModel) {
        if (nLEModel != null && C1931007hM.LIZ()) {
            C1432940nOO.LIZ.getClass();
            if (C1432940nOO.LJII()) {
                C1420480n4I.LIZJ(nLEModel);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJIIIIZZ(boolean r2) {
        /*
            X.01GW r0 = X.C0BTO.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 == 0) goto L39
            X.0KnB r0 = X.C527950KnB.LIZ
            r0.getClass()
            boolean r0 = X.C527950KnB.LJ()
            if (r0 == 0) goto L39
        L1a:
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0o1f r0 = r0.getAccountService()
            boolean r0 = r0.LIZ()
            if (r0 != 0) goto L53
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0o1f r0 = r0.getAccountService()
            boolean r0 = r0.isLogin()
            if (r0 == 0) goto L53
            if (r2 != 0) goto L53
            return r1
        L39:
            X.01GW r0 = X.C275700ArI.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L53
            X.0KnB r0 = X.C527950KnB.LIZ
            r0.getClass()
            boolean r0 = X.C527950KnB.LJ()
            if (r0 == 0) goto L53
            goto L1a
        L53:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.autocut.s.LJIIIIZZ(boolean):boolean");
    }

    public static void LJIIJJI(NLEModel nLEModel) {
        if (nLEModel == null) {
            return;
        }
        for (NLEResourceNode nLEResourceNode : nLEModel.getAllResources()) {
            String resourceFile = nLEResourceNode.getResourceFile();
            if (resourceFile != null && resourceFile.length() != 0) {
                NLEResType nLEResType = NLEResType.VIDEO;
                NLEResType nLEResType2 = NLEResType.IMAGE;
                if (C1697810uHb.LJIIJJI(nLEResType, nLEResType2).contains(nLEResourceNode.getResourceType()) && C2286708xd.LIZJ(nLEResourceNode.getResourceFile())) {
                    if (C2471909mP.LJJIII(nLEResourceNode.getResourceFile(), true, 4)) {
                        nLEResourceNode.setResourceType(nLEResType2);
                    } else {
                        nLEResourceNode.setResourceType(nLEResType);
                    }
                }
            }
        }
    }

    public static final String LJIIL(CreativeInfo creativeInfo) {
        String strLIZLLL = C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228214Cy.SMART_MOVIE, null, false, 12);
        if (!new C0VSJ(strLIZLLL).exists()) {
            new C0VSJ(strLIZLLL).mkdirs();
        }
        return strLIZLLL;
    }

    public static final long LJIILL(InterfaceC1455860nzM interfaceC1455860nzM) {
        InterfaceC1452170ntP interfaceC1452170ntPLJJ;
        C1463670oBx c1463670oBx;
        AbstractC1452680nuE abstractC1452680nuEGc;
        NLEModel nLEModelLIZJ = null;
        if (interfaceC1455860nzM != null && (abstractC1452680nuEGc = interfaceC1455860nzM.gc()) != null) {
            interfaceC1452170ntPLJJ = abstractC1452680nuEGc.LJJ();
        } else {
            interfaceC1452170ntPLJJ = null;
        }
        if ((interfaceC1452170ntPLJJ instanceof C1463670oBx) && (c1463670oBx = (C1463670oBx) interfaceC1452170ntPLJJ) != null) {
            nLEModelLIZJ = c1463670oBx.LIZJ();
        }
        return LJJ(nLEModelLIZJ);
    }

    public static final List<Float> LJIIZILJ(NLEModel nLEModel) {
        VecNLETrackSlotSPtr slots;
        ArrayList arrayList = new ArrayList();
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null && (slots = mainTrack.getSlots()) != null) {
            ArrayList<NLESegment> arrayList2 = new ArrayList(C15438062q.LJIJJ(slots, 10));
            Iterator<NLETrackSlot> it2 = slots.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().getMainSegment());
            }
            for (NLESegment nLESegment : arrayList2) {
                if (nLESegment.getResource().getResourceType() == NLEResType.VIDEO || nLESegment.getResource().getResourceType() == NLEResType.IMAGE) {
                    NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLESegment);
                    arrayList.add(Float.valueOf((nLESegmentVideoDynamicCast.getTimeClipEnd() - nLESegmentVideoDynamicCast.getTimeClipStart()) / 1000000));
                }
            }
        }
        return arrayList;
    }

    public static final List LJIJI(String str) {
        Object c098200Yq;
        IAutoCutGeckoChannelService iAutoCutGeckoChannelService = (IAutoCutGeckoChannelService) PluggableExtentionKt.pluggableSpi$default(IAutoCutGeckoChannelService.class, false, false, false, 14, null);
        if (iAutoCutGeckoChannelService == null) {
            C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getGeckoChannelFilePaths(");
            sbLIZ.append(str);
            sbLIZ.append("): IAutoCutGeckoChannelService not found");
            C201955140j.LIZLLL(c1398350mUb, "AutoCutHelper", C2188811AlT.LIZIZ(sbLIZ));
            return C13BV.INSTANCE;
        }
        try {
            c098200Yq = iAutoCutGeckoChannelService.LIZIZ(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getGeckoChannelFilePaths(");
            sbLIZ2.append(str);
            sbLIZ2.append(") failed: ");
            sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
            C201955140j.LJIIIIZZ(c1398350mUb2, "AutoCutHelper", C2188811AlT.LIZIZ(sbLIZ2));
        }
        C13BV c13bv = C13BV.INSTANCE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = c13bv;
        }
        List list = (List) c098200Yq;
        C1398350mUb c1398350mUb3 = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("getGeckoChannelFilePaths(");
        sbLIZ3.append(str);
        sbLIZ3.append("): result size=");
        sbLIZ3.append(list.size());
        C201955140j.LIZLLL(c1398350mUb3, "AutoCutHelper", C2188811AlT.LIZIZ(sbLIZ3));
        return list;
    }

    public static AFwS234S0000000_5 LJIJJLI(boolean z) {
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "autocut_ignore_music_detail_call", true, false) && !z) {
            return null;
        }
        return AFwS234S0000000_5.get$arr$(26);
    }

    public static final long LJJ(NLEModel nLEModel) {
        if (nLEModel != null && nLEModel.getMainTrack() != null) {
            return nLEModel.getMeasuredEndTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        }
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List<AutoCutMediaModel> LJJI(VideoPublishEditModel videoPublishEditModel) {
        VecNLETrackSlotSPtr slots;
        boolean z;
        C0FGC.LIZ(2);
        NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
        nLEEditorLIZ.restore(videoPublishEditModel.getNleData());
        nLEEditorLIZ.commit();
        nLEEditorLIZ.done();
        NLEModel model = nLEEditorLIZ.getModel();
        ArrayList arrayList = new ArrayList();
        NLETrack mainTrack = model.getMainTrack();
        if (mainTrack != null && (slots = mainTrack.getSlots()) != null) {
            ArrayList<NLESegment> arrayList2 = new ArrayList(C15438062q.LJIJJ(slots, 10));
            Iterator<NLETrackSlot> it2 = slots.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().getMainSegment());
            }
            for (NLESegment nLESegment : arrayList2) {
                NLEResType resourceType = nLESegment.getResource().getResourceType();
                NLEResType nLEResType = NLEResType.VIDEO;
                if (resourceType == nLEResType || nLESegment.getResource().getResourceType() == NLEResType.IMAGE) {
                    NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLESegment);
                    String resourceFile = nLESegmentVideoDynamicCast.getResource().getResourceFile();
                    String str = null;
                    Object[] objArr = 0;
                    Object[] objArr2 = 0;
                    Object[] objArr3 = 0;
                    Object[] objArr4 = 0;
                    int i = 0;
                    Object[] objArr5 = 0;
                    Object[] objArr6 = 0;
                    if (nLESegmentVideoDynamicCast.getResource().getResourceType() == nLEResType) {
                        z = true;
                    } else {
                        z = false;
                    }
                    long timeClipStart = nLESegmentVideoDynamicCast.getTimeClipStart();
                    long j = LSPassThroughRecordSizeConfig.DEFAULT;
                    AutoCutMediaModel autoCutMediaModel = new AutoCutMediaModel(resourceFile, str, objArr4 == true ? 1 : 0, i, objArr6 == true ? 1 : 0, z, 0L, timeClipStart / j, (nLESegmentVideoDynamicCast.getTimeClipEnd() - nLESegmentVideoDynamicCast.getTimeClipStart()) / j, 0.0f, objArr5 == true ? 1 : 0, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, 7774, objArr == true ? 1 : 0);
                    if (nLESegment.getResource().getResourceType() == nLEResType) {
                        autoCutMediaModel.speed = nLESegmentVideoDynamicCast.getSpeed();
                    }
                    arrayList.add(autoCutMediaModel);
                }
            }
        }
        return arrayList;
    }

    public static List LJJIFFI(AutoCutModel autoCutModel) {
        List<AutoCutThemeData> listLJ = C1416110mxF.LJ(autoCutModel);
        ArrayList<AutoCutThemeData> arrayList = (ArrayList) listLJ;
        if (!arrayList.isEmpty()) {
            for (AutoCutThemeData autoCutThemeData : arrayList) {
                if (autoCutThemeData.reuseMusicAlignDisplayIndex > 0 && autoCutThemeData.reuseMusicAlignBranch != 1) {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : arrayList) {
                        AutoCutThemeData autoCutThemeData2 = (AutoCutThemeData) obj;
                        if (autoCutThemeData2.LIZIZ() != C0MJ9.AUTO_CUT && autoCutThemeData2.LIZIZ() != C0MJ9.PLACE_HOLDER) {
                            arrayList3.add(obj);
                        } else {
                            arrayList2.add(obj);
                        }
                    }
                    Pair pair = new Pair(arrayList2, arrayList3);
                    Iterable iterable = (Iterable) pair.getFirst();
                    return C13LP.LJLIL(C13LP.LJLLLL(new AComparatorS519S0100000_22(new AComparatorS519S0100000_22(new AComparatorS41S0000000_22(2), 0), 1), iterable), (Collection) pair.getSecond());
                }
            }
        }
        return listLJ;
    }

    public static String LJJIIZ(Map map) {
        String str;
        if (map != null) {
            str = (String) map.get("autocut_template_group_id");
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    public static String LJJIIZI(Map map) {
        String str;
        if (map != null) {
            str = (String) map.get("autocut_template_tag");
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    public static Integer LJJIJ(Map map) {
        String str;
        if (map != null && (str = (String) map.get("template_type")) != null) {
            return Integer.valueOf(CastIntegerProtector.parseInt(str));
        }
        return null;
    }

    public static boolean LJJIJL(Asset asset) {
        AssetType assetType;
        EnumC1412640mre enumC1412640mreLIZLLL;
        if (asset == null || (assetType = AssetPanelModelKt.toAssetType(asset.getAsset_type())) == null || (enumC1412640mreLIZLLL = C1412660mrg.LIZLLL(assetType)) == null) {
            return false;
        }
        enumC1412640mreLIZLLL.getValue();
        return true;
    }

    public static CutsameDataItem LJJIZ(Music music) {
        return new CutsameDataItem("", EnumC1412640mre.DESIGNER_FIXED_TEMPLATE.getValue(), "", "", "", null, null, 0, 0L, "", "", "", "", null, null, null, false, 0, "", "", null, music, null, Boolean.FALSE, 0, null, null, new ArrayList(), null, -1.0f, null, null, null, null, false, null, null, null, null, null, null, null, null, null);
    }

    public static String LJJJJIZL(String str) {
        try {
            k kVar = GsonProtectorUtils.parse(new p(), str);
            boolean z = true;
            if (!kVar.LJIILIIL().LJJIJIIJIL("task_id")) {
                z = false;
            }
            if (!z) {
                return null;
            }
            return u.LJJIFFI(kVar.LJIILIIL().LJJIIZ("task_id").toString(), "\"", "", false);
        } catch (o e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (IllegalStateException e2) {
            TryCatchGuardChecker.doCheck(e2);
            C201955140j.LJIIJ(C1398350mUb.LIZIZ, "parseTaskId", e2);
            return null;
        }
    }

    public static void LJJJJLI(TemplateList templateList) {
        List<CutsameDataItem> list;
        boolean z;
        boolean z2;
        if (templateList == null || (list = templateList.templateList) == null) {
            return;
        }
        int i = 0;
        if (!list.isEmpty()) {
            Iterator<CutsameDataItem> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().templateType == EnumC1412640mre.LYRICS_RULE_TEMPLATE.getValue()) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        List<String> list2 = templateList.urlPrefix;
        if (list2 != null && !list2.isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            if (z) {
                C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                StringBuilder sb = new StringBuilder("FAIL urlPrefix missing, all LR lyricCoverUrl will be null lrCount=");
                if (!list.isEmpty()) {
                    Iterator<CutsameDataItem> it3 = list.iterator();
                    i = 0;
                    while (it3.hasNext()) {
                        if (it3.next().templateType == EnumC1412640mre.LYRICS_RULE_TEMPLATE.getValue() && (i = i + 1) < 0) {
                            C1697810uHb.LJIJ();
                            throw null;
                        }
                    }
                }
                sb.append(i);
                C1426005i6.LIZJ(c1398350mUb, "Parse.AutoCut", sb.toString());
                return;
            }
            return;
        }
        for (CutsameDataItem cutsameDataItem : list) {
            if (cutsameDataItem.templateType == EnumC1412640mre.LYRICS_RULE_TEMPLATE.getValue()) {
                cutsameDataItem.lyricCoverUrl = C1417910n09.LIZ(cutsameDataItem.extra, list2);
                C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("templateId=");
                sbLIZ.append(cutsameDataItem.templateId);
                sbLIZ.append(" → lyricCoverUrl=");
                sbLIZ.append(cutsameDataItem.lyricCoverUrl);
                C1426005i6.LIZ(c1398350mUb2, "Parse.AutoCut", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public static Pair LJJL(AutoCutThemeData autoCutThemeData) {
        MusicBuzModel musicBuzModel;
        String musicId;
        String str = null;
        if (autoCutThemeData != null) {
            musicBuzModel = autoCutThemeData.musicBuzModel;
        } else {
            musicBuzModel = null;
        }
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel);
        if (aVMusicExtractAVMusic != null && (musicId = aVMusicExtractAVMusic.getMusicId()) != null) {
            str = musicId;
        } else if (autoCutThemeData != null) {
            str = autoCutThemeData.musicId;
        }
        return new Pair(aVMusicExtractAVMusic, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C443120HZe<com.ss.android.ugc.aweme.cutsame.TemplateList, java.lang.String, java.lang.String> LJJLI(java.lang.String r10) {
        /*
            boolean r0 = X.C311130CHn.LIZ()
            java.lang.String r4 = "not_used"
            r5 = 2
            java.lang.String r3 = ""
            r2 = 0
            if (r0 != 0) goto L81
            boolean r0 = X.C296630Bjx.LIZ()
            if (r0 != 0) goto L81
            com.ss.android.ugc.aweme.cutsame.TemplateList r6 = new com.ss.android.ugc.aweme.cutsame.TemplateList     // Catch: java.lang.Exception -> L77
            r6.<init>()     // Catch: java.lang.Exception -> L77
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Exception -> L77
            r9.<init>()     // Catch: java.lang.Exception -> L77
            com.ss.android.ugc.aweme.utils.GsonProvider r0 = X.C7740030o.LIZ()     // Catch: java.lang.Exception -> L77
            com.google.gson.Gson r1 = r0.getGson()     // Catch: java.lang.Exception -> L77
            if (r10 != 0) goto L27
            r10 = r3
        L27:
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.model.MusicList> r0 = com.ss.android.ugc.aweme.shortvideo.model.MusicList.class
            java.lang.Object r8 = r1.LJII(r10, r0)     // Catch: java.lang.Exception -> L77
            com.ss.android.ugc.aweme.shortvideo.model.MusicList r8 = (com.ss.android.ugc.aweme.shortvideo.model.MusicList) r8     // Catch: java.lang.Exception -> L77
            java.util.List<com.ss.android.ugc.aweme.music.model.Music> r0 = r8.musicList     // Catch: java.lang.Exception -> L77
            if (r0 == 0) goto L50
            java.util.Iterator r7 = r0.iterator()     // Catch: java.lang.Exception -> L77
        L37:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Exception -> L77
            if (r0 == 0) goto L50
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Exception -> L77
            com.ss.android.ugc.aweme.music.model.Music r1 = (com.ss.android.ugc.aweme.music.model.Music) r1     // Catch: java.lang.Exception -> L77
            com.ss.android.ugc.aweme.autocut.s r0 = com.ss.android.ugc.aweme.autocut.s.LIZ     // Catch: java.lang.Exception -> L77
            r0.getClass()     // Catch: java.lang.Exception -> L77
            com.ss.android.ugc.aweme.cutsame.CutsameDataItem r0 = LJJIZ(r1)     // Catch: java.lang.Exception -> L77
            r9.add(r0)     // Catch: java.lang.Exception -> L77
            goto L37
        L50:
            r6.templateList = r9     // Catch: java.lang.Exception -> L77
            int r0 = X.C311120CHm.LIZ()     // Catch: java.lang.Exception -> L77
            if (r0 == r5) goto L68
            java.lang.String r1 = r8.respJson     // Catch: java.lang.Exception -> L77
            if (r1 == 0) goto L67
            com.ss.android.ugc.aweme.autocut.s r0 = com.ss.android.ugc.aweme.autocut.s.LIZ     // Catch: java.lang.Exception -> L77
            r0.getClass()     // Catch: java.lang.Exception -> L77
            java.lang.String r4 = LJJJJIZL(r1)     // Catch: java.lang.Exception -> L77
            if (r4 != 0) goto L68
        L67:
            r4 = r3
        L68:
            com.ss.android.ugc.aweme.base.api.BaseResponse$ServerTimeExtra r0 = r8.extra     // Catch: java.lang.Exception -> L77
            if (r0 == 0) goto L71
            java.lang.String r0 = r0.logid     // Catch: java.lang.Exception -> L77
            if (r0 == 0) goto L71
            r3 = r0
        L71:
            X.0HZe r0 = new X.0HZe     // Catch: java.lang.Exception -> L77
            r0.<init>(r6, r4, r3)     // Catch: java.lang.Exception -> L77
            return r0
        L77:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.0HZe r0 = new X.0HZe
            r0.<init>(r2, r2, r2)
            return r0
        L81:
            com.ss.android.ugc.aweme.utils.GsonProvider r0 = X.C7740030o.LIZ()     // Catch: java.lang.Exception -> Lbc
            com.google.gson.Gson r1 = r0.getGson()     // Catch: java.lang.Exception -> Lbc
            if (r10 != 0) goto L8c
            r10 = r3
        L8c:
            java.lang.Class<com.ss.android.ugc.aweme.cutsame.TemplateList> r0 = com.ss.android.ugc.aweme.cutsame.TemplateList.class
            java.lang.Object r1 = r1.LJII(r10, r0)     // Catch: java.lang.Exception -> Lbc
            com.ss.android.ugc.aweme.cutsame.TemplateList r1 = (com.ss.android.ugc.aweme.cutsame.TemplateList) r1     // Catch: java.lang.Exception -> Lbc
            com.ss.android.ugc.aweme.autocut.s r0 = com.ss.android.ugc.aweme.autocut.s.LIZ     // Catch: java.lang.Exception -> Lbc
            r0.getClass()     // Catch: java.lang.Exception -> Lbc
            LJJJJLI(r1)     // Catch: java.lang.Exception -> Lbc
            int r0 = X.C311120CHm.LIZ()     // Catch: java.lang.Exception -> Lbc
            if (r0 == r5) goto Lad
            java.lang.String r0 = r1.respJson     // Catch: java.lang.Exception -> Lbc
            if (r0 == 0) goto Lac
            java.lang.String r4 = LJJJJIZL(r0)     // Catch: java.lang.Exception -> Lbc
            if (r4 != 0) goto Lad
        Lac:
            r4 = r3
        Lad:
            com.ss.android.ugc.aweme.base.api.BaseResponse$ServerTimeExtra r0 = r1.extra     // Catch: java.lang.Exception -> Lbc
            if (r0 == 0) goto Lb6
            java.lang.String r0 = r0.logid     // Catch: java.lang.Exception -> Lbc
            if (r0 == 0) goto Lb6
            r3 = r0
        Lb6:
            X.0HZe r0 = new X.0HZe     // Catch: java.lang.Exception -> Lbc
            r0.<init>(r1, r4, r3)     // Catch: java.lang.Exception -> Lbc
            return r0
        Lbc:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.0HZe r0 = new X.0HZe
            r0.<init>(r2, r2, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.autocut.s.LJJLI(java.lang.String):X.0HZe");
    }

    public static void LJJLIIIJ(Function0 function0) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            function0.invoke();
        } else {
            C786410Ut5.LJJZZIII((Handler) LJIIJ.getValue(), new ARunnableS108S0100000_8(function0, (Function0<Unit>) 10));
        }
    }

    public static final boolean LJJLIIIJILLIZJL(VideoPublishEditModel videoPublishEditModel) {
        if (C527950KnB.LIZIZ() && videoPublishEditModel.isCurrentAutoCutMode() && !videoPublishEditModel.shouldReuseAutoCutAnchor() && !C1428470nHB.LJJJJLI(videoPublishEditModel) && !C1428470nHB.LJLJJL(videoPublishEditModel) && !C1428470nHB.LJJJJJ(videoPublishEditModel) && !C1428470nHB.LJLLLL(videoPublishEditModel)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(58:7|(2:44|(1:46)(1:324))(2:11|(2:13|(1:43)(1:17))(0))|18|(1:26)|27|(1:35)|36|(5:310|47|(6:49|(1:51)|52|(1:54)|55|(1:57)(1:58))(1:59)|302|60)|(4:313|61|(4:63|308|64|(1:66))(1:67)|(5:83|311|84|304|85)(8:73|(3:76|(2:317|80)(1:318)|74)|315|83|311|84|304|85))|98|(1:100)|101|(10:103|(1:107)|108|(1:112)|113|(1:117)|118|(1:122)|123|(1:136)(4:127|(2:128|(2:130|(1:320)(1:321))(2:319|269))|132|(0)))(1:270)|137|(45:139|(44:262|(0)|146|(1:152)|153|(2:157|(2:159|(1:163))(0))(0)|(2:167|(2:169|(1:173))(0))(0)|174|(2:176|(1:261)(1:182))(2:256|(0)(1:260))|183|(1:185)(1:250)|186|(1:188)|(1:192)|(1:198)|199|(1:201)|(2:203|(1:209))(1:249)|(1:247)(1:213)|214|(1:216)|217|(1:221)|222|(1:246)(1:226)|227|(1:231)|232|(1:234)(1:245)|235|(3:237|(2:239|(1:241))|242)(1:244)|243|306|271|(1:277)(1:275)|276|280|(1:282)|283|(1:289)|290|(1:299)(1:296)|297|298)|143|(1:145)|146|(2:148|152)(0)|153|(3:155|157|(0)(0))(0)|(3:165|167|(0)(0))(0)|174|(0)(0)|183|(0)(0)|186|(0)|(2:190|192)(0)|(2:194|198)(0)|199|(0)|(0)(0)|(2:211|247)(1:248)|214|(0)|217|(2:219|221)(0)|222|(2:224|246)(0)|227|(2:229|231)|232|(0)(0)|235|(0)(0)|243|306|271|(3:273|277|276)(0)|280|(0)|283|(3:285|287|289)|290|(2:292|299)(0)|297|298)(1:265)|266|(1:268)(2:143|(0))|146|(0)(0)|153|(0)(0)|(0)(0)|174|(0)(0)|183|(0)(0)|186|(0)|(0)(0)|(0)(0)|199|(0)|(0)(0)|(0)(0)|214|(0)|217|(0)(0)|222|(0)(0)|227|(0)|232|(0)(0)|235|(0)(0)|243|306|271|(0)(0)|280|(0)|283|(0)|290|(0)(0)|297|298) */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x04d7, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x04d8, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1);
        r0 = new X.C098200Yq(r1);
        X.C189200o6.m2constructorimpl(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x028b A[PHI: r15 r28
      0x028b: PHI (r15v7 boolean) = (r15v1 boolean), (r15v8 boolean), (r15v8 boolean) binds: [B:267:0x0489, B:263:0x0482, B:142:0x0289] A[DONT_GENERATE, DONT_INLINE]
      0x028b: PHI (r28v4 java.lang.String) = (r28v0 java.lang.String), (r28v6 java.lang.String), (r28v5 java.lang.String) binds: [B:267:0x0489, B:263:0x0482, B:142:0x0289] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02c7 A[PHI: r6
      0x02c7: PHI (r6v5 java.lang.String) = (r6v1 java.lang.String), (r6v6 java.lang.String) binds: [B:158:0x02c5, B:156:0x02c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02d5 A[PHI: r6
      0x02d5: PHI (r6v2 java.lang.String) = (r6v1 java.lang.String), (r6v5 java.lang.String), (r6v5 java.lang.String) binds: [B:158:0x02c5, B:160:0x02cb, B:162:0x02d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02e1 A[PHI: r1
      0x02e1: PHI (r1v31 java.lang.String) = (r1v10 java.lang.String), (r1v32 java.lang.String) binds: [B:168:0x02df, B:166:0x02dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02ef A[PHI: r1
      0x02ef: PHI (r1v11 java.lang.String) = (r1v10 java.lang.String), (r1v31 java.lang.String), (r1v31 java.lang.String) binds: [B:168:0x02df, B:170:0x02e5, B:172:0x02ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0437 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04bc A[Catch: all -> 0x04d7, TryCatch #2 {all -> 0x04d7, blocks: (B:271:0x04b2, B:273:0x04bc, B:275:0x04c2, B:276:0x04d1), top: B:306:0x04b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.cutsame.CutsameDataItem LJJLIIIJLJLI(com.ss.android.ugc.effectmanager.effect.model.Asset r64) {
        /*
            Method dump skipped, instruction units count: 1434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.autocut.s.LJJLIIIJLJLI(com.ss.android.ugc.effectmanager.effect.model.Asset):com.ss.android.ugc.aweme.cutsame.CutsameDataItem");
    }

    public static final void LJJLIIIJLLLLLLLZ(String str) {
        Object c098200Yq;
        if (!C0CHV.LIZ() && !C0CHU.LIZ()) {
            return;
        }
        IAutoCutGeckoChannelService iAutoCutGeckoChannelService = (IAutoCutGeckoChannelService) PluggableExtentionKt.pluggableSpi$default(IAutoCutGeckoChannelService.class, false, false, false, 14, null);
        if (iAutoCutGeckoChannelService == null) {
            C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("triggerGeckoChannelUpdate(");
            sbLIZ.append(str);
            sbLIZ.append("): IAutoCutGeckoChannelService not found");
            C201955140j.LIZLLL(c1398350mUb, "AutoCutHelper", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        try {
            iAutoCutGeckoChannelService.LIZ(str);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("triggerGeckoChannelUpdate(");
            sbLIZ2.append(str);
            sbLIZ2.append(") failed: ");
            sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
            C201955140j.LIZLLL(c1398350mUb2, "AutoCutHelper", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public static final void LJJLIIJ(AutoCutMediaModel autoCutMediaModel) {
        VEUtils.VEVideoFileInfo videoFileInfo;
        int i;
        int i2;
        if (autoCutMediaModel.isVideoType) {
            if ((autoCutMediaModel.width == 0 || autoCutMediaModel.height == 0) && (videoFileInfo = VEUtils.getVideoFileInfo(autoCutMediaModel.filePath)) != null && (i = videoFileInfo.width) > 0 && (i2 = videoFileInfo.height) > 0) {
                autoCutMediaModel.width = i;
                autoCutMediaModel.height = i2;
                return;
            }
            return;
        }
        Pair<Integer, Integer> pairLIZJ = C097U.LIZJ(autoCutMediaModel.filePath);
        if (pairLIZJ.getFirst().intValue() <= 0 || pairLIZJ.getSecond().intValue() <= 0) {
            return;
        }
        autoCutMediaModel.width = pairLIZJ.getFirst().intValue();
        autoCutMediaModel.height = pairLIZJ.getSecond().intValue();
    }

    public final synchronized void LJJJI(boolean z) {
        InterfaceC1417640mzi interfaceC1417640mzi = LJII;
        if (interfaceC1417640mzi != null) {
            LJJLIIIJ(new AwS139S0110000_22(interfaceC1417640mzi, z, 0));
        } else {
            LJIIIZ = Boolean.valueOf(z);
        }
    }

    public final synchronized void LJJJIL(List<AutoCutThemeData> list) {
        String str;
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutHelper#templateList_update: notifyTemplateList size=");
        sbLIZ.append(list.size());
        sbLIZ.append(", firstId=");
        AutoCutThemeData autoCutThemeData = (AutoCutThemeData) C13LP.LJJJLL(list);
        if (autoCutThemeData == null || (str = autoCutThemeData.templateId) == null) {
            str = "<empty>";
        }
        sbLIZ.append(str);
        C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1417640mzi interfaceC1417640mzi = LJII;
        if (interfaceC1417640mzi != null) {
            LJJLIIIJ(new AwS423S0200000_22(interfaceC1417640mzi, (InterfaceC1417640mzi) list, (List<AutoCutThemeData>) 5));
        } else {
            LJIIIIZZ = list;
        }
    }

    public static int LJIILLIIL(AutoCutModel autoCutModel, List list) {
        if (list != null) {
            return C1403130mcJ.LIZIZ(list, autoCutModel.curIndexFromSource, C1416110mxF.LJIIJJI(autoCutModel.curSource));
        }
        return C1416110mxF.LIZIZ(autoCutModel);
    }

    public static String LJIJ(long j, String str) throws Throwable {
        String first;
        Pair<String, Long> pairLJI = C2471909mP.LIZ.LJI(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        Long second = null;
        if (pairLJI != null) {
            first = pairLJI.getFirst();
        } else {
            first = null;
        }
        sbLIZ2.append(first);
        if (pairLJI != null) {
            second = pairLJI.getSecond();
        }
        sbLIZ2.append(second);
        sbLIZ.append(C08F1.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2)));
        sbLIZ.append(j);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static Pair LJIJJ(int i, boolean z) {
        int[] iArr;
        int[] iArr2 = {0};
        if (z) {
            iArr = new int[]{Math.min(10000, i)};
        } else {
            iArr = new int[]{Math.min(100000, i)};
        }
        return new Pair(iArr2, iArr);
    }

    public static String LJJIJLIJ(String str, Map map) {
        boolean z;
        boolean z2;
        JSONObject jSONObject;
        boolean z3;
        if (map != null && !map.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return str;
        }
        try {
            if (str.length() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                jSONObject = new JSONObject(str);
            } else {
                jSONObject = new JSONObject();
            }
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    if (((CharSequence) value).length() != 0) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (!z3) {
                    }
                }
                jSONObject.put(str2, value);
            }
            str = C786410Ut5.J3(jSONObject);
            return str;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0009  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJJIL(java.lang.String r4, java.util.Map r5) throws org.json.JSONException {
        /*
            if (r4 == 0) goto L9
            boolean r0 = kotlin.text.a0.LJJJIL(r4)     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L9
            goto Lb
        L9:
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L14
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1a
            r3.<init>()     // Catch: java.lang.Throwable -> L1a
            goto L23
        L14:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1a
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L1a
            goto L23
        L1a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
        L23:
            java.util.Set r0 = r5.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L2b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L47
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L2b
            r3.put(r1, r0)
            goto L2b
        L47:
            java.lang.String r0 = X.C786410Ut5.J3(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.autocut.s.LJJIL(java.lang.String, java.util.Map):java.lang.String");
    }

    public static boolean LJJJJJ(String str, boolean z) {
        if (!Intrinsics.LJFF(str, "single_song") && z) {
            return false;
        }
        return true;
    }

    public static final void LJJLIIIIJ(NLEModel nLEModel, NLEResourceDownloadCallback nLEResourceDownloadCallback) {
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, "AutoCutHelper restoreResource");
        C1418540n1A.LIZ.getClass();
        C1418550n1B c1418550n1BLIZ = C1418540n1A.LIZ();
        c1418550n1BLIZ.getClass();
        C1418360n0s c1418360n0s = new C1418360n0s(nLEResourceDownloadCallback, nLEModel);
        SmartMovie smartMovie = c1418550n1BLIZ.LIZ;
        if (smartMovie == null) {
            smartMovie = null;
        }
        ((HashMap) c1418550n1BLIZ.LIZLLL.getValue()).put(SmartMovieJniJNI.SmartMovie_restore(smartMovie.LIZ, smartMovie, C1967607nG.LIZ(nLEModel), NLEResourceDownloadCallback.getCPtr(c1418360n0s), c1418360n0s), Long.valueOf(c1418360n0s.LIZJ));
    }

    public static String LJJLIIIJJIZ(NLEModel nLEModel, int i) {
        if (nLEModel == null) {
            return null;
        }
        C0FGC.LIZ(2);
        if (i != EnumC1412640mre.DESIGNER_FIXED_TEMPLATE.getValue() && i != EnumC1412640mre.ALGORITHM_TEMPLATE.getValue()) {
            NLETemplateModel nLETemplateModelCreateFromDraft = NLETemplateModel.createFromDraft(nLEModel);
            if (nLETemplateModelCreateFromDraft == null) {
                return null;
            }
            return nLETemplateModelCreateFromDraft.store();
        }
        NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
        nLEEditorLIZ.setModel(nLEModel);
        nLEEditorLIZ.commit();
        nLEEditorLIZ.done();
        return nLEEditorLIZ.store();
    }

    public static void LJJLIL(AutoCutModel autoCutModel, NLEModel nLEModel) {
        String extra;
        if (autoCutModel != null) {
            autoCutModel.speedVariationType = null;
        }
        if (nLEModel != null && (extra = nLEModel.getExtra("autocut_speed_variation_type")) != null && extra.length() > 0 && autoCutModel != null) {
            autoCutModel.speedVariationType = C2095008Iq.LJIIJJI(extra);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIJIIJI(java.lang.String r10, X.InterfaceC1364105Vn<? super java.lang.Boolean> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C1418090n0R
            if (r0 == 0) goto L75
            r6 = r11
            X.0n0R r6 = (X.C1418090n0R) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L75
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r5 = 1
            if (r0 == 0) goto L29
            if (r0 != r5) goto L7b
            X.C155000ia.LIZIZ(r1)
        L22:
            boolean r0 = r1 instanceof X.C23149095f
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L29:
            X.C155000ia.LIZIZ(r1)
            com.bytedance.ies.nle.editor_jni.NLEEditor r0 = X.C346630DiP.LIZ()
            r0.restore(r10)
            com.bytedance.ies.nle.editor_jni.NLEModel r8 = r0.getModel()
            com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr r0 = r8.getTracks()
            java.util.Iterator r4 = r0.iterator()
        L3f:
            boolean r0 = r4.hasNext()
            r3 = 0
            if (r0 == 0) goto L73
            java.lang.Object r2 = r4.next()
            r0 = r2
            com.bytedance.ies.nle.editor_jni.NLETrack r0 = (com.bytedance.ies.nle.editor_jni.NLETrack) r0
            com.bytedance.ies.nle.editor_jni.NLETrackType r1 = r0.getTrackType()
            com.bytedance.ies.nle.editor_jni.NLETrackType r0 = com.bytedance.ies.nle.editor_jni.NLETrackType.AUDIO
            if (r1 != r0) goto L3f
        L55:
            com.bytedance.ies.nle.editor_jni.NLETrack r2 = (com.bytedance.ies.nle.editor_jni.NLETrack) r2
            if (r2 == 0) goto L5c
            r8.removeTrack(r2)
        L5c:
            X.095n r0 = X.C23157095n.LIZ
            r0.getClass()
            X.01Wa r1 = X.C23157095n.LIZJ(r8)
            X.0966 r0 = new X.0966
            r0.<init>(r3)
            r6.LLILLL = r5
            java.lang.Object r1 = X.C09IC.LJIJ(r1, r6, r0)
            if (r1 != r7) goto L22
            return r7
        L73:
            r2 = r3
            goto L55
        L75:
            X.0n0R r6 = new X.0n0R
            r6.<init>(r9, r11)
            goto L12
        L7b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.autocut.s.LJJIJIIJI(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0129 A[LOOP:2: B:44:0x0123->B:46:0x0129, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015b A[LOOP:3: B:48:0x0155->B:50:0x015b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0194 A[LOOP:4: B:58:0x018e->B:60:0x0194, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LJIIJ(java.util.List r25, com.ss.android.ugc.aweme.creative.model.AutoCutThemeData r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.autocut.s.LJIIJ(java.util.List, com.ss.android.ugc.aweme.creative.model.AutoCutThemeData, boolean):java.util.List");
    }

    public static final String LJIILIIL(int i, AutoCutModel autoCutModel, C0MJ9 c0mj9) {
        AutoCutThemeData autoCutThemeDataLJJIII = LJJIII(i, autoCutModel, c0mj9);
        if (autoCutThemeDataLJJIII != null) {
            return autoCutThemeDataLJJIII.name;
        }
        return null;
    }

    public static final AutoCutThemeData LJJIII(int i, AutoCutModel autoCutModel, C0MJ9 c0mj9) {
        if (c0mj9 == null) {
            return null;
        }
        return C1416110mxF.LJFF(i, autoCutModel, c0mj9);
    }

    public static final String LJJIIJ(AutoCutModel autoCutModel, C0MJ9 c0mj9, Integer num) {
        int iIntValue;
        if (autoCutModel == null) {
            return "other";
        }
        if (c0mj9 == null) {
            c0mj9 = C1416110mxF.LJIIJJI(autoCutModel.curSource);
        }
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = autoCutModel.curIndexFromSource;
        }
        if (iIntValue != 0 || c0mj9 != C0MJ9.AUTO_CUT) {
            return "other";
        }
        return autoCutModel.reuseMusicType;
    }

    public static void LJJJJL(Set set, String str, Integer num) {
        if (C13LP.LJJJJ(num, C1697810uHb.LJIIJJI(Integer.valueOf(EnumC1412640mre.CUT_SAME.getValue()), Integer.valueOf(EnumC1412640mre.PUGC_TEMPLATE.getValue()), Integer.valueOf(EnumC1412640mre.AIGT.getValue()), Integer.valueOf(EnumC1412640mre.SGT.getValue()))) && !C123100dR.LIZ(str) && set != null && !set.isEmpty()) {
            VecString vecString = new VecString();
            vecString.addAll(C13LP.LL(set, 3));
            if (num != null) {
                int iIntValue = num.intValue();
                C1419810n3D.LIZ.getClass();
                C1419810n3D.LIZIZ(iIntValue).fetchResourceList(vecString, 3, null);
            }
        }
    }

    public static final String LJJLIIIJJI(String str, String str2, List list) {
        if (list.isEmpty()) {
            return null;
        }
        if (str == null || str.length() == 0) {
            if (str2 != null && str2.length() != 0) {
                str = str2;
            } else {
                return (String) ListProtector.get(list, 0);
            }
        }
        return (String) ListProtector.get(list, (str.hashCode() & Integer.MAX_VALUE) % list.size());
    }

    public static final List<AutoCutThemeData> LIZ(List<AutoCutThemeData> list, AutoCutThemeData autoCutThemeData, int i, String str) {
        String strLJJLIIIJJI;
        MusicBuzModel musicBuzModel;
        AVMusic aVMusicExtractAVMusic;
        String strLIZIZ = str;
        List listLJIJI = LJIJI(C2537209ww.LIZ());
        if (i <= 0) {
            return list;
        }
        int i2 = i - 1;
        if (i2 < 0) {
            i2 = 0;
        }
        if (strLIZIZ == null && ((musicBuzModel = autoCutThemeData.musicBuzModel) == null || (aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel)) == null || (strLIZIZ = C1417320mzC.LIZIZ(aVMusicExtractAVMusic)) == null)) {
            MusicBuzModel musicBuzModel2 = autoCutThemeData.reuseMusicOverrideBuz;
            if (musicBuzModel2 == null) {
                musicBuzModel2 = autoCutThemeData.musicBuzModel;
            }
            AVMusic aVMusicExtractAVMusic2 = MusicBeanUtilKt.extractAVMusic(musicBuzModel2);
            if (aVMusicExtractAVMusic2 == null || (strLIZIZ = C1417320mzC.LIZIZ(aVMusicExtractAVMusic2)) == null) {
                strLIZIZ = autoCutThemeData.name;
            }
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i3 = 0;
        int i4 = 0;
        for (AutoCutThemeData autoCutThemeData2 : list) {
            int i5 = i3 + 1;
            if (i3 >= 0) {
                AutoCutThemeData autoCutThemeDataLIZ = autoCutThemeData2;
                if (i3 == 0) {
                    String strLJJLIIIJJI2 = autoCutThemeData.reuseMusicLocalCoverPath;
                    if ((strLJJLIIIJJI2 == null || strLJJLIIIJJI2.length() == 0) && ((strLJJLIIIJJI2 = autoCutThemeDataLIZ.reuseMusicLocalCoverPath) == null || strLJJLIIIJJI2.length() == 0)) {
                        strLJJLIIIJJI2 = LJJLIIIJJI(autoCutThemeDataLIZ.templateId, autoCutThemeDataLIZ.musicId, listLJIJI);
                    }
                    autoCutThemeDataLIZ = AutoCutThemeData.LIZ(autoCutThemeDataLIZ, null, null, null, null, null, false, null, 1, 2, strLJJLIIIJJI2, strLIZIZ, -1, 559);
                } else if (autoCutThemeDataLIZ.serverMusicMatched && i4 < i2) {
                    i4++;
                    int i6 = i4 + 1;
                    String str2 = autoCutThemeDataLIZ.reuseMusicLocalCoverPath;
                    if (str2 != null && str2.length() != 0) {
                        strLJJLIIIJJI = autoCutThemeDataLIZ.reuseMusicLocalCoverPath;
                    } else {
                        strLJJLIIIJJI = LJJLIIIJJI(autoCutThemeDataLIZ.templateId, autoCutThemeDataLIZ.musicId, listLJIJI);
                    }
                    autoCutThemeDataLIZ = AutoCutThemeData.LIZ(autoCutThemeDataLIZ, null, null, null, null, null, false, null, i6, 2, strLJJLIIIJJI, strLIZIZ, -1, 559);
                }
                arrayList.add(autoCutThemeDataLIZ);
                i3 = i5;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return arrayList;
    }

    public static final List<AutoCutThemeData> LIZIZ(List<AutoCutThemeData> list, AutoCutThemeData autoCutThemeData, int i, String str) {
        String musicId;
        boolean z;
        MusicBuzModel musicBuzModel;
        Object c098200Yq;
        boolean z2;
        String strLJJLIIIJJI;
        boolean z3;
        String strLJJLIIIJJI2;
        boolean z4;
        boolean z5;
        AVMusic aVMusicExtractAVMusic;
        String strLIZIZ = str;
        List listLJIJI = LJIJI(C2537209ww.LIZ());
        if (i <= 0) {
            return list;
        }
        int i2 = i - 1;
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 == 0) {
            return list;
        }
        AVMusic aVMusicExtractAVMusic2 = MusicBeanUtilKt.extractAVMusic(autoCutThemeData.musicBuzModel);
        if (aVMusicExtractAVMusic2 == null || (musicId = aVMusicExtractAVMusic2.getMusicId()) == null) {
            musicId = autoCutThemeData.musicId;
        }
        if (musicId != null && musicId.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z || (musicBuzModel = autoCutThemeData.musicBuzModel) == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(i2);
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        for (int i3 = 1; i3 < size && arrayList.size() < i2; i3++) {
            AutoCutThemeData autoCutThemeData2 = (AutoCutThemeData) ListProtector.get(list, i3);
            if (autoCutThemeData2.templateType == EnumC1412640mre.LYRICS_RULE_TEMPLATE.getValue() && !Intrinsics.LJFF(autoCutThemeData2.musicId, musicId)) {
                arrayList2.add(Integer.valueOf(i3));
            } else {
                if (Intrinsics.LJFF(autoCutThemeData2.musicId, musicId)) {
                    hashSet.add(Integer.valueOf(i3));
                }
                arrayList.add(Integer.valueOf(i3));
            }
        }
        if (arrayList.isEmpty()) {
            return list;
        }
        int size2 = arrayList.size();
        if (strLIZIZ == null) {
            MusicBuzModel musicBuzModel2 = autoCutThemeData.musicBuzModel;
            if (musicBuzModel2 != null && (aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModel2)) != null) {
                strLIZIZ = C1417320mzC.LIZIZ(aVMusicExtractAVMusic);
            } else {
                strLIZIZ = null;
            }
            if (strLIZIZ == null) {
                MusicBuzModel musicBuzModel3 = autoCutThemeData.reuseMusicOverrideBuz;
                if (musicBuzModel3 == null) {
                    musicBuzModel3 = autoCutThemeData.musicBuzModel;
                }
                AVMusic aVMusicExtractAVMusic3 = MusicBeanUtilKt.extractAVMusic(musicBuzModel3);
                if (aVMusicExtractAVMusic3 == null || (strLIZIZ = C1417320mzC.LIZIZ(aVMusicExtractAVMusic3)) == null) {
                    strLIZIZ = autoCutThemeData.name;
                }
            }
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i4 = 0;
        for (AutoCutThemeData autoCutThemeData3 : list) {
            int i5 = i4 + 1;
            if (i4 >= 0) {
                AutoCutThemeData autoCutThemeDataLIZ = autoCutThemeData3;
                if (i4 == 0) {
                    String strLJJLIIIJJI3 = autoCutThemeData.reuseMusicLocalCoverPath;
                    if (strLJJLIIIJJI3 != null && strLJJLIIIJJI3.length() != 0) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (!(!z4)) {
                        strLJJLIIIJJI3 = null;
                    }
                    if (strLJJLIIIJJI3 == null) {
                        strLJJLIIIJJI3 = autoCutThemeDataLIZ.reuseMusicLocalCoverPath;
                        if (strLJJLIIIJJI3 != null && strLJJLIIIJJI3.length() != 0) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (!(!z5)) {
                            strLJJLIIIJJI3 = null;
                        }
                        if (strLJJLIIIJJI3 == null) {
                            strLJJLIIIJJI3 = LJJLIIIJJI(autoCutThemeDataLIZ.templateId, autoCutThemeDataLIZ.musicId, listLJIJI);
                        }
                    }
                    autoCutThemeDataLIZ = AutoCutThemeData.LIZ(autoCutThemeDataLIZ, null, null, null, null, null, false, null, 1, 1, strLJJLIIIJJI3, strLIZIZ, -1, 559);
                } else if (arrayList.contains(Integer.valueOf(i4))) {
                    int iIndexOf = arrayList.indexOf(Integer.valueOf(i4)) + 2;
                    if (hashSet.contains(Integer.valueOf(i4))) {
                        String str2 = autoCutThemeDataLIZ.reuseMusicLocalCoverPath;
                        if (str2 != null && str2.length() != 0) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (z3) {
                            strLJJLIIIJJI2 = LJJLIIIJJI(autoCutThemeDataLIZ.templateId, autoCutThemeDataLIZ.musicId, listLJIJI);
                        } else {
                            strLJJLIIIJJI2 = autoCutThemeDataLIZ.reuseMusicLocalCoverPath;
                        }
                        autoCutThemeDataLIZ = AutoCutThemeData.LIZ(autoCutThemeDataLIZ, null, null, null, null, null, false, null, iIndexOf, 1, strLJJLIIIJJI2, strLIZIZ, -1, 559);
                    } else {
                        LIZ.getClass();
                        try {
                            c098200Yq = C1444810nhX.LIZ(musicBuzModel);
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                        if (thM5exceptionOrNullimpl != null) {
                            C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("cloneMusicBuzForReuseOverride failed: ");
                            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                            C201955140j.LJIIIIZZ(c1398350mUb, "AutoCutHelper", C2188811AlT.LIZIZ(sbLIZ));
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq)) {
                            c098200Yq = null;
                        }
                        MusicBuzModel musicBuzModel4 = (MusicBuzModel) c098200Yq;
                        if (musicBuzModel4 != null) {
                            String str3 = autoCutThemeDataLIZ.reuseMusicLocalCoverPath;
                            if (str3 != null && str3.length() != 0) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (z2) {
                                strLJJLIIIJJI = LJJLIIIJJI(autoCutThemeDataLIZ.templateId, autoCutThemeDataLIZ.musicId, listLJIJI);
                            } else {
                                strLJJLIIIJJI = autoCutThemeDataLIZ.reuseMusicLocalCoverPath;
                            }
                            autoCutThemeDataLIZ = AutoCutThemeData.LIZ(autoCutThemeDataLIZ, null, null, null, null, null, true, musicBuzModel4, iIndexOf, 1, strLJJLIIIJJI, strLIZIZ, -1, 547);
                        }
                    }
                } else if (arrayList2.contains(Integer.valueOf(i4))) {
                    autoCutThemeDataLIZ = AutoCutThemeData.LIZ(autoCutThemeDataLIZ, null, null, null, null, null, false, null, size2 + 1 + arrayList2.indexOf(Integer.valueOf(i4)) + 1, 0, null, null, -1, 1007);
                }
                arrayList3.add(autoCutThemeDataLIZ);
                i4 = i5;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return arrayList3;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJ(X.InterfaceC346701Wf<? super X.C096H> r12, X.C23152095i r13, X.C1418130n0V r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.autocut.s.LJJJJ(X.01Wf, X.095i, X.0n0V, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJI(X.InterfaceC346701Wf<? super X.C096H> r8, X.C1418130n0V r9, X.C23149095f r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof X.C1418080n0Q
            if (r0 == 0) goto L47
            r6 = r11
            X.0n0Q r6 = (X.C1418080n0Q) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r5 = r6.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            java.lang.String r3 = "AutoCutHelper"
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2a
            if (r0 == r1) goto L65
            if (r0 != r2) goto L4d
            X.C155000ia.LIZIZ(r5)
        L27:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2a:
            X.C155000ia.LIZIZ(r5)
            boolean r0 = r9.LIZ
            if (r0 == 0) goto L3e
            boolean r0 = r9.LIZIZ
            if (r0 == 0) goto L55
            r6.LLILLL = r1
            java.lang.Object r0 = r8.emit(r10, r6)
            if (r0 != r4) goto L68
            return r4
        L3e:
            r6.LLILLL = r2
            java.lang.Object r0 = r8.emit(r10, r6)
            if (r0 != r4) goto L27
            return r4
        L47:
            X.0n0Q r6 = new X.0n0Q
            r6.<init>(r7, r11)
            goto L12
        L4d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L55:
            X.0mUb r1 = X.C1398350mUb.LIZIZ
            java.lang.String r0 = "COMPREHENSION_NLE: Success event received, waiting for async callback"
            X.C201955140j.LIZLLL(r1, r3, r0)
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = r10.LIZ
            r9.LIZJ = r0
            java.util.Map<java.lang.String, java.lang.String> r0 = r10.LIZIZ
            r9.LIZLLL = r0
            goto L6f
        L65:
            X.C155000ia.LIZIZ(r5)
        L68:
            X.0mUb r1 = X.C1398350mUb.LIZIZ
            java.lang.String r0 = "COMPREHENSION_NLE: onSuccess"
            X.C201955140j.LIZLLL(r1, r3, r0)
        L6f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.autocut.s.LJJJJI(X.01Wf, X.0n0V, X.095f, X.05Vn):java.lang.Object");
    }

    public static TemplateDynamicSlotModel LJJIJIIJIL(Integer num, NLETemplateModel nLETemplateModel, List list, String str, boolean z) {
        VecNLETrackSlotSPtr mutableAssetItems;
        int i;
        String str2;
        String str3;
        Object next;
        NLESegmentAIMatting segment;
        Object objLJJIIZI;
        if (nLETemplateModel == null || (mutableAssetItems = nLETemplateModel.getMutableAssetItems()) == null || mutableAssetItems.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(mutableAssetItems, 10));
        Iterator<NLETrackSlot> it2 = mutableAssetItems.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().getUUID());
        }
        C1417910n09.LIZJ(nLETemplateModel, new AwS217S0300000_8(arrayList, (List<C0LE4>) linkedHashMap, (Map<String, C0LE4>) arrayList2, (List<String>) 10));
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Object obj = linkedHashMap.get(it3.next());
            if (obj != null) {
                arrayList3.add(obj);
            }
        }
        int i2 = 0;
        for (Object obj2 : arrayList) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                if (((C0LE4) obj2).LIZIZ && (objLJJIIZI = C19719612Di.LJJIIZI(arrayList3)) != null) {
                    ListProtector.set(arrayList, i2, objLJJIIZI);
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        if (!z && !C0E3A.LJFF(nLETemplateModel)) {
            for (NLETrackSlot nLETrackSlot : nLETemplateModel.getMutableAssetItems()) {
                NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                if (nLESegmentVideoDynamicCast != null) {
                    Iterator it4 = ((ArrayList) list).iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            next = it4.next();
                            if (Intrinsics.LJFF(((C443120HZe) next).getFirst(), nLETrackSlot.getUUID())) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    C443120HZe c443120HZe = (C443120HZe) next;
                    if (c443120HZe != null) {
                        long jLIZLLL = C352310DrZ.LIZLLL(((Number) c443120HZe.getSecond()).longValue());
                        long jLIZLLL2 = C352310DrZ.LIZLLL(((Number) c443120HZe.getThird()).longValue());
                        ITemplateInsertMediaService iTemplateInsertMediaService = (ITemplateInsertMediaService) ServiceManager.get().getService(ITemplateInsertMediaService.class);
                        if (iTemplateInsertMediaService != null) {
                            iTemplateInsertMediaService.LIZIZ(num, nLETemplateModel, jLIZLLL, jLIZLLL2, nLETrackSlot);
                        }
                        if (nLETrackSlot.getAIMatting() != null) {
                            NLEAIMatting aIMatting = nLETrackSlot.getAIMatting();
                            if (aIMatting != null) {
                                segment = aIMatting.getSegment();
                            } else {
                                segment = null;
                            }
                            NLESegmentAIMatting nLESegmentAIMattingDynamicCast = NLESegmentAIMatting.dynamicCast(segment);
                            if (nLESegmentAIMattingDynamicCast != null) {
                                nLESegmentAIMattingDynamicCast.setAiMattingCilpStart(nLESegmentVideoDynamicCast.getTimeClipStart());
                                nLESegmentAIMattingDynamicCast.setAiMattingCilpEnd(nLESegmentVideoDynamicCast.getTimeClipEnd());
                            }
                        }
                    }
                }
            }
        }
        C1417910n09.LIZJ(nLETemplateModel, new AwS587S0100000_8(linkedHashMap, (Map<String, C0LE4>) 69));
        TemplateDynamicSlotModel templateDynamicSlotModel = new TemplateDynamicSlotModel(str, 0, 0, "", "", 0);
        templateDynamicSlotModel.contentCount = arrayList.size();
        int size = arrayList.size() - 1;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int i4 = 0;
        int i5 = 0;
        for (Object obj3 : arrayList) {
            int i6 = i4 + 1;
            if (i4 >= 0) {
                C0LE4 c0le4 = (C0LE4) obj3;
                if (size == i4) {
                    str2 = "";
                } else {
                    str2 = ",";
                }
                if (c0le4.LIZIZ) {
                    str3 = CardStruct.IStatusCode.DEFAULT;
                } else {
                    i5++;
                    str3 = "1";
                }
                sb.append(str3);
                sb.append(str2);
                sb2.append(c0le4.LIZLLL);
                sb2.append(str2);
                i4 = i6;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        templateDynamicSlotModel.nonReplaceableContentLoc = sb.toString();
        templateDynamicSlotModel.contentDuration = sb2.toString();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : arrayList) {
            C0LE4 c0le42 = (C0LE4) obj4;
            if (c0le42.LIZIZ && !c0le42.LIZJ) {
                arrayList4.add(obj4);
            }
        }
        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            arrayList5.add(((C0LE4) it5.next()).LJ);
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj5 : arrayList5) {
            if (((String) obj5).length() > 0) {
                arrayList6.add(obj5);
            }
        }
        int size2 = C13LP.LLIIJI(arrayList6).size();
        if (arrayList6.size() > size2) {
            i = 1;
        } else {
            i = 0;
        }
        templateDynamicSlotModel.isUseSameContent = i;
        templateDynamicSlotModel.reuseContentCount = size2 + i5;
        return templateDynamicSlotModel;
    }

    public static boolean LJJJ(int i, int i2, boolean z, String str, long j) {
        if (z) {
            return !C536290L1n.LIZ(new VideoSegment(str, str, i, i2, (int) j));
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "autocut_image_support_fast_import", true) != 1) {
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "autocut_image_support_fast_import", true) != 2 || i > 1920 || i2 > 1920) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LJIIIZ(AVMusic aVMusic, boolean z, String str, String str2, boolean z2, MusicBuzModel musicBuzModel) {
        boolean z3;
        String musicId;
        Long lLJIILIIL;
        if (aVMusic != null && C123100dR.LIZ(musicBuzModel.keepOriginEnterMusicId) && Intrinsics.LJFF(aVMusic.getMusicId(), musicBuzModel.keepOriginEnterMusicId)) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enableReuseCurMusic: shootWay = ");
        sbLIZ.append(str);
        sbLIZ.append(", musicSelectedFrom: = ");
        sbLIZ.append(str2);
        sbLIZ.append(", isKeepOriginEnterMusic = ");
        sbLIZ.append(z3);
        sbLIZ.append(", isSelectByAuto = ");
        sbLIZ.append(z2);
        sbLIZ.append("\nmusicId = ");
        String musicId2 = null;
        if (aVMusic != null) {
            musicId2 = aVMusic.getMusicId();
        }
        sbLIZ.append(musicId2);
        sbLIZ.append(", isFromAutoCutAnchor = ");
        sbLIZ.append(z);
        C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        if ((!C301650Bs3.LIZ() || (aVMusic != null && (musicId = aVMusic.getMusicId()) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(musicId)) != null && lLJIILIIL.longValue() > 0)) && aVMusic != null && aVMusic.getMusicId() != null && !z) {
            return true;
        }
        return false;
    }

    public static String LJIILJJIL(String str, long j, boolean z, CreativeInfo creativeInfo, int i, int i2) throws Throwable {
        String str2;
        String strLJIJ;
        String str3;
        if (C23181096l.LIZ() && str != null && C2286708xd.LIZJ(str) && !LJJJ(i, i2, z, str, j)) {
            return str;
        }
        String strLJIIL = LJIIL(creativeInfo);
        if (str != null && u.LJJIIJZLJL(str, strLJIIL, false)) {
            return str;
        }
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        C0VSJ c0vsjLJJIJLIJ = C2471909mP.LIZ.LJJIJLIJ(str2);
        if (c0vsjLJJIJLIJ != null && c0vsjLJJIJLIJ.exists()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C20130113pb.LJ(c0vsjLJJIJLIJ));
            sbLIZ.append('_');
            sbLIZ.append(j);
            strLJIJ = new Regex("^[^;]*;").replace(C2188811AlT.LIZIZ(sbLIZ), "");
        } else {
            strLJIJ = LJIJ(j, str2);
        }
        if (a0.LJJJIL(strLJIJ)) {
            s sVar = LIZ;
            if (str == null) {
                str = "";
            }
            sVar.getClass();
            strLJIJ = LJIJ(j, str);
        }
        if (!C2286708xd.LIZJ(strLJIIL)) {
            new C0VSJ(strLJIIL).mkdirs();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLJIIL);
        sbLIZ2.append(strLJIJ);
        if (z) {
            str3 = ".mp4";
        } else {
            str3 = ".png";
        }
        sbLIZ2.append(str3);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static final String LJJIIJZLJL(AVMusic aVMusic, boolean z, AutoCutModel autoCutModel, String str, String str2, boolean z2, MusicBuzModel musicBuzModel) {
        if (aVMusic != null && autoCutModel != null && autoCutModel.curIndexFromSource <= 0 && C1416110mxF.LJIIJJI(autoCutModel.curSource) == C0MJ9.AUTO_CUT) {
            LIZ.getClass();
            if (LJIIIZ(aVMusic, z, str, str2, z2, musicBuzModel)) {
                if (aVMusic.isPgc()) {
                    return "pgc";
                }
                return "ugc";
            }
        }
        return "other";
    }

    public static void LJJJZ(final String str, final String str2, final int i, final List list, final String str3, boolean z, final InterfaceC1635410sex interfaceC1635410sex, final InterfaceC1418120n0U interfaceC1418120n0U, final boolean z2, final C1417970n0F c1417970n0F, LifecycleOwner lifecycleOwner) {
        final Application application = C0CHQ.LIZ;
        C1418000n0I c1418000n0I = C1418000n0I.LIZ;
        final CutSource cutSource = new CutSource(str2, CutSourceType.URL);
        c1418000n0I.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutTemplateUtils ----------- prepareTemplateSource: start, templateId = ");
        sbLIZ.append(str);
        sbLIZ.append(", templateUrl=");
        sbLIZ.append(str2);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        final C259800zU c259800zU = new C259800zU();
        final C259800zU c259800zU2 = new C259800zU();
        C1418000n0I.LIZIZ.put(cutSource, list);
        NLEPrepareListener nLEPrepareListener = new NLEPrepareListener() { // from class: X.0n0J
            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
            public final void onPreSuccess(NLETemplateModel nLETemplateModel) {
                VecNLETrackSPtr tracks;
                NLETrack next;
                if (nLETemplateModel == null || nLETemplateModel.getMainTrack() == null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("AutoCutTemplateUtils AUTO_CUT_NO_TRACK_CRASH: onPreSuccess templateId=");
                    sbLIZ2.append(str);
                    sbLIZ2.append(", templateUrl=");
                    sbLIZ2.append(str2);
                    sbLIZ2.append(", cutSource=");
                    sbLIZ2.append(cutSource.value);
                    C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ2));
                }
                if (C294050Bfn.LIZ()) {
                    boolean zLLIIIL = C351220Dpo.LLIIIL(nLETemplateModel, C294030Bfl.LIZ());
                    if (nLETemplateModel != null) {
                        C0EYQ.LJII(nLETemplateModel, i, str, zLLIIIL);
                    }
                } else if (nLETemplateModel != null) {
                    C0EYQ.LJI(nLETemplateModel, i, str);
                }
                c1417970n0F.onResponse(nLETemplateModel, new UnorderedMapStrStr());
                for (InterfaceC1418260n0i interfaceC1418260n0i : c1417970n0F.LIZ) {
                    if (interfaceC1418260n0i != null) {
                        interfaceC1418260n0i.LIZLLL("compress");
                    }
                }
                C1418000n0I c1418000n0I2 = C1418000n0I.LIZ;
                InterfaceC1418120n0U interfaceC1418120n0U2 = interfaceC1418120n0U;
                List<MetaExt> list2 = list;
                String str4 = str3;
                C1418050n0N c1418050n0N = new C1418050n0N(c1417970n0F, c259800zU2, cutSource, c259800zU, application, str4, i, z2);
                AwS636S0100000_22 awS636S0100000_22 = new AwS636S0100000_22(c1417970n0F, 59);
                c1418000n0I2.getClass();
                C1418000n0I.LJFF(interfaceC1418120n0U2, list2, str4, c1418050n0N, awS636S0100000_22);
                for (InterfaceC1418260n0i interfaceC1418260n0i2 : c1417970n0F.LIZ) {
                    if (interfaceC1418260n0i2 != null) {
                        interfaceC1418260n0i2.LIZLLL("download_effect");
                    }
                }
                if (C1412630mrd.LIZ(Integer.valueOf(i))) {
                    C1418000n0I c1418000n0I3 = C1418000n0I.LIZ;
                    InterfaceC1635410sex interfaceC1635410sex2 = interfaceC1635410sex;
                    c1418000n0I3.getClass();
                    if (interfaceC1635410sex2 != null) {
                        C1453060nuq.LIZ(interfaceC1635410sex2);
                    }
                    if (nLETemplateModel != null) {
                        C1418000n0I.LIZJ(nLETemplateModel, interfaceC1635410sex);
                    }
                    if (!C294040Bfm.LIZ() && nLETemplateModel != null && (tracks = nLETemplateModel.getTracks()) != null) {
                        Iterator<NLETrack> it2 = tracks.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (next.getTrackType() == NLETrackType.AUDIO) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        NLETrack nLETrack = next;
                        if (nLETrack != null) {
                            nLETemplateModel.removeTrack(nLETrack);
                        }
                    }
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
            public final void onSuccess(NLETemplateModel nLETemplateModel) {
                for (InterfaceC1418260n0i interfaceC1418260n0i : c1417970n0F.LIZ) {
                    if (interfaceC1418260n0i != null) {
                        interfaceC1418260n0i.LJIILLIIL("download_effect");
                    }
                }
                c259800zU.element = nLETemplateModel;
                if (nLETemplateModel == 0 || nLETemplateModel.getMainTrack() == null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("AutoCutTemplateUtils AUTO_CUT_NO_TRACK_CRASH: onSuccess templateId=");
                    sbLIZ2.append(str);
                    sbLIZ2.append(", templateUrl=");
                    sbLIZ2.append(str2);
                    sbLIZ2.append(", cutSource=");
                    sbLIZ2.append(cutSource.value);
                    C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ2));
                }
                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, "AutoCutTemplateUtils template source prepare onSuccess");
                C1418000n0I.LIZ.LJ(cutSource, c259800zU.element, application, c259800zU2.element, str3, i, z2, c1417970n0F);
            }

            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
            public final void onError(int i2, String str4) {
                Map<CutSource, List<MetaExt>> map = C1418000n0I.LIZIZ;
                map.remove(cutSource);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("AutoCutTemplateUtils template source prepare compress onFailure: code = ");
                sbLIZ2.append(i2);
                sbLIZ2.append(", msg = ");
                sbLIZ2.append(str4);
                sbLIZ2.append(", templateMetaMap size=");
                sbLIZ2.append(map.size());
                C1417710mzp.LIZ(LogLevel.LEVEL_ERROR, C2188811AlT.LIZIZ(sbLIZ2));
                c1417970n0F.LIZJ(SmartMovieErrorCode.HANDLE_TEMPLATE_FAILURE.swigValue(), i2, str4);
            }

            @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
            public final void onProgress(float f, String str4) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("AutoCutTemplateUtils template source prepare onProgress: ");
                sbLIZ2.append(f);
                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ2));
                c1417970n0F.onFetchProgress(f);
            }
        };
        BinderC532620Kui binderC532620Kui = new BinderC532620Kui("autocut_capcut", str, 4);
        BinderC532620Kui.LIZIZ(binderC532620Kui, i, C0L95.AUTOCUT_LIST.getValue(), null, 60);
        C1418000n0I.LIZ(cutSource, application, "", z, i, z2, nLEPrepareListener, binderC532620Kui, lifecycleOwner);
    }

    public static InterfaceC346201Wa LJJJLZIJ(List list, String str, int i, CreativeInfo creativeInfo, boolean z, boolean z2, String str2, boolean z3, EnumC1418280n0k enumC1418280n0k, boolean z4, String str3, String str4, boolean z5, Map map, String str5, String str6, Integer num) throws JSONException {
        String str7;
        int i2;
        Object obj;
        IMusicPublishBridgeService iMusicPublishBridgeService;
        String str8;
        String str9 = str;
        StringBuilder sb = new StringBuilder("AutoCutHelper requestRecommendedMusicList: mediaModelList = ");
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((AutoCutMediaModel) it2.next()).filePath);
        }
        sb.append(arrayList);
        sb.append("musicCount = ");
        sb.append(i);
        sb.append(", creativeInfo: ");
        sb.append(creativeInfo);
        sb.append(", ignoreCompress=");
        sb.append(z);
        sb.append(", useCommerceMusic = ");
        sb.append(z2);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, sb.toString());
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it3 = list.iterator();
        while (true) {
            str7 = "";
            if (!it3.hasNext()) {
                break;
            }
            AutoCutMediaModel autoCutMediaModel = (AutoCutMediaModel) it3.next();
            MetaExt metaExt = new MetaExt(0, null, null, null, null, 0, 0L, 0L, 0, false, 0L, false, 4095, null);
            if (C2286708xd.LIZJ(autoCutMediaModel.filePath)) {
                str8 = autoCutMediaModel.filePath;
            } else {
                str8 = autoCutMediaModel.fileUriPath;
                if (str8 == null) {
                    str8 = "";
                }
            }
            metaExt.setPath(str8);
            metaExt.setWidth(autoCutMediaModel.width);
            metaExt.setHeight(autoCutMediaModel.height);
            metaExt.setVideo(autoCutMediaModel.isVideoType);
            metaExt.setDuration(autoCutMediaModel.duration);
            String str10 = autoCutMediaModel.fileUriPath;
            if (str10 != null) {
                str7 = str10;
            }
            metaExt.setFileUriPath(str7);
            arrayList3.add(metaExt);
        }
        arrayList2.addAll(arrayList3);
        C2295408z2.LIZ.getClass();
        C2295408z2.LIZLLL(arrayList2);
        C1227904rF.LIZ.getClass();
        String strLJI = C1227904rF.LJI(creativeInfo);
        if (strLJI == null) {
            strLJI = "";
        }
        String strLJJIJLIJ = LJJIJLIJ(strLJI, map);
        int iLIZ = C0CHI.LIZ() - 1;
        if (C0CHV.LIZ() && LJJJJJ(str4, z5) && iLIZ > 0) {
            strLJJIJLIJ = LJJIL(strLJJIJLIJ, C2097908Jt.LIZJ(new Pair("same_music_front_cap", Integer.valueOf(iLIZ))));
        }
        int iIntValue = 0;
        if (z2 || ((iMusicPublishBridgeService = (IMusicPublishBridgeService) PluggableExtentionKt.pluggableSpi$default(IMusicPublishBridgeService.class, false, false, false, 14, null)) != null && iMusicPublishBridgeService.enableBAUserMusicExperienceOpt())) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("extra=");
        sbLIZ.append(strLJJIJLIJ);
        sbLIZ.append(" source=");
        sbLIZ.append(str2);
        sbLIZ.append(" entrancePage=");
        sbLIZ.append(enumC1418280n0k.getValue());
        sbLIZ.append(" musicId=");
        sbLIZ.append(str9);
        C1426005i6.LIZ(c1398350mUb, "Request.AutoCut.FlowEntry", C2188811AlT.LIZIZ(sbLIZ));
        HashMap map2 = new HashMap();
        map2.put("source", str2);
        if (!z3) {
            obj = "";
        } else {
            obj = "preload_urs";
        }
        map2.put("preload_urs", obj);
        map2.put("entrance_page", String.valueOf(enumC1418280n0k.getValue()));
        if (str9 == null) {
            str9 = CardStruct.IStatusCode.DEFAULT;
        }
        map2.put("music_id", str9);
        map2.put("enable_preloading", String.valueOf(z4));
        if (str3 != null) {
            str7 = str3;
        }
        map2.put("shoot_way", str7);
        String creationId = creativeInfo.getCreationId();
        if (num != null) {
            iIntValue = num.intValue();
        }
        C23187096r c23187096r = new C23187096r(i, creationId, strLJJIJLIJ, arrayList2, true, true, z, i2, map2, iIntValue, str5, str6, 45184);
        C23157095n.LIZ.getClass();
        C201955140j.LIZLLL(c1398350mUb, "SmartMovieApiExt", "getTemplateListResponseAsFlow");
        AnonymousClass0960 anonymousClass0960 = C23157095n.LIZIZ;
        if (anonymousClass0960 == null) {
            C201955140j.LJIIIIZZ(c1398350mUb, "SmartMovieApiExt", "getTemplateListResponseAsFlow failed: not initialized");
            return new C516501zn(new C096C(-1, "SmartMovieApiExt not initialized", C2097608Jq.LJ()), 1);
        }
        C201955140j.LIZLLL(c1398350mUb, "SmartMovieExt", "getTemplateListResponseAsFlow");
        C23164095u c23164095u = anonymousClass0960.LIZJ;
        c23164095u.getClass();
        return new C2501109r7(new C23160095q(c23187096r, null), C09IC.LJIL(new C2325381G0q(new C23159095p(c23187096r, c23164095u, null), new C095D(new C23158095o(c23187096r, c23164095u, null)), 0), C0PEM.LIZJ), 0);
    }

    public static final String LJJJJZI(List<AutoCutMediaModel> list, String str, int i, CreativeInfo creativeInfo, boolean z, boolean z2, String str2, boolean z3, EnumC1418280n0k enumC1418280n0k, boolean z4, MusicRequestCallback musicRequestCallback, String str3, String str4, boolean z5, Map<String, ? extends Object> map, String str5, String str6, Integer num) throws JSONException {
        int i2;
        Object obj;
        int iIntValue;
        String str7 = str;
        String str8 = str5;
        String str9 = str3;
        StringBuilder sb = new StringBuilder("AutoCutHelper requestRecommendedMusicList: mediaModelList = ");
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<AutoCutMediaModel> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().filePath);
        }
        sb.append(arrayList);
        sb.append("musicCount = ");
        sb.append(i);
        sb.append(", creativeInfo: ");
        sb.append(creativeInfo);
        sb.append(", ignoreCompress=");
        sb.append(z);
        sb.append(", useCommerceMusic = ");
        sb.append(z2);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, sb.toString());
        List<MetaExt> listLIZIZ = C1417910n09.LIZIZ(list);
        String json = GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), creativeInfo);
        String str10 = "";
        if (json == null) {
            json = "";
        }
        int iLIZ = C0CHI.LIZ() - 1;
        LIZ.getClass();
        String strLJJIJLIJ = LJJIJLIJ(json, map);
        if (C0CHV.LIZ() && LJJJJJ(str4, z5) && iLIZ > 0) {
            strLJJIJLIJ = LJJIL(strLJJIJLIJ, C2097908Jt.LIZJ(new Pair("same_music_front_cap", Integer.valueOf(iLIZ))));
        }
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("extra=");
        sbLIZ.append(strLJJIJLIJ);
        sbLIZ.append(" source=");
        sbLIZ.append(str2);
        sbLIZ.append(" entrancePage=");
        sbLIZ.append(enumC1418280n0k.getValue());
        sbLIZ.append(" musicId=");
        sbLIZ.append(str7);
        C1426005i6.LIZ(c1398350mUb, "Request.AutoCut.NativeSDK", C2188811AlT.LIZIZ(sbLIZ));
        MusicRequestParams musicRequestParams = new MusicRequestParams();
        SmartMovieJniJNI.MusicRequestParams_setCursor(musicRequestParams.LIZ, musicRequestParams, 0);
        SmartMovieJniJNI.MusicRequestParams_setCount(musicRequestParams.LIZ, musicRequestParams, i);
        SmartMovieJniJNI.MusicRequestParams_setCreationId(musicRequestParams.LIZ, musicRequestParams, creativeInfo.getCreationId());
        SmartMovieJniJNI.MusicRequestParams_setLabScene(musicRequestParams.LIZ, musicRequestParams, "");
        SmartMovieJniJNI.MusicRequestParams_setScene(musicRequestParams.LIZ, musicRequestParams, 1);
        VecMeta vecMetaLIZLLL = C1418020n0K.LIZLLL(listLIZIZ);
        SmartMovieJniJNI.MusicRequestParams_setMediaList(musicRequestParams.LIZ, musicRequestParams, VecMeta.LJ(vecMetaLIZLLL), vecMetaLIZLLL);
        SmartMovieJniJNI.MusicRequestParams_setExtra(musicRequestParams.LIZ, musicRequestParams, strLJJIJLIJ);
        SmartMovieJniJNI.MusicRequestParams_setUploadZipBinary(musicRequestParams.LIZ, musicRequestParams, C290450BZz.LIZ());
        SmartMovieJniJNI.MusicRequestParams_setUseResourceId(musicRequestParams.LIZ, musicRequestParams, true);
        SmartMovieJniJNI.MusicRequestParams_setReturnNLEConfig(musicRequestParams.LIZ, musicRequestParams, true);
        SmartMovieJniJNI.MusicRequestParams_setReturnMovieConfig(musicRequestParams.LIZ, musicRequestParams, false);
        SmartMovieJniJNI.MusicRequestParams_setIgnoreCompress(musicRequestParams.LIZ, musicRequestParams, z);
        if (!z2 && !((IMusicPublishBridgeService) ServiceManager.get().getService(IMusicPublishBridgeService.class)).enableBAUserMusicExperienceOpt()) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        SmartMovieJniJNI.MusicRequestParams_setAccountType(musicRequestParams.LIZ, musicRequestParams, i2);
        UnorderedMapStrStr unorderedMapStrStr = new UnorderedMapStrStr();
        unorderedMapStrStr.put("source", str2);
        if (!z3) {
            obj = "";
        } else {
            obj = "preload_urs";
        }
        unorderedMapStrStr.put("preload_urs", obj);
        unorderedMapStrStr.put("entrance_page", String.valueOf(enumC1418280n0k.getValue()));
        if (str7 == null) {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        unorderedMapStrStr.put("music_id", str7);
        unorderedMapStrStr.put("enable_preloading", String.valueOf(z4));
        if (str9 == null) {
            str9 = "";
        }
        unorderedMapStrStr.put("shoot_way", str9);
        if (str8 == null) {
            str8 = "";
        }
        unorderedMapStrStr.put("content_type", str8);
        if (str6 != null) {
            str10 = str6;
        }
        unorderedMapStrStr.put("content_source", str10);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        unorderedMapStrStr.put("live_count", String.valueOf(iIntValue));
        SmartMovieJniJNI.MusicRequestParams_setExtraParams(musicRequestParams.LIZ, musicRequestParams, UnorderedMapStrStr.LIZIZ(unorderedMapStrStr), unorderedMapStrStr);
        SmartMovieJniJNI.MusicRequestParams_setIgnoreExtractFeature(musicRequestParams.LIZ, musicRequestParams, !C311120CHm.LIZIZ());
        C1418540n1A.LIZ.getClass();
        C1418550n1B c1418550n1BLIZ = C1418540n1A.LIZ();
        c1418550n1BLIZ.getClass();
        C1418340n0q c1418340n0q = new C1418340n0q(musicRequestCallback, musicRequestParams);
        SmartMovie smartMovie = c1418550n1BLIZ.LIZ;
        if (smartMovie == null) {
            smartMovie = null;
        }
        String strSmartMovie_getMusicListResponse = SmartMovieJniJNI.SmartMovie_getMusicListResponse(smartMovie.LIZ, smartMovie, musicRequestParams.LIZ, musicRequestParams, MusicRequestCallback.getCPtr(c1418340n0q), c1418340n0q);
        ((HashMap) c1418550n1BLIZ.LIZLLL.getValue()).put(strSmartMovie_getMusicListResponse, Long.valueOf(c1418340n0q.LIZJ));
        return strSmartMovie_getMusicListResponse;
    }

    public static C095D LJJJJLL(String str, String str2, String str3, String str4, String str5, EnumC1417520mzW enumC1417520mzW, List list, Set set, CreativeInfo creativeInfo, boolean z, boolean z2, int i, String str6, String str7, String str8, InterfaceC1635410sex interfaceC1635410sex, InterfaceC1418120n0U interfaceC1418120n0U, boolean z3, boolean z4, boolean z5, boolean z6, LifecycleOwner lifecycleOwner) {
        return new C095D(new C1417940n0C(str, str2, str3, list, enumC1417520mzW, i, str5, str4, creativeInfo, str6, set, z2, interfaceC1635410sex, z5, interfaceC1418120n0U, lifecycleOwner, z, str7, str8, z3, z4, z6, null));
    }

    public static final String LJJJLIIL(String str, String str2, String str3, String str4, String str5, EnumC1417520mzW enumC1417520mzW, List<AutoCutMediaModel> list, Set<String> set, CreativeInfo creativeInfo, boolean z, boolean z2, int i, String str6, String str7, String str8, InterfaceC1635410sex interfaceC1635410sex, InterfaceC1418120n0U interfaceC1418120n0U, boolean z3, boolean z4, boolean z5, boolean z6, LifecycleOwner lifecycleOwner, C1417970n0F c1417970n0F) {
        Boolean boolValueOf;
        Object next;
        boolean z7;
        NLEModelRequestParams nLEModelRequestParams;
        boolean z8;
        String str9;
        long jLongValue;
        String str10 = str4;
        String str11 = str7;
        String str12 = str5;
        StringBuilder sb = new StringBuilder("AutoCutHelper requestRecommendedNLEModel: taskId = ");
        sb.append(str);
        sb.append(", musicId: ");
        sb.append(str2);
        sb.append(", templateId: ");
        sb.append(str3);
        sb.append("mediaModelList: ");
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<AutoCutMediaModel> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().filePath);
        }
        sb.append(arrayList);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, sb.toString());
        DavinciResource.INSTANCE.setHttpClient(C1419920n3O.LIZ());
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<AutoCutMediaModel> it3 = list.iterator();
        while (true) {
            String str13 = "";
            if (!it3.hasNext()) {
                break;
            }
            AutoCutMediaModel next2 = it3.next();
            MetaExt metaExt = new MetaExt(0, null, null, null, null, 0, 0L, 0L, 0, false, 0L, false, 4095, null);
            if (C2286708xd.LIZJ(next2.filePath)) {
                str13 = next2.filePath;
            } else {
                String str14 = next2.fileUriPath;
                if (str14 != null) {
                    str13 = str14;
                }
            }
            metaExt.setPath(str13);
            metaExt.setWidth(next2.width);
            metaExt.setHeight(next2.height);
            metaExt.setVideo(next2.isVideoType);
            metaExt.setDuration(next2.duration);
            Long l = next2.date;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            metaExt.setCreateTime(jLongValue);
            arrayList3.add(metaExt);
        }
        arrayList2.addAll(arrayList3);
        Iterator it4 = arrayList2.iterator();
        while (true) {
            boolValueOf = null;
            if (it4.hasNext()) {
                next = it4.next();
                if (!C2286708xd.LIZJ(((MetaExt) next).path)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        MetaExt metaExt2 = (MetaExt) next;
        if (metaExt2 != null) {
            C1417710mzp.LIZ.getClass();
            c1417970n0F.onFailure("", 1010, C1417710mzp.LJI(metaExt2), new UnorderedMapStrStr());
            return "";
        }
        C1418000n0I.LIZ.getClass();
        C2295408z2.LIZ.getClass();
        C2295408z2.LIZLLL(arrayList2);
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sb2 = new StringBuilder("JSON_COMPRESS,requestType=");
        sb2.append(enumC1417520mzW);
        sb2.append(", templateId=");
        sb2.append(str3);
        sb2.append(", is cmp = ");
        if (str12 != null) {
            boolValueOf = Boolean.valueOf(a0.LJJIIZI(str12, "CMP", false));
        }
        sb2.append(boolValueOf);
        sb2.append(", templateData empty=");
        if (str12 != null && str12.length() != 0) {
            z7 = false;
        } else {
            z7 = true;
        }
        sb2.append(z7);
        sb2.append(", templateUrl=");
        sb2.append(str10);
        C201955140j.LIZLLL(c1398350mUb, "AutoCutHelper", sb2.toString());
        C1227904rF.LIZ.getClass();
        String strLJI = C1227904rF.LJI(creativeInfo);
        if (strLJI == null) {
            strLJI = "";
        }
        if (i == EnumC1412640mre.LYRICS_RULE_TEMPLATE.getValue()) {
            C1426005i6.LIZ(c1398350mUb, "AutoCutHelper.LR.SkipServerNLE", "requestRecommendedNLEModel short-circuit templateId=" + C13LN.LJZL(8, str3) + " musicId=" + str2 + " source=" + str6 + " mediaCount=" + arrayList2.size());
            LIZ.getClass();
            NLEModel nLEModelLIZLLL = LIZLLL(arrayList2);
            UnorderedMapStrStr unorderedMapStrStr = new UnorderedMapStrStr();
            unorderedMapStrStr.put("autocut_template_type", String.valueOf(i));
            c1417970n0F.onSuccess(nLEModelLIZLLL, unorderedMapStrStr);
            return "";
        }
        if (enumC1417520mzW != EnumC1417520mzW.TEMPLATE_CC && enumC1417520mzW != EnumC1417520mzW.TEMPLATE_PUGC && enumC1417520mzW != EnumC1417520mzW.TEMPLATE_AIGT && enumC1417520mzW != EnumC1417520mzW.TEMPLATE_SGT && enumC1417520mzW != EnumC1417520mzW.TEMPLATE_UGC) {
            C1429050nI7 c1429050nI7 = C1429050nI7.LIZ;
            TemplateScene templateScene = TemplateScene.AUTO_CUT;
            c1429050nI7.getClass();
            Pair pairLIZJ = C1429050nI7.LIZJ(templateScene);
            c1417970n0F.LIZJ = new AwS37S0600000_22((List) arrayList2, (List<MetaExt>) creativeInfo, (CreativeInfo) interfaceC1635410sex, (InterfaceC1635410sex) interfaceC1418120n0U, (InterfaceC1418120n0U) c1417970n0F, (C1417970n0F) lifecycleOwner, (LifecycleOwner) 0);
            if (str != null) {
                VecMeta vecMetaLIZLLL = C1418020n0K.LIZLLL(arrayList2);
                VecStr vecStr = new VecStr();
                nLEModelRequestParams = new NLEModelRequestParams(SmartMovieJniJNI.new_NLEModelRequestParams__SWIG_0(str, str2, VecMeta.LJ(vecMetaLIZLLL), vecMetaLIZLLL, VecStr.LJ(vecStr), vecStr, strLJI));
            } else {
                nLEModelRequestParams = new NLEModelRequestParams(str2, C1418020n0K.LIZLLL(arrayList2), new VecStr(), strLJI);
            }
            SmartMovieJniJNI.NLEModelRequestParams_setUseResourceId(nLEModelRequestParams.LIZ, nLEModelRequestParams, true);
            if (str12 == null) {
                str12 = "";
            }
            SmartMovieJniJNI.NLEModelRequestParams_setTemplateJSON(nLEModelRequestParams.LIZ, nLEModelRequestParams, str12);
            SmartMovieJniJNI.NLEModelRequestParams_setIgnoreCompress(nLEModelRequestParams.LIZ, nLEModelRequestParams, z);
            SmartMovieJniJNI.NLEModelRequestParams_setEnableAsyncRender(nLEModelRequestParams.LIZ, nLEModelRequestParams, z2);
            SmartMovieJniJNI.NLEModelRequestParams_setEnableBatchFetch(nLEModelRequestParams.LIZ, nLEModelRequestParams, false);
            UnorderedMapStrStr unorderedMapStrStr2 = new UnorderedMapStrStr();
            unorderedMapStrStr2.put("source", str6);
            unorderedMapStrStr2.put("autocut_template_type", String.valueOf(i));
            if (str11 != null && str11.length() != 0) {
                z8 = false;
            } else {
                z8 = true;
            }
            String str15 = "not_set";
            if (z8) {
                str11 = "not_set";
            }
            unorderedMapStrStr2.put("autocut_music_log_id", str11);
            if (str10.length() == 0) {
                str10 = "not_set";
            }
            unorderedMapStrStr2.put("autocut_log_template_url", str10);
            if (str3.length() != 0) {
                str15 = str3;
            }
            unorderedMapStrStr2.put("autocut_log_template_url", str15);
            unorderedMapStrStr2.put("autocut_template_group_id", str8);
            if (z3) {
                str9 = "1";
            } else {
                str9 = CardStruct.IStatusCode.DEFAULT;
            }
            unorderedMapStrStr2.put("is_first_template_from_mdp", str9);
            unorderedMapStrStr2.put("enable_preloading", String.valueOf(z4));
            unorderedMapStrStr2.put("feature_list", pairLIZJ.getFirst());
            unorderedMapStrStr2.put("feature_codes", pairLIZJ.getSecond());
            Map<C0CIJ, C311200CHu> map = C311170CHr.LIZ;
            unorderedMapStrStr2.put("protocol_version", "2");
            unorderedMapStrStr2.put("use_aigt", String.valueOf(z6));
            SmartMovieJniJNI.NLEModelRequestParams_setExtraParams(nLEModelRequestParams.LIZ, nLEModelRequestParams, UnorderedMapStrStr.LIZIZ(unorderedMapStrStr2), unorderedMapStrStr2);
            C1418540n1A.LIZ.getClass();
            return C1418540n1A.LIZJ(nLEModelRequestParams, c1417970n0F);
        }
        s sVar = LIZ;
        Integer numValueOf = Integer.valueOf(i);
        sVar.getClass();
        LJJJJL(set, "", numValueOf);
        LJJJZ(str3, str10, i, arrayList2, strLJI, z2, interfaceC1635410sex, interfaceC1418120n0U, z5, c1417970n0F, lifecycleOwner);
        return "";
    }
}
