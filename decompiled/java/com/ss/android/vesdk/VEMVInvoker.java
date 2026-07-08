package com.ss.android.vesdk;

import X.C1DOV;
import X.C2185861Agi;
import X.C2188811AlT;
import X.C2249071D1d;
import X.C2255141DOm;
import X.C2255151DOn;
import X.C2255181DOq;
import X.C2484209oO;
import X.EnumC1464490oDH;
import X.InterfaceC2185831Agf;
import X.InterfaceC2189321AmI;
import X.InterfaceC2255101DOi;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.model.MVInfoBean;
import com.ss.android.ttve.model.MVResourceBean;
import com.ss.android.ttve.model.VEMVAudioAlgorithmResult;
import com.ss.android.ttve.monitor.TEPerfStatsInvoker;
import com.ss.android.ttve.nativePort.TEInterface;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VEMVAlgorithmConfig;
import com.ss.android.vesdk.VEMVParams;
import com.ss.android.vesdk.clipparam.VEClipSourceParam;
import com.ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.ss.android.vesdk.filterparam.VEAudioFadeFilterParam;
import com.ss.android.vesdk.jni.TEMVInterface;
import com.ss.android.vesdk.runtime.VEEditorResManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import ud7.b;

/* JADX INFO: loaded from: classes36.dex */
public class VEMVInvoker implements InterfaceC2255101DOi {
    public boolean mIsMVInit;
    public int mMVBackgroundAudioRid;
    public List<Integer> mMVFilterIndex;
    public volatile InterfaceC2189321AmI mMVInitListener;
    public String mMVPath;
    public C2255141DOm mMVResVideoInfo;
    public String[] mMVResourcePaths;
    public String[] mMVResourceTypes;
    public List<VESize> mMVSize;
    public final TEInterface mNativeEditor;
    public final TEMVInterface mNativeMVHandler;
    public final VEEditor mVEEditor;
    public MVInfoBean mvInfo;
    public VEMVParams.MVResolution mvResolution;
    public int mMVBackgroundAudioTrackIndex = -1;
    public int mMVKaraokeAudioTrackIndex = -1;
    public InterfaceC2185831Agf mMVInitedCallback = new C2185861Agi(this);

    public void setListenerForMV(InterfaceC2189321AmI interfaceC2189321AmI) {
    }

    @Override // X.InterfaceC2255101DOi
    public void clearNativeFromMV() {
        this.mNativeMVHandler.clearNative();
    }

    public MVInfoBean getMVInfo() {
        if (!this.mIsMVInit) {
            throw new VEException(-1, "The MV resource has not been initialized yet, please call the init2 method");
        }
        MVInfoBean mVInfoBean = this.mvInfo;
        if (mVInfoBean != null) {
            return mVInfoBean;
        }
        throw new VEException(-1, "MV resource information construction failed!");
    }

    @Override // X.InterfaceC2255101DOi
    public VEMVAudioInfo getMVOriginalBackgroundAudio() {
        C2484209oO.LJIIIIZZ("VEEditor_VEMVInvoker", "getMVOriginalBackgroundAudio");
        if (this.mMVPath != null && this.mMVResourcePaths != null && this.mMVResourceTypes != null) {
            return (VEMVAudioInfo) this.mNativeMVHandler.getMVOriginalBackgroundAudio();
        }
        C2484209oO.LIZJ("VEEditor_VEMVInvoker", "getMVOriginalBackgroundAudio bad input file, please call initMV first");
        return null;
    }

    public VEMVAlgorithmConfig getServerAlgorithmConfig() {
        C2484209oO.LJIIIIZZ("VEEditor_VEMVInvoker", "getServerAlgorithmConfig.");
        if (this.mMVPath != null && this.mMVResourcePaths != null && this.mMVResourceTypes != null) {
            return (VEMVAlgorithmConfig) this.mNativeMVHandler.getServerAlgorithmConfig();
        }
        C2484209oO.LIZJ("VEEditor_VEMVInvoker", "getServerAlgorithmConfig error, please call initMV first!");
        throw new IllegalStateException("getServerAlgorithmConfig, initMv is not called!");
    }

    public int getMVBackgroundAudioRid() {
        return this.mMVBackgroundAudioRid;
    }

    public int getMVBackgroundAudioTrackIndex() {
        return this.mMVBackgroundAudioTrackIndex;
    }

    public int getMVKaraokeAudioIndex() {
        return this.mMVKaraokeAudioTrackIndex;
    }

    @Override // X.InterfaceC2255101DOi
    public boolean isMVInitialedInternal() {
        return this.mIsMVInit;
    }

    public VEMVInvoker(VEEditor vEEditor) {
        this.mVEEditor = vEEditor;
        TEInterface tEInterface = vEEditor.LLJLLIL;
        this.mNativeEditor = tEInterface;
        this.mNativeMVHandler = new TEMVInterface(tEInterface.getNativeHandler());
    }

    @Override // X.InterfaceC2255101DOi
    public void addMVFilterInternal(int i) {
        List<Integer> list = this.mMVFilterIndex;
        if (list != null) {
            list.add(Integer.valueOf(i));
        }
    }

