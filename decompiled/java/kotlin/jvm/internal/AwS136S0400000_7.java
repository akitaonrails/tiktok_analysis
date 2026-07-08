package kotlin.jvm.internal;

import X.C09AY;
import X.C0ISJ;
import X.C0JFN;
import X.C0K0S;
import X.C0K26;
import X.C0K2F;
import X.C0K2H;
import X.C0K4S;
import X.C0KCK;
import X.C0KFM;
import X.C0KLA;
import X.C0KLD;
import X.C0KLH;
import X.C0KM4;
import X.C0KNJ;
import X.C0KNV;
import X.C0KNW;
import X.C0KOJ;
import X.C0KQW;
import X.C0KS0;
import X.C0KS3;
import X.C0KSC;
import X.C0KSE;
import X.C0KSF;
import X.C0KSH;
import X.C0KT0;
import X.C0KT2;
import X.C0KTA;
import X.C0KTB;
import X.C0KTD;
import X.C0UO0;
import X.C1161920gLG;
import X.C176600m4;
import X.C1789970wgF;
import X.C19748512Ol;
import X.C19EG;
import X.C2097608Jq;
import X.C480460Ism;
import X.C500260Jjc;
import X.C510560K0o;
import X.C510570K0p;
import X.C511370K3r;
import X.C512300K7g;
import X.C515950KLh;
import X.C516000KLm;
import X.C516050KLr;
import X.C516600KNu;
import X.C517640KRu;
import X.C517690KRz;
import X.C517840KSo;
import X.C518150KTt;
import X.C782110Um9;
import X.C786410Ut5;
import X.EnumC1792020wjY;
import X.EnumC510710K1d;
import X.InterfaceC2753014t;
import X.InterfaceC517900KSu;
import X.InterfaceC517920KSw;
import X.InterfaceC743640TFa;
import Y.AcS352S0200000_7;
import Y.AfS0S1200100_7;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.chatroom.api.SpaceActivityIndicator;
import com.bytedance.android.livesdk.chatroom.api.SpaceActivityInfo;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.api.FansClubApi;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.ui.SuperFanViewModel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.pgc.wallet.base.subscribe.PGCCreateContractResult;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.subscription.pgc.api.bridge.SubscriptionSceneContext;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.view.fragment.SubSpaceFeedDialogFragment;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS408S0200000_7;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import tikcast.api.fans.GetNonFansUserDataResponse;
import tikcast.api.fans.PolingSuperFanContractStatusResult;
import webcast.api.pgc_sub.PGCGetSubPrivilegeDetailResponse;
import webcast.data.RechargeCustomError;

