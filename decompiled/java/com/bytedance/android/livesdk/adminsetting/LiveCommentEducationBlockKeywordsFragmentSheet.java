package com.bytedance.android.livesdk.adminsetting;

import X.C01GW;
import X.C0IJT;
import X.C0TY6;
import X.C0TY7;
import X.C0TY8;
import X.C0TZK;
import X.C1119170fEJ;
import X.C292401Bi;
import X.C452501pT;
import X.C474500IjA;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500060JjI;
import X.C510160Jza;
import X.C745510TMf;
import X.C758170Tod;
import X.C786180Usi;
import X.C786410Ut5;
import X.InterfaceC745530TMh;
import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWordRecommend;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveCommentEducationBlockKeywordsFragmentSheet extends LiveSheetFragment implements C0TY8 {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhICEgLTE4ICE0ZgklHELIOSPyoQJyghLCEnDSE5Ki4nISoiCyM8Ky4HLDYkJzcoOgkhKSIhLCEnGy0pLDs=";
    public RecyclerView LLJLLL;
    public C745510TMf LLJZIJLIL;
    public long[] LLLFFI;
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 109));
    public final C01GW LLL = C292401Bi.LIZ(new AwS556S0100000_12(this, 110));
    public final C01GW LLLF = C292401Bi.LIZ(new AwS556S0100000_12(this, 111));
    public boolean LLLFF = true;
    public final C0TY6 LLLFZ = new InterfaceC745530TMh() { // from class: X.0TY6
        @Override // X.InterfaceC745530TMh
        public final void LIZ(int i) {
            this.LIZ.uS().LIZIZ(i);
        }
    };

    @Override // X.C0TY8
    public final void nQ() {
        close(1);
    }

    @Override // X.C0TY8
    public final void qH() {
        close(1);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C500060JjI cS() {
        C500060JjI c500060JjI = new C500060JjI();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C510160Jza(C497740JfY.LJIJI(2131840649), R.style.a7b, new C786180Usi(this, 1)));
        arrayList.add(new C510160Jza(C497740JfY.LJIJI(2131838731), R.style.a_u, new C786180Usi(this, 2)));
        c500060JjI.LIZ(arrayList);
        return c500060JjI;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C758170Tod(R.attr.eo4, new ACListenerS147S0100000_12(this, 86)));
        c1119170fEJ.LJFF = arrayList;
        c1119170fEJ.LJI = false;
        return c1119170fEJ;
    }

    public final C0TY7 uS() {
        return (C0TY7) this.LLJZ.getValue();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJLLL = null;
    }

    @Override // X.C0TY8
    public final void gN(List<BlockWordRecommend> list) {
        C745510TMf c745510TMf = this.LLJZIJLIL;
        if (c745510TMf != null) {
            c745510TMf.LLILLJJLI = new ArrayList(list);
            c745510TMf.notifyDataSetChanged();
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(0, null);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean zBooleanValue;
        ArrayList<String> stringArrayList;
        String secUid;
        long id;
        User owner;
        Boolean bool;
        super.onViewCreated(view, bundle);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null && (bool = (Boolean) dataChannelLJ.gg0(C0TZK.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = true;
        }
        this.LLLFF = zBooleanValue;
        DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
        if (dataChannelLJ2 != null) {
            dataChannelLJ2.SX0(C0TZK.class, Boolean.FALSE);
        }
        Bundle arguments = getArguments();
        View viewFindViewById = null;
        if (arguments != null) {
            stringArrayList = arguments.getStringArrayList("key_block_keywords_list");
        } else {
            stringArrayList = null;
        }
        this.LLJZIJLIL = new C745510TMf(this.LLLFZ);
        View viewFindViewById2 = this.LLJLLL;
        if (viewFindViewById2 == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById2 = view2.findViewById(R.id.c49);
            } else {
                viewFindViewById2 = null;
            }
            this.LLJLLL = (RecyclerView) viewFindViewById2;
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.LLJZIJLIL);
        }
        int size = 0;
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(getContext(), 0);
        flexboxLayoutManager.LJJII(1);
        flexboxLayoutManager.LJJI(2);
        flexboxLayoutManager.LJJIII(2);
        View view3 = this.LLJLLL;
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById = view4.findViewById(R.id.c49);
            }
            this.LLJLLL = (RecyclerView) viewFindViewById;
            view3 = viewFindViewById;
        }
        RecyclerView recyclerView2 = (RecyclerView) view3;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(flexboxLayoutManager);
        }
        C0TY7 c0ty7US = uS();
        boolean zBooleanValue2 = ((Boolean) this.LLL.getValue()).booleanValue();
        Room room = (Room) this.LLLF.getValue();
        if (room == null || (owner = room.getOwner()) == null || (secUid = owner.getSecUid()) == null) {
            secUid = "";
        }
        Room room2 = (Room) this.LLLF.getValue();
        if (room2 != null) {
            id = room2.getId();
        } else {
            id = 0;
        }
        c0ty7US.LJ = zBooleanValue2;
        c0ty7US.LJFF = secUid;
        c0ty7US.LJI = id;
        if (stringArrayList != null) {
            uS().LIZLLL(stringArrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (stringArrayList != null) {
            size = stringArrayList.size();
        }
        linkedHashMap.put("keywords_cnt", String.valueOf(size));
        wS("livesdk_comment_add_to_blocked_keywords_popup_see", linkedHashMap, this.LLLFFI);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        long[] longArray;
        Bundle arguments = getArguments();
        if (arguments != null) {
            longArray = arguments.getLongArray("trigger_comment_id");
        } else {
            longArray = null;
        }
        this.LLLFFI = longArray;
        return C786410Ut5.Td(layoutInflater, R.layout.g4j, viewGroup, false);
    }

    public final void wS(String str, Map<String, String> map, long[] jArr) {
        String str2;
        long id;
        String str3;
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        if (((Boolean) this.LLL.getValue()).booleanValue()) {
            str2 = "anchor";
        } else {
            str2 = "admin";
        }
        c474500IjALIZ.LJJII(str2, "admin_type");
        Room room = (Room) this.LLLF.getValue();
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(id), "room_id");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLLFF ? 1 : 0), "live_room_first_time_see");
        c474500IjALIZ.LJJII(jArr, "trigger_comment_id");
        if (((Boolean) this.LLL.getValue()).booleanValue()) {
            str3 = "host";
        } else {
            str3 = "moderator";
        }
        c474500IjALIZ.LJJII(str3, "trigger_source");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }
}
