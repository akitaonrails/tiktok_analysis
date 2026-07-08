package com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui;

import X.C1095480ec6;
import X.C1095500ec8;
import X.C1095520ecA;
import X.C1095540ecC;
import X.C1143680frq;
import X.C1161920gLG;
import X.C1324610kZf;
import X.C1819620xS4;
import X.C19EH;
import X.C19U0;
import X.C19U1;
import X.C454590Hs9;
import X.C475510Ikn;
import X.C497740JfY;
import X.C786410Ut5;
import X.InterfaceC1095170ebb;
import X.InterfaceC1095550ecD;
import X.InterfaceC1584740rLE;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.FansClubJoinDialog;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.FansClubJoinFragment;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.JoinDialogViewModel;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.ui.SuperFanJoinFragment;
import com.bytedance.android.livesdk.revenue.level.impl.superfan.ui.SuperFanViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS141S0201000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import wh6.AbS689S0100000_7;
import wh6.AbS698S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubJoinDialog extends LiveSheetFragment implements InterfaceC1095170ebb {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9OiA6LCEmLWsgLDHELIOSk2JGslJD8/ZiMtJzwwJDAuZzo6ZgMtJzwQJDAuAyA6JgElKCM8Lw==";
    public JoinDialogViewModel LLJZIJLIL;
    public SuperFanViewModel LLL;
    public C1095500ec8 LLLF;
    public FansClubJoinFragment LLLFF;
    public SuperFanJoinFragment LLLFFI;
    public final /* synthetic */ C1095480ec6 LLJLLL = new C1095480ec6();
    public String LLJZ = "";
    public final C1095540ecC LLLFZ = new C1095540ecC(new C1095520ecA(null, null, new InterfaceC1095550ecD() { // from class: X.0ecE
        @Override // X.InterfaceC1095550ecD
        public final boolean J6() {
            return true;
        }

        @Override // X.InterfaceC1095550ecD
        public final void LLLLZLL(boolean z) {
        }

        @Override // X.InterfaceC1095550ecD
        public final void TN(AwS141S0201000_17 awS141S0201000_17) {
        }

        @Override // X.InterfaceC1095550ecD
        public final void cp(boolean z) {
        }
    }, null), new C1095520ecA(null, null, new InterfaceC1095550ecD() { // from class: X.0ecE
        @Override // X.InterfaceC1095550ecD
        public final boolean J6() {
            return true;
        }

        @Override // X.InterfaceC1095550ecD
        public final void LLLLZLL(boolean z) {
        }

        @Override // X.InterfaceC1095550ecD
        public final void TN(AwS141S0201000_17 awS141S0201000_17) {
        }

        @Override // X.InterfaceC1095550ecD
        public final void cp(boolean z) {
        }
    }, null));
    public boolean LLLI = true;

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C1095500ec8 c1095500ec8 = this.LLLF;
        if (c1095500ec8 != null) {
            Object obj = c1095500ec8.LIZLLL;
            if (obj != null) {
                c1095500ec8.LIZJ.tryCancel(obj);
            }
            c1095500ec8.LIZLLL = null;
            C786410Ut5.LJJJJIZL(c1095500ec8.LIZ);
        }
        this.LLLF = null;
    }

    @Override // X.InterfaceC1095170ebb
    public final void LP(int i) {
        this.LLJLLL.LL = i;
    }

    @Override // X.InterfaceC1095170ebb
    public final void Rv(Map<String, ? extends Object> map) {
        this.LLJLLL.LLILLJJLI = map;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(1, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(12.0f);
        sheetOptions.draggable = false;
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        IHostResource iHostResource;
        Room room;
        User owner;
        TextView textView;
        TextView textView2;
        super.onViewCreated(view, bundle);
        C1095500ec8 c1095500ec8 = new C1095500ec8((FrameLayout) view.findViewById(R.id.video_container), this);
        this.LLLF = c1095500ec8;
        IHostResource iHostResource2 = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
        if ((iHostResource2 == null || !iHostResource2.u61(c1095500ec8.LJ)) && (iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class)) != null) {
            iHostResource.NP0(c1095500ec8.LJ);
        }
        final Context context = getContext();
        if (context != null) {
            C19U1 c19u1 = (C19U1) view.findViewById(R.id.wya);
            C19U0 c19u0NewTab = c19u1.newTab();
            c19u0NewTab.LIZJ(R.layout.gg9);
            View view2 = c19u0NewTab.LJFF;
            if (view2 != null && (textView2 = (TextView) view2.findViewById(R.id.wz2)) != null) {
                textView2.setText(C497740JfY.LJIJI(2131852387));
            }
            c19u1.addTab(c19u0NewTab);
            C19U0 c19u0NewTab2 = c19u1.newTab();
            c19u0NewTab2.LIZJ(R.layout.gg9);
            View view3 = c19u0NewTab2.LJFF;
            if (view3 != null && (textView = (TextView) view3.findViewById(R.id.wz2)) != null) {
                textView.setText(C497740JfY.LJIJI(2131852388));
            }
            c19u1.addTab(c19u0NewTab2);
            c19u1.addOnTabSelectedListener(new InterfaceC1584740rLE() { // from class: X.0ec9
                @Override // X.InterfaceC1586460rO0
                public final void ih(C19U0 c19u0) {
                }

                @Override // X.InterfaceC1586460rO0
                public final void Oq(C19U0 c19u0) {
                    int i;
                    SuperFanJoinFragment superFanJoinFragment;
                    FansClubJoinFragment fansClubJoinFragment;
                    View view4;
                    TextView textView3;
                    if (c19u0 != null && (view4 = c19u0.LJFF) != null && (textView3 = (TextView) view4.findViewById(R.id.wz2)) != null) {
                        textView3.setTextColor(C20736316Cj.LIZIZ(R.attr.ezq, context));
                    }
                    FansClubJoinDialog fansClubJoinDialog = this;
                    if (c19u0 != null) {
                        i = c19u0.LJ;
                    } else {
                        i = 0;
                    }
                    View view5 = fansClubJoinDialog.getView();
                    if (view5 != null && (superFanJoinFragment = fansClubJoinDialog.LLLFFI) != null && (fansClubJoinFragment = fansClubJoinDialog.LLLFF) != null) {
                        if (i != 0) {
                            if (i == 1) {
                                fansClubJoinDialog.LLLFZ.LIZ = new C1095520ecA(view5.findViewById(R.id.bx6), view5.findViewById(R.id.hmb), fansClubJoinFragment, view5.findViewById(R.id.hnv));
                                fansClubJoinDialog.LLLFZ.LIZIZ = new C1095520ecA(view5.findViewById(R.id.bya), view5.findViewById(R.id.wpj), superFanJoinFragment, view5.findViewById(R.id.wpk));
                            }
                        } else {
                            fansClubJoinDialog.LLLFZ.LIZ = new C1095520ecA(view5.findViewById(R.id.bya), view5.findViewById(R.id.wpj), superFanJoinFragment, view5.findViewById(R.id.wpk));
                            fansClubJoinDialog.LLLFZ.LIZIZ = new C1095520ecA(view5.findViewById(R.id.bx6), view5.findViewById(R.id.hmb), fansClubJoinFragment, view5.findViewById(R.id.hnv));
                        }
                        fansClubJoinDialog.LLLFZ.LIZ.LIZJ.LLLLZLL(false);
                        fansClubJoinDialog.LLLFZ.LIZIZ.LIZJ.LLLLZLL(true);
                        if (!fansClubJoinDialog.LLLI) {
                            AwS561S0100000_17 awS561S0100000_17 = new AwS561S0100000_17(fansClubJoinDialog, 246);
                            if (fansClubJoinDialog.LLLFZ.LIZ.LIZJ.J6() && fansClubJoinDialog.LLLFZ.LIZIZ.LIZJ.J6()) {
                                fansClubJoinDialog.LLLFZ.LIZ.LIZJ.TN(new AwS141S0201000_17(fansClubJoinDialog, i, awS561S0100000_17, 2));
                            } else {
                                awS561S0100000_17.invoke();
                            }
                        } else {
                            fansClubJoinDialog.LLLFZ.LIZ.LIZ(0.0f);
                            C500260Jjc.LJIILIIL(fansClubJoinDialog.LLLFZ.LIZ.LIZLLL);
                            fansClubJoinDialog.LLLFZ.LIZIZ.LIZ(1.0f);
                            C500260Jjc.LLFFF(fansClubJoinDialog.LLLFZ.LIZIZ.LIZLLL);
                        }
                        fansClubJoinDialog.LLLI = false;
                    }
                }

                @Override // X.InterfaceC1586460rO0
                public final void Yn(C19U0 c19u0) {
                    View view4;
                    TextView textView3;
                    if (c19u0 != null && (view4 = c19u0.LJFF) != null && (textView3 = (TextView) view4.findViewById(R.id.wz2)) != null) {
                        textView3.setTextColor(C20736316Cj.LIZIZ(R.attr.ezt, context));
                    }
                }
            });
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            FansClubJoinFragment fansClubJoinFragment = new FansClubJoinFragment();
            String str = this.LLJZ;
            fansClubJoinFragment.LLILLL = str;
            JoinDialogViewModel joinDialogViewModel = this.LLJZIJLIL;
            fansClubJoinFragment.LLILZIL = joinDialogViewModel;
            if (joinDialogViewModel != null) {
                joinDialogViewModel.BQ2(str);
            }
            C1095480ec6 c1095480ec6 = this.LLJLLL;
            int i = c1095480ec6.LL;
            C1095480ec6 c1095480ec62 = fansClubJoinFragment.LL;
            c1095480ec62.LL = i;
            c1095480ec62.LLILLJJLI = c1095480ec6.LLILLJJLI;
            this.LLLFF = fansClubJoinFragment;
            c19ehLJIIJ.LIZIZ(R.id.hnv, fansClubJoinFragment);
            SuperFanJoinFragment superFanJoinFragment = new SuperFanJoinFragment();
            superFanJoinFragment.LL = this.LLJZ;
            superFanJoinFragment.LLILLJJLI = this.LLL;
            this.LLLFFI = superFanJoinFragment;
            c19ehLJIIJ.LIZIZ(R.id.wpk, superFanJoinFragment);
            c19ehLJIIJ.LJIIIZ();
            c19u1.selectTab(null);
            C19U0 tabAt = c19u1.getTabAt(0);
            if (tabAt != null) {
                tabAt.LIZIZ();
            }
        }
        View viewFindViewById = view.findViewById(R.id.bx6);
        ImageView imageView = (ImageView) viewFindViewById;
        if (C454590Hs9.LIZ(imageView.getContext())) {
            C786410Ut5.Qb(imageView, -1.0f);
        }
        C1143680frq.LIZLLL(viewFindViewById, "tiktok_live_fans_club_join_dialog", "ttlive_bg_fans_club_header.png");
        View viewFindViewById2 = view.findViewById(R.id.bya);
        ImageView imageView2 = (ImageView) viewFindViewById2;
        if (C454590Hs9.LIZ(imageView2.getContext())) {
            C786410Ut5.Qb(imageView2, -1.0f);
        }
        C1143680frq.LIZLLL(viewFindViewById2, "tiktok_live_fans_club_join_dialog", "ttlive_bg_super_fan_header.png");
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null && (room = (Room) dataChannelLJ.gg0(RoomChannel.class)) != null && (owner = room.getOwner()) != null) {
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(owner.getAvatarThumb());
            c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
            c1324610kZfLJIIIZ.LJIIIZ = R.drawable.eze;
            c1324610kZfLJIIIZ.LJJI(view.findViewById(R.id.bh2));
            C786410Ut5.I7(new AbS698S0100000_17(this, 9, 42), view.findViewById(R.id.hmb));
            C786410Ut5.I7(new AbS689S0100000_7(this, 28), view.findViewById(R.id.wpj));
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.g63, viewGroup, false);
    }
}
