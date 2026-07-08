package com.mammon.audiosdk;

import android.content.Context;
import com.bytedance.speech.speechaudio.SpeechAudioLoader;
import com.mammon.audiosdk.bridge.SAMICoreBridge;
import com.mammon.audiosdk.enums.SAMICoreContextType;
import com.mammon.audiosdk.enums.SAMICoreIdentify;
import com.mammon.audiosdk.enums.SAMICorePropertyId;
import com.mammon.audiosdk.structures.SAMICoreAbCallback;
import com.mammon.audiosdk.structures.SAMICoreBlock;
import com.mammon.audiosdk.structures.SAMICoreProperty;
import com.mammon.audiosdk.structures.SAMICoreTokenVerifyOfflineParameter;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes35.dex */
public class SAMICore {
    public static SAMICoreBridge globalBridge;
    public static boolean isInitContext;
    public static Lock lock;
    public SAMICoreAbCallback abCallback;
    public SAMICoreIdentify identify;
    public SAMICoreBridge bridge = SpeechAudioLoader.getInstance().createSAMICoreBridge();
    public long resourceHandle = 0;
    public int[] retAarry = {100000};

    public static int InitTTNetDynamicContext() {
        return (int) globalBridge.Native_SAMICoreInitContext(SAMICoreContextType.TTNETDynamicInit.getValue(), null);
    }

    public int SAMICoreDestroyHandle() {
        int iNative_SAMICoreDestroyHandle = this.bridge.Native_SAMICoreDestroyHandle(this.resourceHandle);
        this.resourceHandle = 0L;
        return iNative_SAMICoreDestroyHandle;
    }

    static {
        SpeechAudioLoader.getInstance().load();
        globalBridge = SpeechAudioLoader.getInstance().createSAMICoreBridge();
        lock = new ReentrantLock();
        isInitContext = false;
    }

    public long getHandle() {
        return this.resourceHandle;
    }

    public int SAMICoreProcessAsync(SAMICoreBlock sAMICoreBlock) {
        return this.bridge.Native_SAMICoreProcessAsync(this.resourceHandle, this.identify.getValue(), sAMICoreBlock);
    }

    public void setListener(SAMICoreCallBackListener sAMICoreCallBackListener) {
        this.bridge.setListener(sAMICoreCallBackListener);
    }

    public static void ReleaseContext(Context context, SAMICoreContextType sAMICoreContextType) {
        lock.lock();
        if (isInitContext) {
            globalBridge.Native_SAMICoreReleaseContext(sAMICoreContextType.getValue());
            isInitContext = false;
        }
        lock.unlock();
    }

    public int SAMICoreCreateHandleByIdentify(SAMICoreIdentify sAMICoreIdentify, Object obj) {
        this.identify = sAMICoreIdentify;
        this.retAarry[0] = 100000;
        this.resourceHandle = this.bridge.Native_SAMICoreCreateHandleByIdentify(sAMICoreIdentify.getValue(), obj, this.retAarry);
        return this.retAarry[0];
    }

    public int SAMICoreGetPropertyById(SAMICorePropertyId sAMICorePropertyId, SAMICoreProperty sAMICoreProperty) {
        return this.bridge.Native_SAMICoreGetPropertyById(this.resourceHandle, sAMICorePropertyId.getValue(), sAMICoreProperty);
    }

    public int SAMICoreProcess(SAMICoreBlock sAMICoreBlock, SAMICoreBlock sAMICoreBlock2) {
        return this.bridge.Native_SAMICoreProcess(this.resourceHandle, this.identify.getValue(), sAMICoreBlock, sAMICoreBlock2);
    }

    public int SAMICoreSetProperty(SAMICorePropertyId sAMICorePropertyId, SAMICoreProperty sAMICoreProperty) {
        long j = this.resourceHandle;
        if (j != 0) {
            return this.bridge.Native_SAMICoreSetProperty(j, sAMICorePropertyId.getValue(), sAMICoreProperty);
        }
        return 100002;
    }

    public static int InitContext(Context context, String str, SAMICoreContextType sAMICoreContextType, String str2) {
        int i;
        long jNative_SAMICoreInitContext;
        lock.lock();
        SAMICoreContextType sAMICoreContextType2 = SAMICoreContextType.SAMICoreContextType_AbConfig;
        if (sAMICoreContextType != sAMICoreContextType2) {
            SAMICoreTokenVerifyOfflineParameter sAMICoreTokenVerifyOfflineParameter = new SAMICoreTokenVerifyOfflineParameter();
            sAMICoreTokenVerifyOfflineParameter.appKey = str;
            sAMICoreTokenVerifyOfflineParameter.token = str2;
            sAMICoreTokenVerifyOfflineParameter.extra = null;
            jNative_SAMICoreInitContext = globalBridge.Native_SAMICoreInitContext(sAMICoreContextType.getValue(), sAMICoreTokenVerifyOfflineParameter);
        } else if (sAMICoreContextType == sAMICoreContextType2) {
            jNative_SAMICoreInitContext = globalBridge.Native_SAMICoreInitContext(sAMICoreContextType.getValue(), null);
        } else {
            i = 0;
            isInitContext = true;
            lock.unlock();
            return i;
        }
        i = (int) jNative_SAMICoreInitContext;
        if (i == 0) {
            isInitContext = true;
        }
        lock.unlock();
        return i;
    }
}
