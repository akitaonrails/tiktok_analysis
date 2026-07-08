package kotlin.jvm.internal;

import X.C08HX;
import X.C098200Yq;
import X.C09AY;
import X.C123100dR;
import X.C1381180m2u;
import X.C1388190mED;
import X.C1393580mMu;
import X.C1393590mMv;
import X.C13LP;
import X.C1599640rjG;
import X.C189200o6;
import X.C20684815ws;
import X.C2344009Gk;
import X.C712520RxC;
import X.C785410UrT;
import X.C816490W1f;
import X.DialogC1393760mNC;
import X.EnumC1430380nKG;
import X.InterfaceC1381790m3t;
import X.InterfaceC1387770mDX;
import X.InterfaceC1393560mMs;
import X.InterfaceC1631620sYq;
import X.InterfaceC705550Rlx;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.multi.maker.ShopWindowAnchorMaker;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class AwS318S0300000_21 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS318S0300000_21(C1381180m2u c1381180m2u, InterfaceC1387770mDX interfaceC1387770mDX, Activity activity, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1381180m2u;
        this.l1 = interfaceC1387770mDX;
        this.l2 = activity;
    }

    public static final Object invoke$0(AwS318S0300000_21 awS318S0300000_21, Object obj, Object obj2, Object obj3) {
        JSONObject jSONObject;
        String strOptString;
        Map<String, ? extends Object> mapLJ;
        Map<String, ? extends Object> mapLJ2;
        if (Intrinsics.LJFF(obj2, "notification") && (obj3 instanceof JSONObject) && (jSONObject = (JSONObject) obj3) != null && (strOptString = jSONObject.optString("eventName")) != null) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            InterfaceC1381790m3t interfaceC1381790m3t = ((C1381180m2u) awS318S0300000_21.l0).LJI;
            if (interfaceC1381790m3t != null) {
                if (jSONObjectOptJSONObject != null) {
                    mapLJ2 = C08HX.LJ(jSONObjectOptJSONObject);
                } else {
                    mapLJ2 = null;
                }
                interfaceC1381790m3t.LIZ(strOptString, mapLJ2);
            }
            InterfaceC1387770mDX interfaceC1387770mDX = (InterfaceC1387770mDX) awS318S0300000_21.l1;
            if (interfaceC1387770mDX != null) {
                if (jSONObjectOptJSONObject != null) {
                    mapLJ = C08HX.LJ(jSONObjectOptJSONObject);
                } else {
                    mapLJ = null;
                }
                interfaceC1387770mDX.LIZ(strOptString, mapLJ, null, (Activity) awS318S0300000_21.l2);
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS318S0300000_21 awS318S0300000_21, Object obj, Object obj2, Object obj3) throws Throwable {
        boolean z;
        boolean z2;
        Activity activityLIZ;
        Context context;
        Context context2;
        DialogC1393760mNC dialogC1393760mNC;
        PoiDataStruct poiDataStruct;
        List<AnchorCommonStruct> anchors;
        PoiDataStruct poiDataStruct2;
        String keyword;
        AnchorCommonStruct anchorCommonStruct;
        List<AnchorCommonStruct> anchors2;
        Context context3;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        String str = (String) obj3;
        C1393580mMu c1393580mMu = (C1393580mMu) awS318S0300000_21.l0;
        C712520RxC c712520RxC = (C712520RxC) awS318S0300000_21.l1;
        c1393580mMu.getClass();
        Iterator<InterfaceC1393560mMs> it2 = c712520RxC.LJIILL().iterator();
        while (true) {
            z = false;
            if (it2.hasNext()) {
                if (it2.next() instanceof ShopWindowAnchorMaker) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        DialogC1393760mNC dialogC1393760mNC2 = null;
        numValueOf = null;
        numValueOf = null;
        numValueOf = null;
        Integer numValueOf = null;
        dialogC1393760mNC = null;
        DialogC1393760mNC dialogC1393760mNC3 = null;
        dialogC1393760mNC2 = null;
        if (!z2) {
            TuxIconView tuxIconViewLJIILL = ((InterfaceC705550Rlx) awS318S0300000_21.l2).LJIILL();
            if (tuxIconViewLJIILL != null && (context3 = tuxIconViewLJIILL.getContext()) != null) {
                C712520RxC c712520RxC2 = (C712520RxC) awS318S0300000_21.l1;
                C1393580mMu c1393580mMu2 = (C1393580mMu) awS318S0300000_21.l0;
                dialogC1393760mNC = new DialogC1393760mNC(context3, c712520RxC2, zBooleanValue, z2, str);
                dialogC1393760mNC.LLJLLIL = c1393580mMu2.LIZ;
                dialogC1393760mNC.LLJJJ = C1599640rjG.LIZIZ.Pu(c712520RxC2.LIZIZ.LJFF);
            } else {
                dialogC1393760mNC = null;
            }
            C1393580mMu c1393580mMu3 = (C1393580mMu) awS318S0300000_21.l0;
            C712520RxC c712520RxC3 = (C712520RxC) awS318S0300000_21.l1;
            c1393580mMu3.getClass();
            if (!c712520RxC3.LJIILL().isEmpty()) {
                int iType = ((InterfaceC1393560mMs) ListProtector.get(c712520RxC3.LJIILL(), 0)).type();
                Aweme aweme = c712520RxC3.LIZIZ.LIZ;
                if (aweme != null && (anchors2 = aweme.getAnchors()) != null) {
                    if (!anchors2.isEmpty()) {
                        Iterator<AnchorCommonStruct> it3 = anchors2.iterator();
                        while (it3.hasNext()) {
                            if (it3.next().getType() != iType) {
                                break;
                            }
                        }
                        numValueOf = Integer.valueOf(iType);
                    } else {
                        numValueOf = Integer.valueOf(iType);
                    }
                }
            }
            int type = EnumC1430380nKG.ANCHOR_BOOKTOK.getTYPE();
            if (numValueOf != null && numValueOf.intValue() == type) {
                if (dialogC1393760mNC != null) {
                    dialogC1393760mNC.LJLIIIL(2131827847);
                }
            } else {
                int type2 = EnumC1430380nKG.ANCHOR_MOVIETOK.getTYPE();
                if (numValueOf != null && numValueOf.intValue() == type2 && dialogC1393760mNC != null) {
                    dialogC1393760mNC.LJLIIIL(2131837495);
                }
            }
            if ((!((C712520RxC) awS318S0300000_21.l1).LJIILL().isEmpty()) && ((InterfaceC1393560mMs) ListProtector.get(((C712520RxC) awS318S0300000_21.l1).LJIILL(), 0)).type() == EnumC1430380nKG.POI.getTYPE() && (poiDataStruct = ((C712520RxC) awS318S0300000_21.l1).LIZIZ.LIZ.getPoiDataStruct()) != null && true == poiDataStruct.isProductAnchor() && (((anchors = ((C712520RxC) awS318S0300000_21.l1).LIZIZ.LIZ.getAnchors()) != null && (anchorCommonStruct = (AnchorCommonStruct) C13LP.LJJJLL(anchors)) != null && (keyword = anchorCommonStruct.getKeyword()) != null) || ((poiDataStruct2 = ((C712520RxC) awS318S0300000_21.l1).LIZIZ.LIZ.getPoiDataStruct()) != null && (keyword = poiDataStruct2.poiName) != null))) {
                if (dialogC1393760mNC != null) {
                    dialogC1393760mNC.LLJJJJJIL = keyword;
                    dialogC1393760mNC.show();
                    C785410UrT.LIZIZ(dialogC1393760mNC);
                    PopupMonitorServiceImpl.LIZ.getClass();
                    PopupMonitorServiceImpl.LJJJ(dialogC1393760mNC);
                    C816490W1f.LIZ(dialogC1393760mNC);
                }
                ((C1393580mMu) awS318S0300000_21.l0).LIZLLL = dialogC1393760mNC;
            } else {
                if (dialogC1393760mNC != null) {
                    dialogC1393760mNC.show();
                    C785410UrT.LIZIZ(dialogC1393760mNC);
                    PopupMonitorServiceImpl.LIZ.getClass();
                    PopupMonitorServiceImpl.LJJJ(dialogC1393760mNC);
                    C816490W1f.LIZ(dialogC1393760mNC);
                }
                ((C1393580mMu) awS318S0300000_21.l0).LIZLLL = dialogC1393760mNC;
            }
        } else {
            if (C1393580mMu.LJ == null) {
                TuxIconView tuxIconViewLJIILL2 = ((InterfaceC705550Rlx) awS318S0300000_21.l2).LJIILL();
                if (tuxIconViewLJIILL2 != null && (context2 = tuxIconViewLJIILL2.getContext()) != null) {
                    C712520RxC c712520RxC4 = (C712520RxC) awS318S0300000_21.l1;
                    C1393580mMu c1393580mMu4 = (C1393580mMu) awS318S0300000_21.l0;
                    dialogC1393760mNC3 = new DialogC1393760mNC(context2, c712520RxC4, zBooleanValue, z2, str);
                    dialogC1393760mNC3.LLJLLIL = c1393580mMu4.LIZ;
                }
                C1393580mMu.LJ = dialogC1393760mNC3;
                if (dialogC1393760mNC3 != null) {
                    dialogC1393760mNC3.LLJJIII = ((C712520RxC) awS318S0300000_21.l1).LIZIZ.LIZ.getAid();
                }
            } else {
                Activity topActivity = ActivityStack.getTopActivity();
                DialogC1393760mNC dialogC1393760mNC4 = C1393580mMu.LJ;
                if (dialogC1393760mNC4 != null) {
                    activityLIZ = C1388190mED.LIZ(dialogC1393760mNC4.getContext());
                } else {
                    activityLIZ = null;
                }
                if (!Intrinsics.LJFF(activityLIZ, topActivity)) {
                    View viewLJIIL = ((InterfaceC705550Rlx) awS318S0300000_21.l2).LJIIL();
                    if (viewLJIIL != null && (context = viewLJIIL.getContext()) != null) {
                        C712520RxC c712520RxC5 = (C712520RxC) awS318S0300000_21.l1;
                        C1393580mMu c1393580mMu5 = (C1393580mMu) awS318S0300000_21.l0;
                        dialogC1393760mNC2 = new DialogC1393760mNC(context, c712520RxC5, zBooleanValue, z2, str);
                        dialogC1393760mNC2.LLJLLIL = c1393580mMu5.LIZ;
                    }
                    C1393580mMu.LJ = dialogC1393760mNC2;
                    if (dialogC1393760mNC2 != null) {
                        dialogC1393760mNC2.LLJJIII = ((C712520RxC) awS318S0300000_21.l1).LIZIZ.LIZ.getAid();
                    }
                    DialogC1393760mNC dialogC1393760mNC5 = C1393580mMu.LJ;
                    if (dialogC1393760mNC5 != null) {
                        dialogC1393760mNC5.LLJILJILJ = (C712520RxC) awS318S0300000_21.l1;
                    }
                } else {
                    DialogC1393760mNC dialogC1393760mNC6 = C1393580mMu.LJ;
                    if (dialogC1393760mNC6 != null) {
                        dialogC1393760mNC6.LLJILLL = zBooleanValue;
                        if (dialogC1393760mNC6.LLJJIJI) {
                            if (Intrinsics.LJFF(dialogC1393760mNC6.LLJJIII, ((C712520RxC) awS318S0300000_21.l1).LIZIZ.LIZ.getAid())) {
                                z = true;
                            } else {
                                DialogC1393760mNC dialogC1393760mNC7 = C1393580mMu.LJ;
                                if (dialogC1393760mNC7 != null) {
                                    dialogC1393760mNC7.LLJJIII = ((C712520RxC) awS318S0300000_21.l1).LIZIZ.LIZ.getAid();
                                }
                                DialogC1393760mNC dialogC1393760mNC8 = C1393580mMu.LJ;
                                if (dialogC1393760mNC8 != null) {
                                    dialogC1393760mNC8.LLJILJILJ = (C712520RxC) awS318S0300000_21.l1;
                                    dialogC1393760mNC8.LJLIIL();
                                }
                                DialogC1393760mNC dialogC1393760mNC9 = C1393580mMu.LJ;
                                if (dialogC1393760mNC9 != null) {
                                    dialogC1393760mNC9.LJLIL();
                                }
                            }
                        }
                    }
                }
            }
            DialogC1393760mNC dialogC1393760mNC10 = C1393580mMu.LJ;
            if (dialogC1393760mNC10 != null) {
                dialogC1393760mNC10.LLJILLL = zBooleanValue;
                dialogC1393760mNC10.LLJJIJIIJIL = true;
                dialogC1393760mNC10.LJLILLLLZI();
            }
            ((C1393580mMu) awS318S0300000_21.l0).LIZLLL = C1393580mMu.LJ;
        }
        Iterator<InterfaceC1393560mMs> it4 = ((C712520RxC) awS318S0300000_21.l1).LJIILL().iterator();
        while (it4.hasNext()) {
            it4.next().LJJJLIIL((C712520RxC) awS318S0300000_21.l1, C1393580mMu.LJ, z, false, zBooleanValue);
        }
        C712520RxC c712520RxC6 = (C712520RxC) awS318S0300000_21.l1;
        if (zBooleanValue2) {
            try {
                HashMap<String, String> mobParams = c712520RxC6.LIZIZ.LIZ.getMobParams();
                if (mobParams != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String str2 = mobParams.get("click_timestamp");
                    if (C123100dR.LIZ(str2) && str2 != null) {
                        try {
                            long j = CastLongProtector.parseLong(str2);
                            if (j > 0) {
                                C2344009Gk c2344009Gk = new C2344009Gk();
                                c2344009Gk.LIZLLL(jCurrentTimeMillis - j, "duration");
                                C20684815ws.LJIILLIIL("rd_tiktokec_mall_video_page_anchorwindown_dur", c2344009Gk.LIZ);
                            }
                        } catch (NumberFormatException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS318S0300000_21 awS318S0300000_21, Object obj, Object obj2, Object obj3) throws Throwable {
        boolean z;
        boolean z2;
        Activity activityLIZ;
        Context context;
        DialogC1393760mNC dialogC1393760mNC;
        Context context2;
        Context context3;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        String str = (String) obj3;
        C1393590mMv c1393590mMv = (C1393590mMv) awS318S0300000_21.l0;
        C712520RxC c712520RxC = (C712520RxC) awS318S0300000_21.l1;
        c1393590mMv.getClass();
        Iterator<InterfaceC1393560mMs> it2 = c712520RxC.LJIILL().iterator();
        while (true) {
            z = false;
            if (it2.hasNext()) {
                if (it2.next() instanceof ShopWindowAnchorMaker) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        DialogC1393760mNC dialogC1393760mNC2 = null;
        if (!z2) {
            TuxIconView tuxIconViewLJIILL = ((InterfaceC705550Rlx) awS318S0300000_21.l2).LJIILL();
            if (tuxIconViewLJIILL != null && (context3 = tuxIconViewLJIILL.getContext()) != null) {
                C712520RxC c712520RxC2 = (C712520RxC) awS318S0300000_21.l1;
                C1393590mMv c1393590mMv2 = (C1393590mMv) awS318S0300000_21.l0;
                dialogC1393760mNC2 = new DialogC1393760mNC(context3, c712520RxC2, zBooleanValue, z2, str);
                dialogC1393760mNC2.LLJLLIL = c1393590mMv2.LIZ;
            }
            C1393590mMv c1393590mMv3 = (C1393590mMv) awS318S0300000_21.l0;
            C712520RxC c712520RxC3 = (C712520RxC) awS318S0300000_21.l1;
            c1393590mMv3.getClass();
            if (C1393590mMv.LJIIJJI(c712520RxC3)) {
                if (dialogC1393760mNC2 != null) {
                    dialogC1393760mNC2.LJLIIIL(2131827847);
                    dialogC1393760mNC2.show();
                    C785410UrT.LIZIZ(dialogC1393760mNC2);
                    PopupMonitorServiceImpl.LIZ.getClass();
                    PopupMonitorServiceImpl.LJJJ(dialogC1393760mNC2);
                    C816490W1f.LIZ(dialogC1393760mNC2);
                }
                ((C1393590mMv) awS318S0300000_21.l0).LIZJ = dialogC1393760mNC2;
            } else {
                C1393590mMv c1393590mMv4 = (C1393590mMv) awS318S0300000_21.l0;
                C712520RxC c712520RxC4 = (C712520RxC) awS318S0300000_21.l1;
                c1393590mMv4.getClass();
                if (C1393590mMv.LJIIL(c712520RxC4)) {
                    if (dialogC1393760mNC2 != null) {
                        dialogC1393760mNC2.LJLIIIL(2131837495);
                        dialogC1393760mNC2.show();
                        C785410UrT.LIZIZ(dialogC1393760mNC2);
                        PopupMonitorServiceImpl.LIZ.getClass();
                        PopupMonitorServiceImpl.LJJJ(dialogC1393760mNC2);
                        C816490W1f.LIZ(dialogC1393760mNC2);
                    }
                    ((C1393590mMv) awS318S0300000_21.l0).LIZJ = dialogC1393760mNC2;
                } else {
                    if (dialogC1393760mNC2 != null) {
                        dialogC1393760mNC2.show();
                        C785410UrT.LIZIZ(dialogC1393760mNC2);
                        PopupMonitorServiceImpl.LIZ.getClass();
                        PopupMonitorServiceImpl.LJJJ(dialogC1393760mNC2);
                        C816490W1f.LIZ(dialogC1393760mNC2);
                    }
                    ((C1393590mMv) awS318S0300000_21.l0).LIZJ = dialogC1393760mNC2;
                }
            }
        } else {
            if (C1393590mMv.LJ == null) {
                TuxIconView tuxIconViewLJIILL2 = ((InterfaceC705550Rlx) awS318S0300000_21.l2).LJIILL();
                if (tuxIconViewLJIILL2 != null && (context2 = tuxIconViewLJIILL2.getContext()) != null) {
                    C712520RxC c712520RxC5 = (C712520RxC) awS318S0300000_21.l1;
                    C1393590mMv c1393590mMv5 = (C1393590mMv) awS318S0300000_21.l0;
                    dialogC1393760mNC2 = new DialogC1393760mNC(context2, c712520RxC5, zBooleanValue, z2, str);
                    dialogC1393760mNC2.LLJLLIL = c1393590mMv5.LIZ;
                }
                C1393590mMv.LJ = dialogC1393760mNC2;
                if (dialogC1393760mNC2 != null) {
                    dialogC1393760mNC2.LLJJIII = ((C712520RxC) awS318S0300000_21.l1).LIZIZ.LIZ.getAid();
                }
            } else {
                Activity topActivity = ActivityStack.getTopActivity();
                DialogC1393760mNC dialogC1393760mNC3 = C1393590mMv.LJ;
                if (dialogC1393760mNC3 != null) {
                    activityLIZ = C1388190mED.LIZ(dialogC1393760mNC3.getContext());
                } else {
                    activityLIZ = null;
                }
                if (!Intrinsics.LJFF(activityLIZ, topActivity)) {
                    TuxIconView tuxIconViewLJIILL3 = ((InterfaceC705550Rlx) awS318S0300000_21.l2).LJIILL();
                    if (tuxIconViewLJIILL3 != null && (context = tuxIconViewLJIILL3.getContext()) != null) {
                        C712520RxC c712520RxC6 = (C712520RxC) awS318S0300000_21.l1;
                        C1393590mMv c1393590mMv6 = (C1393590mMv) awS318S0300000_21.l0;
                        dialogC1393760mNC2 = new DialogC1393760mNC(context, c712520RxC6, zBooleanValue, z2, str);
                        dialogC1393760mNC2.LLJLLIL = c1393590mMv6.LIZ;
                    }
                    C1393590mMv.LJ = dialogC1393760mNC2;
                    if (dialogC1393760mNC2 != null) {
                        dialogC1393760mNC2.LLJJIII = ((C712520RxC) awS318S0300000_21.l1).LIZIZ.LIZ.getAid();
                    }
                    DialogC1393760mNC dialogC1393760mNC4 = C1393590mMv.LJ;
                    if (dialogC1393760mNC4 != null) {
                        dialogC1393760mNC4.LLJILJILJ = (C712520RxC) awS318S0300000_21.l1;
                    }
                } else {
                    DialogC1393760mNC dialogC1393760mNC5 = C1393590mMv.LJ;
                    if (dialogC1393760mNC5 != null) {
                        dialogC1393760mNC5.LLJILLL = zBooleanValue;
                        if (dialogC1393760mNC5.LLJJIJI) {
                            if (Intrinsics.LJFF(dialogC1393760mNC5.LLJJIII, ((C712520RxC) awS318S0300000_21.l1).LIZIZ.LIZ.getAid())) {
                                z = true;
                            } else {
                                DialogC1393760mNC dialogC1393760mNC6 = C1393590mMv.LJ;
                                if (dialogC1393760mNC6 != null) {
                                    dialogC1393760mNC6.LLJJIII = ((C712520RxC) awS318S0300000_21.l1).LIZIZ.LIZ.getAid();
                                }
                                DialogC1393760mNC dialogC1393760mNC7 = C1393590mMv.LJ;
                                if (dialogC1393760mNC7 != null) {
                                    dialogC1393760mNC7.LLJILJILJ = (C712520RxC) awS318S0300000_21.l1;
                                    dialogC1393760mNC7.LJLIIL();
                                }
                                DialogC1393760mNC dialogC1393760mNC8 = C1393590mMv.LJ;
                                if (dialogC1393760mNC8 != null) {
                                    dialogC1393760mNC8.LJLIL();
                                }
                            }
                        }
                    }
                }
            }
            DialogC1393760mNC dialogC1393760mNC9 = C1393590mMv.LJ;
            if (dialogC1393760mNC9 != null) {
                dialogC1393760mNC9.LLJILLL = zBooleanValue;
                dialogC1393760mNC9.LLJJIJIIJIL = true;
            }
            C1393590mMv c1393590mMv7 = (C1393590mMv) awS318S0300000_21.l0;
            C712520RxC c712520RxC7 = (C712520RxC) awS318S0300000_21.l1;
            c1393590mMv7.getClass();
            if (C1393590mMv.LJIIJJI(c712520RxC7)) {
                DialogC1393760mNC dialogC1393760mNC10 = C1393590mMv.LJ;
                if (dialogC1393760mNC10 != null) {
                    dialogC1393760mNC10.LJLIIIL(2131827847);
                }
            } else {
                C1393590mMv c1393590mMv8 = (C1393590mMv) awS318S0300000_21.l0;
                C712520RxC c712520RxC8 = (C712520RxC) awS318S0300000_21.l1;
                c1393590mMv8.getClass();
                if (C1393590mMv.LJIIL(c712520RxC8) && (dialogC1393760mNC = C1393590mMv.LJ) != null) {
                    dialogC1393760mNC.LJLIIIL(2131837495);
                }
            }
            DialogC1393760mNC dialogC1393760mNC11 = C1393590mMv.LJ;
            if (dialogC1393760mNC11 != null) {
                dialogC1393760mNC11.LJLILLLLZI();
            }
            ((C1393590mMv) awS318S0300000_21.l0).LIZJ = C1393590mMv.LJ;
        }
        Iterator<InterfaceC1393560mMs> it3 = ((C712520RxC) awS318S0300000_21.l1).LJIILL().iterator();
        while (it3.hasNext()) {
            it3.next().LJJJLIIL((C712520RxC) awS318S0300000_21.l1, C1393590mMv.LJ, z, false, zBooleanValue);
        }
        C712520RxC c712520RxC9 = (C712520RxC) awS318S0300000_21.l1;
        if (zBooleanValue2) {
            try {
                HashMap<String, String> mobParams = c712520RxC9.LIZIZ.LIZ.getMobParams();
                if (mobParams != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String str2 = mobParams.get("click_timestamp");
                    if (C123100dR.LIZ(str2) && str2 != null) {
                        try {
                            long j = CastLongProtector.parseLong(str2);
                            if (j > 0) {
                                C2344009Gk c2344009Gk = new C2344009Gk();
                                c2344009Gk.LIZLLL(jCurrentTimeMillis - j, "duration");
                                C20684815ws.LJIILLIIL("rd_tiktokec_mall_video_page_anchorwindown_dur", c2344009Gk.LIZ);
                            }
                        } catch (NumberFormatException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS318S0300000_21(C1393580mMu c1393580mMu, C712520RxC c712520RxC, InterfaceC705550Rlx interfaceC705550Rlx, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1393580mMu;
        this.l1 = c712520RxC;
        this.l2 = interfaceC705550Rlx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS318S0300000_21(C1393590mMv c1393590mMv, C712520RxC c712520RxC, InterfaceC705550Rlx interfaceC705550Rlx, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1393590mMv;
        this.l1 = c712520RxC;
        this.l2 = interfaceC705550Rlx;
    }
}
