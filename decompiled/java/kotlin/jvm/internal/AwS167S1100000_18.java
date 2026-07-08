package kotlin.jvm.internal;

import X.AbstractC1156680gCo;
import X.AbstractC1168350gVd;
import X.AbstractC21673619ry;
import X.C09AY;
import X.C0X52;
import X.C1156730gCt;
import X.C1160360gIk;
import X.C1161820gL6;
import X.C1163590gNx;
import X.C1164210gOx;
import X.C1171250gaJ;
import X.C1176790gjF;
import X.C1176900gjQ;
import X.C1180620gpQ;
import X.C1180920gpu;
import X.C1182000gre;
import X.C1188450h23;
import X.C1188890h2l;
import X.C1192310h8H;
import X.C1207670hX3;
import X.C1207680hX4;
import X.C1207700hX6;
import X.C1207720hX8;
import X.C1247120iYg;
import X.C1260960iv0;
import X.C13LE;
import X.C13LP;
import X.C1716310ulR;
import X.C1722880uw2;
import X.C189200o6;
import X.C18Z8;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C712710RxV;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.albummix.feed.PoiPhotoTextRootAssem;
import com.ss.android.ugc.aweme.poi.collect.collectassem.PoiCollectStatusBaseActivityAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailContentHeaderBaseAssemV3;
import com.ss.android.ugc.aweme.poi.detail.worldcup.assem.PoiWorldCupScheduleAssem;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.detail.bottombar.ui.SearchDetailPoiBottomAssem;
import com.ss.android.ugc.aweme.slash.cell.arc.SlashCell;
import com.ss.android.ugc.aweme.slash.data.SlashPage;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class AwS167S1100000_18 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            case 28:
                return invoke$28(this);
            case 29:
                return invoke$29(this);
            case 30:
                return invoke$30(this);
            case 31:
                return invoke$31(this);
            case 32:
                return invoke$32(this);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this);
            case 35:
                return invoke$35(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this);
            case 37:
                return invoke$37(this);
            case 38:
                return invoke$38(this);
            case 39:
                return invoke$39(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS167S1100000_18 awS167S1100000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSlashRequestError fromInstanceId:");
        sbLIZ.append(awS167S1100000_18.s0);
        sbLIZ.append(", throwable:");
        sbLIZ.append((Throwable) awS167S1100000_18.l1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS167S1100000_18 awS167S1100000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(awS167S1100000_18.s0);
        sbLIZ.append("] DrawEnd isFirstBind=");
        sbLIZ.append(((C1156730gCt) ((AbstractC1156680gCo) awS167S1100000_18.l1)).LIZIZ);
        sbLIZ.append(" drawEndTimestamp=");
        sbLIZ.append(((C1156730gCt) ((AbstractC1156680gCo) awS167S1100000_18.l1)).LIZ);
        sbLIZ.append(" ts=");
        sbLIZ.append(System.currentTimeMillis());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$10(AwS167S1100000_18 awS167S1100000_18) {
        ((PoiWorldCupScheduleAssem) awS167S1100000_18.l1).yp("click_view_full_schedule");
        ((PoiWorldCupScheduleAssem) awS167S1100000_18.l1).up(awS167S1100000_18.s0, "world_cup_view_all");
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS167S1100000_18 awS167S1100000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((SlashCell) awS167S1100000_18.l1).kp());
        sbLIZ.append(" onCreate, assemTag:");
        sbLIZ.append(((SlashCell) awS167S1100000_18.l1).assemTagInternal);
        sbLIZ.append(",cellHierarchyDataKey:");
        sbLIZ.append(awS167S1100000_18.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$12(AwS167S1100000_18 awS167S1100000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lynx ");
        sbLIZ.append(awS167S1100000_18.s0);
        sbLIZ.append(' ');
        sbLIZ.append((JSONObject) awS167S1100000_18.l1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$13(AwS167S1100000_18 awS167S1100000_18) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("restoreFromSnapshot(");
        sbLIZ.append(awS167S1100000_18.s0);
        sbLIZ.append(") restoring, components=");
        List<C1180920gpu> listLJ = ((C1164210gOx) awS167S1100000_18.l1).LIZIZ.LJ();
        if (listLJ != null) {
            numValueOf = Integer.valueOf(listLJ.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$14(AwS167S1100000_18 awS167S1100000_18) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saveSnapshot(");
        sbLIZ.append(awS167S1100000_18.s0);
        sbLIZ.append(") success, components=");
        List<C1180920gpu> listLJ = ((C1180620gpQ) awS167S1100000_18.l1).LJ();
        if (listLJ != null) {
            numValueOf = Integer.valueOf(listLJ.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$15(AwS167S1100000_18 awS167S1100000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recordLoadFail [");
        sbLIZ.append(awS167S1100000_18.s0);
        sbLIZ.append("] seen=");
        sbLIZ.append(((C1161820gL6) awS167S1100000_18.l1).LJIIIZ.size());
        sbLIZ.append('/');
        sbLIZ.append(((C1161820gL6) awS167S1100000_18.l1).LJIIJ.size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$16(AwS167S1100000_18 awS167S1100000_18) {
        ConcurrentHashMap<String, C1176790gjF> concurrentHashMap = ((C1176900gjQ) awS167S1100000_18.l1).LJFF;
        String str = awS167S1100000_18.s0;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        C1176790gjF c1176790gjF = concurrentHashMap.get(str);
        if (c1176790gjF != null && c1176790gjF.LIZIZ) {
            ConcurrentHashMap<String, C1176790gjF> concurrentHashMap2 = ((C1176900gjQ) awS167S1100000_18.l1).LJFF;
            String str3 = awS167S1100000_18.s0;
            if (str3 != null) {
                str2 = str3;
            }
            C1176790gjF c1176790gjFRemove = concurrentHashMap2.remove(str2);
            if (c1176790gjFRemove != null) {
                c1176790gjFRemove.LIZ.remove();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS167S1100000_18 awS167S1100000_18) {
        List<Pair<String, String>> list = C1163590gNx.LIZ;
        if (list != null) {
            Map map = (Map) awS167S1100000_18.l1;
            for (Pair<String, String> pair : list) {
                map.put(pair.getFirst(), pair.getSecond());
            }
        }
        ((Map) awS167S1100000_18.l1).put("timestamp", String.valueOf(System.currentTimeMillis()));
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        String str = awS167S1100000_18.s0;
        Map map2 = (Map) awS167S1100000_18.l1;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map2.size()));
        for (Map.Entry entry : map2.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        c1716310ulR.getClass();
        C1716310ulR.LIZLLL(str, linkedHashMap);
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS167S1100000_18 awS167S1100000_18) {
        List<Pair<String, String>> list = C1722880uw2.LIZ;
        if (list != null) {
            Map map = (Map) awS167S1100000_18.l1;
            for (Pair<String, String> pair : list) {
                map.put(pair.getFirst(), pair.getSecond());
            }
        }
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        String str = awS167S1100000_18.s0;
        Map map2 = (Map) awS167S1100000_18.l1;
        c1716310ulR.getClass();
        C1716310ulR.LIZLLL(str, map2);
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS167S1100000_18 awS167S1100000_18) {
        ((AbstractC1168350gVd) awS167S1100000_18.l1).LIZIZ().LLL(new AwS70S1000000_19(awS167S1100000_18.s0, 28));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS167S1100000_18 awS167S1100000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(awS167S1100000_18.s0);
        sbLIZ.append("] ");
        sbLIZ.append(C13LE.LIZ(((AbstractC1156680gCo) awS167S1100000_18.l1).getClass()).LJI());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$20(AwS167S1100000_18 awS167S1100000_18) {
        int size = ((C1207670hX3) awS167S1100000_18.l1).LIZ.size();
        C1207680hX4.LIZ.getClass();
        if (size < C1207680hX4.LIZ().vvCount + 1) {
            ((C1207670hX3) awS167S1100000_18.l1).LIZ.add(awS167S1100000_18.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$21(AwS167S1100000_18 awS167S1100000_18) {
        if (!Intrinsics.LJFF(C1207720hX8.LIZ(), C1207720hX8.LIZ)) {
            ((C1207700hX6) awS167S1100000_18.l1).LIZIZ.add(awS167S1100000_18.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$22(AwS167S1100000_18 awS167S1100000_18) {
        C1192310h8H c1192310h8H = C1192310h8H.LIZ;
        Context context = ((PoiPhotoTextRootAssem) awS167S1100000_18.l1).LJJIJL().getContext();
        String str = awS167S1100000_18.s0;
        c1192310h8H.getClass();
        C1192310h8H.LJ(context, str);
        return Unit.LIZ;
    }

    public static final Object invoke$23(AwS167S1100000_18 awS167S1100000_18) {
        Integer numValueOf;
        Integer numValueOf2;
        AbstractC21673619ry adapter;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show body after loading, reason=");
        sbLIZ.append(awS167S1100000_18.s0);
        sbLIZ.append(" ts=");
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(" adapterCount=");
        C18Z8 c18z8 = ((RavenFragment) awS167S1100000_18.l1).LLJILJIL;
        if (c18z8 != null && (adapter = c18z8.getAdapter()) != null) {
            numValueOf = Integer.valueOf(adapter.getItemCount());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" childCount=");
        C18Z8 c18z82 = ((RavenFragment) awS167S1100000_18.l1).LLJILJIL;
        if (c18z82 != null) {
            numValueOf2 = Integer.valueOf(c18z82.getChildCount());
        } else {
            numValueOf2 = null;
        }
        sbLIZ.append(numValueOf2);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS167S1100000_18.l1).fT(null));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$24(AwS167S1100000_18 awS167S1100000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RavenListAdapterDataObserver.suppressNextMultiHandlerSync reason=");
        sbLIZ.append(awS167S1100000_18.s0);
        sbLIZ.append(" until=");
        sbLIZ.append(((C1160360gIk) awS167S1100000_18.l1).LJII);
        sbLIZ.append(" ts=");
        sbLIZ.append(System.currentTimeMillis());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$25(AwS167S1100000_18 awS167S1100000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadMoreCommitInFlight end (deferred) source=");
        sbLIZ.append(awS167S1100000_18.s0);
        sbLIZ.append(" count=");
        sbLIZ.append(((RavenFragment) awS167S1100000_18.l1).LLLIIL);
        sbLIZ.append(" deferredInserts=");
        sbLIZ.append(((RavenFragment) awS167S1100000_18.l1).LLLIILIL.size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$26(AwS167S1100000_18 awS167S1100000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("poi_ai_summary:id=");
        sbLIZ.append(((C1182000gre) awS167S1100000_18.l1).LLILLL);
        sbLIZ.append(":fragmentid=");
        sbLIZ.append(awS167S1100000_18.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$27(AwS167S1100000_18 awS167S1100000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("skip diff for [");
        sbLIZ.append(((C1180920gpu) awS167S1100000_18.l1).LIZ);
        sbLIZ.append("]: ");
        sbLIZ.append(awS167S1100000_18.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$28(AwS167S1100000_18 awS167S1100000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reparsed extras from slashPage for [");
        sbLIZ.append(awS167S1100000_18.s0);
        sbLIZ.append("], keys=");
        sbLIZ.append(((Map) awS167S1100000_18.l1).keySet());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$29(AwS167S1100000_18 awS167S1100000_18) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("triggerSlashLitePreload, poiId: ");
        sbLIZ.append(awS167S1100000_18.s0);
        sbLIZ.append(", resp: ");
        C0X52 c0x52 = (C0X52) awS167S1100000_18.l1;
        if (c0x52 != null) {
            numValueOf = Integer.valueOf(c0x52.LIZ.LIZIZ);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS167S1100000_18 awS167S1100000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FIRE onMynaFirstScreenRenderFinish reason=");
        sbLIZ.append(awS167S1100000_18.s0);
        sbLIZ.append(" maxDrawEnd=");
        sbLIZ.append(((C1161820gL6) awS167S1100000_18.l1).LIZJ);
        sbLIZ.append(" count=");
        sbLIZ.append(((C1161820gL6) awS167S1100000_18.l1).LIZLLL);
        sbLIZ.append(" seen=");
        sbLIZ.append(((C1161820gL6) awS167S1100000_18.l1).LJIIIZ.size());
        sbLIZ.append('/');
        sbLIZ.append(((C1161820gL6) awS167S1100000_18.l1).LJIIJ.size());
        sbLIZ.append(" ts=");
        sbLIZ.append(System.currentTimeMillis());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$30(AwS167S1100000_18 awS167S1100000_18) {
        boolean z;
        C1188890h2l c1188890h2l;
        PoiDataStruct poiDataStruct;
        Boolean boolIsCollected;
        Aweme aweme;
        PoiDataStruct poiDataStruct2;
        Boolean boolIsCollected2;
        IPoiService iPoiService = (IPoiService) ((SearchDetailPoiBottomAssem) awS167S1100000_18.l1).LLJJJ.getValue();
        if (iPoiService != null) {
            String str = awS167S1100000_18.s0;
            AwS194S1100000_18 awS194S1100000_18 = new AwS194S1100000_18((SearchDetailPoiBottomAssem) awS167S1100000_18.l1, str, 2);
            String str2 = ((SearchDetailPoiBottomAssem) awS167S1100000_18.l1).LLIZLLLIL;
            boolean zBooleanValue = false;
            if (str2 != null && str2.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if ((!z && (boolIsCollected2 = (Boolean) ((Map) C712710RxV.LIZ.getValue()).get(str2)) != null) || ((c1188890h2l = ((SearchDetailPoiBottomAssem) awS167S1100000_18.l1).LLJ) != null && (aweme = c1188890h2l.LIZ) != null && (poiDataStruct2 = aweme.getPoiDataStruct()) != null && (boolIsCollected2 = poiDataStruct2.isCollected()) != null)) {
                zBooleanValue = boolIsCollected2.booleanValue();
            } else {
                C1188890h2l c1188890h2l2 = ((SearchDetailPoiBottomAssem) awS167S1100000_18.l1).LLJ;
                if (c1188890h2l2 != null && (poiDataStruct = c1188890h2l2.LIZLLL) != null && (boolIsCollected = poiDataStruct.isCollected()) != null) {
                    zBooleanValue = boolIsCollected.booleanValue();
                }
            }
            iPoiService.LJLJLLL(str, awS194S1100000_18, zBooleanValue);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$31(AwS167S1100000_18 awS167S1100000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadFailed: (code: ");
        sbLIZ.append((Integer) awS167S1100000_18.l1);
        sbLIZ.append("), (msg: ");
        sbLIZ.append(awS167S1100000_18.s0);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$32(AwS167S1100000_18 awS167S1100000_18) {
        String str = ((PoiDetailContentHeaderBaseAssemV3) awS167S1100000_18.l1).LLJILJILJ;
        User user = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        Object[] objArr12 = 0;
        Object[] objArr13 = 0;
        Object[] objArr14 = 0;
        Object[] objArr15 = 0;
        Object[] objArr16 = 0;
        Object[] objArr17 = 0;
        Object[] objArr18 = 0;
        Object[] objArr19 = 0;
        Object[] objArr20 = 0;
        Object[] objArr21 = 0;
        Object[] objArr22 = 0;
        Object[] objArr23 = 0;
        Object[] objArr24 = 0;
        Object[] objArr25 = 0;
        Object[] objArr26 = 0;
        Object[] objArr27 = 0;
        Object[] objArr28 = 0;
        Object[] objArr29 = 0;
        Object[] objArr30 = 0;
        Object[] objArr31 = 0;
        Object[] objArr32 = 0;
        Object[] objArr33 = 0;
        Object[] objArr34 = 0;
        Object[] objArr35 = 0;
        Object[] objArr36 = 0;
        Object[] objArr37 = 0;
        Object[] objArr38 = 0;
        Object[] objArr39 = 0;
        Object[] objArr40 = 0;
        Object[] objArr41 = 0;
        Object[] objArr42 = 0;
        Object[] objArr43 = 0;
        Object[] objArr44 = 0;
        Object[] objArr45 = 0;
        Object[] objArr46 = 0;
        Object[] objArr47 = 0;
        Object[] objArr48 = 0;
        Object[] objArr49 = 0;
        Object[] objArr50 = 0;
        Object[] objArr51 = 0;
        Object[] objArr52 = 0;
        Object[] objArr53 = 0;
        Object[] objArr54 = 0;
        Object[] objArr55 = 0;
        Object[] objArr56 = 0;
        Object[] objArr57 = 0;
        Object[] objArr58 = 0;
        Object[] objArr59 = 0;
        Object[] objArr60 = 0;
        Object[] objArr61 = 0;
        Object[] objArr62 = 0;
        Object[] objArr63 = 0;
        int i = 0;
        Object[] objArr64 = 0;
        Object[] objArr65 = 0;
        Object[] objArr66 = 0;
        Object[] objArr67 = 0;
        Object[] objArr68 = 0;
        Object[] objArr69 = 0;
        Object[] objArr70 = 0;
        Object[] objArr71 = 0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str2 = awS167S1100000_18.s0;
        if (str2 != null) {
            linkedHashMap.put("poi_id", str2);
        }
        Object[] objArr72 = objArr63 == true ? 1 : 0;
        Object[] objArr73 = objArr62 == true ? 1 : 0;
        Object[] objArr74 = objArr61 == true ? 1 : 0;
        Object[] objArr75 = objArr60 == true ? 1 : 0;
        Object[] objArr76 = objArr59 == true ? 1 : 0;
        Object[] objArr77 = objArr58 == true ? 1 : 0;
        Object[] objArr78 = objArr57 == true ? 1 : 0;
        Object[] objArr79 = objArr56 == true ? 1 : 0;
        Object[] objArr80 = objArr55 == true ? 1 : 0;
        Object[] objArr81 = objArr54 == true ? 1 : 0;
        Object[] objArr82 = objArr53 == true ? 1 : 0;
        Object[] objArr83 = objArr52 == true ? 1 : 0;
        Object[] objArr84 = objArr51 == true ? 1 : 0;
        Object[] objArr85 = objArr50 == true ? 1 : 0;
        Object[] objArr86 = objArr49 == true ? 1 : 0;
        Object[] objArr87 = objArr48 == true ? 1 : 0;
        Object[] objArr88 = objArr47 == true ? 1 : 0;
        Object[] objArr89 = objArr46 == true ? 1 : 0;
        Object[] objArr90 = objArr45 == true ? 1 : 0;
        Object[] objArr91 = objArr44 == true ? 1 : 0;
        Object[] objArr92 = objArr43 == true ? 1 : 0;
        Object[] objArr93 = objArr42 == true ? 1 : 0;
        Object[] objArr94 = objArr41 == true ? 1 : 0;
        Object[] objArr95 = objArr40 == true ? 1 : 0;
        Object[] objArr96 = objArr39 == true ? 1 : 0;
        Object[] objArr97 = objArr38 == true ? 1 : 0;
        Object[] objArr98 = objArr37 == true ? 1 : 0;
        Object[] objArr99 = objArr36 == true ? 1 : 0;
        Object[] objArr100 = objArr35 == true ? 1 : 0;
        Object[] objArr101 = objArr34 == true ? 1 : 0;
        Object[] objArr102 = objArr33 == true ? 1 : 0;
        Object[] objArr103 = objArr32 == true ? 1 : 0;
        Object[] objArr104 = objArr31 == true ? 1 : 0;
        Object[] objArr105 = objArr30 == true ? 1 : 0;
        Object[] objArr106 = objArr29 == true ? 1 : 0;
        Object[] objArr107 = objArr28 == true ? 1 : 0;
        Object[] objArr108 = objArr27 == true ? 1 : 0;
        Object[] objArr109 = objArr26 == true ? 1 : 0;
        Object[] objArr110 = objArr25 == true ? 1 : 0;
        Object[] objArr111 = objArr24 == true ? 1 : 0;
        Object[] objArr112 = objArr23 == true ? 1 : 0;
        Object[] objArr113 = objArr22 == true ? 1 : 0;
        Object[] objArr114 = objArr21 == true ? 1 : 0;
        Object[] objArr115 = objArr20 == true ? 1 : 0;
        Object[] objArr116 = objArr19 == true ? 1 : 0;
        Object[] objArr117 = objArr18 == true ? 1 : 0;
        Object[] objArr118 = objArr17 == true ? 1 : 0;
        Object[] objArr119 = objArr16 == true ? 1 : 0;
        Object[] objArr120 = objArr15 == true ? 1 : 0;
        Object[] objArr121 = objArr14 == true ? 1 : 0;
        Object[] objArr122 = objArr13 == true ? 1 : 0;
        Object[] objArr123 = objArr12 == true ? 1 : 0;
        Object[] objArr124 = objArr11 == true ? 1 : 0;
        Object[] objArr125 = objArr10 == true ? 1 : 0;
        Object[] objArr126 = objArr9 == true ? 1 : 0;
        Object[] objArr127 = objArr8 == true ? 1 : 0;
        Object[] objArr128 = objArr7 == true ? 1 : 0;
        Object[] objArr129 = objArr6 == true ? 1 : 0;
        Object[] objArr130 = objArr5 == true ? 1 : 0;
        Object[] objArr131 = objArr4 == true ? 1 : 0;
        Object[] objArr132 = objArr3 == true ? 1 : 0;
        Object[] objArr133 = objArr2 == true ? 1 : 0;
        Object[] objArr134 = objArr == true ? 1 : 0;
        return new C1260960iv0(str, user, (String) objArr72, (String) objArr73, (String) objArr74, (String) objArr75, (Integer) objArr76, (String) objArr77, (String) objArr78, (String) objArr79, (String) objArr80, (String) objArr81, (String) objArr82, (String) objArr83, (String) objArr84, (String) objArr85, (String) objArr86, i, (int) (objArr71 == true ? 1 : 0), (Boolean) objArr87, (int) (objArr70 == true ? 1 : 0), (String) objArr88, (boolean) (objArr69 == true ? 1 : 0), (Boolean) objArr89, (Boolean) objArr90, (String) objArr91, (String) objArr92, (String) objArr93, (String) objArr94, (String) objArr95, (String) objArr96, (String) objArr97, (String) objArr98, (String) objArr99, (Integer) objArr100, (String) objArr101, (Integer) objArr102, (String) objArr103, (int) (objArr68 == true ? 1 : 0), (String) objArr104, (Boolean) objArr105, (Map) linkedHashMap, (String) objArr106, (Integer) objArr107, (Integer) objArr108, (String) objArr109, (String) objArr110, (int) (objArr67 == true ? 1 : 0), (String) objArr111, (Long) objArr112, (int) (objArr66 == true ? 1 : 0), (Integer) objArr113, (String) objArr114, (String) objArr115, (int) (objArr65 == true ? 1 : 0), (int) (objArr64 == true ? 1 : 0), (Integer) objArr116, (Map) objArr117, (String) objArr118, (Boolean) objArr119, (Integer) objArr120, (Integer) objArr121, (String) objArr122, (String) objArr123, (Integer) objArr124, (Integer) objArr125, (Integer) objArr126, (String) objArr127, (String) objArr128, (String) objArr129, (Integer) objArr130, (Integer) objArr131, (String) objArr132, (C1247120iYg) objArr133, (Map) objArr134, -2, -2049, 16383);
    }

    public static final Object invoke$33(AwS167S1100000_18 awS167S1100000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getBoolean:");
        sbLIZ.append(awS167S1100000_18.s0);
        sbLIZ.append(", exception: ");
        sbLIZ.append(((Exception) awS167S1100000_18.l1).getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$34(AwS167S1100000_18 awS167S1100000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getInt:");
        sbLIZ.append(awS167S1100000_18.s0);
        sbLIZ.append(", exception: ");
        sbLIZ.append(((Exception) awS167S1100000_18.l1).getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$35(AwS167S1100000_18 awS167S1100000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getJsonString:");
        sbLIZ.append(awS167S1100000_18.s0);
        sbLIZ.append(", exception: ");
        sbLIZ.append(((Exception) awS167S1100000_18.l1).getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$36(AwS167S1100000_18 awS167S1100000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getLong:");
        sbLIZ.append(awS167S1100000_18.s0);
        sbLIZ.append(", exception: ");
        sbLIZ.append(((Exception) awS167S1100000_18.l1).getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$37(AwS167S1100000_18 awS167S1100000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getObjectValue:");
        sbLIZ.append(awS167S1100000_18.s0);
        sbLIZ.append(", exception: ");
        sbLIZ.append(((Exception) awS167S1100000_18.l1).getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$38(AwS167S1100000_18 awS167S1100000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Mob] ");
        sbLIZ.append(awS167S1100000_18.s0);
        sbLIZ.append(' ');
        sbLIZ.append((JSONObject) awS167S1100000_18.l1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$39(AwS167S1100000_18 awS167S1100000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(awS167S1100000_18.s0);
        sbLIZ.append(" finished, result: ");
        sbLIZ.append((Object) C189200o6.m9toStringimpl(awS167S1100000_18.l1));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AwS167S1100000_18 awS167S1100000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preloadFirstScreen biz=");
        sbLIZ.append(awS167S1100000_18.s0);
        sbLIZ.append(" failed: ");
        sbLIZ.append(((Throwable) awS167S1100000_18.l1).getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(AwS167S1100000_18 awS167S1100000_18) {
        Integer numValueOf;
        Integer numValueOf2;
        AbstractC21673619ry adapter;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hide body under loading, reason=");
        sbLIZ.append(awS167S1100000_18.s0);
        sbLIZ.append(" ts=");
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(" adapterCount=");
        C18Z8 c18z8 = ((RavenFragment) awS167S1100000_18.l1).LLJILJIL;
        if (c18z8 != null && (adapter = c18z8.getAdapter()) != null) {
            numValueOf = Integer.valueOf(adapter.getItemCount());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" childCount=");
        C18Z8 c18z82 = ((RavenFragment) awS167S1100000_18.l1).LLJILJIL;
        if (c18z82 != null) {
            numValueOf2 = Integer.valueOf(c18z82.getChildCount());
        } else {
            numValueOf2 = null;
        }
        sbLIZ.append(numValueOf2);
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS167S1100000_18.l1).fT(null));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$6(AwS167S1100000_18 awS167S1100000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadMoreCommitInFlight begin source=");
        sbLIZ.append(awS167S1100000_18.s0);
        sbLIZ.append(" count=");
        sbLIZ.append(((RavenFragment) awS167S1100000_18.l1).LLLIIL);
        sbLIZ.append(" deferredInserts=");
        sbLIZ.append(((RavenFragment) awS167S1100000_18.l1).LLLIILIL.size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$7(AwS167S1100000_18 awS167S1100000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadMoreCommitInFlight end (immediate) source=");
        sbLIZ.append(awS167S1100000_18.s0);
        sbLIZ.append(" count=");
        sbLIZ.append(((RavenFragment) awS167S1100000_18.l1).LLLIIL);
        sbLIZ.append(" deferredInserts=");
        sbLIZ.append(((RavenFragment) awS167S1100000_18.l1).LLLIILIL.size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$8(AwS167S1100000_18 awS167S1100000_18) {
        List<Aweme> list;
        Aweme next;
        Video video;
        UrlModel cover;
        List<String> urlList;
        Object objLJJJLZIJ;
        CollectionContentResponse collectionContentResponse = ((C1171250gaJ) awS167S1100000_18.l1).LLJI;
        if (collectionContentResponse != null && (list = collectionContentResponse.items) != null) {
            Iterator<Aweme> it2 = list.iterator();
            while (true) {
                next = null;
                if (!it2.hasNext()) {
                    break;
                }
                next = it2.next();
                Aweme aweme = next;
                if (!AwemeExtKt.isDelete(aweme) && aweme.isCanPlay()) {
                    break;
                }
            }
            Aweme aweme2 = next;
            if (aweme2 != null && (video = aweme2.getVideo()) != null && (cover = video.getCover()) != null && (urlList = cover.getUrlList()) != null && (objLJJJLZIJ = C13LP.LJJJLZIJ(0, urlList)) != null) {
                return objLJJJLZIJ;
            }
        }
        return awS167S1100000_18.s0;
    }

    public static final Object invoke$9(AwS167S1100000_18 awS167S1100000_18) {
        ((PoiCollectStatusBaseActivityAssem) awS167S1100000_18.l1).Ip(Intrinsics.LJFF(C1188450h23.LIZIZ(awS167S1100000_18.s0), Boolean.TRUE));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS167S1100000_18(AbstractC1168350gVd abstractC1168350gVd, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = abstractC1168350gVd;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS167S1100000_18(C1171250gaJ c1171250gaJ, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1171250gaJ;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS167S1100000_18(C1176900gjQ c1176900gjQ, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1176900gjQ;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS167S1100000_18(C1180620gpQ c1180620gpQ, String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1180620gpQ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS167S1100000_18(C1180920gpu c1180920gpu, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1180920gpu;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS167S1100000_18(C1182000gre c1182000gre, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1182000gre;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS167S1100000_18(C1207670hX3 c1207670hX3, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1207670hX3;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS167S1100000_18(C1207700hX6 c1207700hX6, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1207700hX6;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS167S1100000_18(RavenFragment ravenFragment, String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = ravenFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS167S1100000_18(PoiPhotoTextRootAssem poiPhotoTextRootAssem, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = poiPhotoTextRootAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS167S1100000_18(PoiCollectStatusBaseActivityAssem poiCollectStatusBaseActivityAssem, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = poiCollectStatusBaseActivityAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS167S1100000_18(PoiDetailContentHeaderBaseAssemV3 poiDetailContentHeaderBaseAssemV3, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = poiDetailContentHeaderBaseAssemV3;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS167S1100000_18(PoiWorldCupScheduleAssem poiWorldCupScheduleAssem, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = poiWorldCupScheduleAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS167S1100000_18(SearchDetailPoiBottomAssem searchDetailPoiBottomAssem, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = searchDetailPoiBottomAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS167S1100000_18(SlashCell slashCell, SlashCell<T> slashCell2, String str) {
        super(0);
        this.$t = str;
        this.l1 = slashCell;
        this.s0 = slashCell2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS167S1100000_18(Integer num, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = num;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS167S1100000_18(String str, String str2, C0X52<SlashPage> c0x52) {
        super(0);
        this.$t = c0x52;
        this.s0 = str;
        this.l1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS167S1100000_18(String str, AbstractC1156680gCo abstractC1156680gCo, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = abstractC1156680gCo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS167S1100000_18(String str, C1160360gIk c1160360gIk, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1160360gIk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS167S1100000_18(String str, C1161820gL6 c1161820gL6, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1161820gL6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS167S1100000_18(String str, C1164210gOx c1164210gOx, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1164210gOx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS167S1100000_18(String str, Exception exc, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = exc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS167S1100000_18(String str, Object obj, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS167S1100000_18(String str, Throwable th, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = th;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS167S1100000_18(String str, String str2, Map<String, String> map) {
        super(0);
        this.$t = map;
        this.s0 = str;
        this.l1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS167S1100000_18(String str, JSONObject jSONObject, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = jSONObject;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS167S1100000_18(Map map, Map<String, String> map2, String str) {
        super(0);
        this.$t = str;
        this.l1 = map;
        this.s0 = map2;
    }
}
