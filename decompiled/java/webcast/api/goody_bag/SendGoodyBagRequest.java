package webcast.api.goody_bag;

import X.C09CT;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagCommonSelected;

/* JADX INFO: loaded from: classes.dex */
public final class SendGoodyBagRequest {

    @C09CT("biz")
    public int biz;

    @C09CT("coin_param")
    public CoinGoodyBagParam coinParam;

    @C09CT("common_param")
    public GoodyBagCommonSelected commonParam;

    @C09CT("room_id")
    public String roomId = "";

    @C09CT("skin_id")
    public long skinId;

    public static final class CoinGoodyBagParam {

        @C09CT("selected_total_coins")
        public int selectedTotalCoins;
    }
}
