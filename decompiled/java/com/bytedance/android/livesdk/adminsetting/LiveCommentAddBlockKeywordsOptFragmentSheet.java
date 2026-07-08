package com.bytedance.android.livesdk.adminsetting;

import X.C01GW;
import X.C0TZ0;
import X.C1119170fEJ;
import X.C1331180kkG;
import X.C292401Bi;
import X.C444920HcY;
import X.C497740JfY;
import X.C751090TdD;
import X.C758170Tod;
import X.C786410Ut5;
import X.InterfaceC2262081DgM;
import X.InterfaceC500940Jki;
import X.InterfaceC748700TYm;
import Y.ACListenerS72S0110000_12;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.LiveCommentAddBlockWord;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWord;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.livesdk.adminsetting.LiveCommentAddBlockKeywordsOptFragmentSheet;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveCommentBlockUrlSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveCommentAddBlockKeywordsOptFragmentSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhICEgLTE4ICE0ZgHELIOSklPyoQJyghLCEnCSEoCyM8Ky4HLDYkJzcoOgAjPAM+KCg+LSs4Gic2LTE=";
    public C0TZ0 LLJLLL;
    public final C01GW LLJZ = C292401Bi.LIZ(new AwS556S0100000_12(this, 98));
    public final C01GW LLJZIJLIL = C292401Bi.LIZ(new AwS556S0100000_12(this, 97));
    public int LLL = 30;
    public boolean LLLF;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131835592));
        ArrayList arrayList = new ArrayList();
        C758170Tod c758170TodVR = VR();
        if (c758170TodVR != null) {
            arrayList.add(c758170TodVR);
        }
        c1119170fEJ.LJ = arrayList;
        C751090TdD c751090TdD = new C751090TdD();
        c751090TdD.LIZIZ = uS();
        c1119170fEJ.LIZLLL = c751090TdD;
        return c1119170fEJ;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJLLL = null;
    }

    public final CharSequence uS() {
        if (getContext() == null) {
            return C497740JfY.LJIJI(2131835597);
        }
        int iLIZLLL = C497740JfY.LIZLLL(R.attr.a1r, getContext());
        int iLIZIZ = C1331180kkG.LIZIZ(iLIZLLL, 102);
        SpannableString spannableString = new SpannableString(C497740JfY.LJIJI(2131835597));
        C786410Ut5.p2(spannableString, new C444920HcY(102, false), 0, spannableString.length(), 17);
        if (!this.LLLF) {
            iLIZLLL = iLIZIZ;
        }
        C786410Ut5.p2(spannableString, new ForegroundColorSpan(iLIZLLL), 0, spannableString.length(), 17);
        return spannableString;
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
        Room room;
        Room room2;
        User owner;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        int i = 30;
        if (arguments != null) {
            i = arguments.getInt("MAX_SINGLE_WORD_LENGTH", 30);
        }
        this.LLL = i;
        View viewFindViewById = this.LLJLLL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.acz);
            } else {
                viewFindViewById = null;
            }
            this.LLJLLL = (C0TZ0) viewFindViewById;
        }
        C0TZ0 c0tz0 = (C0TZ0) viewFindViewById;
        int i2 = this.LLL;
        if (this.LLJZ.getValue() != null) {
            zBooleanValue = ((Boolean) this.LLJZIJLIL.getValue()).booleanValue();
        } else {
            zBooleanValue = true;
        }
        if (this.LLJZ.getValue() == null ? (interfaceC500940JkiUser = UserService.getInstance().user()) == null || (currentUser = interfaceC500940JkiUser.getCurrentUser()) == null || (secUid = currentUser.getSecUid()) == null : (room2 = (Room) this.LLJZ.getValue()) == null || (owner = room2.getOwner()) == null || (secUid = owner.getSecUid()) == null) {
            secUid = "";
        }
        if (this.LLJZ.getValue() != null && (room = (Room) this.LLJZ.getValue()) != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        c0tz0.LJI(i2, zBooleanValue, secUid, id, "live_take_page", new InterfaceC748700TYm() { // from class: X.0TYn
            @Override // X.InterfaceC748700TYm
            public final void LIZIZ() {
                IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
                Context context = this.LIZ.getContext();
                if (context == null) {
                    return;
                }
                iActionHandlerService.handle(context, LiveCommentBlockUrlSetting.INSTANCE.getValue());
            }

            @Override // X.InterfaceC748700TYm
            public final void LIZ(BlockWord blockWord) {
                DataChannel dataChannelLJ = C475510Ikn.LJ(this.LIZ);
                if (dataChannelLJ != null) {
                    dataChannelLJ.zW(LiveCommentAddBlockWord.class, blockWord);
                }
                this.LIZ.LLJJIJIL.LJIIJJI();
            }

            @Override // X.InterfaceC748700TYm
            public final void LIZJ(boolean z) {
                LiveCommentAddBlockKeywordsOptFragmentSheet liveCommentAddBlockKeywordsOptFragmentSheet = this.LIZ;
                if (liveCommentAddBlockKeywordsOptFragmentSheet.LLLF != z) {
                    liveCommentAddBlockKeywordsOptFragmentSheet.LLLF = z;
                    C20483915Dh c20483915Dh = liveCommentAddBlockKeywordsOptFragmentSheet.LLIZ;
                    C751090TdD c751090TdD = new C751090TdD();
                    LiveCommentAddBlockKeywordsOptFragmentSheet liveCommentAddBlockKeywordsOptFragmentSheet2 = this.LIZ;
                    c751090TdD.LIZIZ = liveCommentAddBlockKeywordsOptFragmentSheet2.uS();
                    c751090TdD.LIZLLL = new ACListenerS72S0110000_12(liveCommentAddBlockKeywordsOptFragmentSheet2, z, 0);
                    c20483915Dh.setEndTextButton(c751090TdD);
                }
            }
        });
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.gaa, viewGroup, false);
    }
}
