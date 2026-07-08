package com.ss.android.ugc.aweme.ecommerce.core.ecaction;

import X.C09CT;
import X.C0X52;
import X.C1321105Ez;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501200pAU;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;

/* JADX INFO: loaded from: classes3.dex */
public interface ECActionApi {
    public static final C1321105Ez LIZ = C1321105Ez.LIZ;

    @InterfaceC1501200pAU("api/v1/inbox/entrance/get")
    Object LIZ(InterfaceC1364105Vn<? super C0X52<Response<InboxEntranceResponse>>> interfaceC1364105Vn);

    public static final class InboxEntranceResponse {

        @C09CT("cart_item_count")
        public final Integer cartItemCount;

        public InboxEntranceResponse() {
            this(null);
        }

        public InboxEntranceResponse(Integer num) {
            this.cartItemCount = num;
        }
    }
}
