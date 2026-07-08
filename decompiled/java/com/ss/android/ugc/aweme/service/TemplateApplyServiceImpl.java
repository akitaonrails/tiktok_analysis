package com.ss.android.ugc.aweme.service;

import X.AnonymousClass0207;
import X.C098200Yq;
import X.C09RB;
import X.C0E4S;
import X.C0E4T;
import X.C0E4W;
import X.C0MQ1;
import X.C1398350mUb;
import X.C13LP;
import X.C15438062q;
import X.C189200o6;
import X.C1939607ik;
import X.C201955140j;
import X.C347140DjE;
import X.C347390Djd;
import X.C348830Dlx;
import X.C350870DpF;
import X.C351220Dpo;
import X.C363380EMm;
import X.C389400FOo;
import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentImageSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentInfoSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProEffectInfo;
import com.ss.android.ugc.aweme.interfaces.ITemplateApplyService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes6.dex */
public final class TemplateApplyServiceImpl implements ITemplateApplyService {
    public static void LIZLLL(NLETemplateModel nLETemplateModel, List list) {
        boolean z;
        Long l;
        boolean z2;
        Pair pair;
        String lowerCase;
        if (C0MQ1.LIZ()) {
            try {
                VecNLETrackSPtr tracks = nLETemplateModel.getTracks();
                ArrayList arrayList = new ArrayList();
                for (NLETrack nLETrack : tracks) {
                    if (nLETrack.getResourceType() == NLEResType.TEXT_STICKER) {
                        arrayList.add(nLETrack);
                    }
                }
                ArrayList<NLESegmentTextSticker> arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(NLESegmentTextSticker.dynamicCast((NLENode) ((NLETrackSlot) C13LP.LJJJJZI(((NLETrack) it2.next()).getSlots())).getMainSegment()));
                }
                for (NLESegmentTextSticker nLESegmentTextSticker : arrayList2) {
                    String extra = nLESegmentTextSticker.getExtra("mutable");
                    if (extra != null && extra.length() != 0) {
                        String extra2 = nLESegmentTextSticker.getExtra("biz_date_format");
                        if (extra2 == null || extra2.length() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String str = "dd MMM";
                        if (z) {
                            extra2 = "dd MMM";
                        }
                        int i = CastIntegerProtector.parseInt(extra);
                        if (i >= 0 && i < list.size()) {
                            Object obj = ((C0E4S) list.get(i)).LJII.get("create_time");
                            if (obj != null && (obj instanceof Long) && (l = (Long) obj) != null) {
                                l.longValue();
                                if (extra2 == null || !a0.LJJIIZI(extra2, ",", false)) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2) {
                                    List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(extra2, new String[]{","}, 2, 2);
                                    String str2 = (String) C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL);
                                    if (str2 != null) {
                                        str = str2;
                                    }
                                    String str3 = (String) C13LP.LJJJLZIJ(0, listLJJLIIIJILLIZJL);
                                    if (str3 == null || (lowerCase = str3.toLowerCase(Locale.ROOT)) == null) {
                                        lowerCase = "cap";
                                    }
                                    pair = new Pair(str, lowerCase);
                                } else {
                                    pair = new Pair(extra2, "cap");
                                }
                                String strLJJLIIIJ = new SimpleDateFormat((String) pair.getFirst(), Locale.US).format(new Date(((Number) obj).longValue() * ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
                                String str4 = (String) pair.getSecond();
                                int iHashCode = str4.hashCode();
                                if (iHashCode != 98258) {
                                    if (iHashCode != 103164673) {
                                        if (iHashCode == 111499426 && str4.equals("upper")) {
                                            strLJJLIIIJ = strLJJLIIIJ.toUpperCase(Locale.ROOT);
                                        }
                                    } else if (str4.equals("lower")) {
                                        strLJJLIIIJ = strLJJLIIIJ.toLowerCase(Locale.ROOT);
                                    }
                                } else if (str4.equals("cap")) {
                                    strLJJLIIIJ = C13LP.LJJLIIIJ(a0.LJJLIIIJILLIZJL(strLJJLIIIJ, new String[]{" "}, 0, 6), " ", null, null, 0, null, AnonymousClass0207.get$arr$(87), 30);
                                }
                                nLESegmentTextSticker.setContent(strLJJLIIIJ);
                            }
                        } else {
                            C201955140j.LIZLLL(C1398350mUb.LIZIZ, "msg-log", "index not in segmentList range");
                        }
                    }
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.ss.android.ugc.aweme.interfaces.ITemplateApplyService
    public final C0E4T LIZIZ(Context context, NLEModel nLEModel, VideoPublishEditModel videoPublishEditModel, C389400FOo c389400FOo, CreativeModel creativeModel) {
        List<NLETrack> listLLIIII;
        AudioEffectParam audioEffectParamLJIILJJIL;
        EditorProEffectInfo editorProEffectInfo;
        EditorProEffectInfo editorProEffectInfo2;
        C0E4W c0e4wLJIILLIIL;
        NLESegment mainSegment;
        C363380EMm c363380EMm = new C363380EMm(c389400FOo, creativeModel);
        C0E4T c0e4t = new C0E4T(0);
        videoPublishEditModel.getEditorProModel().getVideoSegmentEffects().clear();
        videoPublishEditModel.getEditorProModel().getMaskEffects().clear();
        videoPublishEditModel.getEditorProModel().getCutoutStrokeEffects().clear();
        videoPublishEditModel.getEditorProModel().getChromaEffects().clear();
        if (nLEModel != null) {
            VecNLETrackSPtr tracks = nLEModel.getTracks();
            if (tracks != null && (listLLIIII = C13LP.LLIIII(tracks)) != null) {
                for (NLETrack nLETrack : listLLIIII) {
                    String extra = nLETrack.getExtra("biz_extra_type");
                    if (extra != null) {
                        switch (extra.hashCode()) {
                            case -1618412715:
                                if (extra.equals("video_anim")) {
                                    c363380EMm.LJI(nLETrack, nLEModel, c0e4t.LIZJ);
                                }
                                break;
                            case -1037631128:
                                if (extra.equals("text_read")) {
                                    nLETrack.setExtra("AudioTrackType", "TEXT_SPEAK");
                                }
                                break;
                            case 99825:
                                if (extra.equals("dub")) {
                                    c0e4t.LIZ = c363380EMm.LJIILL(nLEModel, nLETrack);
                                }
                                break;
                            case 1182494401:
                                if (extra.equals("sound_effect")) {
                                    C363380EMm.LJIJ(nLETrack, nLEModel, c0e4t.LIZIZ);
                                }
                                break;
                            case 2012477417:
                                if (extra.equals("normal_effect")) {
                                    c363380EMm.LIZLLL(nLETrack, nLEModel, c0e4t.LIZJ);
                                }
                                break;
                        }
                    }
                    NLETrackType trackType = nLETrack.getTrackType();
                    if (trackType != null) {
                        int i = C347390Djd.LIZ[trackType.ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    NLETrackSlot nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(0, nLETrack.getSlots());
                                    if (nLETrackSlot != null) {
                                        mainSegment = nLETrackSlot.getMainSegment();
                                    } else {
                                        mainSegment = null;
                                    }
                                    if (NLESegmentTextSticker.dynamicCast((NLENode) mainSegment) != null) {
                                        c363380EMm.LJIILIIL(context, videoPublishEditModel, nLETrack, nLEModel, c0e4t);
                                        nLEModel.removeTrack(nLETrack);
                                    }
                                    if (NLESegmentInfoSticker.dynamicCast((NLENode) mainSegment) != null || NLESegmentImageSticker.dynamicCast((NLENode) mainSegment) != null) {
                                        c363380EMm.LJIIIIZZ(videoPublishEditModel, nLETrack, nLEModel, c0e4t);
                                        nLEModel.removeTrack(nLETrack);
                                    }
                                }
                            } else if (!C351220Dpo.LLL(nLEModel) && (c0e4wLJIILLIIL = c363380EMm.LJIILLIIL(nLEModel, nLETrack)) != null) {
                                c0e4t.LJ = c0e4wLJIILLIIL;
                            }
                        } else {
                            if (nLETrack.getEnable() && C350870DpF.LJIIIIZZ(nLETrack) == NLETrackType.VIDEO && !nLETrack.getMainTrack()) {
                                nLETrack.setExtra("track_extra_pip", "true");
                            }
                            c363380EMm.LJIIJJI(nLETrack, videoPublishEditModel);
                            c363380EMm.LJIIIZ(nLETrack, videoPublishEditModel);
                            c363380EMm.LJIIL(nLETrack, videoPublishEditModel);
                            if (nLETrack.getEnable() && C350870DpF.LJIIIIZZ(nLETrack) == NLETrackType.VIDEO) {
                                NLEResourceNode nLEResourceNode = (NLEResourceNode) C09RB.LJIIL(C09RB.LJIJI(new C1939607ik(nLETrack.getSlots()), AFwS234S0000000_5.get$arr$(539)));
                                NLEResourceNode nLEResourceNode2 = (NLEResourceNode) C09RB.LJIIL(C09RB.LJIJI(new C1939607ik(nLETrack.getSlots()), AFwS234S0000000_5.get$arr$(540)));
                                if (nLEResourceNode != null) {
                                    editorProEffectInfo = new EditorProEffectInfo(nLEResourceNode.getResourceId(), nLEResourceNode.getResourceName(), nLEResourceNode.getResourceFile());
                                } else {
                                    editorProEffectInfo = null;
                                }
                                if (nLEResourceNode2 != null) {
                                    editorProEffectInfo2 = new EditorProEffectInfo(nLEResourceNode2.getResourceId(), nLEResourceNode2.getResourceName(), nLEResourceNode2.getResourceFile());
                                } else {
                                    editorProEffectInfo2 = null;
                                }
                                videoPublishEditModel.getEditorProModel().setBlendCutoutEffect(editorProEffectInfo);
                                videoPublishEditModel.getEditorProModel().setBlendMaskEffect(editorProEffectInfo2);
                            }
                            c363380EMm.LJII(nLETrack, videoPublishEditModel);
                        }
                    }
                    if (nLETrack.getMainTrack() && nLETrack.getFilterByName(NLEEditorJniJNI.NLEFilterName_getAUDIO_COMMON_FILTER()) != null && (audioEffectParamLJIILJJIL = c363380EMm.LJIILJJIL(nLETrack.getFilterByName(NLEEditorJniJNI.NLEFilterName_getAUDIO_COMMON_FILTER()), nLEModel)) != null) {
                        c0e4t.LIZLLL = audioEffectParamLJIILJJIL;
                    }
                    if (nLETrack.getMainTrack()) {
                        for (NLETrackSlot nLETrackSlot2 : nLETrack.getSlots()) {
                            C363380EMm.LJFF(nLETrackSlot2);
                            C363380EMm.LIZJ(nLETrackSlot2);
                        }
                    }
                }
            }
            nLEModel.removeTransientExtraWithKey("IS_FROM_IOS");
        }
        C363380EMm.LJIIZILJ(nLEModel);
        C363380EMm.LJIJI(nLEModel);
        C363380EMm.LJIIJ(videoPublishEditModel, nLEModel);
        if (nLEModel != null) {
            new C348830Dlx();
            C348830Dlx.LIZ(nLEModel, videoPublishEditModel, null, null);
            C347140DjE.LIZ(nLEModel, videoPublishEditModel, null);
            C363380EMm.LIZIZ(nLEModel, c363380EMm.LIZIZ);
        }
        return c0e4t;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03a9 A[SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.interfaces.ITemplateApplyService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel LIZJ(android.content.Context r22, com.bytedance.ies.nle.editor_jni.NLEModel r23, boolean r24, X.C389400FOo r25, com.ss.android.ugc.aweme.creative.model.CreativeModel r26) {
        /*
            Method dump skipped, instruction units count: 1482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.service.TemplateApplyServiceImpl.LIZJ(android.content.Context, com.bytedance.ies.nle.editor_jni.NLEModel, boolean, X.0FOo, com.ss.android.ugc.aweme.creative.model.CreativeModel):com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f9, code lost:
    
        X.C201955140j.LIZJ(X.C1398350mUb.LIZIZ, "processMediaListIfNeed -> no adapter type media");
     */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x061a  */
    @Override // com.ss.android.ugc.aweme.interfaces.ITemplateApplyService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C0E4S> LIZ(com.bytedance.ies.nle.editor_jni.NLETemplateModel r37, java.util.List<X.C0E4S> r38, X.C1412390mrF r39, X.EnumC1412640mre r40, android.content.Context r41, X.C0E4V r42, boolean r43, boolean r44, boolean r45) {
        /*
            Method dump skipped, instruction units count: 2914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.service.TemplateApplyServiceImpl.LIZ(com.bytedance.ies.nle.editor_jni.NLETemplateModel, java.util.List, X.0mrF, X.0mre, android.content.Context, X.0E4V, boolean, boolean, boolean):java.util.List");
    }
}