/* JADX INFO: loaded from: classes8.dex */
public class AwS136S0400000_7 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS136S0400000_7 awS136S0400000_7) {
        C515950KLh c515950KLh = ((C516600KNu) awS136S0400000_7.l0).LIZJ;
        Activity activity = ((C0KFM) awS136S0400000_7.l1).LIZJ.get();
        C1789970wgF c1789970wgF = new C1789970wgF(((PGCCreateContractResult) awS136S0400000_7.l2).bizContent, new HashMap());
        final C516600KNu c516600KNu = (C516600KNu) awS136S0400000_7.l0;
        final String str = ((PGCCreateContractResult) awS136S0400000_7.l2).contractId;
        final C0KFM c0kfm = (C0KFM) awS136S0400000_7.l1;
        final Function1 function1 = (Function1) awS136S0400000_7.l3;
        c516600KNu.getClass();
        final C0KNW c0knw = new C0KNW(str, System.currentTimeMillis());
        C516050KLr c516050KLr = C516050KLr.LIZ;
        Integer numValueOf = Integer.valueOf(c0kfm.LJIIZILJ);
        C0KM4 c0km4 = C0KM4.IAP_STARTED;
        c516050KLr.getClass();
        C516050KLr.LIZJ(str, numValueOf, c0km4);
        C516000KLm.LIZ.getClass();
        C516000KLm.LIZIZ = 0L;
        c515950KLh.LIZIZ(activity, c1789970wgF, new C0KNV(c0knw, str, c516600KNu, function1) { // from class: X.0KMj
            public final /* synthetic */ String LJFF;
            public final /* synthetic */ C516600KNu LJI;
            public final /* synthetic */ Function1<C0KPG, Unit> LJII;

            @Override // X.InterfaceC518120KTq
            public final void LIZ(C0KPG c0kpg) throws JSONException {
                Object obj;
                String str2;
                int value;
                int i;
                C0KLW c0klw;
                int i2;
                String str3;
                Activity activity2;
                Application application;
                EnumC1792020wjY enumC1792020wjY;
                int i3;
                String str4;
                long jCurrentTimeMillis;
                int i4;
                Activity activity3;
                Application application2;
                C516000KLm c516000KLm = C516000KLm.LIZ;
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                c516000KLm.getClass();
                C516000KLm.LIZIZ = jCurrentTimeMillis2;
                if (C516500KNk.LIZ[c0kpg.LIZ.ordinal()] == 1) {
                    if (C516000KLm.LIZJ == 0) {
                        jCurrentTimeMillis = 0;
                    } else {
                        jCurrentTimeMillis = System.currentTimeMillis() - C516000KLm.LIZJ;
                    }
                    boolean zLIZ = this.LIZ.LIZ();
                    String str5 = this.LIZIZ.LIZ;
                    long jCurrentTimeMillis3 = System.currentTimeMillis() - this.LIZJ;
                    C0KNY c0kny = this.LIZ;
                    String str6 = c0kny.LIZLLL;
                    String str7 = c0kny.LIZIZ;
                    Map<String, String> map = this.LIZLLL;
                    c0kny.LIZJ.get();
                    C516100KLw c516100KLwLIZ = C0KM8.LIZ();
                    C0KNY c0kny2 = this.LIZ;
                    C516400KNa c516400KNa = c0kny2.LIZ;
                    if (c516400KNa != null) {
                        i4 = c516400KNa.LLILZLL;
                    } else {
                        i4 = 0;
                    }
                    c516000KLm.LJII(Boolean.valueOf(zLIZ), str5, jCurrentTimeMillis3, 0L, jCurrentTimeMillis, str6, str7, map, c516100KLwLIZ, i4, c0kny2);
                    C516400KNa c516400KNa2 = this.LIZ.LIZ;
                    if (c516400KNa2 != null && (activity3 = c516400KNa2.LL) != null && (application2 = activity3.getApplication()) != null) {
                        application2.unregisterActivityLifecycleCallbacks(c516400KNa2);
                    }
                    C0KNY c0kny3 = this.LIZ;
                    if (c0kny3 instanceof C0KFM) {
                        c0kny3.LJFF.put("trigger_from", "normal_iap_finish");
                    }
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onFailure, ");
                    sbLIZ.append(c0kpg.LIZ.getValue());
                    sbLIZ.append(' ');
                    C0KQW c0kqw = c0kpg.LIZLLL;
                    if (c0kqw == null || (obj = c0kqw.LIZ) == null) {
                        obj = 0;
                    }
                    sbLIZ.append(obj);
                    sbLIZ.append(' ');
                    C0KQW c0kqw2 = c0kpg.LIZLLL;
                    if (c0kqw2 == null || (str2 = c0kqw2.LIZIZ) == null) {
                        str2 = "";
                    }
                    sbLIZ.append(str2);
                    C2188811AlT.LIZIZ(sbLIZ);
                    Boolean boolValueOf = Boolean.valueOf(this.LIZ.LIZ());
                    String str8 = this.LIZIZ.LIZ;
                    long jCurrentTimeMillis4 = System.currentTimeMillis() - this.LIZIZ.LIZIZ;
                    int value2 = c0kpg.LIZ.getValue();
                    C0KQW c0kqw3 = c0kpg.LIZLLL;
                    if (c0kqw3 != null && (enumC1792020wjY = c0kqw3.LIZ) != null) {
                        value = enumC1792020wjY.getValue();
                    } else {
                        value = 0;
                    }
                    C0KNY c0kny4 = this.LIZ;
                    String str9 = c0kny4.LIZLLL;
                    String str10 = c0kny4.LIZIZ;
                    Map<String, String> map2 = this.LIZLLL;
                    c0kny4.LIZJ.get();
                    C516100KLw c516100KLwLIZ2 = C0KM8.LIZ();
                    C0KNY c0kny5 = this.LIZ;
                    C516400KNa c516400KNa3 = c0kny5.LIZ;
                    if (c516400KNa3 != null) {
                        i = c516400KNa3.LLILZLL;
                    } else {
                        i = 0;
                    }
                    c516000KLm.LJ(boolValueOf, str8, jCurrentTimeMillis4, value2, value, "", str9, str10, map2, c516100KLwLIZ2, i, c0kny5);
                    C516400KNa c516400KNa4 = this.LIZ.LIZ;
                    if (c516400KNa4 != null && (activity2 = c516400KNa4.LL) != null && (application = activity2.getApplication()) != null) {
                        application.unregisterActivityLifecycleCallbacks(c516400KNa4);
                    }
                    C0KNY c0kny6 = this.LIZ;
                    if ((c0kny6 instanceof C0KFM) && (c0klw = ((C0KFM) c0kny6).LJJII) != null) {
                        C518080KTm c518080KTm = c0kpg.LJ;
                        if (c518080KTm != null) {
                            i2 = c518080KTm.LIZIZ;
                        } else {
                            i2 = 0;
                        }
                        C0KQW c0kqw4 = c0kpg.LIZLLL;
                        if (c0kqw4 == null || (str3 = c0kqw4.LIZIZ) == null) {
                            str3 = "";
                        }
                        c0klw.onFail(i2, str3);
                    }
                }
                if (C516510KNl.LIZ[c0kpg.LIZ.ordinal()] == 1) {
                    C516050KLr c516050KLr2 = C516050KLr.LIZ;
                    String str11 = this.LJFF;
                    Integer numValueOf2 = Integer.valueOf(this.LJ.LJIIZILJ);
                    C0KM4 c0km42 = C0KM4.IAP_SUCCEED;
                    c516050KLr2.getClass();
                    C516050KLr.LIZJ(str11, numValueOf2, c0km42);
                    this.LJI.LIZ.LIZIZ(this.LJFF);
                    return;
                }
                C0KLW c0klw2 = this.LJ.LJJII;
                if (c0klw2 != null) {
                    C518080KTm c518080KTm2 = c0kpg.LJ;
                    if (c518080KTm2 != null) {
                        i3 = c518080KTm2.LIZIZ;
                        str4 = c518080KTm2.LJFF;
                        if (str4 == null) {
                        }
                        c0klw2.onFail(i3, str4);
                    } else {
                        i3 = 0;
                    }
                    str4 = "";
                    c0klw2.onFail(i3, str4);
                }
                C516050KLr c516050KLr3 = C516050KLr.LIZ;
                String str12 = this.LJFF;
                Integer numValueOf3 = Integer.valueOf(this.LJ.LJIIZILJ);
                C0KM4 c0km43 = C0KM4.IAP_FAIL;
                c516050KLr3.getClass();
                C516050KLr.LIZJ(str12, numValueOf3, c0km43);
                this.LJII.invoke(c0kpg);
                this.LJI.LIZ.LIZ();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(this.LJ, c0knw);
                this.LJFF = str;
                this.LJI = c516600KNu;
                this.LJII = function1;
            }
        });
        C0KOJ c0koj = ((C0KFM) awS136S0400000_7.l1).LJJIII;
        if (c0koj != null) {
            c0koj.onSuccess(1, 0);
            return Unit.LIZ;
        }
        return null;
    }

    public static final Object invoke$1(AwS136S0400000_7 awS136S0400000_7) {
        String strLIZLLL;
        RechargeCustomError rechargeCustomError = (RechargeCustomError) awS136S0400000_7.l0;
        if (rechargeCustomError != null) {
            int i = rechargeCustomError.errCode;
            Gson gson = C19748512Ol.LIZJ;
            ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletException().mO0(((C517840KSo) awS136S0400000_7.l1).LIZ.get(), (CustomErrorExtra) GsonProtectorUtils.fromJson(gson, GsonProtectorUtils.toJson(gson, rechargeCustomError), CustomErrorExtra.class), i, Boolean.TRUE);
            strLIZLLL = "recharge custom error";
        } else {
            strLIZLLL = C512300K7g.LIZLLL((Throwable) awS136S0400000_7.l2);
            if (strLIZLLL == null && (strLIZLLL = ((Throwable) awS136S0400000_7.l2).getMessage()) == null) {
                strLIZLLL = "";
            }
            C0KSC c0ksc = C0KSC.LIZ;
            Activity activity = ((C517840KSo) awS136S0400000_7.l1).LIZ.get();
            Throwable th = (Throwable) awS136S0400000_7.l2;
            c0ksc.getClass();
            C176600m4.LIZJ(new AwS408S0200000_7(activity, th, 37));
        }
        ((C0KSE) awS136S0400000_7.l3).LJIIJ(strLIZLLL);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS136S0400000_7 awS136S0400000_7) {
        int value;
        EnumC1792020wjY enumC1792020wjY;
        EnumC1792020wjY enumC1792020wjY2;
        C0KQW c0kqw = ((C518150KTt) awS136S0400000_7.l0).LIZJ;
        if (c0kqw != null && (enumC1792020wjY2 = c0kqw.LIZ) != null) {
            enumC1792020wjY2.getValue();
        }
        String strLIZ = C0KNJ.LIZ(-3, ((C0KLH) awS136S0400000_7.l1).LIZLLL);
        ((C0KCK) awS136S0400000_7.l2).LJIIIIZZ = true;
        C0KLD c0kld = ((C0KLA) awS136S0400000_7.l3).LJIIJ;
        if (c0kld != null) {
            C0KQW c0kqw2 = ((C518150KTt) awS136S0400000_7.l0).LIZJ;
            if (c0kqw2 != null && (enumC1792020wjY = c0kqw2.LIZ) != null) {
                value = enumC1792020wjY.getValue();
            } else {
                value = 0;
            }
            c0kld.LJ(-3, value, strLIZ, (C0KCK) awS136S0400000_7.l2);
            return Unit.LIZ;
        }
        return null;
    }

    public static final Object invoke$3(AwS136S0400000_7 awS136S0400000_7) {
        int value;
        EnumC1792020wjY enumC1792020wjY;
        EnumC1792020wjY enumC1792020wjY2;
        C0KQW c0kqw = ((C518150KTt) awS136S0400000_7.l0).LIZJ;
        if (c0kqw != null && (enumC1792020wjY2 = c0kqw.LIZ) != null) {
            enumC1792020wjY2.getValue();
        }
        String strLIZ = C0KNJ.LIZ(-3, ((C0KLH) awS136S0400000_7.l1).LIZLLL);
        ((C0KCK) awS136S0400000_7.l2).LJIIIIZZ = true;
        C0KLD c0kld = ((C0KLA) awS136S0400000_7.l3).LJIIJ;
        C0KQW c0kqw2 = ((C518150KTt) awS136S0400000_7.l0).LIZJ;
        if (c0kqw2 != null && (enumC1792020wjY = c0kqw2.LIZ) != null) {
            value = enumC1792020wjY.getValue();
        } else {
            value = 0;
        }
        c0kld.LJ(-3, value, strLIZ, (C0KCK) awS136S0400000_7.l2);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS136S0400000_7 awS136S0400000_7) {
        String idStr;
        List<SpaceActivityInfo> list;
        String str;
        View view = ((C0K2F) awS136S0400000_7.l0).LL;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            int size = 0;
            layoutParams.height = 0;
            C786410Ut5.W5(view, layoutParams);
            C511370K3r c511370K3r = (C511370K3r) ((InterfaceC2753014t) awS136S0400000_7.l1);
            if (c511370K3r != null && c511370K3r.LLJ) {
                C0K26 c0k26 = C0K26.LIZ;
                User user = ((C511370K3r) awS136S0400000_7.l2).LLILLL;
                String str2 = "";
                if (user == null || (idStr = user.getIdStr()) == null) {
                    idStr = "";
                }
                C511370K3r c511370K3r2 = (C511370K3r) ((InterfaceC2753014t) awS136S0400000_7.l1);
                if (c511370K3r2 != null && (str = c511370K3r2.LLJIJIL) != null) {
                    str2 = str;
                }
                SpaceActivityIndicator spaceActivityIndicator = ((C0K2H) awS136S0400000_7.l3).LIZ;
                if (spaceActivityIndicator != null && (list = spaceActivityIndicator.spaceActivityInfoList) != null) {
                    size = list.size();
                }
                c0k26.getClass();
                C0K26.LIZ(size, "click", idStr, str2);
            }
            return Unit.LIZ;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final Object invoke$5(AwS136S0400000_7 awS136S0400000_7) {
        String str;
        SuperFanViewModel superFanViewModel = (SuperFanViewModel) awS136S0400000_7.l0;
        C0KT2 c0kt2 = C0KT2.SUPER_FAN_PRIVILEGE;
        Map<String, Object> extraParams = ((C0KTB) awS136S0400000_7.l1).getExtraParams();
        Object obj = null;
        if (extraParams != null) {
            obj = extraParams.get("source_page");
        }
        if (!(obj instanceof String) || (str = (String) obj) == null) {
            str = "jsb";
        }
        C0KT0 c0kt0 = new C0KT0(c0kt2, str, 0);
        final SuperFanViewModel superFanViewModel2 = (SuperFanViewModel) awS136S0400000_7.l0;
        final C0KTB c0ktb = (C0KTB) awS136S0400000_7.l1;
        final CompletionBlock completionBlock = (CompletionBlock) awS136S0400000_7.l2;
        final C0KTA c0kta = (C0KTA) awS136S0400000_7.l3;
        superFanViewModel.vQ2(c0kt0, 0L, new InterfaceC517900KSu() { // from class: X.0KT8
            @Override // X.InterfaceC517900KSu
            public final void onFailure() {
                C2382909Vj.LIZ(completionBlock, -100, "fetch product fail", null, 4);
            }

            @Override // X.InterfaceC517900KSu
            public final void LIZ(C0KSY<GetNonFansUserDataResponse.Data> c0ksy, C0KS8 c0ks8) {
                int i;
                String str2;
                SuperFanViewModel superFanViewModel3 = superFanViewModel2;
                if (Intrinsics.LJFF(c0ktb.getAction(), 6)) {
                    i = 2;
                } else {
                    i = 1;
                }
                C0KT2 c0kt22 = C0KT2.SUPER_FAN_PRIVILEGE;
                Map<String, Object> extraParams2 = c0ktb.getExtraParams();
                Object obj2 = null;
                if (extraParams2 != null) {
                    obj2 = extraParams2.get("source_page");
                }
                if (!(obj2 instanceof String) || (str2 = (String) obj2) == null) {
                    str2 = "jsb";
                }
                C0KT5 c0kt5 = new C0KT5(i, c0kt22, str2, 0);
                final CompletionBlock<C0KTD> completionBlock2 = completionBlock;
                final C0KTA c0kta2 = c0kta;
                superFanViewModel3.zQ2(c0kt5, new InterfaceC517920KSw() { // from class: X.0KT9
                    @Override // X.InterfaceC517920KSw
                    public final void onFailure() {
                        C2382909Vj.LIZ(completionBlock2, -100, "purchase fail", null, 4);
                    }

                    @Override // X.InterfaceC517920KSw
                    public final void onSuccess() {
                        CompletionBlock<C0KTD> completionBlock3 = completionBlock2;
                        c0kta2.getClass();
                        InterfaceC634840OvC interfaceC634840OvC = c0kta2.IBridgeSdkContext;
                        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C0KTD.class, interfaceC634840OvC != null ? interfaceC634840OvC.getContainerID() : null);
                        ((C0KTD) xBaseModelLIZJ).setSuccess(Boolean.TRUE);
                        completionBlock3.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                    }
                });
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS136S0400000_7 awS136S0400000_7) {
        String str;
        SuperFanViewModel superFanViewModel = (SuperFanViewModel) awS136S0400000_7.l0;
        String toUID = ((C0KTB) awS136S0400000_7.l1).getToUID();
        Map<String, Object> extraParams = ((C0KTB) awS136S0400000_7.l1).getExtraParams();
        Object obj = null;
        if (extraParams != null) {
            obj = extraParams.get("source_page");
        }
        if (!(obj instanceof String) || (str = (String) obj) == null) {
            str = "jsb";
        }
        final CompletionBlock completionBlock = (CompletionBlock) awS136S0400000_7.l2;
        final C0KTA c0kta = (C0KTA) awS136S0400000_7.l3;
        InterfaceC517920KSw interfaceC517920KSw = new InterfaceC517920KSw() { // from class: X.0KT4
            @Override // X.InterfaceC517920KSw
            public final void onFailure() {
                C2382909Vj.LIZ(completionBlock, -100, "cancel fail", null, 4);
            }

            @Override // X.InterfaceC517920KSw
            public final void onSuccess() {
                CompletionBlock<C0KTD> completionBlock2 = completionBlock;
                c0kta.getClass();
                InterfaceC634840OvC interfaceC634840OvC = c0kta.IBridgeSdkContext;
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C0KTD.class, interfaceC634840OvC != null ? interfaceC634840OvC.getContainerID() : null);
                ((C0KTD) xBaseModelLIZJ).setSuccess(Boolean.TRUE);
                completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            }
        };
        superFanViewModel.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0KSH.LJIILIIL(superFanViewModel.getDataChannel(), "1", "cancel", str);
        C480460Ism.LIZ().getClass();
        ((FansClubApi) C480460Ism.LIZLLL(FansClubApi.class)).cancelRenewal(toUID).LJFF(new C0UO0()).LJJIIZ(new AfS0S1200100_7((Object) interfaceC517920KSw, (C0ISJ) superFanViewModel, (HashMap<String, Object>) jCurrentTimeMillis, (long) str, (String) 3), new AfS0S1200100_7((Object) interfaceC517920KSw, (C0ISJ) superFanViewModel, (HashMap<String, Object>) jCurrentTimeMillis, (long) str, (String) 4));
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.0KSs] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0KSt] */
    public static final Object invoke$7(AwS136S0400000_7 awS136S0400000_7) {
        Object obj;
        String str;
        long id;
        String secUid;
        long id2;
        Activity activity;
        C19EG c19egLJ;
        WeakReference<Activity> weakReference;
        Room roomLJJLIIIIJ;
        User userLJIIIIZZ;
        User userLJIIIIZZ2;
        final SuperFanViewModel superFanViewModel = (SuperFanViewModel) awS136S0400000_7.l0;
        C0KT2 c0kt2 = C0KT2.SUPER_FAN_PRIVILEGE;
        Map<String, Object> extraParams = ((C0KTB) awS136S0400000_7.l1).getExtraParams();
        if (extraParams != null) {
            obj = extraParams.get("source_page");
        } else {
            obj = null;
        }
        if (!(obj instanceof String) || (str = (String) obj) == null) {
            str = "jsb";
        }
        C0KT0 c0kt0 = new C0KT0(c0kt2, str, 0);
        final CompletionBlock completionBlock = (CompletionBlock) awS136S0400000_7.l2;
        final C0KTA c0kta = (C0KTA) awS136S0400000_7.l3;
        final ?? r3 = new InterfaceC517920KSw() { // from class: X.0KSt
            @Override // X.InterfaceC517920KSw
            public final void onFailure() {
                C2382909Vj.LIZ(completionBlock, -100, "recover fail", null, 4);
            }

            @Override // X.InterfaceC517920KSw
            public final void onSuccess() {
                CompletionBlock<C0KTD> completionBlock2 = completionBlock;
                c0kta.getClass();
                InterfaceC634840OvC interfaceC634840OvC = c0kta.IBridgeSdkContext;
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C0KTD.class, interfaceC634840OvC != null ? interfaceC634840OvC.getContainerID() : null);
                ((C0KTD) xBaseModelLIZJ).setSuccess(Boolean.TRUE);
                completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            }
        };
        superFanViewModel.getClass();
        C0KSH.LJIILIIL(superFanViewModel.getDataChannel(), "1", "renew", str);
        DataChannel dataChannel = superFanViewModel.getDataChannel();
        if (dataChannel != null && (userLJIIIIZZ2 = C500260Jjc.LJIIIIZZ(dataChannel)) != null) {
            id = userLJIIIIZZ2.getId();
        } else {
            id = 0;
        }
        DataChannel dataChannel2 = superFanViewModel.getDataChannel();
        if (dataChannel2 == null || (userLJIIIIZZ = C500260Jjc.LJIIIIZZ(dataChannel2)) == null || (secUid = userLJIIIIZZ.getSecUid()) == null) {
            secUid = CardStruct.IStatusCode.DEFAULT;
        }
        DataChannel dataChannel3 = superFanViewModel.getDataChannel();
        if (dataChannel3 != null && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel3)) != null) {
            id2 = roomLJJLIIIIJ.getId();
        } else {
            id2 = 0;
        }
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        C0KSF c0ksf = (C0KSF) superFanViewModel.LLILLL.getValue();
        C517840KSo c517840KSo = superFanViewModel.LLILLJJLI;
        if (c517840KSo != null && (weakReference = c517840KSo.LIZ) != null) {
            activity = weakReference.get();
        } else {
            activity = null;
        }
        C517690KRz c517690KRz = new C517690KRz(id, secUid, activity, id2, currentUserId, c0kt0.LIZLLL, c0kt2.getValue(), str, new C0KS0() { // from class: X.0KSs
            @Override // X.C0KS0
            public final void LIZ() {
            }

            @Override // X.C0KS0
            public final void LIZIZ() {
            }

            @Override // X.C0KS0
            public final void onSuccess() throws JSONException {
                r3.onSuccess();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action", "2");
                C389001fE.LIZ("live_super_fan_subscribe_success", jSONObject, System.currentTimeMillis(), false);
            }

            @Override // X.C0KS0
            public final void LIZJ(C0KPG c0kpg) {
                C500260Jjc.LJJLIIIJILLIZJL(new AwS408S0200000_7(c0kpg, superFanViewModel, 39));
                r3.onFailure();
            }
        });
        C0KS3 c0ks3 = c0ksf.LLILLL;
        if (c0ks3 != null && (c19egLJ = C500260Jjc.LJ(activity)) != null) {
            C500260Jjc.LJJJJJ(c19egLJ, null, new C517640KRu(c0ks3, c517690KRz, null), 3);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$8(AwS136S0400000_7 awS136S0400000_7) {
        boolean zLJFF;
        boolean z;
        String str;
        SubscriptionSceneContext subscriptionSceneContext;
        String strRS;
        EnumC510710K1d enumC510710K1d;
        PGCGetSubPrivilegeDetailResponse.Data data;
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = ((C0K0S) awS136S0400000_7.l0).LJ;
        if (subscriptionPrivilegeDetailFragment != null) {
            subscriptionPrivilegeDetailFragment.cS(((C510560K0o) awS136S0400000_7.l1).LIZ, C2097608Jq.LJ());
        }
        C0K4S c0k4s = SubSpaceFeedDialogFragment.LLJLLIL;
        FragmentManager fragmentManager = (FragmentManager) awS136S0400000_7.l2;
        Bundle bundle = new Bundle();
        C0K0S c0k0s = (C0K0S) awS136S0400000_7.l0;
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment2 = c0k0s.LJ;
        boolean zLIZ = false;
        if (subscriptionPrivilegeDetailFragment2 != null && (data = subscriptionPrivilegeDetailFragment2.LLILLL) != null) {
            zLJFF = C510570K0p.LJFF(data);
        } else {
            zLJFF = false;
        }
        bundle.putBoolean("ban_package_show", zLJFF);
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment3 = c0k0s.LJ;
        if (subscriptionPrivilegeDetailFragment3 != null && (enumC510710K1d = subscriptionPrivilegeDetailFragment3.LLILZ) != null && !enumC510710K1d.isFullScreen()) {
            z = true;
        } else {
            z = false;
        }
        String str2 = null;
        if (z) {
            SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment4 = c0k0s.LJ;
            if (subscriptionPrivilegeDetailFragment4 != null) {
                strRS = subscriptionPrivilegeDetailFragment4.rS();
            } else {
                strRS = null;
            }
            C786410Ut5.LJJJI("back_url", strRS, bundle);
        }
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment5 = c0k0s.LJ;
        if (subscriptionPrivilegeDetailFragment5 != null) {
            str2 = subscriptionPrivilegeDetailFragment5.LLJJIII;
        }
        C786410Ut5.LJJJI("sec_anchor_id", str2, bundle);
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment6 = c0k0s.LJ;
        if (subscriptionPrivilegeDetailFragment6 == null || (str = subscriptionPrivilegeDetailFragment6.LLLFFI) == null) {
            str = "";
        }
        C786410Ut5.LJJJI("package_id", str, bundle);
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment7 = c0k0s.LJ;
        if (subscriptionPrivilegeDetailFragment7 != null && (subscriptionSceneContext = subscriptionPrivilegeDetailFragment7.LLJJI) != null) {
            zLIZ = subscriptionSceneContext.LIZ();
        }
        bundle.putBoolean("preview_mode", zLIZ);
        c0k4s.getClass();
        SubSpaceFeedDialogFragment subSpaceFeedDialogFragment = new SubSpaceFeedDialogFragment();
        subSpaceFeedDialogFragment.LLJLL = "privilege_page";
        subSpaceFeedDialogFragment.setArguments(bundle);
        subSpaceFeedDialogFragment.LLJL = fragmentManager;
        if (fragmentManager != null) {
            subSpaceFeedDialogFragment.show(fragmentManager, "SubOnlySpaceFeedDialogFragment");
        }
        ((Function0) awS136S0400000_7.l3).invoke();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$9(AwS136S0400000_7 awS136S0400000_7) {
        LifecycleOwner lifecycleOwner;
        C0JFN c0jfn = C0JFN.LIZ;
        DataChannel dataChannel = (DataChannel) awS136S0400000_7.l0;
        c0jfn.getClass();
        C0JFN.LJIIJ(dataChannel, "guest_connection_enlarge_screen", "interaction_icon", true);
        Context context = (Context) awS136S0400000_7.l1;
        if (context != null) {
            C782110Um9 c782110Um9 = new C782110Um9(context);
            c782110Um9.LJIILLIIL = false;
            c782110Um9.LJIILL = false;
            c782110Um9.LJIIZILJ(2131841423);
            c782110Um9.LJII(2131841398);
            DataChannel dataChannel2 = (DataChannel) awS136S0400000_7.l0;
            if (dataChannel2 != null) {
                lifecycleOwner = dataChannel2.LLILZ;
            } else {
                lifecycleOwner = null;
            }
            c782110Um9.LIZIZ = lifecycleOwner;
            c782110Um9.LJIIJ(2131841087, new InterfaceC743640TFa() { // from class: X.0JFS
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    liveDialog.dismiss();
                }
            });
            c782110Um9.LJIILIIL(2131841420, new AcS352S0200000_7((Function0) awS136S0400000_7.l3, (IInteractService) awS136S0400000_7.l2, 4));
            C786410Ut5.E4(c782110Um9.LIZ());
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS136S0400000_7(C0K0S c0k0s, C0K0S c0k0s2, C510560K0o c510560K0o, FragmentManager fragmentManager, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = c0k0s;
        this.l1 = c0k0s2;
        this.l2 = c510560K0o;
        this.l3 = fragmentManager;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS136S0400000_7(C0K2F c0k2f, InterfaceC2753014t interfaceC2753014t, C511370K3r c511370K3r, C0K2H c0k2h, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0k2f;
        this.l1 = interfaceC2753014t;
        this.l2 = c511370K3r;
        this.l3 = c0k2h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS136S0400000_7(C516600KNu c516600KNu, C0KFM c0kfm, PGCCreateContractResult pGCCreateContractResult, AwS586S0100000_7 awS586S0100000_7, int i) {
        super(0);
        this.$t = i;
        this.l0 = c516600KNu;
        this.l1 = c0kfm;
        this.l2 = pGCCreateContractResult;
        this.l3 = awS586S0100000_7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS136S0400000_7(C518150KTt c518150KTt, C0KLH c0klh, C0KCK c0kck, C0KLA c0kla, int i) {
        super(0);
        this.$t = i;
        this.l0 = c518150KTt;
        this.l1 = c0klh;
        this.l2 = c0kck;
        this.l3 = c0kla;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS136S0400000_7(SuperFanViewModel superFanViewModel, SuperFanViewModel superFanViewModel2, C0KTB c0ktb, CompletionBlock<C0KTD> completionBlock, C0KTA c0kta) {
        super(0);
        this.$t = c0kta;
        this.l0 = superFanViewModel;
        this.l1 = superFanViewModel2;
        this.l2 = c0ktb;
        this.l3 = completionBlock;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS136S0400000_7(DataChannel dataChannel, DataChannel dataChannel2, Context context, IInteractService iInteractService, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = dataChannel;
        this.l1 = dataChannel2;
        this.l2 = context;
        this.l3 = iInteractService;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS136S0400000_7(RechargeCustomError rechargeCustomError, RechargeCustomError rechargeCustomError2, C517840KSo c517840KSo, Throwable th, C0KSE<PolingSuperFanContractStatusResult.SuperFanEnvelopeInfo> c0kse) {
        super(0);
        this.$t = c0kse;
        this.l0 = rechargeCustomError;
        this.l1 = rechargeCustomError2;
        this.l2 = c517840KSo;
        this.l3 = th;
    }
}
