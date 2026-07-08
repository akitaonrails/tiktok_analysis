package com.ss.android.ugc.aweme.shortvideo;

import X.C0C64;
import X.C1441190nbh;
import X.C2219091BtD;
import X.C2350709Iz;
import X.C2401009ay;
import X.InterfaceC383290F1b;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.GameDuetResource;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import com.ss.android.ugc.aweme.sticker.model.DiyPropVideo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class CameraComponentModel implements Parcelable {
    public static final Parcelable.Creator<CameraComponentModel> CREATOR = new Parcelable.Creator<CameraComponentModel>() { // from class: X.0ng8
        @Override // android.os.Parcelable.Creator
        public final CameraComponentModel createFromParcel(Parcel parcel) {
            return new CameraComponentModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CameraComponentModel[] newArray(int i) {
            return new CameraComponentModel[i];
        }
    };
    public String creationId;
    public int creativeVersion;
    public BackgroundVideo curBackgroundVideo;
    public DiyPropVideo curDiyPropVideo;
    public DuetContext duetContext;
    public boolean editorProRecordEnableMusic;
    public int editorProRecordMaxDuration;
    public boolean editorProRecordUsedForPip;
    public boolean enableAspectRatio;
    public boolean enableRecordingMp4;
    public boolean enterRecordWithSticker;
    public ExtractFramesModel extractFramesModel;
    public GameDuetResource gameDuetResource;
    public ArrayList<AIGCInfo> greenScreenSourceInfos;
    public boolean isEditorProRecordMode;
    public boolean isEditorTabAICreateRecordMode;
    public boolean isEnableCameraGraph;
    public boolean isFromEditorProNows;
    public boolean isLoopSwitchOnByAIGC;
    public boolean isLoopSwitchOnByGameEffect;
    public boolean isLoopSwitchOnByMusic;
    public boolean isMuted;
    public boolean isPlayingPreviewMusic;
    public boolean isRetakeMode;
    public float latestUsedZoomValue;
    public boolean mCurrentDurationMode;
    public boolean mDurationSwitchable;
    public C1441190nbh mDurings;
    public int mHardEncode;
    public long mMaxDuration;
    public String mMusicPath;
    public int mMusicStart;
    public final int mRestoreType;
    public long mRetakeDuration;
    public C1441190nbh mRetakeDurings;
    public long mRetakeTime;
    public long mTotalRecordingTime;
    public boolean mUseBeautyFace;
    public int mVideoHeight;
    public int mVideoWidth;
    public Workspace mWorkspace;
    public int maxMusicLoopDuration;
    public long minDuration;
    public int musicEndTime;
    public RecordContext recordContext;
    public int recordMode;
    public InterfaceC383290F1b retakeVideoContext;
    public ClientCherEffectParam veCherEffectParam;
    public Map<String, Object> videoRecordMetadata;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final C1441190nbh LIZ() {
        if (!this.isRetakeMode || C2401009ay.LIZ(this.mRetakeDurings)) {
            return this.mDurings;
        }
        C1441190nbh c1441190nbh = new C1441190nbh(this.mDurings);
        InterfaceC383290F1b interfaceC383290F1b = this.retakeVideoContext;
        if (interfaceC383290F1b != null) {
            if (((RetakeVideoContext) interfaceC383290F1b).isAddClips) {
                c1441190nbh.addAll(this.mRetakeDurings);
            } else if (((RetakeVideoContext) interfaceC383290F1b).retakeIndex < c1441190nbh.size()) {
                InterfaceC383290F1b interfaceC383290F1b2 = this.retakeVideoContext;
                if (((RetakeVideoContext) interfaceC383290F1b2).retakeIndex >= 0) {
                    c1441190nbh.remove(((RetakeVideoContext) interfaceC383290F1b2).retakeIndex);
                    c1441190nbh.addAll(((RetakeVideoContext) this.retakeVideoContext).retakeIndex, this.mRetakeDurings);
                    return c1441190nbh;
                }
            }
        }
        return c1441190nbh;
    }

    public final C1441190nbh LIZIZ() {
        return this.isRetakeMode ? this.mRetakeDurings : this.mDurings;
    }

    public final long LIZJ() {
        return this.isRetakeMode ? this.mRetakeTime : this.mTotalRecordingTime;
    }

    public final long LIZLLL() {
        return this.isRetakeMode ? this.mRetakeDuration : this.mMaxDuration;
    }

    public final long LJ() {
        return this.isRetakeMode ? ((RetakeVideoContext) this.retakeVideoContext).start + ((long) this.mMusicStart) : this.mMusicStart;
    }

    public final boolean LJFF() {
        InterfaceC383290F1b interfaceC383290F1b = this.retakeVideoContext;
        return interfaceC383290F1b != null && ((RetakeVideoContext) interfaceC383290F1b).isFromEditorPro;
    }

    public final boolean LJI() {
        Workspace workspace = this.mWorkspace;
        return (workspace == null || workspace.getMusicPath() == null || LJIIJJI()) ? false : true;
    }

    public final boolean LJIIJ() {
        return this.enableAspectRatio && !LJIIJJI();
    }

    public final boolean LJIIJJI() {
        return (TextUtils.isEmpty(this.duetContext.duetVideoPath) || TextUtils.isEmpty(this.duetContext.duetAudioPath)) ? false : true;
    }

    public final boolean LJII() {
        return LJFF() && ((RetakeVideoContext) this.retakeVideoContext).disableBGM;
    }

    public final String getMusicPath() {
        if (LJI()) {
            return this.mWorkspace.getMusicPath();
        }
        return null;
    }

    public CameraComponentModel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        this.mDurings = new C1441190nbh();
        this.mRetakeDurings = new C1441190nbh();
        this.mTotalRecordingTime = 0L;
        this.mRetakeTime = 0L;
        this.isMuted = false;
        this.isPlayingPreviewMusic = false;
        this.duetContext = new DuetContext();
        this.greenScreenSourceInfos = new ArrayList<>();
        this.editorProRecordUsedForPip = false;
        this.isFromEditorProNows = false;
        this.editorProRecordMaxDuration = 0;
        this.isEnableCameraGraph = false;
        this.mDurationSwitchable = true;
        this.mCurrentDurationMode = true;
        this.latestUsedZoomValue = -1.0f;
        this.creativeVersion = 0;
        this.enableRecordingMp4 = false;
        this.maxMusicLoopDuration = -1;
        this.recordContext = new RecordContext();
        this.enableAspectRatio = false;
        this.mRestoreType = parcel.readInt();
        this.mMaxDuration = parcel.readLong();
        this.mMusicPath = parcel.readString();
        this.mMusicStart = parcel.readInt();
        this.mVideoWidth = parcel.readInt();
        this.mVideoHeight = parcel.readInt();
        this.mWorkspace = (Workspace) parcel.readParcelable(Workspace.class.getClassLoader());
        this.mDurings = new C1441190nbh(LJIIIIZZ(parcel.readString()));
        this.mTotalRecordingTime = parcel.readLong();
        this.mHardEncode = parcel.readInt();
        if (parcel.readInt() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.mUseBeautyFace = z;
        this.creationId = parcel.readString();
        this.creativeVersion = parcel.readInt();
        this.duetContext = (DuetContext) parcel.readParcelable(DuetContext.class.getClassLoader());
        this.recordContext = (RecordContext) parcel.readParcelable(RecordContext.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mDurationSwitchable = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.mCurrentDurationMode = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.isMuted = z4;
        this.recordMode = parcel.readInt();
        this.gameDuetResource = (GameDuetResource) parcel.readParcelable(GameDuetResource.class.getClassLoader());
        this.extractFramesModel = (ExtractFramesModel) parcel.readSerializable();
        this.veCherEffectParam = (ClientCherEffectParam) parcel.readParcelable(ClientCherEffectParam.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.isLoopSwitchOnByAIGC = z5;
        this.latestUsedZoomValue = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.enterRecordWithSticker = z6;
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.isEditorProRecordMode = z7;
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.editorProRecordEnableMusic = z8;
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.isFromEditorProNows = z9;
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.editorProRecordUsedForPip = z10;
        this.editorProRecordMaxDuration = parcel.readInt();
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.isLoopSwitchOnByGameEffect = z11;
        if (parcel.readByte() != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.isEditorTabAICreateRecordMode = z12;
        this.isLoopSwitchOnByMusic = parcel.readByte() != 0;
        this.maxMusicLoopDuration = parcel.readInt();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "fix_music_end_time_for_parcelable", true, true)) {
            this.musicEndTime = parcel.readInt();
        }
    }

    public static ArrayList<TimeSpeedModelExtension> LJIIIIZZ(String str) {
        try {
            return LJIIIZ(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ArrayList<TimeSpeedModelExtension> arrayList = new ArrayList<>();
            if (!TextUtils.isEmpty(str)) {
                String[] strArrSplit = str.split("\\$");
                if (strArrSplit.length > 0) {
                    for (String str2 : strArrSplit) {
                        String[] strArrSplit2 = str2.split(",");
                        if (strArrSplit2.length == 2) {
                            try {
                                arrayList.add(new TimeSpeedModelExtension(CastIntegerProtector.parseInt(strArrSplit2[0]), CastFloatProtector.parseFloat(strArrSplit2[1]), null, null, null));
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                        }
                        if (strArrSplit2.length == 3) {
                            try {
                                arrayList.add(new TimeSpeedModelExtension(CastIntegerProtector.parseInt(strArrSplit2[0]), CastFloatProtector.parseFloat(strArrSplit2[1]), strArrSplit2[2], null, null));
                            } catch (Exception e3) {
                                TryCatchGuardChecker.doCheck(e3);
                            }
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    public static ArrayList<TimeSpeedModelExtension> LJIIIZ(String str) {
        ArrayList arrayList = (ArrayList) GsonProtectorUtils.fromJson(C2219091BtD.LIZJ(), str, new TypeToken<ArrayList<n>>() { // from class: X.0ng7
        }.getType());
        ArrayList<TimeSpeedModelExtension> arrayList2 = new ArrayList<>(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(TimeSpeedModelExtension.fromJson(C2219091BtD.LIZJ(), (n) it2.next()));
        }
        return arrayList2;
    }

    public CameraComponentModel(int i) {
        this.mDurings = new C1441190nbh();
        this.mRetakeDurings = new C1441190nbh();
        this.mTotalRecordingTime = 0L;
        this.mRetakeTime = 0L;
        this.isMuted = false;
        this.isPlayingPreviewMusic = false;
        this.duetContext = new DuetContext();
        this.greenScreenSourceInfos = new ArrayList<>();
        this.editorProRecordUsedForPip = false;
        this.isFromEditorProNows = false;
        this.editorProRecordMaxDuration = 0;
        this.isEnableCameraGraph = false;
        this.mDurationSwitchable = true;
        this.mCurrentDurationMode = true;
        this.latestUsedZoomValue = -1.0f;
        this.creativeVersion = 0;
        this.enableRecordingMp4 = false;
        this.maxMusicLoopDuration = -1;
        this.recordContext = new RecordContext();
        this.enableAspectRatio = false;
        this.mRestoreType = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mRestoreType);
        parcel.writeLong(this.mMaxDuration);
        parcel.writeString(this.mMusicPath);
        parcel.writeInt(this.mMusicStart);
        parcel.writeInt(this.mVideoWidth);
        parcel.writeInt(this.mVideoHeight);
        parcel.writeParcelable(this.mWorkspace, i);
        parcel.writeString(C2350709Iz.LIZ(this.mDurings));
        parcel.writeLong(this.mTotalRecordingTime);
        parcel.writeInt(this.mHardEncode);
        parcel.writeInt(this.mUseBeautyFace ? 1 : 0);
        parcel.writeString(this.creationId);
        parcel.writeInt(this.creativeVersion);
        parcel.writeParcelable(this.duetContext, i);
        parcel.writeParcelable(this.recordContext, i);
        parcel.writeByte(this.mDurationSwitchable ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.mCurrentDurationMode ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isMuted ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.recordMode);
        parcel.writeParcelable(this.gameDuetResource, i);
        parcel.writeSerializable(this.extractFramesModel);
        parcel.writeParcelable(this.veCherEffectParam, i);
        parcel.writeByte(this.isLoopSwitchOnByAIGC ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.latestUsedZoomValue);
        parcel.writeByte(this.enterRecordWithSticker ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isEditorProRecordMode ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.editorProRecordEnableMusic ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isFromEditorProNows ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.editorProRecordUsedForPip ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.editorProRecordMaxDuration);
        parcel.writeByte(this.isLoopSwitchOnByGameEffect ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isEditorTabAICreateRecordMode ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isLoopSwitchOnByMusic ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.maxMusicLoopDuration);
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "fix_music_end_time_for_parcelable", true, true)) {
            parcel.writeInt(this.musicEndTime);
        }
    }

    public CameraComponentModel(int i, String str, int i2) {
        this.mDurings = new C1441190nbh();
        this.mRetakeDurings = new C1441190nbh();
        this.mTotalRecordingTime = 0L;
        this.mRetakeTime = 0L;
        this.isMuted = false;
        this.isPlayingPreviewMusic = false;
        this.duetContext = new DuetContext();
        this.greenScreenSourceInfos = new ArrayList<>();
        this.editorProRecordUsedForPip = false;
        this.isFromEditorProNows = false;
        this.editorProRecordMaxDuration = 0;
        this.isEnableCameraGraph = false;
        this.mDurationSwitchable = true;
        this.mCurrentDurationMode = true;
        this.latestUsedZoomValue = -1.0f;
        this.creativeVersion = 0;
        this.enableRecordingMp4 = false;
        this.maxMusicLoopDuration = -1;
        this.recordContext = new RecordContext();
        this.enableAspectRatio = false;
        this.mRestoreType = i;
        this.creationId = str;
        this.creativeVersion = i2;
    }
}
