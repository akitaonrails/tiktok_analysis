package com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui;

import X.C0JSS;
import X.C0KVU;
import X.C0TGE;
import X.C0TZM;
import X.C0UO0;
import X.C1094580eae;
import X.C1095480ec6;
import X.C1143680frq;
import X.C1161920gLG;
import X.C16F5;
import X.C16G6;
import X.C1CC2;
import X.C2188811AlT;
import X.C416770GVv;
import X.C480460Ism;
import X.C495520Jby;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C518180KTw;
import X.C786410Ut5;
import X.C823050WQl;
import X.InterfaceC1095170ebb;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import X.ViewTreeObserverOnGlobalLayoutListenerC1151700g4m;
import Y.ACListenerS142S0100000_7;
import Y.ACListenerS152S0100000_17;
import Y.AfS1S0000100_7;
import Y.AfS6S0100100_17;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.level.FansClubPanelV2Settings;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.api.FansClubApi;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.JoinDialogViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import ttpobfuscated.e3;
import webcast.data.FansClubBanner;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubJoinDialogV1 extends AbsFansClubJoinDialog implements InterfaceC1095170ebb {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9OiA6LCEmLWsgLDHELIOSk2JGslJD8/ZiMtJzwwJDAuZzo6ZgMtJzwQJDAuAyA6JgElKCM8LxN9";
    public C16F5 LLILZLL;
    public ImageView LLIZ;
    public LinearLayout LLIZLLLIL;
    public C16F5 LLJ;
    public FrameLayout LLJI;
    public C16F5 LLJIJIL;
    public FrameLayout LLJILJIL;
    public C16F5 LLJILJILJ;
    public C16F5 LLJILLL;
    public C16F5 LLJJ;
    public ImageView LLJJI;
    public LinearLayout LLJJIII;
    public LinearLayout LLJJIJI;
    public LinearLayout LLJJIJIIJIL;
    public LinearLayout LLJJIJIL;
    public FansClubBanner LLJJJ;
    public long LLJJJJ;
    public View LLJJJJJIL;
    public final /* synthetic */ C1095480ec6 LLILZIL = new C1095480ec6();
    public long LLJJJIL = -1;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        Boolean bool;
        DataChannel dataChannel = this.dataChannel;
        int i = (dataChannel == null || (bool = (Boolean) dataChannel.gg0(C0TZM.class)) == null || bool.booleanValue()) ? R.style.aid : R.style.ain;
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g64);
        c500980Jkm.LIZJ = i;
        c500980Jkm.LJIIJ = -1;
        c500980Jkm.LJIILIIL = 48;
        c500980Jkm.LJII = 80;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        String str = this.LL;
        DataChannel dataChannel = this.dataChannel;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJJJJ;
        JoinDialogViewModel joinDialogViewModel = this.LLILLL;
        C518180KTw.LJJIJIL(str, dataChannel, jCurrentTimeMillis, joinDialogViewModel != null ? joinDialogViewModel.LLJI : false, this.LLILZ, Math.max(this.LLJJJIL, 0L), "fan", false);
    }

    @Override // X.InterfaceC1095170ebb
    public final void LP(int i) {
        this.LLILZIL.LL = i;
    }

    public final String NR(long j) {
        if (j >= 1000000) {
            long j2 = 1 * j;
            if (j > 999000000) {
                j2 = 999000000;
            }
            String strJ4 = C786410Ut5.j4("%.3f", Arrays.copyOf(new Object[]{Double.valueOf((j2 * 1.0d) / ((double) 1000000))}, 1));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(OR(strJ4));
            sbLIZ.append('M');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (j >= 1000) {
            String strJ42 = C786410Ut5.j4("%.3f", Arrays.copyOf(new Object[]{Double.valueOf((j * 1.0d) / ((double) LSPassThroughRecordSizeConfig.DEFAULT))}, 1));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(OR(strJ42));
            sbLIZ2.append('K');
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        return String.valueOf(j);
    }

    public final String OR(String str) {
        if (!TextUtils.isEmpty(str) && str.length() > 3) {
            String strSubstring = str.substring(0, 4);
            if (u.LJIIZILJ(strSubstring, e3.d, false)) {
                return strSubstring.substring(0, 3);
            }
            return strSubstring;
        }
        return str;
    }

    @Override // X.InterfaceC1095170ebb
    public final void Rv(Map<String, ? extends Object> map) {
        this.LLILZIL.LLILLJJLI = map;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.LLILZIL.LL = -1;
        super.onDismiss(dialogInterface);
    }

    public final void PR(FansClubBanner fansClubBanner, boolean z) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1;
        if (fansClubBanner != null && C500260Jjc.LJJIIZ(fansClubBanner.content)) {
            FrameLayout frameLayout = this.LLJI;
            if (frameLayout != null) {
                C786410Ut5.LJZ(0, frameLayout);
            }
            C495520Jby c495520Jby = new C495520Jby("aweme://roma_redirect/");
            c495520Jby.LIZJ("roma_group_key", "roma_schema_group_fans_level_main");
            c495520Jby.LIZJ("roma_page_key", "roma_schema_page_campaign_banner");
            String str = fansClubBanner.content;
            if (str == null) {
                str = "";
            }
            c495520Jby.LIZJ("banner_content", str);
            String strLIZLLL = c495520Jby.LIZLLL();
            Context context = getContext();
            if (context != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1 = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).DU1(context, strLIZLLL, this, true, AFwS254S0000000_17.get$arr$(176));
            } else {
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1 = null;
            }
            FrameLayout frameLayout2 = this.LLJI;
            if (frameLayout2 != null) {
                frameLayout2.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1, -1, -2);
            }
            FrameLayout frameLayout3 = this.LLJI;
            if (frameLayout3 != null && z) {
                C786410Ut5.x3(frameLayout3.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1151700g4m(frameLayout3, 9));
                return;
            }
            return;
        }
        FrameLayout frameLayout4 = this.LLJI;
        if (frameLayout4 == null) {
            return;
        }
        C786410Ut5.LJZ(8, frameLayout4);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean zBooleanValue;
        Room room;
        User owner;
        boolean z;
        int i;
        int i2;
        FrameLayout frameLayout;
        Room room2;
        User owner2;
        String secUid;
        int i3;
        Boolean bool;
        super.onViewCreated(view, bundle);
        try {
            if (!Intrinsics.LJFF(this.LLILLJJLI, "1")) {
                getDialogParams().LJI = 0.0f;
            } else {
                getDialogParams().LJI = 0.5f;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("set dim error, msg=");
            sbLIZ.append(e.getMessage());
            C1CC2.LIZ(C2188811AlT.LIZIZ(sbLIZ), e);
        }
        this.LLJJJJ = System.currentTimeMillis();
        C786410Ut5.I7(new ACListenerS152S0100000_17(this, 137), view.findViewById(R.id.fy0));
        this.LLIZLLLIL = (LinearLayout) view.findViewById(R.id.ya2);
        this.LLJIJIL = (C16F5) view.findViewById(R.id.ho2);
        this.LLJI = (FrameLayout) view.findViewById(R.id.a5j);
        this.LLILZLL = (C16F5) view.findViewById(R.id.a24);
        this.LLJILJILJ = (C16F5) view.findViewById(R.id.hny);
        this.LLIZ = (ImageView) view.findViewById(R.id.b1s);
        this.LLJILJIL = (FrameLayout) view.findViewById(R.id.f5z);
        this.LLJILLL = (C16F5) view.findViewById(R.id.azr);
        this.LLJJ = (C16F5) view.findViewById(R.id.ba2);
        this.LLJ = (C16F5) view.findViewById(R.id.ya0);
        this.LLJJI = (ImageView) view.findViewById(R.id.sl1);
        this.LLJJIII = (LinearLayout) view.findViewById(R.id.bpo);
        this.LLJJIJI = (LinearLayout) view.findViewById(R.id.h72);
        this.LLJJIJIIJIL = (LinearLayout) view.findViewById(R.id.iwn);
        this.LLJJIJIL = (LinearLayout) view.findViewById(R.id.mmb);
        this.LLJJJJJIL = view.findViewById(R.id.fsx);
        View viewFindViewById = view.findViewById(R.id.bps);
        View viewFindViewById2 = view.findViewById(R.id.iy1);
        View viewFindViewById3 = view.findViewById(R.id.bsr);
        View viewFindViewById4 = view.findViewById(R.id.f754mmc);
        View viewFindViewById5 = view.findViewById(R.id.bnu);
        C1143680frq.LIZLLL(viewFindViewById, "tiktok_live_fans_club_entrance", "ttlive_icon_fans_club_join_special_badge.png");
        C1143680frq.LIZLLL(viewFindViewById2, "tiktok_live_fans_club_entrance", "ttlive_icon_fans_club_join_special_gift.png");
        C1143680frq.LIZLLL(viewFindViewById3, "tiktok_live_fans_club_entrance", "ttlive_icon_fans_club_join_entrance_effect.png");
        C1143680frq.LIZLLL(viewFindViewById4, "tiktok_live_fans_club_entrance", "ttlive_icon_fans_club_join_level_up_effect.png");
        C1143680frq.LJ(viewFindViewById5, "tiktok_live_fans_club_entrance", "ttlive_bg_fans_club_join_dialog.png", ImageView.ScaleType.FIT_XY);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (room = (Room) dataChannel2.gg0(RoomChannel.class)) != null && (owner = room.getOwner()) != null) {
            C0JSS.LJII(this.LLIZ, owner.getAvatarThumb());
            if (zBooleanValue) {
                C16F5 c16f5 = this.LLJILLL;
                if (c16f5 != null) {
                    C786410Ut5.LLJJJJ(c16f5, 0);
                }
                LinearLayout linearLayout = this.LLIZLLLIL;
                if (linearLayout != null) {
                    C786410Ut5.LJZL(8, linearLayout);
                }
                C16F5 c16f52 = this.LLJJ;
                if (c16f52 != null) {
                    C786410Ut5.LLJJJJ(c16f52, 8);
                }
                C16F5 c16f53 = this.LLILZLL;
                if (c16f53 != null) {
                    c16f53.setText(C497740JfY.LJIJI(2131841669));
                }
                C16F5 c16f54 = this.LLJILJILJ;
                if (c16f54 != null) {
                    if (FansClubPanelV2Settings.INSTANCE.enableFansClubPanelV2()) {
                        i3 = 2131852364;
                    } else {
                        i3 = 2131841672;
                    }
                    c16f54.setText(C497740JfY.LJIJI(i3));
                }
                C16F5 c16f55 = this.LLJIJIL;
                if (c16f55 != null) {
                    c16f55.setText(C497740JfY.LJIJI(2131841671));
                }
                C16F5 c16f56 = this.LLJILLL;
                if (c16f56 != null) {
                    c16f56.setText(C497740JfY.LJIJI(2131841670));
                }
                ImageView imageView = this.LLJJI;
                if (imageView != null) {
                    C786410Ut5.Q7(imageView, new ACListenerS152S0100000_17(this, 132));
                }
                C16F5 c16f57 = this.LLILZLL;
                if (c16f57 != null) {
                    C786410Ut5.l8(c16f57, new ACListenerS142S0100000_7(this, 257));
                }
                C518180KTw.LJII(this.dataChannel, "show");
            } else {
                if (this.LLJJJIL >= 0) {
                    LinearLayout linearLayout2 = this.LLIZLLLIL;
                    if (linearLayout2 != null) {
                        C786410Ut5.LJZL(0, linearLayout2);
                    }
                    String strValueOf = String.valueOf(this.LLJJJIL);
                    try {
                        strValueOf = NR(this.LLJJJIL);
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    C16F5 c16f58 = this.LLJ;
                    if (c16f58 != null) {
                        c16f58.setText(C497740JfY.LJIIL(2131755523, (int) this.LLJJJIL, strValueOf));
                    }
                } else {
                    LinearLayout linearLayout3 = this.LLIZLLLIL;
                    if (linearLayout3 != null) {
                        C786410Ut5.LJZL(8, linearLayout3);
                    }
                }
                DataChannel dataChannel3 = this.dataChannel;
                Drawable background = null;
                if (dataChannel3 != null && (room2 = (Room) dataChannel3.gg0(RoomChannel.class)) != null && (owner2 = room2.getOwner()) != null && (secUid = owner2.getSecUid()) != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C480460Ism.LIZ().getClass();
                    ((FansClubApi) C480460Ism.LIZLLL(FansClubApi.class)).getTaskInfoWithParameter(secUid).LJFF(new C0UO0()).LJJIIZ(new AfS6S0100100_17(jCurrentTimeMillis, this, 13), new AfS1S0000100_7(jCurrentTimeMillis, 1));
                }
                LinearLayout linearLayout4 = this.LLIZLLLIL;
                if (linearLayout4 != null) {
                    C786410Ut5.R7(linearLayout4, new ACListenerS152S0100000_17(this, 133));
                }
                ImageView imageView2 = this.LLJJI;
                if (imageView2 != null) {
                    C786410Ut5.Q7(imageView2, new ACListenerS152S0100000_17(this, 134));
                }
                LinearLayout linearLayout5 = this.LLJJIII;
                if (linearLayout5 != null) {
                    C786410Ut5.R7(linearLayout5, new ACListenerS152S0100000_17(this, 138));
                }
                LinearLayout linearLayout6 = this.LLJJIJI;
                if (linearLayout6 != null) {
                    C786410Ut5.R7(linearLayout6, new ACListenerS152S0100000_17(this, 139));
                }
                LinearLayout linearLayout7 = this.LLJJIJIIJIL;
                if (linearLayout7 != null) {
                    C786410Ut5.R7(linearLayout7, new ACListenerS152S0100000_17(this, 122));
                }
                LinearLayout linearLayout8 = this.LLJJIJIL;
                if (linearLayout8 != null) {
                    C786410Ut5.R7(linearLayout8, new ACListenerS152S0100000_17(this, 123));
                }
                try {
                    View viewGenerateCPCTopView = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).generateCPCTopView(getContext(), false, AFwS205S0000000_17.get$arr$(225));
                    if (viewGenerateCPCTopView != null && viewGenerateCPCTopView.getParent() == null && (frameLayout = this.LLJILJIL) != null) {
                        frameLayout.addView(viewGenerateCPCTopView);
                    }
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
                C16F5 c16f59 = this.LLJILLL;
                if (c16f59 != null) {
                    C786410Ut5.LLJJJJ(c16f59, 8);
                }
                C16F5 c16f510 = this.LLJJ;
                if (c16f510 != null) {
                    C786410Ut5.LLJJJJ(c16f510, 0);
                }
                C16F5 c16f511 = this.LLJJ;
                if (c16f511 != null) {
                    c16f511.setText(C497740JfY.LJIJI(2131841650));
                }
                C16F5 c16f512 = this.LLJILJILJ;
                if (c16f512 != null) {
                    if (FansClubPanelV2Settings.INSTANCE.enableFansClubPanelV2()) {
                        i2 = 2131852336;
                    } else {
                        i2 = 2131841658;
                    }
                    c16f512.setText(C497740JfY.LJIJJ(i2, C0KVU.LIZ(owner)));
                }
                C16F5 c16f513 = this.LLJIJIL;
                if (c16f513 != null) {
                    if (FansClubPanelV2Settings.INSTANCE.enableFansClubPanelV2()) {
                        i = 2131852362;
                    } else {
                        i = 2131841668;
                    }
                    c16f513.setText(C497740JfY.LJIJI(i));
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(u.LJJIII(u.LJJIII(C497740JfY.LJIJI(2131853146), "%@", e3.d, false), "%d", "1", false));
                Drawable drawableMutate = getResources().getDrawable(R.drawable.etw).mutate();
                drawableMutate.setBounds(0, 0, (int) C497740JfY.LIZIZ(14.0f), (int) C497740JfY.LIZIZ(14.0f));
                C16G6.LIZIZ(drawableMutate, C497740JfY.LJJ() ? 1 : 0);
                C786410Ut5.q2(spannableStringBuilder, new C416770GVv(drawableMutate), r7.length() - 4, r7.length() - 2, 34);
                C16F5 c16f514 = this.LLILZLL;
                if (c16f514 != null) {
                    c16f514.setText(spannableStringBuilder);
                }
                if (((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).isFansCLubGiftLimited(this.dataChannel)) {
                    C16F5 c16f515 = this.LLILZLL;
                    if (c16f515 != null) {
                        c16f515.setBackground(C497740JfY.LJIIJ(R.drawable.drj));
                    }
                    C16F5 c16f516 = this.LLILZLL;
                    if (c16f516 != null) {
                        C786410Ut5.l8(c16f516, new ACListenerS152S0100000_17(this, 135));
                    }
                } else {
                    C16F5 c16f517 = this.LLILZLL;
                    if (c16f517 != null) {
                        C786410Ut5.l8(c16f517, new ACListenerS152S0100000_17(this, 136));
                    }
                }
                C16F5 c16f518 = this.LLILZLL;
                if (c16f518 != null) {
                    background = c16f518.getBackground();
                }
                boolean z2 = !Intrinsics.LJFF(background, C497740JfY.LJIIJ(R.drawable.drj));
                DataChannel dataChannel4 = this.dataChannel;
                String str = this.LL;
                Boolean boolValueOf = Boolean.valueOf(z2);
                Integer numValueOf = Integer.valueOf(this.LLILZIL.LL);
                JoinDialogViewModel joinDialogViewModel = this.LLILLL;
                if (joinDialogViewModel != null) {
                    z = joinDialogViewModel.LLJI;
                } else {
                    z = false;
                }
                C518180KTw.LJIILLIIL(dataChannel4, "show", str, boolValueOf, "", numValueOf, z, this.LLILZ);
                C518180KTw.LJJIIJZLJL(this.dataChannel, this.LL, "fan", this.LLILZIL.LL, false, false, false);
            }
        }
        PR(this.LLJJJ, false);
        C1094580eae.LIZ.getClass();
        C823050WQl.LIZLLL().execute(C0TGE.LL);
    }
}
