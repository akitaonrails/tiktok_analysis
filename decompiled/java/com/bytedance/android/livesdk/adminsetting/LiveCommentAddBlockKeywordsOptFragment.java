package com.bytedance.android.livesdk.adminsetting;

import X.C01GW;
import X.C0TZ0;
import X.C1331180kkG;
import X.C14KS;
import X.C16F5;
import X.C292401Bi;
import X.C444920HcY;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C786410Ut5;
import X.InterfaceC19323110ij;
import X.InterfaceC2262081DgM;
import X.InterfaceC500940Jki;
import X.InterfaceC748700TYm;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWord;
import com.bytedance.android.live.common.keyboard.MeasureLinearLayout;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.adminsetting.LiveCommentAddBlockKeywordsOptFragment;
import com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageChannel;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveCommentBlockUrlSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS556S0100000_12;
import wh6.AbS162S0110000_12;
import wh6.AbS694S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveCommentAddBlockKeywordsOptFragment extends LiveDialogFragment implements InterfaceC19323110ij {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhICEgLTE4ICHELIOSE0ZgklPyoQJyghLCEnCSEoCyM8Ky4HLDYkJzcoOgAjPAM+KCg+LSs4";
    public final String LL;
    public C16F5 LLILLJJLI;
    public C0TZ0 LLILLL;
    public FrameLayout LLILZ;
    public MeasureLinearLayout LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public int LLIZLLLIL;
    public boolean LLJ;

    public LiveCommentAddBlockKeywordsOptFragment() {
        this(null);
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final C0TZ0 MR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.acz) : null;
            this.LLILLL = (C0TZ0) viewFindViewById;
        }
        return (C0TZ0) viewFindViewById;
    }

    public final MeasureLinearLayout OR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.o4y) : null;
            this.LLILZIL = (MeasureLinearLayout) viewFindViewById;
        }
        return (MeasureLinearLayout) viewFindViewById;
    }

    public final C16F5 PR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.tz5) : null;
            this.LLILLJJLI = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.ga_);
        c500980Jkm.LIZJ = R.style.ahx;
        c500980Jkm.LJIIL = new ColorDrawable(R.drawable.dyl);
        c500980Jkm.LJII = 80;
        c500980Jkm.LJI = 0.0f;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        if (this.isViewValid) {
            C0TZ0 c0tz0MR = MR();
            if (c0tz0MR.LLILZLL) {
                C500260Jjc.LJIILJJIL(c0tz0MR.getBlockWordEditEtFromXml());
            }
        }
        super.onDestroyView();
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
    }

    public final CharSequence NR() {
        if (getContext() == null) {
            return C497740JfY.LJIJI(2131835597);
        }
        int iLIZLLL = C497740JfY.LIZLLL(R.attr.a1r, getContext());
        int iLIZIZ = C1331180kkG.LIZIZ(iLIZLLL, 102);
        SpannableString spannableString = new SpannableString(C497740JfY.LJIJI(2131835597));
        C786410Ut5.p2(spannableString, new C444920HcY(102, false), 0, spannableString.length(), 17);
        if (!PR().isEnabled()) {
            iLIZLLL = iLIZIZ;
        }
        C786410Ut5.p2(spannableString, new ForegroundColorSpan(iLIZLLL), 0, spannableString.length(), 17);
        return spannableString;
    }

    public LiveCommentAddBlockKeywordsOptFragment(String str) {
        this.LL = str;
        this.LLILZLL = C292401Bi.LIZ(new AwS556S0100000_12(this, 96));
        this.LLIZ = C292401Bi.LIZ(new AwS556S0100000_12(this, 95));
        this.LLIZLLLIL = 30;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    public final void RR(int i, boolean z) {
        MeasureLinearLayout measureLinearLayoutOR;
        if (!this.LLJ && (measureLinearLayoutOR = OR()) != null && this.isViewValid) {
            int iMin = Math.min(i + ((int) C497740JfY.LIZIZ(35.0f)), (int) ((((double) C14KS.LIZLLL()) * 0.9d) - ((double) measureLinearLayoutOR.getHeight())));
            if (!z) {
                iMin = 0;
            }
            C500260Jjc.LJJLJ(iMin, measureLinearLayoutOR);
            C0TZ0 c0tz0MR = MR();
            if (c0tz0MR.LLILZLL != z) {
                c0tz0MR.LLILZLL = z;
            }
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
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
        if (arguments != null && arguments.getBoolean("ignore_keyboards_change")) {
            z = true;
        } else {
            z = false;
        }
        this.LLJ = z;
        Bundle arguments2 = getArguments();
        int i = 30;
        if (arguments2 != null) {
            i = arguments2.getInt("MAX_SINGLE_WORD_LENGTH", 30);
        }
        this.LLIZLLLIL = i;
        RR(0, false);
        PR().setText(NR());
        C0TZ0 c0tz0MR = MR();
        int i2 = this.LLIZLLLIL;
        if (this.LLILZLL.getValue() != null) {
            zBooleanValue = ((Boolean) this.LLIZ.getValue()).booleanValue();
        } else {
            zBooleanValue = true;
        }
        if (this.LLILZLL.getValue() == null ? (interfaceC500940JkiUser = UserService.getInstance().user()) == null || (currentUser = interfaceC500940JkiUser.getCurrentUser()) == null || (secUid = currentUser.getSecUid()) == null : (room2 = (Room) this.LLILZLL.getValue()) == null || (owner = room2.getOwner()) == null || (secUid = owner.getSecUid()) == null) {
            secUid = "";
        }
        if (this.LLILZLL.getValue() != null && (room = (Room) this.LLILZLL.getValue()) != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        c0tz0MR.LJI(i2, zBooleanValue, secUid, id, "live_take_detail", new InterfaceC748700TYm() { // from class: X.0TYT
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
                Pair pair;
                C0TZ7 c0tz7 = C0TZ7.LIZ;
                DataChannel dataChannelLJ = C475510Ikn.LJ(this.LIZ);
                c0tz7.getClass();
                if (dataChannelLJ != null && (pair = (Pair) dataChannelLJ.gg0(C0TZA.class)) != null) {
                    ListProtector.add((List) pair.getFirst(), 0, blockWord);
                }
                DataChannel dataChannelLJ2 = C475510Ikn.LJ(this.LIZ);
                if (dataChannelLJ2 != null) {
                    EnumC748580TYa enumC748580TYa = EnumC748580TYa.BLOCK_KEYWORDS_OPT;
                    enumC748580TYa.pre();
                    dataChannelLJ2.zW(BroadcastDialogPageChannel.class, enumC748580TYa);
                }
            }

            @Override // X.InterfaceC748700TYm
            public final void LIZJ(boolean z2) {
                if (this.LIZ.PR().isEnabled() != z2) {
                    this.LIZ.PR().setEnabled(z2);
                    if (this.LIZ.getContext() != null) {
                        LiveCommentAddBlockKeywordsOptFragment liveCommentAddBlockKeywordsOptFragment = this.LIZ;
                        liveCommentAddBlockKeywordsOptFragment.PR().setText(liveCommentAddBlockKeywordsOptFragment.NR());
                        C786410Ut5.I7(new AbS162S0110000_12(liveCommentAddBlockKeywordsOptFragment, z2, 0), liveCommentAddBlockKeywordsOptFragment.PR());
                    }
                }
            }
        });
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.bmy);
            } else {
                viewFindViewById = null;
            }
            this.LLILZ = (FrameLayout) viewFindViewById;
        }
        C786410Ut5.I7(new AbS694S0100000_12(this, 0), viewFindViewById);
        if (!this.LLJ) {
            OR().setWindowInsetsEnable(true);
            OR().setWindowInsetsKeyboardObserver(this);
        }
    }

    @Override // X.InterfaceC19323110ij
    public final void u2(int i, boolean z) {
        RR(i, z);
    }
}
