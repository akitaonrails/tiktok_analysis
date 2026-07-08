package com.ss.android.ugc.aweme.publish.model;

import X.AbstractC2126608Uu;
import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC2126708Uv;

/* JADX INFO: loaded from: classes35.dex */
public class UploadVideoConfig extends AbstractC2126608Uu {

    @C09CT("aiCutAppKey")
    public String aiCutAppKey;

    @C09CT("aiCutAuthorization")
    public String aiCutAuthorization;

    @C09CT("appKey")
    @InterfaceC2126708Uv
    public String appKey;

    @C09CT("authorization")
    @InterfaceC2126708Uv
    public String authorization;

    @C09CT("authorization2")
    public STSAuthConfig authorizationV2;

    @C09CT("upload_backup_network_type")
    public int backupNetworkType;

    @C09CT("captionAppKey")
    public String captionAppKey;

    @C09CT("captionAuthorization")
    public String captionAuthorization;

    @C09CT("captionAuthorization2")
    public STSAuthConfig captionAuthorization2;

    @C09CT("enable_client_network_judgement")
    public boolean enableClientNetworkJudgement;

    @C09CT("enableExternDNS")
    public int enableExternDNS;

    @C09CT("enableExternNet")
    public int enableExternNet;

    @C09CT("enableMutitask")
    public int enableMutitask;

    @C09CT("enablePostMethod")
    public int enablePostMethod;

    @C09CT("enableQuic")
    public int enableQuic;

    @C09CT("enableTTNetDNS")
    public int enableTTNetDNS;

    @C09CT("enable_tt_uploader_ev_state")
    public boolean enableTTUploaderEvState;

    @C09CT("enable_tt_uploader_log_callback")
    public boolean enableTTUploaderLogCallback;

    @C09CT("fileHostName")
    @InterfaceC2126708Uv
    public String fileHostName;

    @C09CT("is_stream_upload_enable")
    public int isStreamUploadEnable;

    @C09CT("live_photo_authorization2")
    public STSAuthConfig livephotoAuthorization2;

    @C09CT("upload_main_network_type")
    public int mainNetworkType;

    @C09CT("maxFailTime")
    public int maxFailTime;

    @C09CT("sliceRetryCount")
    public int sliceRetryCount;

    @C09CT("sliceSize")
    public int sliceSize;

    @C09CT("sliceTimeout")
    public int sliceTimeout;

    @C09CT("testSpeedAppKey")
    public String testSpeedAppKey;

    @C09CT("testSpeedAuthorization")
    public String testSpeedAuthorization;

    @C09CT("testSpeedAuthorization2")
    public STSAuthConfig testSpeedAuthorization2;

    @C09CT("ttnetConfigValue")
    public int ttnetConfigValue;

    @C09CT("uploadRegion")
    public String uploadRegion;

    @C09CT("userStoreRegion")
    public String userStoreRegion;

    @C09CT("videoHostName")
    @InterfaceC2126708Uv
    public String videoHostName;

    @C09CT("fileRetryCount")
    public int fileRetryCount = 1;

    @C09CT("enableHttps")
    public int enableHttps = 1;

    @C09CT("aliveMaxFailTime")
    public int aliveMaxFailTime = 6;

    @C09CT("openTimeOut")
    public int openTimeOut = 5000;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadVideoConfig{appKey='");
        sbLIZ.append(this.appKey);
        sbLIZ.append('\'');
        sbLIZ.append(", fileHostName='");
        sbLIZ.append(this.fileHostName);
        sbLIZ.append('\'');
        sbLIZ.append(", videoHostName='");
        sbLIZ.append(this.videoHostName);
        sbLIZ.append('\'');
        sbLIZ.append(", sliceTimeout=");
        sbLIZ.append(this.sliceTimeout);
        sbLIZ.append(", sliceRetryCount=");
        sbLIZ.append(this.sliceRetryCount);
        sbLIZ.append(", sliceSize=");
        sbLIZ.append(this.sliceSize);
        sbLIZ.append(", fileRetryCount=");
        sbLIZ.append(this.fileRetryCount);
        sbLIZ.append(", maxFailTime=");
        sbLIZ.append(this.maxFailTime);
        sbLIZ.append(", authorization='");
        sbLIZ.append(this.authorization);
        sbLIZ.append('\'');
        sbLIZ.append(", enableHttps=");
        sbLIZ.append(this.enableHttps);
        sbLIZ.append(", enableExternDNS=");
        sbLIZ.append(this.enableExternDNS);
        sbLIZ.append(", aliveMaxFailTime=");
        sbLIZ.append(this.aliveMaxFailTime);
        sbLIZ.append(", enableTTNetDNS=");
        sbLIZ.append(this.enableTTNetDNS);
        sbLIZ.append(", enablePostMethod=");
        sbLIZ.append(this.enablePostMethod);
        sbLIZ.append(", openTimeOut=");
        sbLIZ.append(this.openTimeOut);
        sbLIZ.append(", uploadRegion='");
        sbLIZ.append(this.uploadRegion);
        sbLIZ.append('\'');
        sbLIZ.append(", enableExternNet=");
        sbLIZ.append(this.enableExternNet);
        sbLIZ.append(", enableQuic=");
        sbLIZ.append(this.enableQuic);
        sbLIZ.append(", enableMutitask=");
        sbLIZ.append(this.enableMutitask);
        sbLIZ.append(", ttnetConfigValue=");
        sbLIZ.append(this.ttnetConfigValue);
        sbLIZ.append(", enableTTUploaderLogCallback=");
        sbLIZ.append(this.enableTTUploaderLogCallback);
        sbLIZ.append(", isStreamUploadEnable=");
        sbLIZ.append(this.isStreamUploadEnable);
        sbLIZ.append(", enableClientNetworkJudgement=");
        sbLIZ.append(this.enableClientNetworkJudgement);
        sbLIZ.append(", testSpeedAppKey='");
        sbLIZ.append(this.testSpeedAppKey);
        sbLIZ.append('\'');
        sbLIZ.append(", testSpeedAuthorization='");
        sbLIZ.append(this.testSpeedAuthorization);
        sbLIZ.append('\'');
        sbLIZ.append(", captionAppKey='");
        sbLIZ.append(this.captionAppKey);
        sbLIZ.append('\'');
        sbLIZ.append(", captionAuthorization='");
        sbLIZ.append(this.captionAuthorization);
        sbLIZ.append('\'');
        sbLIZ.append(", aiCutAuthorization='");
        sbLIZ.append(this.aiCutAuthorization);
        sbLIZ.append('\'');
        sbLIZ.append(", aiCutAppKey='");
        sbLIZ.append(this.aiCutAppKey);
        sbLIZ.append('\'');
        sbLIZ.append(", authorization2=");
        sbLIZ.append(this.authorizationV2);
        sbLIZ.append('\'');
        sbLIZ.append(", captionAuthorization2=");
        sbLIZ.append(this.captionAuthorization2);
        sbLIZ.append('\'');
        sbLIZ.append(", testSpeedAuthorization2=");
        sbLIZ.append(this.testSpeedAuthorization2);
        sbLIZ.append('\'');
        sbLIZ.append(", mainNetworkType='");
        sbLIZ.append(this.mainNetworkType);
        sbLIZ.append('\'');
        sbLIZ.append(", backupNetworkType='");
        sbLIZ.append(this.backupNetworkType);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
