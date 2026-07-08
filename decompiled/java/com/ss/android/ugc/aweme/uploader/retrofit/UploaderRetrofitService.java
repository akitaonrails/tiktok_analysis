package com.ss.android.ugc.aweme.uploader.retrofit;

import X.InterfaceC1364105Vn;
import X.InterfaceC1485505rh;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501190pAT;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501320pAg;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public interface UploaderRetrofitService {
    @InterfaceC1501240pAY("/aweme/v1/upload/authkey/")
    @InterfaceC1485505rh
    Object LIZ(@InterfaceC1501190pAT Map<String, String> map, InterfaceC1364105Vn<? super UploadAuthKeyConfig> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/material/resource/api/ugc_video_template/token")
    @InterfaceC1485505rh
    ListenableFuture<UploadAuthKeyConfig> getUgcTemplateUploadAuthKeyConfig(@InterfaceC1501050pAF("creation_id") String str, @InterfaceC1501050pAF("type") String str2);

    @InterfaceC1501240pAY("/aweme/v1/upload/authkey/")
    @InterfaceC1485505rh
    ListenableFuture<UploadAuthKeyConfig> getUploadAuthKeyConfig(@InterfaceC1501190pAT Map<String, String> map);

    @InterfaceC1501240pAY("/aweme/v1/upload/authkey/")
    @InterfaceC1485505rh
    @InterfaceC1501320pAg(3)
    ListenableFuture<UploadAuthKeyConfig> getUploadAuthKeyConfigHighPriority(@InterfaceC1501190pAT Map<String, String> map);

    @InterfaceC1501240pAY("/aweme/v1/upload/authkey/")
    @InterfaceC1485505rh
    @InterfaceC1501320pAg(3)
    Object getUploadAuthKeyConfigSyncHighPriority(@InterfaceC1501190pAT Map<String, String> map, InterfaceC1364105Vn<? super UploadAuthKeyConfig> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/material/resource/api/ugc_video_template/binding")
    @InterfaceC1485505rh
    ListenableFuture<String> ugcTemplateVideoBinding(@InterfaceC1501050pAF("item_id") String str, @InterfaceC1501050pAF("vid") String str2, @InterfaceC1501050pAF("track_id") String str3, @InterfaceC1501050pAF("type") String str4, @InterfaceC1501050pAF("dispatch_type") String str5, @InterfaceC1501050pAF("title") String str6);
}
