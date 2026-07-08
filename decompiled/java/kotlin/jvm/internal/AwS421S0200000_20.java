package kotlin.jvm.internal;

import X.C09AY;
import X.C0IL2;
import X.C0PEM;
import X.C1101180elI;
import X.C1294160jmY;
import X.C1296850jqt;
import X.C1300340jwW;
import X.C1300840jxK;
import X.C1305040k46;
import X.C1306250k63;
import X.C1306400k6I;
import X.C1307560k8A;
import X.C1307660k8K;
import X.C1321070kTx;
import X.C1321080kTy;
import X.C1321120kU2;
import X.C1321420kUW;
import X.C1325860kbg;
import X.C1325890kbj;
import X.C1325970kbr;
import X.C1326020kbw;
import X.C1326080kc2;
import X.C1326090kc3;
import X.C1334070kov;
import X.C1337710kun;
import X.C1338450kvz;
import X.C1338670kwL;
import X.C1344030l4z;
import X.C1345600l7W;
import X.C13LP;
import X.C1547320qMs;
import X.C1697810uHb;
import X.C19YK;
import X.C2097608Jq;
import X.C21323718cd;
import X.C21325918cz;
import X.C2188811AlT;
import X.C2190781Aoe;
import X.C2191171ApH;
import X.C2296808zG;
import X.C23250099c;
import X.C476230Ilx;
import X.C786410Ut5;
import X.C794320VDy;
import X.EnumC1325870kbh;
import X.InterfaceC1326110kc5;
import X.InterfaceC1547330qMt;
import X.ViewOnLayoutChangeListenerC1322990kX3;
import android.content.Context;
import android.graphics.Canvas;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.performance.PerformanceManagerImpl;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.starship.engine.graph.config.GraphConfig;
import com.bytedance.android.starship.engine.graph.foundation.Task;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ecommerce.image.resource.EcOperationResourceData;
import com.ss.android.ugc.aweme.ecommerce.image.resource.EcResourceItem;
import com.ss.android.ugc.aweme.image.exp.LsResourcePreloadItemModel;
import com.ss.android.ugc.aweme.live.alphaplayer.Configuration;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class AwS421S0200000_20 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS421S0200000_20 awS421S0200000_20) {
        StringBuilder sb = new StringBuilder("name:");
        sb.append(((C1306250k63) awS421S0200000_20.l0).LIZIZ);
        sb.append(" update diff >>> ");
        Map map = (Map) awS421S0200000_20.l1;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(((Map.Entry) it2.next()).getKey());
        }
        sb.append(C13LP.LLIIII(arrayList));
        return sb.toString();
    }

    public static final Object invoke$1(AwS421S0200000_20 awS421S0200000_20) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerStrategyCallback callback:");
        sbLIZ.append(((C1306400k6I) awS421S0200000_20.l0).LIZ);
        sbLIZ.append(", result:");
        sbLIZ.append((Task.Output) awS421S0200000_20.l1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:51|(2:253|52)|(11:255|53|54|231|55|239|58|(2:261|61)|247|64|(1:66))|226|169|172) */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0368, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0369, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0358 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03ca A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0364 A[EXC_TOP_SPLITTER, PHI: r9
      0x0364: PHI (r9v10 android.media.MediaMuxer) = 
      (r9v7 android.media.MediaMuxer)
      (r9v9 android.media.MediaMuxer)
      (r9v19 android.media.MediaMuxer)
      (r9v19 android.media.MediaMuxer)
      (r9v19 android.media.MediaMuxer)
     binds: [B:168:0x0362, B:139:0x02f7, B:68:0x01ce, B:65:0x01c6, B:66:0x01c8] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x034a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0336 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0340 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x015a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0182 A[Catch: Exception -> 0x026e, InterruptedException -> 0x0270, all -> 0x038f, TRY_ENTER, TryCatch #0 {Exception -> 0x026e, blocks: (B:37:0x012c, B:49:0x0182, B:51:0x018a), top: B:212:0x012c }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018a A[Catch: Exception -> 0x026e, InterruptedException -> 0x0270, all -> 0x038f, TRY_LEAVE, TryCatch #0 {Exception -> 0x026e, blocks: (B:37:0x012c, B:49:0x0182, B:51:0x018a), top: B:212:0x012c }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d9 A[Catch: Exception -> 0x0269, InterruptedException -> 0x026b, all -> 0x038f, TRY_ENTER, TRY_LEAVE, TryCatch #39 {all -> 0x038f, blocks: (B:36:0x012a, B:37:0x012c, B:39:0x015a, B:40:0x016f, B:42:0x0175, B:49:0x0182, B:51:0x018a, B:52:0x018e, B:53:0x0196, B:54:0x019b, B:73:0x01d9), top: B:256:0x012a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$10(kotlin.jvm.internal.AwS421S0200000_20 r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS421S0200000_20.invoke$10(kotlin.jvm.internal.AwS421S0200000_20):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$11(AwS421S0200000_20 awS421S0200000_20) {
        String strJ3 = null;
        if (((InterfaceC1547330qMt) awS421S0200000_20.l0) instanceof C1547320qMs) {
            try {
                strJ3 = C786410Ut5.J3(new JSONObject(((C1547320qMs) ((InterfaceC1547330qMt) awS421S0200000_20.l0)).getData()));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1325860kbg.LIZIZ(th, AFwS208S0000000_20.get$arr$(86), C2097608Jq.LJ());
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C21323718cd.LIZ(linkedHashMap));
        if (strJ3 != null) {
            linkedHashMap.put("extra_params", strJ3);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("empty action type in template name:");
        sbLIZ.append(((C21325918cz) awS421S0200000_20.l1).LJIIJJI());
        new C1338670kwL(EnumC1325870kbh.ACTION_ERROR, 4002, C2188811AlT.LIZIZ(sbLIZ), null, 24).LIZJ(linkedHashMap);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS421S0200000_20 awS421S0200000_20) {
        List listLJIILJJIL;
        Object obj;
        Object next;
        C1345600l7W c1345600l7W = (C1345600l7W) awS421S0200000_20.l0;
        View view = (View) awS421S0200000_20.l1;
        int[] iArr = {R.id.y4z, R.id.yir, R.id.yin, R.id.e_n, R.id.vct, R.id.khh, R.id.edh, R.id.bn2};
        c1345600l7W.getClass();
        char c = 0;
        if (view != null) {
            int i = 0;
            do {
                View viewFindViewById = view.findViewById(iArr[i]);
                if (viewFindViewById != null) {
                    viewFindViewById.setImportantForAccessibility(1);
                }
                i++;
            } while (i < 8);
        }
        C1345600l7W c1345600l7W2 = (C1345600l7W) awS421S0200000_20.l0;
        View view2 = (View) awS421S0200000_20.l1;
        int[] iArr2 = {R.id.ecg, R.id.udx, R.id.ecj, R.id.vcu};
        c1345600l7W2.getClass();
        if (view2 != null) {
            int i2 = 0;
            do {
                View viewFindViewById2 = view2.findViewById(iArr2[i2]);
                if (viewFindViewById2 != null) {
                    viewFindViewById2.setImportantForAccessibility(2);
                }
                i2++;
            } while (i2 < 4);
        }
        C1345600l7W c1345600l7W3 = (C1345600l7W) awS421S0200000_20.l0;
        View view3 = (View) awS421S0200000_20.l1;
        c1345600l7W3.getClass();
        int[] iArr3 = {R.id.g8_, R.id.es2, R.id.eci, R.id.eeb, R.id.ki3, R.id.e_n, R.id.vcu, R.id.wya, R.id.ecj};
        ArrayList<ViewGroup> arrayList = new ArrayList();
        int i3 = 0;
        do {
            int i4 = iArr3[i3];
            ViewGroup viewGroup = (ViewGroup) view3.findViewById(i4);
            if (viewGroup != null && (R.id.wya != i4 || !(viewGroup instanceof C19YK) || ((C19YK) viewGroup).getTabCount() > 1)) {
                arrayList.add(viewGroup);
            }
            i3++;
        } while (i3 < 9);
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            boolean z = false;
            for (ViewGroup viewGroup2 : arrayList) {
                ArrayList<View> arrayList3 = new ArrayList<>();
                ((ViewGroup) viewGroup2.getParent()).addChildrenForAccessibility(arrayList3);
                if (arrayList3.contains(viewGroup2)) {
                    View[] viewArr = new View[1];
                    viewArr[c] = viewGroup2;
                    listLJIILJJIL = C1697810uHb.LJIILJJIL(viewArr);
                } else {
                    ArrayList<View> arrayList4 = new ArrayList<>();
                    viewGroup2.addChildrenForAccessibility(arrayList4);
                    listLJIILJJIL = arrayList4;
                }
                Iterator it2 = listLJIILJJIL.iterator();
                while (true) {
                    obj = null;
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (((View) next).getVisibility() == 0) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                View view4 = (View) next;
                ListIterator listIterator = listLJIILJJIL.listIterator(listLJIILJJIL.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    Object objPrevious = listIterator.previous();
                    if (((View) objPrevious).getVisibility() == 0) {
                        obj = objPrevious;
                        break;
                    }
                }
                View view5 = (View) obj;
                if (view4 != null && view5 != null) {
                    if (view4.getId() == -1) {
                        view4.setId(View.generateViewId());
                    }
                    if (view5.getId() == -1) {
                        view5.setId(View.generateViewId());
                    }
                    if (!z) {
                        view4.sendAccessibilityEvent(32768);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("setupViewListAccessibilityTraversalOrder startView.sendAccessibilityEvent:");
                        sbLIZ.append(view4.getImportantForAccessibility());
                        sbLIZ.append(" => ");
                        sbLIZ.append(view4);
                        sbLIZ.append(" in ");
                        sbLIZ.append(viewGroup2);
                        C1344030l4z.LIZJ("CustomAction", C2188811AlT.LIZIZ(sbLIZ));
                        z = true;
                    }
                    arrayList2.add(new Pair(view4, view5));
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("setupViewListAccessibilityTraversalOrder startView:");
                    sbLIZ2.append(view4.getImportantForAccessibility());
                    sbLIZ2.append(" => ");
                    sbLIZ2.append(view4);
                    sbLIZ2.append(" endView:");
                    sbLIZ2.append(view5.getImportantForAccessibility());
                    sbLIZ2.append(" => ");
                    sbLIZ2.append(view5);
                    sbLIZ2.append(" in ");
                    sbLIZ2.append(viewGroup2);
                    C1344030l4z.LIZJ("CustomAction", C2188811AlT.LIZIZ(sbLIZ2));
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("setupViewListAccessibilityTraversalOrder null startView:");
                    sbLIZ3.append(view4);
                    sbLIZ3.append(" endView:");
                    sbLIZ3.append(view5);
                    sbLIZ3.append(" in ");
                    sbLIZ3.append(viewGroup2);
                    C1344030l4z.LIZJ("CustomAction", C2188811AlT.LIZIZ(sbLIZ3));
                }
                c = 0;
            }
            if (arrayList2.size() < 2) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("setupViewListAccessibilityTraversalOrder focusableGroups.size(");
                sbLIZ4.append(arrayList2.size());
                sbLIZ4.append(") < 2 ");
                C1344030l4z.LIZJ("CustomAction", C2188811AlT.LIZIZ(sbLIZ4));
            } else {
                int size = arrayList2.size() - 1;
                int i5 = 0;
                while (i5 < size) {
                    View view6 = (View) ((Pair) ListProtector.get(arrayList2, i5)).getSecond();
                    i5++;
                    View view7 = (View) ((Pair) ListProtector.get(arrayList2, i5)).getFirst();
                    if (view6.getId() != -1 && view7.getId() != -1) {
                        view7.setAccessibilityTraversalAfter(view6.getId());
                        view6.setAccessibilityTraversalBefore(view7.getId());
                        view6.setImportantForAccessibility(1);
                        view7.setImportantForAccessibility(1);
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("Linked: ");
                        sbLIZ5.append(view6);
                        sbLIZ5.append(" -> ");
                        sbLIZ5.append(view7);
                        C1344030l4z.LIZJ("CustomAction", C2188811AlT.LIZIZ(sbLIZ5));
                    } else {
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("Linked Skipped: ");
                        sbLIZ6.append(view6);
                        sbLIZ6.append(" -> ");
                        sbLIZ6.append(view7);
                        C1344030l4z.LIZJ("CustomAction", C2188811AlT.LIZIZ(sbLIZ6));
                    }
                }
            }
        }
        view3.sendAccessibilityEvent(SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS421S0200000_20 awS421S0200000_20) {
        ((C1321080kTy) awS421S0200000_20.l0).LIZJ((Canvas) awS421S0200000_20.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS421S0200000_20 awS421S0200000_20) {
        Configuration configuration = new Configuration();
        configuration.setContext((Context) awS421S0200000_20.l0);
        configuration.setLifecycleOwner(ViewTreeLifecycleOwner.get((C1294160jmY) awS421S0200000_20.l1));
        configuration.setAlphaVideoViewType(1);
        return configuration;
    }

    public static final Object invoke$15(AwS421S0200000_20 awS421S0200000_20) {
        if (((C1321420kUW) awS421S0200000_20.l0).LJLLLLLL() == 0 && ((C1321420kUW) awS421S0200000_20.l0).LJLLLL() == 0) {
            C1321070kTx c1321070kTx = ((C1321420kUW) awS421S0200000_20.l0).LLZZJLIL;
            Canvas canvas = (Canvas) awS421S0200000_20.l1;
            c1321070kTx.LLJILJILJ = false;
            C1321120kU2 c1321120kU2LJ = c1321070kTx.LJ();
            if (c1321120kU2LJ != null) {
                c1321120kU2LJ.draw(canvas);
            }
        } else {
            int saveCount = ((Canvas) awS421S0200000_20.l1).getSaveCount();
            ((Canvas) awS421S0200000_20.l1).save();
            ((Canvas) awS421S0200000_20.l1).translate(((C1321420kUW) awS421S0200000_20.l0).LJLLLL(), ((C1321420kUW) awS421S0200000_20.l0).LJLLLLLL());
            C1321070kTx c1321070kTx2 = ((C1321420kUW) awS421S0200000_20.l0).LLZZJLIL;
            Canvas canvas2 = (Canvas) awS421S0200000_20.l1;
            c1321070kTx2.LLJILJILJ = false;
            C1321120kU2 c1321120kU2LJ2 = c1321070kTx2.LJ();
            if (c1321120kU2LJ2 != null) {
                c1321120kU2LJ2.draw(canvas2);
            }
            ((Canvas) awS421S0200000_20.l1).restoreToCount(saveCount);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AwS421S0200000_20 awS421S0200000_20) {
        super/*android.view.ViewGroup*/.dispatchDraw((Canvas) awS421S0200000_20.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS421S0200000_20 awS421S0200000_20) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((C2191171ApH) awS421S0200000_20.l0);
        sbLIZ.append(" start to pack history ");
        sbLIZ.append(((List) awS421S0200000_20.l1).size());
        sbLIZ.append(" launch event on ui thread with locked...");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$18(AwS421S0200000_20 awS421S0200000_20) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((C2191171ApH) awS421S0200000_20.l0);
        sbLIZ.append(" start to pack history ");
        sbLIZ.append(((List) awS421S0200000_20.l1).size());
        sbLIZ.append(" terminate event on ui thread with locked...");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(AwS421S0200000_20 awS421S0200000_20) {
        Float fValueOf;
        Pair[] pairArr = new Pair[7];
        pairArr[0] = new Pair("room_id", String.valueOf(((PerformanceManagerImpl) awS421S0200000_20.l0).LLJLILLLLZIIL));
        pairArr[1] = new Pair("anchor_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        pairArr[2] = new Pair("go_live_session_id", C0IL2.LIZ.LJ);
        pairArr[3] = new Pair("thermal_value", String.valueOf(C476230Ilx.LIZ.LJFF));
        pairArr[4] = new Pair("thermal_level", String.valueOf(C1300340jwW.LIZJ()));
        C1101180elI c1101180elI = (C1101180elI) awS421S0200000_20.l1;
        if (c1101180elI != null) {
            fValueOf = Float.valueOf(c1101180elI.LIZIZ);
        } else {
            fValueOf = null;
        }
        pairArr[5] = new Pair("realtime_performance_score", String.valueOf(fValueOf));
        pairArr[6] = new Pair("start_battery", String.valueOf(((PerformanceManagerImpl) awS421S0200000_20.l0).LLLLJ));
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.0kcD] */
    public static final Object invoke$3(AwS421S0200000_20 awS421S0200000_20) {
        ((C1326020kbw) awS421S0200000_20.l0).getClass();
        EcOperationResourceData ecOperationResourceData = C1325970kbr.LIZ;
        ((C1326020kbw) awS421S0200000_20.l0).LIZLLL(1, 0, 0, null);
        ?? r5 = new InterfaceC1326110kc5() { // from class: X.0kcD
            public final Keva LIZ = Keva.getRepo("ecom_operation_resource_cache");

            @Override // X.InterfaceC1326110kc5
            public final boolean LIZ() {
                return this.LIZ.getBoolean("resource_complete", false);
            }

            @Override // X.InterfaceC1326110kc5
            public final void LIZJ() {
                this.LIZ.storeBoolean("resource_complete", false);
            }

            @Override // X.InterfaceC1326110kc5
            public final void LJ() {
                this.LIZ.storeBoolean("resource_complete", true);
            }

            @Override // X.InterfaceC1326110kc5
            public final long LJFF() {
                return this.LIZ.getLong("last_request_time", 0L);
            }

            @Override // X.InterfaceC1326110kc5
            public final List<EcResourceItem> getData() {
                String string = this.LIZ.getString("resource_data", null);
                if (string == null) {
                    return null;
                }
                try {
                    return (List) C1280004ze.LIZIZ(string, new TypeToken<List<? extends EcResourceItem>>() { // from class: X.0kcC
                    }.getType());
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            }

            @Override // X.InterfaceC1326110kc5
            public final void LIZIZ(List<EcResourceItem> list) {
                this.LIZ.storeString("resource_data", C1280004ze.LIZLLL(list));
            }

            @Override // X.InterfaceC1326110kc5
            public final void LIZLLL(long j) {
                this.LIZ.storeLong("last_request_time", j);
            }
        };
        C1334070kov c1334070kov = new C1334070kov((C1326020kbw) awS421S0200000_20.l0);
        C1326020kbw c1326020kbw = (C1326020kbw) awS421S0200000_20.l0;
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1326080kc2(new C1326090kc3(r5, c1334070kov, new C1325890kbj(c1326020kbw), c1326020kbw, (EcOperationResourceData) awS421S0200000_20.l1), null), 3);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS421S0200000_20 awS421S0200000_20) {
        C786410Ut5.LJJIFFI((Context) awS421S0200000_20.l0, (C1296850jqt) awS421S0200000_20.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS421S0200000_20 awS421S0200000_20) {
        try {
            ((Function0) awS421S0200000_20.l0).invoke();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((C1337710kun) awS421S0200000_20.l1).cancel();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS421S0200000_20 awS421S0200000_20) {
        AtomicBoolean atomicBoolean = C794320VDy.LIZ;
        return C1300840jxK.LIZIZ((TelephonyManager) awS421S0200000_20.l0, (Cert) awS421S0200000_20.l1);
    }

    public static final Object invoke$7(AwS421S0200000_20 awS421S0200000_20) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hit path = ");
        sbLIZ.append(((LsResourcePreloadItemModel) awS421S0200000_20.l0).path);
        sbLIZ.append(", preload images num = ");
        sbLIZ.append(((List) awS421S0200000_20.l1).size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$8(AwS421S0200000_20 awS421S0200000_20) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("run ttm ");
        sbLIZ.append(((C1307560k8A) awS421S0200000_20.l0).LIZIZ.name);
        sbLIZ.append(" error: ");
        sbLIZ.append(((C1307660k8K) awS421S0200000_20.l1).LIZIZ);
        sbLIZ.append(", ");
        sbLIZ.append(((C1307660k8K) awS421S0200000_20.l1).LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$9(AwS421S0200000_20 awS421S0200000_20) {
        ((ViewOnLayoutChangeListenerC1322990kX3) awS421S0200000_20.l0).LJIIIZ((Canvas) awS421S0200000_20.l1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS421S0200000_20(C1305040k46 c1305040k46, C1337710kun c1337710kun, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1305040k46;
        this.l1 = c1337710kun;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS421S0200000_20(C1306250k63 c1306250k63, C1306250k63 c1306250k632, Map<String, GraphConfig> map) {
        super(0);
        this.$t = map;
        this.l0 = c1306250k63;
        this.l1 = c1306250k632;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS421S0200000_20(C1306400k6I c1306400k6I, Task.Output output, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1306400k6I;
        this.l1 = output;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS421S0200000_20(C1307560k8A c1307560k8A, C1307660k8K c1307660k8K, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1307560k8A;
        this.l1 = c1307660k8K;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS421S0200000_20(C1321080kTy c1321080kTy, Canvas canvas, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1321080kTy;
        this.l1 = canvas;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS421S0200000_20(C1321420kUW c1321420kUW, Canvas canvas, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1321420kUW;
        this.l1 = canvas;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS421S0200000_20(ViewOnLayoutChangeListenerC1322990kX3 viewOnLayoutChangeListenerC1322990kX3, Canvas canvas, int i) {
        super(0);
        this.$t = i;
        this.l0 = viewOnLayoutChangeListenerC1322990kX3;
        this.l1 = canvas;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS421S0200000_20(C1326020kbw c1326020kbw, EcOperationResourceData ecOperationResourceData, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1326020kbw;
        this.l1 = ecOperationResourceData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS421S0200000_20(C1338450kvz c1338450kvz, Canvas canvas, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1338450kvz;
        this.l1 = canvas;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS421S0200000_20(C1345600l7W c1345600l7W, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1345600l7W;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS421S0200000_20(InterfaceC1547330qMt interfaceC1547330qMt, C21325918cz c21325918cz, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC1547330qMt;
        this.l1 = c21325918cz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS421S0200000_20(C2191171ApH c2191171ApH, C2191171ApH c2191171ApH2, List<C2190781Aoe> list) {
        super(0);
        this.$t = list;
        this.l0 = c2191171ApH;
        this.l1 = c2191171ApH2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS421S0200000_20(Context context, C1294160jmY c1294160jmY, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = c1294160jmY;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS421S0200000_20(Context context, C1296850jqt c1296850jqt, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = c1296850jqt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS421S0200000_20(TelephonyManager telephonyManager, Cert cert, int i) {
        super(0);
        this.$t = i;
        this.l0 = telephonyManager;
        this.l1 = cert;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS421S0200000_20(PerformanceManagerImpl performanceManagerImpl, C1101180elI c1101180elI, int i) {
        super(0);
        this.$t = i;
        this.l0 = performanceManagerImpl;
        this.l1 = c1101180elI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS421S0200000_20(LsResourcePreloadItemModel lsResourcePreloadItemModel, LsResourcePreloadItemModel lsResourcePreloadItemModel2, List<String> list) {
        super(0);
        this.$t = list;
        this.l0 = lsResourcePreloadItemModel;
        this.l1 = lsResourcePreloadItemModel2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS421S0200000_20(File file, File file2, int i) {
        super(0);
        this.$t = i;
        this.l0 = file;
        this.l1 = file2;
    }
}
