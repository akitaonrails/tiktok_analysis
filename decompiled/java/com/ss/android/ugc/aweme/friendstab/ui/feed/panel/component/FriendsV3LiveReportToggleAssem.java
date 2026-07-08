package com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C13LE;
import X.C1548820qPI;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1599640rjG;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C262100zr;
import X.C452501pT;
import X.C724240Sb0;
import X.C724750Sbp;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC1361290lWp;
import X.InterfaceC2217461Bqa;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class FriendsV3LiveReportToggleAssem extends AbstractC738140SxQ implements FriendsV3LiveReportToggleAbility, InterfaceC1141530foN {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final AssemVMLazy LL;
    public final C01GW LLILLJJLI;
    public boolean LLILLL;
    public String LLILZ;
    public int LLILZIL;
    public InterfaceC1361290lWp LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsV3LiveReportToggleAssem.class, "feedViewModel", "getFeedViewModel()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/panel/viewmodel/FriendsV3FeedListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FriendsV3LiveReportToggleAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FriendsV3FeedListViewModel.class);
        this.LL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1475), AFwS257S0000000_19.get$arr$(165), null, true);
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1474));
        this.LLILZ = "";
        this.LLILZIL = -1;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        if (this.LLILLL) {
            return;
        }
        C1548820qPI.LIZLLL("ttlive_report_preview", this);
        C1548820qPI.LIZLLL("ttlive_report_success", this);
        this.LLILLL = true;
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        if (this.LLILLL) {
            C1548820qPI.LJIIIIZZ("ttlive_report_preview", this);
            C1548820qPI.LJIIIIZZ("ttlive_report_success", this);
            this.LLILLL = false;
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, FriendsV3LiveReportToggleAbility.class, null, null);
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        if (this.LLILZ.length() == 0) {
            return;
        }
        String str = c262100zr.LIZ;
        String string = null;
        if (Intrinsics.LJFF(str, "ttlive_report_preview")) {
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            if (interfaceC1107590evd2 != null) {
                String string2 = interfaceC1107590evd2.getString("source");
                InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
                if (interfaceC1107590evd3 != null) {
                    string = interfaceC1107590evd3.getString("action");
                }
                if (TextUtils.equals(string2, "anchor")) {
                    if (TextUtils.equals(string, "hide")) {
                        AssemVMLazy assemVMLazy = this.LL;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
                        this.LLILZLL = (InterfaceC1361290lWp) ((AssemListViewModel) assemVMLazy.getValue()).listGetAt(this.LLILZIL);
                        ((AssemSingleListViewModel) this.LL.getValue()).listRemoveItemAt(this.LLILZIL);
                        return;
                    }
                    if (!TextUtils.equals(string, "unhide")) {
                        return;
                    }
                    InterfaceC1361290lWp interfaceC1361290lWp = this.LLILZLL;
                    if (interfaceC1361290lWp != null) {
                        AssemVMLazy assemVMLazy2 = this.LL;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLIZ;
                        ((AssemListViewModel) assemVMLazy2.getValue()).listAddItemAt(this.LLILZIL, interfaceC1361290lWp);
                    }
                    FriendsV3FeedListAbility friendsV3FeedListAbility = (FriendsV3FeedListAbility) this.LLILLJJLI.getValue();
                    if (friendsV3FeedListAbility == null) {
                        return;
                    }
                    friendsV3FeedListAbility.LLJ(this.LLILZIL);
                    return;
                }
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(str, "ttlive_report_success") || (interfaceC1107590evd = c262100zr.LIZIZ) == null) {
            return;
        }
        String string3 = interfaceC1107590evd.getString("source");
        InterfaceC1107590evd interfaceC1107590evd4 = c262100zr.LIZIZ;
        if (interfaceC1107590evd4 != null) {
            string = interfaceC1107590evd4.getString("action");
        }
        if (!TextUtils.equals(string3, "anchor") || !TextUtils.equals(string, "remove")) {
            return;
        }
        C1599640rjG.LIZIZ.Yu(this.LLILZ);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3LiveReportToggleAbility
    public final void Ay0(int i, String str) {
        this.LLILZ = str;
        this.LLILZIL = i;
    }
}
