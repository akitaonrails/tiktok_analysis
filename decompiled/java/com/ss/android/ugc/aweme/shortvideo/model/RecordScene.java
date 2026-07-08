package com.ss.android.ugc.aweme.shortvideo.model;

import X.C086I;
import X.C0CHQ;
import X.C2093608Ic;
import X.C2188811AlT;
import X.C579100MnU;
import X.C580130Mp9;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.MobileEffectsModel2;
import com.ss.android.ugc.aweme.creative.model.audio.LoudnessBalanceParam;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.recordeffect.SharedARModel;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import com.ss.android.ugc.effectmanager.effect.model.EffectLabel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public class RecordScene {
    public String challengeStr;
    public ClientCherEffectParam cherEffectParam;
    public CommentVideoModel commentVideoModel;
    public CreativeInfo creativeInfo;
    public Set<String> csiChallengeJsonStr;
    public String duetAudioPath;
    public String duetVideoPath;
    public boolean enterRecordFromFeed;
    public ExtractFramesModel extractFramesModel;
    public int faceBeauty;
    public String filterIds;
    public String filterLabels;
    public String filterValues;
    public int hardEncode;
    public boolean isAigcCountdownRecord;
    public long maxDuration;
    public MobileEffectsModel2 mobileEffectsModel;
    public String mp4Path;
    public int musicEnd;
    public AVMusic musicModel;
    public String musicPath;
    public int musicStart;
    public int recordBGMDelay;
    public int recordMode;
    public boolean recordOriginalSoundWithBGM;
    public SharedARModel sharedARModel;
    public int shootMode;
    public String shootWay;
    public int shootedShootMode;
    public StitchParams stitchParams;
    public Map<String, Object> videoRecordMetadata;
    public ArrayList<TimeSpeedModelExtension> videoSegments;
    public String fromItemId = "";
    public String followUpFirstItemId = "";
    public String followUpItemIdGroups = "";
    public LoudnessBalanceParam loudnessBalanceParam = new LoudnessBalanceParam();
    public String followUpPromoId = "";

    public AVChallenge getChallengeFromStr() {
        SimpleAVChallenge simpleAVChallengeDeserializeFromJson;
        if (TextUtils.isEmpty(this.challengeStr) || (simpleAVChallengeDeserializeFromJson = SimpleAVChallenge.deserializeFromJson(this.challengeStr)) == null) {
            return null;
        }
        return simpleAVChallengeDeserializeFromJson.parse2AVChallenge();
    }

    public String getCreationId() {
        CreativeInfo creativeInfo = this.creativeInfo;
        return creativeInfo == null ? "" : creativeInfo.getCreationId();
    }

    public List<AVChallenge> getCsiChallengesFromStr() {
        Set<String> set = this.csiChallengeJsonStr;
        if (set == null || set.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it2 = this.csiChallengeJsonStr.iterator();
        while (it2.hasNext()) {
            SimpleAVChallenge simpleAVChallengeDeserializeFromJson = SimpleAVChallenge.deserializeFromJson(it2.next());
            if (simpleAVChallengeDeserializeFromJson != null) {
                arrayList.add(simpleAVChallengeDeserializeFromJson.parse2AVChallenge());
            }
        }
        return arrayList;
    }

    public boolean isDuetMode() {
        return (C2093608Ic.LJ(this.duetVideoPath) && C2093608Ic.LJ(this.duetAudioPath)) ? false : true;
    }

    public boolean isSegmentsNotValid() {
        return C086I.LIZIZ(this.videoSegments);
    }

    public boolean isStitchMode() {
        return this.stitchParams != null;
    }

    public SharedARModel getSharedARModel() {
        return this.sharedARModel;
    }

    public static String challenge2str(AVChallenge aVChallenge) {
        if (aVChallenge == null) {
            return "";
        }
        return SimpleAVChallenge.serializeToStr(SimpleAVChallenge.fromAVChallenge(aVChallenge));
    }

    public static ArrayList<BeautyMetadata> getBeautyMetadatas(ArrayList<TimeSpeedModelExtension> arrayList) {
        ArrayList<BeautyMetadata> arrayList2 = new ArrayList<>();
        Iterator<TimeSpeedModelExtension> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().getBeautyMetadata());
        }
        arrayList2.removeAll(Collections.singleton(null));
        return arrayList2;
    }

    public static String getCameraIdsStringByModel(ArrayList<TimeSpeedModelExtension> arrayList) {
        if (C086I.LIZIZ(arrayList)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (TimeSpeedModelExtension timeSpeedModelExtension : arrayList) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(timeSpeedModelExtension.getCameraId());
            sbLIZ.append(",");
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
        }
        return sb.toString().substring(0, r2.length() - 1);
    }

    public static ArrayList<String> getCameraLensInfoList(ArrayList<TimeSpeedModelExtension> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        Iterator<TimeSpeedModelExtension> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().getCameraLensInfo());
        }
        arrayList2.removeAll(Collections.singleton(null));
        return arrayList2;
    }

    public static ClientCherEffectParam getCherEffectParam(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (ClientCherEffectParam) C0CHQ.LIZ().getGson().LJII(str, ClientCherEffectParam.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static SimpleEffect getEffectInfoByModel(ArrayList<TimeSpeedModelExtension> arrayList) {
        if (arrayList != null) {
            for (TimeSpeedModelExtension timeSpeedModelExtension : arrayList) {
                if (timeSpeedModelExtension.getEffectInfo() != null) {
                    return timeSpeedModelExtension.getEffectInfo();
                }
            }
            return null;
        }
        return null;
    }

    public static String getFilterIdsByModel(ArrayList<TimeSpeedModelExtension> arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (TimeSpeedModelExtension timeSpeedModelExtension : arrayList) {
            if (timeSpeedModelExtension.getRecordFilterModel() != null) {
                arrayList2.add(timeSpeedModelExtension.getRecordFilterModel().filterId);
            }
        }
        arrayList2.removeAll(Collections.singleton(null));
        return join(arrayList2, ",");
    }

    public static String getFilterLabelsByModel(ArrayList<TimeSpeedModelExtension> arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (TimeSpeedModelExtension timeSpeedModelExtension : arrayList) {
            if (timeSpeedModelExtension.getRecordFilterModel() != null) {
                arrayList2.add(timeSpeedModelExtension.getRecordFilterModel().filterLabel);
            }
        }
        arrayList2.removeAll(Collections.singleton(null));
        return join(arrayList2, ",");
    }

    public static String getFilterValuesByModel(ArrayList<TimeSpeedModelExtension> arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (TimeSpeedModelExtension timeSpeedModelExtension : arrayList) {
            if (timeSpeedModelExtension.getRecordFilterModel() != null) {
                arrayList2.add(timeSpeedModelExtension.getRecordFilterModel().filterValue);
            }
        }
        arrayList2.removeAll(Collections.singleton(null));
        return join(arrayList2, ",");
    }

    public static String getFirstStickerMusicIds(ArrayList<TimeSpeedModelExtension> arrayList) {
        if (C086I.LIZIZ(arrayList)) {
            return null;
        }
        List<String> stickerMusicIds = ((TimeSpeedModelExtension) ListProtector.get(arrayList, 0)).getStickerMusicIds();
        if (C086I.LIZIZ(stickerMusicIds)) {
            return null;
        }
        return GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), stickerMusicIds);
    }

    public static ArrayList<GreenScreenMaterial> getGreenScreenMaterials(ArrayList<TimeSpeedModelExtension> arrayList) {
        ArrayList<GreenScreenMaterial> arrayList2 = new ArrayList<>();
        if (C580130Mp9.LIZ(arrayList)) {
            return arrayList2;
        }
        for (TimeSpeedModelExtension timeSpeedModelExtension : arrayList) {
            if (GreenScreenMaterialKt.isGreenScreenClip(timeSpeedModelExtension)) {
                arrayList2.add(new GreenScreenMaterial(GreenScreenMaterialKt.getType(timeSpeedModelExtension).intValue(), GreenScreenMaterialKt.getStartTime(timeSpeedModelExtension).longValue(), GreenScreenMaterialKt.getEndTime(timeSpeedModelExtension).longValue(), GreenScreenMaterialKt.getResId(timeSpeedModelExtension), GreenScreenMaterialKt.getAuthorName(timeSpeedModelExtension), GreenScreenMaterialKt.getEffectId(timeSpeedModelExtension), GreenScreenMaterialKt.getLocalPath(timeSpeedModelExtension), GreenScreenMaterialKt.getMediasource(timeSpeedModelExtension)));
            }
        }
        arrayList2.removeAll(Collections.singleton(null));
        return arrayList2;
    }

    public static String getSpeedStringByModel(ArrayList<TimeSpeedModelExtension> arrayList) {
        if (C086I.LIZIZ(arrayList)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (TimeSpeedModelExtension timeSpeedModelExtension : arrayList) {
            if (timeSpeedModelExtension.getSpeed() > 0.2d && timeSpeedModelExtension.getSpeed() < 0.4d) {
                sb.append("0.33,");
            } else if (timeSpeedModelExtension.getSpeed() > 0.4d && timeSpeedModelExtension.getSpeed() < 0.6d) {
                sb.append("0.5,");
            } else if ((0.6d >= timeSpeedModelExtension.getSpeed() || timeSpeedModelExtension.getSpeed() >= 1.5d) && timeSpeedModelExtension.getSpeed() != 0.0d) {
                if (timeSpeedModelExtension.getSpeed() == 1.5d) {
                    sb.append("6,");
                } else if (1.5d < timeSpeedModelExtension.getSpeed() && timeSpeedModelExtension.getSpeed() < 2.5d) {
                    sb.append("2.0,");
                } else if (2.5d < timeSpeedModelExtension.getSpeed() && timeSpeedModelExtension.getSpeed() < 3.5d) {
                    sb.append("3.0,");
                }
            } else {
                sb.append("1.0,");
            }
        }
        String string = sb.toString();
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string.substring(0, string.length() - 1);
    }

    public static String getStickerIdsByModel(ArrayList<TimeSpeedModelExtension> arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator<TimeSpeedModelExtension> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().getStickerId());
        }
        arrayList2.removeAll(Collections.singleton(null));
        return join(arrayList2, ",");
    }

    public static StickerInfo getStickerInfo(ArrayList<TimeSpeedModelExtension> arrayList) {
        String strLIZ;
        StickerInfo stickerInfo = new StickerInfo();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        ArrayList arrayList4 = new ArrayList(arrayList.size());
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList(arrayList.size());
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        HashMap map = new HashMap(arrayList.size());
        for (TimeSpeedModelExtension timeSpeedModelExtension : arrayList) {
            if (!TextUtils.isEmpty(timeSpeedModelExtension.getPropRec())) {
                arrayList4.add(timeSpeedModelExtension.getPropRec());
            }
            StickerInfo stickerInfo2 = timeSpeedModelExtension.getStickerInfo();
            String imprPosition = "";
            if (stickerInfo2 == null) {
                strLIZ = "";
            } else {
                strLIZ = C579100MnU.LIZ(stickerInfo2.getPropSource(), stickerInfo2.getNeedFilter());
            }
            if (!strLIZ.isEmpty()) {
                arrayList2.add(strLIZ);
            }
            if (!timeSpeedModelExtension.getGradeKey().isEmpty()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(timeSpeedModelExtension.getStickerId());
                sbLIZ.append(":");
                sbLIZ.append(timeSpeedModelExtension.getGradeKey());
                arrayList3.add(C2188811AlT.LIZIZ(sbLIZ));
            }
            if (!TextUtils.isEmpty(timeSpeedModelExtension.getTabOrder())) {
                arrayList5.add(timeSpeedModelExtension.getTabOrder());
            }
            if (timeSpeedModelExtension.getStickerId() != null) {
                if (!TextUtils.isEmpty(timeSpeedModelExtension.getImprPosition())) {
                    imprPosition = timeSpeedModelExtension.getImprPosition();
                }
                arrayList6.add(imprPosition);
            }
            if (!stickerInfo.isMusicBeatSticker() && timeSpeedModelExtension.getStickerInfo() != null && timeSpeedModelExtension.getStickerInfo().isMusicBeatSticker()) {
                stickerInfo.setMusicBeatSticker(true);
            }
            if (!TextUtils.isEmpty(timeSpeedModelExtension.getTabIds())) {
                arrayList7.add(timeSpeedModelExtension.getTabIds());
            }
            String mobileEffectStatus = timeSpeedModelExtension.getStickerInfo().getMobileEffectStatus();
            if (!TextUtils.isEmpty(mobileEffectStatus)) {
                arrayList8.add(mobileEffectStatus);
            }
            EffectLabel effectLabel = timeSpeedModelExtension.getStickerInfo().getEffectLabel();
            if (effectLabel != null) {
                arrayList9.addAll(effectLabel.getV1Tags());
                arrayList10.addAll(effectLabel.getV2Tags());
                arrayList11.addAll(effectLabel.getPlatformTags());
            }
            if (timeSpeedModelExtension.getStickerInfo() != null && timeSpeedModelExtension.getStickerInfo().getGraphNodes() != null) {
                arrayList12.addAll(timeSpeedModelExtension.getStickerInfo().getGraphNodes());
            }
            if (timeSpeedModelExtension.getStickerInfo() != null && timeSpeedModelExtension.getStickerInfo().getBasicEventParam() != null) {
                for (Map.Entry<String, Object> entry : timeSpeedModelExtension.getStickerInfo().getBasicEventParam().entrySet()) {
                    List arrayList13 = (List) map.get(entry.getKey());
                    if (arrayList13 == null) {
                        arrayList13 = new ArrayList();
                        map.put(entry.getKey(), arrayList13);
                    }
                    arrayList13.add(entry.getValue());
                }
            }
            if (timeSpeedModelExtension.getStickerInfo() != null) {
                Boolean bool = Boolean.TRUE;
                if (bool.equals(timeSpeedModelExtension.getStickerInfo().isAigcPropApplied())) {
                    stickerInfo.setAigcPropApplied(bool);
                }
            }
        }
        arrayList2.removeAll(Collections.singleton(null));
        arrayList3.removeAll(Collections.singleton(null));
        stickerInfo.setPropSource(join(arrayList2, ","));
        stickerInfo.setGradeKey(join(arrayList3, ","));
        stickerInfo.setRecId(join(arrayList4, ","));
        stickerInfo.setTabOrder(join(arrayList5, ","));
        stickerInfo.setImprPosition(join(arrayList6, ","));
        stickerInfo.setPropTabId(join(arrayList7, ","));
        stickerInfo.setMobileEffectStatus(join(arrayList8, ","));
        stickerInfo.setEffectLabel(new EffectLabel(arrayList9, arrayList10, arrayList11));
        stickerInfo.setGraphNodes(arrayList12);
        HashMap map2 = new HashMap();
        for (Map.Entry entry2 : map.entrySet()) {
            ArrayList arrayList14 = new ArrayList();
            for (Object obj : (List) entry2.getValue()) {
                if (obj != null) {
                    arrayList14.add(obj.toString());
                }
            }
            if (!arrayList14.isEmpty()) {
                map2.put(entry2.getKey(), join(arrayList14, ","));
            }
        }
        stickerInfo.setBasicEventParam(map2);
        return stickerInfo;
    }

    public static boolean isChangeSpeed(ArrayList<TimeSpeedModelExtension> arrayList) {
        if (C086I.LIZIZ(arrayList)) {
            return false;
        }
        for (TimeSpeedModelExtension timeSpeedModelExtension : arrayList) {
            if (0.6d > timeSpeedModelExtension.getSpeed() || timeSpeedModelExtension.getSpeed() > 1.5d) {
                return true;
            }
        }
        return false;
    }

    public static CommentVideoModel string2CommentVideoModel(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (CommentVideoModel) GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), str, CommentVideoModel.class);
    }

    public static SharedARModel string2SharedARModel(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (SharedARModel) GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), str, SharedARModel.class);
    }

    public static StitchParams string2StitchParams(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (StitchParams) GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), str, StitchParams.class);
    }

    public RecordScene creativeInfo(CreativeInfo creativeInfo) {
        this.creativeInfo = creativeInfo;
        return this;
    }

    public RecordScene faceBeauty(int i) {
        this.faceBeauty = i;
        return this;
    }

    public RecordScene hardEncode(int i) {
        this.hardEncode = i;
        return this;
    }

    public RecordScene maxDuration(long j) {
        this.maxDuration = j;
        return this;
    }

    public RecordScene mp4Path(String str) {
        this.mp4Path = str;
        return this;
    }

    public RecordScene musicEnd(int i) {
        this.musicEnd = i;
        return this;
    }

    public RecordScene musicModel(AVMusic aVMusic) {
        this.musicModel = aVMusic;
        return this;
    }

    public RecordScene musicPath(String str) {
        this.musicPath = str;
        return this;
    }

    public RecordScene musicStart(int i) {
        this.musicStart = i;
        return this;
    }

    public RecordScene recordMode(int i) {
        this.recordMode = i;
        return this;
    }

    public RecordScene recordOriginalSoundWithBGM(boolean z) {
        this.recordOriginalSoundWithBGM = z;
        return this;
    }

    public void setSharedAr(SharedARModel sharedARModel) {
        this.sharedARModel = sharedARModel;
    }

    public RecordScene stitchParams(StitchParams stitchParams) {
        this.stitchParams = stitchParams;
        return this;
    }

    public RecordScene videoSegment(String str) {
        this.videoSegments = CameraComponentModel.LJIIIIZZ(str);
        return this;
    }

    public static Boolean isDefaultProp(ArrayList<TimeSpeedModelExtension> arrayList, String str) {
        if (str != null && !str.isEmpty() && arrayList != null && !arrayList.isEmpty()) {
            Iterator<TimeSpeedModelExtension> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (TextUtils.equals(str, it2.next().getStickerId())) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        }
        return Boolean.FALSE;
    }

    public static String join(List<String> list, String str) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str2 : list) {
            if (z) {
                z = false;
            } else {
                sb.append(str);
            }
            sb.append(str2);
        }
        return sb.toString();
    }
}
