package com.bytedance.android.livesdk.adminsetting;

import X.C01GW;
import X.C1119170fEJ;
import X.C292401Bi;
import X.C497740JfY;
import X.C748440TXm;
import X.C758170Tod;
import X.C786410Ut5;
import X.InterfaceC2262081DgM;
import X.InterfaceC500940Jki;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveCommentBlockKeywordsFragmentSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhICEgLTE4ICHELIOSE0ZgklPyoQJyghLCEnCikjKiQYLTw7Jj03OwM+KCg+LSs4Gic2LTE=";
    public C748440TXm LLJLLL;
    public final C01GW LLJZ = C292401Bi.LIZ(new AwS556S0100000_12(this, 104));
    public final C01GW LLJZIJLIL = C292401Bi.LIZ(new AwS556S0100000_12(this, 102));

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131842673));
        ArrayList arrayList = new ArrayList();
        C758170Tod c758170TodVR = VR();
        if (c758170TodVR != null) {
            arrayList.add(c758170TodVR);
        }
        c1119170fEJ.LJ = arrayList;
        return c1119170fEJ;
    }

    public final C748440TXm uS() {
        View viewFindViewById = this.LLJLLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.c4c) : null;
            this.LLJLLL = (C748440TXm) viewFindViewById;
        }
        return (C748440TXm) viewFindViewById;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJLLL = null;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        InterfaceC2262081DgM currentUser;
        String secUid;
        long id;
        User owner;
        String secUid2;
        super.onViewCreated(view, bundle);
        String str = "";
        if (this.LLJZ.getValue() != null) {
            C748440TXm c748440TXmUS = uS();
            boolean zBooleanValue = ((Boolean) this.LLJZIJLIL.getValue()).booleanValue();
            Room room = (Room) this.LLJZ.getValue();
            if (room != null && (owner = room.getOwner()) != null && (secUid2 = owner.getSecUid()) != null) {
                str = secUid2;
            }
            Room room2 = (Room) this.LLJZ.getValue();
            if (room2 != null) {
                id = room2.getId();
            } else {
                id = 0;
            }
            c748440TXmUS.LJII(str, id, "live_take_detail", zBooleanValue, true);
        } else {
            C748440TXm c748440TXmUS2 = uS();
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            if (interfaceC500940JkiUser != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null && (secUid = currentUser.getSecUid()) != null) {
                str = secUid;
            }
            c748440TXmUS2.LJII(str, 0L, "live_take_detail", true, true);
        }
        uS().setOnAddSuccessCallback(new AwS556S0100000_12(this, 103));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.gad, viewGroup, false);
    }
}
