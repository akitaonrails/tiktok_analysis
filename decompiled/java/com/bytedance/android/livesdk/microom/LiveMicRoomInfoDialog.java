package com.bytedance.android.livesdk.microom;

import X.AbstractC509530JyZ;
import X.C036E;
import X.C0IJT;
import X.C0IXW;
import X.C0JSG;
import X.C0JSH;
import X.C0JSI;
import X.C0JSJ;
import X.C0JSK;
import X.C0JSS;
import X.C0K9Q;
import X.C0KVU;
import X.C1099420eiS;
import X.C1142660fqC;
import X.C1161920gLG;
import X.C11NJ;
import X.C1322000kVS;
import X.C1324610kZf;
import X.C1324720kZq;
import X.C1331100kk8;
import X.C16F5;
import X.C16FS;
import X.C1812130xFz;
import X.C1819620xS4;
import X.C19EG;
import X.C19GO;
import X.C417600GZa;
import X.C474110IiX;
import X.C474500IjA;
import X.C492290JSh;
import X.C497740JfY;
import X.C500980Jkm;
import X.C501470JlZ;
import X.C510380Jzw;
import X.C518420KUu;
import X.C521850KdL;
import X.C766270U4b;
import X.C782110Um9;
import X.C786410Ut5;
import X.InterfaceC500940Jki;
import X.InterfaceC743640TFa;
import Y.ACListenerS142S0100000_7;
import Y.AcS494S0100000_7;
import Y.AfS176S0100000_7;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.comp.api.subscription.status.ISubscriptionStatusService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;
import com.bytedance.android.livesdk.microom.LiveMicRoomInfoDialog;
import com.bytedance.android.livesdk.microom.model.AnchorCardInfo;
import com.bytedance.android.livesdk.microom.model.MicRoomDialogOfficialInfo;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AwS586S0100000_7;
import org.json.JSONException;
import qo2.w;

/* JADX INFO: loaded from: classes8.dex */
public class LiveMicRoomInfoDialog extends LiveDialogFragment implements C0JSJ {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9HELIOSJSwvOyA8JWsAIDk2BSwvGyA8JQwiLyAXISQgJig=";
    public C16FS LL;
    public C16FS LLILLJJLI;
    public C0JSG LLILLL;
    public LinearLayout LLILZ;
    public ConstraintLayout LLILZIL;
    public C417600GZa LLILZLL;
    public C16F5 LLIZ;
    public C1324720kZq LLIZLLLIL;
    public C16FS LLJ;
    public LinearLayout LLJI;
    public C1324720kZq LLJIJIL;
    public C16F5 LLJILJIL;
    public C16F5 LLJILJILJ;
    public C16F5 LLJILLL;
    public ConstraintLayout LLJJ;
    public ConstraintLayout LLJJI;
    public C1324720kZq LLJJIII;
    public C16F5 LLJJIJI;
    public ConstraintLayout LLJJIJIIJIL;
    public LinearLayout LLJJIJIL;
    public LinearLayout LLJJJ;
    public C16F5 LLJJJIL;
    public C417600GZa LLJJJJ;
    public C16F5 LLJJJJJIL;
    public C16F5 LLJJJJLIIL;
    public C417600GZa LLJJL;
    public C16FS LLJJLIIIJLLLLLLLZ;
    public MicRoomDialogOfficialInfo LLJLLIL;
    public boolean LLJLLL;
    public Room LLJZ;
    public C19EG LLJZIJLIL;
    public C492290JSh LLL;
    public C0JSH LLLF;
    public C474110IiX LLLFF;
    public long LLLFFI;
    public String LLLFZ;
    public boolean LLLI;
    public int LLLII;
    public User LLLIIL;
    public final String LLJL = "livesdk_subscribe_icon_show";
    public final String LLJLIL = "livesdk_subscribe_icon_click";
    public final String LLJLILLLLZIIL = "profile_card";
    public final String LLJLL = "subscribe_";
    public final List<C0JSK> LLLIIII = new ArrayList();
    public final C11NJ LLLIIIIL = new C11NJ();
    public boolean LLLIIIL = true;

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean adaptEdgeToEdge() {
        return true;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.LLJLLL = false;
        C0JSH c0jsh = this.LLLF;
        if (c0jsh != null) {
            c0jsh.detachView();
        }
        this.LLLIIIIL.LJ();
        super.onDestroy();
    }

