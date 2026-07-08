package com.bytedance.android.starship.engine.event;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class Event {
    public String deliveryId;
    public final String name;
    public final Map<String, Object> params;

    public final String getDeliveryId$engine_release() {
        return this.deliveryId;
    }

    public final void setDeliveryId$engine_release(String str) {
        this.deliveryId = str;
    }

    public Event(String str, Map<String, ? extends Object> map) {
        this.name = str;
        this.params = map;
    }
}
