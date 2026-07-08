package com.ss.android.ugc.aweme.poi.collect;

import X.C019F;
import X.C01GW;
import X.C0OH5;
import X.C1172320gc2;
import X.C1173210gdT;
import X.C1192290h8F;
import X.C1200940hMC;
import X.C13LE;
import X.C14EU;
import X.C1637806bA;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C20600815jK;
import X.C20603715jn;
import X.C2217381BqS;
import X.C452501pT;
import X.C614900O9w;
import X.C622680Oba;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS109S0100000_9;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.performanceopt.api.PerfMonitorService;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiCollectListAssem extends UIListContentAssem<PoiCollectListViewModel> implements C0OH5 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public View LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final C01GW LLJI;
    public Long LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public boolean LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiCollectListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/poi/collect/PoiCollectListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiCollectListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiCollectListViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 895), AFwS256S0000000_18.get$arr$(287), null, true);
        this.LLJI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 893));
        this.LLJILLL = true;
        this.LLJJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 891));
        this.LLJJI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 892));
        this.LLJJIII = C452501pT.LIZIZ(new AwS562S0100000_18(this, 894));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 896));
    }

    @Override // X.C0OH5, X.InterfaceC723730SaB
    public String LIZ() {
        return null;
    }

    @Override // X.AbstractC738140SxQ
    public boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public void onResume() {
        super.onResume();
        Context context = getContext();
        if (context != null) {
            C1200940hMC.LIZ.getClass();
            this.LLJILJILJ = C1200940hMC.LIZIZ(context);
        }
        if (this.LLJJIJIIJIL) {
            return;
        }
        this.LLJJIJIIJIL = true;
        C1192290h8F.LIZ(this, "poi_collections_in_personal_page", null, false, null, null, 30);
        C1192290h8F.LIZJ(this, new AwS597S0100000_18(this, 245));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJJIII.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZ = 5;
        c20603715jn.LIZJ = false;
        c20603715jn.LIZLLL = LoadingFooterCell.class;
        return c20603715jn;
    }

    public final C1722300uv6 Lo() {
        return (C1722300uv6) this.LLJJ.getValue();
    }

    public final C1722300uv6 No() {
        return (C1722300uv6) this.LLJJI.getValue();
    }

    public final C1749280vcc Oo() {
        return (C1749280vcc) this.LLJJIJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: So, reason: merged with bridge method [inline-methods] */
    public PoiCollectListViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (PoiCollectListViewModel) assemVMLazy.getValue();
    }

    public final boolean Vo() {
        return ((Boolean) this.LLJI.getValue()).booleanValue();
    }

    @Override // X.C0OH5
    public void co() {
        if (this.LLJILJIL) {
            return;
        }
        this.LLJIJIL = Long.valueOf(System.currentTimeMillis());
        this.LLJILJIL = true;
        retry();
    }

    @Override // X.C0OH5
    public void onPageSelected() {
        C1173210gdT c1173210gdT = C1173210gdT.LIZ;
        PageFinder pageFinderVia = PageFinder.via(C724240Sb0.LJI(this));
        c1173210gdT.getClass();
        C1173210gdT.LIZ(null, pageFinderVia);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onCreate() {
        super.onCreate();
        C622680Oba.LIZJ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        C622680Oba.LIZLLL(this);
    }

    public final void retry() {
        Jo().manualListRefresh();
        C786410Ut5.LLF(8, Go());
        Oo().LJ();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCollectedStatusChange(C614900O9w c614900O9w) {
        String str;
        C1172320gc2 c1172320gc2;
        LinearLayoutManager linearLayoutManager;
        String str2;
        C1172320gc2 c1172320gc22;
        if (c614900O9w.LIZ) {
            if (((ArrayList) Go().getState().LJII()).isEmpty()) {
                C786410Ut5.LLF(0, Go());
                C786410Ut5.LLLZLZ(Oo(), 8);
            }
            ArrayList arrayList = (ArrayList) Go().getState().LJII();
            Iterator it2 = arrayList.iterator();
            boolean z = false;
            if (it2 != null) {
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if ((next instanceof C1172320gc2) && (c1172320gc22 = (C1172320gc2) next) != null) {
                        str2 = c1172320gc22.LLILLL;
                    } else {
                        str2 = null;
                    }
                    if (Intrinsics.LJFF(str2, c614900O9w.LIZIZ)) {
                        it2.remove();
                        z = true;
                    }
                }
            }
            if (z) {
                Go().getState().LJIIJJI(arrayList, null);
            }
            C20600815jK.LIZIZ(Go().getState(), 0, new C1172320gc2(c614900O9w.LIZJ, c614900O9w.LIZLLL, c614900O9w.LIZIZ, 56));
            RecyclerView.LayoutManager layoutManager = Go().getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null && linearLayoutManager.findFirstVisibleItemPosition() == 0) {
                HandlerHook.viewPost(Go(), new ARunnableS109S0100000_9(this, 110));
                return;
            }
            return;
        }
        ArrayList arrayList2 = (ArrayList) Go().getState().LJII();
        Iterator it3 = arrayList2.iterator();
        if (it3 != null) {
            while (it3.hasNext()) {
                Object next2 = it3.next();
                if ((next2 instanceof C1172320gc2) && (c1172320gc2 = (C1172320gc2) next2) != null) {
                    str = c1172320gc2.LLILLL;
                } else {
                    str = null;
                }
                if (Intrinsics.LJFF(str, c614900O9w.LIZIZ)) {
                    it3.remove();
                }
            }
        }
        Go().getState().LJIIJJI(arrayList2, null);
        if (((ArrayList) Go().getState().LJII()).isEmpty()) {
            C786410Ut5.LLF(8, Go());
            Oo().setStatus(Lo());
            C786410Ut5.LLLZLZ(Oo(), 0);
        }
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        this.LLIZLLLIL = view;
        super.onViewCreated(view);
        Go().LJIILJJIL(PoiCollectCell.class);
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.0gc5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1172130gbj c1172130gbj = (C1172130gbj) obj;
                c1172130gbj.getClass();
                return C627260Oiy.LIZLLL(c1172130gbj);
            }
        }, null, new AwS597S0100000_18(this, 246), AFwS206S0000000_18.get$arr$(283), new AwS597S0100000_18(this, 247), 2, null);
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.0gc6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1172130gbj c1172130gbj = (C1172130gbj) obj;
                c1172130gbj.getClass();
                return C627260Oiy.LIZJ(c1172130gbj);
            }
        }, null, AFwS256S0000000_18.get$arr$(286), AFwS206S0000000_18.get$arr$(284), new AwS597S0100000_18(this, 248), 2, null);
        ((PerfMonitorService) ServiceManager.get().getService(PerfMonitorService.class)).LJ(Go(), "poi_collect_list");
    }
}