    @Override // X.C0JSJ
    public final void LLJJIJI() {
        View viewFindViewById = this.LLJJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.eu1) : null;
            this.LLJJ = (ConstraintLayout) viewFindViewById;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById;
        if (constraintLayout != null) {
            C786410Ut5.LL(8, constraintLayout);
        }
        C0JSG c0jsgNR = NR();
        if (c0jsgNR != null) {
            c0jsgNR.LIZJ();
        }
    }

    public final C16FS MR() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.b_4) : null;
            this.LLJ = (C16FS) viewFindViewById;
        }
        return (C16FS) viewFindViewById;
    }

    public final C0JSG NR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.fte) : null;
            this.LLILLL = (C0JSG) viewFindViewById;
        }
        return (C0JSG) viewFindViewById;
    }

    public final C16FS OR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.iec) : null;
            this.LL = (C16FS) viewFindViewById;
        }
        return (C16FS) viewFindViewById;
    }

    public final C16FS PR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.pih) : null;
            this.LLILLJJLI = (C16FS) viewFindViewById;
        }
        return (C16FS) viewFindViewById;
    }

    public final C417600GZa RR() {
        View viewFindViewById = this.LLJJL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.pii) : null;
            this.LLJJL = (C417600GZa) viewFindViewById;
        }
        return (C417600GZa) viewFindViewById;
    }

    public final C417600GZa SR() {
        View viewFindViewById = this.LLJJJJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.pik) : null;
            this.LLJJJJ = (C417600GZa) viewFindViewById;
        }
        return (C417600GZa) viewFindViewById;
    }

    public final LinearLayout UR() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.s84) : null;
            this.LLJI = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final C16FS VR() {
        View viewFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.wi1) : null;
            this.LLJJLIIIJLLLLLLLZ = (C16FS) viewFindViewById;
        }
        return (C16FS) viewFindViewById;
    }

    public final boolean WR() {
        AbstractC509530JyZ abstractC509530JyZLIZJ;
        C492290JSh c492290JSh = this.LLL;
        return (c492290JSh == null || (abstractC509530JyZLIZJ = c492290JSh.LIZJ()) == null || !abstractC509530JyZLIZJ.LIZ) ? false : true;
    }

    public final void aS() {
        SubscribeInfo subscribeInfo;
        Room room;
        Resources resources;
        Resources resources2;
        AnchorCardInfo anchorCardInfo;
        MicRoomDialogOfficialInfo micRoomDialogOfficialInfo = this.LLJLLIL;
        User user = (micRoomDialogOfficialInfo == null || (anchorCardInfo = micRoomDialogOfficialInfo.anchorCardInfo) == null) ? null : anchorCardInfo.currentUser;
        if (OR() == null || !this.isViewValid || this.LLJZ == null || user == null) {
            return;
        }
        int dimensionPixelSize = 0;
        if (user.getSubscribeInfo() == null || (subscribeInfo = user.getSubscribeInfo()) == null || !subscribeInfo.isAnchorQualified() || (room = this.LLJZ) == null || user.getId() != room.getOwnerUserId()) {
            return;
        }
        boolean zWR = WR();
        FollowInfo followInfo = user.getFollowInfo();
        long followStatus = followInfo != null ? followInfo.getFollowStatus() : -1L;
        if (followStatus != 1 && followStatus != 2 && !zWR) {
            OR().setText(2131853484);
            OR().setIcon((Drawable) null);
            OR().j0(R.style.a7b);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) OR().getLayoutParams();
            Context context = getContext();
            if (context != null && (resources2 = context.getResources()) != null) {
                dimensionPixelSize = resources2.getDimensionPixelSize(R.dimen.auw);
            }
            marginLayoutParams.setMarginEnd(dimensionPixelSize);
            C786410Ut5.x6(OR(), marginLayoutParams);
            C786410Ut5.LLJJJ(VR(), 8);
            C16FS c16fsMR = MR();
            if (c16fsMR != null) {
                c16fsMR.setText(2131853483);
                c16fsMR.setIcon((Drawable) null);
                return;
            }
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) OR().getLayoutParams();
        Context context2 = getContext();
        marginLayoutParams2.setMarginEnd((context2 == null || (resources = context2.getResources()) == null) ? 0 : resources.getDimensionPixelSize(R.dimen.auw));
        C786410Ut5.x6(OR(), marginLayoutParams2);
        OR().j0(R.style.a70);
        if (followStatus == 2) {
            OR().setIcon(R.drawable.f92);
        } else if (followStatus == 1) {
            OR().setIcon(R.drawable.f91);
        } else {
            OR().setIcon(R.drawable.f90);
        }
        OR().setText((CharSequence) null);
        C786410Ut5.LLJJJ(VR(), 0);
        final boolean zC70 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).c70();
        final boolean zWd2 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).wd2();
        final boolean zKw0 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).Kw0(this.dataChannel);
        C786410Ut5.h8(VR(), new View.OnClickListener() { // from class: X.0JSF
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws JSONException {
                AnchorCardInfo anchorCardInfo2;
                User user2;
                SubscribeInfo subscribeInfo2;
                boolean zBooleanValue;
                Long lValueOf;
                Long lValueOf2;
                Room room2;
                Boolean bool;
                if (zKw0) {
                    if (!zC70) {
                        ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).Bo1("profile", "", "-1");
                        return;
                    } else {
                        if (zWd2) {
                            return;
                        }
                        ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).i31("profile", false);
                        return;
                    }
                }
                LiveMicRoomInfoDialog liveMicRoomInfoDialog = this;
                MicRoomDialogOfficialInfo micRoomDialogOfficialInfo2 = liveMicRoomInfoDialog.LLJLLIL;
                if (micRoomDialogOfficialInfo2 == null || (anchorCardInfo2 = micRoomDialogOfficialInfo2.anchorCardInfo) == null || (user2 = anchorCardInfo2.currentUser) == null || user2.getSubscribeInfo() == null || (subscribeInfo2 = user2.getSubscribeInfo()) == null || !subscribeInfo2.isAnchorQualified()) {
                    return;
                }
                DataChannel dataChannel = liveMicRoomInfoDialog.dataChannel;
                if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(C0TZM.class)) != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = true;
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ(liveMicRoomInfoDialog.LLJLIL);
                Room room3 = liveMicRoomInfoDialog.LLJZ;
                if (room3 != null) {
                    lValueOf = Long.valueOf(room3.getOwnerUserId());
                } else {
                    lValueOf = null;
                }
                c474500IjALIZ.LJJII(lValueOf, "anchor_id");
                Room room4 = liveMicRoomInfoDialog.LLJZ;
                if (room4 != null) {
                    lValueOf2 = Long.valueOf(room4.getId());
                } else {
                    lValueOf2 = null;
                }
                c474500IjALIZ.LJJII(lValueOf2, "room_id");
                w.LIZ.getClass();
                c474500IjALIZ.LJJII(w.LJIIIZ(), "enter_from_merge");
                c474500IjALIZ.LJJII(w.LJIIL(), "enter_method");
                c474500IjALIZ.LJ("click");
                c474500IjALIZ.LJJII(w.LJIJI(), "request_id");
                c474500IjALIZ.LJJII(w.LJJII(), "video_id");
                c474500IjALIZ.LJJII(liveMicRoomInfoDialog.LLJLILLLLZIIL, "click_position");
                c474500IjALIZ.LJJII("user", "user_type");
                C518420KUu.LIZIZ(c474500IjALIZ, liveMicRoomInfoDialog.dataChannel);
                c474500IjALIZ.LJIJJLI(liveMicRoomInfoDialog.dataChannel);
                c474500IjALIZ.LIZ();
                C510380Jzw.LJIJJ(liveMicRoomInfoDialog.LLJLILLLLZIIL);
                if (!zBooleanValue) {
                    C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(liveMicRoomInfoDialog.LLJLL);
                    sbLIZ.append(liveMicRoomInfoDialog.LLJLILLLLZIIL);
                    c784440UpuLIZ.LIZIZ(new C0IF2(C2188811AlT.LIZIZ(sbLIZ)));
                    return;
                }
                C19EG c19eg = liveMicRoomInfoDialog.LLJZIJLIL;
                if (c19eg == null || (room2 = liveMicRoomInfoDialog.LLJZ) == null) {
                    return;
                }
                if (liveMicRoomInfoDialog.WR()) {
                    ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).w2();
                    C494790Jan.LJIIJJI(c19eg, room2, liveMicRoomInfoDialog.LLJLILLLLZIIL, null);
                } else {
                    ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).w2().LIZ(c19eg, room2, liveMicRoomInfoDialog.LLJLILLLLZIIL, null, null, 0L, 0L);
                }
                liveMicRoomInfoDialog.dismiss();
            }
        });
        if (zKw0) {
            if (!zC70) {
                VR().setText(C497740JfY.LJIJI(2131852340));
            } else if (zWd2) {
                VR().setText(C497740JfY.LJIJI(2131852338));
            } else {
                VR().setText(C497740JfY.LJIJI(2131852339));
            }
        } else if (WR()) {
            VR().setText(2131844491);
            VR().j0(R.style.a70);
        }
        C16FS c16fsMR2 = MR();
        if (c16fsMR2 != null) {
            c16fsMR2.setText("");
            c16fsMR2.setIcon(R.drawable.f8z);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(this.LLJL);
        Room room2 = this.LLJZ;
        c474500IjALIZ.LJJII(room2 != null ? Long.valueOf(room2.getOwnerUserId()) : null, "anchor_id");
        Room room3 = this.LLJZ;
        c474500IjALIZ.LJJII(room3 != null ? Long.valueOf(room3.getId()) : null, "room_id");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(w.LJIIIZ(), "enter_from_merge");
        c474500IjALIZ.LJJII(w.LJIIL(), "enter_method");
        c474500IjALIZ.LJ("click");
        c474500IjALIZ.LJJII(w.LJIJI(), "request_id");
        c474500IjALIZ.LJJII(w.LJJII(), "video_id");
        c474500IjALIZ.LJJII(this.LLJLILLLLZIIL, "show_entrance");
        c474500IjALIZ.LJJII("user", "user_type");
        C518420KUu.LIZIZ(c474500IjALIZ, this.dataChannel);
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LIZ();
        C510380Jzw.LJIJJLI(this.LLJLILLLLZIIL);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(this.LLLI ? R.layout.g8k : R.layout.g8l);
        boolean z = this.LLLI;
        c500980Jkm.LIZLLL = z;
        c500980Jkm.LJI = 0.0f;
        c500980Jkm.LIZJ = z ? R.style.ahb : R.style.ahg;
        c500980Jkm.LJII = z ? 80 : 5;
        c500980Jkm.LJIIJ = -1;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = null;
        this.LLJJI = null;
        this.LLJJIII = null;
        this.LLJJIJI = null;
        this.LLJJIJIIJIL = null;
        this.LLJJIJIL = null;
        this.LLJJJ = null;
        this.LLJJJIL = null;
        this.LLJJJJ = null;
        this.LLJJJJJIL = null;
        this.LLJJJJLIIL = null;
        this.LLJJL = null;
        this.LLJJLIIIJLLLLLLLZ = null;
    }

    @Override // X.C0JSJ
    public final void hide() {
        dismiss();
    }

    public final void bS(Throwable th) {
        if (!this.LLJLLL) {
            return;
        }
        if (th instanceof C501470JlZ) {
            C501470JlZ c501470JlZ = (C501470JlZ) th;
            C766270U4b.LJIIJJI(c501470JlZ.getPrompt());
            Context context = getContext();
            if (c501470JlZ.getErrorCode() == 4002173) {
                String strOQ1 = ((IHostResource) C1161920gLG.LIZJ(IHostResource.class)).OQ1(context);
                C782110Um9 c782110Um9 = new C782110Um9(context);
                c782110Um9.LJIIIZ(strOQ1);
                c782110Um9.LJIILIIL(2131851918, new AcS494S0100000_7(this, 6));
                c782110Um9.LJIIJ(2131844609, new InterfaceC743640TFa() { // from class: X.0JSL
                    @Override // X.InterfaceC743640TFa
                    public final void LIZ(LiveDialog liveDialog) {
                        liveDialog.dismiss();
                    }
                });
                C786410Ut5.E4(c782110Um9.LIZ());
                return;
            }
            return;
        }
        C766270U4b.LIZLLL(2131853482);
    }

    public final void cS(final User user) {
        final String str;
        String string;
        boolean z;
        long followStatus;
        this.LLLIIL = user;
        getContext();
        try {
            if (C036E.LIZ.LIZIZ()) {
                int i = this.LLLII;
                if (i == 0) {
                    str = "live_audience_c_anchor";
                } else if (i == 2) {
                    str = "right_anchor";
                } else {
                    str = "live_audience_c_audience";
                }
                if (!user.isFollowing()) {
                    Room room = this.LLJZ;
                    if (room != null) {
                        C0JSH c0jsh = this.LLLF;
                        if (c0jsh != null) {
                            room.getRequestId();
                            long id = user.getId();
                            long id2 = room.getId();
                            room.getLabels();
                            boolean z2 = this.LLLIIIL;
                            if (!c0jsh.LLILLL) {
                                c0jsh.LLILLL = true;
                                C11NJ c11nj = c0jsh.LL;
                                InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
                                C1099420eiS c1099420eiS = new C1099420eiS();
                                c1099420eiS.LIZIZ(id);
                                c1099420eiS.LIZLLL();
                                C1099420eiS c1099420eiS2 = c1099420eiS;
                                c1099420eiS2.LIZLLL();
                                c1099420eiS2.LJ(id2);
                                c1099420eiS2.LJI = z2;
                                c11nj.LIZ(interfaceC500940JkiUser.LIZ(new C1812130xFz(c1099420eiS2)).LJJZ(new AfS176S0100000_7(c0jsh, 202), new AfS176S0100000_7(c0jsh, 203), new C521850KdL(c0jsh, 6)));
                            }
                        }
                        User owner = room.getOwner();
                        if (C0IXW.LJFF(this.dataChannel) && user.getId() == owner.getId()) {
                            HashMap map = new HashMap();
                            map.put("refer", "card_follow_button");
                            HashMap map2 = new HashMap();
                            map2.put("anchor_id", String.valueOf(owner.getId()));
                            map2.put("room_id", String.valueOf(user.getId()));
                            C0IXW c0ixw = C0IXW.LIZ;
                            C0IXW.LIZ("live_ad", "follow", map, map2);
                        }
                    }
                    C474110IiX c474110IiX = this.LLLFF;
                    if (c474110IiX != null) {
                        long id3 = user.getId();
                        int i2 = this.LLLII;
                        if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).hI2().LJIIJ().LLJJJIL() == user.getId()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (user.getFollowInfo() != null) {
                            followStatus = user.getFollowInfo().getFollowStatus();
                        } else {
                            followStatus = 0;
                        }
                        c474110IiX.LIZ(i2, id3, followStatus, true, z, this.LLLI);
                        return;
                    }
                    return;
                }
                C19GO c19go = new C19GO(getContext());
                Context context = getContext();
                if (context != null) {
                    string = context.getString(2131842892, C0KVU.LIZ(user));
                } else {
                    string = null;
                }
                c19go.LJII = string;
                c19go.LJ(2131842891, new DialogInterface.OnClickListener(this, user, str) { // from class: X.0IiV
                    public final /* synthetic */ LiveMicRoomInfoDialog LLILLJJLI;
                    public final /* synthetic */ User LLILLL;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        boolean z3;
                        long id4;
                        dialogInterface.dismiss();
                        if (this.LL.getFollowInfo() == null) {
                            return;
                        }
                        LiveMicRoomInfoDialog liveMicRoomInfoDialog = this.LLILLJJLI;
                        C0JSH c0jsh2 = liveMicRoomInfoDialog.LLLF;
                        if (c0jsh2 != null) {
                            C19EG c19eg = liveMicRoomInfoDialog.LLJZIJLIL;
                            int followStatus2 = (int) this.LL.getFollowInfo().getFollowStatus();
                            long id5 = this.LLILLL.getId();
                            Room room2 = this.LLILLJJLI.LLJZ;
                            if (room2 != null) {
                                id4 = room2.getId();
                            } else {
                                id4 = 0;
                            }
                            C11NJ c11nj2 = c0jsh2.LL;
                            InterfaceC500940Jki interfaceC500940JkiUser2 = UserService.getInstance().user();
                            C485350J1p c485350J1p = new C485350J1p();
                            c485350J1p.LIZJ = c19eg;
                            c485350J1p.LIZIZ(id5);
                            c485350J1p.LIZLLL(followStatus2);
                            c485350J1p.LIZJ();
                            c485350J1p.LJ(id4);
                            c485350J1p.getClass();
                            c11nj2.LIZ(interfaceC500940JkiUser2.LJI(new C1812120xFy(c485350J1p)).LJJLL(new AfS176S0100000_7(c0jsh2, 204), new AfS176S0100000_7(c0jsh2, 205)));
                        }
                        C474110IiX c474110IiX2 = this.LLILLJJLI.LLLFF;
                        if (c474110IiX2 != null) {
                            long id6 = this.LL.getId();
                            int i4 = this.LLILLJJLI.LLLII;
                            if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).hI2().LJIIJ().LLJJJIL() == this.LL.getId()) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            c474110IiX2.LIZ(i4, id6, this.LL.getFollowInfo().getFollowStatus(), false, z3, this.LLILLJJLI.LLLI);
                        }
                        LiveMicRoomInfoDialog liveMicRoomInfoDialog2 = this.LLILLJJLI;
                        Room room3 = liveMicRoomInfoDialog2.LLJZ;
                        if (room3 != null) {
                            User user2 = this.LL;
                            if (C0IXW.LJFF(liveMicRoomInfoDialog2.dataChannel) && room3.getOwner() != null && user2.getId() == room3.getOwner().getId()) {
                                HashMap map3 = new HashMap();
                                map3.put("anchor_id", String.valueOf(room3.getOwner().getId()));
                                map3.put("room_id", String.valueOf(room3.getId()));
                                C0IXW c0ixw2 = C0IXW.LIZ;
                                C0IXW.LIZ("live_ad", "unfollow", null, map3);
                            }
                        }
                    }
                }, false);
                c19go.LIZJ(2131851524, new DialogInterface.OnClickListener() { // from class: X.0Im2
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        dialogInterface.dismiss();
                    }
                }, false);
                c19go.LJIIZILJ = new DialogInterface.OnDismissListener() { // from class: X.0Iia
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        C473050Igp.LIZIZ().LJ();
                    }
                };
                c19go.LJIJ = new DialogInterface.OnShowListener() { // from class: X.0JFw
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        C473050Igp.LIZIZ().LIZ();
                    }
                };
                C786410Ut5.M4(c19go.LIZ());
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C766270U4b.LIZLLL(2131843092);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Room room;
        super.onCreate(bundle);
        this.LLJLLL = true;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LLJZ = room;
        C0JSH c0jsh = this.LLLF;
        if (c0jsh != null) {
            c0jsh.attachView(this);
        }
        C0JSH c0jsh2 = this.LLLF;
        if (c0jsh2 != null) {
            c0jsh2.LLILLJJLI = this;
        }
        ISubscriptionStatusService.LJIIIZ.getClass();
        C492290JSh c492290JShFi2 = C0K9Q.LIZ().fi2(this.LLJZ, this, this);
        this.LLL = c492290JShFi2;
        if (c492290JShFi2 != null) {
            c492290JShFi2.LIZIZ(this, new AwS586S0100000_7(this, 158));
        }
        this.LLLIIIIL.LIZ(UserService.getInstance().user().LJFF().LJJLJLI(new AfS176S0100000_7(this, 77)));
    }

    public final void onEvent(FollowPair followPair) {
        boolean z;
        User user;
        boolean zIsFollowing;
        User user2;
        FollowInfo followInfo;
        User user3;
        User user4;
        boolean zIsFollowing2;
        AnchorCardInfo anchorCardInfo;
        User user5;
        FollowInfo followInfo2;
        AnchorCardInfo anchorCardInfo2;
        User user6;
        AnchorCardInfo anchorCardInfo3;
        User user7;
        AnchorCardInfo anchorCardInfo4;
        User user8;
        MicRoomDialogOfficialInfo micRoomDialogOfficialInfo = this.LLJLLIL;
        boolean z2 = true;
        boolean z3 = false;
        if (micRoomDialogOfficialInfo != null && (anchorCardInfo4 = micRoomDialogOfficialInfo.anchorCardInfo) != null && (user8 = anchorCardInfo4.currentUser) != null && followPair.LIZ == user8.getId()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            MicRoomDialogOfficialInfo micRoomDialogOfficialInfo2 = this.LLJLLIL;
            if (micRoomDialogOfficialInfo2 != null && (anchorCardInfo3 = micRoomDialogOfficialInfo2.anchorCardInfo) != null && (user7 = anchorCardInfo3.currentUser) != null) {
                user7.setFollowStatus(followPair.LIZ());
            }
            MicRoomDialogOfficialInfo micRoomDialogOfficialInfo3 = this.LLJLLIL;
            if (micRoomDialogOfficialInfo3 != null && (anchorCardInfo2 = micRoomDialogOfficialInfo3.anchorCardInfo) != null && (user6 = anchorCardInfo2.currentUser) != null) {
                zIsFollowing2 = user6.isFollowing();
            } else {
                zIsFollowing2 = false;
            }
            C16FS c16fsOR = OR();
            MicRoomDialogOfficialInfo micRoomDialogOfficialInfo4 = this.LLJLLIL;
            if (micRoomDialogOfficialInfo4 == null || (anchorCardInfo = micRoomDialogOfficialInfo4.anchorCardInfo) == null || (user5 = anchorCardInfo.currentUser) == null || (followInfo2 = user5.getFollowInfo()) == null || ((int) followInfo2.getFollowStatus()) != 3) {
                z2 = false;
            }
            dS(zIsFollowing2, c16fsOR, 2, z2);
            aS();
            return;
        }
        MicRoomDialogOfficialInfo micRoomDialogOfficialInfo5 = this.LLJLLIL;
        if (micRoomDialogOfficialInfo5 == null || (user = micRoomDialogOfficialInfo5.officialUser) == null || followPair.LIZ != user.getId()) {
            return;
        }
        MicRoomDialogOfficialInfo micRoomDialogOfficialInfo6 = this.LLJLLIL;
        if (micRoomDialogOfficialInfo6 != null && (user4 = micRoomDialogOfficialInfo6.officialUser) != null) {
            user4.setFollowStatus(followPair.LIZ());
        }
        MicRoomDialogOfficialInfo micRoomDialogOfficialInfo7 = this.LLJLLIL;
        if (micRoomDialogOfficialInfo7 != null && (user3 = micRoomDialogOfficialInfo7.officialUser) != null) {
            zIsFollowing = user3.isFollowing();
        } else {
            zIsFollowing = false;
        }
        C16FS c16fsPR = PR();
        MicRoomDialogOfficialInfo micRoomDialogOfficialInfo8 = this.LLJLLIL;
        if (micRoomDialogOfficialInfo8 != null && (user2 = micRoomDialogOfficialInfo8.officialUser) != null && (followInfo = user2.getFollowInfo()) != null && ((int) followInfo.getFollowStatus()) == 3) {
            z3 = true;
        }
        dS(zIsFollowing, c16fsPR, 1, z3);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01e1 A[LOOP:0: B:101:0x01df->B:102:0x01e1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b3  */
    @Override // X.C0JSJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vR(com.bytedance.android.livesdk.microom.model.MicRoomDialogOfficialInfo r19) {
        /*
            Method dump skipped, instruction units count: 2001
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.microom.LiveMicRoomInfoDialog.vR(com.bytedance.android.livesdk.microom.model.MicRoomDialogOfficialInfo):void");
    }

    public static void ZR(View view, ImageModel imageModel) {
        if (view != null) {
            if (LiveImageLoaderModuleSetting.useImageModule()) {
                if (C1819620xS4.LIZLLL(imageModel)) {
                    C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(imageModel.getUrls());
                    c1324610kZfLIZJ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
                    c1324610kZfLIZJ.LJIJI(Float.valueOf(((int) C497740JfY.LIZIZ(8)) + 0.0f));
                    c1324610kZfLIZJ.LJJI(view);
                    return;
                }
                return;
            }
            if (imageModel == null || !C0JSS.LIZIZ(view.getContext())) {
                return;
            }
            C1322000kVS c1322000kVSLJFF = C1322000kVS.LJFF(view.getContext());
            c1322000kVSLJFF.LIZLLL(C0JSS.LIZ(imageModel));
            int iLIZIZ = (int) C497740JfY.LIZIZ(8);
            if (c1322000kVSLJFF.LJIIIZ == null) {
                c1322000kVSLJFF.LJIIIZ = new C1331100kk8();
            }
            c1322000kVSLJFF.LJIIIZ.LJII(iLIZIZ);
            c1322000kVSLJFF.LJFF = imageModel;
            c1322000kVSLJFF.LIZ(ImageView.ScaleType.CENTER_CROP);
            c1322000kVSLJFF.LIZLLL = new C1142660fqC(imageModel, null);
            c1322000kVSLJFF.LIZJ(view);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        long id;
        OfficialChannelInfo officialChannelInfo;
        User user;
        C0JSG c0jsgNR;
        super.onViewCreated(view, bundle);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_audience_lineup_official_panel_show");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LIZ();
        View viewFindViewById = view.findViewById(R.id.qkw);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 81), viewFindViewById);
        }
        Context context = getContext();
        if (context != null && (c0jsgNR = NR()) != null) {
            c0jsgNR.setBuilder(new C0JSI(context, new ACListenerS142S0100000_7(this, 82)));
        }
        getContext();
        try {
            if (C036E.LIZ.LIZIZ()) {
                C0JSG c0jsgNR2 = NR();
                if (c0jsgNR2 != null) {
                    c0jsgNR2.LIZ();
                }
                C0JSH c0jsh = this.LLLF;
                if (c0jsh != null) {
                    Room room = this.LLJZ;
                    long ownerUserId = 0;
                    if (room != null && (officialChannelInfo = room.officialChannelInfo) != null && (user = officialChannelInfo.channelUser) != null) {
                        id = user.getId();
                    } else {
                        id = 0;
                    }
                    Room room2 = this.LLJZ;
                    if (room2 != null) {
                        ownerUserId = room2.getOwnerUserId();
                    }
                    c0jsh.LJJJJLI(id, ownerUserId);
                    return;
                }
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C0JSG c0jsgNR3 = NR();
        if (c0jsgNR3 != null) {
            c0jsgNR3.LIZIZ();
        }
    }

    public static void dS(boolean z, C16FS c16fs, int i, boolean z2) {
        if (i != 1) {
            if (i == 2) {
                if (!z) {
                    if (c16fs != null) {
                        c16fs.j0(R.style.a7b);
                    }
                    if (z2) {
                        if (c16fs != null) {
                            c16fs.setText(2131841702);
                            return;
                        }
                        return;
                    } else {
                        if (c16fs == null) {
                            return;
                        }
                        c16fs.setText(2131853484);
                        return;
                    }
                }
                if (c16fs == null) {
                    return;
                }
                c16fs.j0(R.style.a70);
                c16fs.setText(2131853485);
                return;
            }
            return;
        }
        if (!z) {
            if (c16fs != null) {
                c16fs.j0(R.style.a7s);
            }
            if (z2) {
                if (c16fs == null) {
                    return;
                }
                c16fs.setText(2131841702);
                return;
            } else {
                if (c16fs == null) {
                    return;
                }
                c16fs.setText(2131853484);
                return;
            }
        }
        if (c16fs == null) {
            return;
        }
        c16fs.j0(R.style.f942a75);
        c16fs.setText(2131853485);
    }
}
