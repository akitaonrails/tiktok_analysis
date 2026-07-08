package com.ss.android.vesdk;

import X.C1DOX;
import X.C20510081s;
import X.C2188811AlT;
import X.C2484209oO;
import X.C571700MbY;
import X.EnumC1464490oDH;
import X.InterfaceC1464150oCj;
import X.RunnableC1286220jZk;
import X.RunnableC1286320jZu;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.monitor.TEPerfStatsInvoker;
import com.ss.android.ttve.nativePort.TEInterface;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.vesdk.clipparam.VEAlgorithmPath;
import com.ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import com.ss.android.vesdk.jni.TEBingoInterface;
import com.ss.android.vesdk.runtime.VEEditorResManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import ud7.b;

/* JADX INFO: loaded from: classes36.dex */
public class VEBingoInvoker implements C1DOX {
    public int frameCountCur;
    public Map<Integer, Boolean> genFrameMap = new HashMap();
    public final TEBingoInterface mNativeBingoHandler;
    public final TEInterface mNativeEditor;
    public final VEEditor mVEEditor;

    @Override // X.C1DOX
    public void clearNativeFromBingo() {
        this.mNativeBingoHandler.clearNative();
    }

    @Override // X.C1DOX
    public int genRandomSolve() {
        synchronized (this.mVEEditor) {
            try {
                C2484209oO.LJIIIIZZ("VEEditor_VEBingoInvoker", "genRandomSolve");
                this.mNativeEditor.stop();
                int randomSolve = this.mNativeBingoHandler.getRandomSolve();
                if (randomSolve == 0) {
                    return this.mNativeEditor.prepareEngine(0);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getRandomSolve failed, ret = ");
                sbLIZ.append(randomSolve);
                C2484209oO.LIZJ("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ));
                return randomSolve;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C1DOX
    public int genSmartCutting() {
        synchronized (this.mVEEditor) {
            try {
                C2484209oO.LJIIIIZZ("VEEditor_VEBingoInvoker", "genSmartCutting");
                this.mNativeEditor.stop();
                int iGenAISolve = this.mNativeBingoHandler.genAISolve();
                if (iGenAISolve == 0) {
                    return this.mNativeEditor.prepareEngine(0);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("genSmartCutting failed, ret = ");
                sbLIZ.append(iGenAISolve);
                C2484209oO.LIZJ("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ));
                return iGenAISolve;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C1DOX
    public List<VEClipAlgorithmParam> getAllVideoRangeData() {
        C2484209oO.LJIIIIZZ("VEEditor_VEBingoInvoker", "getAllVideoRangeData");
        List<VEClipAlgorithmParam> allVideoRangeData = this.mNativeBingoHandler.getAllVideoRangeData();
        for (int i = 0; i < allVideoRangeData.size(); i++) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("rangData: ");
            sbLIZ.append(((VEClipAlgorithmParam) ListProtector.get(allVideoRangeData, i)).toString());
            C2484209oO.LJIIIIZZ("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ));
        }
        return allVideoRangeData;
    }

    @Override // X.C1DOX
    public int initBingoAlgorithm() {
        C2484209oO.LJI("VEEditor_VEBingoInvoker", "initBingoAlgorithm");
        int iInitBingoAlgorithm = this.mNativeBingoHandler.initBingoAlgorithm();
        if (iInitBingoAlgorithm != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initBingoAlgorithm failed, ret = ");
            sbLIZ.append(iInitBingoAlgorithm);
            C2484209oO.LIZJ("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ));
        }
        return iInitBingoAlgorithm;
    }

    @Override // X.C1DOX
    public int removeAllVideoSound() {
        synchronized (this.mVEEditor) {
            try {
                C2484209oO.LJIIIIZZ("VEEditor_VEBingoInvoker", "removeAllVideoSound");
                this.mNativeEditor.stop();
                int iRemoveAllVideoSound = this.mNativeBingoHandler.removeAllVideoSound();
                if (iRemoveAllVideoSound == 0) {
                    return this.mNativeEditor.prepareEngine(0);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("removeAllVideoSound failed, ret = ");
                sbLIZ.append(iRemoveAllVideoSound);
                C2484209oO.LIZJ("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ));
                return iRemoveAllVideoSound;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C1DOX
    public int restoreAllVideoSound() {
        synchronized (this.mVEEditor) {
            try {
                C2484209oO.LJIIIIZZ("VEEditor_VEBingoInvoker", "restoreAllVideoSound");
                this.mNativeEditor.stop();
                int iRestoreAllVideoSound = this.mNativeBingoHandler.restoreAllVideoSound();
                if (iRestoreAllVideoSound == 0) {
                    return this.mNativeEditor.prepareEngine(0);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("restoreAllVideoSound failed, ret = ");
                sbLIZ.append(iRestoreAllVideoSound);
                C2484209oO.LIZJ("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ));
                return iRestoreAllVideoSound;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C1DOX
    public int updateAlgorithmFromNormal() {
        int iUpdateAlgorithmFromNormal;
        synchronized (this.mVEEditor) {
            try {
                C2484209oO.LJIIIIZZ("VEEditor_VEBingoInvoker", "updateAlgorithmFromNormal");
                iUpdateAlgorithmFromNormal = this.mNativeBingoHandler.updateAlgorithmFromNormal();
                if (iUpdateAlgorithmFromNormal != 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("updateAlgorithmFromNormal failed, ret = ");
                    sbLIZ.append(iUpdateAlgorithmFromNormal);
                    C2484209oO.LIZJ("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iUpdateAlgorithmFromNormal;
    }

    public VEBingoInvoker(VEEditor vEEditor) {
        this.mVEEditor = vEEditor;
        TEInterface tEInterface = vEEditor.LLJLLIL;
        this.mNativeEditor = tEInterface;
        this.mNativeBingoHandler = new TEBingoInterface(tEInterface);
    }

    public int addVideoClipWithAlgorithm(String[] strArr) {
        synchronized (this.mVEEditor) {
            try {
                if (strArr.length == 0) {
                    return -100;
                }
                for (int i = 0; i < strArr.length; i++) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("addVidoeClipWithAlgorithm...  i: ");
                    sbLIZ.append(i);
                    sbLIZ.append(" path: ");
                    sbLIZ.append(strArr[i]);
                    C2484209oO.LJIIIIZZ("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ));
                }
                this.mNativeEditor.stop();
                int iAddVidoeClipWithAlgorithm = this.mNativeBingoHandler.addVidoeClipWithAlgorithm(strArr);
                if (iAddVidoeClipWithAlgorithm != 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("addVidoeClipWithAlgorithm failed, ret = ");
                    sbLIZ2.append(iAddVidoeClipWithAlgorithm);
                    C2484209oO.LIZJ("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ2));
                    return iAddVidoeClipWithAlgorithm;
                }
                return this.mNativeEditor.prepareEngine(0);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C1DOX
    public int cancelGenVideoFrame(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cancelGenVideoFrame... index: ");
        sbLIZ.append(i);
        C2484209oO.LJIIIIZZ("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ));
        this.genFrameMap.put(Integer.valueOf(i), Boolean.FALSE);
        this.frameCountCur = 0;
        return 0;
    }

    public int checkScoresFile(String str) {
        if (str != null && !TextUtils.isEmpty(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("checkScoresFile filePath:");
            sbLIZ.append(str);
            C2484209oO.LJIIIIZZ("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ));
            int iCheckScoresFile = this.mNativeBingoHandler.checkScoresFile(str);
            if (iCheckScoresFile != 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("checkScoresFile failed, ret = ");
                sbLIZ2.append(iCheckScoresFile);
                C2484209oO.LIZJ("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ2));
            }
            return iCheckScoresFile;
        }
        return -100;
    }

    public int deleteVideoClipWithAlgorithm(int i) {
        synchronized (this.mVEEditor) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("deleteVideoClipWithAlgorithm... ");
                sbLIZ.append(i);
                C2484209oO.LJIIIIZZ("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ));
                if (i < 0) {
                    return -100;
                }
                this.mNativeEditor.stop();
                int iDeleteVideoClipWithAlgorithm = this.mNativeBingoHandler.deleteVideoClipWithAlgorithm(i);
                if (iDeleteVideoClipWithAlgorithm != 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("deleteVideoClipWithAlgorithm failed, ret = ");
                    sbLIZ2.append(iDeleteVideoClipWithAlgorithm);
                    C2484209oO.LIZJ("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ2));
                    return iDeleteVideoClipWithAlgorithm;
                }
                return this.mNativeEditor.prepareEngine(0);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int removeMusic(int i) {
        synchronized (this.mVEEditor) {
            try {
                this.mNativeEditor.stop();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("removeMusic index: ");
                sbLIZ.append(i);
                C2484209oO.LJIIIIZZ("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ));
                int iRemoveMusic = this.mNativeBingoHandler.removeMusic(i);
                if (iRemoveMusic != 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("removeMusic failed, ret = ");
                    sbLIZ2.append(iRemoveMusic);
                    C2484209oO.LIZJ("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ2));
                    return iRemoveMusic;
                }
                this.mNativeEditor.prepareEngine(0);
                return 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int setInterimScoresToFile(String str) {
        if (str != null && !TextUtils.isEmpty(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setInterimScoresToFile filePath:");
            sbLIZ.append(str);
            C2484209oO.LJIIIIZZ("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ));
            int interimScoresToFile = this.mNativeBingoHandler.setInterimScoresToFile(str);
            if (interimScoresToFile != 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("setInterimScoresToFile failed, ret = ");
                sbLIZ2.append(interimScoresToFile);
                C2484209oO.LIZJ("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ2));
            }
            return interimScoresToFile;
        }
        return -100;
    }

    public int setMusicCropRatio(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setMusicCropRatio crop:");
        sbLIZ.append(i);
        C2484209oO.LJIIIIZZ("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ));
        int musicCropRatio = this.mNativeBingoHandler.setMusicCropRatio(i);
        if (musicCropRatio != 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setMusicCropRatio failed, ret = ");
            sbLIZ2.append(musicCropRatio);
            C2484209oO.LIZJ("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ2));
        }
        return musicCropRatio;
    }

    @Override // X.C1DOX
    public int initWithAlgorithm(String[] strArr, EnumC1464490oDH enumC1464490oDH) {
        synchronized (this.mVEEditor) {
            try {
                TEPerfStatsInvoker.nativeReset(1);
                if (strArr.length == 0) {
                    return -100;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("initWithAlgorithm... ");
                sbLIZ.append(enumC1464490oDH);
                C2484209oO.LJIIIIZZ("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ));
                for (int i = 0; i < strArr.length; i++) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("initWithAlgorithm...  i: ");
                    sbLIZ2.append(i);
                    sbLIZ2.append(" path: ");
                    sbLIZ2.append(strArr[i]);
                    C2484209oO.LJIIIIZZ("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ2));
                }
                this.mVEEditor.LLLFFI = System.currentTimeMillis();
                this.mVEEditor.LLLFZ = System.currentTimeMillis();
                int iInitVideoEditorWithAlgorithm = this.mNativeBingoHandler.initVideoEditorWithAlgorithm(strArr, enumC1464490oDH.ordinal());
                if (iInitVideoEditorWithAlgorithm != 0) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("initVideoEditorWithAlgorithm failed, ret = ");
                    sbLIZ3.append(iInitVideoEditorWithAlgorithm);
                    C2484209oO.LIZJ("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ3));
                    this.mVEEditor.LLLILZJ = false;
                    return iInitVideoEditorWithAlgorithm;
                }
                VEEditor vEEditor = this.mVEEditor;
                vEEditor.LLLILZJ = true;
                VEEditorResManager vEEditorResManager = vEEditor.LLILZLL;
                vEEditorResManager.mReverseDone = false;
                vEEditorResManager.mOriginalSoundTrackType = 0;
                vEEditorResManager.mOriginalSoundTrackIndex = 0;
                vEEditor.LLLIILIL = enumC1464490oDH;
                vEEditor.LLILZ.getClass();
                VEEditor vEEditor2 = this.mVEEditor;
                vEEditor2.LLJLL = 0;
                vEEditor2.LLILZ.LIZ();
                return 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int moveVideoClipWithAlgorithm(int i, int i2) {
        synchronized (this.mVEEditor) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("moveVideoClipWithAlgorithm... from: ");
                sbLIZ.append(i);
                sbLIZ.append(" to: ");
                sbLIZ.append(i2);
                C2484209oO.LJIIIIZZ("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ));
                if (i != i2 && i >= 0 && i2 >= 0) {
                    this.mNativeEditor.stop();
                    int iMoveVideoClipWithAlgorithm = this.mNativeBingoHandler.moveVideoClipWithAlgorithm(i, i2);
                    if (iMoveVideoClipWithAlgorithm != 0) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("moveVideoClipWithAlgorithm failed, ret = ");
                        sbLIZ2.append(iMoveVideoClipWithAlgorithm);
                        C2484209oO.LIZJ("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ2));
                        return iMoveVideoClipWithAlgorithm;
                    }
                    return this.mNativeEditor.prepareEngine(0);
                }
                return -100;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int setAIRotation(int i, ROTATE_DEGREE rotate_degree) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setAIRotation index:");
        sbLIZ.append(i);
        sbLIZ.append(" rotation: ");
        sbLIZ.append(rotate_degree);
        C2484209oO.LJIIIIZZ("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ));
        int i2 = C571700MbY.LIZ[rotate_degree.ordinal()];
        int i3 = 0;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        i3 = 270;
                    }
                } else {
                    i3 = 180;
                }
            } else {
                i3 = 90;
            }
        }
        int aIRotation = this.mNativeBingoHandler.setAIRotation(i, i3);
        if (aIRotation != 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setAIRotation failed, ret = ");
            sbLIZ2.append(aIRotation);
            C2484209oO.LIZJ("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ2));
        }
        return aIRotation;
    }

    @Override // X.C1DOX
    public int beginGenVideoFrames(int i, int i2, boolean z, InterfaceC1464150oCj interfaceC1464150oCj) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("beginGenVideoFrames...:");
        sbLIZ.append(i);
        sbLIZ.append(", second:");
        sbLIZ.append(i2);
        sbLIZ.append(", hasHWDecode:");
        sbLIZ.append(z);
        C2484209oO.LJIIIIZZ("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ));
        this.genFrameMap.put(Integer.valueOf(i), Boolean.TRUE);
        String clipPath = this.mNativeBingoHandler.getClipPath(i);
        if (clipPath.equals("")) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getClipPath wrong index: ");
            sbLIZ2.append(i);
            C2484209oO.LIZJ("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ2));
            return -100;
        }
        int[] iArr = new int[10];
        TEVideoUtils.nativeGetFileInfo(clipPath, iArr);
        int i8 = iArr[0];
        if (i8 > 0 && (i3 = iArr[1]) > 0) {
            if (i8 > i3) {
                int i9 = (int) (((double) i3) / (((double) i8) / ((double) 320)));
                int i10 = i9 % 16;
                if (i10 >= 8) {
                    i9 += 16;
                }
                i5 = i9 - i10;
                i4 = 320;
            } else {
                int i11 = (int) (((double) i8) / (((double) i3) / ((double) 320)));
                int i12 = i11 % 16;
                if (i12 >= 8) {
                    i11 += 16;
                }
                i4 = i11 - i12;
                i5 = 320;
            }
            int i13 = 3;
            int i14 = (iArr[3] / (i2 * LSPassThroughRecordSizeConfig.DEFAULT)) + 1;
            if (z) {
                i6 = i14 / 3;
            } else {
                i13 = i14;
                i6 = i14;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("HwFrameExtractor_");
            sbLIZ3.append(i);
            sbLIZ3.append(" second:");
            sbLIZ3.append(i2);
            sbLIZ3.append(" hasHWDecode:");
            sbLIZ3.append(z);
            sbLIZ3.append(" beginGenVideoFrames HWSteps:");
            sbLIZ3.append(i6);
            C2484209oO.LJIIIIZZ("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ3));
            long jCurrentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            for (int i15 = 0; i15 < i14; i15 += i13) {
                arrayList.add(Integer.valueOf(i15 * LSPassThroughRecordSizeConfig.DEFAULT));
            }
            if (arrayList.size() > 0 && ((Integer) ListProtector.get(arrayList, arrayList.size() - 1)).intValue() > 1000) {
                ListProtector.set(arrayList, arrayList.size() - 1, Integer.valueOf(((Integer) ListProtector.get(arrayList, arrayList.size() - 1)).intValue() - LSPassThroughRecordSizeConfig.DEFAULT));
            }
            int[] iArr2 = new int[arrayList.size()];
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                iArr2[i16] = ((Integer) ListProtector.get(arrayList, i16)).intValue();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("HwFrameExtractor_");
                sbLIZ4.append(i);
                sbLIZ4.append(" softList value:");
                sbLIZ4.append(iArr2[i16]);
                C2484209oO.LJI("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ4));
            }
            new BPEAThread(new RunnableC1286320jZu(this, new long[]{System.currentTimeMillis()}, i, clipPath, interfaceC1464150oCj, i14, jCurrentTimeMillis, iArr, iArr2, i4, i5)).start();
            if (z) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i17 = 0; i17 < i6; i17++) {
                    int i18 = i17 * LSPassThroughRecordSizeConfig.DEFAULT;
                    if (!arrayList.contains(Integer.valueOf(i18))) {
                        arrayList2.add(Integer.valueOf(i18));
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("HwFrameExtractor_");
                        sbLIZ5.append(i);
                        sbLIZ5.append(" hwListOne value:");
                        sbLIZ5.append(i18);
                        C2484209oO.LJI("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ5));
                    }
                }
                int i19 = i6;
                while (true) {
                    i7 = i6 * 2;
                    if (i19 >= i7) {
                        break;
                    }
                    int i20 = i19 * LSPassThroughRecordSizeConfig.DEFAULT;
                    if (!arrayList.contains(Integer.valueOf(i20))) {
                        arrayList3.add(Integer.valueOf(i20));
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("HwFrameExtractor_");
                        sbLIZ6.append(i);
                        sbLIZ6.append(" hwListTwo value:");
                        sbLIZ6.append(i20);
                        C2484209oO.LJI("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ6));
                    }
                    i19++;
                }
                while (i7 < i14) {
                    int i21 = i7 * LSPassThroughRecordSizeConfig.DEFAULT;
                    if (!arrayList.contains(Integer.valueOf(i21))) {
                        arrayList4.add(Integer.valueOf(i21));
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("HwFrameExtractor_");
                        sbLIZ7.append(i);
                        sbLIZ7.append(" hwListThree value:");
                        sbLIZ7.append(i21);
                        C2484209oO.LJI("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ7));
                    }
                    i7++;
                }
                beginGenFrameHW(clipPath, arrayList2, i4, i5, 2, i14, i, 1, iArr, jCurrentTimeMillis, interfaceC1464150oCj);
                beginGenFrameHW(clipPath, arrayList3, i4, i5, 2, i14, i, 2, iArr, jCurrentTimeMillis, interfaceC1464150oCj);
                beginGenFrameHW(clipPath, arrayList4, i4, i5, 2, i14, i, 3, iArr, jCurrentTimeMillis, interfaceC1464150oCj);
            }
            return 0;
        }
        C2484209oO.LIZJ("VEEditor_VEBingoInvoker", "beginGenVideoFrames error for invalid video size");
        return -1;
    }

    public int setMusicAndResult(String str, int i, int i2, VEAlgorithmPath vEAlgorithmPath) {
        synchronized (this.mVEEditor) {
            try {
                this.mNativeEditor.stop();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setMusicAndResult... audioFilePath: ");
                sbLIZ.append(str);
                sbLIZ.append(" trimIn: ");
                sbLIZ.append(i);
                sbLIZ.append(" trimOut: ");
                sbLIZ.append(i2);
                sbLIZ.append(" ");
                sbLIZ.append(vEAlgorithmPath.toString());
                C2484209oO.LJIIIIZZ("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ));
                if ((vEAlgorithmPath.getVeBeatsPath() != null && !C20510081s.LIZ(vEAlgorithmPath.getVeBeatsPath())) || ((vEAlgorithmPath.getDownBeatsPath() != null && !C20510081s.LIZ(vEAlgorithmPath.getDownBeatsPath())) || ((vEAlgorithmPath.getNoStrengthBeatsPath() != null && !C20510081s.LIZ(vEAlgorithmPath.getNoStrengthBeatsPath())) || ((vEAlgorithmPath.getManMadePath() != null && !C20510081s.LIZ(vEAlgorithmPath.getManMadePath())) || (vEAlgorithmPath.getOnlineBeatsPath() != null && !C20510081s.LIZ(vEAlgorithmPath.getOnlineBeatsPath())))))) {
                    C2484209oO.LIZJ("VEEditor_VEBingoInvoker", "file is not exist !");
                    return -100;
                }
                int musicAndResult = this.mNativeBingoHandler.setMusicAndResult(str, i, i2, vEAlgorithmPath.getVeBeatsPath(), vEAlgorithmPath.getDownBeatsPath(), vEAlgorithmPath.getNoStrengthBeatsPath(), vEAlgorithmPath.getOnlineBeatsPath(), vEAlgorithmPath.getManMadePath(), vEAlgorithmPath.getType(), vEAlgorithmPath.getMode());
                if (musicAndResult < 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("setMusicAndResult failed, ret = ");
                    sbLIZ2.append(musicAndResult);
                    C2484209oO.LIZJ("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ2));
                    return musicAndResult;
                }
                return this.mNativeEditor.prepareEngine(0);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void progressBack(InterfaceC1464150oCj interfaceC1464150oCj, int i, int i2, long j, int[] iArr) {
        synchronized (this.mVEEditor) {
            try {
                float f = i;
                float f2 = (this.frameCountCur + 1) / f;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("HwFrameExtractor_");
                sbLIZ.append(i2);
                sbLIZ.append(" count:");
                sbLIZ.append(this.frameCountCur);
                sbLIZ.append(" steps:");
                sbLIZ.append(i);
                sbLIZ.append(" progress:");
                sbLIZ.append(f2);
                C2484209oO.LJIIIIZZ("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ));
                if (f2 <= 1.0f && this.genFrameMap.get(Integer.valueOf(i2)).booleanValue()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("HwFrameExtractor_");
                    sbLIZ2.append(i2);
                    sbLIZ2.append(" progressBack < 1 count:");
                    sbLIZ2.append(this.frameCountCur);
                    sbLIZ2.append(" steps:");
                    sbLIZ2.append(i);
                    sbLIZ2.append(" progress:");
                    sbLIZ2.append(f2);
                    C2484209oO.LJIIIIZZ("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ2));
                    int i3 = this.frameCountCur + 1;
                    this.frameCountCur = i3;
                    interfaceC1464150oCj.onProgress(i3 / f);
                }
                if (f2 == 1.0f) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - j;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("bingo extractFrame ");
                    sbLIZ3.append(i2);
                    sbLIZ3.append(" progressBack == 1, count:");
                    sbLIZ3.append(this.frameCountCur);
                    sbLIZ3.append(" steps:");
                    sbLIZ3.append(i);
                    sbLIZ3.append(" progress:");
                    sbLIZ3.append(f2);
                    sbLIZ3.append(", cost:");
                    sbLIZ3.append(jCurrentTimeMillis);
                    C2484209oO.LJIIIIZZ("VEEditor_VEBingoInvoker", C2188811AlT.LIZIZ(sbLIZ3));
                    this.frameCountCur = 0;
                    this.genFrameMap.put(Integer.valueOf(i2), Boolean.FALSE);
                    if (!VEConfigCenter.getInstance().getValue("ve_enable_applog_app_and_frequency_control", false).booleanValue()) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("src_width", iArr[0]);
                            jSONObject.put("src_height", iArr[1]);
                            jSONObject.put("src_duration", iArr[3]);
                            jSONObject.put("all_frame_count", i);
                            jSONObject.put("all_cost_ms", jCurrentTimeMillis);
                            jSONObject.put("mean_cost_ms", jCurrentTimeMillis / f);
                            b.LIZIZ("vesdk_event_editor_extract_frame_time", "performance", jSONObject, false);
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private void beginGenFrameHW(String str, List<Integer> list, int i, int i2, int i3, int i4, int i5, int i6, int[] iArr, long j, InterfaceC1464150oCj interfaceC1464150oCj) {
        int[] iArr2 = new int[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            iArr2[i7] = ((Integer) ListProtector.get(list, i7)).intValue();
        }
        new BPEAThread(new RunnableC1286220jZk(this, str, iArr2, i, i2, i3, i5, i6, interfaceC1464150oCj, i4, j, iArr)).start();
    }
}
