package com.ss.android.ugc.aweme.account.loginapproval;

import X.C01GW;
import X.C098200Yq;
import X.C0XQ5;
import X.C1177960gl8;
import X.C1178140glQ;
import X.C1179470gnZ;
import X.C1180740gpc;
import X.C1203050hPb;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C20277814Wa;
import X.C452501pT;
import X.C703302op;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import X.EnumC1203090hPf;
import X.InterfaceC1176690gj5;
import X.InterfaceC1177250gjz;
import X.InterfaceC21503819Do;
import Y.ACListenerS166S0100000_32;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mapapi.IPoiMapService;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: loaded from: classes33.dex */
public abstract class BaseConfirmLoginPageFragment extends BaseFragment implements InterfaceC21503819Do {
    public View LLIZLLLIL;
    public TuxTextView LLJ;
    public TuxTextView LLJI;
    public InterfaceC1177250gjz LLJIJIL;
    public ConstraintLayout LLJILJIL;
    public TextView LLJILJILJ;
    public TextView LLJILLL;
    public TextView LLJJ;
    public TextView LLJJI;
    public C197039127h LLJJIII;
    public C197039127h LLJJIJI;
    public TuxIconView LLJJIJIIJIL;
    public FrameLayout LLJJIJIL;
    public String LLJJJ;
    public String LLJJJIL;
    public String LLJJJJ;
    public String LLJJJJJIL;
    public String LLJJJJLIIL;
    public boolean LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public String LLJLIL;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 74));
    public final AccountUserService LLJLILLLLZIIL = C0XQ5.LIZ();

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void Q9(Activity activity) {
    }

    public abstract void SR();

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    public abstract void WR();

    public abstract void ZR();

    public abstract void aS();

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
    }

    public abstract void cS();

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
    public /* synthetic */ void qO(Intent intent) {
    }

    @Override // X.InterfaceC21503819Do
    public final void tv() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    public final DialogC1389620mGW UR() {
        return (DialogC1389620mGW) this.LLIZ.getValue();
    }

    public final void VR() {
        C19EG activity;
        if (this.LLJJL || ((activity = getActivity()) != null && activity.isTaskRoot())) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getContext(), "aweme://main");
            smartRouteBuildRoute.addFlags(67108864);
            smartRouteBuildRoute.open();
        } else {
            C19EG activity2 = getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    public final void bS() {
        String str = this.LLJJJJJIL;
        String str2 = this.LLJJJJLIIL;
        if (!C703302op.LIZ(str) || !C703302op.LIZ(str2) || this.LLJIJIL == null) {
            FrameLayout frameLayout = this.LLJJIJIL;
            if (frameLayout != null) {
                C786410Ut5.LJZ(8, frameLayout);
                return;
            }
            return;
        }
        FrameLayout frameLayout2 = this.LLJJIJIL;
        if (frameLayout2 != null) {
            C786410Ut5.LJZ(0, frameLayout2);
        }
        C1177960gl8 c1177960gl8 = new C1177960gl8(CastDoubleProtector.parseDouble(str), CastDoubleProtector.parseDouble(str2));
        InterfaceC1177250gjz interfaceC1177250gjz = this.LLJIJIL;
        if (interfaceC1177250gjz != null) {
            interfaceC1177250gjz.LIZIZ(c1177960gl8, Float.valueOf(9.0f), null);
        }
        InterfaceC1177250gjz interfaceC1177250gjz2 = this.LLJIJIL;
        if (interfaceC1177250gjz2 != null) {
            interfaceC1177250gjz2.LJIIL(c1177960gl8, new C1178140glQ());
        }
    }

    public final void dS(View view) {
        this.LLIZLLLIL = view.findViewById(R.id.eqx);
        this.LLJ = (TuxTextView) view.findViewById(R.id.title);
        this.LLJI = (TuxTextView) view.findViewById(R.id.fof);
        this.LLJILJIL = (ConstraintLayout) view.findViewById(R.id.fsa);
        this.LLJILJILJ = (TextView) view.findViewById(R.id.fsd);
        this.LLJILLL = (TextView) view.findViewById(R.id.fsf);
        this.LLJJ = (TextView) view.findViewById(R.id.fsb);
        this.LLJJI = (TextView) view.findViewById(R.id.time);
        this.LLJJIII = (C197039127h) view.findViewById(R.id.rol);
        this.LLJJIJI = (C197039127h) view.findViewById(R.id.b7i);
        this.LLJJIJIIJIL = (TuxIconView) view.findViewById(R.id.e26);
        this.LLJJIJIL = (FrameLayout) view.findViewById(R.id.nzh);
        cS();
        if (((IPoiMapService) ServiceManager.get().getService(IPoiMapService.class)).LJFF()) {
            C1180740gpc.LIZ.getClass();
            IPoiMapService iPoiMapServiceLIZ = C1180740gpc.LIZ();
            C1179470gnZ c1179470gnZ = new C1179470gnZ();
            c1179470gnZ.LJFF = EnumC1203090hPf.MAP_TYPE_NORMAL;
            InterfaceC1176690gj5 iMapManager = iPoiMapServiceLIZ.getIMapManager(new C1203050hPb(c1179470gnZ));
            Fragment fragmentLIZIZ = iMapManager.LIZIZ();
            if (fragmentLIZIZ != null) {
                C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
                c19ehLJIIJ.LIZIZ(R.id.nzh, fragmentLIZIZ);
                c19ehLJIIJ.LJIIIZ();
            }
            iMapManager.X(new AwS611S0100000_32(this, 25));
        }
        TuxIconView tuxIconView = this.LLJJIJIIJIL;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS166S0100000_32(this, 0));
        }
        C197039127h c197039127h = this.LLJJIII;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS166S0100000_32(this, 1));
        }
        C197039127h c197039127h2 = this.LLJJIJI;
        if (c197039127h2 != null) {
            C786410Ut5.U8(c197039127h2, new ACListenerS166S0100000_32(this, 2));
        }
        SR();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        NR(AFwS273S0000000_29.get$arr$(17));
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.xl, viewGroup, false);
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
}
