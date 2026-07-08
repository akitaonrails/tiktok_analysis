package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.activity.assem;

import X.C03IJ;
import X.C09JN;
import X.C0HTI;
import X.C0J1N;
import X.C0UO0;
import X.C11NZ;
import X.C11RD;
import X.C12958055g;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C16FZ;
import X.C1701940uOG;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C480460Ism;
import X.C497740JfY;
import X.C500260Jjc;
import X.C507900Jvw;
import X.C507910Jvx;
import X.C507990Jw5;
import X.C508020Jw8;
import X.C510380Jzw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC510330Jzr;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.activity.cell.SubSpaceActivityItemCell;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.activity.viewmodel.SubSpaceActivityListViewModel;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.model.repository.SubOnlySpaceApi;
import com.bytedance.android.livesdk.comp.impl.subscription.commonui.fragmentcontainer.IFragmentContainerAbility;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpaceActivityContentAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final AssemVMLazy LLJJI;
    public C1749280vcc LLJJIII;
    public C16FZ LLJJIJI;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJIJIIJIL;
    public int LLJJIJIL;
    public boolean LLJJJ;
    public C507990Jw5 LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubSpaceActivityContentAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subspace/activity/viewmodel/SubSpaceActivityListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SubSpaceActivityContentAssem() {
        C03IJ c03ij = C03IJ.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceActivityListViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c03ij, C1637806bA.LIZ, new C12958055g(c19719912DlLIZ), new C508020Jw8(), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.ho8;
    }

    public final C507990Jw5 hp() {
        if (this.LLJJJIL == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C507990Jw5.class, null);
            this.LLJJJIL = interfaceC1555100qZQLIZIZ != null ? (C507990Jw5) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJJIL;
    }

    public final SubSpaceActivityListViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (SubSpaceActivityListViewModel) assemVMLazy.getValue();
    }

    public final void lp() {
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.n7;
        Context context = getContext();
        if (context == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        Drawable drawableLIZ = c0hti.LIZ(context);
        c1722300uv6.LIZJ = 0;
        c1722300uv6.LIZ = drawableLIZ;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(130));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96));
        c1722300uv6.LIZLLL = iLIZIZ;
        c1722300uv6.LJ = iLIZIZ2;
        c1722300uv6.LJI = C497740JfY.LJIJI(2131849257);
        c1722300uv6.LJIIIIZZ = C497740JfY.LJIJI(2131849258);
        C1749280vcc c1749280vcc = this.LLJJIII;
        if (c1749280vcc != null) {
            c1749280vcc.setStatus(c1722300uv6);
        }
        C1749280vcc c1749280vcc2 = this.LLJJIII;
        if (c1749280vcc2 != null) {
            C500260Jjc.LLFFF(c1749280vcc2);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        Bundle arguments;
        String string;
        C0J1N c0j1n;
        String str;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        Fragment fragmentLJI;
        Bundle arguments2;
        C1554960qZC.LIZ(C1558520qew.LJIIL(this), new C507990Jw5(), C507990Jw5.class, "source_default_key");
        ip().LL = C1558520qew.LJIIL(this);
        C507990Jw5 c507990Jw5Hp = hp();
        String str2 = "";
        C507990Jw5 c507990Jw5 = null;
        if (c507990Jw5Hp != null && (fragmentLJI = C724240Sb0.LJI(this)) != null && (arguments2 = fragmentLJI.getArguments()) != null) {
            String string2 = arguments2.getString("back_url");
            if (string2 == null) {
                string2 = "";
            }
            c507990Jw5Hp.LL = string2;
            String string3 = arguments2.getString("enter_from");
            if (string3 == null) {
                string3 = "";
            }
            c507990Jw5Hp.LLILLJJLI = string3;
            String string4 = arguments2.getString("sec_anchor_id");
            if (string4 == null) {
                string4 = "";
            }
            c507990Jw5Hp.LLILLL = string4;
            arguments2.getInt("is_fullscreen");
            c507990Jw5Hp.LLILZ = Intrinsics.LJFF(c507990Jw5Hp.LLILLL, UserService.getInstance().user().getCurrentUser().getSecUid());
        }
        final SubSpaceActivityListViewModel subSpaceActivityListViewModelIp = ip();
        C480460Ism.LIZ().getClass();
        SubOnlySpaceApi subOnlySpaceApi = (SubOnlySpaceApi) C480460Ism.LIZLLL(SubOnlySpaceApi.class);
        if (subSpaceActivityListViewModelIp.LLILLJJLI == null) {
            InterfaceC665370Q7z interfaceC665370Q7z = subSpaceActivityListViewModelIp.LL;
            if (interfaceC665370Q7z != null && (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", C507990Jw5.class, null)) != null) {
                c507990Jw5 = (C507990Jw5) interfaceC1555100qZQLIZIZ.getSource();
            }
            subSpaceActivityListViewModelIp.LLILLJJLI = c507990Jw5;
        }
        C507990Jw5 c507990Jw52 = subSpaceActivityListViewModelIp.LLILLJJLI;
        if (c507990Jw52 != null && (str = c507990Jw52.LLILLL) != null) {
            str2 = str;
        }
        C11NZ c11nzLJIILJJIL = C510380Jzw.LJIILJJIL(subOnlySpaceApi.getSubSpaceActivityList(str2).LJIILIIL(new C0UO0()), EnumC510330Jzr.GENERAL, "SubSpaceActivityListViewModel", "/webcast/sub/space/activity/list/", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353));
        if (c11nzLJIILJJIL != null && (c0j1n = (C0J1N) c11nzLJIILJJIL.LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(subSpaceActivityListViewModelIp))) != null) {
            c0j1n.LIZ(new C09JN() { // from class: X.0Jw0
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("SubSpaceActivityListViewModel@6a1d.fetchActivityList$1");
                    subSpaceActivityListViewModelIp.setState(new C507960Jw2((C470590Icr) obj));
                    C1C7U.LIZIZ("SubSpaceActivityListViewModel@6a1d.fetchActivityList$1");
                }
            }, new C09JN() { // from class: X.0Jw1
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("SubSpaceActivityListViewModel@6a1d.fetchActivityList$2");
                    subSpaceActivityListViewModelIp.setState(new C507980Jw4((Throwable) obj));
                    C1C7U.LIZIZ("SubSpaceActivityListViewModel@6a1d.fetchActivityList$2");
                }
            });
        }
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        this.LLJJJ = (fragmentLJI2 == null || (arguments = fragmentLJI2.getArguments()) == null || (string = arguments.getString("is_super_fans")) == null) ? false : Boolean.parseBoolean(string);
        super.onCreate();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void kp(java.lang.String r6) {
        /*
            r5 = this;
            X.0Jw5 r0 = r5.hp()
            r2 = 0
            if (r0 == 0) goto L65
            boolean r1 = r0.LLILZ
            r0 = 1
            if (r1 != r0) goto L65
        Lc:
            java.lang.String r4 = ""
            if (r0 == 0) goto L28
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r0 = r0.user()
            if (r0 == 0) goto L28
            long r0 = r0.getCurrentUserId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = r0.toString()
            if (r1 != 0) goto L29
        L28:
            r1 = r4
        L29:
            X.0Jw5 r0 = r5.hp()
            if (r0 == 0) goto L31
            boolean r2 = r0.LLILZ
        L31:
            X.0Jw5 r0 = r5.hp()
            if (r0 == 0) goto L3c
            java.lang.String r0 = r0.LLILLJJLI
            if (r0 == 0) goto L3c
            r4 = r0
        L3c:
            int r3 = r5.LLJJIJIL
            if (r2 == 0) goto L62
            java.lang.String r0 = "livesdk_anchor_subscription_space_activity_page"
        L42:
            X.0IjA r2 = X.C0IJT.LIZ(r0)
            java.lang.String r0 = "action_type"
            r2.LJJII(r6, r0)
            java.lang.String r0 = "anchor_id"
            r2.LJJII(r1, r0)
            java.lang.String r0 = "space_show_entrance"
            r2.LJJII(r4, r0)
            java.lang.String r1 = "message_count"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.LJJII(r0, r1)
            r2.LIZ()
            return
        L62:
            java.lang.String r0 = "livesdk_subscription_onboarding_activity_page"
            goto L42
        L65:
            r0 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.activity.assem.SubSpaceActivityContentAssem.kp(java.lang.String):void");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.a5u);
        this.LLJJIJIIJIL = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(SubSpaceActivityItemCell.class);
        }
        this.LLJJIII = (C1749280vcc) view.findViewById(R.id.hb0);
        this.LLJJIJI = (C16FZ) view.findViewById(R.id.nnp);
        View viewFindViewById = view.findViewById(R.id.ct3);
        if (viewFindViewById != null) {
            C500260Jjc.LJIILIIL(viewFindViewById);
        }
        TextView textView = (TextView) view.findViewById(R.id.title);
        if (textView != null) {
            textView.setText(C497740JfY.LJIJI(2131849259));
        }
        LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.bn2);
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new View.OnClickListener() { // from class: X.0Jvz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    IFragmentContainerAbility iFragmentContainerAbility;
                    Fragment fragmentLJI = C724240Sb0.LJI(this.LL);
                    String str = null;
                    if (fragmentLJI != null && (iFragmentContainerAbility = (IFragmentContainerAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), IFragmentContainerAbility.class, null)) != null) {
                        iFragmentContainerAbility.ow();
                    }
                    IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
                    Context context = this.LL.getContext();
                    C507990Jw5 c507990Jw5Hp = this.LL.hp();
                    if (c507990Jw5Hp != null) {
                        str = c507990Jw5Hp.LL;
                    }
                    iActionHandlerService.handle(context, str);
                }
            });
        }
        C16FZ c16fz = this.LLJJIJI;
        if (c16fz != null) {
            C500260Jjc.LLFFF(c16fz);
        }
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0Jw6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C507970Jw3) obj).LL;
            }
        }, null, new C507900Jvw(this), 6);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0Jw7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C507970Jw3) obj).LLILLJJLI;
            }
        }, null, new C507910Jvx(this), 6);
    }
}
