package com.bytedance.android.livesdk.moderator;

import X.C0IJT;
import X.C0UO0;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1119170fEJ;
import X.C1161920gLG;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C474500IjA;
import X.C475510Ikn;
import X.C482260Ivg;
import X.C497740JfY;
import X.C500260Jjc;
import X.C749570Tal;
import X.C749610Tap;
import X.C750740Tce;
import X.C758170Tod;
import X.C786120Usc;
import X.C786410Ut5;
import Y.ACListenerS147S0100000_12;
import Y.AfS181S0100000_12;
import Y.AsS39S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.usermanage.AdminApi;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostBridge;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class AddModeratorFragmentSheetNew extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9JSooLDHELIOS0yPCo+Zw43LAgjLSohKTEjOwkhKSIhLCEnGy0pLDsdLTI=";
    public LinearLayout LLJLLL;
    public RecyclerView LLJZ;
    public LinearLayout LLJZIJLIL;
    public ConstraintLayout LLL;
    public LiveIconView LLLF;
    public LiveEditText LLLFF;
    public boolean LLLFFI;
    public C749610Tap LLLFZ;
    public View LLLI;
    public long LLLII;
    public boolean LLLIIL;
    public long LLLIIII = -1;
    public final List<C750740Tce> LLLIIIIL = new ArrayList();
    public boolean LLLIIIL = true;
    public final C786120Usc LLLIILIL = new C786120Usc(this, 10);

    public final LiveIconView BS() {
        View viewFindViewById = this.LLLF;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.uba) : null;
            this.LLLF = (LiveIconView) viewFindViewById;
        }
        return (LiveIconView) viewFindViewById;
    }

    public final RecyclerView ES() {
        View viewFindViewById = this.LLJZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.udy) : null;
            this.LLJZ = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    public final void FS() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_moderator_manage_page_view");
        c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(this));
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(C500260Jjc.LJJLIIIJ(C475510Ikn.LJ(this)) > 0 ? Long.valueOf(C500260Jjc.LJJLIIIJ(C475510Ikn.LJ(this))) : "", "room_id");
        c474500IjALIZ.LIZ();
    }

    public final void GS() {
        String string;
        C20441214yg.LIZIZ("AdminMonitor", "onSearchEvent");
        C749610Tap c749610Tap = this.LLLFZ;
        if (c749610Tap != null) {
            Editable editableLLLFZ = C2204961BRm.LLLFZ(zS(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl5iURFHzSXse3dUU2daRzRYNtXZvQfwBY6qRPf/KxjZKKwgXKxWs=", null));
            if (editableLLLFZ == null || (string = editableLLLFZ.toString()) == null) {
                string = "";
            }
            long currentUserId = UserService.getInstance().user().getCurrentUserId();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onSearchEvent2: ");
            sbLIZ.append(string);
            sbLIZ.append(", toUid: ");
            sbLIZ.append(currentUserId);
            sbLIZ.append(", key: ");
            sbLIZ.append(string);
            C20441214yg.LIZIZ("AdminMonitor", C2188811AlT.LIZIZ(sbLIZ));
            ((IHostBridge) C1161920gLG.LIZJ(IHostBridge.class)).queryRelationSearchList(1, String.valueOf(currentUserId), string, new AwS591S0100000_12(c749610Tap, 1171), AFwS231S0000000_3.get$arr$(254));
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C497740JfY.LJIJI(2131843033));
        sbLIZ.append('(');
        sbLIZ.append(wS());
        sbLIZ.append('/');
        sbLIZ.append(yS());
        sbLIZ.append(')');
        c1119170fEJ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        ArrayList arrayList = new ArrayList();
        C758170Tod c758170TodVR = VR();
        if (c758170TodVR != null) {
            arrayList.add(c758170TodVR);
        }
        c1119170fEJ.LJ = arrayList;
        return c1119170fEJ;
    }

    public final LiveEditText zS() {
        View viewFindViewById = this.LLLFF;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.u9t) : null;
            this.LLLFF = (LiveEditText) viewFindViewById;
        }
        return (LiveEditText) viewFindViewById;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJLLL = null;
        this.LLJZ = null;
        this.LLJZIJLIL = null;
        this.LLL = null;
        this.LLLF = null;
        this.LLLFF = null;
        zS().removeTextChangedListener(this.LLLIILIL);
    }

    public final int wS() {
        List list;
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ == null || (list = (List) dataChannelLJ.gg0(ModeratorListChannel.class)) == null) {
            return 0;
        }
        return list.size();
    }

    public final int yS() {
        Integer num;
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ == null || (num = (Integer) dataChannelLJ.gg0(C749570Tal.class)) == null) {
            return 30;
        }
        return num.intValue();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(2, null);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        Editable editableLLLFZ;
        Object obj;
        boolean z2 = true;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/bytedance/android/livesdk/moderator/AddModeratorFragmentSheetNew", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl5iURFHzSXse3dUU2daRzRYNtXZvQfwBY6qRPf/KxjZKKwgXKxWs=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        C20441214yg.LIZIZ("Admin#onHidden", String.valueOf(z));
        if (!z) {
            this.LLIZ.setTitle(C497740JfY.LJIJI(2131843033) + '(' + wS() + '/' + yS() + ')');
            FS();
            LiveEditText liveEditTextZS = zS();
            if (liveEditTextZS == null || (editableLLLFZ = C2204961BRm.LLLFZ(liveEditTextZS, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl5iURFHzSXse3dUU2daRzRYNtXZvQfwBY6qRPf/KxjZKKwgXKxWs=", null))) == null || editableLLLFZ.length() <= 0) {
                z2 = false;
            }
            this.LLLIIL = z2;
            if (!z2) {
                uS(this, this.LLLII);
            } else {
                GS();
            }
        }
    }

    public static void uS(AddModeratorFragmentSheetNew addModeratorFragmentSheetNew, long j) {
        addModeratorFragmentSheetNew.getClass();
        ((AdminApi) C482260Ivg.LIZJ(AdminApi.class)).getAdminOverallTab(Long.valueOf(j), 50).LJIILIIL(new C0UO0()).LJJLL(new AfS181S0100000_12(addModeratorFragmentSheetNew, 297), new AfS181S0100000_12(addModeratorFragmentSheetNew, 298));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        long ownerUserId;
        Room room;
        super.onViewCreated(view, bundle);
        this.LLLI = view;
        C20441214yg.LIZIZ("AddAdmin#loadmore", "");
        RecyclerView recyclerViewES = ES();
        if (recyclerViewES != null) {
            recyclerViewES.clearOnScrollListeners();
        }
        RecyclerView recyclerViewES2 = ES();
        if (recyclerViewES2 != null) {
            recyclerViewES2.addOnScrollListener(new AsS39S0100000_12(this, 10));
        }
        C20441214yg.LIZIZ("Admin#input", "initSearchBar");
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (C500260Jjc.LJJIJLIJ()) {
            ownerUserId = UserService.getInstance().user().getCurrentUserId();
        } else {
            DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
            if (dataChannelLJ2 != null && (room = (Room) dataChannelLJ2.gg0(RoomChannel.class)) != null) {
                ownerUserId = room.getOwnerUserId();
            } else {
                ownerUserId = 0;
            }
        }
        C749610Tap c749610Tap = new C749610Tap(ownerUserId, dataChannelLJ, "friend_panel", true);
        new AwS591S0100000_12(this, 1170);
        this.LLLFZ = c749610Tap;
        View viewFindViewById = this.LLL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.uad);
            } else {
                viewFindViewById = null;
            }
            this.LLL = (ConstraintLayout) viewFindViewById;
        }
        C500260Jjc.LLFFF(viewFindViewById);
        RecyclerView recyclerViewES3 = ES();
        recyclerViewES3.setAdapter(this.LLLFZ);
        recyclerViewES3.setLayoutManager(new LinearLayoutManager(recyclerViewES3.getContext()));
        C786410Ut5.g8(BS(), new ACListenerS147S0100000_12(this, 448));
        zS().addTextChangedListener(this.LLLIILIL);
        uS(this, this.LLLII);
        FS();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.g4m, viewGroup, false);
    }
}
