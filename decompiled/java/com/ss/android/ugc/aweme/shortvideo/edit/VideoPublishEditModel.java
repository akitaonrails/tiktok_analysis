package com.ss.android.ugc.aweme.shortvideo.edit;

import X.AbstractC19878112q3;
import X.C086I;
import X.C08HM;
import X.C0C64;
import X.C0CHQ;
import X.C0IKQ;
import X.C0LSN;
import X.C0MH2;
import X.C0MJ9;
import X.C0VSJ;
import X.C0WIY;
import X.C1184304kD;
import X.C13LP;
import X.C1402840mbq;
import X.C1403700mdE;
import X.C1413430msv;
import X.C1416310mxZ;
import X.C1428470nHB;
import X.C1429860nJQ;
import X.C1429890nJT;
import X.C1437400nVa;
import X.C1437790nWD;
import X.C1439110nYL;
import X.C1444810nhX;
import X.C1444940nhk;
import X.C1466090oFr;
import X.C1466660oGm;
import X.C1661700tLM;
import X.C1697810uHb;
import X.C201955140j;
import X.C2188811AlT;
import X.C2286708xd;
import X.C2471909mP;
import X.C290630BaH;
import X.C294050Bfn;
import X.C295670BiP;
import X.C297100Bki;
import X.C297810Blr;
import X.C301490Brn;
import X.C350300DoK;
import X.C383310F1d;
import X.C493401w4;
import X.C537820L7k;
import X.C566080MIc;
import X.C570490MZb;
import X.C571330Max;
import X.C571500MbE;
import X.C571630MbR;
import X.C574790MgX;
import X.C578570Mmd;
import X.C580130Mp9;
import X.C7740030o;
import X.C830690WiJ;
import X.EnumC1428480nHC;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.LinkShareSettings;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.TemplateComplexity;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCBusinessModelSet;
import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.creative.model.edit.EditEffectModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MusicSyncData;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProDraftModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.edit.audio.enhance.AudioEnhanceParam;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effect.VideoAnimModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.property.CreativeToolsEntranceReversalConfig;
import com.ss.android.ugc.aweme.services.video.VideoExposureData;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.SimpleTextStickerData;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.model.CommentModelExtensionKt;
import com.ss.android.ugc.aweme.shortvideo.model.GreenScreenMaterial;
import com.ss.android.ugc.aweme.shortvideo.model.PhotoModeExposureData;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.comment.CommentStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.liveevent.LiveEventCountDownStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.poll.PollStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEUtils;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public class VideoPublishEditModel extends VideoPublishEditModelKt {
    public static final Parcelable.Creator<VideoPublishEditModel> CREATOR = new C1466660oGm(9);
    public static final long serialVersionUID = 1;
    public transient CreativeModel creativeModel;
    public boolean supportCache;

    @Override // com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void generateVideoCoverPath() {
        generateVideoCoverPath(false, -2);
    }

    public String getInfoStickerList() {
        return getInfoStickerList(null);
    }

    public Map<String, String> getLocationStickerParams() {
        List<InteractStickerStruct> listLJI;
        InteractStickerStruct interactStickerStruct;
        try {
            if (getMainBusinessContext() == null || (listLJI = C1429860nJQ.LJI(getMainBusinessContext(), 13, EnumC1428480nHC.TRACK_PAGE_EDIT)) == null || listLJI.isEmpty() || (interactStickerStruct = listLJI.get(0)) == null) {
                return null;
            }
            HashMap map = new HashMap();
            String poiId = interactStickerStruct.getPoiStickerStruct().getPoiId();
            if (!TextUtils.isEmpty(poiId)) {
                map.put("sticker_poi_id", poiId);
            }
            map.put("poi_enter_method", "poi_sticker");
            Map map2 = (Map) C7740030o.LIZ().getGson().LJII(interactStickerStruct.getAttr(), Map.class);
            if (map2 != null) {
                for (Map.Entry entry : map2.entrySet()) {
                    map.put(entry.getKey().toString(), entry.getValue().toString());
                }
            }
            if (isPoi() && interactStickerStruct.getPoiStickerStruct() != null) {
                if (Objects.equals(getPoiData().poiId, interactStickerStruct.getPoiStickerStruct().getPoiId())) {
                    map.put("is_sticker_poi", "1");
                    return map;
                }
                map.put("is_sticker_poi", CardStruct.IStatusCode.DEFAULT);
            }
            return map;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public Float getPreviewStartTime() {
        Float fValueOf = Float.valueOf(0.0f);
        MusicObject musicObject = this.creativeModel.musicBuzModel.music;
        return musicObject != null ? Float.valueOf(musicObject.previewStartTime) : fValueOf;
    }

    public void resetCompileProbeResult() {
        setCompileProbeResult(null);
    }

    public void startCache() {
        this.supportCache = true;
        C1184304kD.LIZ.clear();
    }

    public void stopCache() {
        this.supportCache = false;
        C1184304kD.LIZ.clear();
    }

    public boolean containsCommentReplyStickers() {
        List<CommentStickerModel> list = this.creativeModel.stickerModel.commentStickerModels;
        return !list.isEmpty() && CommentModelExtensionKt.isDataValid(((CommentStickerModel) ListProtector.get(list, 0)).getCommentStickerModel());
    }

    public String formatCameraLensInfo() {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < getCameraLensInfo().size(); i++) {
            for (String str : ((String) ListProtector.get(getCameraLensInfo(), i)).split(":")) {
                if (!str.isEmpty()) {
                    hashSet.add(CastIntegerProtector.valueOf(str));
                }
            }
        }
        if (hashSet.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            sb.append(ListProtector.get(arrayList, i2));
            if (i2 != arrayList.size() - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public AIGCBusinessModelSet getAIGCBusinessModel() {
        return this.creativeModel.aigcBusinessModel;
    }

    public AILivePhotoModel getAILivePhotoModel() {
        return this.creativeModel.aiLivePhotoModel;
    }

    public String getAllSelectedEffectIds() {
        String selectedEffectIds;
        ArrayList arrayList = new ArrayList();
        ArrayList<TimeSpeedModelExtension> finalSegments = getFinalSegments();
        if (finalSegments == null) {
            return "";
        }
        for (TimeSpeedModelExtension timeSpeedModelExtension : finalSegments) {
            if (timeSpeedModelExtension.getStickerInfo() != null && (selectedEffectIds = timeSpeedModelExtension.getStickerInfo().getSelectedEffectIds()) != null) {
                arrayList.add(selectedEffectIds);
            }
        }
        ArrayList arrayList2 = new ArrayList(new LinkedHashSet(arrayList));
        StringBuilder sb = new StringBuilder();
        if (!C580130Mp9.LIZ(arrayList2)) {
            for (int i = 0; i < arrayList2.size(); i++) {
                sb.append((String) ListProtector.get(arrayList2, i));
                if (i != arrayList2.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    public ArrayList<Float> getCurMultiEditVideoDurations() {
        long endTime;
        long startTime;
        ArrayList<Float> arrayList = new ArrayList<>();
        if (getCurMultiEditVideoRecordData() != null) {
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : getCurMultiEditVideoRecordData().segmentDataList) {
                MusicSyncData musicSyncData = multiEditVideoSegmentRecordData.musicSyncData;
                if (musicSyncData != null) {
                    endTime = musicSyncData.getVideoEnd();
                    startTime = multiEditVideoSegmentRecordData.musicSyncData.getVideoStart();
                } else {
                    endTime = multiEditVideoSegmentRecordData.getEndTime();
                    startTime = multiEditVideoSegmentRecordData.getStartTime();
                }
                arrayList.add(Float.valueOf(new BigDecimal((endTime - startTime) / 1000.0f).setScale(1, 4).floatValue()));
            }
        }
        return arrayList;
    }

    public int getCurMusicServerLength() {
        MusicObject musicObject = this.creativeModel.musicBuzModel.music;
        if (musicObject != null) {
            return musicObject.duration;
        }
        return -1;
    }

    public List<Effect> getDefaultEffectList() {
        return this.creativeModel.editEffectModel.defaultEffectList;
    }

    public EditEffectModel getEditEffectModel() {
        return this.creativeModel.editEffectModel;
    }

    public String getEditPagePrePublishId() {
        return this.creativeModel.prePublishStatusModel.publishId;
    }

    public EditorProDraftModel getEditorProDraftModel() {
        return this.creativeModel.editorProDraftModel;
    }

    public ArrayList<EffectPointModel> getEffectList() {
        return this.creativeModel.editEffectModel.effectList;
    }

    public boolean getHasClippedEffect() {
        return this.creativeModel.editEffectModel.hasClippedEffect;
    }

    public Boolean getIsSoundLoop() {
        return this.creativeModel.musicBuzModel.isSoundLoop;
    }

    public LivePhotoPreviewMode getLivePhotoPreviewMode() {
        LivePhotoModel livePhotoModel = this.creativeModel.livePhotoModel;
        if (livePhotoModel == null) {
            return null;
        }
        return livePhotoModel.previewMode;
    }

    public int getMCurMusicLength() {
        return this.creativeModel.musicBuzModel.mCurMusicLength;
    }

    public String getMId3Album() {
        MusicObject musicObject = this.creativeModel.musicBuzModel.music;
        if (musicObject != null) {
            return musicObject.album;
        }
        return null;
    }

    public String getMId3Author() {
        MusicObject musicObject = this.creativeModel.musicBuzModel.music;
        if (musicObject != null) {
            return musicObject.authorName;
        }
        return null;
    }

    public String getMId3Title() {
        MusicObject musicObject = this.creativeModel.musicBuzModel.music;
        if (musicObject != null) {
            return musicObject.musicName;
        }
        return null;
    }

    public int getMMusicEnd() {
        return this.creativeModel.musicBuzModel.musicEnd;
    }

    public String getMMusicPath() {
        return this.creativeModel.musicBuzModel.musicPath;
    }

    public int getMMusicRecType() {
        return this.creativeModel.musicBuzModel.musicRecType;
    }

    public int getMMusicShowRank() {
        return this.creativeModel.musicBuzModel.musicShowRank;
    }

    public int getMMusicStart() {
        return this.creativeModel.musicBuzModel.musicStart;
    }

    public int getMMusicType() {
        return this.creativeModel.musicBuzModel.mMusicType;
    }

    public List<MediaModel> getMediaModelList() {
        ArrayList arrayList = new ArrayList();
        if (getPreviewInfo() != null) {
            for (EditVideoSegment editVideoSegment : getPreviewInfo().getVideoList()) {
                boolean zIsFastImport = isFastImport();
                MediaModel mediaModel = new MediaModel(-1L);
                mediaModel.LJIILL(editVideoSegment.getVideoPath());
                mediaModel.width = editVideoSegment.getVideoFileInfo().getWidth();
                mediaModel.height = editVideoSegment.getVideoFileInfo().getHeight();
                mediaModel.duration = editVideoSegment.getVideoFileInfo().getDuration();
                mediaModel.type = mediaModel.LJIIJ() ? 1 : 4;
                if (zIsFastImport && editVideoSegment.getVideoCutInfo() != null) {
                    mediaModel.speed = editVideoSegment.getVideoCutInfo().getSpeed();
                }
                arrayList.add(mediaModel);
            }
        }
        return arrayList;
    }

    public String getMusicCover() {
        UrlModel urlModel;
        MusicObject musicObject = this.creativeModel.musicBuzModel.music;
        if (musicObject == null || (urlModel = musicObject.coverThumb) == null || C086I.LIZIZ(urlModel.getUrlList())) {
            return null;
        }
        return (String) ListProtector.get(musicObject.coverThumb.getUrlList(), 0);
    }

    public int getPollStickerSize() {
        if (!this.creativeModel.stickerModel.pollStickers.isEmpty()) {
            return 1;
        }
        List<InteractStickerStruct> listLJI = C1429860nJQ.LJI(getMainBusinessContext(), 1, EnumC1428480nHC.TRACK_PAGE_EDIT);
        return (listLJI == null || listLJI.isEmpty() || ((InteractStickerStruct) ListProtector.get(listLJI, 0)).getPollStruct() == null) ? 0 : 1;
    }

    public String getPropCustomPicCnt() {
        StringBuilder sb = new StringBuilder();
        ArrayList<TimeSpeedModelExtension> finalVideoList = getFinalVideoList();
        if (finalVideoList == null || finalVideoList.isEmpty()) {
            sb.append(this.creativeModel.greenScreenEffectModel.propCustomPicCnt);
        } else {
            for (int i = 0; i < finalVideoList.size(); i++) {
                sb.append(((TimeSpeedModelExtension) ListProtector.get(finalVideoList, i)).getFromRecordExtras("prop_customized_pic_cnt"));
                if (i != finalVideoList.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    public String getReadTextAllSpeakerId() {
        SimpleTextStickerData simpleTextStickerData;
        ArrayList arrayList = new ArrayList();
        if (C1416310mxZ.LJJLIIIJJIZ(this)) {
            for (TextStickerModel textStickerModel : C1416310mxZ.LJJIJIL(this)) {
                if (textStickerModel.getTtsModel() != null && textStickerModel.getTtsModel().hasReadTextAudio && !TextUtils.isEmpty(textStickerModel.getTtsModel().speakerID)) {
                    arrayList.add(textStickerModel.getTtsModel().speakerID);
                }
            }
        } else if (hasInfoStickers()) {
            for (StickerItemModel stickerItemModel : getInfoStickerModel().stickers) {
                if (stickerItemModel != null && stickerItemModel.isTextSticker() && (simpleTextStickerData = (SimpleTextStickerData) GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), stickerItemModel.extra, SimpleTextStickerData.class)) != null && simpleTextStickerData.getHasReadTextAudio() && !TextUtils.isEmpty(simpleTextStickerData.getSpeakerID())) {
                    arrayList.add(simpleTextStickerData.getSpeakerID());
                }
            }
        }
        String strLIZIZ = "";
        for (int i = 0; i < arrayList.size(); i++) {
            if (i == 0) {
                strLIZIZ = (String) ListProtector.get(arrayList, i);
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(",");
                sbLIZ.append((String) ListProtector.get(arrayList, i));
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        return strLIZIZ;
    }

    public List<AVChallenge> getRecordEffectChallenges() {
        List list = this.creativeModel.recordEffectModel.stickerChallenges;
        if (list != null && list.size() > 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<TimeSpeedModelExtension> finalVideoList = getFinalVideoList();
        if (finalVideoList != null && !finalVideoList.isEmpty()) {
            Iterator<TimeSpeedModelExtension> it2 = finalVideoList.iterator();
            while (it2.hasNext()) {
                List<AVChallenge> hashtag = it2.next().getHashtag();
                if (hashtag != null && !hashtag.isEmpty()) {
                    arrayList.addAll(hashtag);
                }
            }
        }
        return arrayList;
    }

    public String getReuseOriginalSoundId() {
        return this.creativeModel.musicBuzModel.reuseOriginalSoundId;
    }

    public int getReuseOriginalSoundLength() {
        return this.creativeModel.musicBuzModel.reuseOriginalSoundLength;
    }

    public UrlModel getReuseOriginalSoundUrls() {
        return this.creativeModel.musicBuzModel.reuseOriginalSoundUrls;
    }

    public List<String> getStickerPhotoList() {
        return this.creativeModel.recordEffectModel.stickerPhotoList;
    }

    public TemplateComplexity getTemplateComplexity() {
        TemplateComplexity templateComplexity = this.creativeModel.ugcTemplateData.templateComplexity;
        if (templateComplexity != null) {
            return templateComplexity;
        }
        return null;
    }

    public List<SimpleTextStickerData> getTextStickerDataList() {
        ArrayList arrayList = new ArrayList();
        if (C1416310mxZ.LJJLIIIJJIZ(this)) {
            for (TextStickerModel textStickerModel : C1416310mxZ.LJJIJIL(this)) {
                SimpleTextStickerData simpleTextStickerData = new SimpleTextStickerData(false, null, -1, null, 0, null, null, null, null, null, "", "", false, 0L, 0L, new LinkedHashMap());
                TTSModel ttsModel = textStickerModel.getTtsModel();
                if (ttsModel != null) {
                    boolean z = ttsModel.hasReadTextAudio;
                    int i = ttsModel.audioTrackIndex;
                    String str = ttsModel.audioTrackFilePath;
                    String str2 = ttsModel.speakerID;
                    int i2 = ttsModel.audioTrackDuration;
                    String str3 = ttsModel.audioText;
                    String str4 = ttsModel.voiceEffectId;
                    String str5 = ttsModel.voiceEffectResourceId;
                    simpleTextStickerData = new SimpleTextStickerData(z, str2, i, str, i2, str3, str4, ttsModel.voiceEffectIconUrl, ttsModel.voiceAnchorName, str5, ttsModel.voiceCreatorUserId, ttsModel.voiceCreatorUserName, ttsModel.isCreatorVoice, ttsModel.ttsAnchorReleaseDate, ttsModel.ttsReleaseDate, ttsModel.ttsExtraMap);
                }
                arrayList.add(simpleTextStickerData);
            }
        } else if (hasInfoStickers()) {
            for (StickerItemModel stickerItemModel : getInfoStickerModel().stickers) {
                if (stickerItemModel != null && stickerItemModel.isTextSticker()) {
                    arrayList.add(GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), stickerItemModel.extra, SimpleTextStickerData.class));
                }
            }
        }
        return arrayList;
    }

    public EffectPointModel getTimeEffect() {
        return this.creativeModel.editEffectModel.timeEffect;
    }

    public ArrayList<VideoAnimModel> getVideoAnimList() {
        return this.creativeModel.editEffectModel.videoAnimModel;
    }

    public boolean hasEditEffect() {
        return this.creativeModel.editEffectModel.effectList.size() > 0;
    }

    public boolean hasLyricStickers() {
        return !this.creativeModel.stickerModel.lyricStickerModels.isEmpty();
    }

    public boolean hasMusic() {
        String str = this.creativeModel.musicBuzModel.musicPath;
        return (str == null || str.isEmpty()) ? false : true;
    }

    public boolean hasStickers() {
        List<InteractStickerStruct> listLJI;
        List<InteractStickerStruct> listLJI2;
        List<InteractStickerStruct> listLJI3;
        if (C1466090oFr.LJIIL(this.creativeModel.stickerModel)) {
            return true;
        }
        C1429890nJT mainBusinessContext = getMainBusinessContext();
        if (mainBusinessContext != null) {
            EnumC1428480nHC enumC1428480nHC = EnumC1428480nHC.TRACK_PAGE_EDIT;
            listLJI = C1429860nJQ.LJI(mainBusinessContext, 1, enumC1428480nHC);
            listLJI3 = C1429860nJQ.LJI(mainBusinessContext, 10, enumC1428480nHC);
            listLJI2 = C1429860nJQ.LJI(mainBusinessContext, 11, enumC1428480nHC);
        } else {
            listLJI = null;
            listLJI2 = null;
            listLJI3 = null;
        }
        return hasInfoStickers() || !((listLJI == null || listLJI.isEmpty() || ((InteractStickerStruct) ListProtector.get(listLJI, 0)).getPollStruct() == null) && ((listLJI3 == null || listLJI3.isEmpty() || ((InteractStickerStruct) ListProtector.get(listLJI3, 0)).getCountDownStickerStruct() == null) && (C086I.LIZIZ(listLJI2) || ((InteractStickerStruct) ListProtector.get(listLJI2, 0)).getCaptionStruct() == null)));
    }

    public boolean hasText() {
        if (!this.creativeModel.stickerModel.textStickerModels.isEmpty()) {
            return true;
        }
        if (getInfoStickerModel() == null || C086I.LIZIZ(getInfoStickerModel().stickers)) {
            return false;
        }
        Iterator<StickerItemModel> it2 = getInfoStickerModel().stickers.iterator();
        while (it2.hasNext()) {
            if (it2.next().type == 2) {
                return true;
            }
        }
        return false;
    }

    public boolean hasTextMotion() {
        List<TextStickerModel> list = this.creativeModel.stickerModel.textStickerModels;
        if (list.isEmpty()) {
            return false;
        }
        Iterator<TextStickerModel> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().getTextMotionModel().motionEnabled == 1) {
                return true;
            }
        }
        return false;
    }

    public boolean isAutoEnhanceEnable() {
        if (((CreativeToolsEntranceReversalConfig) C1439110nYL.LIZIZ.getValue()).hideAutoEnhanceOnEditPage && !this.mIsFromDraft) {
            return false;
        }
        if (C1437790nWD.LIZ) {
            C201955140j.LIZ("hdrConfigEnable use cache");
            C1437790nWD.LIZ = false;
        } else if (!C1661700tLM.LIZ() && !C0MH2.LIZ(this, false)) {
            return false;
        }
        return (C0CHQ.LIZ().getAccountService().LIZ() || !C0CHQ.LIZ().getAccountService().isLogin() || C0C64.LJIILLIIL().LJIJ(31744, 1, "use_open_gl_three", true) != 1 || isDuet() || isStitchMode()) ? false : true;
    }

    public boolean isBestMatchMusic() {
        return this.creativeModel.musicBuzModel.isBestMatch;
    }

    public boolean isCommentReply() {
        List<CommentStickerModel> list = this.creativeModel.stickerModel.commentStickerModels;
        if (list.isEmpty() || !CommentModelExtensionKt.isDataValid(((CommentStickerModel) ListProtector.get(list, 0)).getCommentStickerModel())) {
            return CommentModelExtensionKt.isDataValid(getCommentVideoModel());
        }
        return true;
    }

    public boolean isCommerceMusic() {
        Boolean boolValueOf = Boolean.FALSE;
        MusicObject musicObject = this.creativeModel.musicBuzModel.music;
        if (musicObject != null) {
            boolValueOf = Boolean.valueOf(musicObject.isCommerceMusic);
        }
        return boolValueOf.booleanValue();
    }

    public boolean isCurrentAutoCutMode() {
        int i;
        AutoCutModel autoCutModel = this.creativeModel.autoCutModel;
        return autoCutModel.curIndexFromSource >= 0 && (i = autoCutModel.curSource) >= 0 && i < C0MJ9.values().length && this.creativeModel.autoCutModel.curSource != C0MJ9.SOUND_SYNC.ordinal();
    }

    public boolean isCutSameVideoType() {
        return this.cutSameEditData != null;
    }

    public boolean isDraftMusicIllegal() {
        return this.creativeModel.musicBuzModel.isDraftMusicIllegal;
    }

    public boolean isEnterFromBulletin() {
        return this.creativeModel.initialModel.dmCameraModel.isBulletin;
    }

    public boolean isEnterFromDM() {
        return this.creativeModel.initialModel.dmCameraModel.enterFromDM;
    }

    public boolean isEnterFromLinkShare() {
        return "link_share".equals(this.mShootWay);
    }

    public boolean isEnterFromPhotoSwap() {
        return this.creativeModel.initialModel.dmCameraModel.enterDM.equals("photoswap");
    }

    public boolean isLivePhotoEdit() {
        LivePhotoModel livePhotoModel;
        C578570Mmd.LIZ.getClass();
        if (!C578570Mmd.LIZ() || (livePhotoModel = this.creativeModel.livePhotoModel) == null || livePhotoModel.enterToImageFramework || livePhotoModel.importedLivePhotoList.isEmpty()) {
            return false;
        }
        return livePhotoModel.enableLiveMode;
    }

    public boolean isLivePhotoStaticEdit() {
        LivePhotoModel livePhotoModel;
        C578570Mmd.LIZ.getClass();
        return C578570Mmd.LIZ() && (livePhotoModel = this.creativeModel.livePhotoModel) != null && !livePhotoModel.importedLivePhotoList.isEmpty() && livePhotoModel.enableLiveMode && livePhotoModel.previewMode == LivePhotoPreviewMode.STATIC;
    }

    public boolean isPhotoSwap() {
        return this.creativeModel.initialModel.dmCameraModel.photoSwapScene != null;
    }

    public boolean isReuseOriginalSound() {
        return this.creativeModel.musicBuzModel.isReuseOriginalSound;
    }

    public boolean isUseMusicBeforeEdit() {
        return this.creativeModel.musicBuzModel.isUseMusicBeforeEdit;
    }

    public void resetStrategiesResult() {
        setStrategiesResult(new C1437400nVa());
    }

    public boolean shouldReuseAutoCutAnchor() {
        if (!Intrinsics.LJFF(this.mShootWay, "autocut_anchor")) {
            return false;
        }
        CreativeModel creativeModel = this.creativeModel;
        if (creativeModel.autoCutAnchorModel.templateId == null) {
            return false;
        }
        AutoCutModel autoCutModel = creativeModel.autoCutModel;
        return autoCutModel.curIndexFromSource == 0 && autoCutModel.curSource == C0MJ9.AUTO_CUT.ordinal();
    }

    public VideoPublishEditModel() {
        this.creativeModel = new CreativeModel();
    }

    public final boolean LIZ() {
        if (isUploadVideo() || isDuet() || isStitchMode() || getSharedARModel() != null) {
            return false;
        }
        return isMultiVideoEdit();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModelKt
    public String audioPath() {
        if (getPreviewInfo() == null || C1428470nHB.LJJLIIJ(this)) {
            return null;
        }
        List<EditVideoSegment> videoList = getPreviewInfo().getVideoList();
        if (videoList.size() == 0) {
            return null;
        }
        return ((EditVideoSegment) ListProtector.get(videoList, 0)).getAudioPath();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModelKt
    public VideoPublishEditModel clone() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeValue(this);
        parcelObtain.setDataPosition(0);
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) parcelObtain.readValue(VideoPublishEditModel.class.getClassLoader());
        parcelObtain.recycle();
        videoPublishEditModel.creativeModel = getCreativeModel().LIZ();
        if (C350300DoK.LIZ() && !getNleDataChange() && getNleModel() != null) {
            videoPublishEditModel.setNleModel(NLEModel.dynamicCast(getNleModel().deepClone()));
            videoPublishEditModel.setNleDataChange(false);
        }
        videoPublishEditModel.refreshOldFieldIfNeeded();
        return videoPublishEditModel;
    }

    public void copyMultiEditMusicInfo() {
        if (isMultiVideoEdit()) {
            getCurMultiEditVideoRecordData().musicPath = getMMusicPath();
            getCurMultiEditVideoRecordData().musicVolume = getMusicVolume();
            getCurMultiEditVideoRecordData().originVolume = getVoiceVolume();
            getCurMultiEditVideoRecordData().musicTrimIn = getMMusicStart();
        }
    }

    public ArrayList<TimeSpeedModelExtension> deepCopyFinalVideoList() {
        ArrayList<TimeSpeedModelExtension> finalVideoList = getFinalVideoList();
        ArrayList<TimeSpeedModelExtension> arrayList = new ArrayList<>();
        if (!C580130Mp9.LIZ(finalVideoList)) {
            for (TimeSpeedModelExtension timeSpeedModelExtension : finalVideoList) {
                TimeSpeedModelExtension timeSpeedModelExtension2 = (TimeSpeedModelExtension) C571330Max.LIZ(timeSpeedModelExtension);
                if (Build.VERSION.SDK_INT >= 26) {
                    timeSpeedModelExtension2.recordExtras = timeSpeedModelExtension.getRecordExtras().deepCopy();
                } else {
                    timeSpeedModelExtension2.recordExtras = GreenScreenMaterial.bytesToBundle(GreenScreenMaterial.bundleToBytes(timeSpeedModelExtension.recordExtras));
                }
                arrayList.add(timeSpeedModelExtension2);
            }
        }
        return arrayList;
    }

    public String draftDir() {
        return C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJIIZ(this);
    }

    public boolean duetFilesExist() {
        return C2286708xd.LIZJ(getDraftDuetExtraInfo().getDuetAudioPath()) && C2286708xd.LIZJ(getDraftDuetExtraInfo().getDuetVideoPath());
    }

    public boolean enableUsePreviewSizeInCanvasMode() {
        EditVideoSegment editVideoSegment;
        EditPreviewInfo previewInfo = getPreviewInfo();
        if (previewInfo == null || previewInfo.getVideoList().isEmpty() || (editVideoSegment = (EditVideoSegment) ListProtector.get(previewInfo.getVideoList(), 0)) == null || editVideoSegment.getVideoFileInfo().getWidth() <= 0 || editVideoSegment.getVideoFileInfo().getHeight() <= 0) {
            return true;
        }
        return getCreativeFlowData().getNleEditModel().getUsePreviewSizeInCanvasMode();
    }

    public String getAiMeStylesInfo() {
        ArrayList<TimeSpeedModelExtension> finalVideoList = getFinalVideoList();
        if (finalVideoList == null) {
            return "";
        }
        for (TimeSpeedModelExtension timeSpeedModelExtension : finalVideoList) {
            if (timeSpeedModelExtension != null && timeSpeedModelExtension.getAiMeStyleInfo() != null) {
                return C566080MIc.LIZ() ? timeSpeedModelExtension.getAiMeStyleInfo().getAiMeAwemeDataForEffectAnchor() : timeSpeedModelExtension.getAiMeStyleInfo().getAiMeAwemeData();
            }
        }
        return "";
    }

    public String getAllEffectListStr() {
        ArrayList<EffectPointModel> effectList = getEffectList();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < effectList.size(); i++) {
            sb.append(((EffectPointModel) ListProtector.get(effectList, i)).getKey());
            sb.append(",");
        }
        return sb.length() > 0 ? sb.substring(0, sb.length() - 1) : "";
    }

    public int getCamera() {
        return getCameraPosition();
    }

    public String getContactVideoPathAsKey() {
        if (getMultiEditVideoRecordData() != null && getMultiEditVideoRecordData().curMultiEditVideoRecordData != null) {
            String str = getMultiEditVideoRecordData().curMultiEditVideoRecordData.concatVideo;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        } else if (getStitchParams() != null && getStitchParams().getConcatVideoPath() != null && !TextUtils.isEmpty(getStitchParams().getConcatVideoPath())) {
            return getStitchParams().getConcatVideoPath();
        }
        return videoPath();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext
    public String getCreationId() {
        return getCreativeInfo().getCreationId();
    }

    public MultiEditVideoRecordData getCurMultiEditVideoRecordData() {
        if (isMultiVideoEdit()) {
            return getMultiEditVideoRecordData().curMultiEditVideoRecordData;
        }
        return null;
    }

    public MultiEditVideoRecordData getCurMultiEditVideoRecordDataInEditorPro() {
        if (getMultiEditVideoRecordData() == null) {
            return null;
        }
        return getMultiEditVideoRecordData().curMultiEditVideoRecordData;
    }

    public String getDescriptionByUpload() {
        return C0IKQ.LIZIZ(getImportInfoList()) ? ((ImportVideoInfo) ListProtector.get(getImportInfoList(), 0)).getDescription() : "";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getDuetLayoutLogMode() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.draft.model.DuetExtraInfo r0 = r3.getDraftDuetExtraInfo()
            r2 = 0
            if (r0 != 0) goto L8
            return r2
        L8:
            com.ss.android.ugc.aweme.draft.model.DuetExtraInfo r0 = r3.getDraftDuetExtraInfo()
            java.lang.String r1 = r0.getDuetLayoutMode()
            r1.getClass()
            int r0 = r1.hashCode()
            switch(r0) {
                case -1984141450: goto L1b;
                case 346401221: goto L26;
                case 1387629604: goto L31;
                case 1415681320: goto L3c;
                default: goto L1a;
            }
        L1a:
            return r2
        L1b:
            java.lang.String r0 = "vertical"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1a
            java.lang.String r0 = "4"
            return r0
        L26:
            java.lang.String r0 = "picture_in_picture"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1a
            java.lang.String r0 = "3"
            return r0
        L31:
            java.lang.String r0 = "horizontal"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1a
            java.lang.String r0 = "1"
            return r0
        L3c:
            java.lang.String r0 = "green_screen"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1a
            java.lang.String r0 = "2"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel.getDuetLayoutLogMode():java.lang.String");
    }

    public String getEditEffectDurationListStr() {
        ArrayList<EffectPointModel> effectList = getEffectList();
        if (C0IKQ.LIZ(effectList)) {
            return "";
        }
        EffectPointModel effectPointModel = (EffectPointModel) ListProtector.get(effectList, 0);
        StringBuilder sb = new StringBuilder(String.valueOf(effectPointModel.getUiEndPoint() - effectPointModel.getUiStartPoint()));
        for (int i = 1; i < effectList.size(); i++) {
            EffectPointModel effectPointModel2 = (EffectPointModel) ListProtector.get(effectList, i);
            sb.append(",");
            sb.append(effectPointModel2.getUiEndPoint() - effectPointModel2.getUiStartPoint());
        }
        return sb.toString();
    }

    public String getEditEffectEntrancePoint() {
        ArrayList<EffectPointModel> effectList = getEffectList();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < effectList.size(); i++) {
            sb.append(((EffectPointModel) ListProtector.get(effectList, i)).getEntrancePoint());
            sb.append(",");
        }
        return sb.length() > 0 ? sb.substring(0, sb.length() - 1) : "";
    }

    public String getEditEffectEntrancePosition() {
        ArrayList<EffectPointModel> effectList = getEffectList();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < effectList.size(); i++) {
            if (!C1403700mdE.LIZLLL((EffectPointModel) ListProtector.get(effectList, i))) {
                String entrancePoint = ((EffectPointModel) ListProtector.get(effectList, i)).getEntrancePoint();
                if (entrancePoint == null) {
                    entrancePoint = "null";
                }
                sb.append(entrancePoint);
                sb.append(",");
            }
        }
        return sb.length() > 0 ? sb.substring(0, sb.length() - 1) : "";
    }

    public int getEditEffectIndexInCarousel() {
        for (EffectPointModel effectPointModel : getEffectList()) {
            if (effectPointModel.getSelectFrom().equals("carousel")) {
                return effectPointModel.getIndex();
            }
        }
        return -1;
    }

    public String getEditEffectListStr() {
        ArrayList<EffectPointModel> effectList = getEffectList();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < effectList.size(); i++) {
            if (!((EffectPointModel) ListProtector.get(effectList, i)).getIsFromEditPro().booleanValue()) {
                sb.append(((EffectPointModel) ListProtector.get(effectList, i)).getKey());
                sb.append(",");
            }
        }
        return sb.length() > 0 ? sb.substring(0, sb.length() - 1) : "";
    }

    public String getEditEffectListWithOutZeroStr() {
        ArrayList<EffectPointModel> effectList = getEffectList();
        if (C0IKQ.LIZ(effectList)) {
            return "";
        }
        String key = ((EffectPointModel) ListProtector.get(effectList, 0)).getKey();
        StringBuilder sb = new StringBuilder(key.equals(CardStruct.IStatusCode.DEFAULT) ? "" : key);
        for (int i = 1; i < effectList.size(); i++) {
            if (!((EffectPointModel) ListProtector.get(effectList, i)).getKey().equals(CardStruct.IStatusCode.DEFAULT)) {
                sb.append(",");
                sb.append(((EffectPointModel) ListProtector.get(effectList, i)).getKey());
            }
        }
        return sb.toString();
    }

    public String getEditFilterId() {
        return getSelectedFilterId() == null ? "" : getSelectedFilterId();
    }

    public String getEditFilterName() {
        return getSelectedFilterLabel() == null ? "" : getSelectedFilterLabel();
    }

    public String getEditStickerIds() {
        return getInfoStickerModel() == null ? "" : getInfoStickerModel().getInfoStickerIds();
    }

    public EditorProModel getEditorProModel() {
        if (getCreativeFlowData().getEditorProModel() == null) {
            EditorProModel editorProModel = new EditorProModel();
            editorProModel.setOldEffectDraft(false);
            getCreativeFlowData().setEditorProModel(editorProModel);
        }
        return getCreativeFlowData().getEditorProModel();
    }

    public String getFilterIds() {
        return getCurFilterIds();
    }

    public int getFilterIndex() {
        return getSelectedId();
    }

    public String getFilterName() {
        return getCurFilterLabels();
    }

    public ArrayList<TimeSpeedModelExtension> getFinalSegments() {
        if (getMultiEditVideoRecordData() != null) {
            return C580130Mp9.LIZIZ(getMultiEditVideoRecordData().editSegments) ? getMultiEditVideoRecordData().editSegments : getMultiEditVideoRecordData().originalSegments;
        }
        return null;
    }

    public ArrayList<TimeSpeedModelExtension> getFinalVideoList() {
        return (getMultiEditVideoRecordData() == null || !C0IKQ.LIZIZ(getMultiEditVideoRecordData().editCutSegments)) ? CameraComponentModel.LJIIIIZZ(getVideoSegmentsDesc()) : getMultiEditVideoRecordData().editCutSegments;
    }

    public StickerItemModel getFirstTextSticker() {
        if (!hasInfoStickers()) {
            return null;
        }
        for (StickerItemModel stickerItemModel : getInfoStickerModel().stickers) {
            if (stickerItemModel != null && stickerItemModel.isTextSticker()) {
                return stickerItemModel;
            }
        }
        return null;
    }

    public int getFrom() {
        if (getFromCut()) {
            return 0;
        }
        return getFromMultiCut() ? 1 : 3;
    }

    public String getInfoStickerFrom() {
        C0WIY<String, String> c0wiyLIZJ = C1429860nJQ.LIZJ(getMainBusinessContext());
        String str = c0wiyLIZJ.LIZ;
        String str2 = c0wiyLIZJ.LIZIZ;
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            for (String str3 : str.split(",")) {
                if (!TextUtils.isEmpty(str2)) {
                    sb.append(str2);
                } else if (getInfoStickerCategoryParams().getInfoStickerCategoryMap().containsKey(str3)) {
                    sb.append(getInfoStickerCategoryParams().getInfoStickerCategoryMap().get(str3));
                }
            }
        }
        if (getCommentVideoModel() != null && !TextUtils.isEmpty(getCommentVideoModel().getAwemeId())) {
            if (!TextUtils.isEmpty(sb.toString())) {
                sb.append(",");
            }
            sb.append("comment_reply");
        }
        if (getInfoStickerModel() == null || C0IKQ.LIZ(getInfoStickerModel().stickers)) {
            return sb.toString();
        }
        String string = sb.toString();
        Iterator it2 = AbstractC19878112q3.copyOf(getInfoStickerModel().stickers).iterator();
        StringBuilder sb2 = new StringBuilder();
        boolean z = true;
        while (it2.hasNext()) {
            StickerItemModel stickerItemModel = (StickerItemModel) it2.next();
            if (!TextUtils.isEmpty(stickerItemModel.stickerId) && stickerItemModel.type != 2) {
                if (z) {
                    z = false;
                } else {
                    sb2.append(',');
                }
                if (!TextUtils.isEmpty(stickerItemModel.tabId)) {
                    sb2.append(stickerItemModel.tabId);
                } else if (getInfoStickerCategoryParams().getInfoStickerCategoryMap().containsKey(stickerItemModel.stickerId)) {
                    sb2.append(getInfoStickerCategoryParams().getInfoStickerCategoryMap().get(stickerItemModel.stickerId));
                } else if (stickerItemModel.type == 10) {
                    sb2.append("giphy");
                } else if (this.creativeModel.changeAvatarModel.stickerIds.contains(stickerItemModel.stickerId)) {
                    sb2.append("profile_photo");
                }
            }
        }
        String string2 = sb2.toString();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(string2);
        sbLIZ.append(string);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getLocalFinalPath() {
        AVUploadSaveModel saveModel = getSaveModel();
        if (saveModel == null) {
            return null;
        }
        return saveModel.getLocalFinalPath();
    }

    public String getLocalSilentSharePath() {
        AVUploadSaveModel saveModel = getSaveModel();
        if (saveModel == null) {
            return null;
        }
        return saveModel.getLocalSilentSharePath();
    }

    public String getLocalTempPath() {
        AVUploadSaveModel saveModel = getSaveModel();
        if (saveModel == null) {
            return null;
        }
        C570490MZb.LJFF(new C0VSJ(saveModel.getLocalTempPath()).getParentFile());
        return saveModel.getLocalTempPath();
    }

    public long getMultiEditVideoStartTime() {
        if (isMultiVideoEdit()) {
            return getCurMultiEditVideoRecordData().startTime;
        }
        return 0L;
    }

    public String getMusicId() {
        if (getStitchParams() != null) {
            return getStitchParams().getMusicId();
        }
        MusicObject musicObject = this.creativeModel.musicBuzModel.music;
        if (musicObject != null) {
            return MusicBeanUtilKt.getMusicId(musicObject);
        }
        return null;
    }

    public String getMusicIdByUpload() {
        return C0IKQ.LIZIZ(getImportInfoList()) ? ((ImportVideoInfo) ListProtector.get(getImportInfoList(), 0)).getRealMusicId() : "";
    }

    public String getMusicOrigin() {
        return getStitchParams() != null ? "stitch" : this.creativeModel.musicBuzModel.musicOrigin;
    }

    public String getMusicOriginWithCheck() {
        return TextUtils.isEmpty(getMusicOrigin()) ? this.creativeModel.musicBuzModel.music != null ? "others" : "original" : getMusicOrigin();
    }

    public int getOriginal() {
        return getOrigin();
    }

    public AVMusic getOriginalRecordMusic() {
        if (isMultiVideoEdit()) {
            return getMultiEditVideoRecordData().recordMusic;
        }
        return null;
    }

    public int getPrettify() {
        return getFaceBeauty();
    }

    public EditPreviewInfo getPreviewInfo() {
        return getEditPreviewInfo();
    }

    public String getRealSynthesisFile() {
        return (!C297810Blr.LIZ() || new C0VSJ(getParallelUploadOutputFile()).exists()) ? getParallelUploadOutputFile() : getOutputFile();
    }

    public int[] getRecordVideoSize() {
        return new int[]{C571500MbE.LJIILJJIL(this, getPreviewInfo(), isFastImport(), isStitchMode(), false), C571500MbE.LJIILIIL(this, getPreviewInfo(), isFastImport(), isStitchMode(), false)};
    }

    public String getSessionId() {
        return getCreativeInfo().getSessionId();
    }

    public String getStickers() {
        return getStickerID();
    }

    public String getTTTemplateIdForAutoCut() {
        String str;
        return (!isCurrentAutoCutMode() || (((str = this.creativeModel.autoCutModel.curTemplateId) == null || str.isEmpty()) && (str = this.creativeModel.autoCutModel.curTemplateGroupId) == null)) ? "" : str;
    }

    public Integer getUploadSpeedSettingsIndex() {
        if (getStrategiesResult() != null && getStrategiesResult().LIZIZ != null) {
            return getStrategiesResult().LIZIZ.LIZ;
        }
        getUploadSpeedEncodeSettings();
        C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadSpeeds , settingsIndex : ");
        sbLIZ.append((Object) null);
        C201955140j.LJIILJJIL(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ));
        return null;
    }

    public String getValidVideoCoverPath() {
        if (C2286708xd.LIZJ(getVideoCoverPath())) {
            return getVideoCoverPath();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext
    public int getVideoLength() {
        if (getPreviewInfo() == null) {
            return 0;
        }
        return getPreviewInfo().getPreviewVideoLength();
    }

    public String getVideoResolution() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(videoWidth());
        sbLIZ.append("*");
        sbLIZ.append(videoHeight());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getWavFile() {
        if (audioPath() != null && C2286708xd.LIZJ(audioPath())) {
            return audioPath();
        }
        return null;
    }

    public boolean hadRecordWithVolume() {
        return hasRecord() && getVeAudioRecorderParam() != null && getVeAudioRecorderParam().getRecordVolume() > 0.0f;
    }

    public boolean hasEditEffectFromCarousel() {
        Iterator<EffectPointModel> it2 = getEffectList().iterator();
        while (it2.hasNext()) {
            if (it2.next().getSelectFrom().equals("carousel")) {
                return true;
            }
        }
        return false;
    }

    public boolean hasExtendMusic() {
        return hasMusic() && !C086I.LIZIZ(this.creativeModel.musicBuzModel.extendMusicList);
    }

    public boolean hasImageStickers() {
        if (!hasInfoStickers()) {
            return false;
        }
        Iterator<StickerItemModel> it2 = getInfoStickerModel().stickers.iterator();
        while (it2.hasNext()) {
            if (it2.next().isImageSticker()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasInfoStickers() {
        InfoStickerModel infoStickerModel;
        List<StickerItemModel> list;
        if (getInfoStickerModel() == null || (infoStickerModel = getInfoStickerModel()) == null || (list = infoStickerModel.stickers) == null || list.isEmpty()) {
            return false;
        }
        Iterator<StickerItemModel> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().type != 1000) {
                return true;
            }
        }
        return false;
    }

    public boolean hasNotAudioRecord() {
        return getVeAudioRecorderParam() == null || !getVeAudioRecorderParam().hasRecord();
    }

    public boolean hasOriginalSound() {
        return getWavFile() != null;
    }

    public boolean hasReadTextAudio() {
        if (C1416310mxZ.LJJLIIIJJIZ(this)) {
            for (TextStickerModel textStickerModel : C1416310mxZ.LJJIJIL(this)) {
                Boolean boolValueOf = Boolean.TRUE;
                if (textStickerModel.getTtsModel() != null && textStickerModel.getTtsModel().ttsExtraMap.containsKey("is_tts_reuse_mdp")) {
                    boolValueOf = Boolean.valueOf(!textStickerModel.getTtsModel().ttsExtraMap.get("is_tts_reuse_mdp").equals("1"));
                }
                if (textStickerModel.getTtsModel() != null && textStickerModel.getTtsModel().hasReadTextAudio && boolValueOf.booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        if (!hasInfoStickers()) {
            return false;
        }
        for (StickerItemModel stickerItemModel : getInfoStickerModel().stickers) {
            if (stickerItemModel != null && stickerItemModel.isTextSticker()) {
                SimpleTextStickerData simpleTextStickerData = (SimpleTextStickerData) GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), stickerItemModel.extra, SimpleTextStickerData.class);
                Boolean boolValueOf2 = Boolean.TRUE;
                if (simpleTextStickerData == null) {
                    continue;
                } else {
                    if (simpleTextStickerData.getTtsExtraMap().containsKey("is_tts_reuse_mdp")) {
                        boolValueOf2 = Boolean.valueOf(!simpleTextStickerData.getTtsExtraMap().get("is_tts_reuse_mdp").equals("1"));
                    }
                    if (simpleTextStickerData.getHasReadTextAudio() && boolValueOf2.booleanValue()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean hasRecord() {
        return getVeAudioRecorderParam() != null && getVeAudioRecorderParam().hasRecord();
    }

    public boolean hasRetake() {
        if (isMultiVideoEdit()) {
            return getMultiEditVideoRecordData().curMultiEditVideoRecordData.hasRetake;
        }
        return false;
    }

    public boolean hasSubtitle() {
        if (getMainBusinessContext() != null) {
            return !C086I.LIZIZ(C1429860nJQ.LJI(r2, 11, EnumC1428480nHC.TRACK_PAGE_EDIT));
        }
        return false;
    }

    public boolean hasTextSticker() {
        if ((C1428470nHB.LJJZZI(this) && getImageAlbumData() != null && !C1428470nHB.LJJJJLL(this) && getImageAlbumData().hasTextStickers()) || !this.creativeModel.stickerModel.textStickerModels.isEmpty()) {
            return true;
        }
        if (!hasInfoStickers()) {
            return false;
        }
        for (StickerItemModel stickerItemModel : getInfoStickerModel().stickers) {
            if (stickerItemModel != null && stickerItemModel.isTextSticker()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasUploadFrameConditionInEdit() {
        return !getEffectList().isEmpty() || hasStickers();
    }

    public boolean hasUploadFrameConditionInRecord() {
        return !TextUtils.isEmpty(getStickerID());
    }

    public boolean hasUserAddStickers() {
        InfoStickerModel infoStickerModel;
        List<StickerItemModel> list;
        if (getInfoStickerModel() == null || (infoStickerModel = getInfoStickerModel()) == null || (list = infoStickerModel.stickers) == null || list.isEmpty()) {
            return false;
        }
        Iterator<StickerItemModel> it2 = list.iterator();
        while (it2.hasNext()) {
            int i = it2.next().type;
            if (i != 1000 && i != 27) {
                return true;
            }
        }
        return false;
    }

    public boolean isAllowClearMusic() {
        return isPhotoMvMode() || !isMvThemeVideoType();
    }

    public boolean isApplyVoiceToAllTextOpen() {
        return getApplyVoiceToAllTextSwitch() == 1;
    }

    public boolean isChangeMultiEditData() {
        if (!isMultiVideoEdit() || getMultiEditVideoRecordData().originMultiEditRecordData == null) {
            return false;
        }
        Pair<Integer, Integer> playInOutTime = getCurMultiEditVideoRecordData().getPlayInOutTime();
        Pair<Integer, Integer> playInOutTime2 = getMultiEditVideoRecordData().originMultiEditRecordData.getPlayInOutTime();
        if (((Integer) playInOutTime.first).equals(playInOutTime2.first) && ((Integer) playInOutTime.second).equals(playInOutTime2.second)) {
            return !getCurMultiEditVideoRecordData().isEqual(getMultiEditVideoRecordData().originMultiEditRecordData);
        }
        return true;
    }

    public boolean isDisableDeleteChain() {
        return getDisableDeleteChain();
    }

    public boolean isDisableOriginalSound() {
        return (getVeAudioRecorderParam() == null || getVeAudioRecorderParam().getNeedOriginalSound()) ? false : true;
    }

    public boolean isDuet() {
        return !TextUtils.isEmpty(getDuetFrom());
    }

    public boolean isFromCrash() {
        return getPublishStage() == 50 || this.mDraftToEditFrom == 2;
    }

    public Boolean isIfAiMeStyleUsed() {
        ArrayList<TimeSpeedModelExtension> finalVideoList = getFinalVideoList();
        if (finalVideoList != null) {
            for (TimeSpeedModelExtension timeSpeedModelExtension : finalVideoList) {
                if (timeSpeedModelExtension != null && timeSpeedModelExtension.getAiMeStyleInfo() != null) {
                    return Boolean.TRUE;
                }
            }
        }
        return Boolean.FALSE;
    }

    public boolean isImageLivePhotoEdit() {
        ImageAlbumData imageAlbumData;
        return C295670BiP.LIZ() && (imageAlbumData = this.creativeModel.imageAlbumModel) != null && C1413430msv.LJIIJ(imageAlbumData) > 0;
    }

    public boolean isLinkShareWithPresetMusic() {
        LinkShareSettings linkShareSettings;
        C1402840mbq shareContext = getMainBusinessContext() != null ? getMainBusinessContext().getShareContext() : null;
        boolean z = (shareContext == null || (linkShareSettings = shareContext.linkShareSettings) == null || !linkShareSettings.isTrackContentType()) ? false : true;
        if (isEnterFromLinkShare()) {
            return this.creativeModel.musicBuzModel.music != null || z;
        }
        return false;
    }

    public boolean isMediaFromGallery() {
        return TextUtils.equals(getAvetParameter().getContentSource(), "upload");
    }

    public boolean isMultiVideoEdit() {
        return C1428470nHB.LJJIIZ(this);
    }

    public int isMusic() {
        return getMMusicPath() == null ? 0 : 1;
    }

    public boolean isMvThemeVideoType() {
        if (getMvCreateVideoData() != null) {
            return getVideoEditorType() == 2 || getVideoEditorType() == 3;
        }
        return false;
    }

    public boolean isNLECanvas() {
        return getCreativeFlowData().getNleEditModel().isNLECanvas();
    }

    public boolean isPoi() {
        return getPoiData() != null;
    }

    public boolean isPreviewInfoValid() {
        if (getPreviewInfo() != null && !getPreviewInfo().getVideoList().isEmpty()) {
            return true;
        }
        C201955140j.LJII(C830690WiJ.LIZIZ, "EditPreviewInfo in VideoPublishEditModel is null");
        return false;
    }

    public boolean isRetakeVideo() {
        return isMultiVideoEdit() && getMultiEditVideoRecordData() != null && getMultiEditVideoRecordData().restoreMultiEditVideoRecordData != null && getMultiEditVideoRecordData().isMultiEditRetake;
    }

    public boolean isReverse() {
        EffectPointModel timeEffect = getTimeEffect();
        return timeEffect != null && "1".equals(timeEffect.getKey());
    }

    public boolean isSaveLocal() {
        AVUploadSaveModel saveModel = getSaveModel();
        return saveModel != null && saveModel.isSaveLocal();
    }

    public boolean isSaveLocalWithWaterMark() {
        AVUploadSaveModel saveModel = getSaveModel();
        return saveModel != null && saveModel.isSaveLocalWithWaterMark();
    }

    public boolean isSaveLocalWithoutWaterMark() {
        AVUploadSaveModel saveModel = getSaveModel();
        return (saveModel == null || saveModel.isWaterMark()) ? false : true;
    }

    public boolean isSaveToAlbum() {
        AVUploadSaveModel saveModel = getSaveModel();
        return saveModel != null && saveModel.getSaveToAlbum();
    }

    public boolean isSaveToLocalPathInsteadOfAlbum() {
        AVUploadSaveModel saveModel = getSaveModel();
        return saveModel != null && saveModel.isSaveToAppPathInsteadOfAlbum();
    }

    public boolean isSilentShare() {
        AVUploadSaveModel saveModel = getSaveModel();
        return (saveModel == null || saveModel.getSaveType() == 0 || saveModel.getSaveType() == 1) ? false : true;
    }

    public boolean isStitchMode() {
        return getStitchParams() != null;
    }

    public boolean isTemplateMv() {
        return isMvThemeVideoType() && !isPhotoMvMode();
    }

    public boolean isTimeEffectApply() {
        EffectPointModel timeEffect = getTimeEffect();
        if (timeEffect == null) {
            return false;
        }
        String key = timeEffect.getKey();
        return TextUtils.equals("1", key) || TextUtils.equals("2", key) || TextUtils.equals("3", key);
    }

    public boolean isUseMultiEdit() {
        if (isMultiVideoEdit()) {
            return getMultiEditVideoRecordData().isUseMultiEdit;
        }
        return false;
    }

    public boolean isUseTimeReverseEffect() {
        EffectPointModel timeEffect = getTimeEffect();
        return timeEffect != null && timeEffect.getKey().equals("1");
    }

    public int maxFps4Videos() {
        VEUtils.VEVideoFileInfo vEVideoFileInfoLIZJ;
        if (getPreviewInfo() == null) {
            return 0;
        }
        EditPreviewInfo previewInfo = getPreviewInfo();
        int i = 0;
        for (EditVideoSegment editVideoSegment : previewInfo.getVideoList()) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            EditVideoSegment editVideoSegment2 = editVideoSegment;
            if (!C2471909mP.LJJIII(editVideoSegment2.getVideoPath(), false, 6) && editVideoSegment2.getVideoFileInfo().getFps() == -100 && (vEVideoFileInfoLIZJ = C574790MgX.LIZJ(editVideoSegment2.getVideoPath())) != null) {
                ListProtector.set(previewInfo.getVideoList(), i, EditVideoSegment.copy$default(editVideoSegment2, null, null, C571500MbE.LJIIIIZZ(vEVideoFileInfoLIZJ), null, 11, null));
            }
            i = i2;
        }
        Iterator<EditVideoSegment> it2 = previewInfo.getVideoList().iterator();
        if (!it2.hasNext()) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(it2.next().getVideoFileInfo().getFps());
        while (it2.hasNext()) {
            Integer numValueOf2 = Integer.valueOf(it2.next().getVideoFileInfo().getFps());
            if (numValueOf.compareTo(numValueOf2) < 0) {
                numValueOf = numValueOf2;
            }
        }
        if (numValueOf == null || numValueOf.intValue() <= 0 || numValueOf == null) {
            return 0;
        }
        return numValueOf.intValue();
    }

    public boolean notUseCanvasSize() {
        return ((!(videoWidth() > videoHeight()) && !(C301490Brn.LIZ() && C537820L7k.LIZ(videoWidth(), videoHeight()))) || getCoverPublishModel() == null || getCoverPublishModel().getNeedExpandCompiledSize()) ? false : true;
    }

    public boolean realHasOriginalSound() {
        EditPreviewInfo previewInfo = getPreviewInfo();
        if (previewInfo == null) {
            return false;
        }
        for (EditVideoSegment editVideoSegment : previewInfo.getVideoList()) {
            if (editVideoSegment.getAudioPath() != null && new C0VSJ(editVideoSegment.getAudioPath()).exists()) {
                return true;
            }
        }
        return getReplaceMusicModel() != null && getReplaceMusicModel().getAddedStrippedOriginSound();
    }

    public void resetVolume() {
        if (isFastImport() || realHasOriginalSound()) {
            setVoiceVolume(1.0f);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModelKt
    public String reverseVideoPath() {
        if (getPreviewInfo() == null) {
            return null;
        }
        return getPreviewInfo().reverseVideo();
    }

    public int segmentCounts() {
        if (getPreviewInfo() == null) {
            return 0;
        }
        return getPreviewInfo().getVideoList().size();
    }

    public void setMultiEditBeautyMetadatas() {
        if (isMultiVideoEdit() && !C580130Mp9.LIZ(getMultiEditVideoRecordData().editSegments)) {
            ArrayList arrayList = new ArrayList();
            for (TimeSpeedModelExtension timeSpeedModelExtension : getMultiEditVideoRecordData().editSegments) {
                if (timeSpeedModelExtension != null && timeSpeedModelExtension.getBeautyMetadata() != null) {
                    arrayList.add(timeSpeedModelExtension.getBeautyMetadata());
                }
            }
            if (C580130Mp9.LIZ(arrayList)) {
                return;
            }
            getBeautyMetadatas().clear();
            getBeautyMetadatas().addAll(arrayList);
        }
    }

    public void setMultiEditCameraLensInfo() {
        if (isMultiVideoEdit() && !C580130Mp9.LIZ(getMultiEditVideoRecordData().editSegments)) {
            ArrayList arrayList = new ArrayList();
            for (TimeSpeedModelExtension timeSpeedModelExtension : getMultiEditVideoRecordData().editSegments) {
                if (timeSpeedModelExtension != null && timeSpeedModelExtension.getCameraLensInfo() != null) {
                    arrayList.add(timeSpeedModelExtension.getCameraLensInfo());
                }
            }
            if (C580130Mp9.LIZ(arrayList)) {
                return;
            }
            if (getCameraLensInfo() == null) {
                setCameraLensInfo(new ArrayList<>());
            }
            getCameraLensInfo().clear();
            getCameraLensInfo().addAll(arrayList);
        }
    }

    public void setMultiEditStickIds() {
        if (!isMultiVideoEdit() || getMultiEditVideoRecordData().editSegments == null || getMultiEditVideoRecordData().editSegments.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (TimeSpeedModelExtension timeSpeedModelExtension : getMultiEditVideoRecordData().editSegments) {
            if (timeSpeedModelExtension != null && !TextUtils.isEmpty(timeSpeedModelExtension.getStickerId())) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(timeSpeedModelExtension.getStickerId());
                sbLIZ.append(",");
                sb.append(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        setStickerID(sb.toString());
    }

    public boolean shouldUploadExtractFrames() {
        return hasUploadFrameConditionInRecord() || hasUploadFrameConditionInEdit();
    }

    public int sourceVideoHeight() {
        if (getPreviewInfo() == null) {
            return 0;
        }
        EditPreviewInfo previewInfo = getPreviewInfo();
        if (!isFastImport()) {
            if (previewInfo.getVideoList().isEmpty()) {
                return 0;
            }
            return ((EditVideoSegment) ListProtector.get(previewInfo.getVideoList(), 0)).getVideoFileInfo().getHeight();
        }
        if (previewInfo.getCalculateSourceHeight() <= 0) {
            VESize vESizeCalcTargetRes = VEUtils.calcTargetRes(previewInfo.getTotalVideoWidth(), previewInfo.getTotalVideoHeight(), C571630MbR.LIZ(previewInfo), Integer.MAX_VALUE);
            previewInfo.setCalculateSourceWidth(vESizeCalcTargetRes.width);
            previewInfo.setCalculateSourceHeight(vESizeCalcTargetRes.height);
        }
        return previewInfo.getCalculateSourceHeight();
    }

    public int sourceVideoWidth() {
        if (getPreviewInfo() == null) {
            return 0;
        }
        EditPreviewInfo previewInfo = getPreviewInfo();
        if (!isFastImport()) {
            if (previewInfo.getVideoList().isEmpty()) {
                return 0;
            }
            return ((EditVideoSegment) ListProtector.get(previewInfo.getVideoList(), 0)).getVideoFileInfo().getWidth();
        }
        if (previewInfo.getCalculateSourceWidth() <= 0) {
            VESize vESizeCalcTargetRes = VEUtils.calcTargetRes(previewInfo.getTotalVideoWidth(), previewInfo.getTotalVideoHeight(), C571630MbR.LIZ(previewInfo), Integer.MAX_VALUE);
            previewInfo.setCalculateSourceWidth(vESizeCalcTargetRes.width);
            previewInfo.setCalculateSourceHeight(vESizeCalcTargetRes.height);
        }
        return previewInfo.getCalculateSourceWidth();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModelKt
    public int videoHeight() {
        if (getPreviewInfo() == null || C1428470nHB.LJJLIIJ(this)) {
            return 0;
        }
        return C571500MbE.LJIILIIL(this, getPreviewInfo(), isFastImport(), isStitchMode(), LIZ());
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModelKt
    public String videoPath() {
        return (getPreviewInfo() == null || C1428470nHB.LJJLIIJ(this) || C580130Mp9.LIZ(getPreviewInfo().getVideoList())) ? "" : ((EditVideoSegment) ListProtector.get(getPreviewInfo().getVideoList(), 0)).getVideoPath();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModelKt
    public int videoWidth() {
        if (getPreviewInfo() == null || C1428470nHB.LJJLIIJ(this)) {
            return 0;
        }
        return C571500MbE.LJIILJJIL(this, getPreviewInfo(), isFastImport(), isStitchMode(), LIZ());
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModelKt
    public CreativeModel getCreativeModel() {
        return this.creativeModel;
    }

    public int isPrivate() {
        return this.isPrivate;
    }

    public boolean isSupportCache() {
        return this.supportCache;
    }

    public VideoPublishEditModel(Parcel parcel) {
        boolean z;
        super(parcel);
        this.creativeModel = new CreativeModel();
        setTitle(parcel.readString());
        setChain(parcel.readString());
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        setDisableDeleteChain(z);
        setStructList(parcel.createTypedArrayList(AVTextExtraStruct.CREATOR));
        setSubtitleMusicChangeChecker((C383310F1d) parcel.readSerializable());
        setCameraIds(parcel.readString());
        setVideoSegmentsDesc(parcel.readString());
        setOrigin(parcel.readInt());
        setHardEncode(parcel.readInt());
        setRestoreType(parcel.readInt());
        setCameraPosition(parcel.readInt());
        setShareId(parcel.readString());
        setClientId(parcel.readString());
        setVeCherEffectParam((ClientCherEffectParam) parcel.readParcelable(ClientCherEffectParam.class.getClassLoader()));
        setSoundSyncFromAnchor(parcel.readByte() == 1);
        setVeAudioRecorderParam((AudioRecorderParam) parcel.readParcelable(AudioRecorderParam.class.getClassLoader()));
        setAudioEnhanceParam((AudioEnhanceParam) parcel.readParcelable(AudioEnhanceParam.class.getClassLoader()));
        setOpenPlatformExtra(parcel.readString());
        setOpenPlatformClientKey(parcel.readString());
        setFromItemId(parcel.readString());
    }

    public static VideoExposureData asExposureData(Object obj) {
        boolean z;
        ArrayList arrayList;
        PhotoModeExposureData photoModeExposureData;
        String outputFile;
        String creationId;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
        if (videoPublishEditModel.getCreationMode() == 2 && videoPublishEditModel.getImageAlbumData() != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            arrayList = new ArrayList(videoPublishEditModel.getImageAlbumData().getImageList());
            photoModeExposureData = new PhotoModeExposureData(arrayList);
        } else {
            arrayList = new ArrayList();
            photoModeExposureData = null;
        }
        if (videoPublishEditModel.getOutputFile() != null) {
            outputFile = videoPublishEditModel.getOutputFile();
        } else {
            outputFile = "";
        }
        String strVideoPath = videoPublishEditModel.videoPath();
        float videoCoverStartTm = videoPublishEditModel.getVideoCoverStartTm();
        String mainBusinessData = videoPublishEditModel.getMainBusinessData();
        String strVideoPath2 = videoPublishEditModel.videoPath();
        if (videoPublishEditModel.getCreationId() == null) {
            creationId = UUID.randomUUID().toString();
        } else {
            creationId = videoPublishEditModel.getCreationId();
        }
        return new VideoExposureData(strVideoPath, videoCoverStartTm, mainBusinessData, outputFile, strVideoPath2, creationId, videoPublishEditModel.isSaveLocal(), videoPublishEditModel.getLocalFinalPath(), videoPublishEditModel.getSaveModel(), videoPublishEditModel.getOrigin(), videoPublishEditModel.getDraftPrimaryKey(), videoPublishEditModel.mShootWay, videoPublishEditModel.creativeModel.musicBuzModel, photoModeExposureData);
    }

    public static List<Integer> getAudioFileInfoForAllTracks(String str) {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 32, 4);
        int iNativeGetAudioFileInfoForAllTracks = TEVideoUtils.nativeGetAudioFileInfoForAllTracks(str, iArr);
        if (iNativeGetAudioFileInfoForAllTracks >= 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < iNativeGetAudioFileInfoForAllTracks; i++) {
                arrayList.add(Integer.valueOf(iArr[i][3]));
            }
            return arrayList;
        }
        return new ArrayList(0);
    }

    public static String getGiphyGifIds(ArrayList<GreenScreenMaterial> arrayList) {
        StringBuilder sb = new StringBuilder();
        if (arrayList == null) {
            return sb.toString();
        }
        return sb.toString();
    }

    public static VideoPublishEditModel makeCopy(VideoPublishEditModel videoPublishEditModel) {
        return videoPublishEditModel.clone();
    }

    public static String translateNullFilter(String str) {
        if (str == null) {
            return null;
        }
        return str.replace("null", "-1");
    }

    public String getEditEffectIndexStr(boolean z) {
        int index;
        int i;
        ArrayList<EffectPointModel> effectList = getEffectList();
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            String strValueOf = "";
            if (i2 >= effectList.size()) {
                break;
            }
            if ((!z || !C1403700mdE.LIZLLL((EffectPointModel) ListProtector.get(effectList, i2))) && !((EffectPointModel) ListProtector.get(effectList, i2)).getIsFromEditPro().booleanValue()) {
                if (((EffectPointModel) ListProtector.get(effectList, i2)).isMagic()) {
                    index = ((EffectPointModel) ListProtector.get(effectList, i2)).getIndex() - 1;
                } else {
                    index = ((EffectPointModel) ListProtector.get(effectList, i2)).getIndex();
                }
                if (index >= 0 && (i = index + 1) != -1) {
                    strValueOf = String.valueOf(i);
                }
                sb.append(strValueOf);
                sb.append(",");
            }
            i2++;
        }
        if (sb.length() <= 0) {
            return "";
        }
        return sb.substring(0, sb.length() - 1);
    }

    public String getInfoStickerList(Boolean bool) {
        LinkedList linkedList = new LinkedList();
        String pollStickerId = C1429860nJQ.LIZJ(getMainBusinessContext()).LIZ;
        if (!this.creativeModel.stickerModel.pollStickers.isEmpty()) {
            pollStickerId = ((PollStickerModel) ListProtector.get(this.creativeModel.stickerModel.pollStickers, 0)).getPollStickerId();
        }
        if (!pollStickerId.isEmpty()) {
            linkedList.add(pollStickerId);
        }
        LiveEventCountDownStickerModel liveEventCountDownStickerModel = (LiveEventCountDownStickerModel) C13LP.LJJJLL(this.creativeModel.stickerModel.liveEventCountDownStickerModel);
        if (liveEventCountDownStickerModel != null) {
            String stickerId = liveEventCountDownStickerModel.getStickerId();
            if (!stickerId.isEmpty()) {
                linkedList.add(stickerId);
            }
        }
        if (C13LP.LJJJLL(this.creativeModel.stickerModel.liveEventStoryStickerModel) != null) {
            linkedList.add("liveevent_story_sticker");
        }
        if (getInfoStickerModel() != null && !C0IKQ.LIZ(getInfoStickerModel().stickers)) {
            String notEmptyInfoStickerIds = getInfoStickerModel().getNotEmptyInfoStickerIds(bool);
            if (linkedList.isEmpty()) {
                return notEmptyInfoStickerIds;
            }
            if (notEmptyInfoStickerIds.isEmpty()) {
                return TextUtils.join(",", linkedList);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(notEmptyInfoStickerIds);
            sbLIZ.append(",");
            sbLIZ.append(TextUtils.join(",", linkedList));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return TextUtils.join(",", linkedList);
    }

    public String getMMusicUrlKey(String str) {
        if (!C297100Bki.LIZ()) {
            return null;
        }
        return C1444810nhX.LIZIZ(this.creativeModel.musicBuzModel, str);
    }

    public String getTtsLokiIds(boolean z) {
        String strLIZIZ;
        ArrayList arrayList = new ArrayList();
        if (C1416310mxZ.LJJLIIIJJIZ(this)) {
            for (TextStickerModel textStickerModel : C1416310mxZ.LJJIJIL(this)) {
                Boolean boolValueOf = Boolean.TRUE;
                if (textStickerModel.getTtsModel() != null && textStickerModel.getTtsModel().ttsExtraMap.containsKey("is_tts_reuse_mdp")) {
                    boolValueOf = Boolean.valueOf(!textStickerModel.getTtsModel().ttsExtraMap.get("is_tts_reuse_mdp").equals("1"));
                }
                if (textStickerModel.getTtsModel() != null && textStickerModel.getTtsModel().hasReadTextAudio && boolValueOf.booleanValue() && !TextUtils.isEmpty(textStickerModel.getTtsModel().voiceEffectId)) {
                    arrayList.add(textStickerModel.getTtsModel().voiceEffectId);
                }
            }
        } else if (hasInfoStickers()) {
            for (StickerItemModel stickerItemModel : getInfoStickerModel().stickers) {
                if (stickerItemModel != null && stickerItemModel.isTextSticker()) {
                    SimpleTextStickerData simpleTextStickerData = (SimpleTextStickerData) GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), stickerItemModel.extra, SimpleTextStickerData.class);
                    Boolean boolValueOf2 = Boolean.TRUE;
                    if (simpleTextStickerData != null) {
                        if (simpleTextStickerData.getTtsExtraMap().containsKey("is_tts_reuse_mdp")) {
                            boolValueOf2 = Boolean.valueOf(!simpleTextStickerData.getTtsExtraMap().get("is_tts_reuse_mdp").equals("1"));
                        }
                        if (simpleTextStickerData.getHasReadTextAudio() && boolValueOf2.booleanValue() && !TextUtils.isEmpty(simpleTextStickerData.getVoiceEffectId())) {
                            arrayList.add(simpleTextStickerData.getVoiceEffectId());
                        }
                    }
                }
            }
        }
        String strLIZIZ2 = "";
        for (int i = 0; i < arrayList.size(); i++) {
            if (i == 0) {
                strLIZIZ2 = (String) ListProtector.get(arrayList, i);
                if (z) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("\"");
                    sbLIZ.append(strLIZIZ2);
                    sbLIZ.append("\"");
                    strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                }
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ2);
                sbLIZ2.append(",");
                if (z) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("\"");
                    sbLIZ3.append((String) ListProtector.get(arrayList, i));
                    sbLIZ3.append("\"");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                } else {
                    strLIZIZ = (String) ListProtector.get(arrayList, i);
                }
                sbLIZ2.append(strLIZIZ);
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        return strLIZIZ2;
    }

    public boolean hasOriginalAudio(boolean z) {
        if ((!hasOriginalSound(z) && (getCanvasVideoData() == null || !C1444940nhk.LJIILLIIL(getCanvasVideoData()))) || isMuted()) {
            return false;
        }
        if (isStitchMode()) {
            if (getStitchParams() != null) {
                return getStitchParams().getEnableMic();
            }
            return true;
        }
        if (isStickPointMode() || getEditMusicSyncMode()) {
            return false;
        }
        return true;
    }

    public boolean hasOriginalSound(boolean z) {
        AutoCutModel autoCutModel = this.creativeModel.autoCutModel;
        if (autoCutModel.fromAutoCutInAlbum) {
            for (AutoCutMediaModel autoCutMediaModel : autoCutModel.mediaList) {
                if (C294050Bfn.LIZ()) {
                    String str = autoCutMediaModel.filePath;
                    if (TextUtils.isEmpty(str)) {
                        continue;
                    } else {
                        Iterator<Integer> it2 = getAudioFileInfoForAllTracks(str).iterator();
                        while (it2.hasNext()) {
                            if (it2.next().intValue() > 0) {
                                return true;
                            }
                        }
                    }
                } else if (autoCutMediaModel.isVideoType) {
                    return true;
                }
            }
        }
        if (getAILivePhotoModel().LJII() && C290630BaH.LIZ()) {
            return realHasOriginalSound();
        }
        if (z) {
            if (realHasOriginalSound() || isFastImport() || isCutSameVideoType() || isCurrentAutoCutMode()) {
                return true;
            }
            return false;
        }
        if (C294050Bfn.LIZ()) {
            if (realHasOriginalSound() || isFastImport()) {
                return true;
            }
            return false;
        }
        if (realHasOriginalSound() || isFastImport() || (isCutSameVideoType() && !isCurrentAutoCutMode())) {
            return true;
        }
        return false;
    }

    public void removeAudioEffectChallengeFromTitleAndStruct(AVChallenge aVChallenge) {
        removeTitleAndChallenge(aVChallenge);
    }

    public void removeChallengeFromTitleAndStruct(Collection<AVChallenge> collection) {
        Iterator<AVChallenge> it2 = collection.iterator();
        while (it2.hasNext()) {
            removeTitleAndChallenge(it2.next());
        }
    }

    public void removeTitleAndChallenge(AVChallenge aVChallenge) {
        if (aVChallenge == null) {
            return;
        }
        if (!TextUtils.isEmpty(getTitle())) {
            String title = getTitle();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("#");
            sbLIZ.append(aVChallenge.challengeName);
            sbLIZ.append(" ");
            setTitle(title.replace(C2188811AlT.LIZIZ(sbLIZ), ""));
        }
        if (getStructList() != null && !getStructList().isEmpty() && getStructList() != null) {
            for (AVTextExtraStruct aVTextExtraStruct : getStructList()) {
                if (aVChallenge.challengeName.equals(aVTextExtraStruct.hashTagName)) {
                    getStructList().remove(aVTextExtraStruct);
                    return;
                }
            }
        }
    }

    public void setBestMatchMusic(boolean z) {
        this.creativeModel.musicBuzModel.isBestMatch = z;
    }

    public void setDraftMusicIllegal(boolean z) {
        this.creativeModel.musicBuzModel.isDraftMusicIllegal = z;
    }

    public void setEditorProModel(EditorProModel editorProModel) {
        getCreativeFlowData().setEditorProModel(editorProModel);
    }

    public void setEffectList(ArrayList<EffectPointModel> arrayList) {
        this.creativeModel.editEffectModel.effectList = arrayList;
    }

    public void setIsReuseOriginalSound(boolean z) {
        this.creativeModel.musicBuzModel.isReuseOriginalSound = z;
    }

    public void setIsSoundLoop(Boolean bool) {
        this.creativeModel.musicBuzModel.isSoundLoop = bool;
    }

    public void setLivePhotoPreviewMode(LivePhotoPreviewMode livePhotoPreviewMode) {
        LivePhotoModel livePhotoModel;
        if (livePhotoPreviewMode == null || (livePhotoModel = this.creativeModel.livePhotoModel) == null) {
            return;
        }
        livePhotoModel.previewMode = livePhotoPreviewMode;
    }

    public void setMCurMusicLength(int i) {
        this.creativeModel.musicBuzModel.mCurMusicLength = i;
    }

    public void setMMusicEnd(int i) {
        this.creativeModel.musicBuzModel.musicEnd = i;
    }

    public void setMMusicPath(String str) {
        this.creativeModel.musicBuzModel.musicPath = str;
    }

    public void setMMusicStart(int i) {
        this.creativeModel.musicBuzModel.musicStart = i;
    }

    public void setMMusicType(int i) {
        this.creativeModel.musicBuzModel.mMusicType = i;
    }

    public void setMusicOrigin(String str) {
        this.creativeModel.musicBuzModel.musicOrigin = str;
    }

    public void setNLECanvas(boolean z) {
        getCreativeFlowData().getNleEditModel().setNLECanvas(z);
    }

    public void setPreviewInfo(EditPreviewInfo editPreviewInfo) {
        setEditPreviewInfo(editPreviewInfo);
    }

    public void setReplaceMusicId(String str) {
        this.creativeModel.musicBuzModel.replaceMusicId = str;
    }

    public void setReuseOriginalSoundId(String str) {
        this.creativeModel.musicBuzModel.reuseOriginalSoundId = str;
    }

    public void setReuseOriginalSoundLength(int i) {
        this.creativeModel.musicBuzModel.reuseOriginalSoundLength = i;
    }

    public void setReuseOriginalSoundUrls(UrlModel urlModel) {
        this.creativeModel.musicBuzModel.reuseOriginalSoundUrls = urlModel;
    }

    public void setStickerPhotoList(List<String> list) {
        this.creativeModel.recordEffectModel.stickerPhotoList = list;
    }

    public void setTimeEffect(EffectPointModel effectPointModel) {
        this.creativeModel.editEffectModel.timeEffect = effectPointModel;
    }

    public void setUseMusicBeforeEdit(boolean z) {
        this.creativeModel.musicBuzModel.isUseMusicBeforeEdit = z;
    }

    public void setUsePreviewSizeInCanvasModeEnable(boolean z) {
        getCreativeFlowData().getNleEditModel().setUsePreviewSizeInCanvasMode(z);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext
    public void setVideoLength(int i) {
        if (getPreviewInfo() == null) {
            return;
        }
        getPreviewInfo().setPreviewVideoLength(i);
    }

    public String uniqueVideoSessionDir(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        String contactVideoPathAsKey = getContactVideoPathAsKey();
        contactVideoPathAsKey.toString();
        if (isFastImport()) {
            if (TextUtils.isEmpty(getCreativeInfo().getCreationId())) {
                setCreativeInfo(new CreativeInfo());
            }
            contactVideoPathAsKey = getCreativeInfo().getCreationId();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[getUniqueName]: creation id = ");
        sbLIZ2.append(getCreationId());
        sbLIZ2.append("   uniqueName = ");
        sbLIZ2.append(contactVideoPathAsKey);
        C0LSN.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        sbLIZ.append(C08HM.LIZJ(contactVideoPathAsKey));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModelKt, X.InterfaceC1438500nXM
    public int videoFps(boolean z) {
        return (int) videoFpsFloat(z);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModelKt, X.InterfaceC1438500nXM
    public float videoFpsFloat(boolean z) {
        if (getPreviewInfo() != null && !C1428470nHB.LJJLIIJ(this)) {
            return C571500MbE.LJIIJJI(getPreviewInfo(), z);
        }
        return 0.0f;
    }

    public void generateVideoCoverPath(boolean z, int i) {
        if (TextUtils.isEmpty(getVideoCoverPath()) || !new C0VSJ(getVideoCoverPath()).exists() || (z && C493401w4.LIZ())) {
            String strLJJJJLL = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJJJLL(getCreativeInfo());
            if (C493401w4.LIZ()) {
                strLJJJJLL = C0CHQ.LIZ().LJIILLIIL().LJIIIZ(this, i);
            }
            setVideoCoverPath(strLJJJJLL);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getEditEffectSelectionStr(boolean r7, boolean r8) {
        /*
            r6 = this;
            java.util.ArrayList r4 = r6.getEffectList()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r1 = 0
            r3 = 0
        Lb:
            int r0 = r4.size()
            r5 = 1
            if (r3 >= r0) goto L7b
            if (r7 == 0) goto L20
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r3)
            com.ss.android.ugc.aweme.effect.EffectPointModel r0 = (com.ss.android.ugc.aweme.effect.EffectPointModel) r0
            boolean r0 = X.C1403700mdE.LIZLLL(r0)
            if (r0 != 0) goto L32
        L20:
            if (r8 == 0) goto L35
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r3)
            com.ss.android.ugc.aweme.effect.EffectPointModel r0 = (com.ss.android.ugc.aweme.effect.EffectPointModel) r0
            java.lang.Boolean r0 = r0.getIsFromEditPro()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L35
        L32:
            int r3 = r3 + 1
            goto Lb
        L35:
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r3)
            com.ss.android.ugc.aweme.effect.EffectPointModel r0 = (com.ss.android.ugc.aweme.effect.EffectPointModel) r0
            java.lang.String r5 = r0.getSelectFrom()
            if (r5 == 0) goto L32
            int r0 = r5.hashCode()
            switch(r0) {
                case -1644829690: goto L51;
                case -1291694609: goto L5f;
                case 569505391: goto L6d;
                default: goto L48;
            }
        L48:
            r2.append(r5)
            java.lang.String r0 = ","
            r2.append(r0)
            goto L32
        L51:
            java.lang.String r0 = "effect_panel_in_video_anim"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L48
            java.lang.String r0 = "effect_panel_animation_in,"
            r2.append(r0)
            goto L32
        L5f:
            java.lang.String r0 = "effect_panel_combo_video_anim"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L48
            java.lang.String r0 = "effect_panel_animation_combo,"
            r2.append(r0)
            goto L32
        L6d:
            java.lang.String r0 = "effect_panel_out_video_anim"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L48
            java.lang.String r0 = "effect_panel_animation_out,"
            r2.append(r0)
            goto L32
        L7b:
            int r0 = r2.length()
            if (r0 <= 0) goto L8b
            int r0 = r2.length()
            int r0 = r0 - r5
            java.lang.String r0 = r2.substring(r1, r0)
            return r0
        L8b:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel.getEditEffectSelectionStr(boolean, boolean):java.lang.String");
    }

    public void setEffectSource(boolean z, int i) {
        EditEffectModel editEffectModel = this.creativeModel.editEffectModel;
        editEffectModel.effectSource = i;
        editEffectModel.hasMultiTrackEffect = z;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(getTitle());
        parcel.writeString(getChain());
        parcel.writeByte(getDisableDeleteChain() ? (byte) 1 : (byte) 0);
        parcel.writeTypedList(getStructList());
        parcel.writeSerializable(getSubtitleMusicChangeChecker());
        parcel.writeString(getCameraIds());
        parcel.writeString(getVideoSegmentsDesc());
        parcel.writeInt(getOrigin());
        parcel.writeInt(getHardEncode());
        parcel.writeInt(getRestoreType());
        parcel.writeInt(getCameraPosition());
        parcel.writeString(getShareId());
        parcel.writeString(getClientId());
        parcel.writeParcelable(getVeCherEffectParam(), i);
        parcel.writeByte(getSoundSyncFromAnchor() ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(getVeAudioRecorderParam(), i);
        parcel.writeParcelable(getAudioEnhanceParam(), i);
        parcel.writeString(getOpenPlatformExtra());
        parcel.writeString(getOpenPlatformClientKey());
        parcel.writeString(getFromItemId());
    }
}
