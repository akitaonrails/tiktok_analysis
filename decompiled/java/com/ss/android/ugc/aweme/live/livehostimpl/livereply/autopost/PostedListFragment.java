package com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost;

import X.AbstractC1777760wMY;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1777360wLu;
import X.C1777740wMW;
import X.C1813340xHw;
import X.C1813350xHx;
import X.C1813460xI8;
import X.C1835760xs6;
import X.C197039127h;
import X.C457201qE;
import X.C766270U4b;
import X.C786410Ut5;
import X.EnumC1813200xHi;
import X.InterfaceC1180504jb;
import android.os.Bundle;
import android.view.View;
import com.zhiliaoapp.musically.R;
import irm.AkS94S0100000_27;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: loaded from: classes28.dex */
public final class PostedListFragment extends BaseAutoPostLivingListFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9JCw6LCc8OzElJDHELIOS8/ZiklPyohLTUgMGEyPTEjOSAgPGscJjwnLSEAIDwnDjctLiI2JjE=";
    public final int LLJIJIL;
    public final int LLJILJIL;
    public final EnumC1813200xHi LLJILJILJ;

    @Override // com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.BaseAutoPostLivingListFragment
    public final EnumC1813200xHi MR() {
        return this.LLJILJILJ;
    }

    @Override // com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.BaseAutoPostLivingListFragment
    public final int OR() {
        return this.LLJILJIL;
    }

    @Override // com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.BaseAutoPostLivingListFragment
    public final int getLayoutId() {
        return this.LLJIJIL;
    }

    public PostedListFragment(C1835760xs6 c1835760xs6) {
        super(c1835760xs6);
        this.LLJIJIL = R.layout.dcy;
        this.LLJILJIL = 2131851301;
        this.LLJILJILJ = EnumC1813200xHi.POSTED;
    }

    @Override // com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.BaseAutoPostLivingListFragment
    /* JADX INFO: renamed from: RR */
    public final void gn(AbstractC1777760wMY abstractC1777760wMY) {
        if (abstractC1777760wMY instanceof C1777740wMW) {
            C766270U4b.LIZLLL(2131851284);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.BaseAutoPostLivingListFragment, X.InterfaceC1813270xHp
    public final /* bridge */ /* synthetic */ void gn(InterfaceC1180504jb interfaceC1180504jb) {
        gn((AbstractC1777760wMY) interfaceC1180504jb);
    }

    @Override // com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.BaseAutoPostLivingListFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C457201qE.LIZ(C1813460xI8.LIZ(PR().LLILLJJLI, AFwS269S0000000_27.get$arr$(352)), this, new C1813350xHx(this, null));
        C457201qE.LIZ(C1813460xI8.LIZ(PR().LLILLJJLI, AFwS269S0000000_27.get$arr$(344)), this, new C1813340xHw(this, null));
    }

    @Override // com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.BaseAutoPostLivingListFragment, androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/ss/android/ugc/aweme/live/livehostimpl/livereply/autopost/PostedListFragment", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UDYq/qCsrbkCuLHOplv3FwmF2S1cAm8l4JQYF4rMA4+YwO8G+J8=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        if (!z) {
            PR().vQ2(new C1777360wLu(EnumC1813200xHi.POSTED));
        }
    }

    @Override // com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.BaseAutoPostLivingListFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C197039127h c197039127h = this.LLIZLLLIL;
        if (c197039127h != null) {
            C786410Ut5.I7(new AkS94S0100000_27(this, 6), c197039127h);
        }
        C197039127h c197039127h2 = this.LLIZLLLIL;
        if (c197039127h2 != null) {
            c197039127h2.setIconTintColorRes(R.attr.a1h);
        }
        C197039127h c197039127h3 = this.LLIZLLLIL;
        if (c197039127h3 != null) {
            c197039127h3.setButtonVariant(0);
        }
        C197039127h c197039127h4 = this.LLIZLLLIL;
        if (c197039127h4 != null) {
            c197039127h4.LJJJJL(new AwS583S0100000_4(this, 76));
        }
    }
}
