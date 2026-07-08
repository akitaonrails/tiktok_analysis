package webcast.api.creator;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import webcast.api.creator.PreScheduleStream;

/* JADX INFO: loaded from: classes13.dex */
public final class _PreScheduleStream_ProtoDecoder implements C0IMD<PreScheduleStream> {
    @Override // X.C0IMD
    public final void LIZ(PreScheduleStream preScheduleStream) {
        PreScheduleStream preScheduleStream2 = preScheduleStream;
        List<StreamResolution> list = preScheduleStream2.streamResolutionList;
        if (list == null) {
            preScheduleStream2.streamResolutionList = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<StreamResolution> it2 = preScheduleStream2.streamResolutionList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        Map<Long, PreScheduleStream.PushStreamInfo> map = preScheduleStream2.pushStreamInfo;
        if (map == null) {
            preScheduleStream2.pushStreamInfo = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<Long, PreScheduleStream.PushStreamInfo>> it3 = preScheduleStream2.pushStreamInfo.entrySet().iterator();
            while (it3.hasNext()) {
                PreScheduleStream.PushStreamInfo value = it3.next().getValue();
                if (value != null) {
                    _PreScheduleStream_PushStreamInfo_ProtoDecoder.LJ(value);
                }
            }
        }
        List<StreamResolution> list2 = preScheduleStream2.streamResolutionListAll;
        if (list2 == null) {
            preScheduleStream2.streamResolutionListAll = new ArrayList();
        } else if (!list2.isEmpty()) {
            Iterator<StreamResolution> it4 = preScheduleStream2.streamResolutionListAll.iterator();
            while (it4.hasNext()) {
                it4.next();
            }
        }
        if (preScheduleStream2.streamPushUrls == null) {
            preScheduleStream2.streamPushUrls = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final PreScheduleStream LIZJ(C1516680pZS c1516680pZS) throws IOException {
        PreScheduleStream preScheduleStream = new PreScheduleStream();
        preScheduleStream.streamPushUrls = new ArrayList();
        preScheduleStream.streamResolutionListAll = new ArrayList();
        preScheduleStream.streamResolutionList = new ArrayList();
        preScheduleStream.pushStreamInfo = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        preScheduleStream.sdkParams = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        preScheduleStream.speedProbeUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        preScheduleStream.streamResolutionList.add(_StreamResolution_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 4:
                        preScheduleStream.recommendStreamResolution = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        preScheduleStream.netMode = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        preScheduleStream.degradationEnabled = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 7:
                        preScheduleStream.degradationType = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        Long lValueOf = null;
                        PreScheduleStream.PushStreamInfo pushStreamInfoLIZLLL = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 != -1) {
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        pushStreamInfoLIZLLL = _PreScheduleStream_PushStreamInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ2);
                                if (lValueOf != null) {
                                    if (pushStreamInfoLIZLLL != null) {
                                        preScheduleStream.pushStreamInfo.put(lValueOf, pushStreamInfoLIZLLL);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                                break;
                            }
                        }
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        preScheduleStream.streamResolutionListAll.add(_StreamResolution_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        preScheduleStream.canGolive1080p = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        preScheduleStream.streamId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        preScheduleStream.streamPushUrls.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        preScheduleStream.streamRtmpPushUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 14:
                        preScheduleStream.preStreamGroup = c1516680pZS.LJIIJJI();
                        break;
                    case 15:
                        preScheduleStream.rtcRoomId = c1516680pZS.LJIIJJI();
                        break;
                    case 16:
                        preScheduleStream.rtcAppId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        preScheduleStream.streamData = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return preScheduleStream;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PreScheduleStream preScheduleStream, List list) {
    }
}
