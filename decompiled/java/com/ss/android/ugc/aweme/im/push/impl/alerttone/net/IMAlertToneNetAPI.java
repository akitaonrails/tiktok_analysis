package com.ss.android.ugc.aweme.im.push.impl.alerttone.net;

import X.C891060YxU;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.push.api.alerttone.model.GetAlertToneResponse;
import com.ss.android.ugc.aweme.im.push.api.alerttone.model.IMAudioResourceBody;
import com.ss.android.ugc.aweme.im.push.api.alerttone.model.IMAudioResourceResponse;
import com.ss.android.ugc.aweme.im.push.api.alerttone.model.UpdateAlertToneRequest;

/* JADX INFO: loaded from: classes15.dex */
public interface IMAlertToneNetAPI {
    public static final C891060YxU LIZ = C891060YxU.LIZ;

    @InterfaceC1501160pAQ("/tiktok/v1/im/dm_management/message_alert/get")
    @InterfaceC1501310pAf({"Content-Type: application/json"})
    Object getAlertToneConfig(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) Integer num, @InterfaceC1501070pAH("extra") String str, InterfaceC1364105Vn<? super GetAlertToneResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/v1/im/public/resource/audio_get")
    @InterfaceC1501310pAf({"Content-Type: application/json"})
    Object getAudioResourceUrl(@InterfaceC1485405rg IMAudioResourceBody iMAudioResourceBody, InterfaceC1364105Vn<? super IMAudioResourceResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/v1/im/b2c/dm_management/message_alert/get")
    @InterfaceC1501310pAf({"Content-Type: application/json"})
    Object getBusinessAlert(InterfaceC1364105Vn<? super GetAlertToneResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/v1/im/dm_management/message_alert/update")
    @InterfaceC1501310pAf({"Content-Type: application/json"})
    Object updateAlertTone(@InterfaceC1485405rg UpdateAlertToneRequest updateAlertToneRequest, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/tiktok/v1/im/b2c/dm_management/message_alert/update")
    @InterfaceC1501310pAf({"Content-Type: application/json"})
    Object updateBusinessAlert(@InterfaceC1485405rg UpdateAlertToneRequest updateAlertToneRequest, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);
}
