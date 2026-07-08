package com.ss.android.ugc.aweme.inbox;

import X.AbstractC1387200mCc;
import X.AbstractC2361009My;
import X.C01GW;
import X.C0DTR;
import X.C0OQN;
import X.C0P0T;
import X.C1058550deX;
import X.C10S5;
import X.C1100300ejs;
import X.C1229030i5V;
import X.C1229120i5e;
import X.C1319210kQx;
import X.C13LE;
import X.C1749280vcc;
import X.C1903860zdw;
import X.C1903880zdy;
import X.C1904080zeI;
import X.C1906580ziK;
import X.C19EG;
import X.C2217381BqS;
import X.C452501pT;
import X.C481090Itn;
import X.C664270Q3t;
import X.C687700QyG;
import X.C688120Qyw;
import X.C890330YwJ;
import X.C891780Yye;
import X.InterfaceC1055110dYz;
import X.InterfaceC1146704e9;
import X.InterfaceC1349380lDc;
import X.InterfaceC1581730rGN;
import X.InterfaceC1593560rZS;
import X.InterfaceC19341710lj;
import X.InterfaceC20660615sy;
import X.InterfaceC2217461Bqa;
import X.InterfaceC487330J9f;
import Y.ARunnableS22S0210000_21;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public abstract class BaseInboxFragment extends CommonPageFragment implements InterfaceC1593560rZS, InterfaceC19341710lj, InterfaceC1055110dYz, C10S5, InterfaceC487330J9f, InterfaceC1349380lDc, InterfaceC20660615sy, InterfaceC1581730rGN, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public C481090Itn LL;
    public RelativeLayout LLILLJJLI;
    public C1100300ejs LLILLL;
    public C1749280vcc LLILZ;
    public C1319210kQx LLILZIL;
    public int LLJI;
    public final String LLJILJILJ;
    public final C1904080zeI LLJILLL;
    public long LLILZLL = -1;
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(195));
    public final C891780Yye LLIZLLLIL = new C891780Yye();
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(197));
    public final C01GW LLJIJIL = C0DTR.LIZJ(new AwS572S0100000_28(this, 232));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(196));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BaseInboxFragment.class, "mainBusinessAbility", "getMainBusinessAbility()Lcom/ss/android/ugc/aweme/base/MainBusinessAbility;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class});
    }

    public void clearFromXmlViewCache() {
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
    }

    @Override // X.C10S5, X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "b9081";
    }

    @Override // X.InterfaceC1583780rJg
    public final String getHoxNodeTag() {
        return "";
    }

    @Override // X.InterfaceC1146704e9
    public List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        return arrayList;
    }

    @Override // X.C10S5
    public final String pO() {
        return "MainTabPage";
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    @Override // X.InterfaceC20660615sy
    public final boolean t2() {
        return true;
    }

    public final C1100300ejs MR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.caw) : null;
            this.LLILLL = (C1100300ejs) viewFindViewById;
        }
        return (C1100300ejs) viewFindViewById;
    }

    public final C1319210kQx NR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.kis) : null;
            this.LLILZIL = (C1319210kQx) viewFindViewById;
        }
        return (C1319210kQx) viewFindViewById;
    }

    public final RelativeLayout OR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.kkc) : null;
            this.LLILLJJLI = (RelativeLayout) viewFindViewById;
        }
        return (RelativeLayout) viewFindViewById;
    }

    public final C481090Itn PR() {
        return (C481090Itn) this.LLJIJIL.getValue();
    }

    public final C1749280vcc RR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.w0t) : null;
            this.LLILZ = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, X.InterfaceC744180THc
    public final Analysis getAnalysis() {
        Analysis analysis = new Analysis();
        analysis.setLabelName("notification_page");
        return analysis;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [X.0zeI] */
    public BaseInboxFragment() {
        C1903880zdy.LIZ.getClass();
        AFwS271S0000000_28 aFwS271S0000000_28 = AFwS271S0000000_28.get$arr$(248);
        C1903860zdw c1903860zdw = C1903880zdy.LIZIZ;
        if (c1903860zdw != null) {
            aFwS271S0000000_28.invoke(c1903860zdw);
        }
        IMChatListApi.LJJIII.getClass();
        C890330YwJ.LIZ().LJIIIIZZ().LIZ(System.currentTimeMillis());
        this.LLJILJILJ = "inbox";
        this.LLJILLL = new C0OQN() { // from class: X.0zeI
            @Override // X.C0OQN, X.C0VWC
            public final void LJIIJ(String str) {
                if (C1905440zgU.LIZ() > 0) {
                    ArrayList arrayList = new ArrayList();
                    if (((Boolean) C1905440zgU.LIZJ.getValue()).booleanValue()) {
                        arrayList.add("start_gc_block");
                    }
                    if (((Boolean) C1905440zgU.LIZ.getValue()).booleanValue()) {
                        arrayList.add("start_jit_block");
                    }
                    if (((Boolean) C1905440zgU.LIZIZ.getValue()).booleanValue()) {
                        arrayList.add("start_log_block");
                    }
                    if (((Boolean) C1905440zgU.LIZLLL.getValue()).booleanValue()) {
                        arrayList.add("start_boot_finish");
                    }
                    if (((Boolean) C1905440zgU.LJ.getValue()).booleanValue()) {
                        arrayList.add("start_do_frame");
                    }
                    if (((Boolean) C1905440zgU.LJFF.getValue()).booleanValue()) {
                        arrayList.add("thread_priority");
                    }
                    C20736916Cp.LIZ(arrayList);
                }
            }

            @Override // X.C0OQN, X.C0VWC
            public final void onStop(String str) {
                if (C1905440zgU.LIZ() > 0) {
                    SystemClock.uptimeMillis();
                    ArrayList arrayList = new ArrayList();
                    if (((Boolean) C1905440zgU.LIZJ.getValue()).booleanValue()) {
                        arrayList.add("stop_gc_block");
                    }
                    if (((Boolean) C1905440zgU.LIZ.getValue()).booleanValue()) {
                        arrayList.add("stop_jit_block");
                    }
                    if (((Boolean) C1905440zgU.LIZIZ.getValue()).booleanValue()) {
                        arrayList.add("stop_log_block");
                    }
                    if (((Boolean) C1905440zgU.LIZLLL.getValue()).booleanValue()) {
                        arrayList.add("stop_boot_finish");
                    }
                    if (((Boolean) C1905440zgU.LJ.getValue()).booleanValue()) {
                        arrayList.add("stop_do_frame");
                    }
                    if (((Boolean) C1905440zgU.LJFF.getValue()).booleanValue()) {
                        arrayList.add("reset_thread_priority");
                    }
                    C20736916Cp.LIZIZ(arrayList);
                }
            }
        };
    }

    public final void SR() {
        ((IScreenshotService) ServiceManager.get().getService(IScreenshotService.class)).LIZJ("notification_page");
    }

    public final void UR() {
        final String simpleName;
        Object obj;
        AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
        if (abstractC1387200mCcLJFF == null || (obj = abstractC1387200mCcLJFF.LIZ) == null || (simpleName = obj.getClass().getSimpleName()) == null) {
            simpleName = "";
        }
        IScreenshotService iScreenshotService = (IScreenshotService) ServiceManager.get().getService(IScreenshotService.class);
        SR();
        iScreenshotService.LJI("notification_page", new AbstractC2361009My() { // from class: X.0lfT
            @Override // X.AbstractC2361009My
            public final boolean onShot(String str) {
                return false;
            }

            @Override // X.AbstractC2361009My
            public final Map<String, String> mobExtraParams() {
                Object obj2;
                AbstractC1387200mCc abstractC1387200mCcLJFF2 = C1906580ziK.LJFF();
                return TextUtils.equals((abstractC1387200mCcLJFF2 == null || (obj2 = abstractC1387200mCcLJFF2.LIZ) == null) ? null : obj2.getClass().getSimpleName(), simpleName) ? C2097908Jt.LIZJ(new Pair("enter_from", "notification_page")) : C2097608Jq.LJ();
            }
        });
    }

    @Override // X.InterfaceC20658015sY
    public boolean Xu() {
        C19EG activity = getActivity();
        return activity != null && getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED) && C1058550deX.LIZJ(activity, "NOTIFICATION");
    }

    @Override // X.InterfaceC20658015sY
    public final C688120Qyw i2() {
        return new C688120Qyw(requireContext(), this, null);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return C664270Q3t.LIZ(this);
    }

    @Override // X.InterfaceC1581730rGN
    public final View yC() {
        return OR();
    }

    @Override // X.InterfaceC20658015sY
    public final String getSceneId() {
        return this.LLJILJILJ;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        checkParentScope();
    }

    @Override // X.InterfaceC1349380lDc
    public final void Qf(RecyclerView.ViewHolder viewHolder, boolean z) {
        C1319210kQx c1319210kQxNR;
        if (viewHolder != null && (c1319210kQxNR = NR()) != null) {
            HandlerHook.viewPost(c1319210kQxNR, new ARunnableS22S0210000_21(viewHolder, z, this, 3));
        }
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        C1229030i5V.LIZJ.LIZIZ.getClass();
        C0P0T c0p0t = C1229120i5e.LIZJ;
        if (c0p0t != null && c0p0t.isShowing()) {
            c0p0t.dismiss();
        }
    }
}
