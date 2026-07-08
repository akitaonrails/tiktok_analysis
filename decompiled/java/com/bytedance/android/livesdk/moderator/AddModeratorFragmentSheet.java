package com.bytedance.android.livesdk.moderator;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1119170fEJ;
import X.C2204961BRm;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C749600Tao;
import X.C758170Tod;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public final class AddModeratorFragmentSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9JSooHELIOSLD0yPCo+Zw43LAgjLSohKTEjOwkhKSIhLCEnGy0pLDs=";
    public LinearLayout LLJLLL;
    public RecyclerView LLJZ;
    public LinearLayout LLJZIJLIL;
    public ConstraintLayout LLL;
    public LiveIconView LLLF;
    public LiveEditText LLLFF;
    public C749600Tao LLLFFI;
    public View LLLFZ;

    public final RecyclerView BS() {
        View viewFindViewById = this.LLJZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.udy) : null;
            this.LLJZ = (RecyclerView) viewFindViewById;
        }
        return (RecyclerView) viewFindViewById;
    }

    public final void ES() {
        String string;
        C749600Tao c749600Tao = this.LLLFFI;
        if (c749600Tao != null) {
            Editable editableLLLFZ = C2204961BRm.LLLFZ(yS(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl5iURFHzSXse3dUU2daRzRYNtXZvQfwBY6qRPf/KxjZKKwgU=", null));
            if (editableLLLFZ == null || (string = editableLLLFZ.toString()) == null) {
                string = "";
            }
            c749600Tao.LLLFZ(string);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131843847));
        ArrayList arrayList = new ArrayList();
        C758170Tod c758170TodVR = VR();
        if (c758170TodVR != null) {
            arrayList.add(c758170TodVR);
        }
        c1119170fEJ.LJ = arrayList;
        return c1119170fEJ;
    }

    public final LiveEditText yS() {
        View viewFindViewById = this.LLLFF;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.u9t) : null;
            this.LLLFF = (LiveEditText) viewFindViewById;
        }
        return (LiveEditText) viewFindViewById;
    }

    public final LiveIconView zS() {
        View viewFindViewById = this.LLLF;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.uba) : null;
            this.LLLF = (LiveIconView) viewFindViewById;
        }
        return (LiveIconView) viewFindViewById;
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void uS() {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.moderator.AddModeratorFragmentSheet.uS():void");
    }

    public final long wS() {
        Room room;
        if (C500260Jjc.LJJIJLIJ()) {
            return UserService.getInstance().user().getCurrentUserId();
        }
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ == null || (room = (Room) dataChannelLJ.gg0(RoomChannel.class)) == null) {
            return 0L;
        }
        return room.getOwnerUserId();
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
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/bytedance/android/livesdk/moderator/AddModeratorFragmentSheet", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl5iURFHzSXse3dUU2daRzRYNtXZvQfwBY6qRPf/KxjZKKwgU=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        if (!z) {
            uS();
            ES();
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLLFZ = view;
        uS();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.g4m, viewGroup, false);
    }
}
