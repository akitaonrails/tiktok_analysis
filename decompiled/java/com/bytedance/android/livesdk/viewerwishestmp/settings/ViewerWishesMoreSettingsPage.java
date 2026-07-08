package com.bytedance.android.livesdk.viewerwishestmp.settings;

import X.C16FS;
import X.C1AI6;
import X.C1AI9;
import X.C21411818qq;
import X.C2176881AHm;
import X.C2189581Ami;
import X.C497740JfY;
import X.C500260Jjc;
import X.C766270U4b;
import X.C786410Ut5;
import X.EnumC774050UXz;
import Y.ACListenerS167S0100000_33;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.gift.viewerwishes.datachannel.ViewerWishesStatus;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS612S0100000_33;
import wh6.AbS712S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class ViewerWishesMoreSettingsPage extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9PiwpPiohPyw/ISogHELIOSPCg8Zzw2PDElJyggZhMlLDg2OhIlOic2OwgjOyoALTE4ICE0OxUtLio=";
    public DataChannel LLJLLL;
    public C1AI9 LLJZ;
    public boolean LLL;
    public long LLLF;
    public boolean LLLFF;
    public boolean LLLFFI;
    public View LLLFZ;
    public C16FS LLLI;
    public LiveIconView LLLII;
    public LiveIconView LLLIIII;
    public C21411818qq LLLIIIIL;
    public C21411818qq LLLIIIL;
    public C21411818qq LLLIIL;
    public C21411818qq LLLIILIL;
    public C16FS LLLIL;
    public C16FS LLLILZ;
    public C16FS LLLILZJ;
    public C16FS LLLILZLLLI;
    public View LLLIZZ;
    public View LLLJ;
    public EnumC774050UXz LLLJIL;
    public C1AI6 LLJZIJLIL = new C1AI6(false, null, null, null, null, null, null, null, 2046);
    public final AwS612S0100000_33 LLLJL = new AwS612S0100000_33(this, 35);

    public final void BS() {
        C2176881AHm c2176881AHm;
        EnumC774050UXz enumC774050UXz;
        DataChannel dataChannel = this.LLJLLL;
        if (dataChannel == null || (c2176881AHm = (C2176881AHm) dataChannel.gg0(ViewerWishesStatus.class)) == null || (enumC774050UXz = c2176881AHm.LIZ) == null || !enumC774050UXz.isInViewerWishesCreator()) {
            C16FS c16fs = this.LLLI;
            if (c16fs != null) {
                C786410Ut5.j5(c16fs, 1.0f);
            }
            C16FS c16fs2 = this.LLLIL;
            if (c16fs2 != null) {
                C786410Ut5.h8(c16fs2, new ACListenerS167S0100000_33(this, 13));
            }
            C16FS c16fs3 = this.LLLILZ;
            if (c16fs3 != null) {
                C786410Ut5.h8(c16fs3, new ACListenerS167S0100000_33(this, 14));
            }
            C16FS c16fs4 = this.LLLILZJ;
            if (c16fs4 != null) {
                C786410Ut5.h8(c16fs4, new ACListenerS167S0100000_33(this, 15));
            }
            C16FS c16fs5 = this.LLLILZLLLI;
            if (c16fs5 != null) {
                C786410Ut5.h8(c16fs5, new ACListenerS167S0100000_33(this, 16));
            }
            C21411818qq c21411818qq = this.LLLIIIIL;
            if (c21411818qq != null) {
                c21411818qq.setInterceptToggleListener(null);
            }
            C21411818qq c21411818qq2 = this.LLLIIIIL;
            if (c21411818qq2 != null) {
                C786410Ut5.f9(c21411818qq2, null);
            }
            C21411818qq c21411818qq3 = this.LLLIIL;
            if (c21411818qq3 != null) {
                c21411818qq3.setInterceptToggleListener(null);
            }
            C21411818qq c21411818qq4 = this.LLLIIL;
            if (c21411818qq4 != null) {
                C786410Ut5.f9(c21411818qq4, null);
            }
            C21411818qq c21411818qq5 = this.LLLIILIL;
            if (c21411818qq5 != null) {
                c21411818qq5.setInterceptToggleListener(null);
            }
            C21411818qq c21411818qq6 = this.LLLIILIL;
            if (c21411818qq6 != null) {
                C786410Ut5.f9(c21411818qq6, null);
            }
            C21411818qq c21411818qq7 = this.LLLIIIL;
            if (c21411818qq7 != null) {
                c21411818qq7.setInterceptToggleListener(null);
            }
            C21411818qq c21411818qq8 = this.LLLIIIL;
            if (c21411818qq8 != null) {
                C786410Ut5.f9(c21411818qq8, null);
            }
            C16FS c16fs6 = this.LLLIL;
            if (c16fs6 != null) {
                C786410Ut5.j5(c16fs6, 1.0f);
            }
            C16FS c16fs7 = this.LLLILZ;
            if (c16fs7 != null) {
                C786410Ut5.j5(c16fs7, 1.0f);
            }
            C16FS c16fs8 = this.LLLILZJ;
            if (c16fs8 != null) {
                C786410Ut5.j5(c16fs8, 1.0f);
            }
            C16FS c16fs9 = this.LLLILZLLLI;
            if (c16fs9 != null) {
                C786410Ut5.j5(c16fs9, 1.0f);
            }
            C21411818qq c21411818qq9 = this.LLLIIIIL;
            if (c21411818qq9 != null) {
                C786410Ut5.z5(c21411818qq9, 1.0f);
            }
            C21411818qq c21411818qq10 = this.LLLIIL;
            if (c21411818qq10 != null) {
                C786410Ut5.z5(c21411818qq10, 1.0f);
            }
            C21411818qq c21411818qq11 = this.LLLIILIL;
            if (c21411818qq11 != null) {
                C786410Ut5.z5(c21411818qq11, 1.0f);
            }
            C21411818qq c21411818qq12 = this.LLLIIIL;
            if (c21411818qq12 != null) {
                C786410Ut5.z5(c21411818qq12, 1.0f);
                return;
            }
            return;
        }
        C16FS c16fs10 = this.LLLI;
        if (c16fs10 != null) {
            C786410Ut5.j5(c16fs10, 0.3f);
        }
        C16FS c16fs11 = this.LLLIL;
        if (c16fs11 != null) {
            C786410Ut5.h8(c16fs11, new ACListenerS167S0100000_33(this, 17));
        }
        C16FS c16fs12 = this.LLLILZ;
        if (c16fs12 != null) {
            C786410Ut5.h8(c16fs12, new ACListenerS167S0100000_33(this, 18));
        }
        C16FS c16fs13 = this.LLLILZJ;
        if (c16fs13 != null) {
            C786410Ut5.h8(c16fs13, new ACListenerS167S0100000_33(this, 19));
        }
        C16FS c16fs14 = this.LLLILZLLLI;
        if (c16fs14 != null) {
            C786410Ut5.h8(c16fs14, new ACListenerS167S0100000_33(this, 20));
        }
        C21411818qq c21411818qq13 = this.LLLIIIIL;
        if (c21411818qq13 != null) {
            c21411818qq13.setInterceptToggleListener(AFwS224S0000000_33.get$arr$(54));
        }
        C21411818qq c21411818qq14 = this.LLLIIIIL;
        if (c21411818qq14 != null) {
            C786410Ut5.f9(c21411818qq14, new ACListenerS167S0100000_33(this, 9));
        }
        C21411818qq c21411818qq15 = this.LLLIIL;
        if (c21411818qq15 != null) {
            c21411818qq15.setInterceptToggleListener(AFwS224S0000000_33.get$arr$(51));
        }
        C21411818qq c21411818qq16 = this.LLLIIL;
        if (c21411818qq16 != null) {
            C786410Ut5.f9(c21411818qq16, new ACListenerS167S0100000_33(this, 10));
        }
        C21411818qq c21411818qq17 = this.LLLIILIL;
        if (c21411818qq17 != null) {
            c21411818qq17.setInterceptToggleListener(AFwS224S0000000_33.get$arr$(52));
        }
        C21411818qq c21411818qq18 = this.LLLIILIL;
        if (c21411818qq18 != null) {
            C786410Ut5.f9(c21411818qq18, new ACListenerS167S0100000_33(this, 11));
        }
        C21411818qq c21411818qq19 = this.LLLIIIL;
        if (c21411818qq19 != null) {
            c21411818qq19.setInterceptToggleListener(AFwS224S0000000_33.get$arr$(53));
        }
        C21411818qq c21411818qq20 = this.LLLIIIL;
        if (c21411818qq20 != null) {
            C786410Ut5.f9(c21411818qq20, new ACListenerS167S0100000_33(this, 12));
        }
        C16FS c16fs15 = this.LLLIL;
        if (c16fs15 != null) {
            C786410Ut5.j5(c16fs15, 0.3f);
        }
        C16FS c16fs16 = this.LLLILZ;
        if (c16fs16 != null) {
            C786410Ut5.j5(c16fs16, 0.3f);
        }
        C16FS c16fs17 = this.LLLILZJ;
        if (c16fs17 != null) {
            C786410Ut5.j5(c16fs17, 0.3f);
        }
        C16FS c16fs18 = this.LLLILZLLLI;
        if (c16fs18 != null) {
            C786410Ut5.j5(c16fs18, 0.3f);
        }
        C21411818qq c21411818qq21 = this.LLLIIIIL;
        if (c21411818qq21 != null) {
            C786410Ut5.z5(c21411818qq21, 0.3f);
        }
        C21411818qq c21411818qq22 = this.LLLIIL;
        if (c21411818qq22 != null) {
            C786410Ut5.z5(c21411818qq22, 0.3f);
        }
        C21411818qq c21411818qq23 = this.LLLIILIL;
        if (c21411818qq23 != null) {
            C786410Ut5.z5(c21411818qq23, 0.3f);
        }
        C21411818qq c21411818qq24 = this.LLLIIIL;
        if (c21411818qq24 != null) {
            C786410Ut5.z5(c21411818qq24, 0.3f);
        }
    }

    public final void ES() {
        if (this.LLLF <= 0) {
            FS(false);
            return;
        }
        FS(true);
        long j = this.LLLF;
        if (j == 1) {
            wS();
        } else if (j == 5) {
            zS();
        } else if (j == 15) {
            uS();
        } else if (j == 30) {
            yS();
        } else {
            C16FS c16fs = this.LLLILZLLLI;
            if (c16fs != null) {
                c16fs.j0(R.style.a87);
            }
            C16FS c16fs2 = this.LLLIL;
            if (c16fs2 != null) {
                c16fs2.j0(R.style.a87);
            }
            C16FS c16fs3 = this.LLLILZ;
            if (c16fs3 != null) {
                c16fs3.j0(R.style.a87);
            }
            C16FS c16fs4 = this.LLLILZJ;
            if (c16fs4 != null) {
                c16fs4.j0(R.style.a87);
            }
            C16FS c16fs5 = this.LLLILZLLLI;
            if (c16fs5 != null) {
                c16fs5.setSelected(false);
            }
            C16FS c16fs6 = this.LLLILZ;
            if (c16fs6 != null) {
                c16fs6.setSelected(false);
            }
            C16FS c16fs7 = this.LLLILZJ;
            if (c16fs7 != null) {
                c16fs7.setSelected(false);
            }
            C16FS c16fs8 = this.LLLIL;
            if (c16fs8 != null) {
                c16fs8.setSelected(false);
            }
        }
        C21411818qq c21411818qq = this.LLLIIIL;
        if (c21411818qq != null) {
            c21411818qq.setChecked(true);
        }
    }

    public final void uS() {
        C16FS c16fs = this.LLLILZJ;
        if (c16fs != null) {
            c16fs.setSelected(true);
        }
        C16FS c16fs2 = this.LLLILZ;
        if (c16fs2 != null) {
            c16fs2.setSelected(false);
        }
        C16FS c16fs3 = this.LLLIL;
        if (c16fs3 != null) {
            c16fs3.setSelected(false);
        }
        C16FS c16fs4 = this.LLLILZLLLI;
        if (c16fs4 != null) {
            c16fs4.setSelected(false);
        }
        C16FS c16fs5 = this.LLLILZJ;
        if (c16fs5 != null) {
            c16fs5.j0(R.style.a7h);
        }
        C16FS c16fs6 = this.LLLIL;
        if (c16fs6 != null) {
            c16fs6.j0(R.style.a87);
        }
        C16FS c16fs7 = this.LLLILZ;
        if (c16fs7 != null) {
            c16fs7.j0(R.style.a87);
        }
        C16FS c16fs8 = this.LLLILZLLLI;
        if (c16fs8 != null) {
            c16fs8.j0(R.style.a87);
        }
    }

    public final void wS() {
        C16FS c16fs = this.LLLIL;
        if (c16fs != null) {
            c16fs.setSelected(true);
        }
        C16FS c16fs2 = this.LLLILZ;
        if (c16fs2 != null) {
            c16fs2.setSelected(false);
        }
        C16FS c16fs3 = this.LLLILZJ;
        if (c16fs3 != null) {
            c16fs3.setSelected(false);
        }
        C16FS c16fs4 = this.LLLILZLLLI;
        if (c16fs4 != null) {
            c16fs4.setSelected(false);
        }
        C16FS c16fs5 = this.LLLIL;
        if (c16fs5 != null) {
            c16fs5.j0(R.style.a7h);
        }
        C16FS c16fs6 = this.LLLILZ;
        if (c16fs6 != null) {
            c16fs6.j0(R.style.a87);
        }
        C16FS c16fs7 = this.LLLILZJ;
        if (c16fs7 != null) {
            c16fs7.j0(R.style.a87);
        }
        C16FS c16fs8 = this.LLLILZLLLI;
        if (c16fs8 != null) {
            c16fs8.j0(R.style.a87);
        }
    }

    public final void yS() {
        C16FS c16fs = this.LLLILZLLLI;
        if (c16fs != null) {
            c16fs.setSelected(true);
        }
        C16FS c16fs2 = this.LLLILZ;
        if (c16fs2 != null) {
            c16fs2.setSelected(false);
        }
        C16FS c16fs3 = this.LLLILZJ;
        if (c16fs3 != null) {
            c16fs3.setSelected(false);
        }
        C16FS c16fs4 = this.LLLIL;
        if (c16fs4 != null) {
            c16fs4.setSelected(false);
        }
        C16FS c16fs5 = this.LLLILZLLLI;
        if (c16fs5 != null) {
            c16fs5.j0(R.style.a7h);
        }
        C16FS c16fs6 = this.LLLIL;
        if (c16fs6 != null) {
            c16fs6.j0(R.style.a87);
        }
        C16FS c16fs7 = this.LLLILZ;
        if (c16fs7 != null) {
            c16fs7.j0(R.style.a87);
        }
        C16FS c16fs8 = this.LLLILZJ;
        if (c16fs8 != null) {
            c16fs8.j0(R.style.a87);
        }
    }

    public final void zS() {
        C16FS c16fs = this.LLLILZ;
        if (c16fs != null) {
            c16fs.setSelected(true);
        }
        C16FS c16fs2 = this.LLLIL;
        if (c16fs2 != null) {
            c16fs2.setSelected(false);
        }
        C16FS c16fs3 = this.LLLILZJ;
        if (c16fs3 != null) {
            c16fs3.setSelected(false);
        }
        C16FS c16fs4 = this.LLLILZLLLI;
        if (c16fs4 != null) {
            c16fs4.setSelected(false);
        }
        C16FS c16fs5 = this.LLLILZ;
        if (c16fs5 != null) {
            c16fs5.j0(R.style.a7h);
        }
        C16FS c16fs6 = this.LLLIL;
        if (c16fs6 != null) {
            c16fs6.j0(R.style.a87);
        }
        C16FS c16fs7 = this.LLLILZJ;
        if (c16fs7 != null) {
            c16fs7.j0(R.style.a87);
        }
        C16FS c16fs8 = this.LLLILZLLLI;
        if (c16fs8 != null) {
            c16fs8.j0(R.style.a87);
        }
    }

    public static void GS() {
        C766270U4b.LIZLLL(2131856971);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C1AI9 c1ai9 = this.LLJZ;
        if (c1ai9 != null) {
            c1ai9.LJIJJLI = null;
        }
        DataChannel dataChannel = this.LLJLLL;
        if (dataChannel != null) {
            dataChannel.GQ2(this, ViewerWishesStatus.class, this.LLLJL);
        }
    }

    public final void FS(boolean z) {
        if (z) {
            C500260Jjc.LLFFF(this.LLLIL);
            C500260Jjc.LLFFF(this.LLLILZ);
            C500260Jjc.LLFFF(this.LLLILZJ);
            C500260Jjc.LLFFF(this.LLLILZLLLI);
            C500260Jjc.LLFFF(this.LLLIIL);
            C500260Jjc.LLFFF(this.LLLJ);
            C500260Jjc.LLFFF(this.LLLIZZ);
            return;
        }
        C500260Jjc.LJIILIIL(this.LLLIL);
        C500260Jjc.LJIILIIL(this.LLLILZ);
        C500260Jjc.LJIILIIL(this.LLLILZJ);
        C500260Jjc.LJIILIIL(this.LLLILZLLLI);
        C500260Jjc.LJIILIIL(this.LLLIIL);
        C500260Jjc.LJIILIIL(this.LLLJ);
        C500260Jjc.LJIILIIL(this.LLLIZZ);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C497740JfY.LIZLLL(R.attr.exw, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(1, null);
        sheetOptions.dimBehindType = 2;
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(12.0f);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        long j;
        boolean z2;
        super.onViewCreated(view, bundle);
        this.LLLI = (C16FS) view.findViewById(R.id.viewer_wishes_more_settings_save_btn);
        this.LLLFZ = view.findViewById(R.id.viewer_wishes_more_settings_back_button);
        this.LLLII = (LiveIconView) view.findViewById(R.id.viewer_wishes_display_point_info_icon);
        this.LLLIIII = (LiveIconView) view.findViewById(R.id.viewer_wishes_display_timer_icon);
        this.LLLIIIIL = (C21411818qq) view.findViewById(R.id.viewer_wishes_display_point_switch);
        this.LLLIIIL = (C21411818qq) view.findViewById(R.id.viewer_wishes_display_timer_switch);
        this.LLLIIL = (C21411818qq) view.findViewById(R.id.viewer_wishes_restart_automatically_switch);
        this.LLLIILIL = (C21411818qq) view.findViewById(R.id.viewer_wishes_open_automatically_switch);
        this.LLLIL = (C16FS) view.findViewById(R.id.viewer_wishes_display_timer_button_1);
        this.LLLILZ = (C16FS) view.findViewById(R.id.viewer_wishes_display_timer_button_2);
        this.LLLILZJ = (C16FS) view.findViewById(R.id.viewer_wishes_display_timer_button_3);
        this.LLLILZLLLI = (C16FS) view.findViewById(R.id.viewer_wishes_display_timer_button_4);
        this.LLLIZZ = view.findViewById(R.id.viewer_wishes_restart_automatically_title);
        this.LLLJ = view.findViewById(R.id.viewer_wishes_restart_automatically_content);
        DataChannel dataChannel = this.LLJLLL;
        if (dataChannel != null) {
            dataChannel.EQ2(this, ViewerWishesStatus.class, this.LLLJL);
        }
        C1AI9 c1ai9 = this.LLJZ;
        if (c1ai9 != null) {
            c1ai9.LJIJJLI = new AwS577S0100000_33(this, 4023);
        }
        LiveIconView liveIconView = this.LLLII;
        if (liveIconView != null) {
            C786410Ut5.I7(new AbS712S0100000_33(this, 9), liveIconView);
        }
        LiveIconView liveIconView2 = this.LLLIIII;
        if (liveIconView2 != null) {
            C786410Ut5.I7(new AbS712S0100000_33(this, 10), liveIconView2);
        }
        C1AI9 c1ai92 = this.LLJZ;
        boolean z3 = true;
        if (c1ai92 != null && c1ai92.LJI) {
            z = true;
        } else {
            z = false;
        }
        this.LLL = z;
        C21411818qq c21411818qq = this.LLLIIIIL;
        if (c21411818qq != null) {
            c21411818qq.setChecked(z);
        }
        C21411818qq c21411818qq2 = this.LLLIIIIL;
        if (c21411818qq2 != null) {
            C786410Ut5.C7(c21411818qq2, new C2189581Ami(this, 1));
        }
        C1AI9 c1ai93 = this.LLJZ;
        if (c1ai93 != null) {
            j = c1ai93.LJIIIZ;
        } else {
            j = 0;
        }
        this.LLLF = j;
        ES();
        C21411818qq c21411818qq3 = this.LLLIIIL;
        if (c21411818qq3 != null) {
            C786410Ut5.C7(c21411818qq3, new C2189581Ami(this, 2));
        }
        C1AI9 c1ai94 = this.LLJZ;
        if (c1ai94 != null && c1ai94.LJII) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LLLFF = z2;
        C21411818qq c21411818qq4 = this.LLLIIL;
        if (c21411818qq4 != null) {
            c21411818qq4.setChecked(z2);
        }
        C21411818qq c21411818qq5 = this.LLLIIL;
        if (c21411818qq5 != null) {
            C786410Ut5.C7(c21411818qq5, new C2189581Ami(this, 3));
        }
        C1AI9 c1ai95 = this.LLJZ;
        if (c1ai95 == null || !c1ai95.LJIIIIZZ) {
            z3 = false;
        }
        this.LLLFFI = z3;
        C21411818qq c21411818qq6 = this.LLLIILIL;
        if (c21411818qq6 != null) {
            c21411818qq6.setChecked(z3);
        }
        C21411818qq c21411818qq7 = this.LLLIILIL;
        if (c21411818qq7 != null) {
            C786410Ut5.C7(c21411818qq7, new C2189581Ami(this, 4));
        }
        C16FS c16fs = this.LLLIL;
        if (c16fs != null) {
            C786410Ut5.h8(c16fs, new ACListenerS167S0100000_33(this, 81));
        }
        C16FS c16fs2 = this.LLLILZ;
        if (c16fs2 != null) {
            C786410Ut5.h8(c16fs2, new ACListenerS167S0100000_33(this, 82));
        }
        C16FS c16fs3 = this.LLLILZJ;
        if (c16fs3 != null) {
            C786410Ut5.h8(c16fs3, new ACListenerS167S0100000_33(this, 83));
        }
        C16FS c16fs4 = this.LLLILZLLLI;
        if (c16fs4 != null) {
            C786410Ut5.h8(c16fs4, new ACListenerS167S0100000_33(this, 84));
        }
        C16FS c16fs5 = this.LLLI;
        if (c16fs5 != null) {
            C786410Ut5.I7(new AbS712S0100000_33(this, 11), c16fs5);
        }
        View view2 = this.LLLFZ;
        if (view2 != null) {
            C786410Ut5.I7(new AbS712S0100000_33(this, 8), view2);
        }
        BS();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.hwv, viewGroup, false);
    }
}
