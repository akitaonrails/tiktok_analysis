package com.ss.android.ugc.aweme.tako.router.model;

import X.C09CT;
import X.C2188811AlT;
import X.EnumC20234414Fi;
import com.ss.android.ugc.aweme.tako.model.TakoEntranceRequestInfo;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoAutoSendData implements Serializable {
    public static final int $stable = 8;

    @C09CT("image_path_list")
    public List<String> imagePathList;

    @C09CT("interaction_type")
    public String interactionType;

    @C09CT("message_text")
    public String messageText;

    @C09CT("mob_params")
    public Map<String, String> mobParams;

    @C09CT("auto_send_request_info")
    public TakoEntranceRequestInfo requestInfo;

    @C09CT("send_type")
    public EnumC20234414Fi sendType;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoAutoSendData(messageText=");
        sbLIZ.append(this.messageText);
        sbLIZ.append(", interactionType=");
        sbLIZ.append(this.interactionType);
        sbLIZ.append(", imagePathList=");
        sbLIZ.append(this.imagePathList);
        sbLIZ.append(", sendType=");
        sbLIZ.append(this.sendType);
        sbLIZ.append(", mobParams=");
        sbLIZ.append(this.mobParams);
        sbLIZ.append(", requestInfo=");
        sbLIZ.append(this.requestInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setImagePathList(List<String> list) {
        this.imagePathList = list;
    }

    public final void setInteractionType(String str) {
        this.interactionType = str;
    }

    public final void setMessageText(String str) {
        this.messageText = str;
    }

    public final void setMobParams(Map<String, String> map) {
        this.mobParams = map;
    }

    public final void setRequestInfo(TakoEntranceRequestInfo takoEntranceRequestInfo) {
        this.requestInfo = takoEntranceRequestInfo;
    }

    public final void setSendType(EnumC20234414Fi enumC20234414Fi) {
        this.sendType = enumC20234414Fi;
    }

    public TakoAutoSendData(String str, String str2, List<String> list, EnumC20234414Fi enumC20234414Fi, Map<String, String> map, TakoEntranceRequestInfo takoEntranceRequestInfo) {
        this.messageText = str;
        this.interactionType = str2;
        this.imagePathList = list;
        this.sendType = enumC20234414Fi;
        this.mobParams = map;
        this.requestInfo = takoEntranceRequestInfo;
    }
}
