package com.ss.android.ugc.aweme.services.popsuite;

import X.AbstractC20660015ss;
import X.AbstractC738140SxQ;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C09UZ;
import X.C0HTI;
import X.C0OM1;
import X.C0PEM;
import X.C0WQI;
import X.C1251150ifB;
import X.C1388190mED;
import X.C1390920mIc;
import X.C1391190mJ3;
import X.C1391960mKI;
import X.C13IQ;
import X.C13LE;
import X.C155000ia;
import X.C15O7;
import X.C1669720tYI;
import X.C197039127h;
import X.C19EG;
import X.C1C7U;
import X.C20684815ws;
import X.C2089008Gi;
import X.C21312118al;
import X.C21312218am;
import X.C21312318an;
import X.C21312418ao;
import X.C21312518ap;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C343970De7;
import X.C439850HMp;
import X.C443120HZe;
import X.C444890HcV;
import X.C786410Ut5;
import X.C844470XAv;
import X.C848230XPh;
import X.C960203pA;
import X.EnumC19302510fP;
import X.EnumC449010Hj9;
import X.InterfaceC1364105Vn;
import X.InterfaceC2385309Wh;
import X.InterfaceC497601wk;
import android.app.Activity;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.IPopSuiteManagerService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.popsuite.PopupConfigApiResponse;
import com.ss.android.ugc.aweme.services.popsuite.local.LocalCampaignManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS309S0300000_32;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import njp.a;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes33.dex */
public final class PopSuiteManagerService implements IPopSuiteManagerService {
    public static final Companion Companion = new Companion();
    public static final int $stable = 8;
    public C21312318an popupFreqCache = new C21312318an(0);
    public String cacheKeyForPopupFreqControl = "";
    public String enterFrom = "";
    public AtomicReference<IPopSuiteManagerService.PopupConfigObject> currPopupConfigObj = new AtomicReference<>(null);

    public static final class Companion {
    }

