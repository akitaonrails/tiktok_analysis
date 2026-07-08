package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.assem;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C019F;
import X.C055R;
import X.C13LE;
import X.C1440105kN;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1586706Jd;
import X.C1637806bA;
import X.C16F5;
import X.C16FS;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C497740JfY;
import X.C504880Jr4;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.vm.SubSpaceDetailVM;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.fragment.SubSpaceFeedFragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes3.dex */
public final class DetailBackToSpaceAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public final AssemVMLazy LLJJI;
    public C504880Jr4 LLJJIII;
    public C16F5 LLJJIJI;
    public View LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DetailBackToSpaceAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subspace/detail/vm/SubSpaceDetailVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public DetailBackToSpaceAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceDetailVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C055R(c19719912DlLIZ), new C1586706Jd(), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.hoa;
    }

    public final C504880Jr4 hp() {
        if (this.LLJJIII == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C504880Jr4.class, null);
            this.LLJJIII = interfaceC1555100qZQLIZIZ != null ? (C504880Jr4) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJIII;
    }

    public final void ip() {
        C16FS c16fs;
        C504880Jr4 c504880Jr4Hp = hp();
        if (c504880Jr4Hp == null || !c504880Jr4Hp.LLJJJ) {
            return;
        }
        C16F5 c16f5 = this.LLJJIJI;
        if (c16f5 != null) {
            c16f5.setText(C497740JfY.LJIJI(2131856637));
        }
        View view = this.LLJJIJIIJIL;
        if (!(view instanceof C16FS) || (c16fs = (C16FS) view) == null) {
            return;
        }
        c16fs.setText(C497740JfY.LJIJI(2131856638));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        super.onViewCreated(view);
        C504880Jr4 c504880Jr4Hp = hp();
        if (c504880Jr4Hp != null && (str = c504880Jr4Hp.LLJIJIL) != null && str.length() != 0) {
            this.LLJJIJIIJIL = view.findViewById(R.id.m1b);
            this.LLJJIJI = (C16F5) view.findViewById(R.id.zay);
            ip();
            View view2 = this.LLJJIJIIJIL;
            if (view2 != null) {
                C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0Jqp
                    {
                        super(300L);
                    }

                    @Override // X.AbstractViewOnClickListenerC1637610siV
                    public final void LIZ(View view3) {
                        C504880Jr4 c504880Jr4Hp2;
                        String str2;
                        String str3;
                        FragmentManager supportFragmentManager;
                        if (view3 != null && (c504880Jr4Hp2 = this.LLILZ.hp()) != null) {
                            int i = c504880Jr4Hp2.LLJJIJI;
                            C504880Jr4 c504880Jr4Hp3 = this.LLILZ.hp();
                            if (c504880Jr4Hp3 == null || (str2 = c504880Jr4Hp3.LL) == null) {
                                str2 = "";
                            }
                            Bundle bundle = new Bundle();
                            C504880Jr4 c504880Jr4Hp4 = this.LLILZ.hp();
                            if (c504880Jr4Hp4 != null) {
                                str3 = c504880Jr4Hp4.LLJIJIL;
                            } else {
                                str3 = null;
                            }
                            C786410Ut5.LJJJI("sec_anchor_id", str3, bundle);
                            C504880Jr4 c504880Jr4Hp5 = this.LLILZ.hp();
                            if (c504880Jr4Hp5 != null && c504880Jr4Hp5.LLJJJ) {
                                C786410Ut5.LJJJI("is_super_fans", "true", bundle);
                            }
                            C19EG c19egLIZ = C724240Sb0.LIZ(this.LLILZ);
                            if (c19egLIZ != null && (supportFragmentManager = c19egLIZ.getSupportFragmentManager()) != null) {
                                SubSpaceFeedFragment.LLJIJIL.getClass();
                                SubSpaceFeedFragment subSpaceFeedFragment = new SubSpaceFeedFragment();
                                subSpaceFeedFragment.LLILLJJLI = str2;
                                subSpaceFeedFragment.LLILLL = i;
                                subSpaceFeedFragment.setArguments(bundle);
                                C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
                                c19ehLJIIJ.LJIJJ(R.anim.hf, R.anim.hc);
                                c19ehLJIIJ.LIZJ(i, subSpaceFeedFragment, "SubOnlySpaceFeedFragment");
                                c19ehLJIIJ.LJII("SubOnlySpaceFeedFragment");
                                c19ehLJIIJ.LJIIJ();
                            }
                        }
                    }
                }, view2);
            }
            AssemVMLazy assemVMLazy = this.LLJJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
            C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.06Je
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C506340JtQ) obj).LLJILJILJ;
                }
            }, null, new C1440105kN(this), 6);
            return;
        }
        C786410Ut5.LJLLLLLL(8, LJJIJL());
    }
}
