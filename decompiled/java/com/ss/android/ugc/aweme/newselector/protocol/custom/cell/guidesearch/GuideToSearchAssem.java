package com.ss.android.ugc.aweme.newselector.protocol.custom.cell.guidesearch;

import X.C019F;
import X.C0QSJ;
import X.C1076390e7J;
import X.C127G;
import X.C13IQ;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C687700QyG;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.AObjectS391S0100000_16;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.tiktok.im.contact.selector.api.protocol.custom.ContactSelectorCustomCellAssem;
import com.ss.android.ugc.tiktok.im.contact.selector.api.protocol.custom.ContactSelectorCustomVM;
import com.ss.android.ugc.tiktok.im.contact.selector.api.scope.ContactSelectorFragmentScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import wh6.AbS697S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class GuideToSearchAssem extends ContactSelectorCustomCellAssem<C1076390e7J> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public C127G LLJL;
    public InterfaceC665370Q7z LLJLIL;
    public C0QSJ LLJLILLLLZIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GuideToSearchAssem.class, "vm", "getVm()Lcom/ss/android/ugc/tiktok/im/contact/selector/api/protocol/custom/ContactSelectorCustomVM;", 0);
        C13LE.LIZ.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public GuideToSearchAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ContactSelectorCustomVM.class);
        this.LLJJLIIIJLLLLLLLZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 381), null, AFwS252S0000000_16.get$arr$(277));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.aec;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ContactSelectorFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ContactSelectorFragmentScope.class);
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList2.add(ContactSelectorFragmentScope.class);
        return arrayList2;
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ContactSelectorCustomVM.class, new AObjectS391S0100000_16(this, 4)}, defaultViewModelProviderFactory);
                    this.LLJL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View viewFindViewById = view.findViewById(R.id.uam);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        viewFindViewById.setBackground(c384050F3z.LIZ(view.getContext()));
        C786410Ut5.I7(new AbS697S0100000_16(this, 3), view);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        ((TextView) getContentView().findViewById(R.id.jp0)).setText(((C1076390e7J) obj).LL);
    }
}
