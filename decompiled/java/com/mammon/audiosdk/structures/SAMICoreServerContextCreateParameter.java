package com.mammon.audiosdk.structures;

import X.C2188811AlT;
import X.C386801es;
import com.mammon.audiosdk.SAMICore;
import com.mammon.audiosdk.enums.SAMICoreTokenType;
import java.util.Arrays;

/* JADX INFO: loaded from: classes35.dex */
public class SAMICoreServerContextCreateParameter {
    public String appKey;
    public long timeStamp;
    public String token;
    public SAMICoreTokenType tokenType;
    public String url;

    public int getTokenType() {
        SAMICoreTokenType sAMICoreTokenType = this.tokenType;
        if (sAMICoreTokenType != null) {
            return sAMICoreTokenType.getValue();
        }
        System.out.println("tokenType is null, return 0 as fallback!");
        return 0;
    }

    public void syncRequest(SAMICoreResponseSyncListener sAMICoreResponseSyncListener) {
        sAMICoreResponseSyncListener.onStart();
        SAMICore sAMICore = new SAMICore();
        SAMICoreRequestConfig sAMICoreRequestConfigCreateRequestParam = SAMICoreRequestConfigManager.getInstance().createRequestParam(this);
        if (sAMICoreRequestConfigCreateRequestParam == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Not support!");
            sbLIZ.append(getClass());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            System.out.println(strLIZIZ);
            sAMICoreResponseSyncListener.onFinished(createResponse(C386801es.DEFAULT, strLIZIZ, null));
            return;
        }
        int iSAMICoreCreateHandleByIdentify = sAMICore.SAMICoreCreateHandleByIdentify(sAMICoreRequestConfigCreateRequestParam.handleByIdentify, this);
        if (iSAMICoreCreateHandleByIdentify != 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Create speechToSong handle failed, ret ");
            sbLIZ2.append(iSAMICoreCreateHandleByIdentify);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            System.out.println(strLIZIZ2);
            sAMICoreResponseSyncListener.onFinished(createResponse(iSAMICoreCreateHandleByIdentify, strLIZIZ2, null));
            return;
        }
        SAMICoreBlock sAMICoreBlock = new SAMICoreBlock();
        sAMICoreBlock.dataType = sAMICoreRequestConfigCreateRequestParam.sAMICorePropertyDataType;
        sAMICoreBlock.numberAudioData = 1;
        sAMICoreBlock.audioData = new String[]{new String()};
        int iSAMICoreProcess = sAMICore.SAMICoreProcess(null, sAMICoreBlock);
        if (iSAMICoreProcess == 0) {
            String string = Arrays.toString(sAMICoreBlock.audioData);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("[mammon]SpeechToSong result: ");
            sbLIZ3.append(string);
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
            System.out.println(strLIZIZ3);
            sAMICoreResponseSyncListener.onFinished(createResponse(iSAMICoreProcess, strLIZIZ3, string));
            sAMICore.SAMICoreDestroyHandle();
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("Process speechToSong failed, ret ");
        sbLIZ4.append(iSAMICoreProcess);
        String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ4);
        System.out.println(strLIZIZ4);
        sAMICoreResponseSyncListener.onFinished(createResponse(iSAMICoreProcess, strLIZIZ4, null));
        sAMICore.SAMICoreDestroyHandle();
    }

    private SAMICoreResponse createResponse(int i, String str, String str2) {
        SAMICoreResponse sAMICoreResponse = new SAMICoreResponse();
        sAMICoreResponse.errorCode = i;
        sAMICoreResponse.errorMsg = str;
        sAMICoreResponse.data = str2;
        return sAMICoreResponse;
    }
}
