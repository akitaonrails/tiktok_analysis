package com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.activity.assem;

import X.C03IJ;
import X.C0HTI;
import X.C0JCK;
import X.C0K0R;
import X.C0K2A;
import X.C0K4J;
import X.C0TCF;
import X.C0UJ2;
import X.C11NZ;
import X.C1390410mHn;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C1701940uOG;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C511520K4g;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC499440JiI;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC511350K3p;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS142S0100000_7;
import Y.AfS176S0100000_7;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.activity.cell.SubSpaceActivityItemCell;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.activity.viewmodel.SubSpaceActivityListViewModel;
import com.ss.android.ugc.aweme.subscription.pgc.data.network.DataResponse;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS621S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.pgc_sub.PGCSpaceActivityListResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpaceActivityContentAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public final AssemVMLazy LLJJI;
    public C1749280vcc LLJJIII;
    public C1390410mHn LLJJIJI;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJIJIIJIL;
    public int LLJJIJIL;
    public C0K2A LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubSpaceActivityContentAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/subscription/pgc/business/perks/subspace/activity/viewmodel/SubSpaceActivityListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SubSpaceActivityContentAssem() {
        C03IJ c03ij = C03IJ.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceActivityListViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c03ij, C1637806bA.LIZ, new AwS551S0100000_7(c19719912DlLIZ, 461), AFwS237S0000000_7.get$arr$(212), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fh3;
    }

    public final C0K2A hp() {
        if (this.LLJJJ == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C0K2A.class, null);
            this.LLJJJ = interfaceC1555100qZQLIZIZ != null ? (C0K2A) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJJ;
    }

    public final SubSpaceActivityListViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
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
        String strLJII = C511520K4g.LJII(2131849257);
        if (strLJII == null) {
            strLJII = "";
        }
        c1722300uv6.LJI = strLJII;
        String strLJII2 = C511520K4g.LJII(2131849258);
        c1722300uv6.LJIIIIZZ = strLJII2 != null ? strLJII2 : "";
        C1749280vcc c1749280vcc = this.LLJJIII;
        if (c1749280vcc != null) {
            c1749280vcc.setStatus(c1722300uv6);
        }
        C1749280vcc c1749280vcc2 = this.LLJJIII;
        if (c1749280vcc2 != null) {
            C0K0R.LIZJ(c1749280vcc2);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        C11NZ c11nz;
        String str;
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        Fragment fragmentLJI;
        Bundle arguments;
        User currentUser;
        C1554960qZC.LIZ(C1558520qew.LJIIL(this), new C0K2A(), C0K2A.class, "source_default_key");
        ip().LL = C1558520qew.LJIIL(this);
        C0K2A c0k2aHp = hp();
        String str2 = "";
        C0K2A c0k2a = null;
        if (c0k2aHp != null && (fragmentLJI = C724240Sb0.LJI(this)) != null && (arguments = fragmentLJI.getArguments()) != null) {
            String string = arguments.getString("back_url");
            if (string == null) {
                string = "";
            }
            c0k2aHp.LL = string;
            String string2 = arguments.getString("enter_from");
            if (string2 == null) {
                string2 = "";
            }
            c0k2aHp.LLILLJJLI = string2;
            String string3 = arguments.getString("sec_anchor_id");
            if (string3 == null) {
                string3 = "";
            }
            c0k2aHp.LLILLL = string3;
            arguments.getInt("is_fullscreen");
            String str3 = c0k2aHp.LLILLL;
            IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
            c0k2aHp.LLILZ = Intrinsics.LJFF(str3, (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null) ? null : currentUser.getSecUid());
        }
        SubSpaceActivityListViewModel subSpaceActivityListViewModelIp = ip();
        InterfaceC511350K3p interfaceC511350K3pLIZ = C0K4J.LIZ();
        if (subSpaceActivityListViewModelIp.LLILLJJLI == null) {
            InterfaceC665370Q7z interfaceC665370Q7z = subSpaceActivityListViewModelIp.LL;
            if (interfaceC665370Q7z != null && (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", C0K2A.class, null)) != null) {
                c0k2a = (C0K2A) interfaceC1555100qZQLIZIZ.getSource();
            }
            subSpaceActivityListViewModelIp.LLILLJJLI = c0k2a;
        }
        C0K2A c0k2a2 = subSpaceActivityListViewModelIp.LLILLJJLI;
        if (c0k2a2 != null && (str = c0k2a2.LLILLL) != null) {
            str2 = str;
        }
        C11NZ<DataResponse<PGCSpaceActivityListResponse.ResponseData>> subSpaceActivityList = interfaceC511350K3pLIZ.getSubSpaceActivityList(str2);
        if (subSpaceActivityList != null && (c11nz = (C11NZ) C0JCK.LIZ(subSpaceActivityList.LJIILIIL(new C0UJ2()), EnumC499440JiI.GENERAL, "SubSpaceActivityListViewModel", "/webcast/sub/space/activity/list/", null, 8).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(new C0TCF(subSpaceActivityListViewModelIp))) != null) {
            c11nz.LJJLL(new AfS176S0100000_7(subSpaceActivityListViewModelIp, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), new AfS176S0100000_7(subSpaceActivityListViewModelIp, 301));
        }
        super.onCreate();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void kp(java.lang.String r7) {
        /*
            r6 = this;
            X.0K2A r0 = r6.hp()
            r2 = 0
            if (r0 == 0) goto L67
            boolean r1 = r0.LLILZ
            r0 = 1
            if (r1 != r0) goto L67
        Lc:
            java.lang.String r5 = ""
            if (r0 == 0) goto L24
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IUserService> r0 = com.ss.android.ugc.aweme.framework.services.IUserService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.framework.services.IUserService r0 = (com.ss.android.ugc.aweme.framework.services.IUserService) r0
            if (r0 == 0) goto L24
            java.lang.String r4 = r0.getCurrentUserID()
            if (r4 != 0) goto L25
        L24:
            r4 = r5
        L25:
            X.0K26 r1 = X.C0K26.LIZ
            X.0K2A r0 = r6.hp()
            if (r0 == 0) goto L2f
            boolean r2 = r0.LLILZ
        L2f:
            X.0K2A r0 = r6.hp()
            if (r0 == 0) goto L3a
            java.lang.String r0 = r0.LLILLJJLI
            if (r0 == 0) goto L3a
            r5 = r0
        L3a:
            int r3 = r6.LLJJIJIL
            r1.getClass()
            if (r2 == 0) goto L64
            java.lang.String r0 = "livesdk_anchor_subscription_space_activity_page"
        L43:
            X.0K5z r2 = new X.0K5z
            r2.<init>(r0)
            java.lang.String r0 = "action_type"
            r2.LIZIZ(r7, r0)
            java.lang.String r0 = "anchor_id"
            r2.LIZIZ(r4, r0)
            java.lang.String r0 = "space_show_entrance"
            r2.LIZIZ(r5, r0)
            java.lang.String r1 = "message_count"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.LIZIZ(r0, r1)
            r2.LIZLLL()
            return
        L64:
            java.lang.String r0 = "livesdk_subscription_onboarding_activity_page"
            goto L43
        L67:
            r0 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.activity.assem.SubSpaceActivityContentAssem.kp(java.lang.String):void");
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
        this.LLJJIJI = (C1390410mHn) view.findViewById(R.id.nnp);
        View viewFindViewById = view.findViewById(R.id.ct3);
        if (viewFindViewById != null) {
            C0K0R.LIZ(viewFindViewById);
        }
        TextView textView = (TextView) view.findViewById(R.id.title);
        if (textView != null) {
            String strLJII = C511520K4g.LJII(2131849259);
            if (strLJII == null) {
                strLJII = "";
            }
            textView.setText(strLJII);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.bn2);
        if (imageView != null) {
            C786410Ut5.Q7(imageView, new ACListenerS142S0100000_7(this, 150));
        }
        C1390410mHn c1390410mHn = this.LLJJIJI;
        if (c1390410mHn != null) {
            C0K0R.LIZJ(c1390410mHn);
            c1390410mHn.LIZJ();
        }
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0K28
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0K27) obj).LL;
            }
        }, null, new AwS621S0100000_7(this, 111), 6);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0K29
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0K27) obj).LLILLJJLI;
            }
        }, null, new AwS621S0100000_7(this, 112), 6);
    }
}
