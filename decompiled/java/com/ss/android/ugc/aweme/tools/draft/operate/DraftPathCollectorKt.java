package com.ss.android.ugc.aweme.tools.draft.operate;

import X.AnonymousClass0207;
import X.C0C64;
import X.C0CHQ;
import X.C0IKQ;
import X.C0M5Z;
import X.C0MVS;
import X.C0MY0;
import X.C0MY6;
import X.C0MZ9;
import X.C0MZY;
import X.C0VSJ;
import X.C13LP;
import X.C15438062q;
import X.C2188811AlT;
import X.C570490MZb;
import X.C580130Mp9;
import X.InterfaceC2270808v4;
import X.InterfaceC2270908v5;
import X.InterfaceC576180Mim;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.draft.model.AVDraftExtras;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftVEAudioEffectParam;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextBgConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.mvtheme.MvNetFileBean;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import com.ss.android.ugc.aweme.services.filter.IFilterService;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.SimpleTextStickerData;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.SavePhotoStickerInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS239S0000000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftPathCollectorKt {
    public static final C0M5Z LIZ(MultiEditVideoStatusRecordData multiEditVideoStatusRecordData) {
        C0M5Z c0m5z = new C0M5Z(AnonymousClass0207.get$arr$(49));
        MultiEditVideoRecordData multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData;
        if (multiEditVideoRecordData != null) {
            c0m5z.addAll(LIZIZ(multiEditVideoRecordData));
        }
        MultiEditVideoRecordData multiEditVideoRecordData2 = multiEditVideoStatusRecordData.originMultiEditRecordData;
        if (multiEditVideoRecordData2 != null) {
            c0m5z.addAll(LIZIZ(multiEditVideoRecordData2));
        }
        MultiEditVideoRecordData multiEditVideoRecordData3 = multiEditVideoStatusRecordData.singleRestoreMultiEditRecordData;
        if (multiEditVideoRecordData3 != null) {
            c0m5z.addAll(LIZIZ(multiEditVideoRecordData3));
        }
        MultiEditVideoRecordData multiEditVideoRecordData4 = multiEditVideoStatusRecordData.restoreMultiEditVideoRecordData;
        if (multiEditVideoRecordData4 != null) {
            c0m5z.addAll(LIZIZ(multiEditVideoRecordData4));
        }
        return c0m5z;
    }

    public static final Set<String> LIZIZ(MultiEditVideoRecordData multiEditVideoRecordData) {
        String strLIZJ;
        HashSet hashSet = new HashSet();
        List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData.segmentDataList;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
                String str = multiEditVideoSegmentRecordData.videoPath;
                if (str != null && str.length() != 0) {
                    arrayList.add(multiEditVideoSegmentRecordData);
                }
            }
            ArrayList<String> arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((MultiEditVideoSegmentRecordData) it2.next()).videoPath);
            }
            for (String str2 : arrayList2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                String parent = new C0VSJ(str2).getParent();
                if (parent != null) {
                    strLIZJ = C570490MZb.LIZJ(parent);
                } else {
                    strLIZJ = null;
                }
                sbLIZ.append(strLIZJ);
                sbLIZ.append("data.txt");
                hashSet.add(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return hashSet;
    }

    public static final C0M5Z LIZJ(AwemeDraft awemeDraft) {
        ArrayList<TimeSpeedModelExtension> arrayList;
        ArrayList<TimeSpeedModelExtension> arrayListLJIIIIZZ;
        List<String> capturedPhotoPaths;
        String stickerId;
        CoverPublishModel coverPublishModel;
        EffectTextModel effectTextModel;
        StickerItemModel textSticker;
        String str;
        List<InnerEffectTextConfig> textConfigs;
        String second;
        EffectTextModel effectTextModel2;
        StickerItemModel textSticker2;
        String str2;
        String str3;
        List<StickerItemModel> list;
        ArrayList<MvNetFileBean> arrayList2;
        String str4;
        String str5;
        ArrayList<String> arrayList3;
        String str6;
        IFilterService filterService;
        FilterBean filter;
        String filterFolder;
        IFilterService filterService2;
        FilterBean filter2;
        String filterFolder2;
        C0M5Z c0m5z = new C0M5Z(AnonymousClass0207.get$arr$(50));
        HashSet hashSet = new HashSet();
        hashSet.addAll(queryCreativePaths(awemeDraft));
        C0M5Z c0m5z2 = new C0M5Z(AnonymousClass0207.get$arr$(48));
        c0m5z2.addAll(LIZLLL(awemeDraft.LJJJJIZL, AVDraftExtras.class, InterfaceC2270908v5.class));
        c0m5z2.addAll(LIZLLL(awemeDraft.LIZ, CreativeModel.class, InterfaceC2270908v5.class));
        if (awemeDraft.LJIILIIL != 0 && (filterService2 = ((IFoundationAVService) ServiceManager.get().getService(IInternalAVService.class)).getFilterService()) != null && (filter2 = filterService2.getFilter(awemeDraft.LJIILIIL)) != null && (filterFolder2 = filter2.getFilterFolder()) != null) {
            c0m5z2.add(filterFolder2);
        }
        String str7 = awemeDraft.LJII;
        if (str7 != null && str7.length() > 0) {
            c0m5z2.add(str7);
        }
        c0m5z2.addAll(awemeDraft.LIZ.editorProDraftModel.nlePublicResPaths);
        hashSet.addAll(c0m5z2);
        C0M5Z c0m5z3 = new C0M5Z(AnonymousClass0207.get$arr$(47));
        c0m5z3.addAll(LIZLLL(awemeDraft.LJJJJIZL, AVDraftExtras.class, InterfaceC2270808v4.class));
        c0m5z3.addAll(LIZLLL(awemeDraft.LIZ, CreativeModel.class, InterfaceC2270808v4.class));
        hashSet.addAll(c0m5z3);
        c0m5z.addAll(hashSet);
        C0M5Z c0m5z4 = new C0M5Z(AnonymousClass0207.get$arr$(51));
        c0m5z4.add(C0MZY.LIZ(awemeDraft));
        String str8 = awemeDraft.LJJJJIZL.draftVideoPath;
        if (str8 != null) {
            c0m5z4.add(str8);
        }
        if (awemeDraft.LJIILIIL != 0 && (filterService = ((IFoundationAVService) ServiceManager.get().getService(IInternalAVService.class)).getFilterService()) != null && (filter = filterService.getFilter(awemeDraft.LJIILIIL)) != null && (filterFolder = filter.getFilterFolder()) != null) {
            c0m5z4.add(filterFolder);
        }
        String str9 = awemeDraft.LJJJJIZL.filterLocalPath;
        if (str9 != null) {
            c0m5z4.add(str9);
        }
        DraftVEAudioEffectParam draftVEAudioEffectParamLIZLLL = awemeDraft.LIZLLL();
        if (draftVEAudioEffectParamLIZLLL != null && (str6 = draftVEAudioEffectParamLIZLLL.effectPath) != null) {
            c0m5z4.add(str6);
        }
        String str10 = awemeDraft.LJII;
        if (str10 != null && str10.length() > 0) {
            c0m5z4.add(str10);
        }
        List<EffectPointModel> listLJ = awemeDraft.LJ();
        if (listLJ != null) {
            Iterator it2 = ((ArrayList) C13LP.LJJJJLI(listLJ)).iterator();
            while (it2.hasNext()) {
                String resDir = ((EffectPointModel) it2.next()).getResDir();
                if (resDir != null) {
                    c0m5z4.add(resDir);
                }
            }
        }
        String str11 = awemeDraft.LJJJJIZL.videoCoverPath;
        if (str11 != null) {
            c0m5z4.add(str11);
        }
        MvCreateVideoData mvCreateVideoData = awemeDraft.LJJJJIZL.mvCreateVideoData;
        if (mvCreateVideoData != null && (arrayList3 = mvCreateVideoData.selectMediaList) != null) {
            Iterator it3 = ((ArrayList) C13LP.LJJJJLI(arrayList3)).iterator();
            while (it3.hasNext()) {
                c0m5z4.add(it3.next());
            }
        }
        MvCreateVideoData mvCreateVideoData2 = awemeDraft.LJJJJIZL.mvCreateVideoData;
        if (mvCreateVideoData2 != null && (str5 = mvCreateVideoData2.videoCoverImgPath) != null) {
            c0m5z4.add(str5);
        }
        MvCreateVideoData mvCreateVideoData3 = awemeDraft.LJJJJIZL.mvCreateVideoData;
        if (mvCreateVideoData3 != null && (str4 = mvCreateVideoData3.mvResUnzipPath) != null && str4.length() != 0) {
            c0m5z4.add(new C0VSJ(mvCreateVideoData3.mvResUnzipPath).getAbsolutePath());
        }
        MvCreateVideoData mvCreateVideoData4 = awemeDraft.LJJJJIZL.mvCreateVideoData;
        if (mvCreateVideoData4 != null && (arrayList2 = mvCreateVideoData4.newMaskFileData) != null) {
            Iterator<MvNetFileBean> it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                c0m5z4.add(it4.next().getFilePath());
            }
        }
        c0m5z4.addAll(C0MZ9.LIZLLL(awemeDraft));
        InfoStickerModel infoStickerModelLJFF = awemeDraft.LJFF();
        if (infoStickerModelLJFF != null && (list = infoStickerModelLJFF.stickers) != null) {
            for (StickerItemModel stickerItemModel : list) {
                if (stickerItemModel != null) {
                    String str12 = stickerItemModel.path;
                    if (str12 != null && str12.length() > 0) {
                        c0m5z4.add(str12);
                    }
                    if (stickerItemModel.isTextSticker()) {
                        SimpleTextStickerData simpleTextStickerData = (SimpleTextStickerData) GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), stickerItemModel.extra, SimpleTextStickerData.class);
                        if (simpleTextStickerData.getHasReadTextAudio() && !TextUtils.isEmpty(simpleTextStickerData.getAudioTrackFilePath())) {
                            c0m5z4.add(simpleTextStickerData.getAudioTrackFilePath());
                        }
                    }
                }
            }
        }
        Iterator<TextStickerModel> it5 = awemeDraft.LIZ.stickerModel.textStickerModels.iterator();
        while (it5.hasNext()) {
            TTSModel ttsModel = it5.next().getTtsModel();
            if (ttsModel != null && ttsModel.hasReadTextAudio && (str3 = ttsModel.audioTrackFilePath) != null) {
                StringBuilder sb = new StringBuilder();
                int length = str3.length();
                for (int i = 0; i < length; i++) {
                    char cCharAt = str3.charAt(i);
                    if (!c0m5z4.isEmpty()) {
                        sb.append(cCharAt);
                    }
                }
                String string = sb.toString();
                if (string != null) {
                    c0m5z4.add(string);
                }
            }
        }
        CoverPublishModel coverPublishModel2 = awemeDraft.LJJJJIZL.coverPublishModel;
        if (coverPublishModel2 != null && (effectTextModel2 = coverPublishModel2.getEffectTextModel()) != null && (textSticker2 = effectTextModel2.getTextSticker()) != null && (str2 = textSticker2.path) != null && str2.length() > 0) {
            c0m5z4.add(str2);
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_fix_recover_publish_cover_effect", true, false) && (coverPublishModel = awemeDraft.LJJJJIZL.coverPublishModel) != null && (effectTextModel = coverPublishModel.getEffectTextModel()) != null && (textSticker = effectTextModel.getTextSticker()) != null && (str = textSticker.extra) != null) {
            try {
                InnerEffectTextLayoutConfig effectTextLayoutConfig = ((TextStickerData) C0CHQ.LIZ().getGson().LJII(str, TextStickerData.class)).getEffectTextLayoutConfig();
                if (effectTextLayoutConfig != null && (textConfigs = effectTextLayoutConfig.getTextConfigs()) != null) {
                    for (InnerEffectTextConfig innerEffectTextConfig : textConfigs) {
                        List<InnerEffectTextBgConfig> bgConfigs = innerEffectTextConfig.getBgConfigs();
                        ArrayList arrayList4 = new ArrayList();
                        for (InnerEffectTextBgConfig innerEffectTextBgConfig : bgConfigs) {
                            if (innerEffectTextBgConfig.getBgName().length() > 0) {
                                arrayList4.add(innerEffectTextBgConfig);
                            }
                        }
                        Iterator it6 = arrayList4.iterator();
                        while (it6.hasNext()) {
                            c0m5z4.add(((InnerEffectTextBgConfig) it6.next()).getBgName());
                        }
                        Pair<String, String> typefacePath = innerEffectTextConfig.getTypefacePath();
                        if (typefacePath != null && (second = typefacePath.getSecond()) != null && second.length() != 0) {
                            c0m5z4.add(second);
                        }
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = awemeDraft.LJJJJIZL.multiEditVideoData;
        if (multiEditVideoStatusRecordData != null) {
            arrayList = multiEditVideoStatusRecordData.editCutSegments;
        } else {
            arrayList = null;
        }
        if (C0IKQ.LIZIZ(arrayList)) {
            MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = awemeDraft.LJJJJIZL.multiEditVideoData;
            if (multiEditVideoStatusRecordData2 != null) {
                arrayListLJIIIIZZ = multiEditVideoStatusRecordData2.editCutSegments;
            }
            c0m5z.addAll(c0m5z4);
            return c0m5z;
        }
        arrayListLJIIIIZZ = CameraComponentModel.LJIIIIZZ(awemeDraft.LJII());
        if (arrayListLJIIIIZZ != null) {
            for (TimeSpeedModelExtension timeSpeedModelExtension : arrayListLJIIIIZZ) {
                SavePhotoStickerInfo savePhotoStickerInfo = timeSpeedModelExtension.getSavePhotoStickerInfo();
                if (savePhotoStickerInfo != null) {
                    capturedPhotoPaths = savePhotoStickerInfo.getCapturedPhotoPaths();
                } else {
                    capturedPhotoPaths = null;
                }
                if (!C580130Mp9.LIZ(capturedPhotoPaths) && (stickerId = timeSpeedModelExtension.getStickerId()) != null) {
                    String strLIZLLL = C0MVS.LIZLLL(stickerId);
                    if (!TextUtils.isEmpty(strLIZLLL)) {
                        c0m5z4.add(strLIZLLL);
                    }
                }
            }
        }
        c0m5z.addAll(c0m5z4);
        return c0m5z;
    }

    public static final Set<String> queryCreativePaths(AwemeDraft awemeDraft) {
        String str;
        List<StickerItemModel> list;
        C0M5Z c0m5z = new C0M5Z(AFwS239S0000000_8.get$arr$(160));
        c0m5z.addAll(LIZLLL(awemeDraft.LJJJJIZL, AVDraftExtras.class, C0MY0.class));
        c0m5z.addAll(LIZLLL(awemeDraft.LIZ, CreativeModel.class, C0MY0.class));
        InfoStickerModel infoStickerModelLJFF = awemeDraft.LJFF();
        if (infoStickerModelLJFF != null && (list = infoStickerModelLJFF.stickers) != null) {
            for (StickerItemModel stickerItemModel : list) {
                if (stickerItemModel != null && stickerItemModel.isTextSticker()) {
                    TextStickerData textStickerData = (TextStickerData) GsonProtectorUtils.fromJson(C0CHQ.LIZ().getGson(), stickerItemModel.extra, TextStickerData.class);
                    if (textStickerData.getHasReadTextAudio() && !TextUtils.isEmpty(textStickerData.getAudioTrackFilePath())) {
                        c0m5z.add(textStickerData.getAudioTrackFilePath());
                    }
                }
            }
        }
        Iterator<TextStickerModel> it2 = awemeDraft.LIZ.stickerModel.textStickerModels.iterator();
        while (it2.hasNext()) {
            TTSModel ttsModel = it2.next().getTtsModel();
            if (ttsModel != null && ttsModel.hasReadTextAudio && (str = ttsModel.audioTrackFilePath) != null) {
                c0m5z.add(str);
            }
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = awemeDraft.LJJJJIZL.multiEditVideoData;
        if (multiEditVideoStatusRecordData != null) {
            c0m5z.addAll(LIZ(multiEditVideoStatusRecordData));
        }
        c0m5z.addAll(awemeDraft.LIZ.editorProDraftModel.nleCreativeResPaths);
        return c0m5z;
    }

    public static final C0M5Z LIZLLL(Object obj, Class cls, Class cls2) throws Throwable {
        final C0M5Z c0m5z = new C0M5Z(AnonymousClass0207.get$arr$(46));
        try {
            C0MY6.LIZ(C0MY6.LIZ, cls, cls2, false, 12).LIZIZ(obj, new InterfaceC576180Mim<Object>() { // from class: X.0M8M
                @Override // X.InterfaceC576180Mim
                public final void LJ(Field field, Object obj2, Object obj3) {
                    c0m5z.add((String) field.get(obj2));
                }

                @Override // X.InterfaceC576180Mim
                public final void LIZ(Field field, String str, Annotation annotation, List list) {
                    c0m5z.add(str);
                }

                @Override // X.InterfaceC576180Mim
                public final void LIZIZ(Field field, Map<Object, String> map, Object obj2, Object obj3) {
                    c0m5z.add(map.get(obj2));
                }

                @Override // X.InterfaceC576180Mim
                public final void LIZJ(Field field, String[] strArr, int i, Object obj2) {
                    c0m5z.add(strArr[i]);
                }

                @Override // X.InterfaceC576180Mim
                public final void LIZLLL(Field field, List<String> list, int i, Object obj2) {
                    c0m5z.add((String) ListProtector.get(list, i));
                }
            });
            return c0m5z;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return c0m5z;
        }
    }
}