    @Override // com.ss.android.ugc.aweme.IPopSuiteManagerService
    public C13IQ<? extends AbstractC738140SxQ> popSuiteTabSwitchAssem() {
        return C13LE.LIZ(PopSuiteTabSwitchAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.IPopSuiteManagerService
    public boolean getPassportPopupConfig() {
        PopSuiteKeva popSuiteKeva = PopSuiteKeva.INSTANCE;
        C21312118al popupConfigDataCache = popSuiteKeva.readPopupConfigDataCache();
        if (System.currentTimeMillis() - (popupConfigDataCache != null ? popupConfigDataCache.LIZ : 0L) < 86400000) {
            return false;
        }
        popSuiteKeva.initPopupConfigCacheObjectsToNull();
        PopupConfigApi.INSTANCE.getPopupConfigs().LJI(new InterfaceC2385309Wh() { // from class: com.ss.android.ugc.aweme.services.popsuite.PopSuiteManagerService.getPassportPopupConfig.1
            @Override // X.InterfaceC2385309Wh
            public final C15O7 then(C15O7<PopupConfigApiResponse> c15o7) {
                Activity activityLJFF;
                if (C09UZ.LIZLLL(c15o7) && u.LJIJI("success", c15o7.LJIIL().message, true) && c15o7.LJIIL().data != null) {
                    PopupConfigApiResponse.PopupConfigData popupConfigData = c15o7.LJIIL().data;
                    if (popupConfigData == null) {
                        return C15O7.LJIIJ(null);
                    }
                    PopSuiteKeva.INSTANCE.setPopupConfigApiRespCache(popupConfigData);
                    if (PopSuiteManagerService.this.isPopupConfigPresent("HOME") && (activityLJFF = C2214201BlK.LJFF()) != null) {
                        PopSuiteManagerService.this.popSuiteTriggerPopup(activityLJFF, AFwS223S0000000_32.get$arr$(79));
                    }
                    return C15O7.LJIIJ(null);
                }
                PopSuiteKeva.INSTANCE.setPopupConfigApiRespCache(new PopupConfigApiResponse.PopupConfigData(null, null, null, null, null));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("API resp failed to validate result: ");
                sbLIZ.append(c15o7.LJIIL());
                C0WQI.LIZ(6, "POP_SUITE", C2188811AlT.LIZIZ(sbLIZ));
                return C15O7.LJIIJ(null);
            }

            @Override // X.InterfaceC2385309Wh
            public /* bridge */ /* synthetic */ Object then(C15O7 c15o7) {
                C1C7U.LIZ("PopSuiteManagerService@e986.getPassportPopupConfig$1");
                C15O7 c15o7Then = then((C15O7<PopupConfigApiResponse>) c15o7);
                C1C7U.LIZIZ("PopSuiteManagerService@e986.getPassportPopupConfig$1");
                return c15o7Then;
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.services.popsuite.PopSuiteManagerService$popSuiteTriggerPopup$1, reason: invalid class name and case insensitive filesystem */
    @C09DV(c = "com.ss.android.ugc.aweme.services.popsuite.PopSuiteManagerService$popSuiteTriggerPopup$1", f = "PopSuiteManagerService.kt", l = {317}, m = "invokeSuspend")
    public final class C2325951 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public final /* synthetic */ Activity $activity;
        public final /* synthetic */ IPopSuiteManagerService.PopupConfigObject $currPopupConfig;
        public final /* synthetic */ Function0<Unit> $triggerPopupFailedCallback;
        public int I$0;
        public int label;
        public final /* synthetic */ PopSuiteManagerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2325951(IPopSuiteManagerService.PopupConfigObject popupConfigObject, PopSuiteManagerService popSuiteManagerService, Activity activity, Function0<Unit> function0, InterfaceC1364105Vn<? super C2325951> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.$currPopupConfig = popupConfigObject;
            this.this$0 = popSuiteManagerService;
            this.$activity = activity;
            this.$triggerPopupFailedCallback = function0;
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return new C2325951(this.$currPopupConfig, this.this$0, this.$activity, this.$triggerPopupFailedCallback, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            int iIntValue;
            C1C7U.LIZ("PopSuiteManagerService@e986.popSuiteTriggerPopup$1");
            Object objLJFF = C099R.LJFF();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    iIntValue = this.I$0;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                PopupConfirmationApi popupConfirmationApi = PopupConfirmationApi.INSTANCE;
                String str = this.$currPopupConfig.popupName;
                this.I$0 = 0;
                this.label = 1;
                obj = popupConfirmationApi.getPopupConfirmation(str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PopSuiteManagerService@e986.popSuiteTriggerPopup$1");
                    return objLJFF;
                }
                iIntValue = 0;
            }
            PopupConfirmationApiResponse popupConfirmationApiResponse = (PopupConfirmationApiResponse) obj;
            Map<String, Integer> data = popupConfirmationApiResponse.getData();
            if (data != null && data.containsKey(this.$currPopupConfig.popupName)) {
                Integer num = popupConfirmationApiResponse.getData().get(this.$currPopupConfig.popupName);
                if (num != null) {
                    iIntValue = num.intValue();
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("PopSuiteManagerService@e986.popSuiteTriggerPopup$1");
                return unit;
            }
            C0WQI.LIZ(5, "POP_SUITE", "Confirmation response is missing popupName");
            if (iIntValue != 1) {
                if (iIntValue == 2) {
                    this.this$0.deletePopupConfig(this.$currPopupConfig);
                    this.this$0.currPopupConfigObj.set(null);
                }
            } else {
                PopSuiteManagerService popSuiteManagerService = this.this$0;
                popSuiteManagerService.popSuiteTriggerPopupInternal(this.$activity, popSuiteManagerService.popupFreqCache, this.$triggerPopupFailedCallback);
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("PopSuiteManagerService@e986.popSuiteTriggerPopup$1");
            return unit2;
        }
    }

    private final boolean isPopupConfigValid(IPopSuiteManagerService.PopupConfigObject popupConfigObject) {
        long j;
        PopSuitePopupIconList popSuitePopupIconList = PopSuitePopupIconList.INSTANCE;
        String str = popupConfigObject.iconUrl;
        if (str == null) {
            str = "";
        }
        if (popSuitePopupIconList.iconListMap(str) == null) {
            return false;
        }
        IPopSuiteManagerService.ButtonActionObject buttonActionObject = popupConfigObject.btnAction;
        try {
            C844470XAv.LIZ.getClass();
            j = CastLongProtector.parseLong(u.LJJIFFI(C844470XAv.LJFF(), e3.d, CardStruct.IStatusCode.DEFAULT, false));
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            j = -1;
        }
        if (j < CastLongProtector.parseLong(buttonActionObject.minVersion) || buttonActionObject.actionType != EnumC449010Hj9.USE_DEEP_LINK.getValue()) {
            return false;
        }
        return true;
    }

    public final void deletePopupConfig(IPopSuiteManagerService.PopupConfigObject popupConfigObject) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C21312118al popupConfigDataCache = PopSuiteKeva.INSTANCE.readPopupConfigDataCache();
        if (popupConfigDataCache != null) {
            List<IPopSuiteManagerService.PopupConfigObject> list = popupConfigDataCache.LIZIZ;
            ArrayList arrayList3 = null;
            if (list != null) {
                ArrayList arrayList4 = new ArrayList(list);
                arrayList = new ArrayList();
                for (Object obj : arrayList4) {
                    if (!Intrinsics.LJFF(((IPopSuiteManagerService.PopupConfigObject) obj).popupName, popupConfigObject.popupName)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            List<IPopSuiteManagerService.PopupConfigObject> list2 = popupConfigDataCache.LIZJ;
            if (list2 != null) {
                ArrayList arrayList5 = new ArrayList(list2);
                arrayList2 = new ArrayList();
                for (Object obj2 : arrayList5) {
                    if (!Intrinsics.LJFF(((IPopSuiteManagerService.PopupConfigObject) obj2).popupName, popupConfigObject.popupName)) {
                        arrayList2.add(obj2);
                    }
                }
            } else {
                arrayList2 = null;
            }
            List<IPopSuiteManagerService.PopupConfigObject> list3 = popupConfigDataCache.LIZLLL;
            if (list3 != null) {
                ArrayList arrayList6 = new ArrayList(list3);
                arrayList3 = new ArrayList();
                for (Object obj3 : arrayList6) {
                    if (!Intrinsics.LJFF(((IPopSuiteManagerService.PopupConfigObject) obj3).popupName, popupConfigObject.popupName)) {
                        arrayList3.add(obj3);
                    }
                }
            }
            PopSuiteKeva.INSTANCE.setPopupConfigDataCache(new C21312118al(arrayList, arrayList2, popupConfigDataCache.LIZ, arrayList3));
        }
    }

    @Override // com.ss.android.ugc.aweme.IPopSuiteManagerService
    public boolean isPopupConfigPresent(String str) {
        List<IPopSuiteManagerService.PopupConfigObject> enterFromAndPopupConfig = setEnterFromAndPopupConfig(str, PopSuiteKeva.INSTANCE.readPopupConfigDataCache());
        if (enterFromAndPopupConfig == null || enterFromAndPopupConfig.isEmpty()) {
            return false;
        }
        for (IPopSuiteManagerService.PopupConfigObject popupConfigObject : enterFromAndPopupConfig) {
            if (isPopupConfigValid(popupConfigObject) && isFreqControlSatisfied(str, new IPopSuiteManagerService.PopupFreqControlObject(popupConfigObject.intervalDay, popupConfigObject.intervalHourly, popupConfigObject.maxCountDay, popupConfigObject.maxCountWeek, popupConfigObject.maxCountMonth, popupConfigObject.maxCount), popupConfigObject.popupName, null).getFirst().booleanValue()) {
                this.currPopupConfigObj.set(popupConfigObject);
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.IPopSuiteManagerService
    public boolean shouldShowPopSuitePopup(String str) {
        if (C848230XPh.LL.LJI() && isPopupConfigPresent(str)) {
            return true;
        }
        return false;
    }

    private final DialogFragment createPopupBottomSheet(final Activity activity, final C21312218am c21312218am) {
        C0OM1 c0om1;
        final View viewTd = C786410Ut5.Td(C786410Ut5.ne(activity), R.layout.a5h, null, true);
        ImageView imageView = (ImageView) viewTd.findViewById(R.id.jlt);
        TextView textView = (TextView) viewTd.findViewById(R.id.y3b);
        TextView textView2 = (TextView) viewTd.findViewById(R.id.fpd);
        C197039127h c197039127h = (C197039127h) viewTd.findViewById(R.id.nwf);
        C197039127h c197039127h2 = (C197039127h) viewTd.findViewById(R.id.ui7);
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = c21312218am.LIZ;
        imageView.setImageDrawable(c0hti.LIZ(activity));
        textView.setText(c21312218am.LIZIZ);
        textView2.setText(getMessage(activity, c21312218am));
        c197039127h.setText(c21312218am.LJFF);
        C786410Ut5.U8(c197039127h, new View.OnClickListener() { // from class: com.ss.android.ugc.aweme.services.popsuite.PopSuiteManagerService.createPopupBottomSheet.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SmartRouter.buildRoute(activity, c21312218am.LJII).open();
                PopSuiteETHelper popSuiteETHelper = PopSuiteETHelper.INSTANCE;
                String value = EnumC19302510fP.CONFIRM.getValue();
                C21312218am c21312218am2 = c21312218am;
                popSuiteETHelper.mobPopSuitePopupResp(value, c21312218am2.LJI, "normal", c21312218am2.LJIIIIZZ, this.popupFreqCache.LIZIZ + 1);
                String str = TuxSheet._pnsPageId;
                C1391190mJ3.LJ(viewTd, C343970De7.LIZ);
            }
        });
        c197039127h.LJJJJLI(true);
        c197039127h.setMaxLines(1);
        c197039127h.setMinTextSize(12.0f);
        String str = c21312218am.LJIIJ;
        if (str != null) {
            c197039127h2.setText(str);
            C786410Ut5.U8(c197039127h2, new View.OnClickListener() { // from class: com.ss.android.ugc.aweme.services.popsuite.PopSuiteManagerService$createPopupBottomSheet$3$1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SmartRouter.buildRoute(activity, c21312218am.LJIIJJI).open();
                    PopSuiteETHelper popSuiteETHelper = PopSuiteETHelper.INSTANCE;
                    String value = EnumC19302510fP.SECONDARY.getValue();
                    C21312218am c21312218am2 = c21312218am;
                    popSuiteETHelper.mobPopSuitePopupResp(value, c21312218am2.LJI, "normal", c21312218am2.LJIIIIZZ, this.popupFreqCache.LIZIZ + 1);
                    String str2 = TuxSheet._pnsPageId;
                    C1391190mJ3.LJ(viewTd, C343970De7.LIZ);
                }
            });
            c197039127h2.LJJJJLI(true);
            c197039127h2.setMaxLines(1);
            c197039127h2.setMinTextSize(12.0f);
        } else {
            new AwS572S0100000_28(c197039127h2, 524);
        }
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIII = viewTd;
        tuxSheet.LLJJIJIIJIL = true;
        c1390920mIc.LJIIIIZZ(0);
        if (c21312218am.LJ) {
            c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark;
            c1251150ifB.LJIIIIZZ = "";
            c1251150ifB.LIZJ(new AwS572S0100000_28(viewTd, 525));
            c0om1.LIZIZ(c1251150ifB);
        } else {
            c0om1 = null;
        }
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJJIJIL = c0om1;
        tuxSheet2.LLJJJ = null;
        DialogInterface.OnCancelListener onCancelListener = new DialogInterface.OnCancelListener() { // from class: com.ss.android.ugc.aweme.services.popsuite.PopSuiteManagerService$createPopupBottomSheet$sheet$2
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                PopSuiteETHelper popSuiteETHelper = PopSuiteETHelper.INSTANCE;
                String value = EnumC19302510fP.DISMISS.getValue();
                C21312218am c21312218am2 = c21312218am;
                popSuiteETHelper.mobPopSuitePopupResp(value, c21312218am2.LJI, "normal", c21312218am2.LJIIIIZZ, this.popupFreqCache.LIZIZ + 1);
            }
        };
        TuxSheet tuxSheet3 = c1390920mIc.LIZ;
        tuxSheet3.LL = onCancelListener;
        return tuxSheet3;
    }

    private final DialogFragment createPopupFloatingWindow(Activity activity, final C21312218am c21312218am) {
        C1391960mKI c1391960mKI = new C1391960mKI();
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = c21312218am.LIZ;
        c1391960mKI.LIZLLL = c0hti.LIZ(activity);
        c1391960mKI.LJI = 2;
        c1391960mKI.LJII = c21312218am.LIZIZ;
        c1391960mKI.LJIIIIZZ = getMessage(activity, c21312218am);
        c1391960mKI.LIZ = true;
        c1391960mKI.LJIILJJIL = true;
        c1391960mKI.LIZIZ(c21312218am.LJFF, new AwS309S0300000_32(activity, c21312218am, this, 1));
        String str = c21312218am.LJIIJ;
        if (str != null) {
            c1391960mKI.LIZJ(str, new AwS309S0300000_32(c21312218am, this, activity, 2));
        }
        C439850HMp c439850HMpLIZ = c1391960mKI.LIZ();
        c439850HMpLIZ.LIZ.LLJI = false;
        DialogInterface.OnCancelListener onCancelListener = new DialogInterface.OnCancelListener() { // from class: com.ss.android.ugc.aweme.services.popsuite.PopSuiteManagerService$createPopupFloatingWindow$panel$2
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                PopSuiteETHelper popSuiteETHelper = PopSuiteETHelper.INSTANCE;
                String value = EnumC19302510fP.DISMISS.getValue();
                C21312218am c21312218am2 = c21312218am;
                popSuiteETHelper.mobPopSuitePopupResp(value, c21312218am2.LJI, "normal", c21312218am2.LJIIIIZZ, this.popupFreqCache.LIZIZ + 1);
            }
        };
        TuxPanel tuxPanel = c439850HMpLIZ.LIZ;
        tuxPanel.LLILZLL = onCancelListener;
        return tuxPanel;
    }

    private final CharSequence getMessage(final Activity activity, C21312218am c21312218am) {
        CharSequence charSequence = c21312218am.LIZJ;
        Map<String, C21312418ao> map = c21312218am.LIZLLL;
        if (map != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            final int iLIZ = C960203pA.LIZ(R.attr.a1h, activity);
            for (Map.Entry<String, C21312418ao> entry : map.entrySet()) {
                String key = entry.getKey();
                C21312418ao value = entry.getValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('{');
                sbLIZ.append(key);
                sbLIZ.append('}');
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                String str = value.LIZ;
                if (str == null) {
                    str = "";
                }
                final String str2 = value.LIZIZ;
                int iLJJJ = a0.LJJJ(charSequence, strLIZIZ, 0, false, 6);
                if (iLJJJ != -1) {
                    spannableStringBuilder.replace(iLJJJ, strLIZIZ.length() + iLJJJ, (CharSequence) str);
                    C786410Ut5.q2(spannableStringBuilder, new ClickableSpan() { // from class: com.ss.android.ugc.aweme.services.popsuite.PopSuiteManagerService$getMessage$1$1
                        @Override // android.text.style.ClickableSpan
                        public void onClick(View view) {
                            C2089008Gi c2089008Gi = new C2089008Gi(str2);
                            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "aweme://webview");
                            smartRouteBuildRoute.withParam("url", c2089008Gi.LJ());
                            smartRouteBuildRoute.withParam("use_spark", true);
                            smartRouteBuildRoute.open();
                        }

                        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                        public void updateDrawState(TextPaint textPaint) {
                            textPaint.setColor(iLIZ);
                            C444890HcV c444890HcV = new C444890HcV();
                            c444890HcV.LIZ(82);
                            textPaint.setTypeface(c444890HcV.getTypeface());
                            textPaint.setUnderlineText(false);
                        }
                    }, iLJJJ, str.length() + iLJJJ, 33);
                }
            }
            charSequence = spannableStringBuilder;
        }
        return charSequence;
    }

    private final void recordShowPopupCount(String str, String str2) {
        PopSuiteKeva popSuiteKeva = PopSuiteKeva.INSTANCE;
        String str3 = this.cacheKeyForPopupFreqControl;
        C21312318an c21312318an = this.popupFreqCache;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C21312318an c21312318an2 = this.popupFreqCache;
        int i = c21312318an2.LIZIZ + 1;
        int i2 = c21312318an2.LIZJ + 1;
        int i3 = c21312318an2.LIZLLL + 1;
        int i4 = c21312318an2.LJ + 1;
        c21312318an.getClass();
        popSuiteKeva.updatePopupFreqCache(str3, new C21312318an(jCurrentTimeMillis, i, i2, i3, i4));
        PopSuiteETHelper.INSTANCE.mobPopSuitePopupShow(str, "normal", str2, this.popupFreqCache.LIZIZ + 1);
    }

    private final List<IPopSuiteManagerService.PopupConfigObject> setEnterFromAndPopupConfig(String str, C21312118al c21312118al) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1382453013) {
            if (iHashCode != 2223327) {
                if (iHashCode == 2614219 && str.equals("USER")) {
                    this.enterFrom = "personal_homepage";
                    if (c21312118al == null) {
                        return null;
                    }
                    return c21312118al.LIZIZ;
                }
            } else if (str.equals("HOME")) {
                this.enterFrom = "homepage_hot";
                if (c21312118al == null) {
                    return null;
                }
                return c21312118al.LIZLLL;
            }
        } else if (str.equals("NOTIFICATION")) {
            this.enterFrom = "notification_page";
            if (c21312118al == null) {
                return null;
            }
            return c21312118al.LIZJ;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.IPopSuiteManagerService
    public void popSuiteTriggerPopup(Activity activity, Function0<Unit> function0) {
        IPopSuiteManagerService.PopupConfigObject popupConfigObject = this.currPopupConfigObj.get();
        if (popupConfigObject == null) {
            return;
        }
        if (popupConfigObject.needConfirmation) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2325951(popupConfigObject, this, activity, function0, null), 3);
        } else {
            popSuiteTriggerPopupInternal(activity, this.popupFreqCache, function0);
        }
    }

    @Override // com.ss.android.ugc.aweme.IPopSuiteManagerService
    public DialogFragment showCommonTuxIntroPopSheet(Activity activity, C21312218am c21312218am) {
        DialogFragment dialogFragmentCreatePopupBottomSheet;
        C1669720tYI c1669720tYI = C1669720tYI.LIZ;
        String str = c21312218am.LJIIIIZZ;
        c1669720tYI.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("popup_name", str);
        C20684815ws.LJIILLIIL("popup_show", c2344009Gk.LIZ);
        if (Intrinsics.LJFF(c21312218am.LJIIIZ, "tux_intro_panel_floating")) {
            dialogFragmentCreatePopupBottomSheet = createPopupFloatingWindow(activity, c21312218am);
        } else {
            dialogFragmentCreatePopupBottomSheet = createPopupBottomSheet(activity, c21312218am);
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(activity);
        if (c19egLIZIZ != null) {
            dialogFragmentCreatePopupBottomSheet.show(c19egLIZIZ.getSupportFragmentManager(), "UPSELL_2SV_POPUP");
        }
        recordShowPopupCount(c21312218am.LJI, c21312218am.LJIIIIZZ);
        return dialogFragmentCreatePopupBottomSheet;
    }

    private final String createPopupCacheKey(String str, String str2, C21312518ap c21312518ap) {
        StringBuilder sb = new StringBuilder();
        c21312518ap.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append('_');
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public final void popSuiteTriggerPopupInternal(final Activity activity, C21312318an c21312318an, final Function0<Unit> function0) {
        int iIntValue;
        String str;
        IPopSuiteManagerService.PopupConfigObject popupConfigObject = this.currPopupConfigObj.get();
        if (popupConfigObject == null) {
            return;
        }
        if (LocalCampaignManager.INSTANCE.showLocalCampaign(popupConfigObject, c21312318an)) {
            recordShowPopupCount(this.enterFrom, popupConfigObject.popupName);
            return;
        }
        Integer numIconListMap = PopSuitePopupIconList.INSTANCE.iconListMap(popupConfigObject.iconUrl);
        if (numIconListMap != null) {
            iIntValue = numIconListMap.intValue();
        } else {
            iIntValue = R.drawable.xh;
        }
        String str2 = popupConfigObject.titleStr;
        String str3 = popupConfigObject.descString;
        Map<String, C21312418ao> map = popupConfigObject.descHyperlinks;
        String str4 = popupConfigObject.btnString;
        String str5 = this.enterFrom;
        String str6 = popupConfigObject.btnAction.btnDeeplink;
        String str7 = popupConfigObject.popupName;
        String str8 = popupConfigObject.popupLayout;
        String str9 = popupConfigObject.secondaryButtonString;
        IPopSuiteManagerService.ButtonActionObject buttonActionObject = popupConfigObject.secondaryButtonAction;
        if (buttonActionObject != null) {
            str = buttonActionObject.btnDeeplink;
        } else {
            str = null;
        }
        final C21312218am c21312218am = new C21312218am(iIntValue, str2, str3, map, str4, str5, str6, str7, str8, str9, str);
        C1669720tYI.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("popup_name", str7);
        C20684815ws.LJIILLIIL("popup_trigger_show_task", c2344009Gk.LIZ);
        final String str10 = popupConfigObject.popupName;
        final int i = popupConfigObject.priority;
        PopupManager.LJIJI(new AbstractC20660015ss<DialogFragment>(activity, str10, i, c21312218am, function0) { // from class: X.15sV
            public final Activity LL;
            public final String LLILLJJLI;
            public final C21312218am LLILLL;
            public final Function0<Unit> LLILZ;
            public final int LLILZIL;
            public final EnumC1202290hON LLILZLL = EnumC1202290hON.CONTAINER;

            @Override // X.AbstractC20656215sG
            public final C0T87 getPopupExtraParams() {
                return new C0T87(this.LLILLJJLI);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC20660415sw
            public final C688120Qyw i2() {
                Activity activity2 = this.LL;
                if (activity2 instanceof LifecycleOwner) {
                    return new C688120Qyw(activity2, (LifecycleOwner) activity2, null);
                }
                return null;
            }

            @Override // X.AbstractC20656215sG
            public final EnumC1202290hON getPopupType() {
                return this.LLILZLL;
            }

            @Override // X.InterfaceC20660515sx
            public final int getPriority() {
                return this.LLILZIL;
            }

            @Override // com.bytedance.poplayer.IPopupTask
            public final Object showPopup(C688120Qyw c688120Qyw) {
                return ((IPopSuiteManagerService) ServiceManager.get().getService(IPopSuiteManagerService.class)).showCommonTuxIntroPopSheet(this.LL, this.LLILLL);
            }

            @Override // X.AbstractC20656215sG
            public final void onPopupStateChanged(EnumC20657015sO enumC20657015sO, EnumC20657015sO enumC20657015sO2) {
                super.onPopupStateChanged(enumC20657015sO, enumC20657015sO2);
                if (C20657615sU.LIZ[enumC20657015sO2.ordinal()] == 1) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Popup show failed: popup_id: ");
                    sbLIZ.append(this.LLILLJJLI);
                    sbLIZ.append(", popupData: ");
                    sbLIZ.append(this.LLILLL);
                    C0WQI.LIZ(6, "POP_SUITE", C2188811AlT.LIZIZ(sbLIZ));
                    this.LLILZ.invoke();
                }
            }

            {
                this.LL = activity;
                this.LLILLJJLI = str10;
                this.LLILLL = c21312218am;
                this.LLILZ = function0;
                this.LLILZIL = i;
            }
        }, true);
    }

    @Override // com.ss.android.ugc.aweme.IPopSuiteManagerService
    public C443120HZe<Boolean, C21312318an, String> isFreqControlSatisfied(String str, IPopSuiteManagerService.PopupFreqControlObject popupFreqControlObject, String str2, C21312518ap c21312518ap) {
        String strLIZIZ;
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(6);
        int i2 = calendar.get(3);
        int i3 = calendar.get(2);
        if (c21312518ap != null) {
            strLIZIZ = createPopupCacheKey(str, str2, c21312518ap);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(PopSuiteKeva.INSTANCE.getUserId());
            sbLIZ.append('_');
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(str2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        this.cacheKeyForPopupFreqControl = strLIZIZ;
        PopSuiteKeva popSuiteKeva = PopSuiteKeva.INSTANCE;
        C21312318an popupFreqCache = popSuiteKeva.readPopupFreqCache(strLIZIZ);
        this.popupFreqCache = popupFreqCache;
        calendar.setTimeInMillis(popupFreqCache.LIZ);
        if (calendar.getTimeInMillis() <= 0) {
            return new C443120HZe<>(Boolean.TRUE, this.popupFreqCache, this.cacheKeyForPopupFreqControl);
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(System.currentTimeMillis());
        long days = timeUnit.toDays(System.currentTimeMillis());
        long hours2 = timeUnit.toHours(this.popupFreqCache.LIZ);
        long days2 = timeUnit.toDays(this.popupFreqCache.LIZ);
        C21312318an c21312318an = this.popupFreqCache;
        int i4 = c21312318an.LIZIZ;
        int i5 = c21312318an.LIZJ;
        int i6 = c21312318an.LIZLLL;
        int i7 = c21312318an.LJ;
        long j = popupFreqControlObject.intervalHourly;
        long j2 = popupFreqControlObject.intervalDay;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("currentDay: ");
        sbLIZ2.append(days);
        sbLIZ2.append(" lastPopupShowInDays: ");
        sbLIZ2.append(days2);
        sbLIZ2.append(" popupCount: ");
        sbLIZ2.append(i4);
        sbLIZ2.append(" weekPopupCount: ");
        sbLIZ2.append(i6);
        sbLIZ2.append(" monthPopupCount: ");
        sbLIZ2.append(i7);
        sbLIZ2.append("popupFreqControlObj: ");
        sbLIZ2.append(popupFreqControlObject);
        sbLIZ2.append(" tabName: ");
        sbLIZ2.append(str);
        C0WQI.LIZ(4, "POP_SUITE", C2188811AlT.LIZIZ(sbLIZ2));
        if (i4 >= popupFreqControlObject.maxCount) {
            return new C443120HZe<>(Boolean.FALSE, this.popupFreqCache, this.cacheKeyForPopupFreqControl);
        }
        if (calendar.get(6) == i) {
            if (i5 >= popupFreqControlObject.maxCountDay) {
                return new C443120HZe<>(Boolean.FALSE, this.popupFreqCache, this.cacheKeyForPopupFreqControl);
            }
            if (hours - hours2 < j) {
                return new C443120HZe<>(Boolean.FALSE, this.popupFreqCache, this.cacheKeyForPopupFreqControl);
            }
        } else {
            C21312318an c21312318anLIZ = C21312318an.LIZ(this.popupFreqCache, 0L, 0, 0, 27);
            this.popupFreqCache = c21312318anLIZ;
            popSuiteKeva.updatePopupFreqCache(this.cacheKeyForPopupFreqControl, c21312318anLIZ);
        }
        if (days2 > 0 && popupFreqControlObject.maxCountDay == 1 && days - days2 < j2) {
            return new C443120HZe<>(Boolean.FALSE, this.popupFreqCache, this.cacheKeyForPopupFreqControl);
        }
        if (calendar.get(3) == i2) {
            if (i6 >= popupFreqControlObject.maxCountWeek) {
                return new C443120HZe<>(Boolean.FALSE, this.popupFreqCache, this.cacheKeyForPopupFreqControl);
            }
        } else {
            C21312318an c21312318anLIZ2 = C21312318an.LIZ(this.popupFreqCache, 0L, 0, 0, 23);
            this.popupFreqCache = c21312318anLIZ2;
            popSuiteKeva.updatePopupFreqCache(this.cacheKeyForPopupFreqControl, c21312318anLIZ2);
        }
        if (calendar.get(2) == i3) {
            if (i7 >= popupFreqControlObject.maxCountMonth) {
                return new C443120HZe<>(Boolean.FALSE, this.popupFreqCache, this.cacheKeyForPopupFreqControl);
            }
        } else {
            C21312318an c21312318anLIZ3 = C21312318an.LIZ(this.popupFreqCache, 0L, 0, 0, 15);
            this.popupFreqCache = c21312318anLIZ3;
            popSuiteKeva.updatePopupFreqCache(this.cacheKeyForPopupFreqControl, c21312318anLIZ3);
        }
        return new C443120HZe<>(Boolean.TRUE, this.popupFreqCache, this.cacheKeyForPopupFreqControl);
    }
}
