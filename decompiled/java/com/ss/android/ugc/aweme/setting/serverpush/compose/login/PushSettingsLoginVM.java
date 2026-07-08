package com.ss.android.ugc.aweme.setting.serverpush.compose.login;

import X.AbstractC20306114ct;
import X.C01GW;
import X.C09JN;
import X.C10EU;
import X.C11NZ;
import X.C11S5;
import X.C1244200iTy;
import X.C1244210iTz;
import X.C1244220iU0;
import X.C1244260iU4;
import X.C1244360iUE;
import X.C1244380iUG;
import X.C1244400iUI;
import X.C1245220iVc;
import X.C1245240iVe;
import X.C1246660iXw;
import X.C1336205Ku;
import X.C13LP;
import X.C15438062q;
import X.C16HS;
import X.C1701940uOG;
import X.C1750480veY;
import X.C19279610bi;
import X.C19296910eV;
import X.C19328310jZ;
import X.C19476011Hq;
import X.C1954807lC;
import X.C20304914ch;
import X.C20305314cl;
import X.C20305514cn;
import X.C20305714cp;
import X.C20305914cr;
import X.C20306014cs;
import X.C20306314cv;
import X.C20642515q3;
import X.C20684815ws;
import X.C20694515yR;
import X.C20694615yS;
import X.C20694815yU;
import X.C20694915yV;
import X.C20695715yd;
import X.C20695815ye;
import X.C20696015yg;
import X.C20696115yh;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C300790Bqf;
import X.C419910GdJ;
import X.C452501pT;
import X.C824390WVp;
import X.C824420WVs;
import X.C844470XAv;
import X.C896370ZEl;
import X.EnumC1216700hlc;
import X.EnumC20615215le;
import X.InterfaceC0148002o;
import X.InterfaceC1487280oo2;
import X.InterfaceC1891350zJl;
import X.InterfaceC953020auK;
import Y.ACallableS1S1001000_28;
import Y.ACallableS431S0100000_28;
import Y.ACallableS98S0101000_28;
import Y.AfS187S0100000_18;
import Y.AfS195S0100000_26;
import Y.AfS197S0100000_28;
import Y.AfS199S0100000_30;
import Y.AkS481S0100000_19;
import android.content.Context;
import android.os.Build;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import com.ss.android.ugc.aweme.setting.serverpush.IPushSettingService;
import com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import com.ss.android.ugc.aweme.setting.serverpush.compose.login.PushSettingsLoginVM;
import com.ss.android.ugc.aweme.setting.serverpush.model.BatchUpdatePushSwitchesResp;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushCategory;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushItem;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSelectedSubPage;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSelectedSubPageItem;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettingDynamicUI;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.setting.serverpush.model.ShouldShowEdmPopupResp;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS136S0101000_30;
import kotlin.jvm.internal.AwS239S0300000_30;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS82S0210000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class PushSettingsLoginVM extends AssemViewModel<C20304914ch> {
    public final C01GW LL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(261));
    public String LLILLJJLI = "";
    public final ConcurrentHashMap<String, HashSet<String>> LLILLL = new ConcurrentHashMap<>();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C20304914ch(0);
    }

    public final void zQ2() {
        C11NZ c11nzLJJJJZ;
        setState(AFwS274S0000000_30.get$arr$(76));
        C19476011Hq c19476011HqLJJLIIIIJ = C11NZ.LJJJJI(new Callable() { // from class: X.0iXx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("PushSettingsLoginVM@db7f.requestSettingsDynamicUI$1");
                PushSettingDynamicUI pushSettingDynamicUILJ = PushSettingsApiManager.LJ();
                C1C7U.LIZIZ("PushSettingsLoginVM@db7f.requestSettingsDynamicUI$1");
                return pushSettingDynamicUILJ;
            }
        }).LJJIJIIJIL(new C09JN() { // from class: X.0iY0
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PushSettingsLoginVM@db7f.requestSettingsDynamicUI$2");
                ((IPushSettingService) ServiceManager.get().getService(IPushSettingService.class)).LJFF((PushSettingDynamicUI) obj);
                C1C7U.LIZIZ("PushSettingsLoginVM@db7f.requestSettingsDynamicUI$2");
            }
        }).LJJLIIIIJ(new InterfaceC1487280oo2() { // from class: X.10ja
            /* JADX WARN: Type inference failed for: r1v1, types: [X.0NCZ] */
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                PushSettingDynamicUI pushSettingDynamicUILIZ = ((IPushSettingService) ServiceManager.get().getService(IPushSettingService.class)).LIZ();
                if (pushSettingDynamicUILIZ == null) {
                    return new C19328510jb(new Exception("request settings dynamic ui error", th) { // from class: X.0NCZ
                        public static final int $stable = 8;
                        public final String LL;
                        public final Throwable LLILLJJLI;

                        @Override // java.lang.Throwable
                        public String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(super.toString());
                            sbLIZ.append(this.LLILLJJLI);
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        public final String getMsg() {
                            return this.LL;
                        }

                        {
                            super(str);
                            this.LL = str;
                            this.LLILLJJLI = th;
                        }
                    });
                }
                return pushSettingDynamicUILIZ;
            }
        });
        C19476011Hq c19476011HqLJJLIIIIJ2 = C11NZ.LJJJJI(new Callable() { // from class: X.0iXy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("PushSettingsLoginVM@db7f.requestPushSettings$1");
                PushSettings pushSettingsLJI = PushSettingsApiManager.LJI();
                C1C7U.LIZIZ("PushSettingsLoginVM@db7f.requestPushSettings$1");
                return pushSettingsLJI;
            }
        }).LJJIJIIJIL(new C09JN() { // from class: X.06C0
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PushSettingsLoginVM@db7f.requestPushSettings$2");
                C19328310jZ.LIZIZ.LIZIZ((PushSettings) obj);
                C1C7U.LIZIZ("PushSettingsLoginVM@db7f.requestPushSettings$2");
            }
        }).LJJLIIIIJ(new InterfaceC1487280oo2() { // from class: X.15yf
            /* JADX WARN: Type inference failed for: r1v0, types: [X.0NCY] */
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                PushSettings pushSettingsLJ = C19328310jZ.LIZIZ.LJ();
                if (pushSettingsLJ == null) {
                    return new C20696215yi(new Exception("request push settings error", th) { // from class: X.0NCY
                        public static final int $stable = 8;
                        public final String LL;
                        public final Throwable LLILLJJLI;

                        @Override // java.lang.Throwable
                        public String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(super.toString());
                            sbLIZ.append(this.LLILLJJLI);
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        public final String getMsg() {
                            return this.LL;
                        }

                        {
                            super(str);
                            this.LL = str;
                            this.LLILLJJLI = th;
                        }
                    });
                }
                return pushSettingsLJ;
            }
        });
        if (C300790Bqf.LIZ()) {
            IPushSettingService iPushSettingService = (IPushSettingService) PluggableExtentionKt.pluggableSpi$default(IPushSettingService.class, false, false, false, 14, null);
            c11nzLJJJJZ = C11NZ.LJJJJI(new ACallableS431S0100000_28(iPushSettingService, 36)).LJJIJIIJIL(new AfS197S0100000_28(iPushSettingService, 90)).LJJLIIIIJ(new AkS481S0100000_19(iPushSettingService, 14));
        } else {
            c11nzLJJJJZ = C11NZ.LJJJJZ(new C1246660iXw(0, 0));
        }
        disposeOnClear(C11NZ.LJLLI(c19476011HqLJJLIIIIJ, c19476011HqLJJLIIIIJ2, c11nzLJJJJZ, new InterfaceC953020auK() { // from class: X.15yc
            @Override // X.InterfaceC953020auK
            public final Object LIZ(Object obj, Object obj2, Object obj3) throws C0NCZ, C0NCY {
                PushSettingDynamicUI pushSettingDynamicUI = (PushSettingDynamicUI) obj;
                PushSettings pushSettings = (PushSettings) obj2;
                C1246660iXw c1246660iXw = (C1246660iXw) obj3;
                if (!(pushSettings instanceof C20696215yi)) {
                    if (!(pushSettingDynamicUI instanceof C19328510jb)) {
                        if (C300790Bqf.LIZ()) {
                            C19328310jZ.LIZIZ.LJII(c1246660iXw.LIZIZ, c1246660iXw.LIZ);
                        }
                        this.LIZ.getClass();
                        return PushSettingsLoginVM.BQ2(pushSettingDynamicUI, false, "");
                    }
                    throw ((C19328510jb) pushSettingDynamicUI).LIZ;
                }
                throw ((C20696215yi) pushSettings).LL;
            }
        }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS199S0100000_30(this, 0), new AfS187S0100000_18(this, 40)));
    }

    public final void AQ2(AbstractC20306114ct abstractC20306114ct) {
        C20694915yV c20694915yV;
        if (abstractC20306114ct instanceof C20306014cs) {
            C20306014cs c20306014cs = (C20306014cs) abstractC20306114ct;
            Context context = c20306014cs.LIZ;
            C20694815yU c20694815yU = c20306014cs.LIZIZ;
            boolean z = c20306014cs.LIZJ;
            String str = c20306014cs.LIZLLL;
            Object obj = c20694815yU.LLJJIJI;
            if ((obj instanceof C20694915yV) && (c20694915yV = (C20694915yV) obj) != null) {
                String str2 = c20694915yV.LIZ;
                boolean z2 = !c20694915yV.LIZ();
                if (c20694815yU.LLJJJ.LIZ() && !C824420WVs.LIZIZ(context, "click_push_switch")) {
                    return;
                }
                C19279610bi.LIZ.getClass();
                C19279610bi.LIZJ(str2, z2);
                if (Build.VERSION.SDK_INT >= 26 && c20694815yU.LLJJJ.LIZ() && !C824420WVs.LIZ(str2)) {
                    C824420WVs.LJ(context, str2);
                    return;
                }
                c20694915yV.LIZIZ = z2;
                C1245240iVe c1245240iVe = C1245240iVe.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("itemId: ");
                sbLIZ.append(c20694815yU.LLJJJ.itemId);
                sbLIZ.append(", item.isChecked is ");
                sbLIZ.append(c20694915yV.LIZ());
                sbLIZ.append(", set to: ");
                sbLIZ.append(z2);
                C2188811AlT.LIZIZ(sbLIZ);
                c1245240iVe.getClass();
                xQ2(this, true, null, new AwS82S0210000_31(c20694815yU, z2, c20694915yV, 6), 2);
                wQ2(z2 ? 1 : 0, str2, str, z);
                return;
            }
            return;
        }
        if (abstractC20306114ct instanceof C20696115yh) {
            C20696115yh c20696115yh = (C20696115yh) abstractC20306114ct;
            wQ2(c20696115yh.LIZIZ, c20696115yh.LIZ, c20696115yh.LIZLLL, c20696115yh.LIZJ);
            return;
        }
        if (abstractC20306114ct instanceof C1245220iVc) {
            C1245220iVc c1245220iVc = (C1245220iVc) abstractC20306114ct;
            yQ2(c1245220iVc.LIZIZ, c1245220iVc.LIZ);
            return;
        }
        if (abstractC20306114ct instanceof C20306314cv) {
            C20306314cv c20306314cv = (C20306314cv) abstractC20306114ct;
            final PushItem pushItem = c20306314cv.LIZ;
            final PushSelectedSubPageItem pushSelectedSubPageItem = c20306314cv.LIZIZ;
            final boolean z3 = c20306314cv.LIZJ;
            C1245240iVe c1245240iVe2 = C1245240iVe.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onPushOptionChanged() - ");
            sbLIZ2.append(pushSelectedSubPageItem);
            C2188811AlT.LIZIZ(sbLIZ2);
            c1245240iVe2.getClass();
            if (!Intrinsics.LJFF(pushItem.itemId, "im_voice_call_push") && !Intrinsics.LJFF(pushItem.itemId, "in_app_im_voice_call_push")) {
                StringBuilder sb = new StringBuilder();
                sb.append(pushItem.itemId);
                sb.append(",");
                sb.append(pushSelectedSubPageItem.fieldValue);
                String str3 = pushItem.selectField;
                int iIntValue = 0;
                if (str3 != null && str3.length() != 0) {
                    sb.append(",");
                    sb.append(pushItem.selectField);
                    sb.append(",");
                    Integer num = pushSelectedSubPageItem.selectFieldValue;
                    if (num != null) {
                        iIntValue = num.intValue();
                    }
                    sb.append(iIntValue);
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("updateOptionChange(");
                sbLIZ3.append((Object) sb);
                sbLIZ3.append(')');
                C2188811AlT.LIZIZ(sbLIZ3);
                final String string = sb.toString();
                disposeOnClear(C11NZ.LJJJJI(new Callable() { // from class: X.10bU
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C1C7U.LIZ("PushSettingsLoginVM@db7f.requestPushSettingBatchChange$1");
                        BatchUpdatePushSwitchesResp batchUpdatePushSwitchesRespLIZIZ = PushSettingsApiManager.LIZIZ(string, Boolean.FALSE, null);
                        C1C7U.LIZIZ("PushSettingsLoginVM@db7f.requestPushSettingBatchChange$1");
                        return batchUpdatePushSwitchesRespLIZIZ;
                    }
                }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.15yb
                    @Override // X.C09JN
                    public final void accept(Object obj2) {
                        C1C7U.LIZ("PushSettingsLoginVM@db7f.requestPushSettingBatchChange$2");
                        Map<String, Integer> map = ((BatchUpdatePushSwitchesResp) obj2).updatedSwitches;
                        C1245240iVe.LIZ.getClass();
                        if (map != null && !map.isEmpty() && map != null) {
                            Integer num2 = map.get(pushItem.itemId);
                            Integer num3 = map.get(pushItem.selectField);
                            if (num2 != null) {
                                C19328310jZ c19328310jZ = C19328310jZ.LIZIZ;
                                c19328310jZ.f6(num2.intValue(), pushItem.itemId);
                                String str4 = pushItem.selectField;
                                if (str4 != null && num3 != null) {
                                    c19328310jZ.f6(num3.intValue(), str4);
                                }
                                this.setState(new AwS239S0300000_30(pushItem, num2, num3, 17));
                                if (!z3 && Intrinsics.LJFF(pushItem.itemId, "im_push")) {
                                    PushSettingsLoginVM pushSettingsLoginVM = this;
                                    pushSettingsLoginVM.getClass();
                                    PushSettingsLoginVM.xQ2(pushSettingsLoginVM, false, new AwS397S0200000_31((Map) map, (Map<String, Integer>) pushSettingsLoginVM, (PushSettingsLoginVM) 133), new AwS610S0100000_31(map, (Map<String, EnumC20615215le>) 562), 1);
                                }
                                C1245240iVe.LIZJ(num2.intValue(), num3, pushItem.itemId);
                            }
                        }
                        C1C7U.LIZIZ("PushSettingsLoginVM@db7f.requestPushSettingBatchChange$2");
                    }
                }, new C09JN() { // from class: X.0gIM
                    @Override // X.C09JN
                    public final void accept(Object obj2) {
                        C1C7U.LIZ("PushSettingsLoginVM@db7f.requestPushSettingBatchChange$3");
                        Throwable th = (Throwable) obj2;
                        C1245240iVe c1245240iVe3 = C1245240iVe.LIZ;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("onBatchChangeFailed(");
                        sbLIZ4.append(C2252408s6.LIZIZ(th));
                        sbLIZ4.append(": ");
                        sbLIZ4.append(th.getMessage());
                        sbLIZ4.append(')');
                        C2188811AlT.LIZIZ(sbLIZ4);
                        c1245240iVe3.getClass();
                        C1C7U.LIZIZ("PushSettingsLoginVM@db7f.requestPushSettingBatchChange$3");
                    }
                }));
                return;
            }
            final int i = pushSelectedSubPageItem.fieldValue;
            disposeOnClear(C11NZ.LJJJJI(new ACallableS98S0101000_28(pushItem, i, 2)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.15ya
                @Override // X.C09JN
                public final void accept(Object obj2) {
                    int iIntValue2;
                    C1C7U.LIZ("PushSettingsLoginVM@db7f.requestVoiceCallSettingChange$2");
                    if (((Boolean) obj2).booleanValue()) {
                        String str4 = pushItem.itemId;
                        C19328310jZ c19328310jZ = C19328310jZ.LIZIZ;
                        c19328310jZ.f6(i, str4);
                        int iIntValue3 = 0;
                        if (Intrinsics.LJFF(pushItem.itemId, "im_voice_call_push")) {
                            iIntValue2 = i;
                        } else {
                            Integer numValueOf = Integer.valueOf(c19328310jZ.LIZLLL("im_voice_call_push"));
                            if (numValueOf.intValue() != -1) {
                                iIntValue2 = numValueOf.intValue();
                            } else {
                                iIntValue2 = 0;
                            }
                        }
                        if (Intrinsics.LJFF(pushItem.itemId, "in_app_im_voice_call_push")) {
                            iIntValue3 = i;
                        } else {
                            Integer numValueOf2 = Integer.valueOf(c19328310jZ.LIZLLL("in_app_im_voice_call_push"));
                            if (numValueOf2.intValue() != -1) {
                                iIntValue3 = numValueOf2.intValue();
                            }
                        }
                        c19328310jZ.LJII(iIntValue2, iIntValue3);
                        this.setState(new AwS136S0101000_30(pushItem, i, 5));
                        PushSettingsLoginVM.xQ2(this, true, null, new AwS397S0200000_31(pushItem, pushSelectedSubPageItem, 134), 2);
                        C1245240iVe c1245240iVe3 = C1245240iVe.LIZ;
                        String str5 = pushItem.itemId;
                        int i2 = i;
                        c1245240iVe3.getClass();
                        C1245240iVe.LIZJ(i2, null, str5);
                    } else {
                        this.setState(AFwS276S0000000_31.get$arr$(362));
                    }
                    C1C7U.LIZIZ("PushSettingsLoginVM@db7f.requestVoiceCallSettingChange$2");
                }
            }, new AfS187S0100000_18(this, 91)));
            return;
        }
        if (abstractC20306114ct instanceof C20305514cn) {
            C20305514cn c20305514cn = (C20305514cn) abstractC20306114ct;
            C1245240iVe c1245240iVe3 = C1245240iVe.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("onBatchChangeSuccess() - '");
            sbLIZ4.append(c20305514cn.LIZ.itemId);
            sbLIZ4.append("' select '");
            sbLIZ4.append(c20305514cn.LIZIZ);
            sbLIZ4.append('\'');
            C2188811AlT.LIZIZ(sbLIZ4);
            c1245240iVe3.getClass();
            xQ2(this, true, null, new AwS610S0100000_31(c20305514cn, 228), 2);
            return;
        }
        if (Intrinsics.LJFF(abstractC20306114ct, C1244210iTz.LIZ)) {
            setState(AFwS276S0000000_31.get$arr$(363));
            disposeOnClear(C11NZ.LJJJJI(new Callable() { // from class: X.10bg
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("PushSettingsLoginVM@db7f.requestShouldShowEdmPopup$2");
                    ShouldShowEdmPopupResp shouldShowEdmPopupRespLJIIZILJ = PushSettingsApiManager.LJIIZILJ();
                    C1C7U.LIZIZ("PushSettingsLoginVM@db7f.requestShouldShowEdmPopup$2");
                    return shouldShowEdmPopupRespLJIIZILJ;
                }
            }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIIJ(new C16HS(this, 6)).LJJLL(new AfS187S0100000_18(this, 92), new AfS187S0100000_18(this, 93)));
            return;
        }
        if (Intrinsics.LJFF(abstractC20306114ct, C1244200iTy.LIZ)) {
            setState(AFwS276S0000000_31.get$arr$(171));
            return;
        }
        if (Intrinsics.LJFF(abstractC20306114ct, C20305314cl.LIZ)) {
            setState(AFwS276S0000000_31.get$arr$(172));
        } else if (Intrinsics.LJFF(abstractC20306114ct, C20305714cp.LIZ)) {
            setState(AFwS276S0000000_31.get$arr$(173));
        } else {
            if (Intrinsics.LJFF(abstractC20306114ct, C20305914cr.LIZ)) {
                setState(AFwS276S0000000_31.get$arr$(174));
                return;
            }
            throw new C1954807lC();
        }
    }

    public static String vQ2(int i, PushCategory pushCategory) {
        C19279610bi.LIZ.getClass();
        if (C19279610bi.LIZIZ("friends_only_push") && pushCategory.LIZ && i == 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" · ");
            sbLIZ.append(C20642515q3.LJI(2131857314));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(pushCategory.categoryTitle);
            sbLIZ2.append(strLIZIZ);
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        return pushCategory.categoryTitle;
    }

    public final void yQ2(int i, String str) {
        disposeOnClear(C11NZ.LJJJJI(new ACallableS1S1001000_28(str, i, 1)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0gIN
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PushSettingsLoginVM@db7f.requestUpdatePushSetting$2");
                C1245240iVe.LIZ.getClass();
                C1C7U.LIZIZ("PushSettingsLoginVM@db7f.requestUpdatePushSetting$2");
            }
        }, new AfS187S0100000_18(this, 94)));
    }

    public static List BQ2(PushSettingDynamicUI pushSettingDynamicUI, boolean z, String str) {
        boolean z2;
        InterfaceC1891350zJl c20694615yS;
        PushSelectedSubPageItem next;
        String str2;
        boolean z3;
        List<PushSelectedSubPageItem> list;
        Integer num;
        boolean z4;
        List<PushCategory> list2 = pushSettingDynamicUI.categoryList;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
        for (PushCategory pushCategory : list2) {
            List<PushItem> list3 = pushCategory.itemList;
            ArrayList<PushItem> arrayList2 = new ArrayList();
            Iterator<PushItem> it2 = list3.iterator();
            while (true) {
                boolean z5 = false;
                if (it2.hasNext()) {
                    PushItem next2 = it2.next();
                    if (Intrinsics.LJFF(next2.itemId, "im_activity_status_push")) {
                        PrivacySettingsFeature imPrivacySettings = C1336205Ku.LIZ(false).getImPrivacySettings();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("createViewsFromSettings(IM_ACTIVE_STATUS_PUSH) - is U16: ");
                        sbLIZ.append(!imPrivacySettings.LJIJJ());
                        sbLIZ.append(", EXP showActivityStatus: ");
                        sbLIZ.append(C896370ZEl.LIZ());
                        C2188811AlT.LIZIZ(sbLIZ);
                        if (!imPrivacySettings.LJIJJ() || !C896370ZEl.LIZ()) {
                        }
                    }
                    arrayList2.add(next2);
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    for (PushItem pushItem : arrayList2) {
                        String str3 = "";
                        switch (pushItem.actionType) {
                            case 1:
                                C20694915yV c20694915yV = new C20694915yV(pushItem.itemId);
                                String str4 = pushItem.itemId;
                                boolean zLIZ = c20694915yV.LIZ();
                                String str5 = pushItem.display.title;
                                C419910GdJ c419910GdJLIZ = C20695715yd.LIZ(pushItem);
                                String str6 = pushItem.display.description;
                                boolean zLIZ2 = C19296910eV.LIZ(pushItem, z5, 6);
                                C19279610bi.LIZ.getClass();
                                c20694615yS = new C20694815yU(c419910GdJLIZ, pushItem, c20694915yV, str, str4, str5, str6, zLIZ, z, C19279610bi.LIZ(pushItem), zLIZ2);
                                break;
                            case 2:
                                String str7 = pushItem.itemId;
                                String str8 = pushItem.display.title;
                                C419910GdJ c419910GdJLIZ2 = C20695715yd.LIZ(pushItem);
                                C19279610bi.LIZ.getClass();
                                c20694615yS = new C1244400iUI(c419910GdJLIZ2, EnumC1216700hlc.NORMAL, pushItem, null, null, str7, str8, pushItem.display.description, true, z5, C19279610bi.LIZ(pushItem), z5, C20695715yd.LIZIZ(pushItem));
                                break;
                            case 3:
                                String str9 = pushItem.itemId;
                                String str10 = pushItem.display.title;
                                C419910GdJ c419910GdJLIZ3 = C20695715yd.LIZ(pushItem);
                                String str11 = pushItem.display.description;
                                boolean zLIZIZ = C20695715yd.LIZIZ(pushItem);
                                C19279610bi.LIZ.getClass();
                                c20694615yS = new C1244380iUG(c419910GdJLIZ3, EnumC1216700hlc.NORMAL, pushItem, null, null, str9, str10, str11, true, z5, C19279610bi.LIZ(pushItem), z5, zLIZIZ);
                                break;
                            case 4:
                                c20694615yS = new C1244360iUE(C20695715yd.LIZ(pushItem), EnumC1216700hlc.NORMAL, pushItem, null, null, pushItem.itemId, pushItem.display.title, pushItem.display.description, true, z5, true, z5, C20695715yd.LIZIZ(pushItem));
                                break;
                            case 5:
                                c20694615yS = new C1244220iU0(C20695715yd.LIZ(pushItem), EnumC1216700hlc.NORMAL, pushItem, null, null, pushItem.itemId, pushItem.display.title, pushItem.display.description, true, z5, true, z5, C20695715yd.LIZIZ(pushItem));
                                break;
                            case 6:
                                String str12 = pushItem.itemId;
                                String str13 = pushItem.display.title;
                                C844470XAv.LIZ.getClass();
                                c20694615yS = new C1244260iU4(C20695715yd.LIZ(pushItem), EnumC1216700hlc.NORMAL, pushItem, null, C844470XAv.LIZ().getString(2131847794), str12, str13, pushItem.display.description, true, z5, !C824390WVp.LIZJ(C844470XAv.LIZ()), z5, true);
                                break;
                            case 7:
                                String str14 = pushItem.itemId;
                                String str15 = pushItem.display.title;
                                C419910GdJ c419910GdJLIZ4 = C20695715yd.LIZ(pushItem);
                                String str16 = pushItem.display.description;
                                if (C20695715yd.LIZIZ(pushItem) && C19296910eV.LIZ(pushItem, z5, 6)) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                C19279610bi.LIZ.getClass();
                                c20694615yS = new C20694515yR(z5, str14, str15, c419910GdJLIZ4, pushItem, C19279610bi.LIZ(pushItem), str16, z4, 3215);
                                break;
                            case 8:
                                String str17 = pushItem.itemId;
                                String str18 = pushItem.display.title;
                                C419910GdJ c419910GdJLIZ5 = C20695715yd.LIZ(pushItem);
                                String str19 = pushItem.display.description;
                                String str20 = pushItem.itemId;
                                String str21 = pushItem.selectField;
                                PushSelectedSubPage pushSelectedSubPage = pushItem.selectSubPage;
                                if (pushSelectedSubPage != null) {
                                    list = pushSelectedSubPage.options;
                                } else {
                                    list = null;
                                }
                                if (str21 != null && list != null && !list.isEmpty()) {
                                    C19328310jZ c19328310jZ = C19328310jZ.LIZIZ;
                                    int iLIZLLL = c19328310jZ.LIZLLL(str20);
                                    int iLIZLLL2 = c19328310jZ.LIZLLL(str21);
                                    for (PushSelectedSubPageItem pushSelectedSubPageItem : list) {
                                        Integer numValueOf = Integer.valueOf(iLIZLLL2);
                                        if (iLIZLLL == pushSelectedSubPageItem.fieldValue && ((num = pushSelectedSubPageItem.selectFieldValue) == null || Intrinsics.LJFF(numValueOf, num))) {
                                            C1245240iVe c1245240iVe = C1245240iVe.LIZ;
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append(str20);
                                            sbLIZ2.append('-');
                                            sbLIZ2.append(str21);
                                            sbLIZ2.append('(');
                                            sbLIZ2.append(iLIZLLL);
                                            sbLIZ2.append(", ");
                                            sbLIZ2.append(iLIZLLL2);
                                            sbLIZ2.append("): ");
                                            sbLIZ2.append(pushSelectedSubPageItem.title);
                                            C2188811AlT.LIZIZ(sbLIZ2);
                                            c1245240iVe.getClass();
                                            str3 = pushSelectedSubPageItem.title;
                                        }
                                    }
                                    C1245240iVe c1245240iVe2 = C1245240iVe.LIZ;
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append(str20);
                                    sbLIZ3.append('-');
                                    sbLIZ3.append(str21);
                                    sbLIZ3.append('(');
                                    sbLIZ3.append(iLIZLLL);
                                    sbLIZ3.append(", ");
                                    sbLIZ3.append(iLIZLLL2);
                                    sbLIZ3.append("): Nothing selected!!!");
                                    C2188811AlT.LIZIZ(sbLIZ3);
                                    c1245240iVe2.getClass();
                                }
                                boolean zLIZIZ2 = C20695715yd.LIZIZ(pushItem);
                                C19279610bi.LIZ.getClass();
                                c20694615yS = new C20694615yS(c419910GdJLIZ5, pushItem, str3, str17, str18, str19, C19279610bi.LIZ(pushItem), zLIZIZ2);
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                String str22 = pushItem.itemId;
                                String str23 = pushItem.display.title;
                                C419910GdJ c419910GdJLIZ6 = C20695715yd.LIZ(pushItem);
                                String str24 = pushItem.display.description;
                                if (C20695715yd.LIZIZ(pushItem) && C19296910eV.LIZ(pushItem, z5, 6)) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                C19279610bi c19279610bi = C19279610bi.LIZ;
                                String str25 = pushItem.itemId;
                                c19279610bi.getClass();
                                c20694615yS = new C20694515yR(true, str22, str23, c419910GdJLIZ6, pushItem, C19279610bi.LIZIZ(str25), str24, z3, 3207);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                C844470XAv.LIZ.getClass();
                                List<PushSelectedSubPageItem> listLIZLLL = C824420WVs.LIZLLL(C844470XAv.LIZ());
                                int iLIZLLL3 = C19328310jZ.LIZIZ.LIZLLL(pushItem.itemId);
                                if (iLIZLLL3 != -1 && iLIZLLL3 != 0) {
                                    Iterator<PushSelectedSubPageItem> it3 = listLIZLLL.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            next = it3.next();
                                            if (next.fieldValue == iLIZLLL3) {
                                            }
                                        } else {
                                            next = null;
                                        }
                                    }
                                    PushSelectedSubPageItem pushSelectedSubPageItem2 = next;
                                    if (pushSelectedSubPageItem2 != null && (str2 = pushSelectedSubPageItem2.title) != null) {
                                        str3 = str2;
                                    } else {
                                        PushSelectedSubPageItem pushSelectedSubPageItem3 = (PushSelectedSubPageItem) C13LP.LJJJLL(listLIZLLL);
                                        if (pushSelectedSubPageItem3 != null) {
                                            str3 = pushSelectedSubPageItem3.title;
                                        }
                                    }
                                }
                                String str26 = pushItem.itemId;
                                String str27 = pushItem.display.title;
                                C419910GdJ c419910GdJLIZ7 = C20695715yd.LIZ(pushItem);
                                String str28 = pushItem.display.description;
                                boolean zLIZIZ3 = C20695715yd.LIZIZ(pushItem);
                                C19279610bi.LIZ.getClass();
                                c20694615yS = new C20694615yS(c419910GdJLIZ7, pushItem, str3, str26, str27, str28, C19279610bi.LIZ(pushItem), zLIZIZ3);
                                break;
                            default:
                                C20694915yV c20694915yV2 = new C20694915yV(pushItem.itemId);
                                String str29 = pushItem.itemId;
                                boolean zLIZ3 = c20694915yV2.LIZ();
                                String str30 = pushItem.display.title;
                                C419910GdJ c419910GdJLIZ8 = C20695715yd.LIZ(pushItem);
                                String str31 = pushItem.display.description;
                                boolean zLIZIZ4 = C20695715yd.LIZIZ(pushItem);
                                C19279610bi.LIZ.getClass();
                                c20694615yS = new C20694815yU(c419910GdJLIZ8, pushItem, c20694915yV2, str, str29, str30, str31, zLIZ3, z, C19279610bi.LIZ(pushItem), zLIZIZ4);
                                break;
                        }
                        arrayList3.add(c20694615yS);
                        z5 = false;
                    }
                    if (!arrayList3.isEmpty()) {
                        pushCategory.LIZ = true;
                    }
                    String strVQ2 = vQ2(C19328310jZ.LIZIZ.LIZLLL("friends_only_push"), pushCategory);
                    String str32 = pushCategory.categoryTips;
                    if (str32.length() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    arrayList.add(new C20696015yg(strVQ2, arrayList3, pushCategory, str32, z2));
                }
            }
        }
        return arrayList;
    }

    public final void wQ2(int i, String str, String str2, boolean z) {
        String str3;
        String str4;
        if (!z && i == 0 && !C10EU.LJIILIIL()) {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("show_feedback_dlg_4_push_off_reasons", false)) {
                C1750480veY c1750480veY = (C1750480veY) this.LL.getValue();
                c1750480veY.getClass();
                if (System.currentTimeMillis() >= c1750480veY.LIZ.getLong("key_next_push_off_dialog_showtime", 0L)) {
                    this.LLILLJJLI = str;
                    disposeOnClear(C11NZ.LJJJJI(new Callable() { // from class: X.0ztc
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            C1C7U.LIZ("PushSettingsLoginVM@db7f.requestPushOffReasons$1");
                            BaseResponse baseResponseLJIIIIZZ = PushSettingsApiManager.LJIIIIZZ();
                            C1C7U.LIZIZ("PushSettingsLoginVM@db7f.requestPushOffReasons$1");
                            return baseResponseLJIIIIZZ;
                        }
                    }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS195S0100000_26(this, 22), new AfS187S0100000_18(this, 90)));
                }
            }
        }
        C1245240iVe c1245240iVe = C1245240iVe.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" onPushSwitchStatus ");
        sbLIZ.append(str);
        sbLIZ.append(", status: ");
        sbLIZ.append(i);
        sbLIZ.append("....");
        C2188811AlT.LIZIZ(sbLIZ);
        c1245240iVe.getClass();
        if (!z) {
            C1245240iVe.LIZ(i, str);
        } else {
            if (i == 1) {
                str3 = "on";
            } else {
                str3 = "off";
            }
            if (Intrinsics.LJFF(str2, "in_app_push_setting")) {
                str4 = "inner_notification_switch";
            } else {
                str4 = "notification_switch";
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("label", str);
            c2344009Gk.LJIIIIZZ("to_status", str3);
            C20684815ws.LJIILLIIL(str4, c2344009Gk.LIZ);
        }
        C19328310jZ.LIZIZ.f6(i, str);
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair(str, Integer.valueOf(i)));
        xQ2(this, false, new AwS397S0200000_31(mapLIZJ, (Map<String, Integer>) this, (PushSettingsLoginVM) 133), new AwS610S0100000_31(mapLIZJ, (Map<String, EnumC20615215le>) 562), 1);
        yQ2(i, str);
    }

    public static void xQ2(PushSettingsLoginVM pushSettingsLoginVM, boolean z, AwS397S0200000_31 awS397S0200000_31, Function1 function1, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        Function1 function12 = awS397S0200000_31;
        if ((i & 2) != 0) {
            function12 = AFwS276S0000000_31.get$arr$(365);
        }
        pushSettingsLoginVM.getClass();
        pushSettingsLoginVM.withState(new C20695815ye(z, function12, pushSettingsLoginVM, function1));
    }
}
