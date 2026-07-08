package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.fragment;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C0JM8;
import X.C0JMA;
import X.C0JMC;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1622206Wu;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C504760Jqs;
import X.C504880Jr4;
import X.C505170JrX;
import X.C505180JrY;
import X.C505190JrZ;
import X.C505350Jrp;
import X.C505370Jrr;
import X.C505390Jrt;
import X.C505490Js3;
import X.C512300K7g;
import X.C723850SaN;
import X.C724750Sbp;
import X.C987103tV;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC2262081DgM;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.vm.SubSpaceDetailVM;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.secure.SubSpaceSecureManager;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpaceDetailDialogFragment extends LiveDialogFragment {
    public static final C0JM8 LLIZLLLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExPTYlJyogO2s8HELIOSLD04O2s/PC0gOCQvLGE3LTEtICN9PiwpPmE1OiQrJCo9PGsfPC0AOCQvLAs2PCQlJQs6KSkjLgkhKSIhLCEn";
    public final AssemVMLazy LL;
    public C504880Jr4 LLILLJJLI;
    public User LLILLL;
    public SpacePost LLILZ;
    public boolean LLILZIL;
    public final C01GW LLILZLL;
    public String LLIZ;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0JM8] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubSpaceDetailDialogFragment.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subspace/detail/vm/SubSpaceDetailVM;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLIZLLLIL = new Object() { // from class: X.0JM8
        };
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public SubSpaceDetailDialogFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceDetailVM.class);
        C0JMA c0jma = new C0JMA(c19719912DlLIZ);
        C505490Js3 c505490Js3 = new C505490Js3();
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0jma, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new C505170JrX(this), c505490Js3, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0jma, new C505180JrY(this), c505490Js3, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0jma, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C505190JrZ(this), c505490Js3, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LL = assemVMLazy;
        this.LLILZLL = C452501pT.LIZIZ(new C0JMC(this));
        this.LLIZ = "";
    }

    public final C504880Jr4 MR() {
        if (this.LLILLJJLI == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", C504880Jr4.class, null);
            this.LLILLJJLI = interfaceC1555100qZQLIZIZ != null ? (C504880Jr4) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLILLJJLI;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.glm);
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LJI = this.LLILZIL ? 0.6f : 0.0f;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJJI = 73;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean zBooleanValue;
        Boolean boolLIZ;
        if (!this.LLILZIL) {
            Bundle arguments = getArguments();
            if (arguments != null && (boolLIZ = C512300K7g.LIZ(arguments, "is_super_fans", null)) != null) {
                zBooleanValue = boolLIZ.booleanValue();
            } else {
                zBooleanValue = false;
            }
            this.LLILZIL = zBooleanValue;
        }
        super.onCreate(bundle);
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), new C504880Jr4(), C504880Jr4.class, "source_default_key");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        long j;
        String string2;
        String string3;
        int i;
        boolean zBooleanValue;
        Boolean boolLIZ;
        String string4;
        User user;
        String string5;
        View viewFindViewById;
        String str;
        String secUid;
        User user2;
        String secUid2;
        User user3;
        super.onViewCreated(view, bundle);
        long j2 = 0;
        if (this.LLILZ != null && this.LLILLL != null) {
            C504880Jr4 c504880Jr4MR = MR();
            if (c504880Jr4MR != null) {
                InterfaceC2262081DgM currentUser = UserService.getInstance().user().getCurrentUser();
                if (currentUser instanceof User) {
                    user3 = (User) currentUser;
                } else {
                    user3 = null;
                }
                c504880Jr4MR.LLJ = user3;
            }
            C504880Jr4 c504880Jr4MR2 = MR();
            if (c504880Jr4MR2 != null) {
                c504880Jr4MR2.LLJI = this.LLILLL;
            }
            C504880Jr4 c504880Jr4MR3 = MR();
            if (c504880Jr4MR3 != null) {
                User user4 = this.LLILLL;
                if (user4 != null) {
                    secUid2 = user4.getSecUid();
                } else {
                    secUid2 = null;
                }
                c504880Jr4MR3.LLJIJIL = secUid2;
            }
            C504880Jr4 c504880Jr4MR4 = MR();
            if (c504880Jr4MR4 != null) {
                SpacePost spacePost = this.LLILZ;
                if (spacePost != null) {
                    j2 = spacePost.postId;
                }
                c504880Jr4MR4.LLILZ = j2;
            }
            C504880Jr4 c504880Jr4MR5 = MR();
            if (c504880Jr4MR5 != null) {
                c504880Jr4MR5.LLILLL = this.LLILZ;
            }
        } else {
            C504880Jr4 c504880Jr4MR6 = MR();
            String str2 = "";
            if (c504880Jr4MR6 != null) {
                Bundle arguments = getArguments();
                if (arguments == null || (string5 = arguments.getString("sec_anchor_id")) == null) {
                    string5 = "";
                }
                c504880Jr4MR6.LLJIJIL = string5;
            }
            C504880Jr4 c504880Jr4MR7 = MR();
            if (c504880Jr4MR7 != null) {
                InterfaceC2262081DgM currentUser2 = UserService.getInstance().user().getCurrentUser();
                if (currentUser2 instanceof User) {
                    user = (User) currentUser2;
                } else {
                    user = null;
                }
                c504880Jr4MR7.LLJ = user;
            }
            if (this.LLIZ.length() == 0) {
                Bundle arguments2 = getArguments();
                if (arguments2 != null && (string4 = arguments2.getString("enter_from")) != null) {
                    str2 = string4;
                }
                this.LLIZ = str2;
            }
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                string = arguments3.getString("post_id");
            } else {
                string = null;
            }
            if (C500260Jjc.LJJIIZ(string)) {
                try {
                    C504880Jr4 c504880Jr4MR8 = MR();
                    if (c504880Jr4MR8 != null) {
                        if (string == null) {
                            j = 0;
                        } else {
                            j = CastLongProtector.parseLong(string);
                        }
                        c504880Jr4MR8.LLILZ = j;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                string2 = arguments4.getString("comment_id");
            } else {
                string2 = null;
            }
            if (C500260Jjc.LJJIIZ(string)) {
                try {
                    C504880Jr4 c504880Jr4MR9 = MR();
                    if (c504880Jr4MR9 != null) {
                        if (string2 != null) {
                            j2 = CastLongProtector.parseLong(string2);
                        }
                        c504880Jr4MR9.LLILZIL = j2;
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
            Bundle arguments5 = getArguments();
            if (arguments5 != null) {
                string3 = arguments5.getString("comment_type");
            } else {
                string3 = null;
            }
            if (C500260Jjc.LJJIIZ(string)) {
                try {
                    C504880Jr4 c504880Jr4MR10 = MR();
                    if (c504880Jr4MR10 != null) {
                        if (string3 == null) {
                            i = 0;
                        } else {
                            i = CastIntegerProtector.parseInt(string3);
                        }
                        c504880Jr4MR10.LLILZLL = i;
                    }
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
            }
            C504880Jr4 c504880Jr4MR11 = MR();
            if (c504880Jr4MR11 != null) {
                Bundle arguments6 = getArguments();
                if (arguments6 != null && (boolLIZ = C512300K7g.LIZ(arguments6, "hide_banner", Boolean.FALSE)) != null) {
                    zBooleanValue = boolLIZ.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                c504880Jr4MR11.LLJJIJIL = zBooleanValue;
            }
        }
        C504880Jr4 c504880Jr4MR12 = MR();
        if (c504880Jr4MR12 != null) {
            C504880Jr4 c504880Jr4MR13 = MR();
            if (c504880Jr4MR13 != null) {
                str = c504880Jr4MR13.LLJIJIL;
            } else {
                str = null;
            }
            C504880Jr4 c504880Jr4MR14 = MR();
            if (c504880Jr4MR14 != null && (user2 = c504880Jr4MR14.LLJ) != null) {
                secUid = user2.getSecUid();
            } else {
                secUid = null;
            }
            c504880Jr4MR12.LLJJIII = Intrinsics.LJFF(str, secUid);
        }
        C504880Jr4 c504880Jr4MR15 = MR();
        if (c504880Jr4MR15 != null) {
            c504880Jr4MR15.LL = this.LLIZ;
        }
        C504880Jr4 c504880Jr4MR16 = MR();
        if (c504880Jr4MR16 != null) {
            c504880Jr4MR16.LLJILJIL = true;
        }
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        SubSpaceDetailVM subSpaceDetailVM = (SubSpaceDetailVM) assemVMLazy.getValue();
        subSpaceDetailVM.LL = C1558360qeg.LJFF(this, null);
        subSpaceDetailVM.LLILZ = new C504760Jqs(subSpaceDetailVM, subSpaceDetailVM.vQ2());
        if (MR() != null) {
            getContext();
        }
        if (!((SubSpaceDetailVM) this.LL.getValue()).zQ2()) {
            SubSpaceSecureManager.LIZ(this);
        }
        C723850SaN.LIZ(this, false, null, new C505370Jrr(this), 3);
        View view2 = getView();
        if (view2 != null && (viewFindViewById = view2.findViewById(R.id.wg0)) != null) {
            C723850SaN.LIZ(this, false, null, new C505390Jrt(this, viewFindViewById), 3);
        }
        C504880Jr4 c504880Jr4MR17 = MR();
        if (c504880Jr4MR17 != null) {
            c504880Jr4MR17.LLILLJJLI = (DataChannel) this.LLILZLL.getValue();
        }
        C723850SaN.LIZ(this, false, null, new C505350Jrp(this), 3);
    }
}
