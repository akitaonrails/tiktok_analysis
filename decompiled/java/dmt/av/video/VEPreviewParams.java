package dmt.av.video;

import X.C2188811AlT;
import X.C580950MqT;
import X.InterfaceC574340Mfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.creativex.editor.preview.IAudioEffectParam;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.CutSameMediaItem;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.effect.MultiSegmentPropExtra;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.vesdk.VECherEffectParam;
import com.ss.android.vesdk.VEEditorModel;
import com.ss.android.vesdk.VETimelineParams;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public class VEPreviewParams implements InterfaceC574340Mfo, Parcelable, Serializable {
    public static final Parcelable.Creator<VEPreviewParams> CREATOR = new C580950MqT(9);
    public CanvasVideoData canvasVideoPreviewData;
    public boolean enableMusicSync;
    public ImageAlbumData imageAlbumModel;
    public boolean interceptAutoPlay;
    public boolean isCutSameType;
    public boolean isFastImport;
    public boolean isFormRecord;
    public boolean isFromCut;
    public boolean isMusicSyncMode;
    public boolean isStoryEditMode;
    public boolean isVideoImageMixFastImport;
    public boolean loadImageOptimizeByVEUserConfig;
    public boolean loadMixImageOptimizeByUserConfig;
    public String[] mAudioPaths;
    public int mCanvasHeight;
    public int mCanvasWidth;
    public double mDbRange;
    public VEEditorModel mEditorModel;
    public boolean mEnableAutoStart;
    public int mFps;
    public boolean mIsFromDraft;
    public boolean mIsReuseSurfaceView;
    public int mMusicInPoint;
    public int mMusicOutPoint;
    public String mMusicPath;
    public float mMusicVolume;
    public int mPageMode;
    public int mPageType;
    public int mPreviewHeight;
    public int mPreviewMaxFPS;
    public int mPreviewWidth;
    public int[] mRotateArray;
    public float[] mSpeedArray;
    public VETimelineParams mTimelineParams;
    public boolean mUseCanvasStyle;
    public boolean mUseVEPublic;
    public int[] mVTrimIn;
    public int[] mVTrimOut;
    public AudioEffectParam mVeAudioEffectParam;
    public AudioRecorderParam mVeAudioRecordParam;
    public String[] mVideoPaths;
    public float mVolume;
    public String mWorkspace;
    public MvCreateVideoData mvCreateVideoData;
    public boolean needVEUserConfig;
    public String nleData;
    public long nleModelCachedId;
    public MultiEditVideoStatusRecordData recordData;
    public int sceneIn;
    public int sceneOut;
    public ArrayList<CutSameMediaItem> selectedTemplateMediaItemList;
    public String selectedTemplateStr;
    public SingleImageCoverBitmapData singleImageCoverBitmapData;
    public StitchParams stitchParams;
    public Integer storyCanvasBgColorEnd;
    public Integer storyCanvasBgColorStart;
    public boolean useAudioInVideo;
    public VECherEffectParam veCherEffectParam;
    public int videoEditorType;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.InterfaceC574340Mfo
    public long getEditorHandler() {
        return -1L;
    }

    public MultiSegmentPropExtra getMultiSegmentPropInfo() {
        return null;
    }

    @Override // X.InterfaceC574340Mfo
    public boolean getNeedTemplateExtra() {
        return true;
    }

    public String getRecordStickers() {
        return null;
    }

    @Override // X.InterfaceC574340Mfo
    public boolean isCanvasVEEditorType() {
        return false;
    }

    public void setEditorHandler(long j) {
    }

    public void setMultiSegmentPropInfo(MultiSegmentPropExtra multiSegmentPropExtra) {
    }

    public void setRecordStickers(String str) {
    }

    @Override // X.InterfaceC574340Mfo
    public Boolean getUseAudioInVideo() {
        return Boolean.valueOf(this.useAudioInVideo);
    }

    public VEPreviewParams() {
        this.mFps = -1;
        this.mPreviewMaxFPS = -1;
        this.useAudioInVideo = true;
        this.mEnableAutoStart = true;
        this.mVolume = 1.0f;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VEPreviewParams{mVideoPaths=");
        sbLIZ.append(Arrays.toString(this.mVideoPaths));
        sbLIZ.append(", mAudioPaths=");
        sbLIZ.append(Arrays.toString(this.mAudioPaths));
        sbLIZ.append(", mWorkspace='");
        sbLIZ.append(this.mWorkspace);
        sbLIZ.append('\'');
        sbLIZ.append(", mVolume=");
        sbLIZ.append(this.mVolume);
        sbLIZ.append(", mFps=");
        sbLIZ.append(this.mFps);
        sbLIZ.append(", mVTrimIn=");
        sbLIZ.append(this.mVTrimIn);
        sbLIZ.append(", mVTrimOut=");
        sbLIZ.append(this.mVTrimOut);
        sbLIZ.append(", sceneIn=");
        sbLIZ.append(this.sceneIn);
        sbLIZ.append(", sceneOut=");
        sbLIZ.append(this.sceneOut);
        sbLIZ.append(", canvasWidth=");
        sbLIZ.append(this.mCanvasWidth);
        sbLIZ.append(", canvasHeight=");
        sbLIZ.append(this.mCanvasHeight);
        sbLIZ.append(", pageMode=");
        sbLIZ.append(this.mPageMode);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC574340Mfo
    public String[] getAudioPaths() {
        return this.mAudioPaths;
    }

    @Override // X.InterfaceC574340Mfo
    public int getCanvasHeight() {
        return this.mCanvasHeight;
    }

    @Override // X.InterfaceC574340Mfo
    public int getCanvasWidth() {
        return this.mCanvasWidth;
    }

    @Override // X.InterfaceC574340Mfo
    public double getDbRange() {
        return this.mDbRange;
    }

    public VEEditorModel getEditorModel() {
        return this.mEditorModel;
    }

    @Override // X.InterfaceC574340Mfo
    public boolean getEnableAutoStart() {
        return this.mEnableAutoStart;
    }

    public boolean getEnableMusicSync() {
        return this.enableMusicSync;
    }

    @Override // X.InterfaceC574340Mfo
    public int getFps() {
        return this.mFps;
    }

    @Override // X.InterfaceC574340Mfo
    public boolean getInterceptAutoPlay() {
        return this.interceptAutoPlay;
    }

    @Override // X.InterfaceC574340Mfo
    public boolean getLoadImageOptimizeByVEUserConfig() {
        return this.loadImageOptimizeByVEUserConfig;
    }

    @Override // X.InterfaceC574340Mfo
    public boolean getLoadMixImageOptimizeByVEUserConfig() {
        return this.loadMixImageOptimizeByUserConfig;
    }

    @Override // X.InterfaceC574340Mfo
    public int getMaxPreviewFps() {
        return this.mPreviewMaxFPS;
    }

    public float getMusicVolume() {
        return this.mMusicVolume;
    }

    @Override // X.InterfaceC574340Mfo
    public boolean getNeedVEUserConfig() {
        return this.needVEUserConfig;
    }

    @Override // X.InterfaceC574340Mfo
    public int getPageMode() {
        return this.mPageMode;
    }

    @Override // X.InterfaceC574340Mfo
    public int getPreviewHeight() {
        return this.mPreviewHeight;
    }

    @Override // X.InterfaceC574340Mfo
    public int getPreviewWidth() {
        return this.mPreviewWidth;
    }

    @Override // X.InterfaceC574340Mfo
    public int[] getRotateArray() {
        return this.mRotateArray;
    }

    @Override // X.InterfaceC574340Mfo
    public float[] getSpeedArray() {
        return this.mSpeedArray;
    }

    public VETimelineParams getTimelineParams() {
        return this.mTimelineParams;
    }

    public boolean getUseCanvasStyle() {
        return this.mUseCanvasStyle;
    }

    @Override // X.InterfaceC574340Mfo
    public boolean getUseVEPublic() {
        return this.mUseVEPublic;
    }

    @Override // X.InterfaceC574340Mfo
    public int[] getVTrimIn() {
        return this.mVTrimIn;
    }

    @Override // X.InterfaceC574340Mfo
    public int[] getVTrimOut() {
        return this.mVTrimOut;
    }

    @Override // X.InterfaceC574340Mfo
    public IAudioEffectParam getVeAudioEffectParam() {
        return this.mVeAudioEffectParam;
    }

    public AudioRecorderParam getVeAudioRecordParam() {
        return this.mVeAudioRecordParam;
    }

    @Override // X.InterfaceC574340Mfo
    public String[] getVideoPaths() {
        return this.mVideoPaths;
    }

    public float getVolume() {
        return this.mVolume;
    }

    @Override // X.InterfaceC574340Mfo
    public String getWorkspace() {
        return this.mWorkspace;
    }

    @Override // X.InterfaceC574340Mfo
    public boolean isReuseSurfaceView() {
        return this.mIsReuseSurfaceView;
    }

    public VEPreviewParams(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        this.mFps = -1;
        this.mPreviewMaxFPS = -1;
        this.useAudioInVideo = true;
        this.mEnableAutoStart = true;
        this.mVideoPaths = parcel.createStringArray();
        this.mAudioPaths = parcel.createStringArray();
        this.mWorkspace = parcel.readString();
        this.mVolume = parcel.readFloat();
        this.mMusicVolume = parcel.readFloat();
        this.mDbRange = parcel.readDouble();
        this.mFps = parcel.readInt();
        this.mVTrimIn = parcel.createIntArray();
        this.mVTrimOut = parcel.createIntArray();
        this.sceneIn = parcel.readInt();
        this.sceneOut = parcel.readInt();
        this.videoEditorType = parcel.readInt();
        this.imageAlbumModel = (ImageAlbumData) parcel.readSerializable();
        this.mvCreateVideoData = (MvCreateVideoData) parcel.readSerializable();
        this.mSpeedArray = parcel.createFloatArray();
        this.mRotateArray = parcel.createIntArray();
        this.veCherEffectParam = (VECherEffectParam) parcel.readParcelable(VECherEffectParam.class.getClassLoader());
        this.mCanvasWidth = parcel.readInt();
        this.mCanvasHeight = parcel.readInt();
        this.mMusicPath = parcel.readString();
        this.mMusicInPoint = parcel.readInt();
        this.mMusicOutPoint = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.useAudioInVideo = z;
        this.mPageType = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mIsFromDraft = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.isCutSameType = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.needVEUserConfig = z4;
        this.mVeAudioRecordParam = (AudioRecorderParam) parcel.readParcelable(AudioRecorderParam.class.getClassLoader());
        this.recordData = (MultiEditVideoStatusRecordData) parcel.readParcelable(MultiEditVideoStatusRecordData.class.getClassLoader());
        this.mPreviewWidth = parcel.readInt();
        this.mPreviewHeight = parcel.readInt();
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.isFastImport = z5;
        this.stitchParams = (StitchParams) parcel.readParcelable(StitchParams.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.isStoryEditMode = z6;
        this.canvasVideoPreviewData = (CanvasVideoData) parcel.readSerializable();
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.enableMusicSync = z7;
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.isMusicSyncMode = z8;
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.isVideoImageMixFastImport = z9;
        this.mPageMode = parcel.readInt();
        this.mUseCanvasStyle = parcel.readByte() != 0;
        this.mPreviewMaxFPS = parcel.readInt();
        this.storyCanvasBgColorStart = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.storyCanvasBgColorEnd = (Integer) parcel.readValue(Integer.class.getClassLoader());
    }

    public void setCanvasHeight(int i) {
        this.mCanvasHeight = i;
    }

    public void setCanvasWidth(int i) {
        this.mCanvasWidth = i;
    }

    public void setEditorModel(VEEditorModel vEEditorModel) {
        this.mEditorModel = vEEditorModel;
    }

    public void setEnableAutoStart(boolean z) {
        this.mEnableAutoStart = z;
    }

    public void setEnableMusicSync(boolean z) {
        this.enableMusicSync = z;
    }

    public void setInterceptAutoPlay(boolean z) {
        this.interceptAutoPlay = z;
    }

    @Override // X.InterfaceC574340Mfo
    public void setLoadImageOptimizeByVEUserConfig(boolean z) {
        this.loadImageOptimizeByVEUserConfig = z;
    }

    @Override // X.InterfaceC574340Mfo
    public void setLoadMixImageOptimizeByVEUserConfig(boolean z) {
        this.loadMixImageOptimizeByUserConfig = z;
    }

    public void setNeedVEUserConfig(boolean z) {
        this.needVEUserConfig = z;
    }

    public void setReuseSurfaceView(boolean z) {
        this.mIsReuseSurfaceView = z;
    }

    public void setTimelineParams(VETimelineParams vETimelineParams) {
        this.mTimelineParams = vETimelineParams;
    }

    public void setUseVEPublic(boolean z) {
        this.mUseVEPublic = z;
    }

    public void setVeAudioEffectParam(IAudioEffectParam iAudioEffectParam) {
        this.mVeAudioEffectParam = (AudioEffectParam) iAudioEffectParam;
    }

    public void setVeAudioRecordParam(AudioRecorderParam audioRecorderParam) {
        this.mVeAudioRecordParam = audioRecorderParam;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringArray(this.mVideoPaths);
        parcel.writeStringArray(this.mAudioPaths);
        parcel.writeString(this.mWorkspace);
        parcel.writeFloat(this.mVolume);
        parcel.writeFloat(this.mMusicVolume);
        parcel.writeDouble(this.mDbRange);
        parcel.writeInt(this.mFps);
        parcel.writeIntArray(this.mVTrimIn);
        parcel.writeIntArray(this.mVTrimOut);
        parcel.writeInt(this.sceneIn);
        parcel.writeInt(this.sceneOut);
        parcel.writeInt(this.videoEditorType);
        parcel.writeSerializable(this.imageAlbumModel);
        parcel.writeSerializable(this.mvCreateVideoData);
        parcel.writeFloatArray(this.mSpeedArray);
        parcel.writeIntArray(this.mRotateArray);
        parcel.writeParcelable(this.veCherEffectParam, i);
        parcel.writeInt(this.mCanvasWidth);
        parcel.writeInt(this.mCanvasHeight);
        parcel.writeString(this.mMusicPath);
        parcel.writeInt(this.mMusicInPoint);
        parcel.writeInt(this.mMusicOutPoint);
        parcel.writeByte(this.useAudioInVideo ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mPageType);
        parcel.writeByte(this.mIsFromDraft ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.mVeAudioRecordParam, i);
        parcel.writeParcelable(this.recordData, i);
        parcel.writeInt(this.mPreviewWidth);
        parcel.writeInt(this.mPreviewHeight);
        parcel.writeByte(this.isFastImport ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isCutSameType ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.needVEUserConfig ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.stitchParams, i);
        parcel.writeByte(this.isStoryEditMode ? (byte) 1 : (byte) 0);
        parcel.writeSerializable(this.canvasVideoPreviewData);
        parcel.writeByte(this.enableMusicSync ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isMusicSyncMode ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isVideoImageMixFastImport ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mPageMode);
        parcel.writeByte(this.mUseCanvasStyle ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mPreviewMaxFPS);
        parcel.writeValue(this.storyCanvasBgColorStart);
        parcel.writeValue(this.storyCanvasBgColorEnd);
    }
}
