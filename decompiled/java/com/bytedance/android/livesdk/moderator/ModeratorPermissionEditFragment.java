package com.bytedance.android.livesdk.moderator;

import X.C01GW;
import X.C098200Yq;
import X.C09JN;
import X.C0IJT;
import X.C0UO0;
import X.C13LP;
import X.C1685300txQ;
import X.C16F5;
import X.C16FS;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C19QK;
import X.C2097608Jq;
import X.C21411718qp;
import X.C292401Bi;
import X.C474500IjA;
import X.C475510Ikn;
import X.C482260Ivg;
import X.C500260Jjc;
import X.C750740Tce;
import X.C751110TdF;
import X.C751350Tdd;
import X.C752450TfP;
import X.C786410Ut5;
import X.EnumC748580TYa;
import Y.AfS12S0111000_12;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageChannel;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.usermanage.AdminApi;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class ModeratorPermissionEditFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9JSooLD0yHELIOSPCo+ZwI8LCA+KDs8OhUpOyI6OzYlJiEWLCw4Dz0yLygpJzs=";
    public FrameLayout LL;
    public LinearLayout LLILLJJLI;
    public C16F5 LLILLL;
    public C16FS LLILZ;
    public C16F5 LLILZIL;
    public C750740Tce LLILZLL;
    public EnumC748580TYa LLIZ;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public C16F5 LLJILLL;
    public final long LLIZLLLIL = UserService.getInstance().user().getCurrentUserId();
    public final String LLJ = UserService.getInstance().user().getCurrentUser().getSecUid();
    public final C01GW LLJI = C292401Bi.LIZ(new AwS556S0100000_12(this, 327));
    public final C01GW LLJJ = C292401Bi.LIZ(new AwS556S0100000_12(this, 328));
    public Map<C21411718qp, Integer> LLJJI = new LinkedHashMap();
    public Map<Integer, C19QK> LLJJIII = C2097608Jq.LJ();
    public final Map<C21411718qp, Integer> LLJJIJI = new HashMap();
    public final C01GW LLJJIJIIJIL = C292401Bi.LIZ(new AwS556S0100000_12(this, 326));

    public final C16FS SR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.eoo) : null;
            this.LLILZ = (C16FS) viewFindViewById;
        }
        return (C16FS) viewFindViewById;
    }

    public final C752450TfP UR() {
        return (C752450TfP) this.LLJJ.getValue();
    }

    public final void RR() {
        EnumC748580TYa enumC748580TYa;
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            if (this.LLJILJIL) {
                enumC748580TYa = this.LLIZ;
                if (enumC748580TYa == null) {
                    enumC748580TYa = null;
                }
            } else {
                enumC748580TYa = EnumC748580TYa.DISMISS;
            }
            dataChannelLJ.zW(BroadcastDialogPageChannel.class, enumC748580TYa);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
    }

    public final boolean OR(Checkable checkable) {
        boolean z;
        Set<C21411718qp> setKeySet = this.LLJJI.keySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = setKeySet.iterator();
        while (true) {
            z = false;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((View) next).getVisibility() == 0) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (((Checkable) it3.next()).isChecked()) {
                    break;
                }
            }
            z = true;
        } else {
            z = true;
        }
        return C500260Jjc.LJLLJ(Boolean.valueOf(z), new AwS556S0100000_12(checkable, 325));
    }

    public final void PR(C474500IjA c474500IjA) {
        String str;
        c474500IjA.LJIJJLI(C475510Ikn.LJ(this));
        C750740Tce c750740Tce = this.LLILZLL;
        if (c750740Tce == null) {
            c750740Tce = null;
        }
        c474500IjA.LJJII(String.valueOf(c750740Tce.LIZ), "to_user_id");
        boolean z = this.LLJIJIL;
        if (this.LLJILJIL) {
            if (z) {
                str = "edit_button";
            } else {
                str = "add_button";
            }
        } else if (z) {
            str = "profile_page_edit";
        } else {
            str = "profile_page_add";
        }
        c474500IjA.LJJII(str, "click_position");
    }

    public final void ZR(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_remove_moderator_popup");
        c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(this));
        PR(c474500IjALIZ);
        c474500IjALIZ.LJ(str);
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    public final void NR(CompoundButton compoundButton, boolean z) {
        if (z) {
            Integer num = (Integer) ((LinkedHashMap) this.LLJJI).get(compoundButton);
            if (C13LP.LJJJJ(num, this.LLJJIII.keySet())) {
                C500260Jjc.LJJJJJ(getViewLifecycleOwner(), null, new C751110TdF(this, num, compoundButton, null), 3);
                return;
            }
            return;
        }
        OR(compoundButton);
    }

    public final void aS(final CompoundButton compoundButton, final boolean z) {
        Integer num;
        String str;
        if (!OR(compoundButton) && (num = (Integer) ((LinkedHashMap) this.LLJJI).get(compoundButton)) != null) {
            final int iIntValue = num.intValue();
            if (iIntValue == 14) {
                DataChannel dataChannelLJ = C475510Ikn.LJ(this);
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_comment_filter_manage_access_toggle");
                c474500IjALIZ.LJIJJLI(dataChannelLJ);
                if (z) {
                    str = "select";
                } else {
                    str = "deselect";
                }
                c474500IjALIZ.LJJII(str, "action");
                c474500IjALIZ.LIZ();
            }
            AdminApi adminApi = (AdminApi) C482260Ivg.LIZJ(AdminApi.class);
            boolean zLJJJI = C500260Jjc.LJJJI(Boolean.valueOf(z));
            C750740Tce c750740Tce = this.LLILZLL;
            C750740Tce c750740Tce2 = null;
            if (c750740Tce == null) {
                c750740Tce = null;
            }
            long j = c750740Tce.LIZ;
            long j2 = this.LLIZLLLIL;
            long jLongValue = ((Number) this.LLJI.getValue()).longValue();
            String str2 = this.LLJ;
            C750740Tce c750740Tce3 = this.LLILZLL;
            if (c750740Tce3 != null) {
                c750740Tce2 = c750740Tce3;
            }
            adminApi.updateAdminPermission(iIntValue, zLJJJI ? 1 : 0, j, j2, jLongValue, str2, c750740Tce2.LIZIZ).LJIILIIL(new C0UO0()).LJJLL(new AfS12S0111000_12(this, iIntValue, z, 0), new C09JN() { // from class: X.0TeD
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("ModeratorPermissionEditFragment@751f.updatePermission$2");
                    Throwable th = (Throwable) obj;
                    this.LL.WR(iIntValue, z, false);
                    if ((th instanceof C501520Jle) && ((C501520Jle) th).getErrorCode() == 4002167) {
                        C786410Ut5.w7(compoundButton, null);
                        compoundButton.setChecked(false);
                        C786410Ut5.w7(compoundButton, new C785990UsP(this.LL, 19));
                        C766270U4b.LIZLLL(2131843119);
                    } else {
                        C786410Ut5.w7(compoundButton, null);
                        compoundButton.setChecked(!z);
                        C786410Ut5.w7(compoundButton, new C785990UsP(this.LL, 20));
                        C766270U4b.LIZLLL(2131842705);
                    }
                    C1C7U.LIZIZ("ModeratorPermissionEditFragment@751f.updatePermission$2");
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x076b  */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.Map] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r18, android.os.Bundle r19) {
        /*
            Method dump skipped, instruction units count: 2222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void VR(int i, String str, boolean z) {
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_moderator_limit_popup");
        c474500IjALIZ.LJIL();
        if (C500260Jjc.LJJIJLIJ()) {
            str2 = "live_take_page";
        } else {
            str2 = "live_take_detail";
        }
        c474500IjALIZ.LJJII(str2, "event_page");
        c474500IjALIZ.LJJII("profile_page_edit", "click_position");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "moderator_number");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_above_limit");
        c474500IjALIZ.LJJII("first_profile_add_moderators", "toast_situation");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LIZ();
    }

    public final void WR(int i, boolean z, boolean z2) {
        String str;
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_moderator_setting_click");
        PR(c474500IjALIZ);
        c474500IjALIZ.LJJII(C751350Tdd.LIZIZ(i), "setting_name");
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        c474500IjALIZ.LJJII(str, "to_status");
        if (z2) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str2, "is_success");
        if (this.LLJILJILJ) {
            c474500IjALIZ.LJJII("multi_guest_panel", "event_page");
        }
        c474500IjALIZ.LIZ();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.g5w, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
