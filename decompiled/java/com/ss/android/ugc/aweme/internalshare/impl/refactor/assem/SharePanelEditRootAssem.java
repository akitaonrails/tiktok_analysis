package com.ss.android.ugc.aweme.internalshare.impl.refactor.assem;

import X.C019F;
import X.C0I1X;
import X.C0I1Y;
import X.C0I7E;
import X.C1362270lYP;
import X.C1368890lj5;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C286280BJy;
import X.C418440Gaw;
import X.C443160HZi;
import X.C459740I1c;
import X.C462900IDg;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC459810I1j;
import X.InterfaceC494301wD;
import Y.ATListenerS0S0110001_4;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.vm.ShareContactListViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.utils.KeyBoardMonitor;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS57S1000000_6;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SharePanelEditRootAssem extends UIContentAssem implements IKeyboardAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C1362270lYP.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJ;
    public C0I7E LLJI;
    public RemoteImageView LLJIJIL;
    public FrameLayout LLJILJIL;
    public C0I1X LLJILJILJ;
    public View LLJILLL;
    public MentionEditDelegate LLJJ;
    public final C459740I1c LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SharePanelEditRootAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/internalshare/impl/refactor/vm/ShareContactListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0I1c] */
    public SharePanelEditRootAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ShareContactListViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 437), AFwS236S0000000_6.get$arr$(205), null, true);
        this.LLJJI = new C0I1Y() { // from class: X.0I1c
            @Override // X.C0I1Y
            public final void LIZ(int i, String str, Map map) {
                C1364620lcC c1364620lcC = C1364620lcC.LIZ;
                SharePackage sharePackageGo = this.LIZ.Go();
                InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
                c1364620lcC.getClass();
                C1364620lcC.LJIIIIZZ(sharePackageGo, i, str, false, map, interfaceC1493505szLIZIZ);
            }
        };
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1243879443) {
            return null;
        }
        return this;
    }

    public final SharePackage Go() {
        C1362270lYP c1362270lYP = (C1362270lYP) this.LLIZLLLIL.getValue();
        if (c1362270lYP != null) {
            return c1362270lYP.LL;
        }
        return null;
    }

    public final ShareContactListViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (ShareContactListViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.IKeyboardAbility
    public final void LJLZ() {
        C0I7E c0i7e = this.LLJI;
        if (c0i7e != null) {
            KeyboardUtils.LIZIZ(c0i7e);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() throws IllegalAccessException {
        super.onDestroy();
        if (C286280BJy.LIZ()) {
            C1558520qew.LJIIJ(this, OperationAssemScope.class, IShareMentionEditAbility.class, null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String string;
        String strLIZ;
        String string2;
        C0I7E c0i7e;
        Bundle bundle;
        Bundle bundle2;
        super.onViewCreated(view);
        this.LLJI = (C0I7E) view.findViewById(R.id.opr);
        this.LLJIJIL = (RemoteImageView) view.findViewById(R.id.opq);
        this.LLJILJIL = (FrameLayout) view.findViewById(R.id.v03);
        RemoteImageView remoteImageView = this.LLJIJIL;
        if (remoteImageView != null) {
            remoteImageView.setCornerRadius(C418440Gaw.LIZIZ(4));
        }
        SharePackage sharePackageGo = Go();
        if (sharePackageGo != null && (bundle2 = sharePackageGo.extras) != null) {
            string = bundle2.getString("default_edit_text_hint");
        } else {
            string = null;
        }
        if (string != null && string.length() != 0) {
            C0I7E c0i7e2 = this.LLJI;
            if (c0i7e2 != null) {
                c0i7e2.setHint(string);
            }
        } else {
            C0I7E c0i7e3 = this.LLJI;
            if (c0i7e3 != null && (strLIZ = C1368890lj5.LIZ(2131836175)) != null) {
                c0i7e3.setHint(strLIZ);
            }
        }
        SharePackage sharePackageGo2 = Go();
        if (sharePackageGo2 == null || (bundle = sharePackageGo2.extras) == null || (string2 = bundle.getString("default_edit_text_msg")) == null) {
            string2 = "";
        }
        if (string2.length() > 0) {
            C0I7E c0i7e4 = this.LLJI;
            if (c0i7e4 != null) {
                c0i7e4.setText(string2);
            }
            Ho().setState(new AwS57S1000000_6(string2, 9));
        }
        C0I7E c0i7e5 = this.LLJI;
        if (c0i7e5 != null) {
            c0i7e5.setOnTouchListener(new ATListenerS0S0110001_4(0));
        }
        if (C286280BJy.LIZ() && (c0i7e = this.LLJI) != null) {
            final MentionEditDelegate mentionEditDelegate = new MentionEditDelegate(c0i7e, Ho());
            this.LLJJ = mentionEditDelegate;
            C1558520qew.LJI(this, OperationAssemScope.class, mentionEditDelegate, IShareMentionEditAbility.class, null, null);
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI != null) {
                C443160HZi c443160HZi = C443160HZi.LIZ;
                C0I7E c0i7e6 = mentionEditDelegate.LL;
                InterfaceC459810I1j interfaceC459810I1j = new InterfaceC459810I1j() { // from class: X.0I1G
                    @Override // X.InterfaceC459810I1j
                    public final void V3() {
                        mentionEditDelegate.LLILLJJLI.wQ2(new C0I1B(true));
                    }

                    @Override // X.InterfaceC459810I1j
                    public final void ub() {
                        mentionEditDelegate.LLILLJJLI.wQ2(new C0I1B(false));
                    }
                };
                c443160HZi.getClass();
                new KeyBoardMonitor(fragmentLJI).LIZ(c0i7e6, interfaceC459810I1j);
            }
        }
        C0I7E c0i7e7 = this.LLJI;
        if (c0i7e7 != null) {
            c0i7e7.addTextChangedListener(new C462900IDg(this, 6));
            MentionEditDelegate mentionEditDelegate2 = this.LLJJ;
            if (mentionEditDelegate2 != null) {
                mentionEditDelegate2.LL.addTextChangedListener((C462900IDg) mentionEditDelegate2.LLILLL.getValue());
            }
        }
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.06VJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1362190lYH) obj).LLILLL;
            }
        }, null, new AwS620S0100000_6(this, 115), 6);
    }
}
