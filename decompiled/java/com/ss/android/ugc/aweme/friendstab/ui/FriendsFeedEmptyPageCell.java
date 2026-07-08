package com.ss.android.ugc.aweme.friendstab.ui;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0TT6;
import X.C0W93;
import X.C0XQ7;
import X.C1073870e3F;
import X.C1074880e4s;
import X.C1077450e91;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1370940lmO;
import X.C1371600lnS;
import X.C1388190mED;
import X.C15O7;
import X.C19EG;
import X.C20673215v0;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2344009Gk;
import X.C289300BVo;
import X.C319860CgK;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C460020I2e;
import X.C621180OYa;
import X.C786410Ut5;
import X.C814420VxA;
import X.C818480W8w;
import X.InterfaceC1334290kpH;
import X.InterfaceC1891350zJl;
import Y.ACallableS422S0100000_16;
import Y.AObserverS220S0100000_16;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.helper.FriendsEmptyPageSharePackage;
import com.ss.android.ugc.aweme.friendstab.service.IFriendsTabV3Service;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel;
import com.ss.android.ugc.aweme.share.improve.channel.UserQrCodeChannel;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class FriendsFeedEmptyPageCell extends PowerCell<C1073870e3F> {
    public boolean LLILZIL;
    public boolean LLILZLL;
    public final AtomicBoolean LL = new AtomicBoolean(false);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS560S0100000_16(this, 287));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 289));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(183));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 288));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        C818480W8w.LIZJ("friends_tab_empty", C0W93.CANCEL, null, C2097608Jq.LJ());
        if (this.LLILZLL) {
            super.unBind();
            this.LLILZLL = false;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        View viewFindViewById;
        String string;
        super.onItemViewCreated();
        FriendsEmptyPageRootVM friendsEmptyPageRootVM = (FriendsEmptyPageRootVM) this.LLILLL.getValue();
        if (friendsEmptyPageRootVM != null) {
            friendsEmptyPageRootVM.LLILLJJLI = (FriendsEmptyPageMainSectionVM) this.LLILLJJLI.getValue();
            friendsEmptyPageRootVM.vQ2();
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.itemView.getContext());
        if (c19egLIZIZ != null) {
            C1074880e4s c1074880e4s = FriendsEmptyPageSharePackage.Companion;
            FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM = (FriendsEmptyPageMainSectionVM) this.LLILLJJLI.getValue();
            c1074880e4s.getClass();
            C1370940lmO c1370940lmO = new C1370940lmO();
            c1370940lmO.LIZLLL = "";
            User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
            try {
                string = C786410Ut5.j4(C460020I2e.LIZ.getString(2131829480), Arrays.copyOf(new Object[]{curUser == null ? "" : curUser.getNickname()}, 1));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                string = C460020I2e.LIZ.getString(2131829480);
            }
            c1370940lmO.LJ = string;
            c1370940lmO.LJFF = "";
            c1370940lmO.LIZ = "text";
            FriendsEmptyPageSharePackage friendsEmptyPageSharePackage = new FriendsEmptyPageSharePackage(c1370940lmO, friendsEmptyPageMainSectionVM);
            C1371600lnS c1371600lnS = new C1371600lnS();
            C621180OYa.LIZ.LJJLIIIJILLIZJL(c1371600lnS, c19egLIZIZ, true);
            c1371600lnS.LJJIIJ = friendsEmptyPageSharePackage;
            c1371600lnS.LIZIZ(new CopyLinkChannel(true));
            if (((Number) C289300BVo.LIZ.getValue()).intValue() == 3) {
                c1371600lnS.LIZIZ(new UserQrCodeChannel());
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", "homepage_friends");
                c2344009Gk.LJIIIIZZ("action_type", "show");
                C20684815ws.LJIILLIIL("qr_code_icon", c2344009Gk.LIZ);
            }
            C15O7.LIZJ(new ACallableS422S0100000_16(c1371600lnS, 9)).LIZLLL(new C1077450e91(friendsEmptyPageSharePackage, this, 1));
        }
        C426750GoL.LJIIIZ(this.itemView.findViewById(R.id.im2), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), null, null, false, 29);
        LifecycleOwner currentLifecycleOwner = getCurrentLifecycleOwner();
        if (currentLifecycleOwner != null) {
            FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM2 = (FriendsEmptyPageMainSectionVM) this.LLILLJJLI.getValue();
            friendsEmptyPageMainSectionVM2.LLIZ.observe(currentLifecycleOwner, new AObserverS220S0100000_16(this, 42));
            friendsEmptyPageMainSectionVM2.LLJIJIL.observe(currentLifecycleOwner, new AObserverS220S0100000_16(this, 43));
            friendsEmptyPageMainSectionVM2.LLJ.observe(currentLifecycleOwner, new AObserverS220S0100000_16(this, 44));
            if (!ComplianceServiceProvider.LJI().LJIIJ(false) || C319860CgK.LIZ() || (viewFindViewById = this.itemView.findViewById(R.id.im4)) == null) {
                return;
            }
            viewFindViewById.setOnLongClickListener((View.OnLongClickListener) this.LLIZ.getValue());
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!this.LLILZLL) {
            this.LLILZLL = true;
            C818480W8w.LIZJ("friends_tab_empty", C0W93.SUCCESS, null, C2097608Jq.LJ());
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewLIZJ = C20673215v0.LIZJ(R.layout.cad, C1388190mED.LIZ(viewGroup.getContext()));
        double height = viewGroup.getHeight();
        C0TT6.LIZLLL((int) (0.074d * height), viewLIZJ);
        C0TT6.LIZIZ((int) (height * 0.05d), viewLIZJ);
        return viewLIZJ;
    }

    public final void I5(int i, int i2, String str) {
        File fileZu;
        IFriendsTabV3Service iFriendsTabV3Service = (IFriendsTabV3Service) PluggableExtentionKt.pluggableSpi$default(IFriendsTabV3Service.class, false, false, false, 14, null);
        if (iFriendsTabV3Service != null && (fileZu = iFriendsTabV3Service.Zu(str)) != null) {
            C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(fileZu);
            c1331670kl3LJII.LJIIIIZZ = i;
            c1331670kl3LJII.LJIIIZ = i2;
            c1331670kl3LJII.LJIL = Bitmap.Config.RGB_565;
            c1331670kl3LJII.LJJ((InterfaceC1334290kpH) this.itemView.findViewById(R.id.sva));
            c1331670kl3LJII.LJIIJJI();
        }
    }
}
