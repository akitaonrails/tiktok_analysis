package com.ss.bytertc.engine.type;

import X.C08FF;

/* JADX INFO: loaded from: classes21.dex */
public enum LinkMicType {
    LINK_MIC_TYPE_NONE(0),
    LINK_MIC_TYPE_ANCHOR(1),
    LINK_MIC_TYPE_GUEST(2);

    public final int value;

    public static LinkMicType valueOf(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return LINK_MIC_TYPE_NONE;
                }
                return LINK_MIC_TYPE_GUEST;
            }
            return LINK_MIC_TYPE_ANCHOR;
        }
        return LINK_MIC_TYPE_NONE;
    }

    public static LinkMicType valueOf(String str) {
        return (LinkMicType) C08FF.LIZ(LinkMicType.class, str);
    }

    LinkMicType(int i) {
        this.value = i;
    }
}
