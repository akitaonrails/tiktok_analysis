package com.ss.android.ugc.aweme.service;

import X.C04TD;
import X.C123100dR;
import X.C19719612Di;
import X.C351220Dpo;
import X.C354260Dui;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudioFadeFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudioVolumeFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.creative.model.TemplateComplexity;
import com.ss.android.ugc.aweme.interfaces.ITemplateComplexityService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class TemplateComplexityImpl implements ITemplateComplexityService {
    public static ITemplateComplexityService LIZLLL() {
        Object objLIZ = C04TD.LIZ(ITemplateComplexityService.class, false);
        if (objLIZ != null) {
            return (ITemplateComplexityService) objLIZ;
        }
        if (C04TD.o4 == null) {
            synchronized (ITemplateComplexityService.class) {
                if (C04TD.o4 == null) {
                    C04TD.o4 = new TemplateComplexityImpl();
                }
            }
        }
        return C04TD.o4;
    }

    @Override // com.ss.android.ugc.aweme.interfaces.ITemplateComplexityService
    public final Map<String, String> LIZIZ(TemplateComplexity templateComplexity) {
        Integer numValueOf = null;
        if (templateComplexity == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = templateComplexity.templateID;
        if (C123100dR.LIZ(str)) {
            linkedHashMap.put("template_id", str);
        }
        String str2 = templateComplexity.templateUrl;
        if (C123100dR.LIZ(str2)) {
            linkedHashMap.put("template_url", str2);
        }
        String str3 = templateComplexity.dispatchType;
        if (C123100dR.LIZ(str3)) {
            linkedHashMap.put("dispatch_from", str3);
        }
        LIZJ(templateComplexity.templateType, "template_type", linkedHashMap);
        LIZJ(templateComplexity.pipCnt, "ori_template_pip_cnt", linkedHashMap);
        LIZJ(templateComplexity.textStickerCnt, "ori_template_text_sticker_cnt", linkedHashMap);
        LIZJ(templateComplexity.gAdjustAndFilterCnt, "ori_template_glob_filter_adjust_cnt", linkedHashMap);
        LIZJ(templateComplexity.cFilterAndAjustCnt, "ori_template_clip_fliter_adjust_cnt", linkedHashMap);
        LIZJ(templateComplexity.musicCnt, "ori_template_music_count", linkedHashMap);
        Long l = templateComplexity.templateZipSize;
        if (l != null) {
            numValueOf = Integer.valueOf((int) l.longValue());
        }
        LIZJ(numValueOf, "template_zip_size", linkedHashMap);
        LIZJ(templateComplexity.effect, "ori_template_effect_cnt", linkedHashMap);
        LIZJ(templateComplexity.magic, "ori_template_magic_cnt", linkedHashMap);
        LIZJ(templateComplexity.magicV2, "ori_template_magic_v2_cnt", linkedHashMap);
        LIZJ(templateComplexity.trackCnt, "ori_template_track_cnt", linkedHashMap);
        LIZJ(templateComplexity.aiMatting, "ori_template_matting_cnt", linkedHashMap);
        LIZJ(templateComplexity.kFCnt, "ori_template_kf_cnt", linkedHashMap);
        LIZJ(templateComplexity.speedCnt, "ori_template_speed_cnt", linkedHashMap);
        LIZJ(templateComplexity.curvespeedCnt, "ori_template_curv_speed_cnt", linkedHashMap);
        LIZJ(templateComplexity.trackCnt, "ori_template_trans_cnt", linkedHashMap);
        LIZJ(templateComplexity.transCnt, "ori_template_trans_cnt", linkedHashMap);
        Integer num = templateComplexity.sameAssetGroupCnt;
        int i = 0;
        if (num != null && num.intValue() > 0) {
            i = 1;
        }
        LIZJ(Integer.valueOf(i), "ori_template_is_same_asset_group", linkedHashMap);
        LIZJ(templateComplexity.mutableCnt, "ori_template_mutable_slot_cnt", linkedHashMap);
        LIZJ(templateComplexity.innerPicCnt, "ori_template_inner_image_count", linkedHashMap);
        LIZJ(templateComplexity.innerVideoCnt, "ori_template_inner_video_count", linkedHashMap);
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.interfaces.ITemplateComplexityService
    public final TemplateComplexity LIZ(NLEModel nLEModel, List<String> list) {
        TemplateComplexity templateComplexity = new TemplateComplexity(null, null, null, null, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1L);
        if (nLEModel != null) {
            VecNLETrackSPtr tracks = nLEModel.getTracks();
            ArrayList arrayList = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                NLETrack nLETrack2 = nLETrack;
                if (NLETrackType.VIDEO == nLETrack2.getTrackType() || NLETrackType.AUDIO == nLETrack2.getTrackType()) {
                    if (nLETrack2.getEnable()) {
                        arrayList.add(nLETrack);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                NLETrackSlot nLETrackSlot = (NLETrackSlot) obj;
                if (NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment()).getSpeed() != 1.0f || nLETrackSlot.getSpeed() != 1.0f) {
                    arrayList3.add(obj);
                }
            }
            int size = arrayList3.size();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : arrayList2) {
                NLETrackSlot nLETrackSlot2 = (NLETrackSlot) obj2;
                if ((!NLESegmentAudio.dynamicCast(nLETrackSlot2.getMainSegment()).getCurveSpeedPoints().isEmpty()) || (!NLESegmentAudio.dynamicCast(nLETrackSlot2.getMainSegment()).getSegCurveSpeedPoints().isEmpty())) {
                    arrayList4.add(obj2);
                }
            }
            Pair pair = new Pair(Integer.valueOf(size), Integer.valueOf(arrayList4.size()));
            VecNLETrackSPtr tracks2 = nLEModel.getTracks();
            ArrayList arrayList5 = new ArrayList();
            for (NLETrack nLETrack3 : tracks2) {
                NLETrack nLETrack4 = nLETrack3;
                if (NLETrackType.VIDEO == nLETrack4.getTrackType() && nLETrack4.getEnable() && !nLETrack4.getMainTrack()) {
                    arrayList5.add(nLETrack3);
                }
            }
            ArrayList arrayList6 = new ArrayList();
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                C19719612Di.LJJI(((NLETrack) it3.next()).getSlots(), arrayList6);
            }
            templateComplexity.pipCnt = Integer.valueOf(arrayList6.size());
            VecNLETrackSPtr tracks3 = nLEModel.getTracks();
            ArrayList arrayList7 = new ArrayList();
            for (NLETrack nLETrack5 : tracks3) {
                if (NLETrackType.STICKER == nLETrack5.getTrackType()) {
                    arrayList7.add(nLETrack5);
                }
            }
            ArrayList arrayList8 = new ArrayList();
            Iterator it4 = arrayList7.iterator();
            while (it4.hasNext()) {
                C19719612Di.LJJI(((NLETrack) it4.next()).getSlots(), arrayList8);
            }
            ArrayList arrayList9 = new ArrayList();
            for (Object obj3 : arrayList8) {
                if (NLESegmentTextSticker.dynamicCast((NLENode) ((NLETrackSlot) obj3).getMainSegment()) != null) {
                    arrayList9.add(obj3);
                }
            }
            templateComplexity.textStickerCnt = Integer.valueOf(arrayList9.size());
            VecNLETrackSPtr tracks4 = nLEModel.getTracks();
            ArrayList arrayList10 = new ArrayList();
            for (NLETrack nLETrack6 : tracks4) {
                if (NLETrackType.FILTER == nLETrack6.getTrackType()) {
                    arrayList10.add(nLETrack6);
                }
            }
            ArrayList arrayList11 = new ArrayList();
            Iterator it5 = arrayList10.iterator();
            while (it5.hasNext()) {
                C19719612Di.LJJI(((NLETrack) it5.next()).getSlots(), arrayList11);
            }
            templateComplexity.gAdjustAndFilterCnt = Integer.valueOf(arrayList11.size());
            VecNLETrackSPtr tracks5 = nLEModel.getTracks();
            ArrayList arrayList12 = new ArrayList();
            for (NLETrack nLETrack7 : tracks5) {
                NLETrack nLETrack8 = nLETrack7;
                if (NLETrackType.VIDEO == nLETrack8.getTrackType() && nLETrack8.getEnable()) {
                    arrayList12.add(nLETrack7);
                }
            }
            ArrayList arrayList13 = new ArrayList();
            Iterator it6 = arrayList12.iterator();
            while (it6.hasNext()) {
                C19719612Di.LJJI(((NLETrack) it6.next()).getSlots(), arrayList13);
            }
            ArrayList arrayList14 = new ArrayList();
            for (Object obj4 : arrayList13) {
                if (((NLETrackSlot) obj4).getFilters().size() > 0) {
                    arrayList14.add(obj4);
                }
            }
            ArrayList arrayList15 = new ArrayList();
            Iterator it7 = arrayList14.iterator();
            while (it7.hasNext()) {
                C19719612Di.LJJI(((NLETrackSlot) it7.next()).getFilters(), arrayList15);
            }
            int size2 = arrayList15.size();
            ArrayList arrayList16 = new ArrayList();
            Iterator it8 = arrayList12.iterator();
            while (it8.hasNext()) {
                C19719612Di.LJJI(((NLETrack) it8.next()).getFilters(), arrayList16);
            }
            ArrayList arrayList17 = new ArrayList();
            for (Object obj5 : arrayList16) {
                NLEFilter nLEFilter = (NLEFilter) obj5;
                if (NLESegmentAudioVolumeFilter.dynamicCast((NLENode) nLEFilter.getSegment()) == null || NLESegmentAudioFadeFilter.dynamicCast((NLENode) nLEFilter.getSegment()) == null) {
                    arrayList17.add(obj5);
                }
            }
            templateComplexity.cFilterAndAjustCnt = Integer.valueOf(arrayList17.size() + size2);
            VecNLETrackSPtr tracks6 = nLEModel.getTracks();
            ArrayList arrayList18 = new ArrayList();
            for (NLETrack nLETrack9 : tracks6) {
                NLETrack nLETrack10 = nLETrack9;
                if (NLETrackType.AUDIO == nLETrack10.getTrackType() && Intrinsics.LJFF(nLETrack10.getExtra("biz_extra_type"), "bgm")) {
                    arrayList18.add(nLETrack9);
                }
            }
            templateComplexity.musicCnt = Integer.valueOf(arrayList18.size());
            VecNLETrackSPtr tracks7 = nLEModel.getTracks();
            ArrayList arrayList19 = new ArrayList();
            for (NLETrack nLETrack11 : tracks7) {
                NLETrack nLETrack12 = nLETrack11;
                if (nLETrack12.getEnable() && NLETrackType.EFFECT == nLETrack12.getTrackType()) {
                    arrayList19.add(nLETrack11);
                }
            }
            ArrayList arrayList20 = new ArrayList();
            Iterator it9 = arrayList19.iterator();
            while (it9.hasNext()) {
                C19719612Di.LJJI(((NLETrack) it9.next()).getSlots(), arrayList20);
            }
            int size3 = arrayList20.size();
            VecNLETrackSPtr tracks8 = nLEModel.getTracks();
            ArrayList arrayList21 = new ArrayList();
            for (NLETrack nLETrack13 : tracks8) {
                NLETrack nLETrack14 = nLETrack13;
                if (NLETrackType.VIDEO == nLETrack14.getTrackType() && nLETrack14.getEnable()) {
                    arrayList21.add(nLETrack13);
                }
            }
            ArrayList arrayList22 = new ArrayList();
            Iterator it10 = arrayList21.iterator();
            while (it10.hasNext()) {
                C19719612Di.LJJI(((NLETrack) it10.next()).getSlots(), arrayList22);
            }
            ArrayList arrayList23 = new ArrayList();
            for (Object obj6 : arrayList22) {
                if (((NLETrackSlot) obj6).getVideoEffects().size() > 0) {
                    arrayList23.add(obj6);
                }
            }
            ArrayList arrayList24 = new ArrayList();
            Iterator it11 = arrayList23.iterator();
            while (it11.hasNext()) {
                C19719612Di.LJJI(((NLETrackSlot) it11.next()).getVideoEffects(), arrayList24);
            }
            int size4 = arrayList24.size();
            ArrayList arrayList25 = new ArrayList();
            Iterator it12 = arrayList21.iterator();
            while (it12.hasNext()) {
                C19719612Di.LJJI(((NLETrack) it12.next()).getVideoEffects(), arrayList25);
            }
            templateComplexity.effect = Integer.valueOf(size3 + size4 + arrayList25.size());
            VecNLETrackSPtr tracks9 = nLEModel.getTracks();
            ArrayList arrayList26 = new ArrayList();
            for (NLETrack nLETrack15 : tracks9) {
                NLETrack nLETrack16 = nLETrack15;
                if (NLETrackType.VIDEO == nLETrack16.getTrackType() && nLETrack16.getEnable()) {
                    arrayList26.add(nLETrack15);
                }
            }
            ArrayList arrayList27 = new ArrayList();
            Iterator it13 = arrayList26.iterator();
            while (it13.hasNext()) {
                C19719612Di.LJJI(((NLETrack) it13.next()).getSlots(), arrayList27);
            }
            ArrayList arrayList28 = new ArrayList();
            for (Object obj7 : arrayList27) {
                if (((NLENode) obj7).hasExtra("is_from_ep_magic")) {
                    arrayList28.add(obj7);
                }
            }
            templateComplexity.magic = Integer.valueOf(arrayList28.size());
            VecNLETrackSPtr tracks10 = nLEModel.getTracks();
            ArrayList arrayList29 = new ArrayList();
            Iterator<NLETrack> it14 = tracks10.iterator();
            while (it14.hasNext()) {
                C19719612Di.LJJI(it14.next().getSlots(), arrayList29);
            }
            ArrayList arrayList30 = new ArrayList();
            for (Object obj8 : arrayList29) {
                NLETrackSlot nLETrackSlot3 = (NLETrackSlot) obj8;
                if (NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot3.getMainSegment()) != null && C351220Dpo.LJLLL(nLETrackSlot3) != NLEResType.IMAGE) {
                    C351220Dpo.LJLLL(nLETrackSlot3);
                }
                if (!nLETrackSlot3.getFeatureList().contains("UGC_ASYNC_I2V")) {
                    C354260Dui.LIZ.getClass();
                    if (C354260Dui.LJFF(nLETrackSlot3) != null) {
                        arrayList30.add(obj8);
                    }
                }
            }
            templateComplexity.magicV2 = Integer.valueOf(arrayList30.size());
            VecNLETrackSPtr tracks11 = nLEModel.getTracks();
            ArrayList arrayList31 = new ArrayList();
            for (NLETrack nLETrack17 : tracks11) {
                NLETrack nLETrack18 = nLETrack17;
                if (NLETrackType.VIDEO == nLETrack18.getTrackType() && nLETrack18.getEnable()) {
                    arrayList31.add(nLETrack17);
                }
            }
            ArrayList arrayList32 = new ArrayList();
            Iterator it15 = arrayList31.iterator();
            while (it15.hasNext()) {
                C19719612Di.LJJI(((NLETrack) it15.next()).getSlots(), arrayList32);
            }
            ArrayList arrayList33 = new ArrayList();
            for (Object obj9 : arrayList32) {
                if (((NLETrackSlot) obj9).getAIMatting() != null) {
                    arrayList33.add(obj9);
                }
            }
            templateComplexity.aiMatting = Integer.valueOf(arrayList33.size());
            VecNLETrackSPtr tracks12 = nLEModel.getTracks();
            ArrayList arrayList34 = new ArrayList();
            for (NLETrack nLETrack19 : tracks12) {
                if (nLETrack19.getEnable()) {
                    arrayList34.add(nLETrack19);
                }
            }
            ArrayList arrayList35 = new ArrayList();
            Iterator it16 = arrayList34.iterator();
            while (it16.hasNext()) {
                C19719612Di.LJJI(((NLETrack) it16.next()).getSlots(), arrayList35);
            }
            ArrayList arrayList36 = new ArrayList();
            for (Object obj10 : arrayList35) {
                if (((NLETrackSlot) obj10).getKeyframes().size() > 0) {
                    arrayList36.add(obj10);
                }
            }
            templateComplexity.kFCnt = Integer.valueOf(arrayList36.size());
            templateComplexity.speedCnt = (Integer) pair.getFirst();
            templateComplexity.curvespeedCnt = (Integer) pair.getSecond();
            VecNLETrackSPtr tracks13 = nLEModel.getTracks();
            ArrayList arrayList37 = new ArrayList();
            for (NLETrack nLETrack20 : tracks13) {
                if (nLETrack20.getEnable()) {
                    arrayList37.add(nLETrack20);
                }
            }
            templateComplexity.trackCnt = Integer.valueOf(arrayList37.size());
            VecNLETrackSPtr tracks14 = nLEModel.getTracks();
            ArrayList arrayList38 = new ArrayList();
            for (NLETrack nLETrack21 : tracks14) {
                NLETrack nLETrack22 = nLETrack21;
                if (NLETrackType.VIDEO == nLETrack22.getTrackType() && nLETrack22.getEnable()) {
                    arrayList38.add(nLETrack21);
                }
            }
            ArrayList arrayList39 = new ArrayList();
            Iterator it17 = arrayList38.iterator();
            while (it17.hasNext()) {
                C19719612Di.LJJI(((NLETrack) it17.next()).getSlots(), arrayList39);
            }
            ArrayList arrayList40 = new ArrayList();
            for (Object obj11 : arrayList39) {
                if (((NLETrackSlot) obj11).getEndTransition() != null) {
                    arrayList40.add(obj11);
                }
            }
            templateComplexity.transCnt = Integer.valueOf(arrayList40.size());
            VecNLETrackSPtr tracks15 = nLEModel.getTracks();
            ArrayList arrayList41 = new ArrayList();
            for (NLETrack nLETrack23 : tracks15) {
                NLETrack nLETrack24 = nLETrack23;
                if (NLETrackType.VIDEO == nLETrack24.getTrackType() && nLETrack24.getEnable()) {
                    arrayList41.add(nLETrack23);
                }
            }
            ArrayList arrayList42 = new ArrayList();
            Iterator it18 = arrayList41.iterator();
            while (it18.hasNext()) {
                C19719612Di.LJJI(((NLETrack) it18.next()).getSlots(), arrayList42);
            }
            ArrayList arrayList43 = new ArrayList();
            for (Object obj12 : arrayList42) {
                if (C123100dR.LIZ(((NLENode) obj12).getExtra("same_asset_group"))) {
                    arrayList43.add(obj12);
                }
            }
            templateComplexity.sameAssetGroupCnt = Integer.valueOf(arrayList43.size());
        }
        ArrayList arrayList44 = (ArrayList) list;
        if (!arrayList44.isEmpty()) {
            templateComplexity.mutableCnt = Integer.valueOf(arrayList44.size());
            if (nLEModel != null) {
                VecNLETrackSPtr tracks16 = nLEModel.getTracks();
                ArrayList arrayList45 = new ArrayList();
                for (NLETrack nLETrack25 : tracks16) {
                    NLETrack nLETrack26 = nLETrack25;
                    if (NLETrackType.VIDEO == nLETrack26.getTrackType() && nLETrack26.getEnable()) {
                        arrayList45.add(nLETrack25);
                    }
                }
                ArrayList arrayList46 = new ArrayList();
                Iterator it19 = arrayList45.iterator();
                while (it19.hasNext()) {
                    C19719612Di.LJJI(((NLETrack) it19.next()).getSlots(), arrayList46);
                }
                ArrayList arrayList47 = new ArrayList();
                for (Object obj13 : arrayList46) {
                    if (!arrayList44.contains(((NLENode) obj13).getUUID())) {
                        arrayList47.add(obj13);
                    }
                }
                ArrayList arrayList48 = new ArrayList();
                for (Object obj14 : arrayList47) {
                    if (NLEResType.IMAGE == ((NLETrackSlot) obj14).getMainSegment().getResource().getResourceType()) {
                        arrayList48.add(obj14);
                    }
                }
                templateComplexity.innerPicCnt = Integer.valueOf(arrayList48.size());
                ArrayList arrayList49 = new ArrayList();
                for (Object obj15 : arrayList47) {
                    if (NLEResType.VIDEO == ((NLETrackSlot) obj15).getMainSegment().getResource().getResourceType()) {
                        arrayList49.add(obj15);
                    }
                }
                templateComplexity.innerVideoCnt = Integer.valueOf(arrayList49.size());
            }
        }
        return templateComplexity;
    }

    public static void LIZJ(Integer num, String str, Map map) {
        if (num != null && num.intValue() >= 0) {
            map.put(str, num.toString());
        }
    }
}
