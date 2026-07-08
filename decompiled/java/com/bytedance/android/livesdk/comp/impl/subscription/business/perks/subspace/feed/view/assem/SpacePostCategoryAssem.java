package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.assem;

import X.C019F;
import X.C055T;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C16FS;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C2864019a;
import X.C2865019b;
import X.C504420JqK;
import X.C504510JqT;
import X.C504710Jqn;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.assem.SpacePostCategoryAssem;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.newpost.view.fragment.SubSpacePostCategoryFragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import webcast.api.sub.HomePageInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class SpacePostCategoryAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public C16FS LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public C504510JqT LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SpacePostCategoryAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subspace/feed/vm/SubSpaceFeedVM;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SpacePostCategoryAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceFeedVM.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C055T(c19719912DlLIZ), new C504710Jqn(), null, true);
    }

    public final C504510JqT Go() {
        if (this.LLJI == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C504510JqT.class, null);
            this.LLJI = interfaceC1555100qZQLIZIZ != null ? (C504510JqT) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJI;
    }

    public final SubSpaceFeedVM Ho() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (SubSpaceFeedVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        C16FS c16fs = (C16FS) view.findViewById(R.id.zsh);
        this.LLIZLLLIL = c16fs;
        if (c16fs != null) {
            C786410Ut5.h8(c16fs, new View.OnClickListener() { // from class: X.0JqJ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    HomePageInfo homePageInfo;
                    FragmentManager childFragmentManager;
                    String str;
                    boolean z;
                    C504450JqN c504450JqNWQ2 = this.LL.Ho().wQ2();
                    C504510JqT c504510JqTGo = this.LL.Go();
                    String str2 = null;
                    if (c504510JqTGo != null) {
                        homePageInfo = c504510JqTGo.LLILZLL;
                    } else {
                        homePageInfo = null;
                    }
                    c504450JqNWQ2.LIZLLL("add_new_post", homePageInfo, this.LL.Ho().zQ2());
                    Fragment fragmentLJI = C724240Sb0.LJI(this.LL);
                    if (fragmentLJI != null && (childFragmentManager = fragmentLJI.getChildFragmentManager()) != null) {
                        SpacePostCategoryAssem spacePostCategoryAssem = this.LL;
                        C504510JqT c504510JqTGo2 = spacePostCategoryAssem.Go();
                        if (c504510JqTGo2 == null || (str = c504510JqTGo2.LLJIJIL) == null) {
                            str = "";
                        }
                        C504510JqT c504510JqTGo3 = spacePostCategoryAssem.Go();
                        if (c504510JqTGo3 != null) {
                            str2 = c504510JqTGo3.LLJILJIL;
                        }
                        C504510JqT c504510JqTGo4 = spacePostCategoryAssem.Go();
                        if (c504510JqTGo4 != null) {
                            z = c504510JqTGo4.LLJLILLLLZIIL;
                        } else {
                            z = false;
                        }
                        SubSpacePostCategoryFragment subSpacePostCategoryFragment = new SubSpacePostCategoryFragment();
                        subSpacePostCategoryFragment.LLILZLL = str;
                        subSpacePostCategoryFragment.LLIZ = str2;
                        subSpacePostCategoryFragment.LLILZIL = childFragmentManager;
                        subSpacePostCategoryFragment.LLIZLLLIL = z;
                        subSpacePostCategoryFragment.show(childFragmentManager, "SubOnlySpacePostCategoryFragment");
                    }
                }
            });
        }
        selectSubscribe(Ho(), new C2217381BqS() { // from class: X.0JtX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506330JtP) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0Jtb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506330JtP) obj).LLJIJIL;
            }
        }, new C2217381BqS() { // from class: X.0Jtd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506330JtP) obj).LLILZLL;
            }
        }, C736820SvI.LIZLLL(), null, new C504420JqK(this));
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0Jql
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506330JtP) obj).LLJILJIL;
            }
        }, C736820SvI.LIZLLL(), new C2864019a(), 4);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0Jte
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506330JtP) obj).LLILZLL;
            }
        }, C736820SvI.LIZLLL(), new C2865019b(), 4);
    }
}
