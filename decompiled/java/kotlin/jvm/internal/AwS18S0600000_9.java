package kotlin.jvm.internal;

import X.C05P0;
import X.C09AY;
import X.C0NOB;
import X.C1247510iZJ;
import X.C1388190mED;
import X.C1390850mIV;
import X.C1773330wFP;
import X.C1775140wIK;
import X.C19EG;
import X.C19FT;
import X.C20684815ws;
import X.C2097608Jq;
import X.C21176317tx;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C599820Nfo;
import X.C601990NjJ;
import X.C606280NqE;
import X.EnumC606160Nq2;
import X.InterfaceC21159017rA;
import X.InterfaceC606300NqG;
import X.InterfaceC606310NqH;
import X.InterfaceC606320NqI;
import X.InterfaceC634840OvC;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.FragmentManager;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.model.ArtistHonorLabel;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS253S0300000_9;
import kotlin.jvm.internal.AwS27S1201000_9;

/* JADX INFO: loaded from: classes10.dex */
public class AwS18S0600000_9 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [X.0NOB, X.0NqJ] */
    public static final Object invoke$0(AwS18S0600000_9 awS18S0600000_9) {
        Object obj;
        Object obj2;
        boolean zBooleanValue;
        Boolean bool;
        Object obj3;
        Long lLIZ;
        final C1773330wFP c1773330wFP = (C1773330wFP) ((InterfaceC634840OvC) awS18S0600000_9.l0).LIZIZ(C1773330wFP.class);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("bridge_center_extra_bdx_bridge_context", (InterfaceC634840OvC) awS18S0600000_9.l0);
        final InterfaceC634840OvC interfaceC634840OvC = (InterfaceC634840OvC) awS18S0600000_9.l0;
        linkedHashMap.put("bridge_center_extra_bridge_center_context", new InterfaceC21159017rA() { // from class: X.0NjK
            @Override // X.InterfaceC21159017rA
            public final String LIZJ() {
                LynxView lynxView;
                View view = interfaceC634840OvC.getView();
                if (!(view instanceof LynxView) || (lynxView = (LynxView) view) == null) {
                    return null;
                }
                return lynxView.getTemplateUrl();
            }

            @Override // X.InterfaceC21159017rA
            public final View LIZ(String str) {
                LynxView lynxView;
                View view = interfaceC634840OvC.getView();
                if (!(view instanceof LynxView) || (lynxView = (LynxView) view) == null) {
                    return null;
                }
                return lynxView.findViewByName(str);
            }

            @Override // X.InterfaceC21159017rA
            public final <T> T LIZIZ(Class<T> cls) {
                return (T) interfaceC634840OvC.LIZIZ(cls);
            }
        });
        if (c1773330wFP != null) {
            linkedHashMap.put("bridge_center_extra_lynx_item_vo", c1773330wFP);
        }
        linkedHashMap.put("t_na_jsb_trigger_signal_start", Long.valueOf(System.currentTimeMillis()));
        C606280NqE c606280NqE = (C606280NqE) awS18S0600000_9.l1;
        ((InterfaceC606310NqH) awS18S0600000_9.l2).getType();
        Map<String, Object> perfParams = ((InterfaceC606310NqH) awS18S0600000_9.l2).getPerfParams();
        c606280NqE.getClass();
        if (perfParams != null) {
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ecMixMallTriggerSignal, perfParams=");
            sbLIZ.append(perfParams);
            C2188811AlT.LIZIZ(sbLIZ);
            c599820Nfo.getClass();
            C599820Nfo.LIZLLL();
            Object obj4 = perfParams.get("t_lynx_trigger_signal_jsb_start");
            if (obj4 != null && (lLIZ = C601990NjJ.LIZ(obj4)) != null) {
                linkedHashMap.put("t_lynx_trigger_signal_jsb_start", Long.valueOf(lLIZ.longValue()));
            }
        }
        Map<String, Object> params = ((InterfaceC606310NqH) awS18S0600000_9.l2).getParams();
        String type = ((InterfaceC606310NqH) awS18S0600000_9.l2).getType();
        Boolean bool2 = null;
        fValueOf = null;
        fValueOf = null;
        Float fValueOf = null;
        if (Intrinsics.LJFF(type, EnumC606160Nq2.METHOD.getValue())) {
            Map<String, Object> config = ((InterfaceC606310NqH) awS18S0600000_9.l2).getConfig();
            if (config == null || (obj3 = config.get("timeout_duration")) == null) {
                if (params != null) {
                    obj3 = params.get("timeout_duration");
                } else {
                    obj3 = null;
                }
            }
            if (obj3 instanceof Integer) {
                if (((Integer) obj3) != null) {
                    fValueOf = Float.valueOf(r1.intValue());
                }
            } else if (obj3 instanceof Double) {
                Double d = (Double) obj3;
                if (d != null) {
                    fValueOf = Float.valueOf((float) d.doubleValue());
                }
            } else if (obj3 instanceof Float) {
                fValueOf = (Float) obj3;
            }
            final InterfaceC606310NqH interfaceC606310NqH = (InterfaceC606310NqH) awS18S0600000_9.l2;
            final InterfaceC634840OvC interfaceC634840OvC2 = (InterfaceC634840OvC) awS18S0600000_9.l0;
            final C606280NqE c606280NqE2 = (C606280NqE) awS18S0600000_9.l1;
            final Looper looper = (Looper) awS18S0600000_9.l4;
            final CompletionBlock completionBlock = (CompletionBlock) awS18S0600000_9.l5;
            ?? r4 = new C0NOB() { // from class: X.0NqJ
                @Override // X.C0NOB
                public final void LIZ(int i, String str, Map<String, ? extends Object> map) {
                    String strLIZIZ;
                    String templateUrl;
                    String str2;
                    LynxView lynxView;
                    String str3 = "";
                    if (i <= 0) {
                        String string = null;
                        try {
                            Map<String, Object> params2 = interfaceC606310NqH.getParams();
                            if (params2 == null) {
                                strLIZIZ = "";
                            } else {
                                strLIZIZ = C1741890vQh.LJIIIIZZ(params2);
                                if (strLIZIZ == null) {
                                    strLIZIZ = "";
                                }
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("invalid event params: ");
                            Map<String, Object> params3 = interfaceC606310NqH.getParams();
                            if (params3 != null) {
                                string = params3.toString();
                            }
                            sbLIZ2.append(string);
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        }
                        String eventName = interfaceC606310NqH.getEventName();
                        String type2 = interfaceC606310NqH.getType();
                        View view = interfaceC634840OvC2.getView();
                        if (!(view instanceof LynxView) || (lynxView = (LynxView) view) == null || (templateUrl = lynxView.getTemplateUrl()) == null) {
                            templateUrl = "";
                        }
                        C1773330wFP c1773330wFP2 = c1773330wFP;
                        if (c1773330wFP2 != null && (str2 = c1773330wFP2.LIZJ) != null) {
                            str3 = str2;
                        }
                        C1768180w76.LIZ("rd_ec_mix_mall_trigger_signal_error", null, C2097608Jq.LJIIIIZZ(new Pair("name", eventName), new Pair("type", type2), new Pair("params", strLIZIZ), new Pair("code", Integer.valueOf(i)), new Pair("message", str), new Pair("gecko_url", templateUrl), new Pair("bff_type", str3)), false);
                        C606280NqE c606280NqE3 = c606280NqE2;
                        Looper looper2 = looper;
                        AwS27S1201000_9 awS27S1201000_9 = new AwS27S1201000_9((CompletionBlock) completionBlock, (CompletionBlock<InterfaceC606300NqG>) c606280NqE3, (C606280NqE) i, (int) str, (String) 0);
                        c606280NqE3.getClass();
                        C606280NqE.LIZJ(looper2, awS27S1201000_9);
                        return;
                    }
                    C606280NqE c606280NqE4 = c606280NqE2;
                    Looper looper3 = looper;
                    AwS253S0300000_9 awS253S0300000_9 = new AwS253S0300000_9(c606280NqE4, (C606280NqE) completionBlock, (CompletionBlock<InterfaceC606300NqG>) map, (Map<String, ? extends Object>) 9);
                    c606280NqE4.getClass();
                    C606280NqE.LIZJ(looper3, awS253S0300000_9);
                }
            };
            if (fValueOf != null) {
                InterfaceC606320NqI interfaceC606320NqI = (InterfaceC606320NqI) awS18S0600000_9.l3;
                String eventName = interfaceC606310NqH.getEventName();
                Map<String, Object> params2 = ((InterfaceC606310NqH) awS18S0600000_9.l2).getParams();
                if (params2 == null) {
                    params2 = C2097608Jq.LJ();
                }
                interfaceC606320NqI.LJII(new C1775140wIK(eventName, params2), (long) (fValueOf.floatValue() * 1000), linkedHashMap, r4, new C21176317tx());
            } else {
                InterfaceC606320NqI interfaceC606320NqI2 = (InterfaceC606320NqI) awS18S0600000_9.l3;
                String eventName2 = interfaceC606310NqH.getEventName();
                Map<String, Object> params3 = ((InterfaceC606310NqH) awS18S0600000_9.l2).getParams();
                if (params3 == null) {
                    params3 = C2097608Jq.LJ();
                }
                interfaceC606320NqI2.LJ(new C1775140wIK(eventName2, params3), linkedHashMap, r4);
            }
        } else if (Intrinsics.LJFF(type, EnumC606160Nq2.EVENT.getValue())) {
            Map<String, Object> config2 = ((InterfaceC606310NqH) awS18S0600000_9.l2).getConfig();
            if (config2 != null) {
                obj = config2.get("is_sticky");
            } else {
                obj = null;
            }
            if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
                bool2 = bool;
            } else {
                if (params != null) {
                    obj2 = params.get("is_sticky");
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof Boolean) {
                    bool2 = (Boolean) obj2;
                }
            }
            InterfaceC606320NqI interfaceC606320NqI3 = (InterfaceC606320NqI) awS18S0600000_9.l3;
            String eventName3 = ((InterfaceC606310NqH) awS18S0600000_9.l2).getEventName();
            Map<String, Object> params4 = ((InterfaceC606310NqH) awS18S0600000_9.l2).getParams();
            if (params4 == null) {
                params4 = C2097608Jq.LJ();
            }
            C1775140wIK c1775140wIK = new C1775140wIK(eventName3, params4);
            if (bool2 != null) {
                zBooleanValue = bool2.booleanValue();
            } else {
                zBooleanValue = false;
            }
            interfaceC606320NqI3.LJIIIZ(c1775140wIK, zBooleanValue, linkedHashMap, new C21176317tx());
            C606280NqE c606280NqE3 = (C606280NqE) awS18S0600000_9.l1;
            Looper looper2 = (Looper) awS18S0600000_9.l4;
            AwS410S0200000_9 awS410S0200000_9 = new AwS410S0200000_9((CompletionBlock) awS18S0600000_9.l5, (CompletionBlock<InterfaceC606300NqG>) c606280NqE3, (C606280NqE) 100);
            c606280NqE3.getClass();
            C606280NqE.LIZJ(looper2, awS410S0200000_9);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS18S0600000_9 awS18S0600000_9) {
        FragmentManager supportFragmentManager;
        Context context = (Context) awS18S0600000_9.l0;
        C19FT c19ft = (C19FT) awS18S0600000_9.l1;
        C05P0 c05p0 = (C05P0) awS18S0600000_9.l2;
        OriginMusicListViewModel originMusicListViewModel = (OriginMusicListViewModel) awS18S0600000_9.l3;
        MusicPlayViewModel musicPlayViewModel = (MusicPlayViewModel) awS18S0600000_9.l4;
        OriginMusicArg originMusicArg = (OriginMusicArg) awS18S0600000_9.l5;
        ArrayList arrayList = new ArrayList();
        if (originMusicListViewModel.LLJJIJIL != ArtistHonorLabel.ARTIST_HONOR_LABEL_SONG_WRITER) {
            C1247510iZJ c1247510iZJ = new C1247510iZJ();
            c1247510iZJ.LIZIZ(2131846315);
            c1247510iZJ.LIZ(new AwS375S0200000_9(context, musicPlayViewModel, 161));
            arrayList.add(c1247510iZJ);
        }
        C1247510iZJ c1247510iZJ2 = new C1247510iZJ();
        c1247510iZJ2.LIZIZ(2131846316);
        c1247510iZJ2.LIZ(new AwS30S0600000_9(context, c19ft, c05p0, originMusicArg, musicPlayViewModel, originMusicListViewModel, 1));
        arrayList.add(c1247510iZJ2);
        C1390850mIV c1390850mIV = new C1390850mIV();
        c1390850mIV.LJI(arrayList);
        TuxActionSheet tuxActionSheetLIZJ = c1390850mIV.LIZJ();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("button_name", "more");
        c2344009Gk.LIZJ(1, "is_self");
        C20684815ws.LJIILLIIL("music_tab_click_more", c2344009Gk.LIZ);
        C19EG c19egLIZIZ = C1388190mED.LIZIZ((Context) awS18S0600000_9.l0);
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            tuxActionSheetLIZJ.show(supportFragmentManager, "ellipsis");
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS18S0600000_9(InterfaceC634840OvC interfaceC634840OvC, InterfaceC634840OvC interfaceC634840OvC2, C606280NqE c606280NqE, InterfaceC606310NqH interfaceC606310NqH, InterfaceC606320NqI interfaceC606320NqI, Looper looper, CompletionBlock<InterfaceC606300NqG> completionBlock) {
        super(0);
        this.$t = completionBlock;
        this.l0 = interfaceC634840OvC;
        this.l1 = interfaceC634840OvC2;
        this.l2 = c606280NqE;
        this.l3 = interfaceC606310NqH;
        this.l4 = interfaceC606320NqI;
        this.l5 = looper;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS18S0600000_9(Context context, Context context2, C19FT<Intent, ActivityResult> c19ft, C05P0<Function1<ActivityResult, Unit>> c05p0, OriginMusicListViewModel originMusicListViewModel, MusicPlayViewModel musicPlayViewModel, OriginMusicArg originMusicArg) {
        super(0);
        this.$t = originMusicArg;
        this.l0 = context;
        this.l1 = context2;
        this.l2 = c19ft;
        this.l3 = c05p0;
        this.l4 = originMusicListViewModel;
        this.l5 = musicPlayViewModel;
    }
}
