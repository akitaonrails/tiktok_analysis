package com.mammon.audiosdk.structures;

import com.mammon.audiosdk.enums.SAMICoreDataType;
import com.mammon.audiosdk.enums.SAMICoreIdentify;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes35.dex */
public class SAMICoreRequestConfigManager {
    public Map<Class, Integer> clzMap;
    public Map<Integer, SAMICoreRequestConfig> configMap;

    public static class Holder {
        public static final SAMICoreRequestConfigManager INSTANCE = new SAMICoreRequestConfigManager();
    }

    private void registerClz() {
        this.clzMap.put(SAMICoreSpeechToSongContextCreateParameter.class, Integer.valueOf(SAMICoreIdentify.SAMICoreIdentify_SpeechToSong_Online.getValue()));
    }

    private void registerConfig() {
        SAMICoreRequestConfig sAMICoreRequestConfig = new SAMICoreRequestConfig();
        SAMICoreIdentify sAMICoreIdentify = SAMICoreIdentify.SAMICoreIdentify_SpeechToSong_Online;
        sAMICoreRequestConfig.handleByIdentify = sAMICoreIdentify;
        sAMICoreRequestConfig.sAMICorePropertyDataType = SAMICoreDataType.SAMICoreDataType_String;
        this.configMap.put(Integer.valueOf(sAMICoreIdentify.getValue()), sAMICoreRequestConfig);
    }

    public SAMICoreRequestConfigManager() {
        this.configMap = new HashMap();
        this.clzMap = new HashMap();
        registerConfig();
        registerClz();
    }

    public static SAMICoreRequestConfigManager getInstance() {
        return Holder.INSTANCE;
    }

    public SAMICoreRequestConfig createRequestParam(SAMICoreServerContextCreateParameter sAMICoreServerContextCreateParameter) {
        if (sAMICoreServerContextCreateParameter instanceof SAMICoreSpeechToSongContextCreateParameter) {
            return this.configMap.get(this.clzMap.get(sAMICoreServerContextCreateParameter.getClass()));
        }
        return null;
    }
}
