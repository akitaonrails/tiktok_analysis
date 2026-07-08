package webcast.api.creator;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import webcast.api.creator.PreScheduleStream;

/* JADX INFO: loaded from: classes.dex */
public final class _PreScheduleStream_PushStreamInfo_ProtoDecoder implements C0IMD<PreScheduleStream.PushStreamInfo> {
    public static PreScheduleStream.PushStreamInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PreScheduleStream.PushStreamInfo pushStreamInfo = new PreScheduleStream.PushStreamInfo();
        pushStreamInfo.multiQualities = new HashMap();
        pushStreamInfo.qualities = new ArrayList();
        pushStreamInfo.multiDefaultQualities = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        String strLIZLLL = null;
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                long jLIZJ2 = c1516680pZS.LIZJ();
                                PreScheduleStream.PushStreamInfo.QualityList qualityListLIZLLL = null;
                                while (true) {
                                    int iLJI2 = c1516680pZS.LJI();
                                    if (iLJI2 == -1) {
                                        break;
                                    }
                                    if (iLJI2 != 1) {
                                        if (iLJI2 == 2) {
                                            qualityListLIZLLL = _PreScheduleStream_PushStreamInfo_QualityList_ProtoDecoder.LIZLLL(c1516680pZS);
                                        }
                                    } else {
                                        strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                    }
                                }
                                c1516680pZS.LJ(jLIZJ2);
                                if (strLIZLLL != null) {
                                    if (qualityListLIZLLL != null) {
                                        pushStreamInfo.multiQualities.put(strLIZLLL, qualityListLIZLLL);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        } else {
                            long jLIZJ3 = c1516680pZS.LIZJ();
                            PreScheduleStream.PushStreamInfo.Quality qualityLIZLLL = null;
                            while (true) {
                                int iLJI3 = c1516680pZS.LJI();
                                if (iLJI3 == -1) {
                                    break;
                                }
                                if (iLJI3 != 1) {
                                    if (iLJI3 == 2) {
                                        qualityLIZLLL = _PreScheduleStream_PushStreamInfo_Quality_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            }
                            c1516680pZS.LJ(jLIZJ3);
                            if (strLIZLLL != null) {
                                if (qualityLIZLLL != null) {
                                    pushStreamInfo.multiDefaultQualities.put(strLIZLLL, qualityLIZLLL);
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else {
                                throw new IllegalStateException("Map key must not be null!");
                            }
                        }
                    } else {
                        pushStreamInfo.qualities.add(_PreScheduleStream_PushStreamInfo_Quality_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    pushStreamInfo.defaultQuality = _PreScheduleStream_PushStreamInfo_Quality_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return pushStreamInfo;
            }
        }
    }

    public static void LJ(PreScheduleStream.PushStreamInfo pushStreamInfo) {
        List<PreScheduleStream.PushStreamInfo.Quality> list = pushStreamInfo.qualities;
        if (list == null) {
            pushStreamInfo.qualities = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<PreScheduleStream.PushStreamInfo.Quality> it2 = pushStreamInfo.qualities.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        Map<String, PreScheduleStream.PushStreamInfo.Quality> map = pushStreamInfo.multiDefaultQualities;
        if (map == null) {
            pushStreamInfo.multiDefaultQualities = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<String, PreScheduleStream.PushStreamInfo.Quality>> it3 = pushStreamInfo.multiDefaultQualities.entrySet().iterator();
            while (it3.hasNext()) {
                it3.next().getValue();
            }
        }
        Map<String, PreScheduleStream.PushStreamInfo.QualityList> map2 = pushStreamInfo.multiQualities;
        if (map2 == null) {
            pushStreamInfo.multiQualities = new HashMap();
            return;
        }
        if (map2.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<String, PreScheduleStream.PushStreamInfo.QualityList>> it4 = pushStreamInfo.multiQualities.entrySet().iterator();
        while (it4.hasNext()) {
            PreScheduleStream.PushStreamInfo.QualityList value = it4.next().getValue();
            if (value != null) {
                _PreScheduleStream_PushStreamInfo_QualityList_ProtoDecoder.LJ(value);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PreScheduleStream.PushStreamInfo pushStreamInfo) {
        LJ(pushStreamInfo);
    }

    @Override // X.C0IMD
    public final PreScheduleStream.PushStreamInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PreScheduleStream.PushStreamInfo pushStreamInfo, List list) {
    }
}
