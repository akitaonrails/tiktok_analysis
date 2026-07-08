package com.bytedance.android.livesdk.gift.base.platform.business.effect.shinycard;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.bytedance.android.livesdk.gift.model.ShinyCardInteractParams;
import com.bytedance.android.livesdk.gift.model.ShinyCardInteractResponse;

/* JADX INFO: loaded from: classes18.dex */
public interface IShinyCardGiftAPI {
    @InterfaceC1501170pAR("/webcast/gift/shiny_card/interact/")
    C11NZ<C470590Icr<ShinyCardInteractResponse>> shinyCardInteract(@InterfaceC1485405rg ShinyCardInteractParams shinyCardInteractParams);
}
