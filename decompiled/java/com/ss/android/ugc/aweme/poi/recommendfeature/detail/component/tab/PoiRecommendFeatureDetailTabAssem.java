package com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.tab;

import X.AbstractC1585810rMx;
import X.C1181000gq2;
import X.C1181100gqC;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C1697810uHb;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS106S0100000_6;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRecommendFeatureDetailTabAssem extends BaseSlashSlotAssemComponent<PoiRecommendFeatureDetailTabModule> implements PoiRecommendFeatureDetailTabClickAbility, PoiRecommendFeatureDetailTabEntityIdAbility {
    public ViewOnAttachStateChangeListenerC20604515jv LLJJI;
    public boolean LLJJIJIIJIL;
    public List<PoiRecommendFeatureDetailTabItem> LLJJIII = C13BV.INSTANCE;
    public int LLJJIJI = -1;
    public final C1181000gq2 LLJJIJIL = new AbstractC1585810rMx() { // from class: X.0gq2
        public int LL;
        public boolean LLILLJJLI;

        @Override // X.AbstractC1585810rMx
        public final void LJJIIJ(RecyclerView recyclerView, int i) {
            if (i == 1) {
                this.LLILLJJLI = true;
                return;
            }
            if (i != 0) {
                return;
            }
            if (this.LL != 0 && this.LLILLJJLI) {
                C1185430gxB c1185430gxB = C1185430gxB.LIZ;
                InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this.LLILLL);
                PageFinder pageFinderVia = PageFinder.via(this.LLILLL.getContentView());
                c1185430gxB.getClass();
                C1185430gxB.LJJLIIIJL(pageFinderVia, interfaceC665370Q7zLJIIL);
            }
            this.LL = 0;
            this.LLILLJJLI = false;
        }

        @Override // X.AbstractC1585810rMx
        public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
            this.LL += i;
        }
    };

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e6t;
    }

    public final void ip() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJI;
        if (viewOnAttachStateChangeListenerC20604515jv == null) {
            return;
        }
        int i = this.LLJJIJI;
        List<PoiRecommendFeatureDetailTabItem> list = this.LLJJIII;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i2 = 0;
        for (PoiRecommendFeatureDetailTabItem poiRecommendFeatureDetailTabItem : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            arrayList.add(new C1181100gqC(poiRecommendFeatureDetailTabItem, i2 == i));
            i2 = i3;
        }
        viewOnAttachStateChangeListenerC20604515jv.getState().LJIILL(arrayList, null);
    }

    @Override // com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.tab.PoiRecommendFeatureDetailTabEntityIdAbility
    public final String lc1() {
        PoiRecommendFeatureDetailTabItem poiRecommendFeatureDetailTabItem = (PoiRecommendFeatureDetailTabItem) C13LP.LJJJLZIJ(this.LLJJIJI, this.LLJJIII);
        if (poiRecommendFeatureDetailTabItem != null) {
            return poiRecommendFeatureDetailTabItem.id;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173970geh
    public final void CG1(BaseComponentData baseComponentData) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        PoiRecommendFeatureDetailTabModule poiRecommendFeatureDetailTabModule = (PoiRecommendFeatureDetailTabModule) baseComponentData;
        super.CG1(poiRecommendFeatureDetailTabModule);
        List<PoiRecommendFeatureDetailTabItem> tabs = poiRecommendFeatureDetailTabModule.getTabs();
        if (tabs == null) {
            tabs = C13BV.INSTANCE;
        }
        int iResolveSelectedIndex = poiRecommendFeatureDetailTabModule.resolveSelectedIndex();
        if (this.LLJJIII.isEmpty()) {
            this.LLJJIII = tabs;
            this.LLJJIJI = iResolveSelectedIndex;
            ip();
            if (this.LLJJIJI >= 0 && (viewOnAttachStateChangeListenerC20604515jv = this.LLJJI) != null) {
                HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv, new ARunnableS106S0100000_6(this, 324));
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(tabs, this.LLJJIII)) {
            this.LLJJIII = tabs;
        }
        if (iResolveSelectedIndex < 0 || iResolveSelectedIndex == this.LLJJIJI) {
            return;
        }
        this.LLJJIJI = iResolveSelectedIndex;
        ip();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.tab.PoiRecommendFeatureDetailTabAssem for r13v4 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(android.view.View r14) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.tab.PoiRecommendFeatureDetailTabAssem.onViewCreated(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fd  */
    @Override // com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.tab.PoiRecommendFeatureDetailTabClickAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ti(int r20) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.tab.PoiRecommendFeatureDetailTabAssem.ti(int):void");
    }
}
