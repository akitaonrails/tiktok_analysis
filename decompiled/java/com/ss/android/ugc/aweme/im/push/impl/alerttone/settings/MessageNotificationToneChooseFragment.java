package com.ss.android.ugc.aweme.im.push.impl.alerttone.settings;

import X.AbstractC1711506n3;
import X.C01GW;
import X.C05P0;
import X.C069P;
import X.C098200Yq;
import X.C099R;
import X.C09U0;
import X.C0I0B;
import X.C0PEM;
import X.C0Y8T;
import X.C0YNP;
import X.C0YSQ;
import X.C0ZFW;
import X.C13FE;
import X.C13LE;
import X.C1495805tM;
import X.C1669670tYD;
import X.C1685300txQ;
import X.C1807670x8n;
import X.C1848530yCh;
import X.C189200o6;
import X.C19719212De;
import X.C19EG;
import X.C19GS;
import X.C20028913Yh;
import X.C20277814Wa;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C452501pT;
import X.C891040YxS;
import X.C891270Yxp;
import X.C891300Yxs;
import X.C891310Yxt;
import X.C891340Yxw;
import X.C891430Yy5;
import X.C891440Yy6;
import X.C898270ZLt;
import X.EnumC1427810nG7;
import X.EnumC891450Yy7;
import X.InterfaceC1364105Vn;
import X.InterfaceC21503819Do;
import X.InterfaceC2217461Bqa;
import X.InterfaceC836760Ws6;
import X.InterfaceC876950Yaj;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneItem;
import com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneValueItem;
import com.ss.android.ugc.aweme.im.push.api.alerttone.service.IMessageAlertToneService;
import com.ss.android.ugc.aweme.im.push.impl.alerttone.impl.MessageAlertToneService;
import com.ss.android.ugc.aweme.im.saas.host.api.friends.IMFriendsService;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@InterfaceC836760Ws6
public final class MessageNotificationToneChooseFragment extends BaseFragment implements InterfaceC21503819Do {
    public static final C891440Yy6 LLJJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwhZz8mOy1iICIjJGstJSohPDEjJyp9HELIOSOyA4PSY9LzZiBCogOyQrLAE8PCwqICwyPCwjJxs8JiAPISA8OyAKOy40JSAiPQ==";
    public String LLJILJILJ;
    public volatile AlertToneValueItem LLJILLL;
    public volatile C09U0 LLJJIJIIJIL;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 580));
    public final C05P0<AlertToneItem> LLIZLLLIL = C20028913Yh.LJI(null);
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 582));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 578));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 579));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 577));
    public final C05P0<EnumC891450Yy7> LLJJ = C20028913Yh.LJI(null);
    public final C05P0<String> LLJJI = C20028913Yh.LJI("");
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS558S0100000_14(this, 581));
    public final Set<String> LLJJIJI = new LinkedHashSet();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MessageNotificationToneChooseFragment.class, "dispatchers", "getDispatchers()Lcom/ss/android/ugc/aweme/utils/dispatchers/TTDispatchers;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIJIL = new C891440Yy6();
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void Q9(Activity activity) {
    }

    public final Map<String, String> SR() {
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("enter_from", this.LLJIJIL.getValue());
        String str = this.LLJILJILJ;
        if (str == null && (str = VR().selectedValue) == null) {
            str = "";
        }
        pairArr[1] = new Pair("tones_id", str);
        return C2097608Jq.LJIIJ(pairArr);
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    public final C09U0 aS() {
        C09U0 c09u0 = this.LLJJIJIIJIL;
        if (c09u0 == null) {
            synchronized (this) {
                c09u0 = this.LLJJIJIIJIL;
                if (c09u0 == null) {
                    C09U0 c09u02 = (C09U0) C1807670x8n.p();
                    this.LLJJIJIIJIL = c09u02;
                    return c09u02;
                }
            }
        }
        return c09u0;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void onActivityFinish() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void qO(Intent intent) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void tv() {
        C20277814Wa.LIZIZ(this);
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    public final Map<String, String> UR() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (ZR().length() > 0) {
            linkedHashMap.put("conversation_id", ZR());
            linkedHashMap.put("chat_type", WR());
            C1495805tM c1495805tM = C1495805tM.LIZ;
            String strZR = ZR();
            String strWR = WR();
            c1495805tM.getClass();
            linkedHashMap.putAll(C1495805tM.LIZJ(strZR, strWR));
        }
        return linkedHashMap;
    }

    public final AlertToneItem VR() {
        AlertToneItem alertToneItem = (AlertToneItem) ((C13FE) this.LLIZLLLIL).getValue();
        return alertToneItem == null ? (AlertToneItem) this.LLIZ.getValue() : alertToneItem;
    }

    public final String WR() {
        return (String) this.LLJILJIL.getValue();
    }

    public final String ZR() {
        return (String) this.LLJI.getValue();
    }

    public final boolean bS() {
        return ((Boolean) this.LLJJIII.getValue()).booleanValue();
    }

    public final String cS() {
        return (String) this.LLJ.getValue();
    }

    public final void dS() {
        String strLIZIZ;
        ((C13FE) this.LLJJ).setValue(EnumC891450Yy7.LL);
        IMessageAlertToneService.LIZ.getClass();
        IMessageAlertToneService iMessageAlertToneServiceLIZ = C891310Yxt.LIZ();
        if (iMessageAlertToneServiceLIZ == null) {
            ((C13FE) this.LLJJ).setValue(EnumC891450Yy7.LLILLJJLI);
            return;
        }
        C05P0<String> c05p0 = this.LLJJI;
        C19EG activity = getActivity();
        String strLJIIJ = "";
        if (activity != null) {
            C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(ZR());
            if (c0y8tLIZ == null || c0y8tLIZ.getConversationType() != AbstractC1711506n3.LIZ) {
                strLJIIJ = C0ZFW.LIZ.LJIIJ(c0y8tLIZ);
            } else {
                String strValueOf = String.valueOf(C0YNP.LJII(ZR()));
                IMContactApi.LIZ.getClass();
                IMUser iMUserLIZLLL = C069P.LIZ().LJ().LIZLLL(strValueOf, null, "im_push");
                if (iMUserLIZLLL != null) {
                    IMFriendsService.LIZ.getClass();
                    IMFriendsService iMFriendsServiceLIZ = C898270ZLt.LIZ();
                    if (iMFriendsServiceLIZ != null && (strLIZIZ = iMFriendsServiceLIZ.LIZIZ(iMUserLIZLLL.getUid(), iMUserLIZLLL.getDisplayName())) != null) {
                        strLJIIJ = strLIZIZ;
                    }
                }
            }
            strLJIIJ = strLJIIJ.length() > 0 ? activity.getString(2131830934, strLJIIJ) : activity.getString(2131827521);
        }
        ((C13FE) c05p0).setValue(strLJIIJ);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C891340Yxw(iMessageAlertToneServiceLIZ, this, null), 3);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        AlertToneValueItem alertToneValueItem = this.LLJILLL;
        if (alertToneValueItem != null) {
            this.LLJILLL = null;
            String str = VR().alertToneScene;
            if (str == null) {
                str = "";
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ())), null, null, new C891430Yy5(this, str, alertToneValueItem, null), 3);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        C19EG activity;
        MessageAlertToneService.LJ.getClass();
        if (C891040YxS.LIZ() && (activity = getActivity()) != null) {
            activity.setVolumeControlStream(Integer.MIN_VALUE);
        }
        View view = getView();
        if (view != null) {
            C1848530yCh.LJ(new AwS593S0100000_14(this, 66), view);
        }
        C1495805tM c1495805tM = C1495805tM.LIZ;
        String previousPage = getPreviousPage();
        String strZR = ZR();
        String strWR = WR();
        String str = this.LLJILJILJ;
        if (str == null && (str = VR().selectedValue) == null) {
            str = "";
        }
        c1495805tM.getClass();
        C1495805tM.LJ("ttsocial_alert_tones_settings_exit", C1495805tM.LIZLLL(previousPage, strZR, strWR, str));
        super.onPause();
    }

    public final void gS() {
        C1848530yCh.LIZIZ("ttsocial_alert_tones_settings_enter", new AwS593S0100000_14(C2097608Jq.LJIIL(UR(), SR()), (Map<String, String>) 65), 62);
    }

    public final String getPreviousPage() {
        return Intrinsics.LJFF(cS(), "conversation") ? "chat_settings" : "notification_settings_page";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        C19EG activity;
        super.onResume();
        MessageAlertToneService.LJ.getClass();
        if (C891040YxS.LIZ() && (activity = getActivity()) != null) {
            activity.setVolumeControlStream(3);
        }
        if (bS() && ((C13FE) this.LLIZLLLIL).getValue() == null) {
            return;
        }
        C1495805tM c1495805tM = C1495805tM.LIZ;
        String str = (String) this.LLJIJIL.getValue();
        String strZR = ZR();
        String strWR = WR();
        String str2 = this.LLJILJILJ;
        if (str2 == null && (str2 = VR().selectedValue) == null) {
            str2 = "";
        }
        c1495805tM.getClass();
        C1495805tM.LJFF(str, strZR, strWR, str2);
        View view = getView();
        if (view != null) {
            C1848530yCh.LJ(new AwS593S0100000_14(this, 67), view);
        }
        if (bS()) {
            gS();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS248S0000000_14.get$arr$(147));
    }

    public final Object hS(AlertToneValueItem alertToneValueItem, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, aS().LIZJ, new C891300Yxs(alertToneValueItem, this, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    public final void iS(String str, String str2) {
        Uri uriLJIIZILJ;
        boolean z;
        String str3;
        if (this.LLJJIJI.contains(str)) {
            return;
        }
        this.LLJJIJI.add(str);
        IMessageAlertToneService.LIZ.getClass();
        IMessageAlertToneService iMessageAlertToneServiceLIZ = C891310Yxt.LIZ();
        if (iMessageAlertToneServiceLIZ != null) {
            uriLJIIZILJ = iMessageAlertToneServiceLIZ.LJIIZILJ(str2);
        } else {
            uriLJIIZILJ = null;
        }
        if (uriLJIIZILJ != null) {
            z = true;
        } else {
            z = false;
        }
        C0I0B.LJFF.LIZIZ();
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("resource_type", str);
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[1] = new Pair("hit_cache", str3);
        C20684815ws.LJIILLIIL("alert_tone_resource_hit_cache", C2097608Jq.LJIIIIZZ(pairArr));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1848530yCh.LIZLLL(view, "page_alert_tones_settings", new AwS593S0100000_14(this, 68));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[AlertTone] ChooseFragment.onCreateView: saveMode=");
        sbLIZ.append(cS());
        sbLIZ.append(", convId=");
        sbLIZ.append(ZR());
        sbLIZ.append(", enterFrom=");
        sbLIZ.append((String) this.LLJIJIL.getValue());
        sbLIZ.append(", selectedValue=");
        sbLIZ.append(VR().selectedValue);
        sbLIZ.append(", items=");
        List<AlertToneValueItem> list = VR().alertToneValueItems;
        C19GS c19gs = null;
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (bS()) {
            dS();
        }
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setFitsSystemWindows(true);
        C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(992507950, new AwS633S0100000_19(this, 45), true));
        try {
            ViewTreeLifecycleOwner.set(composeView, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(composeView, this);
            composeView.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return composeView;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return composeView;
        }
    }

    public final Object kS(String str, AlertToneValueItem alertToneValueItem, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, aS().LIZ, new C891270Yxp(this, function03, str, alertToneValueItem, function02, function0, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }
}
