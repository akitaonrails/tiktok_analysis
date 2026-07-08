package com.ss.android.ugc.aweme.unifiedauth.intelligent;

import X.C01GW;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C0O1V;
import X.C0PEM;
import X.C1383370m6R;
import X.C155000ia;
import X.C1720106oR;
import X.C1C7U;
import X.C211000rc;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C609590NvZ;
import X.C609600Nva;
import X.C824390WVp;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import android.content.Context;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.pitaya.api.PTYMessageHandler;
import com.bytedance.pitaya.api.PTYTaskResultCallback;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYTaskConfig;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.bytedance.pitaya.api.mutilinstance.HostSetupWatcher;
import com.bytedance.pitaya.api.mutilinstance.PreHostSetupWatcher;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInstanceConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS52S0310000_9;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class IntelligentPopupHelper {
    public static final IntelligentPopupHelper LIZ = new IntelligentPopupHelper();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(333));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(336));

    static {
        LJ(AFwS189S0000000_3.get$arr$(572));
        if (C609600Nva.LIZ().enable) {
            C23250099c.LIZLLL(LIZJ(C1383370m6R.LIZ), C0PEM.LIZJ, null, new AnonymousClass2(null), 2);
        }
        LJ(AFwS189S0000000_3.get$arr$(573));
    }

    public static boolean LJFF() {
        LJ(AFwS195S0000000_9.get$arr$(335));
        return (!C609600Nva.LIZ().tryInitPitayaBeforeProcess || PreHostSetupWatcher.INSTANCE.isPreHostSetup() || HostSetupWatcher.INSTANCE.isHostSetup()) ? false : true;
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.unifiedauth.intelligent.IntelligentPopupHelper$2, reason: invalid class name */
    /* JADX INFO: loaded from: classes4.dex */
    @C09DV(c = "com.ss.android.ugc.aweme.unifiedauth.intelligent.IntelligentPopupHelper$2", f = "IntelligentPopupHelper.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public AnonymousClass2(InterfaceC1364105Vn<? super AnonymousClass2> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return new AnonymousClass2(interfaceC1364105Vn);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("IntelligentPopupHelper@f5e9.<init>$2");
            C099R.LJFF();
            C155000ia.LIZIZ(obj);
            IntelligentPopupHelper.LIZ.getClass();
            PitayaCoreFactory.getCore((String) IntelligentPopupHelper.LIZIZ.getValue()).registerMessageHandler("permission_trigger", new PTYMessageHandler() { // from class: com.ss.android.ugc.aweme.unifiedauth.intelligent.IntelligentPopupHelper.2.1
                @Override // com.bytedance.pitaya.api.PTYMessageHandler
                public JSONObject onMessage(JSONObject jSONObject) {
                    IntelligentPopupHelper intelligentPopupHelper = IntelligentPopupHelper.LIZ;
                    AFwS189S0000000_3 aFwS189S0000000_3 = AFwS189S0000000_3.get$arr$(571);
                    intelligentPopupHelper.getClass();
                    IntelligentPopupHelper.LJ(aFwS189S0000000_3);
                    try {
                        if (Intrinsics.LJFF(JSONObjectProtectorUtils.getString(jSONObject, "action"), "is_push_permission_on")) {
                            JSONObject jSONObject2 = new JSONObject();
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("push", C824390WVp.LIZJ(C1383370m6R.LIZ));
                            jSONObject2.put("result", jSONObject3);
                            return jSONObject2;
                        }
                        return null;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        IntelligentPopupHelper intelligentPopupHelper2 = IntelligentPopupHelper.LIZ;
                        AwS547S0100000_3 awS547S0100000_3 = new AwS547S0100000_3(e, 67);
                        intelligentPopupHelper2.getClass();
                        IntelligentPopupHelper.LJ(awS547S0100000_3);
                        return null;
                    }
                }
            });
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("IntelligentPopupHelper@f5e9.<init>$2");
            return unit;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return new AnonymousClass2(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC497601wk LIZJ(Context context) {
        LifecycleOwner lifecycleOwner;
        LifecycleCoroutineScope lifecycleScope;
        if (context == 0) {
            return C2296808zG.LIZ(C0PEM.LIZJ);
        }
        if ((context instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) context) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
            return lifecycleScope;
        }
        return C2296808zG.LIZ(C0PEM.LIZJ);
    }

    public static void LIZLLL(Function0 function0) {
        String str = (String) function0.invoke();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Uni-Auth]");
        sbLIZ.append("intelligent_popup");
        C1720106oR.LJI(C2188811AlT.LIZIZ(sbLIZ), str);
    }

    public static void LJ(Function0 function0) {
        function0.invoke();
        C211000rc.LIZ("intelligent_popup");
    }

    public static void LIZIZ(UnifiedAuthPopupConfig unifiedAuthPopupConfig, final AwS588S0100000_9 awS588S0100000_9) throws JSONException {
        String str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("trigger", unifiedAuthPopupConfig.trigger);
        UnifiedAuthPopupConfig.Companion.getClass();
        PopupInstanceConfig popupInstanceConfigLIZ = C0O1V.LIZ(unifiedAuthPopupConfig);
        if (popupInstanceConfigLIZ != null) {
            str = popupInstanceConfigLIZ.panelType;
        } else {
            str = null;
        }
        jSONObject.put("popup_up_type", str);
        PitayaCoreFactory.getCore((String) LIZIZ.getValue()).runTask("permission_trigger", new PTYTaskData(jSONObject), new PTYTaskConfig(false, null, -1.0f), new PTYTaskResultCallback() { // from class: com.ss.android.ugc.aweme.unifiedauth.intelligent.IntelligentPopupHelper$doRunIntelligentPopupTask$1
            @Override // com.bytedance.pitaya.api.PTYTaskResultCallback
            public void onResult(boolean z, PTYError pTYError, PTYTaskData pTYTaskData, PTYPackageInfo pTYPackageInfo) {
                IntelligentPopupHelper intelligentPopupHelper = IntelligentPopupHelper.LIZ;
                AwS52S0310000_9 awS52S0310000_9 = new AwS52S0310000_9(z, pTYError, pTYTaskData, pTYPackageInfo, 1);
                intelligentPopupHelper.getClass();
                IntelligentPopupHelper.LIZLLL(awS52S0310000_9);
                Function1<C609590NvZ, Unit> function1 = awS588S0100000_9;
                if (function1 != null) {
                    function1.invoke(new C609590NvZ(z, pTYError, pTYTaskData, pTYPackageInfo));
                }
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:100))(0)|7|(1:112)|(2:113|(1:(1:(1:(1:(3:14|15|16)(2:101|102))(4:17|18|83|84))(4:19|20|74|75))(4:21|22|67|68))(2:23|24))(6:25|106|26|114|27|(2:29|103))|108|30|(4:32|(15:110|34|(1:39)(1:38)|40|(1:42)(1:43)|44|(1:46)(1:47)|48|(1:54)|55|(1:59)|62|63|64|(2:66|104))(0)|67|68)(2:69|(4:71|(2:73|105)|74|75)(6:76|(1:78)(1:80)|79|(1:82)|83|84))|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x016d, code lost:
    
        r6 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x016e, code lost:
    
        r2 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01a7, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a7 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig r21, kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super com.ss.android.ugc.aweme.unifiedauthapi.model.ServerIntelligentRequest, kotlin.Unit> r22, X.InterfaceC1364105Vn<? super kotlin.Unit> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.unifiedauth.intelligent.IntelligentPopupHelper.LIZ(com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig, kotlin.jvm.functions.Function2, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LJI(com.ss.android.ugc.aweme.unifiedauth.intelligent.IntelligentPopupHelper r10, com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig r11, boolean r12, java.lang.String r13, java.lang.String r14, com.bytedance.pitaya.api.bean.PTYError r15, java.lang.String r16, kotlin.jvm.functions.Function2 r17, X.C592930NNj r18, int r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.unifiedauth.intelligent.IntelligentPopupHelper.LJI(com.ss.android.ugc.aweme.unifiedauth.intelligent.IntelligentPopupHelper, com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig, boolean, java.lang.String, java.lang.String, com.bytedance.pitaya.api.bean.PTYError, java.lang.String, kotlin.jvm.functions.Function2, X.0NNj, int):java.lang.Object");
    }
}
