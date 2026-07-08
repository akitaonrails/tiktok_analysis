package com.ss.android.ugc.gamora.editorpro.framework.datastore;

import X.C0E1T;
import X.C0E3I;
import X.C0EBB;
import X.C0EGC;
import X.C19552511ed;
import X.C351720Dqc;
import X.C355510Dwj;
import X.C355570Dwp;
import X.C366860EZw;
import X.C386320FCs;
import X.C580130Mp9;
import X.InterfaceC356750Dyj;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.gamora.editorpro.aiediting.magic.logic.MagicFunctionItemController;
import com.ss.android.ugc.gamora.editorpro.capabilities.effects.filter.logic.EditFilterFuncItemController;
import com.ss.android.ugc.gamora.editorpro.capabilities.effects.filter.logic.MainFilterFuncItemController;
import com.ss.android.ugc.gamora.editorpro.capabilities.effects.videoanim.logic.EditVideoAnimFuncItemController;
import com.ss.android.ugc.gamora.editorpro.capabilities.effects.videoanim.logic.EffectAnimFuncItemController;
import com.ss.android.ugc.gamora.editorpro.capabilities.portrait.matting.MattingFuncItemController;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.smarttrim.EditSmartTrimFuncItemController;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.smarttrim.MainSmartTrimFuncItemController;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class EditModelProvider extends ViewModel {
    public String _editorProAnchorType;
    public C0EGC _musicController;
    public C0EBB _soundEffectController;
    public C0E3I bgmSoundTrimModel;
    public MattingFuncItemController cutoutGuideController;
    public EditFilterFuncItemController editFilterFuncItemController;
    public EditSmartTrimFuncItemController editSmartTrimFuncItemController;
    public EditVideoAnimFuncItemController editVideoAnimFuncItemController;
    public EffectAnimFuncItemController effectAnimFuncItemController;
    public C355510Dwj filterController;
    public MagicFunctionItemController magicItemController;
    public InterfaceC356750Dyj magicProcessorManager;
    public MainFilterFuncItemController mainFilterFuncItemController;
    public MainSmartTrimFuncItemController mainSmartTrimFuncItemController;
    public C366860EZw transitionGuideController;
    public C351720Dqc videoAnimController;
    public C355570Dwp videoGlobalEffectController;
    public static final C0E1T Companion = new C0E1T();
    public static final int $stable = 8;
    public C386320FCs editorProFileCenter = new C386320FCs();
    public C19552511ed soundEffectDataManager = new C19552511ed();
    public final MutableLiveData<VideoPublishEditModel> _editModelLiveData = new MutableLiveData<>();

    public final VideoPublishEditModel getEditModel() {
        return this._editModelLiveData.getValue();
    }

    private final Integer getEditPageType() {
        EditPreviewInfo previewInfo;
        List<EditVideoSegment> videoList;
        EditPreviewInfo previewInfo2;
        List<EditVideoSegment> videoList2;
        EditPreviewInfo previewInfo3;
        List<EditVideoSegment> videoList3;
        EditPreviewInfo previewInfo4;
        List<EditVideoSegment> videoList4;
        VideoPublishEditModel editModel = getEditModel();
        if (editModel == null) {
            return null;
        }
        if (editModel.isRetakeVideo()) {
            return 1;
        }
        if (editModel.getOriginal() == 1 && (previewInfo4 = editModel.getPreviewInfo()) != null && (videoList4 = previewInfo4.getVideoList()) != null && videoList4.size() == 1) {
            return 0;
        }
        if (editModel.getOriginal() == 1 && (previewInfo3 = editModel.getPreviewInfo()) != null && (videoList3 = previewInfo3.getVideoList()) != null && videoList3.size() > 1) {
            return 1;
        }
        if (editModel.getOriginal() != 0 || (previewInfo2 = editModel.getPreviewInfo()) == null || (videoList2 = previewInfo2.getVideoList()) == null || videoList2.size() != 1) {
            return (editModel.getOriginal() != 0 || (previewInfo = editModel.getPreviewInfo()) == null || (videoList = previewInfo.getVideoList()) == null || videoList.size() <= 1) ? 2 : 3;
        }
        return 2;
    }

    private final List<MultiEditVideoSegmentRecordData> getSegmentDataList() {
        MultiEditVideoStatusRecordData multiEditVideoRecordData;
        MultiEditVideoRecordData multiEditVideoRecordData2;
        VideoPublishEditModel editModel = getEditModel();
        if (editModel == null || (multiEditVideoRecordData = editModel.getMultiEditVideoRecordData()) == null || (multiEditVideoRecordData2 = multiEditVideoRecordData.curMultiEditVideoRecordData) == null) {
            return null;
        }
        return multiEditVideoRecordData2.segmentDataList;
    }

    public final ArrayList<String> getSelectedVideoPaths() {
        List<MultiEditVideoSegmentRecordData> segmentDataList = getSegmentDataList();
        if (segmentDataList == null) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        if (C580130Mp9.LIZ(segmentDataList)) {
            return arrayList;
        }
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : segmentDataList) {
            if (multiEditVideoSegmentRecordData.enable) {
                arrayList.add(multiEditVideoSegmentRecordData.videoPath);
            }
        }
        return arrayList;
    }

    public final long getTotalDuration() {
        List<MultiEditVideoSegmentRecordData> segmentDataList = getSegmentDataList();
        if (segmentDataList == null) {
            segmentDataList = new ArrayList<>();
        }
        long j = 0;
        if (C580130Mp9.LIZ(segmentDataList)) {
            return 0L;
        }
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : segmentDataList) {
            if (multiEditVideoSegmentRecordData.enable) {
                j += multiEditVideoSegmentRecordData.videoLength / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            }
        }
        return j;
    }

    public final boolean isMultiRecord() {
        ArrayList<TimeSpeedModelExtension> arrayList;
        VideoPublishEditModel editModel = getEditModel();
        if (editModel == null) {
            return false;
        }
        boolean z = editModel.getOrigin() != 0;
        MultiEditVideoStatusRecordData multiEditVideoRecordData = editModel.getMultiEditVideoRecordData();
        return z && (multiEditVideoRecordData != null && (arrayList = multiEditVideoRecordData.originalSegments) != null && arrayList.size() > 1);
    }

    public final boolean isMultiUpload() {
        Integer editPageType = getEditPageType();
        return editPageType != null && editPageType.intValue() == 3;
    }

    public final C0E3I getBgmSoundTrimModel$tools_camera_edit_release() {
        return this.bgmSoundTrimModel;
    }

    public final MattingFuncItemController getCutoutGuideController() {
        return this.cutoutGuideController;
    }

    public final EditFilterFuncItemController getEditFilterFuncItemController$tools_camera_edit_release() {
        return this.editFilterFuncItemController;
    }

    public final EditSmartTrimFuncItemController getEditSmartTrimFuncItemController$tools_camera_edit_release() {
        return this.editSmartTrimFuncItemController;
    }

    public final EditVideoAnimFuncItemController getEditVideoAnimFuncItemController$tools_camera_edit_release() {
        return this.editVideoAnimFuncItemController;
    }

    public final C386320FCs getEditorProFileCenter() {
        return this.editorProFileCenter;
    }

    public final EffectAnimFuncItemController getEffectAnimFuncItemController$tools_camera_edit_release() {
        return this.effectAnimFuncItemController;
    }

    public final C355510Dwj getFilterController$tools_camera_edit_release() {
        return this.filterController;
    }

    public final MagicFunctionItemController getMagicItemController$tools_camera_edit_release() {
        return this.magicItemController;
    }

    public final InterfaceC356750Dyj getMagicProcessorManager$tools_camera_edit_release() {
        return this.magicProcessorManager;
    }

    public final MainFilterFuncItemController getMainFilterFuncItemController$tools_camera_edit_release() {
        return this.mainFilterFuncItemController;
    }

    public final MainSmartTrimFuncItemController getMainSmartTrimFuncItemController$tools_camera_edit_release() {
        return this.mainSmartTrimFuncItemController;
    }

    public final C0EGC getMusicController() {
        return this._musicController;
    }

    public final C0EBB getSoundEffectController() {
        return this._soundEffectController;
    }

    public final C19552511ed getSoundEffectDataManager() {
        return this.soundEffectDataManager;
    }

    public final C366860EZw getTransitionGuideController$tools_camera_edit_release() {
        return this.transitionGuideController;
    }

    public final C351720Dqc getVideoAnimController$tools_camera_edit_release() {
        return this.videoAnimController;
    }

    public final C355570Dwp getVideoGlobalEffectController$tools_camera_edit_release() {
        return this.videoGlobalEffectController;
    }

    public final void postEditModel(VideoPublishEditModel videoPublishEditModel) {
        this._editModelLiveData.postValue(videoPublishEditModel);
    }

    public final void setBgmSoundTrimModel$tools_camera_edit_release(C0E3I c0e3i) {
        this.bgmSoundTrimModel = c0e3i;
    }

    public final void setCutoutGuideController(MattingFuncItemController mattingFuncItemController) {
        this.cutoutGuideController = mattingFuncItemController;
    }

    public final void setEditFilterFuncItemController$tools_camera_edit_release(EditFilterFuncItemController editFilterFuncItemController) {
        this.editFilterFuncItemController = editFilterFuncItemController;
    }

    public final void setEditModel(VideoPublishEditModel videoPublishEditModel) {
        this._editModelLiveData.setValue(videoPublishEditModel);
    }

    public final void setEditSmartTrimFuncItemController$tools_camera_edit_release(EditSmartTrimFuncItemController editSmartTrimFuncItemController) {
        this.editSmartTrimFuncItemController = editSmartTrimFuncItemController;
    }

    public final void setEditVideoAnimFuncItemController$tools_camera_edit_release(EditVideoAnimFuncItemController editVideoAnimFuncItemController) {
        this.editVideoAnimFuncItemController = editVideoAnimFuncItemController;
    }

    public final void setEffectAnimFuncItemController$tools_camera_edit_release(EffectAnimFuncItemController effectAnimFuncItemController) {
        this.effectAnimFuncItemController = effectAnimFuncItemController;
    }

    public final void setFilterController$tools_camera_edit_release(C355510Dwj c355510Dwj) {
        this.filterController = c355510Dwj;
    }

    public final void setMagicItemController$tools_camera_edit_release(MagicFunctionItemController magicFunctionItemController) {
        this.magicItemController = magicFunctionItemController;
    }

    public final void setMagicProcessorManager$tools_camera_edit_release(InterfaceC356750Dyj interfaceC356750Dyj) {
        this.magicProcessorManager = interfaceC356750Dyj;
    }

    public final void setMainFilterFuncItemController$tools_camera_edit_release(MainFilterFuncItemController mainFilterFuncItemController) {
        this.mainFilterFuncItemController = mainFilterFuncItemController;
    }

    public final void setMainSmartTrimFuncItemController$tools_camera_edit_release(MainSmartTrimFuncItemController mainSmartTrimFuncItemController) {
        this.mainSmartTrimFuncItemController = mainSmartTrimFuncItemController;
    }

    public final void setMusicController(C0EGC c0egc) {
        this._musicController = c0egc;
    }

    public final void setSoundEffectController(C0EBB c0ebb) {
        this._soundEffectController = c0ebb;
    }

    public final void setTransitionGuideController$tools_camera_edit_release(C366860EZw c366860EZw) {
        this.transitionGuideController = c366860EZw;
    }

    public final void setVideoAnimController$tools_camera_edit_release(C351720Dqc c351720Dqc) {
        this.videoAnimController = c351720Dqc;
    }

    public final void setVideoGlobalEffectController$tools_camera_edit_release(C355570Dwp c355570Dwp) {
        this.videoGlobalEffectController = c355570Dwp;
    }

    public final boolean updateNLEModel(String str) {
        VideoPublishEditModel editModel = getEditModel();
        if (editModel == null) {
            return false;
        }
        editModel.setNleData(str);
        return true;
    }
}
