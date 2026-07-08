package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class RoomShortTouchAreaConfig {

    @C09CT("elements")
    public Map<Integer, Element> elements;

    public static final class Element {

        @C09CT("priority")
        public Integer priority;

        @C09CT("type")
        public Integer type;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.type != null) {
                sb.append(", type=");
                sb.append(this.type);
            }
            if (this.priority != null) {
                sb.append(", priority=");
                sb.append(this.priority);
            }
            sb.replace(0, 2, "Element{");
            sb.append('}');
            return sb.toString();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Map<Integer, Element> map = this.elements;
        if (map != null && !map.isEmpty()) {
            sb.append(", elements=");
            sb.append(this.elements);
        }
        sb.replace(0, 2, "RoomShortTouchAreaConfig{");
        sb.append('}');
        return sb.toString();
    }
}
