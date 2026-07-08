package com.bytedance.android.livesdk.chatroom.end.newaudienceend;

import X.C098200Yq;
import X.C0IER;
import X.C0IF7;
import X.C0IGR;
import X.C0IKC;
import X.C0IL9;
import X.C0ILB;
import X.C0ILC;
import X.C0ILD;
import X.C0ILF;
import X.C0ILH;
import X.C0ILV;
import X.C0IMV;
import X.C0IXL;
import X.C0IZW;
import X.C0KVU;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1121670fIL;
import X.C1148430fzV;
import X.C1161920gLG;
import X.C11JF;
import X.C11S5;
import X.C12ES;
import X.C1324610kZf;
import X.C1324720kZq;
import X.C1548820qPI;
import X.C1685300txQ;
import X.C16F5;
import X.C1701940uOG;
import X.C1819620xS4;
import X.C1834150xpV;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20441214yg;
import X.C20533215Wg;
import X.C20736316Cj;
import X.C21382118m3;
import X.C2188811AlT;
import X.C2200821BBo;
import X.C465060ILo;
import X.C468800IZy;
import X.C473030Ign;
import X.C475510Ikn;
import X.C497740JfY;
import X.C748970TZn;
import X.C749140Ta4;
import X.C750250Tbr;
import X.C786410Ut5;
import X.C924790aAn;
import X.InterfaceC465090ILr;
import X.InterfaceC468830Ia1;
import X.InterfaceC473070Igr;
import X.InterfaceC500940Jki;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.ACListenerS142S0100000_7;
import Y.ARunnableS107S0100000_7;
import Y.ARunnableS16S0400000_7;
import Y.ARunnableS76S0200000_7;
import Y.ARunnableS7S1300000_7;
import Y.ARunnableS86S0000000_7;
import Y.AfS132S0000000_7;
import Y.AfS176S0100000_7;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.ArrayMap;
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
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.MultiGuestGuestRecentLinkmicIdChannel;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livefinishcard.LiveEndPageOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestEndLivePageLynxSchemaSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveTopTabSwitch;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public class LiveNewAudienceEndFragmentV2 extends BaseFragment implements InterfaceC465090ILr, C0IGR, View.OnClickListener, InterfaceC468830Ia1 {
    public static final String LLLIL = MultiGuestEndLivePageLynxSchemaSetting.INSTANCE.url();
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9Ky0tPT08JyhiLCE3ZiHELIOSspPi4mLCwpJyw2LSsoZwM6PiACLDgSPSElLCEwLQAiLQkhKSIhLCEnHnc=";
    public C465060ILo LLILLJJLI;
    public DataChannel LLILLL;
    public Room LLILZIL;
    public C0IF7 LLILZLL;
    public C16F5 LLIZLLLIL;
    public ImageView LLJ;
    public C1324720kZq LLJI;
    public C16F5 LLJIJIL;
    public InterfaceC500940Jki LLJILJIL;
    public View LLJILLL;
    public LiveIconView LLJJ;
    public String LLJJIII;
    public long LLJJIJI;
    public boolean LLJJIJIIJIL;
    public int LLJJIJIL;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public C468800IZy LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public View LLJLIL;
    public C16F5 LLJLILLLLZIIL;
    public C16F5 LLJLL;
    public C16F5 LLJLLIL;
    public View LLLF;
    public C16F5 LLLFF;
    public LiveIconView LLLFFI;
    public ViewGroup LLLFZ;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLLI;
    public C0ILB LLLIIIIL;
    public String LL = "user_swipe";
    public final BPEAHandler LLILZ = new BPEAHandler(Looper.getMainLooper());
    public long LLIZ = 0;
    public C11JF LLJILJILJ = null;
    public int LLJJI = 0;
    public int LLJJJ = 0;
    public long LLJJJJJIL = -1;
    public boolean LLJJJJLIIL = false;
    public final long LLJJL = SystemClock.elapsedRealtime();
    public final long LLJLLL = LiveEndPageOptSetting.INSTANCE.getAutoSwipeTimeMs();
    public long LLJZ = -1;
    public boolean LLJZIJLIL = false;
    public boolean LLL = false;
    public boolean LLLII = false;
    public int LLLIIII = -1;
    public boolean LLLIIIL = false;
    public final ARunnableS107S0100000_7 LLLIIL = new ARunnableS107S0100000_7(this, 221);
    public final ARunnableS107S0100000_7 LLLIILIL = new ARunnableS107S0100000_7(this, 222);

    @Override // X.InterfaceC465090ILr
    public final void Fc() {
    }

    @Override // X.InterfaceC468830Ia1
    public final void No() {
    }

    @Override // X.InterfaceC468830Ia1
    public final void Z3() {
    }

    @Override // X.InterfaceC465090ILr
    public final /* synthetic */ void az(Room room) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.LLLII = false;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLLI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            try {
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getParent() instanceof ViewGroup) {
                    C786410Ut5.LJJJLZIJ(this.LLLI, (ViewGroup) this.LLLI.getParent());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            try {
                this.LLLI.LJJ(true);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
            this.LLLI = null;
        }
        ViewGroup viewGroup = this.LLLFZ;
        if (viewGroup != null) {
            try {
                C786410Ut5.LJJJJI(viewGroup);
                C786410Ut5.LJLZ(8, this.LLLFZ);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
            }
        }
        super.onDestroyView();
    }

    @Override // X.InterfaceC465090ILr
    public final void xg(Room room) {
    }

    public final C0ILB VR() {
        if (this.LLLIIIIL == null) {
            this.LLLIIIIL = this.LLLIIIL ? new C0ILC(this) : new C0ILF(this);
        }
        return this.LLLIIIIL;
    }

    public final void aS() {
        if (this.LLJJJJJIL >= 0 && ((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).pc1()) {
            User shareExternalLinkShareUser = ((IHostShare) C1161920gLG.LIZJ(IHostShare.class)).getShareExternalLinkShareUser(this.LLJJJJJIL);
            if (shareExternalLinkShareUser == null) {
                ((IHostShare) C1161920gLG.LIZJ(IHostShare.class)).registerShareUserInfoListener(this.LLJJJJJIL, new InterfaceC473070Igr() { // from class: X.0ILE
                    @Override // X.InterfaceC473070Igr
                    public final void LIZ(User user) {
                        this.LIZ.RR(user);
                    }
                });
            } else {
                RR(shareExternalLinkShareUser);
            }
        }
    }

    public final void bS() {
        this.LLILZ.removeCallbacksAndMessages(null);
    }

    @Override // X.C0IGR
    public final boolean onBackPressed() {
        C0IF7 c0if7 = this.LLILZLL;
        if (c0if7 == null) {
            return false;
        }
        c0if7.onBackPressed();
        return true;
    }

    public final void SR() {
        DataChannel dataChannel;
        View viewPR = PR(R.id.nnp);
        this.LLJILLL = viewPR;
        C786410Ut5.LJLLLLLL(0, viewPR);
        this.LLIZLLLIL = (C16F5) PR(R.id.b0x);
        this.LLJ = (ImageView) PR(R.id.azx);
        this.LLJI = (C1324720kZq) PR(R.id.bp1);
        this.LLJIJIL = (C16F5) PR(R.id.thd);
        this.LLLF = PR(R.id.idv);
        this.LLLFF = (C16F5) PR(R.id.ifj);
        this.LLLFFI = (LiveIconView) PR(R.id.iet);
        ViewStub viewStub = (ViewStub) PR(R.id.mxa);
        if (viewStub != null) {
            viewStub.setLayoutInflater(C1834150xpV.LIZJ(C786410Ut5.ne(getContext())));
            View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
            this.LLJL = viewLJLLLL;
            this.LLJLILLLLZIIL = (C16F5) viewLJLLLL.findViewById(R.id.mxr);
            this.LLJLL = (C16F5) this.LLJL.findViewById(R.id.mxc);
            this.LLJLLIL = (C16F5) this.LLJL.findViewById(R.id.mxi);
            C16F5 c16f5 = this.LLJLILLLLZIIL;
            if (c16f5 != null) {
                C21382118m3.LIZIZ(c16f5, 11, 13, 1, 1);
            }
            C16F5 c16f52 = this.LLJLL;
            if (c16f52 != null) {
                C21382118m3.LIZIZ(c16f52, 13, 17, 1, 1);
            }
            C16F5 c16f53 = this.LLJLLIL;
            if (c16f53 != null) {
                C21382118m3.LIZIZ(c16f53, 11, 15, 1, 1);
            }
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 259), this.LLJL);
            C786410Ut5.l8(this.LLJLLIL, new ACListenerS142S0100000_7(this, 260));
        }
        LiveIconView liveIconView = (LiveIconView) PR(R.id.f_g);
        this.LLJJ = liveIconView;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new ACListenerS142S0100000_7(this, 270));
            if (LiveTopTabSwitch.hideLiveEndPageCloseBtn()) {
                Boolean bool = Boolean.TRUE;
                boolean zEquals = bool.equals(DataChannelGlobal.LLILZ.gg0(TopLiveSkylightVisibilityChannel.class));
                Fragment parentFragment = getParentFragment();
                boolean z = (parentFragment instanceof LivePlayFragment) && (dataChannel = ((LivePlayFragment) parentFragment).y) != null && bool.equals(dataChannel.gg0(C750250Tbr.class));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("isTopTabShow; skylightOpen=");
                sbLIZ.append(zEquals);
                sbLIZ.append(", hasTopTabAbility=");
                sbLIZ.append(z);
                C20441214yg.LJIIIZ("LiveNewAudienceEndFragmentV2", C2188811AlT.LIZIZ(sbLIZ));
                if (zEquals && z) {
                    C786410Ut5.LLJJIJIL(this.LLJJ, 4);
                }
            }
            if (this.LLILLL != null) {
                C497740JfY.LJIL();
            }
        }
    }

    public final void WR() {
        if (VR().N()) {
            this.LLJZ = System.currentTimeMillis() + this.LLJLLL;
            C20441214yg.LIZIZ("leave_mic_opt", "startSwipeTimer");
            this.LLILZ.removeCallbacksAndMessages(null);
            if (this.LLJJJJLIIL) {
                C786410Ut5.LJJZZIII(this.LLILZ, this.LLLIILIL);
            } else {
                C786410Ut5.LJJZZIII(this.LLILZ, this.LLLIIL);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        BPEAHandler bPEAHandler = this.LLILZ;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacksAndMessages(null);
        }
        C0ILB c0ilb = this.LLLIIIIL;
        if (c0ilb != null) {
            c0ilb.L();
        }
        OR("onDestroy");
        C465060ILo c465060ILo = this.LLILLJJLI;
        WeakHandler weakHandler = c465060ILo.LL;
        if (weakHandler != null) {
            weakHandler.removeCallbacks(new ARunnableS86S0000000_7(10));
        }
        C473030Ign c473030Ign = c465060ILo.LLILZ;
        if (c473030Ign != null) {
            c473030Ign.LIZ.LJ();
        }
        C468800IZy c468800IZy = this.LLJJLIIIJLLLLLLLZ;
        if (c468800IZy != null) {
            C1548820qPI.LJIIIIZZ("live_event_update_result", c468800IZy);
        }
        C11JF c11jf = this.LLJILJILJ;
        if (c11jf != null) {
            c11jf.dispose();
            this.LLJILJILJ = null;
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (this.LLILZ != null) {
            bS();
        }
        C0ILB c0ilb = this.LLLIIIIL;
        if (c0ilb != null) {
            c0ilb.M();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    @Override // X.InterfaceC468830Ia1
    public final void Gf(boolean z) {
        cS(z);
    }

    public final String NR(boolean z) {
        char c;
        String str;
        String str2;
        ArrayMap<Integer, Long> arrayMap;
        Long l;
        String str3 = LLLIL;
        if (TextUtils.isEmpty(str3)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(str3);
        char c2 = '&';
        if (str3.contains("?")) {
            c = '&';
        } else {
            c = '?';
        }
        if (this.LLIZ > 0) {
            sb.append(c);
            sb.append("room_id=");
            sb.append(this.LLIZ);
        } else {
            c2 = c;
        }
        Long lValueOf = 0L;
        DataChannel dataChannel = this.LLILLL;
        String strValueOf = null;
        if (dataChannel != null) {
            Room room = (Room) dataChannel.gg0(RoomChannel.class);
            if (this.LLILLL.gg0(MultiGuestGuestRecentLinkmicIdChannel.class) != null) {
                str = ((C0IZW) this.LLILLL.gg0(MultiGuestGuestRecentLinkmicIdChannel.class)).LIZ;
            } else {
                str = null;
            }
            if (room != null) {
                MultiLiveUserSettings multiLiveUserSettings = room.multiLiveUserSettings;
                if (multiLiveUserSettings != null && (arrayMap = multiLiveUserSettings.channelMap) != null && (l = arrayMap.get(4)) != null) {
                    strValueOf = String.valueOf(l);
                }
                lValueOf = Long.valueOf(room.getOwnerUserId());
            }
        } else {
            str = null;
        }
        if (lValueOf.longValue() != 0) {
            sb.append(c2);
            sb.append("anchor_id=");
            sb.append(lValueOf);
        }
        if (!TextUtils.isEmpty(strValueOf)) {
            sb.append(c2);
            sb.append("channel_id=");
            sb.append(Uri.encode(strValueOf));
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(c2);
            sb.append("linkmic_id=");
            sb.append(str);
        }
        int iLJIILLIIL = this.LLLIIII;
        if (iLJIILLIIL == -1) {
            iLJIILLIIL = C497740JfY.LJIILLIIL();
        }
        Integer numValueOf = Integer.valueOf((int) C497740JfY.LJJI(iLJIILLIIL));
        sb.append(c2);
        sb.append("lynx_height=");
        sb.append(numValueOf);
        sb.append(c2);
        sb.append("show_live_event=");
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        sb.append(str2);
        return sb.toString();
    }

    public final void OR(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearGuestReviewDialogController source:");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("leave_mic_opt", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final <T extends View> T PR(int i) {
        if (getView() == null) {
            return null;
        }
        return (T) getView().findViewById(i);
    }

    public final void RR(User user) {
        ViewStub viewStub = (ViewStub) PR(R.id.n60);
        if (viewStub != null && user != null) {
            viewStub.setLayoutInflater(C1834150xpV.LIZJ(C786410Ut5.ne(getContext())));
            this.LLJLIL = C786410Ut5.LJLLLL(viewStub);
            HandlerHook.viewPost(this.LLJLIL, new ARunnableS76S0200000_7(user, this, 6));
        }
    }

    public final void UR(C0ILD c0ild) {
        Context context;
        IHybridContainerService iHybridContainerService;
        View view;
        if (c0ild == null) {
            return;
        }
        if (c0ild.LIZJ.booleanValue() && this.LLLI == null) {
            if (this.LLLFZ == null) {
                this.LLLFZ = (ViewGroup) PR(R.id.nua);
            }
            if (this.LLLFZ != null && (context = getContext()) != null && (iHybridContainerService = (IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)) != null) {
                C786410Ut5.LJLZ(0, this.LLLFZ);
                if (!this.LLLII) {
                    this.LLLII = true;
                    ARunnableS16S0400000_7 aRunnableS16S0400000_7 = new ARunnableS16S0400000_7(this, c0ild, iHybridContainerService, context, 0);
                    if (VR().O() && (view = getView()) != null) {
                        if (this.LLLFZ == null) {
                            this.LLLFZ = (ViewGroup) PR(R.id.nua);
                        }
                        ViewGroup viewGroup = this.LLLFZ;
                        if (viewGroup != null) {
                            int height = viewGroup.getHeight();
                            if (height > 0) {
                                if (height != this.LLLIIII) {
                                    this.LLLIIII = height;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("lynx_container remaining height(px)=");
                                    sbLIZ.append(height);
                                    sbLIZ.append(", from=");
                                    sbLIZ.append("initEndPageLynxIfNeed");
                                    C20441214yg.LIZIZ("LiveNewAudienceEndFragmentV2", C2188811AlT.LIZIZ(sbLIZ));
                                }
                                aRunnableS16S0400000_7.run();
                            } else {
                                HandlerHook.viewPost(view, new ARunnableS7S1300000_7(this, viewGroup, aRunnableS16S0400000_7, 0));
                            }
                        }
                    }
                }
            }
        }
        if (c0ild.LIZJ.booleanValue()) {
            if (c0ild.LIZ.booleanValue() || c0ild.LIZIZ.booleanValue()) {
                View view2 = this.LLJL;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.topMargin = (int) C497740JfY.LIZIZ(48.0f);
                        marginLayoutParams.width = (int) C497740JfY.LIZIZ(342.0f);
                        C786410Ut5.W5(this.LLJL, marginLayoutParams);
                    }
                }
                View view3 = this.LLJLIL;
                if (view3 != null) {
                    ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams2.topMargin = (int) C497740JfY.LIZIZ(48.0f);
                        C786410Ut5.W5(this.LLJLIL, marginLayoutParams2);
                    }
                }
                ViewGroup viewGroup2 = this.LLLFZ;
                if (viewGroup2 != null) {
                    ViewGroup.LayoutParams layoutParams3 = viewGroup2.getLayoutParams();
                    if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                        marginLayoutParams3.topMargin = (int) C497740JfY.LIZIZ(8.0f);
                        C786410Ut5.X5(marginLayoutParams3, this.LLLFZ);
                    }
                }
            }
        }
    }

    public final void ZR(boolean z) {
        if (z) {
            this.LLLF.setBackgroundResource(R.drawable.dz6);
            this.LLLFFI.setIcon(R.raw.icon_bell_fill);
            this.LLLFF.setText(2131842790);
        } else {
            this.LLLF.setBackgroundResource(R.drawable.dz3);
            this.LLLFFI.setIcon(C20736316Cj.LJ(R.attr.e_6, getContext()));
            this.LLLFF.setText(2131852435);
        }
        C786410Ut5.LJLLLLLL(0, this.LLLF);
    }

    public final void cS(boolean z) {
        C16F5 c16f5 = this.LLJLLIL;
        if (c16f5 == null) {
            return;
        }
        if (z) {
            c16f5.setText(2131851061);
            this.LLJLLIL.setBackgroundResource(R.drawable.dkc);
        } else {
            c16f5.setText(2131851060);
            this.LLJLLIL.setBackgroundResource(R.drawable.dka);
        }
    }

    @Override // X.InterfaceC465090ILr
    public final void ed(Room room) {
        int i;
        OfficialChannelInfo officialChannelInfo;
        User user;
        Room room2;
        View view;
        boolean z;
        User owner;
        String strValueOf;
        ImageModel avatarLarge;
        OfficialChannelInfo officialChannelInfo2;
        User user2;
        String strLIZ;
        OfficialChannelInfo officialChannelInfo3;
        OfficialChannelInfo officialChannelInfo4;
        User user3;
        if (!isAdded()) {
            return;
        }
        this.LLILZIL = room;
        if (room != null && room.getStats() != null) {
            i = room.getStats().replayViewers;
        } else {
            i = 0;
        }
        if (i <= 0) {
            C16F5 c16f5 = this.LLJIJIL;
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
            C16F5 c16f52 = this.LLJIJIL;
            if (c16f52 != null) {
                c16f52.setText(strLIZIZ);
            }
        }
        if (this.LLJ != null && this.LLJI != null && (view = this.LLJILLL) != null) {
            C786410Ut5.LJLLLLLL(8, view);
            IMicRoomService iMicRoomService = (IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class);
            if (iMicRoomService != null && iMicRoomService.n42(this.LLILZIL) && iMicRoomService.TM(this.LLILZIL)) {
                z = true;
            } else {
                z = false;
            }
            Room room3 = this.LLILZIL;
            ImageModel avatarMedium = null;
            if (room3 != null) {
                owner = room3.getOwner();
                if (owner != null && this.LLILZ != null) {
                    if (z) {
                        Room room4 = this.LLILZIL;
                        if (room4 != null && (officialChannelInfo4 = room4.officialChannelInfo) != null && (user3 = officialChannelInfo4.channelUser) != null) {
                            avatarMedium = user3.getAvatarMedium();
                        }
                        C1121670fIL.LJIIL(this.LLJ, avatarMedium, 2130975647);
                    } else {
                        C1121670fIL.LJIIL(this.LLJ, owner.getAvatarMedium(), 2130975647);
                    }
                    C786410Ut5.Q7(this.LLJ, new ACListenerS142S0100000_7(this, 271));
                    if (this.LLIZLLLIL != null) {
                        Room room5 = this.LLILZIL;
                        if (room5 != null && (officialChannelInfo3 = room5.officialChannelInfo) != null) {
                            strLIZ = C0KVU.LIZ(officialChannelInfo3.channelUser);
                        } else {
                            strLIZ = "";
                        }
                        if (z) {
                            this.LLIZLLLIL.setText(strLIZ);
                        } else {
                            this.LLIZLLLIL.setText(C0KVU.LIZ(owner));
                        }
                    }
                }
            } else {
                owner = null;
            }
            float fLJIIJ = C12ES.LJIIJ(getContext()) / C12ES.LJIIIIZZ(getContext());
            if (owner != null) {
                if (z) {
                    Room room6 = this.LLILZIL;
                    if (room6 != null && (officialChannelInfo2 = room6.officialChannelInfo) != null && (user2 = officialChannelInfo2.channelUser) != null) {
                        avatarLarge = user2.getAvatarLarge();
                        if (avatarLarge != null && avatarLarge.getUrls() != null && avatarLarge.getUrls().size() > 0) {
                            C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(avatarLarge.getUrls());
                            c1324610kZfLIZJ.LJIIZILJ = fLJIIJ;
                            c1324610kZfLIZJ.LJIJ = 8;
                            c1324610kZfLIZJ.LJJI(this.LLJI);
                        }
                    }
                } else if (owner.getAvatarLarge() != null) {
                    avatarLarge = owner.getAvatarLarge();
                    if (avatarLarge != null) {
                        C1324610kZf c1324610kZfLIZJ2 = C1819620xS4.LIZ().LIZJ(avatarLarge.getUrls());
                        c1324610kZfLIZJ2.LJIIZILJ = fLJIIJ;
                        c1324610kZfLIZJ2.LJIJ = 8;
                        c1324610kZfLIZJ2.LJJI(this.LLJI);
                    }
                }
            }
            Room room7 = this.LLILZIL;
            if (room7 != null && room7.getOwner() != null && this.LLILZIL.getOwner().getFollowInfo() != null) {
                if (this.LLILZIL.getOwner().getFollowInfo().getFollowStatus() != 1 && this.LLILZIL.getOwner().getFollowInfo().getFollowStatus() != 2) {
                    this.LLL = false;
                } else {
                    this.LLL = true;
                }
                ZR(this.LLL);
            }
            View view2 = this.LLLF;
            if (view2 != null) {
                C786410Ut5.I7(new ACListenerS142S0100000_7(this, 261), view2);
            }
            if (this.LLILLJJLI != null && owner != null) {
                HashMap map = new HashMap();
                map.put("target_uid", String.valueOf(owner.getId()));
                map.put("sec_target_uid", UserService.getInstance().user().LJIJ(owner.getId()));
                map.put("packed_level", String.valueOf(2));
                map.put("current_room_id", String.valueOf(this.LLILZIL.getId()));
                map.put("request_from", "live_push_settings");
                if (this.LLILZIL.getOwner() != null) {
                    strValueOf = String.valueOf(this.LLILZIL.getOwner().getId());
                } else {
                    strValueOf = CardStruct.IStatusCode.DEFAULT;
                }
                map.put("anchor_id", strValueOf);
                map.put("sec_anchor_id", UserService.getInstance().user().LJIJ(this.LLILZIL.getOwnerUserId()));
            }
        }
        if (!C0IER.LIZJ(getContext()) && (room2 = this.LLILZIL) != null && room2.getOwner() != null) {
            C468800IZy c468800IZy = new C468800IZy();
            this.LLJJLIIIJLLLLLLLZ = c468800IZy;
            c468800IZy.LIZJ(String.valueOf(this.LLILZIL.getOwner().getId()), new C0IL9(this));
        }
        if (this.LLJILJIL == null) {
            this.LLJILJIL = UserService.getInstance().user();
        }
        Room room8 = this.LLILZIL;
        if (room8 != null && room8.getOwner() != null) {
            long id = this.LLILZIL.getOwner().getId();
            IMicRoomService iMicRoomService2 = (IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class);
            if (iMicRoomService2 != null && iMicRoomService2.n42(this.LLILZIL) && iMicRoomService2.TM(this.LLILZIL)) {
                Room room9 = this.LLILZIL;
                id = (room9 == null || (officialChannelInfo = room9.officialChannelInfo) == null || (user = officialChannelInfo.channelUser) == null) ? room9.getOwner().getId() : user.getId();
            }
            C11JF c11jf = this.LLJILJILJ;
            if (c11jf != null) {
                c11jf.dispose();
            }
            this.LLJILJILJ = (C11JF) this.LLJILJIL.LIZIZ(id).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS176S0100000_7(this, 250), new AfS132S0000000_7(43));
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C0ILB c0ilf;
        boolean zLJI = MethodIDManager.LJI(72063);
        super.onCreate(bundle);
        this.LLILLL = C475510Ikn.LJ(this);
        C465060ILo c465060ILo = new C465060ILo(this);
        this.LLILLJJLI = c465060ILo;
        c465060ILo.LLILLL = this.LLILZLL;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LLJJI = arguments.getInt("room_position", -1);
            this.LLJJIII = arguments.getString("show_reason", "");
            this.LLJJIJI = arguments.getLong("watch_live_duration", 0L);
            this.LLJJIJIIJIL = arguments.getBoolean("can_swipe_next", false);
            this.LLJJIJIL = arguments.getInt("live_end_reason", 0);
            this.LLJJJ = arguments.getInt("enter_live_alive", 0);
            this.LLJJJIL = arguments.getBoolean("enter_live_is_from_search", false);
            this.LLJJJJ = arguments.getBoolean("is_mix_live", false);
            this.LLJJJJJIL = arguments.getLong("deeplink_share_user_id", -1L);
            this.LLJJJJLIIL = arguments.getBoolean("enable_half_screen_transition", false);
            this.LLLIIIL = arguments.getBoolean("enable_multi_guest_variant_ui", false);
        }
        DataChannel dataChannel = this.LLILLL;
        if (dataChannel != null) {
            dataChannel.SX0(C748970TZn.class, Integer.valueOf(this.LLJJIJIL));
        }
        DataChannel dataChannel2 = this.LLILLL;
        if (dataChannel2 != null) {
            C0IKC c0ikc = (C0IKC) dataChannel2.gg0(C749140Ta4.class);
            if (c0ikc == null) {
                c0ikc = new C0IKC();
                this.LLILLL.SX0(C749140Ta4.class, c0ikc);
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
                if (!TextUtils.equals("normal", this.LLJJIII) && this.LLJJJ != 1) {
                    c0ikc.LIZLLL = "recommend";
                    c0ixl.LJJIJL = "recommend";
                } else {
                    c0ikc.LIZLLL = "live_end";
                    c0ixl.LJJIJL = "live_end";
                }
            }
        }
        C465060ILo c465060ILo2 = this.LLILLJJLI;
        if (c465060ILo2 != null) {
            c465060ILo2.LIZJ(this.LLIZ);
        }
        if (this.LLLIIIL) {
            c0ilf = new C0ILC(this);
        } else {
            c0ilf = new C0ILF(this);
        }
        this.LLLIIIIL = c0ilf;
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/bytedance/android/livesdk/chatroom/end/newaudienceend/LiveNewAudienceEndFragmentV2", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CJOQQvvt2bwOJ0ngcd/nOrCXG3GRVkBoBdegu0IXtmhXq/7mKhs9a9tsdNBjqnymU5WWCf7hnE=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        if (!z) {
            BPEAHandler bPEAHandler = this.LLILZ;
            if (bPEAHandler != null) {
                bPEAHandler.removeCallbacksAndMessages(null);
            }
            C0IMV.LIZIZ(this.LLILLL, this.LL);
            bS();
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(getClass());
        }
    }

    @Override // X.InterfaceC465090ILr
    public final void xw(List<Room> list) {
        if (MethodIDManager.LJI(71719)) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveNewAudienceEndFragmentV2_onViewCreated context:");
        Context context = getContext();
        Objects.requireNonNull(context);
        sbLIZ.append(context.hashCode());
        C20441214yg.LJIIIZ("leave_mic_opt", C2188811AlT.LIZIZ(sbLIZ));
        VR().P();
        C924790aAn.LIZLLL().LJII(0);
        C0ILV.LIZ(this.LLJJI, this.LLJJIII, this.LLJJIJI, null, VR().O());
        C0ILH.LIZIZ = this.LLJJL;
        C0ILH.LIZ(SystemClock.elapsedRealtime());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), VR().Q(), viewGroup, false);
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
