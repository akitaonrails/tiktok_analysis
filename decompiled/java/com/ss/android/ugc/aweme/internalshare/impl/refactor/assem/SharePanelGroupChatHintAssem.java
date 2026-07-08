package com.ss.android.ugc.aweme.internalshare.impl.refactor.assem;

import X.C019F;
import X.C01GW;
import X.C0HZQ;
import X.C0I7D;
import X.C1362270lYP;
import X.C1363050lZf;
import X.C1363060lZg;
import X.C1364570lc7;
import X.C1364640lcE;
import X.C1368890lj5;
import X.C1371590lnR;
import X.C1375880luM;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1599690rjL;
import X.C1637806bA;
import X.C1759206uk;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C426750GoL;
import X.C452501pT;
import X.C723580SZw;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC1364650lcF;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.TextContent;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.vm.ShareContactListViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS230S0300000_21;
import kotlin.jvm.internal.AwS34S0010000_21;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class SharePanelGroupChatHintAssem extends UIContentAssem implements ICreateGroupAbility, InterfaceC1364650lcF, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C1362270lYP.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public C1364640lcE LLJILJILJ;
    public C1363050lZf LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SharePanelGroupChatHintAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/internalshare/impl/refactor/vm/ShareContactListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SharePanelGroupChatHintAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ShareContactListViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 645), AFwS229S0000000_2.get$arr$(388), null, true);
        this.LLJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 622));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 643));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 644));
    }

    @Override // X.InterfaceC1364650lcF
    public final void TU0(int i, boolean z) {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -406811683) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.ICreateGroupAbility
    public final boolean eo() {
        C1364640lcE c1364640lcE = this.LLJILJILJ;
        if (c1364640lcE != null) {
            return c1364640lcE.LJ;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.ICreateGroupAbility
    public final boolean isChecked() {
        C1364640lcE c1364640lcE = this.LLJILJILJ;
        if (c1364640lcE != null) {
            return c1364640lcE.isChecked();
        }
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // X.InterfaceC1364650lcF
    public final void Ew(boolean z) {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        assemVMLazy.getValue().setState(new AwS34S0010000_21(8));
        ISendAbility iSendAbility = (ISendAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISendAbility.class, null);
        if (iSendAbility != null) {
            iSendAbility.nE();
        }
    }

    @Override // X.InterfaceC1364650lcF
    public final void N9(boolean z) {
        ISendAbility iSendAbility = (ISendAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISendAbility.class, null);
        if (iSendAbility != null) {
            iSendAbility.N9(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.ICreateGroupAbility
    public final void TM1(boolean z) {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        assemVMLazy.getValue().setState(new AwS34S0010000_21(z, 7));
        if (!z) {
            C1364640lcE c1364640lcE = this.LLJILJILJ;
            if (c1364640lcE != null) {
                c1364640lcE.LJIIJJI = false;
            }
            C1363050lZf c1363050lZf = this.LLJILLL;
            if (c1363050lZf != null) {
                c1363050lZf.LJIIJJI = false;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.ICreateGroupAbility
    public final boolean Yq1(AwS230S0300000_21 awS230S0300000_21) {
        C1364640lcE c1364640lcE = this.LLJILJILJ;
        if (c1364640lcE != null) {
            return c1364640lcE.LIZJ(awS230S0300000_21);
        }
        return false;
    }

    @Override // X.InterfaceC1364650lcF
    public final void bd(boolean z) {
        ICreateGroupButtonAbility iCreateGroupButtonAbility = (ICreateGroupButtonAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ICreateGroupButtonAbility.class, null);
        if (iCreateGroupButtonAbility != null) {
            iCreateGroupButtonAbility.bd(z);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int i;
        Integer numValueOf;
        C0I7D c0i7d;
        LinearLayout linearLayout;
        C0HZQ c0hzq;
        View rootView;
        C1371590lnR c1371590lnR;
        SharePackage sharePackage;
        Bundle bundle;
        C0I7D c0i7d2;
        LinearLayout linearLayout2;
        C0HZQ c0hzq2;
        LinearLayout linearLayout3;
        View rootView2;
        SharePackage sharePackage2;
        Bundle bundle2;
        super.onViewCreated(view);
        C0HZQ c0hzq3 = (C0HZQ) this.LLJI.getValue();
        boolean z = false;
        if (c0hzq3 != null) {
            c0hzq3.setChecked(false);
        }
        C1362270lYP c1362270lYP = (C1362270lYP) this.LLIZLLLIL.getValue();
        SharePackage sharePackage3 = null;
        if (c1362270lYP != null && (sharePackage2 = c1362270lYP.LL) != null && (bundle2 = sharePackage2.extras) != null) {
            i = bundle2.getInt("key_share_checkbox_direct_show_text");
        } else {
            i = 0;
        }
        if (i != 0) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null && (rootView2 = viewLJJIJL.getRootView()) != null) {
                c0i7d2 = (C0I7D) rootView2.findViewById(R.id.opr);
            } else {
                c0i7d2 = null;
            }
            View viewLJJIJL2 = LJJIJL();
            if ((viewLJJIJL2 instanceof LinearLayout) && (linearLayout2 = (LinearLayout) viewLJJIJL2) != null && (c0hzq2 = (C0HZQ) this.LLJI.getValue()) != null) {
                C1363060lZg c1363060lZg = new C1363060lZg(linearLayout2, c0hzq2, c0i7d2, null, 24);
                C1362270lYP c1362270lYP2 = (C1362270lYP) this.LLIZLLLIL.getValue();
                if (c1362270lYP2 != null) {
                    sharePackage3 = c1362270lYP2.LL;
                }
                C1363050lZf c1363050lZf = new C1363050lZf(c1363060lZg, sharePackage3, this, false, 24);
                c1363050lZf.LIZLLL();
                this.LLJILLL = c1363050lZf;
                TuxTextView tuxTextView = (TuxTextView) this.LLJIJIL.getValue();
                if (tuxTextView != null) {
                    C1368890lj5.LIZIZ(tuxTextView, i);
                }
                View viewLJJIJL3 = LJJIJL();
                if ((viewLJJIJL3 instanceof LinearLayout) && (linearLayout3 = (LinearLayout) viewLJJIJL3) != null) {
                    C426750GoL.LJIIIZ(linearLayout3, null, Integer.valueOf(C1364570lc7.LIZJ()), null, Integer.valueOf(C1364570lc7.LIZIZ()), false, 21);
                    ViewGroup.LayoutParams layoutParams = linearLayout3.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = C1364570lc7.LIZ();
                    }
                    C786410Ut5.LJZL(0, linearLayout3);
                    return;
                }
                return;
            }
            return;
        }
        C1362270lYP c1362270lYP3 = (C1362270lYP) this.LLIZLLLIL.getValue();
        if (c1362270lYP3 != null && (sharePackage = c1362270lYP3.LL) != null && (bundle = sharePackage.extras) != null) {
            numValueOf = Integer.valueOf(bundle.getInt("aweme_type"));
        } else {
            numValueOf = null;
        }
        boolean zLIZJ = C1375880luM.LIZJ(numValueOf);
        C1362270lYP c1362270lYP4 = (C1362270lYP) this.LLIZLLLIL.getValue();
        if (c1362270lYP4 != null && (c1371590lnR = c1362270lYP4.LLILZ) != null) {
            z = c1371590lnR.LJJLIIIJLLLLLLLZ;
        }
        C1759206uk c1759206uk = C1759206uk.LIZ;
        if (C1759206uk.LIZ() && !zLIZJ && !z) {
            View viewLJJIJL4 = LJJIJL();
            if (viewLJJIJL4 != null && (rootView = viewLJJIJL4.getRootView()) != null) {
                c0i7d = (C0I7D) rootView.findViewById(R.id.opr);
            } else {
                c0i7d = null;
            }
            View viewLJJIJL5 = LJJIJL();
            if (!(viewLJJIJL5 instanceof LinearLayout) || (linearLayout = (LinearLayout) viewLJJIJL5) == null || (c0hzq = (C0HZQ) this.LLJI.getValue()) == null) {
                return;
            }
            this.LLJIJIL.getValue();
            C1363060lZg c1363060lZg2 = new C1363060lZg(linearLayout, c0hzq, c0i7d, (C197039127h) this.LLJILJIL.getValue());
            C1362270lYP c1362270lYP5 = (C1362270lYP) this.LLIZLLLIL.getValue();
            if (c1362270lYP5 != null) {
                sharePackage3 = c1362270lYP5.LL;
            }
            C1364640lcE c1364640lcE = new C1364640lcE(c1363060lZg2, sharePackage3, this);
            c1364640lcE.LIZLLL();
            this.LLJILJILJ = c1364640lcE;
        }
        TuxTextView tuxTextView2 = (TuxTextView) this.LLJIJIL.getValue();
        if (tuxTextView2 == null) {
            return;
        }
        C1368890lj5.LIZIZ(tuxTextView2, 2131835370);
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.ICreateGroupAbility
    public final boolean pJ(String str) {
        C1363050lZf c1363050lZf = this.LLJILLL;
        if (c1363050lZf == null || c1363050lZf.LJJ) {
            return true;
        }
        if (str != null && str.length() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.ICreateGroupAbility
    public final void x9(List<? extends IMContact> list) {
        C1364640lcE c1364640lcE = this.LLJILJILJ;
        if (c1364640lcE != null) {
            c1364640lcE.LIZ(list);
        }
    }

    @Override // X.InterfaceC1364650lcF
    public final void z51(boolean z) {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        assemVMLazy.getValue().setState(new AwS34S0010000_21(z, 7));
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.ICreateGroupAbility
    public final BaseContent Gx2(SharePackage sharePackage, String str) {
        C1363050lZf c1363050lZf = this.LLJILLL;
        if (c1363050lZf != null && !c1363050lZf.LJJ) {
            sharePackage.extras.putBoolean("key_only_share_with_text_content", true);
            TextContent textContentObtain = TextContent.Companion.obtain(str, null, null, null, null, null);
            IMSharePanelApi.LIZ.getClass();
            C1599690rjL.LIZ().getShareService().LJJIJ(textContentObtain, textContentObtain, sharePackage);
            return textContentObtain;
        }
        return null;
    }
}
