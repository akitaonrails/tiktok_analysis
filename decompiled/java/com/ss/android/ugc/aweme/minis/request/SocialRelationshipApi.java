package com.ss.android.ugc.aweme.minis.request;

import X.C09CT;
import X.C0CQT;
import X.C11NZ;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501310pAf;
import X.InterfaceC2661011f;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class SocialRelationshipApi {
    public static final StorageApi LIZ;

    public static final class MinisGetFriendCloudStorageResponse extends BaseResponse {

        @C09CT("data")
        public final List<FriendCloudStorageData> data;

        @C09CT("fail_reason")
        public final String failReason = "";

        @C09CT("success")
        public final boolean success;
    }

    public static final class MinisGetUserCloudStorageResponse extends BaseResponse {

        @C09CT("data")
        public final List<UserCloudStorageKVData> data;

        @C09CT("fail_reason")
        public final String failReason = "";

        @C09CT("success")
        public final boolean success;
    }

    public static final class MinisSetCloudStorageResponse extends BaseResponse {

        @C09CT("fail_reason")
        public final String failReason = "";

        @C09CT("success")
        public final boolean success;
    }

    public interface StorageApi {
        @InterfaceC1501170pAR("/tiktok/minis/get_friend_cloud_storage")
        @InterfaceC1501310pAf({"Content-Type: application/json"})
        C11NZ<MinisGetFriendCloudStorageResponse> getFriendCloudStorage(@InterfaceC1485405rg MinisCloudStorageRequest minisCloudStorageRequest);

        @InterfaceC1501170pAR("/tiktok/minis/get_cloud_storage")
        @InterfaceC1501310pAf({"Content-Type: application/json"})
        C11NZ<MinisGetUserCloudStorageResponse> getUserCloudStorage(@InterfaceC1485405rg MinisCloudStorageRequest minisCloudStorageRequest);

        @InterfaceC1501170pAR("/tiktok/minis/delete_cloud_storage")
        @InterfaceC1501310pAf({"Content-Type: application/json"})
        C11NZ<MinisSetCloudStorageResponse> removeUserCloudStorage(@InterfaceC1485405rg MinisCloudStorageRequest minisCloudStorageRequest);

        @InterfaceC1501170pAR("/tiktok/minis/set_cloud_storage")
        @InterfaceC1501310pAf({"Content-Type: application/json"})
        C11NZ<MinisSetCloudStorageResponse> setUserCloudStorage(@InterfaceC1485405rg MinisSetCloudStorageRequest minisSetCloudStorageRequest);
    }

    public static final class UserCloudStorageKVData {

        @C09CT("key")
        public final String key;

        @C09CT("value")
        public final String value;

        public UserCloudStorageKVData() {
            this("", "");
        }

        public UserCloudStorageKVData(String str, String str2) {
            this.key = str;
            this.value = str2;
        }
    }

    static {
        InterfaceC2661011f interfaceC2661011fLIZ;
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
        LIZ = (iRetrofitFactory == null || (interfaceC2661011fLIZ = iRetrofitFactory.LIZ(C0CQT.LIZJ)) == null) ? null : (StorageApi) interfaceC2661011fLIZ.create(StorageApi.class);
    }

    public static final class MinisCloudStorageRequest {

        @C09CT("client_key")
        public final String clientKey;

        @C09CT("key_list")
        public final List<String> key;

        public MinisCloudStorageRequest(String str, List<String> list) {
            this.clientKey = str;
            this.key = list;
        }
    }

    public static final class MinisSetCloudStorageRequest {

        @C09CT("client_key")
        public final String clientKey;

        @C09CT("data")
        public final List<UserCloudStorageKVData> data;

        @C09CT("data_type")
        public final Integer dataType;

        public MinisSetCloudStorageRequest(String str, Integer num, List<UserCloudStorageKVData> list) {
            this.clientKey = str;
            this.dataType = num;
            this.data = list;
        }
    }

    public static final class FriendCloudStorageData {

        @C09CT("avatar_url")
        public final String avatarUrl;

        @C09CT("data")
        public final List<UserCloudStorageKVData> data;

        @C09CT("display_name")
        public final String displayName;

        @C09CT("open_id")
        public final String openId;

        @C09CT("user_id")
        public final Long uid;

        public FriendCloudStorageData() {
            this("", "", "", null, null);
        }

        public FriendCloudStorageData(String str, String str2, String str3, Long l, List<UserCloudStorageKVData> list) {
            this.displayName = str;
            this.avatarUrl = str2;
            this.openId = str3;
            this.uid = l;
            this.data = list;
        }
    }
}
