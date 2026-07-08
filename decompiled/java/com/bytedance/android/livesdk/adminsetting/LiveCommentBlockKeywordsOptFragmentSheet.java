package com.bytedance.android.livesdk.adminsetting;

import X.C01GW;
import X.C0IK5;
import X.C1119170fEJ;
import X.C1826660xdQ;
import X.C292401Bi;
import X.C475510Ikn;
import X.C497740JfY;
import X.C748790TYv;
import X.C758170Tod;
import X.C786410Ut5;
import X.InterfaceC2262081DgM;
import X.InterfaceC500940Jki;
import Y.ACListenerS147S0100000_12;
import Y.ARunnableS112S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.LiveCommentAddBlockWord;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveCommentBlockKeywordsOptFragmentSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhICEgLTE4ICE0HELIOSZgklPyoQJyghLCEnCikjKiQYLTw7Jj03Owo8PQkhKSIhLCEnGy0pLDs=";
    public C748790TYv LLJLLL;
    public final C01GW LLJZ = C292401Bi.LIZ(new AwS556S0100000_12(this, 108));
    public final C01GW LLJZIJLIL = C292401Bi.LIZ(new AwS556S0100000_12(this, 107));

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131835607));
        ArrayList arrayList = new ArrayList();
        C758170Tod c758170TodVR = VR();
        if (c758170TodVR != null) {
            arrayList.add(c758170TodVR);
        }
        c1119170fEJ.LJ = arrayList;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C1826660xdQ(R.drawable.eup, new ACListenerS147S0100000_12(this, 85)));
        c1119170fEJ.LJFF = arrayList2;
        return c1119170fEJ;
    }

    public final Room uS() {
        return (Room) this.LLJZ.getValue();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJLLL = null;
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
    public final void onViewCreated(View view, Bundle bundle) {
        boolean zBooleanValue;
        InterfaceC500940Jki interfaceC500940JkiUser;
        InterfaceC2262081DgM currentUser;
        String secUid;
        long id;
        Room roomUS;
        User owner;
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LLJLLL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.c4_);
            } else {
                viewFindViewById = null;
            }
            this.LLJLLL = (C748790TYv) viewFindViewById;
        }
        C748790TYv c748790TYv = (C748790TYv) viewFindViewById;
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (uS() != null) {
            zBooleanValue = ((Boolean) this.LLJZIJLIL.getValue()).booleanValue();
        } else {
            zBooleanValue = true;
        }
        if (uS() == null ? (interfaceC500940JkiUser = UserService.getInstance().user()) == null || (currentUser = interfaceC500940JkiUser.getCurrentUser()) == null || (secUid = currentUser.getSecUid()) == null : (roomUS = uS()) == null || (owner = roomUS.getOwner()) == null || (secUid = owner.getSecUid()) == null) {
            secUid = "";
        }
        Room roomUS2 = uS();
        if (roomUS2 != null) {
            id = roomUS2.getId();
        } else {
            id = 0;
        }
        c748790TYv.LJII(dataChannelLJ, zBooleanValue, secUid, id, "live_take_page", new AwS591S0100000_12(this, 2));
        DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
        if (dataChannelLJ2 != null) {
            dataChannelLJ2.BQ2(this, LiveCommentAddBlockWord.class, new AwS591S0100000_12(this, 3));
        }
        C786410Ut5.LJJZZIII(C0IK5.LIZ(), new ARunnableS112S0100000_12(this, 42));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.gae, viewGroup, false);
    }
}
