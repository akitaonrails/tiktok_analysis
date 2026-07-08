package com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox;

import X.C019F;
import X.C0OLV;
import X.C0OPQ;
import X.C0OSF;
import X.C0OSG;
import X.C0OWE;
import X.C0OWM;
import X.C13BV;
import X.C13LE;
import X.C13LQ;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C619990OTl;
import X.C620650OVz;
import X.C623320Occ;
import X.C623360Ocg;
import X.C687700QyG;
import X.C723580SZw;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C814420VxA;
import X.EnumC617880OLi;
import X.EnumC619890OTb;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC617820OLc;
import X.InterfaceC623330Ocd;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditFragmentScope;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinInputStateViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinAnimationCoordinatorAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinFullScreenGamePlayAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinInputTopicAbility;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinItemEditPageConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinInputTopicAssem extends UISlotAssem implements BulletinInputTopicAbility, InterfaceC623330Ocd, InterfaceC1554640qYg, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, C0OLV.class, "bulletin_board_param"), checkSupervisorPrepared());
    public final EnumC619890OTb LLJJIII = EnumC619890OTb.TOPIC_CONTAINER;
    public final AssemVMLazy LLJJIJI;
    public Drawable LLJJIJIIJIL;
    public Drawable LLJJIJIL;
    public float LLJJJ;
    public int LLJJJIL;
    public boolean LLJJJJ;
    public LinearLayout LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinInputTopicAssem.class, "inputStateVm", "getInputStateVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinInputStateViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BulletinInputTopicAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinInputStateViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 614), AFwS240S0000000_9.get$arr$(245), null, true);
        this.LLJJJIL = -2;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a6a;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BulletinEditFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BulletinEditFragmentScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 813564617) {
            return null;
        }
        return this;
    }

    public final Drawable hp() {
        BulletinItemEditPageConfig bulletinItemEditPageConfigNb2;
        String str;
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        C0OSF c0osf = ((C619990OTl) assemVMLazy.getValue().getState()).LL;
        BulletinFullScreenGamePlayAbility bulletinFullScreenGamePlayAbilityIp = ip();
        boolean z = bulletinFullScreenGamePlayAbilityIp != null && bulletinFullScreenGamePlayAbilityIp.bI();
        if (c0osf != C0OSF.NORMAL || !z) {
            return this.LLJJIJIIJIL;
        }
        BulletinFullScreenGamePlayAbility bulletinFullScreenGamePlayAbilityIp2 = ip();
        if (bulletinFullScreenGamePlayAbilityIp2 == null || (bulletinItemEditPageConfigNb2 = bulletinFullScreenGamePlayAbilityIp2.nb2()) == null || (str = bulletinItemEditPageConfigNb2.statusBarColor) == null || str.length() == 0) {
            return this.LLJJIJIIJIL;
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zo);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(22));
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        c384050F3z.LJ = Integer.valueOf(ColorProtector.parseColor(str));
        Context context = getContext();
        if (context != null) {
            return c384050F3z.LIZ(context);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void zZ1() {
        LinearLayout linearLayout = this.LLJJJJJIL;
        if (linearLayout == null) {
            return;
        }
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        int i = C0OSG.LIZ[((C619990OTl) assemVMLazy.getValue().getState()).LL.ordinal()];
        if (i == 1) {
            BulletinFullScreenGamePlayAbility bulletinFullScreenGamePlayAbilityIp = ip();
            linearLayout.setBackground((bulletinFullScreenGamePlayAbilityIp == null || !bulletinFullScreenGamePlayAbilityIp.bI()) ? this.LLJJIJIL : null);
        } else if (i == 2) {
            linearLayout.setBackground(hp());
        }
    }

    public final BulletinFullScreenGamePlayAbility ip() {
        return (BulletinFullScreenGamePlayAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinFullScreenGamePlayAbility.class, null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        BulletinAnimationCoordinatorAbility bulletinAnimationCoordinatorAbility = (BulletinAnimationCoordinatorAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinAnimationCoordinatorAbility.class, null);
        if (bulletinAnimationCoordinatorAbility != null) {
            bulletinAnimationCoordinatorAbility.iA(this.LLJJIII);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // X.InterfaceC623330Ocd
    public final View dk() {
        return this.LLJJJJJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinInputTopicAbility
    public final void gY0() {
        zZ1();
    }

    @Override // X.InterfaceC623330Ocd
    public final EnumC619890OTb pd() {
        return this.LLJJIII;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinInputTopicAbility
    public final void wY() {
        zZ1();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        LinearLayout linearLayout;
        LinearLayout.LayoutParams layoutParams;
        super.onViewCreated(view);
        ViewGroup.LayoutParams layoutParams2 = null;
        BulletinAnimationCoordinatorAbility bulletinAnimationCoordinatorAbility = (BulletinAnimationCoordinatorAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), BulletinAnimationCoordinatorAbility.class, null);
        if (bulletinAnimationCoordinatorAbility != null) {
            bulletinAnimationCoordinatorAbility.HK2(this);
        }
        C723850SaN.LIZLLL(this, new AwS581S0100000_2(this, 243));
        View viewLJJIJL = LJJIJL();
        if (!(viewLJJIJL instanceof LinearLayout) || (linearLayout = (LinearLayout) viewLJJIJL) == null) {
            linearLayout = (LinearLayout) LJJIJL().findViewById(R.id.yek);
        }
        this.LLJJJJJIL = linearLayout;
        Context context = getContext();
        if (context != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zo);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(22));
            this.LLJJIJIIJIL = c384050F3z.LIZ(context);
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.zo);
            this.LLJJIJIL = c384050F3z2.LIZ(context);
            if (linearLayout != null) {
                linearLayout.setBackground(this.LLJJIJIIJIL);
                C426750GoL.LJIIL(linearLayout, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 16);
                View viewFindViewById = linearLayout.findViewById(R.id.yev);
                if (viewFindViewById != null) {
                    layoutParams2 = viewFindViewById.getLayoutParams();
                }
                if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
                    this.LLJJJ = layoutParams.weight;
                    this.LLJJJIL = layoutParams.height;
                }
            }
            View viewFindViewById2 = linearLayout.findViewById(R.id.ksc);
            AssemVMLazy assemVMLazy = this.LLJJIJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
            C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0OSH
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C619990OTl) obj).LLILLJJLI;
                }
            }, null, new AwS623S0100000_9(viewFindViewById2, 180), 6);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC623330Ocd
    public final List Gl(C0OSF c0osf, C0OWM c0owm) {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC623330Ocd
    public final List eb(C0OSF c0osf, C0OWM c0owm) {
        return kp(c0osf, c0owm);
    }

    public final List<C0OWE> kp(C0OSF c0osf, C0OWM c0owm) {
        C0OWE c0owe;
        C0OWE c0owe2;
        char c;
        C0OWE c0owe3;
        C0OWE c0owe4;
        C0OWE c0owe5;
        char c2;
        C0OWE c0owe6;
        LinearLayout linearLayout = this.LLJJJJJIL;
        if (linearLayout == null) {
            return C13BV.INSTANCE;
        }
        View viewFindViewById = linearLayout.findViewById(R.id.yev);
        View viewFindViewById2 = linearLayout.findViewById(R.id.kqk);
        View viewFindViewById3 = linearLayout.findViewById(R.id.ksc);
        if (C0OSG.LIZ[c0osf.ordinal()] == 1) {
            C0OWE[] c0oweArr = new C0OWE[4];
            c0oweArr[0] = new C0OWE(linearLayout, new C623320Occ(0.0f, -1, 0, null, null, null, new C623360Ocg(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 60));
            if (viewFindViewById != null) {
                c0owe4 = new C0OWE(viewFindViewById, new C623320Occ(1.0f, 0, 0, null, null, null, null, 124));
            } else {
                c0owe4 = null;
            }
            c0oweArr[1] = c0owe4;
            if (viewFindViewById2 != null) {
                c0owe5 = new C0OWE(viewFindViewById2, new C623320Occ(1.0f, -1, 0, null, null, null, null, 124));
            } else {
                c0owe5 = null;
            }
            c0oweArr[2] = c0owe5;
            if (viewFindViewById3 != null) {
                c0owe6 = new C0OWE(viewFindViewById3, new C623320Occ(0.0f, -2, 8, null, null, null, null, 120));
                c2 = 3;
            } else {
                c2 = 3;
                c0owe6 = null;
            }
            c0oweArr[c2] = c0owe6;
            return C13LQ.LJIJI(c0oweArr);
        }
        C0OWE[] c0oweArr2 = new C0OWE[4];
        c0oweArr2[0] = new C0OWE(linearLayout, new C623320Occ(0.0f, -1, 0, null, null, null, new C623360Ocg(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 60));
        if (viewFindViewById != null) {
            c0owe = new C0OWE(viewFindViewById, new C623320Occ(this.LLJJJ, this.LLJJJIL, 0, null, null, null, null, 124));
        } else {
            c0owe = null;
        }
        c0oweArr2[1] = c0owe;
        if (viewFindViewById2 != null) {
            c0owe2 = new C0OWE(viewFindViewById2, new C623320Occ(1.0f, -2, 0, null, null, null, null, 124));
        } else {
            c0owe2 = null;
        }
        c0oweArr2[2] = c0owe2;
        if (viewFindViewById3 != null) {
            c0owe3 = new C0OWE(viewFindViewById3, new C623320Occ(0.0f, -2, 0, null, null, null, null, 120));
            c = 3;
        } else {
            c = 3;
            c0owe3 = null;
        }
        c0oweArr2[c] = c0owe3;
        return C13LQ.LJIJI(c0oweArr2);
    }

    @Override // X.InterfaceC623330Ocd
    public final void D4(C620650OVz c620650OVz, EnumC617880OLi enumC617880OLi, InterfaceC617820OLc interfaceC617820OLc) {
        Drawable drawable;
        String str;
        LinearLayout linearLayout = this.LLJJJJJIL;
        if (linearLayout == null) {
            return;
        }
        if (c620650OVz.LIZLLL == C0OSF.NORMAL && c620650OVz.LJ() && !this.LLJJJJ) {
            C0OPQ c0opq = C0OPQ.LIZ;
            C0OLV c0olv = (C0OLV) this.LLJJI.getValue();
            if (c0olv == null || (str = c0olv.LL) == null) {
                str = "";
            }
            c0opq.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "bulletin_board_page");
            c2344009Gk.LJIIIIZZ("channel_id", str);
            C20684815ws.LJIILLIIL("enter_bulletin_text_input_box", c2344009Gk.LIZ);
            this.LLJJJJ = true;
        }
        if (c620650OVz.LIZJ()) {
            if (C0OSG.LIZIZ[enumC617880OLi.ordinal()] == 1) {
                linearLayout.setBackground(hp());
            }
        } else {
            if (!c620650OVz.LIZ() || C0OSG.LIZIZ[enumC617880OLi.ordinal()] != 1) {
                return;
            }
            BulletinFullScreenGamePlayAbility bulletinFullScreenGamePlayAbilityIp = ip();
            if (bulletinFullScreenGamePlayAbilityIp != null && bulletinFullScreenGamePlayAbilityIp.bI()) {
                drawable = null;
            } else {
                drawable = this.LLJJIJIL;
            }
            linearLayout.setBackground(drawable);
        }
    }
}
