package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ShinyCardProgressParams {

    @C09CT("gift_id")
    public long giftId;

    @C09CT("pending_interactions")
    public List<ShinyCardInteraction> pendingInteractions = new ArrayList();
}
