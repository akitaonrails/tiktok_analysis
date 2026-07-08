package com.bytedance.ies.ugc.aweme.commwecialize.ba.api;

import X.C09CT;
import X.C0CQT;
import X.C11VX;
import X.C19774512Yl;
import X.EnumC1430380nKG;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes30.dex */
public final class BAProductAnchorStateApi {
    public static final BAProductAnchorStateApi LIZ = new BAProductAnchorStateApi();
    public static final Keva LIZIZ = KevaImpl.getRepo("ba_product_anchor", 0);

    public static final class ProductLinkStateResponse implements Serializable {

        @C09CT("user_status")
        public final int linkStatus;

        @C09CT("status_msg")
        public final String msg;

        @C09CT("status_code")
        public final int statusCode;

        public ProductLinkStateResponse() {
            this(0, null, 0);
        }

        public final int getLinkStatus() {
            return this.linkStatus;
        }

        public final String getMsg() {
            return this.msg;
        }

        public final int getStatusCode() {
            return this.statusCode;
        }

        public ProductLinkStateResponse(int i, String str, int i2) {
            this.statusCode = i;
            this.msg = str;
            this.linkStatus = i2;
        }
    }

    public static void LIZ(Map map) {
        if (map != null) {
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                AnchorPublishStruct anchorPublishStruct = (AnchorPublishStruct) ((Map.Entry) it2.next()).getValue();
                if (anchorPublishStruct.type == EnumC1430380nKG.BA_PRODUCT_ANCHOR.getTYPE()) {
                    C11VX.LIZ.getClass();
                    ((C11VX) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(C11VX.class)).LIZ(1).LIZLLL(new C19774512Yl(anchorPublishStruct, 4));
                }
            }
        }
    }
}