    public Map<Integer, List<MVResourceBean>> getMVUserVideoInfo(String str) {
        if (this.mIsMVInit) {
            if (this.mMVResVideoInfo != null) {
                HashMap map = new HashMap();
                for (MVResourceBean mVResourceBean : (ArrayList) this.mMVResVideoInfo.LIZ) {
                    if (mVResourceBean.content.equals(str)) {
                        List list = (List) map.get(Integer.valueOf(mVResourceBean.trackIndex));
                        if (list == null) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(mVResourceBean);
                            map.put(Integer.valueOf(mVResourceBean.trackIndex), arrayList);
                        } else {
                            list.add(mVResourceBean);
                            map.put(Integer.valueOf(mVResourceBean.trackIndex), list);
                        }
                    }
                }
                return map;
            }
            throw new VEException(-1, "MV resource information construction failed");
        }
        throw new VEException(-1, "The MV resource has not been initialized yet, please call the init2 method");
    }

    @Override // X.InterfaceC2255101DOi
    public int initMV(VEMVParams vEMVParams) throws Throwable {
        synchronized (this.mVEEditor) {
            try {
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("initMV ");
                    sbLIZ.append(vEMVParams.toString());
                    C2484209oO.LJI("VEEditor_VEMVInvoker", C2188811AlT.LIZIZ(sbLIZ));
                    return initMVInternal(vEMVParams.mvPath, vEMVParams.resourcesFilePaths, vEMVParams.resourcesTypes, vEMVParams.mvDuration, vEMVParams.bgmPath, vEMVParams.bgmTrimIn, vEMVParams.bgmTrimOut, vEMVParams.resMV, false, vEMVParams.isSingleVideo, vEMVParams.extraParams, vEMVParams.imgSizes, vEMVParams.backVolume, vEMVParams.originalVolume, vEMVParams.karaokeAudioPaths, vEMVParams.karaokeAudioDurations, vEMVParams.karaokeAudioSpeeds, vEMVParams.customRenderRes, vEMVParams.imageResizeRatio, vEMVParams.resFillMode);
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public int setMVAudioBeatAlgorithmResult(VEMVAudioAlgorithmResult vEMVAudioAlgorithmResult) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setMVAudioBeatAlgorithmResult. beatSize : ");
        sbLIZ.append(vEMVAudioAlgorithmResult.size);
        C2484209oO.LJIIIIZZ("VEEditor_VEMVInvoker", C2188811AlT.LIZIZ(sbLIZ));
        if (this.mMVPath != null && this.mMVResourcePaths != null && this.mMVResourceTypes != null) {
            return this.mNativeMVHandler.setMVAudioBeatAlgorithmResult(vEMVAudioAlgorithmResult);
        }
        C2484209oO.LIZJ("VEEditor_VEMVInvoker", "setMVAudioBeatAlgorithmResult error, please call initMV first!");
        throw new IllegalStateException("setMVAudioBeatAlgorithmResult, initMv is not called!");
    }

    public int setMVDataJson(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setMVDataJson. json = ");
        sbLIZ.append(str);
        C2484209oO.LJIIIIZZ("VEEditor_VEMVInvoker", C2188811AlT.LIZIZ(sbLIZ));
        if (this.mMVPath != null && this.mMVResourcePaths != null && this.mMVResourceTypes != null) {
            return this.mNativeMVHandler.setMVDataJson(str);
        }
        C2484209oO.LIZJ("VEEditor_VEMVInvoker", "setMVDataJson error, please call initMV first!");
        throw new IllegalStateException("setMVDataJson, initMv is not called!");
    }

    @Override // X.InterfaceC2255101DOi
    public int updateMVResources(VEMVParams vEMVParams) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateMVResources ");
        sbLIZ.append(vEMVParams.toString());
        C2484209oO.LJIIIIZZ("VEEditor_VEMVInvoker", C2188811AlT.LIZIZ(sbLIZ));
        return reInitMV(vEMVParams.mvPath, vEMVParams.resourcesFilePaths, vEMVParams.resourcesTypes, vEMVParams.mvDuration, null, 0, 0, vEMVParams.resMV, true, vEMVParams.isSingleVideo, vEMVParams.extraParams, vEMVParams.imgSizes, false, vEMVParams.karaokeAudioPaths, vEMVParams.karaokeAudioDurations, vEMVParams.karaokeAudioSpeeds);
    }

    public int updateMVResourcesRecreateEngine(VEMVParams vEMVParams) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateMVResourcesRecreateEngine ");
        sbLIZ.append(vEMVParams.toString());
        C2484209oO.LJIIIIZZ("VEEditor_VEMVInvoker", C2188811AlT.LIZIZ(sbLIZ));
        return reInitMV(vEMVParams.mvPath, vEMVParams.resourcesFilePaths, vEMVParams.resourcesTypes, vEMVParams.mvDuration, null, 0, 0, vEMVParams.resMV, true, vEMVParams.isSingleVideo, vEMVParams.extraParams, vEMVParams.imgSizes, true, vEMVParams.karaokeAudioPaths, vEMVParams.karaokeAudioDurations, vEMVParams.karaokeAudioSpeeds);
    }

    public int setMvOriginalAudio(boolean z, float f) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setMVoriginalAudio... ");
        sbLIZ.append(z);
        C2484209oO.LJI("VEEditor_VEMVInvoker", C2188811AlT.LIZIZ(sbLIZ));
        if (this.mIsMVInit && this.mMVResVideoInfo == null) {
            return -502;
        }
        ArrayList arrayList = new ArrayList();
        for (MVResourceBean mVResourceBean : (ArrayList) this.mMVResVideoInfo.LIZ) {
            if (!arrayList.contains(Integer.valueOf(mVResourceBean.trackIndex))) {
                arrayList.add(Integer.valueOf(mVResourceBean.trackIndex));
            }
        }
        if (!z) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                this.mVEEditor.LJJJJJ(0.0f, ((Integer) it2.next()).intValue(), 0);
            }
        } else {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                this.mVEEditor.LJJJJJ(f, ((Integer) it3.next()).intValue(), 0);
            }
        }
        return 0;
    }

    private List<List<List<MVResourceBean>>> genMVResourceTracks(MVInfoBean mVInfoBean, List<String> list, List<String> list2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList.add(arrayList2);
        arrayList.add(arrayList3);
        ArrayList<MVResourceBean> arrayList4 = mVInfoBean.resources;
        ArrayList arrayList5 = new ArrayList();
        while (arrayList5.size() != arrayList4.size()) {
            ArrayList arrayList6 = new ArrayList();
            double d = 0.0d;
            double d2 = 0.0d;
            for (MVResourceBean mVResourceBean : arrayList4) {
                if (!arrayList5.contains(Integer.valueOf(mVResourceBean.rid))) {
                    if (!"video".equals(mVResourceBean.type) && !"img".equals(mVResourceBean.type) && !"bgimg".equals(mVResourceBean.type)) {
                        if ("audio".equals(mVResourceBean.type)) {
                            if (mVResourceBean.seqIn >= d2) {
                                ArrayList arrayList7 = new ArrayList();
                                MVResourceBean mVResourceBean2 = new MVResourceBean();
                                mVResourceBean2.seqIn = mVResourceBean.seqIn * 1000.0d;
                                mVResourceBean2.seqOut = mVResourceBean.seqOut * 1000.0d;
                                mVResourceBean2.trimIn = mVResourceBean.trimIn * 1000.0d;
                                mVResourceBean2.trimOut = mVResourceBean.trimOut * 1000.0d;
                                mVResourceBean2.musicFadeIn = mVResourceBean.musicFadeIn * 1000.0d;
                                mVResourceBean2.musicFadeOut = mVResourceBean.musicFadeOut * 1000.0d;
                                mVResourceBean2.content = mVResourceBean.content;
                                mVResourceBean2.type = mVResourceBean.type;
                                int i = mVResourceBean.rid;
                                mVResourceBean2.rid = i;
                                mVResourceBean2.isLoop = mVResourceBean.isLoop;
                                mVResourceBean2.isMute = mVResourceBean.isMute;
                                mVResourceBean2.timeMode = mVResourceBean.timeMode;
                                if (this.mMVBackgroundAudioRid == 0) {
                                    this.mMVBackgroundAudioRid = i;
                                }
                                arrayList7.add(mVResourceBean2);
                                d2 = mVResourceBean.seqOut;
                                arrayList5.add(Integer.valueOf(mVResourceBean2.rid));
                                list2.add(mVResourceBean2.content);
                                if (arrayList7.size() > 0) {
                                    arrayList3.add(arrayList7);
                                }
                            }
                        } else if ("text".equals(mVResourceBean.type)) {
                            arrayList5.add(Integer.valueOf(mVResourceBean.rid));
                        } else {
                            arrayList5.add(Integer.valueOf(mVResourceBean.rid));
                        }
                    } else if (mVResourceBean.seqIn >= d) {
                        MVResourceBean mVResourceBean3 = new MVResourceBean();
                        mVResourceBean3.seqIn = mVResourceBean.seqIn * 1000.0d;
                        mVResourceBean3.seqOut = mVResourceBean.seqOut * 1000.0d;
                        mVResourceBean3.trimIn = mVResourceBean.trimIn * 1000.0d;
                        double d3 = mVResourceBean.trimOut * 1000.0d;
                        mVResourceBean3.trimOut = d3;
                        mVResourceBean3.musicFadeIn = mVResourceBean.musicFadeIn * 1000.0d;
                        mVResourceBean3.musicFadeOut = mVResourceBean.musicFadeOut * 1000.0d;
                        if (d3 == 0.0d && ("img".equals(mVResourceBean.type) || "bgimg".equals(mVResourceBean.type))) {
                            mVResourceBean3.trimOut = mVResourceBean3.seqOut - mVResourceBean3.seqIn;
                        }
                        mVResourceBean3.content = mVResourceBean.content;
                        mVResourceBean3.type = mVResourceBean.type;
                        mVResourceBean3.rid = mVResourceBean.rid;
                        mVResourceBean3.isLoop = mVResourceBean.isLoop;
                        mVResourceBean3.isMute = mVResourceBean.isMute;
                        mVResourceBean3.timeMode = mVResourceBean.timeMode;
                        arrayList6.add(mVResourceBean3);
                        d = mVResourceBean.seqOut;
                        arrayList5.add(Integer.valueOf(mVResourceBean3.rid));
                        list.add(mVResourceBean3.content);
                    }
                }
            }
            if (arrayList6.size() > 0) {
                arrayList2.add(arrayList6);
            }
        }
        return arrayList;
    }

    public int initMV(String str, String[] strArr, String[] strArr2) throws Throwable {
        synchronized (this.mVEEditor) {
            try {
                try {
                    return initMVInternal(str, strArr, strArr2, null, null, 0, 0, VEMVParams.MVResolution.RES_RANDOM, false, false, null, null, 1.0f, 1.0f, null, null, null, null, null, 0);
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int setExternalAlgorithmResult(String str, String str2, String str3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setExternalAlgorithmResult. photoPath = ");
        sbLIZ.append(str);
        sbLIZ.append(", algorithmType = ");
        sbLIZ.append(str2);
        sbLIZ.append(", filePath = ");
        sbLIZ.append(str3);
        C2484209oO.LJIIIIZZ("VEEditor_VEMVInvoker", C2188811AlT.LIZIZ(sbLIZ));
        if (this.mMVPath != null && this.mMVResourcePaths != null && this.mMVResourceTypes != null) {
            return this.mNativeMVHandler.setExternalAlgorithmResult(str, str2, str3, -1);
        }
        C2484209oO.LIZJ("VEEditor_VEMVInvoker", "setExternalAlgorithmResult error, please call initMV first!");
        throw new IllegalStateException("setExternalAlgorithmResult, initMv is not called!");
    }

    public int updateMVBackgroundAudioTrack(String str, int i, int i2) {
        C2484209oO.LJIIIIZZ("VEEditor_VEMVInvoker", "updateMVBackgroundAudioTrack");
        return reInitMV(this.mMVPath, this.mMVResourcePaths, this.mMVResourceTypes, null, str, i, i2, this.mvResolution, false, false, null, this.mMVSize, false, null, null, null);
    }

    public int updateMVBackgroundAudioTrack2(String str, int i, int i2) throws Throwable {
        C2484209oO.LJIIIIZZ("VEEditor_VEMVInvoker", "updateMVBackgroundAudioTrack2...");
        int iReInitMV = reInitMV(this.mMVPath, this.mMVResourcePaths, this.mMVResourceTypes, null, null, 0, 0, this.mvResolution, true, false, null, this.mMVSize, false, null, null, null);
        if (iReInitMV != 0) {
            C2484209oO.LIZJ("VEEditor_VEMVInvoker", "updateMVBackgroundAudioTrack2 failed when reinitMV !!!");
            return iReInitMV;
        }
        this.mVEEditor.LJJJJJ(0.0f, this.mMVBackgroundAudioTrackIndex, 1);
        C2255151DOn c2255151DOn = this.mVEEditor.LLILZIL;
        synchronized (c2255151DOn.LIZ) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("addAudioTrack... ");
                sbLIZ.append(str);
                sbLIZ.append(" In ");
                sbLIZ.append(i);
                sbLIZ.append(" Out ");
                sbLIZ.append(i2);
                sbLIZ.append(" ");
                sbLIZ.append(true);
                C2484209oO.LJIIIIZZ("VEEditor_VESequenceInvoker", C2188811AlT.LIZIZ(sbLIZ));
                if (!TextUtils.isEmpty(str)) {
                    if (i2 > i && i >= 0) {
                        int iAddAudioTrack = c2255151DOn.LIZIZ.addAudioTrack(str, 0, i2 - i, i, i2, true);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("trackIndexNative=");
                        sbLIZ2.append(iAddAudioTrack);
                        C2484209oO.LIZJ("VEEditor_VESequenceInvoker", C2188811AlT.LIZIZ(sbLIZ2));
                        int iLIZ = c2255151DOn.LIZ.LLJJIJI.LIZ(iAddAudioTrack);
                        int i3 = 0;
                        if (!VEConfigCenter.getInstance().getValue("ve_enable_applog_app_and_frequency_control", false).booleanValue()) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("path", str);
                                jSONObject.put("trimIn", i);
                                jSONObject.put("trimOut", i2);
                                if (iLIZ < 0) {
                                    i3 = -1;
                                }
                                jSONObject.put("resultCode", i3);
                                b.LIZIZ("vesdk_event_editor_audio_track", "business", jSONObject, true);
                            } catch (JSONException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("addAudioTrack... ");
                        sbLIZ3.append(iLIZ);
                        C2484209oO.LJIIIIZZ("VEEditor_VESequenceInvoker", C2188811AlT.LIZIZ(sbLIZ3));
                        return iLIZ;
                    }
                    return -100;
                }
                return -100;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC2255101DOi
    public int updateMVResources(String str, String[] strArr, String[] strArr2) {
        C2484209oO.LJIIIIZZ("VEEditor_VEMVInvoker", "updateMVResources");
        return reInitMV(str, strArr, strArr2, null, null, 0, 0, VEMVParams.MVResolution.RES_RANDOM, true, false, null, null, false, null, null, null);
    }

    public int updateMVResourcesRecreateEngine(String str, String[] strArr, String[] strArr2) {
        C2484209oO.LJIIIIZZ("VEEditor_VEMVInvoker", "updateMVResourcesRecreateEngine");
        return reInitMV(str, strArr, strArr2, null, null, 0, 0, VEMVParams.MVResolution.RES_RANDOM, true, false, null, null, true, null, null, null);
    }

    public int changeMvUserVideoInfoInternal(int i, int[] iArr, VEClipTimelineParam[] vEClipTimelineParamArr, VEClipSourceParam[] vEClipSourceParamArr) {
        MVResourceBean mVResourceBean;
        if (this.mMVResVideoInfo == null) {
            C2484209oO.LIZJ("VEEditor_VEMVInvoker", "changeMvUserVideoInfo... mvResInfo was not inited!");
            return -502;
        }
        if ((vEClipTimelineParamArr != null && iArr.length != vEClipTimelineParamArr.length) || (vEClipSourceParamArr != null && iArr.length != vEClipSourceParamArr.length)) {
            C2484209oO.LIZJ("VEEditor_VEMVInvoker", "changeMvUserVideoInfo... Invalid params!");
            return -1;
        }
        for (int i2 = 0; i2 < ((ArrayList) this.mMVResVideoInfo.LIZ).size(); i2++) {
            int i3 = 0;
            for (int i4 : iArr) {
                C2255141DOm c2255141DOm = this.mMVResVideoInfo;
                if (i2 < 0) {
                    c2255141DOm.getClass();
                    mVResourceBean = null;
                } else {
                    mVResourceBean = (MVResourceBean) ListProtector.get(c2255141DOm.LIZ, i2);
                }
                if (mVResourceBean.clipIndex == i4 && mVResourceBean.trackIndex == i) {
                    if (vEClipTimelineParamArr != null) {
                        VEClipTimelineParam vEClipTimelineParam = vEClipTimelineParamArr[i3];
                        mVResourceBean.trimIn = vEClipTimelineParam.trimIn;
                        mVResourceBean.trimOut = vEClipTimelineParam.trimOut;
                    }
                    if (vEClipSourceParamArr != null) {
                        mVResourceBean.content = vEClipSourceParamArr[i3].clipFilePath;
                    }
                    C2255141DOm c2255141DOm2 = this.mMVResVideoInfo;
                    if (i2 < 0) {
                        c2255141DOm2.getClass();
                    } else {
                        ListProtector.set(c2255141DOm2.LIZ, i2, mVResourceBean);
                    }
                }
                i3++;
            }
        }
        return 0;
    }

    public int setExternalAlgorithmResult(String str, String str2, String str3, VEMVAlgorithmConfig.MV_REESULT_IN_TYPE mv_reesult_in_type) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setExternalAlgorithmResult. photoPath = ");
        sbLIZ.append(str);
        sbLIZ.append(", algorithmType = ");
        sbLIZ.append(str2);
        sbLIZ.append(", result = ");
        sbLIZ.append(str3);
        sbLIZ.append(", type = ");
        sbLIZ.append(mv_reesult_in_type);
        C2484209oO.LJIIIIZZ("VEEditor_VEMVInvoker", C2188811AlT.LIZIZ(sbLIZ));
        if (this.mMVPath != null && this.mMVResourcePaths != null && this.mMVResourceTypes != null) {
            return this.mNativeMVHandler.setExternalAlgorithmResult(str, str2, str3, mv_reesult_in_type.ordinal());
        }
        C2484209oO.LIZJ("VEEditor_VEMVInvoker", "setExternalAlgorithmResult error, please call initMV first!");
        throw new IllegalStateException("setExternalAlgorithmResult, initMv is not called!");
    }

    public int initMV(String str, String[] strArr, String[] strArr2, int[] iArr, boolean z) throws Throwable {
        synchronized (this.mVEEditor) {
            try {
                try {
                    return initMVInternal(str, strArr, strArr2, iArr, null, 0, 0, VEMVParams.MVResolution.RES_RANDOM, false, z, null, null, 1.0f, 1.0f, null, null, null, null, null, 0);
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int updateMVResources(String str, String[] strArr, String[] strArr2, int[] iArr, boolean z) {
        C2484209oO.LJIIIIZZ("VEEditor_VEMVInvoker", "updateMVResources");
        return reInitMV(str, strArr, strArr2, iArr, null, 0, 0, VEMVParams.MVResolution.RES_RANDOM, true, z, null, null, false, null, null, null);
    }

    @Override // X.InterfaceC2255101DOi
    public int initMV(String str, String[] strArr, String[] strArr2, String str2, int i, int i2) throws Throwable {
        synchronized (this.mVEEditor) {
            try {
                try {
                    return initMVInternal(str, strArr, strArr2, null, str2, i, i2, VEMVParams.MVResolution.RES_RANDOM, false, false, null, null, 1.0f, 1.0f, null, null, null, null, null, 0);
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private boolean genResourcesArrCycle(MVResourceBean mVResourceBean, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr, int[] iArr5, int i) {
        int i2 = (int) (mVResourceBean.seqOut - mVResourceBean.seqIn);
        if (i <= 0) {
            C2484209oO.LIZJ("VEEditor_VEMVInvoker", "mvDuration invalied ...");
            return false;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i3 + i2;
            if (i5 > i) {
                break;
            }
            iArr[i4] = (int) mVResourceBean.trimIn;
            iArr2[i4] = (int) mVResourceBean.trimOut;
            iArr3[i4] = ((int) mVResourceBean.seqIn) + i3;
            iArr4[i4] = ((int) mVResourceBean.seqOut) + i3;
            strArr[i4] = mVResourceBean.content;
            iArr5[i4] = mVResourceBean.rid;
            i4++;
            i3 = i5;
        }
        if (i3 < i) {
            iArr[i4] = 0;
            iArr2[i4] = i - i3;
            iArr3[i4] = ((int) mVResourceBean.seqIn) + i3;
            iArr4[i4] = i;
            strArr[i4] = mVResourceBean.content;
            iArr5[i4] = mVResourceBean.rid;
            return true;
        }
        return true;
    }

    private boolean genResourcesArrRepeat(MVResourceBean mVResourceBean, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr, int[] iArr5, int i) {
        int i2 = (int) (mVResourceBean.trimOut - mVResourceBean.trimIn);
        int i3 = (int) mVResourceBean.seqIn;
        for (int i4 = 0; i4 < i; i4++) {
            strArr[i4] = mVResourceBean.content;
            iArr5[i4] = mVResourceBean.rid;
            iArr[i4] = (int) mVResourceBean.trimIn;
            iArr2[i4] = (int) mVResourceBean.trimOut;
            iArr3[i4] = i3;
            i3 += i2;
            iArr4[i4] = i3;
        }
        int i5 = i - 1;
        int i6 = (int) mVResourceBean.seqOut;
        iArr4[i5] = i6;
        iArr2[i5] = (i6 - iArr3[i5]) + iArr[i5];
        return true;
    }

    private void genResourcesArr(List<MVResourceBean> list, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr, int[] iArr5, int i, boolean[] zArr) {
        MVResourceBean mVResourceBean;
        int i2 = 0;
        for (MVResourceBean mVResourceBean2 : list) {
            iArr[i2] = (int) mVResourceBean2.trimIn;
            iArr2[i2] = (int) mVResourceBean2.trimOut;
            iArr3[i2] = (int) mVResourceBean2.seqIn;
            iArr4[i2] = (int) mVResourceBean2.seqOut;
            strArr[i2] = mVResourceBean2.content;
            iArr5[i2] = mVResourceBean2.rid;
            zArr[i2] = mVResourceBean2.isMute;
            mVResourceBean2.trackIndex = i;
            mVResourceBean2.clipIndex = i2;
            i2++;
            if (Arrays.asList(this.mMVResourcePaths).contains(mVResourceBean2.content)) {
                int i3 = 0;
                while (true) {
                    if (i3 < ((ArrayList) this.mMVResVideoInfo.LIZ).size()) {
                        C2255141DOm c2255141DOm = this.mMVResVideoInfo;
                        if (i3 < 0) {
                            c2255141DOm.getClass();
                            mVResourceBean = null;
                        } else {
                            mVResourceBean = (MVResourceBean) ListProtector.get(c2255141DOm.LIZ, i3);
                        }
                        if (mVResourceBean.content.equals(mVResourceBean2.content) && mVResourceBean.trackIndex == -1) {
                            C2255141DOm c2255141DOm2 = this.mMVResVideoInfo;
                            if (i3 < 0) {
                                c2255141DOm2.getClass();
                            } else {
                                ListProtector.set(c2255141DOm2.LIZ, i3, mVResourceBean2);
                            }
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
    }

    private int reInitMV(String str, String[] strArr, String[] strArr2, int[] iArr, String str2, int i, int i2, VEMVParams.MVResolution mVResolution, boolean z, boolean z2, String[] strArr3, List<VESize> list, boolean z3, String[] strArr4, int[] iArr2, float[] fArr) throws Throwable {
        synchronized (this.mVEEditor) {
            try {
                C2484209oO.LJI("VEEditor_VEMVInvoker", "reinitMV...");
                try {
                    if (str != null && strArr != null && strArr2 != null) {
                        this.mVEEditor.LJJIJIIJIL(0, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
                        if (z3) {
                            C2249071D1d c2249071D1d = this.mVEEditor.LLJJIJI;
                            c2249071D1d.LIZ = -1;
                            c2249071D1d.LIZIZ = -1;
                            ((ArrayList) c2249071D1d.LIZJ).clear();
                            ((ArrayList) c2249071D1d.LIZLLL).clear();
                            int iReleaseEngine = this.mNativeEditor.releaseEngine();
                            if (iReleaseEngine != 0) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("stop in reInitMV failed, ret = ");
                                sbLIZ.append(iReleaseEngine);
                                C2484209oO.LJI("VEEditor_VEMVInvoker", C2188811AlT.LIZIZ(sbLIZ));
                                return -1;
                            }
                        } else {
                            int iStop = this.mNativeEditor.stop();
                            if (iStop != 0) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("release in reInitMV failed, ret = ");
                                sbLIZ2.append(iStop);
                                C2484209oO.LJI("VEEditor_VEMVInvoker", C2188811AlT.LIZIZ(sbLIZ2));
                                return -1;
                            }
                        }
                        this.mMVBackgroundAudioRid = 0;
                        this.mMVKaraokeAudioTrackIndex = -1;
                        int size = this.mMVFilterIndex.size();
                        int[] iArr3 = new int[size];
                        for (int i3 = 0; i3 < this.mMVFilterIndex.size(); i3++) {
                            iArr3[i3] = this.mMVFilterIndex.get(i3).intValue();
                        }
                        C1DOV c1dov = this.mVEEditor.LLILZ;
                        c1dov.getClass();
                        C2484209oO.LJI("VEEditor_VEFilterInvoker", "deleteFilterEffects...");
                        for (int i4 = 0; i4 < size; i4++) {
                            c1dov.LIZ.LLLLIIL.LIZIZ(0, iArr3[i4]);
                        }
                        c1dov.LIZIZ.removeFilter(iArr3);
                        try {
                            int iInitMVInternal = initMVInternal(str, strArr, strArr2, iArr, str2, i, i2, mVResolution, z, z2, strArr3, list, 1.0f, 1.0f, strArr4, iArr2, fArr, null, null, 0);
                            if (iInitMVInternal != 0) {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("init2 in reInitMV failed, ret = ");
                                sbLIZ3.append(iInitMVInternal);
                                C2484209oO.LIZJ("VEEditor_VEMVInvoker", C2188811AlT.LIZIZ(sbLIZ3));
                                return iInitMVInternal;
                            }
                            this.mNativeEditor.createTimeline();
                            int iPrepareEngine = this.mNativeEditor.prepareEngine(0);
                            this.mNativeEditor.updateTrackFilter(0, 0, false);
                            VEEditor vEEditor = this.mVEEditor;
                            C2255181DOq c2255181DOq = vEEditor.LLILZ.LJII;
                            if (c2255181DOq != null) {
                                vEEditor.LJJIL(c2255181DOq.LIZ);
                            }
                            return iPrepareEngine;
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    } else {
                        C2484209oO.LJI("VEEditor_VEMVInvoker", "reinitMV bad input file, please call init2 first");
                        return -205;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    private int initMVInternal(String str, String[] strArr, String[] strArr2, int[] iArr, String str2, int i, int i2, VEMVParams.MVResolution mVResolution, boolean z, boolean z2, String[] strArr3, List<VESize> list, float f, float f2, String[] strArr4, int[] iArr2, float[] fArr, VESize vESize, VESize vESize2, int i3) {
        int i4;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        VESize[] vESizeArr;
        VESize vESize3 = vESize;
        TEPerfStatsInvoker.nativeReset(1);
        this.mVEEditor.LLLFFI = System.currentTimeMillis();
        this.mVEEditor.LLLFZ = System.currentTimeMillis();
        C2484209oO.LJI("VEEditor_VEMVInvoker", "initMVInternal...");
        this.mNativeEditor.setmMVInitedCallback(this.mMVInitedCallback);
        this.mMVPath = str;
        this.mMVResourcePaths = strArr;
        this.mMVResourceTypes = strArr2;
        this.mvResolution = mVResolution;
        this.mMVSize = list;
        if (strArr4 != null && iArr2 != null && strArr4.length == iArr2.length) {
            i4 = 0;
            for (int i5 : iArr2) {
                i4 += i5;
            }
            z3 = false;
        } else {
            i4 = 0;
            z3 = true;
        }
        if (vESize3 == null) {
            vESize3 = new VESize(-1, -1);
        }
        this.mMVFilterIndex = new ArrayList();
        if (vESize2 != null) {
            this.mVEEditor.LJJJIL(vESize2.width, vESize2.height, i3);
        }
        TEMVInterface tEMVInterface = this.mNativeMVHandler;
        if (this.mVEEditor.LLJZIJLIL != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        MVInfoBean mVInfoBean = (MVInfoBean) tEMVInterface.initMVResources(str, strArr, strArr2, iArr, str2, i, i2, z4, z, z2, strArr3, mVResolution.ordinal(), i4, vESize3.width, vESize3.height);
        this.mvInfo = mVInfoBean;
        if (mVInfoBean == null) {
            C2484209oO.LIZJ("VEEditor_VEMVInvoker", "initMVInternal failed");
            return -1;
        }
        this.mMVResVideoInfo = new C2255141DOm();
        for (MVResourceBean mVResourceBean : this.mvInfo.resources) {
            if (Arrays.asList(this.mMVResourcePaths).contains(mVResourceBean.content)) {
                ((ArrayList) this.mMVResVideoInfo.LIZ).add(mVResourceBean);
            }
        }
        this.mIsMVInit = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<List<List<MVResourceBean>>> listGenMVResourceTracks = genMVResourceTracks(this.mvInfo, arrayList, arrayList2);
        if (listGenMVResourceTracks.size() != 0) {
            List<List<MVResourceBean>> list2 = (List) ListProtector.get(listGenMVResourceTracks, 0);
            if (list2.size() != 0) {
                int size = ((List) ListProtector.get(list2, 0)).size();
                int[] iArr3 = new int[size];
                int[] iArr4 = new int[size];
                int[] iArr5 = new int[size];
                int[] iArr6 = new int[size];
                String[] strArr5 = new String[size];
                int[] iArr7 = new int[size];
                genResourcesArr((List) ListProtector.get(list2, 0), iArr3, iArr4, iArr5, iArr6, strArr5, iArr7, 0, new boolean[size]);
                int i6 = 1;
                List list3 = (List) ListProtector.get(listGenMVResourceTracks, 1);
                EnumC1464490oDH enumC1464490oDH = EnumC1464490oDH.VIDEO_OUT_RATIO_ORIGINAL;
                MVInfoBean mVInfoBean2 = this.mvInfo;
                float f3 = ((mVInfoBean2.width * 1.0f) / mVInfoBean2.height) * 1.0f;
                if (f3 == 1.0f) {
                    enumC1464490oDH = EnumC1464490oDH.VIDEO_OUT_RATIO_1_1;
                } else if (f3 == 0.75f) {
                    enumC1464490oDH = EnumC1464490oDH.VIDEO_OUT_RATIO_3_4;
                } else if (f3 == 1.3333334f) {
                    enumC1464490oDH = EnumC1464490oDH.VIDEO_OUT_RATIO_4_3;
                } else if (f3 == 1.7777778f) {
                    enumC1464490oDH = EnumC1464490oDH.VIDEO_OUT_RATIO_16_9;
                } else if (f3 == 0.5625f) {
                    enumC1464490oDH = EnumC1464490oDH.VIDEO_OUT_RATIO_9_16;
                }
                int iInitVideoEditor2 = this.mNativeMVHandler.initVideoEditor2(strArr5, iArr3, iArr4, iArr5, iArr6, null, null, null, null, null, iArr7, null, null, null, enumC1464490oDH.ordinal(), z3);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("mvPath", str);
                    jSONObject.put("resourcesFilePaths", Arrays.toString(strArr));
                    jSONObject.put("resourcesTypes", Arrays.toString(strArr2));
                    jSONObject.put("bgmPath", str2);
                    jSONObject.put("bgmTrimIn", i);
                    jSONObject.put("bgmTrimOut", i2);
                    jSONObject.put("resultCode", iInitVideoEditor2);
                    b.LIZIZ("vesdk_event_editor_init_mv", "business", jSONObject, true);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (iInitVideoEditor2 != 0) {
                    C2484209oO.LIZJ("VEEditor_VEMVInvoker", "Create Scene failed, ret = " + iInitVideoEditor2);
                    this.mVEEditor.getClass();
                    this.mVEEditor.LLLILZJ = false;
                    return iInitVideoEditor2;
                }
                boolean z8 = false;
                boolean z9 = true;
                int i7 = 1;
                for (List<MVResourceBean> list4 : list2) {
                    if (z9) {
                        z9 = false;
                    } else {
                        int size2 = list4.size();
                        if (z2 && list4.size() == i6 && ((MVResourceBean) ListProtector.get(list4, z8 ? 1 : 0)).isLoop == i6) {
                            size2 = iArr[z8 ? 1 : 0] / ((int) (((MVResourceBean) ListProtector.get(list4, z8 ? 1 : 0)).trimOut - ((MVResourceBean) ListProtector.get(list4, z8 ? 1 : 0)).trimIn));
                            if (iArr[z8 ? 1 : 0] % ((int) (((MVResourceBean) ListProtector.get(list4, z8 ? 1 : 0)).trimOut - ((MVResourceBean) ListProtector.get(list4, z8 ? 1 : 0)).trimIn)) != 0) {
                                size2++;
                            }
                        }
                        if (((MVResourceBean) ListProtector.get(list4, z8 ? 1 : 0)).timeMode == 4) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (((MVResourceBean) ListProtector.get(list4, z8 ? 1 : 0)).timeMode == 5) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (z6) {
                            size2 = (int) Math.ceil((((MVResourceBean) ListProtector.get(list4, z8 ? 1 : 0)).seqOut - ((MVResourceBean) ListProtector.get(list4, z8 ? 1 : 0)).seqIn) / (((MVResourceBean) ListProtector.get(list4, z8 ? 1 : 0)).trimOut - ((MVResourceBean) ListProtector.get(list4, z8 ? 1 : 0)).trimIn));
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("initMV, video repeat in. counts = ");
                            sbLIZ.append(size2);
                            sbLIZ.append(", seqOut = ");
                            sbLIZ.append(((MVResourceBean) ListProtector.get(list4, 0)).seqOut);
                            sbLIZ.append(", seqIn = ");
                            sbLIZ.append(((MVResourceBean) ListProtector.get(list4, 0)).seqIn);
                            sbLIZ.append(", trimOut = ");
                            sbLIZ.append(((MVResourceBean) ListProtector.get(list4, 0)).trimOut);
                            sbLIZ.append(", trimIn = ");
                            sbLIZ.append(((MVResourceBean) ListProtector.get(list4, 0)).trimIn);
                            C2484209oO.LJI("VEEditor_VEMVInvoker", C2188811AlT.LIZIZ(sbLIZ));
                        }
                        if (z7) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("initMV, video stretch in. seqOut = ");
                            sbLIZ2.append(((MVResourceBean) ListProtector.get(list4, 0)).seqOut);
                            sbLIZ2.append(", seqIn = ");
                            sbLIZ2.append(((MVResourceBean) ListProtector.get(list4, 0)).seqIn);
                            sbLIZ2.append(", trimOut = ");
                            sbLIZ2.append(((MVResourceBean) ListProtector.get(list4, 0)).trimOut);
                            sbLIZ2.append(", trimIn = ");
                            sbLIZ2.append(((MVResourceBean) ListProtector.get(list4, 0)).trimIn);
                            C2484209oO.LJI("VEEditor_VEMVInvoker", C2188811AlT.LIZIZ(sbLIZ2));
                        }
                        int[] iArr8 = new int[size2];
                        int[] iArr9 = new int[size2];
                        int[] iArr10 = new int[size2];
                        int[] iArr11 = new int[size2];
                        boolean[] zArr = new boolean[size2];
                        String[] strArr6 = new String[size2];
                        int[] iArr12 = new int[size2];
                        if (z2 && list4.size() == 1 && ((MVResourceBean) ListProtector.get(list4, 0)).isLoop == 1) {
                            if (!genResourcesArrCycle((MVResourceBean) ListProtector.get(list4, 0), iArr8, iArr9, iArr10, iArr11, strArr6, iArr12, iArr[0])) {
                                return -1;
                            }
                        } else if (z6) {
                            genResourcesArrRepeat((MVResourceBean) ListProtector.get(list4, 0), iArr8, iArr9, iArr10, iArr11, strArr6, iArr12, size2);
                        } else {
                            genResourcesArr(list4, iArr8, iArr9, iArr10, iArr11, strArr6, iArr12, i7, zArr);
                        }
                        if (list != null && list.size() != 0) {
                            this.mVEEditor.getClass();
                            ArrayList arrayList3 = new ArrayList();
                            for (int i8 = 0; i8 < size2; i8++) {
                                String str3 = strArr6[i8];
                                int i9 = 0;
                                while (true) {
                                    if (i9 >= strArr.length) {
                                        break;
                                    }
                                    if (str3.equals(strArr[i9])) {
                                        arrayList3.add(ListProtector.get(list, i9));
                                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                        sbLIZ3.append(strArr[i9]);
                                        sbLIZ3.append("... (");
                                        sbLIZ3.append(((VESize) ListProtector.get(list, i9)).width);
                                        sbLIZ3.append(", ");
                                        sbLIZ3.append(((VESize) ListProtector.get(list, i9)).height);
                                        sbLIZ3.append(")");
                                        C2484209oO.LIZJ("VEEditor", C2188811AlT.LIZIZ(sbLIZ3));
                                        break;
                                    }
                                    i9++;
                                }
                            }
                            vESizeArr = (VESize[]) arrayList3.toArray(new VESize[0]);
                        } else {
                            vESizeArr = null;
                        }
                        this.mNativeMVHandler.addVideoTrackForMV(strArr6, null, iArr10, iArr11, iArr8, iArr9, iArr12, mVResolution.ordinal(), vESizeArr, 0, zArr, f2);
                        i7++;
                        i6 = 1;
                        z8 = false;
                        z9 = false;
                    }
                }
                Iterator it2 = list3.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (i4 > 0) {
                            C2484209oO.LIZJ("VEEditor_VEMVInvoker", "karaoke not support other audio tracks.");
                            break;
                        }
                        List list5 = (List) it2.next();
                        if (list5.size() != 0) {
                            int i10 = (int) ((MVResourceBean) ListProtector.get(list5, z8 ? 1 : 0)).trimIn;
                            int i11 = (int) ((MVResourceBean) ListProtector.get(list5, z8 ? 1 : 0)).trimOut;
                            int i12 = (int) ((MVResourceBean) ListProtector.get(list5, z8 ? 1 : 0)).seqIn;
                            int i13 = (int) ((MVResourceBean) ListProtector.get(list5, z8 ? 1 : 0)).seqOut;
                            int i14 = (int) ((MVResourceBean) ListProtector.get(list5, z8 ? 1 : 0)).musicFadeIn;
                            int i15 = (int) ((MVResourceBean) ListProtector.get(list5, z8 ? 1 : 0)).musicFadeOut;
                            String str4 = ((MVResourceBean) ListProtector.get(list5, z8 ? 1 : 0)).content;
                            if (((MVResourceBean) ListProtector.get(list5, z8 ? 1 : 0)).isLoop > 0) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            int i16 = ((MVResourceBean) ListProtector.get(list5, z8 ? 1 : 0)).rid;
                            int iAddAudioTrackForMV = this.mNativeMVHandler.addAudioTrackForMV(str4, i12, i13, i10, i11, i16, z5, f);
                            if (i16 == this.mMVBackgroundAudioRid) {
                                this.mMVBackgroundAudioTrackIndex = iAddAudioTrackForMV;
                                if (i14 > 0 || i15 > 0) {
                                    VEAudioFadeFilterParam vEAudioFadeFilterParam = new VEAudioFadeFilterParam();
                                    vEAudioFadeFilterParam.fadeInLength = i14;
                                    vEAudioFadeFilterParam.fadeOutLength = i15;
                                    int iLJFF = this.mVEEditor.LJFF(1, this.mMVBackgroundAudioTrackIndex, vEAudioFadeFilterParam, i12, i13);
                                    if (iLJFF >= 0) {
                                        this.mVEEditor.LJJJJZ(iLJFF, vEAudioFadeFilterParam);
                                        VEEditor vEEditor = this.mVEEditor;
                                        InterfaceC2255101DOi interfaceC2255101DOi = vEEditor.LL;
                                        if (interfaceC2255101DOi != null && interfaceC2255101DOi.isMVInitialedInternal()) {
                                            vEEditor.LL.addMVFilterInternal(iLJFF);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (i4 > 0) {
                        break;
                    }
                }
                this.mMVKaraokeAudioTrackIndex = this.mNativeEditor.addAudioTrackForClips(strArr4, new int[strArr4.length], iArr2, fArr);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("initMVInternal karaoke audio track index:");
                sbLIZ4.append(this.mMVKaraokeAudioTrackIndex);
                C2484209oO.LJI("VEEditor_VEMVInvoker", C2188811AlT.LIZIZ(sbLIZ4));
                VEEditor vEEditor2 = this.mVEEditor;
                vEEditor2.LLLILZJ = true;
                vEEditor2.LLLIILIL = enumC1464490oDH;
                VEEditorResManager vEEditorResManager = vEEditor2.LLILZLL;
                vEEditorResManager.mAudioPaths = new String[arrayList2.size()];
                vEEditorResManager.mVideoPaths = new String[arrayList2.size()];
                arrayList2.toArray(vEEditorResManager.mAudioPaths);
                arrayList.toArray(vEEditorResManager.mVideoPaths);
                vEEditorResManager.mTransitions = null;
                vEEditorResManager.mOriginalSoundTrackType = z8 ? 1 : 0;
                vEEditorResManager.mOriginalSoundTrackIndex = z8 ? 1 : 0;
                vEEditorResManager.mReverseDone = z8;
                this.mVEEditor.LLILZ.getClass();
                VEEditor vEEditor3 = this.mVEEditor;
                vEEditor3.LLJLILLLLZIIL = Boolean.FALSE;
                vEEditor3.LLJLL = z8 ? 1 : 0;
                TEInterface tEInterface = this.mNativeEditor;
                MVInfoBean mVInfoBean3 = this.mvInfo;
                tEInterface.setWidthHeight(mVInfoBean3.width, mVInfoBean3.height);
                long jCurrentTimeMillis = System.currentTimeMillis() - this.mVEEditor.LLLFFI;
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("initMVInternal success with cost:");
                sbLIZ5.append(jCurrentTimeMillis);
                C2484209oO.LJIIIIZZ("VEEditor_VEMVInvoker", C2188811AlT.LIZIZ(sbLIZ5));
                this.mVEEditor.LLILZ.LIZ();
                return z8 ? 1 : 0;
            }
            throw new VEException(-1, "No MV video information.");
        }
        throw new VEException(-1, "No MV information.");
    }
}
