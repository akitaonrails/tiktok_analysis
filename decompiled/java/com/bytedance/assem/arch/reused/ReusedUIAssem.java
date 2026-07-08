package com.bytedance.assem.arch.reused;

import X.AbstractC1155604fa;
import X.C03H5;
import X.C03H8;
import X.C0RTF;
import X.C0RTG;
import X.C0RTK;
import X.C724640Sbe;
import X.C724650Sbf;
import X.C724660Sbg;
import X.C724670Sbh;
import X.C725080ScM;
import X.InterfaceC724700Sbk;
import android.view.View;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ReusedUIAssem<RECEIVER extends C03H5> extends ReusedAssem<RECEIVER> implements C03H8, C0RTK {
    public View LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public final /* synthetic */ C0RTF LLJJ = new C0RTF();
    public final CopyOnWriteArrayList<Function0<Unit>> LLJJIJIIJIL = new CopyOnWriteArrayList<>();

    public abstract void Co();

    public void Eo(View view) {
    }

    @Override // X.C0RTK
    public final void Zf(Map<AbstractC1155604fa<?>, ? extends C0RTG<?>> map) {
        this.LLJJ.Zf(map);
    }

    @Override // X.AbstractC738140SxQ
    public final void handleOnParentViewCreated$assem_release() {
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
    }

    public abstract void onViewCreated(View view);

    public final boolean Bo() {
        return this.LLJJI != null;
    }

    @Override // X.C03H8
    public final View LJJIJL() {
        View view = this.LLJJI;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // X.C0RTK
    public final Map<AbstractC1155604fa<?>, C0RTG<?>> ff() {
        return this.LLJJ.LL;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void uo() {
        Fo(new C724670Sbh(this));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public void onCreate() {
        super.onCreate();
        C724640Sbe.LIZIZ(new C724650Sbf(this));
        this.LLJJIII = true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        this.LLJJIII = false;
    }

    public final void Ao(View view) {
        InterfaceC724700Sbk interfaceC724700Sbk = C725080ScM.LIZJ;
        if (interfaceC724700Sbk != null) {
            interfaceC724700Sbk.LIZ();
        }
        C724640Sbe.LIZIZ(new C724660Sbg(view, this));
        this.LLJJIJI = true;
        Iterator<Function0<Unit>> it2 = this.LLJJIJIIJIL.iterator();
        while (it2.hasNext()) {
            it2.next().invoke();
        }
        this.LLJJIJIIJIL.clear();
        InterfaceC724700Sbk interfaceC724700Sbk2 = C725080ScM.LIZJ;
        if (interfaceC724700Sbk2 != null) {
            interfaceC724700Sbk2.end(getClass().getSimpleName(), "assem_createView_");
        }
    }

    public final void Fo(Function0<Unit> function0) {
        if (this.LLJJIJI) {
            function0.invoke();
        } else {
            this.LLJJIJIIJIL.add(function0);
        }
    }
}
