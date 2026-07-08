package r4m;

import X.AbstractC1423370n8x;
import X.C1419220n2G;
import X.C1419590n2r;
import X.C1422880n8A;
import X.C1422890n8B;
import X.C1423340n8u;
import X.C1423350n8v;
import X.C1423470n97;
import X.C1423490n99;
import X.C1423690n9T;
import X.C1423740n9Y;
import X.C1423810n9f;
import X.InterfaceC1423310n8r;
import X.InterfaceC1423480n98;
import X.InterfaceC497601wk;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.CategoryInfo;

/* JADX INFO: loaded from: classes23.dex */
public final class k0 extends C1423340n8u<TemplateCategoryData, C1419590n2r, C1422880n8A, CategoryInfo, Asset, C1423740n9Y, C1423690n9T, C1423470n97, C1422890n8B, Object> {
    public final InterfaceC497601wk LIZLLL;
    public final C1423810n9f LJ = new C1423810n9f();

    public k0(LifecycleCoroutineScope lifecycleCoroutineScope) {
        this.LIZLLL = lifecycleCoroutineScope;
    }

    @Override // X.C1423340n8u
    public final void LIZ(AbstractC1423370n8x abstractC1423370n8x, i iVar, InterfaceC1423480n98 interfaceC1423480n98, C1419220n2G c1419220n2G, InterfaceC1423310n8r interfaceC1423310n8r) {
        C1423490n99 c1423490n99;
        super.LIZ(abstractC1423370n8x, iVar, interfaceC1423480n98, c1419220n2G, new C1423350n8v());
        if ((abstractC1423370n8x instanceof C1423490n99) && (c1423490n99 = (C1423490n99) abstractC1423370n8x) != null) {
            c1423490n99.LJFF = this.LJ;
        }
        if ((iVar instanceof i) && iVar != null) {
            C1423810n9f c1423810n9f = this.LJ;
            iVar.LIZIZ = this.LIZLLL;
            iVar.LIZJ = c1423810n9f;
        }
    }
}
