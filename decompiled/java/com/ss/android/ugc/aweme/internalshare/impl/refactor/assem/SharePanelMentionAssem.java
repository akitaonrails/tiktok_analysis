package com.ss.android.ugc.aweme.internalshare.impl.refactor.assem;

import X.C019F;
import X.C01GW;
import X.C0I0B;
import X.C0I12;
import X.C0I15;
import X.C0I16;
import X.C0I18;
import X.C0I19;
import X.C0I1D;
import X.C1308910kAL;
import X.C1362270lYP;
import X.C1388820mFE;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C23250099c;
import X.C418440Gaw;
import X.C452501pT;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C814420VxA;
import X.C830490Whz;
import X.InterfaceC2217461Bqa;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.vm.ShareContactListViewModel;
import com.ss.android.ugc.aweme.mention.IMentionPanelFactory;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class SharePanelMentionAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public final C01GW LLJI;
    public C0I12 LLJIJIL;
    public String LLJILJIL;
    public boolean LLJILJILJ;
    public final C01GW LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SharePanelMentionAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/internalshare/impl/refactor/vm/ShareContactListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SharePanelMentionAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ShareContactListViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 440), AFwS236S0000000_6.get$arr$(206), null, true);
        this.LLJ = new C1559260qg8(new C723580SZw(this, C1362270lYP.class, null), checkSupervisorPrepared());
        this.LLJI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(110));
        this.LLJILLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 439));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final ShareContactListViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (ShareContactListViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    public final synchronized C0I12 Go(String str) {
        Function0<ViewGroup> function0;
        ViewGroup viewGroupInvoke;
        String string;
        C830490Whz c830490WhzLJIIJ;
        SharePackage sharePackage;
        Bundle bundle;
        C0I12 c0i12 = this.LLJIJIL;
        if (c0i12 != null && Intrinsics.LJFF(this.LLJILJIL, str)) {
            return c0i12;
        }
        C1388820mFE c1388820mFELIZ = null;
        if (c0i12 != null && !Intrinsics.LJFF(this.LLJILJIL, str)) {
            c0i12.LJI();
            this.LLJIJIL = null;
            this.LLJILJIL = null;
            this.LLJILJILJ = false;
        }
        C1362270lYP c1362270lYP = (C1362270lYP) this.LLJ.getValue();
        if (c1362270lYP == null || (function0 = c1362270lYP.LLIZ) == null || (viewGroupInvoke = function0.invoke()) == null) {
            return null;
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null) {
            return null;
        }
        IMentionPanelFactory iMentionPanelFactory = (IMentionPanelFactory) this.LLJI.getValue();
        if (iMentionPanelFactory != null) {
            C0I1D c0i1d = (C0I1D) this.LLJILLL.getValue();
            C0I16 c0i16 = new C0I16(C0I18.CONTAINER, false, true, true, true, C1308910kAL.LIZJ(R.attr.a1f, viewGroupInvoke.getContext()), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            Pair[] pairArr = new Pair[2];
            C1362270lYP c1362270lYP2 = (C1362270lYP) this.LLJ.getValue();
            if (c1362270lYP2 == null || (sharePackage = c1362270lYP2.LL) == null || (bundle = sharePackage.extras) == null || (string = bundle.getString("enter_from", "")) == null) {
                string = "";
            }
            pairArr[0] = new Pair("enter_from", string);
            pairArr[1] = new Pair("enter_method", "share_panel_typing");
            Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            IMGroupChatApi iMGroupChatApiLIZ = IMGroupChatApi.LIZIZ.LIZ();
            if (iMGroupChatApiLIZ != null && (c830490WhzLJIIJ = iMGroupChatApiLIZ.LJIIJ(str, C0I0B.LJFF.LIZIZ())) != null) {
                mapLJIIJ.putAll(c830490WhzLJIIJ);
            }
            c1388820mFELIZ = iMentionPanelFactory.LIZ(viewGroupInvoke, fragmentLJI, c0i1d, new C0I15(str, c0i16, mapLJIIJ, null));
        }
        this.LLJIJIL = c1388820mFELIZ;
        this.LLJILJIL = str;
        return c1388820mFELIZ;
    }

    public final void Jo(boolean z) {
        C0I12 c0i12 = this.LLJIJIL;
        if (c0i12 == null || !this.LLJILJILJ) {
            return;
        }
        if (z) {
            c0i12.LJIIIZ(new AwS550S0100000_6(c0i12, 438));
        } else {
            c0i12.LJIIIZ(null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.06VK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1362190lYH) obj).LLILLL;
            }
        }, null, new AwS620S0100000_6(this, 116), 6);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0I19(this, null), 3);
    }
}
