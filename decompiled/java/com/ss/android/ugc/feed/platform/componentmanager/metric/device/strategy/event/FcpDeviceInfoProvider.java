package com.ss.android.ugc.feed.platform.componentmanager.metric.device.strategy.event;

import X.C017R;
import X.C1DDC;
import X.C1EE1;
import X.InterfaceC1282004zy;
import com.ss.android.ugc.feed.platform.metric.event.IDeviceInfoEventParamProvider;
import com.ss.android.ugc.feed.platform.metric.model.DeviceInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public final class FcpDeviceInfoProvider implements IDeviceInfoEventParamProvider<C017R> {
    @Override // com.ss.android.ugc.feed.platform.metric.event.IDeviceInfoEventParamProvider
    public final InterfaceC1282004zy LIZ() {
        DeviceInfo deviceInfoLIZIZ = C1DDC.LIZIZ();
        final int i = deviceInfoLIZIZ.screenWidthPageCouldUse;
        final int i2 = deviceInfoLIZIZ.screenHeightPageCouldUse;
        final int i3 = deviceInfoLIZIZ.screenDpi;
        final float f = deviceInfoLIZIZ.screenDip;
        final String str = deviceInfoLIZIZ.screenResolution;
        final int i4 = C1EE1.LIZIZ.LJIL() == -1 ? 0 : 1;
        final String strValueOf = String.valueOf(deviceInfoLIZIZ.screenRating);
        return new InterfaceC1282004zy(i, i2, i3, f, str, strValueOf, i4) { // from class: X.017R
            public final int LL;
            public final int LLILLJJLI;
            public final int LLILLL;
            public final float LLILZ;
            public final String LLILZIL;
            public final String LLILZLL;
            public final int LLIZ;

            @Override // X.InterfaceC1282004zy
            public final boolean checkExtraParamKey() {
                return false;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C017R)) {
                    return false;
                }
                C017R c017r = (C017R) obj;
                return this.LL == c017r.LL && this.LLILLJJLI == c017r.LLILLJJLI && this.LLILLL == c017r.LLILLL && Float.compare(this.LLILZ, c017r.LLILZ) == 0 && Intrinsics.LJFF(this.LLILZIL, c017r.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c017r.LLILZLL) && this.LLIZ == c017r.LLIZ;
            }

            @Override // X.InterfaceC1282004zy
            public final Map<String, Object> keyParams() {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("screen_width", Integer.valueOf(this.LL));
                linkedHashMap.put("screen_height", Integer.valueOf(this.LLILLJJLI));
                linkedHashMap.put("screen_dpi", Integer.valueOf(this.LLILLL));
                linkedHashMap.put("screen_dip", Float.valueOf(this.LLILZ));
                linkedHashMap.put("screen_resolution", this.LLILZIL);
                linkedHashMap.put("is_small_screen", this.LLILZLL);
                linkedHashMap.put("offline_mode_status", Integer.valueOf(this.LLIZ));
                return linkedHashMap;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FcpDeviceInfoParams(screenWidth=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", screenHeight=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(", screenDpi=");
                sbLIZ.append(this.LLILLL);
                sbLIZ.append(", screenDip=");
                sbLIZ.append(this.LLILZ);
                sbLIZ.append(", screenResolution=");
                sbLIZ.append(this.LLILZIL);
                sbLIZ.append(", screenRating=");
                sbLIZ.append(this.LLILZLL);
                sbLIZ.append(", offlineModeStatus=");
                sbLIZ.append(this.LLIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            public final int hashCode() {
                return (((((((((((this.LL * 31) + this.LLILLJJLI) * 31) + this.LLILLL) * 31) + Float.floatToIntBits(this.LLILZ)) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ;
            }

            @Override // X.InterfaceC1282004zy
            public final Map<String, Object> filteredParams() {
                return keyParams();
            }

            @Override // X.InterfaceC1282004zy
            public final Map<String, Object> getExtraParam() {
                return C2097608Jq.LJ();
            }

            {
                this.LL = i;
                this.LLILLJJLI = i2;
                this.LLILLL = i3;
                this.LLILZ = f;
                this.LLILZIL = str;
                this.LLILZLL = strValueOf;
                this.LLIZ = i4;
            }
        };
    }
}
