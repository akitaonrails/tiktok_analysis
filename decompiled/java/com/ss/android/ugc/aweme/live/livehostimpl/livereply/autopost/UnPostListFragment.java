package com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost;

import X.AbstractC1777760wMY;
import X.C0W0R;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1777360wLu;
import X.C1777400wLy;
import X.C1808830xAf;
import X.C1813220xHk;
import X.C1813360xHy;
import X.C1813370xHz;
import X.C1813460xI8;
import X.C1813730xIZ;
import X.C1835760xs6;
import X.C197039127h;
import X.C19EG;
import X.C2344009Gk;
import X.C457201qE;
import X.C497740JfY;
import X.C500260Jjc;
import X.EnumC1813200xHi;
import X.EnumC1813540xIG;
import X.InterfaceC1180504jb;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.PostConfigModel;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.PublishParams;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class UnPostListFragment extends BaseAutoPostLivingListFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9JCw6LCc8OzElJDHELIOS8/ZiklPyohLTUgMGEyPTEjOSAgPGsZJx88OzEAIDwnDjctLiI2JjE=";
    public final Function0<Unit> LLJIJIL;
    public final int LLJILJIL;
    public final int LLJILJILJ;
    public final EnumC1813200xHi LLJILLL;

    @Override // com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.BaseAutoPostLivingListFragment
    public final EnumC1813200xHi MR() {
        return this.LLJILLL;
    }

    @Override // com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.BaseAutoPostLivingListFragment
    public final int OR() {
        return this.LLJILJILJ;
    }

    @Override // com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.BaseAutoPostLivingListFragment
    public final int getLayoutId() {
        return this.LLJILJIL;
    }

    @Override // com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.BaseAutoPostLivingListFragment
    /* JADX INFO: renamed from: RR */
    public final void gn(AbstractC1777760wMY abstractC1777760wMY) {
        if (abstractC1777760wMY instanceof C1777400wLy) {
            C1808830xAf c1808830xAf = ((C1777400wLy) abstractC1777760wMY).LIZ;
            C19EG activity = getActivity();
            if (activity != null) {
                C1813220xHk c1813220xHk = this.LLJI;
                String str = null;
                String str2 = null;
                PublishParams publishParams = new PublishParams(c1808830xAf.LJIIIIZZ, c1808830xAf.LJIIIZ, new ArrayList(), "");
                String strValueOf = String.valueOf(c1808830xAf.LIZLLL);
                String str3 = c1808830xAf.LIZJ;
                int value = EnumC1813540xIG.PUBLIC.getValue();
                C2344009Gk c2344009Gk = new C2344009Gk();
                if (c1813220xHk != null) {
                    str = c1813220xHk.LIZJ;
                }
                c2344009Gk.LJIIIIZZ("item_anchor_id", str);
                c2344009Gk.LJIIIIZZ("enter_from_page", "liveroom_page");
                c2344009Gk.LJIIIIZZ("enter_from", "liveroom_page");
                if (c1813220xHk != null) {
                    str2 = c1813220xHk.LIZ;
                }
                c2344009Gk.LJIIIIZZ("enter_method", str2);
                c2344009Gk.LJIIIIZZ("last_page", "liveroom_page");
                c2344009Gk.LJIIIIZZ("network_type", C0W0R.LIZIZ(activity));
                c2344009Gk.LJIIIIZZ("publisher_identity", "anchor");
                c2344009Gk.LJIIIIZZ("shoot_way", "live_auto_post");
                c2344009Gk.LJIIIIZZ("shoot_enter_from", "live_auto_post");
                c2344009Gk.LJFF("content_source", "others");
                c2344009Gk.LJFF("content_type", "video");
                c2344009Gk.LJFF("fragment_id", String.valueOf(c1808830xAf.LIZLLL));
                c2344009Gk.LJFF("fragment_type", String.valueOf(c1808830xAf.LJ));
                c2344009Gk.LJFF("vid", c1808830xAf.LJIILJJIL);
                C1813730xIZ.LIZ(false, 0, new PostConfigModel(strValueOf, str3, publishParams, Integer.valueOf(value), c2344009Gk.LIZ, "anchor", c1808830xAf.LIZIZ, null, "", "", null, 2, C497740JfY.LJIJI(2131851299), true, true), activity, null, null, null, null, new AwS556S0100000_12(c1813220xHk, 501));
            }
            this.LLJIJIL.invoke();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.BaseAutoPostLivingListFragment, X.InterfaceC1813270xHp
    public final /* bridge */ /* synthetic */ void gn(InterfaceC1180504jb interfaceC1180504jb) {
        gn((AbstractC1777760wMY) interfaceC1180504jb);
    }

    @Override // com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.BaseAutoPostLivingListFragment, androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/ss/android/ugc/aweme/live/livehostimpl/livereply/autopost/UnPostListFragment", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0DsPdiyW4HErLsm6UDYq/qCsrbkCuLHOplv3FwmF2S1ZA/hX9HsaiTEqnZBs34mB5io=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        if (!z) {
            PR().vQ2(new C1777360wLu(EnumC1813200xHi.UNPOSTED));
        }
    }

    public UnPostListFragment(C1835760xs6 c1835760xs6, AwS571S0100000_27 awS571S0100000_27) {
        super(c1835760xs6);
        this.LLJIJIL = awS571S0100000_27;
        this.LLJILJIL = R.layout.dcz;
        this.LLJILJILJ = 2131851309;
        this.LLJILLL = EnumC1813200xHi.UNPOSTED;
    }

    @Override // com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.BaseAutoPostLivingListFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C457201qE.LIZ(C1813460xI8.LIZ(PR().LLILLJJLI, AFwS269S0000000_27.get$arr$(353)), this, new C1813360xHy(this, null));
        C457201qE.LIZ(C1813460xI8.LIZ(PR().LLILLJJLI, AFwS269S0000000_27.get$arr$(351)), this, new C1813370xHz(this, null));
        C197039127h c197039127h = this.LLIZLLLIL;
        if (c197039127h != null) {
            C500260Jjc.LJLIIIL(500L, c197039127h, new AwS606S0100000_27(this, 114));
        }
    }
}
