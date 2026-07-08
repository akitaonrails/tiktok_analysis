package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.fragment;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C0JM7;
import X.C0JM9;
import X.C0JMB;
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
import X.C497740JfY;
import X.C500260Jjc;
import X.C504760Jqs;
import X.C504880Jr4;
import X.C505140JrU;
import X.C505150JrV;
import X.C505160JrW;
import X.C505290Jrj;
import X.C505310Jrl;
import X.C505330Jrn;
import X.C505480Js2;
import X.C512300K7g;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC2262081DgM;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
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
public final class NewSubSpaceDetailSheetDialogFragment extends LiveSheetFragment {
    public static final C0JM7 LLLFZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLI;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZzwmKjYvOyYjPCwjJ2ExPTYlJyogO2s8LD04O2HELIOSs/PC0gOCQvLGE3LTEtICN9PiwpPmE1OiQrJCo9PGsCLDgAPScfOS4wLQEpPS46JBYkLConDCwtJSA0DjctLiI2JjE=";
    public final AssemVMLazy LLJLLL;
    public C504880Jr4 LLJZ;
    public User LLJZIJLIL;
    public SpacePost LLL;
    public boolean LLLF;
    public final C01GW LLLFF;
    public String LLLFFI;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0JM7] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(NewSubSpaceDetailSheetDialogFragment.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subspace/detail/vm/SubSpaceDetailVM;", 0);
        C13LE.LIZ.getClass();
        LLLI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLFZ = new Object() { // from class: X.0JM7
        };
    }

    public NewSubSpaceDetailSheetDialogFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceDetailVM.class);
        C0JM9 c0jm9 = new C0JM9(c19719912DlLIZ);
        C505480Js2 c505480Js2 = new C505480Js2();
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0jm9, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new C505140JrU(this), c505480Js2, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0jm9, new C505150JrV(this), c505480Js2, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0jm9, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C505160JrW(this), c505480Js2, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJLLL = assemVMLazy;
        this.LLLFF = C452501pT.LIZIZ(new C0JMB(this));
        this.LLLFFI = "";
    }

    public final C504880Jr4 uS() {
        if (this.LLJZ == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", C504880Jr4.class, null);
            this.LLJZ = interfaceC1555100qZQLIZIZ != null ? (C504880Jr4) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJZ;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(1, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(12.0f);
        sheetOptions.draggable = false;
        sheetOptions.dimBehindType = 2;
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean zBooleanValue;
        Boolean boolLIZ;
        if (!this.LLLF) {
            Bundle arguments = getArguments();
            if (arguments != null && (boolLIZ = C512300K7g.LIZ(arguments, "is_super_fans", null)) != null) {
                zBooleanValue = boolLIZ.booleanValue();
            } else {
                zBooleanValue = false;
            }
            this.LLLF = zBooleanValue;
        }
        super.onCreate(bundle);
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), new C504880Jr4(), C504880Jr4.class, "source_default_key");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
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
        if (this.LLL != null && this.LLJZIJLIL != null) {
            C504880Jr4 c504880Jr4US = uS();
            if (c504880Jr4US != null) {
                InterfaceC2262081DgM currentUser = UserService.getInstance().user().getCurrentUser();
                if (currentUser instanceof User) {
                    user3 = (User) currentUser;
                } else {
                    user3 = null;
                }
                c504880Jr4US.LLJ = user3;
            }
            C504880Jr4 c504880Jr4US2 = uS();
            if (c504880Jr4US2 != null) {
                c504880Jr4US2.LLJI = this.LLJZIJLIL;
            }
            C504880Jr4 c504880Jr4US3 = uS();
            if (c504880Jr4US3 != null) {
                User user4 = this.LLJZIJLIL;
                if (user4 != null) {
                    secUid2 = user4.getSecUid();
                } else {
                    secUid2 = null;
                }
                c504880Jr4US3.LLJIJIL = secUid2;
            }
            C504880Jr4 c504880Jr4US4 = uS();
            if (c504880Jr4US4 != null) {
                SpacePost spacePost = this.LLL;
                if (spacePost != null) {
                    j2 = spacePost.postId;
                }
                c504880Jr4US4.LLILZ = j2;
            }
            C504880Jr4 c504880Jr4US5 = uS();
            if (c504880Jr4US5 != null) {
                c504880Jr4US5.LLILLL = this.LLL;
            }
        } else {
            C504880Jr4 c504880Jr4US6 = uS();
            String str2 = "";
            if (c504880Jr4US6 != null) {
                Bundle arguments = getArguments();
                if (arguments == null || (string5 = arguments.getString("sec_anchor_id")) == null) {
                    string5 = "";
                }
                c504880Jr4US6.LLJIJIL = string5;
            }
            C504880Jr4 c504880Jr4US7 = uS();
            if (c504880Jr4US7 != null) {
                InterfaceC2262081DgM currentUser2 = UserService.getInstance().user().getCurrentUser();
                if (currentUser2 instanceof User) {
                    user = (User) currentUser2;
                } else {
                    user = null;
                }
                c504880Jr4US7.LLJ = user;
            }
            if (this.LLLFFI.length() == 0) {
                Bundle arguments2 = getArguments();
                if (arguments2 != null && (string4 = arguments2.getString("enter_from")) != null) {
                    str2 = string4;
                }
                this.LLLFFI = str2;
            }
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                string = arguments3.getString("post_id");
            } else {
                string = null;
            }
            if (C500260Jjc.LJJIIZ(string)) {
                try {
                    C504880Jr4 c504880Jr4US8 = uS();
                    if (c504880Jr4US8 != null) {
                        if (string == null) {
                            j = 0;
                        } else {
                            j = CastLongProtector.parseLong(string);
                        }
                        c504880Jr4US8.LLILZ = j;
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
                    C504880Jr4 c504880Jr4US9 = uS();
                    if (c504880Jr4US9 != null) {
                        if (string2 != null) {
                            j2 = CastLongProtector.parseLong(string2);
                        }
                        c504880Jr4US9.LLILZIL = j2;
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
                    C504880Jr4 c504880Jr4US10 = uS();
                    if (c504880Jr4US10 != null) {
                        if (string3 == null) {
                            i = 0;
                        } else {
                            i = CastIntegerProtector.parseInt(string3);
                        }
                        c504880Jr4US10.LLILZLL = i;
                    }
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
            }
            C504880Jr4 c504880Jr4US11 = uS();
            if (c504880Jr4US11 != null) {
                Bundle arguments6 = getArguments();
                if (arguments6 != null && (boolLIZ = C512300K7g.LIZ(arguments6, "hide_banner", Boolean.FALSE)) != null) {
                    zBooleanValue = boolLIZ.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                c504880Jr4US11.LLJJIJIL = zBooleanValue;
            }
        }
        C504880Jr4 c504880Jr4US12 = uS();
        if (c504880Jr4US12 != null) {
            C504880Jr4 c504880Jr4US13 = uS();
            if (c504880Jr4US13 != null) {
                str = c504880Jr4US13.LLJIJIL;
            } else {
                str = null;
            }
            C504880Jr4 c504880Jr4US14 = uS();
            if (c504880Jr4US14 != null && (user2 = c504880Jr4US14.LLJ) != null) {
                secUid = user2.getSecUid();
            } else {
                secUid = null;
            }
            c504880Jr4US12.LLJJIII = Intrinsics.LJFF(str, secUid);
        }
        C504880Jr4 c504880Jr4US15 = uS();
        if (c504880Jr4US15 != null) {
            c504880Jr4US15.LL = this.LLLFFI;
        }
        C504880Jr4 c504880Jr4US16 = uS();
        if (c504880Jr4US16 != null) {
            c504880Jr4US16.LLJILJIL = true;
        }
        AssemVMLazy assemVMLazy = this.LLJLLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLI;
        SubSpaceDetailVM subSpaceDetailVM = (SubSpaceDetailVM) assemVMLazy.getValue();
        subSpaceDetailVM.LL = C1558360qeg.LJFF(this, null);
        subSpaceDetailVM.LLILZ = new C504760Jqs(subSpaceDetailVM, subSpaceDetailVM.vQ2());
        if (uS() != null) {
            getContext();
        }
        if (!((SubSpaceDetailVM) this.LLJLLL.getValue()).zQ2()) {
            SubSpaceSecureManager.LIZ(this);
        }
        C723850SaN.LIZ(this, false, null, new C505310Jrl(this), 3);
        View view2 = getView();
        if (view2 != null && (viewFindViewById = view2.findViewById(R.id.wg0)) != null) {
            C723850SaN.LIZ(this, false, null, new C505330Jrn(this, viewFindViewById), 3);
        }
        C504880Jr4 c504880Jr4US17 = uS();
        if (c504880Jr4US17 != null) {
            c504880Jr4US17.LLILLJJLI = (DataChannel) this.LLLFF.getValue();
        }
        C723850SaN.LIZ(this, false, null, new C505290Jrj(this), 3);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.glm, viewGroup, false);
    }
}
