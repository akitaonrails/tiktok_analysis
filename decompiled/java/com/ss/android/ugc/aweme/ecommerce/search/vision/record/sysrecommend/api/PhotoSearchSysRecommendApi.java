package com.ss.android.ugc.aweme.ecommerce.search.vision.record.sysrecommend.api;

import X.C09CT;
import X.C0X52;
import X.C1309560kBO;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.SysRecommendModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public interface PhotoSearchSysRecommendApi {
    public static final C1309560kBO LIZ = C1309560kBO.LIZ;

    @InterfaceC1501170pAR("/api/v1/shop/recommend/impression/write")
    Object exposureRecommendProducts(@InterfaceC1485405rg SysRecommendWriteParams sysRecommendWriteParams, InterfaceC1364105Vn<? super C0X52<Response<SysRecommendModel>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/api/v1/shop/recommend/feed/generic_feed")
    Object sysRecommendProducts(@InterfaceC1485405rg SysRecommendParams sysRecommendParams, InterfaceC1364105Vn<? super C0X52<Response<SysRecommendModel>>> interfaceC1364105Vn);

    public static final class SessionInfo {

        @C09CT("session_id")
        public final String sessionId;

        public SessionInfo(String str) {
            this.sessionId = str;
        }
    }

    public static final class ExposureRecommendItem {

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public final String id;

        @C09CT("feed_item_source_type")
        public final int sourceType;

        @C09CT("type")
        public final int type;

        public ExposureRecommendItem(String str, int i, int i2) {
            this.id = str;
            this.type = i;
            this.sourceType = i2;
        }
    }

    public static final class SysRecommendWriteParams {

        @C09CT("feed_list")
        public final List<ExposureRecommendItem> feedList;

        @C09CT(Scene.SCENE_SERVICE)
        public final String scene;

        @C09CT("session_info")
        public final SessionInfo sessionInfo;

        @C09CT("sub_scene")
        public final String subScene;

        public SysRecommendWriteParams(String str, String str2, List<ExposureRecommendItem> list, SessionInfo sessionInfo) {
            this.scene = str;
            this.subScene = str2;
            this.feedList = list;
            this.sessionInfo = sessionInfo;
        }
    }

    public static final class SysRecommendParams {

        @C09CT("cursor")
        public final int cursor;

        @C09CT("exposure_item_list")
        public final List<ExposureRecommendItem> exposureItemList;

        @C09CT(Scene.SCENE_SERVICE)
        public final String scene;

        @C09CT("session_id")
        public final String sessionId;

        @C09CT("size")
        public final int size;

        public SysRecommendParams(String str, int i, int i2, String str2, List<ExposureRecommendItem> list) {
            this.scene = str;
            this.size = i;
            this.cursor = i2;
            this.sessionId = str2;
            this.exposureItemList = list;
        }
    }
}
