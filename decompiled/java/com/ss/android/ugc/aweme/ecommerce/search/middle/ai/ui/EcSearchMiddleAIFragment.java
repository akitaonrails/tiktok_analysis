package com.ss.android.ugc.aweme.ecommerce.search.middle.ai.ui;

import X.AbstractC1542100qES;
import X.AnonymousClass0378;
import X.AnonymousClass0956;
import X.C098200Yq;
import X.C0PSL;
import X.C0QCO;
import X.C0QER;
import X.C0QR7;
import X.C0R4T;
import X.C1204704nV;
import X.C123100dR;
import X.C13BV;
import X.C1421105hJ;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1685300txQ;
import X.C1766860w4y;
import X.C18130078e;
import X.C189200o6;
import X.C19719612Di;
import X.C1976807ok;
import X.C19EG;
import X.C19GS;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C23250099c;
import X.C430110Gtl;
import X.C616540OGe;
import X.C640270P9l;
import X.C672250QYl;
import X.C673920Qc2;
import X.C673940Qc4;
import X.C674260Qca;
import X.C674270Qcb;
import X.C674290Qcd;
import X.C674300Qce;
import X.C674330Qch;
import X.C674360Qck;
import X.C674370Qcl;
import X.C674380Qcm;
import X.C674480Qcw;
import X.C674630QdB;
import X.C679340Qkm;
import X.C786410Ut5;
import X.EnumC673970Qc7;
import X.EnumC674310Qcf;
import X.InterfaceC1164530gPT;
import X.InterfaceC1541990qEH;
import X.InterfaceC671770QWp;
import X.InterfaceC674600Qd8;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.AObserverS214S0100000_10;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.ecommerce.search.middle.ai.ability.IEcSearchMiddleAIPageAbility;
import com.ss.android.ugc.aweme.ecommerce.search.middle.ai.bean.EcSearchAIHistoryWord;
import com.ss.android.ugc.aweme.ecommerce.search.middle.ai.ui.EcSearchMiddleAIFragment;
import com.ss.android.ugc.aweme.ecommerce.search.middle.ai.vm.EcSearchMiddleAIViewModel;
import com.ss.android.ugc.aweme.ecommerce.search.utils.EcSearchKeyboardMonitor;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS61S1000000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u4.q0;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchMiddleAIFragment extends AmeBaseFragment implements InterfaceC671770QWp, IEcSearchMiddleAIPageAbility {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGEgLSQ+KiHELIOSd9JSwoLSM2ZiQlZzo6ZgAvGioyOiYkBCY3LCkpCAYVOiQrJCo9PA==";
    public EcSearchMiddleAIViewModel LL;
    public C0QER LLILLJJLI;
    public FrameLayout LLILLL;
    public C0QCO LLILZ;
    public C674360Qck LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public C674630QdB LLIZLLLIL;
    public EcSearchKeyboardMonitor LLJ;
    public final C674300Qce LLJI = new InterfaceC1164530gPT() { // from class: X.0Qce
        @Override // X.InterfaceC1164530gPT
        public final void onEvent(String str, String str2) {
            Object c098200Yq;
            C674360Qck c674360Qck;
            try {
                c098200Yq = new JSONObject(str2);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            String str3 = null;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            JSONObject jSONObject = (JSONObject) c098200Yq;
            if (jSONObject != null) {
                EcSearchMiddleAIFragment ecSearchMiddleAIFragment = this.LL;
                C674360Qck c674360Qck2 = ecSearchMiddleAIFragment.LLILZIL;
                if (c674360Qck2 != null) {
                    str3 = c674360Qck2.LIZ;
                }
                if (Intrinsics.LJFF(str3, jSONObject.optString("ai_session_id")) && (c674360Qck = ecSearchMiddleAIFragment.LLILZIL) != null) {
                    String strOptString = jSONObject.optString("session_id");
                    if (!Intrinsics.LJFF(c674360Qck.LJ, strOptString)) {
                        c674360Qck.LIZLLL++;
                    }
                    c674360Qck.LJ = strOptString;
                    c674360Qck.LJFF = Integer.valueOf(jSONObject.optInt("chat_rounds"));
                    c674360Qck.LJI = jSONObject.optString("query");
                }
            }
        }
    };
    public final AwS589S0100000_10 LLJIJIL = new AwS589S0100000_10(this, 39);

    @Override // com.ss.android.ugc.aweme.ecommerce.search.middle.ai.ability.IEcSearchMiddleAIPageAbility
    public final List<EcSearchAIHistoryWord> IA() {
        EcSearchMiddleAIViewModel ecSearchMiddleAIViewModel = this.LL;
        if (ecSearchMiddleAIViewModel != null) {
            return ecSearchMiddleAIViewModel.vQ2().LIZ();
        }
        return null;
    }

    public final void MR() {
        String routeUri;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        ECSearchEntranceData ecSearchEntranceData;
        if (this.LL != null) {
            C0QER c0qer = this.LLILLJJLI;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (c0qer == null || (ecSearchEntranceData = c0qer.getEcSearchEntranceData()) == null || (routeUri = ecSearchEntranceData.getRouteUri()) == null) {
                routeUri = "";
            }
            linkedHashMap.put("route_uri", routeUri);
            linkedHashMap.put("root_enter_from_type", c0qer != null ? Integer.valueOf(c0qer.getEcSearchEntranceValue()) : "");
            C1766860w4y.LIZ.getClass();
            String strLIZIZ = C1766860w4y.LIZIZ("ec_search_session_id");
            linkedHashMap.put("search_session_id", strLIZIZ != null ? strLIZIZ : "");
            linkedHashMap.put("enter_from", C0QR7.LJ(c0qer));
            C0QCO c0qco = this.LLILZ;
            if (c0qco == null || (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c0qco.LJIILIIL) == null) {
                return;
            }
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.U0(linkedHashMap);
        }
    }

    @Override // X.InterfaceC671770QWp
    public final void i4() {
        C674370Qcl c674370Qcl;
        C674360Qck c674360Qck = this.LLILZIL;
        if (c674360Qck == null || (c674370Qcl = c674360Qck.LIZIZ) == null) {
            return;
        }
        c674370Qcl.LJFF = true;
        c674370Qcl.LJI = true;
    }

    @Override // X.InterfaceC671770QWp
    public final void lO() {
        C674370Qcl c674370Qcl;
        C674360Qck c674360Qck = this.LLILZIL;
        if (c674360Qck == null || (c674370Qcl = c674360Qck.LIZIZ) == null) {
            return;
        }
        c674370Qcl.LJFF = true;
        c674370Qcl.LJ = true;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() throws JSONException {
        if (this.LLILZLL) {
            kP(EnumC674310Qcf.ENTER_CHAT);
        }
        super.onStop();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.middle.ai.ability.IEcSearchMiddleAIPageAbility
    public final List<EcSearchAIHistoryWord> qC0() {
        C674370Qcl c674370Qcl;
        C674360Qck c674360Qck = this.LLILZIL;
        if (c674360Qck != null && (c674370Qcl = c674360Qck.LIZIZ) != null) {
            c674370Qcl.LJFF = true;
        }
        EcSearchMiddleAIViewModel ecSearchMiddleAIViewModel = this.LL;
        if (ecSearchMiddleAIViewModel == null) {
            return null;
        }
        C674270Qcb c674270QcbVQ2 = ecSearchMiddleAIViewModel.vQ2();
        c674270QcbVQ2.getClass();
        c674270QcbVQ2.LIZJ = C13BV.INSTANCE;
        C23250099c.LIZLLL(c674270QcbVQ2.LIZ, null, null, new C674260Qca(c674270QcbVQ2, null), 3);
        return c674270QcbVQ2.LIZJ;
    }

    @Override // X.InterfaceC671770QWp
    public final void vG() {
        C674370Qcl c674370Qcl;
        C674360Qck c674360Qck = this.LLILZIL;
        if (c674360Qck == null || (c674370Qcl = c674360Qck.LIZIZ) == null) {
            return;
        }
        c674370Qcl.LJFF = true;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        LiveData liveData;
        View view;
        super.onDestroy();
        C673940Qc4.LIZIZ = null;
        C673940Qc4.LIZJ = null;
        if (!C1204704nV.LIZIZ && (view = getView()) != null) {
            q0.LJJII(view, null);
        }
        AnonymousClass0378.LIZ().LIZJ("update_ai_session_info", this.LLJI);
        C0QCO c0qco = this.LLILZ;
        if (c0qco != null) {
            c0qco.LJIIL = null;
            c0qco.LIZIZ = null;
            c0qco.LJIILJJIL = null;
            c0qco.LJ = null;
        }
        EcSearchMiddleAIViewModel ecSearchMiddleAIViewModel = this.LL;
        if (ecSearchMiddleAIViewModel != null && (liveData = (LiveData) ecSearchMiddleAIViewModel.LL.getValue()) != null) {
            liveData.removeObservers(this);
        }
        EcSearchMiddleAIViewModel ecSearchMiddleAIViewModel2 = this.LL;
        if (ecSearchMiddleAIViewModel2 != null) {
            AnonymousClass0956 anonymousClass0956 = ecSearchMiddleAIViewModel2.LLILZIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            ecSearchMiddleAIViewModel2.LLILZIL = null;
        }
        this.LL = null;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() throws JSONException {
        super.onDestroyView();
        kP(EnumC674310Qcf.BACK);
        C1558520qew.LJIIJJI(C1558360qeg.LJFF(this, null), IEcSearchMiddleAIPageAbility.class, null);
        if (C1204704nV.LIZIZ) {
            EcSearchKeyboardMonitor ecSearchKeyboardMonitor = this.LLJ;
            if (ecSearchKeyboardMonitor != null) {
                ecSearchKeyboardMonitor.LIZJ();
            }
            this.LLJ = null;
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() throws JSONException {
        View view;
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(EcSearchMiddleAIFragment.class.getName());
        }
        if (this.LLILZLL) {
            this.LLILZLL = false;
            Ec(EnumC674310Qcf.BACK_FROM_RESULT, true);
        }
        C674360Qck c674360Qck = this.LLILZIL;
        if (c674360Qck != null && c674360Qck.LIZJ && (view = getView()) != null) {
            C430110Gtl.LIZ(view, AFwS196S0000000_10.get$arr$(77));
        }
        super.onResume();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
    }

    public final void NR(JSONObject jSONObject) throws JSONException {
        C674370Qcl c674370Qcl;
        jSONObject.put("timestamp", System.currentTimeMillis());
        C674360Qck c674360Qck = this.LLILZIL;
        if (c674360Qck != null && (c674370Qcl = c674360Qck.LIZIZ) != null) {
            jSONObject.put("ai_session_seq", c674370Qcl.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.middle.ai.ability.IEcSearchMiddleAIPageAbility
    public final List<EcSearchAIHistoryWord> Oe1(String str) {
        C674370Qcl c674370Qcl;
        C674360Qck c674360Qck = this.LLILZIL;
        if (c674360Qck != null && (c674370Qcl = c674360Qck.LIZIZ) != null) {
            c674370Qcl.LJFF = true;
        }
        this.LLILZLL = true;
        EcSearchMiddleAIViewModel ecSearchMiddleAIViewModel = this.LL;
        if (ecSearchMiddleAIViewModel != null) {
            return ecSearchMiddleAIViewModel.Oe1(str);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.middle.ai.ability.IEcSearchMiddleAIPageAbility
    public final List<EcSearchAIHistoryWord> X82(String str) {
        C674370Qcl c674370Qcl;
        C674360Qck c674360Qck = this.LLILZIL;
        if (c674360Qck != null && (c674370Qcl = c674360Qck.LIZIZ) != null) {
            c674370Qcl.LJFF = true;
        }
        EcSearchMiddleAIViewModel ecSearchMiddleAIViewModel = this.LL;
        if (ecSearchMiddleAIViewModel == null) {
            return null;
        }
        C674270Qcb c674270QcbVQ2 = ecSearchMiddleAIViewModel.vQ2();
        EcSearchAIHistoryWord ecSearchAIHistoryWord = new EcSearchAIHistoryWord(str);
        c674270QcbVQ2.getClass();
        String str2 = ecSearchAIHistoryWord.word;
        ArrayList arrayList = new ArrayList(c674270QcbVQ2.LIZJ);
        C19719612Di.LJJIIJ(arrayList, new AwS61S1000000_10(str2, 22), true);
        c674270QcbVQ2.LIZJ = arrayList;
        C23250099c.LIZLLL(c674270QcbVQ2.LIZ, null, null, new C674260Qca(c674270QcbVQ2, null), 3);
        return c674270QcbVQ2.LIZJ;
    }

    @Override // X.InterfaceC671770QWp
    public final void kP(EnumC674310Qcf enumC674310Qcf) throws JSONException {
        String str;
        View view;
        if (!C1204704nV.LIZIZ && (view = getView()) != null) {
            q0.LJJII(view, null);
        }
        C674360Qck c674360Qck = this.LLILZIL;
        if (c674360Qck != null) {
            c674360Qck.LIZJ = false;
            C674370Qcl c674370Qcl = c674360Qck.LIZIZ;
            if (c674370Qcl != null) {
                c674370Qcl.LIZLLL = enumC674310Qcf.getReason();
            }
        }
        if (this.LLIZ) {
            this.LLIZ = false;
            JSONObject jSONObject = new JSONObject();
            NR(jSONObject);
            C0QCO c0qco = this.LLILZ;
            if (c0qco != null) {
                c0qco.LJIIIZ("EC_SEARCH_AI_MP_LEAVE", jSONObject);
            }
            C674360Qck c674360Qck2 = this.LLILZIL;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (c674360Qck2 != null) {
                C674370Qcl c674370Qcl2 = c674360Qck2.LIZIZ;
                if (c674370Qcl2 != null && (str = c674370Qcl2.LIZLLL) != null) {
                    linkedHashMap.put("exit_type", str);
                }
                C674370Qcl c674370Qcl3 = c674360Qck2.LIZIZ;
                if (c674370Qcl3 != null) {
                    linkedHashMap.put("stay_duration", Long.valueOf(System.currentTimeMillis() - c674370Qcl3.LIZIZ));
                }
                C674370Qcl c674370Qcl4 = c674360Qck2.LIZIZ;
                if (c674370Qcl4 != null) {
                    linkedHashMap.put("has_interaction", Integer.valueOf(c674370Qcl4.LJFF ? 1 : 0));
                }
                C674370Qcl c674370Qcl5 = c674360Qck2.LIZIZ;
                if (c674370Qcl5 != null) {
                    linkedHashMap.put("input_attempt", Integer.valueOf(c674370Qcl5.LJI ? 1 : 0));
                }
                C674370Qcl c674370Qcl6 = c674360Qck2.LIZIZ;
                if (c674370Qcl6 != null) {
                    linkedHashMap.put("input_submit", Integer.valueOf(c674370Qcl6.LJII ? 1 : 0));
                }
                String str2 = c674360Qck2.LIZ;
                if (str2 != null) {
                    linkedHashMap.put("ai_session_id", str2);
                }
                C674370Qcl c674370Qcl7 = c674360Qck2.LIZIZ;
                if (c674370Qcl7 != null) {
                    linkedHashMap.put("ai_session_seq", Integer.valueOf(c674370Qcl7.LIZ));
                }
            }
            C1421105hJ.LIZJ("ai_search_tab_exit", linkedHashMap);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1766860w4y.LIZ.getClass();
        String strLIZIZ = C1766860w4y.LIZIZ("ec_search_session_id");
        if (strLIZIZ != null) {
            this.LLILZIL = new C674360Qck(strLIZIZ);
        }
        BtmSDK.INSTANCE.registerBtmPageOnCreate(this, "a2270.b17222", (String) null);
        C19EG activity = getActivity();
        if (activity != null) {
            this.LL = (EcSearchMiddleAIViewModel) C679340Qkm.LIZIZ(this, activity).get(EcSearchMiddleAIViewModel.class);
            this.LLILLJJLI = C640270P9l.LIZJ(this, activity);
        }
    }

    @Override // X.InterfaceC671770QWp
    public final void t3(C674630QdB c674630QdB) {
        String str;
        this.LLIZLLLIL = c674630QdB;
        if (c674630QdB == null || (str = c674630QdB.LIZJ) == null) {
            str = "";
        }
        PR(null, null, null, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b1  */
    @Override // X.InterfaceC671770QWp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ec(X.EnumC674310Qcf r13, boolean r14) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.middle.ai.ui.EcSearchMiddleAIFragment.Ec(X.0Qcf, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OR(int r5, boolean r6) throws org.json.JSONException {
        /*
            r4 = this;
            boolean r0 = r4.LLIZ
            if (r0 != 0) goto L5
            return
        L5:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r0 = "visible"
            r3.put(r0, r6)
            r1 = 0
            if (r6 == 0) goto L3d
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L4c
            android.content.res.Resources r0 = r0.getResources()
            if (r0 == 0) goto L4c
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            if (r0 == 0) goto L4c
            float r0 = r0.density
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            float r1 = r2.floatValue()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L4c
            float r1 = r2.floatValue()
        L37:
            float r0 = (float) r5
            float r0 = r0 / r1
            int r1 = X.C814420VxA.LIZIZ(r0)
        L3d:
            java.lang.String r0 = "height"
            r3.put(r0, r1)
            X.0QCO r1 = r4.LLILZ
            if (r1 == 0) goto L4b
            java.lang.String r0 = "ecKeyboardStatusChange"
            r1.LJIIIIZZ(r0, r3)
        L4b:
            return
        L4c:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.middle.ai.ui.EcSearchMiddleAIFragment.OR(int, boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        LiveData liveData;
        LiveData liveData2;
        LiveData liveData3;
        DynamicPatch dynamicPatch;
        AbstractC1542100qES abstractC1542100qES;
        LynxView lynxView;
        String strLIZ;
        C674270Qcb c674270QcbVQ2;
        C674290Qcd c674290Qcd;
        C674330Qch c674330Qch;
        super.onViewCreated(view, bundle);
        C673940Qc4.LJIIJJI(EnumC673970Qc7.AI_SEARCH);
        TemplateData templateData = null;
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, IEcSearchMiddleAIPageAbility.class, null, null);
        if ((view instanceof C674330Qch) && (c674330Qch = (C674330Qch) view) != null) {
            c674330Qch.setTouchHandle(new AwS589S0100000_10(this, 640));
        }
        this.LLILLL = (FrameLayout) view.findViewById(R.id.gjt);
        Context context = getContext();
        if (context != null) {
            C0QCO c0qco = new C0QCO(this, context, this);
            FrameLayout frameLayout = this.LLILLL;
            if (frameLayout != null) {
                C786410Ut5.LJJJJIZL(frameLayout);
            }
            FrameLayout frameLayout2 = this.LLILLL;
            if (frameLayout2 != null) {
                frameLayout2.addView(c0qco.LJIILIIL, new ViewGroup.LayoutParams(-1, -1));
            }
            if (this.LL != null) {
                dynamicPatch = new DynamicPatch();
                dynamicPatch.schema = (String) C18130078e.LIZ.getValue();
            } else {
                dynamicPatch = null;
            }
            EcSearchMiddleAIViewModel ecSearchMiddleAIViewModel = this.LL;
            if (ecSearchMiddleAIViewModel != null) {
                List<EcSearchAIHistoryWord> listLIZ = ecSearchMiddleAIViewModel.vQ2().LIZ();
                ArrayList arrayList = new ArrayList();
                Iterator<EcSearchAIHistoryWord> it2 = listLIZ.iterator();
                while (it2.hasNext()) {
                    String str = it2.next().word;
                    if (str != null) {
                        HashMap map = new HashMap();
                        map.put("word", str);
                        arrayList.add(map);
                    }
                }
                EnumC673970Qc7 enumC673970Qc7 = EnumC673970Qc7.AI_SEARCH;
                C673940Qc4.LIZLLL(enumC673970Qc7, listLIZ.size());
                if (C672250QYl.LIZJ().gsCacheEnable != 1 || ((strLIZ = (c674270QcbVQ2 = ecSearchMiddleAIViewModel.vQ2()).LIZLLL) == null && ((c674290Qcd = c674270QcbVQ2.LIZIZ) == null || (strLIZ = c674290Qcd.LIZ()) == null))) {
                    strLIZ = "";
                }
                C673940Qc4.LIZJ(enumC673970Qc7, C123100dR.LIZ(strLIZ));
                templateData = new TemplateData();
                templateData.LJIILIIL("history_list", arrayList);
                templateData.LJIILIIL("guess_data", strLIZ);
            }
            if (dynamicPatch != null && templateData != null) {
                C673940Qc4.LJIIIIZZ(EnumC673970Qc7.AI_SEARCH, false);
                if (Intrinsics.LJFF(dynamicPatch, c0qco.LJIIJJI)) {
                    Object kitView = c0qco.LJIILIIL.getKitView();
                    if ((kitView instanceof LynxView) && (lynxView = (LynxView) kitView) != null) {
                        lynxView.onEnterForeground();
                    }
                    InterfaceC1541990qEH kitView2 = c0qco.LJIILIIL.getKitView();
                    if (kitView2 != null && (abstractC1542100qES = c0qco.LJ) != null) {
                        abstractC1542100qES.LJLIIIL(kitView2);
                    }
                } else {
                    c0qco.LJII();
                    c0qco.LJIIJJI = dynamicPatch;
                    c0qco.LJIIL(dynamicPatch, templateData);
                }
            }
            this.LLILZ = c0qco;
            c0qco.LJIILJJIL = this.LLJIJIL;
            c0qco.LJ = new C0R4T(this, 14);
            MR();
        }
        AnonymousClass0378.LIZ().LIZLLL("update_ai_session_info", this.LLJI);
        EcSearchMiddleAIViewModel ecSearchMiddleAIViewModel2 = this.LL;
        if (ecSearchMiddleAIViewModel2 != null && (liveData3 = (LiveData) ecSearchMiddleAIViewModel2.LL.getValue()) != null) {
            liveData3.observe(this, new AObserverS214S0100000_10(this, 154));
        }
        EcSearchMiddleAIViewModel ecSearchMiddleAIViewModel3 = this.LL;
        if (ecSearchMiddleAIViewModel3 != null && (liveData2 = (LiveData) ecSearchMiddleAIViewModel3.LLILLJJLI.getValue()) != null) {
            liveData2.observe(this, new AObserverS214S0100000_10(this, 155));
        }
        EcSearchMiddleAIViewModel ecSearchMiddleAIViewModel4 = this.LL;
        if (ecSearchMiddleAIViewModel4 != null && (liveData = (LiveData) ecSearchMiddleAIViewModel4.LLILLL.getValue()) != null) {
            liveData.observe(this, new AObserverS214S0100000_10(this, 156));
        }
        if (C1204704nV.LIZIZ && this.LLJ == null) {
            InterfaceC674600Qd8 interfaceC674600Qd8 = new InterfaceC674600Qd8() { // from class: X.0Qcp
                @Override // X.InterfaceC674600Qd8
                public final void onHide(int i) {
                }

                @Override // X.InterfaceC674600Qd8
                public final void onShow(int i) {
                }

                @Override // X.InterfaceC674600Qd8
                public final void LIZ() throws JSONException {
                    this.LIZ.OR(0, false);
                }

                @Override // X.InterfaceC674600Qd8
                public final void LIZIZ(int i) throws JSONException {
                    this.LIZ.OR(i, true);
                }
            };
            Lifecycle lifecycle = getViewLifecycleOwner().getLifecycle();
            EcSearchKeyboardMonitor ecSearchKeyboardMonitor = new EcSearchKeyboardMonitor(view, interfaceC674600Qd8, lifecycle);
            lifecycle.addObserver(ecSearchKeyboardMonitor);
            this.LLJ = ecSearchKeyboardMonitor;
        }
    }

    @Override // X.InterfaceC671770QWp
    public final void ov(String str, boolean z) {
        if (!z) {
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            btmSDK.updateBtmPage(this, str);
            C0PSL c0psl = new C0PSL();
            c0psl.LIZ = true;
            btmSDK.onPageShow(this, null, c0psl);
        }
    }

    @Override // X.InterfaceC671770QWp
    public final void NQ(boolean z, String str, C674380Qcm c674380Qcm) throws JSONException {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i;
        C674370Qcl c674370Qcl;
        int i2;
        C674370Qcl c674370Qcl2;
        String str7 = str;
        C674360Qck c674360Qck = this.LLILZIL;
        if (c674360Qck != null && (c674370Qcl2 = c674360Qck.LIZIZ) != null) {
            c674370Qcl2.LJFF = true;
            c674370Qcl2.LJII = true;
        }
        if (z) {
            if (c674380Qcm != null) {
                str7 = c674380Qcm.LIZIZ;
            } else {
                str7 = null;
            }
        }
        if (C123100dR.LIZ(str7)) {
            this.LLILZLL = true;
            EcSearchMiddleAIViewModel ecSearchMiddleAIViewModel = this.LL;
            if (ecSearchMiddleAIViewModel != null) {
                ecSearchMiddleAIViewModel.Oe1(str7);
            }
            if (z) {
                C674360Qck c674360Qck2 = this.LLILZIL;
                Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("suggest_position", 0), new Pair("suggest_type", "underlying_words"));
                if (c674380Qcm != null) {
                    String str8 = c674380Qcm.LIZ;
                    if (str8 != null) {
                        mapLJIIJ.put("impr_id", str8);
                    }
                    String str9 = c674380Qcm.LIZIZ;
                    if (str9 != null) {
                        mapLJIIJ.put("suggest_content", str9);
                    }
                    String str10 = c674380Qcm.LJ;
                    if (str10 != null) {
                        mapLJIIJ.put("suggest_id", str10);
                    }
                    Long l = c674380Qcm.LJFF;
                    if (l != null) {
                        mapLJIIJ.put("show_duration", Long.valueOf(System.currentTimeMillis() - l.longValue()));
                    }
                }
                if (c674360Qck2 != null) {
                    String str11 = c674360Qck2.LIZ;
                    if (str11 != null) {
                        mapLJIIJ.put("ai_session_id", str11);
                    }
                    String str12 = c674360Qck2.LJ;
                    if (str12 != null) {
                        mapLJIIJ.put("previous_session_id", str12);
                    }
                    Integer num = c674360Qck2.LJFF;
                    if (num != null) {
                        mapLJIIJ.put("previous_chat_rounds", Integer.valueOf(num.intValue()));
                    }
                    if (c674360Qck2.LIZLLL > 0) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    mapLJIIJ.put("is_revisit", Integer.valueOf(i2));
                    Integer numValueOf = Integer.valueOf(c674360Qck2.LIZLLL);
                    if (numValueOf.intValue() > 0) {
                        mapLJIIJ.put("revisit_seq", Integer.valueOf(numValueOf.intValue()));
                    }
                    C674370Qcl c674370Qcl3 = c674360Qck2.LIZIZ;
                    if (c674370Qcl3 != null) {
                        mapLJIIJ.put("ai_session_seq", Integer.valueOf(c674370Qcl3.LIZ));
                    }
                }
                C1421105hJ.LIZJ("ai_search_suggest_click", mapLJIIJ);
                str2 = "recommend_click";
            } else {
                C674630QdB c674630QdB = this.LLIZLLLIL;
                if (c674630QdB != null && (str3 = c674630QdB.LIZJ) != null && str3.length() != 0) {
                    C674630QdB c674630QdB2 = this.LLIZLLLIL;
                    if (c674630QdB2 != null && c674630QdB2.LJIILLIIL) {
                        str2 = "voice_text";
                    } else {
                        str2 = "voice";
                    }
                } else {
                    str2 = "manual";
                }
            }
            C674360Qck c674360Qck3 = this.LLILZIL;
            Integer numValueOf2 = Integer.valueOf(str7.length());
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair("input_from_recommendation", 1);
            if (c674360Qck3 != null && (c674370Qcl = c674360Qck3.LIZIZ) != null && c674370Qcl.LJ) {
                str4 = "paste";
            } else {
                str4 = "keyboard";
            }
            pairArr[1] = new Pair("input_method", str4);
            pairArr[2] = new Pair("has_placeholder", Integer.valueOf(z ? 1 : 0));
            Map mapLJIIJ2 = C2097608Jq.LJIIJ(pairArr);
            mapLJIIJ2.put("input_query", str7);
            if (numValueOf2 != null) {
                mapLJIIJ2.put("query_length", Integer.valueOf(numValueOf2.intValue()));
            }
            if (c674360Qck3 != null) {
                String str13 = c674360Qck3.LIZ;
                if (str13 != null) {
                    mapLJIIJ2.put("ai_session_id", str13);
                }
                String str14 = c674360Qck3.LJ;
                if (str14 != null) {
                    mapLJIIJ2.put("previous_session_id", str14);
                }
                Integer num2 = c674360Qck3.LJFF;
                if (num2 != null) {
                    mapLJIIJ2.put("previous_chat_rounds", Integer.valueOf(num2.intValue()));
                }
                String str15 = c674360Qck3.LJI;
                if (str15 != null) {
                    mapLJIIJ2.put("previous_query", str15);
                }
                if (c674360Qck3.LIZLLL > 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                mapLJIIJ2.put("is_revisit", Integer.valueOf(i));
                Integer numValueOf3 = Integer.valueOf(c674360Qck3.LIZLLL);
                if (numValueOf3.intValue() > 0) {
                    mapLJIIJ2.put("revisit_seq", Integer.valueOf(numValueOf3.intValue()));
                }
                C674370Qcl c674370Qcl4 = c674360Qck3.LIZIZ;
                if (c674370Qcl4 != null) {
                    mapLJIIJ2.put("ai_session_seq", Integer.valueOf(c674370Qcl4.LIZ));
                }
            }
            C1421105hJ.LIZJ("ai_search_input_submit", mapLJIIJ2);
            C674480Qcw c674480Qcw = C674480Qcw.LIZ;
            C674360Qck c674360Qck4 = this.LLILZIL;
            if (c674360Qck4 != null) {
                str5 = c674360Qck4.LIZ;
            } else {
                str5 = null;
            }
            C0QER c0qer = this.LLILLJJLI;
            C674630QdB c674630QdB3 = this.LLIZLLLIL;
            if (c674630QdB3 != null) {
                str6 = c674630QdB3.LIZJ;
            } else {
                str6 = null;
            }
            c674480Qcw.getClass();
            Context context = getContext();
            if (context != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("op_type", 1);
                jSONObject.put("content", str7);
                jSONObject.put("enter_source", 1);
                jSONObject.put("entry_time", System.currentTimeMillis());
                String strJ3 = C786410Ut5.J3(jSONObject);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("search_entrance", C0QR7.LJ(c0qer));
                if (str5 != null) {
                    jSONObject2.put("ai_session_id", str5);
                }
                if (str6 != null) {
                    jSONObject2.put("voice_message_id", str6);
                }
                jSONObject2.put("input_type", str2);
                jSONObject2.put("enter_method", "ai_srch_tab");
                String strJ32 = C786410Ut5.J3(jSONObject2);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("typewriter_effect", 1);
                if (c0qer != null) {
                    jSONObject3.put("root_enter_from_type", c0qer.getEcSearchEntranceValue());
                }
                SmartRouter.buildRoute(context, C1976807ok.LIZ(UriProtector.parse("aweme://ec/ai_search?"), new Pair("requestParams", strJ3), new Pair("trackParams", strJ32), new Pair("featureParams", C786410Ut5.J3(jSONObject3)), new Pair("source_btm_token", BtmSDK.INSTANCE.createJumpSourceBtmToken("a2270.b17222.c17005.d69438", PageFinder.via((Fragment) this), null))).toString()).open();
            }
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bre, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void PR(List<EcSearchAIHistoryWord> list, String str, C673920Qc2 c673920Qc2, String str2) {
        JSONObject jSONObject = new JSONObject();
        NR(jSONObject);
        if (list != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator<EcSearchAIHistoryWord> it2 = list.iterator();
            while (it2.hasNext()) {
                String str3 = it2.next().word;
                if (C123100dR.LIZ(str3) && str3 != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("word", str3);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("history_list", jSONArray);
        }
        if (str != null) {
            jSONObject.put("guess_data", str);
        }
        if (c673920Qc2 != null) {
            jSONObject.put("perf_data", c673920Qc2.LIZ());
        }
        if (str2 != null) {
            jSONObject.put("voice_message_id", str2);
        }
        C0QCO c0qco = this.LLILZ;
        if (c0qco != null) {
            c0qco.LJIIIZ("EC_SEARCH_AI_MP_UPDATE_DATA", jSONObject);
        }
    }
}
