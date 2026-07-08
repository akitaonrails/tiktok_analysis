package com.bytedance.android.livesdk.module;

import X.AbstractC1542070qEP;
import X.AbstractC1911210zpn;
import X.C0KYL;
import X.C1105180erk;
import X.C1105230erp;
import X.C1107580evc;
import X.C1161920gLG;
import X.C1388190mED;
import X.C13LP;
import X.C1529590puH;
import X.C1537060q6K;
import X.C1537480q70;
import X.C1537720q7O;
import X.C1537820q7Y;
import X.C1537900q7g;
import X.C1538140q84;
import X.C1538590q8n;
import X.C1541950qED;
import X.C1542410qEx;
import X.C1545480qJu;
import X.C1546560qLe;
import X.C1547760qNa;
import X.C1554300qY8;
import X.C1911150zph;
import X.C1911190zpl;
import X.C19EG;
import X.C1BHX;
import X.C497740JfY;
import X.C500260Jjc;
import X.C760370TsB;
import X.EnumC1067640dtC;
import X.EnumC1105200erm;
import X.EnumC760350Ts9;
import X.InterfaceC1105930esx;
import X.InterfaceC1530220pvI;
import X.InterfaceC1531560pxS;
import X.InterfaceC1538950q9N;
import X.InterfaceC1540940qCa;
import X.InterfaceC1541990qEH;
import X.InterfaceC1554220qY0;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.R;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.res.Configuration;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.uikit.setting.LivePanelFrameworkSetting;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveHybridContainerBindLifecycleOwnerSetting;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveHybridForestPredecodeEnableSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveSheetRadiusOptSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public class HybridContainerService implements IHybridContainerService {
    @Override // com.bytedance.android.live.browser.IHybridContainerService
    public final LivePanelFrameworkSetting.AllowItem ed1(String str) {
        if (str == null) {
            return null;
        }
        for (LivePanelFrameworkSetting.AllowItem allowItem : LivePanelFrameworkSetting.getValue().allowList) {
            if (a0.LJJIIZI(str, allowItem.url, false)) {
                return allowItem;
            }
        }
        return null;
    }

    public static InterfaceC1541990qEH LIZ(SparkContext sparkContext, Context context) {
        HybridSchemaParam hybridSchemaParam;
        C1538140q84 c1538140q84 = C1538140q84.LIZ;
        C1538590q8n c1538590q8n = sparkContext.liteLynxConfig;
        if (c1538590q8n == null) {
            c1538590q8n = new C1538590q8n();
        }
        C1538140q84.LIZIZ(c1538140q84, sparkContext, c1538590q8n, 4);
        InterfaceC1531560pxS interfaceC1531560pxS = sparkContext.hybridParams;
        if (interfaceC1531560pxS == null || (hybridSchemaParam = interfaceC1531560pxS.LIZJ()) == null) {
            hybridSchemaParam = new HybridSchemaParam(EnumC1067640dtC.LYNX);
        }
        return C1537820q7Y.LIZIZ(hybridSchemaParam, sparkContext, context, null);
    }

    @Override // com.bytedance.android.live.browser.IHybridContainerService
    public final void ID1(Context context, String str) {
        String strLIZIZ = C1107580evc.LIZIZ(UriProtector.parse(str));
        if (strLIZIZ == null) {
            return;
        }
        if (C1542410qEx.LIZ(str) == 2) {
            C1545480qJu.LIZ.getClass();
            SparkPopupSchemaParam sparkPopupSchemaParamLIZ = C1545480qJu.LIZ(str, null, null, CardStruct.IStatusCode.DEFAULT);
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ == null) {
                return;
            }
            SparkThirdContext sparkThirdContext = new SparkThirdContext();
            sparkThirdContext.url = strLIZIZ;
            sparkThirdContext.popupSchemaParam = sparkPopupSchemaParamLIZ;
            sparkThirdContext.bizCert = new ThirdPartyBizCert(402677760);
            C1554300qY8.LIZJ(c19egLIZIZ, sparkThirdContext);
            return;
        }
        SparkThirdContext sparkThirdContext2 = new SparkThirdContext();
        sparkThirdContext2.url = strLIZIZ;
        sparkThirdContext2.bizCert = new ThirdPartyBizCert(402677760);
        C1554300qY8.LIZIZ(context, sparkThirdContext2);
    }

    @Override // com.bytedance.android.live.browser.IHybridContainerService
    public final SparkContext wZ0(String str, LifecycleOwner lifecycleOwner) {
        LifecycleCoroutineScope lifecycleScope;
        String strLIZIZ = C1547760qNa.LIZIZ(str);
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(strLIZIZ);
        sparkContext.lifecycleOwner = lifecycleOwner;
        if (lifecycleOwner != null) {
            lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner);
        } else {
            lifecycleScope = null;
        }
        sparkContext.coroutineScope = lifecycleScope;
        sparkContext.autoDestroyDelayTimeInMillSeconds = 0L;
        if (LiveHybridForestPredecodeEnableSetting.INSTANCE.getValue()) {
            sparkContext.LJJJZ("enable_forest_pre_decode", "1");
        }
        return sparkContext;
    }

    public static InterfaceC1105930esx LIZIZ(Context context, String str, String str2) {
        InterfaceC1105930esx interfaceC1105930esx;
        if (str2 == null || str2.length() <= 0) {
            return null;
        }
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        InterfaceC1540940qCa interfaceC1540940qCaLJ = C1537060q6K.LJ(context, str, str2, null, 24);
        if (!(interfaceC1540940qCaLJ instanceof InterfaceC1105930esx) || (interfaceC1105930esx = (InterfaceC1105930esx) interfaceC1540940qCaLJ) == null) {
            InterfaceC1105930esx interfaceC1105930esxLIZJ = C1546560qLe.LIZ.LIZJ(context, str, str2);
            if (!(interfaceC1105930esxLIZJ instanceof InterfaceC1105930esx)) {
                return null;
            }
            return interfaceC1105930esxLIZJ;
        }
        return interfaceC1105930esx;
    }

    @Override // com.bytedance.android.live.browser.IHybridContainerService
    public final C1BHX D60(Context context, String str, Function1 function1) {
        SparkThirdContext sparkThirdContext = new SparkThirdContext();
        sparkThirdContext.url = str;
        sparkThirdContext.bizCert = new ThirdPartyBizCert(402677760);
        function1.invoke(sparkThirdContext);
        C1BHX c1bhxLIZ = C1554300qY8.LIZ(context, sparkThirdContext);
        if (c1bhxLIZ != null) {
            View childAt = c1bhxLIZ.getChildAt(0);
            if (childAt != null) {
                childAt.setBackgroundColor(-1);
            }
            return c1bhxLIZ;
        }
        return null;
    }

    @Override // com.bytedance.android.live.browser.IHybridContainerService
    public final SparkContext YC1(final Context context, String str, Function1<? super SparkContext, Unit> function1) {
        boolean z;
        boolean z2;
        Context contextLIZ;
        boolean z3;
        Context contextLIZ2;
        boolean z4;
        boolean z5;
        Map<String, String> map;
        C1105180erk.LIZ.getClass();
        C1105180erk.LIZ(str);
        final SparkContext sparkContextWZ0 = wZ0(str, null);
        Uri uriLJJJZ = UriProtector.parse(sparkContextWZ0.LJIJI());
        LivePanelFrameworkSetting.AllowItem allowItemEd1 = ed1(C1107580evc.LIZ(uriLJJJZ));
        if (allowItemEd1 != null && Intrinsics.LJFF(allowItemEd1.enable, "1") && (map = allowItemEd1.params) != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                uriLJJJZ = C500260Jjc.LJJJZ(uriLJJJZ, entry.getKey(), entry.getValue());
            }
        }
        final String string = uriLJJJZ.toString();
        sparkContextWZ0.LJJLIIJ(string);
        if (function1 != null) {
            function1.invoke(sparkContextWZ0);
        }
        if (C1542410qEx.LIZ(string) == 2) {
            z = true;
            if (Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(sparkContextWZ0.LJIJI()), "use_live_sheet"), "1") || Intrinsics.LJFF(sparkContextWZ0.LJJJ().get("use_live_sheet"), "1")) {
                C1911190zpl.LIZ.getClass();
                C760370TsB c760370TsBLIZ = C0KYL.LIZ(C1547760qNa.LIZIZ(string));
                ((HashMap) c760370TsBLIZ.LIZ).remove("show_mask");
                ((HashMap) c760370TsBLIZ.LIZ).remove("mask_bg_color");
                ((HashMap) c760370TsBLIZ.LIZ).remove("landscape_width");
                ((HashMap) c760370TsBLIZ.LIZ).remove("width");
                ((HashMap) c760370TsBLIZ.LIZ).remove("landscape_height");
                ((HashMap) c760370TsBLIZ.LIZ).remove("gravity");
                ((HashMap) c760370TsBLIZ.LIZ).remove("self_adaptive_height");
                if (LiveSheetRadiusOptSetting.INSTANCE.getValue() && !Intrinsics.LJFF(c760370TsBLIZ.LIZIZ("live_small_radius"), "1")) {
                    c760370TsBLIZ.LJIJI(26, EnumC760350Ts9.DP);
                } else {
                    c760370TsBLIZ.LJIJI(12, EnumC760350Ts9.DP);
                }
                c760370TsBLIZ.LJIIL(2);
                ((HashMap) c760370TsBLIZ.LIZ).put("keyboard_compat", "1");
                final boolean z6 = !Intrinsics.LJFF(c760370TsBLIZ.LIZIZ("launch_mode"), "navigate");
                boolean zLJFF = Intrinsics.LJFF(c760370TsBLIZ.LIZIZ("always_show_mask"), "1");
                if (C497740JfY.LJIL()) {
                    sparkContextWZ0.LJJ(AbstractC1911210zpn.class, new AbstractC1911210zpn() { // from class: X.0zpc
                        @Override // X.AbstractC1911210zpn
                        public final void LJIJ(ViewPropertyAnimator viewPropertyAnimator) {
                            if (C497740JfY.LJIL()) {
                                if (!z6) {
                                    viewPropertyAnimator.setStartDelay(100L);
                                }
                                viewPropertyAnimator.setDuration(300L);
                                viewPropertyAnimator.setInterpolator(C0GY9.LIZIZ(0.33f, 0.86f, 0.2f, 1.0f));
                                return;
                            }
                            viewPropertyAnimator.setDuration(250L);
                        }

                        @Override // X.AbstractC1911210zpn
                        public final void LJJIJL(ViewPropertyAnimator viewPropertyAnimator) {
                            viewPropertyAnimator.setDuration(300L);
                            if (C497740JfY.LJIL()) {
                                viewPropertyAnimator.setInterpolator(C0GY9.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
                            }
                        }
                    });
                }
                final SheetOptions sheetOptions = new SheetOptions();
                if (C497740JfY.LJIL() && Intrinsics.LJFF(c760370TsBLIZ.LIZIZ("status_bar_theme"), "light")) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (zLJFF) {
                    sheetOptions.dimBehindType = 1;
                }
                final C1911150zph c1911150zph = new C1911150zph(sparkContextWZ0, sheetOptions, z3, c760370TsBLIZ.LIZIZ("container_bg_color"));
                String strLIZIZ = c760370TsBLIZ.LIZIZ("height_mode");
                c760370TsBLIZ.LJJIFFI("drag_handle_force_flat", "1");
                int iLJJI = (int) C497740JfY.LJJI(C1911190zpl.LIZ(context));
                if (!c760370TsBLIZ.LIZJ("drag_up_threshold")) {
                    c760370TsBLIZ.LJJIFFI("drag_up_threshold", String.valueOf((int) (iLJJI * 0.2f)));
                }
                if (!c760370TsBLIZ.LIZJ("drag_down_threshold")) {
                    c760370TsBLIZ.LJJIFFI("drag_down_threshold", String.valueOf((int) (iLJJI * 0.2f)));
                }
                if (!c760370TsBLIZ.LIZJ("drag_down_close_threshold")) {
                    c760370TsBLIZ.LJJIFFI("drag_down_close_threshold", String.valueOf(iLJJI));
                }
                if (!c760370TsBLIZ.LIZJ("peek_down_close_threshold")) {
                    c760370TsBLIZ.LJJIFFI("peek_down_close_threshold", String.valueOf((int) (iLJJI * 0.2f)));
                }
                if (C497740JfY.LJIL()) {
                    z2 = true;
                    if (Intrinsics.LJFF(c760370TsBLIZ.LIZIZ("variable_height"), "100%") && Intrinsics.LJFF(c760370TsBLIZ.LIZIZ("drag_by_gesture"), "1")) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    sheetOptions.fullscreenEnabled = z4;
                    if (!c760370TsBLIZ.LIZJ("enable_pull_down_close")) {
                        ((HashMap) c760370TsBLIZ.LIZ).put("enable_pull_down_close", "1");
                        sheetOptions.draggable = true;
                    } else {
                        sheetOptions.draggable = Intrinsics.LJFF(c760370TsBLIZ.LIZIZ("enable_pull_down_close"), "1");
                    }
                    if (Intrinsics.LJFF(strLIZIZ, "fixed_7")) {
                        c760370TsBLIZ.LJIIIZ(73, EnumC760350Ts9.PERCENT);
                        sheetOptions.LIZ(1, null);
                    } else {
                        String strLIZIZ2 = c760370TsBLIZ.LIZIZ("height");
                        if (strLIZIZ2 != null && strLIZIZ2.length() != 0) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (strLIZIZ2 != null) {
                            if (!u.LJIIZILJ(strLIZIZ2, "%", false)) {
                                if (!u.LJIIZILJ(strLIZIZ2, "rpx", false)) {
                                    try {
                                        if (((int) C497740JfY.LIZIZ(CastFloatProtector.parseFloat(strLIZIZ2))) > C1911190zpl.LIZ(context) * 0.6f) {
                                            z5 = true;
                                        }
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                }
                            } else {
                                try {
                                    if (CastIntegerProtector.parseInt(a0.LJJJLL("%", strLIZIZ2)) > 60) {
                                        z5 = true;
                                    }
                                } catch (Exception e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                }
                            }
                        }
                        if (!sheetOptions.fullscreenEnabled) {
                            if (z5) {
                                c760370TsBLIZ.LJIIIZ(60, EnumC760350Ts9.PERCENT);
                                if (C1105230erp.LIZ(UriProtector.parse(string)) != EnumC1105200erm.WEB) {
                                    c760370TsBLIZ.LJJIFFI("self_adaptive_height", "1");
                                }
                            }
                        } else {
                            c760370TsBLIZ.LJIIIZ(60, EnumC760350Ts9.PERCENT);
                        }
                        String strLIZIZ3 = c760370TsBLIZ.LIZIZ("loading_height");
                        if (strLIZIZ3 != null && !a0.LJJJIL(strLIZIZ3)) {
                            try {
                                int i = CastIntegerProtector.parseInt(String.valueOf(c760370TsBLIZ.LIZIZ("loading_height")));
                                if (i > 0) {
                                    final int iLIZIZ = (int) C497740JfY.LIZIZ(i);
                                    sparkContextWZ0.LJJLIIIJLJLI(new AbstractC1542070qEP(iLIZIZ) { // from class: X.0zhM
                                        public final int LLILLJJLI;
                                        public C1749280vcc LLILLL;

                                        @Override // X.AbstractC1542070qEP, X.InterfaceC1163130gND
                                        public final void release() {
                                        }

                                        @Override // X.InterfaceC1163110gNB
                                        public final View LJJL() {
                                            C1749280vcc c1749280vcc;
                                            C1749280vcc c1749280vcc2 = this.LLILLL;
                                            if (c1749280vcc2 == null) {
                                                c1749280vcc2 = null;
                                            }
                                            c1749280vcc2.LJ();
                                            C1749280vcc c1749280vcc3 = this.LLILLL;
                                            if (c1749280vcc3 == null) {
                                                c1749280vcc3 = null;
                                            }
                                            C786410Ut5.LLLZLZ(c1749280vcc3, 0);
                                            C1749280vcc c1749280vcc4 = this.LLILLL;
                                            if (c1749280vcc4 == null) {
                                                c1749280vcc = null;
                                                c1749280vcc4 = null;
                                            } else {
                                                c1749280vcc = c1749280vcc4;
                                            }
                                            c1749280vcc.setBackgroundColor(C446980Hfs.LIZ(c1749280vcc4.getContext(), R.color.transparent));
                                            C1749280vcc c1749280vcc5 = this.LLILLL;
                                            if (c1749280vcc5 == null) {
                                                c1749280vcc5 = null;
                                            }
                                            C786410Ut5.U6(c1749280vcc5, new ViewGroup.LayoutParams(-1, this.LLILLJJLI));
                                            C1749280vcc c1749280vcc6 = this.LLILLL;
                                            if (c1749280vcc6 != null) {
                                                return c1749280vcc6;
                                            }
                                            return null;
                                        }

                                        {
                                            this.LLILLJJLI = iLIZIZ;
                                        }

                                        @Override // X.InterfaceC1163110gNB
                                        public final void LJIIJ(Context context2) {
                                            C1749280vcc c1749280vcc = new C1749280vcc(context2, null, 6);
                                            c1749280vcc.setLayoutVariant(0);
                                            this.LLILLL = c1749280vcc;
                                        }

                                        @Override // X.InterfaceC1163110gNB
                                        public final View LJJJLIIL(InterfaceC1051240dSk interfaceC1051240dSk) {
                                            C1749280vcc c1749280vcc = this.LLILLL;
                                            if (c1749280vcc == null) {
                                                c1749280vcc = null;
                                            }
                                            C1722300uv6 c1722300uv6 = new C1722300uv6();
                                            C1893080zMY.LIZ(c1722300uv6, new AwS572S0100000_28(interfaceC1051240dSk, 790));
                                            c1749280vcc.setStatus(c1722300uv6);
                                            C1749280vcc c1749280vcc2 = this.LLILLL;
                                            if (c1749280vcc2 == null) {
                                                c1749280vcc2 = null;
                                            }
                                            int iLIZIZ2 = C20736316Cj.LIZIZ(com.zhiliaoapp.musically.R.attr.bx, c1749280vcc2.getContext());
                                            C1749280vcc c1749280vcc3 = this.LLILLL;
                                            if (c1749280vcc3 == null) {
                                                c1749280vcc3 = null;
                                            }
                                            c1749280vcc3.setBackgroundColor(iLIZIZ2);
                                            C1749280vcc c1749280vcc4 = this.LLILLL;
                                            if (c1749280vcc4 == null) {
                                                c1749280vcc4 = null;
                                            }
                                            C786410Ut5.LLLZLZ(c1749280vcc4, 0);
                                            C1749280vcc c1749280vcc5 = this.LLILLL;
                                            if (c1749280vcc5 == null) {
                                                c1749280vcc5 = null;
                                            }
                                            c1749280vcc5.setBackgroundColor(iLIZIZ2);
                                            C1749280vcc c1749280vcc6 = this.LLILLL;
                                            if (c1749280vcc6 == null) {
                                                c1749280vcc6 = null;
                                            }
                                            C786410Ut5.U6(c1749280vcc6, new ViewGroup.LayoutParams(-1, this.LLILLJJLI));
                                            C1749280vcc c1749280vcc7 = this.LLILLL;
                                            if (c1749280vcc7 == null) {
                                                return null;
                                            }
                                            return c1749280vcc7;
                                        }
                                    });
                                    ((HashMap) c760370TsBLIZ.LIZ).put("loading_height_in_adaptive_mode", String.valueOf(i));
                                }
                            } catch (Exception e3) {
                                TryCatchGuardChecker.doCheck(e3);
                            }
                        }
                        sheetOptions.LIZ(0, null);
                    }
                    c760370TsBLIZ.LJIIIIZZ("bottom");
                    c760370TsBLIZ.LJIJJLI("none");
                } else {
                    z2 = true;
                    ((HashMap) c760370TsBLIZ.LIZ).put("enable_pull_down_close", CardStruct.IStatusCode.DEFAULT);
                    ((HashMap) c760370TsBLIZ.LIZ).remove("height");
                    int iLJJI2 = (int) C497740JfY.LJJI(C1911190zpl.LIZ(context));
                    c760370TsBLIZ.LJIILLIIL(iLJJI2, EnumC760350Ts9.DP);
                    c760370TsBLIZ.LJIILJJIL(iLJJI2, EnumC760350Ts9.DP);
                    ((HashMap) c760370TsBLIZ.LIZ).remove("min_margin_top");
                    if (C497740JfY.LJJ()) {
                        c760370TsBLIZ.LJIILIIL("left");
                    } else {
                        c760370TsBLIZ.LJIILIIL("right");
                    }
                    c760370TsBLIZ.LJIILL("none");
                }
                sparkContextWZ0.LJJLIIJ(c760370TsBLIZ.LIZ().toString());
                sparkContextWZ0.LJJLIIIJJIZ(new InterfaceC1554220qY0() { // from class: X.0zpf
                    @Override // X.InterfaceC1554220qY0
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJII() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIIIIZZ() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIIIZ() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIIJ() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIIJJI(SparkPopup sparkPopup, LayoutInflater layoutInflater) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIIL(SparkPopup sparkPopup, Configuration configuration) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIILJJIL(SparkPopup sparkPopup) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIILLIIL() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIIZILJ(SparkPopup sparkPopup) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIJ() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final boolean LJIJI(SparkPopup sparkPopup) {
                        return false;
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final boolean LJIJJ(SparkPopup sparkPopup) {
                        return false;
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIL(SparkPopup sparkPopup) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJJ() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJJIFFI(SparkPopup sparkPopup) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJJII() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final boolean LJJIII(SparkPopup sparkPopup, SparkContext sparkContext) {
                        return false;
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJJIIJ(SparkPopup sparkPopup) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJJIIJZLJL(SparkPopup sparkPopup, boolean z7) {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJJIIZI() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void onViewAttachedToWindow() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void onViewDetachedFromWindow() {
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJJIIZ() {
                        C20484615Do c20484615Do = c1911150zph.LLILZLL;
                        if (c20484615Do != null) {
                            c20484615Do.LIZ(2);
                        }
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJJI(SparkPopup sparkPopup) {
                        C1911150zph c1911150zph2 = c1911150zph;
                        C20484615Do c20484615Do = c1911150zph2.LLILZLL;
                        if (c20484615Do != null) {
                            c20484615Do.LJIIL(c1911150zph2);
                        }
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIILIIL(SparkPopup sparkPopup, View view) {
                        C1912890zsV c1912890zsV;
                        if (sheetOptions.fullscreenEnabled && (c1912890zsV = sparkPopup.LLJJIII) != null) {
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1912890zsV);
                            c1912890zsV.setAlpha(1.0f);
                        }
                        C464790IKn.LIZ.LIZLLL(c1911150zph);
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIILL(SparkPopup sparkPopup, int i2) throws JSONException {
                        boolean z7;
                        C20484615Do c20484615Do;
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("container_id", sparkContextWZ0.containerId);
                        jSONObject.put("new_state", i2);
                        C389001fE.LIZ("sheet_on_state_change", jSONObject, System.currentTimeMillis(), false);
                        C1911150zph c1911150zph2 = c1911150zph;
                        if (i2 == 3) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        c1911150zph2.LLIZ = z7;
                        C464790IKn.LIZ.LJI();
                        if (i2 == 5 && (c20484615Do = c1911150zph.LLILZLL) != null) {
                            c20484615Do.LIZ(3);
                        }
                    }

                    @Override // X.InterfaceC1554220qY0
                    public final void LJIJJLI(SparkPopup sparkPopup, float f) throws JSONException {
                        C1912890zsV c1912890zsV;
                        if (sheetOptions.fullscreenEnabled && (c1912890zsV = sparkPopup.LLJJIII) != null) {
                            float fMax = Math.max(0.0f, 1 - f);
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1912890zsV);
                            c1912890zsV.setAlpha(fMax);
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("container_id", sparkContextWZ0.containerId);
                        jSONObject.put("slide_offset", Float.valueOf(f));
                        C389001fE.LIZ("sheet_on_slide", jSONObject, System.currentTimeMillis(), false);
                    }
                });
                if ((context instanceof MutableContextWrapper) || (contextLIZ2 = C500260Jjc.LIZ(context)) == null) {
                    contextLIZ2 = context;
                }
                C1541950qED.LIZJ.getClass();
                final SparkPopup sparkPopupLIZJ = new C1541950qED(contextLIZ2, sparkContextWZ0).LIZJ();
                sparkPopupLIZJ.LLLII = true;
                c1911150zph.LLILZIL = sparkPopupLIZJ;
                if (!z6) {
                    c760370TsBLIZ.LJJIFFI("show_go_back", "1");
                }
                String strLIZIZ4 = c760370TsBLIZ.LIZIZ("silent_load_type");
                if (Intrinsics.LJFF(strLIZIZ4, "2")) {
                    sparkPopupLIZJ.hS(context, sparkContextWZ0, new InterfaceC1538950q9N() { // from class: X.0zpg
                        @Override // X.InterfaceC1538950q9N
                        public final void LJJIZ() {
                        }

                        @Override // X.InterfaceC1538950q9N
                        public final void LJJJ(C1542120qEU c1542120qEU) {
                        }
                    });
                    sparkContextWZ0.LJJ(SparkPopup.class, sparkPopupLIZJ);
                    sparkContextWZ0.LJJ(InterfaceC1530220pvI.class, new InterfaceC1530220pvI() { // from class: X.0zpe
                        @Override // X.InterfaceC1530220pvI
                        public final void LIZ() {
                            C1911190zpl c1911190zpl = C1911190zpl.LIZ;
                            boolean z7 = z6;
                            C1911150zph c1911150zph2 = c1911150zph;
                            SparkContext sparkContext = sparkContextWZ0;
                            Context context2 = context;
                            String str2 = string;
                            c1911190zpl.getClass();
                            C1911190zpl.LIZIZ(z7, c1911150zph2, sparkContext, context2, str2);
                        }
                    });
                } else if (Intrinsics.LJFF(strLIZIZ4, "1")) {
                    sparkPopupLIZJ.hS(context, sparkContextWZ0, new InterfaceC1538950q9N() { // from class: X.0zpd
                        public boolean LIZ;

                        @Override // X.InterfaceC1538950q9N
                        public final void LJJIZ() {
                            if (this.LIZ) {
                                return;
                            }
                            if (!sparkPopupLIZJ.nS()) {
                                C1911190zpl c1911190zpl = C1911190zpl.LIZ;
                                boolean z7 = z6;
                                C1911150zph c1911150zph2 = c1911150zph;
                                SparkContext sparkContext = sparkContextWZ0;
                                Context context2 = context;
                                String str2 = string;
                                c1911190zpl.getClass();
                                C1911190zpl.LIZIZ(z7, c1911150zph2, sparkContext, context2, str2);
                            }
                            this.LIZ = true;
                        }

                        @Override // X.InterfaceC1538950q9N
                        public final void LJJJ(C1542120qEU c1542120qEU) {
                            if (!this.LIZ) {
                                if (!sparkPopupLIZJ.nS()) {
                                    C1911190zpl c1911190zpl = C1911190zpl.LIZ;
                                    boolean z7 = z6;
                                    C1911150zph c1911150zph2 = c1911150zph;
                                    SparkContext sparkContext = sparkContextWZ0;
                                    Context context2 = context;
                                    String str2 = string;
                                    c1911190zpl.getClass();
                                    C1911190zpl.LIZIZ(z7, c1911150zph2, sparkContext, context2, str2);
                                }
                                this.LIZ = true;
                            }
                        }
                    });
                } else {
                    C1911190zpl.LIZIZ(z6, c1911150zph, sparkContextWZ0, context, string);
                }
            }
            if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest() && z && !z2 && LivePanelFrameworkSetting.getValue().enableLivePanelFramework) {
                if (!C13LP.LJJJJ(C1107580evc.LIZ(UriProtector.parse(sparkContextWZ0.LJIJI())), LivePanelFrameworkSetting.getValue().blockList) && C500260Jjc.LJJIIZ(LivePanelFrameworkSetting.getValue().guidePage) && !Intrinsics.LJFF(C1107580evc.LIZ(uriLJJJZ), C1107580evc.LIZ(UriProtector.parse(LivePanelFrameworkSetting.getValue().guidePage)))) {
                    YC1(context, LivePanelFrameworkSetting.getValue().guidePage, null);
                }
            }
            return sparkContextWZ0;
        }
        z = false;
        z2 = false;
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        if ((context instanceof MutableContextWrapper) || (contextLIZ = C500260Jjc.LIZ(context)) == null) {
            contextLIZ = context;
        }
        c1537900q7g.getClass();
        new C1541950qED(contextLIZ, sparkContextWZ0).LIZIZ();
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
            if (!C13LP.LJJJJ(C1107580evc.LIZ(UriProtector.parse(sparkContextWZ0.LJIJI())), LivePanelFrameworkSetting.getValue().blockList)) {
                YC1(context, LivePanelFrameworkSetting.getValue().guidePage, null);
            }
        }
        return sparkContextWZ0;
    }

    @Override // com.bytedance.android.live.browser.IHybridContainerService
    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB DU1(Context context, String str, LifecycleOwner lifecycleOwner, boolean z, Function1<? super SparkContext, Unit> function1) {
        C19EG c19egLIZ;
        C1105180erk.LIZ.getClass();
        C1105180erk.LIZ(str);
        SparkContext sparkContextWZ0 = wZ0(str, null);
        if (LiveHybridContainerBindLifecycleOwnerSetting.INSTANCE.getValue()) {
            sparkContextWZ0.lifecycleOwner = lifecycleOwner;
            sparkContextWZ0.autoDestroyDelayTimeInMillSeconds = 0L;
        }
        if (function1 != null) {
            function1.invoke(sparkContextWZ0);
        }
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        if (!(context instanceof MutableContextWrapper) && (c19egLIZ = C500260Jjc.LIZ(context)) != null) {
            context = c19egLIZ;
        }
        c1537900q7g.getClass();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(context, sparkContextWZ0).LIZ(false);
        if (z) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJIIIIZZ();
        }
        return sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
    }

    @Override // com.bytedance.android.live.browser.IHybridContainerService
    public final InterfaceC1541990qEH NN(Context context, String str, LifecycleOwner lifecycleOwner, boolean z, Function1<? super SparkContext, Unit> function1) {
        C19EG c19egLIZ;
        C1105180erk.LIZ.getClass();
        C1105180erk.LIZ(str);
        SparkContext sparkContextWZ0 = wZ0(str, lifecycleOwner);
        if (function1 != null) {
            function1.invoke(sparkContextWZ0);
        }
        if (!(context instanceof MutableContextWrapper) && (c19egLIZ = C500260Jjc.LIZ(context)) != null) {
            context = c19egLIZ;
        }
        InterfaceC1541990qEH interfaceC1541990qEHLIZ = LIZ(sparkContextWZ0, context);
        if (z && interfaceC1541990qEHLIZ != null) {
            ((C1537720q7O) interfaceC1541990qEHLIZ).load();
        }
        return interfaceC1541990qEHLIZ;
    }

    @Override // com.bytedance.android.live.browser.IHybridContainerService
    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB Vn2(Context context, String str, LifecycleOwner lifecycleOwner, String str2, boolean z, Function2<? super SparkContext, ? super Integer, Unit> function2) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) LIZIZ(context, C1547760qNa.LIZIZ(str), str2);
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            SparkContext sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext();
            if (sparkContext != null && function2 != null) {
                function2.invoke(sparkContext, Integer.valueOf(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getOptimization()));
            }
            return sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        }
        SparkContext sparkContextWZ0 = wZ0(str, null);
        if (LiveHybridContainerBindLifecycleOwnerSetting.INSTANCE.getValue()) {
            sparkContextWZ0.lifecycleOwner = lifecycleOwner;
            sparkContextWZ0.autoDestroyDelayTimeInMillSeconds = 0L;
        }
        if (function2 != null) {
            function2.invoke(sparkContextWZ0, 0);
        }
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        if (!(context instanceof MutableContextWrapper)) {
            C19EG c19egLIZ = C500260Jjc.LIZ(context);
            if (c19egLIZ != null) {
                context = c19egLIZ;
            }
            context = new MutableContextWrapper(context);
        }
        c1537900q7g.getClass();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(context, sparkContextWZ0).LIZ(false);
        if (z) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJIIIIZZ();
        }
        return sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
    }

    @Override // com.bytedance.android.live.browser.IHybridContainerService
    public final InterfaceC1541990qEH bD0(C19EG c19eg, String str, LifecycleOwner lifecycleOwner, String str2, boolean z, Function2 function2) {
        C1537720q7O c1537720q7O = (C1537720q7O) LIZIZ(c19eg, C1547760qNa.LIZIZ(str), str2);
        if (c1537720q7O != null) {
            C1537480q70 hybridContext = c1537720q7O.getHybridContext();
            if ((hybridContext instanceof SparkContext) && hybridContext != null && function2 != null) {
                function2.invoke(hybridContext, Integer.valueOf(c1537720q7O.getOptimization()));
            }
            return c1537720q7O;
        }
        SparkContext sparkContextWZ0 = wZ0(str, lifecycleOwner);
        if (function2 != null) {
            function2.invoke(sparkContextWZ0, 0);
        }
        boolean z2 = c19eg instanceof MutableContextWrapper;
        Context mutableContextWrapper = c19eg;
        if (!z2) {
            C19EG c19egLIZ = C500260Jjc.LIZ(c19eg);
            C19EG c19eg2 = c19eg;
            if (c19egLIZ != null) {
                c19eg2 = c19egLIZ;
            }
            mutableContextWrapper = new MutableContextWrapper(c19eg2);
        }
        InterfaceC1541990qEH interfaceC1541990qEHLIZ = LIZ(sparkContextWZ0, mutableContextWrapper);
        if (z && interfaceC1541990qEHLIZ != null) {
            ((C1537720q7O) interfaceC1541990qEHLIZ).load();
        }
        return interfaceC1541990qEHLIZ;
    }
}
