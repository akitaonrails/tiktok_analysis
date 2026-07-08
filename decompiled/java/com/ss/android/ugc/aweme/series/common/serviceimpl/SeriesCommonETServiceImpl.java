package com.ss.android.ugc.aweme.series.common.serviceimpl;

import X.AbstractC1386130mAt;
import X.C098200Yq;
import X.C0LAB;
import X.C0PRC;
import X.C0Q3E;
import X.C0RRR;
import X.C123100dR;
import X.C13M7;
import X.C1589520rSw;
import X.C1612510s41;
import X.C1612570s47;
import X.C1612600s4A;
import X.C189200o6;
import X.C19719512Dh;
import X.C2095008Iq;
import X.C2097908Jt;
import X.C2241008qG;
import X.C2344009Gk;
import X.C646370PWx;
import X.C651130PgN;
import X.C695070ROf;
import X.C718180SFc;
import X.C718300SFo;
import X.C793770VBv;
import X.InterfaceC1210900hcG;
import X.InterfaceC1577280r9C;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.model.AdPaidContent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.model.DramaExtraTrackingParams;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.series.feed.INUJUnderTakeManager;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesCommonETServiceImpl extends SeriesCommonETService {
    public Pair<String, String> LIZIZ;
    public final C13M7<String> LIZJ = new C13M7<>();

    @Override // com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesCommonETService, com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public final Pair<String, String> getDramaDNUVideoLoginContext() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesCommonETService, com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public final void clearFirstPlayStateForCollection(String str) {
        this.LIZJ.remove(str);
    }

    @Override // com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesCommonETService
    public final String getAdCollectionId(Aweme aweme) {
        AdPaidContent adPaidContent;
        String collectionId;
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            adPaidContent = awemeRawAd.getAdPaidContent();
        } else {
            adPaidContent = null;
        }
        if (!(adPaidContent instanceof AdPaidContent) || adPaidContent == null || (collectionId = adPaidContent.getCollectionId()) == null || collectionId.length() <= 0) {
            return null;
        }
        return collectionId;
    }

    @Override // com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesCommonETService
    public final String getMobContinuePlayParam(Aweme aweme) {
        HashMap<String, String> mobParams = aweme.getMobParams();
        if (mobParams != null) {
            return mobParams.get("is_series_continuation_play");
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesCommonETService, com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public final Map<String, String> getPaidContentInnerFeedSourceParam(Aweme aweme) {
        C1612570s47 c1612570s47;
        C1612600s4A c1612600s4A;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (aweme != null && aweme.isPaidContent && !C695070ROf.LIZ(aweme)) {
            C1612510s41 commonETParams = getCommonETParams();
            String mobParams = getMobParams(aweme, "source_video_id");
            if (mobParams == null) {
                mobParams = null;
                if (commonETParams != null && (c1612600s4A = commonETParams.LJIIIIZZ) != null) {
                    mobParams = c1612600s4A.anchorVideoId;
                }
                if ((!C123100dR.LIZ(mobParams) || mobParams == null) && (commonETParams == null || (c1612570s47 = commonETParams.LJIIL) == null || (mobParams = c1612570s47.sourceVideoId) == null)) {
                    mobParams = "";
                }
            }
            linkedHashMap.put("source_group_id", mobParams);
        }
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesCommonETService, com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public final String getSeriesVideoType(Aweme aweme) {
        return C718180SFc.LJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesCommonETService
    public final boolean isLimitFreeFromBanner(Aweme aweme) {
        return C718300SFo.LIZ(aweme);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ed A[PHI: r6
      0x00ed: PHI (r6v2 java.lang.String) = (r6v1 java.lang.String), (r6v4 java.lang.String) binds: [B:35:0x009d, B:42:0x00ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013e A[Catch: all -> 0x0162, LOOP:0: B:79:0x0138->B:81:0x013e, LOOP_END, TryCatch #0 {all -> 0x0162, blocks: (B:78:0x012f, B:79:0x0138, B:81:0x013e, B:82:0x015c), top: B:111:0x012f }] */
    @Override // com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesCommonETService, com.ss.android.ugc.aweme.service.ISeriesCommonETService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> T appendPaidContentFcpComponentParam(com.ss.android.ugc.aweme.feed.model.Aweme r27, T r28) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesCommonETServiceImpl.appendPaidContentFcpComponentParam(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0174 A[Catch: all -> 0x0393, TryCatch #0 {all -> 0x0393, blocks: (B:89:0x013a, B:91:0x0140, B:93:0x0146, B:95:0x014c, B:100:0x0157, B:101:0x015b, B:103:0x0161, B:104:0x016e, B:106:0x0174, B:107:0x0180, B:109:0x0186, B:110:0x01a2, B:115:0x01b1, B:121:0x01cd, B:125:0x01de, B:127:0x01ea, B:128:0x01f1, B:130:0x01f7, B:132:0x01fd, B:134:0x0203, B:136:0x0212, B:138:0x0216, B:140:0x021c, B:142:0x0222, B:143:0x022a, B:145:0x0230, B:146:0x0246, B:153:0x0252, B:155:0x0258, B:160:0x0265, B:161:0x0281, B:163:0x0287, B:165:0x028f, B:167:0x0293, B:170:0x0298, B:172:0x02a3, B:174:0x02a7, B:177:0x02ac, B:179:0x02b5, B:181:0x02b9, B:182:0x02be, B:184:0x02c4, B:186:0x02c8, B:187:0x02cd, B:189:0x02d3, B:191:0x02d7, B:192:0x02dc, B:194:0x02e2, B:196:0x02e6, B:197:0x02eb, B:199:0x02f1, B:201:0x02f7, B:203:0x02ff, B:205:0x0303, B:209:0x0313, B:210:0x0316, B:208:0x0309, B:156:0x025b, B:158:0x0261, B:212:0x031e, B:214:0x0322, B:216:0x0328, B:218:0x032e, B:221:0x0353, B:223:0x0357, B:226:0x035c, B:229:0x036b, B:231:0x036f, B:234:0x0374, B:237:0x0383, B:239:0x0387, B:242:0x038c, B:243:0x038f, B:78:0x00f5, B:80:0x00fd, B:82:0x0101, B:84:0x0107, B:86:0x0111, B:88:0x0117), top: B:251:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f7 A[Catch: all -> 0x0393, TryCatch #0 {all -> 0x0393, blocks: (B:89:0x013a, B:91:0x0140, B:93:0x0146, B:95:0x014c, B:100:0x0157, B:101:0x015b, B:103:0x0161, B:104:0x016e, B:106:0x0174, B:107:0x0180, B:109:0x0186, B:110:0x01a2, B:115:0x01b1, B:121:0x01cd, B:125:0x01de, B:127:0x01ea, B:128:0x01f1, B:130:0x01f7, B:132:0x01fd, B:134:0x0203, B:136:0x0212, B:138:0x0216, B:140:0x021c, B:142:0x0222, B:143:0x022a, B:145:0x0230, B:146:0x0246, B:153:0x0252, B:155:0x0258, B:160:0x0265, B:161:0x0281, B:163:0x0287, B:165:0x028f, B:167:0x0293, B:170:0x0298, B:172:0x02a3, B:174:0x02a7, B:177:0x02ac, B:179:0x02b5, B:181:0x02b9, B:182:0x02be, B:184:0x02c4, B:186:0x02c8, B:187:0x02cd, B:189:0x02d3, B:191:0x02d7, B:192:0x02dc, B:194:0x02e2, B:196:0x02e6, B:197:0x02eb, B:199:0x02f1, B:201:0x02f7, B:203:0x02ff, B:205:0x0303, B:209:0x0313, B:210:0x0316, B:208:0x0309, B:156:0x025b, B:158:0x0261, B:212:0x031e, B:214:0x0322, B:216:0x0328, B:218:0x032e, B:221:0x0353, B:223:0x0357, B:226:0x035c, B:229:0x036b, B:231:0x036f, B:234:0x0374, B:237:0x0383, B:239:0x0387, B:242:0x038c, B:243:0x038f, B:78:0x00f5, B:80:0x00fd, B:82:0x0101, B:84:0x0107, B:86:0x0111, B:88:0x0117), top: B:251:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0203 A[Catch: all -> 0x0393, TryCatch #0 {all -> 0x0393, blocks: (B:89:0x013a, B:91:0x0140, B:93:0x0146, B:95:0x014c, B:100:0x0157, B:101:0x015b, B:103:0x0161, B:104:0x016e, B:106:0x0174, B:107:0x0180, B:109:0x0186, B:110:0x01a2, B:115:0x01b1, B:121:0x01cd, B:125:0x01de, B:127:0x01ea, B:128:0x01f1, B:130:0x01f7, B:132:0x01fd, B:134:0x0203, B:136:0x0212, B:138:0x0216, B:140:0x021c, B:142:0x0222, B:143:0x022a, B:145:0x0230, B:146:0x0246, B:153:0x0252, B:155:0x0258, B:160:0x0265, B:161:0x0281, B:163:0x0287, B:165:0x028f, B:167:0x0293, B:170:0x0298, B:172:0x02a3, B:174:0x02a7, B:177:0x02ac, B:179:0x02b5, B:181:0x02b9, B:182:0x02be, B:184:0x02c4, B:186:0x02c8, B:187:0x02cd, B:189:0x02d3, B:191:0x02d7, B:192:0x02dc, B:194:0x02e2, B:196:0x02e6, B:197:0x02eb, B:199:0x02f1, B:201:0x02f7, B:203:0x02ff, B:205:0x0303, B:209:0x0313, B:210:0x0316, B:208:0x0309, B:156:0x025b, B:158:0x0261, B:212:0x031e, B:214:0x0322, B:216:0x0328, B:218:0x032e, B:221:0x0353, B:223:0x0357, B:226:0x035c, B:229:0x036b, B:231:0x036f, B:234:0x0374, B:237:0x0383, B:239:0x0387, B:242:0x038c, B:243:0x038f, B:78:0x00f5, B:80:0x00fd, B:82:0x0101, B:84:0x0107, B:86:0x0111, B:88:0x0117), top: B:251:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0212 A[Catch: all -> 0x0393, TryCatch #0 {all -> 0x0393, blocks: (B:89:0x013a, B:91:0x0140, B:93:0x0146, B:95:0x014c, B:100:0x0157, B:101:0x015b, B:103:0x0161, B:104:0x016e, B:106:0x0174, B:107:0x0180, B:109:0x0186, B:110:0x01a2, B:115:0x01b1, B:121:0x01cd, B:125:0x01de, B:127:0x01ea, B:128:0x01f1, B:130:0x01f7, B:132:0x01fd, B:134:0x0203, B:136:0x0212, B:138:0x0216, B:140:0x021c, B:142:0x0222, B:143:0x022a, B:145:0x0230, B:146:0x0246, B:153:0x0252, B:155:0x0258, B:160:0x0265, B:161:0x0281, B:163:0x0287, B:165:0x028f, B:167:0x0293, B:170:0x0298, B:172:0x02a3, B:174:0x02a7, B:177:0x02ac, B:179:0x02b5, B:181:0x02b9, B:182:0x02be, B:184:0x02c4, B:186:0x02c8, B:187:0x02cd, B:189:0x02d3, B:191:0x02d7, B:192:0x02dc, B:194:0x02e2, B:196:0x02e6, B:197:0x02eb, B:199:0x02f1, B:201:0x02f7, B:203:0x02ff, B:205:0x0303, B:209:0x0313, B:210:0x0316, B:208:0x0309, B:156:0x025b, B:158:0x0261, B:212:0x031e, B:214:0x0322, B:216:0x0328, B:218:0x032e, B:221:0x0353, B:223:0x0357, B:226:0x035c, B:229:0x036b, B:231:0x036f, B:234:0x0374, B:237:0x0383, B:239:0x0387, B:242:0x038c, B:243:0x038f, B:78:0x00f5, B:80:0x00fd, B:82:0x0101, B:84:0x0107, B:86:0x0111, B:88:0x0117), top: B:251:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0252 A[Catch: all -> 0x0393, TRY_ENTER, TryCatch #0 {all -> 0x0393, blocks: (B:89:0x013a, B:91:0x0140, B:93:0x0146, B:95:0x014c, B:100:0x0157, B:101:0x015b, B:103:0x0161, B:104:0x016e, B:106:0x0174, B:107:0x0180, B:109:0x0186, B:110:0x01a2, B:115:0x01b1, B:121:0x01cd, B:125:0x01de, B:127:0x01ea, B:128:0x01f1, B:130:0x01f7, B:132:0x01fd, B:134:0x0203, B:136:0x0212, B:138:0x0216, B:140:0x021c, B:142:0x0222, B:143:0x022a, B:145:0x0230, B:146:0x0246, B:153:0x0252, B:155:0x0258, B:160:0x0265, B:161:0x0281, B:163:0x0287, B:165:0x028f, B:167:0x0293, B:170:0x0298, B:172:0x02a3, B:174:0x02a7, B:177:0x02ac, B:179:0x02b5, B:181:0x02b9, B:182:0x02be, B:184:0x02c4, B:186:0x02c8, B:187:0x02cd, B:189:0x02d3, B:191:0x02d7, B:192:0x02dc, B:194:0x02e2, B:196:0x02e6, B:197:0x02eb, B:199:0x02f1, B:201:0x02f7, B:203:0x02ff, B:205:0x0303, B:209:0x0313, B:210:0x0316, B:208:0x0309, B:156:0x025b, B:158:0x0261, B:212:0x031e, B:214:0x0322, B:216:0x0328, B:218:0x032e, B:221:0x0353, B:223:0x0357, B:226:0x035c, B:229:0x036b, B:231:0x036f, B:234:0x0374, B:237:0x0383, B:239:0x0387, B:242:0x038c, B:243:0x038f, B:78:0x00f5, B:80:0x00fd, B:82:0x0101, B:84:0x0107, B:86:0x0111, B:88:0x0117), top: B:251:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0287 A[Catch: all -> 0x0393, TryCatch #0 {all -> 0x0393, blocks: (B:89:0x013a, B:91:0x0140, B:93:0x0146, B:95:0x014c, B:100:0x0157, B:101:0x015b, B:103:0x0161, B:104:0x016e, B:106:0x0174, B:107:0x0180, B:109:0x0186, B:110:0x01a2, B:115:0x01b1, B:121:0x01cd, B:125:0x01de, B:127:0x01ea, B:128:0x01f1, B:130:0x01f7, B:132:0x01fd, B:134:0x0203, B:136:0x0212, B:138:0x0216, B:140:0x021c, B:142:0x0222, B:143:0x022a, B:145:0x0230, B:146:0x0246, B:153:0x0252, B:155:0x0258, B:160:0x0265, B:161:0x0281, B:163:0x0287, B:165:0x028f, B:167:0x0293, B:170:0x0298, B:172:0x02a3, B:174:0x02a7, B:177:0x02ac, B:179:0x02b5, B:181:0x02b9, B:182:0x02be, B:184:0x02c4, B:186:0x02c8, B:187:0x02cd, B:189:0x02d3, B:191:0x02d7, B:192:0x02dc, B:194:0x02e2, B:196:0x02e6, B:197:0x02eb, B:199:0x02f1, B:201:0x02f7, B:203:0x02ff, B:205:0x0303, B:209:0x0313, B:210:0x0316, B:208:0x0309, B:156:0x025b, B:158:0x0261, B:212:0x031e, B:214:0x0322, B:216:0x0328, B:218:0x032e, B:221:0x0353, B:223:0x0357, B:226:0x035c, B:229:0x036b, B:231:0x036f, B:234:0x0374, B:237:0x0383, B:239:0x0387, B:242:0x038c, B:243:0x038f, B:78:0x00f5, B:80:0x00fd, B:82:0x0101, B:84:0x0107, B:86:0x0111, B:88:0x0117), top: B:251:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0309 A[Catch: all -> 0x0393, TryCatch #0 {all -> 0x0393, blocks: (B:89:0x013a, B:91:0x0140, B:93:0x0146, B:95:0x014c, B:100:0x0157, B:101:0x015b, B:103:0x0161, B:104:0x016e, B:106:0x0174, B:107:0x0180, B:109:0x0186, B:110:0x01a2, B:115:0x01b1, B:121:0x01cd, B:125:0x01de, B:127:0x01ea, B:128:0x01f1, B:130:0x01f7, B:132:0x01fd, B:134:0x0203, B:136:0x0212, B:138:0x0216, B:140:0x021c, B:142:0x0222, B:143:0x022a, B:145:0x0230, B:146:0x0246, B:153:0x0252, B:155:0x0258, B:160:0x0265, B:161:0x0281, B:163:0x0287, B:165:0x028f, B:167:0x0293, B:170:0x0298, B:172:0x02a3, B:174:0x02a7, B:177:0x02ac, B:179:0x02b5, B:181:0x02b9, B:182:0x02be, B:184:0x02c4, B:186:0x02c8, B:187:0x02cd, B:189:0x02d3, B:191:0x02d7, B:192:0x02dc, B:194:0x02e2, B:196:0x02e6, B:197:0x02eb, B:199:0x02f1, B:201:0x02f7, B:203:0x02ff, B:205:0x0303, B:209:0x0313, B:210:0x0316, B:208:0x0309, B:156:0x025b, B:158:0x0261, B:212:0x031e, B:214:0x0322, B:216:0x0328, B:218:0x032e, B:221:0x0353, B:223:0x0357, B:226:0x035c, B:229:0x036b, B:231:0x036f, B:234:0x0374, B:237:0x0383, B:239:0x0387, B:242:0x038c, B:243:0x038f, B:78:0x00f5, B:80:0x00fd, B:82:0x0101, B:84:0x0107, B:86:0x0111, B:88:0x0117), top: B:251:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f2 A[PHI: r3
      0x00f2: PHI (r3v1 java.lang.Boolean) = (r3v0 java.lang.Boolean), (r3v13 java.lang.Boolean), (r3v13 java.lang.Boolean), (r3v13 java.lang.Boolean) binds: [B:75:0x00ee, B:16:0x0042, B:18:0x0048, B:258:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013a A[Catch: all -> 0x0393, TryCatch #0 {all -> 0x0393, blocks: (B:89:0x013a, B:91:0x0140, B:93:0x0146, B:95:0x014c, B:100:0x0157, B:101:0x015b, B:103:0x0161, B:104:0x016e, B:106:0x0174, B:107:0x0180, B:109:0x0186, B:110:0x01a2, B:115:0x01b1, B:121:0x01cd, B:125:0x01de, B:127:0x01ea, B:128:0x01f1, B:130:0x01f7, B:132:0x01fd, B:134:0x0203, B:136:0x0212, B:138:0x0216, B:140:0x021c, B:142:0x0222, B:143:0x022a, B:145:0x0230, B:146:0x0246, B:153:0x0252, B:155:0x0258, B:160:0x0265, B:161:0x0281, B:163:0x0287, B:165:0x028f, B:167:0x0293, B:170:0x0298, B:172:0x02a3, B:174:0x02a7, B:177:0x02ac, B:179:0x02b5, B:181:0x02b9, B:182:0x02be, B:184:0x02c4, B:186:0x02c8, B:187:0x02cd, B:189:0x02d3, B:191:0x02d7, B:192:0x02dc, B:194:0x02e2, B:196:0x02e6, B:197:0x02eb, B:199:0x02f1, B:201:0x02f7, B:203:0x02ff, B:205:0x0303, B:209:0x0313, B:210:0x0316, B:208:0x0309, B:156:0x025b, B:158:0x0261, B:212:0x031e, B:214:0x0322, B:216:0x0328, B:218:0x032e, B:221:0x0353, B:223:0x0357, B:226:0x035c, B:229:0x036b, B:231:0x036f, B:234:0x0374, B:237:0x0383, B:239:0x0387, B:242:0x038c, B:243:0x038f, B:78:0x00f5, B:80:0x00fd, B:82:0x0101, B:84:0x0107, B:86:0x0111, B:88:0x0117), top: B:251:0x00f5 }] */
    @Override // com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesCommonETService, com.ss.android.ugc.aweme.service.ISeriesCommonETService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> T appendPaidContentParam(com.ss.android.ugc.aweme.feed.model.Aweme r20, T r21) {
        /*
            Method dump skipped, instruction units count: 947
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesCommonETServiceImpl.appendPaidContentParam(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.Object):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesCommonETService, com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public final <T> T appendPaidContentParamForVideoPlay(Aweme aweme, T t) {
        PaidContentInfo paidContentInfo;
        String string;
        appendPaidContentParam(aweme, t);
        if (aweme != null && (paidContentInfo = aweme.mPaidContentInfo) != null && (string = Long.valueOf(paidContentInfo.getPaidCollectionId()).toString()) != null && !this.LIZJ.contains(string)) {
            SeriesCommonETService.addParamInner$default(this, t, "is_drama_first_video_play", "1", false, 4, null);
            this.LIZJ.add(string);
        }
        return t;
    }

    @Override // com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesCommonETService, com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public final <T> T appendSeriesInnerFeedMobParam(Aweme aweme, T t) {
        String string;
        String string2;
        String str;
        String string3;
        String collectionName;
        String episodeNumber;
        Integer numLJIIJJI;
        PaidContentInfo paidContentInfo;
        try {
            ISearchContextAbility iSearchContextAbilityLJI = C0Q3E.LJI();
            C0PRC c0prc = (C0PRC) iSearchContextAbilityLJI.Ph1().LIZJ();
            C646370PWx c646370PWx = (C646370PWx) iSearchContextAbilityLJI.wO2().LIZJ();
            C651130PgN c651130PgN = (C651130PgN) iSearchContextAbilityLJI.AX1().LIZJ();
            Object obj = c651130PgN.LLJJL.get("enter_from");
            if (obj != null) {
                string = obj.toString();
            } else {
                string = null;
            }
            if (!Intrinsics.LJFF(string, "search_result")) {
                return t;
            }
            if (aweme != null && (paidContentInfo = aweme.mPaidContentInfo) != null) {
                string2 = Long.valueOf(paidContentInfo.getPaidCollectionId()).toString();
            } else {
                string2 = null;
            }
            String str2 = "";
            if (string2 == null) {
                string2 = "";
            }
            if (string2.length() == 0) {
                str = c646370PWx.LLJ;
            } else {
                str = string2;
            }
            SeriesCommonETService.addParamInner$default(this, t, "search_id", c0prc.LLILLL, false, 4, null);
            SeriesCommonETService.addParamInner$default(this, t, "search_keyword", c0prc.LLIZLLLIL, false, 4, null);
            SeriesCommonETService.addParamInner$default(this, t, "search_result_id", str, false, 4, null);
            SeriesCommonETService.addParamInner$default(this, t, "search_type", c0prc.LLILLJJLI, false, 4, null);
            Object obj2 = c651130PgN.LLJJL.get("is_empty_search");
            if (obj2 == null) {
                obj2 = 0;
            }
            SeriesCommonETService.addParamInner$default(this, t, "is_empty_search", obj2.toString(), false, 4, null);
            Object obj3 = c651130PgN.LLJJL.get("rank");
            if (obj3 == null) {
                obj3 = 0;
            }
            SeriesCommonETService.addParamInner$default(this, t, "rank", obj3.toString(), false, 4, null);
            Object obj4 = c651130PgN.LLJJL.get("total_episode");
            if (obj4 == null) {
                obj4 = 0;
            }
            SeriesCommonETService.addParamInner$default(this, t, "total_episode", obj4.toString(), false, 4, null);
            SeriesCommonETService.addParamInner$default(this, t, "enter_from", c0prc.LIZIZ(), false, 4, null);
            if (aweme != null) {
                PaidContentInfo paidContentInfo2 = aweme.mPaidContentInfo;
                if (paidContentInfo2 == null || (episodeNumber = paidContentInfo2.getEpisodeNumber()) == null || (numLJIIJJI = C2095008Iq.LJIIJJI(episodeNumber)) == null || (string3 = numLJIIJJI.toString()) == null) {
                    string3 = CardStruct.IStatusCode.DEFAULT;
                }
                SeriesCommonETService.addParamInner$default(this, t, "progress_episode", string3, false, 4, null);
                PaidContentInfo paidContentInfo3 = aweme.mPaidContentInfo;
                if (paidContentInfo3 == null || (collectionName = paidContentInfo3.getCollectionName()) == null) {
                    collectionName = "";
                }
                SeriesCommonETService.addParamInner$default(this, t, "drama_title", collectionName, false, 4, null);
                if (getEnterFrom(t, "collection_id").length() == 0 && string2.length() > 0) {
                    SeriesCommonETService.addParamInner$default(this, t, "collection_id", string2, false, 4, null);
                }
                if (getEnterFrom(t, "group_id").length() == 0) {
                    String aid = aweme.getAid();
                    if (aid != null) {
                        str2 = aid;
                    }
                    SeriesCommonETService.addParamInner$default(this, t, "group_id", str2, false, 4, null);
                }
                if (getEnterFrom(t, "is_ad").length() == 0) {
                    SeriesCommonETService.addParamInner$default(this, t, "is_ad", toIntValue(Boolean.valueOf(aweme.isAd())), false, 4, null);
                }
            }
            C189200o6.m2constructorimpl(t);
            return t;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return t;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesCommonETService
    public final <T> String getEnterFrom(T t, String str) {
        Object c098200Yq;
        String string = null;
        try {
            if (t instanceof AbstractC1386130mAt) {
                c098200Yq = ((HashMap) ((AbstractC1386130mAt) t).LIZIZ).get(str);
            } else if (t instanceof C2241008qG) {
                c098200Yq = ((C2241008qG) t).LIZ.get(str);
            } else if (t instanceof C2344009Gk) {
                c098200Yq = ((C2344009Gk) t).LJIIIZ(str);
            } else if (t instanceof C0LAB) {
                c098200Yq = ((C0LAB) t).LJIIIIZZ(str);
            } else if (t instanceof JSONObject) {
                c098200Yq = ((JSONObject) t).optString(str);
            } else if (t instanceof Map) {
                c098200Yq = ((Map) t).get(str);
            } else if (t instanceof Uri.Builder) {
                c098200Yq = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(((Uri.Builder) t).build(), str);
            } else if (!(t instanceof Map)) {
                c098200Yq = "";
            } else {
                Object obj = ((Map) t).get(str);
                if (obj instanceof String) {
                    c098200Yq = (String) obj;
                } else {
                    c098200Yq = null;
                }
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        if (c098200Yq != null) {
            string = c098200Yq.toString();
        }
        if (string == null) {
            return "";
        }
        return string;
    }

    @Override // com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesCommonETService
    public final String getMobParams(Aweme aweme, String str) {
        HashMap<String, String> mobParams = aweme.getMobParams();
        if (mobParams != null) {
            return mobParams.get(str);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesCommonETService
    public final <T> T appendPaidContentFcpComponentParam(T t, Aweme aweme) {
        appendPaidContentFcpComponentParam(aweme, t);
        return t;
    }

    @Override // com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesCommonETService
    public final <T> T appendPaidContentParam(T t, Aweme aweme) {
        appendPaidContentParam(aweme, t);
        return t;
    }

    @Override // com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesCommonETService
    public final <T> T appendPaidContentParamForVideoPlay(T t, Aweme aweme) {
        appendPaidContentParamForVideoPlay(aweme, t);
        return t;
    }

    @Override // com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesCommonETService
    public final <T> T appendSeriesInnerFeedMobParam(T t, Aweme aweme) {
        appendSeriesInnerFeedMobParam(aweme, t);
        return t;
    }

    public final <T> void LIZ(Aweme aweme, String str, T t) {
        String aid;
        String str2;
        String str3;
        InterfaceC1577280r9C interfaceC1577280r9CLIZ;
        Aweme awemeLJIILLIIL;
        String str4 = str;
        C1612510s41 commonETParams = getCommonETParams();
        ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
        if (iSeriesFeedServiceLIZIZ != null && (interfaceC1577280r9CLIZ = iSeriesFeedServiceLIZIZ.LIZ()) != null && (awemeLJIILLIIL = interfaceC1577280r9CLIZ.LJIILLIIL()) != null) {
            aid = awemeLJIILLIIL.getAid();
        } else {
            aid = null;
        }
        boolean zLJFF = Intrinsics.LJFF(aid, aweme.getAid());
        if (zLJFF) {
            str2 = "1";
        } else {
            str2 = "2";
        }
        if (commonETParams != null) {
            str3 = commonETParams.LJIIJJI;
        } else {
            str3 = null;
        }
        if (!Intrinsics.LJFF(str3, "series_dnu_insertion") && !zLJFF) {
            String mobParams = getMobParams(aweme, "is_from_series_dnu_insertion");
            if (mobParams != null) {
                SeriesCommonETService.addParamInner$default(this, t, "is_from_series_dnu_insertion", mobParams, false, 4, null);
            }
        } else {
            SeriesCommonETService.addParamInner$default(this, t, "is_from_series_dnu_insertion", str2, false, 4, null);
        }
        if (zLJFF) {
            String mobParams2 = getMobParams(aweme, "series_dnu_insertion_position");
            if (mobParams2 != null) {
                SeriesCommonETService.addParamInner$default(this, t, "series_dnu_insertion_position", mobParams2, false, 4, null);
            }
            if (str4.length() == 0) {
                str4 = "homepage_hot";
            }
            this.LIZIZ = new Pair<>(str4, str2);
            return;
        }
        this.LIZIZ = null;
    }

    public final void LIZIZ(Aweme aweme, String str, Object obj) {
        boolean z;
        DramaExtraTrackingParams dramaExtraTrackingParams;
        boolean zLJFF;
        boolean zLJFF2;
        String mobParams;
        INUJUnderTakeManager.LIZ.getClass();
        INUJUnderTakeManager iNUJUnderTakeManagerLIZ = C1589520rSw.LIZ();
        if (!Intrinsics.LJFF(str, "others_homepage") && !Intrinsics.LJFF(getEnterFrom(obj, "enter_from"), "others_homepage")) {
            z = false;
        } else {
            z = true;
        }
        boolean zLJFF3 = Intrinsics.LJFF(getEnterFrom(obj, "origin_event_name"), "follow_cancel");
        if (z && zLJFF3) {
            return;
        }
        C1612510s41 commonETParams = getCommonETParams();
        if (commonETParams != null) {
            dramaExtraTrackingParams = commonETParams.LJIILIIL;
        } else {
            dramaExtraTrackingParams = null;
        }
        boolean zLJFF4 = Intrinsics.LJFF(str, "paid_series_detail_page");
        if (zLJFF4) {
            if (Intrinsics.LJFF(getMobParams(aweme, "series_inner_feed_first_video"), "1") && ((dramaExtraTrackingParams != null && Intrinsics.LJFF(dramaExtraTrackingParams.isFromUnderTakeForcedInsert(), Boolean.TRUE)) || Intrinsics.LJFF(getMobParams(aweme, "is_forced_insertion"), "1"))) {
                zLJFF = true;
            } else {
                zLJFF = false;
            }
        } else {
            zLJFF = Intrinsics.LJFF(getMobParams(aweme, "is_forced_insertion"), "1");
        }
        SeriesCommonETService.addParamInner$default(this, obj, "is_forced_insertion", toIntValue(Boolean.valueOf(zLJFF)), false, 4, null);
        if (zLJFF) {
            zLJFF2 = false;
        } else {
            zLJFF2 = Intrinsics.LJFF(getMobParams(aweme, "is_from_forced_insertion"), "1");
        }
        SeriesCommonETService.addParamInner$default(this, obj, "is_source_item_forced_insertion", toIntValue(Boolean.valueOf(zLJFF2)), false, 4, null);
        if (zLJFF || zLJFF2) {
            iNUJUnderTakeManagerLIZ.LIZLLL();
            for (Map.Entry<String, String> entry : iNUJUnderTakeManagerLIZ.LIZ().entrySet()) {
                SeriesCommonETService.addParamInner$default(this, obj, entry.getKey(), entry.getValue(), false, 4, null);
            }
            if (zLJFF4) {
                if (dramaExtraTrackingParams == null || (mobParams = dramaExtraTrackingParams.forcedInsertScene) == null || mobParams.length() == 0) {
                    mobParams = getMobParams(aweme, "forced_insertion_scene");
                }
            } else if (Intrinsics.LJFF(str, "homepage_series")) {
                mobParams = "homepage_series_outerfeed";
            } else if (Intrinsics.LJFF(str, "homepage_hot")) {
                mobParams = "homepage_hot_outerfeed";
            } else {
                mobParams = "";
            }
            if (mobParams != null) {
                SeriesCommonETService.addParamInner$default(this, obj, "forced_insertion_scene", mobParams, false, 4, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesCommonETService
    public final <T> T addParamInner(T t, String str, String str2, boolean z) {
        Object objAppendQueryParameter;
        Map map;
        Map map2;
        try {
            if (t instanceof AbstractC1386130mAt) {
                if (!z) {
                    AbstractC1386130mAt abstractC1386130mAt = (AbstractC1386130mAt) t;
                    abstractC1386130mAt.getClass();
                    abstractC1386130mAt.LJFF(str, str2, InterfaceC1210900hcG.LIZ);
                    objAppendQueryParameter = abstractC1386130mAt;
                } else {
                    AbstractC1386130mAt abstractC1386130mAt2 = (AbstractC1386130mAt) t;
                    abstractC1386130mAt2.LIZIZ(C2097908Jt.LIZJ(new Pair(str, str2)));
                    objAppendQueryParameter = abstractC1386130mAt2;
                }
            } else if (t instanceof C2241008qG) {
                C2241008qG c2241008qG = (C2241008qG) t;
                c2241008qG.LIZ.put(str, str2);
                objAppendQueryParameter = c2241008qG;
            } else if (t instanceof C2344009Gk) {
                C2344009Gk c2344009Gk = (C2344009Gk) t;
                c2344009Gk.getClass();
                c2344009Gk.LJIIIIZZ(str, str2);
                objAppendQueryParameter = c2344009Gk;
            } else if (t instanceof C0LAB) {
                C0LAB c0lab = (C0LAB) t;
                c0lab.LJ(str, str2);
                objAppendQueryParameter = c0lab;
            } else if (t instanceof JSONObject) {
                objAppendQueryParameter = ((JSONObject) t).put(str, str2);
            } else if (t instanceof Map) {
                objAppendQueryParameter = null;
                objAppendQueryParameter = null;
                if (C19719512Dh.LJII(t) && (map2 = (Map) t) != null) {
                }
                if (C19719512Dh.LJII(t) && (map = (Map) t) != null) {
                    objAppendQueryParameter = map.put(str, str2);
                }
            } else if (t instanceof Uri.Builder) {
                objAppendQueryParameter = ((Uri.Builder) t).appendQueryParameter(str, str2);
            } else {
                if (C19719512Dh.LJII(t)) {
                    C19719512Dh.LIZJ(t).put(str, str2);
                }
                objAppendQueryParameter = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(objAppendQueryParameter);
            return t;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return t;
        }
    }

    @Override // com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesCommonETService, com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public final void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C793770VBv.LJII(str, jSONObject, jSONObject2, jSONObject3);
    }
}
