package kotlin.jvm.internal;

import X.AnonymousClass0957;
import X.C013C;
import X.C05YI;
import X.C087I;
import X.C08LC;
import X.C098200Yq;
import X.C099G;
import X.C09AY;
import X.C09XA;
import X.C0LCN;
import X.C0PEM;
import X.C0VSJ;
import X.C1065320dpS;
import X.C118300cf;
import X.C12FJ;
import X.C1439160nYQ;
import X.C15438062q;
import X.C1613680s5u;
import X.C189200o6;
import X.C1922307fx;
import X.C1924607gK;
import X.C1DFH;
import X.C2019407vc;
import X.C201955140j;
import X.C2097908Jt;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C23271099x;
import X.C2428709fR;
import X.C2442109hb;
import X.C2443309hn;
import X.C2475009mu;
import X.C2492609pk;
import X.C2501809rE;
import X.C291001Au;
import X.C443120HZe;
import X.C817503Hh;
import X.InterfaceC1680560tpm;
import X.InterfaceC1921807fs;
import X.InterfaceC2032907xn;
import X.InterfaceC343480DdK;
import X.InterfaceC665370Q7z;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.hybrid.spark.roma.expr.ConditionModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import com.ss.android.ugc.aweme.tako.botpage.components.disclaimer.config.PlaceholderInfoModel;
import com.ss.android.ugc.aweme.tako.botpage.components.disclaimer.ui.TakoDisclaimerWithTosFragment;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.tts.oecverify.BdTuring;
import defpackage.c3;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public class AwS212S0300000_3 extends C09AY implements Function1 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS212S0300000_3 awS212S0300000_3, Object obj) {
        Function1 function1;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (((AtomicInteger) awS212S0300000_3.l0).addAndGet(1) == ((Map) awS212S0300000_3.l1).size() && (function1 = (Function1) awS212S0300000_3.l2) != null) {
            function1.invoke(Boolean.valueOf(zBooleanValue));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS212S0300000_3 awS212S0300000_3, Object obj) {
        Function1 function1;
        if (((AtomicInteger) awS212S0300000_3.l0).addAndGet(1) == ((Map) awS212S0300000_3.l1).size() && (function1 = (Function1) awS212S0300000_3.l2) != null) {
            function1.invoke(obj);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS212S0300000_3 awS212S0300000_3, Object obj) throws Throwable {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            ((Function1) awS212S0300000_3.l0).invoke(Boolean.FALSE);
        } else {
            C0VSJ c0vsj = new C0VSJ(((C2492609pk) awS212S0300000_3.l1).LIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c0vsj.getParentFile().getName());
            sbLIZ.append('_');
            sbLIZ.append(c0vsj.getName());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C2428709fR c2428709fR = (C2428709fR) ((C1439160nYQ) awS212S0300000_3.l2).LIZLLL.getValue();
            c2428709fR.getClass();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c2428709fR.LIZ);
            sbLIZ2.append(File.separator);
            sbLIZ2.append(strLIZIZ);
            C0VSJ c0vsj2 = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2));
            boolean zLJFF = C2475009mu.LJFF(100, Bitmap.CompressFormat.PNG, bitmap, c0vsj2);
            if (((C2492609pk) awS212S0300000_3.l1).LIZLLL) {
                C23250099c.LJ(C23271099x.INSTANCE, new C05YI(c0vsj2, null));
            }
            C2475009mu.LJ(bitmap);
            if (zLJFF) {
                C1065320dpS c1065320dpS = C1065320dpS.LIZ;
                Context context = ((C1439160nYQ) awS212S0300000_3.l2).LIZ;
                String path = c0vsj2.getPath();
                c1065320dpS.getClass();
                C1065320dpS.LIZ(context, path);
            }
            ((Function1) awS212S0300000_3.l0).invoke(Boolean.valueOf(zLJFF));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS212S0300000_3 awS212S0300000_3, Object obj) {
        Context context = ((View) awS212S0300000_3.l0).getContext();
        View view = (View) awS212S0300000_3.l0;
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) awS212S0300000_3.l1;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C12FJ(interfaceC665370Q7z, view, context, (Bitmap) obj, null), 3);
        TakoMultipleSelectVM takoMultipleSelectVM = (TakoMultipleSelectVM) awS212S0300000_3.l2;
        if (takoMultipleSelectVM != null) {
            takoMultipleSelectVM.AQ2();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS212S0300000_3 awS212S0300000_3, Object obj) {
        Function1 function1;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (((AtomicInteger) awS212S0300000_3.l0).addAndGet(1) == ((Map) awS212S0300000_3.l1).size() && (function1 = (Function1) awS212S0300000_3.l2) != null) {
            function1.invoke(Boolean.valueOf(zBooleanValue));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS212S0300000_3 awS212S0300000_3, Object obj) {
        char cCharValue = ((Character) obj).charValue();
        C013C c013c = (C013C) awS212S0300000_3.l0;
        boolean z = false;
        if (c013c.element) {
            c013c.element = false;
            ((StringBuilder) awS212S0300000_3.l1).append(cCharValue);
        } else if (cCharValue == '\\') {
            c013c.element = true;
        } else {
            if (cCharValue == '\'') {
                ((C118300cf) awS212S0300000_3.l2).element++;
                return Boolean.valueOf(z);
            }
            ((StringBuilder) awS212S0300000_3.l1).append(cCharValue);
        }
        z = true;
        return Boolean.valueOf(z);
    }

    public static final Object invoke$14(AwS212S0300000_3 awS212S0300000_3, Object obj) {
        ((c3) awS212S0300000_3.l0).LLILZ.remove(awS212S0300000_3.l1, (AnonymousClass0957) awS212S0300000_3.l2);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS212S0300000_3 r3, java.lang.Object r4) {
        /*
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r0 = r3.l0
            com.ss.android.ugc.aweme.tako.botpage.components.disclaimer.ui.TakoDisclaimerWithTosFragment r0 = (com.ss.android.ugc.aweme.tako.botpage.components.disclaimer.ui.TakoDisclaimerWithTosFragment) r0
            java.lang.Object r2 = r3.l1
            com.ss.android.ugc.aweme.tako.botpage.components.disclaimer.config.PlaceholderInfoModel r2 = (com.ss.android.ugc.aweme.tako.botpage.components.disclaimer.config.PlaceholderInfoModel) r2
            java.lang.Object r1 = r3.l2
            java.util.Map r1 = (java.util.Map) r1
            r0.getClass()
            if (r1 == 0) goto L4d
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L4d
            java.lang.String r0 = r2.url
            if (r0 == 0) goto L51
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            if (r0 == 0) goto L51
            android.net.Uri$Builder r3 = r0.buildUpon()
            if (r3 == 0) goto L51
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L31:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L54
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r3.appendQueryParameter(r1, r0)
            goto L31
        L4d:
            java.lang.String r2 = r2.url
            if (r2 != 0) goto L60
        L51:
            java.lang.String r2 = ""
            goto L60
        L54:
            android.net.Uri r0 = r3.build()
            if (r0 == 0) goto L51
            java.lang.String r2 = r0.toString()
            if (r2 == 0) goto L51
        L60:
            java.lang.String r0 = "aweme://webview/"
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            android.net.Uri$Builder r1 = r0.buildUpon()
            java.lang.String r0 = "url"
            android.net.Uri$Builder r0 = r1.appendQueryParameter(r0, r2)
            android.net.Uri r0 = r0.build()
            java.lang.String r0 = r0.toString()
            com.bytedance.router.SmartRoute r0 = com.bytedance.router.SmartRouter.buildRoute(r4, r0)
            r0.open()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS212S0300000_3.invoke$2(kotlin.jvm.internal.AwS212S0300000_3, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(AwS212S0300000_3 awS212S0300000_3, Object obj) {
        final Function0 function0 = (Function0) awS212S0300000_3.l1;
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterAssemComposeKt$JsEventEffects$1$1$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (C2019407vc.LIZ[event.ordinal()] == 1) {
                    function0.invoke();
                }
            }
        };
        ((LifecycleOwner) awS212S0300000_3.l0).getLifecycle().addObserver(lifecycleEventObserver);
        final LifecycleOwner lifecycleOwner = (LifecycleOwner) awS212S0300000_3.l0;
        final Function0 function02 = (Function0) awS212S0300000_3.l2;
        return new InterfaceC1680560tpm() { // from class: X.08C4
            @Override // X.InterfaceC1680560tpm
            public final void dispose() {
                lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
                function02.invoke();
            }
        };
    }

    public static final Object invoke$4(AwS212S0300000_3 awS212S0300000_3, Object obj) {
        String str = (String) obj;
        Object c098200Yq = ((Map) awS212S0300000_3.l0).get(str);
        if (c098200Yq == null) {
            C1924607gK c1924607gK = C1924607gK.LIZ;
            Map map = (Map) awS212S0300000_3.l1;
            Map map2 = (Map) awS212S0300000_3.l2;
            try {
                c1924607gK.getClass();
                c098200Yq = C1924607gK.LIZIZ(str, map, map2);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C1922307fx c1922307fx = C1922307fx.LIZ;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = c1922307fx;
            }
            ((Map) awS212S0300000_3.l0).put(str, c098200Yq);
        }
        return c098200Yq;
    }

    public static final Object invoke$5(AwS212S0300000_3 awS212S0300000_3, Object obj) {
        C2443309hn c2443309hn = (C2443309hn) obj;
        String original_effect_id = ((Effect) awS212S0300000_3.l0).getOriginal_effect_id();
        if (original_effect_id == null) {
            original_effect_id = "";
        }
        C08LC c08lc = new C08LC(original_effect_id, (File) awS212S0300000_3.l1, (Effect) awS212S0300000_3.l0, (Long) awS212S0300000_3.l2);
        C291001Au<InterfaceC343480DdK> c291001Au = c2443309hn.LLILLJJLI;
        c2443309hn.getClass();
        return new C2443309hn(c08lc, c291001Au);
    }

    public static final Object invoke$6(AwS212S0300000_3 awS212S0300000_3, Object obj) {
        final Function0 function0 = (Function0) awS212S0300000_3.l1;
        final Function0 function02 = (Function0) awS212S0300000_3.l2;
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewAssemKt$OnLifecycleEffect$1$1$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_RESUME) {
                    function0.invoke();
                } else {
                    if (event != Lifecycle.Event.ON_PAUSE) {
                        return;
                    }
                    function02.invoke();
                }
            }
        };
        ((LifecycleOwner) awS212S0300000_3.l0).getLifecycle().addObserver(lifecycleEventObserver);
        return new C2501809rE((LifecycleOwner) awS212S0300000_3.l0, lifecycleEventObserver, 5);
    }

    public static final Object invoke$7(AwS212S0300000_3 awS212S0300000_3, Object obj) {
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C09XA((Activity) awS212S0300000_3.l0, (AwemeDraft) awS212S0300000_3.l1, (VideoPublishEditModel) obj, (C0LCN) awS212S0300000_3.l2, null), 2);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS212S0300000_3 awS212S0300000_3, Object obj) {
        return C2442109hb.LIZ((C2442109hb) obj, null, new C1613680s5u(((C118300cf) awS212S0300000_3.l0).element, ((C118300cf) awS212S0300000_3.l1).element, ((C013C) awS212S0300000_3.l2).element), 1);
    }

    public static final Object invoke$9(AwS212S0300000_3 awS212S0300000_3, Object obj) {
        String unzipPath;
        List<Effect> list = (List) obj;
        C201955140j.LIZIZ("JEFF", "Effects downloaded");
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
        int i = 16;
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (Effect effect : list) {
            linkedHashMap.put(effect.getEffectId(), effect);
        }
        List list2 = (List) awS212S0300000_3.l0;
        Map map = (Map) awS212S0300000_3.l2;
        int iLIZIZ2 = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list2, 10));
        if (iLIZIZ2 >= 16) {
            i = iLIZIZ2;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
        for (Object obj2 : list2) {
            Effect effect2 = (Effect) linkedHashMap.get(map.get(obj2));
            if (effect2 != null) {
                unzipPath = effect2.getUnzipPath();
            } else {
                unzipPath = null;
            }
            linkedHashMap2.put(obj2, unzipPath);
        }
        String json = GsonProtectorUtils.toJson(new Gson(), linkedHashMap2);
        json.toString();
        InterfaceC2032907xn interfaceC2032907xn = ((C087I) awS212S0300000_3.l1).LLILLJJLI;
        C443120HZe<Integer, Long, Long> c443120HZe = C087I.LLIZLLLIL;
        interfaceC2032907xn.LIZ(c443120HZe.getFirst().intValue(), c443120HZe.getSecond().longValue(), c443120HZe.getThird().longValue(), json);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS212S0300000_3(C118300cf c118300cf, C118300cf c118300cf2, C013C c013c, int i) {
        super(1);
        this.$t = i;
        this.l0 = c118300cf;
        this.l1 = c118300cf2;
        this.l2 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS212S0300000_3(C013C c013c, StringBuilder sb, C118300cf c118300cf, int i) {
        super(1);
        this.$t = i;
        this.l0 = c013c;
        this.l1 = sb;
        this.l2 = c118300cf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS212S0300000_3(Activity activity, AwemeDraft awemeDraft, C0LCN c0lcn, int i) {
        super(1);
        this.$t = i;
        this.l0 = activity;
        this.l1 = awemeDraft;
        this.l2 = c0lcn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS212S0300000_3(View view, InterfaceC665370Q7z interfaceC665370Q7z, TakoMultipleSelectVM takoMultipleSelectVM, int i) {
        super(1);
        this.$t = i;
        this.l0 = view;
        this.l1 = interfaceC665370Q7z;
        this.l2 = takoMultipleSelectVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS212S0300000_3(LifecycleOwner lifecycleOwner, LifecycleOwner lifecycleOwner2, Function0<Unit> function0, Function0<Unit> function02) {
        super(1);
        this.$t = function02;
        this.l0 = lifecycleOwner;
        this.l1 = lifecycleOwner2;
        this.l2 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS212S0300000_3(c3 c3Var, Object obj, C099G c099g, int i) {
        super(1);
        this.$t = i;
        this.l0 = c3Var;
        this.l1 = obj;
        this.l2 = c099g;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS212S0300000_3(TakoDisclaimerWithTosFragment takoDisclaimerWithTosFragment, TakoDisclaimerWithTosFragment takoDisclaimerWithTosFragment2, PlaceholderInfoModel placeholderInfoModel, Map<String, String> map) {
        super(1);
        this.$t = map;
        this.l0 = takoDisclaimerWithTosFragment;
        this.l1 = takoDisclaimerWithTosFragment2;
        this.l2 = placeholderInfoModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS212S0300000_3(Effect effect, File file, Long l, int i) {
        super(1);
        this.$t = i;
        this.l0 = effect;
        this.l1 = file;
        this.l2 = l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS212S0300000_3(List list, List<String> list2, C087I c087i, Map<String, String> map) {
        super(1);
        this.$t = map;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = c087i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS212S0300000_3(Map map, Map<String, InterfaceC1921807fs> map2, Map<String, String> map3, Map<String, ConditionModel.PreciseExposureInfo> map4) {
        super(1);
        this.$t = map4;
        this.l0 = map;
        this.l1 = map2;
        this.l2 = map3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS212S0300000_3(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Map<Long, Integer> map, Function1<? super Boolean, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l0 = atomicInteger;
        this.l1 = atomicInteger2;
        this.l2 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS212S0300000_3(AtomicInteger atomicInteger, Map map, AwS44S0301000_17 awS44S0301000_17, int i) {
        super(1);
        this.$t = i;
        this.l0 = atomicInteger;
        this.l1 = map;
        this.l2 = awS44S0301000_17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS212S0300000_3(AwS37S0600000_22 awS37S0600000_22, C2492609pk c2492609pk, C1439160nYQ c1439160nYQ, int i) {
        super(1);
        this.$t = i;
        this.l0 = awS37S0600000_22;
        this.l1 = c2492609pk;
        this.l2 = c1439160nYQ;
    }
}
