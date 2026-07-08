package com.ss.android.ugc.tiktok.im.contact.selector.impl.assem;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0QSJ;
import X.C1173220gdU;
import X.C1194810hCJ;
import X.C1223620hwm;
import X.C1224280hxq;
import X.C127G;
import X.C1308910kAL;
import X.C13LE;
import X.C1558520qew;
import X.C1584506Ih;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C1846060y8i;
import X.C19719912Dl;
import X.C19MB;
import X.C20600815jK;
import X.C2217381BqS;
import X.C452501pT;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC1146704e9;
import X.InterfaceC1194840hCM;
import X.InterfaceC1224210hxj;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import Y.AObjectS393S0100000_19;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.tiktok.im.contact.selector.api.scope.ContactSelectorFragmentScope;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.fragment.ContactSelectorTagFragmentData;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorContainerVM;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorContentPageContainerVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class SelectorContentPageContainerAssem extends UISlotAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJJI = C1223620hwm.LIZLLL(this);
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2600));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2602));
    public final SparseArray<InterfaceC1224210hxj> LLJJIJIIJIL = new SparseArray<>();
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2601));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2597));
    public final AssemVMLazy LLJJJIL;
    public final AssemVMLazy LLJJJJ;
    public C127G LLJJJJJIL;
    public InterfaceC665370Q7z LLJJJJLIIL;
    public C0QSJ LLJJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SelectorContentPageContainerAssem.class, "selectorContainerVM", "getSelectorContainerVM()Lcom/ss/android/ugc/tiktok/im/contact/selector/impl/vm/SelectorContainerVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SelectorContentPageContainerAssem.class, "contentPageContainerVM", "getContentPageContainerVM()Lcom/ss/android/ugc/tiktok/im/contact/selector/impl/vm/SelectorContentPageContainerVM;", 0);
        c09r3.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public SelectorContentPageContainerAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SelectorContainerVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ, 2598), AFwS257S0000000_19.get$arr$(513), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SelectorContentPageContainerVM.class);
        this.LLJJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ2, 2599), AFwS257S0000000_19.get$arr$(514), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cg9;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ContactSelectorFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ContactSelectorFragmentScope.class);
        return arrayList;
    }

    public final C0QSJ hp() throws IllegalAccessException {
        C0QSJ c0qsj = this.LLJJL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJJJLIIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJJJJLIIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{ContactSelectorFragmentScope.class});
        this.LLJJL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final SelectorContentPageContainerVM ip() {
        AssemVMLazy assemVMLazy = this.LLJJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJLIIIJLLLLLLLZ;
        return (SelectorContentPageContainerVM) assemVMLazy.getValue();
    }

    public final C1224280hxq kp() {
        return (C1224280hxq) this.LLJJI.getValue();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJJJJIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJJJJIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{SelectorContainerVM.class, new AObjectS393S0100000_19(this, 14), SelectorContentPageContainerVM.class, new AObjectS393S0100000_19(this, 15)}, defaultViewModelProviderFactory);
                    this.LLJJJJJIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int iIntValue;
        ConstraintLayout constraintLayout;
        Integer numLIZJ;
        int i = 0;
        for (Object obj : (List) this.LLJJIII.getValue()) {
            int i2 = i + 1;
            if (i >= 0) {
                this.LLJJIJIIJIL.put(i, (InterfaceC1224210hxj) obj);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        ((ViewOnAttachStateChangeListenerC20631115oD) this.LLJJJ.getValue()).getFragmentItemOperator().LIZLLL((C1173220gdU) this.LLJJIJI.getValue());
        int i3 = 0;
        for (Object obj2 : (List) this.LLJJIII.getValue()) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                C20600815jK.LIZIZ(((ViewOnAttachStateChangeListenerC20631115oD) this.LLJJJ.getValue()).getFragmentItemOperator().getState(), i3, new ContactSelectorTagFragmentData(((InterfaceC1224210hxj) obj2).LIZ().LIZIZ));
                i3 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        if (kp().LIZLLL().LIZ().size() <= 1) {
            C1584506Ih.LIZ((View) this.LLJJIJIL.getValue());
        } else {
            new C1194810hCJ((C1846060y8i) this.LLJJIJIL.getValue(), (ViewOnAttachStateChangeListenerC20631115oD) this.LLJJJ.getValue(), true, new InterfaceC1194840hCM() { // from class: X.0hyO
                @Override // X.InterfaceC1194840hCM
                public final void LIZ(C1845940y8W c1845940y8W, int i5) {
                    C1224570hyJ c1224570hyJLIZ;
                    String str;
                    InterfaceC1224210hxj interfaceC1224210hxj = this.LIZ.LLJJIJIIJIL.get(i5);
                    if (interfaceC1224210hxj != null && (c1224570hyJLIZ = interfaceC1224210hxj.LIZ()) != null && (str = c1224570hyJLIZ.LIZ) != null) {
                        c1845940y8W.LIZIZ(str);
                    }
                }
            }).LIZ();
        }
        Integer num = kp().LJIIIZ().LJIIJ;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = R.attr.zm;
        }
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(iIntValue, context)) != null) {
            ((View) this.LLJJIJIL.getValue()).setBackgroundColor(numLIZJ.intValue());
        }
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0gLj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj3) {
                return Boolean.valueOf(((C1158980gGW) obj3).LL);
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 218), 4);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0gM5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj3) {
                return ((C1158980gGW) obj3).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 199), 4);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0gM4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj3) {
                return ((C1158980gGW) obj3).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 200), 4);
        ip().LLJ = new AwS563S0100000_19(this, 2765);
        ip().LLJI = C1558520qew.LJIIL(this);
        Integer numLJIIIIZZ = kp().LJIIIZ().LJIIIIZZ();
        if (numLJIIIIZZ != null && numLJIIIIZZ.intValue() == 0) {
            View contentView = getContentView();
            if ((contentView instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) contentView) != null) {
                C19MB c19mb = new C19MB();
                c19mb.LJII(constraintLayout);
                c19mb.LJIJI(R.id.unc).LIZLLL.LJJJJJ = 1;
                c19mb.LIZIZ(constraintLayout);
            }
        }
    }
}
