package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.fragment;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C0JU1;
import X.C0QSJ;
import X.C1142004dO;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C492530JTf;
import X.C500260Jjc;
import X.C504390JqH;
import X.C504760Jqs;
import X.C504880Jr4;
import X.C504940JrA;
import X.C505200Jra;
import X.C505210Jrb;
import X.C505220Jrc;
import X.C505250Jrf;
import X.C505270Jrh;
import X.C505410Jrv;
import X.C505500Js4;
import X.C512300K7g;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC1146704e9;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC2262081DgM;
import X.InterfaceC451590HnJ;
import X.InterfaceC687730QyJ;
import X.InterfaceC724760Sbq;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.common.fragment.SubSpaceBaseFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.vm.SubSpaceDetailVM;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.secure.SubSpaceSecureManager;
import com.bytedance.android.livesdk.livesetting.level.LiveFansClubHideBackContainerSettings;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpaceDetailFragment extends SubSpaceBaseFragment implements C0QSJ, InterfaceC1146704e9 {
    public static final C504390JqH LLJILJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExPTYlJyogHELIOSO2s8LD04O2s/PC0gOCQvLGE3LTEtICN9PiwpPmE1OiQrJCo9PGsfPC0AOCQvLAs2PCQlJQkhKSIhLCEn";
    public final AssemVMLazy LLILZLL;
    public C504880Jr4 LLIZ;
    public User LLIZLLLIL;
    public SpacePost LLJ;
    public View LLJI;
    public final C01GW LLJIJIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0JqH] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubSpaceDetailFragment.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subspace/detail/vm/SubSpaceDetailVM;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJILJIL = new Object() { // from class: X.0JqH
        };
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SubSpaceDetailFragmentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SubSpaceDetailFragmentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SubSpaceDetailFragmentScope.class);
        return arrayList;
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

    public SubSpaceDetailFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceDetailVM.class);
        C492530JTf c492530JTf = new C492530JTf(c19719912DlLIZ);
        C505500Js4 c505500Js4 = new C505500Js4();
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c492530JTf, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new C505200Jra(this), c505500Js4, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c492530JTf, new C505210Jrb(this), c505500Js4, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c492530JTf, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C505220Jrc(this), c505500Js4, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILZLL = assemVMLazy;
        this.LLJIJIL = C452501pT.LIZIZ(new C0JU1(this));
    }

    public final C504880Jr4 RR() {
        if (this.LLIZ == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", C504880Jr4.class, null);
            this.LLIZ = interfaceC1555100qZQLIZIZ != null ? (C504880Jr4) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLIZ;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Window window;
        super.onCreate(bundle);
        C19EG activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(48);
        }
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), new C504880Jr4(), C504880Jr4.class, "source_default_key");
    }

    @Override // com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.common.fragment.SubSpaceBaseFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        String string;
        long j;
        String string2;
        String string3;
        int i;
        User user;
        String string4;
        String string5;
        int i2;
        View viewFindViewById;
        View viewFindViewById2;
        String str;
        String secUid;
        User user2;
        boolean zBooleanValue;
        Boolean boolLIZ;
        String secUid2;
        User user3;
        super.onViewCreated(view, bundle);
        long j2 = 0;
        if (this.LLJ != null && this.LLIZLLLIL != null) {
            C504880Jr4 c504880Jr4RR = RR();
            if (c504880Jr4RR != null) {
                InterfaceC2262081DgM currentUser = UserService.getInstance().user().getCurrentUser();
                if (currentUser instanceof User) {
                    user3 = (User) currentUser;
                } else {
                    user3 = null;
                }
                c504880Jr4RR.LLJ = user3;
            }
            C504880Jr4 c504880Jr4RR2 = RR();
            if (c504880Jr4RR2 != null) {
                c504880Jr4RR2.LLJI = this.LLIZLLLIL;
            }
            C504880Jr4 c504880Jr4RR3 = RR();
            if (c504880Jr4RR3 != null) {
                User user4 = this.LLIZLLLIL;
                if (user4 != null) {
                    secUid2 = user4.getSecUid();
                } else {
                    secUid2 = null;
                }
                c504880Jr4RR3.LLJIJIL = secUid2;
            }
            C504880Jr4 c504880Jr4RR4 = RR();
            if (c504880Jr4RR4 != null) {
                SpacePost spacePost = this.LLJ;
                if (spacePost != null) {
                    j2 = spacePost.postId;
                }
                c504880Jr4RR4.LLILZ = j2;
            }
            C504880Jr4 c504880Jr4RR5 = RR();
            if (c504880Jr4RR5 != null) {
                c504880Jr4RR5.LLILLL = this.LLJ;
            }
        } else {
            if (this.LLILLL == 0) {
                Bundle arguments = getArguments();
                if (arguments != null) {
                    i2 = arguments.getInt("container_id");
                } else {
                    i2 = 0;
                }
                this.LLILLL = i2;
            }
            if (this.LLILLJJLI.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            String str2 = "";
            if (z) {
                Bundle arguments2 = getArguments();
                if (arguments2 == null || (string5 = arguments2.getString("enter_from")) == null) {
                    string5 = "";
                }
                this.LLILLJJLI = string5;
            }
            C504880Jr4 c504880Jr4RR6 = RR();
            if (c504880Jr4RR6 != null) {
                c504880Jr4RR6.LLIZ = Boolean.TRUE;
            }
            C504880Jr4 c504880Jr4RR7 = RR();
            if (c504880Jr4RR7 != null) {
                Bundle arguments3 = getArguments();
                if (arguments3 != null && (string4 = arguments3.getString("sec_anchor_id")) != null) {
                    str2 = string4;
                }
                c504880Jr4RR7.LLJIJIL = str2;
            }
            C504880Jr4 c504880Jr4RR8 = RR();
            if (c504880Jr4RR8 != null) {
                InterfaceC2262081DgM currentUser2 = UserService.getInstance().user().getCurrentUser();
                if (currentUser2 instanceof User) {
                    user = (User) currentUser2;
                } else {
                    user = null;
                }
                c504880Jr4RR8.LLJ = user;
            }
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                string = arguments4.getString("post_id");
            } else {
                string = null;
            }
            if (C500260Jjc.LJJIIZ(string)) {
                try {
                    C504880Jr4 c504880Jr4RR9 = RR();
                    if (c504880Jr4RR9 != null) {
                        if (string == null) {
                            j = 0;
                        } else {
                            j = CastLongProtector.parseLong(string);
                        }
                        c504880Jr4RR9.LLILZ = j;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            Bundle arguments5 = getArguments();
            if (arguments5 != null) {
                string2 = arguments5.getString("comment_id");
            } else {
                string2 = null;
            }
            if (C500260Jjc.LJJIIZ(string)) {
                try {
                    C504880Jr4 c504880Jr4RR10 = RR();
                    if (c504880Jr4RR10 != null) {
                        if (string2 != null) {
                            j2 = CastLongProtector.parseLong(string2);
                        }
                        c504880Jr4RR10.LLILZIL = j2;
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
            Bundle arguments6 = getArguments();
            if (arguments6 != null) {
                string3 = arguments6.getString("comment_type");
            } else {
                string3 = null;
            }
            if (C500260Jjc.LJJIIZ(string)) {
                try {
                    C504880Jr4 c504880Jr4RR11 = RR();
                    if (c504880Jr4RR11 != null) {
                        if (string3 == null) {
                            i = 0;
                        } else {
                            i = CastIntegerProtector.parseInt(string3);
                        }
                        c504880Jr4RR11.LLILZLL = i;
                    }
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
            }
        }
        C504880Jr4 c504880Jr4RR12 = RR();
        if (c504880Jr4RR12 != null) {
            Bundle arguments7 = getArguments();
            if (arguments7 != null && (boolLIZ = C512300K7g.LIZ(arguments7, "hide_banner", Boolean.FALSE)) != null) {
                zBooleanValue = boolLIZ.booleanValue();
            } else {
                zBooleanValue = false;
            }
            c504880Jr4RR12.LLJJIJIL = zBooleanValue;
        }
        C504880Jr4 c504880Jr4RR13 = RR();
        if (c504880Jr4RR13 != null) {
            C504880Jr4 c504880Jr4RR14 = RR();
            if (c504880Jr4RR14 != null) {
                str = c504880Jr4RR14.LLJIJIL;
            } else {
                str = null;
            }
            C504880Jr4 c504880Jr4RR15 = RR();
            if (c504880Jr4RR15 != null && (user2 = c504880Jr4RR15.LLJ) != null) {
                secUid = user2.getSecUid();
            } else {
                secUid = null;
            }
            c504880Jr4RR13.LLJJIII = Intrinsics.LJFF(str, secUid);
        }
        C504880Jr4 c504880Jr4RR16 = RR();
        if (c504880Jr4RR16 != null) {
            c504880Jr4RR16.LLJJIJI = this.LLILLL;
        }
        C504880Jr4 c504880Jr4RR17 = RR();
        if (c504880Jr4RR17 != null) {
            c504880Jr4RR17.LL = this.LLILLJJLI;
        }
        C504880Jr4 c504880Jr4RR18 = RR();
        if (c504880Jr4RR18 != null) {
            c504880Jr4RR18.LLJILJIL = false;
        }
        C504880Jr4 c504880Jr4RR19 = RR();
        if (c504880Jr4RR19 != null) {
            c504880Jr4RR19.LLJJJ = this.LLILZ;
        }
        AssemVMLazy assemVMLazy = this.LLILZLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        SubSpaceDetailVM subSpaceDetailVM = (SubSpaceDetailVM) assemVMLazy.getValue();
        subSpaceDetailVM.LL = C1558360qeg.LJFF(this, null);
        subSpaceDetailVM.LLILZ = new C504760Jqs(subSpaceDetailVM, subSpaceDetailVM.vQ2());
        ((SubSpaceDetailVM) this.LLILZLL.getValue()).LLILLL = new C504940JrA(this);
        if (RR() != null) {
            getContext();
        }
        if (!((SubSpaceDetailVM) this.LLILZLL.getValue()).zQ2()) {
            SubSpaceSecureManager.LIZ(this);
        }
        C723850SaN.LIZ(this, false, null, new C505250Jrf(this), 3);
        View view2 = getView();
        if (view2 != null && (viewFindViewById2 = view2.findViewById(R.id.wg0)) != null) {
            C723850SaN.LIZ(this, false, null, new C505270Jrh(this, viewFindViewById2), 3);
        }
        C504880Jr4 c504880Jr4RR20 = RR();
        if (c504880Jr4RR20 != null) {
            c504880Jr4RR20.LLILLJJLI = (DataChannel) this.LLJIJIL.getValue();
        }
        C723850SaN.LIZ(this, false, null, new C505410Jrv(this), 3);
        C504880Jr4 c504880Jr4RR21 = RR();
        if (c504880Jr4RR21 != null && Intrinsics.LJFF(c504880Jr4RR21.LLIZ, Boolean.TRUE)) {
            C504880Jr4 c504880Jr4RR22 = RR();
            if (c504880Jr4RR22 != null && c504880Jr4RR22.LLJJIJIL) {
                return;
            }
            C504880Jr4 c504880Jr4RR23 = RR();
            if (c504880Jr4RR23 != null && c504880Jr4RR23.LLJJJ && LiveFansClubHideBackContainerSettings.INSTANCE.getValue()) {
                return;
            }
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById = view3.findViewById(R.id.bnp);
            } else {
                viewFindViewById = null;
            }
            this.LLJI = viewFindViewById;
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById);
            }
            C723850SaN.LIZ(this, false, null, new C1142004dO(this), 3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gll, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
