package com.ss.android.ugc.aweme.music.model;

import X.C089E;
import X.C09CT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class MusicDiscoveryInfo implements Serializable {

    @C09CT("event_tracking_info")
    public MusicDiscoveryEventTrackingInfo eventTrackingInfo;

    @C09CT("tt_to_dsp_album_info")
    public TT2DspAlbumInfo tt2DspAlbumInfo;

    public MusicDiscoveryInfo() {
        this(null, null);
    }

    public final Map<String, String> getTTToDspLogExtraMap() {
        String string;
        if (this.eventTrackingInfo == null) {
            return null;
        }
        Field[] declaredFields = MusicDiscoveryEventTrackingInfo.class.getDeclaredFields();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C089E c089e = new C089E(declaredFields);
        while (c089e.hasNext()) {
            Field field = (Field) c089e.next();
            C09CT c09ct = (C09CT) field.getAnnotation(C09CT.class);
            if (c09ct != null) {
                try {
                    field.setAccessible(true);
                    Object obj = field.get(this.eventTrackingInfo);
                    if (obj instanceof Boolean) {
                        linkedHashMap.put(c09ct.value(), ((Boolean) obj).booleanValue() ? "1" : CardStruct.IStatusCode.DEFAULT);
                    } else {
                        String strValue = c09ct.value();
                        if (obj == null || (string = obj.toString()) == null) {
                            string = "";
                        }
                        linkedHashMap.put(strValue, string);
                    }
                } catch (IllegalAccessException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return linkedHashMap;
    }

    public MusicDiscoveryInfo(TT2DspAlbumInfo tT2DspAlbumInfo, MusicDiscoveryEventTrackingInfo musicDiscoveryEventTrackingInfo) {
        this.tt2DspAlbumInfo = tT2DspAlbumInfo;
        this.eventTrackingInfo = musicDiscoveryEventTrackingInfo;
    }
}
