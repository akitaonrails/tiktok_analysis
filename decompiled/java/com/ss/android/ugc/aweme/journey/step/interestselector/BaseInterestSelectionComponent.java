package com.ss.android.ugc.aweme.journey.step.interestselector;

import X.AbstractC1585810rMx;
import X.AbstractC214823195h;
import X.AbstractC21673619ry;
import X.AnonymousClass0956;
import X.C01GW;
import X.C073Z;
import X.C07FO;
import X.C098200Yq;
import X.C09JN;
import X.C0ABE;
import X.C0B6M;
import X.C0C64;
import X.C0CCZ;
import X.C0CR3;
import X.C0OM1;
import X.C0TA0;
import X.C10H5;
import X.C10HC;
import X.C10HD;
import X.C10MD;
import X.C10NW;
import X.C10PL;
import X.C10QS;
import X.C10R0;
import X.C10R1;
import X.C10R5;
import X.C10RB;
import X.C10RG;
import X.C10RH;
import X.C10RL;
import X.C10RS;
import X.C10SG;
import X.C10SV;
import X.C1150504el;
import X.C118300cf;
import X.C11JF;
import X.C11S5;
import X.C1250250idj;
import X.C1250300ido;
import X.C1326405Ha;
import X.C13BV;
import X.C13LP;
import X.C1514430pVp;
import X.C15438062q;
import X.C1568170quV;
import X.C1673970tf9;
import X.C1673980tfA;
import X.C1685300txQ;
import X.C1720306oT;
import X.C1800250wwp;
import X.C1848530yCh;
import X.C1869040yjm;
import X.C189200o6;
import X.C1911400zq6;
import X.C1911410zq7;
import X.C1912470zrp;
import X.C1912930zsZ;
import X.C1912940zsa;
import X.C1912950zsb;
import X.C19235810Ng;
import X.C19241910Pp;
import X.C19242510Pv;
import X.C19244710Qr;
import X.C19244810Qs;
import X.C19245110Qv;
import X.C19245410Qy;
import X.C19245810Rc;
import X.C19246210Rg;
import X.C19248710Sf;
import X.C19252910Tv;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C19ME;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C23250099c;
import X.C2344009Gk;
import X.C418440Gaw;
import X.C420970Gf1;
import X.C426750GoL;
import X.C452501pT;
import X.C590950NFt;
import X.C616540OGe;
import X.C786410Ut5;
import X.C799890VZj;
import X.C799900VZk;
import X.C807840VmY;
import X.C814420VxA;
import X.C817403Hg;
import X.EnumC452301pR;
import X.EnumC638250P1r;
import X.InterfaceC1740760vOs;
import X.InterfaceC19246610Rk;
import Y.ACListenerS130S0200000_28;
import Y.ACListenerS162S0100000_28;
import Y.ARunnableS61S0300000_28;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.gson.e;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.NewUserJourneyContainerActivity;
import com.ss.android.ugc.aweme.app.services.IHybridABInfoService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.configuration.dialogs.ConsentBoxDialogAbility$registerObserver$lifeCycleObserver$1;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.INewUserMainModuleService;
import com.ss.android.ugc.aweme.journey.NewUserJourneyActivity;
import com.ss.android.ugc.aweme.journey.SelectedInterestList;
import com.ss.android.ugc.aweme.journey.com.ss.android.ugc.aweme.NewUserJourneyFragment;
import com.ss.android.ugc.aweme.journey.experiment.RevampISExperiment;
import com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.plugin.journey.NewUserInterestStruct;
import com.ss.android.ugc.aweme.plugin.journey.TrendingCreatorsPageStruct;
import com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment;
import com.ss.android.ugc.aweme.service.interest.IInterestReselectionService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS272S0300000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes29.dex */
public class BaseInterestSelectionComponent extends NUJComponentFragment implements InterfaceC1740760vOs, C10MD {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zi8jPD09LTxiOjs2OGslJzs2OiHELIOSA/PTw2JCAvPSAhZgctOioaJjEpOyogPBYpJSowPCwjJww8JTUjJyo9PA==";
    public ConstraintLayout LLJI;
    public ConstraintLayout LLJIJIL;
    public C197039127h LLJILJIL;
    public C197039127h LLJILJILJ;
    public ConstraintLayout LLJILLL;
    public RecyclerView LLJJ;
    public TuxNavBar LLJJI;
    public View LLJJIII;
    public C420970Gf1 LLJJIJI;
    public View LLJJIJIIJIL;
    public AnonymousClass0956 LLJJJIL;
    public boolean LLJJJJJIL;
    public C11JF LLJJJJLIIL;
    public C19245810Rc LLJL;
    public long LLJLL;
    public ConstraintLayout LLJLLIL;
    public RecyclerView LLJLLL;
    public C197039127h LLJZ;
    public C197039127h LLJZIJLIL;
    public ConstraintLayout LLL;
    public TuxNavBar LLLF;
    public View LLLFF;
    public C420970Gf1 LLLFFI;
    public View LLLFZ;
    public String LLLI;
    public int LLLIIII;
    public int LLLIIIIL;
    public Integer LLLIIIL;
    public C10R1 LLLIILIL;
    public boolean LLLIL;
    public NewUserInterestStruct LLLILZ;
    public Boolean LLLILZJ;
    public String LLLL;
    public final IInterestReselectionService LLJJIJIL = (IInterestReselectionService) PluggableExtentionKt.pluggableSpi$default(IInterestReselectionService.class, false, false, false, 14, null);
    public boolean LLJJJ = true;
    public boolean LLJJJJ = true;
    public int LLJJL = -1;
    public final Keva LLJJLIIIJLLLLLLLZ = Keva.getRepo("new_user_journey");
    public long LLJLIL = SystemClock.elapsedRealtime();
    public long LLJLILLLLZIIL = SystemClock.elapsedRealtime();
    public int LLLII = 1;
    public final C19246210Rg LLLIIL = new C10SG() { // from class: X.10Rg
        @Override // X.C10SG
        public final void onFailure() {
            BaseInterestSelectionComponent baseInterestSelectionComponent = this.LIZ;
            baseInterestSelectionComponent.LLLII = 0;
            baseInterestSelectionComponent.LLLIIII++;
        }
    };
    public final boolean LLLILZLLLI = true;
    public final AwS607S0100000_28 LLLIZZ = new AwS607S0100000_28(this, 86);
    public final C01GW LLLJ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS217S0000000_28.get$arr$(241));
    public final C01GW LLLJIL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(238));
    public List<NewUserInterestStruct> LLLJL = C13BV.INSTANCE;
    public final C01GW LLLLII = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(239));
    public final C01GW LLLLIIIILLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(240));

    @Override // X.InterfaceC1740760vOs
    public String getBtmPageCode() {
        return "b6658";
    }

    @Override // X.InterfaceC1740760vOs
    public final Map<String, String> r9() {
        return null;
    }

    @Override // X.C10MD
    public final void At() {
        this.LLLI = "consent_box";
    }

    public void PS() {
        C19242510Pv c19242510Pv;
        C10PL c10pl;
        C19235810Ng c19235810Ng = C10NW.Companion;
        C1912470zrp c1912470zrpOR = NUJComponentFragment.OR();
        Integer numValueOf = null;
        if (c1912470zrpOR != null && (c10pl = (C10PL) c1912470zrpOR.LIZIZ(C10PL.class)) != null) {
            numValueOf = Integer.valueOf(c10pl.LE0());
        }
        c19235810Ng.getClass();
        this.LLLI = C19235810Ng.LIZ(numValueOf);
        C1869040yjm c1869040yjmPR = PR();
        if ((c1869040yjmPR instanceof C19242510Pv) && (c19242510Pv = (C19242510Pv) c1869040yjmPR) != null) {
            this.LLJJJ = c19242510Pv.LIZIZ;
            C19245810Rc c19245810Rc = c19242510Pv.LIZJ;
            this.LLJL = c19245810Rc;
            NS(c19245810Rc);
            String str = c19242510Pv.LJFF;
            this.LLLL = (str == null || str.length() == 0) ? "server_null" : c19242510Pv.LJFF;
        }
        this.LLLJL = nS();
    }

    public void ZR() {
        if (this.LLJI == null) {
            View view = getView();
            this.LLJI = (ConstraintLayout) (view != null ? view.findViewById(R.id.tqy) : null);
        }
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view2 = getView();
            viewFindViewById = view2 != null ? view2.findViewById(R.id.kmk) : null;
            this.LLJIJIL = (ConstraintLayout) viewFindViewById;
        }
        this.LLJLLIL = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = this.LLJILJIL;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            viewFindViewById2 = view3 != null ? view3.findViewById(R.id.csd) : null;
            this.LLJILJIL = (C197039127h) viewFindViewById2;
        }
        this.LLJZ = (C197039127h) viewFindViewById2;
        View viewFindViewById3 = this.LLJILJILJ;
        if (viewFindViewById3 == null) {
            View view4 = getView();
            viewFindViewById3 = view4 != null ? view4.findViewById(R.id.cv9) : null;
            this.LLJILJILJ = (C197039127h) viewFindViewById3;
        }
        this.LLJZIJLIL = (C197039127h) viewFindViewById3;
        View viewFindViewById4 = this.LLJILLL;
        if (viewFindViewById4 == null) {
            View view5 = getView();
            viewFindViewById4 = view5 != null ? view5.findViewById(R.id.cc3) : null;
            this.LLJILLL = (ConstraintLayout) viewFindViewById4;
        }
        this.LLL = (ConstraintLayout) viewFindViewById4;
        View viewFindViewById5 = this.LLJJ;
        if (viewFindViewById5 == null) {
            View view6 = getView();
            viewFindViewById5 = view6 != null ? view6.findViewById(R.id.tvr) : null;
            this.LLJJ = (RecyclerView) viewFindViewById5;
        }
        this.LLJLLL = (RecyclerView) viewFindViewById5;
        View viewFindViewById6 = this.LLJJI;
        if (viewFindViewById6 == null) {
            View view7 = getView();
            viewFindViewById6 = view7 != null ? view7.findViewById(R.id.y08) : null;
            this.LLJJI = (TuxNavBar) viewFindViewById6;
        }
        this.LLLF = (TuxNavBar) viewFindViewById6;
        View viewFindViewById7 = this.LLJJIII;
        if (viewFindViewById7 == null) {
            View view8 = getView();
            viewFindViewById7 = view8 != null ? view8.findViewById(R.id.u2p) : null;
            this.LLJJIII = viewFindViewById7;
        }
        this.LLLFF = viewFindViewById7;
        View viewFindViewById8 = this.LLJJIJI;
        if (viewFindViewById8 == null) {
            View view9 = getView();
            viewFindViewById8 = view9 != null ? view9.findViewById(R.id.b7m) : null;
            this.LLJJIJI = (C420970Gf1) viewFindViewById8;
        }
        this.LLLFFI = (C420970Gf1) viewFindViewById8;
        View view10 = this.LLJJIJIIJIL;
        if (view10 == null) {
            View view11 = getView();
            View viewFindViewById9 = view11 != null ? view11.findViewById(R.id.fz3) : null;
            this.LLJJIJIIJIL = viewFindViewById9;
            view10 = viewFindViewById9;
        }
        this.LLLFZ = view10;
    }

    public void aS() {
        C197039127h c197039127h = this.LLJZIJLIL;
        if (c197039127h != null) {
            c197039127h.setEnabled(false);
        }
    }

    public final InterfaceC19246610Rk bS() {
        RecyclerView recyclerView = this.LLJLLL;
        AbstractC21673619ry adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter instanceof InterfaceC19246610Rk) {
            return (InterfaceC19246610Rk) adapter;
        }
        return null;
    }

    public int gS() {
        RecyclerView recyclerView = this.LLJLLL;
        if (recyclerView == null) {
            return -1;
        }
        try {
            if (recyclerView.getLayoutManager() instanceof FlexboxLayoutManager) {
                return ((FlexboxLayoutManager) recyclerView.getLayoutManager()).findLastVisibleItemPosition();
            }
            if (recyclerView.getLayoutManager() instanceof GridLayoutManager) {
                return ((GridLayoutManager) recyclerView.getLayoutManager()).findLastVisibleItemPosition();
            }
            return -1;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return -1;
        }
    }

    public final void mS() {
        C197039127h c197039127h = this.LLJZIJLIL;
        if (c197039127h != null) {
            C786410Ut5.LLIL(c197039127h, 8);
        }
        C1911400zq6.LJFF(this.LLJZ, 0, 0, null, null, null, null, 246);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        this.LLJLL += SystemClock.elapsedRealtime() - this.LLJLIL;
        if (!this.LLJJJJJIL) {
            C10RH c10rhUS = uS();
            qS(c10rhUS.LIZJ, "background", c10rhUS.LIZIZ, c10rhUS.LJ);
            oS(false);
        } else if (ComplianceServiceProvider.LJJIII().LJ()) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "interest_selection");
            C20684815ws.LJIILLIIL("consent_monitor_online", c2344009Gk.LIZ);
        }
        JS();
        super.onStop();
        C1911410zq7.LIZ("BaseISComponent", "onStop");
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
    public void yS() {
        String str;
        Context context;
        String string;
        TuxNavBar tuxNavBar = this.LLLF;
        if (tuxNavBar != null) {
            C0OM1 c0om1 = new C0OM1();
            C1250250idj c1250250idj = new C1250250idj();
            C19245810Rc c19245810Rc = this.LLJL;
            if (c19245810Rc == null || (str = c19245810Rc.LJ) == null) {
                str = "";
            }
            c1250250idj.LIZJ = str;
            c1250250idj.LIZIZ = "nav_tag_title";
            c0om1.LIZJ = c1250250idj;
            if (C10RG.LIZIZ()) {
                C10RG.LIZIZ();
                if (C10RG.LIZ().LIZIZ && (context = getContext()) != null && (string = context.getString(2131838034)) != null) {
                    C1250300ido c1250300ido = new C1250300ido();
                    c1250300ido.LIZJ = string;
                    c1250300ido.LIZLLL = EnumC638250P1r.SECONDARY;
                    c1250300ido.LIZIZ = "nav_tag_skip";
                    c1250300ido.LIZ(new AwS572S0100000_28(this, 275));
                    c0om1.LIZIZ(c1250300ido);
                }
            }
            tuxNavBar.setNavActions(c0om1);
            WR(0);
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.10Rg] */
    public BaseInterestSelectionComponent() {
        C1912930zsZ c1912930zsZ = C1912930zsZ.LIZ;
        C10NW c10nw = C10NW.JOURNEY_INTERESTS_ID;
        c1912930zsZ.getClass();
        C1912940zsa c1912940zsaLIZ = C1912930zsZ.LIZ(c10nw);
        C1912930zsZ.LIZJ(c1912940zsaLIZ != null ? c1912940zsaLIZ.LJII : null);
    }

    public void HS() {
        if (RevampISExperiment.LIZ() && (getActivity() instanceof NewUserJourneyActivity)) {
            int iLLLLZIL = ((NewUserJourneyActivity) getActivity()).LLLLZIL(true);
            this.LLJJL = iLLLLZIL;
            VR(iLLLLZIL);
        }
        if (RevampISExperiment.LIZ() && (getActivity() instanceof NewUserJourneyContainerActivity)) {
            int iIS = ((NewUserJourneyContainerActivity) getActivity()).LL.iS(true);
            this.LLJJL = iIS;
            VR(iIS);
        } else if (RevampISExperiment.LIZ() && (getParentFragment() instanceof NewUserJourneyFragment)) {
            int iIS2 = ((NewUserJourneyFragment) getParentFragment()).iS(true);
            this.LLJJL = iIS2;
            VR(iIS2);
        }
    }

    public void JS() {
        if (RevampISExperiment.LIZ() && (getActivity() instanceof NewUserJourneyActivity)) {
            int iLLLLZIL = ((NewUserJourneyActivity) getActivity()).LLLLZIL(false);
            this.LLJJL = iLLLLZIL;
            VR(iLLLLZIL);
        }
        if (RevampISExperiment.LIZ() && (getActivity() instanceof NewUserJourneyContainerActivity)) {
            int iIS = ((NewUserJourneyContainerActivity) getActivity()).LL.iS(false);
            this.LLJJL = iIS;
            VR(iIS);
        } else if (RevampISExperiment.LIZ() && (getParentFragment() instanceof NewUserJourneyFragment)) {
            int iIS2 = ((NewUserJourneyFragment) getParentFragment()).iS(false);
            this.LLJJL = iIS2;
            VR(iIS2);
        }
    }

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment
    public String RR() {
        if (!RevampISExperiment.LIZ()) {
            return "normal";
        }
        RevampISExperiment.LIZ();
        C01GW c01gw = RevampISExperiment.LJ;
        String str = ((RevampISExperiment.ExperimentConfig) c01gw.getValue()).showIcon ? "emoji_word_" : "word_";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        RevampISExperiment.LIZ();
        sbLIZ.append(((RevampISExperiment.ExperimentConfig) c01gw.getValue()).spanCount);
        sbLIZ.append("columns");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append(strLIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public C10R1 cS() {
        boolean zBooleanValue;
        if (!RevampISExperiment.LIZ()) {
            List<NewUserInterestStruct> list = this.LLLJL;
            return new C19245410Qy(list, list, iS(), this.LLJL, this.LLLIIL, this.LLLILZJ);
        }
        List<NewUserInterestStruct> list2 = this.LLLJL;
        Function1<Integer, Unit> function1IS = iS();
        C19245810Rc c19245810Rc = this.LLJL;
        C19246210Rg c19246210Rg = this.LLLIIL;
        Boolean bool = this.LLLILZJ;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            RevampISExperiment.LIZ();
            zBooleanValue = ((RevampISExperiment.ExperimentConfig) RevampISExperiment.LJ.getValue()).showIcon;
        }
        return new C10R0(list2, function1IS, c19245810Rc, c19246210Rg, zBooleanValue);
    }

    public RecyclerView.LayoutManager dS() {
        if (!RevampISExperiment.LIZ()) {
            RecyclerView recyclerView = this.LLJLLL;
            return new FlexboxLayoutManager(recyclerView != null ? recyclerView.getContext() : null, 0);
        }
        RecyclerView recyclerView2 = this.LLJLLL;
        Context context = recyclerView2 != null ? recyclerView2.getContext() : null;
        RevampISExperiment.LIZ();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, ((RevampISExperiment.ExperimentConfig) RevampISExperiment.LJ.getValue()).spanCount);
        gridLayoutManager.LLIZ = new AbstractC214823195h() { // from class: X.10HF
            @Override // X.AbstractC214823195h
            public final int LJFF(int i) {
                if (i == 0) {
                    RevampISExperiment.LIZ();
                    return ((RevampISExperiment.ExperimentConfig) RevampISExperiment.LJ.getValue()).spanCount;
                }
                return 1;
            }
        };
        return gridLayoutManager;
    }

    public final List<NewUserInterestStruct> nS() {
        C19242510Pv c19242510Pv;
        List<NewUserInterestStruct> list;
        C1869040yjm c1869040yjmPR = PR();
        return (!(c1869040yjmPR instanceof C19242510Pv) || (c19242510Pv = (C19242510Pv) c1869040yjmPR) == null || (list = c19242510Pv.LIZLLL) == null) ? C13BV.INSTANCE : list;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (((Boolean) C07FO.LIZ.getValue()).booleanValue() || ((Boolean) C07FO.LIZIZ.getValue()).booleanValue()) {
            C19244810Qs c19244810Qs = C19244810Qs.LIZ;
            C11JF c11jf = this.LLJJJJLIIL;
            c19244810Qs.getClass();
            C19244810Qs.LIZLLL = c11jf;
            return;
        }
        C11JF c11jf2 = this.LLJJJJLIIL;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = null;
        this.LLJJI = null;
        this.LLJJIII = null;
        this.LLJJIJI = null;
        this.LLJJIJIIJIL = null;
    }

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C1911410zq7.LIZ("BaseISComponent", "onPause");
        AnonymousClass0956 anonymousClass0956 = this.LLJJJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        final RecyclerView recyclerView;
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(getClass().getName());
        }
        C1912930zsZ c1912930zsZ = C1912930zsZ.LIZ;
        C10NW c10nw = C10NW.JOURNEY_INTERESTS_ID;
        c1912930zsZ.getClass();
        C1912940zsa c1912940zsaLIZ = C1912930zsZ.LIZ(c10nw);
        C1912930zsZ.LIZJ(c1912940zsaLIZ != null ? c1912940zsaLIZ.LJI : null);
        super.onResume();
        C1911410zq7.LIZ("BaseISComponent", "onResume");
        if (hS() && (recyclerView = this.LLJLLL) != null) {
            final C118300cf c118300cf = new C118300cf();
            c118300cf.element = -1;
            final C118300cf c118300cf2 = new C118300cf();
            recyclerView.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.10RD
                @Override // X.AbstractC1585810rMx
                public final void LJJIIZI(RecyclerView recyclerView2, int i, int i2) {
                    int i3;
                    c118300cf2.element += i2;
                    if (i2 != 0 && this.isViewValid() && (i3 = c118300cf.element) != -1) {
                        int height = i3 - recyclerView.getHeight();
                        BaseInterestSelectionComponent baseInterestSelectionComponent = this;
                        View view = baseInterestSelectionComponent.LLLFF;
                        if (view != null) {
                            RecyclerView recyclerView3 = recyclerView;
                            C118300cf c118300cf3 = c118300cf2;
                            if (baseInterestSelectionComponent.LLLF != null) {
                                C786410Ut5.Ld(view, (((c118300cf3.element * 1.0f) / height) * (recyclerView3.getHeight() - view.getHeight())) + r3.getHeight());
                            }
                        }
                    }
                }
            });
            HandlerHook.viewPost(recyclerView, new ARunnableS61S0300000_28(this, recyclerView, new AwS272S0300000_28(c118300cf, recyclerView, this, 28), 12));
        }
        this.LLJLIL = SystemClock.elapsedRealtime();
        Integer num = ((C10HD) C10HC.LIZJ.getValue()).LIZIZ;
        if (num != null) {
            int iIntValue = num.intValue();
            AnonymousClass0956 anonymousClass0956 = this.LLJJJIL;
            if (anonymousClass0956 == null || !anonymousClass0956.isActive()) {
                this.LLJJJIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1326405Ha(iIntValue, this, null), 3);
            }
        }
        this.LLJLILLLLZIIL = this.LLJLIL;
        C2211631BhB.LJIIL(this, getActivity());
        C197039127h c197039127h = this.LLJZ;
        if (c197039127h != null) {
            C1848530yCh.LIZ(c197039127h, "btn_nuj_next", AFwS248S0000000_14.get$arr$(301));
        }
        C197039127h c197039127h2 = this.LLJZIJLIL;
        if (c197039127h2 != null) {
            C1848530yCh.LIZ(c197039127h2, "btn_nuj_skip", AFwS248S0000000_14.get$arr$(302));
        }
        C1912940zsa c1912940zsaLIZ2 = C1912930zsZ.LIZ(c10nw);
        C1912930zsZ.LIZIZ(c1912940zsaLIZ2 != null ? c1912940zsaLIZ2.LJI : null);
        C1912940zsa c1912940zsaLIZ3 = C1912930zsZ.LIZ(c10nw);
        C1912930zsZ.LIZIZ(c1912940zsaLIZ3 != null ? c1912940zsaLIZ3.LJII : null);
        C1912930zsZ.LIZLLL(c10nw);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C1911410zq7.LIZ("BaseISComponent", "onStart");
        HS();
    }

    public final C10RH uS() {
        InterfaceC19246610Rk interfaceC19246610RkBS = bS();
        if (interfaceC19246610RkBS == null) {
            return new C10RH(0, null, null, false, 31);
        }
        Pair pairLIZ = C10RB.LIZ(interfaceC19246610RkBS);
        C10R5 c10r5 = C10R5.LJIIIIZZ;
        C10R5 c10r5LIZ = C10RS.LIZ();
        List list = (List) pairLIZ.getFirst();
        int iElapsedRealtime = (int) (((SystemClock.elapsedRealtime() - this.LLJLIL) + this.LLJLL) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        e eVar = new e();
        eVar.LJIIL = false;
        String json = GsonProtectorUtils.toJson(eVar.LIZ(), new SelectedInterestList(list, Integer.valueOf(c10r5LIZ.LIZJ), Integer.valueOf(iElapsedRealtime), 0));
        c10r5LIZ.LIZIZ = json;
        if (json == null) {
            json = "";
        }
        String string = ((JSONArray) pairLIZ.getSecond()).toString();
        int length = ((JSONArray) pairLIZ.getSecond()).length();
        Boolean bool = this.LLLILZJ;
        return new C10RH(length, json, string, bool != null ? bool.booleanValue() : C10RL.LIZ(), 8);
    }

    @Override // X.InterfaceC1740760vOs
    public final String w3() {
        return String.valueOf(hashCode());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void wS() {
        /*
            r9 = this;
            boolean r0 = X.C10RG.LIZIZ()
            r5 = 1
            r8 = 0
            r7 = r9
            if (r0 == 0) goto Lae
            X.C10RG.LIZIZ()
            X.10RM r0 = X.C10RG.LIZ()
            int r0 = r0.LJFF
            if (r0 != 0) goto Lae
            r7.FS(r8, r8, r5)
        L17:
            boolean r0 = X.C10RG.LIZIZ()
            if (r0 == 0) goto L2b
            X.C10RG.LIZIZ()
            X.10RM r0 = X.C10RG.LIZ()
            boolean r0 = r0.LIZJ
            if (r0 == 0) goto L5e
            r7.mS()
        L2b:
            boolean r0 = com.ss.android.ugc.aweme.journey.experiment.RevampISExperiment.LIZ()
            if (r0 == 0) goto L40
            X.10Rc r0 = r7.LLJL
            if (r0 == 0) goto L40
            java.lang.String r1 = r0.LIZLLL
            if (r1 == 0) goto L40
            X.127h r0 = r7.LLJZIJLIL
            if (r0 == 0) goto L40
            r0.setText(r1)
        L40:
            X.127h r0 = r7.LLJZ
            r1 = 1061158912(0x3f400000, float:0.75)
            X.C10VO.LIZJ(r0, r1)
            X.127h r0 = r7.LLJZIJLIL
            X.C10VO.LIZJ(r0, r1)
            androidx.constraintlayout.widget.ConstraintLayout r1 = r7.LLL
            if (r1 == 0) goto L5d
            X.10Tv r0 = X.C19252910Tv.LIZIZ
            X.0sAf r0 = r0.LIZLLL()
            X.0iYA r0 = r0.LIZIZ()
            r0.LIZLLL(r1)
        L5d:
            return
        L5e:
            X.C10RG.LIZIZ()
            X.10RM r0 = X.C10RG.LIZ()
            long r3 = r0.LIZLLL
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2b
            X.C10RG.LIZIZ()
            X.10RM r0 = X.C10RG.LIZ()
            boolean r0 = r0.LJ
            if (r0 == 0) goto L88
            X.0zsp r0 = X.C1913090zsp.LIZ
            r0.getClass()
            boolean r0 = X.C1913090zsp.LJ
            if (r0 == 0) goto L88
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r7.LLLIIIL = r0
            goto L2b
        L88:
            r7.mS()
            X.C10RG.LIZIZ()
            X.10RM r0 = X.C10RG.LIZ()
            long r5 = r0.LIZLLL
            X.C10RG.LIZIZ()
            X.10RM r0 = X.C10RG.LIZ()
            boolean r4 = r0.LJ
            androidx.lifecycle.LifecycleCoroutineScope r2 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r7)
            X.1DFB r1 = X.C0PEM.LIZJ
            X.05Hc r3 = new X.05Hc
            r3.<init>(r4, r5, r7, r8)
            r0 = 2
            X.C23250099c.LIZLLL(r2, r1, r8, r3, r0)
            goto L2b
        Lae:
            r0 = 0
            r7.FS(r8, r8, r0)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent.wS():void");
    }

    public void zS() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        View view;
        if (C1911400zq6.LIZ(getContext())) {
            C1911400zq6.LIZJ(this.LLJLLL, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, null);
            C1911400zq6.LIZJ(this.LLL, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), null, null);
            RecyclerView recyclerView = this.LLJLLL;
            if (((recyclerView != null ? recyclerView.getLayoutManager() : null) instanceof GridLayoutManager) && (view = this.LLLFF) != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            C197039127h c197039127h = this.LLJZIJLIL;
            if (c197039127h != null) {
                C426750GoL.LJIIL(c197039127h, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 16);
                ViewGroup.LayoutParams layoutParams = c197039127h.getLayoutParams();
                if ((layoutParams instanceof C19ME) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
                    C786410Ut5.g6(c197039127h, marginLayoutParams2);
                }
            }
            C197039127h c197039127h2 = this.LLJZ;
            if (c197039127h2 != null) {
                C426750GoL.LJIIL(c197039127h2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 16);
                ViewGroup.LayoutParams layoutParams2 = c197039127h2.getLayoutParams();
                if (!(layoutParams2 instanceof C19ME) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) == null) {
                    return;
                }
                marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
                C786410Ut5.g6(c197039127h2, marginLayoutParams);
            }
        }
    }

    public boolean hS() {
        return this.LLLILZLLLI;
    }

    public Function1<Integer, Unit> iS() {
        return this.LLLIZZ;
    }

    public static void sS(BaseInterestSelectionComponent baseInterestSelectionComponent) {
        C197039127h c197039127h = baseInterestSelectionComponent.LLJZ;
        if (c197039127h != null) {
            c197039127h.setEnabled(false);
        }
        baseInterestSelectionComponent.aS();
        if (baseInterestSelectionComponent.LLLILZ != null) {
            baseInterestSelectionComponent.LLLILZ = null;
            if (C19244710Qr.LIZ.LJIIIZ()) {
                C19248710Sf.LIZIZ.LIZLLL();
            }
            C590950NFt c590950NFt = C590950NFt.LIZ;
            C590950NFt.LJI = true;
            C590950NFt.LJFF = null;
        }
        if (ComplianceServiceProvider.LJJIII().LJ()) {
            C10QS.LIZ.onEventV3(C10H5.INTEREST_SELECTION_SKIP_CLICK_IGNORE);
        }
        baseInterestSelectionComponent.LLJJJJJIL = true;
        C10RH c10rhUS = baseInterestSelectionComponent.uS();
        baseInterestSelectionComponent.qS(c10rhUS.LIZJ, "skip", c10rhUS.LIZIZ, c10rhUS.LJ);
        baseInterestSelectionComponent.oS(false);
        C197039127h c197039127h2 = baseInterestSelectionComponent.LLJZIJLIL;
        if (c197039127h2 != null) {
            C2211631BhB.LJIJ(c197039127h2, "c0639", "d8211", null, null);
        }
        try {
            if (C0C64.LJIILLIIL().LJIIZILJ(31744, 0, 1, "nuj_interest_select_skip_request", false) == 1) {
                C1800250wwp.LIZ.getClass();
                C1800250wwp.LIZIZ.LIZ("", null, "", true).LJL(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.00OH
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("BaseInterestSelectionComponent@f1ee.onSkipButtonClicked$2");
                        C1C7U.LIZIZ("BaseInterestSelectionComponent@f1ee.onSkipButtonClicked$2");
                    }
                }, new C09JN() { // from class: X.00OI
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("BaseInterestSelectionComponent@f1ee.onSkipButtonClicked$3");
                        C1C7U.LIZIZ("BaseInterestSelectionComponent@f1ee.onSkipButtonClicked$3");
                    }
                });
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        IInterestReselectionService iInterestReselectionService = baseInterestSelectionComponent.LLJJIJIL;
        if (iInterestReselectionService != null) {
            iInterestReselectionService.LJIILIIL(true);
        }
        baseInterestSelectionComponent.kS(null, true);
        baseInterestSelectionComponent.rS(true);
    }

    @Override // X.C10MD
    public final void A3(ConsentBoxDialogAbility$registerObserver$lifeCycleObserver$1 consentBoxDialogAbility$registerObserver$lifeCycleObserver$1) {
        getLifecycle().addObserver(consentBoxDialogAbility$registerObserver$lifeCycleObserver$1);
    }

    public final void BS(int i) {
        NewUserInterestStruct newUserInterestStruct;
        boolean zLIZ;
        C0CCZ c0cczLJFF;
        if (i == 1 && !this.LLLIL) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ((int) ((SystemClock.elapsedRealtime() - this.LLJLIL) + this.LLJLL), "duration");
            C10SV.LIZ(c2344009Gk);
            C20684815ws.LJIILLIIL("click_first_interest_tag", c2344009Gk.LIZ);
            C01GW c01gw = C073Z.LIZIZ;
            if (((Boolean) c01gw.getValue()).booleanValue()) {
                InterfaceC19246610Rk interfaceC19246610RkBS = bS();
                if (interfaceC19246610RkBS == null) {
                    new C10RH(0, null, null, false, 31);
                } else {
                    List<NewUserInterestStruct> listLJJJJJ = interfaceC19246610RkBS.LJJJJJ();
                    if (listLJJJJJ != null) {
                        newUserInterestStruct = (NewUserInterestStruct) ListProtector.get(listLJJJJJ, 0);
                    } else {
                        newUserInterestStruct = null;
                    }
                    this.LLLILZ = newUserInterestStruct;
                    Pair pairLIZ = C10RB.LIZ(interfaceC19246610RkBS);
                    C10R5 c10r5 = C10R5.LJIIIIZZ;
                    C10R5 c10r5LIZ = C10RS.LIZ();
                    List list = (List) pairLIZ.getFirst();
                    int iElapsedRealtime = (int) (((SystemClock.elapsedRealtime() - this.LLJLIL) + this.LLJLL) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                    e eVar = new e();
                    eVar.LJIIL = false;
                    String json = GsonProtectorUtils.toJson(eVar.LIZ(), new SelectedInterestList(list, Integer.valueOf(c10r5LIZ.LIZJ), Integer.valueOf(iElapsedRealtime), 0));
                    c10r5LIZ.LIZIZ = json;
                    if (json == null) {
                        json = "";
                    }
                    if (C1514430pVp.LIZLLL().booleanValue() && ((Boolean) c01gw.getValue()).booleanValue()) {
                        C19245110Qv.LIZ.getClass();
                        if (C19245110Qv.LIZ()) {
                            C19248710Sf.LIZIZ.LJIIIIZZ();
                        } else {
                            INewUserMainModuleService iNewUserMainModuleService = (INewUserMainModuleService) PluggableExtentionKt.pluggableSpi$default(INewUserMainModuleService.class, false, false, false, 14, null);
                            if (iNewUserMainModuleService != null && (c0cczLJFF = iNewUserMainModuleService.LJFF(1, 6)) != null) {
                                C799900VZk.LIZ.getClass();
                                C799890VZj c799890VZj = new C799890VZj();
                                c799890VZj.LIZ(c0cczLJFF);
                                c799890VZj.LIZIZ();
                            }
                        }
                    }
                    String string = ((JSONArray) pairLIZ.getSecond()).toString();
                    int length = ((JSONArray) pairLIZ.getSecond()).length();
                    Boolean bool = this.LLLILZJ;
                    if (bool != null) {
                        zLIZ = bool.booleanValue();
                    } else {
                        zLIZ = C10RL.LIZ();
                    }
                    new C10RH(length, json, string, zLIZ, 8);
                }
            }
            this.LLLIL = true;
        }
    }

    public void ES(int i) {
        TuxNavBar tuxNavBar = this.LLLF;
        if (tuxNavBar != null && isViewValid() && tuxNavBar.getHeight() > 0) {
            if (i == 0) {
                WR(0);
            } else {
                WR(this.LLJJL);
                C786410Ut5.C5(tuxNavBar, (i * 1.0f) / tuxNavBar.getHeight());
            }
        }
    }

    public void NS(C19245810Rc c19245810Rc) {
        Boolean bool;
        boolean zLIZ;
        Boolean boolValueOf;
        Boolean bool2;
        if (RevampISExperiment.LIZ()) {
            RevampISExperiment.LIZ();
            boolValueOf = Boolean.valueOf(((RevampISExperiment.ExperimentConfig) RevampISExperiment.LJ.getValue()).showIcon);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("online, server decision: ");
            if (c19245810Rc != null) {
                bool = c19245810Rc.LJFF;
            } else {
                bool = null;
            }
            sbLIZ.append(bool);
            sbLIZ.append(", isUS: ");
            sbLIZ.append(C10RL.LIZ());
            C2188811AlT.LIZIZ(sbLIZ);
            int i = C1720306oT.LIZ;
            if (c19245810Rc != null && (bool2 = c19245810Rc.LJFF) != null) {
                zLIZ = bool2.booleanValue();
            } else {
                zLIZ = C10RL.LIZ();
            }
            boolValueOf = Boolean.valueOf(zLIZ);
        }
        this.LLLILZJ = boolValueOf;
    }

    public final void VR(int i) {
        C420970Gf1 c420970Gf1 = this.LLLFFI;
        if (c420970Gf1 != null) {
            c420970Gf1.setArcBackgroundViewEndColor(i);
        }
    }

    public final void WR(int i) {
        TuxNavBar tuxNavBar = this.LLLF;
        if (tuxNavBar != null) {
            if (i == 0) {
                C786410Ut5.C5(tuxNavBar, 1.0f);
                View viewLJII = tuxNavBar.LJII("nav_tag_title");
                if (viewLJII != null) {
                    C786410Ut5.T4(viewLJII, 0.0f);
                }
            } else {
                View viewLJII2 = tuxNavBar.LJII("nav_tag_title");
                if (viewLJII2 != null) {
                    C786410Ut5.T4(viewLJII2, 1.0f);
                }
            }
            tuxNavBar.setNavBackground(i);
            tuxNavBar.setBackgroundColor(i);
            View viewLJII3 = tuxNavBar.LJII("nav_tag_skip");
            if (viewLJII3 != null && (viewLJII3 instanceof TextView)) {
                ((TextView) viewLJII3).setTextColor(R.attr.a1k);
            }
        }
    }

    @Override // X.C10MD
    public final void lz(LifecycleEventObserver lifecycleEventObserver) {
        getLifecycle().removeObserver(lifecycleEventObserver);
    }

    public final void oS(boolean z) {
        long jElapsedRealtime;
        String strLJJLIIIJ;
        List<String> list;
        if (!C10HC.LIZ()) {
            return;
        }
        C10H5 c10h5 = C10H5.INTEREST_SELECTION_HEARTBEAT;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("ui_type", RR());
        if (z) {
            long j = 5000;
            jElapsedRealtime = ((SystemClock.elapsedRealtime() - this.LLJLIL) / j) * j;
        } else {
            jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLJLIL;
        }
        c2344009Gk.LIZLLL(jElapsedRealtime, "time_elapsed");
        C10R1 c10r1 = this.LLLIILIL;
        String strLJJLIIIJ2 = null;
        if (c10r1 != null) {
            List<NewUserInterestStruct> listLJJJJJ = c10r1.LJJJJJ();
            ArrayList arrayList = new ArrayList();
            Iterator<NewUserInterestStruct> it2 = listLJJJJJ.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().id);
            }
            strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ", ", null, null, 0, null, null, 62);
        } else {
            strLJJLIIIJ = null;
        }
        c2344009Gk.LJIIIIZZ("interest_selected", strLJJLIIIJ);
        C10R1 c10r12 = this.LLLIILIL;
        if (c10r12 != null && (list = c10r12.LLIZLLLIL) != null) {
            strLJJLIIIJ2 = C13LP.LJJLIIIJ(list, ", ", null, null, 0, null, null, 62);
        }
        c2344009Gk.LJIIIIZZ("interest_unselected", strLJJLIIIJ2);
        if (this.LLJJJJ && Intrinsics.LJFF(this.LLLILZJ, Boolean.TRUE)) {
            this.LLJJJJ = false;
            c2344009Gk.LIZJ(this.LLLJL.size(), "icon_load_cnt");
            c2344009Gk.LIZJ(this.LLLJL.size() - this.LLLIIII, "icon_ready_cnt");
        }
        C10SV.LIZIZ(c10h5, c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onConfigurationChanged: screenWidthDp=");
        sbLIZ.append(configuration.screenWidthDp);
        sbLIZ.append(", screenHeightDp=");
        sbLIZ.append(configuration.screenHeightDp);
        C1911410zq7.LIZ("BaseISComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (!((Boolean) C0ABE.LIZ.getValue()).booleanValue() || !isViewValid()) {
            return;
        }
        zS();
        ConstraintLayout constraintLayout = this.LLL;
        if (constraintLayout != null) {
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = 0;
                C786410Ut5.m6(constraintLayout, layoutParams);
            }
            C19252910Tv.LIZIZ.LIZLLL().LIZIZ().LIZLLL(constraintLayout);
        }
    }

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C1912950zsb c1912950zsb;
        C1912930zsZ c1912930zsZ = C1912930zsZ.LIZ;
        C10NW c10nw = C10NW.JOURNEY_INTERESTS_ID;
        c1912930zsZ.getClass();
        C1912940zsa c1912940zsaLIZ = C1912930zsZ.LIZ(c10nw);
        C1912950zsb c1912950zsb2 = null;
        if (c1912940zsaLIZ != null) {
            c1912950zsb = c1912940zsaLIZ.LIZLLL;
        } else {
            c1912950zsb = null;
        }
        C1912930zsZ.LIZJ(c1912950zsb);
        super.onCreate(bundle);
        C1912940zsa c1912940zsaLIZ2 = C1912930zsZ.LIZ(c10nw);
        if (c1912940zsaLIZ2 != null) {
            c1912950zsb2 = c1912940zsaLIZ2.LIZLLL;
        }
        C1912930zsZ.LIZIZ(c1912950zsb2);
    }

    public void rS(boolean z) {
        NR(Boolean.valueOf(z));
    }

    public final void kS(TrendingCreatorsPageStruct trendingCreatorsPageStruct, boolean z) {
        IPluginService.PluginDataWrapper value;
        IPluginService.TrendingCreatorsData trendingCreatorsData;
        Boolean bool;
        ArrayList arrayList;
        InterfaceC19246610Rk interfaceC19246610RkBS;
        List<NewUserInterestStruct> listLJJJJJ;
        C19241910Pp.LIZ.getClass();
        C0TA0 c0ta0LIZ = C19241910Pp.LIZ();
        if (c0ta0LIZ != null && (value = c0ta0LIZ.getValue()) != null && (trendingCreatorsData = value.trendingCreatorsData) != null && (bool = trendingCreatorsData.isPageEnabled) != null && bool.booleanValue()) {
            if (!z && (interfaceC19246610RkBS = bS()) != null && (listLJJJJJ = interfaceC19246610RkBS.LJJJJJ()) != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJJJ, 10));
                Iterator<NewUserInterestStruct> it2 = listLJJJJJ.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().id);
                }
            } else {
                arrayList = null;
            }
            C1673980tfA.LIZ.getClass();
            C19241910Pp.LIZ.getClass();
            if (!C19241910Pp.LIZIZ()) {
                if (trendingCreatorsPageStruct != null) {
                    C1673980tfA.LIZIZ.setValue(new C1673970tf9(trendingCreatorsPageStruct, arrayList));
                } else {
                    C1673980tfA.LIZIZ.setValue(new C1673970tf9(C1673980tfA.LIZJ, arrayList));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C1912950zsb c1912950zsb;
        Object obj;
        Boolean boolValueOf;
        C19242510Pv c19242510Pv;
        List<Object> list;
        View.OnTouchListener onTouchListener;
        C1911410zq7.LIZ("BaseISComponent", "onViewCreated start");
        C1150504el.LIZ().LIZLLL("interest_fragment_viewcreated", false);
        C1912930zsZ c1912930zsZ = C1912930zsZ.LIZ;
        C10NW c10nw = C10NW.JOURNEY_INTERESTS_ID;
        c1912930zsZ.getClass();
        C1912940zsa c1912940zsaLIZ = C1912930zsZ.LIZ(c10nw);
        C1912950zsb c1912950zsb2 = null;
        if (c1912940zsaLIZ != null) {
            c1912950zsb = c1912940zsaLIZ.LJFF;
        } else {
            c1912950zsb = null;
        }
        C1912930zsZ.LIZJ(c1912950zsb);
        super.onViewCreated(view, bundle);
        C1568170quV.LIZ(2330);
        ZR();
        PS();
        boolean z = Keva.getRepo("new_user_journey").getBoolean("is_first_seen_on_install", true);
        C10H5 c10h5 = C10H5.SHOW_INTEREST_SELECTION;
        String str = this.LLLI;
        boolean z2 = this.LLJJJ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(z2 ? 1 : 0, "is_default_interests_list");
        c2344009Gk.LJIIIIZZ("enter_from", str);
        Integer numLIZIZ = ((IHybridABInfoService) ServiceManager.get().getService(IHybridABInfoService.class)).LIZIZ();
        if (numLIZIZ != null) {
            c2344009Gk.LIZJ(numLIZIZ.intValue(), "is_ab_backend_resp_received");
        }
        C0CR3.LIZ.getClass();
        c2344009Gk.LIZJ(C0CR3.LJIIIZ ? 1 : 0, "is_hybrid_ab_api_rev");
        c2344009Gk.LJIIIIZZ("user_type", (String) this.LLLJ.getValue());
        c2344009Gk.LIZLLL(SystemClock.elapsedRealtime() - this.LLJLILLLLZIIL, "page_show_cost");
        c2344009Gk.LJIIIIZZ("selection_type", "category");
        c2344009Gk.LIZJ(z ? 1 : 0, "is_first_seen_on_install");
        c2344009Gk.LIZJ(((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin() ? 1 : 0, "is_login");
        c2344009Gk.LJIIIIZZ("ui_type", RR());
        Boolean bool = this.LLLILZJ;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2)) {
            obj = 1;
        } else if (Intrinsics.LJFF(this.LLLILZJ, Boolean.FALSE)) {
            obj = 0;
        } else {
            obj = "";
        }
        c2344009Gk.LJ(obj, "should_show_icons");
        c2344009Gk.LJIIIIZZ("config_source", this.LLLL);
        if (Intrinsics.LJFF(this.LLLILZJ, bool2) && C10HC.LIZ()) {
            c2344009Gk.LIZJ(this.LLLJL.size(), "icon_load_cnt");
            c2344009Gk.LIZJ(this.LLLJL.size() - this.LLLIIII, "icon_ready_cnt");
        }
        C10SV.LIZ(c2344009Gk);
        Map<String, String> map = c2344009Gk.LIZ;
        C807840VmY.LIZ(map);
        C10SV.LIZIZ(c10h5, map);
        boolean zBooleanValue = ((Boolean) C0B6M.LIZ.getValue()).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hybrid_uneven_test_experiment_interest_select get value:");
        sbLIZ.append(zBooleanValue);
        C1911410zq7.LIZJ("BaseISComponent", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJLIIIJLLLLLLLZ.storeBoolean("is_first_seen_on_install", false);
        yS();
        RecyclerView recyclerView = this.LLJLLL;
        if (recyclerView != null) {
            recyclerView.setItemAnimator(null);
            this.LLLJL = nS();
            C10R1 c10r1CS = cS();
            this.LLLIILIL = c10r1CS;
            recyclerView.setAdapter(c10r1CS);
            recyclerView.setLayoutManager(dS());
            recyclerView.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0ztb
                public int LL;
                public int LLILLJJLI;

                @Override // X.AbstractC1585810rMx
                public final void LJJIIJ(RecyclerView recyclerView2, int i) {
                    int i2;
                    if (i == 0 && (i2 = this.LLILLJJLI) <= 5) {
                        if (i2 < 5) {
                            this.LLILLJJLI = i2 + 1;
                            return;
                        }
                        C10H5 c10h52 = C10H5.INTEREST_SELECTION_SCROLL_ACTIVITY;
                        C2344009Gk c2344009Gk2 = new C2344009Gk();
                        c2344009Gk2.LIZLLL(System.currentTimeMillis() - C1150504el.LIZ().LJJII, "duration_since_launch");
                        c2344009Gk2.LJIIIIZZ("ui_type", this.LLILLL.RR());
                        c2344009Gk2.LJIIIIZZ("vid", (String) this.LLILLL.LLLJIL.getValue());
                        C10SV.LIZIZ(c10h52, c2344009Gk2.LIZ);
                    }
                }

                @Override // X.AbstractC1585810rMx
                public final void LJJIIZI(RecyclerView recyclerView2, int i, int i2) {
                    int i3 = this.LL + i2;
                    this.LL = i3;
                    this.LLILLL.ES(i3);
                }
            });
            if (C10HC.LIZ()) {
                Integer num = ((C10HD) C10HC.LIZJ.getValue()).LIZJ;
                if (num != null) {
                    final int iIntValue = num.intValue();
                    final C817403Hg c817403Hg = new C817403Hg();
                    onTouchListener = new View.OnTouchListener() { // from class: X.0zta
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view2, MotionEvent motionEvent) {
                            RecyclerView recyclerView2 = (RecyclerView) view2;
                            int action = motionEvent.getAction();
                            if (action != 0) {
                                if (action == 1) {
                                    int iLIZIZ = C341940Daq.LIZIZ(c817403Hg.element - motionEvent.getY());
                                    if (Math.abs(iLIZIZ) > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)))) {
                                        this.LLLIIIIL++;
                                        C10H5 c10h52 = C10H5.INTEREST_SELECTION_SCROLL_ACTION;
                                        C2344009Gk c2344009Gk2 = new C2344009Gk();
                                        c2344009Gk2.LJIIIIZZ("ui_type", this.RR());
                                        c2344009Gk2.LIZLLL(System.currentTimeMillis() - C1150504el.LIZ().LJJII, "duration_since_launch");
                                        c2344009Gk2.LJIIIIZZ("motion_vector", String.valueOf(iLIZIZ));
                                        C10SV.LIZIZ(c10h52, c2344009Gk2.LIZ);
                                    }
                                }
                            } else {
                                c817403Hg.element = motionEvent.getY();
                                View viewFindChildViewUnder = recyclerView2.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
                                if (viewFindChildViewUnder == null || (recyclerView2.getChildViewHolder(viewFindChildViewUnder) instanceof C1216170hkl)) {
                                    C10H5 c10h53 = C10H5.INTEREST_SELECTION_TOUCH_ACTIVITY;
                                    C2344009Gk c2344009Gk3 = new C2344009Gk();
                                    c2344009Gk3.LJIIIIZZ("ui_type", this.RR());
                                    c2344009Gk3.LIZLLL(System.currentTimeMillis() - C1150504el.LIZ().LJJII, "duration_since_launch");
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append((int) motionEvent.getX());
                                    sbLIZ2.append('x');
                                    sbLIZ2.append((int) motionEvent.getY());
                                    c2344009Gk3.LJIIIIZZ("touch_position", C2188811AlT.LIZIZ(sbLIZ2));
                                    C10SV.LIZIZ(c10h53, c2344009Gk3.LIZ);
                                }
                            }
                            recyclerView2.performClick();
                            return false;
                        }
                    };
                } else {
                    onTouchListener = null;
                }
                recyclerView.setOnTouchListener(onTouchListener);
            }
        }
        wS();
        C1869040yjm c1869040yjmPR = PR();
        if ((c1869040yjmPR instanceof C19242510Pv) && (c19242510Pv = (C19242510Pv) c1869040yjmPR) != null && (list = c19242510Pv.LJ) != null) {
            boolValueOf = Boolean.valueOf(!list.isEmpty());
        } else {
            boolValueOf = null;
        }
        C197039127h c197039127h = this.LLJZ;
        if (c197039127h != null) {
            C786410Ut5.T7(c197039127h, new ACListenerS130S0200000_28(this, boolValueOf, 74));
        }
        C197039127h c197039127h2 = this.LLJZIJLIL;
        if (c197039127h2 != null) {
            C786410Ut5.T7(c197039127h2, new ACListenerS162S0100000_28(this, 218));
        }
        C10H5 c10h52 = C10H5.INTEREST_SELECTION_DID_SHOW;
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LIZLLL(System.currentTimeMillis() - C1150504el.LIZ().LJJII, "duration_since_launch");
        C10SV.LIZIZ(c10h52, c2344009Gk2.LIZ);
        zS();
        C1912940zsa c1912940zsaLIZ2 = C1912930zsZ.LIZ(c10nw);
        if (c1912940zsaLIZ2 != null) {
            c1912950zsb2 = c1912940zsaLIZ2.LJFF;
        }
        C1912930zsZ.LIZIZ(c1912950zsb2);
        C1150504el.LIZ().LJI("interest_fragment_viewcreated", false);
        C1911410zq7.LIZ("BaseISComponent", "onViewCreated end");
    }

    public void FS(Boolean bool, Integer num, boolean z) {
        String str;
        C197039127h c197039127h;
        int iIntValue;
        C197039127h c197039127h2 = this.LLJZ;
        if (c197039127h2 != null) {
            c197039127h2.setEnabled(z);
        }
        if (RevampISExperiment.LIZ()) {
            String string = getString(2131857657);
            Object[] objArr = new Object[1];
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            objArr[0] = Integer.valueOf(iIntValue);
            String strJ4 = C786410Ut5.j4(string, Arrays.copyOf(objArr, 1));
            C197039127h c197039127h3 = this.LLJZ;
            if (c197039127h3 != null) {
                c197039127h3.setText(strJ4);
                return;
            }
            return;
        }
        C19245810Rc c19245810Rc = this.LLJL;
        String str2 = null;
        if (c19245810Rc != null) {
            str = c19245810Rc.LIZJ;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str) || (c197039127h = this.LLJZ) == null) {
            return;
        }
        C19245810Rc c19245810Rc2 = this.LLJL;
        if (c19245810Rc2 != null) {
            str2 = c19245810Rc2.LIZJ;
        }
        c197039127h.setText(str2);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1912950zsb c1912950zsb;
        C1912950zsb c1912950zsb2;
        C1912930zsZ c1912930zsZ = C1912930zsZ.LIZ;
        C10NW c10nw = C10NW.JOURNEY_INTERESTS_ID;
        c1912930zsZ.getClass();
        C1912940zsa c1912940zsaLIZ = C1912930zsZ.LIZ(c10nw);
        C19GS c19gs = null;
        if (c1912940zsaLIZ != null) {
            c1912950zsb = c1912940zsaLIZ.LJ;
        } else {
            c1912950zsb = null;
        }
        C1912930zsZ.LIZJ(c1912950zsb);
        C1150504el.LIZ().LJI("interest_slogan_viewcreated_to_interest_fragment_create", false);
        C1150504el.LIZ().LIZLLL("interest_fragment_createview", false);
        C10H5 c10h5 = C10H5.INTEREST_SELECTION_DID_LOAD;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(System.currentTimeMillis() - C1150504el.LIZ().LJJII, "duration_since_launch");
        c2344009Gk.LJIIIIZZ("vid", (String) this.LLLJIL.getValue());
        C10SV.LIZIZ(c10h5, c2344009Gk.LIZ);
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.czb, viewGroup, false);
        C1150504el.LIZ().LJI("interest_fragment_createview", false);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreateView view:");
        sbLIZ.append(viewTd);
        C1911410zq7.LIZ("BaseISComponent", C2188811AlT.LIZIZ(sbLIZ));
        C1912940zsa c1912940zsaLIZ2 = C1912930zsZ.LIZ(c10nw);
        if (c1912940zsaLIZ2 != null) {
            c1912950zsb2 = c1912940zsaLIZ2.LJ;
        } else {
            c1912950zsb2 = null;
        }
        C1912930zsZ.LIZIZ(c1912950zsb2);
        C1848530yCh.LIZLLL(viewTd, "page_btm_b6658", AFwS271S0000000_28.get$arr$(117));
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }

    public final void qS(int i, String str, String str2, boolean z) {
        int i2;
        String strLJJLIIIJ;
        List<String> list;
        if (z) {
            i2 = this.LLLII;
        } else {
            i2 = -1;
        }
        C10H5 c10h5 = C10H5.EXIT_INTEREST_SELECTION;
        String str3 = this.LLLI;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLJLILLLLZIIL;
        C10R1 c10r1 = this.LLLIILIL;
        Integer numValueOf = Integer.valueOf(gS());
        int i3 = this.LLLIIIIL;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str3);
        c2344009Gk.LIZLLL(jElapsedRealtime, "duration");
        c2344009Gk.LJIIIIZZ("exit_method", str);
        c2344009Gk.LJIIIIZZ("interests_list", str2);
        if (c10r1 != null) {
            StringBuilder sb = new StringBuilder();
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue() - 1;
                if (iIntValue >= 0) {
                    int i4 = 0;
                    while (true) {
                        sb.append(c10r1.LLLIIIIL(i4).id);
                        if (i4 != iIntValue) {
                            sb.append(",");
                        }
                        if (i4 == iIntValue) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
                c2344009Gk.LIZJ(iIntValue + 1, "interests_cnt");
                c2344009Gk.LJFF("interests_show_list", sb.toString());
            }
        }
        if (C10HC.LIZ()) {
            if (c10r1 != null && (list = c10r1.LLIZLLLIL) != null) {
                strLJJLIIIJ = C13LP.LJJLIIIJ(list, ", ", null, null, 0, null, null, 62);
            } else {
                strLJJLIIIJ = null;
            }
            c2344009Gk.LJFF("interest_unselected", strLJJLIIIJ);
            c2344009Gk.LIZJ(i3, "scroll_activity_cnt");
        }
        Integer numLIZIZ = ((IHybridABInfoService) ServiceManager.get().getService(IHybridABInfoService.class)).LIZIZ();
        if (numLIZIZ != null) {
            c2344009Gk.LIZJ(numLIZIZ.intValue(), "is_ab_backend_resp_received");
        }
        C0CR3.LIZ.getClass();
        c2344009Gk.LIZJ(C0CR3.LJIIIZ ? 1 : 0, "is_hybrid_ab_api_rev");
        c2344009Gk.LJIIIIZZ("user_type", (String) this.LLLJ.getValue());
        c2344009Gk.LIZJ(i, "select_interest_cnt");
        c2344009Gk.LIZJ(i2, "icon_fully_loaded");
        c2344009Gk.LJIIIIZZ("ui_type", RR());
        c2344009Gk.LJ(this.LLLIIIL, "skip_from");
        c2344009Gk.LJIIIIZZ("config_source", this.LLLL);
        C10SV.LIZ(c2344009Gk);
        Map<String, String> map = c2344009Gk.LIZ;
        C807840VmY.LIZ(map);
        C10SV.LIZIZ(c10h5, map);
    }
}
