package com.ss.android.ugc.aweme.hometab.base;

import X.AbstractC1583720rJa;
import X.AbstractC1584410rKh;
import X.C1583120rIc;
import X.C1584440rKk;
import X.C1591550rWD;
import X.C1591640rWM;
import X.EnumC1570580qyO;
import X.EnumC1571190qzN;
import X.InterfaceC1570340qy0;
import X.InterfaceC1583070rIX;
import X.InterfaceC1583080rIY;
import X.InterfaceC1589850rTT;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.TabFragmentNode;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public class TopTabNode extends TabFragmentNode implements InterfaceC1570340qy0 {
    public final Context LLIZLLLIL;
    public final TopTabProtocol LLJ;

    @Override // com.ss.android.ugc.aweme.TabFragmentNode, X.InterfaceC1583870rJp
    public final Map<String, String> LIZ() {
        return this.LLJ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.TabFragmentNode, X.InterfaceC1583870rJp
    public final void LIZIZ() {
        this.LLJ.LIZIZ();
    }

    @Override // X.InterfaceC1583870rJp
    public final String LIZLLL() {
        return this.LLJ.mc(this.LLIZLLLIL);
    }

    @Override // X.AbstractC1583720rJa, X.InterfaceC1583870rJp
    public final String LJFF() {
        return this.LLJ.getMob();
    }

    @Override // com.ss.android.ugc.aweme.TabFragmentNode, X.InterfaceC1583870rJp
    public final InterfaceC1589850rTT LJII() {
        return this.LLJ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.TabFragmentNode, X.InterfaceC1583870rJp
    public final EnumC1571190qzN LJIIJJI() {
        return this.LLJ.LJIIL();
    }

    @Override // X.InterfaceC1570340qy0
    public final EnumC1570580qyO LJIIL() {
        return this.LLJ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.TabFragmentNode, X.InterfaceC1583870rJp
    public final EnumC1571190qzN LJIILIIL() {
        return this.LLJ.LJIIJJI();
    }

    @Override // X.AbstractC1583720rJa
    public final Bundle LJIIZILJ() {
        return this.LLJ.V9(this.LLIZLLLIL);
    }

    @Override // X.AbstractC1583720rJa
    public final Class<? extends Fragment> LJIJ() {
        return this.LLJ.LLJIJIL();
    }

    @Override // X.AbstractC1583720rJa
    public final String tag() {
        return this.LLJ.getTag();
    }

    @Override // com.ss.android.ugc.aweme.TabFragmentNode, X.InterfaceC1583870rJp
    public final int type() {
        return this.LLJ.LJII();
    }

    public final int hashCode() {
        return tag().hashCode();
    }

    @Override // com.ss.android.ugc.aweme.TabFragmentNode, X.InterfaceC1583870rJp
    public final void LJ(String str) {
        this.LLJ.LJIIJ(str);
    }

    @Override // X.InterfaceC1583870rJp
    public final View LJI(InterfaceC1583080rIY interfaceC1583080rIY) {
        C1583120rIc c1583120rIcLJI = this.LLJ.LJI();
        C1584440rKk c1584440rKk = new C1584440rKk(this.LLIZLLLIL, tag(), LIZLLL());
        InterfaceC1583070rIX interfaceC1583070rIXLIZ = c1583120rIcLJI.LIZ;
        if (interfaceC1583070rIXLIZ == null) {
            interfaceC1583070rIXLIZ = c1583120rIcLJI.LIZ(interfaceC1583080rIY, c1584440rKk);
            c1583120rIcLJI.LIZ = interfaceC1583070rIXLIZ;
            AbstractC1584410rKh abstractC1584410rKhLIZIZ = c1583120rIcLJI.LIZIZ();
            if (abstractC1584410rKhLIZIZ != null) {
                abstractC1584410rKhLIZIZ.LJII(interfaceC1583070rIXLIZ.getView(), c1584440rKk);
            }
        }
        return interfaceC1583070rIXLIZ.getView();
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (Intrinsics.LJFF(cls2, cls) && TextUtils.equals(tag(), ((AbstractC1583720rJa) obj).tag())) {
            return true;
        }
        return false;
    }

    public TopTabNode(Context context, TopTabProtocol topTabProtocol) {
        this.LLIZLLLIL = context;
        this.LLJ = topTabProtocol;
        topTabProtocol.init(context);
    }

    @Override // com.ss.android.ugc.aweme.TabFragmentNode, X.InterfaceC1583870rJp
    public final void LJIIIIZZ(String str, String str2) {
        this.LLJ.LJIIIZ(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.TabFragmentNode, X.InterfaceC1583870rJp
    public final void LJIILJJIL(C1591640rWM c1591640rWM, C1591550rWD c1591550rWD) {
        this.LLJ.LJIILIIL(c1591640rWM, c1591550rWD);
    }
}
