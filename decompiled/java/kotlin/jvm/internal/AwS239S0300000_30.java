package kotlin.jvm.internal;

import X.AbstractC20133313q7;
import X.C013C;
import X.C05P0;
import X.C09AE;
import X.C09AY;
import X.C0PEM;
import X.C0WZX;
import X.C112R;
import X.C127I;
import X.C1296530jqN;
import X.C13LE;
import X.C13LP;
import X.C141E;
import X.C14UB;
import X.C14XI;
import X.C1549500qQO;
import X.C1696250uF5;
import X.C1696880uG6;
import X.C1DFH;
import X.C20042013bO;
import X.C20042213bQ;
import X.C20052513d5;
import X.C20053713dH;
import X.C20060013eI;
import X.C20063313ep;
import X.C20075213gk;
import X.C20076613gy;
import X.C20077013h2;
import X.C20078813hK;
import X.C20082713hx;
import X.C20084613iG;
import X.C20084713iH;
import X.C20131713pr;
import X.C20133813qC;
import X.C20170413w6;
import X.C20171113wD;
import X.C20171713wJ;
import X.C20171813wK;
import X.C201982141k;
import X.C20274314Ur;
import X.C20278814Wk;
import X.C20304914ch;
import X.C20305614co;
import X.C20308714dJ;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2296808zG;
import X.C23118094a;
import X.C23250099c;
import X.C2389009Xs;
import X.C259800zU;
import X.C786410Ut5;
import X.C815520Vyw;
import X.C838410Wul;
import X.EnumC20045413bw;
import X.EnumC20169713vz;
import X.EnumC20234414Fi;
import X.InterfaceC1675870tiD;
import X.InterfaceC1680560tpm;
import X.InterfaceC1686290tz1;
import X.InterfaceC1697480uH4;
import X.InterfaceC1911280zpu;
import X.InterfaceC20055013dU;
import X.InterfaceC20076713gz;
import X.InterfaceC20133413q8;
import X.InterfaceC20278514Wh;
import X.InterfaceC20278714Wj;
import X.InterfaceC634840OvC;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Canvas;
import android.os.Debug;
import android.os.PowerManager;
import android.os.Process;
import android.view.View;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.navigation.NavBackStackEntry;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.search.pages.result.nimble.v2.component.Top1SurroundedImageListAssem;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushItem;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.social.sticker.model.StorySocialEventPrepareData;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.router.model.TakoAutoSendData;
import com.ss.android.ugc.trill.setting.compose.DisplayAndCaptionVM;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes31.dex */
public class AwS239S0300000_30 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS239S0300000_30 awS239S0300000_30, Object obj) {
        boolean zBooleanValue;
        if (Intrinsics.LJFF(obj, (FocusTargetNode) awS239S0300000_30.l0)) {
            zBooleanValue = false;
        } else if (!Intrinsics.LJFF(obj, ((C20060013eI) awS239S0300000_30.l1).LJFF)) {
            zBooleanValue = ((Boolean) ((Function1) awS239S0300000_30.l2).invoke(obj)).booleanValue();
        } else {
            "Focus search landed at the root.".toString();
            throw new IllegalStateException("Focus search landed at the root.");
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final Object invoke$1(AwS239S0300000_30 awS239S0300000_30, Object obj) {
        TakoAutoSendData takoAutoSendData = (TakoAutoSendData) obj;
        takoAutoSendData.setImagePathList((List) awS239S0300000_30.l0);
        takoAutoSendData.setSendType((EnumC20234414Fi) awS239S0300000_30.l1);
        takoAutoSendData.setMobParams((Map) awS239S0300000_30.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS239S0300000_30 awS239S0300000_30, Object obj) {
        float f;
        float fFloatValue = ((Number) obj).floatValue();
        C20063313ep c20063313ep = (C20063313ep) awS239S0300000_30.l0;
        if (c20063313ep.LLJJIII) {
            f = 1.0f;
        } else {
            f = -1.0f;
        }
        C20082713hx c20082713hx = c20063313ep.LLJJI;
        float fLJI = f * c20082713hx.LJI(c20082713hx.LJ(((C112R) awS239S0300000_30.l2).LIZIZ(c20082713hx.LJ(c20082713hx.LJII(f * fFloatValue)))));
        if (Math.abs(fLJI) < Math.abs(fFloatValue)) {
            C09AE c09ae = (C09AE) awS239S0300000_30.l1;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Scroll animation cancelled because scroll was not consumed (");
            sbLIZ.append(fLJI);
            sbLIZ.append(" < ");
            sbLIZ.append(fFloatValue);
            sbLIZ.append(')');
            C23118094a.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), null, c09ae);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS239S0300000_30 awS239S0300000_30, Object obj) {
        boolean z = !((C20042013bO) awS239S0300000_30.l0).LIZIZ.containsKey(awS239S0300000_30.l1);
        Object obj2 = awS239S0300000_30.l1;
        if (z) {
            ((C20042013bO) awS239S0300000_30.l0).LIZ.remove(obj2);
            ((C20042013bO) awS239S0300000_30.l0).LIZIZ.put(awS239S0300000_30.l1, (C20042213bQ) awS239S0300000_30.l2);
            final C20042213bQ c20042213bQ = (C20042213bQ) awS239S0300000_30.l2;
            final C20042013bO c20042013bO = (C20042013bO) awS239S0300000_30.l0;
            final Object obj3 = awS239S0300000_30.l1;
            return new InterfaceC1680560tpm() { // from class: X.13bR
                @Override // X.InterfaceC1680560tpm
                public final void dispose() {
                    c20042213bQ.LIZ(c20042013bO.LIZ);
                    c20042013bO.LIZIZ.remove(obj3);
                }
            };
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Key ");
        sbLIZ.append(obj2);
        sbLIZ.append(" was used multiple times ");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public static final Object invoke$12(AwS239S0300000_30 awS239S0300000_30, Object obj) {
        AndroidComposeView androidComposeView;
        C20084713iH c20084713iH = (C20084713iH) awS239S0300000_30.l0;
        C20053713dH c20053713dH = (C20053713dH) awS239S0300000_30.l1;
        C20084713iH c20084713iH2 = (C20084713iH) awS239S0300000_30.l2;
        InterfaceC1686290tz1 interfaceC1686290tz1LIZ = ((InterfaceC1675870tiD) obj).LJLJI().LIZ();
        if (c20084713iH.getView().getVisibility() != 8) {
            c20084713iH.LLJJJJJIL = true;
            InterfaceC20055013dU interfaceC20055013dU = c20053713dH.LLJILLL;
            if ((interfaceC20055013dU instanceof AndroidComposeView) && (androidComposeView = (AndroidComposeView) interfaceC20055013dU) != null) {
                Canvas canvas = C1296530jqN.LIZ;
                Canvas canvas2 = ((C1696880uG6) interfaceC1686290tz1LIZ).LIZ;
                androidComposeView.getAndroidViewsHandler$ui_release().getClass();
                c20084713iH2.draw(canvas2);
            }
            c20084713iH.LLJJJJJIL = false;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS239S0300000_30 awS239S0300000_30, Object obj) {
        List<String> list = (List) obj;
        C14UB c14ub = (C14UB) awS239S0300000_30.l0;
        if (c14ub.LJII == 2) {
            Activity activity = (Activity) awS239S0300000_30.l1;
            List<String> list2 = (List) awS239S0300000_30.l2;
            c14ub.LIZ(activity, list2, list, list2);
        } else {
            c14ub.LIZ((Activity) awS239S0300000_30.l1, (List) awS239S0300000_30.l2, list, list);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS239S0300000_30 awS239S0300000_30, Object obj) {
        List<String> list = (List) obj;
        C20274314Ur c20274314Ur = (C20274314Ur) awS239S0300000_30.l0;
        if (c20274314Ur.LJII == 2) {
            Activity activity = (Activity) awS239S0300000_30.l1;
            List<String> list2 = (List) awS239S0300000_30.l2;
            c20274314Ur.LIZ(activity, list2, list, list2);
        } else {
            c20274314Ur.LIZ((Activity) awS239S0300000_30.l1, (List) awS239S0300000_30.l2, list, list);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, X.0uH4] */
    public static /* bridge */ /* synthetic */ Object invoke$15(AwS239S0300000_30 awS239S0300000_30, Object obj) {
        ?? r4 = (InterfaceC1697480uH4) obj;
        C20076613gy c20076613gy = (C20076613gy) r4;
        C20076613gy c20076613gy2 = (C20076613gy) awS239S0300000_30.l1;
        c20076613gy2.getClass();
        if (C20052513d5.LJI(c20076613gy2).getDragAndDropManager().LIZ(c20076613gy) && C20075213gk.LIZ(c20076613gy, C20077013h2.LIZ((C20078813hK) awS239S0300000_30.l2))) {
            ((C259800zU) awS239S0300000_30.l0).element = r4;
            return EnumC20045413bw.CancelTraversal;
        }
        return EnumC20045413bw.ContinueTraversal;
    }

    public static final Object invoke$16(AwS239S0300000_30 awS239S0300000_30, Object obj) {
        InterfaceC20076713gz interfaceC20076713gzInvoke;
        boolean z;
        C20076613gy c20076613gy = (C20076613gy) obj;
        if (!c20076613gy.LLJILLL) {
            return EnumC20045413bw.SkipSubtreeAndContinueTraversal;
        }
        boolean z2 = true;
        if (c20076613gy.LLJJIJIIJIL != null) {
            C1696250uF5.LIZIZ("DragAndDropTarget self reference must be null at the start of a drag and drop session");
        }
        Function1<C20078813hK, InterfaceC20076713gz> function1 = c20076613gy.LLJJI;
        if (function1 != null) {
            interfaceC20076713gzInvoke = function1.invoke((C20078813hK) awS239S0300000_30.l0);
        } else {
            interfaceC20076713gzInvoke = null;
        }
        c20076613gy.LLJJIJIIJIL = interfaceC20076713gzInvoke;
        if (interfaceC20076713gzInvoke != null) {
            z = true;
            C20076613gy c20076613gy2 = (C20076613gy) awS239S0300000_30.l1;
            c20076613gy2.getClass();
            C20052513d5.LJI(c20076613gy2).getDragAndDropManager().LIZIZ(c20076613gy);
        } else {
            z = false;
        }
        C013C c013c = (C013C) awS239S0300000_30.l2;
        if (!c013c.element && !z) {
            z2 = false;
        }
        c013c.element = z2;
        return EnumC20045413bw.ContinueTraversal;
    }

    public static final Object invoke$17(AwS239S0300000_30 awS239S0300000_30, Object obj) {
        return C20304914ch.LIZ((C20304914ch) obj, null, null, null, null, null, new C20305614co((PushItem) awS239S0300000_30.l0, ((Integer) awS239S0300000_30.l1).intValue(), (Integer) awS239S0300000_30.l2), null, null, 223);
    }

    public static final Object invoke$2(AwS239S0300000_30 awS239S0300000_30, Object obj) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        intentFilter.addAction("miui.intent.action.POWER_SAVE_MODE_CHANGED");
        final C05P0 c05p0 = (C05P0) awS239S0300000_30.l1;
        final PowerManager powerManager = (PowerManager) awS239S0300000_30.l2;
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: X.0jql
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                if (!C2214201BlK.LJIIJJI && intent != null) {
                    if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                        C2188191AkT.LIZIZ();
                    }
                }
                if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    c05p0.setValue(Boolean.valueOf(C20303114cP.LJI(context, powerManager)));
                } else {
                    C2408409cA.LIZ();
                    c05p0.setValue(Boolean.valueOf(C20303114cP.LJI(context, powerManager)));
                }
            }
        };
        C838410Wul.LJFF((Context) awS239S0300000_30.l0, broadcastReceiver, intentFilter, 4);
        return new C20308714dJ((Context) awS239S0300000_30.l0, broadcastReceiver, 2);
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS239S0300000_30 awS239S0300000_30, Object obj) throws Exception {
        IntentFilter intentFilter = new IntentFilter("android.app.action.INTERRUPTION_FILTER_CHANGED");
        final C05P0 c05p0 = (C05P0) awS239S0300000_30.l1;
        final C815520Vyw c815520Vyw = (C815520Vyw) awS239S0300000_30.l2;
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: X.14cQ
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                if (!C2214201BlK.LJIIJJI && intent != null) {
                    if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                        C2188191AkT.LIZIZ();
                    }
                }
                boolean z = false;
                if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    C05P0<Boolean> c05p02 = c05p0;
                    C815520Vyw c815520Vyw2 = c815520Vyw;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C20303114cP.LIZ;
                    if (C813810VwB.LIZIZ(c815520Vyw2.LIZIZ) != 1) {
                        z = true;
                    }
                    c05p02.setValue(Boolean.valueOf(z));
                    return;
                }
                C2408409cA.LIZ();
                C05P0<Boolean> c05p03 = c05p0;
                C815520Vyw c815520Vyw3 = c815520Vyw;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C20303114cP.LIZ;
                if (C813810VwB.LIZIZ(c815520Vyw3.LIZIZ) != 1) {
                    z = true;
                }
                c05p03.setValue(Boolean.valueOf(z));
            }
        };
        C786410Ut5.LJIJJ((Context) awS239S0300000_30.l0, broadcastReceiver, intentFilter);
        return new C20308714dJ((Context) awS239S0300000_30.l0, broadcastReceiver, 3);
    }

    public static final Object invoke$4(AwS239S0300000_30 awS239S0300000_30, Object obj) {
        C201982141k c201982141k = (C201982141k) obj;
        c201982141k.LIZJ = new C141E(new AwS219S0300000_10((Top1SurroundedImageListAssem) awS239S0300000_30.l2, (Integer) awS239S0300000_30.l0, (Integer) awS239S0300000_30.l1, 10));
        c201982141k.LIZLLL = R.id.ub8;
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS239S0300000_30 awS239S0300000_30, Object obj) {
        boolean z;
        C20170413w6 c20170413w6 = (C20170413w6) obj;
        if (c20170413w6.LIZIZ == EnumC20169713vz.SUCCESS) {
            z = true;
        } else {
            z = false;
        }
        Function1 function1 = (Function1) awS239S0300000_30.l0;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        C20171113wD c20171113wD = C20171113wD.LIZ;
        c20170413w6.LIZJ = System.currentTimeMillis() - ((C20171713wJ) awS239S0300000_30.l1).LJIIIIZZ;
        c20170413w6.LJI = !r4.LJI();
        StorySocialEventPrepareData storySocialEventPrepareData = ((C20171713wJ) awS239S0300000_30.l1).LJII;
        c20171113wD.getClass();
        C20171113wD.LIZ(c20170413w6, storySocialEventPrepareData);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C20171813wK((C20171713wJ) awS239S0300000_30.l1, c20170413w6, z, (Function0) awS239S0300000_30.l2, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS239S0300000_30 awS239S0300000_30, Object obj) {
        Object objH2;
        float f;
        float f2;
        Float fValueOf;
        Activity activityLIZLLL;
        Intent intentLJIJJ;
        Activity activityLIZLLL2;
        float fFloatValue = ((Number) obj).floatValue();
        CompletionBlock completionBlock = (CompletionBlock) awS239S0300000_30.l0;
        XBaseModel xBaseModelLIZLLL = C1549500qQO.LIZLLL(C13LE.LIZ(InterfaceC20278514Wh.class));
        C2389009Xs c2389009Xs = (C2389009Xs) awS239S0300000_30.l1;
        InterfaceC20278714Wj interfaceC20278714Wj = (InterfaceC20278714Wj) awS239S0300000_30.l2;
        InterfaceC20278514Wh interfaceC20278514Wh = (InterfaceC20278514Wh) xBaseModelLIZLLL;
        InterfaceC634840OvC interfaceC634840OvC = c2389009Xs.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (activityLIZLLL2 = interfaceC634840OvC.LIZLLL()) != null) {
            objH2 = C786410Ut5.H2(activityLIZLLL2, "activity");
        } else {
            objH2 = null;
        }
        ActivityManager activityManager = (ActivityManager) objH2;
        C20278814Wk c20278814Wk = new C20278814Wk();
        C2204961BRm.LJFF(activityManager, new ActivityManager.MemoryInfo(), new C0WZX("dzBzEgAjS8/YVFkiQFyXYrVA0GMFcp+4DKrYuhWXK228yTtigPjQsTl8iFe5fUO36w==", null));
        Boolean memoryAll = interfaceC20278714Wj.getMemoryAll();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(memoryAll, bool)) {
            f = r13.totalMem / 1048576.0f;
        } else {
            f = -2.0f;
        }
        c20278814Wk.LIZ = f;
        if (Intrinsics.LJFF(interfaceC20278714Wj.getMemoryRest(), bool)) {
            f2 = r13.availMem / 1048576.0f;
        } else {
            f2 = -2.0f;
        }
        c20278814Wk.LIZJ = f2;
        float intExtra = -1.0f;
        if (Intrinsics.LJFF(interfaceC20278714Wj.getMemoryUse(), bool)) {
            Debug.MemoryInfo[] processMemoryInfo = activityManager.getProcessMemoryInfo(new int[]{Process.myPid()});
            if (processMemoryInfo.length == 0) {
                c20278814Wk.LIZIZ = -1.0f;
            } else {
                Debug.MemoryInfo memoryInfo = processMemoryInfo[0];
                c20278814Wk.LIZIZ = (memoryInfo.dalvikPss + memoryInfo.nativePss) / 1024.0f;
            }
        } else {
            c20278814Wk.LIZIZ = -2.0f;
        }
        if (Intrinsics.LJFF(interfaceC20278714Wj.getMemoryLimit(), bool)) {
            c20278814Wk.LIZLLL = activityManager.getLargeMemoryClass();
        } else {
            c20278814Wk.LIZLLL = -2.0f;
        }
        interfaceC20278514Wh.setMemoryAll(Float.valueOf(c20278814Wk.LIZ));
        interfaceC20278514Wh.setMemoryUse(Float.valueOf(c20278814Wk.LIZIZ));
        interfaceC20278514Wh.setMemoryRest(Float.valueOf(c20278814Wk.LIZJ));
        interfaceC20278514Wh.setMemoryLimit(Float.valueOf(c20278814Wk.LIZLLL));
        interfaceC20278514Wh.setCpuUsage(Float.valueOf(fFloatValue));
        if (Intrinsics.LJFF(interfaceC20278714Wj.getTemperature(), bool)) {
            InterfaceC634840OvC interfaceC634840OvC2 = c2389009Xs.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null && (activityLIZLLL = interfaceC634840OvC2.LIZLLL()) != null && (intentLJIJJ = C786410Ut5.LJIJJ(activityLIZLLL, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) != null) {
                intExtra = intentLJIJJ.getIntExtra("temperature", 0) / 10.0f;
            }
            fValueOf = Float.valueOf(intExtra);
        } else {
            fValueOf = Float.valueOf(-2.0f);
        }
        interfaceC20278514Wh.setTemperature(fValueOf);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZLLL, "");
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS239S0300000_30 awS239S0300000_30, Object obj) {
        ((InterfaceC1911280zpu) obj).qf((View) awS239S0300000_30.l0, (Map) awS239S0300000_30.l1, awS239S0300000_30.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS239S0300000_30 awS239S0300000_30, Object obj) {
        C20131713pr c20131713prLIZJ;
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
        C20131713pr c20131713pr = navBackStackEntry.LLILLJJLI;
        if (!(c20131713pr instanceof C20131713pr) || c20131713pr == null || (c20131713prLIZJ = ((AbstractC20133313q7) awS239S0300000_30.l0).LIZJ(c20131713pr, navBackStackEntry.LLILLL, (C20133813qC) awS239S0300000_30.l1, (InterfaceC20133413q8) awS239S0300000_30.l2)) == null) {
            return null;
        }
        if (!Intrinsics.LJFF(c20131713prLIZJ, c20131713pr)) {
            return ((AbstractC20133313q7) awS239S0300000_30.l0).LIZIZ().LIZ(c20131713prLIZJ, c20131713prLIZJ.LJ(navBackStackEntry.LLILLL));
        }
        return navBackStackEntry;
    }

    public static final Object invoke$9(AwS239S0300000_30 awS239S0300000_30, Object obj) {
        C127I c127i = C127I.LIZ;
        PushSettings pushSettings = (PushSettings) awS239S0300000_30.l0;
        c127i.getClass();
        return C14XI.LIZ((C14XI) obj, false, false, false, false, false, false, null, null, false, null, null, C13LP.LJJLIIIJ(C127I.LIZIZ(pushSettings), ", ", null, null, 0, null, null, 62), new AwS275S0300000_31((Context) awS239S0300000_30.l1, (PushSettings) awS239S0300000_30.l0, (DisplayAndCaptionVM) awS239S0300000_30.l2, 33), 4095);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS239S0300000_30(C259800zU c259800zU, C20076613gy c20076613gy, C20078813hK c20078813hK, int i) {
        super(1);
        this.$t = i;
        this.l0 = c259800zU;
        this.l1 = c20076613gy;
        this.l2 = c20078813hK;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS239S0300000_30(C20042213bQ c20042213bQ, C20042013bO c20042013bO, Object obj, int i) {
        super(1);
        this.$t = i;
        this.l0 = c20042013bO;
        this.l1 = obj;
        this.l2 = c20042213bQ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS239S0300000_30(C20063313ep c20063313ep, C09AE c09ae, C112R c112r, int i) {
        super(1);
        this.$t = i;
        this.l0 = c20063313ep;
        this.l1 = c09ae;
        this.l2 = c112r;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS239S0300000_30(C20078813hK c20078813hK, C20076613gy c20076613gy, C013C c013c, int i) {
        super(1);
        this.$t = i;
        this.l0 = c20078813hK;
        this.l1 = c20076613gy;
        this.l2 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS239S0300000_30(C20084613iG c20084613iG, C20053713dH c20053713dH, C20084613iG c20084613iG2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c20084613iG;
        this.l1 = c20053713dH;
        this.l2 = c20084613iG2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS239S0300000_30(AbstractC20133313q7 abstractC20133313q7, AbstractC20133313q7<D> abstractC20133313q72, C20133813qC c20133813qC, InterfaceC20133413q8 interfaceC20133413q8) {
        super(1);
        this.$t = interfaceC20133413q8;
        this.l0 = abstractC20133313q7;
        this.l1 = abstractC20133313q72;
        this.l2 = c20133813qC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS239S0300000_30(C14UB c14ub, C14UB c14ub2, Activity activity, List<String> list) {
        super(1);
        this.$t = list;
        this.l0 = c14ub;
        this.l1 = c14ub2;
        this.l2 = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS239S0300000_30(C20274314Ur c20274314Ur, C20274314Ur c20274314Ur2, Activity activity, List<String> list) {
        super(1);
        this.$t = list;
        this.l0 = c20274314Ur;
        this.l1 = c20274314Ur2;
        this.l2 = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS239S0300000_30(Context context, Context context2, C05P0<Boolean> c05p0, C815520Vyw c815520Vyw) {
        super(1);
        this.$t = c815520Vyw;
        this.l0 = context;
        this.l1 = context2;
        this.l2 = c05p0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS239S0300000_30(Context context, PowerManager powerManager, C05P0 c05p0, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = c05p0;
        this.l2 = powerManager;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS239S0300000_30(Context context, PushSettings pushSettings, DisplayAndCaptionVM displayAndCaptionVM, int i) {
        super(1);
        this.$t = i;
        this.l0 = pushSettings;
        this.l1 = context;
        this.l2 = displayAndCaptionVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS239S0300000_30(View view, View view2, Map<String, ? extends Object> map, Object obj) {
        super(1);
        this.$t = obj;
        this.l0 = view;
        this.l1 = view2;
        this.l2 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS239S0300000_30(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, C20060013eI c20060013eI, Function1<? super FocusTargetNode, Boolean> function1) {
        super(1);
        this.$t = function1;
        this.l0 = focusTargetNode;
        this.l1 = focusTargetNode2;
        this.l2 = c20060013eI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS239S0300000_30(CompletionBlock completionBlock, CompletionBlock<InterfaceC20278514Wh> completionBlock2, C2389009Xs c2389009Xs, InterfaceC20278714Wj interfaceC20278714Wj) {
        super(1);
        this.$t = interfaceC20278714Wj;
        this.l0 = completionBlock;
        this.l1 = completionBlock2;
        this.l2 = c2389009Xs;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS239S0300000_30(Top1SurroundedImageListAssem top1SurroundedImageListAssem, Integer num, Integer num2, int i) {
        super(1);
        this.$t = i;
        this.l0 = num;
        this.l1 = num2;
        this.l2 = top1SurroundedImageListAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS239S0300000_30(PushItem pushItem, Integer num, Integer num2, int i) {
        super(1);
        this.$t = i;
        this.l0 = pushItem;
        this.l1 = num;
        this.l2 = num2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS239S0300000_30(List list, List<String> list2, EnumC20234414Fi enumC20234414Fi, Map<String, String> map) {
        super(1);
        this.$t = map;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = enumC20234414Fi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS239S0300000_30(Function1 function1, Function1<? super Boolean, Unit> function12, C20171713wJ c20171713wJ, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l0 = function1;
        this.l1 = function12;
        this.l2 = c20171713wJ;
    }
}
