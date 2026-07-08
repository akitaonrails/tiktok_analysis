package com.ss.android.ugc.aweme.series.common.serviceimpl;

import X.C01GW;
import X.C098200Yq;
import X.C123100dR;
import X.C13DA;
import X.C13LP;
import X.C1612510s41;
import X.C1612580s48;
import X.C1612610s4B;
import X.C1613620s5o;
import X.C189200o6;
import X.C19719612Di;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C452501pT;
import X.C695070ROf;
import X.EnumC1612540s44;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.minidrama.common.component.service.ISeriesLimitedFreeService;
import com.ss.android.ugc.aweme.service.ISeriesCommonETService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AwS74S1000000_24;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public abstract class SeriesCommonETService implements ISeriesCommonETService {
    public static final C1613620s5o Companion = new Object() { // from class: X.0s5o
    };
    public final C01GW limitedFreeService$delegate = C452501pT.LIZIZ(new C1612580s48());
    public final CopyOnWriteArrayList<C1612610s4B> commonParamsStack = new CopyOnWriteArrayList<>();
    public final Map<String, String> dramaTabETParams = new LinkedHashMap();

    public abstract <T> T addParamInner(T t, String str, String str2, boolean z);

    @Override // com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public <T> T appendPaidContentFcpComponentParam(Aweme aweme, T t) {
        return t;
    }

    public <T> T appendPaidContentParam(T t, Aweme aweme) {
        return t;
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public <T> T appendPaidContentParamForVideoPlay(Aweme aweme, T t) {
        return t;
    }

    public <T> T appendPaidContentParamForVideoPlay(T t, Aweme aweme) {
        return t;
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public <T> T appendSeriesInnerFeedMobParam(Aweme aweme, T t) {
        return t;
    }

    public <T> T appendSeriesInnerFeedMobParam(T t, Aweme aweme) {
        return t;
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public void clearFirstPlayStateForCollection(String str) {
    }

    public String getAdCollectionId(Aweme aweme) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public abstract /* synthetic */ Pair<String, String> getDramaDNUVideoLoginContext();

    public <T> String getEnterFrom(T t, String str) {
        return "";
    }

    public abstract String getMobContinuePlayParam(Aweme aweme);

    public String getMobParams(Aweme aweme, String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public Map<String, String> getPaidContentInnerFeedSourceParam(Aweme aweme) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public String getSeriesEnterEntrance() {
        C1612510s41 commonETParams = getCommonETParams();
        if (commonETParams == null) {
            return "";
        }
        if (!C123100dR.LIZ(commonETParams.LJIIJJI)) {
            return getSeriesEnterEntrance(commonETParams.LJ, Boolean.valueOf(commonETParams.LIZJ), Boolean.valueOf(commonETParams.LIZIZ), Boolean.valueOf(commonETParams.LJFF), commonETParams.LJIIIZ, Boolean.valueOf(commonETParams.LIZ), commonETParams.LJIIJ);
        }
        String str = commonETParams.LJIIJJI;
        return str != null ? str : "";
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public String getSeriesVideoType(Aweme aweme) {
        return null;
    }

    public abstract boolean isLimitFreeFromBanner(Aweme aweme);

    @Override // com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public C1612610s4B getCurrentContext() {
        if (!this.commonParamsStack.isEmpty()) {
            return (C1612610s4B) C13LP.LJJLIIIJJI(this.commonParamsStack);
        }
        return null;
    }

    public final ISeriesLimitedFreeService getLimitedFreeService() {
        return (ISeriesLimitedFreeService) this.limitedFreeService$delegate.getValue();
    }

    public final C1612510s41 getCommonETParams() {
        C1612610s4B currentContext = getCurrentContext();
        if (currentContext != null) {
            return currentContext.LIZIZ;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public EnumC1612540s44 getPlayVideoType() {
        EnumC1612540s44 enumC1612540s44;
        C1612510s41 commonETParams = getCommonETParams();
        return (commonETParams == null || (enumC1612540s44 = commonETParams.LIZLLL) == null) ? EnumC1612540s44.DEFAULT : enumC1612540s44;
    }

    public final Map<String, String> getDramaTabETParams() {
        return this.dramaTabETParams;
    }

    private final boolean isSeriesContinuationPlay(Aweme aweme) {
        String mobContinuePlayParam = getMobContinuePlayParam(aweme);
        if (mobContinuePlayParam != null) {
            return Intrinsics.LJFF(mobContinuePlayParam, "1");
        }
        C1612510s41 commonETParams = getCommonETParams();
        if (commonETParams != null && commonETParams.LJII) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public void pushSeriesContext(C1612610s4B c1612610s4B) {
        C1612610s4B c1612610s4B2 = (C1612610s4B) C13LP.LJJLIIIJL(this.commonParamsStack);
        String str = null;
        if (c1612610s4B2 != null) {
            str = c1612610s4B2.LIZ;
        }
        if (Intrinsics.LJFF(str, c1612610s4B.LIZ)) {
            return;
        }
        for (C1612610s4B c1612610s4B3 : this.commonParamsStack) {
            if (Intrinsics.LJFF(c1612610s4B3.LIZ, c1612610s4B.LIZ)) {
                if (c1612610s4B3 != null) {
                    this.commonParamsStack.remove(c1612610s4B3);
                    this.commonParamsStack.add(c1612610s4B3);
                    return;
                }
                return;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public void removeSeriesContext(String str) {
        C19719612Di.LJJIIJ(this.commonParamsStack, new AwS74S1000000_24(str, 6), true);
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public void setCommonETParams(C1612610s4B c1612610s4B) {
        C1612610s4B next;
        Object objValueOf;
        Iterator<C1612610s4B> it2 = this.commonParamsStack.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (!Intrinsics.LJFF(next.LIZ, c1612610s4B.LIZ)) {
                }
            } else {
                next = null;
                break;
            }
        }
        try {
            if (next != null) {
                CopyOnWriteArrayList<C1612610s4B> copyOnWriteArrayList = this.commonParamsStack;
                objValueOf = copyOnWriteArrayList.set(copyOnWriteArrayList.indexOf(next), c1612610s4B);
            } else {
                objValueOf = Boolean.valueOf(this.commonParamsStack.add(c1612610s4B));
            }
            C189200o6.m2constructorimpl(objValueOf);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public void setDramaTabETParam(Map<String, String> map) {
        this.dramaTabETParams.clear();
        if (map != null) {
            this.dramaTabETParams.putAll(map);
        }
    }

    public final String toIntValue(Boolean bool) {
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public <T> T appendPaidContentFcpComponentParam(T t, Aweme aweme) {
        appendPaidContentFcpComponentParam(aweme, t);
        return t;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01e1 A[Catch: all -> 0x053d, TryCatch #2 {all -> 0x053d, blocks: (B:116:0x01db, B:118:0x01e1, B:119:0x01e9, B:121:0x0231, B:124:0x0237, B:126:0x0261, B:131:0x0276, B:133:0x0285, B:136:0x02a0, B:138:0x02a4, B:139:0x02a8, B:141:0x02b9, B:143:0x02bd, B:144:0x02c1, B:146:0x02d2, B:157:0x02f9, B:159:0x030e, B:161:0x031b, B:164:0x032e, B:165:0x0334, B:167:0x0345, B:168:0x034b, B:170:0x035e, B:225:0x0401, B:227:0x0405, B:230:0x040a, B:233:0x041b, B:244:0x0433, B:247:0x0448, B:249:0x0457, B:252:0x045f, B:254:0x046e, B:257:0x0476, B:259:0x0487, B:262:0x048f, B:267:0x04a5, B:269:0x04a9, B:271:0x04ad, B:280:0x04f8, B:284:0x0501, B:285:0x0503, B:288:0x050b, B:292:0x051e, B:293:0x0520, B:295:0x0526, B:297:0x052c, B:298:0x0539, B:279:0x04ed, B:236:0x0422, B:239:0x042a, B:241:0x042e, B:172:0x0364, B:180:0x037b, B:182:0x037f, B:183:0x0381, B:187:0x038b, B:189:0x038f, B:192:0x0394, B:195:0x03ab, B:197:0x03af, B:200:0x03b5, B:202:0x03b9, B:205:0x03be, B:210:0x03d9, B:212:0x03dd, B:213:0x03df, B:217:0x03e9, B:219:0x03ed, B:222:0x03f2, B:153:0x02e1, B:154:0x02e7, B:123:0x0235, B:273:0x04b3, B:274:0x04bc, B:276:0x04c2, B:277:0x04e6), top: B:308:0x01db, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0231 A[Catch: all -> 0x053d, TryCatch #2 {all -> 0x053d, blocks: (B:116:0x01db, B:118:0x01e1, B:119:0x01e9, B:121:0x0231, B:124:0x0237, B:126:0x0261, B:131:0x0276, B:133:0x0285, B:136:0x02a0, B:138:0x02a4, B:139:0x02a8, B:141:0x02b9, B:143:0x02bd, B:144:0x02c1, B:146:0x02d2, B:157:0x02f9, B:159:0x030e, B:161:0x031b, B:164:0x032e, B:165:0x0334, B:167:0x0345, B:168:0x034b, B:170:0x035e, B:225:0x0401, B:227:0x0405, B:230:0x040a, B:233:0x041b, B:244:0x0433, B:247:0x0448, B:249:0x0457, B:252:0x045f, B:254:0x046e, B:257:0x0476, B:259:0x0487, B:262:0x048f, B:267:0x04a5, B:269:0x04a9, B:271:0x04ad, B:280:0x04f8, B:284:0x0501, B:285:0x0503, B:288:0x050b, B:292:0x051e, B:293:0x0520, B:295:0x0526, B:297:0x052c, B:298:0x0539, B:279:0x04ed, B:236:0x0422, B:239:0x042a, B:241:0x042e, B:172:0x0364, B:180:0x037b, B:182:0x037f, B:183:0x0381, B:187:0x038b, B:189:0x038f, B:192:0x0394, B:195:0x03ab, B:197:0x03af, B:200:0x03b5, B:202:0x03b9, B:205:0x03be, B:210:0x03d9, B:212:0x03dd, B:213:0x03df, B:217:0x03e9, B:219:0x03ed, B:222:0x03f2, B:153:0x02e1, B:154:0x02e7, B:123:0x0235, B:273:0x04b3, B:274:0x04bc, B:276:0x04c2, B:277:0x04e6), top: B:308:0x01db, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0235 A[Catch: all -> 0x053d, TryCatch #2 {all -> 0x053d, blocks: (B:116:0x01db, B:118:0x01e1, B:119:0x01e9, B:121:0x0231, B:124:0x0237, B:126:0x0261, B:131:0x0276, B:133:0x0285, B:136:0x02a0, B:138:0x02a4, B:139:0x02a8, B:141:0x02b9, B:143:0x02bd, B:144:0x02c1, B:146:0x02d2, B:157:0x02f9, B:159:0x030e, B:161:0x031b, B:164:0x032e, B:165:0x0334, B:167:0x0345, B:168:0x034b, B:170:0x035e, B:225:0x0401, B:227:0x0405, B:230:0x040a, B:233:0x041b, B:244:0x0433, B:247:0x0448, B:249:0x0457, B:252:0x045f, B:254:0x046e, B:257:0x0476, B:259:0x0487, B:262:0x048f, B:267:0x04a5, B:269:0x04a9, B:271:0x04ad, B:280:0x04f8, B:284:0x0501, B:285:0x0503, B:288:0x050b, B:292:0x051e, B:293:0x0520, B:295:0x0526, B:297:0x052c, B:298:0x0539, B:279:0x04ed, B:236:0x0422, B:239:0x042a, B:241:0x042e, B:172:0x0364, B:180:0x037b, B:182:0x037f, B:183:0x0381, B:187:0x038b, B:189:0x038f, B:192:0x0394, B:195:0x03ab, B:197:0x03af, B:200:0x03b5, B:202:0x03b9, B:205:0x03be, B:210:0x03d9, B:212:0x03dd, B:213:0x03df, B:217:0x03e9, B:219:0x03ed, B:222:0x03f2, B:153:0x02e1, B:154:0x02e7, B:123:0x0235, B:273:0x04b3, B:274:0x04bc, B:276:0x04c2, B:277:0x04e6), top: B:308:0x01db, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0261 A[Catch: all -> 0x053d, TryCatch #2 {all -> 0x053d, blocks: (B:116:0x01db, B:118:0x01e1, B:119:0x01e9, B:121:0x0231, B:124:0x0237, B:126:0x0261, B:131:0x0276, B:133:0x0285, B:136:0x02a0, B:138:0x02a4, B:139:0x02a8, B:141:0x02b9, B:143:0x02bd, B:144:0x02c1, B:146:0x02d2, B:157:0x02f9, B:159:0x030e, B:161:0x031b, B:164:0x032e, B:165:0x0334, B:167:0x0345, B:168:0x034b, B:170:0x035e, B:225:0x0401, B:227:0x0405, B:230:0x040a, B:233:0x041b, B:244:0x0433, B:247:0x0448, B:249:0x0457, B:252:0x045f, B:254:0x046e, B:257:0x0476, B:259:0x0487, B:262:0x048f, B:267:0x04a5, B:269:0x04a9, B:271:0x04ad, B:280:0x04f8, B:284:0x0501, B:285:0x0503, B:288:0x050b, B:292:0x051e, B:293:0x0520, B:295:0x0526, B:297:0x052c, B:298:0x0539, B:279:0x04ed, B:236:0x0422, B:239:0x042a, B:241:0x042e, B:172:0x0364, B:180:0x037b, B:182:0x037f, B:183:0x0381, B:187:0x038b, B:189:0x038f, B:192:0x0394, B:195:0x03ab, B:197:0x03af, B:200:0x03b5, B:202:0x03b9, B:205:0x03be, B:210:0x03d9, B:212:0x03dd, B:213:0x03df, B:217:0x03e9, B:219:0x03ed, B:222:0x03f2, B:153:0x02e1, B:154:0x02e7, B:123:0x0235, B:273:0x04b3, B:274:0x04bc, B:276:0x04c2, B:277:0x04e6), top: B:308:0x01db, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0285 A[Catch: all -> 0x053d, TryCatch #2 {all -> 0x053d, blocks: (B:116:0x01db, B:118:0x01e1, B:119:0x01e9, B:121:0x0231, B:124:0x0237, B:126:0x0261, B:131:0x0276, B:133:0x0285, B:136:0x02a0, B:138:0x02a4, B:139:0x02a8, B:141:0x02b9, B:143:0x02bd, B:144:0x02c1, B:146:0x02d2, B:157:0x02f9, B:159:0x030e, B:161:0x031b, B:164:0x032e, B:165:0x0334, B:167:0x0345, B:168:0x034b, B:170:0x035e, B:225:0x0401, B:227:0x0405, B:230:0x040a, B:233:0x041b, B:244:0x0433, B:247:0x0448, B:249:0x0457, B:252:0x045f, B:254:0x046e, B:257:0x0476, B:259:0x0487, B:262:0x048f, B:267:0x04a5, B:269:0x04a9, B:271:0x04ad, B:280:0x04f8, B:284:0x0501, B:285:0x0503, B:288:0x050b, B:292:0x051e, B:293:0x0520, B:295:0x0526, B:297:0x052c, B:298:0x0539, B:279:0x04ed, B:236:0x0422, B:239:0x042a, B:241:0x042e, B:172:0x0364, B:180:0x037b, B:182:0x037f, B:183:0x0381, B:187:0x038b, B:189:0x038f, B:192:0x0394, B:195:0x03ab, B:197:0x03af, B:200:0x03b5, B:202:0x03b9, B:205:0x03be, B:210:0x03d9, B:212:0x03dd, B:213:0x03df, B:217:0x03e9, B:219:0x03ed, B:222:0x03f2, B:153:0x02e1, B:154:0x02e7, B:123:0x0235, B:273:0x04b3, B:274:0x04bc, B:276:0x04c2, B:277:0x04e6), top: B:308:0x01db, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02a0 A[Catch: all -> 0x053d, TryCatch #2 {all -> 0x053d, blocks: (B:116:0x01db, B:118:0x01e1, B:119:0x01e9, B:121:0x0231, B:124:0x0237, B:126:0x0261, B:131:0x0276, B:133:0x0285, B:136:0x02a0, B:138:0x02a4, B:139:0x02a8, B:141:0x02b9, B:143:0x02bd, B:144:0x02c1, B:146:0x02d2, B:157:0x02f9, B:159:0x030e, B:161:0x031b, B:164:0x032e, B:165:0x0334, B:167:0x0345, B:168:0x034b, B:170:0x035e, B:225:0x0401, B:227:0x0405, B:230:0x040a, B:233:0x041b, B:244:0x0433, B:247:0x0448, B:249:0x0457, B:252:0x045f, B:254:0x046e, B:257:0x0476, B:259:0x0487, B:262:0x048f, B:267:0x04a5, B:269:0x04a9, B:271:0x04ad, B:280:0x04f8, B:284:0x0501, B:285:0x0503, B:288:0x050b, B:292:0x051e, B:293:0x0520, B:295:0x0526, B:297:0x052c, B:298:0x0539, B:279:0x04ed, B:236:0x0422, B:239:0x042a, B:241:0x042e, B:172:0x0364, B:180:0x037b, B:182:0x037f, B:183:0x0381, B:187:0x038b, B:189:0x038f, B:192:0x0394, B:195:0x03ab, B:197:0x03af, B:200:0x03b5, B:202:0x03b9, B:205:0x03be, B:210:0x03d9, B:212:0x03dd, B:213:0x03df, B:217:0x03e9, B:219:0x03ed, B:222:0x03f2, B:153:0x02e1, B:154:0x02e7, B:123:0x0235, B:273:0x04b3, B:274:0x04bc, B:276:0x04c2, B:277:0x04e6), top: B:308:0x01db, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b9 A[Catch: all -> 0x053d, TryCatch #2 {all -> 0x053d, blocks: (B:116:0x01db, B:118:0x01e1, B:119:0x01e9, B:121:0x0231, B:124:0x0237, B:126:0x0261, B:131:0x0276, B:133:0x0285, B:136:0x02a0, B:138:0x02a4, B:139:0x02a8, B:141:0x02b9, B:143:0x02bd, B:144:0x02c1, B:146:0x02d2, B:157:0x02f9, B:159:0x030e, B:161:0x031b, B:164:0x032e, B:165:0x0334, B:167:0x0345, B:168:0x034b, B:170:0x035e, B:225:0x0401, B:227:0x0405, B:230:0x040a, B:233:0x041b, B:244:0x0433, B:247:0x0448, B:249:0x0457, B:252:0x045f, B:254:0x046e, B:257:0x0476, B:259:0x0487, B:262:0x048f, B:267:0x04a5, B:269:0x04a9, B:271:0x04ad, B:280:0x04f8, B:284:0x0501, B:285:0x0503, B:288:0x050b, B:292:0x051e, B:293:0x0520, B:295:0x0526, B:297:0x052c, B:298:0x0539, B:279:0x04ed, B:236:0x0422, B:239:0x042a, B:241:0x042e, B:172:0x0364, B:180:0x037b, B:182:0x037f, B:183:0x0381, B:187:0x038b, B:189:0x038f, B:192:0x0394, B:195:0x03ab, B:197:0x03af, B:200:0x03b5, B:202:0x03b9, B:205:0x03be, B:210:0x03d9, B:212:0x03dd, B:213:0x03df, B:217:0x03e9, B:219:0x03ed, B:222:0x03f2, B:153:0x02e1, B:154:0x02e7, B:123:0x0235, B:273:0x04b3, B:274:0x04bc, B:276:0x04c2, B:277:0x04e6), top: B:308:0x01db, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02d2 A[Catch: all -> 0x053d, TryCatch #2 {all -> 0x053d, blocks: (B:116:0x01db, B:118:0x01e1, B:119:0x01e9, B:121:0x0231, B:124:0x0237, B:126:0x0261, B:131:0x0276, B:133:0x0285, B:136:0x02a0, B:138:0x02a4, B:139:0x02a8, B:141:0x02b9, B:143:0x02bd, B:144:0x02c1, B:146:0x02d2, B:157:0x02f9, B:159:0x030e, B:161:0x031b, B:164:0x032e, B:165:0x0334, B:167:0x0345, B:168:0x034b, B:170:0x035e, B:225:0x0401, B:227:0x0405, B:230:0x040a, B:233:0x041b, B:244:0x0433, B:247:0x0448, B:249:0x0457, B:252:0x045f, B:254:0x046e, B:257:0x0476, B:259:0x0487, B:262:0x048f, B:267:0x04a5, B:269:0x04a9, B:271:0x04ad, B:280:0x04f8, B:284:0x0501, B:285:0x0503, B:288:0x050b, B:292:0x051e, B:293:0x0520, B:295:0x0526, B:297:0x052c, B:298:0x0539, B:279:0x04ed, B:236:0x0422, B:239:0x042a, B:241:0x042e, B:172:0x0364, B:180:0x037b, B:182:0x037f, B:183:0x0381, B:187:0x038b, B:189:0x038f, B:192:0x0394, B:195:0x03ab, B:197:0x03af, B:200:0x03b5, B:202:0x03b9, B:205:0x03be, B:210:0x03d9, B:212:0x03dd, B:213:0x03df, B:217:0x03e9, B:219:0x03ed, B:222:0x03f2, B:153:0x02e1, B:154:0x02e7, B:123:0x0235, B:273:0x04b3, B:274:0x04bc, B:276:0x04c2, B:277:0x04e6), top: B:308:0x01db, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x030e A[Catch: all -> 0x053d, TryCatch #2 {all -> 0x053d, blocks: (B:116:0x01db, B:118:0x01e1, B:119:0x01e9, B:121:0x0231, B:124:0x0237, B:126:0x0261, B:131:0x0276, B:133:0x0285, B:136:0x02a0, B:138:0x02a4, B:139:0x02a8, B:141:0x02b9, B:143:0x02bd, B:144:0x02c1, B:146:0x02d2, B:157:0x02f9, B:159:0x030e, B:161:0x031b, B:164:0x032e, B:165:0x0334, B:167:0x0345, B:168:0x034b, B:170:0x035e, B:225:0x0401, B:227:0x0405, B:230:0x040a, B:233:0x041b, B:244:0x0433, B:247:0x0448, B:249:0x0457, B:252:0x045f, B:254:0x046e, B:257:0x0476, B:259:0x0487, B:262:0x048f, B:267:0x04a5, B:269:0x04a9, B:271:0x04ad, B:280:0x04f8, B:284:0x0501, B:285:0x0503, B:288:0x050b, B:292:0x051e, B:293:0x0520, B:295:0x0526, B:297:0x052c, B:298:0x0539, B:279:0x04ed, B:236:0x0422, B:239:0x042a, B:241:0x042e, B:172:0x0364, B:180:0x037b, B:182:0x037f, B:183:0x0381, B:187:0x038b, B:189:0x038f, B:192:0x0394, B:195:0x03ab, B:197:0x03af, B:200:0x03b5, B:202:0x03b9, B:205:0x03be, B:210:0x03d9, B:212:0x03dd, B:213:0x03df, B:217:0x03e9, B:219:0x03ed, B:222:0x03f2, B:153:0x02e1, B:154:0x02e7, B:123:0x0235, B:273:0x04b3, B:274:0x04bc, B:276:0x04c2, B:277:0x04e6), top: B:308:0x01db, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x031b A[Catch: all -> 0x053d, TryCatch #2 {all -> 0x053d, blocks: (B:116:0x01db, B:118:0x01e1, B:119:0x01e9, B:121:0x0231, B:124:0x0237, B:126:0x0261, B:131:0x0276, B:133:0x0285, B:136:0x02a0, B:138:0x02a4, B:139:0x02a8, B:141:0x02b9, B:143:0x02bd, B:144:0x02c1, B:146:0x02d2, B:157:0x02f9, B:159:0x030e, B:161:0x031b, B:164:0x032e, B:165:0x0334, B:167:0x0345, B:168:0x034b, B:170:0x035e, B:225:0x0401, B:227:0x0405, B:230:0x040a, B:233:0x041b, B:244:0x0433, B:247:0x0448, B:249:0x0457, B:252:0x045f, B:254:0x046e, B:257:0x0476, B:259:0x0487, B:262:0x048f, B:267:0x04a5, B:269:0x04a9, B:271:0x04ad, B:280:0x04f8, B:284:0x0501, B:285:0x0503, B:288:0x050b, B:292:0x051e, B:293:0x0520, B:295:0x0526, B:297:0x052c, B:298:0x0539, B:279:0x04ed, B:236:0x0422, B:239:0x042a, B:241:0x042e, B:172:0x0364, B:180:0x037b, B:182:0x037f, B:183:0x0381, B:187:0x038b, B:189:0x038f, B:192:0x0394, B:195:0x03ab, B:197:0x03af, B:200:0x03b5, B:202:0x03b9, B:205:0x03be, B:210:0x03d9, B:212:0x03dd, B:213:0x03df, B:217:0x03e9, B:219:0x03ed, B:222:0x03f2, B:153:0x02e1, B:154:0x02e7, B:123:0x0235, B:273:0x04b3, B:274:0x04bc, B:276:0x04c2, B:277:0x04e6), top: B:308:0x01db, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x032e A[Catch: all -> 0x053d, TryCatch #2 {all -> 0x053d, blocks: (B:116:0x01db, B:118:0x01e1, B:119:0x01e9, B:121:0x0231, B:124:0x0237, B:126:0x0261, B:131:0x0276, B:133:0x0285, B:136:0x02a0, B:138:0x02a4, B:139:0x02a8, B:141:0x02b9, B:143:0x02bd, B:144:0x02c1, B:146:0x02d2, B:157:0x02f9, B:159:0x030e, B:161:0x031b, B:164:0x032e, B:165:0x0334, B:167:0x0345, B:168:0x034b, B:170:0x035e, B:225:0x0401, B:227:0x0405, B:230:0x040a, B:233:0x041b, B:244:0x0433, B:247:0x0448, B:249:0x0457, B:252:0x045f, B:254:0x046e, B:257:0x0476, B:259:0x0487, B:262:0x048f, B:267:0x04a5, B:269:0x04a9, B:271:0x04ad, B:280:0x04f8, B:284:0x0501, B:285:0x0503, B:288:0x050b, B:292:0x051e, B:293:0x0520, B:295:0x0526, B:297:0x052c, B:298:0x0539, B:279:0x04ed, B:236:0x0422, B:239:0x042a, B:241:0x042e, B:172:0x0364, B:180:0x037b, B:182:0x037f, B:183:0x0381, B:187:0x038b, B:189:0x038f, B:192:0x0394, B:195:0x03ab, B:197:0x03af, B:200:0x03b5, B:202:0x03b9, B:205:0x03be, B:210:0x03d9, B:212:0x03dd, B:213:0x03df, B:217:0x03e9, B:219:0x03ed, B:222:0x03f2, B:153:0x02e1, B:154:0x02e7, B:123:0x0235, B:273:0x04b3, B:274:0x04bc, B:276:0x04c2, B:277:0x04e6), top: B:308:0x01db, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0345 A[Catch: all -> 0x053d, TryCatch #2 {all -> 0x053d, blocks: (B:116:0x01db, B:118:0x01e1, B:119:0x01e9, B:121:0x0231, B:124:0x0237, B:126:0x0261, B:131:0x0276, B:133:0x0285, B:136:0x02a0, B:138:0x02a4, B:139:0x02a8, B:141:0x02b9, B:143:0x02bd, B:144:0x02c1, B:146:0x02d2, B:157:0x02f9, B:159:0x030e, B:161:0x031b, B:164:0x032e, B:165:0x0334, B:167:0x0345, B:168:0x034b, B:170:0x035e, B:225:0x0401, B:227:0x0405, B:230:0x040a, B:233:0x041b, B:244:0x0433, B:247:0x0448, B:249:0x0457, B:252:0x045f, B:254:0x046e, B:257:0x0476, B:259:0x0487, B:262:0x048f, B:267:0x04a5, B:269:0x04a9, B:271:0x04ad, B:280:0x04f8, B:284:0x0501, B:285:0x0503, B:288:0x050b, B:292:0x051e, B:293:0x0520, B:295:0x0526, B:297:0x052c, B:298:0x0539, B:279:0x04ed, B:236:0x0422, B:239:0x042a, B:241:0x042e, B:172:0x0364, B:180:0x037b, B:182:0x037f, B:183:0x0381, B:187:0x038b, B:189:0x038f, B:192:0x0394, B:195:0x03ab, B:197:0x03af, B:200:0x03b5, B:202:0x03b9, B:205:0x03be, B:210:0x03d9, B:212:0x03dd, B:213:0x03df, B:217:0x03e9, B:219:0x03ed, B:222:0x03f2, B:153:0x02e1, B:154:0x02e7, B:123:0x0235, B:273:0x04b3, B:274:0x04bc, B:276:0x04c2, B:277:0x04e6), top: B:308:0x01db, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x035e A[Catch: all -> 0x053d, TryCatch #2 {all -> 0x053d, blocks: (B:116:0x01db, B:118:0x01e1, B:119:0x01e9, B:121:0x0231, B:124:0x0237, B:126:0x0261, B:131:0x0276, B:133:0x0285, B:136:0x02a0, B:138:0x02a4, B:139:0x02a8, B:141:0x02b9, B:143:0x02bd, B:144:0x02c1, B:146:0x02d2, B:157:0x02f9, B:159:0x030e, B:161:0x031b, B:164:0x032e, B:165:0x0334, B:167:0x0345, B:168:0x034b, B:170:0x035e, B:225:0x0401, B:227:0x0405, B:230:0x040a, B:233:0x041b, B:244:0x0433, B:247:0x0448, B:249:0x0457, B:252:0x045f, B:254:0x046e, B:257:0x0476, B:259:0x0487, B:262:0x048f, B:267:0x04a5, B:269:0x04a9, B:271:0x04ad, B:280:0x04f8, B:284:0x0501, B:285:0x0503, B:288:0x050b, B:292:0x051e, B:293:0x0520, B:295:0x0526, B:297:0x052c, B:298:0x0539, B:279:0x04ed, B:236:0x0422, B:239:0x042a, B:241:0x042e, B:172:0x0364, B:180:0x037b, B:182:0x037f, B:183:0x0381, B:187:0x038b, B:189:0x038f, B:192:0x0394, B:195:0x03ab, B:197:0x03af, B:200:0x03b5, B:202:0x03b9, B:205:0x03be, B:210:0x03d9, B:212:0x03dd, B:213:0x03df, B:217:0x03e9, B:219:0x03ed, B:222:0x03f2, B:153:0x02e1, B:154:0x02e7, B:123:0x0235, B:273:0x04b3, B:274:0x04bc, B:276:0x04c2, B:277:0x04e6), top: B:308:0x01db, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0364 A[Catch: all -> 0x053d, TryCatch #2 {all -> 0x053d, blocks: (B:116:0x01db, B:118:0x01e1, B:119:0x01e9, B:121:0x0231, B:124:0x0237, B:126:0x0261, B:131:0x0276, B:133:0x0285, B:136:0x02a0, B:138:0x02a4, B:139:0x02a8, B:141:0x02b9, B:143:0x02bd, B:144:0x02c1, B:146:0x02d2, B:157:0x02f9, B:159:0x030e, B:161:0x031b, B:164:0x032e, B:165:0x0334, B:167:0x0345, B:168:0x034b, B:170:0x035e, B:225:0x0401, B:227:0x0405, B:230:0x040a, B:233:0x041b, B:244:0x0433, B:247:0x0448, B:249:0x0457, B:252:0x045f, B:254:0x046e, B:257:0x0476, B:259:0x0487, B:262:0x048f, B:267:0x04a5, B:269:0x04a9, B:271:0x04ad, B:280:0x04f8, B:284:0x0501, B:285:0x0503, B:288:0x050b, B:292:0x051e, B:293:0x0520, B:295:0x0526, B:297:0x052c, B:298:0x0539, B:279:0x04ed, B:236:0x0422, B:239:0x042a, B:241:0x042e, B:172:0x0364, B:180:0x037b, B:182:0x037f, B:183:0x0381, B:187:0x038b, B:189:0x038f, B:192:0x0394, B:195:0x03ab, B:197:0x03af, B:200:0x03b5, B:202:0x03b9, B:205:0x03be, B:210:0x03d9, B:212:0x03dd, B:213:0x03df, B:217:0x03e9, B:219:0x03ed, B:222:0x03f2, B:153:0x02e1, B:154:0x02e7, B:123:0x0235, B:273:0x04b3, B:274:0x04bc, B:276:0x04c2, B:277:0x04e6), top: B:308:0x01db, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03b5 A[Catch: all -> 0x053d, TryCatch #2 {all -> 0x053d, blocks: (B:116:0x01db, B:118:0x01e1, B:119:0x01e9, B:121:0x0231, B:124:0x0237, B:126:0x0261, B:131:0x0276, B:133:0x0285, B:136:0x02a0, B:138:0x02a4, B:139:0x02a8, B:141:0x02b9, B:143:0x02bd, B:144:0x02c1, B:146:0x02d2, B:157:0x02f9, B:159:0x030e, B:161:0x031b, B:164:0x032e, B:165:0x0334, B:167:0x0345, B:168:0x034b, B:170:0x035e, B:225:0x0401, B:227:0x0405, B:230:0x040a, B:233:0x041b, B:244:0x0433, B:247:0x0448, B:249:0x0457, B:252:0x045f, B:254:0x046e, B:257:0x0476, B:259:0x0487, B:262:0x048f, B:267:0x04a5, B:269:0x04a9, B:271:0x04ad, B:280:0x04f8, B:284:0x0501, B:285:0x0503, B:288:0x050b, B:292:0x051e, B:293:0x0520, B:295:0x0526, B:297:0x052c, B:298:0x0539, B:279:0x04ed, B:236:0x0422, B:239:0x042a, B:241:0x042e, B:172:0x0364, B:180:0x037b, B:182:0x037f, B:183:0x0381, B:187:0x038b, B:189:0x038f, B:192:0x0394, B:195:0x03ab, B:197:0x03af, B:200:0x03b5, B:202:0x03b9, B:205:0x03be, B:210:0x03d9, B:212:0x03dd, B:213:0x03df, B:217:0x03e9, B:219:0x03ed, B:222:0x03f2, B:153:0x02e1, B:154:0x02e7, B:123:0x0235, B:273:0x04b3, B:274:0x04bc, B:276:0x04c2, B:277:0x04e6), top: B:308:0x01db, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0401 A[Catch: all -> 0x053d, TryCatch #2 {all -> 0x053d, blocks: (B:116:0x01db, B:118:0x01e1, B:119:0x01e9, B:121:0x0231, B:124:0x0237, B:126:0x0261, B:131:0x0276, B:133:0x0285, B:136:0x02a0, B:138:0x02a4, B:139:0x02a8, B:141:0x02b9, B:143:0x02bd, B:144:0x02c1, B:146:0x02d2, B:157:0x02f9, B:159:0x030e, B:161:0x031b, B:164:0x032e, B:165:0x0334, B:167:0x0345, B:168:0x034b, B:170:0x035e, B:225:0x0401, B:227:0x0405, B:230:0x040a, B:233:0x041b, B:244:0x0433, B:247:0x0448, B:249:0x0457, B:252:0x045f, B:254:0x046e, B:257:0x0476, B:259:0x0487, B:262:0x048f, B:267:0x04a5, B:269:0x04a9, B:271:0x04ad, B:280:0x04f8, B:284:0x0501, B:285:0x0503, B:288:0x050b, B:292:0x051e, B:293:0x0520, B:295:0x0526, B:297:0x052c, B:298:0x0539, B:279:0x04ed, B:236:0x0422, B:239:0x042a, B:241:0x042e, B:172:0x0364, B:180:0x037b, B:182:0x037f, B:183:0x0381, B:187:0x038b, B:189:0x038f, B:192:0x0394, B:195:0x03ab, B:197:0x03af, B:200:0x03b5, B:202:0x03b9, B:205:0x03be, B:210:0x03d9, B:212:0x03dd, B:213:0x03df, B:217:0x03e9, B:219:0x03ed, B:222:0x03f2, B:153:0x02e1, B:154:0x02e7, B:123:0x0235, B:273:0x04b3, B:274:0x04bc, B:276:0x04c2, B:277:0x04e6), top: B:308:0x01db, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x041b A[Catch: all -> 0x053d, TRY_ENTER, TryCatch #2 {all -> 0x053d, blocks: (B:116:0x01db, B:118:0x01e1, B:119:0x01e9, B:121:0x0231, B:124:0x0237, B:126:0x0261, B:131:0x0276, B:133:0x0285, B:136:0x02a0, B:138:0x02a4, B:139:0x02a8, B:141:0x02b9, B:143:0x02bd, B:144:0x02c1, B:146:0x02d2, B:157:0x02f9, B:159:0x030e, B:161:0x031b, B:164:0x032e, B:165:0x0334, B:167:0x0345, B:168:0x034b, B:170:0x035e, B:225:0x0401, B:227:0x0405, B:230:0x040a, B:233:0x041b, B:244:0x0433, B:247:0x0448, B:249:0x0457, B:252:0x045f, B:254:0x046e, B:257:0x0476, B:259:0x0487, B:262:0x048f, B:267:0x04a5, B:269:0x04a9, B:271:0x04ad, B:280:0x04f8, B:284:0x0501, B:285:0x0503, B:288:0x050b, B:292:0x051e, B:293:0x0520, B:295:0x0526, B:297:0x052c, B:298:0x0539, B:279:0x04ed, B:236:0x0422, B:239:0x042a, B:241:0x042e, B:172:0x0364, B:180:0x037b, B:182:0x037f, B:183:0x0381, B:187:0x038b, B:189:0x038f, B:192:0x0394, B:195:0x03ab, B:197:0x03af, B:200:0x03b5, B:202:0x03b9, B:205:0x03be, B:210:0x03d9, B:212:0x03dd, B:213:0x03df, B:217:0x03e9, B:219:0x03ed, B:222:0x03f2, B:153:0x02e1, B:154:0x02e7, B:123:0x0235, B:273:0x04b3, B:274:0x04bc, B:276:0x04c2, B:277:0x04e6), top: B:308:0x01db, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0422 A[Catch: all -> 0x053d, TryCatch #2 {all -> 0x053d, blocks: (B:116:0x01db, B:118:0x01e1, B:119:0x01e9, B:121:0x0231, B:124:0x0237, B:126:0x0261, B:131:0x0276, B:133:0x0285, B:136:0x02a0, B:138:0x02a4, B:139:0x02a8, B:141:0x02b9, B:143:0x02bd, B:144:0x02c1, B:146:0x02d2, B:157:0x02f9, B:159:0x030e, B:161:0x031b, B:164:0x032e, B:165:0x0334, B:167:0x0345, B:168:0x034b, B:170:0x035e, B:225:0x0401, B:227:0x0405, B:230:0x040a, B:233:0x041b, B:244:0x0433, B:247:0x0448, B:249:0x0457, B:252:0x045f, B:254:0x046e, B:257:0x0476, B:259:0x0487, B:262:0x048f, B:267:0x04a5, B:269:0x04a9, B:271:0x04ad, B:280:0x04f8, B:284:0x0501, B:285:0x0503, B:288:0x050b, B:292:0x051e, B:293:0x0520, B:295:0x0526, B:297:0x052c, B:298:0x0539, B:279:0x04ed, B:236:0x0422, B:239:0x042a, B:241:0x042e, B:172:0x0364, B:180:0x037b, B:182:0x037f, B:183:0x0381, B:187:0x038b, B:189:0x038f, B:192:0x0394, B:195:0x03ab, B:197:0x03af, B:200:0x03b5, B:202:0x03b9, B:205:0x03be, B:210:0x03d9, B:212:0x03dd, B:213:0x03df, B:217:0x03e9, B:219:0x03ed, B:222:0x03f2, B:153:0x02e1, B:154:0x02e7, B:123:0x0235, B:273:0x04b3, B:274:0x04bc, B:276:0x04c2, B:277:0x04e6), top: B:308:0x01db, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0457 A[Catch: all -> 0x053d, TryCatch #2 {all -> 0x053d, blocks: (B:116:0x01db, B:118:0x01e1, B:119:0x01e9, B:121:0x0231, B:124:0x0237, B:126:0x0261, B:131:0x0276, B:133:0x0285, B:136:0x02a0, B:138:0x02a4, B:139:0x02a8, B:141:0x02b9, B:143:0x02bd, B:144:0x02c1, B:146:0x02d2, B:157:0x02f9, B:159:0x030e, B:161:0x031b, B:164:0x032e, B:165:0x0334, B:167:0x0345, B:168:0x034b, B:170:0x035e, B:225:0x0401, B:227:0x0405, B:230:0x040a, B:233:0x041b, B:244:0x0433, B:247:0x0448, B:249:0x0457, B:252:0x045f, B:254:0x046e, B:257:0x0476, B:259:0x0487, B:262:0x048f, B:267:0x04a5, B:269:0x04a9, B:271:0x04ad, B:280:0x04f8, B:284:0x0501, B:285:0x0503, B:288:0x050b, B:292:0x051e, B:293:0x0520, B:295:0x0526, B:297:0x052c, B:298:0x0539, B:279:0x04ed, B:236:0x0422, B:239:0x042a, B:241:0x042e, B:172:0x0364, B:180:0x037b, B:182:0x037f, B:183:0x0381, B:187:0x038b, B:189:0x038f, B:192:0x0394, B:195:0x03ab, B:197:0x03af, B:200:0x03b5, B:202:0x03b9, B:205:0x03be, B:210:0x03d9, B:212:0x03dd, B:213:0x03df, B:217:0x03e9, B:219:0x03ed, B:222:0x03f2, B:153:0x02e1, B:154:0x02e7, B:123:0x0235, B:273:0x04b3, B:274:0x04bc, B:276:0x04c2, B:277:0x04e6), top: B:308:0x01db, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x046e A[Catch: all -> 0x053d, TryCatch #2 {all -> 0x053d, blocks: (B:116:0x01db, B:118:0x01e1, B:119:0x01e9, B:121:0x0231, B:124:0x0237, B:126:0x0261, B:131:0x0276, B:133:0x0285, B:136:0x02a0, B:138:0x02a4, B:139:0x02a8, B:141:0x02b9, B:143:0x02bd, B:144:0x02c1, B:146:0x02d2, B:157:0x02f9, B:159:0x030e, B:161:0x031b, B:164:0x032e, B:165:0x0334, B:167:0x0345, B:168:0x034b, B:170:0x035e, B:225:0x0401, B:227:0x0405, B:230:0x040a, B:233:0x041b, B:244:0x0433, B:247:0x0448, B:249:0x0457, B:252:0x045f, B:254:0x046e, B:257:0x0476, B:259:0x0487, B:262:0x048f, B:267:0x04a5, B:269:0x04a9, B:271:0x04ad, B:280:0x04f8, B:284:0x0501, B:285:0x0503, B:288:0x050b, B:292:0x051e, B:293:0x0520, B:295:0x0526, B:297:0x052c, B:298:0x0539, B:279:0x04ed, B:236:0x0422, B:239:0x042a, B:241:0x042e, B:172:0x0364, B:180:0x037b, B:182:0x037f, B:183:0x0381, B:187:0x038b, B:189:0x038f, B:192:0x0394, B:195:0x03ab, B:197:0x03af, B:200:0x03b5, B:202:0x03b9, B:205:0x03be, B:210:0x03d9, B:212:0x03dd, B:213:0x03df, B:217:0x03e9, B:219:0x03ed, B:222:0x03f2, B:153:0x02e1, B:154:0x02e7, B:123:0x0235, B:273:0x04b3, B:274:0x04bc, B:276:0x04c2, B:277:0x04e6), top: B:308:0x01db, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0487 A[Catch: all -> 0x053d, TryCatch #2 {all -> 0x053d, blocks: (B:116:0x01db, B:118:0x01e1, B:119:0x01e9, B:121:0x0231, B:124:0x0237, B:126:0x0261, B:131:0x0276, B:133:0x0285, B:136:0x02a0, B:138:0x02a4, B:139:0x02a8, B:141:0x02b9, B:143:0x02bd, B:144:0x02c1, B:146:0x02d2, B:157:0x02f9, B:159:0x030e, B:161:0x031b, B:164:0x032e, B:165:0x0334, B:167:0x0345, B:168:0x034b, B:170:0x035e, B:225:0x0401, B:227:0x0405, B:230:0x040a, B:233:0x041b, B:244:0x0433, B:247:0x0448, B:249:0x0457, B:252:0x045f, B:254:0x046e, B:257:0x0476, B:259:0x0487, B:262:0x048f, B:267:0x04a5, B:269:0x04a9, B:271:0x04ad, B:280:0x04f8, B:284:0x0501, B:285:0x0503, B:288:0x050b, B:292:0x051e, B:293:0x0520, B:295:0x0526, B:297:0x052c, B:298:0x0539, B:279:0x04ed, B:236:0x0422, B:239:0x042a, B:241:0x042e, B:172:0x0364, B:180:0x037b, B:182:0x037f, B:183:0x0381, B:187:0x038b, B:189:0x038f, B:192:0x0394, B:195:0x03ab, B:197:0x03af, B:200:0x03b5, B:202:0x03b9, B:205:0x03be, B:210:0x03d9, B:212:0x03dd, B:213:0x03df, B:217:0x03e9, B:219:0x03ed, B:222:0x03f2, B:153:0x02e1, B:154:0x02e7, B:123:0x0235, B:273:0x04b3, B:274:0x04bc, B:276:0x04c2, B:277:0x04e6), top: B:308:0x01db, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04a3 A[PHI: r1
      0x04a3: PHI (r1v3 java.lang.String) = (r1v2 java.lang.String), (r1v15 java.lang.String) binds: [B:263:0x049e, B:270:0x04ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0509 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a8  */
    @Override // com.ss.android.ugc.aweme.service.ISeriesCommonETService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> T appendPaidContentParam(com.ss.android.ugc.aweme.feed.model.Aweme r35, T r36) {
        /*
            Method dump skipped, instruction units count: 1355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesCommonETService.appendPaidContentParam(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.Object):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public Map<String, Object> appendPaidContentParamForVideoRequest(Aweme aweme, String str) {
        String str2;
        if (aweme == null) {
            return C2097608Jq.LJ();
        }
        if (Intrinsics.LJFF(str, "paid_series_detail_page") && !C695070ROf.LIZ(aweme)) {
            C13DA c13da = new C13DA();
            PaidContentInfo paidContentInfo = aweme.mPaidContentInfo;
            if (paidContentInfo != null) {
                Long lValueOf = Long.valueOf(paidContentInfo.getPaidCollectionId());
                if (lValueOf.longValue() != 0) {
                    c13da.put("collection_id", Long.valueOf(lValueOf.longValue()));
                }
            }
            String seriesEnterEntrance = getSeriesEnterEntrance();
            if (seriesEnterEntrance != null && u.LJJIIJZLJL(seriesEnterEntrance, "ad_", false)) {
                str2 = "ad_button";
            } else {
                str2 = "non_ad_button";
            }
            c13da.put("series_enter_entrance_is_ad", str2);
            return c13da.build();
        }
        return C2097608Jq.LJ();
    }

    public static /* synthetic */ Object addParamInner$default(SeriesCommonETService seriesCommonETService, Object obj, String str, String str2, boolean z, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 4) != 0) {
                z = false;
            }
            seriesCommonETService.addParamInner(obj, str, str2, z);
            return obj;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addParamInner");
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesCommonETService
    public String getSeriesEnterEntrance(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str2) {
        Boolean bool6 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool5, bool6)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("_drama_component");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (Intrinsics.LJFF(bool, bool6)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append("_anchor");
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (Intrinsics.LJFF(bool2, bool6)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(str);
            sbLIZ3.append("_bottom_banner");
            return C2188811AlT.LIZIZ(sbLIZ3);
        }
        if (Intrinsics.LJFF(bool3, bool6)) {
            return "series_ads";
        }
        if (Intrinsics.LJFF(bool4, bool6)) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(str);
            sbLIZ4.append("_hot_zone");
            return C2188811AlT.LIZIZ(sbLIZ4);
        }
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append(str);
        sbLIZ5.append('_');
        sbLIZ5.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ5);
    }
}
