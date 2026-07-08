package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class BackpackMessage extends AbstractC1136060ffY {

    @C09CT("action")
    public int action;

    @C09CT("available")
    public boolean available;

    @C09CT("change_type")
    public int changeType;

    @C09CT("item_id")
    public long itemId;

    @C09CT("item_type")
    public int itemType;

    public BackpackMessage() {
        this.type = C001A.BACKPACK_MESSAGE;
    }
}
