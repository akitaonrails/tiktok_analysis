package com.bytedance.android.livesdk.chatroom.end.newaudienceend;

import X.C098200Yq;
import X.C0IER;
import X.C0IF6;
import X.C0IGR;
import X.C0IHY;
import X.C0IJT;
import X.C0IKC;
import X.C0IKD;
import X.C0IL8;
import X.C0ILH;
import X.C0ILI;
import X.C0ILL;
import X.C0ILM;
import X.C0ILN;
import X.C0ILV;
import X.C0ILZ;
import X.C0IMJ;
import X.C0IMV;
import X.C0IPN;
import X.C0IXL;
import X.C0KVU;
import X.C0TZM;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1119920fFW;
import X.C1121670fIL;
import X.C1126540fQC;
import X.C1133830fbx;
import X.C1143780fs0;
import X.C1148430fzV;
import X.C1161920gLG;
import X.C1295960jpS;
import X.C12ES;
import X.C1324610kZf;
import X.C1324720kZq;
import X.C1548820qPI;
import X.C1685300txQ;
import X.C16F5;
import X.C1819620xS4;
import X.C1834150xpV;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20441214yg;
import X.C20533215Wg;
import X.C2188811AlT;
import X.C2200821BBo;
import X.C464920ILa;
import X.C465060ILo;
import X.C468800IZy;
import X.C473030Ign;
import X.C474500IjA;
import X.C475510Ikn;
import X.C486790J7d;
import X.C497740JfY;
import X.C521900KdQ;
import X.C748970TZn;
import X.C749140Ta4;
import X.C749160Ta6;
import X.C750250Tbr;
import X.C786410Ut5;
import X.C924790aAn;
import X.InterfaceC465090ILr;
import X.InterfaceC468830Ia1;
import X.InterfaceC473070Igr;
import X.InterfaceC517340KQq;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS142S0100000_7;
import Y.AObjectS350S0100000_7;
import Y.ARunnableS107S0100000_7;
import Y.ARunnableS76S0200000_7;
import Y.ARunnableS86S0000000_7;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.feed.api.TopLiveSkylightVisibilityChannel;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.room.DispatchRoomLoadEvent;
import com.bytedance.android.livesdk.SwipeNextEvent;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.livesetting.OptAvatarLargeUseSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveTopTabSwitch;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdk.model.message.ControlMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.widget.LiveDebugInfoWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidgetProviderProxy;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public class LiveNewAudienceEndFragment extends BaseFragment implements InterfaceC465090ILr, C0IKD, C0IGR, View.OnClickListener, InterfaceC468830Ia1 {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9Ky0tPT08JyhiLCE3HELIOSZispPi4mLCwpJyw2LSsoZwM6PiACLDgSPSElLCEwLQAiLQkhKSIhLCEn";
    public C465060ILo LL;
    public DataChannel LLILLJJLI;
    public Room LLILZ;
    public C0IF6 LLILZIL;
    public ControlMessage LLIZ;
    public PunishEventInfo LLIZLLLIL;
    public C16F5 LLJ;
    public View LLJI;
    public View LLJIJIL;
    public View LLJILJIL;
    public View LLJILJILJ;
    public ImageView LLJILLL;
    public C1324720kZq LLJJ;
    public C0IMJ LLJJI;
    public C16F5 LLJJIII;
    public C16F5 LLJJIJI;
    public LiveIconView LLJJIJIIJIL;
    public View LLJJIJIL;
    public C16F5 LLJJJ;
    public C16F5 LLJJJIL;
    public C1295960jpS LLJJJJ;
    public C1126540fQC LLJJJJJIL;
    public View LLJJJJLIIL;
    public View LLJJL;
    public LiveIconView LLJJLIIIJLLLLLLLZ;
    public LiveIconView LLJL;
    public volatile boolean LLJLILLLLZIIL;
    public LiveDebugInfoWidget LLJLL;
    public RecyclableWidgetManager LLJLLIL;
    public boolean LLJLLL;
    public String LLJZIJLIL;
    public long LLL;
    public boolean LLLF;
    public int LLLFFI;
    public boolean LLLI;
    public boolean LLLII;
    public String LLLIL;
    public C468800IZy LLLILZJ;
    public View LLLILZLLLI;
    public View LLLIZZ;
    public C16F5 LLLJ;
    public C16F5 LLLJIL;
    public C16F5 LLLJL;
    public final BPEAHandler LLILLL = new BPEAHandler(Looper.getMainLooper());
    public long LLILZLL = 0;
    public int LLJLIL = 0;
    public int LLJZ = 0;
    public boolean LLLFF = false;
    public int LLLFZ = 0;
    public long LLLIIII = -1;
    public String LLLIIIIL = "user_swipe";
    public boolean LLLIIIL = false;
    public boolean LLLIIL = false;
    public boolean LLLIILIL = false;
    public final long LLLILZ = SystemClock.elapsedRealtime();
    public boolean LLLL = false;
    public List<Room> LLLLII = null;
    public C0ILL LLLLIIIILLL = null;
    public final ARunnableS107S0100000_7 LLLLIIL = new ARunnableS107S0100000_7(this, 218);
    public final ARunnableS107S0100000_7 LLLLIILL = new ARunnableS107S0100000_7(this, 219);

    @Override // X.InterfaceC468830Ia1
    public final void Z3() {
    }

    @Override // X.InterfaceC465090ILr
    public final /* synthetic */ void az(Room room) {
    }

    @Override // X.InterfaceC465090ILr
    public final void Fc() {
        C1295960jpS c1295960jpS;
        if (this.LLJJIJIIJIL == null || (c1295960jpS = this.LLJJJJ) == null || this.LLJJJJJIL == null) {
            return;
        }
        C786410Ut5.LLD(8, c1295960jpS);
        C786410Ut5.LLJJI(this.LLJJJJJIL, 8);
        C786410Ut5.LLJJIJIL(this.LLJJIJIIJIL, 0);
        cS(false);
    }

    @Override // X.InterfaceC468830Ia1
    public final void No() {
        if (this.LLLFF) {
            this.LLLFF = false;
            this.LLJLIL = 7;
            dS();
        }
    }

    public final int RR() {
        return this.LLJJJIL.getHeight() + ((int) C497740JfY.LIZIZ(4.0f)) + this.LLJI.getHeight() + ((int) C497740JfY.LIZIZ(12.0f));
    }

    public final int SR() {
        return ((int) C497740JfY.LIZIZ(16.0f)) + this.LLJJIJIL.getHeight() + ((int) C497740JfY.LIZIZ(16.0f));
    }

    public final void WR() {
        int i;
        float fLIZIZ;
        int itemSize = this.LLJJI.getItemSize();
        if (itemSize == 0) {
            return;
        }
        if (itemSize == 4) {
            fLIZIZ = C497740JfY.LIZIZ(328.0f);
        } else {
            if (itemSize != 2) {
                i = 0;
                ViewGroup.LayoutParams layoutParams = this.LLJJI.getLayoutParams();
                layoutParams.height = i;
                C0IMJ c0imj = this.LLJJI;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0imj);
                c0imj.setLayoutParams(layoutParams);
            }
            fLIZIZ = C497740JfY.LIZIZ(164.0f);
        }
        i = (int) fLIZIZ;
        ViewGroup.LayoutParams layoutParams2 = this.LLJJI.getLayoutParams();
        layoutParams2.height = i;
        C0IMJ c0imj2 = this.LLJJI;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0imj2);
        c0imj2.setLayoutParams(layoutParams2);
    }

    public final void ZR() {
        C16F5 c16f5 = this.LLJJJ;
        if (c16f5 != null) {
            c16f5.setText(C497740JfY.LJIJI(2131841530));
        }
        C16F5 c16f52 = this.LLJJJIL;
        if (c16f52 != null) {
            C786410Ut5.LLJJJJ(c16f52, 4);
        }
    }

    public final void aS() {
        this.LLLIIIIL = "auto_swipe";
        OR("scheduleNext");
        if (this.LLLI) {
            ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).searchScrollToNextItem(false);
        } else if (this.LLLII) {
            ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).mixLiveScrollToNextItem(false);
        } else {
            DataChannel dataChannel = this.LLILLJJLI;
            if (dataChannel != null) {
                dataChannel.zW(SwipeNextEvent.class, Long.valueOf(this.LLILZLL));
            }
        }
        this.LLJLIL--;
        C16F5 c16f5 = this.LLJJJIL;
        if (c16f5 != null) {
            C786410Ut5.LLJJJJ(c16f5, 4);
        }
    }

    public final void bS() {
        if (this.LLLIIII >= 0 && ((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).pc1()) {
            User shareExternalLinkShareUser = ((IHostShare) C1161920gLG.LIZJ(IHostShare.class)).getShareExternalLinkShareUser(this.LLLIIII);
            if (shareExternalLinkShareUser == null) {
                ((IHostShare) C1161920gLG.LIZJ(IHostShare.class)).registerShareUserInfoListener(this.LLLIIII, new InterfaceC473070Igr() { // from class: X.0ILK
                    @Override // X.InterfaceC473070Igr
                    public final void LIZ(User user) {
                        this.LIZ.VR(user);
                    }
                });
            } else {
                VR(shareExternalLinkShareUser);
            }
        }
    }

    public final void dS() {
        if (this.LLLL) {
            C20441214yg.LIZIZ("leave_mic_opt", "startSwipeTimer return as isFilterStartTimer is true");
            return;
        }
        C20441214yg.LIZIZ("leave_mic_opt", "startSwipeTimer");
        this.LLLF = true;
        this.LLILLL.removeCallbacksAndMessages(null);
        C786410Ut5.LJLLLLLL(0, this.LLJI);
        C786410Ut5.LJJZZIII(this.LLILLL, this.LLLLIILL);
    }

    @Override // X.C0IGR
    public final boolean onBackPressed() {
        C0IF6 c0if6 = this.LLILZIL;
        if (c0if6 == null) {
            return false;
        }
        c0if6.onBackPressed();
        return true;
    }

    public final int UR() {
        return SR() + ((int) C497740JfY.LIZIZ(8.0f)) + ((int) C497740JfY.LIZIZ(200.0f)) + ((int) C497740JfY.LIZIZ(12.0f)) + RR();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        BPEAHandler bPEAHandler = this.LLILLL;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacksAndMessages(null);
        }
        OR("onDestroy");
        C465060ILo c465060ILo = this.LL;
        WeakHandler weakHandler = c465060ILo.LL;
        if (weakHandler != null) {
            weakHandler.removeCallbacks(new ARunnableS86S0000000_7(10));
        }
        C473030Ign c473030Ign = c465060ILo.LLILZ;
        if (c473030Ign != null) {
            c473030Ign.LIZ.LJ();
        }
        C468800IZy c468800IZy = this.LLLILZJ;
        if (c468800IZy != null) {
            C1548820qPI.LJIIIIZZ("live_event_update_result", c468800IZy);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        BPEAHandler bPEAHandler = this.LLILLL;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacksAndMessages(null);
        }
        ZR();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (!this.LLJLILLLLZIIL) {
            gS(false);
            this.LLLIILIL = true;
        } else {
            BPEAHandler bPEAHandler = this.LLILLL;
            if (bPEAHandler != null) {
                bPEAHandler.removeCallbacksAndMessages(null);
            }
        }
    }

    @Override // X.InterfaceC468830Ia1
    public final void Gf(boolean z) {
        hS(z);
    }

    public final void NR(int i) {
        int i2;
        if (getContext() == null) {
            return;
        }
        if (i != 1) {
            if (i != 2 && i == 3) {
                i2 = R.attr.ctg;
            } else {
                i2 = R.attr.ctc;
            }
        } else {
            i2 = R.attr.ctd;
        }
        LiveIconView liveIconView = this.LLJJLIIIJLLLLLLLZ;
        if (liveIconView != null) {
            liveIconView.setIconAttr(i2);
        }
    }

    public final void OR(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearGuestReviewDialogController source:");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("leave_mic_opt", C2188811AlT.LIZIZ(sbLIZ));
        C0ILL c0ill = this.LLLLIIIILLL;
        if (c0ill != null) {
            c0ill.LIZIZ();
            this.LLLLIIIILLL = null;
        }
    }

    public final <T extends View> T PR(int i) {
        if (getView() == null) {
            return null;
        }
        return (T) getView().findViewById(i);
    }

    public final void VR(User user) {
        ViewStub viewStub = (ViewStub) PR(R.id.n60);
        if (viewStub != null && user != null) {
            viewStub.setLayoutInflater(C1834150xpV.LIZJ(C786410Ut5.ne(getContext())));
            this.LLLIZZ = C786410Ut5.LJLLLL(viewStub);
            HandlerHook.viewPost(this.LLLIZZ, new ARunnableS76S0200000_7(user, this, 5));
        }
    }

    public final void cS(boolean z) {
        C786410Ut5.LJLLLLLL(8, this.LLJJL);
        if (z) {
            C786410Ut5.LJLLLLLL(0, this.LLJJL);
            if (!((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).isNotificationEnabled(getContext()) || !((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getPushLiveState()) {
                this.LLJJLIIIJLLLLLLLZ.setIconAttr(R.attr.ctg);
            }
        }
    }

    @Override // X.InterfaceC465090ILr
    public final void ed(Room room) {
        int i;
        View viewFindViewById;
        Room room2;
        View view;
        boolean z;
        User owner;
        String strValueOf;
        ImageModel avatarLarge;
        OfficialChannelInfo officialChannelInfo;
        User user;
        OfficialChannelInfo officialChannelInfo2;
        User user2;
        String strLIZ;
        String string;
        OfficialChannelInfo officialChannelInfo3;
        OfficialChannelInfo officialChannelInfo4;
        User user3;
        if (!isAdded()) {
            return;
        }
        this.LLILZ = room;
        if (room != null && room.getStats() != null) {
            i = room.getStats().replayViewers;
        } else {
            i = 0;
        }
        if (i <= 0) {
            C16F5 c16f5 = this.LLJJIII;
            if (c16f5 != null) {
                C786410Ut5.LLJJJJ(c16f5, 8);
            }
        } else {
            String strLIZ2 = C0IMV.LIZ(i);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZ2);
            sbLIZ.append(" ");
            sbLIZ.append(C497740JfY.LJIJI(2131852421));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C16F5 c16f52 = this.LLJJIII;
            if (c16f52 != null) {
                c16f52.setText(strLIZIZ);
            }
        }
        if (this.LLJILLL != null && this.LLJJ != null && (view = this.LLJJJJLIIL) != null) {
            C786410Ut5.LJLLLLLL(8, view);
            IMicRoomService iMicRoomService = (IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class);
            if (iMicRoomService != null && iMicRoomService.n42(this.LLILZ) && iMicRoomService.TM(this.LLILZ)) {
                z = true;
            } else {
                z = false;
            }
            Room room3 = this.LLILZ;
            ImageModel avatarMedium = null;
            if (room3 != null) {
                owner = room3.getOwner();
                if (owner != null && this.LLILLL != null && this.LLJJJ != null) {
                    if (z) {
                        Room room4 = this.LLILZ;
                        if (room4 != null && (officialChannelInfo4 = room4.officialChannelInfo) != null && (user3 = officialChannelInfo4.channelUser) != null) {
                            avatarMedium = user3.getAvatarMedium();
                        }
                        C1121670fIL.LJIIL(this.LLJILLL, avatarMedium, 2130975647);
                    } else {
                        C1121670fIL.LJIIL(this.LLJILLL, owner.getAvatarMedium(), 2130975647);
                    }
                    C786410Ut5.Q7(this.LLJILLL, new ACListenerS142S0100000_7(this, 265));
                    if (this.LLJ != null) {
                        Room room5 = this.LLILZ;
                        if (room5 != null && (officialChannelInfo3 = room5.officialChannelInfo) != null) {
                            strLIZ = C0KVU.LIZ(officialChannelInfo3.channelUser);
                        } else {
                            strLIZ = "";
                        }
                        if (z) {
                            this.LLJ.setText(strLIZ);
                            string = getString(2131841693, strLIZ);
                        } else {
                            String strLIZ3 = C0KVU.LIZ(owner);
                            this.LLJ.setText(strLIZ3);
                            string = getString(2131841693, strLIZ3);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                        int length = spannableStringBuilder.length();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(" ");
                        sbLIZ2.append(getString(2131841694));
                        spannableStringBuilder.append((CharSequence) C2188811AlT.LIZIZ(sbLIZ2));
                        C1119920fFW.LJ(getContext(), spannableStringBuilder, 0, length, 33, 6, 400);
                        C1119920fFW.LJ(getContext(), spannableStringBuilder, length + 1, spannableStringBuilder.length(), 33, 6, 500);
                    }
                }
            } else {
                owner = null;
            }
            float fLJIIJ = C12ES.LJIIJ(getContext()) / C12ES.LJIIIIZZ(getContext());
            if (owner != null) {
                if (z) {
                    if (OptAvatarLargeUseSetting.INSTANCE.enable()) {
                        Room room6 = this.LLILZ;
                        if (room6 != null && (officialChannelInfo2 = room6.officialChannelInfo) != null && (user2 = officialChannelInfo2.channelUser) != null) {
                            avatarLarge = user2.getAvatarThumb();
                        }
                    } else {
                        Room room7 = this.LLILZ;
                        if (room7 != null && (officialChannelInfo = room7.officialChannelInfo) != null && (user = officialChannelInfo.channelUser) != null) {
                            avatarLarge = user.getAvatarLarge();
                        }
                    }
                } else if (OptAvatarLargeUseSetting.INSTANCE.enable()) {
                    avatarLarge = owner.getAvatarThumb();
                } else {
                    avatarLarge = owner.getAvatarLarge();
                }
                if (avatarLarge != null && avatarLarge.getUrls() != null && !avatarLarge.getUrls().isEmpty()) {
                    C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(avatarLarge.getUrls());
                    c1324610kZfLIZJ.LJIIZILJ = fLJIIJ;
                    c1324610kZfLIZJ.LJIJ = 8;
                    c1324610kZfLIZJ.LJJI(this.LLJJ);
                }
            }
            Room room8 = this.LLILZ;
            if (room8 != null && room8.getOwner() != null && this.LLILZ.getOwner().getFollowInfo() != null && this.LLJJIJIIJIL != null && this.LLJJJJ != null && this.LLJJJJJIL != null) {
                long followStatus = this.LLILZ.getOwner().getFollowInfo().getFollowStatus();
                if (followStatus != 1 && followStatus != 2) {
                    C786410Ut5.LLJJIJIL(this.LLJJIJIIJIL, 0);
                    C786410Ut5.LLD(8, this.LLJJJJ);
                    C786410Ut5.LLJJI(this.LLJJJJJIL, 8);
                }
            }
            if (owner != null && owner.getFollowInfo() != null) {
                if (owner.getFollowInfo().getFollowStatus() != 1 && owner.getFollowInfo().getFollowStatus() != 2) {
                    cS(false);
                } else {
                    cS(true);
                }
            }
            if (this.LL != null && owner != null) {
                HashMap map = new HashMap();
                map.put("target_uid", String.valueOf(owner.getId()));
                map.put("sec_target_uid", UserService.getInstance().user().LJIJ(owner.getId()));
                map.put("packed_level", String.valueOf(2));
                map.put("current_room_id", String.valueOf(this.LLILZ.getId()));
                map.put("request_from", "live_push_settings");
                if (this.LLILZ.getOwner() != null) {
                    strValueOf = String.valueOf(this.LLILZ.getOwner().getId());
                } else {
                    strValueOf = CardStruct.IStatusCode.DEFAULT;
                }
                map.put("anchor_id", strValueOf);
                map.put("sec_anchor_id", UserService.getInstance().user().LJIJ(this.LLILZ.getOwnerUserId()));
                C465060ILo c465060ILo = this.LL;
                C0ILN c0iln = new C0ILN(this);
                c465060ILo.getClass();
                UserService.getInstance().user().LJIIJ("audienceEnd_show", map).LIZ(new C521900KdQ(c0iln, 0));
            }
        }
        if (!C0IER.LIZJ(getContext()) && (room2 = this.LLILZ) != null && room2.getOwner() != null) {
            C468800IZy c468800IZy = new C468800IZy();
            this.LLLILZJ = c468800IZy;
            c468800IZy.LIZJ(String.valueOf(this.LLILZ.getOwner().getId()), new C0ILI(this));
        }
        if (this.LLILZ != null && getView() != null) {
            if ((!((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline() && !((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLiveInhouse() && !((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isRegressionTest() && !((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) || (viewFindViewById = getView().findViewById(R.id.fgl)) == null) {
                return;
            }
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
            Boolean bool = C0IHY.LIZ;
            if (bool == null || !bool.booleanValue()) {
                return;
            }
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
            if (this.LLJLL == null) {
                this.LLJLL = new LiveDebugInfoWidget();
            }
            if (this.LLJLLL) {
                return;
            }
            LiveDebugInfoWidget liveDebugInfoWidget = this.LLJLL;
            liveDebugInfoWidget.args = new Object[]{this.LLILZ};
            this.LLJLLL = true;
            this.LLJLLIL.load(R.id.fgl, liveDebugInfoWidget);
        }
    }

    public final void gS(boolean z) {
        C465060ILo c465060ILo = this.LL;
        if (c465060ILo != null) {
            if (z) {
                c465060ILo.LIZJ(this.LLILZLL);
            } else if (!this.LLLIILIL || !getUserVisibleHint()) {
                return;
            }
            C465060ILo c465060ILo2 = this.LL;
            long j = this.LLILZLL;
            WeakHandler weakHandler = c465060ILo2.LL;
            if (weakHandler != null) {
                C0ILZ.LIZ(weakHandler, j, 0L);
            }
            this.LLLIIIL = false;
        }
    }

    public final void hS(boolean z) {
        if (z) {
            this.LLLJL.setText(2131851061);
            this.LLLJL.setBackgroundResource(R.drawable.dkb);
        } else {
            this.LLLJL.setText(2131851060);
            this.LLLJL.setBackgroundResource(R.drawable.dk_);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Room room;
        final User owner;
        String string;
        if (view.getId() == R.id.pf4 && (room = this.LLILZ) != null && (owner = room.getOwner()) != null && owner.getFollowInfo() != null) {
            if (view.getId() == R.id.pf4) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_finish_bell_click");
                c474500IjALIZ.LJIJJLI(this.LLILLJJLI);
                c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
                c474500IjALIZ.LIZ();
            }
            C16F5 c16f5 = this.LLJ;
            if (c16f5 != null && !TextUtils.isEmpty(c16f5.getText())) {
                string = this.LLJ.getText().toString();
            } else {
                string = "";
            }
            int pushStatus = (int) owner.getFollowInfo().getPushStatus();
            this.LLJLILLLLZIIL = true;
            C0IL8 c0il8 = new C0IL8();
            c0il8.LIZIZ = String.valueOf(owner.getId());
            c0il8.LIZ = String.valueOf(this.LLILZ.getId());
            c0il8.LIZJ = "live_end";
            c0il8.LIZLLL = "live_cover";
            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).showNotificationTipDialog(C0KVU.LIZLLL(owner), String.valueOf(owner.getId()), string, owner.getSecUid(), pushStatus, view, getString(2131843721, string), c0il8, ((Boolean) this.LLILLJJLI.gg0(C0TZM.class)).booleanValue(), new InterfaceC517340KQq() { // from class: X.0ILJ
                @Override // X.InterfaceC517340KQq
                public final void LIZIZ() {
                    this.LIZIZ.LLJLILLLLZIIL = false;
                }

                @Override // X.InterfaceC517340KQq
                public final void LIZ(int i) {
                    this.LIZIZ.NR(i);
                    owner.getFollowInfo().setPushStatus(i);
                }
            });
            BPEAHandler bPEAHandler = this.LLILLL;
            if (bPEAHandler != null) {
                bPEAHandler.removeCallbacksAndMessages(null);
                C786410Ut5.LJLIIL(3000L, this.LLILLL, new ARunnableS107S0100000_7(this, 220));
            }
            ZR();
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
            xw(this.LLLLII);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean zLJI = MethodIDManager.LJI(72063);
        super.onCreate(bundle);
        this.LLILLJJLI = C475510Ikn.LJ(this);
        C465060ILo c465060ILo = new C465060ILo(this);
        this.LL = c465060ILo;
        c465060ILo.LLILLL = this.LLILZIL;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LLJZ = arguments.getInt("room_position", -1);
            this.LLJZIJLIL = arguments.getString("show_reason", "");
            this.LLL = arguments.getLong("watch_live_duration", 0L);
            this.LLLF = arguments.getBoolean("can_swipe_next", false);
            this.LLLFFI = arguments.getInt("live_end_reason", 0);
            this.LLLFZ = arguments.getInt("enter_live_alive", 0);
            this.LLLI = arguments.getBoolean("enter_live_is_from_search", false);
            this.LLLII = arguments.getBoolean("is_mix_live", false);
            this.LLLIIII = arguments.getLong("deeplink_share_user_id", -1L);
        }
        if (this.LLILLJJLI != null) {
            C0ILL c0illZM = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).ZM(getActivity(), this.LLILLJJLI);
            this.LLLLIIIILLL = c0illZM;
            if (c0illZM != null) {
                c0illZM.LIZJ(new C0ILM(this));
                this.LLLL = true;
            }
            this.LLILLJJLI.EQ2(this, DispatchRoomLoadEvent.class, new AObjectS350S0100000_7(this, 98));
            this.LLILLJJLI.SX0(C748970TZn.class, Integer.valueOf(this.LLLFFI));
        }
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            C0IKC c0ikc = (C0IKC) dataChannel.gg0(C749140Ta4.class);
            if (c0ikc == null) {
                c0ikc = new C0IKC();
                this.LLILLJJLI.SX0(C749140Ta4.class, c0ikc);
            }
            C0IXL c0ixl = (C0IXL) DataChannelGlobal.LLILZ.gg0(C1148430fzV.class);
            if (c0ixl != null) {
                c0ixl.LJJIJ = 1;
                String str = c0ixl.LIZ;
                c0ixl.LJJIJIIJIL = str;
                String str2 = c0ixl.LIZIZ;
                c0ixl.LJJIJIIJI = str2;
                String str3 = c0ixl.LJFF;
                c0ixl.LJJIJIL = str3;
                c0ikc.LIZIZ = str;
                c0ikc.LIZ = str2;
                c0ikc.LIZJ = str3;
                if (!TextUtils.equals("normal", this.LLJZIJLIL) && this.LLLFZ != 1) {
                    c0ikc.LIZLLL = "recommend";
                    c0ixl.LJJIJL = "recommend";
                } else {
                    c0ikc.LIZLLL = "live_end";
                    c0ixl.LJJIJL = "live_end";
                }
            }
        }
        gS(true);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/bytedance/android/livesdk/chatroom/end/newaudienceend/LiveNewAudienceEndFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CJOQQvvt2bwOJ0ngcd/nOrCXG3GRVkBoBdegu0IXtmhXq/7mKhs9a9tsdNBjqnymU5WWCf7", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        this.LLLIIL = z;
        if (z) {
            if (!this.LLJLILLLLZIIL) {
                gS(false);
            }
        } else {
            BPEAHandler bPEAHandler = this.LLILLL;
            if (bPEAHandler != null) {
                bPEAHandler.removeCallbacksAndMessages(null);
            }
            ZR();
            C0IMV.LIZIZ(this.LLILLJJLI, this.LLLIIIIL);
            String str = this.LLLIIIIL;
            C0IXL c0ixl = (C0IXL) DataChannelGlobal.LLILZ.gg0(C1148430fzV.class);
            if (c0ixl != null) {
                c0ixl.LJJIJ = 1;
                c0ixl.LJJIJLIJ = str;
            }
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(getClass());
        }
    }

    @Override // X.InterfaceC465090ILr
    public final void xg(Room room) {
        if (room != null && this.LLJJIJIIJIL != null && this.LLJJJJ != null && this.LLJJJJJIL != null) {
            if (room.getOwner() != null && room.getOwner().getFollowInfo() != null && room.getOwner().getFollowInfo().getFollowStatus() != 1 && room.getOwner().getFollowInfo().getFollowStatus() != 2) {
                C786410Ut5.LLJJIJIL(this.LLJJIJIIJIL, 0);
            } else {
                C786410Ut5.LLJJIJIL(this.LLJJIJIIJIL, 8);
            }
            C786410Ut5.LLD(8, this.LLJJJJ);
            C786410Ut5.LLJJI(this.LLJJJJJIL, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c9 A[PHI: r9 r10
      0x00c9: PHI (r9v3 boolean) = (r9v2 boolean), (r9v5 boolean) binds: [B:99:0x0210, B:33:0x00c7] A[DONT_GENERATE, DONT_INLINE]
      0x00c9: PHI (r10v3 boolean) = (r10v2 boolean), (r10v4 boolean) binds: [B:99:0x0210, B:33:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0206  */
    @Override // X.InterfaceC465090ILr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void xw(java.util.List<com.bytedance.android.livesdkapi.depend.model.live.Room> r13) {
        /*
            Method dump skipped, instruction units count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveNewAudienceEndFragment.xw(java.util.List):void");
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        DataChannel dataChannel;
        super.onViewCreated(view, bundle);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveNewAudienceEndFragment_onViewCreated context:");
        Context context = getContext();
        Objects.requireNonNull(context);
        sbLIZ.append(context.hashCode());
        C20441214yg.LJIIIZ("leave_mic_opt", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJLLIL = RecyclableWidgetManager.of(this, view, LiveWidgetProviderProxy.getInstance(), C486790J7d.LIZ);
        this.LLJIJIL = PR(R.id.qkx);
        this.LLJILJIL = PR(R.id.qkz);
        this.LLJI = PR(R.id.p8q);
        View viewPR = PR(R.id.nnp);
        this.LLJJJJLIIL = viewPR;
        C786410Ut5.LJLLLLLL(0, viewPR);
        this.LLJ = (C16F5) PR(R.id.b0x);
        this.LLJILLL = (ImageView) PR(R.id.azx);
        this.LLJILJILJ = PR(R.id.jjh);
        this.LLJJ = (C1324720kZq) PR(R.id.bp1);
        C0IMJ c0imj = (C0IMJ) PR(R.id.sxx);
        this.LLJJI = c0imj;
        if (c0imj != null) {
            c0imj.setDataChannel(this.LLILLJJLI);
            this.LLJJI.setIView(this);
        }
        this.LLJJIII = (C16F5) PR(R.id.thd);
        this.LLJJIJI = (C16F5) PR(R.id.warning_tip);
        this.LLJJJIL = (C16F5) PR(R.id.cfb);
        this.LLJJIJIL = PR(R.id.pcn);
        this.LLJJJ = (C16F5) PR(R.id.pd7);
        C786410Ut5.LLJJJJ(this.LLJJJIL, 4);
        ViewStub viewStub = (ViewStub) PR(R.id.mxa);
        if (viewStub != null) {
            viewStub.setLayoutInflater(C1834150xpV.LIZJ(C786410Ut5.ne(getContext())));
            View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
            this.LLLILZLLLI = viewLJLLLL;
            this.LLLJ = (C16F5) viewLJLLLL.findViewById(R.id.mxr);
            this.LLLJIL = (C16F5) this.LLLILZLLLI.findViewById(R.id.mxc);
            this.LLLJL = (C16F5) this.LLLILZLLLI.findViewById(R.id.mxi);
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 268), this.LLLILZLLLI);
            C786410Ut5.l8(this.LLLJL, new ACListenerS142S0100000_7(this, 269));
        }
        if (!this.LLLF) {
            C786410Ut5.LJLLLLLL(4, this.LLJI);
        }
        LiveIconView liveIconView = (LiveIconView) PR(R.id.f_g);
        this.LLJL = liveIconView;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new ACListenerS142S0100000_7(this, 267));
            if (LiveTopTabSwitch.hideLiveEndPageCloseBtn()) {
                Boolean bool = Boolean.TRUE;
                boolean zEquals = bool.equals(DataChannelGlobal.LLILZ.gg0(TopLiveSkylightVisibilityChannel.class));
                Fragment parentFragment = getParentFragment();
                if ((parentFragment instanceof LivePlayFragment) && (dataChannel = ((LivePlayFragment) parentFragment).y) != null && bool.equals(dataChannel.gg0(C750250Tbr.class))) {
                    z = true;
                } else {
                    z = false;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("isTopTabShow; skylightOpen=");
                sbLIZ2.append(zEquals);
                sbLIZ2.append(", hasTopTabAbility=");
                sbLIZ2.append(z);
                C20441214yg.LJIIIZ("LiveNewAudienceEndFragment", C2188811AlT.LIZIZ(sbLIZ2));
                if (zEquals && z) {
                    C786410Ut5.LLJJIJIL(this.LLJL, 4);
                }
            }
            if (this.LLILLJJLI != null) {
                C497740JfY.LJIL();
            }
        }
        this.LLJJIJIIJIL = (LiveIconView) PR(R.id.iet);
        this.LLJJJJ = (C1295960jpS) PR(R.id.ie1);
        C1126540fQC c1126540fQC = (C1126540fQC) PR(R.id.ie2);
        this.LLJJJJJIL = c1126540fQC;
        c1126540fQC.LLJILJIL = C1143780fs0.LJIIJ(C0IPN.LIZ("tiktok_live_watch_resource", "tiktok_live_watch_resource_demand_1"), "ttlive_anim_follow_success.webp");
        LiveIconView liveIconView2 = this.LLJJIJIIJIL;
        if (liveIconView2 != null && this.LLJJJJ != null) {
            C786410Ut5.g8(liveIconView2, new ACListenerS142S0100000_7(this, 266));
        }
        this.LLJJL = PR(R.id.pf4);
        this.LLJJLIIIJLLLLLLLZ = (LiveIconView) PR(R.id.pf5);
        C786410Ut5.I7(this, this.LLJJL);
        ControlMessage controlMessage = this.LLIZ;
        CharSequence charSequenceLJIILIIL = "";
        if (controlMessage != null && controlMessage.perceptionAudienceText != null) {
            charSequenceLJIILIIL = C1133830fbx.LJIILIIL(controlMessage.perceptionAudienceText, "");
            if (!TextUtils.isEmpty(charSequenceLJIILIIL)) {
                this.LLIZLLLIL = this.LLIZ.punishInfo;
            }
        }
        if (!TextUtils.isEmpty(charSequenceLJIILIIL)) {
            this.LLJJIJI.setText(charSequenceLJIILIIL);
            C786410Ut5.LLJJJJ(this.LLJJIJI, 0);
            C786410Ut5.LLJJJJ(this.LLJJIII, 8);
        } else {
            C786410Ut5.LLJJJJ(this.LLJJIJI, 8);
            C786410Ut5.LLJJJJ(this.LLJJIII, 0);
        }
        if (this.LLLLIIIILLL != null) {
            Map map = (Map) this.LLILLJJLI.gg0(C749160Ta6.class);
            HashMap map2 = new HashMap();
            if (map != null) {
                map2.putAll(map);
            }
            this.LLLLIIIILLL.LIZ(new C464920ILa("live_end", map2));
        }
        C924790aAn.LIZLLL().LJII(0);
        C0ILV.LIZ(this.LLJZ, this.LLJZIJLIL, this.LLL, this.LLIZLLLIL, false);
        C0ILH.LIZIZ = this.LLLILZ;
        C0ILH.LIZ(SystemClock.elapsedRealtime());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.ggw, viewGroup, false);
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
