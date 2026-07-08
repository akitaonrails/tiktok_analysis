package com.ss.android.ugc.aweme.internalshare.impl.refactor.assem;

import X.C04T4;
import X.C0QSJ;
import X.C1224804qk;
import X.C1362240lYM;
import X.C1362270lYP;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C673150Qan;
import X.C687700QyG;
import X.C723580SZw;
import X.C723830SaL;
import X.InterfaceC1146704e9;
import X.InterfaceC1224904ql;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC687730QyJ;
import Y.ARunnableS90S0200000_21;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.im.common.IMCommonApi;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.DurationPerfMon;
import com.ss.android.ugc.aweme.internalshare.api.experiment.SharePanelOperationDelayStrategy;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.SharePanelImRootAssem;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS220S0300000_11;

/* JADX INFO: loaded from: classes22.dex */
public final class SharePanelImRootAssem extends ReusedUIContentAssem<SharePanelImRootAssem> implements ILazyLoadAbility, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public final C1559260qg8 LLJJJJ = new C1559260qg8(new C723580SZw(this, C1362270lYP.class, null), checkSupervisorPrepared());
    public boolean LLJJJJJIL;

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ShareImRootScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ShareImRootScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ShareImRootScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1340960250) {
            return null;
        }
        return this;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.ILazyLoadAbility
    public final void TK(boolean z) {
        if (this.LLJJJJJIL) {
            return;
        }
        this.LLJJJJJIL = true;
        C723830SaL.LJ(this, C13LE.LIZ(SharePanelOperationRootAssem.class), z, null);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        final ViewGroup viewGroupInvoke;
        ViewGroup viewGroupInvoke2;
        Function0<ViewGroup> function0;
        Function0<ViewGroup> function02;
        C1362240lYM.LIZJ = !C1362240lYM.LIZIZ;
        C1362240lYM.LIZIZ = true;
        C1362270lYP c1362270lYP = (C1362270lYP) this.LLJJJJ.getValue();
        if (c1362270lYP != null && (function02 = c1362270lYP.LLIZ) != null) {
            viewGroupInvoke = function02.invoke();
        } else {
            viewGroupInvoke = null;
        }
        C1362270lYP c1362270lYP2 = (C1362270lYP) this.LLJJJJ.getValue();
        if (c1362270lYP2 != null && (function0 = c1362270lYP2.LLIZLLLIL) != null) {
            viewGroupInvoke2 = function0.invoke();
        } else {
            viewGroupInvoke2 = null;
        }
        if (viewGroupInvoke != null) {
            IMCommonApi.LIZ.getClass();
            C04T4.LIZIZ.getValue().LIZ();
            C1224804qk.LIZ(viewGroupInvoke, new InterfaceC1224904ql() { // from class: X.0lZ4
                public long LIZ = -1;

                @Override // X.InterfaceC1224904ql
                public final void LIZ() {
                    SharePackage sharePackage;
                    Bundle bundle;
                    SharePackage sharePackage2;
                    Bundle bundle2;
                    DurationPerfMon.LIZ.LIZJ(C451280Hmo.LJ, new C158800jC(this.LIZ > 0 ? SystemClock.uptimeMillis() - this.LIZ : -1L));
                    SharePanelImRootAssem sharePanelImRootAssem = this;
                    View view2 = viewGroupInvoke;
                    C1362270lYP c1362270lYP3 = (C1362270lYP) sharePanelImRootAssem.LLJJJJ.getValue();
                    boolean z = (c1362270lYP3 == null || (sharePackage2 = c1362270lYP3.LL) == null || (bundle2 = sharePackage2.extras) == null) ? false : bundle2.getBoolean("comment_direct_share");
                    C1362270lYP c1362270lYP4 = (C1362270lYP) sharePanelImRootAssem.LLJJJJ.getValue();
                    boolean z2 = (c1362270lYP4 == null || (sharePackage = c1362270lYP4.LL) == null || (bundle = sharePackage.extras) == null) ? false : bundle.getBoolean("show_edit_send_direct_im_share");
                    if (z || z2) {
                        sharePanelImRootAssem.TK(true);
                        return;
                    }
                    SharePanelOperationDelayStrategy sharePanelOperationDelayStrategy = C1362240lYM.LIZ;
                    if (sharePanelOperationDelayStrategy.strategy == 2 && (sharePanelOperationDelayStrategy.onlyOnce != 1 || C1362240lYM.LIZJ)) {
                        HandlerHook.viewPost(view2, new ARunnableS90S0200000_21(sharePanelImRootAssem, view2, 40));
                        return;
                    }
                    int i = sharePanelOperationDelayStrategy.strategy;
                    if (i == 0 || ((i == 1 || i == 2) && sharePanelOperationDelayStrategy.onlyOnce == 1 && !C1362240lYM.LIZJ)) {
                        sharePanelImRootAssem.TK(true);
                    }
                }

                @Override // X.InterfaceC1224904ql
                public final void LIZIZ() {
                    this.LIZ = SystemClock.uptimeMillis();
                }
            });
        }
        C723830SaL.LIZ(this, null, new AwS220S0300000_11(viewGroupInvoke, viewGroupInvoke2, this, 8));
    }
}
