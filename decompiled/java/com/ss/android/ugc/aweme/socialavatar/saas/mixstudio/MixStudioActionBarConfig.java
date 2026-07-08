package com.ss.android.ugc.aweme.socialavatar.saas.mixstudio;

import X.C01GW;
import X.C0HGK;
import X.C435610H6h;
import X.C435750H6v;
import X.C440660HPs;
import X.C440670HPt;
import X.C452501pT;
import X.InterfaceC440090HNn;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class MixStudioActionBarConfig {
    public static final MixStudioActionBarConfig INSTANCE = new MixStudioActionBarConfig();

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public static final MixStudioActionBarConfigResponse f80default = new MixStudioActionBarConfigResponse(null, null, null, null, null);
    public static final C01GW config$delegate = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(313));

    private final MixStudioActionBarConfigResponse getConfig() {
        return (MixStudioActionBarConfigResponse) config$delegate.getValue();
    }

    public final C440670HPt getConfigIfValid() {
        Integer num;
        int iIntValue;
        Long l = getConfig().validFromTimestamp;
        long jLongValue = l != null ? l.longValue() : 0L;
        Long l2 = getConfig().validUntilTimestamp;
        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC440090HNn c440660HPs = null;
        if (!(jLongValue <= jCurrentTimeMillis && jCurrentTimeMillis <= jLongValue2)) {
            return null;
        }
        Integer num2 = getConfig().defaultId;
        if (num2 == null || ((iIntValue = num2.intValue()) != 0 && iIntValue != 1)) {
            num2 = null;
        }
        MixStudioActionBarConfigElementResponse mixStudioActionBarConfigElementResponse = getConfig().element;
        if (mixStudioActionBarConfigElementResponse != null && (num = mixStudioActionBarConfigElementResponse.elementType) != null && num.intValue() != 1) {
            if (num.intValue() == 2) {
                String str = mixStudioActionBarConfigElementResponse.elementData;
                if (str != null) {
                    c440660HPs = new C0HGK(str);
                }
            } else if (num.intValue() == 3) {
                String str2 = mixStudioActionBarConfigElementResponse.elementData;
                if (str2 != null) {
                    Emoji emoji = new Emoji(str2);
                    Integer num3 = INSTANCE.getConfig().defaultId;
                    c440660HPs = new C435610H6h(emoji, num3 != null ? num3.intValue() : 0);
                }
            } else if (num.intValue() == 4) {
                String str3 = mixStudioActionBarConfigElementResponse.elementData;
                String str4 = mixStudioActionBarConfigElementResponse.elementUrl;
                String str5 = mixStudioActionBarConfigElementResponse.elementId;
                Integer num4 = INSTANCE.getConfig().defaultId;
                int iIntValue2 = num4 != null ? num4.intValue() : 0;
                if (str3 != null && str4 != null && str5 != null) {
                    c440660HPs = new C435750H6v(str3, str4, str5, iIntValue2);
                }
            } else if (num.intValue() == 5) {
                String str6 = mixStudioActionBarConfigElementResponse.elementData;
                String str7 = mixStudioActionBarConfigElementResponse.elementUrl;
                String str8 = mixStudioActionBarConfigElementResponse.elementId;
                Integer num5 = mixStudioActionBarConfigElementResponse.elementStickerType;
                if (str6 != null && str7 != null && str8 != null && num5 != null) {
                    c440660HPs = new C440660HPs(str6, str7, str8, num5.intValue());
                }
            }
        }
        return new C440670HPt(num2, getConfig().enableDualId, c440660HPs);
    }
}
