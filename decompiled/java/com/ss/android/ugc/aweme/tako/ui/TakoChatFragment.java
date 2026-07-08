package com.ss.android.ugc.aweme.tako.ui;

import X.C013C;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C054G;
import X.C07CP;
import X.C1220000hqw;
import X.C1360890lWB;
import X.C1365870leD;
import X.C1389910mGz;
import X.C13LE;
import X.C14EU;
import X.C14KI;
import X.C14TF;
import X.C1508730pMd;
import X.C1622206Wu;
import X.C18168079q;
import X.C1845390y7d;
import X.C1857690yRT;
import X.C1862330yYx;
import X.C1863760ybG;
import X.C19719912Dl;
import X.C19EG;
import X.C20227214Co;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C298830BnV;
import X.C298850BnX;
import X.C319390CfZ;
import X.C338490DOt;
import X.C338520DOw;
import X.C345280DgE;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C987103tV;
import X.InterfaceC1360805Ug;
import X.InterfaceC1361305Ul;
import X.InterfaceC1856570yPf;
import X.InterfaceC214902198i;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import X.ViewOnAttachStateChangeListenerC20306914d1;
import Y.ACListenerS86S0300000_21;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.notice.api.services.INoticeService;
import com.ss.android.ugc.aweme.tako.ITakoService;
import com.ss.android.ugc.aweme.tako.arch.scope.TakoFragmentScope;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import com.ss.android.ugc.aweme.tako.botpage.components.share.TakoSharePreviewAbility;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.otherpage.botcenter.TakoBotCenterViewModel;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.TakoMultiImagePreviewScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS396S0200000_30;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS641S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoChatFragment extends TakoBaseFragment {
    public static final C20227214Co LLLLLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLLLIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjHELIOSEtIiB9PSxiHS44JwYkKDsVOiQrJCo9PA==";
    public final AssemVMLazy LLLLILI;
    public final C736950SvV LLLLJ;
    public final C01GW LLLLJI;
    public long LLLLL;
    public InterfaceC1360805Ug LLLLLIL;
    public TakoSharePreviewAbility LLLLLILLIL;
    public InterfaceC1856570yPf LLLLLJIL;
    public InterfaceC1361305Ul LLLLLJLJLL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.14Co] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoChatFragment.class, "multipleSelectVM", "getMultipleSelectVM()Lcom/ss/android/ugc/aweme/tako/botpage/components/action/multiple/TakoMultipleSelectVM;", 0);
        C13LE.LIZ.getClass();
        LLLLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLLLL = new Object() { // from class: X.14Co
        };
        ((ITakoService) ServiceManager.get().getService(ITakoService.class)).LJLLLLLL();
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment, X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        super.bindAbility(obj, cls);
        if (cls == InterfaceC1360805Ug.class) {
            this.LLLLLIL = (InterfaceC1360805Ug) obj;
        } else if (cls == TakoSharePreviewAbility.class) {
            this.LLLLLILLIL = (TakoSharePreviewAbility) obj;
        } else if (cls == InterfaceC1856570yPf.class) {
            this.LLLLLJIL = (InterfaceC1856570yPf) obj;
        } else if (cls == InterfaceC1361305Ul.class) {
            this.LLLLLJLJLL = (InterfaceC1361305Ul) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TakoFragmentScope.class, TakoMultiImagePreviewScope.class});
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment, X.C0QSJ
    public final Object getAbility(Class cls) {
        return cls == InterfaceC1360805Ug.class ? this.LLLLLIL : cls == TakoSharePreviewAbility.class ? this.LLLLLILLIL : cls == InterfaceC1856570yPf.class ? this.LLLLLJIL : cls == InterfaceC1361305Ul.class ? this.LLLLLJLJLL : super.getAbility(cls);
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(TakoFragmentScope.class);
        arrayList.add(TakoMultiImagePreviewScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment, X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList(super.getScopes());
        arrayList.add(TakoFragmentScope.class);
        arrayList.add(TakoMultiImagePreviewScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment, X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        super.unbindAbility(obj, cls);
        if (cls == InterfaceC1360805Ug.class) {
            this.LLLLLIL = null;
        } else if (cls == TakoSharePreviewAbility.class) {
            this.LLLLLILLIL = null;
        } else if (cls == InterfaceC1856570yPf.class) {
            this.LLLLLJIL = null;
        } else if (cls == InterfaceC1361305Ul.class) {
            this.LLLLLJLJLL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    public TakoChatFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoMultipleSelectVM.class);
        AwS548S0100000_4 awS548S0100000_4 = new AwS548S0100000_4(c19719912DlLIZ, 287);
        AFwS274S0000000_30 aFwS274S0000000_30 = AFwS274S0000000_30.get$arr$(222);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS548S0100000_4, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS574S0100000_30((HasDefaultViewModelProviderFactory) this, 282), aFwS274S0000000_30, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS548S0100000_4, new AwS574S0100000_30((Fragment) this, 283), aFwS274S0000000_30, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS548S0100000_4, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS574S0100000_30((HasDefaultViewModelProviderFactory) this, 284), aFwS274S0000000_30, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLLLILI = assemVMLazy;
        this.LLLLJ = new C736950SvV(C13LE.LIZ(TakoBotCenterViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS274S0000000_30.get$arr$(223), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
        this.LLLLJI = C452501pT.LIZIZ(new AwS574S0100000_30(this, 281));
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment, com.ss.android.ugc.aweme.tako.ui.ITakoChatPageAbility
    public final void ts2() {
        C19EG activity;
        this.LLLFZ.invoke();
        if (!C07CP.LIZ() || this.LLLLJI.getValue() == null) {
            if (!C1857690yRT.LJIIJJI(getActivity()) || (activity = getActivity()) == null) {
                return;
            }
            activity.finish();
            return;
        }
        InterfaceC214902198i interfaceC214902198i = (InterfaceC214902198i) this.LLLLJI.getValue();
        if (interfaceC214902198i != null) {
            interfaceC214902198i.finish();
        }
    }

    public final TakoMultipleSelectVM wS() {
        AssemVMLazy assemVMLazy = this.LLLLILI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLLLIL;
        return (TakoMultipleSelectVM) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment
    public final boolean hS() {
        if (C298850BnX.LIZ()) {
            return super.hS();
        }
        C013C c013c = new C013C();
        C736680Sv4.LJIJJ(wS(), new AwS396S0200000_30(this, c013c, 29));
        return c013c.element;
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (C18168079q.LIZ()) {
            C1508730pMd.LIZ.getClass();
            INoticeService iNoticeService = C1508730pMd.LIZIZ;
            if (iNoticeService != null) {
                iNoticeService.LJIILL();
            }
        }
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        TakoEnterParams takoEnterParams = this.LLJILLL;
        Map<String, String> commonParams = takoEnterParams != null ? takoEnterParams.getCommonParams() : null;
        c1862330yYx.getClass();
        C1862330yYx.LJIILL(2, commonParams);
        if (C07CP.LIZ() && this.LLLLJI.getValue() != null && EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment
    public final boolean sS() {
        return !C298830BnV.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @C14EU
    public final void onEvent(C1365870leD c1365870leD) {
        String strLIZ;
        Map<String, String> mapLJ;
        if (!C14TF.LIZIZ.LJJJJIZL(c1365870leD.LJ)) {
            return;
        }
        if (C07CP.LIZ() && this.LLLLJI.getValue() != null) {
            wS().AQ2();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LLLLL < 3000) {
            return;
        }
        this.LLLLL = jCurrentTimeMillis;
        C19EG activity = getActivity();
        ACListenerS86S0300000_21 aCListenerS86S0300000_21 = null;
        if (activity != null) {
            strLIZ = C345280DgE.LIZ(activity, c1365870leD);
        } else {
            strLIZ = null;
        }
        int iLIZIZ = C14KI.LIZIZ(requireContext()) + getResources().getDimensionPixelOffset(R.dimen.ai9);
        if (strLIZ != null) {
            C1389910mGz c1389910mGz = new C1389910mGz(this);
            c1389910mGz.LJIIJ(strLIZ);
            c1389910mGz.LJI(R.style.y0);
            c1389910mGz.LJ(3000L);
            c1389910mGz.LIZIZ(iLIZIZ);
            Context context = getContext();
            if (context != null) {
                aCListenerS86S0300000_21 = new ACListenerS86S0300000_21(c1365870leD, this, context, 11);
            }
            C1360890lWB c1360890lWB = c1389910mGz.LIZ;
            c1360890lWB.LJIIIIZZ = aCListenerS86S0300000_21;
            c1360890lWB.LIZIZ = 0;
            c1360890lWB.LIZLLL = 0;
            c1389910mGz.LJIIJJI();
            TakoEnterParams takoEnterParams = this.LLJILLL;
            if (takoEnterParams == null || (mapLJ = takoEnterParams.getCommonParams()) == null) {
                mapLJ = C2097608Jq.LJ();
            }
            C1845390y7d.LIZIZ(mapLJ, c1365870leD.LJIIIZ, "share_message");
        }
        wS().AQ2();
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        TakoEnterParams takoEnterParams = this.LLJILLL;
        if (takoEnterParams != null) {
            str = takoEnterParams.processId;
        } else {
            str = null;
        }
        C1863760ybG.LIZLLL(str);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS606S0100000_27(this, 284), 3);
        if (C07CP.LIZ() && this.LLLLJI.getValue() != null) {
            if (!EventBus.LIZLLL().LJIIJ(this)) {
                EventBus.LIZLLL().LJIJJ(this);
            }
        } else {
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC20306914d1(this, 5));
        }
        C736680Sv4.LJIIIIZZ(this, this.LLLLJ.getValue(), new C2217381BqS() { // from class: X.14Gh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((C1576320r7e) obj).LLILLL);
            }
        }, null, new AwS641S0100000_27(this, 77), 6);
        C054G c054g = C319390CfZ.LIZ;
        C319390CfZ.LIZ(SystemClock.elapsedRealtime() - jElapsedRealtime, "tako_chat_fragment_on_view_created");
    }
}
